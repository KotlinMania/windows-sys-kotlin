package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID

public data class WS_XML_INT64_TEXT(public var text: WS_XML_TEXT = WS_XML_TEXT(), public var value: Long = 0L)

public data class WS_XML_LIST_TEXT(
    public var text: WS_XML_TEXT = WS_XML_TEXT(),
    public var itemCount: UInt = 0u,
    public var items: Long = 0L,
)

public data class WS_XML_NODE(public var nodeType: WS_XML_NODE_TYPE = 0)

public data class WS_XML_NODE_POSITION(public var buffer: Long = 0L, public var node: Long = 0L)

public data class WS_XML_QNAME(public var localName: WS_XML_STRING = WS_XML_STRING(), public var ns: WS_XML_STRING = WS_XML_STRING())

public data class WS_XML_QNAME_DESCRIPTION(
    public var minLocalNameByteCount: UInt = 0u,
    public var maxLocalNameByteCount: UInt = 0u,
    public var minNsByteCount: UInt = 0u,
    public var maxNsByteCount: UInt = 0u,
)

public data class WS_XML_QNAME_TEXT(
    public var text: WS_XML_TEXT = WS_XML_TEXT(),
    public var prefix: Long = 0L,
    public var localName: Long = 0L,
    public var ns: Long = 0L,
)

public data class WS_XML_READER_BINARY_ENCODING(
    public var encoding: WS_XML_READER_ENCODING = WS_XML_READER_ENCODING(),
    public var staticDictionary: Long = 0L,
    public var dynamicDictionary: Long = 0L,
)

public data class WS_XML_READER_BUFFER_INPUT(
    public var input: WS_XML_READER_INPUT = WS_XML_READER_INPUT(),
    public var encodedData: Long = 0L,
    public var encodedDataSize: UInt = 0u,
)

public data class WS_XML_READER_ENCODING(public var encodingType: WS_XML_READER_ENCODING_TYPE = 0)

public data class WS_XML_READER_INPUT(public var inputType: WS_XML_READER_INPUT_TYPE = 0)

public data class WS_XML_READER_MTOM_ENCODING(
    public var encoding: WS_XML_READER_ENCODING = WS_XML_READER_ENCODING(),
    public var textEncoding: Long = 0L,
    public var readMimeHeader: BOOL = 0,
    public var startInfo: WS_STRING = WS_STRING(),
    public var boundary: WS_STRING = WS_STRING(),
    public var startUri: WS_STRING = WS_STRING(),
)

public data class WS_XML_READER_PROPERTIES(public var properties: Long = 0L, public var propertyCount: UInt = 0u)

public data class WS_XML_READER_PROPERTY(
    public var id: WS_XML_READER_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_XML_READER_RAW_ENCODING(public var encoding: WS_XML_READER_ENCODING = WS_XML_READER_ENCODING())

public data class WS_XML_READER_STREAM_INPUT(
    public var input: WS_XML_READER_INPUT = WS_XML_READER_INPUT(),
    public var readCallback: WS_READ_CALLBACK = null,
    public var readCallbackState: Long = 0L,
)

public data class WS_XML_READER_TEXT_ENCODING(public var encoding: WS_XML_READER_ENCODING = WS_XML_READER_ENCODING(), public var charSet: WS_CHARSET = 0)

public data class WS_XML_SECURITY_TOKEN_PROPERTY(
    public var id: WS_XML_SECURITY_TOKEN_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_XML_STRING(
    public var length: UInt = 0u,
    public var bytes: Long = 0L,
    public var dictionary: Long = 0L,
    public var id: UInt = 0u,
)

public data class WS_XML_STRING_DESCRIPTION(public var minByteCount: UInt = 0u, public var maxByteCount: UInt = 0u)

public data class WS_XML_TEXT(public var textType: WS_XML_TEXT_TYPE = 0)

public data class WS_XML_TEXT_NODE(public var node: WS_XML_NODE = WS_XML_NODE(), public var text: Long = 0L)

public data class WS_XML_TIMESPAN_TEXT(public var text: WS_XML_TEXT = WS_XML_TEXT(), public var value: WS_TIMESPAN = WS_TIMESPAN())

public data class WS_XML_TOKEN_MESSAGE_SECURITY_BINDING(
    public var binding: WS_SECURITY_BINDING = WS_SECURITY_BINDING(),
    public var bindingUsage: WS_MESSAGE_SECURITY_USAGE = 0,
    public var xmlToken: Long = 0L,
)

public data class WS_XML_UINT64_TEXT(public var text: WS_XML_TEXT = WS_XML_TEXT(), public var value: ULong = 0uL)

public data class WS_XML_UNIQUE_ID_TEXT(public var text: WS_XML_TEXT = WS_XML_TEXT(), public var value: GUID = GUID())

public data class WS_XML_UTF16_TEXT(
    public var text: WS_XML_TEXT = WS_XML_TEXT(),
    public var bytes: Long = 0L,
    public var byteCount: UInt = 0u,
)

public data class WS_XML_UTF8_TEXT(public var text: WS_XML_TEXT = WS_XML_TEXT(), public var value: WS_XML_STRING = WS_XML_STRING())

public data class WS_XML_WRITER_BINARY_ENCODING(
    public var encoding: WS_XML_WRITER_ENCODING = WS_XML_WRITER_ENCODING(),
    public var staticDictionary: Long = 0L,
    public var dynamicStringCallback: WS_DYNAMIC_STRING_CALLBACK = null,
    public var dynamicStringCallbackState: Long = 0L,
)

public data class WS_XML_WRITER_BUFFER_OUTPUT(public var output: WS_XML_WRITER_OUTPUT = WS_XML_WRITER_OUTPUT())

public data class WS_XML_WRITER_ENCODING(public var encodingType: WS_XML_WRITER_ENCODING_TYPE = 0)

public data class WS_XML_WRITER_MTOM_ENCODING(
    public var encoding: WS_XML_WRITER_ENCODING = WS_XML_WRITER_ENCODING(),
    public var textEncoding: Long = 0L,
    public var writeMimeHeader: BOOL = 0,
    public var boundary: WS_STRING = WS_STRING(),
    public var startInfo: WS_STRING = WS_STRING(),
    public var startUri: WS_STRING = WS_STRING(),
    public var maxInlineByteCount: UInt = 0u,
)

public data class WS_XML_WRITER_OUTPUT(public var outputType: WS_XML_WRITER_OUTPUT_TYPE = 0)

public data class WS_XML_WRITER_PROPERTIES(public var properties: Long = 0L, public var propertyCount: UInt = 0u)

public data class WS_XML_WRITER_PROPERTY(
    public var id: WS_XML_WRITER_PROPERTY_ID = 0,
    public var value: Long = 0L,
    public var valueSize: UInt = 0u,
)

public data class WS_XML_WRITER_RAW_ENCODING(public var encoding: WS_XML_WRITER_ENCODING = WS_XML_WRITER_ENCODING())

public data class WS_XML_WRITER_STREAM_OUTPUT(
    public var output: WS_XML_WRITER_OUTPUT = WS_XML_WRITER_OUTPUT(),
    public var writeCallback: WS_WRITE_CALLBACK = null,
    public var writeCallbackState: Long = 0L,
)

public data class WS_XML_WRITER_TEXT_ENCODING(public var encoding: WS_XML_WRITER_ENCODING = WS_XML_WRITER_ENCODING(), public var charSet: WS_CHARSET = 0)
