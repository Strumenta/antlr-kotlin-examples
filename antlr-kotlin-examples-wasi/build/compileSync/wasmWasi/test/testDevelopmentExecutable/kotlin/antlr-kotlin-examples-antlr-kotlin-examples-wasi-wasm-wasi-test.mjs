
import { WASI } from 'wasi';
import { argv, env } from 'node:process';

const wasi = new WASI({ version: 'preview1', args: argv, env, });

const module = await import(/* webpackIgnore: true */'node:module');
const require = module.default.createRequire(import.meta.url);
const fs = require('fs');
const path = require('path');
const url = require('url');
const filepath = url.fileURLToPath(import.meta.url);
const dirpath = path.dirname(filepath);
const wasmBuffer = fs.readFileSync(path.resolve(dirpath, './antlr-kotlin-examples-antlr-kotlin-examples-wasi-wasm-wasi-test.wasm'));
const wasmModule = new WebAssembly.Module(wasmBuffer);
const wasmInstance = new WebAssembly.Instance(wasmModule, wasi.getImportObject());

wasi.initialize(wasmInstance);

export default wasmInstance.exports;
