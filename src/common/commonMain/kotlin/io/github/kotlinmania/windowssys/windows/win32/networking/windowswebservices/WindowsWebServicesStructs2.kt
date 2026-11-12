package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid

public data class WsXmlInt64Text(
    public var text: WsXmlText = WsXmlText(),
    public var value: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlInt64Text> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlInt64Text> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WsXmlInt64Text =
                    WsXmlInt64Text(
                        (WsXmlText.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsXmlInt64Text) {
                    (WsXmlText.typeLayout()).writeNative(addr, value.text)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.value)
                }
            }
    }
}

public class WsXmlListText internal constructor(
    public var text: WsXmlText,
    public var itemCount: UInt,
    itemsCtorArg: MutPtr<MutPtr<WsXmlText>>,
) {
    public var items: MutPtr<MutPtr<WsXmlText>> = itemsCtorArg
        internal set

    public constructor() : this(
        text = WsXmlText(),
        itemCount = 0u,
        itemsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsXmlText = this.text

    public operator fun component2(): UInt = this.itemCount

    public operator fun component3(): MutPtr<MutPtr<WsXmlText>> = this.items

    public fun copy(text: WsXmlText = this.text, itemCount: UInt = this.itemCount, items: MutPtr<MutPtr<WsXmlText>> = this.items): WsXmlListText = WsXmlListText(text = text, itemCount = itemCount, itemsCtorArg = items)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlListText) return false
        if (this.text != other.text) return false
        if (this.itemCount != other.itemCount) return false
        if (this.items != other.items) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.text.hashCode()
        result = 31 * result + this.itemCount.hashCode()
        result = 31 * result + this.items.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlListText> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlListText> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WsXmlListText =
                    WsXmlListText(
                        (WsXmlText.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<WsXmlText>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsXmlListText) {
                    (WsXmlText.typeLayout()).writeNative(addr, value.text)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.itemCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<WsXmlText>>(64)
                    ).writeNative(addr + 8L, value.items)
                }
            }

        public operator fun invoke(
            text: WsXmlText = WsXmlText(),
            itemCount: UInt = 0u,
            items: MutPtr<MutPtr<WsXmlText>> = MutPtr(0L),
        ): WsXmlListText =
            WsXmlListText(
                text = text,
                itemCount = itemCount,
                itemsCtorArg = items,
            )
    }
}

public data class WsXmlNode(
    public var nodeType: WsXmlNodeType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlNode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlNode> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WsXmlNode =
                    WsXmlNode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsXmlNode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.nodeType)
                }
            }
    }
}

public class WsXmlNodePosition internal constructor(
    bufferCtorArg: MutPtr<WsXmlBuffer>,
    nodeCtorArg: MutPtr<CVoid>,
) {
    public var buffer: MutPtr<WsXmlBuffer> = bufferCtorArg
        internal set

    public var node: MutPtr<CVoid> = nodeCtorArg
        internal set

    public constructor() : this(
        bufferCtorArg = MutPtr(0L),
        nodeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<WsXmlBuffer> = this.buffer

    public operator fun component2(): MutPtr<CVoid> = this.node

    public fun copy(buffer: MutPtr<WsXmlBuffer> = this.buffer, node: MutPtr<CVoid> = this.node): WsXmlNodePosition = WsXmlNodePosition(bufferCtorArg = buffer, nodeCtorArg = node)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlNodePosition) return false
        if (this.buffer != other.buffer) return false
        if (this.node != other.node) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.buffer.hashCode()
        result = 31 * result + this.node.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlNodePosition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlNodePosition> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WsXmlNodePosition =
                    WsXmlNodePosition(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlBuffer>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsXmlNodePosition) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlBuffer>(64)
                    ).writeNative(addr, value.buffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.node)
                }
            }

        public operator fun invoke(
            buffer: MutPtr<WsXmlBuffer> = MutPtr(0L),
            node: MutPtr<CVoid> = MutPtr(0L),
        ): WsXmlNodePosition =
            WsXmlNodePosition(
                bufferCtorArg = buffer,
                nodeCtorArg = node,
            )
    }
}

public data class WsXmlQname(
    public var localName: WsXmlString = WsXmlString(),
    public var ns: WsXmlString = WsXmlString(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlQname> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlQname> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): WsXmlQname =
                    WsXmlQname(
                        (WsXmlString.typeLayout()).readNative(addr),
                        (WsXmlString.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsXmlQname) {
                    (WsXmlString.typeLayout()).writeNative(addr, value.localName)
                    (WsXmlString.typeLayout()).writeNative(addr + 32L, value.ns)
                }
            }
    }
}

public data class WsXmlQnameDescription(
    public var minLocalNameByteCount: UInt = 0u,
    public var maxLocalNameByteCount: UInt = 0u,
    public var minNsByteCount: UInt = 0u,
    public var maxNsByteCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlQnameDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlQnameDescription> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WsXmlQnameDescription =
                    WsXmlQnameDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: WsXmlQnameDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minLocalNameByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxLocalNameByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.minNsByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxNsByteCount)
                }
            }
    }
}

public class WsXmlQnameText internal constructor(
    public var text: WsXmlText,
    prefixCtorArg: MutPtr<WsXmlString>,
    localNameCtorArg: MutPtr<WsXmlString>,
    nsCtorArg: MutPtr<WsXmlString>,
) {
    public var prefix: MutPtr<WsXmlString> = prefixCtorArg
        internal set

    public var localName: MutPtr<WsXmlString> = localNameCtorArg
        internal set

    public var ns: MutPtr<WsXmlString> = nsCtorArg
        internal set

    public constructor() : this(
        text = WsXmlText(),
        prefixCtorArg = MutPtr(0L),
        localNameCtorArg = MutPtr(0L),
        nsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsXmlText = this.text

    public operator fun component2(): MutPtr<WsXmlString> = this.prefix

    public operator fun component3(): MutPtr<WsXmlString> = this.localName

    public operator fun component4(): MutPtr<WsXmlString> = this.ns

    public fun copy(text: WsXmlText = this.text, prefix: MutPtr<WsXmlString> = this.prefix, localName: MutPtr<WsXmlString> = this.localName, ns: MutPtr<WsXmlString> = this.ns): WsXmlQnameText = WsXmlQnameText(text = text, prefixCtorArg = prefix, localNameCtorArg = localName, nsCtorArg = ns)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlQnameText) return false
        if (this.text != other.text) return false
        if (this.prefix != other.prefix) return false
        if (this.localName != other.localName) return false
        if (this.ns != other.ns) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.text.hashCode()
        result = 31 * result + this.prefix.hashCode()
        result = 31 * result + this.localName.hashCode()
        result = 31 * result + this.ns.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlQnameText> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlQnameText> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): WsXmlQnameText =
                    WsXmlQnameText(
                        (WsXmlText.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlString>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsXmlQnameText) {
                    (WsXmlText.typeLayout()).writeNative(addr, value.text)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 8L, value.prefix)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 16L, value.localName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlString>(64)
                    ).writeNative(addr + 24L, value.ns)
                }
            }

        public operator fun invoke(
            text: WsXmlText = WsXmlText(),
            prefix: MutPtr<WsXmlString> = MutPtr(0L),
            localName: MutPtr<WsXmlString> = MutPtr(0L),
            ns: MutPtr<WsXmlString> = MutPtr(0L),
        ): WsXmlQnameText =
            WsXmlQnameText(
                text = text,
                prefixCtorArg = prefix,
                localNameCtorArg = localName,
                nsCtorArg = ns,
            )
    }
}

public class WsXmlReaderBinaryEncoding internal constructor(
    public var encoding: WsXmlReaderEncoding,
    staticDictionaryCtorArg: MutPtr<WsXmlDictionary>,
    dynamicDictionaryCtorArg: MutPtr<WsXmlDictionary>,
) {
    public var staticDictionary: MutPtr<WsXmlDictionary> = staticDictionaryCtorArg
        internal set

    public var dynamicDictionary: MutPtr<WsXmlDictionary> = dynamicDictionaryCtorArg
        internal set

    public constructor() : this(
        encoding = WsXmlReaderEncoding(),
        staticDictionaryCtorArg = MutPtr(0L),
        dynamicDictionaryCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsXmlReaderEncoding = this.encoding

    public operator fun component2(): MutPtr<WsXmlDictionary> = this.staticDictionary

    public operator fun component3(): MutPtr<WsXmlDictionary> = this.dynamicDictionary

    public fun copy(encoding: WsXmlReaderEncoding = this.encoding, staticDictionary: MutPtr<WsXmlDictionary> = this.staticDictionary, dynamicDictionary: MutPtr<WsXmlDictionary> = this.dynamicDictionary): WsXmlReaderBinaryEncoding = WsXmlReaderBinaryEncoding(encoding = encoding, staticDictionaryCtorArg = staticDictionary, dynamicDictionaryCtorArg = dynamicDictionary)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlReaderBinaryEncoding) return false
        if (this.encoding != other.encoding) return false
        if (this.staticDictionary != other.staticDictionary) return false
        if (this.dynamicDictionary != other.dynamicDictionary) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.encoding.hashCode()
        result = 31 * result + this.staticDictionary.hashCode()
        result = 31 * result + this.dynamicDictionary.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderBinaryEncoding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderBinaryEncoding> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WsXmlReaderBinaryEncoding =
                    WsXmlReaderBinaryEncoding(
                        (WsXmlReaderEncoding.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlDictionary>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlDictionary>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsXmlReaderBinaryEncoding) {
                    (WsXmlReaderEncoding.typeLayout()).writeNative(addr, value.encoding)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlDictionary>(64)
                    ).writeNative(addr + 8L, value.staticDictionary)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlDictionary>(64)
                    ).writeNative(addr + 16L, value.dynamicDictionary)
                }
            }

        public operator fun invoke(
            encoding: WsXmlReaderEncoding = WsXmlReaderEncoding(),
            staticDictionary: MutPtr<WsXmlDictionary> = MutPtr(0L),
            dynamicDictionary: MutPtr<WsXmlDictionary> = MutPtr(0L),
        ): WsXmlReaderBinaryEncoding =
            WsXmlReaderBinaryEncoding(
                encoding = encoding,
                staticDictionaryCtorArg = staticDictionary,
                dynamicDictionaryCtorArg = dynamicDictionary,
            )
    }
}

public class WsXmlReaderBufferInput internal constructor(
    public var input: WsXmlReaderInput,
    encodedDataCtorArg: MutPtr<CVoid>,
    public var encodedDataSize: UInt,
) {
    public var encodedData: MutPtr<CVoid> = encodedDataCtorArg
        internal set

    public constructor() : this(
        input = WsXmlReaderInput(),
        encodedDataCtorArg = MutPtr(0L),
        encodedDataSize = 0u,
    )

    public operator fun component1(): WsXmlReaderInput = this.input

    public operator fun component2(): MutPtr<CVoid> = this.encodedData

    public operator fun component3(): UInt = this.encodedDataSize

    public fun copy(input: WsXmlReaderInput = this.input, encodedData: MutPtr<CVoid> = this.encodedData, encodedDataSize: UInt = this.encodedDataSize): WsXmlReaderBufferInput = WsXmlReaderBufferInput(input = input, encodedDataCtorArg = encodedData, encodedDataSize = encodedDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlReaderBufferInput) return false
        if (this.input != other.input) return false
        if (this.encodedData != other.encodedData) return false
        if (this.encodedDataSize != other.encodedDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.input.hashCode()
        result = 31 * result + this.encodedData.hashCode()
        result = 31 * result + this.encodedDataSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderBufferInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderBufferInput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WsXmlReaderBufferInput =
                    WsXmlReaderBufferInput(
                        (WsXmlReaderInput.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsXmlReaderBufferInput) {
                    (WsXmlReaderInput.typeLayout()).writeNative(addr, value.input)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.encodedData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.encodedDataSize)
                }
            }

        public operator fun invoke(
            input: WsXmlReaderInput = WsXmlReaderInput(),
            encodedData: MutPtr<CVoid> = MutPtr(0L),
            encodedDataSize: UInt = 0u,
        ): WsXmlReaderBufferInput =
            WsXmlReaderBufferInput(
                input = input,
                encodedDataCtorArg = encodedData,
                encodedDataSize = encodedDataSize,
            )
    }
}

public data class WsXmlReaderEncoding(
    public var encodingType: WsXmlReaderEncodingType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderEncoding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderEncoding> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WsXmlReaderEncoding =
                    WsXmlReaderEncoding(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsXmlReaderEncoding) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.encodingType)
                }
            }
    }
}

public data class WsXmlReaderInput(
    public var inputType: WsXmlReaderInputType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderInput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WsXmlReaderInput =
                    WsXmlReaderInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsXmlReaderInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.inputType)
                }
            }
    }
}

public class WsXmlReaderMtomEncoding internal constructor(
    public var encoding: WsXmlReaderEncoding,
    textEncodingCtorArg: MutPtr<WsXmlReaderEncoding>,
    public var readMimeHeader: Bool,
    public var startInfo: WsString,
    public var boundary: WsString,
    public var startUri: WsString,
) {
    public var textEncoding: MutPtr<WsXmlReaderEncoding> = textEncodingCtorArg
        internal set

    public constructor() : this(
        encoding = WsXmlReaderEncoding(),
        textEncodingCtorArg = MutPtr(0L),
        readMimeHeader = 0,
        startInfo = WsString(),
        boundary = WsString(),
        startUri = WsString(),
    )

    public operator fun component1(): WsXmlReaderEncoding = this.encoding

    public operator fun component2(): MutPtr<WsXmlReaderEncoding> = this.textEncoding

    public operator fun component3(): Bool = this.readMimeHeader

    public operator fun component4(): WsString = this.startInfo

    public operator fun component5(): WsString = this.boundary

    public operator fun component6(): WsString = this.startUri

    public fun copy(encoding: WsXmlReaderEncoding = this.encoding, textEncoding: MutPtr<WsXmlReaderEncoding> = this.textEncoding, readMimeHeader: Bool = this.readMimeHeader, startInfo: WsString = this.startInfo, boundary: WsString = this.boundary, startUri: WsString = this.startUri): WsXmlReaderMtomEncoding = WsXmlReaderMtomEncoding(encoding = encoding, textEncodingCtorArg = textEncoding, readMimeHeader = readMimeHeader, startInfo = startInfo, boundary = boundary, startUri = startUri)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlReaderMtomEncoding) return false
        if (this.encoding != other.encoding) return false
        if (this.textEncoding != other.textEncoding) return false
        if (this.readMimeHeader != other.readMimeHeader) return false
        if (this.startInfo != other.startInfo) return false
        if (this.boundary != other.boundary) return false
        if (this.startUri != other.startUri) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.encoding.hashCode()
        result = 31 * result + this.textEncoding.hashCode()
        result = 31 * result + this.readMimeHeader.hashCode()
        result = 31 * result + this.startInfo.hashCode()
        result = 31 * result + this.boundary.hashCode()
        result = 31 * result + this.startUri.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            encoding: WsXmlReaderEncoding = WsXmlReaderEncoding(),
            textEncoding: MutPtr<WsXmlReaderEncoding> = MutPtr(0L),
            readMimeHeader: Bool = 0,
            startInfo: WsString = WsString(),
            boundary: WsString = WsString(),
            startUri: WsString = WsString(),
        ): WsXmlReaderMtomEncoding =
            WsXmlReaderMtomEncoding(
                encoding = encoding,
                textEncodingCtorArg = textEncoding,
                readMimeHeader = readMimeHeader,
                startInfo = startInfo,
                boundary = boundary,
                startUri = startUri,
            )
    }
}

public class WsXmlReaderProperties internal constructor(
    propertiesCtorArg: MutPtr<WsXmlReaderProperty>,
    public var propertyCount: UInt,
) {
    public var properties: MutPtr<WsXmlReaderProperty> = propertiesCtorArg
        internal set

    public constructor() : this(
        propertiesCtorArg = MutPtr(0L),
        propertyCount = 0u,
    )

    public operator fun component1(): MutPtr<WsXmlReaderProperty> = this.properties

    public operator fun component2(): UInt = this.propertyCount

    public fun copy(properties: MutPtr<WsXmlReaderProperty> = this.properties, propertyCount: UInt = this.propertyCount): WsXmlReaderProperties = WsXmlReaderProperties(propertiesCtorArg = properties, propertyCount = propertyCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlReaderProperties) return false
        if (this.properties != other.properties) return false
        if (this.propertyCount != other.propertyCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.properties.hashCode()
        result = 31 * result + this.propertyCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderProperties> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WsXmlReaderProperties =
                    WsXmlReaderProperties(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlReaderProperty>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsXmlReaderProperties) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlReaderProperty>(64)
                    ).writeNative(addr, value.properties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.propertyCount)
                }
            }

        public operator fun invoke(
            properties: MutPtr<WsXmlReaderProperty> = MutPtr(0L),
            propertyCount: UInt = 0u,
        ): WsXmlReaderProperties =
            WsXmlReaderProperties(
                propertiesCtorArg = properties,
                propertyCount = propertyCount,
            )
    }
}

public class WsXmlReaderProperty internal constructor(
    public var id: WsXmlReaderPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsXmlReaderPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsXmlReaderPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsXmlReaderProperty = WsXmlReaderProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlReaderProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderProperty> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WsXmlReaderProperty =
                    WsXmlReaderProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsXmlReaderProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsXmlReaderPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsXmlReaderProperty =
            WsXmlReaderProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public data class WsXmlReaderRawEncoding(
    public var encoding: WsXmlReaderEncoding = WsXmlReaderEncoding(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderRawEncoding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderRawEncoding> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WsXmlReaderRawEncoding =
                    WsXmlReaderRawEncoding(
                        (WsXmlReaderEncoding.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsXmlReaderRawEncoding) {
                    (WsXmlReaderEncoding.typeLayout()).writeNative(addr, value.encoding)
                }
            }
    }
}

public class WsXmlReaderStreamInput internal constructor(
    public var input: WsXmlReaderInput,
    public var readCallback: WsReadCallback,
    readCallbackStateCtorArg: MutPtr<CVoid>,
) {
    public var readCallbackState: MutPtr<CVoid> = readCallbackStateCtorArg
        internal set

    public constructor() : this(
        input = WsXmlReaderInput(),
        readCallback = null,
        readCallbackStateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsXmlReaderInput = this.input

    public operator fun component2(): WsReadCallback = this.readCallback

    public operator fun component3(): MutPtr<CVoid> = this.readCallbackState

    public fun copy(input: WsXmlReaderInput = this.input, readCallback: WsReadCallback = this.readCallback, readCallbackState: MutPtr<CVoid> = this.readCallbackState): WsXmlReaderStreamInput = WsXmlReaderStreamInput(input = input, readCallback = readCallback, readCallbackStateCtorArg = readCallbackState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlReaderStreamInput) return false
        if (this.input != other.input) return false
        if (this.readCallback != other.readCallback) return false
        if (this.readCallbackState != other.readCallbackState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.input.hashCode()
        result = 31 * result + this.readCallback.hashCode()
        result = 31 * result + this.readCallbackState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            input: WsXmlReaderInput = WsXmlReaderInput(),
            readCallback: WsReadCallback = null,
            readCallbackState: MutPtr<CVoid> = MutPtr(0L),
        ): WsXmlReaderStreamInput =
            WsXmlReaderStreamInput(
                input = input,
                readCallback = readCallback,
                readCallbackStateCtorArg = readCallbackState,
            )
    }
}

public data class WsXmlReaderTextEncoding(
    public var encoding: WsXmlReaderEncoding = WsXmlReaderEncoding(),
    public var charSet: WsCharset = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderTextEncoding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlReaderTextEncoding> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WsXmlReaderTextEncoding =
                    WsXmlReaderTextEncoding(
                        (WsXmlReaderEncoding.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsXmlReaderTextEncoding) {
                    (WsXmlReaderEncoding.typeLayout()).writeNative(addr, value.encoding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.charSet)
                }
            }
    }
}

public class WsXmlSecurityTokenProperty internal constructor(
    public var id: WsXmlSecurityTokenPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsXmlSecurityTokenPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsXmlSecurityTokenPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsXmlSecurityTokenProperty = WsXmlSecurityTokenProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlSecurityTokenProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlSecurityTokenProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlSecurityTokenProperty> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WsXmlSecurityTokenProperty =
                    WsXmlSecurityTokenProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsXmlSecurityTokenProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsXmlSecurityTokenPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsXmlSecurityTokenProperty =
            WsXmlSecurityTokenProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public class WsXmlString internal constructor(
    public var length: UInt,
    bytesCtorArg: MutPtr<UByte>,
    dictionaryCtorArg: MutPtr<WsXmlDictionary>,
    public var id: UInt,
) {
    public var bytes: MutPtr<UByte> = bytesCtorArg
        internal set

    public var dictionary: MutPtr<WsXmlDictionary> = dictionaryCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        bytesCtorArg = MutPtr(0L),
        dictionaryCtorArg = MutPtr(0L),
        id = 0u,
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): MutPtr<UByte> = this.bytes

    public operator fun component3(): MutPtr<WsXmlDictionary> = this.dictionary

    public operator fun component4(): UInt = this.id

    public fun copy(length: UInt = this.length, bytes: MutPtr<UByte> = this.bytes, dictionary: MutPtr<WsXmlDictionary> = this.dictionary, id: UInt = this.id): WsXmlString = WsXmlString(length = length, bytesCtorArg = bytes, dictionaryCtorArg = dictionary, id = id)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlString) return false
        if (this.length != other.length) return false
        if (this.bytes != other.bytes) return false
        if (this.dictionary != other.dictionary) return false
        if (this.id != other.id) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.bytes.hashCode()
        result = 31 * result + this.dictionary.hashCode()
        result = 31 * result + this.id.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlString> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlString> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): WsXmlString =
                    WsXmlString(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlDictionary>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WsXmlString) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.bytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlDictionary>(64)
                    ).writeNative(addr + 16L, value.dictionary)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.id)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            bytes: MutPtr<UByte> = MutPtr(0L),
            dictionary: MutPtr<WsXmlDictionary> = MutPtr(0L),
            id: UInt = 0u,
        ): WsXmlString =
            WsXmlString(
                length = length,
                bytesCtorArg = bytes,
                dictionaryCtorArg = dictionary,
                id = id,
            )
    }
}

public data class WsXmlStringDescription(
    public var minByteCount: UInt = 0u,
    public var maxByteCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlStringDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlStringDescription> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WsXmlStringDescription =
                    WsXmlStringDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsXmlStringDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minByteCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxByteCount)
                }
            }
    }
}

public data class WsXmlText(
    public var textType: WsXmlTextType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlText> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlText> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WsXmlText =
                    WsXmlText(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsXmlText) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.textType)
                }
            }
    }
}

public class WsXmlTextNode internal constructor(
    public var node: WsXmlNode,
    textCtorArg: MutPtr<WsXmlText>,
) {
    public var text: MutPtr<WsXmlText> = textCtorArg
        internal set

    public constructor() : this(
        node = WsXmlNode(),
        textCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsXmlNode = this.node

    public operator fun component2(): MutPtr<WsXmlText> = this.text

    public fun copy(node: WsXmlNode = this.node, text: MutPtr<WsXmlText> = this.text): WsXmlTextNode = WsXmlTextNode(node = node, textCtorArg = text)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlTextNode) return false
        if (this.node != other.node) return false
        if (this.text != other.text) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.node.hashCode()
        result = 31 * result + this.text.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlTextNode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlTextNode> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WsXmlTextNode =
                    WsXmlTextNode(
                        (WsXmlNode.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlText>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsXmlTextNode) {
                    (WsXmlNode.typeLayout()).writeNative(addr, value.node)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlText>(64)
                    ).writeNative(addr + 8L, value.text)
                }
            }

        public operator fun invoke(
            node: WsXmlNode = WsXmlNode(),
            text: MutPtr<WsXmlText> = MutPtr(0L),
        ): WsXmlTextNode =
            WsXmlTextNode(
                node = node,
                textCtorArg = text,
            )
    }
}

public data class WsXmlTimespanText(
    public var text: WsXmlText = WsXmlText(),
    public var value: WsTimespan = WsTimespan(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlTimespanText> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlTimespanText> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WsXmlTimespanText =
                    WsXmlTimespanText(
                        (WsXmlText.typeLayout()).readNative(addr),
                        (WsTimespan.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsXmlTimespanText) {
                    (WsXmlText.typeLayout()).writeNative(addr, value.text)
                    (WsTimespan.typeLayout()).writeNative(addr + 8L, value.value)
                }
            }
    }
}

public class WsXmlTokenMessageSecurityBinding internal constructor(
    public var binding: WsSecurityBinding,
    public var bindingUsage: WsMessageSecurityUsage,
    xmlTokenCtorArg: MutPtr<WsSecurityToken>,
) {
    public var xmlToken: MutPtr<WsSecurityToken> = xmlTokenCtorArg
        internal set

    public constructor() : this(
        binding = WsSecurityBinding(),
        bindingUsage = 0,
        xmlTokenCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsSecurityBinding = this.binding

    public operator fun component2(): WsMessageSecurityUsage = this.bindingUsage

    public operator fun component3(): MutPtr<WsSecurityToken> = this.xmlToken

    public fun copy(binding: WsSecurityBinding = this.binding, bindingUsage: WsMessageSecurityUsage = this.bindingUsage, xmlToken: MutPtr<WsSecurityToken> = this.xmlToken): WsXmlTokenMessageSecurityBinding = WsXmlTokenMessageSecurityBinding(binding = binding, bindingUsage = bindingUsage, xmlTokenCtorArg = xmlToken)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlTokenMessageSecurityBinding) return false
        if (this.binding != other.binding) return false
        if (this.bindingUsage != other.bindingUsage) return false
        if (this.xmlToken != other.xmlToken) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.binding.hashCode()
        result = 31 * result + this.bindingUsage.hashCode()
        result = 31 * result + this.xmlToken.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlTokenMessageSecurityBinding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlTokenMessageSecurityBinding> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): WsXmlTokenMessageSecurityBinding =
                    WsXmlTokenMessageSecurityBinding(
                        (WsSecurityBinding.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsSecurityToken>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: WsXmlTokenMessageSecurityBinding) {
                    (WsSecurityBinding.typeLayout()).writeNative(addr, value.binding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.bindingUsage)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsSecurityToken>(64)
                    ).writeNative(addr + 32L, value.xmlToken)
                }
            }

        public operator fun invoke(
            binding: WsSecurityBinding = WsSecurityBinding(),
            bindingUsage: WsMessageSecurityUsage = 0,
            xmlToken: MutPtr<WsSecurityToken> = MutPtr(0L),
        ): WsXmlTokenMessageSecurityBinding =
            WsXmlTokenMessageSecurityBinding(
                binding = binding,
                bindingUsage = bindingUsage,
                xmlTokenCtorArg = xmlToken,
            )
    }
}

public data class WsXmlUint64Text(
    public var text: WsXmlText = WsXmlText(),
    public var value: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlUint64Text> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlUint64Text> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WsXmlUint64Text =
                    WsXmlUint64Text(
                        (WsXmlText.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsXmlUint64Text) {
                    (WsXmlText.typeLayout()).writeNative(addr, value.text)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.value)
                }
            }
    }
}

public data class WsXmlUniqueIdText(
    public var text: WsXmlText = WsXmlText(),
    public var value: Guid = Guid(),
)

public class WsXmlUtf16Text internal constructor(
    public var text: WsXmlText,
    bytesCtorArg: MutPtr<UByte>,
    public var byteCount: UInt,
) {
    public var bytes: MutPtr<UByte> = bytesCtorArg
        internal set

    public constructor() : this(
        text = WsXmlText(),
        bytesCtorArg = MutPtr(0L),
        byteCount = 0u,
    )

    public operator fun component1(): WsXmlText = this.text

    public operator fun component2(): MutPtr<UByte> = this.bytes

    public operator fun component3(): UInt = this.byteCount

    public fun copy(text: WsXmlText = this.text, bytes: MutPtr<UByte> = this.bytes, byteCount: UInt = this.byteCount): WsXmlUtf16Text = WsXmlUtf16Text(text = text, bytesCtorArg = bytes, byteCount = byteCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlUtf16Text) return false
        if (this.text != other.text) return false
        if (this.bytes != other.bytes) return false
        if (this.byteCount != other.byteCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.text.hashCode()
        result = 31 * result + this.bytes.hashCode()
        result = 31 * result + this.byteCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlUtf16Text> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlUtf16Text> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WsXmlUtf16Text =
                    WsXmlUtf16Text(
                        (WsXmlText.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsXmlUtf16Text) {
                    (WsXmlText.typeLayout()).writeNative(addr, value.text)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.bytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.byteCount)
                }
            }

        public operator fun invoke(
            text: WsXmlText = WsXmlText(),
            bytes: MutPtr<UByte> = MutPtr(0L),
            byteCount: UInt = 0u,
        ): WsXmlUtf16Text =
            WsXmlUtf16Text(
                text = text,
                bytesCtorArg = bytes,
                byteCount = byteCount,
            )
    }
}

public data class WsXmlUtf8Text(
    public var text: WsXmlText = WsXmlText(),
    public var value: WsXmlString = WsXmlString(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlUtf8Text> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlUtf8Text> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): WsXmlUtf8Text =
                    WsXmlUtf8Text(
                        (WsXmlText.typeLayout()).readNative(addr),
                        (WsXmlString.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsXmlUtf8Text) {
                    (WsXmlText.typeLayout()).writeNative(addr, value.text)
                    (WsXmlString.typeLayout()).writeNative(addr + 8L, value.value)
                }
            }
    }
}

public class WsXmlWriterBinaryEncoding internal constructor(
    public var encoding: WsXmlWriterEncoding,
    staticDictionaryCtorArg: MutPtr<WsXmlDictionary>,
    public var dynamicStringCallback: WsDynamicStringCallback,
    dynamicStringCallbackStateCtorArg: MutPtr<CVoid>,
) {
    public var staticDictionary: MutPtr<WsXmlDictionary> = staticDictionaryCtorArg
        internal set

    public var dynamicStringCallbackState: MutPtr<CVoid> = dynamicStringCallbackStateCtorArg
        internal set

    public constructor() : this(
        encoding = WsXmlWriterEncoding(),
        staticDictionaryCtorArg = MutPtr(0L),
        dynamicStringCallback = null,
        dynamicStringCallbackStateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsXmlWriterEncoding = this.encoding

    public operator fun component2(): MutPtr<WsXmlDictionary> = this.staticDictionary

    public operator fun component3(): WsDynamicStringCallback = this.dynamicStringCallback

    public operator fun component4(): MutPtr<CVoid> = this.dynamicStringCallbackState

    public fun copy(encoding: WsXmlWriterEncoding = this.encoding, staticDictionary: MutPtr<WsXmlDictionary> = this.staticDictionary, dynamicStringCallback: WsDynamicStringCallback = this.dynamicStringCallback, dynamicStringCallbackState: MutPtr<CVoid> = this.dynamicStringCallbackState): WsXmlWriterBinaryEncoding = WsXmlWriterBinaryEncoding(encoding = encoding, staticDictionaryCtorArg = staticDictionary, dynamicStringCallback = dynamicStringCallback, dynamicStringCallbackStateCtorArg = dynamicStringCallbackState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlWriterBinaryEncoding) return false
        if (this.encoding != other.encoding) return false
        if (this.staticDictionary != other.staticDictionary) return false
        if (this.dynamicStringCallback != other.dynamicStringCallback) return false
        if (this.dynamicStringCallbackState != other.dynamicStringCallbackState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.encoding.hashCode()
        result = 31 * result + this.staticDictionary.hashCode()
        result = 31 * result + this.dynamicStringCallback.hashCode()
        result = 31 * result + this.dynamicStringCallbackState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            encoding: WsXmlWriterEncoding = WsXmlWriterEncoding(),
            staticDictionary: MutPtr<WsXmlDictionary> = MutPtr(0L),
            dynamicStringCallback: WsDynamicStringCallback = null,
            dynamicStringCallbackState: MutPtr<CVoid> = MutPtr(0L),
        ): WsXmlWriterBinaryEncoding =
            WsXmlWriterBinaryEncoding(
                encoding = encoding,
                staticDictionaryCtorArg = staticDictionary,
                dynamicStringCallback = dynamicStringCallback,
                dynamicStringCallbackStateCtorArg = dynamicStringCallbackState,
            )
    }
}

public data class WsXmlWriterBufferOutput(
    public var output: WsXmlWriterOutput = WsXmlWriterOutput(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlWriterBufferOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlWriterBufferOutput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WsXmlWriterBufferOutput =
                    WsXmlWriterBufferOutput(
                        (WsXmlWriterOutput.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsXmlWriterBufferOutput) {
                    (WsXmlWriterOutput.typeLayout()).writeNative(addr, value.output)
                }
            }
    }
}

public data class WsXmlWriterEncoding(
    public var encodingType: WsXmlWriterEncodingType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlWriterEncoding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlWriterEncoding> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WsXmlWriterEncoding =
                    WsXmlWriterEncoding(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsXmlWriterEncoding) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.encodingType)
                }
            }
    }
}

public class WsXmlWriterMtomEncoding internal constructor(
    public var encoding: WsXmlWriterEncoding,
    textEncodingCtorArg: MutPtr<WsXmlWriterEncoding>,
    public var writeMimeHeader: Bool,
    public var boundary: WsString,
    public var startInfo: WsString,
    public var startUri: WsString,
    public var maxInlineByteCount: UInt,
) {
    public var textEncoding: MutPtr<WsXmlWriterEncoding> = textEncodingCtorArg
        internal set

    public constructor() : this(
        encoding = WsXmlWriterEncoding(),
        textEncodingCtorArg = MutPtr(0L),
        writeMimeHeader = 0,
        boundary = WsString(),
        startInfo = WsString(),
        startUri = WsString(),
        maxInlineByteCount = 0u,
    )

    public operator fun component1(): WsXmlWriterEncoding = this.encoding

    public operator fun component2(): MutPtr<WsXmlWriterEncoding> = this.textEncoding

    public operator fun component3(): Bool = this.writeMimeHeader

    public operator fun component4(): WsString = this.boundary

    public operator fun component5(): WsString = this.startInfo

    public operator fun component6(): WsString = this.startUri

    public operator fun component7(): UInt = this.maxInlineByteCount

    public fun copy(encoding: WsXmlWriterEncoding = this.encoding, textEncoding: MutPtr<WsXmlWriterEncoding> = this.textEncoding, writeMimeHeader: Bool = this.writeMimeHeader, boundary: WsString = this.boundary, startInfo: WsString = this.startInfo, startUri: WsString = this.startUri, maxInlineByteCount: UInt = this.maxInlineByteCount): WsXmlWriterMtomEncoding = WsXmlWriterMtomEncoding(encoding = encoding, textEncodingCtorArg = textEncoding, writeMimeHeader = writeMimeHeader, boundary = boundary, startInfo = startInfo, startUri = startUri, maxInlineByteCount = maxInlineByteCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlWriterMtomEncoding) return false
        if (this.encoding != other.encoding) return false
        if (this.textEncoding != other.textEncoding) return false
        if (this.writeMimeHeader != other.writeMimeHeader) return false
        if (this.boundary != other.boundary) return false
        if (this.startInfo != other.startInfo) return false
        if (this.startUri != other.startUri) return false
        if (this.maxInlineByteCount != other.maxInlineByteCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.encoding.hashCode()
        result = 31 * result + this.textEncoding.hashCode()
        result = 31 * result + this.writeMimeHeader.hashCode()
        result = 31 * result + this.boundary.hashCode()
        result = 31 * result + this.startInfo.hashCode()
        result = 31 * result + this.startUri.hashCode()
        result = 31 * result + this.maxInlineByteCount.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            encoding: WsXmlWriterEncoding = WsXmlWriterEncoding(),
            textEncoding: MutPtr<WsXmlWriterEncoding> = MutPtr(0L),
            writeMimeHeader: Bool = 0,
            boundary: WsString = WsString(),
            startInfo: WsString = WsString(),
            startUri: WsString = WsString(),
            maxInlineByteCount: UInt = 0u,
        ): WsXmlWriterMtomEncoding =
            WsXmlWriterMtomEncoding(
                encoding = encoding,
                textEncodingCtorArg = textEncoding,
                writeMimeHeader = writeMimeHeader,
                boundary = boundary,
                startInfo = startInfo,
                startUri = startUri,
                maxInlineByteCount = maxInlineByteCount,
            )
    }
}

public data class WsXmlWriterOutput(
    public var outputType: WsXmlWriterOutputType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlWriterOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlWriterOutput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WsXmlWriterOutput =
                    WsXmlWriterOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsXmlWriterOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.outputType)
                }
            }
    }
}

public class WsXmlWriterProperties internal constructor(
    propertiesCtorArg: MutPtr<WsXmlWriterProperty>,
    public var propertyCount: UInt,
) {
    public var properties: MutPtr<WsXmlWriterProperty> = propertiesCtorArg
        internal set

    public constructor() : this(
        propertiesCtorArg = MutPtr(0L),
        propertyCount = 0u,
    )

    public operator fun component1(): MutPtr<WsXmlWriterProperty> = this.properties

    public operator fun component2(): UInt = this.propertyCount

    public fun copy(properties: MutPtr<WsXmlWriterProperty> = this.properties, propertyCount: UInt = this.propertyCount): WsXmlWriterProperties = WsXmlWriterProperties(propertiesCtorArg = properties, propertyCount = propertyCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlWriterProperties) return false
        if (this.properties != other.properties) return false
        if (this.propertyCount != other.propertyCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.properties.hashCode()
        result = 31 * result + this.propertyCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlWriterProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlWriterProperties> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): WsXmlWriterProperties =
                    WsXmlWriterProperties(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WsXmlWriterProperty>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WsXmlWriterProperties) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WsXmlWriterProperty>(64)
                    ).writeNative(addr, value.properties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.propertyCount)
                }
            }

        public operator fun invoke(
            properties: MutPtr<WsXmlWriterProperty> = MutPtr(0L),
            propertyCount: UInt = 0u,
        ): WsXmlWriterProperties =
            WsXmlWriterProperties(
                propertiesCtorArg = properties,
                propertyCount = propertyCount,
            )
    }
}

public class WsXmlWriterProperty internal constructor(
    public var id: WsXmlWriterPropertyId,
    valueCtorArg: MutPtr<CVoid>,
    public var valueSize: UInt,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public constructor() : this(
        id = 0,
        valueCtorArg = MutPtr(0L),
        valueSize = 0u,
    )

    public operator fun component1(): WsXmlWriterPropertyId = this.id

    public operator fun component2(): MutPtr<CVoid> = this.value

    public operator fun component3(): UInt = this.valueSize

    public fun copy(id: WsXmlWriterPropertyId = this.id, value: MutPtr<CVoid> = this.value, valueSize: UInt = this.valueSize): WsXmlWriterProperty = WsXmlWriterProperty(id = id, valueCtorArg = value, valueSize = valueSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlWriterProperty) return false
        if (this.id != other.id) return false
        if (this.value != other.value) return false
        if (this.valueSize != other.valueSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.value.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlWriterProperty> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlWriterProperty> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): WsXmlWriterProperty =
                    WsXmlWriterProperty(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WsXmlWriterProperty) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.id)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.valueSize)
                }
            }

        public operator fun invoke(
            id: WsXmlWriterPropertyId = 0,
            value: MutPtr<CVoid> = MutPtr(0L),
            valueSize: UInt = 0u,
        ): WsXmlWriterProperty =
            WsXmlWriterProperty(
                id = id,
                valueCtorArg = value,
                valueSize = valueSize,
            )
    }
}

public data class WsXmlWriterRawEncoding(
    public var encoding: WsXmlWriterEncoding = WsXmlWriterEncoding(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlWriterRawEncoding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlWriterRawEncoding> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): WsXmlWriterRawEncoding =
                    WsXmlWriterRawEncoding(
                        (WsXmlWriterEncoding.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WsXmlWriterRawEncoding) {
                    (WsXmlWriterEncoding.typeLayout()).writeNative(addr, value.encoding)
                }
            }
    }
}

public class WsXmlWriterStreamOutput internal constructor(
    public var output: WsXmlWriterOutput,
    public var writeCallback: WsWriteCallback,
    writeCallbackStateCtorArg: MutPtr<CVoid>,
) {
    public var writeCallbackState: MutPtr<CVoid> = writeCallbackStateCtorArg
        internal set

    public constructor() : this(
        output = WsXmlWriterOutput(),
        writeCallback = null,
        writeCallbackStateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WsXmlWriterOutput = this.output

    public operator fun component2(): WsWriteCallback = this.writeCallback

    public operator fun component3(): MutPtr<CVoid> = this.writeCallbackState

    public fun copy(output: WsXmlWriterOutput = this.output, writeCallback: WsWriteCallback = this.writeCallback, writeCallbackState: MutPtr<CVoid> = this.writeCallbackState): WsXmlWriterStreamOutput = WsXmlWriterStreamOutput(output = output, writeCallback = writeCallback, writeCallbackStateCtorArg = writeCallbackState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WsXmlWriterStreamOutput) return false
        if (this.output != other.output) return false
        if (this.writeCallback != other.writeCallback) return false
        if (this.writeCallbackState != other.writeCallbackState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.output.hashCode()
        result = 31 * result + this.writeCallback.hashCode()
        result = 31 * result + this.writeCallbackState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            output: WsXmlWriterOutput = WsXmlWriterOutput(),
            writeCallback: WsWriteCallback = null,
            writeCallbackState: MutPtr<CVoid> = MutPtr(0L),
        ): WsXmlWriterStreamOutput =
            WsXmlWriterStreamOutput(
                output = output,
                writeCallback = writeCallback,
                writeCallbackStateCtorArg = writeCallbackState,
            )
    }
}

public data class WsXmlWriterTextEncoding(
    public var encoding: WsXmlWriterEncoding = WsXmlWriterEncoding(),
    public var charSet: WsCharset = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlWriterTextEncoding> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WsXmlWriterTextEncoding> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WsXmlWriterTextEncoding =
                    WsXmlWriterTextEncoding(
                        (WsXmlWriterEncoding.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WsXmlWriterTextEncoding) {
                    (WsXmlWriterEncoding.typeLayout()).writeNative(addr, value.encoding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.charSet)
                }
            }
    }
}
