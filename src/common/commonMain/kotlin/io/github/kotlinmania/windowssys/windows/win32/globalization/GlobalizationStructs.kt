@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.globalization

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class CALDATETIME(
    public var CalId: UInt = 0u,
    public var Era: UInt = 0u,
    public var Year: UInt = 0u,
    public var Month: UInt = 0u,
    public var Day: UInt = 0u,
    public var DayOfWeek: UInt = 0u,
    public var Hour: UInt = 0u,
    public var Minute: UInt = 0u,
    public var Second: UInt = 0u,
    public var Tick: UInt = 0u,
)

public data class CHARSETINFO(
    public var ciCharset: UInt = 0u,
    public var ciACP: UInt = 0u,
    public var fs: FONTSIGNATURE = FONTSIGNATURE(),
)

public data class CPINFO(
    public var MaxCharSize: UInt = 0u,
    public var DefaultChar: UByteArray = UByteArray(2),
    public var LeadByte: UByteArray = UByteArray(12),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CPINFO) return false
        if (this.MaxCharSize != other.MaxCharSize) return false
        if (!this.DefaultChar.contentEquals(other.DefaultChar)) return false
        if (!this.LeadByte.contentEquals(other.LeadByte)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MaxCharSize.hashCode()
        result = 31 * result + this.DefaultChar.contentHashCode()
        result = 31 * result + this.LeadByte.contentHashCode()
        return result
    }
}

public data class CPINFOEXA(
    public var MaxCharSize: UInt = 0u,
    public var DefaultChar: UByteArray = UByteArray(2),
    public var LeadByte: UByteArray = UByteArray(12),
    public var UnicodeDefaultChar: UShort = 0u,
    public var CodePage: UInt = 0u,
    public var CodePageName: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CPINFOEXA) return false
        if (this.MaxCharSize != other.MaxCharSize) return false
        if (!this.DefaultChar.contentEquals(other.DefaultChar)) return false
        if (!this.LeadByte.contentEquals(other.LeadByte)) return false
        if (this.UnicodeDefaultChar != other.UnicodeDefaultChar) return false
        if (this.CodePage != other.CodePage) return false
        if (!this.CodePageName.contentEquals(other.CodePageName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MaxCharSize.hashCode()
        result = 31 * result + this.DefaultChar.contentHashCode()
        result = 31 * result + this.LeadByte.contentHashCode()
        result = 31 * result + this.UnicodeDefaultChar.hashCode()
        result = 31 * result + this.CodePage.hashCode()
        result = 31 * result + this.CodePageName.contentHashCode()
        return result
    }
}

public data class CPINFOEXW(
    public var MaxCharSize: UInt = 0u,
    public var DefaultChar: UByteArray = UByteArray(2),
    public var LeadByte: UByteArray = UByteArray(12),
    public var UnicodeDefaultChar: UShort = 0u,
    public var CodePage: UInt = 0u,
    public var CodePageName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CPINFOEXW) return false
        if (this.MaxCharSize != other.MaxCharSize) return false
        if (!this.DefaultChar.contentEquals(other.DefaultChar)) return false
        if (!this.LeadByte.contentEquals(other.LeadByte)) return false
        if (this.UnicodeDefaultChar != other.UnicodeDefaultChar) return false
        if (this.CodePage != other.CodePage) return false
        if (!this.CodePageName.contentEquals(other.CodePageName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MaxCharSize.hashCode()
        result = 31 * result + this.DefaultChar.contentHashCode()
        result = 31 * result + this.LeadByte.contentHashCode()
        result = 31 * result + this.UnicodeDefaultChar.hashCode()
        result = 31 * result + this.CodePage.hashCode()
        result = 31 * result + this.CodePageName.contentHashCode()
        return result
    }
}

public data class CURRENCYFMTA(
    public var NumDigits: UInt = 0u,
    public var LeadingZero: UInt = 0u,
    public var Grouping: UInt = 0u,
    public var lpDecimalSep: PSTR = 0L,
    public var lpThousandSep: PSTR = 0L,
    public var NegativeOrder: UInt = 0u,
    public var PositiveOrder: UInt = 0u,
    public var lpCurrencySymbol: PSTR = 0L,
)

public data class CURRENCYFMTW(
    public var NumDigits: UInt = 0u,
    public var LeadingZero: UInt = 0u,
    public var Grouping: UInt = 0u,
    public var lpDecimalSep: PWSTR = 0L,
    public var lpThousandSep: PWSTR = 0L,
    public var NegativeOrder: UInt = 0u,
    public var PositiveOrder: UInt = 0u,
    public var lpCurrencySymbol: PWSTR = 0L,
)

public data class DetectEncodingInfo(
    public var nLangID: UInt = 0u,
    public var nCodePage: UInt = 0u,
    public var nDocPercent: Int = 0,
    public var nConfidence: Int = 0,
)

public data class ENUMTEXTMETRICA(public var etmNewTextMetricEx: NEWTEXTMETRICEXA = NEWTEXTMETRICEXA(), public var etmAxesList: Graphics.Gdi.AXESLISTA = Graphics.Gdi.AXESLISTA())

public data class ENUMTEXTMETRICW(public var etmNewTextMetricEx: NEWTEXTMETRICEXW = NEWTEXTMETRICEXW(), public var etmAxesList: Graphics.Gdi.AXESLISTW = Graphics.Gdi.AXESLISTW())

public data class FILEMUIINFO(
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
        if (other !is FILEMUIINFO) return false
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

public data class FONTSIGNATURE(public var fsUsb: UIntArray = UIntArray(4), public var fsCsb: UIntArray = UIntArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FONTSIGNATURE) return false
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

public data class GOFFSET(public var du: Int = 0, public var dv: Int = 0)

public data class LOCALESIGNATURE(
    public var lsUsb: UIntArray = UIntArray(4),
    public var lsCsbDefault: UIntArray = UIntArray(2),
    public var lsCsbSupported: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LOCALESIGNATURE) return false
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

public data class MAPPING_DATA_RANGE(
    public var dwStartIndex: UInt = 0u,
    public var dwEndIndex: UInt = 0u,
    public var pszDescription: PWSTR = 0L,
    public var dwDescriptionLength: UInt = 0u,
    public var pData: Long = 0L,
    public var dwDataSize: UInt = 0u,
    public var pszContentType: PWSTR = 0L,
    public var prgActionIds: Long = 0L,
    public var dwActionsCount: UInt = 0u,
    public var prgActionDisplayNames: Long = 0L,
)

public data class MAPPING_ENUM_OPTIONS(
    public var Size: ULong = 0uL,
    public var pszCategory: PWSTR = 0L,
    public var pszInputLanguage: PWSTR = 0L,
    public var pszOutputLanguage: PWSTR = 0L,
    public var pszInputScript: PWSTR = 0L,
    public var pszOutputScript: PWSTR = 0L,
    public var pszInputContentType: PWSTR = 0L,
    public var pszOutputContentType: PWSTR = 0L,
    public var pGuid: Long = 0L,
    public var _bitfield: UInt = 0u,
)

public data class MAPPING_OPTIONS(
    public var Size: ULong = 0uL,
    public var pszInputLanguage: PWSTR = 0L,
    public var pszOutputLanguage: PWSTR = 0L,
    public var pszInputScript: PWSTR = 0L,
    public var pszOutputScript: PWSTR = 0L,
    public var pszInputContentType: PWSTR = 0L,
    public var pszOutputContentType: PWSTR = 0L,
    public var pszUILanguage: PWSTR = 0L,
    public var pfnRecognizeCallback: PFN_MAPPINGCALLBACKPROC = null,
    public var pRecognizeCallerData: Long = 0L,
    public var dwRecognizeCallerDataSize: UInt = 0u,
    public var pfnActionCallback: PFN_MAPPINGCALLBACKPROC = null,
    public var pActionCallerData: Long = 0L,
    public var dwActionCallerDataSize: UInt = 0u,
    public var dwServiceFlag: UInt = 0u,
    public var _bitfield: UInt = 0u,
)

public data class MAPPING_PROPERTY_BAG(
    public var Size: ULong = 0uL,
    public var prgResultRanges: Long = 0L,
    public var dwRangesCount: UInt = 0u,
    public var pServiceData: Long = 0L,
    public var dwServiceDataSize: UInt = 0u,
    public var pCallerData: Long = 0L,
    public var dwCallerDataSize: UInt = 0u,
    public var pContext: Long = 0L,
)

public class MAPPING_SERVICE_INFO(
    public var Size: ULong = 0uL,
    public var pszCopyright: PWSTR = 0L,
    public var wMajorVersion: UShort = 0u,
    public var wMinorVersion: UShort = 0u,
    public var wBuildVersion: UShort = 0u,
    public var wStepVersion: UShort = 0u,
    public var dwInputContentTypesCount: UInt = 0u,
    public var prgInputContentTypes: Long = 0L,
    public var dwOutputContentTypesCount: UInt = 0u,
    public var prgOutputContentTypes: Long = 0L,
    public var dwInputLanguagesCount: UInt = 0u,
    public var prgInputLanguages: Long = 0L,
    public var dwOutputLanguagesCount: UInt = 0u,
    public var prgOutputLanguages: Long = 0L,
    public var dwInputScriptsCount: UInt = 0u,
    public var prgInputScripts: Long = 0L,
    public var dwOutputScriptsCount: UInt = 0u,
    public var prgOutputScripts: Long = 0L,
    public var guid: GUID = GUID(),
    public var pszCategory: PWSTR = 0L,
    public var pszDescription: PWSTR = 0L,
    public var dwPrivateDataSize: UInt = 0u,
    public var pPrivateData: Long = 0L,
    public var pContext: Long = 0L,
    public var _bitfield: UInt = 0u,
)

public data class MIMECPINFO(
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
        if (other !is MIMECPINFO) return false
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

public data class MIMECSETINFO(
    public var uiCodePage: UInt = 0u,
    public var uiInternetEncoding: UInt = 0u,
    public var wszCharset: UShortArray = UShortArray(50),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIMECSETINFO) return false
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

public data class NEWTEXTMETRICEXA(public var ntmTm: Graphics.Gdi.NEWTEXTMETRICA = Graphics.Gdi.NEWTEXTMETRICA(), public var ntmFontSig: FONTSIGNATURE = FONTSIGNATURE())

public data class NEWTEXTMETRICEXW(public var ntmTm: Graphics.Gdi.NEWTEXTMETRICW = Graphics.Gdi.NEWTEXTMETRICW(), public var ntmFontSig: FONTSIGNATURE = FONTSIGNATURE())

public data class NLSVERSIONINFO(
    public var dwNLSVersionInfoSize: UInt = 0u,
    public var dwNLSVersion: UInt = 0u,
    public var dwDefinedVersion: UInt = 0u,
    public var dwEffectiveId: UInt = 0u,
    public var guidCustomVersion: GUID = GUID(),
)

public data class NLSVERSIONINFOEX(
    public var dwNLSVersionInfoSize: UInt = 0u,
    public var dwNLSVersion: UInt = 0u,
    public var dwDefinedVersion: UInt = 0u,
    public var dwEffectiveId: UInt = 0u,
    public var guidCustomVersion: GUID = GUID(),
)

public data class NUMBERFMTA(
    public var NumDigits: UInt = 0u,
    public var LeadingZero: UInt = 0u,
    public var Grouping: UInt = 0u,
    public var lpDecimalSep: PSTR = 0L,
    public var lpThousandSep: PSTR = 0L,
    public var NegativeOrder: UInt = 0u,
)

public data class NUMBERFMTW(
    public var NumDigits: UInt = 0u,
    public var LeadingZero: UInt = 0u,
    public var Grouping: UInt = 0u,
    public var lpDecimalSep: PWSTR = 0L,
    public var lpThousandSep: PWSTR = 0L,
    public var NegativeOrder: UInt = 0u,
)

public data class OPENTYPE_FEATURE_RECORD(public var tagFeature: UInt = 0u, public var lParameter: Int = 0)

public data class RFC1766INFO(
    public var lcid: UInt = 0u,
    public var wszRfc1766: UShortArray = UShortArray(6),
    public var wszLocaleName: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RFC1766INFO) return false
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

public data class SCRIPTFONTINFO(public var scripts: Long = 0L, public var wszFont: UShortArray = UShortArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCRIPTFONTINFO) return false
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

public data class SCRIPTINFO(
    public var ScriptId: UByte = 0u,
    public var uiCodePage: UInt = 0u,
    public var wszDescription: UShortArray = UShortArray(48),
    public var wszFixedWidthFont: UShortArray = UShortArray(32),
    public var wszProportionalFont: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCRIPTINFO) return false
        if (this.ScriptId != other.ScriptId) return false
        if (this.uiCodePage != other.uiCodePage) return false
        if (!this.wszDescription.contentEquals(other.wszDescription)) return false
        if (!this.wszFixedWidthFont.contentEquals(other.wszFixedWidthFont)) return false
        if (!this.wszProportionalFont.contentEquals(other.wszProportionalFont)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ScriptId.hashCode()
        result = 31 * result + this.uiCodePage.hashCode()
        result = 31 * result + this.wszDescription.contentHashCode()
        result = 31 * result + this.wszFixedWidthFont.contentHashCode()
        result = 31 * result + this.wszProportionalFont.contentHashCode()
        return result
    }
}

public data class SCRIPT_ANALYSIS(public var _bitfield: UShort = 0u, public var s: SCRIPT_STATE = SCRIPT_STATE())

public data class SCRIPT_CHARPROP(public var _bitfield: UShort = 0u)

public data class SCRIPT_CONTROL(public var _bitfield: UInt = 0u)

public data class SCRIPT_DIGITSUBSTITUTE(
    public var _bitfield1: UInt = 0u,
    public var _bitfield2: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class SCRIPT_FONTPROPERTIES(
    public var cBytes: Int = 0,
    public var wgBlank: UShort = 0u,
    public var wgDefault: UShort = 0u,
    public var wgInvalid: UShort = 0u,
    public var wgKashida: UShort = 0u,
    public var iKashidaWidth: Int = 0,
)

public data class SCRIPT_GLYPHPROP(public var sva: SCRIPT_VISATTR = SCRIPT_VISATTR(), public var reserved: UShort = 0u)

public data class SCRIPT_ITEM(public var iCharPos: Int = 0, public var a: SCRIPT_ANALYSIS = SCRIPT_ANALYSIS())

public data class SCRIPT_LOGATTR(public var _bitfield: UByte = 0u)

public data class SCRIPT_PROPERTIES(public var _bitfield1: UInt = 0u, public var _bitfield2: UInt = 0u)

public data class SCRIPT_STATE(public var _bitfield: UShort = 0u)

public data class SCRIPT_TABDEF(
    public var cTabStops: Int = 0,
    public var iScale: Int = 0,
    public var pTabStops: Long = 0L,
    public var iTabOrigin: Int = 0,
)

public data class SCRIPT_VISATTR(public var _bitfield: UShort = 0u)

public data class TEXTRANGE_PROPERTIES(public var potfRecords: Long = 0L, public var cotfRecords: Int = 0)

public data class UCPTrie(
    public var index: Long = 0L,
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
    public var ptr0: Long = 0L,
    public var ptr16: Long = 0L,
    public var ptr32: Long = 0L,
    public var ptr8: Long = 0L,
)

public data class UCharIterator(
    public var context: Long = 0L,
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
    public var converter: Long = 0L,
    public var source: Long = 0L,
    public var sourceLimit: Long = 0L,
    public var target: PSTR = 0L,
    public var targetLimit: PCSTR = 0L,
    public var offsets: Long = 0L,
)

public data class UConverterToUnicodeArgs(
    public var size: UShort = 0u,
    public var flush: Byte = 0,
    public var converter: Long = 0L,
    public var source: PCSTR = 0L,
    public var sourceLimit: PCSTR = 0L,
    public var target: Long = 0L,
    public var targetLimit: Long = 0L,
    public var offsets: Long = 0L,
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

public data class UNICODERANGE(public var wcFrom: UShort = 0u, public var wcTo: UShort = 0u)

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
    public var length: Long = 0L,
    public var charAt: Long = 0L,
    public var char32At: Long = 0L,
    public var replace: Long = 0L,
    public var extract: Long = 0L,
    public var copy: Long = 0L,
)

public data class USerializedSet(
    public var array: Long = 0L,
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
    public var chunkContents: Long = 0L,
    public var pFuncs: Long = 0L,
    public var pExtra: Long = 0L,
    public var context: Long = 0L,
    public var p: Long = 0L,
    public var q: Long = 0L,
    public var r: Long = 0L,
    public var privP: Long = 0L,
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
