@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Ciexyz
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Ciexyztriple
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Emr
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Dlgproc

public data class BlackInformation(
    public var fBlackOnly: Bool = 0,
    public var blackWeight: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BlackInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BlackInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BlackInformation =
                    BlackInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: BlackInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fBlackOnly)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.blackWeight)
                }
            }
    }
}

public data class Cmykcolor(
    public var cyan: UShort = 0u,
    public var magenta: UShort = 0u,
    public var yellow: UShort = 0u,
    public var black: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmykcolor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmykcolor> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Cmykcolor =
                    Cmykcolor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Cmykcolor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cyan)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.magenta)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.yellow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.black)
                }
            }
    }
}

public data class Color(
    public var gray: Graycolor = Graycolor(),
    public var rgb: Rgbcolor = Rgbcolor(),
    public var cmyk: Cmykcolor = Cmykcolor(),
    public var xyz: Xyzcolor = Xyzcolor(),
    public var yxy: YxyCOLOR = YxyCOLOR(),
    public var lab: LabCOLOR = LabCOLOR(),
    public var gen3ch: Generic3channel = Generic3channel(),
    public var named: Namedcolor = Namedcolor(),
    public var hifi: HiFiCOLOR = HiFiCOLOR(),
    public var anonymous: Color0 = Color0(),
)

public class Color0 internal constructor(
    public var reserved1: UInt,
    reserved2CtorArg: MutPtr<CVoid>,
) {
    public var reserved2: MutPtr<CVoid> = reserved2CtorArg
        internal set

    public constructor() : this(
        reserved1 = 0u,
        reserved2CtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.reserved1

    public operator fun component2(): MutPtr<CVoid> = this.reserved2

    public fun copy(reserved1: UInt = this.reserved1, reserved2: MutPtr<CVoid> = this.reserved2): Color0 = Color0(reserved1 = reserved1, reserved2CtorArg = reserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Color0) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Color0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Color0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Color0 =
                    Color0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Color0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.reserved2)
                }
            }

        public operator fun invoke(
            reserved1: UInt = 0u,
            reserved2: MutPtr<CVoid> = MutPtr(0L),
        ): Color0 =
            Color0(
                reserved1 = reserved1,
                reserved2CtorArg = reserved2,
            )
    }
}

public class Colormatchsetupa internal constructor(
    public var dwSize: UInt,
    public var dwVersion: UInt,
    public var dwFlags: UInt,
    hwndOwnerCtorArg: Hwnd,
    pSourceNameCtorArg: Pcstr,
    pDisplayNameCtorArg: Pcstr,
    pPrinterNameCtorArg: Pcstr,
    public var dwRenderIntent: UInt,
    public var dwProofingIntent: UInt,
    pMonitorProfileCtorArg: Pstr,
    public var ccMonitorProfile: UInt,
    pPrinterProfileCtorArg: Pstr,
    public var ccPrinterProfile: UInt,
    pTargetProfileCtorArg: Pstr,
    public var ccTargetProfile: UInt,
    public var lpfnHook: Dlgproc,
    public var lParam: Lparam,
    public var lpfnApplyCallback: Pcmscallbacka,
    public var lParamApplyCallback: Lparam,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var pSourceName: Pcstr = pSourceNameCtorArg
        internal set

    public var pDisplayName: Pcstr = pDisplayNameCtorArg
        internal set

    public var pPrinterName: Pcstr = pPrinterNameCtorArg
        internal set

    public var pMonitorProfile: Pstr = pMonitorProfileCtorArg
        internal set

    public var pPrinterProfile: Pstr = pPrinterProfileCtorArg
        internal set

    public var pTargetProfile: Pstr = pTargetProfileCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwVersion = 0u,
        dwFlags = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        pSourceNameCtorArg = ConstPtr(0L),
        pDisplayNameCtorArg = ConstPtr(0L),
        pPrinterNameCtorArg = ConstPtr(0L),
        dwRenderIntent = 0u,
        dwProofingIntent = 0u,
        pMonitorProfileCtorArg = MutPtr(0L),
        ccMonitorProfile = 0u,
        pPrinterProfileCtorArg = MutPtr(0L),
        ccPrinterProfile = 0u,
        pTargetProfileCtorArg = MutPtr(0L),
        ccTargetProfile = 0u,
        lpfnHook = null,
        lParam = 0L,
        lpfnApplyCallback = null,
        lParamApplyCallback = 0L,
    )

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwVersion: UInt = 0u,
            dwFlags: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            pSourceName: Pcstr = ConstPtr(0L),
            pDisplayName: Pcstr = ConstPtr(0L),
            pPrinterName: Pcstr = ConstPtr(0L),
            dwRenderIntent: UInt = 0u,
            dwProofingIntent: UInt = 0u,
            pMonitorProfile: Pstr = MutPtr(0L),
            ccMonitorProfile: UInt = 0u,
            pPrinterProfile: Pstr = MutPtr(0L),
            ccPrinterProfile: UInt = 0u,
            pTargetProfile: Pstr = MutPtr(0L),
            ccTargetProfile: UInt = 0u,
            lpfnHook: Dlgproc = null,
            lParam: Lparam = 0L,
            lpfnApplyCallback: Pcmscallbacka = null,
            lParamApplyCallback: Lparam = 0L,
        ): Colormatchsetupa =
            Colormatchsetupa(
                dwSize = dwSize,
                dwVersion = dwVersion,
                dwFlags = dwFlags,
                hwndOwnerCtorArg = hwndOwner,
                pSourceNameCtorArg = pSourceName,
                pDisplayNameCtorArg = pDisplayName,
                pPrinterNameCtorArg = pPrinterName,
                dwRenderIntent = dwRenderIntent,
                dwProofingIntent = dwProofingIntent,
                pMonitorProfileCtorArg = pMonitorProfile,
                ccMonitorProfile = ccMonitorProfile,
                pPrinterProfileCtorArg = pPrinterProfile,
                ccPrinterProfile = ccPrinterProfile,
                pTargetProfileCtorArg = pTargetProfile,
                ccTargetProfile = ccTargetProfile,
                lpfnHook = lpfnHook,
                lParam = lParam,
                lpfnApplyCallback = lpfnApplyCallback,
                lParamApplyCallback = lParamApplyCallback,
            )
    }
}

public class Colormatchsetupw internal constructor(
    public var dwSize: UInt,
    public var dwVersion: UInt,
    public var dwFlags: UInt,
    hwndOwnerCtorArg: Hwnd,
    pSourceNameCtorArg: Pcwstr,
    pDisplayNameCtorArg: Pcwstr,
    pPrinterNameCtorArg: Pcwstr,
    public var dwRenderIntent: UInt,
    public var dwProofingIntent: UInt,
    pMonitorProfileCtorArg: Pwstr,
    public var ccMonitorProfile: UInt,
    pPrinterProfileCtorArg: Pwstr,
    public var ccPrinterProfile: UInt,
    pTargetProfileCtorArg: Pwstr,
    public var ccTargetProfile: UInt,
    public var lpfnHook: Dlgproc,
    public var lParam: Lparam,
    public var lpfnApplyCallback: Pcmscallbackw,
    public var lParamApplyCallback: Lparam,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var pSourceName: Pcwstr = pSourceNameCtorArg
        internal set

    public var pDisplayName: Pcwstr = pDisplayNameCtorArg
        internal set

    public var pPrinterName: Pcwstr = pPrinterNameCtorArg
        internal set

    public var pMonitorProfile: Pwstr = pMonitorProfileCtorArg
        internal set

    public var pPrinterProfile: Pwstr = pPrinterProfileCtorArg
        internal set

    public var pTargetProfile: Pwstr = pTargetProfileCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwVersion = 0u,
        dwFlags = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        pSourceNameCtorArg = ConstPtr(0L),
        pDisplayNameCtorArg = ConstPtr(0L),
        pPrinterNameCtorArg = ConstPtr(0L),
        dwRenderIntent = 0u,
        dwProofingIntent = 0u,
        pMonitorProfileCtorArg = MutPtr(0L),
        ccMonitorProfile = 0u,
        pPrinterProfileCtorArg = MutPtr(0L),
        ccPrinterProfile = 0u,
        pTargetProfileCtorArg = MutPtr(0L),
        ccTargetProfile = 0u,
        lpfnHook = null,
        lParam = 0L,
        lpfnApplyCallback = null,
        lParamApplyCallback = 0L,
    )

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwVersion: UInt = 0u,
            dwFlags: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            pSourceName: Pcwstr = ConstPtr(0L),
            pDisplayName: Pcwstr = ConstPtr(0L),
            pPrinterName: Pcwstr = ConstPtr(0L),
            dwRenderIntent: UInt = 0u,
            dwProofingIntent: UInt = 0u,
            pMonitorProfile: Pwstr = MutPtr(0L),
            ccMonitorProfile: UInt = 0u,
            pPrinterProfile: Pwstr = MutPtr(0L),
            ccPrinterProfile: UInt = 0u,
            pTargetProfile: Pwstr = MutPtr(0L),
            ccTargetProfile: UInt = 0u,
            lpfnHook: Dlgproc = null,
            lParam: Lparam = 0L,
            lpfnApplyCallback: Pcmscallbackw = null,
            lParamApplyCallback: Lparam = 0L,
        ): Colormatchsetupw =
            Colormatchsetupw(
                dwSize = dwSize,
                dwVersion = dwVersion,
                dwFlags = dwFlags,
                hwndOwnerCtorArg = hwndOwner,
                pSourceNameCtorArg = pSourceName,
                pDisplayNameCtorArg = pDisplayName,
                pPrinterNameCtorArg = pPrinterName,
                dwRenderIntent = dwRenderIntent,
                dwProofingIntent = dwProofingIntent,
                pMonitorProfileCtorArg = pMonitorProfile,
                ccMonitorProfile = ccMonitorProfile,
                pPrinterProfileCtorArg = pPrinterProfile,
                ccPrinterProfile = ccPrinterProfile,
                pTargetProfileCtorArg = pTargetProfile,
                ccTargetProfile = ccTargetProfile,
                lpfnHook = lpfnHook,
                lParam = lParam,
                lpfnApplyCallback = lpfnApplyCallback,
                lParamApplyCallback = lParamApplyCallback,
            )
    }
}

public data class Emrcreatecolorspace(
    public var emr: Emr = Emr(),
    public var ihCS: UInt = 0u,
    public var lcs: Logcolorspacea = Logcolorspacea(),
)

public data class Emrcreatecolorspacew(
    public var emr: Emr = Emr(),
    public var ihCS: UInt = 0u,
    public var lcs: Logcolorspacew = Logcolorspacew(),
    public var dwFlags: UInt = 0u,
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrcreatecolorspacew) return false
        if (this.emr != other.emr) return false
        if (this.ihCS != other.ihCS) return false
        if (this.lcs != other.lcs) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.ihCS.hashCode()
        result = 31 * result + this.lcs.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public class Enumtypea internal constructor(
    public var dwSize: UInt,
    public var dwVersion: UInt,
    public var dwFields: UInt,
    pDeviceNameCtorArg: Pcstr,
    public var dwMediaType: UInt,
    public var dwDitheringMode: UInt,
    public var dwResolution: UIntArray,
    public var dwCMMType: UInt,
    public var dwClass: UInt,
    public var dwDataColorSpace: UInt,
    public var dwConnectionSpace: UInt,
    public var dwSignature: UInt,
    public var dwPlatform: UInt,
    public var dwProfileFlags: UInt,
    public var dwManufacturer: UInt,
    public var dwModel: UInt,
    public var dwAttributes: UIntArray,
    public var dwRenderingIntent: UInt,
    public var dwCreator: UInt,
    public var dwDeviceClass: UInt,
) {
    public var pDeviceName: Pcstr = pDeviceNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwVersion = 0u,
        dwFields = 0u,
        pDeviceNameCtorArg = ConstPtr(0L),
        dwMediaType = 0u,
        dwDitheringMode = 0u,
        dwResolution = UIntArray(2),
        dwCMMType = 0u,
        dwClass = 0u,
        dwDataColorSpace = 0u,
        dwConnectionSpace = 0u,
        dwSignature = 0u,
        dwPlatform = 0u,
        dwProfileFlags = 0u,
        dwManufacturer = 0u,
        dwModel = 0u,
        dwAttributes = UIntArray(2),
        dwRenderingIntent = 0u,
        dwCreator = 0u,
        dwDeviceClass = 0u,
    )

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwVersion: UInt = 0u,
            dwFields: UInt = 0u,
            pDeviceName: Pcstr = ConstPtr(0L),
            dwMediaType: UInt = 0u,
            dwDitheringMode: UInt = 0u,
            dwResolution: UIntArray = UIntArray(2),
            dwCMMType: UInt = 0u,
            dwClass: UInt = 0u,
            dwDataColorSpace: UInt = 0u,
            dwConnectionSpace: UInt = 0u,
            dwSignature: UInt = 0u,
            dwPlatform: UInt = 0u,
            dwProfileFlags: UInt = 0u,
            dwManufacturer: UInt = 0u,
            dwModel: UInt = 0u,
            dwAttributes: UIntArray = UIntArray(2),
            dwRenderingIntent: UInt = 0u,
            dwCreator: UInt = 0u,
            dwDeviceClass: UInt = 0u,
        ): Enumtypea =
            Enumtypea(
                dwSize = dwSize,
                dwVersion = dwVersion,
                dwFields = dwFields,
                pDeviceNameCtorArg = pDeviceName,
                dwMediaType = dwMediaType,
                dwDitheringMode = dwDitheringMode,
                dwResolution = dwResolution,
                dwCMMType = dwCMMType,
                dwClass = dwClass,
                dwDataColorSpace = dwDataColorSpace,
                dwConnectionSpace = dwConnectionSpace,
                dwSignature = dwSignature,
                dwPlatform = dwPlatform,
                dwProfileFlags = dwProfileFlags,
                dwManufacturer = dwManufacturer,
                dwModel = dwModel,
                dwAttributes = dwAttributes,
                dwRenderingIntent = dwRenderingIntent,
                dwCreator = dwCreator,
                dwDeviceClass = dwDeviceClass,
            )
    }
}

public class Enumtypew internal constructor(
    public var dwSize: UInt,
    public var dwVersion: UInt,
    public var dwFields: UInt,
    pDeviceNameCtorArg: Pcwstr,
    public var dwMediaType: UInt,
    public var dwDitheringMode: UInt,
    public var dwResolution: UIntArray,
    public var dwCMMType: UInt,
    public var dwClass: UInt,
    public var dwDataColorSpace: UInt,
    public var dwConnectionSpace: UInt,
    public var dwSignature: UInt,
    public var dwPlatform: UInt,
    public var dwProfileFlags: UInt,
    public var dwManufacturer: UInt,
    public var dwModel: UInt,
    public var dwAttributes: UIntArray,
    public var dwRenderingIntent: UInt,
    public var dwCreator: UInt,
    public var dwDeviceClass: UInt,
) {
    public var pDeviceName: Pcwstr = pDeviceNameCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwVersion = 0u,
        dwFields = 0u,
        pDeviceNameCtorArg = ConstPtr(0L),
        dwMediaType = 0u,
        dwDitheringMode = 0u,
        dwResolution = UIntArray(2),
        dwCMMType = 0u,
        dwClass = 0u,
        dwDataColorSpace = 0u,
        dwConnectionSpace = 0u,
        dwSignature = 0u,
        dwPlatform = 0u,
        dwProfileFlags = 0u,
        dwManufacturer = 0u,
        dwModel = 0u,
        dwAttributes = UIntArray(2),
        dwRenderingIntent = 0u,
        dwCreator = 0u,
        dwDeviceClass = 0u,
    )

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwVersion: UInt = 0u,
            dwFields: UInt = 0u,
            pDeviceName: Pcwstr = ConstPtr(0L),
            dwMediaType: UInt = 0u,
            dwDitheringMode: UInt = 0u,
            dwResolution: UIntArray = UIntArray(2),
            dwCMMType: UInt = 0u,
            dwClass: UInt = 0u,
            dwDataColorSpace: UInt = 0u,
            dwConnectionSpace: UInt = 0u,
            dwSignature: UInt = 0u,
            dwPlatform: UInt = 0u,
            dwProfileFlags: UInt = 0u,
            dwManufacturer: UInt = 0u,
            dwModel: UInt = 0u,
            dwAttributes: UIntArray = UIntArray(2),
            dwRenderingIntent: UInt = 0u,
            dwCreator: UInt = 0u,
            dwDeviceClass: UInt = 0u,
        ): Enumtypew =
            Enumtypew(
                dwSize = dwSize,
                dwVersion = dwVersion,
                dwFields = dwFields,
                pDeviceNameCtorArg = pDeviceName,
                dwMediaType = dwMediaType,
                dwDitheringMode = dwDitheringMode,
                dwResolution = dwResolution,
                dwCMMType = dwCMMType,
                dwClass = dwClass,
                dwDataColorSpace = dwDataColorSpace,
                dwConnectionSpace = dwConnectionSpace,
                dwSignature = dwSignature,
                dwPlatform = dwPlatform,
                dwProfileFlags = dwProfileFlags,
                dwManufacturer = dwManufacturer,
                dwModel = dwModel,
                dwAttributes = dwAttributes,
                dwRenderingIntent = dwRenderingIntent,
                dwCreator = dwCreator,
                dwDeviceClass = dwDeviceClass,
            )
    }
}

public data class Generic3channel(
    public var ch1: UShort = 0u,
    public var ch2: UShort = 0u,
    public var ch3: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Generic3channel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Generic3channel> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): Generic3channel =
                    Generic3channel(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Generic3channel) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.ch1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.ch2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.ch3)
                }
            }
    }
}

public data class Graycolor(
    public var gray: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Graycolor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Graycolor> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): Graycolor =
                    Graycolor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Graycolor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.gray)
                }
            }
    }
}

public class GamutBoundaryDescription internal constructor(
    pPrimariesCtorArg: MutPtr<PrimaryJabColors>,
    public var cNeutralSamples: UInt,
    pNeutralSamplesCtorArg: MutPtr<JabColorF>,
    pReferenceShellCtorArg: MutPtr<GamutShell>,
    pPlausibleShellCtorArg: MutPtr<GamutShell>,
    pPossibleShellCtorArg: MutPtr<GamutShell>,
) {
    public var pPrimaries: MutPtr<PrimaryJabColors> = pPrimariesCtorArg
        internal set

    public var pNeutralSamples: MutPtr<JabColorF> = pNeutralSamplesCtorArg
        internal set

    public var pReferenceShell: MutPtr<GamutShell> = pReferenceShellCtorArg
        internal set

    public var pPlausibleShell: MutPtr<GamutShell> = pPlausibleShellCtorArg
        internal set

    public var pPossibleShell: MutPtr<GamutShell> = pPossibleShellCtorArg
        internal set

    public constructor() : this(
        pPrimariesCtorArg = MutPtr(0L),
        cNeutralSamples = 0u,
        pNeutralSamplesCtorArg = MutPtr(0L),
        pReferenceShellCtorArg = MutPtr(0L),
        pPlausibleShellCtorArg = MutPtr(0L),
        pPossibleShellCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<PrimaryJabColors> = this.pPrimaries

    public operator fun component2(): UInt = this.cNeutralSamples

    public operator fun component3(): MutPtr<JabColorF> = this.pNeutralSamples

    public operator fun component4(): MutPtr<GamutShell> = this.pReferenceShell

    public operator fun component5(): MutPtr<GamutShell> = this.pPlausibleShell

    public operator fun component6(): MutPtr<GamutShell> = this.pPossibleShell

    public fun copy(pPrimaries: MutPtr<PrimaryJabColors> = this.pPrimaries, cNeutralSamples: UInt = this.cNeutralSamples, pNeutralSamples: MutPtr<JabColorF> = this.pNeutralSamples, pReferenceShell: MutPtr<GamutShell> = this.pReferenceShell, pPlausibleShell: MutPtr<GamutShell> = this.pPlausibleShell, pPossibleShell: MutPtr<GamutShell> = this.pPossibleShell): GamutBoundaryDescription = GamutBoundaryDescription(pPrimariesCtorArg = pPrimaries, cNeutralSamples = cNeutralSamples, pNeutralSamplesCtorArg = pNeutralSamples, pReferenceShellCtorArg = pReferenceShell, pPlausibleShellCtorArg = pPlausibleShell, pPossibleShellCtorArg = pPossibleShell)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GamutBoundaryDescription) return false
        if (this.pPrimaries != other.pPrimaries) return false
        if (this.cNeutralSamples != other.cNeutralSamples) return false
        if (this.pNeutralSamples != other.pNeutralSamples) return false
        if (this.pReferenceShell != other.pReferenceShell) return false
        if (this.pPlausibleShell != other.pPlausibleShell) return false
        if (this.pPossibleShell != other.pPossibleShell) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pPrimaries.hashCode()
        result = 31 * result + this.cNeutralSamples.hashCode()
        result = 31 * result + this.pNeutralSamples.hashCode()
        result = 31 * result + this.pReferenceShell.hashCode()
        result = 31 * result + this.pPlausibleShell.hashCode()
        result = 31 * result + this.pPossibleShell.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GamutBoundaryDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GamutBoundaryDescription> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): GamutBoundaryDescription =
                    GamutBoundaryDescription(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PrimaryJabColors>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<JabColorF>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<GamutShell>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<GamutShell>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<GamutShell>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: GamutBoundaryDescription) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PrimaryJabColors>(64)
                    ).writeNative(addr, value.pPrimaries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cNeutralSamples)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<JabColorF>(64)
                    ).writeNative(addr + 16L, value.pNeutralSamples)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<GamutShell>(64)
                    ).writeNative(addr + 24L, value.pReferenceShell)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<GamutShell>(64)
                    ).writeNative(addr + 32L, value.pPlausibleShell)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<GamutShell>(64)
                    ).writeNative(addr + 40L, value.pPossibleShell)
                }
            }

        public operator fun invoke(
            pPrimaries: MutPtr<PrimaryJabColors> = MutPtr(0L),
            cNeutralSamples: UInt = 0u,
            pNeutralSamples: MutPtr<JabColorF> = MutPtr(0L),
            pReferenceShell: MutPtr<GamutShell> = MutPtr(0L),
            pPlausibleShell: MutPtr<GamutShell> = MutPtr(0L),
            pPossibleShell: MutPtr<GamutShell> = MutPtr(0L),
        ): GamutBoundaryDescription =
            GamutBoundaryDescription(
                pPrimariesCtorArg = pPrimaries,
                cNeutralSamples = cNeutralSamples,
                pNeutralSamplesCtorArg = pNeutralSamples,
                pReferenceShellCtorArg = pReferenceShell,
                pPlausibleShellCtorArg = pPlausibleShell,
                pPossibleShellCtorArg = pPossibleShell,
            )
    }
}

public class GamutShell internal constructor(
    public var jMin: Float,
    public var jMax: Float,
    public var cVertices: UInt,
    public var cTriangles: UInt,
    pVerticesCtorArg: MutPtr<JabColorF>,
    pTrianglesCtorArg: MutPtr<GamutShellTriangle>,
) {
    public var pVertices: MutPtr<JabColorF> = pVerticesCtorArg
        internal set

    public var pTriangles: MutPtr<GamutShellTriangle> = pTrianglesCtorArg
        internal set

    public constructor() : this(
        jMin = 0.0f,
        jMax = 0.0f,
        cVertices = 0u,
        cTriangles = 0u,
        pVerticesCtorArg = MutPtr(0L),
        pTrianglesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Float = this.jMin

    public operator fun component2(): Float = this.jMax

    public operator fun component3(): UInt = this.cVertices

    public operator fun component4(): UInt = this.cTriangles

    public operator fun component5(): MutPtr<JabColorF> = this.pVertices

    public operator fun component6(): MutPtr<GamutShellTriangle> = this.pTriangles

    public fun copy(jMin: Float = this.jMin, jMax: Float = this.jMax, cVertices: UInt = this.cVertices, cTriangles: UInt = this.cTriangles, pVertices: MutPtr<JabColorF> = this.pVertices, pTriangles: MutPtr<GamutShellTriangle> = this.pTriangles): GamutShell = GamutShell(jMin = jMin, jMax = jMax, cVertices = cVertices, cTriangles = cTriangles, pVerticesCtorArg = pVertices, pTrianglesCtorArg = pTriangles)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GamutShell) return false
        if (this.jMin != other.jMin) return false
        if (this.jMax != other.jMax) return false
        if (this.cVertices != other.cVertices) return false
        if (this.cTriangles != other.cTriangles) return false
        if (this.pVertices != other.pVertices) return false
        if (this.pTriangles != other.pTriangles) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.jMin.hashCode()
        result = 31 * result + this.jMax.hashCode()
        result = 31 * result + this.cVertices.hashCode()
        result = 31 * result + this.cTriangles.hashCode()
        result = 31 * result + this.pVertices.hashCode()
        result = 31 * result + this.pTriangles.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GamutShell> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GamutShell> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): GamutShell =
                    GamutShell(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<JabColorF>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<GamutShellTriangle>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: GamutShell) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.jMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.jMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cVertices)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cTriangles)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<JabColorF>(64)
                    ).writeNative(addr + 16L, value.pVertices)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<GamutShellTriangle>(64)
                    ).writeNative(addr + 24L, value.pTriangles)
                }
            }

        public operator fun invoke(
            jMin: Float = 0.0f,
            jMax: Float = 0.0f,
            cVertices: UInt = 0u,
            cTriangles: UInt = 0u,
            pVertices: MutPtr<JabColorF> = MutPtr(0L),
            pTriangles: MutPtr<GamutShellTriangle> = MutPtr(0L),
        ): GamutShell =
            GamutShell(
                jMin = jMin,
                jMax = jMax,
                cVertices = cVertices,
                cTriangles = cTriangles,
                pVerticesCtorArg = pVertices,
                pTrianglesCtorArg = pTriangles,
            )
    }
}

public data class GamutShellTriangle(
    public var aVertexIndex: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GamutShellTriangle) return false
        if (!this.aVertexIndex.contentEquals(other.aVertexIndex)) return false
        return true
    }

    override fun hashCode(): Int = this.aVertexIndex.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GamutShellTriangle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GamutShellTriangle> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): GamutShellTriangle =
                    GamutShellTriangle(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: GamutShellTriangle) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr, value.aVertexIndex.toList())
                }
            }
    }
}

public data class HiFiCOLOR(
    public var channel: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HiFiCOLOR) return false
        if (!this.channel.contentEquals(other.channel)) return false
        return true
    }

    override fun hashCode(): Int = this.channel.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HiFiCOLOR> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HiFiCOLOR> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): HiFiCOLOR =
                    HiFiCOLOR(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: HiFiCOLOR) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr, value.channel.toList())
                }
            }
    }
}

public data class JChColorF(
    public var j: Float = 0.0f,
    public var c: Float = 0.0f,
    public var h: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JChColorF> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JChColorF> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): JChColorF =
                    JChColorF(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: JChColorF) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.j)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.c)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.h)
                }
            }
    }
}

public data class JabColorF(
    public var j: Float = 0.0f,
    public var a: Float = 0.0f,
    public var b: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<JabColorF> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<JabColorF> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): JabColorF =
                    JabColorF(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: JabColorF) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.j)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.a)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.b)
                }
            }
    }
}

public data class Logcolorspacea(
    public var lcsSignature: UInt = 0u,
    public var lcsVersion: UInt = 0u,
    public var lcsSize: UInt = 0u,
    public var lcsCSType: Lcscstype = 0,
    public var lcsIntent: Int = 0,
    public var lcsEndpoints: Ciexyztriple = Ciexyztriple(),
    public var lcsGammaRed: UInt = 0u,
    public var lcsGammaGreen: UInt = 0u,
    public var lcsGammaBlue: UInt = 0u,
    public var lcsFilename: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Logcolorspacea) return false
        if (this.lcsSignature != other.lcsSignature) return false
        if (this.lcsVersion != other.lcsVersion) return false
        if (this.lcsSize != other.lcsSize) return false
        if (this.lcsCSType != other.lcsCSType) return false
        if (this.lcsIntent != other.lcsIntent) return false
        if (this.lcsEndpoints != other.lcsEndpoints) return false
        if (this.lcsGammaRed != other.lcsGammaRed) return false
        if (this.lcsGammaGreen != other.lcsGammaGreen) return false
        if (this.lcsGammaBlue != other.lcsGammaBlue) return false
        if (!this.lcsFilename.contentEquals(other.lcsFilename)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lcsSignature.hashCode()
        result = 31 * result + this.lcsVersion.hashCode()
        result = 31 * result + this.lcsSize.hashCode()
        result = 31 * result + this.lcsCSType.hashCode()
        result = 31 * result + this.lcsIntent.hashCode()
        result = 31 * result + this.lcsEndpoints.hashCode()
        result = 31 * result + this.lcsGammaRed.hashCode()
        result = 31 * result + this.lcsGammaGreen.hashCode()
        result = 31 * result + this.lcsGammaBlue.hashCode()
        result = 31 * result + this.lcsFilename.contentHashCode()
        return result
    }
}

public data class Logcolorspacew(
    public var lcsSignature: UInt = 0u,
    public var lcsVersion: UInt = 0u,
    public var lcsSize: UInt = 0u,
    public var lcsCSType: Lcscstype = 0,
    public var lcsIntent: Int = 0,
    public var lcsEndpoints: Ciexyztriple = Ciexyztriple(),
    public var lcsGammaRed: UInt = 0u,
    public var lcsGammaGreen: UInt = 0u,
    public var lcsGammaBlue: UInt = 0u,
    public var lcsFilename: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Logcolorspacew) return false
        if (this.lcsSignature != other.lcsSignature) return false
        if (this.lcsVersion != other.lcsVersion) return false
        if (this.lcsSize != other.lcsSize) return false
        if (this.lcsCSType != other.lcsCSType) return false
        if (this.lcsIntent != other.lcsIntent) return false
        if (this.lcsEndpoints != other.lcsEndpoints) return false
        if (this.lcsGammaRed != other.lcsGammaRed) return false
        if (this.lcsGammaGreen != other.lcsGammaGreen) return false
        if (this.lcsGammaBlue != other.lcsGammaBlue) return false
        if (!this.lcsFilename.contentEquals(other.lcsFilename)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lcsSignature.hashCode()
        result = 31 * result + this.lcsVersion.hashCode()
        result = 31 * result + this.lcsSize.hashCode()
        result = 31 * result + this.lcsCSType.hashCode()
        result = 31 * result + this.lcsIntent.hashCode()
        result = 31 * result + this.lcsEndpoints.hashCode()
        result = 31 * result + this.lcsGammaRed.hashCode()
        result = 31 * result + this.lcsGammaGreen.hashCode()
        result = 31 * result + this.lcsGammaBlue.hashCode()
        result = 31 * result + this.lcsFilename.contentHashCode()
        return result
    }
}

public data class LabCOLOR(
    public var l: UShort = 0u,
    public var a: UShort = 0u,
    public var b: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LabCOLOR> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LabCOLOR> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): LabCOLOR =
                    LabCOLOR(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: LabCOLOR) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.l)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.a)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.b)
                }
            }
    }
}

public data class Namedcolor(
    public var dwIndex: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Namedcolor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Namedcolor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Namedcolor =
                    Namedcolor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Namedcolor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIndex)
                }
            }
    }
}

public data class NamedProfileInfo(
    public var dwFlags: UInt = 0u,
    public var dwCount: UInt = 0u,
    public var dwCountDevCoordinates: UInt = 0u,
    public var szPrefix: ByteArray = ByteArray(32),
    public var szSuffix: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NamedProfileInfo) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwCount != other.dwCount) return false
        if (this.dwCountDevCoordinates != other.dwCountDevCoordinates) return false
        if (!this.szPrefix.contentEquals(other.szPrefix)) return false
        if (!this.szSuffix.contentEquals(other.szSuffix)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.dwCount.hashCode()
        result = 31 * result + this.dwCountDevCoordinates.hashCode()
        result = 31 * result + this.szPrefix.contentHashCode()
        result = 31 * result + this.szSuffix.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NamedProfileInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NamedProfileInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 76L
                override fun readNative(addr: Long): NamedProfileInfo =
                    NamedProfileInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 12L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 44L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: NamedProfileInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCountDevCoordinates)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 12L, value.szPrefix.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 44L, value.szSuffix.toList())
                }
            }
    }
}

public class Profile internal constructor(
    public var dwType: UInt,
    pProfileDataCtorArg: MutPtr<CVoid>,
    public var cbDataSize: UInt,
) {
    public var pProfileData: MutPtr<CVoid> = pProfileDataCtorArg
        internal set

    public constructor() : this(
        dwType = 0u,
        pProfileDataCtorArg = MutPtr(0L),
        cbDataSize = 0u,
    )

    public operator fun component1(): UInt = this.dwType

    public operator fun component2(): MutPtr<CVoid> = this.pProfileData

    public operator fun component3(): UInt = this.cbDataSize

    public fun copy(dwType: UInt = this.dwType, pProfileData: MutPtr<CVoid> = this.pProfileData, cbDataSize: UInt = this.cbDataSize): Profile = Profile(dwType = dwType, pProfileDataCtorArg = pProfileData, cbDataSize = cbDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Profile) return false
        if (this.dwType != other.dwType) return false
        if (this.pProfileData != other.pProfileData) return false
        if (this.cbDataSize != other.cbDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwType.hashCode()
        result = 31 * result + this.pProfileData.hashCode()
        result = 31 * result + this.cbDataSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Profile> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Profile> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Profile =
                    Profile(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Profile) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pProfileData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbDataSize)
                }
            }

        public operator fun invoke(
            dwType: UInt = 0u,
            pProfileData: MutPtr<CVoid> = MutPtr(0L),
            cbDataSize: UInt = 0u,
        ): Profile =
            Profile(
                dwType = dwType,
                pProfileDataCtorArg = pProfileData,
                cbDataSize = cbDataSize,
            )
    }
}

public class Profileheader(
    public var phSize: UInt = 0u,
    public var phCMMType: UInt = 0u,
    public var phVersion: UInt = 0u,
    public var phClass: UInt = 0u,
    public var phDataColorSpace: UInt = 0u,
    public var phConnectionSpace: UInt = 0u,
    public var phDateTime: UIntArray = UIntArray(3),
    public var phSignature: UInt = 0u,
    public var phPlatform: UInt = 0u,
    public var phProfileFlags: UInt = 0u,
    public var phManufacturer: UInt = 0u,
    public var phModel: UInt = 0u,
    public var phAttributes: UIntArray = UIntArray(2),
    public var phRenderingIntent: UInt = 0u,
    public var phIlluminant: Ciexyz = Ciexyz(),
    public var phCreator: UInt = 0u,
    public var phReserved: UByteArray = UByteArray(44),
)

public data class PrimaryJabColors(
    public var red: JabColorF = JabColorF(),
    public var yellow: JabColorF = JabColorF(),
    public var green: JabColorF = JabColorF(),
    public var cyan: JabColorF = JabColorF(),
    public var blue: JabColorF = JabColorF(),
    public var magenta: JabColorF = JabColorF(),
    public var black: JabColorF = JabColorF(),
    public var white: JabColorF = JabColorF(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrimaryJabColors> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrimaryJabColors> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): PrimaryJabColors =
                    PrimaryJabColors(
                        (JabColorF.typeLayout()).readNative(addr),
                        (JabColorF.typeLayout()).readNative(addr + 12L),
                        (JabColorF.typeLayout()).readNative(addr + 24L),
                        (JabColorF.typeLayout()).readNative(addr + 36L),
                        (JabColorF.typeLayout()).readNative(addr + 48L),
                        (JabColorF.typeLayout()).readNative(addr + 60L),
                        (JabColorF.typeLayout()).readNative(addr + 72L),
                        (JabColorF.typeLayout()).readNative(addr + 84L),
                    )
                override fun writeNative(addr: Long, value: PrimaryJabColors) {
                    (JabColorF.typeLayout()).writeNative(addr, value.red)
                    (JabColorF.typeLayout()).writeNative(addr + 12L, value.yellow)
                    (JabColorF.typeLayout()).writeNative(addr + 24L, value.green)
                    (JabColorF.typeLayout()).writeNative(addr + 36L, value.cyan)
                    (JabColorF.typeLayout()).writeNative(addr + 48L, value.blue)
                    (JabColorF.typeLayout()).writeNative(addr + 60L, value.magenta)
                    (JabColorF.typeLayout()).writeNative(addr + 72L, value.black)
                    (JabColorF.typeLayout()).writeNative(addr + 84L, value.white)
                }
            }
    }
}

public data class PrimaryXYZColors(
    public var red: XYZColorF = XYZColorF(),
    public var yellow: XYZColorF = XYZColorF(),
    public var green: XYZColorF = XYZColorF(),
    public var cyan: XYZColorF = XYZColorF(),
    public var blue: XYZColorF = XYZColorF(),
    public var magenta: XYZColorF = XYZColorF(),
    public var black: XYZColorF = XYZColorF(),
    public var white: XYZColorF = XYZColorF(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrimaryXYZColors> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PrimaryXYZColors> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): PrimaryXYZColors =
                    PrimaryXYZColors(
                        (XYZColorF.typeLayout()).readNative(addr),
                        (XYZColorF.typeLayout()).readNative(addr + 12L),
                        (XYZColorF.typeLayout()).readNative(addr + 24L),
                        (XYZColorF.typeLayout()).readNative(addr + 36L),
                        (XYZColorF.typeLayout()).readNative(addr + 48L),
                        (XYZColorF.typeLayout()).readNative(addr + 60L),
                        (XYZColorF.typeLayout()).readNative(addr + 72L),
                        (XYZColorF.typeLayout()).readNative(addr + 84L),
                    )
                override fun writeNative(addr: Long, value: PrimaryXYZColors) {
                    (XYZColorF.typeLayout()).writeNative(addr, value.red)
                    (XYZColorF.typeLayout()).writeNative(addr + 12L, value.yellow)
                    (XYZColorF.typeLayout()).writeNative(addr + 24L, value.green)
                    (XYZColorF.typeLayout()).writeNative(addr + 36L, value.cyan)
                    (XYZColorF.typeLayout()).writeNative(addr + 48L, value.blue)
                    (XYZColorF.typeLayout()).writeNative(addr + 60L, value.magenta)
                    (XYZColorF.typeLayout()).writeNative(addr + 72L, value.black)
                    (XYZColorF.typeLayout()).writeNative(addr + 84L, value.white)
                }
            }
    }
}

public data class Rgbcolor(
    public var red: UShort = 0u,
    public var green: UShort = 0u,
    public var blue: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rgbcolor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rgbcolor> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): Rgbcolor =
                    Rgbcolor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Rgbcolor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.red)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.green)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.blue)
                }
            }
    }
}

public data class WcsDeviceMhc2Capabilities(
    public var size: UInt = 0u,
    public var supportsMhc2: Bool = 0,
    public var regammaLutEntryCount: UInt = 0u,
    public var cscXyzMatrixRows: UInt = 0u,
    public var cscXyzMatrixColumns: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WcsDeviceMhc2Capabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WcsDeviceMhc2Capabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): WcsDeviceMhc2Capabilities =
                    WcsDeviceMhc2Capabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WcsDeviceMhc2Capabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.supportsMhc2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.regammaLutEntryCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cscXyzMatrixRows)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cscXyzMatrixColumns)
                }
            }
    }
}

public data class WcsDeviceVcgtCapabilities(
    public var size: UInt = 0u,
    public var supportsVcgt: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WcsDeviceVcgtCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WcsDeviceVcgtCapabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WcsDeviceVcgtCapabilities =
                    WcsDeviceVcgtCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WcsDeviceVcgtCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.supportsVcgt)
                }
            }
    }
}

public data class Xyzcolor(
    public var x: UShort = 0u,
    public var y: UShort = 0u,
    public var z: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xyzcolor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xyzcolor> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): Xyzcolor =
                    Xyzcolor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Xyzcolor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.z)
                }
            }
    }
}

public data class XYZColorF(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var z: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XYZColorF> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XYZColorF> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): XYZColorF =
                    XYZColorF(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: XYZColorF) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.z)
                }
            }
    }
}

public data class YxyCOLOR(
    public var y: UShort = 0u,
    public var x: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<YxyCOLOR> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<YxyCOLOR> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): YxyCOLOR =
                    YxyCOLOR(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: YxyCOLOR) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.x)
                }
            }
    }
}
