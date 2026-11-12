package io.github.kotlinmania.windowssys.windows.win32.ui.accessibility

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.system.Variant

public data class Accesstimeout(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var iTimeOutMSec: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Accesstimeout> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Accesstimeout> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Accesstimeout =
                    Accesstimeout(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Accesstimeout) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.iTimeOutMSec)
                }
            }
    }
}

public class ExtendedProperty internal constructor(
    propertyNameCtorArg: Bstr,
    propertyValueCtorArg: Bstr,
) {
    public var propertyName: Bstr = propertyNameCtorArg
        internal set

    public var propertyValue: Bstr = propertyValueCtorArg
        internal set

    public constructor() : this(
        propertyNameCtorArg = ConstPtr(0L),
        propertyValueCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Bstr = this.propertyName

    public operator fun component2(): Bstr = this.propertyValue

    public fun copy(propertyName: Bstr = this.propertyName, propertyValue: Bstr = this.propertyValue): ExtendedProperty = ExtendedProperty(propertyNameCtorArg = propertyName, propertyValueCtorArg = propertyValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExtendedProperty) return false
        if (this.propertyName != other.propertyName) return false
        if (this.propertyValue != other.propertyValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.propertyName.hashCode()
        result = 31 * result + this.propertyValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            propertyName: Bstr = ConstPtr(0L),
            propertyValue: Bstr = ConstPtr(0L),
        ): ExtendedProperty =
            ExtendedProperty(
                propertyNameCtorArg = propertyName,
                propertyValueCtorArg = propertyValue,
            )
    }
}

public data class Filterkeys(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var iWaitMSec: UInt = 0u,
    public var iDelayMSec: UInt = 0u,
    public var iRepeatMSec: UInt = 0u,
    public var iBounceMSec: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Filterkeys> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Filterkeys> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Filterkeys =
                    Filterkeys(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Filterkeys) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.iWaitMSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.iDelayMSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.iRepeatMSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.iBounceMSec)
                }
            }
    }
}

public class Highcontrasta internal constructor(
    public var cbSize: UInt,
    public var dwFlags: HighcontrastwFlags,
    lpszDefaultSchemeCtorArg: Pstr,
) {
    public var lpszDefaultScheme: Pstr = lpszDefaultSchemeCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        lpszDefaultSchemeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): HighcontrastwFlags = this.dwFlags

    public operator fun component3(): Pstr = this.lpszDefaultScheme

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: HighcontrastwFlags = this.dwFlags, lpszDefaultScheme: Pstr = this.lpszDefaultScheme): Highcontrasta = Highcontrasta(cbSize = cbSize, dwFlags = dwFlags, lpszDefaultSchemeCtorArg = lpszDefaultScheme)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Highcontrasta) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpszDefaultScheme != other.lpszDefaultScheme) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lpszDefaultScheme.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: HighcontrastwFlags = 0u,
            lpszDefaultScheme: Pstr = MutPtr(0L),
        ): Highcontrasta =
            Highcontrasta(
                cbSize = cbSize,
                dwFlags = dwFlags,
                lpszDefaultSchemeCtorArg = lpszDefaultScheme,
            )
    }
}

public class Highcontrastw internal constructor(
    public var cbSize: UInt,
    public var dwFlags: HighcontrastwFlags,
    lpszDefaultSchemeCtorArg: Pwstr,
) {
    public var lpszDefaultScheme: Pwstr = lpszDefaultSchemeCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        lpszDefaultSchemeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): HighcontrastwFlags = this.dwFlags

    public operator fun component3(): Pwstr = this.lpszDefaultScheme

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: HighcontrastwFlags = this.dwFlags, lpszDefaultScheme: Pwstr = this.lpszDefaultScheme): Highcontrastw = Highcontrastw(cbSize = cbSize, dwFlags = dwFlags, lpszDefaultSchemeCtorArg = lpszDefaultScheme)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Highcontrastw) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpszDefaultScheme != other.lpszDefaultScheme) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lpszDefaultScheme.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: HighcontrastwFlags = 0u,
            lpszDefaultScheme: Pwstr = MutPtr(0L),
        ): Highcontrastw =
            Highcontrastw(
                cbSize = cbSize,
                dwFlags = dwFlags,
                lpszDefaultSchemeCtorArg = lpszDefaultScheme,
            )
    }
}

public data class Mousekeys(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var iMaxSpeed: UInt = 0u,
    public var iTimeToMaxSpeed: UInt = 0u,
    public var iCtrlSpeed: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mousekeys> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mousekeys> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Mousekeys =
                    Mousekeys(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Mousekeys) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.iMaxSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.iTimeToMaxSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.iCtrlSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwReserved2)
                }
            }
    }
}

public class Msaamenuinfo internal constructor(
    public var dwMSAASignature: UInt,
    public var cchWText: UInt,
    pszWTextCtorArg: Pwstr,
) {
    public var pszWText: Pwstr = pszWTextCtorArg
        internal set

    public constructor() : this(
        dwMSAASignature = 0u,
        cchWText = 0u,
        pszWTextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwMSAASignature

    public operator fun component2(): UInt = this.cchWText

    public operator fun component3(): Pwstr = this.pszWText

    public fun copy(dwMSAASignature: UInt = this.dwMSAASignature, cchWText: UInt = this.cchWText, pszWText: Pwstr = this.pszWText): Msaamenuinfo = Msaamenuinfo(dwMSAASignature = dwMSAASignature, cchWText = cchWText, pszWTextCtorArg = pszWText)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msaamenuinfo) return false
        if (this.dwMSAASignature != other.dwMSAASignature) return false
        if (this.cchWText != other.cchWText) return false
        if (this.pszWText != other.pszWText) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMSAASignature.hashCode()
        result = 31 * result + this.cchWText.hashCode()
        result = 31 * result + this.pszWText.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwMSAASignature: UInt = 0u,
            cchWText: UInt = 0u,
            pszWText: Pwstr = MutPtr(0L),
        ): Msaamenuinfo =
            Msaamenuinfo(
                dwMSAASignature = dwMSAASignature,
                cchWText = cchWText,
                pszWTextCtorArg = pszWText,
            )
    }
}

public class Serialkeysa internal constructor(
    public var cbSize: UInt,
    public var dwFlags: SerialkeysFlags,
    lpszActivePortCtorArg: Pstr,
    lpszPortCtorArg: Pstr,
    public var iBaudRate: UInt,
    public var iPortState: UInt,
    public var iActive: UInt,
) {
    public var lpszActivePort: Pstr = lpszActivePortCtorArg
        internal set

    public var lpszPort: Pstr = lpszPortCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        lpszActivePortCtorArg = MutPtr(0L),
        lpszPortCtorArg = MutPtr(0L),
        iBaudRate = 0u,
        iPortState = 0u,
        iActive = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): SerialkeysFlags = this.dwFlags

    public operator fun component3(): Pstr = this.lpszActivePort

    public operator fun component4(): Pstr = this.lpszPort

    public operator fun component5(): UInt = this.iBaudRate

    public operator fun component6(): UInt = this.iPortState

    public operator fun component7(): UInt = this.iActive

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: SerialkeysFlags = this.dwFlags, lpszActivePort: Pstr = this.lpszActivePort, lpszPort: Pstr = this.lpszPort, iBaudRate: UInt = this.iBaudRate, iPortState: UInt = this.iPortState, iActive: UInt = this.iActive): Serialkeysa = Serialkeysa(cbSize = cbSize, dwFlags = dwFlags, lpszActivePortCtorArg = lpszActivePort, lpszPortCtorArg = lpszPort, iBaudRate = iBaudRate, iPortState = iPortState, iActive = iActive)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Serialkeysa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpszActivePort != other.lpszActivePort) return false
        if (this.lpszPort != other.lpszPort) return false
        if (this.iBaudRate != other.iBaudRate) return false
        if (this.iPortState != other.iPortState) return false
        if (this.iActive != other.iActive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lpszActivePort.hashCode()
        result = 31 * result + this.lpszPort.hashCode()
        result = 31 * result + this.iBaudRate.hashCode()
        result = 31 * result + this.iPortState.hashCode()
        result = 31 * result + this.iActive.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: SerialkeysFlags = 0u,
            lpszActivePort: Pstr = MutPtr(0L),
            lpszPort: Pstr = MutPtr(0L),
            iBaudRate: UInt = 0u,
            iPortState: UInt = 0u,
            iActive: UInt = 0u,
        ): Serialkeysa =
            Serialkeysa(
                cbSize = cbSize,
                dwFlags = dwFlags,
                lpszActivePortCtorArg = lpszActivePort,
                lpszPortCtorArg = lpszPort,
                iBaudRate = iBaudRate,
                iPortState = iPortState,
                iActive = iActive,
            )
    }
}

public class Serialkeysw internal constructor(
    public var cbSize: UInt,
    public var dwFlags: SerialkeysFlags,
    lpszActivePortCtorArg: Pwstr,
    lpszPortCtorArg: Pwstr,
    public var iBaudRate: UInt,
    public var iPortState: UInt,
    public var iActive: UInt,
) {
    public var lpszActivePort: Pwstr = lpszActivePortCtorArg
        internal set

    public var lpszPort: Pwstr = lpszPortCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        lpszActivePortCtorArg = MutPtr(0L),
        lpszPortCtorArg = MutPtr(0L),
        iBaudRate = 0u,
        iPortState = 0u,
        iActive = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): SerialkeysFlags = this.dwFlags

    public operator fun component3(): Pwstr = this.lpszActivePort

    public operator fun component4(): Pwstr = this.lpszPort

    public operator fun component5(): UInt = this.iBaudRate

    public operator fun component6(): UInt = this.iPortState

    public operator fun component7(): UInt = this.iActive

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: SerialkeysFlags = this.dwFlags, lpszActivePort: Pwstr = this.lpszActivePort, lpszPort: Pwstr = this.lpszPort, iBaudRate: UInt = this.iBaudRate, iPortState: UInt = this.iPortState, iActive: UInt = this.iActive): Serialkeysw = Serialkeysw(cbSize = cbSize, dwFlags = dwFlags, lpszActivePortCtorArg = lpszActivePort, lpszPortCtorArg = lpszPort, iBaudRate = iBaudRate, iPortState = iPortState, iActive = iActive)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Serialkeysw) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpszActivePort != other.lpszActivePort) return false
        if (this.lpszPort != other.lpszPort) return false
        if (this.iBaudRate != other.iBaudRate) return false
        if (this.iPortState != other.iPortState) return false
        if (this.iActive != other.iActive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lpszActivePort.hashCode()
        result = 31 * result + this.lpszPort.hashCode()
        result = 31 * result + this.iBaudRate.hashCode()
        result = 31 * result + this.iPortState.hashCode()
        result = 31 * result + this.iActive.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: SerialkeysFlags = 0u,
            lpszActivePort: Pwstr = MutPtr(0L),
            lpszPort: Pwstr = MutPtr(0L),
            iBaudRate: UInt = 0u,
            iPortState: UInt = 0u,
            iActive: UInt = 0u,
        ): Serialkeysw =
            Serialkeysw(
                cbSize = cbSize,
                dwFlags = dwFlags,
                lpszActivePortCtorArg = lpszActivePort,
                lpszPortCtorArg = lpszPort,
                iBaudRate = iBaudRate,
                iPortState = iPortState,
                iActive = iActive,
            )
    }
}

public class Soundsentrya internal constructor(
    public var cbSize: UInt,
    public var dwFlags: SoundsentryFlags,
    public var iFSTextEffect: SoundsentryTextEffect,
    public var iFSTextEffectMSec: UInt,
    public var iFSTextEffectColorBits: UInt,
    public var iFSGrafEffect: SoundSentryGraphicsEffect,
    public var iFSGrafEffectMSec: UInt,
    public var iFSGrafEffectColor: UInt,
    public var iWindowsEffect: SoundsentryWindowsEffect,
    public var iWindowsEffectMSec: UInt,
    lpszWindowsEffectDLLCtorArg: Pstr,
    public var iWindowsEffectOrdinal: UInt,
) {
    public var lpszWindowsEffectDLL: Pstr = lpszWindowsEffectDLLCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        iFSTextEffect = 0u,
        iFSTextEffectMSec = 0u,
        iFSTextEffectColorBits = 0u,
        iFSGrafEffect = 0u,
        iFSGrafEffectMSec = 0u,
        iFSGrafEffectColor = 0u,
        iWindowsEffect = 0u,
        iWindowsEffectMSec = 0u,
        lpszWindowsEffectDLLCtorArg = MutPtr(0L),
        iWindowsEffectOrdinal = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): SoundsentryFlags = this.dwFlags

    public operator fun component3(): SoundsentryTextEffect = this.iFSTextEffect

    public operator fun component4(): UInt = this.iFSTextEffectMSec

    public operator fun component5(): UInt = this.iFSTextEffectColorBits

    public operator fun component6(): SoundSentryGraphicsEffect = this.iFSGrafEffect

    public operator fun component7(): UInt = this.iFSGrafEffectMSec

    public operator fun component8(): UInt = this.iFSGrafEffectColor

    public operator fun component9(): SoundsentryWindowsEffect = this.iWindowsEffect

    public operator fun component10(): UInt = this.iWindowsEffectMSec

    public operator fun component11(): Pstr = this.lpszWindowsEffectDLL

    public operator fun component12(): UInt = this.iWindowsEffectOrdinal

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: SoundsentryFlags = this.dwFlags, iFSTextEffect: SoundsentryTextEffect = this.iFSTextEffect, iFSTextEffectMSec: UInt = this.iFSTextEffectMSec, iFSTextEffectColorBits: UInt = this.iFSTextEffectColorBits, iFSGrafEffect: SoundSentryGraphicsEffect = this.iFSGrafEffect, iFSGrafEffectMSec: UInt = this.iFSGrafEffectMSec, iFSGrafEffectColor: UInt = this.iFSGrafEffectColor, iWindowsEffect: SoundsentryWindowsEffect = this.iWindowsEffect, iWindowsEffectMSec: UInt = this.iWindowsEffectMSec, lpszWindowsEffectDLL: Pstr = this.lpszWindowsEffectDLL, iWindowsEffectOrdinal: UInt = this.iWindowsEffectOrdinal): Soundsentrya = Soundsentrya(cbSize = cbSize, dwFlags = dwFlags, iFSTextEffect = iFSTextEffect, iFSTextEffectMSec = iFSTextEffectMSec, iFSTextEffectColorBits = iFSTextEffectColorBits, iFSGrafEffect = iFSGrafEffect, iFSGrafEffectMSec = iFSGrafEffectMSec, iFSGrafEffectColor = iFSGrafEffectColor, iWindowsEffect = iWindowsEffect, iWindowsEffectMSec = iWindowsEffectMSec, lpszWindowsEffectDLLCtorArg = lpszWindowsEffectDLL, iWindowsEffectOrdinal = iWindowsEffectOrdinal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Soundsentrya) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.iFSTextEffect != other.iFSTextEffect) return false
        if (this.iFSTextEffectMSec != other.iFSTextEffectMSec) return false
        if (this.iFSTextEffectColorBits != other.iFSTextEffectColorBits) return false
        if (this.iFSGrafEffect != other.iFSGrafEffect) return false
        if (this.iFSGrafEffectMSec != other.iFSGrafEffectMSec) return false
        if (this.iFSGrafEffectColor != other.iFSGrafEffectColor) return false
        if (this.iWindowsEffect != other.iWindowsEffect) return false
        if (this.iWindowsEffectMSec != other.iWindowsEffectMSec) return false
        if (this.lpszWindowsEffectDLL != other.lpszWindowsEffectDLL) return false
        if (this.iWindowsEffectOrdinal != other.iWindowsEffectOrdinal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.iFSTextEffect.hashCode()
        result = 31 * result + this.iFSTextEffectMSec.hashCode()
        result = 31 * result + this.iFSTextEffectColorBits.hashCode()
        result = 31 * result + this.iFSGrafEffect.hashCode()
        result = 31 * result + this.iFSGrafEffectMSec.hashCode()
        result = 31 * result + this.iFSGrafEffectColor.hashCode()
        result = 31 * result + this.iWindowsEffect.hashCode()
        result = 31 * result + this.iWindowsEffectMSec.hashCode()
        result = 31 * result + this.lpszWindowsEffectDLL.hashCode()
        result = 31 * result + this.iWindowsEffectOrdinal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: SoundsentryFlags = 0u,
            iFSTextEffect: SoundsentryTextEffect = 0u,
            iFSTextEffectMSec: UInt = 0u,
            iFSTextEffectColorBits: UInt = 0u,
            iFSGrafEffect: SoundSentryGraphicsEffect = 0u,
            iFSGrafEffectMSec: UInt = 0u,
            iFSGrafEffectColor: UInt = 0u,
            iWindowsEffect: SoundsentryWindowsEffect = 0u,
            iWindowsEffectMSec: UInt = 0u,
            lpszWindowsEffectDLL: Pstr = MutPtr(0L),
            iWindowsEffectOrdinal: UInt = 0u,
        ): Soundsentrya =
            Soundsentrya(
                cbSize = cbSize,
                dwFlags = dwFlags,
                iFSTextEffect = iFSTextEffect,
                iFSTextEffectMSec = iFSTextEffectMSec,
                iFSTextEffectColorBits = iFSTextEffectColorBits,
                iFSGrafEffect = iFSGrafEffect,
                iFSGrafEffectMSec = iFSGrafEffectMSec,
                iFSGrafEffectColor = iFSGrafEffectColor,
                iWindowsEffect = iWindowsEffect,
                iWindowsEffectMSec = iWindowsEffectMSec,
                lpszWindowsEffectDLLCtorArg = lpszWindowsEffectDLL,
                iWindowsEffectOrdinal = iWindowsEffectOrdinal,
            )
    }
}

public class Soundsentryw internal constructor(
    public var cbSize: UInt,
    public var dwFlags: SoundsentryFlags,
    public var iFSTextEffect: SoundsentryTextEffect,
    public var iFSTextEffectMSec: UInt,
    public var iFSTextEffectColorBits: UInt,
    public var iFSGrafEffect: SoundSentryGraphicsEffect,
    public var iFSGrafEffectMSec: UInt,
    public var iFSGrafEffectColor: UInt,
    public var iWindowsEffect: SoundsentryWindowsEffect,
    public var iWindowsEffectMSec: UInt,
    lpszWindowsEffectDLLCtorArg: Pwstr,
    public var iWindowsEffectOrdinal: UInt,
) {
    public var lpszWindowsEffectDLL: Pwstr = lpszWindowsEffectDLLCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        iFSTextEffect = 0u,
        iFSTextEffectMSec = 0u,
        iFSTextEffectColorBits = 0u,
        iFSGrafEffect = 0u,
        iFSGrafEffectMSec = 0u,
        iFSGrafEffectColor = 0u,
        iWindowsEffect = 0u,
        iWindowsEffectMSec = 0u,
        lpszWindowsEffectDLLCtorArg = MutPtr(0L),
        iWindowsEffectOrdinal = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): SoundsentryFlags = this.dwFlags

    public operator fun component3(): SoundsentryTextEffect = this.iFSTextEffect

    public operator fun component4(): UInt = this.iFSTextEffectMSec

    public operator fun component5(): UInt = this.iFSTextEffectColorBits

    public operator fun component6(): SoundSentryGraphicsEffect = this.iFSGrafEffect

    public operator fun component7(): UInt = this.iFSGrafEffectMSec

    public operator fun component8(): UInt = this.iFSGrafEffectColor

    public operator fun component9(): SoundsentryWindowsEffect = this.iWindowsEffect

    public operator fun component10(): UInt = this.iWindowsEffectMSec

    public operator fun component11(): Pwstr = this.lpszWindowsEffectDLL

    public operator fun component12(): UInt = this.iWindowsEffectOrdinal

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: SoundsentryFlags = this.dwFlags, iFSTextEffect: SoundsentryTextEffect = this.iFSTextEffect, iFSTextEffectMSec: UInt = this.iFSTextEffectMSec, iFSTextEffectColorBits: UInt = this.iFSTextEffectColorBits, iFSGrafEffect: SoundSentryGraphicsEffect = this.iFSGrafEffect, iFSGrafEffectMSec: UInt = this.iFSGrafEffectMSec, iFSGrafEffectColor: UInt = this.iFSGrafEffectColor, iWindowsEffect: SoundsentryWindowsEffect = this.iWindowsEffect, iWindowsEffectMSec: UInt = this.iWindowsEffectMSec, lpszWindowsEffectDLL: Pwstr = this.lpszWindowsEffectDLL, iWindowsEffectOrdinal: UInt = this.iWindowsEffectOrdinal): Soundsentryw = Soundsentryw(cbSize = cbSize, dwFlags = dwFlags, iFSTextEffect = iFSTextEffect, iFSTextEffectMSec = iFSTextEffectMSec, iFSTextEffectColorBits = iFSTextEffectColorBits, iFSGrafEffect = iFSGrafEffect, iFSGrafEffectMSec = iFSGrafEffectMSec, iFSGrafEffectColor = iFSGrafEffectColor, iWindowsEffect = iWindowsEffect, iWindowsEffectMSec = iWindowsEffectMSec, lpszWindowsEffectDLLCtorArg = lpszWindowsEffectDLL, iWindowsEffectOrdinal = iWindowsEffectOrdinal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Soundsentryw) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.iFSTextEffect != other.iFSTextEffect) return false
        if (this.iFSTextEffectMSec != other.iFSTextEffectMSec) return false
        if (this.iFSTextEffectColorBits != other.iFSTextEffectColorBits) return false
        if (this.iFSGrafEffect != other.iFSGrafEffect) return false
        if (this.iFSGrafEffectMSec != other.iFSGrafEffectMSec) return false
        if (this.iFSGrafEffectColor != other.iFSGrafEffectColor) return false
        if (this.iWindowsEffect != other.iWindowsEffect) return false
        if (this.iWindowsEffectMSec != other.iWindowsEffectMSec) return false
        if (this.lpszWindowsEffectDLL != other.lpszWindowsEffectDLL) return false
        if (this.iWindowsEffectOrdinal != other.iWindowsEffectOrdinal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.iFSTextEffect.hashCode()
        result = 31 * result + this.iFSTextEffectMSec.hashCode()
        result = 31 * result + this.iFSTextEffectColorBits.hashCode()
        result = 31 * result + this.iFSGrafEffect.hashCode()
        result = 31 * result + this.iFSGrafEffectMSec.hashCode()
        result = 31 * result + this.iFSGrafEffectColor.hashCode()
        result = 31 * result + this.iWindowsEffect.hashCode()
        result = 31 * result + this.iWindowsEffectMSec.hashCode()
        result = 31 * result + this.lpszWindowsEffectDLL.hashCode()
        result = 31 * result + this.iWindowsEffectOrdinal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: SoundsentryFlags = 0u,
            iFSTextEffect: SoundsentryTextEffect = 0u,
            iFSTextEffectMSec: UInt = 0u,
            iFSTextEffectColorBits: UInt = 0u,
            iFSGrafEffect: SoundSentryGraphicsEffect = 0u,
            iFSGrafEffectMSec: UInt = 0u,
            iFSGrafEffectColor: UInt = 0u,
            iWindowsEffect: SoundsentryWindowsEffect = 0u,
            iWindowsEffectMSec: UInt = 0u,
            lpszWindowsEffectDLL: Pwstr = MutPtr(0L),
            iWindowsEffectOrdinal: UInt = 0u,
        ): Soundsentryw =
            Soundsentryw(
                cbSize = cbSize,
                dwFlags = dwFlags,
                iFSTextEffect = iFSTextEffect,
                iFSTextEffectMSec = iFSTextEffectMSec,
                iFSTextEffectColorBits = iFSTextEffectColorBits,
                iFSGrafEffect = iFSGrafEffect,
                iFSGrafEffectMSec = iFSGrafEffectMSec,
                iFSGrafEffectColor = iFSGrafEffectColor,
                iWindowsEffect = iWindowsEffect,
                iWindowsEffectMSec = iWindowsEffectMSec,
                lpszWindowsEffectDLLCtorArg = lpszWindowsEffectDLL,
                iWindowsEffectOrdinal = iWindowsEffectOrdinal,
            )
    }
}

public data class Stickykeys(
    public var cbSize: UInt = 0u,
    public var dwFlags: StickykeysFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stickykeys> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stickykeys> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Stickykeys =
                    Stickykeys(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Stickykeys) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                }
            }
    }
}

public data class Togglekeys(
    public var cbSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Togglekeys> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Togglekeys> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Togglekeys =
                    Togglekeys(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Togglekeys) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                }
            }
    }
}

public class UIAutomationEventInfo internal constructor(
    public var guid: Guid,
    pProgrammaticNameCtorArg: Pcwstr,
) {
    public var pProgrammaticName: Pcwstr = pProgrammaticNameCtorArg
        internal set

    public constructor() : this(
        guid = Guid(),
        pProgrammaticNameCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Guid = this.guid

    public operator fun component2(): Pcwstr = this.pProgrammaticName

    public fun copy(guid: Guid = this.guid, pProgrammaticName: Pcwstr = this.pProgrammaticName): UIAutomationEventInfo = UIAutomationEventInfo(guid = guid, pProgrammaticNameCtorArg = pProgrammaticName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UIAutomationEventInfo) return false
        if (this.guid != other.guid) return false
        if (this.pProgrammaticName != other.pProgrammaticName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guid.hashCode()
        result = 31 * result + this.pProgrammaticName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            guid: Guid = Guid(),
            pProgrammaticName: Pcwstr = ConstPtr(0L),
        ): UIAutomationEventInfo =
            UIAutomationEventInfo(
                guid = guid,
                pProgrammaticNameCtorArg = pProgrammaticName,
            )
    }
}

public class UIAutomationMethodInfo internal constructor(
    pProgrammaticNameCtorArg: Pcwstr,
    public var doSetFocus: Bool,
    public var cInParameters: UInt,
    public var cOutParameters: UInt,
    pParameterTypesCtorArg: MutPtr,
    pParameterNamesCtorArg: ConstPtr,
) {
    public var pProgrammaticName: Pcwstr = pProgrammaticNameCtorArg
        internal set

    public var pParameterTypes: MutPtr = pParameterTypesCtorArg
        internal set

    public var pParameterNames: ConstPtr = pParameterNamesCtorArg
        internal set

    public constructor() : this(
        pProgrammaticNameCtorArg = ConstPtr(0L),
        doSetFocus = 0,
        cInParameters = 0u,
        cOutParameters = 0u,
        pParameterTypesCtorArg = MutPtr(0L),
        pParameterNamesCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pProgrammaticName

    public operator fun component2(): Bool = this.doSetFocus

    public operator fun component3(): UInt = this.cInParameters

    public operator fun component4(): UInt = this.cOutParameters

    public operator fun component5(): MutPtr = this.pParameterTypes

    public operator fun component6(): ConstPtr = this.pParameterNames

    public fun copy(pProgrammaticName: Pcwstr = this.pProgrammaticName, doSetFocus: Bool = this.doSetFocus, cInParameters: UInt = this.cInParameters, cOutParameters: UInt = this.cOutParameters, pParameterTypes: MutPtr = this.pParameterTypes, pParameterNames: ConstPtr = this.pParameterNames): UIAutomationMethodInfo = UIAutomationMethodInfo(pProgrammaticNameCtorArg = pProgrammaticName, doSetFocus = doSetFocus, cInParameters = cInParameters, cOutParameters = cOutParameters, pParameterTypesCtorArg = pParameterTypes, pParameterNamesCtorArg = pParameterNames)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UIAutomationMethodInfo) return false
        if (this.pProgrammaticName != other.pProgrammaticName) return false
        if (this.doSetFocus != other.doSetFocus) return false
        if (this.cInParameters != other.cInParameters) return false
        if (this.cOutParameters != other.cOutParameters) return false
        if (this.pParameterTypes != other.pParameterTypes) return false
        if (this.pParameterNames != other.pParameterNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pProgrammaticName.hashCode()
        result = 31 * result + this.doSetFocus.hashCode()
        result = 31 * result + this.cInParameters.hashCode()
        result = 31 * result + this.cOutParameters.hashCode()
        result = 31 * result + this.pParameterTypes.hashCode()
        result = 31 * result + this.pParameterNames.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pProgrammaticName: Pcwstr = ConstPtr(0L),
            doSetFocus: Bool = 0,
            cInParameters: UInt = 0u,
            cOutParameters: UInt = 0u,
            pParameterTypes: MutPtr = MutPtr(0L),
            pParameterNames: ConstPtr = ConstPtr(0L),
        ): UIAutomationMethodInfo =
            UIAutomationMethodInfo(
                pProgrammaticNameCtorArg = pProgrammaticName,
                doSetFocus = doSetFocus,
                cInParameters = cInParameters,
                cOutParameters = cOutParameters,
                pParameterTypesCtorArg = pParameterTypes,
                pParameterNamesCtorArg = pParameterNames,
            )
    }
}

public class UIAutomationParameter internal constructor(
    public var type: UIAutomationType,
    pDataCtorArg: MutPtr,
) {
    public var pData: MutPtr = pDataCtorArg
        internal set

    public constructor() : this(
        type = 0,
        pDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UIAutomationType = this.type

    public operator fun component2(): MutPtr = this.pData

    public fun copy(type: UIAutomationType = this.type, pData: MutPtr = this.pData): UIAutomationParameter = UIAutomationParameter(type = type, pDataCtorArg = pData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UIAutomationParameter) return false
        if (this.type != other.type) return false
        if (this.pData != other.pData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.pData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UIAutomationParameter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UIAutomationParameter> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UIAutomationParameter =
                    UIAutomationParameter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UIAutomationParameter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pData)
                }
            }

        public operator fun invoke(
            type: UIAutomationType = 0,
            pData: MutPtr = MutPtr(0L),
        ): UIAutomationParameter =
            UIAutomationParameter(
                type = type,
                pDataCtorArg = pData,
            )
    }
}

public class UIAutomationPatternInfo internal constructor(
    public var guid: Guid,
    pProgrammaticNameCtorArg: Pcwstr,
    public var providerInterfaceId: Guid,
    public var clientInterfaceId: Guid,
    public var cProperties: UInt,
    pPropertiesCtorArg: MutPtr,
    public var cMethods: UInt,
    pMethodsCtorArg: MutPtr,
    public var cEvents: UInt,
    pEventsCtorArg: MutPtr,
    pPatternHandlerCtorArg: MutPtr,
) {
    public var pProgrammaticName: Pcwstr = pProgrammaticNameCtorArg
        internal set

    public var pProperties: MutPtr = pPropertiesCtorArg
        internal set

    public var pMethods: MutPtr = pMethodsCtorArg
        internal set

    public var pEvents: MutPtr = pEventsCtorArg
        internal set

    public var pPatternHandler: MutPtr = pPatternHandlerCtorArg
        internal set

    public constructor() : this(
        guid = Guid(),
        pProgrammaticNameCtorArg = ConstPtr(0L),
        providerInterfaceId = Guid(),
        clientInterfaceId = Guid(),
        cProperties = 0u,
        pPropertiesCtorArg = MutPtr(0L),
        cMethods = 0u,
        pMethodsCtorArg = MutPtr(0L),
        cEvents = 0u,
        pEventsCtorArg = MutPtr(0L),
        pPatternHandlerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.guid

    public operator fun component2(): Pcwstr = this.pProgrammaticName

    public operator fun component3(): Guid = this.providerInterfaceId

    public operator fun component4(): Guid = this.clientInterfaceId

    public operator fun component5(): UInt = this.cProperties

    public operator fun component6(): MutPtr = this.pProperties

    public operator fun component7(): UInt = this.cMethods

    public operator fun component8(): MutPtr = this.pMethods

    public operator fun component9(): UInt = this.cEvents

    public operator fun component10(): MutPtr = this.pEvents

    public operator fun component11(): MutPtr = this.pPatternHandler

    public fun copy(guid: Guid = this.guid, pProgrammaticName: Pcwstr = this.pProgrammaticName, providerInterfaceId: Guid = this.providerInterfaceId, clientInterfaceId: Guid = this.clientInterfaceId, cProperties: UInt = this.cProperties, pProperties: MutPtr = this.pProperties, cMethods: UInt = this.cMethods, pMethods: MutPtr = this.pMethods, cEvents: UInt = this.cEvents, pEvents: MutPtr = this.pEvents, pPatternHandler: MutPtr = this.pPatternHandler): UIAutomationPatternInfo = UIAutomationPatternInfo(guid = guid, pProgrammaticNameCtorArg = pProgrammaticName, providerInterfaceId = providerInterfaceId, clientInterfaceId = clientInterfaceId, cProperties = cProperties, pPropertiesCtorArg = pProperties, cMethods = cMethods, pMethodsCtorArg = pMethods, cEvents = cEvents, pEventsCtorArg = pEvents, pPatternHandlerCtorArg = pPatternHandler)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UIAutomationPatternInfo) return false
        if (this.guid != other.guid) return false
        if (this.pProgrammaticName != other.pProgrammaticName) return false
        if (this.providerInterfaceId != other.providerInterfaceId) return false
        if (this.clientInterfaceId != other.clientInterfaceId) return false
        if (this.cProperties != other.cProperties) return false
        if (this.pProperties != other.pProperties) return false
        if (this.cMethods != other.cMethods) return false
        if (this.pMethods != other.pMethods) return false
        if (this.cEvents != other.cEvents) return false
        if (this.pEvents != other.pEvents) return false
        if (this.pPatternHandler != other.pPatternHandler) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guid.hashCode()
        result = 31 * result + this.pProgrammaticName.hashCode()
        result = 31 * result + this.providerInterfaceId.hashCode()
        result = 31 * result + this.clientInterfaceId.hashCode()
        result = 31 * result + this.cProperties.hashCode()
        result = 31 * result + this.pProperties.hashCode()
        result = 31 * result + this.cMethods.hashCode()
        result = 31 * result + this.pMethods.hashCode()
        result = 31 * result + this.cEvents.hashCode()
        result = 31 * result + this.pEvents.hashCode()
        result = 31 * result + this.pPatternHandler.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            guid: Guid = Guid(),
            pProgrammaticName: Pcwstr = ConstPtr(0L),
            providerInterfaceId: Guid = Guid(),
            clientInterfaceId: Guid = Guid(),
            cProperties: UInt = 0u,
            pProperties: MutPtr = MutPtr(0L),
            cMethods: UInt = 0u,
            pMethods: MutPtr = MutPtr(0L),
            cEvents: UInt = 0u,
            pEvents: MutPtr = MutPtr(0L),
            pPatternHandler: MutPtr = MutPtr(0L),
        ): UIAutomationPatternInfo =
            UIAutomationPatternInfo(
                guid = guid,
                pProgrammaticNameCtorArg = pProgrammaticName,
                providerInterfaceId = providerInterfaceId,
                clientInterfaceId = clientInterfaceId,
                cProperties = cProperties,
                pPropertiesCtorArg = pProperties,
                cMethods = cMethods,
                pMethodsCtorArg = pMethods,
                cEvents = cEvents,
                pEventsCtorArg = pEvents,
                pPatternHandlerCtorArg = pPatternHandler,
            )
    }
}

public class UIAutomationPropertyInfo internal constructor(
    public var guid: Guid,
    pProgrammaticNameCtorArg: Pcwstr,
    public var type: UIAutomationType,
) {
    public var pProgrammaticName: Pcwstr = pProgrammaticNameCtorArg
        internal set

    public constructor() : this(
        guid = Guid(),
        pProgrammaticNameCtorArg = ConstPtr(0L),
        type = 0,
    )

    public operator fun component1(): Guid = this.guid

    public operator fun component2(): Pcwstr = this.pProgrammaticName

    public operator fun component3(): UIAutomationType = this.type

    public fun copy(guid: Guid = this.guid, pProgrammaticName: Pcwstr = this.pProgrammaticName, type: UIAutomationType = this.type): UIAutomationPropertyInfo = UIAutomationPropertyInfo(guid = guid, pProgrammaticNameCtorArg = pProgrammaticName, type = type)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UIAutomationPropertyInfo) return false
        if (this.guid != other.guid) return false
        if (this.pProgrammaticName != other.pProgrammaticName) return false
        if (this.type != other.type) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guid.hashCode()
        result = 31 * result + this.pProgrammaticName.hashCode()
        result = 31 * result + this.type.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            guid: Guid = Guid(),
            pProgrammaticName: Pcwstr = ConstPtr(0L),
            type: UIAutomationType = 0,
        ): UIAutomationPropertyInfo =
            UIAutomationPropertyInfo(
                guid = guid,
                pProgrammaticNameCtorArg = pProgrammaticName,
                type = type,
            )
    }
}

public class UiaAndOrCondition internal constructor(
    public var conditionType: ConditionType,
    ppConditionsCtorArg: MutPtr,
    public var cConditions: Int,
) {
    public var ppConditions: MutPtr = ppConditionsCtorArg
        internal set

    public constructor() : this(
        conditionType = 0,
        ppConditionsCtorArg = MutPtr(0L),
        cConditions = 0,
    )

    public operator fun component1(): ConditionType = this.conditionType

    public operator fun component2(): MutPtr = this.ppConditions

    public operator fun component3(): Int = this.cConditions

    public fun copy(conditionType: ConditionType = this.conditionType, ppConditions: MutPtr = this.ppConditions, cConditions: Int = this.cConditions): UiaAndOrCondition = UiaAndOrCondition(conditionType = conditionType, ppConditionsCtorArg = ppConditions, cConditions = cConditions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UiaAndOrCondition) return false
        if (this.conditionType != other.conditionType) return false
        if (this.ppConditions != other.ppConditions) return false
        if (this.cConditions != other.cConditions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.conditionType.hashCode()
        result = 31 * result + this.ppConditions.hashCode()
        result = 31 * result + this.cConditions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaAndOrCondition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaAndOrCondition> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UiaAndOrCondition =
                    UiaAndOrCondition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UiaAndOrCondition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.conditionType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.ppConditions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.cConditions)
                }
            }

        public operator fun invoke(
            conditionType: ConditionType = 0,
            ppConditions: MutPtr = MutPtr(0L),
            cConditions: Int = 0,
        ): UiaAndOrCondition =
            UiaAndOrCondition(
                conditionType = conditionType,
                ppConditionsCtorArg = ppConditions,
                cConditions = cConditions,
            )
    }
}

public data class UiaAsyncContentLoadedEventArgs(
    public var type: EventArgsType = 0,
    public var eventId: Int = 0,
    public var asyncContentLoadedState: AsyncContentLoadedState = 0,
    public var percentComplete: Double = 0.0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaAsyncContentLoadedEventArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaAsyncContentLoadedEventArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UiaAsyncContentLoadedEventArgs =
                    UiaAsyncContentLoadedEventArgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UiaAsyncContentLoadedEventArgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.eventId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.asyncContentLoadedState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 16L, value.percentComplete)
                }
            }
    }
}

public class UiaCacheRequest internal constructor(
    pViewConditionCtorArg: MutPtr,
    public var scope: TreeScope,
    pPropertiesCtorArg: MutPtr,
    public var cProperties: Int,
    pPatternsCtorArg: MutPtr,
    public var cPatterns: Int,
    public var automationElementMode: AutomationElementMode,
) {
    public var pViewCondition: MutPtr = pViewConditionCtorArg
        internal set

    public var pProperties: MutPtr = pPropertiesCtorArg
        internal set

    public var pPatterns: MutPtr = pPatternsCtorArg
        internal set

    public constructor() : this(
        pViewConditionCtorArg = MutPtr(0L),
        scope = 0,
        pPropertiesCtorArg = MutPtr(0L),
        cProperties = 0,
        pPatternsCtorArg = MutPtr(0L),
        cPatterns = 0,
        automationElementMode = 0,
    )

    public operator fun component1(): MutPtr = this.pViewCondition

    public operator fun component2(): TreeScope = this.scope

    public operator fun component3(): MutPtr = this.pProperties

    public operator fun component4(): Int = this.cProperties

    public operator fun component5(): MutPtr = this.pPatterns

    public operator fun component6(): Int = this.cPatterns

    public operator fun component7(): AutomationElementMode = this.automationElementMode

    public fun copy(pViewCondition: MutPtr = this.pViewCondition, scope: TreeScope = this.scope, pProperties: MutPtr = this.pProperties, cProperties: Int = this.cProperties, pPatterns: MutPtr = this.pPatterns, cPatterns: Int = this.cPatterns, automationElementMode: AutomationElementMode = this.automationElementMode): UiaCacheRequest = UiaCacheRequest(pViewConditionCtorArg = pViewCondition, scope = scope, pPropertiesCtorArg = pProperties, cProperties = cProperties, pPatternsCtorArg = pPatterns, cPatterns = cPatterns, automationElementMode = automationElementMode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UiaCacheRequest) return false
        if (this.pViewCondition != other.pViewCondition) return false
        if (this.scope != other.scope) return false
        if (this.pProperties != other.pProperties) return false
        if (this.cProperties != other.cProperties) return false
        if (this.pPatterns != other.pPatterns) return false
        if (this.cPatterns != other.cPatterns) return false
        if (this.automationElementMode != other.automationElementMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pViewCondition.hashCode()
        result = 31 * result + this.scope.hashCode()
        result = 31 * result + this.pProperties.hashCode()
        result = 31 * result + this.cProperties.hashCode()
        result = 31 * result + this.pPatterns.hashCode()
        result = 31 * result + this.cPatterns.hashCode()
        result = 31 * result + this.automationElementMode.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaCacheRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaCacheRequest> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): UiaCacheRequest =
                    UiaCacheRequest(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: UiaCacheRequest) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pViewCondition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.scope)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pProperties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.cProperties)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.pPatterns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.cPatterns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.automationElementMode)
                }
            }

        public operator fun invoke(
            pViewCondition: MutPtr = MutPtr(0L),
            scope: TreeScope = 0,
            pProperties: MutPtr = MutPtr(0L),
            cProperties: Int = 0,
            pPatterns: MutPtr = MutPtr(0L),
            cPatterns: Int = 0,
            automationElementMode: AutomationElementMode = 0,
        ): UiaCacheRequest =
            UiaCacheRequest(
                pViewConditionCtorArg = pViewCondition,
                scope = scope,
                pPropertiesCtorArg = pProperties,
                cProperties = cProperties,
                pPatternsCtorArg = pPatterns,
                cPatterns = cPatterns,
                automationElementMode = automationElementMode,
            )
    }
}

public data class UiaChangeInfo(
    public var uiaId: Int = 0,
    public var payload: Variant.Variant = Variant.Variant(),
    public var extraInfo: Variant.Variant = Variant.Variant(),
)

public class UiaChangesEventArgs internal constructor(
    public var type: EventArgsType,
    public var eventId: Int,
    public var eventIdCount: Int,
    pUiaChangesCtorArg: MutPtr,
) {
    public var pUiaChanges: MutPtr = pUiaChangesCtorArg
        internal set

    public constructor() : this(
        type = 0,
        eventId = 0,
        eventIdCount = 0,
        pUiaChangesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): EventArgsType = this.type

    public operator fun component2(): Int = this.eventId

    public operator fun component3(): Int = this.eventIdCount

    public operator fun component4(): MutPtr = this.pUiaChanges

    public fun copy(type: EventArgsType = this.type, eventId: Int = this.eventId, eventIdCount: Int = this.eventIdCount, pUiaChanges: MutPtr = this.pUiaChanges): UiaChangesEventArgs = UiaChangesEventArgs(type = type, eventId = eventId, eventIdCount = eventIdCount, pUiaChangesCtorArg = pUiaChanges)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UiaChangesEventArgs) return false
        if (this.type != other.type) return false
        if (this.eventId != other.eventId) return false
        if (this.eventIdCount != other.eventIdCount) return false
        if (this.pUiaChanges != other.pUiaChanges) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.eventId.hashCode()
        result = 31 * result + this.eventIdCount.hashCode()
        result = 31 * result + this.pUiaChanges.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaChangesEventArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaChangesEventArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UiaChangesEventArgs =
                    UiaChangesEventArgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UiaChangesEventArgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.eventId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.eventIdCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pUiaChanges)
                }
            }

        public operator fun invoke(
            type: EventArgsType = 0,
            eventId: Int = 0,
            eventIdCount: Int = 0,
            pUiaChanges: MutPtr = MutPtr(0L),
        ): UiaChangesEventArgs =
            UiaChangesEventArgs(
                type = type,
                eventId = eventId,
                eventIdCount = eventIdCount,
                pUiaChangesCtorArg = pUiaChanges,
            )
    }
}

public data class UiaCondition(
    public var conditionType: ConditionType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaCondition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaCondition> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): UiaCondition =
                    UiaCondition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: UiaCondition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.conditionType)
                }
            }
    }
}

public data class UiaEventArgs(
    public var type: EventArgsType = 0,
    public var eventId: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaEventArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaEventArgs> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): UiaEventArgs =
                    UiaEventArgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: UiaEventArgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.eventId)
                }
            }
    }
}

public class UiaFindParams internal constructor(
    public var maxDepth: Int,
    public var findFirst: Bool,
    public var excludeRoot: Bool,
    pFindConditionCtorArg: MutPtr,
) {
    public var pFindCondition: MutPtr = pFindConditionCtorArg
        internal set

    public constructor() : this(
        maxDepth = 0,
        findFirst = 0,
        excludeRoot = 0,
        pFindConditionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.maxDepth

    public operator fun component2(): Bool = this.findFirst

    public operator fun component3(): Bool = this.excludeRoot

    public operator fun component4(): MutPtr = this.pFindCondition

    public fun copy(maxDepth: Int = this.maxDepth, findFirst: Bool = this.findFirst, excludeRoot: Bool = this.excludeRoot, pFindCondition: MutPtr = this.pFindCondition): UiaFindParams = UiaFindParams(maxDepth = maxDepth, findFirst = findFirst, excludeRoot = excludeRoot, pFindConditionCtorArg = pFindCondition)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UiaFindParams) return false
        if (this.maxDepth != other.maxDepth) return false
        if (this.findFirst != other.findFirst) return false
        if (this.excludeRoot != other.excludeRoot) return false
        if (this.pFindCondition != other.pFindCondition) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxDepth.hashCode()
        result = 31 * result + this.findFirst.hashCode()
        result = 31 * result + this.excludeRoot.hashCode()
        result = 31 * result + this.pFindCondition.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaFindParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaFindParams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UiaFindParams =
                    UiaFindParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UiaFindParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.maxDepth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.findFirst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.excludeRoot)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pFindCondition)
                }
            }

        public operator fun invoke(
            maxDepth: Int = 0,
            findFirst: Bool = 0,
            excludeRoot: Bool = 0,
            pFindCondition: MutPtr = MutPtr(0L),
        ): UiaFindParams =
            UiaFindParams(
                maxDepth = maxDepth,
                findFirst = findFirst,
                excludeRoot = excludeRoot,
                pFindConditionCtorArg = pFindCondition,
            )
    }
}

public class UiaNotCondition internal constructor(
    public var conditionType: ConditionType,
    pConditionCtorArg: MutPtr,
) {
    public var pCondition: MutPtr = pConditionCtorArg
        internal set

    public constructor() : this(
        conditionType = 0,
        pConditionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConditionType = this.conditionType

    public operator fun component2(): MutPtr = this.pCondition

    public fun copy(conditionType: ConditionType = this.conditionType, pCondition: MutPtr = this.pCondition): UiaNotCondition = UiaNotCondition(conditionType = conditionType, pConditionCtorArg = pCondition)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UiaNotCondition) return false
        if (this.conditionType != other.conditionType) return false
        if (this.pCondition != other.pCondition) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.conditionType.hashCode()
        result = 31 * result + this.pCondition.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaNotCondition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaNotCondition> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UiaNotCondition =
                    UiaNotCondition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UiaNotCondition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.conditionType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pCondition)
                }
            }

        public operator fun invoke(
            conditionType: ConditionType = 0,
            pCondition: MutPtr = MutPtr(0L),
        ): UiaNotCondition =
            UiaNotCondition(
                conditionType = conditionType,
                pConditionCtorArg = pCondition,
            )
    }
}

public data class UiaPoint(
    public var x: Double = 0.0,
    public var y: Double = 0.0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaPoint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaPoint> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UiaPoint =
                    UiaPoint(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UiaPoint) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 8L, value.y)
                }
            }
    }
}

public data class UiaPropertyChangedEventArgs(
    public var type: EventArgsType = 0,
    public var eventId: UiaEventId = 0,
    public var propertyId: Int = 0,
    public var oldValue: Variant.Variant = Variant.Variant(),
    public var newValue: Variant.Variant = Variant.Variant(),
)

public data class UiaPropertyCondition(
    public var conditionType: ConditionType = 0,
    public var propertyId: UiaPropertyId = 0,
    public var value: Variant.Variant = Variant.Variant(),
    public var flags: PropertyConditionFlags = 0,
)

public data class UiaRect(
    public var left: Double = 0.0,
    public var top: Double = 0.0,
    public var width: Double = 0.0,
    public var height: Double = 0.0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaRect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaRect> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): UiaRect =
                    UiaRect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: UiaRect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr, value.left)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 8L, value.top)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 16L, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 24L, value.height)
                }
            }
    }
}

public class UiaStructureChangedEventArgs internal constructor(
    public var type: EventArgsType,
    public var eventId: Int,
    public var structureChangeType: StructureChangeType,
    pRuntimeIdCtorArg: MutPtr,
    public var cRuntimeIdLen: Int,
) {
    public var pRuntimeId: MutPtr = pRuntimeIdCtorArg
        internal set

    public constructor() : this(
        type = 0,
        eventId = 0,
        structureChangeType = 0,
        pRuntimeIdCtorArg = MutPtr(0L),
        cRuntimeIdLen = 0,
    )

    public operator fun component1(): EventArgsType = this.type

    public operator fun component2(): Int = this.eventId

    public operator fun component3(): StructureChangeType = this.structureChangeType

    public operator fun component4(): MutPtr = this.pRuntimeId

    public operator fun component5(): Int = this.cRuntimeIdLen

    public fun copy(type: EventArgsType = this.type, eventId: Int = this.eventId, structureChangeType: StructureChangeType = this.structureChangeType, pRuntimeId: MutPtr = this.pRuntimeId, cRuntimeIdLen: Int = this.cRuntimeIdLen): UiaStructureChangedEventArgs = UiaStructureChangedEventArgs(type = type, eventId = eventId, structureChangeType = structureChangeType, pRuntimeIdCtorArg = pRuntimeId, cRuntimeIdLen = cRuntimeIdLen)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UiaStructureChangedEventArgs) return false
        if (this.type != other.type) return false
        if (this.eventId != other.eventId) return false
        if (this.structureChangeType != other.structureChangeType) return false
        if (this.pRuntimeId != other.pRuntimeId) return false
        if (this.cRuntimeIdLen != other.cRuntimeIdLen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.eventId.hashCode()
        result = 31 * result + this.structureChangeType.hashCode()
        result = 31 * result + this.pRuntimeId.hashCode()
        result = 31 * result + this.cRuntimeIdLen.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaStructureChangedEventArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaStructureChangedEventArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): UiaStructureChangedEventArgs =
                    UiaStructureChangedEventArgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: UiaStructureChangedEventArgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.eventId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.structureChangeType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pRuntimeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.cRuntimeIdLen)
                }
            }

        public operator fun invoke(
            type: EventArgsType = 0,
            eventId: Int = 0,
            structureChangeType: StructureChangeType = 0,
            pRuntimeId: MutPtr = MutPtr(0L),
            cRuntimeIdLen: Int = 0,
        ): UiaStructureChangedEventArgs =
            UiaStructureChangedEventArgs(
                type = type,
                eventId = eventId,
                structureChangeType = structureChangeType,
                pRuntimeIdCtorArg = pRuntimeId,
                cRuntimeIdLen = cRuntimeIdLen,
            )
    }
}

public class UiaTextEditTextChangedEventArgs internal constructor(
    public var type: EventArgsType,
    public var eventId: Int,
    public var textEditChangeType: TextEditChangeType,
    pTextChangeCtorArg: MutPtr,
) {
    public var pTextChange: MutPtr = pTextChangeCtorArg
        internal set

    public constructor() : this(
        type = 0,
        eventId = 0,
        textEditChangeType = 0,
        pTextChangeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): EventArgsType = this.type

    public operator fun component2(): Int = this.eventId

    public operator fun component3(): TextEditChangeType = this.textEditChangeType

    public operator fun component4(): MutPtr = this.pTextChange

    public fun copy(type: EventArgsType = this.type, eventId: Int = this.eventId, textEditChangeType: TextEditChangeType = this.textEditChangeType, pTextChange: MutPtr = this.pTextChange): UiaTextEditTextChangedEventArgs = UiaTextEditTextChangedEventArgs(type = type, eventId = eventId, textEditChangeType = textEditChangeType, pTextChangeCtorArg = pTextChange)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UiaTextEditTextChangedEventArgs) return false
        if (this.type != other.type) return false
        if (this.eventId != other.eventId) return false
        if (this.textEditChangeType != other.textEditChangeType) return false
        if (this.pTextChange != other.pTextChange) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.eventId.hashCode()
        result = 31 * result + this.textEditChangeType.hashCode()
        result = 31 * result + this.pTextChange.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaTextEditTextChangedEventArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaTextEditTextChangedEventArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UiaTextEditTextChangedEventArgs =
                    UiaTextEditTextChangedEventArgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UiaTextEditTextChangedEventArgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.eventId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.textEditChangeType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pTextChange)
                }
            }

        public operator fun invoke(
            type: EventArgsType = 0,
            eventId: Int = 0,
            textEditChangeType: TextEditChangeType = 0,
            pTextChange: MutPtr = MutPtr(0L),
        ): UiaTextEditTextChangedEventArgs =
            UiaTextEditTextChangedEventArgs(
                type = type,
                eventId = eventId,
                textEditChangeType = textEditChangeType,
                pTextChangeCtorArg = pTextChange,
            )
    }
}

public class UiaWindowClosedEventArgs internal constructor(
    public var type: EventArgsType,
    public var eventId: Int,
    pRuntimeIdCtorArg: MutPtr,
    public var cRuntimeIdLen: Int,
) {
    public var pRuntimeId: MutPtr = pRuntimeIdCtorArg
        internal set

    public constructor() : this(
        type = 0,
        eventId = 0,
        pRuntimeIdCtorArg = MutPtr(0L),
        cRuntimeIdLen = 0,
    )

    public operator fun component1(): EventArgsType = this.type

    public operator fun component2(): Int = this.eventId

    public operator fun component3(): MutPtr = this.pRuntimeId

    public operator fun component4(): Int = this.cRuntimeIdLen

    public fun copy(type: EventArgsType = this.type, eventId: Int = this.eventId, pRuntimeId: MutPtr = this.pRuntimeId, cRuntimeIdLen: Int = this.cRuntimeIdLen): UiaWindowClosedEventArgs = UiaWindowClosedEventArgs(type = type, eventId = eventId, pRuntimeIdCtorArg = pRuntimeId, cRuntimeIdLen = cRuntimeIdLen)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UiaWindowClosedEventArgs) return false
        if (this.type != other.type) return false
        if (this.eventId != other.eventId) return false
        if (this.pRuntimeId != other.pRuntimeId) return false
        if (this.cRuntimeIdLen != other.cRuntimeIdLen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.eventId.hashCode()
        result = 31 * result + this.pRuntimeId.hashCode()
        result = 31 * result + this.cRuntimeIdLen.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaWindowClosedEventArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UiaWindowClosedEventArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): UiaWindowClosedEventArgs =
                    UiaWindowClosedEventArgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: UiaWindowClosedEventArgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.eventId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pRuntimeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.cRuntimeIdLen)
                }
            }

        public operator fun invoke(
            type: EventArgsType = 0,
            eventId: Int = 0,
            pRuntimeId: MutPtr = MutPtr(0L),
            cRuntimeIdLen: Int = 0,
        ): UiaWindowClosedEventArgs =
            UiaWindowClosedEventArgs(
                type = type,
                eventId = eventId,
                pRuntimeIdCtorArg = pRuntimeId,
                cRuntimeIdLen = cRuntimeIdLen,
            )
    }
}
