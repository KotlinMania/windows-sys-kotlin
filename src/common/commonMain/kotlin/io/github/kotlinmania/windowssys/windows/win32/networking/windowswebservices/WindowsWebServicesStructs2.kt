package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid

public data class WsXmlInt64Text(public var text: WsXmlText = WsXmlText(), public var value: Long = 0L)

public data class WsXmlListText(
    public var text: WsXmlText = WsXmlText(),
    public var itemCount: UInt = 0u,
    public var items: COpaquePointer? = null,
)

public data class WsXmlNode(public var nodeType: WsXmlNodeType = 0)

public data class WsXmlNodePosition(public var buffer: Int? = null, public var node: COpaquePointer? = null)

public data class WsXmlQname(public var localName: WsXmlString = WsXmlString(), public var ns: WsXmlString = WsXmlString())

public data class WsXmlQnameDescription(
    public var minLocalNameByteCount: UInt = 0u,
    public var maxLocalNameByteCount: UInt = 0u,
    public var minNsByteCount: UInt = 0u,
    public var maxNsByteCount: UInt = 0u,
)

public data class WsXmlQnameText(
    public var text: WsXmlText = WsXmlText(),
    public var prefix: WsXmlString? = null,
    public var localName: WsXmlString? = null,
    public var ns: WsXmlString? = null,
)

public data class WsXmlReaderBinaryEncoding(
    public var encoding: WsXmlReaderEncoding = WsXmlReaderEncoding(),
    public var staticDictionary: WsXmlDictionary? = null,
    public var dynamicDictionary: WsXmlDictionary? = null,
)

public data class WsXmlReaderBufferInput(
    public var input: WsXmlReaderInput = WsXmlReaderInput(),
    public var encodedData: COpaquePointer? = null,
    public var encodedDataSize: UInt = 0u,
)

public data class WsXmlReaderEncoding(public var encodingType: WsXmlReaderEncodingType = 0)

public data class WsXmlReaderInput(public var inputType: WsXmlReaderInputType = 0)

public data class WsXmlReaderMtomEncoding(
    public var encoding: WsXmlReaderEncoding = WsXmlReaderEncoding(),
    public var textEncoding: WsXmlReaderEncoding? = null,
    public var readMimeHeader: Bool = 0,
    public var startInfo: WsString = WsString(),
    public var boundary: WsString = WsString(),
    public var startUri: WsString = WsString(),
)

public data class WsXmlReaderProperties(public var properties: WsXmlReaderProperty? = null, public var propertyCount: UInt = 0u)

public data class WsXmlReaderProperty(
    public var id: WsXmlReaderPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsXmlReaderRawEncoding(public var encoding: WsXmlReaderEncoding = WsXmlReaderEncoding())

public data class WsXmlReaderStreamInput(
    public var input: WsXmlReaderInput = WsXmlReaderInput(),
    public var readCallback: WsReadCallback = null,
    public var readCallbackState: COpaquePointer? = null,
)

public data class WsXmlReaderTextEncoding(public var encoding: WsXmlReaderEncoding = WsXmlReaderEncoding(), public var charSet: WsCharset = 0)

public data class WsXmlSecurityTokenProperty(
    public var id: WsXmlSecurityTokenPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsXmlString(
    public var length: UInt = 0u,
    public var bytes: COpaquePointer? = null,
    public var dictionary: WsXmlDictionary? = null,
    public var id: UInt = 0u,
)

public data class WsXmlStringDescription(public var minByteCount: UInt = 0u, public var maxByteCount: UInt = 0u)

public data class WsXmlText(public var textType: WsXmlTextType = 0)

public data class WsXmlTextNode(public var node: WsXmlNode = WsXmlNode(), public var text: WsXmlText? = null)

public data class WsXmlTimespanText(public var text: WsXmlText = WsXmlText(), public var value: WsTimespan = WsTimespan())

public data class WsXmlTokenMessageSecurityBinding(
    public var binding: WsSecurityBinding = WsSecurityBinding(),
    public var bindingUsage: WsMessageSecurityUsage = 0,
    public var xmlToken: Int? = null,
)

public data class WsXmlUint64Text(public var text: WsXmlText = WsXmlText(), public var value: ULong = 0uL)

public data class WsXmlUniqueIdText(public var text: WsXmlText = WsXmlText(), public var value: Guid = Guid())

public data class WsXmlUtf16Text(
    public var text: WsXmlText = WsXmlText(),
    public var bytes: COpaquePointer? = null,
    public var byteCount: UInt = 0u,
)

public data class WsXmlUtf8Text(public var text: WsXmlText = WsXmlText(), public var value: WsXmlString = WsXmlString())

public data class WsXmlWriterBinaryEncoding(
    public var encoding: WsXmlWriterEncoding = WsXmlWriterEncoding(),
    public var staticDictionary: WsXmlDictionary? = null,
    public var dynamicStringCallback: WsDynamicStringCallback = null,
    public var dynamicStringCallbackState: COpaquePointer? = null,
)

public data class WsXmlWriterBufferOutput(public var output: WsXmlWriterOutput = WsXmlWriterOutput())

public data class WsXmlWriterEncoding(public var encodingType: WsXmlWriterEncodingType = 0)

public data class WsXmlWriterMtomEncoding(
    public var encoding: WsXmlWriterEncoding = WsXmlWriterEncoding(),
    public var textEncoding: WsXmlWriterEncoding? = null,
    public var writeMimeHeader: Bool = 0,
    public var boundary: WsString = WsString(),
    public var startInfo: WsString = WsString(),
    public var startUri: WsString = WsString(),
    public var maxInlineByteCount: UInt = 0u,
)

public data class WsXmlWriterOutput(public var outputType: WsXmlWriterOutputType = 0)

public data class WsXmlWriterProperties(public var properties: WsXmlWriterProperty? = null, public var propertyCount: UInt = 0u)

public data class WsXmlWriterProperty(
    public var id: WsXmlWriterPropertyId = 0,
    public var value: COpaquePointer? = null,
    public var valueSize: UInt = 0u,
)

public data class WsXmlWriterRawEncoding(public var encoding: WsXmlWriterEncoding = WsXmlWriterEncoding())

public data class WsXmlWriterStreamOutput(
    public var output: WsXmlWriterOutput = WsXmlWriterOutput(),
    public var writeCallback: WsWriteCallback = null,
    public var writeCallbackState: COpaquePointer? = null,
)

public data class WsXmlWriterTextEncoding(public var encoding: WsXmlWriterEncoding = WsXmlWriterEncoding(), public var charSet: WsCharset = 0)
