@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWddm13Caps00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWddm13Caps00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtWddm13Caps00 =
                    D3dkmtWddm13Caps00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtWddm13Caps00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtWddm20Caps(
    public var anonymous: D3dkmtWddm20Caps0 = D3dkmtWddm20Caps0(),
)

public data class D3dkmtWddm20Caps0(
    public var anonymous: D3dkmtWddm20Caps00 = D3dkmtWddm20Caps00(),
    public var value: UInt = 0u,
)

public data class D3dkmtWddm20Caps00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWddm20Caps00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWddm20Caps00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtWddm20Caps00 =
                    D3dkmtWddm20Caps00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtWddm20Caps00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtWddm27Caps(
    public var anonymous: D3dkmtWddm27Caps0 = D3dkmtWddm27Caps0(),
)

public data class D3dkmtWddm27Caps0(
    public var anonymous: D3dkmtWddm27Caps00 = D3dkmtWddm27Caps00(),
    public var value: UInt = 0u,
)

public data class D3dkmtWddm27Caps00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWddm27Caps00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWddm27Caps00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtWddm27Caps00 =
                    D3dkmtWddm27Caps00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtWddm27Caps00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtWddm29Caps(
    public var anonymous: D3dkmtWddm29Caps0 = D3dkmtWddm29Caps0(),
)

public data class D3dkmtWddm29Caps0(
    public var anonymous: D3dkmtWddm29Caps00 = D3dkmtWddm29Caps00(),
    public var value: UInt = 0u,
)

public data class D3dkmtWddm29Caps00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWddm29Caps00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWddm29Caps00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtWddm29Caps00 =
                    D3dkmtWddm29Caps00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtWddm29Caps00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtWddm30Caps(
    public var anonymous: D3dkmtWddm30Caps0 = D3dkmtWddm30Caps0(),
)

public data class D3dkmtWddm30Caps0(
    public var anonymous: D3dkmtWddm30Caps00 = D3dkmtWddm30Caps00(),
    public var value: UInt = 0u,
)

public data class D3dkmtWddm30Caps00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWddm30Caps00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWddm30Caps00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtWddm30Caps00 =
                    D3dkmtWddm30Caps00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtWddm30Caps00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtWddm31Caps(
    public var anonymous: D3dkmtWddm31Caps0 = D3dkmtWddm31Caps0(),
)

public data class D3dkmtWddm31Caps0(
    public var anonymous: D3dkmtWddm31Caps00 = D3dkmtWddm31Caps00(),
    public var value: UInt = 0u,
)

public data class D3dkmtWddm31Caps00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWddm31Caps00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWddm31Caps00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtWddm31Caps00 =
                    D3dkmtWddm31Caps00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtWddm31Caps00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtWorkingsetflags(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWorkingsetflags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWorkingsetflags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtWorkingsetflags =
                    D3dkmtWorkingsetflags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtWorkingsetflags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtWorkingsetinfo(
    public var flags: D3dkmtWorkingsetflags = D3dkmtWorkingsetflags(),
    public var minimumWorkingSetPercentile: UInt = 0u,
    public var maximumWorkingSetPercentile: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWorkingsetinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWorkingsetinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmtWorkingsetinfo =
                    D3dkmtWorkingsetinfo(
                        (D3dkmtWorkingsetflags.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtWorkingsetinfo) {
                    (D3dkmtWorkingsetflags.typeLayout()).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minimumWorkingSetPercentile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maximumWorkingSetPercentile)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWsaumdimagename> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWsaumdimagename> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 520L
                override fun readNative(addr: Long): D3dkmtWsaumdimagename =
                    D3dkmtWsaumdimagename(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtWsaumdimagename) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.wsaUmdImageName.toList())
                }
            }
    }
}

public data class D3dkmtXbox(
    public var isXBOX: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtXbox> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtXbox> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtXbox =
                    D3dkmtXbox(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtXbox) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.isXBOX)
                }
            }
    }
}

public data class D3dlinepattern(
    public var wRepeatFactor: UShort = 0u,
    public var wLinePattern: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dlinepattern> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dlinepattern> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dlinepattern =
                    D3dlinepattern(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: D3dlinepattern) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wRepeatFactor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wLinePattern)
                }
            }
    }
}

public data class D3dnthalClippedtrianglefan(
    public var firstVertexOffset: UInt = 0u,
    public var dwEdgeFlags: UInt = 0u,
    public var primitiveCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalClippedtrianglefan> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalClippedtrianglefan> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dnthalClippedtrianglefan =
                    D3dnthalClippedtrianglefan(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalClippedtrianglefan) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.firstVertexOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwEdgeFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.primitiveCount)
                }
            }
    }
}

public data class D3dnthalContextdestroyalldata(
    public var dwPID: UInt = 0u,
    public var ddrval: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalContextdestroyalldata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalContextdestroyalldata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalContextdestroyalldata =
                    D3dnthalContextdestroyalldata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalContextdestroyalldata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ddrval)
                }
            }
    }
}

public data class D3dnthalContextdestroydata(
    public var dwhContext: Int = 0,
    public var ddrval: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalContextdestroydata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalContextdestroydata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dnthalContextdestroydata =
                    D3dnthalContextdestroydata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalContextdestroydata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwhContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ddrval)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalD3ddx6extendedcaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalD3ddx6extendedcaps> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 84L
                override fun readNative(addr: Long): D3dnthalD3ddx6extendedcaps =
                    D3dnthalD3ddx6extendedcaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 82L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalD3ddx6extendedcaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMinTextureWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMaxTextureWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMinTextureHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwMaxTextureHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwMinStippleWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwMaxStippleWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwMinStippleHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwMaxStippleHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwMaxTextureRepeat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwMaxTextureAspectRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwMaxAnisotropy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 48L, value.dvGuardBandLeft)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 52L, value.dvGuardBandTop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 56L, value.dvGuardBandRight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 60L, value.dvGuardBandBottom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 64L, value.dvExtentsAdjust)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwStencilCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwFVFCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.dwTextureOpCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 80L, value.wMaxTextureBlendStages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 82L, value.wMaxSimultaneousTextures)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalD3dextendedcaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalD3dextendedcaps> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 116L
                override fun readNative(addr: Long): D3dnthalD3dextendedcaps =
                    D3dnthalD3dextendedcaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 82L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 94L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalD3dextendedcaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMinTextureWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMaxTextureWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMinTextureHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwMaxTextureHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwMinStippleWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwMaxStippleWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwMinStippleHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwMaxStippleHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwMaxTextureRepeat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwMaxTextureAspectRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwMaxAnisotropy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 48L, value.dvGuardBandLeft)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 52L, value.dvGuardBandTop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 56L, value.dvGuardBandRight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 60L, value.dvGuardBandBottom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 64L, value.dvExtentsAdjust)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwStencilCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwFVFCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.dwTextureOpCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 80L, value.wMaxTextureBlendStages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 82L, value.wMaxSimultaneousTextures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.dwMaxActiveLights)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 88L, value.dvMaxVertexW)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 92L, value.wMaxUserClipPlanes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 94L, value.wMaxVertexBlendMatrices)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.dwVertexProcessingCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.dwReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.dwReserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.dwReserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.dwReserved4)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2createlight> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2createlight> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dnthalDp2createlight =
                    D3dnthalDp2createlight(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2createlight) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIndex)
                }
            }
    }
}

public data class D3dnthalDp2createpixelshader(
    public var dwHandle: UInt = 0u,
    public var dwCodeSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2createpixelshader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2createpixelshader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2createpixelshader =
                    D3dnthalDp2createpixelshader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2createpixelshader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCodeSize)
                }
            }
    }
}

public data class D3dnthalDp2createvertexshader(
    public var dwHandle: UInt = 0u,
    public var dwDeclSize: UInt = 0u,
    public var dwCodeSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2createvertexshader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2createvertexshader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dnthalDp2createvertexshader =
                    D3dnthalDp2createvertexshader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2createvertexshader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDeclSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCodeSize)
                }
            }
    }
}

public data class D3dnthalDp2createvertexshaderdecl(
    public var dwHandle: UInt = 0u,
    public var dwNumVertexElements: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2createvertexshaderdecl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2createvertexshaderdecl> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2createvertexshaderdecl =
                    D3dnthalDp2createvertexshaderdecl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2createvertexshaderdecl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNumVertexElements)
                }
            }
    }
}

public data class D3dnthalDp2createvertexshaderfunc(
    public var dwHandle: UInt = 0u,
    public var dwSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2createvertexshaderfunc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2createvertexshaderfunc> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2createvertexshaderfunc =
                    D3dnthalDp2createvertexshaderfunc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2createvertexshaderfunc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSize)
                }
            }
    }
}

public data class D3dnthalDp2deletequery(
    public var dwQueryID: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2deletequery> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2deletequery> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dnthalDp2deletequery =
                    D3dnthalDp2deletequery(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2deletequery) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwQueryID)
                }
            }
    }
}

public data class D3dnthalDp2drawrectpatch(
    public var handle: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2drawrectpatch> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2drawrectpatch> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2drawrectpatch =
                    D3dnthalDp2drawrectpatch(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2drawrectpatch) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.handle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public data class D3dnthalDp2drawtripatch(
    public var handle: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2drawtripatch> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2drawtripatch> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2drawtripatch =
                    D3dnthalDp2drawtripatch(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2drawtripatch) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.handle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public data class D3dnthalDp2ext(
    public var dwExtToken: UInt = 0u,
    public var dwSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2ext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2ext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2ext =
                    D3dnthalDp2ext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2ext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwExtToken)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSize)
                }
            }
    }
}

public data class D3dnthalDp2indexedlinelist(
    public var wV1: UShort = 0u,
    public var wV2: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2indexedlinelist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2indexedlinelist> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dnthalDp2indexedlinelist =
                    D3dnthalDp2indexedlinelist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2indexedlinelist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wV1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wV2)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2indexedlinestrip> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2indexedlinestrip> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dnthalDp2indexedlinestrip =
                    D3dnthalDp2indexedlinestrip(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2indexedlinestrip) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                    ).writeNative(addr, value.wV.toList())
                }
            }
    }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2indexedtrianglefan> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2indexedtrianglefan> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): D3dnthalDp2indexedtrianglefan =
                    D3dnthalDp2indexedtrianglefan(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2indexedtrianglefan) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                    ).writeNative(addr, value.wV.toList())
                }
            }
    }
}

public data class D3dnthalDp2indexedtrianglelist(
    public var wV1: UShort = 0u,
    public var wV2: UShort = 0u,
    public var wV3: UShort = 0u,
    public var wFlags: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2indexedtrianglelist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2indexedtrianglelist> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2indexedtrianglelist =
                    D3dnthalDp2indexedtrianglelist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2indexedtrianglelist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wV1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wV2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wV3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wFlags)
                }
            }
    }
}

public data class D3dnthalDp2indexedtrianglelist2(
    public var wV1: UShort = 0u,
    public var wV2: UShort = 0u,
    public var wV3: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2indexedtrianglelist2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2indexedtrianglelist2> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): D3dnthalDp2indexedtrianglelist2 =
                    D3dnthalDp2indexedtrianglelist2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2indexedtrianglelist2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wV1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wV2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wV3)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2indexedtrianglestrip> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2indexedtrianglestrip> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): D3dnthalDp2indexedtrianglestrip =
                    D3dnthalDp2indexedtrianglestrip(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2indexedtrianglestrip) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                    ).writeNative(addr, value.wV.toList())
                }
            }
    }
}

public data class D3dnthalDp2issuequery(
    public var dwQueryID: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2issuequery> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2issuequery> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2issuequery =
                    D3dnthalDp2issuequery(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2issuequery) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwQueryID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                }
            }
    }
}

public data class D3dnthalDp2linelist(
    public var wVStart: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2linelist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2linelist> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): D3dnthalDp2linelist =
                    D3dnthalDp2linelist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2linelist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVStart)
                }
            }
    }
}

public data class D3dnthalDp2linestrip(
    public var wVStart: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2linestrip> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2linestrip> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): D3dnthalDp2linestrip =
                    D3dnthalDp2linestrip(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2linestrip) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVStart)
                }
            }
    }
}

public data class D3dnthalDp2pixelshader(
    public var dwHandle: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2pixelshader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2pixelshader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dnthalDp2pixelshader =
                    D3dnthalDp2pixelshader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2pixelshader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwHandle)
                }
            }
    }
}

public data class D3dnthalDp2points(
    public var wCount: UShort = 0u,
    public var wVStart: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2points> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2points> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dnthalDp2points =
                    D3dnthalDp2points(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2points) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wVStart)
                }
            }
    }
}

public data class D3dnthalDp2response(
    public var bCommand: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var wStateCount: UShort = 0u,
    public var dwTotalSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2response> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2response> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2response =
                    D3dnthalDp2response(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2response) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bCommand)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wStateCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwTotalSize)
                }
            }
    }
}

public data class D3dnthalDp2responsequery(
    public var dwQueryID: UInt = 0u,
    public var dwSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2responsequery> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2responsequery> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2responsequery =
                    D3dnthalDp2responsequery(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2responsequery) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwQueryID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSize)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setclipplane> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setclipplane> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): D3dnthalDp2setclipplane =
                    D3dnthalDp2setclipplane(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (4).toInt())
                        ).readNative(addr + 4L).toFloatArray(),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2setclipplane) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (4).toInt())
                    ).writeNative(addr + 4L, value.plane.toList())
                }
            }
    }
}

public data class D3dnthalDp2setconvolutionkernelmono(
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setconvolutionkernelmono> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setconvolutionkernelmono> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dnthalDp2setconvolutionkernelmono =
                    D3dnthalDp2setconvolutionkernelmono(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2setconvolutionkernelmono) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlags)
                }
            }
    }
}

public data class D3dnthalDp2setdepthstencil(
    public var hZBuffer: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setdepthstencil> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setdepthstencil> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dnthalDp2setdepthstencil =
                    D3dnthalDp2setdepthstencil(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2setdepthstencil) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hZBuffer)
                }
            }
    }
}

public data class D3dnthalDp2setindices(
    public var dwVBHandle: UInt = 0u,
    public var dwStride: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setindices> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setindices> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2setindices =
                    D3dnthalDp2setindices(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2setindices) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVBHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwStride)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setpalette> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setpalette> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dnthalDp2setpalette =
                    D3dnthalDp2setpalette(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2setpalette) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPaletteHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwPaletteFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSurfaceHandle)
                }
            }
    }
}

public data class D3dnthalDp2setpixelshaderconst(
    public var dwRegister: UInt = 0u,
    public var dwCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setpixelshaderconst> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setpixelshaderconst> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2setpixelshaderconst =
                    D3dnthalDp2setpixelshaderconst(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2setpixelshaderconst) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwRegister)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCount)
                }
            }
    }
}

public data class D3dnthalDp2setpriority(
    public var dwDDDestSurface: UInt = 0u,
    public var dwPriority: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setpriority> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setpriority> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2setpriority =
                    D3dnthalDp2setpriority(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2setpriority) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDDDestSurface)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwPriority)
                }
            }
    }
}

public data class D3dnthalDp2setrendertarget(
    public var hRenderTarget: UInt = 0u,
    public var hZBuffer: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setrendertarget> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setrendertarget> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2setrendertarget =
                    D3dnthalDp2setrendertarget(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2setrendertarget) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hRenderTarget)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hZBuffer)
                }
            }
    }
}

public data class D3dnthalDp2setrendertarget2(
    public var rTIndex: UInt = 0u,
    public var hRenderTarget: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setrendertarget2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setrendertarget2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2setrendertarget2 =
                    D3dnthalDp2setrendertarget2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2setrendertarget2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rTIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hRenderTarget)
                }
            }
    }
}

public data class D3dnthalDp2setstreamsource(
    public var dwStream: UInt = 0u,
    public var dwVBHandle: UInt = 0u,
    public var dwStride: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setstreamsource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setstreamsource> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dnthalDp2setstreamsource =
                    D3dnthalDp2setstreamsource(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2setstreamsource) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVBHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwStride)
                }
            }
    }
}

public data class D3dnthalDp2setstreamsource2(
    public var dwStream: UInt = 0u,
    public var dwVBHandle: UInt = 0u,
    public var dwOffset: UInt = 0u,
    public var dwStride: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setstreamsource2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setstreamsource2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dnthalDp2setstreamsource2 =
                    D3dnthalDp2setstreamsource2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2setstreamsource2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVBHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwStride)
                }
            }
    }
}

public data class D3dnthalDp2setstreamsourcefreq(
    public var dwStream: UInt = 0u,
    public var dwDivider: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setstreamsourcefreq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setstreamsourcefreq> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2setstreamsourcefreq =
                    D3dnthalDp2setstreamsourcefreq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2setstreamsourcefreq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDivider)
                }
            }
    }
}

public data class D3dnthalDp2setstreamsourceum(
    public var dwStream: UInt = 0u,
    public var dwStride: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setstreamsourceum> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setstreamsourceum> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2setstreamsourceum =
                    D3dnthalDp2setstreamsourceum(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2setstreamsourceum) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwStride)
                }
            }
    }
}

public data class D3dnthalDp2settexlod(
    public var dwDDSurface: UInt = 0u,
    public var dwLOD: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2settexlod> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2settexlod> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2settexlod =
                    D3dnthalDp2settexlod(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2settexlod) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDDSurface)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwLOD)
                }
            }
    }
}

public data class D3dnthalDp2setvertexshaderconst(
    public var dwRegister: UInt = 0u,
    public var dwCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setvertexshaderconst> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2setvertexshaderconst> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2setvertexshaderconst =
                    D3dnthalDp2setvertexshaderconst(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2setvertexshaderconst) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwRegister)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCount)
                }
            }
    }
}

public data class D3dnthalDp2startvertex(
    public var wVStart: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2startvertex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2startvertex> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): D3dnthalDp2startvertex =
                    D3dnthalDp2startvertex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2startvertex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVStart)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2texturestagestate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2texturestagestate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2texturestagestate =
                    D3dnthalDp2texturestagestate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2texturestagestate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wStage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.tSState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwValue)
                }
            }
    }
}

public data class D3dnthalDp2trianglefan(
    public var wVStart: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2trianglefan> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2trianglefan> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): D3dnthalDp2trianglefan =
                    D3dnthalDp2trianglefan(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2trianglefan) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVStart)
                }
            }
    }
}

public data class D3dnthalDp2trianglefanImm(
    public var dwEdgeFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2trianglefanImm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2trianglefanImm> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dnthalDp2trianglefanImm =
                    D3dnthalDp2trianglefanImm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2trianglefanImm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwEdgeFlags)
                }
            }
    }
}

public data class D3dnthalDp2trianglelist(
    public var wVStart: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2trianglelist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2trianglelist> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): D3dnthalDp2trianglelist =
                    D3dnthalDp2trianglelist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2trianglelist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVStart)
                }
            }
    }
}

public data class D3dnthalDp2trianglestrip(
    public var wVStart: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2trianglestrip> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2trianglestrip> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): D3dnthalDp2trianglestrip =
                    D3dnthalDp2trianglestrip(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2trianglestrip) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVStart)
                }
            }
    }
}

public data class D3dnthalDp2updatepalette(
    public var dwPaletteHandle: UInt = 0u,
    public var wStartIndex: UShort = 0u,
    public var wNumEntries: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2updatepalette> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2updatepalette> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2updatepalette =
                    D3dnthalDp2updatepalette(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2updatepalette) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPaletteHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wStartIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wNumEntries)
                }
            }
    }
}

public data class D3dnthalDp2vertexshader(
    public var dwHandle: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2vertexshader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2vertexshader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dnthalDp2vertexshader =
                    D3dnthalDp2vertexshader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2vertexshader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwHandle)
                }
            }
    }
}

public data class D3dnthalDp2viewportinfo(
    public var dwX: UInt = 0u,
    public var dwY: UInt = 0u,
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2viewportinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2viewportinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dnthalDp2viewportinfo =
                    D3dnthalDp2viewportinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2viewportinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwHeight)
                }
            }
    }
}

public data class D3dnthalDp2winfo(
    public var dvWNear: Float = 0.0f,
    public var dvWFar: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2winfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2winfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2winfo =
                    D3dnthalDp2winfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2winfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.dvWNear)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.dvWFar)
                }
            }
    }
}

public data class D3dnthalDp2zrange(
    public var dvMinZ: Float = 0.0f,
    public var dvMaxZ: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2zrange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalDp2zrange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dnthalDp2zrange =
                    D3dnthalDp2zrange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalDp2zrange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.dvMinZ)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.dvMaxZ)
                }
            }
    }
}

public data class D3dnthalScenecapturedata(
    public var dwhContext: Int = 0,
    public var dwFlag: UInt = 0u,
    public var ddrval: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalScenecapturedata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalScenecapturedata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dnthalScenecapturedata =
                    D3dnthalScenecapturedata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalScenecapturedata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwhContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.ddrval)
                }
            }
    }
}

public class D3dnthalTexturecreatedata internal constructor(
    public var dwhContext: Int,
    hDDSCtorArg: Handle,
    public var dwHandle: Int,
    public var ddrval: Hresult,
) {
    public var hDDS: Handle = hDDSCtorArg
        internal set

    public constructor() : this(
        dwhContext = 0,
        hDDSCtorArg = MutPtr(0L),
        dwHandle = 0,
        ddrval = 0,
    )

    public operator fun component1(): Int = this.dwhContext

    public operator fun component2(): Handle = this.hDDS

    public operator fun component3(): Int = this.dwHandle

    public operator fun component4(): Hresult = this.ddrval

    public fun copy(dwhContext: Int = this.dwhContext, hDDS: Handle = this.hDDS, dwHandle: Int = this.dwHandle, ddrval: Hresult = this.ddrval): D3dnthalTexturecreatedata = D3dnthalTexturecreatedata(dwhContext = dwhContext, hDDSCtorArg = hDDS, dwHandle = dwHandle, ddrval = ddrval)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dnthalTexturecreatedata) return false
        if (this.dwhContext != other.dwhContext) return false
        if (this.hDDS != other.hDDS) return false
        if (this.dwHandle != other.dwHandle) return false
        if (this.ddrval != other.ddrval) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwhContext.hashCode()
        result = 31 * result + this.hDDS.hashCode()
        result = 31 * result + this.dwHandle.hashCode()
        result = 31 * result + this.ddrval.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwhContext: Int = 0,
            hDDS: Handle = MutPtr(0L),
            dwHandle: Int = 0,
            ddrval: Hresult = 0,
        ): D3dnthalTexturecreatedata =
            D3dnthalTexturecreatedata(
                dwhContext = dwhContext,
                hDDSCtorArg = hDDS,
                dwHandle = dwHandle,
                ddrval = ddrval,
            )
    }
}

public data class D3dnthalTexturedestroydata(
    public var dwhContext: Int = 0,
    public var dwHandle: Int = 0,
    public var ddrval: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalTexturedestroydata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalTexturedestroydata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dnthalTexturedestroydata =
                    D3dnthalTexturedestroydata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalTexturedestroydata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwhContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.dwHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.ddrval)
                }
            }
    }
}

public class D3dnthalTexturegetsurfdata internal constructor(
    public var dwhContext: Int,
    hDDSCtorArg: Handle,
    public var dwHandle: Int,
    public var ddrval: Hresult,
) {
    public var hDDS: Handle = hDDSCtorArg
        internal set

    public constructor() : this(
        dwhContext = 0,
        hDDSCtorArg = MutPtr(0L),
        dwHandle = 0,
        ddrval = 0,
    )

    public operator fun component1(): Int = this.dwhContext

    public operator fun component2(): Handle = this.hDDS

    public operator fun component3(): Int = this.dwHandle

    public operator fun component4(): Hresult = this.ddrval

    public fun copy(dwhContext: Int = this.dwhContext, hDDS: Handle = this.hDDS, dwHandle: Int = this.dwHandle, ddrval: Hresult = this.ddrval): D3dnthalTexturegetsurfdata = D3dnthalTexturegetsurfdata(dwhContext = dwhContext, hDDSCtorArg = hDDS, dwHandle = dwHandle, ddrval = ddrval)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dnthalTexturegetsurfdata) return false
        if (this.dwhContext != other.dwhContext) return false
        if (this.hDDS != other.hDDS) return false
        if (this.dwHandle != other.dwHandle) return false
        if (this.ddrval != other.ddrval) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwhContext.hashCode()
        result = 31 * result + this.hDDS.hashCode()
        result = 31 * result + this.dwHandle.hashCode()
        result = 31 * result + this.ddrval.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwhContext: Int = 0,
            hDDS: Handle = MutPtr(0L),
            dwHandle: Int = 0,
            ddrval: Hresult = 0,
        ): D3dnthalTexturegetsurfdata =
            D3dnthalTexturegetsurfdata(
                dwhContext = dwhContext,
                hDDSCtorArg = hDDS,
                dwHandle = dwHandle,
                ddrval = ddrval,
            )
    }
}

public data class D3dnthalTextureswapdata(
    public var dwhContext: Int = 0,
    public var dwHandle1: Int = 0,
    public var dwHandle2: Int = 0,
    public var ddrval: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalTextureswapdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalTextureswapdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dnthalTextureswapdata =
                    D3dnthalTextureswapdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalTextureswapdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwhContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.dwHandle1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.dwHandle2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.ddrval)
                }
            }
    }
}

public data class D3dnthalValidatetexturestagestatedata(
    public var dwhContext: Int = 0,
    public var dwFlags: UInt = 0u,
    public var dwReserved: Int = 0,
    public var dwNumPasses: UInt = 0u,
    public var ddrval: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalValidatetexturestagestatedata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dnthalValidatetexturestagestatedata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dnthalValidatetexturestagestatedata =
                    D3dnthalValidatetexturestagestatedata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: D3dnthalValidatetexturestagestatedata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwhContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.dwReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwNumPasses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.ddrval)
                }
            }
    }
}

public data class DdntDeferredAgpAwareData(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntDeferredAgpAwareData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntDeferredAgpAwareData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DdntDeferredAgpAwareData =
                    DdntDeferredAgpAwareData(
                        (DdntGetdriverinfo2data.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DdntDeferredAgpAwareData) {
                    (DdntGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                }
            }
    }
}

public data class DdntDxversion(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
    public var dwDXVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntDxversion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntDxversion> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DdntDxversion =
                    DdntDxversion(
                        (DdntGetdriverinfo2data.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DdntDxversion) {
                    (DdntGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwDXVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwReserved)
                }
            }
    }
}

public data class DdntFreeDeferredAgpData(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
    public var dwProcessId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntFreeDeferredAgpData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntFreeDeferredAgpData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): DdntFreeDeferredAgpData =
                    DdntFreeDeferredAgpData(
                        (DdntGetdriverinfo2data.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DdntFreeDeferredAgpData) {
                    (DdntGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwProcessId)
                }
            }
    }
}

public data class DdntGetadaptergroupdata(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
    public var ulUniqueAdapterGroupId: Int = 0,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntGetadaptergroupdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntGetadaptergroupdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DdntGetadaptergroupdata =
                    DdntGetadaptergroupdata(
                        (DdntGetdriverinfo2data.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: DdntGetadaptergroupdata) {
                    (DdntGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.ulUniqueAdapterGroupId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwReserved2)
                }
            }
    }
}

public data class DdntGetd3dquerycountdata(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
    public var dwNumQueries: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntGetd3dquerycountdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntGetd3dquerycountdata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): DdntGetd3dquerycountdata =
                    DdntGetd3dquerycountdata(
                        (DdntGetdriverinfo2data.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DdntGetd3dquerycountdata) {
                    (DdntGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwNumQueries)
                }
            }
    }
}

public data class DdntGetddiversiondata(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
    public var dwDXVersion: UInt = 0u,
    public var dwDDIVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntGetddiversiondata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntGetddiversiondata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DdntGetddiversiondata =
                    DdntGetddiversiondata(
                        (DdntGetdriverinfo2data.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DdntGetddiversiondata) {
                    (DdntGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwDXVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwDDIVersion)
                }
            }
    }
}

public data class DdntGetdriverinfo2data(
    public var dwReserved: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwExpectedSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntGetdriverinfo2data> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntGetdriverinfo2data> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DdntGetdriverinfo2data =
                    DdntGetdriverinfo2data(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DdntGetdriverinfo2data) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwExpectedSize)
                }
            }
    }
}

public data class DdntGetextendedmodecountdata(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
    public var dwModeCount: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntGetextendedmodecountdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntGetextendedmodecountdata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DdntGetextendedmodecountdata =
                    DdntGetextendedmodecountdata(
                        (DdntGetdriverinfo2data.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DdntGetextendedmodecountdata) {
                    (DdntGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwModeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwReserved)
                }
            }
    }
}

public data class DdntGetformatcountdata(
    public var gdi2: DdntGetdriverinfo2data = DdntGetdriverinfo2data(),
    public var dwFormatCount: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntGetformatcountdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdntGetformatcountdata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DdntGetformatcountdata =
                    DdntGetformatcountdata(
                        (DdntGetdriverinfo2data.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DdntGetformatcountdata) {
                    (DdntGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwFormatCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwReserved)
                }
            }
    }
}

public data class DdDeferredAgpAwareData(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdDeferredAgpAwareData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdDeferredAgpAwareData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DdDeferredAgpAwareData =
                    DdDeferredAgpAwareData(
                        (DdGetdriverinfo2data.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DdDeferredAgpAwareData) {
                    (DdGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                }
            }
    }
}

public data class DdDxversion(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
    public var dwDXVersion: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdDxversion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdDxversion> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DdDxversion =
                    DdDxversion(
                        (DdGetdriverinfo2data.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DdDxversion) {
                    (DdGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwDXVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwReserved)
                }
            }
    }
}

public data class DdFreeDeferredAgpData(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
    public var dwProcessId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdFreeDeferredAgpData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdFreeDeferredAgpData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): DdFreeDeferredAgpData =
                    DdFreeDeferredAgpData(
                        (DdGetdriverinfo2data.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DdFreeDeferredAgpData) {
                    (DdGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwProcessId)
                }
            }
    }
}

public data class DdGetadaptergroupdata(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
    public var ulUniqueAdapterGroupId: Int = 0,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdGetadaptergroupdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdGetadaptergroupdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DdGetadaptergroupdata =
                    DdGetadaptergroupdata(
                        (DdGetdriverinfo2data.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: DdGetadaptergroupdata) {
                    (DdGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.ulUniqueAdapterGroupId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwReserved2)
                }
            }
    }
}

public data class DdGetd3dquerycountdata(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
    public var dwNumQueries: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdGetd3dquerycountdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdGetd3dquerycountdata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): DdGetd3dquerycountdata =
                    DdGetd3dquerycountdata(
                        (DdGetdriverinfo2data.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DdGetd3dquerycountdata) {
                    (DdGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwNumQueries)
                }
            }
    }
}

public data class DdGetddiversiondata(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
    public var dwDXVersion: UInt = 0u,
    public var dwDDIVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdGetddiversiondata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdGetddiversiondata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DdGetddiversiondata =
                    DdGetddiversiondata(
                        (DdGetdriverinfo2data.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DdGetddiversiondata) {
                    (DdGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwDXVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwDDIVersion)
                }
            }
    }
}

public data class DdGetdriverinfo2data(
    public var dwReserved: UInt = 0u,
    public var dwMagic: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwExpectedSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdGetdriverinfo2data> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdGetdriverinfo2data> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DdGetdriverinfo2data =
                    DdGetdriverinfo2data(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DdGetdriverinfo2data) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwExpectedSize)
                }
            }
    }
}

public data class DdGetextendedmodecountdata(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
    public var dwModeCount: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdGetextendedmodecountdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdGetextendedmodecountdata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DdGetextendedmodecountdata =
                    DdGetextendedmodecountdata(
                        (DdGetdriverinfo2data.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DdGetextendedmodecountdata) {
                    (DdGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwModeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwReserved)
                }
            }
    }
}

public data class DdGetformatcountdata(
    public var gdi2: DdGetdriverinfo2data = DdGetdriverinfo2data(),
    public var dwFormatCount: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdGetformatcountdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DdGetformatcountdata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DdGetformatcountdata =
                    DdGetformatcountdata(
                        (DdGetdriverinfo2data.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DdGetformatcountdata) {
                    (DdGetdriverinfo2data.typeLayout()).writeNative(addr, value.gdi2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwFormatCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwReserved)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayidDetailedTimingTypeI> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayidDetailedTimingTypeI> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): DisplayidDetailedTimingTypeI =
                    DisplayidDetailedTimingTypeI(
                        (DisplayidDetailedTimingTypeI0.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (DisplayidDetailedTimingTypeI1.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (DisplayidDetailedTimingTypeI2.typeLayout()).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                    )
                override fun writeNative(addr: Long, value: DisplayidDetailedTimingTypeI) {
                    (DisplayidDetailedTimingTypeI0.typeLayout()).writeNative(addr, value.anonymous1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.horizontalActivePixels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.horizontalBlankPixels)
                    (DisplayidDetailedTimingTypeI1.typeLayout()).writeNative(addr + 8L, value.anonymous2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.horizontalSyncWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.verticalActiveLines)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.verticalBlankLines)
                    (DisplayidDetailedTimingTypeI2.typeLayout()).writeNative(addr + 16L, value.anonymous3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.verticalSyncWidth)
                }
            }
    }
}

public data class DisplayidDetailedTimingTypeI0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayidDetailedTimingTypeI0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayidDetailedTimingTypeI0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DisplayidDetailedTimingTypeI0 =
                    DisplayidDetailedTimingTypeI0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DisplayidDetailedTimingTypeI0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DisplayidDetailedTimingTypeI1(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayidDetailedTimingTypeI1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayidDetailedTimingTypeI1> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): DisplayidDetailedTimingTypeI1 =
                    DisplayidDetailedTimingTypeI1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DisplayidDetailedTimingTypeI1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DisplayidDetailedTimingTypeI2(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayidDetailedTimingTypeI2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayidDetailedTimingTypeI2> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): DisplayidDetailedTimingTypeI2 =
                    DisplayidDetailedTimingTypeI2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DisplayidDetailedTimingTypeI2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class DxgkargSetpalette internal constructor(
    public var vidPnSourceId: UInt,
    public var firstEntry: UInt,
    public var numEntries: UInt,
    pLookupTableCtorArg: MutPtr<D3dkmdtPalettedata>,
) {
    public var pLookupTable: MutPtr<D3dkmdtPalettedata> = pLookupTableCtorArg
        internal set

    public constructor() : this(
        vidPnSourceId = 0u,
        firstEntry = 0u,
        numEntries = 0u,
        pLookupTableCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.vidPnSourceId

    public operator fun component2(): UInt = this.firstEntry

    public operator fun component3(): UInt = this.numEntries

    public operator fun component4(): MutPtr<D3dkmdtPalettedata> = this.pLookupTable

    public fun copy(vidPnSourceId: UInt = this.vidPnSourceId, firstEntry: UInt = this.firstEntry, numEntries: UInt = this.numEntries, pLookupTable: MutPtr<D3dkmdtPalettedata> = this.pLookupTable): DxgkargSetpalette = DxgkargSetpalette(vidPnSourceId = vidPnSourceId, firstEntry = firstEntry, numEntries = numEntries, pLookupTableCtorArg = pLookupTable)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DxgkargSetpalette) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.firstEntry != other.firstEntry) return false
        if (this.numEntries != other.numEntries) return false
        if (this.pLookupTable != other.pLookupTable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vidPnSourceId.hashCode()
        result = 31 * result + this.firstEntry.hashCode()
        result = 31 * result + this.numEntries.hashCode()
        result = 31 * result + this.pLookupTable.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkargSetpalette> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkargSetpalette> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): DxgkargSetpalette =
                    DxgkargSetpalette(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<D3dkmdtPalettedata>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DxgkargSetpalette) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.firstEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.numEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<D3dkmdtPalettedata>(64)
                    ).writeNative(addr + 16L, value.pLookupTable)
                }
            }

        public operator fun invoke(
            vidPnSourceId: UInt = 0u,
            firstEntry: UInt = 0u,
            numEntries: UInt = 0u,
            pLookupTable: MutPtr<D3dkmdtPalettedata> = MutPtr(0L),
        ): DxgkargSetpalette =
            DxgkargSetpalette(
                vidPnSourceId = vidPnSourceId,
                firstEntry = firstEntry,
                numEntries = numEntries,
                pLookupTableCtorArg = pLookupTable,
            )
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmAcpAndCgmsaSignaling> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmAcpAndCgmsaSignaling> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): DxgkmdtOpmAcpAndCgmsaSignaling =
                    DxgkmdtOpmAcpAndCgmsaSignaling(
                        (DxgkmdtOpmRandomNumber.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 56L).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 72L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: DxgkmdtOpmAcpAndCgmsaSignaling) {
                    (DxgkmdtOpmRandomNumber.typeLayout()).writeNative(addr, value.rnRandomNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulStatusFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ulAvailableTVProtectionStandards)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ulActiveTVProtectionStandard)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.ulReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.ulAspectRatioValidMask1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.ulAspectRatioData1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ulAspectRatioValidMask2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.ulAspectRatioData2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.ulAspectRatioValidMask3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.ulAspectRatioData3)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 56L, value.ulReserved2.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 72L, value.ulReserved3.toList())
                }
            }
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmActualOutputFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmActualOutputFormat> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): DxgkmdtOpmActualOutputFormat =
                    DxgkmdtOpmActualOutputFormat(
                        (DxgkmdtOpmRandomNumber.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: DxgkmdtOpmActualOutputFormat) {
                    (DxgkmdtOpmRandomNumber.typeLayout()).writeNative(addr, value.rnRandomNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulStatusFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ulDisplayWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ulDisplayHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.ifInterleaveFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.d3dFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.ulFrequencyNumerator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ulFrequencyDenominator)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmConnectedHdcpDeviceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmConnectedHdcpDeviceInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): DxgkmdtOpmConnectedHdcpDeviceInformation =
                    DxgkmdtOpmConnectedHdcpDeviceInformation(
                        (DxgkmdtOpmRandomNumber.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (DxgkmdtOpmHdcpKeySelectionVector.typeLayout()).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (11).toInt())
                        ).readNative(addr + 29L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 40L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 56L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DxgkmdtOpmConnectedHdcpDeviceInformation) {
                    (DxgkmdtOpmRandomNumber.typeLayout()).writeNative(addr, value.rnRandomNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulStatusFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ulHDCPFlags)
                    (DxgkmdtOpmHdcpKeySelectionVector.typeLayout()).writeNative(addr + 24L, value.ksvB)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (11).toInt())
                    ).writeNative(addr + 29L, value.reserved.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 40L, value.reserved2.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 56L, value.reserved3.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmEncryptedParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmEncryptedParameters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 256L
                override fun readNative(addr: Long): DxgkmdtOpmEncryptedParameters =
                    DxgkmdtOpmEncryptedParameters(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DxgkmdtOpmEncryptedParameters) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr, value.abEncryptedParameters.toList())
                }
            }
    }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmHdcpKeySelectionVector> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmHdcpKeySelectionVector> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 5L
                override fun readNative(addr: Long): DxgkmdtOpmHdcpKeySelectionVector =
                    DxgkmdtOpmHdcpKeySelectionVector(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DxgkmdtOpmHdcpKeySelectionVector) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                    ).writeNative(addr, value.abKeySelectionVector.toList())
                }
            }
    }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmOmac> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmOmac> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DxgkmdtOpmOmac =
                    DxgkmdtOpmOmac(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DxgkmdtOpmOmac) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.abOMAC.toList())
                }
            }
    }
}

public data class DxgkmdtOpmOutputId(
    public var rnRandomNumber: DxgkmdtOpmRandomNumber = DxgkmdtOpmRandomNumber(),
    public var ulStatusFlags: UInt = 0u,
    public var outputId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmOutputId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmOutputId> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): DxgkmdtOpmOutputId =
                    DxgkmdtOpmOutputId(
                        (DxgkmdtOpmRandomNumber.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: DxgkmdtOpmOutputId) {
                    (DxgkmdtOpmRandomNumber.typeLayout()).writeNative(addr, value.rnRandomNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulStatusFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 20L, value.outputId)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmRandomNumber> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmRandomNumber> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DxgkmdtOpmRandomNumber =
                    DxgkmdtOpmRandomNumber(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DxgkmdtOpmRandomNumber) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.abRandomNumber.toList())
                }
            }
    }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmRequestedInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmRequestedInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4096L
                override fun readNative(addr: Long): DxgkmdtOpmRequestedInformation =
                    DxgkmdtOpmRequestedInformation(
                        (DxgkmdtOpmOmac.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4076).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: DxgkmdtOpmRequestedInformation) {
                    (DxgkmdtOpmOmac.typeLayout()).writeNative(addr, value.omac)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbRequestedInformationSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4076).toInt())
                    ).writeNative(addr + 20L, value.abRequestedInformation.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmSetAcpAndCgmsaSignalingParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmSetAcpAndCgmsaSignalingParameters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): DxgkmdtOpmSetAcpAndCgmsaSignalingParameters =
                    DxgkmdtOpmSetAcpAndCgmsaSignalingParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 28L).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 44L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: DxgkmdtOpmSetAcpAndCgmsaSignalingParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulNewTVProtectionStandard)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulAspectRatioChangeMask1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulAspectRatioData1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulAspectRatioChangeMask2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulAspectRatioData2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ulAspectRatioChangeMask3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ulAspectRatioData3)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 28L, value.ulReserved.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 44L, value.ulReserved2.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.ulReserved3)
                }
            }
    }
}

public data class DxgkmdtOpmSetHdcpSrmParameters(
    public var ulSRMVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmSetHdcpSrmParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmSetHdcpSrmParameters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DxgkmdtOpmSetHdcpSrmParameters =
                    DxgkmdtOpmSetHdcpSrmParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DxgkmdtOpmSetHdcpSrmParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulSRMVersion)
                }
            }
    }
}

public data class DxgkmdtOpmSetProtectionLevelParameters(
    public var ulProtectionType: UInt = 0u,
    public var ulProtectionLevel: UInt = 0u,
    public var reserved: UInt = 0u,
    public var reserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmSetProtectionLevelParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmSetProtectionLevelParameters> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DxgkmdtOpmSetProtectionLevelParameters =
                    DxgkmdtOpmSetProtectionLevelParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DxgkmdtOpmSetProtectionLevelParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulProtectionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulProtectionLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved2)
                }
            }
    }
}

public data class DxgkmdtOpmStandardInformation(
    public var rnRandomNumber: DxgkmdtOpmRandomNumber = DxgkmdtOpmRandomNumber(),
    public var ulStatusFlags: UInt = 0u,
    public var ulInformation: UInt = 0u,
    public var ulReserved: UInt = 0u,
    public var ulReserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmStandardInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkmdtOpmStandardInformation> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DxgkmdtOpmStandardInformation =
                    DxgkmdtOpmStandardInformation(
                        (DxgkmdtOpmRandomNumber.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: DxgkmdtOpmStandardInformation) {
                    (DxgkmdtOpmRandomNumber.typeLayout()).writeNative(addr, value.rnRandomNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulStatusFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ulInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ulReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.ulReserved2)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkvgpuEscapePause00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkvgpuEscapePause00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DxgkvgpuEscapePause00 =
                    DxgkvgpuEscapePause00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DxgkvgpuEscapePause00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkAdapterPerfdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkAdapterPerfdata> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 53L
                override fun readNative(addr: Long): DxgkAdapterPerfdata =
                    DxgkAdapterPerfdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: DxgkAdapterPerfdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.memoryFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.maxMemoryFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.maxMemoryFrequencyOC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.memoryBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.pCIEBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.fanRPM)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.power)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.temperature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 52L, value.powerStateOverride)
                }
            }
    }
}

public data class DxgkAdapterPerfdatacaps(
    public var maxMemoryBandwidth: ULong = 0uL,
    public var maxPCIEBandwidth: ULong = 0uL,
    public var maxFanRPM: UInt = 0u,
    public var temperatureMax: UInt = 0u,
    public var temperatureWarning: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkAdapterPerfdatacaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkAdapterPerfdatacaps> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): DxgkAdapterPerfdatacaps =
                    DxgkAdapterPerfdatacaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DxgkAdapterPerfdatacaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.maxMemoryBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.maxPCIEBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maxFanRPM)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.temperatureMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.temperatureWarning)
                }
            }
    }
}

public data class DxgkBacklightInfo(
    public var backlightUsersetting: UShort = 0u,
    public var backlightEffective: UShort = 0u,
    public var gammaRamp: D3dddiGammaRampRgb256x3x16 = D3dddiGammaRampRgb256x3x16(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBacklightInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBacklightInfo> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1540L
                override fun readNative(addr: Long): DxgkBacklightInfo =
                    DxgkBacklightInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (D3dddiGammaRampRgb256x3x16.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DxgkBacklightInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.backlightUsersetting)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.backlightEffective)
                    (D3dddiGammaRampRgb256x3x16.typeLayout()).writeNative(addr + 4L, value.gammaRamp)
                }
            }
    }
}

public data class DxgkBrightnessCaps(
    public var anonymous: DxgkBrightnessCaps0 = DxgkBrightnessCaps0(),
)

public data class DxgkBrightnessCaps0(
    public var anonymous: DxgkBrightnessCaps00 = DxgkBrightnessCaps00(),
    public var value: UInt = 0u,
)

public data class DxgkBrightnessCaps00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBrightnessCaps00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBrightnessCaps00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DxgkBrightnessCaps00 =
                    DxgkBrightnessCaps00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DxgkBrightnessCaps00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DxgkBrightnessGetNitRangesOut(
    public var normalRangeCount: UInt = 0u,
    public var rangeCount: UInt = 0u,
    public var preferredMaximumBrightness: UInt = 0u,
    public var supportedRanges: List<DxgkBrightnessNitRange> = List(16) { DxgkBrightnessNitRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBrightnessGetNitRangesOut> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBrightnessGetNitRangesOut> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 204L
                override fun readNative(addr: Long): DxgkBrightnessGetNitRangesOut =
                    DxgkBrightnessGetNitRangesOut(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(DxgkBrightnessNitRange.typeLayout(), (16).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: DxgkBrightnessGetNitRangesOut) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.normalRangeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.rangeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.preferredMaximumBrightness)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(DxgkBrightnessNitRange.typeLayout(), (16).toInt())
                    ).writeNative(addr + 12L, value.supportedRanges)
                }
            }
    }
}

public data class DxgkBrightnessGetOut(
    public var currentBrightnessMillinits: UInt = 0u,
    public var targetBrightnessMillinits: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBrightnessGetOut> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBrightnessGetOut> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DxgkBrightnessGetOut =
                    DxgkBrightnessGetOut(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DxgkBrightnessGetOut) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.currentBrightnessMillinits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.targetBrightnessMillinits)
                }
            }
    }
}

public data class DxgkBrightnessNitRange(
    public var minimumLevelMillinit: UInt = 0u,
    public var maximumLevelMillinit: UInt = 0u,
    public var stepSizeMillinit: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBrightnessNitRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBrightnessNitRange> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DxgkBrightnessNitRange =
                    DxgkBrightnessNitRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DxgkBrightnessNitRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minimumLevelMillinit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maximumLevelMillinit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stepSizeMillinit)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBrightnessSensorData00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBrightnessSensorData00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DxgkBrightnessSensorData00 =
                    DxgkBrightnessSensorData00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DxgkBrightnessSensorData00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DxgkBrightnessSensorDataChromaticity(
    public var chromaticityX: Float = 0.0f,
    public var chromaticityY: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBrightnessSensorDataChromaticity> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBrightnessSensorDataChromaticity> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DxgkBrightnessSensorDataChromaticity =
                    DxgkBrightnessSensorDataChromaticity(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DxgkBrightnessSensorDataChromaticity) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.chromaticityX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.chromaticityY)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBrightnessState00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkBrightnessState00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DxgkBrightnessState00 =
                    DxgkBrightnessState00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DxgkBrightnessState00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DxgkDisplayInformation(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var pitch: UInt = 0u,
    public var colorFormat: D3dddiformat = 0u,
    public var physicAddress: Long = 0L,
    public var targetId: UInt = 0u,
    public var acpiId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkDisplayInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkDisplayInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DxgkDisplayInformation =
                    DxgkDisplayInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: DxgkDisplayInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.height)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pitch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.colorFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.physicAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.targetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.acpiId)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkEscapeGpummucaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkEscapeGpummucaps> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 256L
                override fun readNative(addr: Long): DxgkEscapeGpummucaps =
                    DxgkEscapeGpummucaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(D3dkmtPageTableLevelDesc.typeLayout(), (6).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DxgkEscapeGpummucaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.readOnlyMemorySupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.noExecuteMemorySupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 2L, value.zeroInPteSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 3L, value.cacheCoherentMemorySupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.largePageSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 5L, value.dualPteSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 6L, value.allowNonAlignedLargePageAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.virtualAddressBitCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.pageTableLevelCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(D3dkmtPageTableLevelDesc.typeLayout(), (6).toInt())
                    ).writeNative(addr + 16L, value.pageTableLevelDesk)
                }
            }
    }
}

public data class DxgkFaultErrorCode(
    public var anonymous: DxgkFaultErrorCode0 = DxgkFaultErrorCode0(),
)

public data class DxgkFaultErrorCode0(
    public var anonymous1: DxgkFaultErrorCode00 = DxgkFaultErrorCode00(),
    public var anonymous2: DxgkFaultErrorCode01 = DxgkFaultErrorCode01(),
)

public data class DxgkFaultErrorCode00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkFaultErrorCode00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkFaultErrorCode00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DxgkFaultErrorCode00 =
                    DxgkFaultErrorCode00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DxgkFaultErrorCode00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DxgkFaultErrorCode01(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkFaultErrorCode01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkFaultErrorCode01> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DxgkFaultErrorCode01 =
                    DxgkFaultErrorCode01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DxgkFaultErrorCode01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkGpuclockdataFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkGpuclockdataFlags00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DxgkGpuclockdataFlags00 =
                    DxgkGpuclockdataFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DxgkGpuclockdataFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkGpuversion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkGpuversion> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): DxgkGpuversion =
                    DxgkGpuversion(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 64L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: DxgkGpuversion) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr, value.biosVersion.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 64L, value.gpuArchitecture.toList())
                }
            }
    }
}

public class DxgkGraphicspowerRegisterInputV12 internal constructor(
    public var version: UInt,
    privateHandleCtorArg: MutPtr<CVoid>,
    public var powerNotificationCb: PdxgkPowerNotification,
    public var removalNotificationCb: PdxgkRemovalNotification,
    public var fStateNotificationCb: PdxgkFstateNotification,
    public var initialComponentStateCb: PdxgkInitialComponentState,
) {
    public var privateHandle: MutPtr<CVoid> = privateHandleCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        privateHandleCtorArg = MutPtr(0L),
        powerNotificationCb = null,
        removalNotificationCb = null,
        fStateNotificationCb = null,
        initialComponentStateCb = null,
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): MutPtr<CVoid> = this.privateHandle

    public operator fun component3(): PdxgkPowerNotification = this.powerNotificationCb

    public operator fun component4(): PdxgkRemovalNotification = this.removalNotificationCb

    public operator fun component5(): PdxgkFstateNotification = this.fStateNotificationCb

    public operator fun component6(): PdxgkInitialComponentState = this.initialComponentStateCb

    public fun copy(version: UInt = this.version, privateHandle: MutPtr<CVoid> = this.privateHandle, powerNotificationCb: PdxgkPowerNotification = this.powerNotificationCb, removalNotificationCb: PdxgkRemovalNotification = this.removalNotificationCb, fStateNotificationCb: PdxgkFstateNotification = this.fStateNotificationCb, initialComponentStateCb: PdxgkInitialComponentState = this.initialComponentStateCb): DxgkGraphicspowerRegisterInputV12 = DxgkGraphicspowerRegisterInputV12(version = version, privateHandleCtorArg = privateHandle, powerNotificationCb = powerNotificationCb, removalNotificationCb = removalNotificationCb, fStateNotificationCb = fStateNotificationCb, initialComponentStateCb = initialComponentStateCb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DxgkGraphicspowerRegisterInputV12) return false
        if (this.version != other.version) return false
        if (this.privateHandle != other.privateHandle) return false
        if (this.powerNotificationCb != other.powerNotificationCb) return false
        if (this.removalNotificationCb != other.removalNotificationCb) return false
        if (this.fStateNotificationCb != other.fStateNotificationCb) return false
        if (this.initialComponentStateCb != other.initialComponentStateCb) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.privateHandle.hashCode()
        result = 31 * result + this.powerNotificationCb.hashCode()
        result = 31 * result + this.removalNotificationCb.hashCode()
        result = 31 * result + this.fStateNotificationCb.hashCode()
        result = 31 * result + this.initialComponentStateCb.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UInt = 0u,
            privateHandle: MutPtr<CVoid> = MutPtr(0L),
            powerNotificationCb: PdxgkPowerNotification = null,
            removalNotificationCb: PdxgkRemovalNotification = null,
            fStateNotificationCb: PdxgkFstateNotification = null,
            initialComponentStateCb: PdxgkInitialComponentState = null,
        ): DxgkGraphicspowerRegisterInputV12 =
            DxgkGraphicspowerRegisterInputV12(
                version = version,
                privateHandleCtorArg = privateHandle,
                powerNotificationCb = powerNotificationCb,
                removalNotificationCb = removalNotificationCb,
                fStateNotificationCb = fStateNotificationCb,
                initialComponentStateCb = initialComponentStateCb,
            )
    }
}

public class DxgkGraphicspowerRegisterOutput internal constructor(
    deviceHandleCtorArg: MutPtr<CVoid>,
    public var initialGrfxPowerState: DevicePowerState,
    public var setSharedPowerComponentStateCb: PdxgkSetSharedPowerComponentState,
    public var unregisterCb: PdxgkGraphicspowerUnregister,
) {
    public var deviceHandle: MutPtr<CVoid> = deviceHandleCtorArg
        internal set

    public constructor() : this(
        deviceHandleCtorArg = MutPtr(0L),
        initialGrfxPowerState = 0,
        setSharedPowerComponentStateCb = null,
        unregisterCb = null,
    )

    public operator fun component1(): MutPtr<CVoid> = this.deviceHandle

    public operator fun component2(): DevicePowerState = this.initialGrfxPowerState

    public operator fun component3(): PdxgkSetSharedPowerComponentState = this.setSharedPowerComponentStateCb

    public operator fun component4(): PdxgkGraphicspowerUnregister = this.unregisterCb

    public fun copy(deviceHandle: MutPtr<CVoid> = this.deviceHandle, initialGrfxPowerState: DevicePowerState = this.initialGrfxPowerState, setSharedPowerComponentStateCb: PdxgkSetSharedPowerComponentState = this.setSharedPowerComponentStateCb, unregisterCb: PdxgkGraphicspowerUnregister = this.unregisterCb): DxgkGraphicspowerRegisterOutput = DxgkGraphicspowerRegisterOutput(deviceHandleCtorArg = deviceHandle, initialGrfxPowerState = initialGrfxPowerState, setSharedPowerComponentStateCb = setSharedPowerComponentStateCb, unregisterCb = unregisterCb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DxgkGraphicspowerRegisterOutput) return false
        if (this.deviceHandle != other.deviceHandle) return false
        if (this.initialGrfxPowerState != other.initialGrfxPowerState) return false
        if (this.setSharedPowerComponentStateCb != other.setSharedPowerComponentStateCb) return false
        if (this.unregisterCb != other.unregisterCb) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceHandle.hashCode()
        result = 31 * result + this.initialGrfxPowerState.hashCode()
        result = 31 * result + this.setSharedPowerComponentStateCb.hashCode()
        result = 31 * result + this.unregisterCb.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            deviceHandle: MutPtr<CVoid> = MutPtr(0L),
            initialGrfxPowerState: DevicePowerState = 0,
            setSharedPowerComponentStateCb: PdxgkSetSharedPowerComponentState = null,
            unregisterCb: PdxgkGraphicspowerUnregister = null,
        ): DxgkGraphicspowerRegisterOutput =
            DxgkGraphicspowerRegisterOutput(
                deviceHandleCtorArg = deviceHandle,
                initialGrfxPowerState = initialGrfxPowerState,
                setSharedPowerComponentStateCb = setSharedPowerComponentStateCb,
                unregisterCb = unregisterCb,
            )
    }
}

public data class DxgkMiracastChunkId(
    public var anonymous: DxgkMiracastChunkId0 = DxgkMiracastChunkId0(),
    public var value: ULong = 0uL,
)

public data class DxgkMiracastChunkId0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkMiracastChunkId0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkMiracastChunkId0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DxgkMiracastChunkId0 =
                    DxgkMiracastChunkId0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DxgkMiracastChunkId0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkMonitorlinkinfoCapabilities0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkMonitorlinkinfoCapabilities0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DxgkMonitorlinkinfoCapabilities0 =
                    DxgkMonitorlinkinfoCapabilities0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DxgkMonitorlinkinfoCapabilities0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DxgkMonitorlinkinfoUsagehints(
    public var anonymous: DxgkMonitorlinkinfoUsagehints0 = DxgkMonitorlinkinfoUsagehints0(),
    public var value: UInt = 0u,
)

public data class DxgkMonitorlinkinfoUsagehints0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkMonitorlinkinfoUsagehints0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkMonitorlinkinfoUsagehints0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DxgkMonitorlinkinfoUsagehints0 =
                    DxgkMonitorlinkinfoUsagehints0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DxgkMonitorlinkinfoUsagehints0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkNodemetadataFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkNodemetadataFlags00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DxgkNodemetadataFlags00 =
                    DxgkNodemetadataFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DxgkNodemetadataFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DxgkNodePerfdata(
    public var frequency: ULong = 0uL,
    public var maxFrequency: ULong = 0uL,
    public var maxFrequencyOC: ULong = 0uL,
    public var voltage: UInt = 0u,
    public var voltageMax: UInt = 0u,
    public var voltageMaxOC: UInt = 0u,
    public var maxTransitionLatency: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkNodePerfdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkNodePerfdata> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): DxgkNodePerfdata =
                    DxgkNodePerfdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: DxgkNodePerfdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.frequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.maxFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.maxFrequencyOC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.voltage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.voltageMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.voltageMaxOC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 36L, value.maxTransitionLatency)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkPte00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkPte00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DxgkPte00 =
                    DxgkPte00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DxgkPte00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DxgkPte1(
    public var pageAddress: ULong = 0uL,
    public var pageTableAddress: ULong = 0uL,
)

public data class DxgkTargetmodeDetailTiming(
    public var videoStandard: D3dkmdtVideoSignalStandard = 0,
    public var timingId: UInt = 0u,
    public var detailTiming: DisplayidDetailedTimingTypeI = DisplayidDetailedTimingTypeI(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkTargetmodeDetailTiming> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkTargetmodeDetailTiming> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): DxgkTargetmodeDetailTiming =
                    DxgkTargetmodeDetailTiming(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (DisplayidDetailedTimingTypeI.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DxgkTargetmodeDetailTiming) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.videoStandard)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.timingId)
                    (DisplayidDetailedTimingTypeI.typeLayout()).writeNative(addr + 8L, value.detailTiming)
                }
            }
    }
}

public data class GpupDriverEscapeInput(
    public var vfLUID: Luid = Luid(),
)

public class OutputduplContextDebugInfo internal constructor(
    public var status: OutputduplContextDebugStatus,
    processIDCtorArg: Handle,
    public var accumulatedPresents: UInt,
    public var lastPresentTime: Long,
    public var lastMouseTime: Long,
    public var processName: ByteArray,
) {
    public var processID: Handle = processIDCtorArg
        internal set

    public constructor() : this(
        status = 0,
        processIDCtorArg = MutPtr(0L),
        accumulatedPresents = 0u,
        lastPresentTime = 0L,
        lastMouseTime = 0L,
        processName = ByteArray(16),
    )

    public operator fun component1(): OutputduplContextDebugStatus = this.status

    public operator fun component2(): Handle = this.processID

    public operator fun component3(): UInt = this.accumulatedPresents

    public operator fun component4(): Long = this.lastPresentTime

    public operator fun component5(): Long = this.lastMouseTime

    public operator fun component6(): ByteArray = this.processName

    public fun copy(status: OutputduplContextDebugStatus = this.status, processID: Handle = this.processID, accumulatedPresents: UInt = this.accumulatedPresents, lastPresentTime: Long = this.lastPresentTime, lastMouseTime: Long = this.lastMouseTime, processName: ByteArray = this.processName): OutputduplContextDebugInfo = OutputduplContextDebugInfo(status = status, processIDCtorArg = processID, accumulatedPresents = accumulatedPresents, lastPresentTime = lastPresentTime, lastMouseTime = lastMouseTime, processName = processName)

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

    public companion object {
        public operator fun invoke(
            status: OutputduplContextDebugStatus = 0,
            processID: Handle = MutPtr(0L),
            accumulatedPresents: UInt = 0u,
            lastPresentTime: Long = 0L,
            lastMouseTime: Long = 0L,
            processName: ByteArray = ByteArray(16),
        ): OutputduplContextDebugInfo =
            OutputduplContextDebugInfo(
                status = status,
                processIDCtorArg = processID,
                accumulatedPresents = accumulatedPresents,
                lastPresentTime = lastPresentTime,
                lastMouseTime = lastMouseTime,
                processName = processName,
            )
    }
}

public data class NtD3dlinepattern(
    public var wRepeatFactor: UShort = 0u,
    public var wLinePattern: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtD3dlinepattern> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtD3dlinepattern> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NtD3dlinepattern =
                    NtD3dlinepattern(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: NtD3dlinepattern) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wRepeatFactor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wLinePattern)
                }
            }
    }
}
