// Generated from /Users/federico/repos/antlr-kotlin-examples/antlr-kotlin-examples-wasi/src/commonMain/antlr/MiniCalcLexer.g4 by ANTLR 4.13.1
package com.strumenta.antlrkotlin.parsers.generated

import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.misc.*

@Suppress("FunctionName", "LocalVariableName", "EnumEntryName", "RemoveRedundantBackticks")
public open class MiniCalcLexer(input: CharStream) : Lexer(input) {
    private companion object {
        init {
            RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.runtimeVersion)
        }

        private const val SERIALIZED_ATN: String =
            "\u0004\u0000\u001d\u0168\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\u0008\u0007\u0008\u0002\u0009\u0007\u0009\u0002\u000a\u0007\u000a\u0002\u000b\u0007\u000b\u0002\u000c\u0007\u000c\u0002\u000d\u0007\u000d\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002\u0020\u0007\u0020\u0002\u0021\u0007\u0021\u0002\u0022\u0007\u0022\u0002\u0023\u0007\u0023\u0002\u0024\u0007\u0024\u0002\u0025\u0007\u0025\u0002\u0026\u0007\u0026\u0002\u0027\u0007\u0027\u0002\u0028\u0007\u0028\u0002\u0029\u0007\u0029\u0002\u002a\u0007\u002a\u0002\u002b\u0007\u002b\u0002\u002c\u0007\u002c\u0002\u002d\u0007\u002d\u0002\u002e\u0007\u002e\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0065\u0008\u0000\u0001\u0001\u0004\u0001\u0068\u0008\u0001\u000b\u0001\u000c\u0001\u0069\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0008\u0001\u0008\u0001\u0008\u0001\u0008\u0001\u0008\u0001\u0008\u0001\u0008\u0001\u0009\u0005\u0009\u0095\u0008\u0009\u000a\u0009\u000c\u0009\u0098\u0009\u0009\u0001\u0009\u0001\u0009\u0005\u0009\u009c\u0008\u0009\u000a\u0009\u000c\u0009\u009f\u0009\u0009\u0001\u000a\u0001\u000a\u0001\u000a\u0005\u000a\u00a4\u0008\u000a\u000a\u000a\u000c\u000a\u00a7\u0009\u000a\u0003\u000a\u00a9\u0008\u000a\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ae\u0008\u000b\u000a\u000b\u000c\u000b\u00b1\u0009\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00b5\u0008\u000b\u000b\u000b\u000c\u000b\u00b6\u0003\u000b\u00b9\u0008\u000b\u0001\u000c\u0001\u000c\u0001\u000d\u0001\u000d\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0004\u001b\u00e5\u0008\u001b\u000b\u001b\u000c\u001b\u00e6\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0004\u001e\u00f2\u0008\u001e\u000b\u001e\u000c\u001e\u00f3\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u0020\u0001\u0020\u0001\u0020\u0001\u0020\u0001\u0020\u0001\u0020\u0001\u0021\u0001\u0021\u0001\u0021\u0001\u0021\u0001\u0021\u0001\u0021\u0001\u0021\u0001\u0021\u0001\u0021\u0001\u0021\u0001\u0022\u0001\u0022\u0001\u0022\u0001\u0022\u0001\u0022\u0001\u0022\u0001\u0022\u0001\u0022\u0001\u0022\u0001\u0023\u0001\u0023\u0001\u0023\u0005\u0023\u011a\u0008\u0023\u000a\u0023\u000c\u0023\u011d\u0009\u0023\u0003\u0023\u011f\u0008\u0023\u0001\u0023\u0001\u0023\u0001\u0024\u0001\u0024\u0001\u0024\u0005\u0024\u0126\u0008\u0024\u000a\u0024\u000c\u0024\u0129\u0009\u0024\u0003\u0024\u012b\u0008\u0024\u0001\u0024\u0001\u0024\u0004\u0024\u012f\u0008\u0024\u000b\u0024\u000c\u0024\u0130\u0001\u0024\u0001\u0024\u0001\u0025\u0001\u0025\u0001\u0025\u0001\u0025\u0001\u0026\u0001\u0026\u0001\u0026\u0001\u0026\u0001\u0027\u0001\u0027\u0001\u0027\u0001\u0027\u0001\u0028\u0001\u0028\u0001\u0028\u0001\u0028\u0001\u0029\u0001\u0029\u0001\u0029\u0001\u0029\u0001\u002a\u0001\u002a\u0001\u002a\u0001\u002a\u0001\u002b\u0001\u002b\u0001\u002b\u0001\u002b\u0001\u002c\u0005\u002c\u0152\u0008\u002c\u000a\u002c\u000c\u002c\u0155\u0009\u002c\u0001\u002c\u0001\u002c\u0005\u002c\u0159\u0008\u002c\u000a\u002c\u000c\u002c\u015c\u0009\u002c\u0001\u002c\u0001\u002c\u0001\u002d\u0001\u002d\u0001\u002d\u0001\u002d\u0001\u002d\u0001\u002e\u0001\u002e\u0001\u002e\u0001\u002e\u0000\u0000\u002f\u0003\u0001\u0005\u0002\u0007\u0003\u0009\u0004\u000b\u0005\u000d\u0006\u000f\u0007\u0011\u0008\u0013\u0009\u0015\u000a\u0017\u000b\u0019\u000c\u001b\u000d\u001d\u000e\u001f\u000f\u0021\u0010\u0023\u0011\u0025\u0012\u0027\u0013\u0029\u0014\u002b\u0015\u002d\u0016\u002f\u0017\u0031\u0018\u0033\u0019\u0035\u001a\u0037\u001b\u0039\u001c\u003b\u0000\u003d\u001d\u003f\u0000\u0041\u0000\u0043\u0000\u0045\u0000\u0047\u0000\u0049\u0000\u004b\u0000\u004d\u0000\u004f\u0000\u0051\u0000\u0053\u0000\u0055\u0000\u0057\u0000\u0059\u0000\u005b\u0000\u005d\u0000\u005f\u0000\u0003\u0000\u0001\u0002\u0008\u0002\u0000\u000a\u000a\u000d\u000d\u0002\u0000\u0009\u0009\u0020\u0020\u0001\u0000\u005f\u005f\u0001\u0000\u0061\u007a\u0004\u0000\u0030\u0039\u0041\u005a\u005f\u005f\u0061\u007a\u0001\u0000\u0031\u0039\u0001\u0000\u0030\u0039\u0004\u0000\u0009\u000a\u000d\u000d\u0022\u0023\u005c\u005c\u0177\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\u0009\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\u000d\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000\u0021\u0001\u0000\u0000\u0000\u0000\u0023\u0001\u0000\u0000\u0000\u0000\u0025\u0001\u0000\u0000\u0000\u0000\u0027\u0001\u0000\u0000\u0000\u0000\u0029\u0001\u0000\u0000\u0000\u0000\u002b\u0001\u0000\u0000\u0000\u0001\u002d\u0001\u0000\u0000\u0000\u0001\u002f\u0001\u0000\u0000\u0000\u0001\u0031\u0001\u0000\u0000\u0000\u0001\u0033\u0001\u0000\u0000\u0000\u0001\u0035\u0001\u0000\u0000\u0000\u0001\u0037\u0001\u0000\u0000\u0000\u0001\u0039\u0001\u0000\u0000\u0000\u0001\u003b\u0001\u0000\u0000\u0000\u0002\u003d\u0001\u0000\u0000\u0000\u0002\u003f\u0001\u0000\u0000\u0000\u0002\u0041\u0001\u0000\u0000\u0000\u0002\u0043\u0001\u0000\u0000\u0000\u0002\u0045\u0001\u0000\u0000\u0000\u0002\u0047\u0001\u0000\u0000\u0000\u0002\u0049\u0001\u0000\u0000\u0000\u0002\u004b\u0001\u0000\u0000\u0000\u0002\u004d\u0001\u0000\u0000\u0000\u0002\u004f\u0001\u0000\u0000\u0000\u0002\u0051\u0001\u0000\u0000\u0000\u0002\u0053\u0001\u0000\u0000\u0000\u0002\u0055\u0001\u0000\u0000\u0000\u0002\u0057\u0001\u0000\u0000\u0000\u0002\u0059\u0001\u0000\u0000\u0000\u0002\u005b\u0001\u0000\u0000\u0000\u0002\u005d\u0001\u0000\u0000\u0000\u0002\u005f\u0001\u0000\u0000\u0000\u0003\u0064\u0001\u0000\u0000\u0000\u0005\u0067\u0001\u0000\u0000\u0000\u0007\u006d\u0001\u0000\u0000\u0000\u0009\u0073\u0001\u0000\u0000\u0000\u000b\u0077\u0001\u0000\u0000\u0000\u000d\u007d\u0001\u0000\u0000\u0000\u000f\u0080\u0001\u0000\u0000\u0000\u0011\u0084\u0001\u0000\u0000\u0000\u0013\u008c\u0001\u0000\u0000\u0000\u0015\u0096\u0001\u0000\u0000\u0000\u0017\u00a8\u0001\u0000\u0000\u0000\u0019\u00b8\u0001\u0000\u0000\u0000\u001b\u00ba\u0001\u0000\u0000\u0000\u001d\u00bc\u0001\u0000\u0000\u0000\u001f\u00be\u0001\u0000\u0000\u0000\u0021\u00c0\u0001\u0000\u0000\u0000\u0023\u00c2\u0001\u0000\u0000\u0000\u0025\u00c4\u0001\u0000\u0000\u0000\u0027\u00c6\u0001\u0000\u0000\u0000\u0029\u00c8\u0001\u0000\u0000\u0000\u002b\u00cc\u0001\u0000\u0000\u0000\u002d\u00ce\u0001\u0000\u0000\u0000\u002f\u00d1\u0001\u0000\u0000\u0000\u0031\u00d4\u0001\u0000\u0000\u0000\u0033\u00d7\u0001\u0000\u0000\u0000\u0035\u00da\u0001\u0000\u0000\u0000\u0037\u00de\u0001\u0000\u0000\u0000\u0039\u00e4\u0001\u0000\u0000\u0000\u003b\u00e8\u0001\u0000\u0000\u0000\u003d\u00ec\u0001\u0000\u0000\u0000\u003f\u00f1\u0001\u0000\u0000\u0000\u0041\u00f8\u0001\u0000\u0000\u0000\u0043\u00fd\u0001\u0000\u0000\u0000\u0045\u0103\u0001\u0000\u0000\u0000\u0047\u010d\u0001\u0000\u0000\u0000\u0049\u011e\u0001\u0000\u0000\u0000\u004b\u012a\u0001\u0000\u0000\u0000\u004d\u0134\u0001\u0000\u0000\u0000\u004f\u0138\u0001\u0000\u0000\u0000\u0051\u013c\u0001\u0000\u0000\u0000\u0053\u0140\u0001\u0000\u0000\u0000\u0055\u0144\u0001\u0000\u0000\u0000\u0057\u0148\u0001\u0000\u0000\u0000\u0059\u014c\u0001\u0000\u0000\u0000\u005b\u0153\u0001\u0000\u0000\u0000\u005d\u015f\u0001\u0000\u0000\u0000\u005f\u0164\u0001\u0000\u0000\u0000\u0061\u0062\u0005\u000d\u0000\u0000\u0062\u0065\u0005\u000a\u0000\u0000\u0063\u0065\u0007\u0000\u0000\u0000\u0064\u0061\u0001\u0000\u0000\u0000\u0064\u0063\u0001\u0000\u0000\u0000\u0065\u0004\u0001\u0000\u0000\u0000\u0066\u0068\u0007\u0001\u0000\u0000\u0067\u0066\u0001\u0000\u0000\u0000\u0068\u0069\u0001\u0000\u0000\u0000\u0069\u0067\u0001\u0000\u0000\u0000\u0069\u006a\u0001\u0000\u0000\u0000\u006a\u006b\u0001\u0000\u0000\u0000\u006b\u006c\u0006\u0001\u0000\u0000\u006c\u0006\u0001\u0000\u0000\u0000\u006d\u006e\u0005\u0069\u0000\u0000\u006e\u006f\u0005\u006e\u0000\u0000\u006f\u0070\u0005\u0070\u0000\u0000\u0070\u0071\u0005\u0075\u0000\u0000\u0071\u0072\u0005\u0074\u0000\u0000\u0072\u0008\u0001\u0000\u0000\u0000\u0073\u0074\u0005\u0076\u0000\u0000\u0074\u0075\u0005\u0061\u0000\u0000\u0075\u0076\u0005\u0072\u0000\u0000\u0076\u000a\u0001\u0000\u0000\u0000\u0077\u0078\u0005\u0070\u0000\u0000\u0078\u0079\u0005\u0072\u0000\u0000\u0079\u007a\u0005\u0069\u0000\u0000\u007a\u007b\u0005\u006e\u0000\u0000\u007b\u007c\u0005\u0074\u0000\u0000\u007c\u000c\u0001\u0000\u0000\u0000\u007d\u007e\u0005\u0061\u0000\u0000\u007e\u007f\u0005\u0073\u0000\u0000\u007f\u000e\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0049\u0000\u0000\u0081\u0082\u0005\u006e\u0000\u0000\u0082\u0083\u0005\u0074\u0000\u0000\u0083\u0010\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0044\u0000\u0000\u0085\u0086\u0005\u0065\u0000\u0000\u0086\u0087\u0005\u0063\u0000\u0000\u0087\u0088\u0005\u0069\u0000\u0000\u0088\u0089\u0005\u006d\u0000\u0000\u0089\u008a\u0005\u0061\u0000\u0000\u008a\u008b\u0005\u006c\u0000\u0000\u008b\u0012\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0053\u0000\u0000\u008d\u008e\u0005\u0074\u0000\u0000\u008e\u008f\u0005\u0072\u0000\u0000\u008f\u0090\u0005\u0069\u0000\u0000\u0090\u0091\u0005\u006e\u0000\u0000\u0091\u0092\u0005\u0067\u0000\u0000\u0092\u0014\u0001\u0000\u0000\u0000\u0093\u0095\u0007\u0002\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009d\u0007\u0003\u0000\u0000\u009a\u009c\u0007\u0004\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u0016\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a9\u0005\u0030\u0000\u0000\u00a1\u00a5\u0007\u0005\u0000\u0000\u00a2\u00a4\u0007\u0006\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a0\u0001\u0000\u0000\u0000\u00a8\u00a1\u0001\u0000\u0000\u0000\u00a9\u0018\u0001\u0000\u0000\u0000\u00aa\u00b9\u0005\u0030\u0000\u0000\u00ab\u00af\u0007\u0005\u0000\u0000\u00ac\u00ae\u0007\u0006\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005\u002e\u0000\u0000\u00b3\u00b5\u0007\u0006\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00aa\u0001\u0000\u0000\u0000\u00b8\u00ab\u0001\u0000\u0000\u0000\u00b9\u001a\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u002b\u0000\u0000\u00bb\u001c\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u002d\u0000\u0000\u00bd\u001e\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u002a\u0000\u0000\u00bf\u0020\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u002f\u0000\u0000\u00c1\u0022\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u003d\u0000\u0000\u00c3\u0024\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0028\u0000\u0000\u00c5\u0026\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0029\u0000\u0000\u00c7\u0028\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0022\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0006\u0013\u0001\u0000\u00cb\u002a\u0001\u0000\u0000\u0000\u00cc\u00cd\u0009\u0000\u0000\u0000\u00cd\u002c\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u005c\u0000\u0000\u00cf\u00d0\u0005\u0022\u0000\u0000\u00d0\u002e\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u005c\u0000\u0000\u00d2\u00d3\u0005\u005c\u0000\u0000\u00d3\u0030\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u005c\u0000\u0000\u00d5\u00d6\u0005\u006e\u0000\u0000\u00d6\u0032\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u005c\u0000\u0000\u00d8\u00d9\u0005\u0023\u0000\u0000\u00d9\u0034\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0022\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0006\u0019\u0002\u0000\u00dd\u0036\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0023\u0000\u0000\u00df\u00e0\u0005\u007b\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0006\u001a\u0003\u0000\u00e2\u0038\u0001\u0000\u0000\u0000\u00e3\u00e5\u0008\u0007\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u003a\u0001\u0000\u0000\u0000\u00e8\u00e9\u0009\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0006\u001c\u0004\u0000\u00eb\u003c\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u007d\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0006\u001d\u0002\u0000\u00ef\u003e\u0001\u0000\u0000\u0000\u00f0\u00f2\u0007\u0001\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0006\u001e\u0000\u0000\u00f6\u00f7\u0006\u001e\u0005\u0000\u00f7\u0040\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0061\u0000\u0000\u00f9\u00fa\u0005\u0073\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0006\u001f\u0006\u0000\u00fc\u0042\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0049\u0000\u0000\u00fe\u00ff\u0005\u006e\u0000\u0000\u00ff\u0100\u0005\u0074\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0006\u0020\u0007\u0000\u0102\u0044\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0044\u0000\u0000\u0104\u0105\u0005\u0065\u0000\u0000\u0105\u0106\u0005\u0063\u0000\u0000\u0106\u0107\u0005\u0069\u0000\u0000\u0107\u0108\u0005\u006d\u0000\u0000\u0108\u0109\u0005\u0061\u0000\u0000\u0109\u010a\u0005\u006c\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0006\u0021\u0008\u0000\u010c\u0046\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0053\u0000\u0000\u010e\u010f\u0005\u0074\u0000\u0000\u010f\u0110\u0005\u0072\u0000\u0000\u0110\u0111\u0005\u0069\u0000\u0000\u0111\u0112\u0005\u006e\u0000\u0000\u0112\u0113\u0005\u0067\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u0006\u0022\u0009\u0000\u0115\u0048\u0001\u0000\u0000\u0000\u0116\u011f\u0005\u0030\u0000\u0000\u0117\u011b\u0007\u0005\u0000\u0000\u0118\u011a\u0007\u0006\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0116\u0001\u0000\u0000\u0000\u011e\u0117\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0006\u0023\u000a\u0000\u0121\u004a\u0001\u0000\u0000\u0000\u0122\u012b\u0005\u0030\u0000\u0000\u0123\u0127\u0007\u0005\u0000\u0000\u0124\u0126\u0007\u0006\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u0122\u0001\u0000\u0000\u0000\u012a\u0123\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012e\u0005\u002e\u0000\u0000\u012d\u012f\u0007\u0006\u0000\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0006\u0024\u000b\u0000\u0133\u004c\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u002b\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0006\u0025\u000c\u0000\u0137\u004e\u0001\u0000\u0000\u0000\u0138\u0139\u0005\u002d\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u0006\u0026\u000d\u0000\u013b\u0050\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u002a\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0006\u0027\u000e\u0000\u013f\u0052\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u002f\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0006\u0028\u000f\u0000\u0143\u0054\u0001\u0000\u0000\u0000\u0144\u0145\u0005\u003d\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0006\u0029\u0010\u0000\u0147\u0056\u0001\u0000\u0000\u0000\u0148\u0149\u0005\u0028\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0006\u002a\u0011\u0000\u014b\u0058\u0001\u0000\u0000\u0000\u014c\u014d\u0005\u0029\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0006\u002b\u0012\u0000\u014f\u005a\u0001\u0000\u0000\u0000\u0150\u0152\u0007\u0002\u0000\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u015a\u0007\u0003\u0000\u0000\u0157\u0159\u0007\u0004\u0000\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015e\u0006\u002c\u0013\u0000\u015e\u005c\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0022\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0006\u002d\u0014\u0000\u0162\u0163\u0006\u002d\u0001\u0000\u0163\u005e\u0001\u0000\u0000\u0000\u0164\u0165\u0009\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0006\u002e\u0004\u0000\u0167\u0060\u0001\u0000\u0000\u0000\u0015\u0000\u0001\u0002\u0064\u0069\u0096\u009d\u00a5\u00a8\u00af\u00b6\u00b8\u00e6\u00f3\u011b\u011e\u0127\u012a\u0130\u0153\u015a\u0015\u0000\u0002\u0000\u0005\u0001\u0000\u0004\u0000\u0000\u0005\u0002\u0000\u0007\u0015\u0000\u0007\u0002\u0000\u0007\u0006\u0000\u0007\u0007\u0000\u0007\u0008\u0000\u0007\u0009\u0000\u0007\u000b\u0000\u0007\u000c\u0000\u0007\u000d\u0000\u0007\u000e\u0000\u0007\u000f\u0000\u0007\u0010\u0000\u0007\u0011\u0000\u0007\u0012\u0000\u0007\u0013\u0000\u0007\u000a\u0000\u0007\u0014\u0000"

        private val ATN = ATNDeserializer().deserialize(SERIALIZED_ATN.toCharArray())

        private val DECISION_TO_DFA = Array(ATN.numberOfDecisions) {
            DFA(ATN.getDecisionState(it)!!, it)
        }

        private val SHARED_CONTEXT_CACHE = PredictionContextCache()

        private val LITERAL_NAMES: Array<String?> =
            arrayOf(null, null, null, "'input'", "'var'", "'print'", null, 
                    null, null, null, null, null, null, null, null, null, 
                    null, null, null, null, null, null, "'\\\"'", "'\\\\'", 
                    "'\\n'", "'\\#'", null, "'#{'", null, "'}'")

        private val SYMBOLIC_NAMES: Array<String?> =
            arrayOf(null, "NEWLINE", "WS", "INPUT", "VAR", "PRINT", "AS", 
                    "INT", "DECIMAL", "STRING", "ID", "INTLIT", "DECLIT", 
                    "PLUS", "MINUS", "ASTERISK", "DIVISION", "ASSIGN", "LPAREN", 
                    "RPAREN", "STRING_OPEN", "UNMATCHED", "ESCAPE_STRING_DELIMITER", 
                    "ESCAPE_SLASH", "ESCAPE_NEWLINE", "ESCAPE_SHARP", "STRING_CLOSE", 
                    "INTERPOLATION_OPEN", "STRING_CONTENT", "INTERPOLATION_CLOSE")

        private val VOCABULARY = VocabularyImpl(LITERAL_NAMES, SYMBOLIC_NAMES)
    }

    public enum class Tokens(public val id: kotlin.Int) {
        `NEWLINE`(1),
        `WS`(2),
        `INPUT`(3),
        `VAR`(4),
        `PRINT`(5),
        `AS`(6),
        `INT`(7),
        `DECIMAL`(8),
        `STRING`(9),
        `ID`(10),
        `INTLIT`(11),
        `DECLIT`(12),
        `PLUS`(13),
        `MINUS`(14),
        `ASTERISK`(15),
        `DIVISION`(16),
        `ASSIGN`(17),
        `LPAREN`(18),
        `RPAREN`(19),
        `STRING_OPEN`(20),
        `UNMATCHED`(21),
        `ESCAPE_STRING_DELIMITER`(22),
        `ESCAPE_SLASH`(23),
        `ESCAPE_NEWLINE`(24),
        `ESCAPE_SHARP`(25),
        `STRING_CLOSE`(26),
        `INTERPOLATION_OPEN`(27),
        `STRING_CONTENT`(28),
        `INTERPOLATION_CLOSE`(29)
    }

    public enum class Channels(public val id: kotlin.Int) {
        DEFAULT_TOKEN_CHANNEL(0),
        HIDDEN(1),
        `WHITESPACE`(2)
    }

    public enum class Modes(public val id: kotlin.Int) {
        DEFAULT_MODE(0),
        `MODE_IN_STRING`(1),
        `MODE_IN_INTERPOLATION`(2)
    }

    public enum class Rules {
        `NEWLINE`,
        `WS`,
        `INPUT`,
        `VAR`,
        `PRINT`,
        `AS`,
        `INT`,
        `DECIMAL`,
        `STRING`,
        `ID`,
        `INTLIT`,
        `DECLIT`,
        `PLUS`,
        `MINUS`,
        `ASTERISK`,
        `DIVISION`,
        `ASSIGN`,
        `LPAREN`,
        `RPAREN`,
        `STRING_OPEN`,
        `UNMATCHED`,
        `ESCAPE_STRING_DELIMITER`,
        `ESCAPE_SLASH`,
        `ESCAPE_NEWLINE`,
        `ESCAPE_SHARP`,
        `STRING_CLOSE`,
        `INTERPOLATION_OPEN`,
        `STRING_CONTENT`,
        `STR_UNMATCHED`,
        `INTERPOLATION_CLOSE`,
        `INTERP_WS`,
        `INTERP_AS`,
        `INTERP_INT`,
        `INTERP_DECIMAL`,
        `INTERP_STRING`,
        `INTERP_INTLIT`,
        `INTERP_DECLIT`,
        `INTERP_PLUS`,
        `INTERP_MINUS`,
        `INTERP_ASTERISK`,
        `INTERP_DIVISION`,
        `INTERP_ASSIGN`,
        `INTERP_LPAREN`,
        `INTERP_RPAREN`,
        `INTERP_ID`,
        `INTERP_STRING_OPEN`,
        `INTERP_UNMATCHED`
    }

    override var interpreter: LexerATNSimulator =
        @Suppress("LeakingThis")
        LexerATNSimulator(this, ATN, DECISION_TO_DFA, SHARED_CONTEXT_CACHE)

    override val grammarFileName: String =
        "MiniCalcLexer.g4"

    override val atn: ATN =
        ATN

    override val vocabulary: Vocabulary =
        VOCABULARY

    override val serializedATN: String =
        SERIALIZED_ATN

    override val ruleNames: Array<String> =
        Rules.entries.map(Rules::name).toTypedArray()

    override val channelNames: Array<String> =
        Channels.entries.map(Channels::name).toTypedArray()

    override val modeNames: Array<String> =
        Modes.entries.map(Modes::name).toTypedArray()


}