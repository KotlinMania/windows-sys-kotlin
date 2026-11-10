@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.com

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.ole.Arraydesc
import io.github.kotlinmania.windowssys.windows.win32.system.ole.Paramdesc
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.UserHbitmap
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.UserHenhmetafile
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.UserHglobal
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.UserHmetafilepict
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.UserHpalette
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Varenum
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant

public data class Authenticateinfo(
    public var dwFlags: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class Bindinfo(
    public var cbSize: UInt = 0u,
    public var szExtraInfo: Pwstr = null,
    public var stgmedData: Stgmedium = Stgmedium(),
    public var grfBindInfoF: UInt = 0u,
    public var dwBindVerb: UInt = 0u,
    public var szCustomVerb: Pwstr = null,
    public var cbstgmedData: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwOptionsFlags: UInt = 0u,
    public var dwCodePage: UInt = 0u,
    public var securityAttributes: SecurityAttributes = SecurityAttributes(),
    public var iid: Guid = Guid(),
    public var pUnk: COpaquePointer? = null,
    public var dwReserved: UInt = 0u,
)

public data class Bindptr(
    public var lpfuncdesc: Funcdesc? = null,
    public var lpvardesc: Vardesc? = null,
    public var lptcomp: COpaquePointer? = null,
)

public data class BindOpts(
    public var cbStruct: UInt = 0u,
    public var grfFlags: UInt = 0u,
    public var grfMode: UInt = 0u,
    public var dwTickCountDeadline: UInt = 0u,
)

public data class BindOpts2(
    public var base: BindOpts = BindOpts(),
    public var dwTrackFlags: UInt = 0u,
    public var dwClassContext: UInt = 0u,
    public var locale: UInt = 0u,
    public var pServerInfo: Coserverinfo? = null,
)

public data class BindOpts3(
    public var base: BindOpts2 = BindOpts2(),
    public var hwnd: Hwnd = null,
)

public data class Blob(
    public var cbSize: UInt = 0u,
    public var pBlobData: COpaquePointer? = null,
)

public data class ByteBlob(
    public var clSize: UInt = 0u,
    public var abData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ByteBlob) return false
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

public data class ByteSizedarr(
    public var clSize: UInt = 0u,
    public var pData: COpaquePointer? = null,
)

public data class Categoryinfo(
    public var catid: Guid = Guid(),
    public var lcid: UInt = 0u,
    public var szDescription: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Categoryinfo) return false
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

public data class Coauthidentity(
    public var user: UShort? = null,
    public var userLength: UInt = 0u,
    public var domain: UShort? = null,
    public var domainLength: UInt = 0u,
    public var password: UShort? = null,
    public var passwordLength: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class Coauthinfo(
    public var dwAuthnSvc: UInt = 0u,
    public var dwAuthzSvc: UInt = 0u,
    public var pwszServerPrincName: Pwstr = null,
    public var dwAuthnLevel: UInt = 0u,
    public var dwImpersonationLevel: UInt = 0u,
    public var pAuthIdentityData: Coauthidentity? = null,
    public var dwCapabilities: UInt = 0u,
)

public data class Connectdata(
    public var pUnk: COpaquePointer? = null,
    public var dwCookie: UInt = 0u,
)

public data class Coserverinfo(
    public var dwReserved1: UInt = 0u,
    public var pwszName: Pwstr = null,
    public var pAuthInfo: Coauthinfo? = null,
    public var dwReserved2: UInt = 0u,
)

public data class Csplatform(
    public var dwPlatformId: UInt = 0u,
    public var dwVersionHi: UInt = 0u,
    public var dwVersionLo: UInt = 0u,
    public var dwProcessorArch: UInt = 0u,
)

public data class Custdata(
    public var cCustData: UInt = 0u,
    public var prgCustData: Custdataitem? = null,
)

public data class Custdataitem(
    public var guid: Guid = Guid(),
    public var varValue: Variant = Variant(),
)

public data class CY(
    public var anonymous: Cy0 = Cy0(),
    public var int64: Long = 0L,
)

public data class Cy0(
    public var lo: UInt = 0u,
    public var hi: Int = 0,
)

public data class ComCallData(
    public var dwDispid: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var pUserDefined: COpaquePointer? = null,
)

public data class ContextProperty(
    public var policyId: Guid = Guid(),
    public var flags: UInt = 0u,
    public var pUnk: COpaquePointer? = null,
)

public data class Dispparams(
    public var rgvarg: Variant? = null,
    public var rgdispidNamedArgs: Int? = null,
    public var cArgs: UInt = 0u,
    public var cNamedArgs: UInt = 0u,
)

public data class Dvtargetdevice(
    public var tdSize: UInt = 0u,
    public var tdDriverNameOffset: UShort = 0u,
    public var tdDeviceNameOffset: UShort = 0u,
    public var tdPortNameOffset: UShort = 0u,
    public var tdExtDevmodeOffset: UShort = 0u,
    public var tdData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dvtargetdevice) return false
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

public data class DwordBlob(
    public var clSize: UInt = 0u,
    public var alData: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DwordBlob) return false
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

public data class DwordSizedarr(
    public var clSize: UInt = 0u,
    public var pData: UInt? = null,
)

public data class Elemdesc(
    public var tdesc: Typedesc = Typedesc(),
    public var anonymous: Elemdesc0 = Elemdesc0(),
)

public data class Elemdesc0(
    public var idldesc: Idldesc = Idldesc(),
    public var paramdesc: Paramdesc = Paramdesc(),
)

public data class Excepinfo(
    public var wCode: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var bstrSource: Bstr = null,
    public var bstrDescription: Bstr = null,
    public var bstrHelpFile: Bstr = null,
    public var dwHelpContext: UInt = 0u,
    public var pvReserved: COpaquePointer? = null,
    public var pfnDeferredFillIn: LpexcepfinoDeferredFillin = null,
    public var scode: Int = 0,
)

public data class FlaggedByteBlob(
    public var fFlags: UInt = 0u,
    public var clSize: UInt = 0u,
    public var abData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FlaggedByteBlob) return false
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

public data class FlaggedWordBlob(
    public var fFlags: UInt = 0u,
    public var clSize: UInt = 0u,
    public var asData: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FlaggedWordBlob) return false
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

public data class FlagStgmedium(
    public var contextFlags: Int = 0,
    public var fPassOwnership: Int = 0,
    public var stgmed: Stgmedium = Stgmedium(),
)

public data class Formatetc(
    public var cfFormat: UShort = 0u,
    public var ptd: Dvtargetdevice? = null,
    public var dwAspect: UInt = 0u,
    public var lindex: Int = 0,
    public var tymed: UInt = 0u,
)

public data class Funcdesc(
    public var memid: Int = 0,
    public var lprgscode: Int? = null,
    public var lprgelemdescParam: Elemdesc? = null,
    public var funckind: Funckind = 0,
    public var invkind: Invokekind = 0,
    public var callconv: Callconv = 0,
    public var cParams: Short = 0,
    public var cParamsOpt: Short = 0,
    public var oVft: Short = 0,
    public var cScodes: Short = 0,
    public var elemdescFunc: Elemdesc = Elemdesc(),
    public var wFuncFlags: Funcflags = 0u,
)

public data class GdiObject(
    public var objectType: UInt = 0u,
    public var u: GdiObject0 = GdiObject0(),
)

public data class GdiObject0(
    public var hBitmap: UserHbitmap? = null,
    public var hPalette: UserHpalette? = null,
    public var hGeneric: UserHglobal? = null,
)

public data class HyperSizedarr(
    public var clSize: UInt = 0u,
    public var pData: Long? = null,
)

public data class Idldesc(
    public var dwReserved: Int = 0,
    public var wIDLFlags: Idlflags = 0u,
)

public data class Interfaceinfo(
    public var pUnk: COpaquePointer? = null,
    public var iid: Guid = Guid(),
    public var wMethod: UShort = 0u,
)

public data class MultiQi(
    public var pIID: Guid? = null,
    public var pItf: COpaquePointer? = null,
    public var hr: Hresult = 0,
)

public data class Querycontext(
    public var dwContext: UInt = 0u,
    public var platform: Csplatform = Csplatform(),
    public var locale: UInt = 0u,
    public var dwVersionHi: UInt = 0u,
    public var dwVersionLo: UInt = 0u,
)

public data class Rpcolemessage(
    public var reserved1: COpaquePointer? = null,
    public var dataRepresentation: UInt = 0u,
    public var buffer: COpaquePointer? = null,
    public var cbBuffer: UInt = 0u,
    public var iMethod: UInt = 0u,
    public var reserved2: List<COpaquePointer> = List(5) { COpaquePointer(0L) },
    public var rpcFlags: UInt = 0u,
)

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

public data class Safearray(
    public var cDims: UShort = 0u,
    public var fFeatures: AdvancedFeatureFlags = 0u,
    public var cbElements: UInt = 0u,
    public var cLocks: UInt = 0u,
    public var pvData: COpaquePointer? = null,
    public var rgsabound: List<Safearraybound> = List(1) { Safearraybound() },
)

public data class Safearraybound(
    public var cElements: UInt = 0u,
    public var lLbound: Int = 0,
)

public data class SChannelHookCallInfo(
    public var iid: Guid = Guid(),
    public var cbSize: UInt = 0u,
    public var uCausality: Guid = Guid(),
    public var dwServerPid: UInt = 0u,
    public var iMethod: UInt = 0u,
    public var pObject: COpaquePointer? = null,
)

public data class SoleAuthenticationInfo(
    public var dwAuthnSvc: UInt = 0u,
    public var dwAuthzSvc: UInt = 0u,
    public var pAuthInfo: COpaquePointer? = null,
)

public data class SoleAuthenticationList(
    public var cAuthInfo: UInt = 0u,
    public var aAuthInfo: SoleAuthenticationInfo? = null,
)

public data class SoleAuthenticationService(
    public var dwAuthnSvc: UInt = 0u,
    public var dwAuthzSvc: UInt = 0u,
    public var pPrincipalName: Pwstr = null,
    public var hr: Hresult = 0,
)

public data class Statdata(
    public var formatetc: Formatetc = Formatetc(),
    public var advf: UInt = 0u,
    public var pAdvSink: COpaquePointer? = null,
    public var dwConnection: UInt = 0u,
)

public data class Statstg(
    public var pwcsName: Pwstr = null,
    public var type: UInt = 0u,
    public var cbSize: ULong = 0uL,
    public var mtime: Filetime = Filetime(),
    public var ctime: Filetime = Filetime(),
    public var atime: Filetime = Filetime(),
    public var grfMode: Stgm = 0u,
    public var grfLocksSupported: UInt = 0u,
    public var clsid: Guid = Guid(),
    public var grfStateBits: UInt = 0u,
    public var reserved: UInt = 0u,
)

public data class Stgmedium(
    public var tymed: UInt = 0u,
    public var u: Stgmedium0 = Stgmedium0(),
    public var pUnkForRelease: COpaquePointer? = null,
)

public data class Stgmedium0(
    public var hBitmap: Hbitmap = null,
    public var hMetaFilePict: COpaquePointer? = null,
    public var hEnhMetaFile: Henhmetafile = null,
    public var hGlobal: Hglobal = null,
    public var lpszFileName: Pwstr = null,
    public var pstm: COpaquePointer? = null,
    public var pstg: COpaquePointer? = null,
)

public data class StorageLayout(
    public var layoutType: UInt = 0u,
    public var pwcsElementName: Pwstr = null,
    public var cOffset: Long = 0L,
    public var cBytes: Long = 0L,
)

public data class Tlibattr(
    public var guid: Guid = Guid(),
    public var lcid: UInt = 0u,
    public var syskind: Syskind = 0,
    public var wMajorVerNum: UShort = 0u,
    public var wMinorVerNum: UShort = 0u,
    public var wLibFlags: UShort = 0u,
)

public class Typeattr(
    public var guid: Guid = Guid(),
    public var lcid: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var memidConstructor: Int = 0,
    public var memidDestructor: Int = 0,
    public var lpstrSchema: Pwstr = null,
    public var cbSizeInstance: UInt = 0u,
    public var typekind: Typekind = 0,
    public var cFuncs: UShort = 0u,
    public var cVars: UShort = 0u,
    public var cImplTypes: UShort = 0u,
    public var cbSizeVft: UShort = 0u,
    public var cbAlignment: UShort = 0u,
    public var wTypeFlags: UShort = 0u,
    public var wMajorVerNum: UShort = 0u,
    public var wMinorVerNum: UShort = 0u,
    public var tdescAlias: Typedesc = Typedesc(),
    public var idldescType: Idldesc = Idldesc(),
)

public data class Typedesc(
    public var anonymous: Typedesc0 = Typedesc0(),
    public var vt: Varenum = 0u,
)

public data class Typedesc0(
    public var lptdesc: Typedesc? = null,
    public var lpadesc: Arraydesc? = null,
    public var hreftype: UInt = 0u,
)

public data class Vardesc(
    public var memid: Int = 0,
    public var lpstrSchema: Pwstr = null,
    public var anonymous: Vardesc0 = Vardesc0(),
    public var elemdescVar: Elemdesc = Elemdesc(),
    public var wVarFlags: Varflags = 0u,
    public var varkind: Varkind = 0,
)

public data class Vardesc0(
    public var oInst: UInt = 0u,
    public var lpvarValue: Variant? = null,
)

public data class WordBlob(
    public var clSize: UInt = 0u,
    public var asData: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WordBlob) return false
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

public data class WordSizedarr(
    public var clSize: UInt = 0u,
    public var pData: UShort? = null,
)

public data class UClsspec(
    public var tyspec: UInt = 0u,
    public var taggedUnion: UClsspec0 = UClsspec0(),
)

public data class UClsspec0(
    public var clsid: Guid = Guid(),
    public var pFileExt: Pwstr = null,
    public var pMimeType: Pwstr = null,
    public var pProgId: Pwstr = null,
    public var pFileName: Pwstr = null,
    public var byName: UClsspec00 = UClsspec00(),
    public var byObjectId: UClsspec01 = UClsspec01(),
)

public data class UClsspec00(
    public var pPackageName: Pwstr = null,
    public var policyId: Guid = Guid(),
)

public data class UClsspec01(
    public var objectId: Guid = Guid(),
    public var policyId: Guid = Guid(),
)

public data class UserFlagStgmedium(
    public var contextFlags: Int = 0,
    public var fPassOwnership: Int = 0,
    public var stgmed: UserStgmedium = UserStgmedium(),
)

public data class UserStgmedium(
    public var u: UserStgmedium0 = UserStgmedium0(),
    public var pUnkForRelease: COpaquePointer? = null,
)

public data class UserStgmedium0(
    public var tymed: UInt = 0u,
    public var u: UserStgmedium00 = UserStgmedium00(),
)

public data class UserStgmedium00(
    public var hMetaFilePict: UserHmetafilepict? = null,
    public var hHEnhMetaFile: UserHenhmetafile? = null,
    public var hGdiHandle: GdiObject? = null,
    public var hGlobal: UserHglobal? = null,
    public var lpszFileName: Pwstr = null,
    public var pstm: ByteBlob? = null,
    public var pstg: ByteBlob? = null,
)
