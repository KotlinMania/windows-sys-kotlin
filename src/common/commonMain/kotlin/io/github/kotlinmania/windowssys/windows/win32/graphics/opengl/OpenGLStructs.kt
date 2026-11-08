package io.github.kotlinmania.windowssys.windows.win32.graphics.opengl

import io.github.kotlinmania.windowssys.windows.win32.foundation.COLORREF
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.EMR

public data class EMRPIXELFORMAT(public var emr: EMR = EMR(), public var pfd: PIXELFORMATDESCRIPTOR = PIXELFORMATDESCRIPTOR())

public data class GLYPHMETRICSFLOAT(
    public var gmfBlackBoxX: Float = 0.0f,
    public var gmfBlackBoxY: Float = 0.0f,
    public var gmfptGlyphOrigin: POINTFLOAT = POINTFLOAT(),
    public var gmfCellIncX: Float = 0.0f,
    public var gmfCellIncY: Float = 0.0f,
)

public class LAYERPLANEDESCRIPTOR(
    public var nSize: UShort = 0u,
    public var nVersion: UShort = 0u,
    public var dwFlags: UInt = 0u,
    public var iPixelType: UByte = 0u,
    public var cColorBits: UByte = 0u,
    public var cRedBits: UByte = 0u,
    public var cRedShift: UByte = 0u,
    public var cGreenBits: UByte = 0u,
    public var cGreenShift: UByte = 0u,
    public var cBlueBits: UByte = 0u,
    public var cBlueShift: UByte = 0u,
    public var cAlphaBits: UByte = 0u,
    public var cAlphaShift: UByte = 0u,
    public var cAccumBits: UByte = 0u,
    public var cAccumRedBits: UByte = 0u,
    public var cAccumGreenBits: UByte = 0u,
    public var cAccumBlueBits: UByte = 0u,
    public var cAccumAlphaBits: UByte = 0u,
    public var cDepthBits: UByte = 0u,
    public var cStencilBits: UByte = 0u,
    public var cAuxBuffers: UByte = 0u,
    public var iLayerPlane: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var crTransparent: COLORREF = 0u,
)

public class PIXELFORMATDESCRIPTOR(
    public var nSize: UShort = 0u,
    public var nVersion: UShort = 0u,
    public var dwFlags: PFD_FLAGS = 0u,
    public var iPixelType: PFD_PIXEL_TYPE = 0u,
    public var cColorBits: UByte = 0u,
    public var cRedBits: UByte = 0u,
    public var cRedShift: UByte = 0u,
    public var cGreenBits: UByte = 0u,
    public var cGreenShift: UByte = 0u,
    public var cBlueBits: UByte = 0u,
    public var cBlueShift: UByte = 0u,
    public var cAlphaBits: UByte = 0u,
    public var cAlphaShift: UByte = 0u,
    public var cAccumBits: UByte = 0u,
    public var cAccumRedBits: UByte = 0u,
    public var cAccumGreenBits: UByte = 0u,
    public var cAccumBlueBits: UByte = 0u,
    public var cAccumAlphaBits: UByte = 0u,
    public var cDepthBits: UByte = 0u,
    public var cStencilBits: UByte = 0u,
    public var cAuxBuffers: UByte = 0u,
    public var iLayerType: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var dwLayerMask: UInt = 0u,
    public var dwVisibleMask: UInt = 0u,
    public var dwDamageMask: UInt = 0u,
)

public data class POINTFLOAT(public var x: Float = 0.0f, public var y: Float = 0.0f)
