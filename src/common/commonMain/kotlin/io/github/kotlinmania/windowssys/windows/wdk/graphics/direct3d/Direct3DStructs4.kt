@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.LUID
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECTL
import io.github.kotlinmania.windowssys.windows.win32.system.power.DEVICE_POWER_STATE

public data class D3DKMT_WDDM_1_3_CAPS(public var Anonymous: D3DKMT_WDDM_1_3_CAPS_0 = D3DKMT_WDDM_1_3_CAPS_0())

public data class D3DKMT_WDDM_1_3_CAPS_0(public var Anonymous: D3DKMT_WDDM_1_3_CAPS_0_0 = D3DKMT_WDDM_1_3_CAPS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_WDDM_1_3_CAPS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_WDDM_2_0_CAPS(public var Anonymous: D3DKMT_WDDM_2_0_CAPS_0 = D3DKMT_WDDM_2_0_CAPS_0())

public data class D3DKMT_WDDM_2_0_CAPS_0(public var Anonymous: D3DKMT_WDDM_2_0_CAPS_0_0 = D3DKMT_WDDM_2_0_CAPS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_WDDM_2_0_CAPS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_WDDM_2_7_CAPS(public var Anonymous: D3DKMT_WDDM_2_7_CAPS_0 = D3DKMT_WDDM_2_7_CAPS_0())

public data class D3DKMT_WDDM_2_7_CAPS_0(public var Anonymous: D3DKMT_WDDM_2_7_CAPS_0_0 = D3DKMT_WDDM_2_7_CAPS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_WDDM_2_7_CAPS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_WDDM_2_9_CAPS(public var Anonymous: D3DKMT_WDDM_2_9_CAPS_0 = D3DKMT_WDDM_2_9_CAPS_0())

public data class D3DKMT_WDDM_2_9_CAPS_0(public var Anonymous: D3DKMT_WDDM_2_9_CAPS_0_0 = D3DKMT_WDDM_2_9_CAPS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_WDDM_2_9_CAPS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_WDDM_3_0_CAPS(public var Anonymous: D3DKMT_WDDM_3_0_CAPS_0 = D3DKMT_WDDM_3_0_CAPS_0())

public data class D3DKMT_WDDM_3_0_CAPS_0(public var Anonymous: D3DKMT_WDDM_3_0_CAPS_0_0 = D3DKMT_WDDM_3_0_CAPS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_WDDM_3_0_CAPS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_WDDM_3_1_CAPS(public var Anonymous: D3DKMT_WDDM_3_1_CAPS_0 = D3DKMT_WDDM_3_1_CAPS_0())

public data class D3DKMT_WDDM_3_1_CAPS_0(public var Anonymous: D3DKMT_WDDM_3_1_CAPS_0_0 = D3DKMT_WDDM_3_1_CAPS_0_0(), public var Value: UInt = 0u)

public data class D3DKMT_WDDM_3_1_CAPS_0_0(public var _bitfield: UInt = 0u)

public data class D3DKMT_WORKINGSETFLAGS(public var _bitfield: UInt = 0u)

public data class D3DKMT_WORKINGSETINFO(
    public var Flags: D3DKMT_WORKINGSETFLAGS = D3DKMT_WORKINGSETFLAGS(),
    public var MinimumWorkingSetPercentile: UInt = 0u,
    public var MaximumWorkingSetPercentile: UInt = 0u,
)

public data class D3DKMT_WSAUMDIMAGENAME(public var WsaUmdImageName: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DKMT_WSAUMDIMAGENAME) return false
        if (!this.WsaUmdImageName.contentEquals(other.WsaUmdImageName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.WsaUmdImageName.contentHashCode()
    }
}

public data class D3DKMT_XBOX(public var IsXBOX: BOOL = 0)

public data class D3DLINEPATTERN(public var wRepeatFactor: UShort = 0u, public var wLinePattern: UShort = 0u)

public data class D3DNTHAL_CLIPPEDTRIANGLEFAN(
    public var FirstVertexOffset: UInt = 0u,
    public var dwEdgeFlags: UInt = 0u,
    public var PrimitiveCount: UInt = 0u,
)

public data class D3DNTHAL_CONTEXTDESTROYALLDATA(public var dwPID: UInt = 0u, public var ddrval: HRESULT = 0)

public data class D3DNTHAL_CONTEXTDESTROYDATA(public var dwhContext: ULong = 0uL, public var ddrval: HRESULT = 0)

public class D3DNTHAL_D3DDX6EXTENDEDCAPS(
    public var dwSize: UInt = 0u,
    public var dwMinTextureWidth: UInt = 0u,
    public var dwMaxTextureWidth: UInt = 0u,
    public var dwMinTextureHeight: UInt = 0u,
    public var dwMaxTextureHeight: UInt = 0u,
    public var dwMinStippleWidth: UInt = 0u,
    public var dwMaxStippleWidth: UInt = 0u,
    public var dwMinStippleHeight: UInt = 0u,
    public var dwMaxStippleHeight: UInt = 0u,
    public var dwMaxTextureRepeat: UInt = 0u,
    public var dwMaxTextureAspectRatio: UInt = 0u,
    public var dwMaxAnisotropy: UInt = 0u,
    public var dvGuardBandLeft: Float = 0.0f,
    public var dvGuardBandTop: Float = 0.0f,
    public var dvGuardBandRight: Float = 0.0f,
    public var dvGuardBandBottom: Float = 0.0f,
    public var dvExtentsAdjust: Float = 0.0f,
    public var dwStencilCaps: UInt = 0u,
    public var dwFVFCaps: UInt = 0u,
    public var dwTextureOpCaps: UInt = 0u,
    public var wMaxTextureBlendStages: UShort = 0u,
    public var wMaxSimultaneousTextures: UShort = 0u,
)

public class D3DNTHAL_D3DEXTENDEDCAPS(
    public var dwSize: UInt = 0u,
    public var dwMinTextureWidth: UInt = 0u,
    public var dwMaxTextureWidth: UInt = 0u,
    public var dwMinTextureHeight: UInt = 0u,
    public var dwMaxTextureHeight: UInt = 0u,
    public var dwMinStippleWidth: UInt = 0u,
    public var dwMaxStippleWidth: UInt = 0u,
    public var dwMinStippleHeight: UInt = 0u,
    public var dwMaxStippleHeight: UInt = 0u,
    public var dwMaxTextureRepeat: UInt = 0u,
    public var dwMaxTextureAspectRatio: UInt = 0u,
    public var dwMaxAnisotropy: UInt = 0u,
    public var dvGuardBandLeft: Float = 0.0f,
    public var dvGuardBandTop: Float = 0.0f,
    public var dvGuardBandRight: Float = 0.0f,
    public var dvGuardBandBottom: Float = 0.0f,
    public var dvExtentsAdjust: Float = 0.0f,
    public var dwStencilCaps: UInt = 0u,
    public var dwFVFCaps: UInt = 0u,
    public var dwTextureOpCaps: UInt = 0u,
    public var wMaxTextureBlendStages: UShort = 0u,
    public var wMaxSimultaneousTextures: UShort = 0u,
    public var dwMaxActiveLights: UInt = 0u,
    public var dvMaxVertexW: Float = 0.0f,
    public var wMaxUserClipPlanes: UShort = 0u,
    public var wMaxVertexBlendMatrices: UShort = 0u,
    public var dwVertexProcessingCaps: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwReserved3: UInt = 0u,
    public var dwReserved4: UInt = 0u,
)

public data class D3DNTHAL_DP2ADDDIRTYRECT(public var dwSurface: UInt = 0u, public var rDirtyArea: RECTL = RECTL())

public data class D3DNTHAL_DP2BLT(
    public var dwSource: UInt = 0u,
    public var rSource: RECTL = RECTL(),
    public var dwSourceMipLevel: UInt = 0u,
    public var dwDest: UInt = 0u,
    public var rDest: RECTL = RECTL(),
    public var dwDestMipLevel: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class D3DNTHAL_DP2CLEAR(
    public var dwFlags: UInt = 0u,
    public var dwFillColor: UInt = 0u,
    public var dvFillDepth: Float = 0.0f,
    public var dwFillStencil: UInt = 0u,
    public var Rects: List<RECT> = List(1) { RECT() },
)

public data class D3DNTHAL_DP2COLORFILL(
    public var dwSurface: UInt = 0u,
    public var rRect: RECTL = RECTL(),
    public var Color: UInt = 0u,
)

public data class D3DNTHAL_DP2COMMAND(
    public var bCommand: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var Anonymous: D3DNTHAL_DP2COMMAND_0 = D3DNTHAL_DP2COMMAND_0(),
)

public data class D3DNTHAL_DP2COMMAND_0(public var wPrimitiveCount: UShort = 0u, public var wStateCount: UShort = 0u)

public data class D3DNTHAL_DP2CREATELIGHT(public var dwIndex: UInt = 0u)

public data class D3DNTHAL_DP2CREATEPIXELSHADER(public var dwHandle: UInt = 0u, public var dwCodeSize: UInt = 0u)

public data class D3DNTHAL_DP2CREATEVERTEXSHADER(
    public var dwHandle: UInt = 0u,
    public var dwDeclSize: UInt = 0u,
    public var dwCodeSize: UInt = 0u,
)

public data class D3DNTHAL_DP2CREATEVERTEXSHADERDECL(public var dwHandle: UInt = 0u, public var dwNumVertexElements: UInt = 0u)

public data class D3DNTHAL_DP2CREATEVERTEXSHADERFUNC(public var dwHandle: UInt = 0u, public var dwSize: UInt = 0u)

public data class D3DNTHAL_DP2DELETEQUERY(public var dwQueryID: UInt = 0u)

public data class D3DNTHAL_DP2DRAWRECTPATCH(public var Handle: UInt = 0u, public var Flags: UInt = 0u)

public data class D3DNTHAL_DP2DRAWTRIPATCH(public var Handle: UInt = 0u, public var Flags: UInt = 0u)

public data class D3DNTHAL_DP2EXT(public var dwExtToken: UInt = 0u, public var dwSize: UInt = 0u)

public data class D3DNTHAL_DP2INDEXEDLINELIST(public var wV1: UShort = 0u, public var wV2: UShort = 0u)

public data class D3DNTHAL_DP2INDEXEDLINESTRIP(public var wV: UShortArray = UShortArray(2)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DNTHAL_DP2INDEXEDLINESTRIP) return false
        if (!this.wV.contentEquals(other.wV)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.wV.contentHashCode()
    }
}

public data class D3DNTHAL_DP2INDEXEDTRIANGLEFAN(public var wV: UShortArray = UShortArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DNTHAL_DP2INDEXEDTRIANGLEFAN) return false
        if (!this.wV.contentEquals(other.wV)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.wV.contentHashCode()
    }
}

public data class D3DNTHAL_DP2INDEXEDTRIANGLELIST(
    public var wV1: UShort = 0u,
    public var wV2: UShort = 0u,
    public var wV3: UShort = 0u,
    public var wFlags: UShort = 0u,
)

public data class D3DNTHAL_DP2INDEXEDTRIANGLELIST2(
    public var wV1: UShort = 0u,
    public var wV2: UShort = 0u,
    public var wV3: UShort = 0u,
)

public data class D3DNTHAL_DP2INDEXEDTRIANGLESTRIP(public var wV: UShortArray = UShortArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DNTHAL_DP2INDEXEDTRIANGLESTRIP) return false
        if (!this.wV.contentEquals(other.wV)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.wV.contentHashCode()
    }
}

public data class D3DNTHAL_DP2ISSUEQUERY(public var dwQueryID: UInt = 0u, public var dwFlags: UInt = 0u)

public data class D3DNTHAL_DP2LINELIST(public var wVStart: UShort = 0u)

public data class D3DNTHAL_DP2LINESTRIP(public var wVStart: UShort = 0u)

public data class D3DNTHAL_DP2PIXELSHADER(public var dwHandle: UInt = 0u)

public data class D3DNTHAL_DP2POINTS(public var wCount: UShort = 0u, public var wVStart: UShort = 0u)

public data class D3DNTHAL_DP2RESPONSE(
    public var bCommand: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var wStateCount: UShort = 0u,
    public var dwTotalSize: UInt = 0u,
)

public data class D3DNTHAL_DP2RESPONSEQUERY(public var dwQueryID: UInt = 0u, public var dwSize: UInt = 0u)

public data class D3DNTHAL_DP2SETCLIPPLANE(public var dwIndex: UInt = 0u, public var plane: FloatArray = FloatArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3DNTHAL_DP2SETCLIPPLANE) return false
        if (this.dwIndex != other.dwIndex) return false
        if (!this.plane.contentEquals(other.plane)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIndex.hashCode()
        result = 31 * result + this.plane.contentHashCode()
        return result
    }
}

public data class D3DNTHAL_DP2SETCONVOLUTIONKERNELMONO(
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class D3DNTHAL_DP2SETDEPTHSTENCIL(public var hZBuffer: UInt = 0u)

public data class D3DNTHAL_DP2SETINDICES(public var dwVBHandle: UInt = 0u, public var dwStride: UInt = 0u)

public data class D3DNTHAL_DP2SETLIGHT(public var dwIndex: UInt = 0u, public var Anonymous: D3DNTHAL_DP2SETLIGHT_0 = D3DNTHAL_DP2SETLIGHT_0())

public data class D3DNTHAL_DP2SETLIGHT_0(public var lightData: UInt = 0u, public var dwDataType: UInt = 0u)

public data class D3DNTHAL_DP2SETPALETTE(
    public var dwPaletteHandle: UInt = 0u,
    public var dwPaletteFlags: UInt = 0u,
    public var dwSurfaceHandle: UInt = 0u,
)

public data class D3DNTHAL_DP2SETPIXELSHADERCONST(public var dwRegister: UInt = 0u, public var dwCount: UInt = 0u)

public data class D3DNTHAL_DP2SETPRIORITY(public var dwDDDestSurface: UInt = 0u, public var dwPriority: UInt = 0u)

public data class D3DNTHAL_DP2SETRENDERTARGET(public var hRenderTarget: UInt = 0u, public var hZBuffer: UInt = 0u)

public data class D3DNTHAL_DP2SETRENDERTARGET2(public var RTIndex: UInt = 0u, public var hRenderTarget: UInt = 0u)

public data class D3DNTHAL_DP2SETSTREAMSOURCE(
    public var dwStream: UInt = 0u,
    public var dwVBHandle: UInt = 0u,
    public var dwStride: UInt = 0u,
)

public data class D3DNTHAL_DP2SETSTREAMSOURCE2(
    public var dwStream: UInt = 0u,
    public var dwVBHandle: UInt = 0u,
    public var dwOffset: UInt = 0u,
    public var dwStride: UInt = 0u,
)

public data class D3DNTHAL_DP2SETSTREAMSOURCEFREQ(public var dwStream: UInt = 0u, public var dwDivider: UInt = 0u)

public data class D3DNTHAL_DP2SETSTREAMSOURCEUM(public var dwStream: UInt = 0u, public var dwStride: UInt = 0u)

public data class D3DNTHAL_DP2SETTEXLOD(public var dwDDSurface: UInt = 0u, public var dwLOD: UInt = 0u)

public data class D3DNTHAL_DP2SETVERTEXSHADERCONST(public var dwRegister: UInt = 0u, public var dwCount: UInt = 0u)

public data class D3DNTHAL_DP2STARTVERTEX(public var wVStart: UShort = 0u)

public data class D3DNTHAL_DP2SURFACEBLT(
    public var dwSource: UInt = 0u,
    public var rSource: RECTL = RECTL(),
    public var dwSourceMipLevel: UInt = 0u,
    public var dwDest: UInt = 0u,
    public var rDest: RECTL = RECTL(),
    public var dwDestMipLevel: UInt = 0u,
    public var Flags: UInt = 0u,
)

public data class D3DNTHAL_DP2TEXBLT(
    public var dwDDDestSurface: UInt = 0u,
    public var dwDDSrcSurface: UInt = 0u,
    public var pDest: POINT = POINT(),
    public var rSrc: RECTL = RECTL(),
    public var dwFlags: UInt = 0u,
)

public data class D3DNTHAL_DP2TEXTURESTAGESTATE(
    public var wStage: UShort = 0u,
    public var TSState: UShort = 0u,
    public var dwValue: UInt = 0u,
)

public data class D3DNTHAL_DP2TRIANGLEFAN(public var wVStart: UShort = 0u)

public data class D3DNTHAL_DP2TRIANGLEFAN_IMM(public var dwEdgeFlags: UInt = 0u)

public data class D3DNTHAL_DP2TRIANGLELIST(public var wVStart: UShort = 0u)

public data class D3DNTHAL_DP2TRIANGLESTRIP(public var wVStart: UShort = 0u)

public data class D3DNTHAL_DP2UPDATEPALETTE(
    public var dwPaletteHandle: UInt = 0u,
    public var wStartIndex: UShort = 0u,
    public var wNumEntries: UShort = 0u,
)

public data class D3DNTHAL_DP2VERTEXSHADER(public var dwHandle: UInt = 0u)

public data class D3DNTHAL_DP2VIEWPORTINFO(
    public var dwX: UInt = 0u,
    public var dwY: UInt = 0u,
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
)

public data class D3DNTHAL_DP2WINFO(public var dvWNear: Float = 0.0f, public var dvWFar: Float = 0.0f)

public data class D3DNTHAL_DP2ZRANGE(public var dvMinZ: Float = 0.0f, public var dvMaxZ: Float = 0.0f)

public data class D3DNTHAL_SCENECAPTUREDATA(
    public var dwhContext: ULong = 0uL,
    public var dwFlag: UInt = 0u,
    public var ddrval: HRESULT = 0,
)

public data class D3DNTHAL_TEXTURECREATEDATA(
    public var dwhContext: ULong = 0uL,
    public var hDDS: HANDLE = 0L,
    public var dwHandle: ULong = 0uL,
    public var ddrval: HRESULT = 0,
)

public data class D3DNTHAL_TEXTUREDESTROYDATA(
    public var dwhContext: ULong = 0uL,
    public var dwHandle: ULong = 0uL,
    public var ddrval: HRESULT = 0,
)

public data class D3DNTHAL_TEXTUREGETSURFDATA(
    public var dwhContext: ULong = 0uL,
    public var hDDS: HANDLE = 0L,
    public var dwHandle: ULong = 0uL,
    public var ddrval: HRESULT = 0,
)

public data class D3DNTHAL_TEXTURESWAPDATA(
    public var dwhContext: ULong = 0uL,
    public var dwHandle1: ULong = 0uL,
    public var dwHandle2: ULong = 0uL,
    public var ddrval: HRESULT = 0,
)

public data class D3DNTHAL_VALIDATETEXTURESTAGESTATEDATA(
    public var dwhContext: ULong = 0uL,
    public var dwFlags: UInt = 0u,
    public var dwReserved: ULong = 0uL,
    public var dwNumPasses: UInt = 0u,
    public var ddrval: HRESULT = 0,
)

public data class DDNT_DEFERRED_AGP_AWARE_DATA(public var gdi2: DDNT_GETDRIVERINFO2DATA = DDNT_GETDRIVERINFO2DATA())

public data class DDNT_DXVERSION(
    public var gdi2: DDNT_GETDRIVERINFO2DATA = DDNT_GETDRIVERINFO2DATA(),
    public var dwDXVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class DDNT_FREE_DEFERRED_AGP_DATA(public var gdi2: DDNT_GETDRIVERINFO2DATA = DDNT_GETDRIVERINFO2DATA(), public var dwProcessId: UInt = 0u)

public data class DDNT_GETADAPTERGROUPDATA(
    public var gdi2: DDNT_GETDRIVERINFO2DATA = DDNT_GETDRIVERINFO2DATA(),
    public var ulUniqueAdapterGroupId: ULong = 0uL,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
)

public data class DDNT_GETD3DQUERYCOUNTDATA(public var gdi2: DDNT_GETDRIVERINFO2DATA = DDNT_GETDRIVERINFO2DATA(), public var dwNumQueries: UInt = 0u)

public data class DDNT_GETDDIVERSIONDATA(
    public var gdi2: DDNT_GETDRIVERINFO2DATA = DDNT_GETDRIVERINFO2DATA(),
    public var dwDXVersion: UInt = 0u,
    public var dwDDIVersion: UInt = 0u,
)

public data class DDNT_GETDRIVERINFO2DATA(
    public var dwReserved: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwExpectedSize: UInt = 0u,
)

public data class DDNT_GETEXTENDEDMODECOUNTDATA(
    public var gdi2: DDNT_GETDRIVERINFO2DATA = DDNT_GETDRIVERINFO2DATA(),
    public var dwModeCount: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class DDNT_GETFORMATCOUNTDATA(
    public var gdi2: DDNT_GETDRIVERINFO2DATA = DDNT_GETDRIVERINFO2DATA(),
    public var dwFormatCount: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class DD_DEFERRED_AGP_AWARE_DATA(public var gdi2: DD_GETDRIVERINFO2DATA = DD_GETDRIVERINFO2DATA())

public data class DD_DXVERSION(
    public var gdi2: DD_GETDRIVERINFO2DATA = DD_GETDRIVERINFO2DATA(),
    public var dwDXVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class DD_FREE_DEFERRED_AGP_DATA(public var gdi2: DD_GETDRIVERINFO2DATA = DD_GETDRIVERINFO2DATA(), public var dwProcessId: UInt = 0u)

public data class DD_GETADAPTERGROUPDATA(
    public var gdi2: DD_GETDRIVERINFO2DATA = DD_GETDRIVERINFO2DATA(),
    public var ulUniqueAdapterGroupId: ULong = 0uL,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
)

public data class DD_GETD3DQUERYCOUNTDATA(public var gdi2: DD_GETDRIVERINFO2DATA = DD_GETDRIVERINFO2DATA(), public var dwNumQueries: UInt = 0u)

public data class DD_GETDDIVERSIONDATA(
    public var gdi2: DD_GETDRIVERINFO2DATA = DD_GETDRIVERINFO2DATA(),
    public var dwDXVersion: UInt = 0u,
    public var dwDDIVersion: UInt = 0u,
)

public data class DD_GETDRIVERINFO2DATA(
    public var dwReserved: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwExpectedSize: UInt = 0u,
)

public data class DD_GETEXTENDEDMODECOUNTDATA(
    public var gdi2: DD_GETDRIVERINFO2DATA = DD_GETDRIVERINFO2DATA(),
    public var dwModeCount: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class DD_GETFORMATCOUNTDATA(
    public var gdi2: DD_GETDRIVERINFO2DATA = DD_GETDRIVERINFO2DATA(),
    public var dwFormatCount: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class DISPLAYID_DETAILED_TIMING_TYPE_I(
    public var Anonymous1: DISPLAYID_DETAILED_TIMING_TYPE_I_0 = DISPLAYID_DETAILED_TIMING_TYPE_I_0(),
    public var HorizontalActivePixels: UShort = 0u,
    public var HorizontalBlankPixels: UShort = 0u,
    public var Anonymous2: DISPLAYID_DETAILED_TIMING_TYPE_I_1 = DISPLAYID_DETAILED_TIMING_TYPE_I_1(),
    public var HorizontalSyncWidth: UShort = 0u,
    public var VerticalActiveLines: UShort = 0u,
    public var VerticalBlankLines: UShort = 0u,
    public var Anonymous3: DISPLAYID_DETAILED_TIMING_TYPE_I_2 = DISPLAYID_DETAILED_TIMING_TYPE_I_2(),
    public var VerticalSyncWidth: UShort = 0u,
)

public data class DISPLAYID_DETAILED_TIMING_TYPE_I_0(public var _bitfield: UInt = 0u)

public data class DISPLAYID_DETAILED_TIMING_TYPE_I_1(public var _bitfield: UShort = 0u)

public data class DISPLAYID_DETAILED_TIMING_TYPE_I_2(public var _bitfield: UShort = 0u)

public data class DXGKARG_SETPALETTE(
    public var VidPnSourceId: UInt = 0u,
    public var FirstEntry: UInt = 0u,
    public var NumEntries: UInt = 0u,
    public var pLookupTable: Long = 0L,
)

public data class DXGKMDT_OPM_ACP_AND_CGMSA_SIGNALING(
    public var rnRandomNumber: DXGKMDT_OPM_RANDOM_NUMBER = DXGKMDT_OPM_RANDOM_NUMBER(),
    public var ulStatusFlags: UInt = 0u,
    public var ulAvailableTVProtectionStandards: UInt = 0u,
    public var ulActiveTVProtectionStandard: UInt = 0u,
    public var ulReserved: UInt = 0u,
    public var ulAspectRatioValidMask1: UInt = 0u,
    public var ulAspectRatioData1: UInt = 0u,
    public var ulAspectRatioValidMask2: UInt = 0u,
    public var ulAspectRatioData2: UInt = 0u,
    public var ulAspectRatioValidMask3: UInt = 0u,
    public var ulAspectRatioData3: UInt = 0u,
    public var ulReserved2: UIntArray = UIntArray(4),
    public var ulReserved3: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DXGKMDT_OPM_ACP_AND_CGMSA_SIGNALING) return false
        if (this.rnRandomNumber != other.rnRandomNumber) return false
        if (this.ulStatusFlags != other.ulStatusFlags) return false
        if (this.ulAvailableTVProtectionStandards != other.ulAvailableTVProtectionStandards) return false
        if (this.ulActiveTVProtectionStandard != other.ulActiveTVProtectionStandard) return false
        if (this.ulReserved != other.ulReserved) return false
        if (this.ulAspectRatioValidMask1 != other.ulAspectRatioValidMask1) return false
        if (this.ulAspectRatioData1 != other.ulAspectRatioData1) return false
        if (this.ulAspectRatioValidMask2 != other.ulAspectRatioValidMask2) return false
        if (this.ulAspectRatioData2 != other.ulAspectRatioData2) return false
        if (this.ulAspectRatioValidMask3 != other.ulAspectRatioValidMask3) return false
        if (this.ulAspectRatioData3 != other.ulAspectRatioData3) return false
        if (!this.ulReserved2.contentEquals(other.ulReserved2)) return false
        if (!this.ulReserved3.contentEquals(other.ulReserved3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rnRandomNumber.hashCode()
        result = 31 * result + this.ulStatusFlags.hashCode()
        result = 31 * result + this.ulAvailableTVProtectionStandards.hashCode()
        result = 31 * result + this.ulActiveTVProtectionStandard.hashCode()
        result = 31 * result + this.ulReserved.hashCode()
        result = 31 * result + this.ulAspectRatioValidMask1.hashCode()
        result = 31 * result + this.ulAspectRatioData1.hashCode()
        result = 31 * result + this.ulAspectRatioValidMask2.hashCode()
        result = 31 * result + this.ulAspectRatioData2.hashCode()
        result = 31 * result + this.ulAspectRatioValidMask3.hashCode()
        result = 31 * result + this.ulAspectRatioData3.hashCode()
        result = 31 * result + this.ulReserved2.contentHashCode()
        result = 31 * result + this.ulReserved3.contentHashCode()
        return result
    }
}

public data class DXGKMDT_OPM_ACTUAL_OUTPUT_FORMAT(
    public var rnRandomNumber: DXGKMDT_OPM_RANDOM_NUMBER = DXGKMDT_OPM_RANDOM_NUMBER(),
    public var ulStatusFlags: UInt = 0u,
    public var ulDisplayWidth: UInt = 0u,
    public var ulDisplayHeight: UInt = 0u,
    public var ifInterleaveFormat: DXGKMDT_OPM_INTERLEAVE_FORMAT = 0,
    public var d3dFormat: UInt = 0u,
    public var ulFrequencyNumerator: UInt = 0u,
    public var ulFrequencyDenominator: UInt = 0u,
)

public data class DXGKMDT_OPM_CONFIGURE_PARAMETERS(
    public var omac: DXGKMDT_OPM_OMAC = DXGKMDT_OPM_OMAC(),
    public var guidSetting: GUID = GUID(),
    public var ulSequenceNumber: UInt = 0u,
    public var cbParametersSize: UInt = 0u,
    public var abParameters: UByteArray = UByteArray(4056),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DXGKMDT_OPM_CONFIGURE_PARAMETERS) return false
        if (this.omac != other.omac) return false
        if (this.guidSetting != other.guidSetting) return false
        if (this.ulSequenceNumber != other.ulSequenceNumber) return false
        if (this.cbParametersSize != other.cbParametersSize) return false
        if (!this.abParameters.contentEquals(other.abParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.omac.hashCode()
        result = 31 * result + this.guidSetting.hashCode()
        result = 31 * result + this.ulSequenceNumber.hashCode()
        result = 31 * result + this.cbParametersSize.hashCode()
        result = 31 * result + this.abParameters.contentHashCode()
        return result
    }
}

public data class DXGKMDT_OPM_CONNECTED_HDCP_DEVICE_INFORMATION(
    public var rnRandomNumber: DXGKMDT_OPM_RANDOM_NUMBER = DXGKMDT_OPM_RANDOM_NUMBER(),
    public var ulStatusFlags: UInt = 0u,
    public var ulHDCPFlags: UInt = 0u,
    public var ksvB: DXGKMDT_OPM_HDCP_KEY_SELECTION_VECTOR = DXGKMDT_OPM_HDCP_KEY_SELECTION_VECTOR(),
    public var Reserved: UByteArray = UByteArray(11),
    public var Reserved2: UByteArray = UByteArray(16),
    public var Reserved3: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DXGKMDT_OPM_CONNECTED_HDCP_DEVICE_INFORMATION) return false
        if (this.rnRandomNumber != other.rnRandomNumber) return false
        if (this.ulStatusFlags != other.ulStatusFlags) return false
        if (this.ulHDCPFlags != other.ulHDCPFlags) return false
        if (this.ksvB != other.ksvB) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (!this.Reserved2.contentEquals(other.Reserved2)) return false
        if (!this.Reserved3.contentEquals(other.Reserved3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rnRandomNumber.hashCode()
        result = 31 * result + this.ulStatusFlags.hashCode()
        result = 31 * result + this.ulHDCPFlags.hashCode()
        result = 31 * result + this.ksvB.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.Reserved2.contentHashCode()
        result = 31 * result + this.Reserved3.contentHashCode()
        return result
    }
}

public data class DXGKMDT_OPM_COPP_COMPATIBLE_GET_INFO_PARAMETERS(
    public var rnRandomNumber: DXGKMDT_OPM_RANDOM_NUMBER = DXGKMDT_OPM_RANDOM_NUMBER(),
    public var guidInformation: GUID = GUID(),
    public var ulSequenceNumber: UInt = 0u,
    public var cbParametersSize: UInt = 0u,
    public var abParameters: UByteArray = UByteArray(4056),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DXGKMDT_OPM_COPP_COMPATIBLE_GET_INFO_PARAMETERS) return false
        if (this.rnRandomNumber != other.rnRandomNumber) return false
        if (this.guidInformation != other.guidInformation) return false
        if (this.ulSequenceNumber != other.ulSequenceNumber) return false
        if (this.cbParametersSize != other.cbParametersSize) return false
        if (!this.abParameters.contentEquals(other.abParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rnRandomNumber.hashCode()
        result = 31 * result + this.guidInformation.hashCode()
        result = 31 * result + this.ulSequenceNumber.hashCode()
        result = 31 * result + this.cbParametersSize.hashCode()
        result = 31 * result + this.abParameters.contentHashCode()
        return result
    }
}

public data class DXGKMDT_OPM_CREATE_VIDEO_OUTPUT_FOR_TARGET_PARAMETERS(
    public var AdapterLuid: LUID = LUID(),
    public var TargetId: UInt = 0u,
    public var Vos: DXGKMDT_OPM_VIDEO_OUTPUT_SEMANTICS = 0,
)

public data class DXGKMDT_OPM_ENCRYPTED_PARAMETERS(public var abEncryptedParameters: UByteArray = UByteArray(256)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DXGKMDT_OPM_ENCRYPTED_PARAMETERS) return false
        if (!this.abEncryptedParameters.contentEquals(other.abEncryptedParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.abEncryptedParameters.contentHashCode()
    }
}

public data class DXGKMDT_OPM_GET_INFO_PARAMETERS(
    public var omac: DXGKMDT_OPM_OMAC = DXGKMDT_OPM_OMAC(),
    public var rnRandomNumber: DXGKMDT_OPM_RANDOM_NUMBER = DXGKMDT_OPM_RANDOM_NUMBER(),
    public var guidInformation: GUID = GUID(),
    public var ulSequenceNumber: UInt = 0u,
    public var cbParametersSize: UInt = 0u,
    public var abParameters: UByteArray = UByteArray(4056),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DXGKMDT_OPM_GET_INFO_PARAMETERS) return false
        if (this.omac != other.omac) return false
        if (this.rnRandomNumber != other.rnRandomNumber) return false
        if (this.guidInformation != other.guidInformation) return false
        if (this.ulSequenceNumber != other.ulSequenceNumber) return false
        if (this.cbParametersSize != other.cbParametersSize) return false
        if (!this.abParameters.contentEquals(other.abParameters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.omac.hashCode()
        result = 31 * result + this.rnRandomNumber.hashCode()
        result = 31 * result + this.guidInformation.hashCode()
        result = 31 * result + this.ulSequenceNumber.hashCode()
        result = 31 * result + this.cbParametersSize.hashCode()
        result = 31 * result + this.abParameters.contentHashCode()
        return result
    }
}

public data class DXGKMDT_OPM_HDCP_KEY_SELECTION_VECTOR(public var abKeySelectionVector: UByteArray = UByteArray(5)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DXGKMDT_OPM_HDCP_KEY_SELECTION_VECTOR) return false
        if (!this.abKeySelectionVector.contentEquals(other.abKeySelectionVector)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.abKeySelectionVector.contentHashCode()
    }
}

public data class DXGKMDT_OPM_OMAC(public var abOMAC: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DXGKMDT_OPM_OMAC) return false
        if (!this.abOMAC.contentEquals(other.abOMAC)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.abOMAC.contentHashCode()
    }
}

public data class DXGKMDT_OPM_OUTPUT_ID(
    public var rnRandomNumber: DXGKMDT_OPM_RANDOM_NUMBER = DXGKMDT_OPM_RANDOM_NUMBER(),
    public var ulStatusFlags: UInt = 0u,
    public var OutputId: ULong = 0uL,
)

public data class DXGKMDT_OPM_RANDOM_NUMBER(public var abRandomNumber: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DXGKMDT_OPM_RANDOM_NUMBER) return false
        if (!this.abRandomNumber.contentEquals(other.abRandomNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.abRandomNumber.contentHashCode()
    }
}

public data class DXGKMDT_OPM_REQUESTED_INFORMATION(
    public var omac: DXGKMDT_OPM_OMAC = DXGKMDT_OPM_OMAC(),
    public var cbRequestedInformationSize: UInt = 0u,
    public var abRequestedInformation: UByteArray = UByteArray(4076),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DXGKMDT_OPM_REQUESTED_INFORMATION) return false
        if (this.omac != other.omac) return false
        if (this.cbRequestedInformationSize != other.cbRequestedInformationSize) return false
        if (!this.abRequestedInformation.contentEquals(other.abRequestedInformation)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.omac.hashCode()
        result = 31 * result + this.cbRequestedInformationSize.hashCode()
        result = 31 * result + this.abRequestedInformation.contentHashCode()
        return result
    }
}

public data class DXGKMDT_OPM_SET_ACP_AND_CGMSA_SIGNALING_PARAMETERS(
    public var ulNewTVProtectionStandard: UInt = 0u,
    public var ulAspectRatioChangeMask1: UInt = 0u,
    public var ulAspectRatioData1: UInt = 0u,
    public var ulAspectRatioChangeMask2: UInt = 0u,
    public var ulAspectRatioData2: UInt = 0u,
    public var ulAspectRatioChangeMask3: UInt = 0u,
    public var ulAspectRatioData3: UInt = 0u,
    public var ulReserved: UIntArray = UIntArray(4),
    public var ulReserved2: UIntArray = UIntArray(4),
    public var ulReserved3: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DXGKMDT_OPM_SET_ACP_AND_CGMSA_SIGNALING_PARAMETERS) return false
        if (this.ulNewTVProtectionStandard != other.ulNewTVProtectionStandard) return false
        if (this.ulAspectRatioChangeMask1 != other.ulAspectRatioChangeMask1) return false
        if (this.ulAspectRatioData1 != other.ulAspectRatioData1) return false
        if (this.ulAspectRatioChangeMask2 != other.ulAspectRatioChangeMask2) return false
        if (this.ulAspectRatioData2 != other.ulAspectRatioData2) return false
        if (this.ulAspectRatioChangeMask3 != other.ulAspectRatioChangeMask3) return false
        if (this.ulAspectRatioData3 != other.ulAspectRatioData3) return false
        if (!this.ulReserved.contentEquals(other.ulReserved)) return false
        if (!this.ulReserved2.contentEquals(other.ulReserved2)) return false
        if (this.ulReserved3 != other.ulReserved3) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulNewTVProtectionStandard.hashCode()
        result = 31 * result + this.ulAspectRatioChangeMask1.hashCode()
        result = 31 * result + this.ulAspectRatioData1.hashCode()
        result = 31 * result + this.ulAspectRatioChangeMask2.hashCode()
        result = 31 * result + this.ulAspectRatioData2.hashCode()
        result = 31 * result + this.ulAspectRatioChangeMask3.hashCode()
        result = 31 * result + this.ulAspectRatioData3.hashCode()
        result = 31 * result + this.ulReserved.contentHashCode()
        result = 31 * result + this.ulReserved2.contentHashCode()
        result = 31 * result + this.ulReserved3.hashCode()
        return result
    }
}

public data class DXGKMDT_OPM_SET_HDCP_SRM_PARAMETERS(public var ulSRMVersion: UInt = 0u)

public data class DXGKMDT_OPM_SET_PROTECTION_LEVEL_PARAMETERS(
    public var ulProtectionType: UInt = 0u,
    public var ulProtectionLevel: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var Reserved2: UInt = 0u,
)

public data class DXGKMDT_OPM_STANDARD_INFORMATION(
    public var rnRandomNumber: DXGKMDT_OPM_RANDOM_NUMBER = DXGKMDT_OPM_RANDOM_NUMBER(),
    public var ulStatusFlags: UInt = 0u,
    public var ulInformation: UInt = 0u,
    public var ulReserved: UInt = 0u,
    public var ulReserved2: UInt = 0u,
)

public data class DXGKVGPU_ESCAPE_HEAD(public var Luid: GPUP_DRIVER_ESCAPE_INPUT = GPUP_DRIVER_ESCAPE_INPUT(), public var Type: DXGKVGPU_ESCAPE_TYPE = 0)

public data class DXGKVGPU_ESCAPE_INITIALIZE(public var Header: DXGKVGPU_ESCAPE_HEAD = DXGKVGPU_ESCAPE_HEAD(), public var VmGuid: GUID = GUID())

public data class DXGKVGPU_ESCAPE_PAUSE(
    public var Header: DXGKVGPU_ESCAPE_HEAD = DXGKVGPU_ESCAPE_HEAD(),
    public var DeviceLuid: LUID = LUID(),
    public var Anonymous: DXGKVGPU_ESCAPE_PAUSE_0 = DXGKVGPU_ESCAPE_PAUSE_0(),
)

public data class DXGKVGPU_ESCAPE_PAUSE_0(public var Anonymous: DXGKVGPU_ESCAPE_PAUSE_0_0 = DXGKVGPU_ESCAPE_PAUSE_0_0(), public var Flags: UInt = 0u)

public data class DXGKVGPU_ESCAPE_PAUSE_0_0(public var _bitfield: UInt = 0u)

public data class DXGKVGPU_ESCAPE_POWERTRANSITIONCOMPLETE(public var Header: DXGKVGPU_ESCAPE_HEAD = DXGKVGPU_ESCAPE_HEAD(), public var PowerState: UInt = 0u)

public data class DXGKVGPU_ESCAPE_READ_PCI_CONFIG(
    public var Header: DXGKVGPU_ESCAPE_HEAD = DXGKVGPU_ESCAPE_HEAD(),
    public var Offset: UInt = 0u,
    public var Size: UInt = 0u,
)

public data class DXGKVGPU_ESCAPE_READ_VGPU_TYPE(public var Header: DXGKVGPU_ESCAPE_HEAD = DXGKVGPU_ESCAPE_HEAD())

public data class DXGKVGPU_ESCAPE_RELEASE(public var Header: DXGKVGPU_ESCAPE_HEAD = DXGKVGPU_ESCAPE_HEAD())

public data class DXGKVGPU_ESCAPE_RESUME(
    public var Header: DXGKVGPU_ESCAPE_HEAD = DXGKVGPU_ESCAPE_HEAD(),
    public var DeviceLuid: LUID = LUID(),
    public var Flags: UInt = 0u,
)

public data class DXGKVGPU_ESCAPE_WRITE_PCI_CONFIG(
    public var Header: DXGKVGPU_ESCAPE_HEAD = DXGKVGPU_ESCAPE_HEAD(),
    public var Offset: UInt = 0u,
    public var Size: UInt = 0u,
)

public data class DXGK_ADAPTER_PERFDATA(
    public var MemoryFrequency: ULong = 0uL,
    public var MaxMemoryFrequency: ULong = 0uL,
    public var MaxMemoryFrequencyOC: ULong = 0uL,
    public var MemoryBandwidth: ULong = 0uL,
    public var PCIEBandwidth: ULong = 0uL,
    public var FanRPM: UInt = 0u,
    public var Power: UInt = 0u,
    public var Temperature: UInt = 0u,
    public var PowerStateOverride: UByte = 0u,
)

public data class DXGK_ADAPTER_PERFDATACAPS(
    public var MaxMemoryBandwidth: ULong = 0uL,
    public var MaxPCIEBandwidth: ULong = 0uL,
    public var MaxFanRPM: UInt = 0u,
    public var TemperatureMax: UInt = 0u,
    public var TemperatureWarning: UInt = 0u,
)

public data class DXGK_BACKLIGHT_INFO(
    public var BacklightUsersetting: UShort = 0u,
    public var BacklightEffective: UShort = 0u,
    public var GammaRamp: D3DDDI_GAMMA_RAMP_RGB256x3x16 = D3DDDI_GAMMA_RAMP_RGB256x3x16(),
)

public data class DXGK_BRIGHTNESS_CAPS(public var Anonymous: DXGK_BRIGHTNESS_CAPS_0 = DXGK_BRIGHTNESS_CAPS_0())

public data class DXGK_BRIGHTNESS_CAPS_0(public var Anonymous: DXGK_BRIGHTNESS_CAPS_0_0 = DXGK_BRIGHTNESS_CAPS_0_0(), public var Value: UInt = 0u)

public data class DXGK_BRIGHTNESS_CAPS_0_0(public var _bitfield: UInt = 0u)

public data class DXGK_BRIGHTNESS_GET_NIT_RANGES_OUT(
    public var NormalRangeCount: UInt = 0u,
    public var RangeCount: UInt = 0u,
    public var PreferredMaximumBrightness: UInt = 0u,
    public var SupportedRanges: List<DXGK_BRIGHTNESS_NIT_RANGE> = List(16) { DXGK_BRIGHTNESS_NIT_RANGE() },
)

public data class DXGK_BRIGHTNESS_GET_OUT(public var CurrentBrightnessMillinits: UInt = 0u, public var TargetBrightnessMillinits: UInt = 0u)

public data class DXGK_BRIGHTNESS_NIT_RANGE(
    public var MinimumLevelMillinit: UInt = 0u,
    public var MaximumLevelMillinit: UInt = 0u,
    public var StepSizeMillinit: UInt = 0u,
)

public data class DXGK_BRIGHTNESS_SENSOR_DATA(
    public var Size: UInt = 0u,
    public var Anonymous: DXGK_BRIGHTNESS_SENSOR_DATA_0 = DXGK_BRIGHTNESS_SENSOR_DATA_0(),
    public var AlsReading: Float = 0.0f,
    public var Chromaticity: DXGK_BRIGHTNESS_SENSOR_DATA_CHROMATICITY = DXGK_BRIGHTNESS_SENSOR_DATA_CHROMATICITY(),
    public var ColorTemperature: Float = 0.0f,
)

public data class DXGK_BRIGHTNESS_SENSOR_DATA_0(public var Flags: DXGK_BRIGHTNESS_SENSOR_DATA_0_0 = DXGK_BRIGHTNESS_SENSOR_DATA_0_0(), public var ValidSensorValues: UInt = 0u)

public data class DXGK_BRIGHTNESS_SENSOR_DATA_0_0(public var _bitfield: UInt = 0u)

public data class DXGK_BRIGHTNESS_SENSOR_DATA_CHROMATICITY(public var ChromaticityX: Float = 0.0f, public var ChromaticityY: Float = 0.0f)

public data class DXGK_BRIGHTNESS_SET_IN(
    public var BrightnessMillinits: UInt = 0u,
    public var TransitionTimeMs: UInt = 0u,
    public var SensorReadings: DXGK_BRIGHTNESS_SENSOR_DATA = DXGK_BRIGHTNESS_SENSOR_DATA(),
)

public data class DXGK_BRIGHTNESS_STATE(public var Anonymous: DXGK_BRIGHTNESS_STATE_0 = DXGK_BRIGHTNESS_STATE_0())

public data class DXGK_BRIGHTNESS_STATE_0(public var Anonymous: DXGK_BRIGHTNESS_STATE_0_0 = DXGK_BRIGHTNESS_STATE_0_0(), public var Value: UInt = 0u)

public data class DXGK_BRIGHTNESS_STATE_0_0(public var _bitfield: UInt = 0u)

public data class DXGK_DISPLAY_INFORMATION(
    public var Width: UInt = 0u,
    public var Height: UInt = 0u,
    public var Pitch: UInt = 0u,
    public var ColorFormat: D3DDDIFORMAT = 0u,
    public var PhysicAddress: Long = 0L,
    public var TargetId: UInt = 0u,
    public var AcpiId: UInt = 0u,
)

public data class DXGK_ESCAPE_GPUMMUCAPS(
    public var ReadOnlyMemorySupported: Boolean = false,
    public var NoExecuteMemorySupported: Boolean = false,
    public var ZeroInPteSupported: Boolean = false,
    public var CacheCoherentMemorySupported: Boolean = false,
    public var LargePageSupported: Boolean = false,
    public var DualPteSupported: Boolean = false,
    public var AllowNonAlignedLargePageAddress: Boolean = false,
    public var VirtualAddressBitCount: UInt = 0u,
    public var PageTableLevelCount: UInt = 0u,
    public var PageTableLevelDesk: List<D3DKMT_PAGE_TABLE_LEVEL_DESC> = List(6) { D3DKMT_PAGE_TABLE_LEVEL_DESC() },
)

public data class DXGK_FAULT_ERROR_CODE(public var Anonymous: DXGK_FAULT_ERROR_CODE_0 = DXGK_FAULT_ERROR_CODE_0())

public data class DXGK_FAULT_ERROR_CODE_0(public var Anonymous1: DXGK_FAULT_ERROR_CODE_0_0 = DXGK_FAULT_ERROR_CODE_0_0(), public var Anonymous2: DXGK_FAULT_ERROR_CODE_0_1 = DXGK_FAULT_ERROR_CODE_0_1())

public data class DXGK_FAULT_ERROR_CODE_0_0(public var _bitfield: UInt = 0u)

public data class DXGK_FAULT_ERROR_CODE_0_1(public var _bitfield: UInt = 0u)

public data class DXGK_GPUCLOCKDATA(
    public var GpuFrequency: ULong = 0uL,
    public var GpuClockCounter: ULong = 0uL,
    public var CpuClockCounter: ULong = 0uL,
    public var Flags: DXGK_GPUCLOCKDATA_FLAGS = DXGK_GPUCLOCKDATA_FLAGS(),
)

public data class DXGK_GPUCLOCKDATA_FLAGS(public var Anonymous: DXGK_GPUCLOCKDATA_FLAGS_0 = DXGK_GPUCLOCKDATA_FLAGS_0())

public data class DXGK_GPUCLOCKDATA_FLAGS_0(public var Anonymous: DXGK_GPUCLOCKDATA_FLAGS_0_0 = DXGK_GPUCLOCKDATA_FLAGS_0_0(), public var Value: UInt = 0u)

public data class DXGK_GPUCLOCKDATA_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class DXGK_GPUVERSION(public var BiosVersion: UShortArray = UShortArray(32), public var GpuArchitecture: UShortArray = UShortArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DXGK_GPUVERSION) return false
        if (!this.BiosVersion.contentEquals(other.BiosVersion)) return false
        if (!this.GpuArchitecture.contentEquals(other.GpuArchitecture)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.BiosVersion.contentHashCode()
        result = 31 * result + this.GpuArchitecture.contentHashCode()
        return result
    }
}

public data class DXGK_GRAPHICSPOWER_REGISTER_INPUT_V_1_2(
    public var Version: UInt = 0u,
    public var PrivateHandle: Long = 0L,
    public var PowerNotificationCb: PDXGK_POWER_NOTIFICATION = null,
    public var RemovalNotificationCb: PDXGK_REMOVAL_NOTIFICATION = null,
    public var FStateNotificationCb: PDXGK_FSTATE_NOTIFICATION = null,
    public var InitialComponentStateCb: PDXGK_INITIAL_COMPONENT_STATE = null,
)

public data class DXGK_GRAPHICSPOWER_REGISTER_OUTPUT(
    public var DeviceHandle: Long = 0L,
    public var InitialGrfxPowerState: DEVICE_POWER_STATE = 0,
    public var SetSharedPowerComponentStateCb: PDXGK_SET_SHARED_POWER_COMPONENT_STATE = null,
    public var UnregisterCb: PDXGK_GRAPHICSPOWER_UNREGISTER = null,
)

public data class DXGK_MIRACAST_CHUNK_ID(public var Anonymous: DXGK_MIRACAST_CHUNK_ID_0 = DXGK_MIRACAST_CHUNK_ID_0(), public var Value: ULong = 0uL)

public data class DXGK_MIRACAST_CHUNK_ID_0(public var _bitfield: ULong = 0uL)

public data class DXGK_MIRACAST_CHUNK_INFO(
    public var ChunkType: DXGK_MIRACAST_CHUNK_TYPE = 0,
    public var ChunkId: DXGK_MIRACAST_CHUNK_ID = DXGK_MIRACAST_CHUNK_ID(),
    public var ProcessingTime: UInt = 0u,
    public var EncodeRate: UInt = 0u,
)

public data class DXGK_MONITORLINKINFO_CAPABILITIES(public var Anonymous: DXGK_MONITORLINKINFO_CAPABILITIES_0 = DXGK_MONITORLINKINFO_CAPABILITIES_0(), public var Value: UInt = 0u)

public data class DXGK_MONITORLINKINFO_CAPABILITIES_0(public var _bitfield: UInt = 0u)

public data class DXGK_MONITORLINKINFO_USAGEHINTS(public var Anonymous: DXGK_MONITORLINKINFO_USAGEHINTS_0 = DXGK_MONITORLINKINFO_USAGEHINTS_0(), public var Value: UInt = 0u)

public data class DXGK_MONITORLINKINFO_USAGEHINTS_0(public var _bitfield: UInt = 0u)

public data class DXGK_NODEMETADATA(
    public var EngineType: DXGK_ENGINE_TYPE = 0,
    public var FriendlyName: UShortArray = UShortArray(32),
    public var Flags: DXGK_NODEMETADATA_FLAGS = DXGK_NODEMETADATA_FLAGS(),
    public var GpuMmuSupported: Boolean = false,
    public var IoMmuSupported: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DXGK_NODEMETADATA) return false
        if (this.EngineType != other.EngineType) return false
        if (!this.FriendlyName.contentEquals(other.FriendlyName)) return false
        if (this.Flags != other.Flags) return false
        if (this.GpuMmuSupported != other.GpuMmuSupported) return false
        if (this.IoMmuSupported != other.IoMmuSupported) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.EngineType.hashCode()
        result = 31 * result + this.FriendlyName.contentHashCode()
        result = 31 * result + this.Flags.hashCode()
        result = 31 * result + this.GpuMmuSupported.hashCode()
        result = 31 * result + this.IoMmuSupported.hashCode()
        return result
    }
}

public data class DXGK_NODEMETADATA_FLAGS(public var Anonymous: DXGK_NODEMETADATA_FLAGS_0 = DXGK_NODEMETADATA_FLAGS_0())

public data class DXGK_NODEMETADATA_FLAGS_0(public var Anonymous: DXGK_NODEMETADATA_FLAGS_0_0 = DXGK_NODEMETADATA_FLAGS_0_0(), public var Value: UInt = 0u)

public data class DXGK_NODEMETADATA_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class DXGK_NODE_PERFDATA(
    public var Frequency: ULong = 0uL,
    public var MaxFrequency: ULong = 0uL,
    public var MaxFrequencyOC: ULong = 0uL,
    public var Voltage: UInt = 0u,
    public var VoltageMax: UInt = 0u,
    public var VoltageMaxOC: UInt = 0u,
    public var MaxTransitionLatency: ULong = 0uL,
)

public data class DXGK_PTE(public var Anonymous1: DXGK_PTE_0 = DXGK_PTE_0(), public var Anonymous2: DXGK_PTE_1 = DXGK_PTE_1())

public data class DXGK_PTE_0(public var Anonymous: DXGK_PTE_0_0 = DXGK_PTE_0_0(), public var Flags: ULong = 0uL)

public data class DXGK_PTE_0_0(public var _bitfield: ULong = 0uL)

public data class DXGK_PTE_1(public var PageAddress: ULong = 0uL, public var PageTableAddress: ULong = 0uL)

public data class DXGK_TARGETMODE_DETAIL_TIMING(
    public var VideoStandard: D3DKMDT_VIDEO_SIGNAL_STANDARD = 0,
    public var TimingId: UInt = 0u,
    public var DetailTiming: DISPLAYID_DETAILED_TIMING_TYPE_I = DISPLAYID_DETAILED_TIMING_TYPE_I(),
)

public data class GPUP_DRIVER_ESCAPE_INPUT(public var vfLUID: LUID = LUID())

public data class OUTPUTDUPL_CONTEXT_DEBUG_INFO(
    public var Status: OUTPUTDUPL_CONTEXT_DEBUG_STATUS = 0,
    public var ProcessID: HANDLE = 0L,
    public var AccumulatedPresents: UInt = 0u,
    public var LastPresentTime: Long = 0L,
    public var LastMouseTime: Long = 0L,
    public var ProcessName: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OUTPUTDUPL_CONTEXT_DEBUG_INFO) return false
        if (this.Status != other.Status) return false
        if (this.ProcessID != other.ProcessID) return false
        if (this.AccumulatedPresents != other.AccumulatedPresents) return false
        if (this.LastPresentTime != other.LastPresentTime) return false
        if (this.LastMouseTime != other.LastMouseTime) return false
        if (!this.ProcessName.contentEquals(other.ProcessName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Status.hashCode()
        result = 31 * result + this.ProcessID.hashCode()
        result = 31 * result + this.AccumulatedPresents.hashCode()
        result = 31 * result + this.LastPresentTime.hashCode()
        result = 31 * result + this.LastMouseTime.hashCode()
        result = 31 * result + this.ProcessName.contentHashCode()
        return result
    }
}

public data class _NT_D3DLINEPATTERN(public var wRepeatFactor: UShort = 0u, public var wLinePattern: UShort = 0u)
