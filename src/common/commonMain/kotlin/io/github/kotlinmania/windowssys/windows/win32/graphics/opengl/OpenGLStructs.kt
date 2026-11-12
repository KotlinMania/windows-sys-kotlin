package io.github.kotlinmania.windowssys.windows.win32.graphics.opengl

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Emr

public data class Emrpixelformat(
    public var emr: Emr = Emr(),
    public var pfd: Pixelformatdescriptor = Pixelformatdescriptor(),
)

public data class Glyphmetricsfloat(
    public var gmfBlackBoxX: Float = 0.0f,
    public var gmfBlackBoxY: Float = 0.0f,
    public var gmfptGlyphOrigin: Pointfloat = Pointfloat(),
    public var gmfCellIncX: Float = 0.0f,
    public var gmfCellIncY: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Glyphmetricsfloat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Glyphmetricsfloat> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Glyphmetricsfloat =
                    Glyphmetricsfloat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (Pointfloat.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Glyphmetricsfloat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.gmfBlackBoxX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.gmfBlackBoxY)
                    (Pointfloat.typeLayout()).writeNative(addr + 8L, value.gmfptGlyphOrigin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 16L, value.gmfCellIncX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 20L, value.gmfCellIncY)
                }
            }
    }
}

public class Layerplanedescriptor(
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
    public var crTransparent: Colorref = 0u,
)

public class Pixelformatdescriptor(
    public var nSize: UShort = 0u,
    public var nVersion: UShort = 0u,
    public var dwFlags: PfdFlags = 0u,
    public var iPixelType: PfdPixelType = 0u,
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pixelformatdescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pixelformatdescriptor> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Pixelformatdescriptor =
                    Pixelformatdescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 15L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 21L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 23L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 27L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Pixelformatdescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.iPixelType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.cColorBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.cRedBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.cRedShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.cGreenBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.cGreenShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 14L, value.cBlueBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 15L, value.cBlueShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.cAlphaBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.cAlphaShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.cAccumBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.cAccumRedBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 20L, value.cAccumGreenBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 21L, value.cAccumBlueBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 22L, value.cAccumAlphaBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 23L, value.cDepthBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 24L, value.cStencilBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 25L, value.cAuxBuffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 26L, value.iLayerType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 27L, value.bReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwLayerMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwVisibleMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwDamageMask)
                }
            }
    }
}

public data class Pointfloat(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pointfloat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pointfloat> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Pointfloat =
                    Pointfloat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Pointfloat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                }
            }
    }
}
