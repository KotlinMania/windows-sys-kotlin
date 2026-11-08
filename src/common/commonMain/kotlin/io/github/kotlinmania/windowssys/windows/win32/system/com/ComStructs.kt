@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HENHMETAFILE
import io.github.kotlinmania.windowssys.windows.win32.security.SECURITY_ATTRIBUTES
import io.github.kotlinmania.windowssys.windows.win32.system.ole.PARAMDESC
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARENUM
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARIANT

public data class AUTHENTICATEINFO(public var dwFlags: UInt = 0u, public var dwReserved: UInt = 0u)

public data class BINDINFO(
    public var cbSize: UInt = 0u,
    public var szExtraInfo: PWSTR = 0L,
    public var stgmedData: STGMEDIUM = STGMEDIUM(),
    public var grfBindInfoF: UInt = 0u,
    public var dwBindVerb: UInt = 0u,
    public var szCustomVerb: PWSTR = 0L,
    public var cbstgmedData: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwOptionsFlags: UInt = 0u,
    public var dwCodePage: UInt = 0u,
    public var securityAttributes: SECURITY_ATTRIBUTES = SECURITY_ATTRIBUTES(),
    public var iid: GUID = GUID(),
    public var pUnk: Long = 0L,
    public var dwReserved: UInt = 0u,
)

public data class BINDPTR(
    public var lpfuncdesc: Long = 0L,
    public var lpvardesc: Long = 0L,
    public var lptcomp: Long = 0L,
)

public data class BIND_OPTS(
    public var cbStruct: UInt = 0u,
    public var grfFlags: UInt = 0u,
    public var grfMode: UInt = 0u,
    public var dwTickCountDeadline: UInt = 0u,
)

public data class BIND_OPTS2(
    public var Base: BIND_OPTS = BIND_OPTS(),
    public var dwTrackFlags: UInt = 0u,
    public var dwClassContext: UInt = 0u,
    public var locale: UInt = 0u,
    public var pServerInfo: Long = 0L,
)

public data class BIND_OPTS3(public var Base: BIND_OPTS2 = BIND_OPTS2(), public var hwnd: HWND = 0L)

public data class BLOB(public var cbSize: UInt = 0u, public var pBlobData: Long = 0L)

public data class BYTE_BLOB(public var clSize: UInt = 0u, public var abData: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BYTE_BLOB) return false
        if (this.clSize != other.clSize) return false
        if (!this.abData.contentEquals(other.abData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clSize.hashCode()
        result = 31 * result + this.abData.contentHashCode()
        return result
    }
}

public data class BYTE_SIZEDARR(public var clSize: UInt = 0u, public var pData: Long = 0L)

public data class CATEGORYINFO(
    public var catid: GUID = GUID(),
    public var lcid: UInt = 0u,
    public var szDescription: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CATEGORYINFO) return false
        if (this.catid != other.catid) return false
        if (this.lcid != other.lcid) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.catid.hashCode()
        result = 31 * result + this.lcid.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }
}

public data class COAUTHIDENTITY(
    public var User: Long = 0L,
    public var UserLength: UInt = 0u,
    public var Domain: Long = 0L,
    public var DomainLength: UInt = 0u,
    public var Password: Long = 0L,
    public var PasswordLength: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class COAUTHINFO(
    public var dwAuthnSvc: UInt = 0u,
    public var dwAuthzSvc: UInt = 0u,
    public var pwszServerPrincName: PWSTR = 0L,
    public var dwAuthnLevel: UInt = 0u,
    public var dwImpersonationLevel: UInt = 0u,
    public var pAuthIdentityData: Long = 0L,
    public var dwCapabilities: UInt = 0u,
)

public data class CONNECTDATA(public var pUnk: Long = 0L, public var dwCookie: UInt = 0u)

public data class COSERVERINFO(
    public var dwReserved1: UInt = 0u,
    public var pwszName: PWSTR = 0L,
    public var pAuthInfo: Long = 0L,
    public var dwReserved2: UInt = 0u,
)

public data class CSPLATFORM(
    public var dwPlatformId: UInt = 0u,
    public var dwVersionHi: UInt = 0u,
    public var dwVersionLo: UInt = 0u,
    public var dwProcessorArch: UInt = 0u,
)

public data class CUSTDATA(public var cCustData: UInt = 0u, public var prgCustData: Long = 0L)

public data class CUSTDATAITEM(public var guid: GUID = GUID(), public var varValue: VARIANT = VARIANT())

public data class CY(public var Anonymous: CY_0 = CY_0(), public var int64: Long = 0L)

public data class CY_0(public var Lo: UInt = 0u, public var Hi: Int = 0)

public data class ComCallData(
    public var dwDispid: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var pUserDefined: Long = 0L,
)

public data class ContextProperty(
    public var policyId: GUID = GUID(),
    public var flags: UInt = 0u,
    public var pUnk: Long = 0L,
)

public data class DISPPARAMS(
    public var rgvarg: Long = 0L,
    public var rgdispidNamedArgs: Long = 0L,
    public var cArgs: UInt = 0u,
    public var cNamedArgs: UInt = 0u,
)

public data class DVTARGETDEVICE(
    public var tdSize: UInt = 0u,
    public var tdDriverNameOffset: UShort = 0u,
    public var tdDeviceNameOffset: UShort = 0u,
    public var tdPortNameOffset: UShort = 0u,
    public var tdExtDevmodeOffset: UShort = 0u,
    public var tdData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DVTARGETDEVICE) return false
        if (this.tdSize != other.tdSize) return false
        if (this.tdDriverNameOffset != other.tdDriverNameOffset) return false
        if (this.tdDeviceNameOffset != other.tdDeviceNameOffset) return false
        if (this.tdPortNameOffset != other.tdPortNameOffset) return false
        if (this.tdExtDevmodeOffset != other.tdExtDevmodeOffset) return false
        if (!this.tdData.contentEquals(other.tdData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tdSize.hashCode()
        result = 31 * result + this.tdDriverNameOffset.hashCode()
        result = 31 * result + this.tdDeviceNameOffset.hashCode()
        result = 31 * result + this.tdPortNameOffset.hashCode()
        result = 31 * result + this.tdExtDevmodeOffset.hashCode()
        result = 31 * result + this.tdData.contentHashCode()
        return result
    }
}

public data class DWORD_BLOB(public var clSize: UInt = 0u, public var alData: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DWORD_BLOB) return false
        if (this.clSize != other.clSize) return false
        if (!this.alData.contentEquals(other.alData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clSize.hashCode()
        result = 31 * result + this.alData.contentHashCode()
        return result
    }
}

public data class DWORD_SIZEDARR(public var clSize: UInt = 0u, public var pData: Long = 0L)

public data class ELEMDESC(public var tdesc: TYPEDESC = TYPEDESC(), public var Anonymous: ELEMDESC_0 = ELEMDESC_0())

public data class ELEMDESC_0(public var idldesc: IDLDESC = IDLDESC(), public var paramdesc: PARAMDESC = PARAMDESC())

public data class EXCEPINFO(
    public var wCode: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var bstrSource: BSTR = 0L,
    public var bstrDescription: BSTR = 0L,
    public var bstrHelpFile: BSTR = 0L,
    public var dwHelpContext: UInt = 0u,
    public var pvReserved: Long = 0L,
    public var pfnDeferredFillIn: LPEXCEPFINO_DEFERRED_FILLIN = null,
    public var scode: Int = 0,
)

public data class FLAGGED_BYTE_BLOB(
    public var fFlags: UInt = 0u,
    public var clSize: UInt = 0u,
    public var abData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FLAGGED_BYTE_BLOB) return false
        if (this.fFlags != other.fFlags) return false
        if (this.clSize != other.clSize) return false
        if (!this.abData.contentEquals(other.abData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fFlags.hashCode()
        result = 31 * result + this.clSize.hashCode()
        result = 31 * result + this.abData.contentHashCode()
        return result
    }
}

public data class FLAGGED_WORD_BLOB(
    public var fFlags: UInt = 0u,
    public var clSize: UInt = 0u,
    public var asData: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FLAGGED_WORD_BLOB) return false
        if (this.fFlags != other.fFlags) return false
        if (this.clSize != other.clSize) return false
        if (!this.asData.contentEquals(other.asData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fFlags.hashCode()
        result = 31 * result + this.clSize.hashCode()
        result = 31 * result + this.asData.contentHashCode()
        return result
    }
}

public data class FLAG_STGMEDIUM(
    public var ContextFlags: Int = 0,
    public var fPassOwnership: Int = 0,
    public var Stgmed: STGMEDIUM = STGMEDIUM(),
)

public data class FORMATETC(
    public var cfFormat: UShort = 0u,
    public var ptd: Long = 0L,
    public var dwAspect: UInt = 0u,
    public var lindex: Int = 0,
    public var tymed: UInt = 0u,
)

public data class FUNCDESC(
    public var memid: Int = 0,
    public var lprgscode: Long = 0L,
    public var lprgelemdescParam: Long = 0L,
    public var funckind: FUNCKIND = 0,
    public var invkind: INVOKEKIND = 0,
    public var callconv: CALLCONV = 0,
    public var cParams: Short = 0,
    public var cParamsOpt: Short = 0,
    public var oVft: Short = 0,
    public var cScodes: Short = 0,
    public var elemdescFunc: ELEMDESC = ELEMDESC(),
    public var wFuncFlags: FUNCFLAGS = 0u,
)

public data class GDI_OBJECT(public var ObjectType: UInt = 0u, public var u: GDI_OBJECT_0 = GDI_OBJECT_0())

public data class GDI_OBJECT_0(
    public var hBitmap: Long = 0L,
    public var hPalette: Long = 0L,
    public var hGeneric: Long = 0L,
)

public data class HYPER_SIZEDARR(public var clSize: UInt = 0u, public var pData: Long = 0L)

public data class IDLDESC(public var dwReserved: ULong = 0uL, public var wIDLFlags: IDLFLAGS = 0u)

public data class INTERFACEINFO(
    public var pUnk: Long = 0L,
    public var iid: GUID = GUID(),
    public var wMethod: UShort = 0u,
)

public data class MULTI_QI(
    public var pIID: Long = 0L,
    public var pItf: Long = 0L,
    public var hr: HRESULT = 0,
)

public data class QUERYCONTEXT(
    public var dwContext: UInt = 0u,
    public var Platform: CSPLATFORM = CSPLATFORM(),
    public var Locale: UInt = 0u,
    public var dwVersionHi: UInt = 0u,
    public var dwVersionLo: UInt = 0u,
)

public data class RPCOLEMESSAGE(
    public var reserved1: Long = 0L,
    public var dataRepresentation: UInt = 0u,
    public var Buffer: Long = 0L,
    public var cbBuffer: UInt = 0u,
    public var iMethod: UInt = 0u,
    public var reserved2: LongArray = LongArray(5),
    public var rpcFlags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RPCOLEMESSAGE) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.dataRepresentation != other.dataRepresentation) return false
        if (this.Buffer != other.Buffer) return false
        if (this.cbBuffer != other.cbBuffer) return false
        if (this.iMethod != other.iMethod) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (this.rpcFlags != other.rpcFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.dataRepresentation.hashCode()
        result = 31 * result + this.Buffer.hashCode()
        result = 31 * result + this.cbBuffer.hashCode()
        result = 31 * result + this.iMethod.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.rpcFlags.hashCode()
        return result
    }
}

public data class RemSTGMEDIUM(
    public var tymed: UInt = 0u,
    public var dwHandleType: UInt = 0u,
    public var pData: UInt = 0u,
    public var pUnkForRelease: UInt = 0u,
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RemSTGMEDIUM) return false
        if (this.tymed != other.tymed) return false
        if (this.dwHandleType != other.dwHandleType) return false
        if (this.pData != other.pData) return false
        if (this.pUnkForRelease != other.pUnkForRelease) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tymed.hashCode()
        result = 31 * result + this.dwHandleType.hashCode()
        result = 31 * result + this.pData.hashCode()
        result = 31 * result + this.pUnkForRelease.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class SAFEARRAY(
    public var cDims: UShort = 0u,
    public var fFeatures: ADVANCED_FEATURE_FLAGS = 0u,
    public var cbElements: UInt = 0u,
    public var cLocks: UInt = 0u,
    public var pvData: Long = 0L,
    public var rgsabound: List<SAFEARRAYBOUND> = List(1) { SAFEARRAYBOUND() },
)

public data class SAFEARRAYBOUND(public var cElements: UInt = 0u, public var lLbound: Int = 0)

public data class SChannelHookCallInfo(
    public var iid: GUID = GUID(),
    public var cbSize: UInt = 0u,
    public var uCausality: GUID = GUID(),
    public var dwServerPid: UInt = 0u,
    public var iMethod: UInt = 0u,
    public var pObject: Long = 0L,
)

public data class SOLE_AUTHENTICATION_INFO(
    public var dwAuthnSvc: UInt = 0u,
    public var dwAuthzSvc: UInt = 0u,
    public var pAuthInfo: Long = 0L,
)

public data class SOLE_AUTHENTICATION_LIST(public var cAuthInfo: UInt = 0u, public var aAuthInfo: Long = 0L)

public data class SOLE_AUTHENTICATION_SERVICE(
    public var dwAuthnSvc: UInt = 0u,
    public var dwAuthzSvc: UInt = 0u,
    public var pPrincipalName: PWSTR = 0L,
    public var hr: HRESULT = 0,
)

public data class STATDATA(
    public var formatetc: FORMATETC = FORMATETC(),
    public var advf: UInt = 0u,
    public var pAdvSink: Long = 0L,
    public var dwConnection: UInt = 0u,
)

public data class STATSTG(
    public var pwcsName: PWSTR = 0L,
    public var type: UInt = 0u,
    public var cbSize: ULong = 0uL,
    public var mtime: FILETIME = FILETIME(),
    public var ctime: FILETIME = FILETIME(),
    public var atime: FILETIME = FILETIME(),
    public var grfMode: STGM = 0u,
    public var grfLocksSupported: UInt = 0u,
    public var clsid: GUID = GUID(),
    public var grfStateBits: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class STGMEDIUM(
    public var tymed: UInt = 0u,
    public var u: STGMEDIUM_0 = STGMEDIUM_0(),
    public var pUnkForRelease: Long = 0L,
)

public data class STGMEDIUM_0(
    public var hBitmap: HBITMAP = 0L,
    public var hMetaFilePict: Long = 0L,
    public var hEnhMetaFile: HENHMETAFILE = 0L,
    public var hGlobal: HGLOBAL = 0L,
    public var lpszFileName: PWSTR = 0L,
    public var pstm: Long = 0L,
    public var pstg: Long = 0L,
)

public data class StorageLayout(
    public var LayoutType: UInt = 0u,
    public var pwcsElementName: PWSTR = 0L,
    public var cOffset: Long = 0L,
    public var cBytes: Long = 0L,
)

public data class TLIBATTR(
    public var guid: GUID = GUID(),
    public var lcid: UInt = 0u,
    public var syskind: SYSKIND = 0,
    public var wMajorVerNum: UShort = 0u,
    public var wMinorVerNum: UShort = 0u,
    public var wLibFlags: UShort = 0u,
)

public class TYPEATTR(
    public var guid: GUID = GUID(),
    public var lcid: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var memidConstructor: Int = 0,
    public var memidDestructor: Int = 0,
    public var lpstrSchema: PWSTR = 0L,
    public var cbSizeInstance: UInt = 0u,
    public var typekind: TYPEKIND = 0,
    public var cFuncs: UShort = 0u,
    public var cVars: UShort = 0u,
    public var cImplTypes: UShort = 0u,
    public var cbSizeVft: UShort = 0u,
    public var cbAlignment: UShort = 0u,
    public var wTypeFlags: UShort = 0u,
    public var wMajorVerNum: UShort = 0u,
    public var wMinorVerNum: UShort = 0u,
    public var tdescAlias: TYPEDESC = TYPEDESC(),
    public var idldescType: IDLDESC = IDLDESC(),
)

public data class TYPEDESC(public var Anonymous: TYPEDESC_0 = TYPEDESC_0(), public var vt: VARENUM = 0u)

public data class TYPEDESC_0(
    public var lptdesc: Long = 0L,
    public var lpadesc: Long = 0L,
    public var hreftype: UInt = 0u,
)

public data class VARDESC(
    public var memid: Int = 0,
    public var lpstrSchema: PWSTR = 0L,
    public var Anonymous: VARDESC_0 = VARDESC_0(),
    public var elemdescVar: ELEMDESC = ELEMDESC(),
    public var wVarFlags: VARFLAGS = 0u,
    public var varkind: VARKIND = 0,
)

public data class VARDESC_0(public var oInst: UInt = 0u, public var lpvarValue: Long = 0L)

public data class WORD_BLOB(public var clSize: UInt = 0u, public var asData: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WORD_BLOB) return false
        if (this.clSize != other.clSize) return false
        if (!this.asData.contentEquals(other.asData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clSize.hashCode()
        result = 31 * result + this.asData.contentHashCode()
        return result
    }
}

public data class WORD_SIZEDARR(public var clSize: UInt = 0u, public var pData: Long = 0L)

public data class uCLSSPEC(public var tyspec: UInt = 0u, public var tagged_union: uCLSSPEC_0 = uCLSSPEC_0())

public data class uCLSSPEC_0(
    public var clsid: GUID = GUID(),
    public var pFileExt: PWSTR = 0L,
    public var pMimeType: PWSTR = 0L,
    public var pProgId: PWSTR = 0L,
    public var pFileName: PWSTR = 0L,
    public var ByName: uCLSSPEC_0_0 = uCLSSPEC_0_0(),
    public var ByObjectId: uCLSSPEC_0_1 = uCLSSPEC_0_1(),
)

public data class uCLSSPEC_0_0(public var pPackageName: PWSTR = 0L, public var PolicyId: GUID = GUID())

public data class uCLSSPEC_0_1(public var ObjectId: GUID = GUID(), public var PolicyId: GUID = GUID())

public data class userFLAG_STGMEDIUM(
    public var ContextFlags: Int = 0,
    public var fPassOwnership: Int = 0,
    public var Stgmed: userSTGMEDIUM = userSTGMEDIUM(),
)

public data class userSTGMEDIUM(public var u: userSTGMEDIUM_0 = userSTGMEDIUM_0(), public var pUnkForRelease: Long = 0L)

public data class userSTGMEDIUM_0(public var tymed: UInt = 0u, public var u: userSTGMEDIUM_0_0 = userSTGMEDIUM_0_0())

public data class userSTGMEDIUM_0_0(
    public var hMetaFilePict: Long = 0L,
    public var hHEnhMetaFile: Long = 0L,
    public var hGdiHandle: Long = 0L,
    public var hGlobal: Long = 0L,
    public var lpszFileName: PWSTR = 0L,
    public var pstm: Long = 0L,
    public var pstg: Long = 0L,
)
