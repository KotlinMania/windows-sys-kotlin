@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Axeslista
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Axeslistw
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Newtextmetrica
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Newtextmetricw

public data class Caldatetime(
    public var calId: UInt = 0u,
    public var era: UInt = 0u,
    public var year: UInt = 0u,
    public var month: UInt = 0u,
    public var day: UInt = 0u,
    public var dayOfWeek: UInt = 0u,
    public var hour: UInt = 0u,
    public var minute: UInt = 0u,
    public var second: UInt = 0u,
    public var tick: UInt = 0u,
)

public data class Charsetinfo(
    public var ciCharset: UInt = 0u,
    public var ciACP: UInt = 0u,
    public var fs: Fontsignature = Fontsignature(),
)

public data class Cpinfo(
    public var maxCharSize: UInt = 0u,
    public var defaultChar: UByteArray = UByteArray(2),
    public var leadByte: UByteArray = UByteArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cpinfo) return false
        if (this.maxCharSize != other.maxCharSize) return false
        if (!this.defaultChar.contentEquals(other.defaultChar)) return false
        if (!this.leadByte.contentEquals(other.leadByte)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxCharSize.hashCode()
        result = 31 * result + this.defaultChar.contentHashCode()
        result = 31 * result + this.leadByte.contentHashCode()
        return result
    }
}

public data class Cpinfoexa(
    public var maxCharSize: UInt = 0u,
    public var defaultChar: UByteArray = UByteArray(2),
    public var leadByte: UByteArray = UByteArray(12),
    public var unicodeDefaultChar: UShort = 0u,
    public var codePage: UInt = 0u,
    public var codePageName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cpinfoexa) return false
        if (this.maxCharSize != other.maxCharSize) return false
        if (!this.defaultChar.contentEquals(other.defaultChar)) return false
        if (!this.leadByte.contentEquals(other.leadByte)) return false
        if (this.unicodeDefaultChar != other.unicodeDefaultChar) return false
        if (this.codePage != other.codePage) return false
        if (!this.codePageName.contentEquals(other.codePageName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxCharSize.hashCode()
        result = 31 * result + this.defaultChar.contentHashCode()
        result = 31 * result + this.leadByte.contentHashCode()
        result = 31 * result + this.unicodeDefaultChar.hashCode()
        result = 31 * result + this.codePage.hashCode()
        result = 31 * result + this.codePageName.contentHashCode()
        return result
    }
}

public data class Cpinfoexw(
    public var maxCharSize: UInt = 0u,
    public var defaultChar: UByteArray = UByteArray(2),
    public var leadByte: UByteArray = UByteArray(12),
    public var unicodeDefaultChar: UShort = 0u,
    public var codePage: UInt = 0u,
    public var codePageName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cpinfoexw) return false
        if (this.maxCharSize != other.maxCharSize) return false
        if (!this.defaultChar.contentEquals(other.defaultChar)) return false
        if (!this.leadByte.contentEquals(other.leadByte)) return false
        if (this.unicodeDefaultChar != other.unicodeDefaultChar) return false
        if (this.codePage != other.codePage) return false
        if (!this.codePageName.contentEquals(other.codePageName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxCharSize.hashCode()
        result = 31 * result + this.defaultChar.contentHashCode()
        result = 31 * result + this.leadByte.contentHashCode()
        result = 31 * result + this.unicodeDefaultChar.hashCode()
        result = 31 * result + this.codePage.hashCode()
        result = 31 * result + this.codePageName.contentHashCode()
        return result
    }
}

public data class Currencyfmta(
    public var numDigits: UInt = 0u,
    public var leadingZero: UInt = 0u,
    public var grouping: UInt = 0u,
    public var lpDecimalSep: Pstr = null,
    public var lpThousandSep: Pstr = null,
    public var negativeOrder: UInt = 0u,
    public var positiveOrder: UInt = 0u,
    public var lpCurrencySymbol: Pstr = null,
)

public data class Currencyfmtw(
    public var numDigits: UInt = 0u,
    public var leadingZero: UInt = 0u,
    public var grouping: UInt = 0u,
    public var lpDecimalSep: Pwstr = null,
    public var lpThousandSep: Pwstr = null,
    public var negativeOrder: UInt = 0u,
    public var positiveOrder: UInt = 0u,
    public var lpCurrencySymbol: Pwstr = null,
)

public data class DetectEncodingInfo(
    public var nLangID: UInt = 0u,
    public var nCodePage: UInt = 0u,
    public var nDocPercent: Int = 0,
    public var nConfidence: Int = 0,
)

public data class Enumtextmetrica(
    public var etmNewTextMetricEx: Newtextmetricexa = Newtextmetricexa(),
    public var etmAxesList: Axeslista = Axeslista(),
)

public data class Enumtextmetricw(
    public var etmNewTextMetricEx: Newtextmetricexw = Newtextmetricexw(),
    public var etmAxesList: Axeslistw = Axeslistw(),
)

public data class Filemuiinfo(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFileType: UInt = 0u,
    public var pChecksum: UByteArray = UByteArray(16),
    public var pServiceChecksum: UByteArray = UByteArray(16),
    public var dwLanguageNameOffset: UInt = 0u,
    public var dwTypeIDMainSize: UInt = 0u,
    public var dwTypeIDMainOffset: UInt = 0u,
    public var dwTypeNameMainOffset: UInt = 0u,
    public var dwTypeIDMUISize: UInt = 0u,
    public var dwTypeIDMUIOffset: UInt = 0u,
    public var dwTypeNameMUIOffset: UInt = 0u,
    public var abBuffer: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Filemuiinfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwFileType != other.dwFileType) return false
        if (!this.pChecksum.contentEquals(other.pChecksum)) return false
        if (!this.pServiceChecksum.contentEquals(other.pServiceChecksum)) return false
        if (this.dwLanguageNameOffset != other.dwLanguageNameOffset) return false
        if (this.dwTypeIDMainSize != other.dwTypeIDMainSize) return false
        if (this.dwTypeIDMainOffset != other.dwTypeIDMainOffset) return false
        if (this.dwTypeNameMainOffset != other.dwTypeNameMainOffset) return false
        if (this.dwTypeIDMUISize != other.dwTypeIDMUISize) return false
        if (this.dwTypeIDMUIOffset != other.dwTypeIDMUIOffset) return false
        if (this.dwTypeNameMUIOffset != other.dwTypeNameMUIOffset) return false
        if (!this.abBuffer.contentEquals(other.abBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwVersion.hashCode()
        result = 31 * result + this.dwFileType.hashCode()
        result = 31 * result + this.pChecksum.contentHashCode()
        result = 31 * result + this.pServiceChecksum.contentHashCode()
        result = 31 * result + this.dwLanguageNameOffset.hashCode()
        result = 31 * result + this.dwTypeIDMainSize.hashCode()
        result = 31 * result + this.dwTypeIDMainOffset.hashCode()
        result = 31 * result + this.dwTypeNameMainOffset.hashCode()
        result = 31 * result + this.dwTypeIDMUISize.hashCode()
        result = 31 * result + this.dwTypeIDMUIOffset.hashCode()
        result = 31 * result + this.dwTypeNameMUIOffset.hashCode()
        result = 31 * result + this.abBuffer.contentHashCode()
        return result
    }
}

public data class Fontsignature(
    public var fsUsb: UIntArray = UIntArray(4),
    public var fsCsb: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fontsignature) return false
        if (!this.fsUsb.contentEquals(other.fsUsb)) return false
        if (!this.fsCsb.contentEquals(other.fsCsb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fsUsb.contentHashCode()
        result = 31 * result + this.fsCsb.contentHashCode()
        return result
    }
}

public data class Goffset(
    public var du: Int = 0,
    public var dv: Int = 0,
)

public data class Localesignature(
    public var lsUsb: UIntArray = UIntArray(4),
    public var lsCsbDefault: UIntArray = UIntArray(2),
    public var lsCsbSupported: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Localesignature) return false
        if (!this.lsUsb.contentEquals(other.lsUsb)) return false
        if (!this.lsCsbDefault.contentEquals(other.lsCsbDefault)) return false
        if (!this.lsCsbSupported.contentEquals(other.lsCsbSupported)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lsUsb.contentHashCode()
        result = 31 * result + this.lsCsbDefault.contentHashCode()
        result = 31 * result + this.lsCsbSupported.contentHashCode()
        return result
    }
}

public data class MappingDataRange(
    public var dwStartIndex: UInt = 0u,
    public var dwEndIndex: UInt = 0u,
    public var pszDescription: Pwstr = null,
    public var dwDescriptionLength: UInt = 0u,
    public var pData: COpaquePointer? = null,
    public var dwDataSize: UInt = 0u,
    public var pszContentType: Pwstr = null,
    public var prgActionIds: Pwstr = null,
    public var dwActionsCount: UInt = 0u,
    public var prgActionDisplayNames: Pwstr = null,
)

public data class MappingEnumOptions(
    public var size: Int = 0,
    public var pszCategory: Pwstr = null,
    public var pszInputLanguage: Pwstr = null,
    public var pszOutputLanguage: Pwstr = null,
    public var pszInputScript: Pwstr = null,
    public var pszOutputScript: Pwstr = null,
    public var pszInputContentType: Pwstr = null,
    public var pszOutputContentType: Pwstr = null,
    public var pGuid: Guid? = null,
    public var bitfield: UInt = 0u,
)

public data class MappingOptions(
    public var size: Int = 0,
    public var pszInputLanguage: Pwstr = null,
    public var pszOutputLanguage: Pwstr = null,
    public var pszInputScript: Pwstr = null,
    public var pszOutputScript: Pwstr = null,
    public var pszInputContentType: Pwstr = null,
    public var pszOutputContentType: Pwstr = null,
    public var pszUILanguage: Pwstr = null,
    public var pfnRecognizeCallback: PfnMappingcallbackproc = null,
    public var pRecognizeCallerData: COpaquePointer? = null,
    public var dwRecognizeCallerDataSize: UInt = 0u,
    public var pfnActionCallback: PfnMappingcallbackproc = null,
    public var pActionCallerData: COpaquePointer? = null,
    public var dwActionCallerDataSize: UInt = 0u,
    public var dwServiceFlag: UInt = 0u,
    public var bitfield: UInt = 0u,
)

public data class MappingPropertyBag(
    public var size: Int = 0,
    public var prgResultRanges: MappingDataRange? = null,
    public var dwRangesCount: UInt = 0u,
    public var pServiceData: COpaquePointer? = null,
    public var dwServiceDataSize: UInt = 0u,
    public var pCallerData: COpaquePointer? = null,
    public var dwCallerDataSize: UInt = 0u,
    public var pContext: COpaquePointer? = null,
)

public class MappingServiceInfo(
    public var size: Int = 0,
    public var pszCopyright: Pwstr = null,
    public var wMajorVersion: UShort = 0u,
    public var wMinorVersion: UShort = 0u,
    public var wBuildVersion: UShort = 0u,
    public var wStepVersion: UShort = 0u,
    public var dwInputContentTypesCount: UInt = 0u,
    public var prgInputContentTypes: Pwstr = null,
    public var dwOutputContentTypesCount: UInt = 0u,
    public var prgOutputContentTypes: Pwstr = null,
    public var dwInputLanguagesCount: UInt = 0u,
    public var prgInputLanguages: Pwstr = null,
    public var dwOutputLanguagesCount: UInt = 0u,
    public var prgOutputLanguages: Pwstr = null,
    public var dwInputScriptsCount: UInt = 0u,
    public var prgInputScripts: Pwstr = null,
    public var dwOutputScriptsCount: UInt = 0u,
    public var prgOutputScripts: Pwstr = null,
    public var guid: Guid = Guid(),
    public var pszCategory: Pwstr = null,
    public var pszDescription: Pwstr = null,
    public var dwPrivateDataSize: UInt = 0u,
    public var pPrivateData: COpaquePointer? = null,
    public var pContext: COpaquePointer? = null,
    public var bitfield: UInt = 0u,
)

public data class Mimecpinfo(
    public var dwFlags: UInt = 0u,
    public var uiCodePage: UInt = 0u,
    public var uiFamilyCodePage: UInt = 0u,
    public var wszDescription: UShortArray = UShortArray(64),
    public var wszWebCharset: UShortArray = UShortArray(50),
    public var wszHeaderCharset: UShortArray = UShortArray(50),
    public var wszBodyCharset: UShortArray = UShortArray(50),
    public var wszFixedWidthFont: UShortArray = UShortArray(32),
    public var wszProportionalFont: UShortArray = UShortArray(32),
    public var bGDICharset: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mimecpinfo) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.uiCodePage != other.uiCodePage) return false
        if (this.uiFamilyCodePage != other.uiFamilyCodePage) return false
        if (!this.wszDescription.contentEquals(other.wszDescription)) return false
        if (!this.wszWebCharset.contentEquals(other.wszWebCharset)) return false
        if (!this.wszHeaderCharset.contentEquals(other.wszHeaderCharset)) return false
        if (!this.wszBodyCharset.contentEquals(other.wszBodyCharset)) return false
        if (!this.wszFixedWidthFont.contentEquals(other.wszFixedWidthFont)) return false
        if (!this.wszProportionalFont.contentEquals(other.wszProportionalFont)) return false
        if (this.bGDICharset != other.bGDICharset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.uiCodePage.hashCode()
        result = 31 * result + this.uiFamilyCodePage.hashCode()
        result = 31 * result + this.wszDescription.contentHashCode()
        result = 31 * result + this.wszWebCharset.contentHashCode()
        result = 31 * result + this.wszHeaderCharset.contentHashCode()
        result = 31 * result + this.wszBodyCharset.contentHashCode()
        result = 31 * result + this.wszFixedWidthFont.contentHashCode()
        result = 31 * result + this.wszProportionalFont.contentHashCode()
        result = 31 * result + this.bGDICharset.hashCode()
        return result
    }
}

public data class Mimecsetinfo(
    public var uiCodePage: UInt = 0u,
    public var uiInternetEncoding: UInt = 0u,
    public var wszCharset: UShortArray = UShortArray(50),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mimecsetinfo) return false
        if (this.uiCodePage != other.uiCodePage) return false
        if (this.uiInternetEncoding != other.uiInternetEncoding) return false
        if (!this.wszCharset.contentEquals(other.wszCharset)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uiCodePage.hashCode()
        result = 31 * result + this.uiInternetEncoding.hashCode()
        result = 31 * result + this.wszCharset.contentHashCode()
        return result
    }
}

public data class Newtextmetricexa(
    public var ntmTm: Newtextmetrica = Newtextmetrica(),
    public var ntmFontSig: Fontsignature = Fontsignature(),
)

public data class Newtextmetricexw(
    public var ntmTm: Newtextmetricw = Newtextmetricw(),
    public var ntmFontSig: Fontsignature = Fontsignature(),
)

public data class Nlsversioninfo(
    public var dwNLSVersionInfoSize: UInt = 0u,
    public var dwNLSVersion: UInt = 0u,
    public var dwDefinedVersion: UInt = 0u,
    public var dwEffectiveId: UInt = 0u,
    public var guidCustomVersion: Guid = Guid(),
)

public data class Nlsversioninfoex(
    public var dwNLSVersionInfoSize: UInt = 0u,
    public var dwNLSVersion: UInt = 0u,
    public var dwDefinedVersion: UInt = 0u,
    public var dwEffectiveId: UInt = 0u,
    public var guidCustomVersion: Guid = Guid(),
)

public data class Numberfmta(
    public var numDigits: UInt = 0u,
    public var leadingZero: UInt = 0u,
    public var grouping: UInt = 0u,
    public var lpDecimalSep: Pstr = null,
    public var lpThousandSep: Pstr = null,
    public var negativeOrder: UInt = 0u,
)

public data class Numberfmtw(
    public var numDigits: UInt = 0u,
    public var leadingZero: UInt = 0u,
    public var grouping: UInt = 0u,
    public var lpDecimalSep: Pwstr = null,
    public var lpThousandSep: Pwstr = null,
    public var negativeOrder: UInt = 0u,
)

public data class OpentypeFeatureRecord(
    public var tagFeature: UInt = 0u,
    public var lParameter: Int = 0,
)

public data class Rfc1766info(
    public var lcid: UInt = 0u,
    public var wszRfc1766: UShortArray = UShortArray(6),
    public var wszLocaleName: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rfc1766info) return false
        if (this.lcid != other.lcid) return false
        if (!this.wszRfc1766.contentEquals(other.wszRfc1766)) return false
        if (!this.wszLocaleName.contentEquals(other.wszLocaleName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lcid.hashCode()
        result = 31 * result + this.wszRfc1766.contentHashCode()
        result = 31 * result + this.wszLocaleName.contentHashCode()
        return result
    }
}

public data class Scriptfontinfo(
    public var scripts: Long = 0L,
    public var wszFont: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Scriptfontinfo) return false
        if (this.scripts != other.scripts) return false
        if (!this.wszFont.contentEquals(other.wszFont)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scripts.hashCode()
        result = 31 * result + this.wszFont.contentHashCode()
        return result
    }
}

public data class Scriptinfo(
    public var scriptId: UByte = 0u,
    public var uiCodePage: UInt = 0u,
    public var wszDescription: UShortArray = UShortArray(48),
    public var wszFixedWidthFont: UShortArray = UShortArray(32),
    public var wszProportionalFont: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Scriptinfo) return false
        if (this.scriptId != other.scriptId) return false
        if (this.uiCodePage != other.uiCodePage) return false
        if (!this.wszDescription.contentEquals(other.wszDescription)) return false
        if (!this.wszFixedWidthFont.contentEquals(other.wszFixedWidthFont)) return false
        if (!this.wszProportionalFont.contentEquals(other.wszProportionalFont)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scriptId.hashCode()
        result = 31 * result + this.uiCodePage.hashCode()
        result = 31 * result + this.wszDescription.contentHashCode()
        result = 31 * result + this.wszFixedWidthFont.contentHashCode()
        result = 31 * result + this.wszProportionalFont.contentHashCode()
        return result
    }
}

public data class ScriptAnalysis(
    public var bitfield: UShort = 0u,
    public var s: ScriptState = ScriptState(),
)

public data class ScriptCharprop(
    public var bitfield: UShort = 0u,
)

public data class ScriptControl(
    public var bitfield: UInt = 0u,
)

public data class ScriptDigitsubstitute(
    public var bitfield1: UInt = 0u,
    public var bitfield2: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class ScriptFontproperties(
    public var cBytes: Int = 0,
    public var wgBlank: UShort = 0u,
    public var wgDefault: UShort = 0u,
    public var wgInvalid: UShort = 0u,
    public var wgKashida: UShort = 0u,
    public var iKashidaWidth: Int = 0,
)

public data class ScriptGlyphprop(
    public var sva: ScriptVisattr = ScriptVisattr(),
    public var reserved: UShort = 0u,
)

public data class ScriptItem(
    public var iCharPos: Int = 0,
    public var a: ScriptAnalysis = ScriptAnalysis(),
)

public data class ScriptLogattr(
    public var bitfield: UByte = 0u,
)

public data class ScriptProperties(
    public var bitfield1: UInt = 0u,
    public var bitfield2: UInt = 0u,
)

public data class ScriptState(
    public var bitfield: UShort = 0u,
)

public data class ScriptTabdef(
    public var cTabStops: Int = 0,
    public var iScale: Int = 0,
    public var pTabStops: Int? = null,
    public var iTabOrigin: Int = 0,
)

public data class ScriptVisattr(
    public var bitfield: UShort = 0u,
)

public data class TextrangeProperties(
    public var potfRecords: OpentypeFeatureRecord? = null,
    public var cotfRecords: Int = 0,
)

public data class UCPTrie(
    public var index: COpaquePointer? = null,
    public var data: UCPTrieData = UCPTrieData(),
    public var indexLength: Int = 0,
    public var dataLength: Int = 0,
    public var highStart: Int = 0,
    public var shifted12HighStart: UShort = 0u,
    public var type: Byte = 0,
    public var valueWidth: Byte = 0,
    public var reserved32: UInt = 0u,
    public var reserved16: UShort = 0u,
    public var index3NullOffset: UShort = 0u,
    public var dataNullOffset: Int = 0,
    public var nullValue: UInt = 0u,
)

public data class UCPTrieData(
    public var ptr0: COpaquePointer? = null,
    public var ptr16: COpaquePointer? = null,
    public var ptr32: UInt? = null,
    public var ptr8: COpaquePointer? = null,
)

public data class UCharIterator(
    public var context: COpaquePointer? = null,
    public var length: Int = 0,
    public var start: Int = 0,
    public var index: Int = 0,
    public var limit: Int = 0,
    public var reservedField: Int = 0,
    public var getIndex: UCharIteratorGetIndex = null,
    public var move: UCharIteratorMove = null,
    public var hasNext: UCharIteratorHasNext = null,
    public var hasPrevious: UCharIteratorHasPrevious = null,
    public var current: UCharIteratorCurrent = null,
    public var next: UCharIteratorNext = null,
    public var previous: UCharIteratorPrevious = null,
    public var reservedFn: UCharIteratorReserved = null,
    public var getState: UCharIteratorGetState = null,
    public var setState: UCharIteratorSetState = null,
)

public data class UConverterFromUnicodeArgs(
    public var size: UShort = 0u,
    public var flush: Byte = 0,
    public var converter: Int? = null,
    public var source: COpaquePointer? = null,
    public var sourceLimit: COpaquePointer? = null,
    public var target: Pstr = null,
    public var targetLimit: Pcstr = null,
    public var offsets: Int? = null,
)

public data class UConverterToUnicodeArgs(
    public var size: UShort = 0u,
    public var flush: Byte = 0,
    public var converter: Int? = null,
    public var source: Pcstr = null,
    public var sourceLimit: Pcstr = null,
    public var target: COpaquePointer? = null,
    public var targetLimit: COpaquePointer? = null,
    public var offsets: Int? = null,
)

public data class UFieldPosition(
    public var field: Int = 0,
    public var beginIndex: Int = 0,
    public var endIndex: Int = 0,
)

public data class UIDNAInfo(
    public var size: Short = 0,
    public var isTransitionalDifferent: Byte = 0,
    public var reservedB3: Byte = 0,
    public var errors: UInt = 0u,
    public var reservedI2: Int = 0,
    public var reservedI3: Int = 0,
)

public data class Unicoderange(
    public var wcFrom: UShort = 0u,
    public var wcTo: UShort = 0u,
)

public data class UParseError(
    public var line: Int = 0,
    public var offset: Int = 0,
    public var preContext: UShortArray = UShortArray(16),
    public var postContext: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UParseError) return false
        if (this.line != other.line) return false
        if (this.offset != other.offset) return false
        if (!this.preContext.contentEquals(other.preContext)) return false
        if (!this.postContext.contentEquals(other.postContext)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.line.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.preContext.contentHashCode()
        result = 31 * result + this.postContext.contentHashCode()
        return result
    }
}

public data class UReplaceableCallbacks(
    public var length: Int = 0,
    public var charAt: Int = 0,
    public var char32At: Int = 0,
    public var replace: Int = 0,
    public var extract: Int = 0,
    public var copy: Int = 0,
)

public data class USerializedSet(
    public var array: COpaquePointer? = null,
    public var bmpLength: Int = 0,
    public var length: Int = 0,
    public var staticArray: UShortArray = UShortArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USerializedSet) return false
        if (this.array != other.array) return false
        if (this.bmpLength != other.bmpLength) return false
        if (this.length != other.length) return false
        if (!this.staticArray.contentEquals(other.staticArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.array.hashCode()
        result = 31 * result + this.bmpLength.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.staticArray.contentHashCode()
        return result
    }
}

public class UText(
    public var magic: UInt = 0u,
    public var flags: Int = 0,
    public var providerProperties: Int = 0,
    public var sizeOfStruct: Int = 0,
    public var chunkNativeLimit: Long = 0L,
    public var extraSize: Int = 0,
    public var nativeIndexingLimit: Int = 0,
    public var chunkNativeStart: Long = 0L,
    public var chunkOffset: Int = 0,
    public var chunkLength: Int = 0,
    public var chunkContents: COpaquePointer? = null,
    public var pFuncs: UTextFuncs? = null,
    public var pExtra: COpaquePointer? = null,
    public var context: COpaquePointer? = null,
    public var p: COpaquePointer? = null,
    public var q: COpaquePointer? = null,
    public var r: COpaquePointer? = null,
    public var privP: COpaquePointer? = null,
    public var a: Long = 0L,
    public var b: Int = 0,
    public var c: Int = 0,
    public var privA: Long = 0L,
    public var privB: Int = 0,
    public var privC: Int = 0,
)

public data class UTextFuncs(
    public var tableSize: Int = 0,
    public var reserved1: Int = 0,
    public var reserved2: Int = 0,
    public var reserved3: Int = 0,
    public var clone: UTextClone = null,
    public var nativeLength: UTextNativeLength = null,
    public var access: UTextAccess = null,
    public var extract: UTextExtract = null,
    public var replace: UTextReplace = null,
    public var copy: UTextCopy = null,
    public var mapOffsetToNative: UTextMapOffsetToNative = null,
    public var mapNativeIndexToUTF16: UTextMapNativeIndexToUTF16 = null,
    public var close: UTextClose = null,
    public var spare1: UTextClose = null,
    public var spare2: UTextClose = null,
    public var spare3: UTextClose = null,
)

public data class UTransPosition(
    public var contextStart: Int = 0,
    public var contextLimit: Int = 0,
    public var start: Int = 0,
    public var limit: Int = 0,
)
