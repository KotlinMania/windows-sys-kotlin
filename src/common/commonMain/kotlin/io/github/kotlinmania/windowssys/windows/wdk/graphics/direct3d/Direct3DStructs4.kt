@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rectl
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState

public data class D3dkmtWddm13Caps(
    public var anonymous: D3dkmtWddm13Caps0 = D3dkmtWddm13Caps0(),
)

public data class D3dkmtWddm13Caps0(
    public var anonymous: D3dkmtWddm13Caps00 = D3dkmtWddm13Caps00(),
    public var value: UInt = 0u,
)

public data class D3dkmtWddm13Caps00(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtWddm20Caps(
    public var anonymous: D3dkmtWddm20Caps0 = D3dkmtWddm20Caps0(),
)

public data class D3dkmtWddm20Caps0(
    public var anonymous: D3dkmtWddm20Caps00 = D3dkmtWddm20Caps00(),
    public var value: UInt = 0u,
)

public data class D3dkmtWddm20Caps00(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtWddm27Caps(
    public var anonymous: D3dkmtWddm27Caps0 = D3dkmtWddm27Caps0(),
)

public data class D3dkmtWddm27Caps0(
    public var anonymous: D3dkmtWddm27Caps00 = D3dkmtWddm27Caps00(),
    public var value: UInt = 0u,
)

public data class D3dkmtWddm27Caps00(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtWddm29Caps(
    public var anonymous: D3dkmtWddm29Caps0 = D3dkmtWddm29Caps0(),
)

public data class D3dkmtWddm29Caps0(
    public var anonymous: D3dkmtWddm29Caps00 = D3dkmtWddm29Caps00(),
    public var value: UInt = 0u,
)

public data class D3dkmtWddm29Caps00(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtWddm30Caps(
    public var anonymous: D3dkmtWddm30Caps0 = D3dkmtWddm30Caps0(),
)

public data class D3dkmtWddm30Caps0(
    public var anonymous: D3dkmtWddm30Caps00 = D3dkmtWddm30Caps00(),
    public var value: UInt = 0u,
)

public data class D3dkmtWddm30Caps00(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtWddm31Caps(
    public var anonymous: D3dkmtWddm31Caps0 = D3dkmtWddm31Caps0(),
)

public data class D3dkmtWddm31Caps0(
    public var anonymous: D3dkmtWddm31Caps00 = D3dkmtWddm31Caps00(),
    public var value: UInt = 0u,
)

public data class D3dkmtWddm31Caps00(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtWorkingsetflags(
    public var bitfield: UInt = 0u,
)

public data class D3dkmtWorkingsetinfo(
    public var flags: D3dkmtWorkingsetflags = D3dkmtWorkingsetflags(),
    public var minimumWorkingSetPercentile: UInt = 0u,
    public var maximumWorkingSetPercentile: UInt = 0u,
)

public data class D3dkmtWsaumdimagename(
    public var wsaUmdImageName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtWsaumdimagename) return false
        if (!this.wsaUmdImageName.contentEquals(other.wsaUmdImageName)) return false
        return true
    }

    override fun hashCode(): Int = this.wsaUmdImageName.contentHashCode()
}

public data class D3dkmtXbox(
    public var isXBOX: Bool = 0,
)

public data class D3dlinepattern(
    public var wRepeatFactor: UShort = 0u,
    public var wLinePattern: UShort = 0u,
)

public data class D3dnthalClippedtrianglefan(
    public var firstVertexOffset: UInt = 0u,
    public var dwEdgeFlags: UInt = 0u,
    public var primitiveCount: UInt = 0u,
)

public data class D3dnthalContextdestroyalldata(
    public var dwPID: UInt = 0u,
    public var ddrval: Hresult = 0,
)

public data class D3dnthalContextdestroydata(
    public var dwhContext: Int = 0,
    public var ddrval: Hresult = 0,
)

public class D3dnthalD3ddx6extendedcaps(
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

public class D3dnthalD3dextendedcaps(
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

public data class D3dnthalDp2adddirtyrect(
    public var dwSurface: UInt = 0u,
    public var rDirtyArea: Rectl = Rectl(),
)

public data class D3dnthalDp2blt(
    public var dwSource: UInt = 0u,
    public var rSource: Rectl = Rectl(),
    public var dwSourceMipLevel: UInt = 0u,
    public var dwDest: UInt = 0u,
    public var rDest: Rectl = Rectl(),
    public var dwDestMipLevel: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class D3dnthalDp2clear(
    public var dwFlags: UInt = 0u,
    public var dwFillColor: UInt = 0u,
    public var dvFillDepth: Float = 0.0f,
    public var dwFillStencil: UInt = 0u,
    public var rects: List<Rect> = List(1) { Rect() },
)

public data class D3dnthalDp2colorfill(
    public var dwSurface: UInt = 0u,
    public var rRect: Rectl = Rectl(),
    public var color: UInt = 0u,
)

public data class D3dnthalDp2command(
    public var bCommand: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var anonymous: D3dnthalDp2command0 = D3dnthalDp2command0(),
)

public data class D3dnthalDp2command0(
    public var wPrimitiveCount: UShort = 0u,
    public var wStateCount: UShort = 0u,
)

public data class D3dnthalDp2createlight(
    public var dwIndex: UInt = 0u,
)

public data class D3dnthalDp2createpixelshader(
    public var dwHandle: UInt = 0u,
    public var dwCodeSize: UInt = 0u,
)

public data class D3dnthalDp2createvertexshader(
    public var dwHandle: UInt = 0u,
    public var dwDeclSize: UInt = 0u,
    public var dwCodeSize: UInt = 0u,
)

public data class D3dnthalDp2createvertexshaderdecl(
    public var dwHandle: UInt = 0u,
    public var dwNumVertexElements: UInt = 0u,
)

public data class D3dnthalDp2createvertexshaderfunc(
    public var dwHandle: UInt = 0u,
    public var dwSize: UInt = 0u,
)

public data class D3dnthalDp2deletequery(
    public var dwQueryID: UInt = 0u,
)

public data class D3dnthalDp2drawrectpatch(
    public var handle: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class D3dnthalDp2drawtripatch(
    public var handle: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class D3dnthalDp2ext(
    public var dwExtToken: UInt = 0u,
    public var dwSize: UInt = 0u,
)

public data class D3dnthalDp2indexedlinelist(
    public var wV1: UShort = 0u,
    public var wV2: UShort = 0u,
)

public data class D3dnthalDp2indexedlinestrip(
    public var wV: UShortArray = UShortArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dnthalDp2indexedlinestrip) return false
        if (!this.wV.contentEquals(other.wV)) return false
        return true
    }

    override fun hashCode(): Int = this.wV.contentHashCode()
}

public data class D3dnthalDp2indexedtrianglefan(
    public var wV: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dnthalDp2indexedtrianglefan) return false
        if (!this.wV.contentEquals(other.wV)) return false
        return true
    }

    override fun hashCode(): Int = this.wV.contentHashCode()
}

public data class D3dnthalDp2indexedtrianglelist(
    public var wV1: UShort = 0u,
    public var wV2: UShort = 0u,
    public var wV3: UShort = 0u,
    public var wFlags: UShort = 0u,
)

public data class D3dnthalDp2indexedtrianglelist2(
    public var wV1: UShort = 0u,
    public var wV2: UShort = 0u,
    public var wV3: UShort = 0u,
)

public data class D3dnthalDp2indexedtrianglestrip(
    public var wV: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dnthalDp2indexedtrianglestrip) return false
        if (!this.wV.contentEquals(other.wV)) return false
        return true
    }

    override fun hashCode(): Int = this.wV.contentHashCode()
}

public data class D3dnthalDp2issuequery(
    public var dwQueryID: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class D3dnthalDp2linelist(
    public var wVStart: UShort = 0u,
)

public data class D3dnthalDp2linestrip(
    public var wVStart: UShort = 0u,
)

public data class D3dnthalDp2pixelshader(
    public var dwHandle: UInt = 0u,
)

public data class D3dnthalDp2points(
    public var wCount: UShort = 0u,
    public var wVStart: UShort = 0u,
)

public data class D3dnthalDp2response(
    public var bCommand: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var wStateCount: UShort = 0u,
    public var dwTotalSize: UInt = 0u,
)

public data class D3dnthalDp2responsequery(
    public var dwQueryID: UInt = 0u,
    public var dwSize: UInt = 0u,
)

public data class D3dnthalDp2setclipplane(
    public var dwIndex: UInt = 0u,
    public var plane: FloatArray = FloatArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dnthalDp2setclipplane) return false
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

public data class D3dnthalDp2setconvolutionkernelmono(
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class D3dnthalDp2setdepthstencil(
    public var hZBuffer: UInt = 0u,
)

public data class D3dnthalDp2setindices(
    public var dwVBHandle: UInt = 0u,
    public var dwStride: UInt = 0u,
)

public data class D3dnthalDp2setlight(
    public var dwIndex: UInt = 0u,
    public var anonymous: D3dnthalDp2setlight0 = D3dnthalDp2setlight0(),
)

public data class D3dnthalDp2setlight0(
    public var lightData: UInt = 0u,
    public var dwDataType: UInt = 0u,
)

public data class D3dnthalDp2setpalette(
    public var dwPaletteHandle: UInt = 0u,
    public var dwPaletteFlags: UInt = 0u,
    public var dwSurfaceHandle: UInt = 0u,
)

public data class D3dnthalDp2setpixelshaderconst(
    public var dwRegister: UInt = 0u,
    public var dwCount: UInt = 0u,
)

public data class D3dnthalDp2setpriority(
    public var dwDDDestSurface: UInt = 0u,
    public var dwPriority: UInt = 0u,
)

public data class D3dnthalDp2setrendertarget(
    public var hRenderTarget: UInt = 0u,
    public var hZBuffer: UInt = 0u,
)

public data class D3dnthalDp2setrendertarget2(
    public var rTIndex: UInt = 0u,
    public var hRenderTarget: UInt = 0u,
)

public data class D3dnthalDp2setstreamsource(
    public var dwStream: UInt = 0u,
    public var dwVBHandle: UInt = 0u,
    public var dwStride: UInt = 0u,
)

public data class D3dnthalDp2setstreamsource2(
    public var dwStream: UInt = 0u,
    public var dwVBHandle: UInt = 0u,
    public var dwOffset: UInt = 0u,
    public var dwStride: UInt = 0u,
)

public data class D3dnthalDp2setstreamsourcefreq(
    public var dwStream: UInt = 0u,
    public var dwDivider: UInt = 0u,
)

public data class D3dnthalDp2setstreamsourceum(
    public var dwStream: UInt = 0u,
    public var dwStride: UInt = 0u,
)

public data class D3dnthalDp2settexlod(
    public var dwDDSurface: UInt = 0u,
    public var dwLOD: UInt = 0u,
)

public data class D3dnthalDp2setvertexshaderconst(
    public var dwRegister: UInt = 0u,
    public var dwCount: UInt = 0u,
)

public data class D3dnthalDp2startvertex(
    public var wVStart: UShort = 0u,
)

public data class D3dnthalDp2surfaceblt(
    public var dwSource: UInt = 0u,
    public var rSource: Rectl = Rectl(),
    public var dwSourceMipLevel: UInt = 0u,
    public var dwDest: UInt = 0u,
    public var rDest: Rectl = Rectl(),
    public var dwDestMipLevel: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class D3dnthalDp2texblt(
    public var dwDDDestSurface: UInt = 0u,
    public var dwDDSrcSurface: UInt = 0u,
    public var pDest: Point = Point(),
    public var rSrc: Rectl = Rectl(),
    public var dwFlags: UInt = 0u,
)

public data class D3dnthalDp2texturestagestate(
    public var wStage: UShort = 0u,
    public var tSState: UShort = 0u,
    public var dwValue: UInt = 0u,
)

public data class D3dnthalDp2trianglefan(
    public var wVStart: UShort = 0u,
)

public data class D3dnthalDp2trianglefanImm(
    public var dwEdgeFlags: UInt = 0u,
)

public data class D3dnthalDp2trianglelist(
    public var wVStart: UShort = 0u,
)

public data class D3dnthalDp2trianglestrip(
    public var wVStart: UShort = 0u,
)

public data class D3dnthalDp2updatepalette(
    public var dwPaletteHandle: UInt = 0u,
    public var wStartIndex: UShort = 0u,
    public var wNumEntries: UShort = 0u,
)

public data class D3dnthalDp2vertexshader(
    public var dwHandle: UInt = 0u,
)

public data class D3dnthalDp2viewportinfo(
    public var dwX: UInt = 0u,
    public var dwY: UInt = 0u,
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
)

public data class D3dnthalDp2winfo(
    public var dvWNear: Float = 0.0f,
    public var dvWFar: Float = 0.0f,
)

public data class D3dnthalDp2zrange(
    public var dvMinZ: Float = 0.0f,
    public var dvMaxZ: Float = 0.0f,
)

public data class D3dnthalScenecapturedata(
    public var dwhContext: Int = 0,
    public var dwFlag: UInt = 0u,
    public var ddrval: Hresult = 0,
)

public data class D3dnthalTexturecreatedata(
    public var dwhContext: Int = 0,
    public var hDDS: Handle = null,
    public var dwHandle: Int = 0,
    public var ddrval: Hresult = 0,
)

public data class D3dnthalTexturedestroydata(
    public var dwhContext: Int = 0,
    public var dwHandle: Int = 0,
    public var ddrval: Hresult = 0,
)

public data class D3dnthalTexturegetsurfdata(
    public var dwhContext: Int = 0,
    public var hDDS: Handle = null,
    public var dwHandle: Int = 0,
    public var ddrval: Hresult = 0,
)

public data class D3dnthalTextureswapdata(
    public var dwhContext: Int = 0,
    public var dwHandle1: Int = 0,
    public var dwHandle2: Int = 0,
    public var ddrval: Hresult = 0,
)

public data class D3dnthalValidatetexturestagestatedata(
    public var dwhContext: Int = 0,
    public var dwFlags: UInt = 0u,
    public var dwReserved: Int = 0,
    public var dwNumPasses: UInt = 0u,
    public var ddrval: Hresult = 0,
)

public data class DdntDeferredAgpAwareData(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
)

public data class DdntDxversion(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
    public var dwDXVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class DdntFreeDeferredAgpData(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
    public var dwProcessId: UInt = 0u,
)

public data class DdntGetadaptergroupdata(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
    public var ulUniqueAdapterGroupId: Int = 0,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
)

public data class DdntGetd3dquerycountdata(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
    public var dwNumQueries: UInt = 0u,
)

public data class DdntGetddiversiondata(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
    public var dwDXVersion: UInt = 0u,
    public var dwDDIVersion: UInt = 0u,
)

public data class DdntGetdriverinfo2data(
    public var dwReserved: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwExpectedSize: UInt = 0u,
)

public data class DdntGetextendedmodecountdata(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
    public var dwModeCount: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class DdntGetformatcountdata(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
    public var dwFormatCount: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class DdDeferredAgpAwareData(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
)

public data class DdDxversion(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
    public var dwDXVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class DdFreeDeferredAgpData(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
    public var dwProcessId: UInt = 0u,
)

public data class DdGetadaptergroupdata(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
    public var ulUniqueAdapterGroupId: Int = 0,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
)

public data class DdGetd3dquerycountdata(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
    public var dwNumQueries: UInt = 0u,
)

public data class DdGetddiversiondata(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
    public var dwDXVersion: UInt = 0u,
    public var dwDDIVersion: UInt = 0u,
)

public data class DdGetdriverinfo2data(
    public var dwReserved: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwExpectedSize: UInt = 0u,
)

public data class DdGetextendedmodecountdata(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
    public var dwModeCount: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class DdGetformatcountdata(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
    public var dwFormatCount: UInt = 0u,
    public var dwReserved: UInt = 0u,
)

public data class DisplayidDetailedTimingTypeI(
    public var anonymous1: DisplayidDetailedTimingTypeI0 = DisplayidDetailedTimingTypeI0(),
    public var horizontalActivePixels: UShort = 0u,
    public var horizontalBlankPixels: UShort = 0u,
    public var anonymous2: DisplayidDetailedTimingTypeI1 = DisplayidDetailedTimingTypeI1(),
    public var horizontalSyncWidth: UShort = 0u,
    public var verticalActiveLines: UShort = 0u,
    public var verticalBlankLines: UShort = 0u,
    public var anonymous3: DisplayidDetailedTimingTypeI2 = DisplayidDetailedTimingTypeI2(),
    public var verticalSyncWidth: UShort = 0u,
)

public data class DisplayidDetailedTimingTypeI0(
    public var bitfield: UInt = 0u,
)

public data class DisplayidDetailedTimingTypeI1(
    public var bitfield: UShort = 0u,
)

public data class DisplayidDetailedTimingTypeI2(
    public var bitfield: UShort = 0u,
)

public data class DxgkargSetpalette(
    public var vidPnSourceId: UInt = 0u,
    public var firstEntry: UInt = 0u,
    public var numEntries: UInt = 0u,
    public var pLookupTable: D3dkmdtPalettedata? = null,
)

public data class DxgkmdtOpmAcpAndCgmsaSignaling(
    public var rnRandomNumber: DxgkmdtOpmRandomNumber = DxgkmdtOpmRandomNumber(),
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
        if (other !is DxgkmdtOpmAcpAndCgmsaSignaling) return false
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

public data class DxgkmdtOpmActualOutputFormat(
    public var rnRandomNumber: DxgkmdtOpmRandomNumber = DxgkmdtOpmRandomNumber(),
    public var ulStatusFlags: UInt = 0u,
    public var ulDisplayWidth: UInt = 0u,
    public var ulDisplayHeight: UInt = 0u,
    public var ifInterleaveFormat: DxgkmdtOpmInterleaveFormat = 0,
    public var d3dFormat: UInt = 0u,
    public var ulFrequencyNumerator: UInt = 0u,
    public var ulFrequencyDenominator: UInt = 0u,
)

public data class DxgkmdtOpmConfigureParameters(
    public var omac: DxgkmdtOpmOmac = DxgkmdtOpmOmac(),
    public var guidSetting: Guid = Guid(),
    public var ulSequenceNumber: UInt = 0u,
    public var cbParametersSize: UInt = 0u,
    public var abParameters: UByteArray = UByteArray(4056),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DxgkmdtOpmConfigureParameters) return false
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

public data class DxgkmdtOpmConnectedHdcpDeviceInformation(
    public var rnRandomNumber: DxgkmdtOpmRandomNumber = DxgkmdtOpmRandomNumber(),
    public var ulStatusFlags: UInt = 0u,
    public var ulHDCPFlags: UInt = 0u,
    public var ksvB: DxgkmdtOpmHdcpKeySelectionVector = DxgkmdtOpmHdcpKeySelectionVector(),
    public var reserved: UByteArray = UByteArray(11),
    public var reserved2: UByteArray = UByteArray(16),
    public var reserved3: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DxgkmdtOpmConnectedHdcpDeviceInformation) return false
        if (this.rnRandomNumber != other.rnRandomNumber) return false
        if (this.ulStatusFlags != other.ulStatusFlags) return false
        if (this.ulHDCPFlags != other.ulHDCPFlags) return false
        if (this.ksvB != other.ksvB) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (!this.reserved3.contentEquals(other.reserved3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rnRandomNumber.hashCode()
        result = 31 * result + this.ulStatusFlags.hashCode()
        result = 31 * result + this.ulHDCPFlags.hashCode()
        result = 31 * result + this.ksvB.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.reserved3.contentHashCode()
        return result
    }
}

public data class DxgkmdtOpmCoppCompatibleGetInfoParameters(
    public var rnRandomNumber: DxgkmdtOpmRandomNumber = DxgkmdtOpmRandomNumber(),
    public var guidInformation: Guid = Guid(),
    public var ulSequenceNumber: UInt = 0u,
    public var cbParametersSize: UInt = 0u,
    public var abParameters: UByteArray = UByteArray(4056),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DxgkmdtOpmCoppCompatibleGetInfoParameters) return false
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

public data class DxgkmdtOpmCreateVideoOutputForTargetParameters(
    public var adapterLuid: Luid = Luid(),
    public var targetId: UInt = 0u,
    public var vos: DxgkmdtOpmVideoOutputSemantics = 0,
)

public data class DxgkmdtOpmEncryptedParameters(
    public var abEncryptedParameters: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DxgkmdtOpmEncryptedParameters) return false
        if (!this.abEncryptedParameters.contentEquals(other.abEncryptedParameters)) return false
        return true
    }

    override fun hashCode(): Int = this.abEncryptedParameters.contentHashCode()
}

public data class DxgkmdtOpmGetInfoParameters(
    public var omac: DxgkmdtOpmOmac = DxgkmdtOpmOmac(),
    public var rnRandomNumber: DxgkmdtOpmRandomNumber = DxgkmdtOpmRandomNumber(),
    public var guidInformation: Guid = Guid(),
    public var ulSequenceNumber: UInt = 0u,
    public var cbParametersSize: UInt = 0u,
    public var abParameters: UByteArray = UByteArray(4056),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DxgkmdtOpmGetInfoParameters) return false
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

public data class DxgkmdtOpmHdcpKeySelectionVector(
    public var abKeySelectionVector: UByteArray = UByteArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DxgkmdtOpmHdcpKeySelectionVector) return false
        if (!this.abKeySelectionVector.contentEquals(other.abKeySelectionVector)) return false
        return true
    }

    override fun hashCode(): Int = this.abKeySelectionVector.contentHashCode()
}

public data class DxgkmdtOpmOmac(
    public var abOMAC: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DxgkmdtOpmOmac) return false
        if (!this.abOMAC.contentEquals(other.abOMAC)) return false
        return true
    }

    override fun hashCode(): Int = this.abOMAC.contentHashCode()
}

public data class DxgkmdtOpmOutputId(
    public var rnRandomNumber: DxgkmdtOpmRandomNumber = DxgkmdtOpmRandomNumber(),
    public var ulStatusFlags: UInt = 0u,
    public var outputId: ULong = 0uL,
)

public data class DxgkmdtOpmRandomNumber(
    public var abRandomNumber: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DxgkmdtOpmRandomNumber) return false
        if (!this.abRandomNumber.contentEquals(other.abRandomNumber)) return false
        return true
    }

    override fun hashCode(): Int = this.abRandomNumber.contentHashCode()
}

public data class DxgkmdtOpmRequestedInformation(
    public var omac: DxgkmdtOpmOmac = DxgkmdtOpmOmac(),
    public var cbRequestedInformationSize: UInt = 0u,
    public var abRequestedInformation: UByteArray = UByteArray(4076),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DxgkmdtOpmRequestedInformation) return false
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

public data class DxgkmdtOpmSetAcpAndCgmsaSignalingParameters(
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
        if (other !is DxgkmdtOpmSetAcpAndCgmsaSignalingParameters) return false
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

public data class DxgkmdtOpmSetHdcpSrmParameters(
    public var ulSRMVersion: UInt = 0u,
)

public data class DxgkmdtOpmSetProtectionLevelParameters(
    public var ulProtectionType: UInt = 0u,
    public var ulProtectionLevel: UInt = 0u,
    public var reserved: UInt = 0u,
    public var reserved2: UInt = 0u,
)

public data class DxgkmdtOpmStandardInformation(
    public var rnRandomNumber: DxgkmdtOpmRandomNumber = DxgkmdtOpmRandomNumber(),
    public var ulStatusFlags: UInt = 0u,
    public var ulInformation: UInt = 0u,
    public var ulReserved: UInt = 0u,
    public var ulReserved2: UInt = 0u,
)

public data class DxgkvgpuEscapeHead(
    public var luid: GpupDriverEscapeInput = GpupDriverEscapeInput(),
    public var type: DxgkvgpuEscapeType = 0,
)

public data class DxgkvgpuEscapeInitialize(
    public var header: DxgkvgpuEscapeHead = DxgkvgpuEscapeHead(),
    public var vmGuid: Guid = Guid(),
)

public data class DxgkvgpuEscapePause(
    public var header: DxgkvgpuEscapeHead = DxgkvgpuEscapeHead(),
    public var deviceLuid: Luid = Luid(),
    public var anonymous: DxgkvgpuEscapePause0 = DxgkvgpuEscapePause0(),
)

public data class DxgkvgpuEscapePause0(
    public var anonymous: DxgkvgpuEscapePause00 = DxgkvgpuEscapePause00(),
    public var flags: UInt = 0u,
)

public data class DxgkvgpuEscapePause00(
    public var bitfield: UInt = 0u,
)

public data class DxgkvgpuEscapePowertransitioncomplete(
    public var header: DxgkvgpuEscapeHead = DxgkvgpuEscapeHead(),
    public var powerState: UInt = 0u,
)

public data class DxgkvgpuEscapeReadPciConfig(
    public var header: DxgkvgpuEscapeHead = DxgkvgpuEscapeHead(),
    public var offset: UInt = 0u,
    public var size: UInt = 0u,
)

public data class DxgkvgpuEscapeReadVgpuType(
    public var header: DxgkvgpuEscapeHead = DxgkvgpuEscapeHead(),
)

public data class DxgkvgpuEscapeRelease(
    public var header: DxgkvgpuEscapeHead = DxgkvgpuEscapeHead(),
)

public data class DxgkvgpuEscapeResume(
    public var header: DxgkvgpuEscapeHead = DxgkvgpuEscapeHead(),
    public var deviceLuid: Luid = Luid(),
    public var flags: UInt = 0u,
)

public data class DxgkvgpuEscapeWritePciConfig(
    public var header: DxgkvgpuEscapeHead = DxgkvgpuEscapeHead(),
    public var offset: UInt = 0u,
    public var size: UInt = 0u,
)

public data class DxgkAdapterPerfdata(
    public var memoryFrequency: ULong = 0uL,
    public var maxMemoryFrequency: ULong = 0uL,
    public var maxMemoryFrequencyOC: ULong = 0uL,
    public var memoryBandwidth: ULong = 0uL,
    public var pCIEBandwidth: ULong = 0uL,
    public var fanRPM: UInt = 0u,
    public var power: UInt = 0u,
    public var temperature: UInt = 0u,
    public var powerStateOverride: UByte = 0u,
)

public data class DxgkAdapterPerfdatacaps(
    public var maxMemoryBandwidth: ULong = 0uL,
    public var maxPCIEBandwidth: ULong = 0uL,
    public var maxFanRPM: UInt = 0u,
    public var temperatureMax: UInt = 0u,
    public var temperatureWarning: UInt = 0u,
)

public data class DxgkBacklightInfo(
    public var backlightUsersetting: UShort = 0u,
    public var backlightEffective: UShort = 0u,
    public var gammaRamp: D3dddiGammaRampRgb256x3x16 = D3dddiGammaRampRgb256x3x16(),
)

public data class DxgkBrightnessCaps(
    public var anonymous: DxgkBrightnessCaps0 = DxgkBrightnessCaps0(),
)

public data class DxgkBrightnessCaps0(
    public var anonymous: DxgkBrightnessCaps00 = DxgkBrightnessCaps00(),
    public var value: UInt = 0u,
)

public data class DxgkBrightnessCaps00(
    public var bitfield: UInt = 0u,
)

public data class DxgkBrightnessGetNitRangesOut(
    public var normalRangeCount: UInt = 0u,
    public var rangeCount: UInt = 0u,
    public var preferredMaximumBrightness: UInt = 0u,
    public var supportedRanges: List<DxgkBrightnessNitRange> = List(16) { DxgkBrightnessNitRange() },
)

public data class DxgkBrightnessGetOut(
    public var currentBrightnessMillinits: UInt = 0u,
    public var targetBrightnessMillinits: UInt = 0u,
)

public data class DxgkBrightnessNitRange(
    public var minimumLevelMillinit: UInt = 0u,
    public var maximumLevelMillinit: UInt = 0u,
    public var stepSizeMillinit: UInt = 0u,
)

public data class DxgkBrightnessSensorData(
    public var size: UInt = 0u,
    public var anonymous: DxgkBrightnessSensorData0 = DxgkBrightnessSensorData0(),
    public var alsReading: Float = 0.0f,
    public var chromaticity: DxgkBrightnessSensorDataChromaticity = DxgkBrightnessSensorDataChromaticity(),
    public var colorTemperature: Float = 0.0f,
)

public data class DxgkBrightnessSensorData0(
    public var flags: DxgkBrightnessSensorData00 = DxgkBrightnessSensorData00(),
    public var validSensorValues: UInt = 0u,
)

public data class DxgkBrightnessSensorData00(
    public var bitfield: UInt = 0u,
)

public data class DxgkBrightnessSensorDataChromaticity(
    public var chromaticityX: Float = 0.0f,
    public var chromaticityY: Float = 0.0f,
)

public data class DxgkBrightnessSetIn(
    public var brightnessMillinits: UInt = 0u,
    public var transitionTimeMs: UInt = 0u,
    public var sensorReadings: DxgkBrightnessSensorData = DxgkBrightnessSensorData(),
)

public data class DxgkBrightnessState(
    public var anonymous: DxgkBrightnessState0 = DxgkBrightnessState0(),
)

public data class DxgkBrightnessState0(
    public var anonymous: DxgkBrightnessState00 = DxgkBrightnessState00(),
    public var value: UInt = 0u,
)

public data class DxgkBrightnessState00(
    public var bitfield: UInt = 0u,
)

public data class DxgkDisplayInformation(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var pitch: UInt = 0u,
    public var colorFormat: D3dddiformat = 0u,
    public var physicAddress: Long = 0L,
    public var targetId: UInt = 0u,
    public var acpiId: UInt = 0u,
)

public data class DxgkEscapeGpummucaps(
    public var readOnlyMemorySupported: Boolean = false,
    public var noExecuteMemorySupported: Boolean = false,
    public var zeroInPteSupported: Boolean = false,
    public var cacheCoherentMemorySupported: Boolean = false,
    public var largePageSupported: Boolean = false,
    public var dualPteSupported: Boolean = false,
    public var allowNonAlignedLargePageAddress: Boolean = false,
    public var virtualAddressBitCount: UInt = 0u,
    public var pageTableLevelCount: UInt = 0u,
    public var pageTableLevelDesk: List<D3dkmtPageTableLevelDesc> = List(6) { D3dkmtPageTableLevelDesc() },
)

public data class DxgkFaultErrorCode(
    public var anonymous: DxgkFaultErrorCode0 = DxgkFaultErrorCode0(),
)

public data class DxgkFaultErrorCode0(
    public var anonymous1: DxgkFaultErrorCode00 = DxgkFaultErrorCode00(),
    public var anonymous2: DxgkFaultErrorCode01 = DxgkFaultErrorCode01(),
)

public data class DxgkFaultErrorCode00(
    public var bitfield: UInt = 0u,
)

public data class DxgkFaultErrorCode01(
    public var bitfield: UInt = 0u,
)

public data class DxgkGpuclockdata(
    public var gpuFrequency: ULong = 0uL,
    public var gpuClockCounter: ULong = 0uL,
    public var cpuClockCounter: ULong = 0uL,
    public var flags: DxgkGpuclockdataFlags = DxgkGpuclockdataFlags(),
)

public data class DxgkGpuclockdataFlags(
    public var anonymous: DxgkGpuclockdataFlags0 = DxgkGpuclockdataFlags0(),
)

public data class DxgkGpuclockdataFlags0(
    public var anonymous: DxgkGpuclockdataFlags00 = DxgkGpuclockdataFlags00(),
    public var value: UInt = 0u,
)

public data class DxgkGpuclockdataFlags00(
    public var bitfield: UInt = 0u,
)

public data class DxgkGpuversion(
    public var biosVersion: UShortArray = UShortArray(32),
    public var gpuArchitecture: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DxgkGpuversion) return false
        if (!this.biosVersion.contentEquals(other.biosVersion)) return false
        if (!this.gpuArchitecture.contentEquals(other.gpuArchitecture)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.biosVersion.contentHashCode()
        result = 31 * result + this.gpuArchitecture.contentHashCode()
        return result
    }
}

public data class DxgkGraphicspowerRegisterInputV12(
    public var version: UInt = 0u,
    public var privateHandle: COpaquePointer? = null,
    public var powerNotificationCb: PdxgkPowerNotification = null,
    public var removalNotificationCb: PdxgkRemovalNotification = null,
    public var fStateNotificationCb: PdxgkFstateNotification = null,
    public var initialComponentStateCb: PdxgkInitialComponentState = null,
)

public data class DxgkGraphicspowerRegisterOutput(
    public var deviceHandle: COpaquePointer? = null,
    public var initialGrfxPowerState: DevicePowerState = 0,
    public var setSharedPowerComponentStateCb: PdxgkSetSharedPowerComponentState = null,
    public var unregisterCb: PdxgkGraphicspowerUnregister = null,
)

public data class DxgkMiracastChunkId(
    public var anonymous: DxgkMiracastChunkId0 = DxgkMiracastChunkId0(),
    public var value: ULong = 0uL,
)

public data class DxgkMiracastChunkId0(
    public var bitfield: ULong = 0uL,
)

public data class DxgkMiracastChunkInfo(
    public var chunkType: DxgkMiracastChunkType = 0,
    public var chunkId: DxgkMiracastChunkId = DxgkMiracastChunkId(),
    public var processingTime: UInt = 0u,
    public var encodeRate: UInt = 0u,
)

public data class DxgkMonitorlinkinfoCapabilities(
    public var anonymous: DxgkMonitorlinkinfoCapabilities0 = DxgkMonitorlinkinfoCapabilities0(),
    public var value: UInt = 0u,
)

public data class DxgkMonitorlinkinfoCapabilities0(
    public var bitfield: UInt = 0u,
)

public data class DxgkMonitorlinkinfoUsagehints(
    public var anonymous: DxgkMonitorlinkinfoUsagehints0 = DxgkMonitorlinkinfoUsagehints0(),
    public var value: UInt = 0u,
)

public data class DxgkMonitorlinkinfoUsagehints0(
    public var bitfield: UInt = 0u,
)

public data class DxgkNodemetadata(
    public var engineType: DxgkEngineType = 0,
    public var friendlyName: UShortArray = UShortArray(32),
    public var flags: DxgkNodemetadataFlags = DxgkNodemetadataFlags(),
    public var gpuMmuSupported: Boolean = false,
    public var ioMmuSupported: Boolean = false,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DxgkNodemetadata) return false
        if (this.engineType != other.engineType) return false
        if (!this.friendlyName.contentEquals(other.friendlyName)) return false
        if (this.flags != other.flags) return false
        if (this.gpuMmuSupported != other.gpuMmuSupported) return false
        if (this.ioMmuSupported != other.ioMmuSupported) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.engineType.hashCode()
        result = 31 * result + this.friendlyName.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.gpuMmuSupported.hashCode()
        result = 31 * result + this.ioMmuSupported.hashCode()
        return result
    }
}

public data class DxgkNodemetadataFlags(
    public var anonymous: DxgkNodemetadataFlags0 = DxgkNodemetadataFlags0(),
)

public data class DxgkNodemetadataFlags0(
    public var anonymous: DxgkNodemetadataFlags00 = DxgkNodemetadataFlags00(),
    public var value: UInt = 0u,
)

public data class DxgkNodemetadataFlags00(
    public var bitfield: UInt = 0u,
)

public data class DxgkNodePerfdata(
    public var frequency: ULong = 0uL,
    public var maxFrequency: ULong = 0uL,
    public var maxFrequencyOC: ULong = 0uL,
    public var voltage: UInt = 0u,
    public var voltageMax: UInt = 0u,
    public var voltageMaxOC: UInt = 0u,
    public var maxTransitionLatency: ULong = 0uL,
)

public data class DxgkPte(
    public var anonymous1: DxgkPte0 = DxgkPte0(),
    public var anonymous2: DxgkPte1 = DxgkPte1(),
)

public data class DxgkPte0(
    public var anonymous: DxgkPte00 = DxgkPte00(),
    public var flags: ULong = 0uL,
)

public data class DxgkPte00(
    public var bitfield: ULong = 0uL,
)

public data class DxgkPte1(
    public var pageAddress: ULong = 0uL,
    public var pageTableAddress: ULong = 0uL,
)

public data class DxgkTargetmodeDetailTiming(
    public var videoStandard: D3dkmdtVideoSignalStandard = 0,
    public var timingId: UInt = 0u,
    public var detailTiming: DisplayidDetailedTimingTypeI = DisplayidDetailedTimingTypeI(),
)

public data class GpupDriverEscapeInput(
    public var vfLUID: Luid = Luid(),
)

public data class OutputduplContextDebugInfo(
    public var status: OutputduplContextDebugStatus = 0,
    public var processID: Handle = null,
    public var accumulatedPresents: UInt = 0u,
    public var lastPresentTime: Long = 0L,
    public var lastMouseTime: Long = 0L,
    public var processName: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OutputduplContextDebugInfo) return false
        if (this.status != other.status) return false
        if (this.processID != other.processID) return false
        if (this.accumulatedPresents != other.accumulatedPresents) return false
        if (this.lastPresentTime != other.lastPresentTime) return false
        if (this.lastMouseTime != other.lastMouseTime) return false
        if (!this.processName.contentEquals(other.processName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.status.hashCode()
        result = 31 * result + this.processID.hashCode()
        result = 31 * result + this.accumulatedPresents.hashCode()
        result = 31 * result + this.lastPresentTime.hashCode()
        result = 31 * result + this.lastMouseTime.hashCode()
        result = 31 * result + this.processName.contentHashCode()
        return result
    }
}

public data class NtD3dlinepattern(
    public var wRepeatFactor: UShort = 0u,
    public var wLinePattern: UShort = 0u,
)
