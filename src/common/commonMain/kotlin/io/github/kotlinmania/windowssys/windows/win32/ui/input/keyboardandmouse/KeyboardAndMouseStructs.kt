@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND

public data class DEADKEY(
    public var dwBoth: UInt = 0u,
    public var wchComposed: UShort = 0u,
    public var uFlags: UShort = 0u,
)

public data class HARDWAREINPUT(
    public var uMsg: UInt = 0u,
    public var wParamL: UShort = 0u,
    public var wParamH: UShort = 0u,
)

public data class INPUT(public var type: INPUT_TYPE = 0u, public var Anonymous: INPUT_0 = INPUT_0())

public data class INPUT_0(
    public var mi: MOUSEINPUT = MOUSEINPUT(),
    public var ki: KEYBDINPUT = KEYBDINPUT(),
    public var hi: HARDWAREINPUT = HARDWAREINPUT(),
)

public data class KBDNLSTABLES(
    public var OEMIdentifier: UShort = 0u,
    public var LayoutInformation: UShort = 0u,
    public var NumOfVkToF: UInt = 0u,
    public var pVkToF: Long = 0L,
    public var NumOfMouseVKey: Int = 0,
    public var pusMouseVKey: Long = 0L,
)

public data class KBDTABLES(
    public var pCharModifiers: Long = 0L,
    public var pVkToWcharTable: Long = 0L,
    public var pDeadKey: Long = 0L,
    public var pKeyNames: Long = 0L,
    public var pKeyNamesExt: Long = 0L,
    public var pKeyNamesDead: Long = 0L,
    public var pusVSCtoVK: Long = 0L,
    public var bMaxVSCtoVK: UByte = 0u,
    public var pVSCtoVK_E0: Long = 0L,
    public var pVSCtoVK_E1: Long = 0L,
    public var fLocaleFlags: UInt = 0u,
    public var nLgMax: UByte = 0u,
    public var cbLgEntry: UByte = 0u,
    public var pLigature: Long = 0L,
    public var dwType: UInt = 0u,
    public var dwSubType: UInt = 0u,
)

public data class KBDTABLE_DESC(
    public var wszDllName: UShortArray = UShortArray(32),
    public var dwType: UInt = 0u,
    public var dwSubType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KBDTABLE_DESC) return false
        if (!this.wszDllName.contentEquals(other.wszDllName)) return false
        if (this.dwType != other.dwType) return false
        if (this.dwSubType != other.dwSubType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszDllName.contentHashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwSubType.hashCode()
        return result
    }
}

public data class KBDTABLE_MULTI(public var nTables: UInt = 0u, public var aKbdTables: List<KBDTABLE_DESC> = List(8) { KBDTABLE_DESC() })

public data class KBD_TYPE_INFO(
    public var dwVersion: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwSubType: UInt = 0u,
)

public data class KEYBDINPUT(
    public var wVk: VIRTUAL_KEY = 0u,
    public var wScan: UShort = 0u,
    public var dwFlags: KEYBD_EVENT_FLAGS = 0u,
    public var time: UInt = 0u,
    public var dwExtraInfo: ULong = 0uL,
)

public data class LASTINPUTINFO(public var cbSize: UInt = 0u, public var dwTime: UInt = 0u)

public data class LIGATURE1(
    public var VirtualKey: UByte = 0u,
    public var ModificationNumber: UShort = 0u,
    public var wch: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LIGATURE1) return false
        if (this.VirtualKey != other.VirtualKey) return false
        if (this.ModificationNumber != other.ModificationNumber) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VirtualKey.hashCode()
        result = 31 * result + this.ModificationNumber.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class LIGATURE2(
    public var VirtualKey: UByte = 0u,
    public var ModificationNumber: UShort = 0u,
    public var wch: UShortArray = UShortArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LIGATURE2) return false
        if (this.VirtualKey != other.VirtualKey) return false
        if (this.ModificationNumber != other.ModificationNumber) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VirtualKey.hashCode()
        result = 31 * result + this.ModificationNumber.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class LIGATURE3(
    public var VirtualKey: UByte = 0u,
    public var ModificationNumber: UShort = 0u,
    public var wch: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LIGATURE3) return false
        if (this.VirtualKey != other.VirtualKey) return false
        if (this.ModificationNumber != other.ModificationNumber) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VirtualKey.hashCode()
        result = 31 * result + this.ModificationNumber.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class LIGATURE4(
    public var VirtualKey: UByte = 0u,
    public var ModificationNumber: UShort = 0u,
    public var wch: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LIGATURE4) return false
        if (this.VirtualKey != other.VirtualKey) return false
        if (this.ModificationNumber != other.ModificationNumber) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VirtualKey.hashCode()
        result = 31 * result + this.ModificationNumber.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class LIGATURE5(
    public var VirtualKey: UByte = 0u,
    public var ModificationNumber: UShort = 0u,
    public var wch: UShortArray = UShortArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LIGATURE5) return false
        if (this.VirtualKey != other.VirtualKey) return false
        if (this.ModificationNumber != other.ModificationNumber) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VirtualKey.hashCode()
        result = 31 * result + this.ModificationNumber.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class MODIFIERS(
    public var pVkToBit: Long = 0L,
    public var wMaxModBits: UShort = 0u,
    public var ModNumber: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MODIFIERS) return false
        if (this.pVkToBit != other.pVkToBit) return false
        if (this.wMaxModBits != other.wMaxModBits) return false
        if (!this.ModNumber.contentEquals(other.ModNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pVkToBit.hashCode()
        result = 31 * result + this.wMaxModBits.hashCode()
        result = 31 * result + this.ModNumber.contentHashCode()
        return result
    }
}

public data class MOUSEINPUT(
    public var dx: Int = 0,
    public var dy: Int = 0,
    public var mouseData: UInt = 0u,
    public var dwFlags: MOUSE_EVENT_FLAGS = 0u,
    public var time: UInt = 0u,
    public var dwExtraInfo: ULong = 0uL,
)

public data class MOUSEMOVEPOINT(
    public var x: Int = 0,
    public var y: Int = 0,
    public var time: UInt = 0u,
    public var dwExtraInfo: ULong = 0uL,
)

public data class TRACKMOUSEEVENT(
    public var cbSize: UInt = 0u,
    public var dwFlags: TRACKMOUSEEVENT_FLAGS = 0u,
    public var hwndTrack: HWND = 0L,
    public var dwHoverTime: UInt = 0u,
)

public data class VK_F(
    public var Vk: UByte = 0u,
    public var NLSFEProcType: UByte = 0u,
    public var NLSFEProcCurrent: UByte = 0u,
    public var NLSFEProcSwitch: UByte = 0u,
    public var NLSFEProc: List<VK_FPARAM> = List(8) { VK_FPARAM() },
    public var NLSFEProcAlt: List<VK_FPARAM> = List(8) { VK_FPARAM() },
)

public data class VK_FPARAM(public var NLSFEProcIndex: UByte = 0u, public var NLSFEProcParam: UInt = 0u)

public data class VK_TO_BIT(public var Vk: UByte = 0u, public var ModBits: UByte = 0u)

public data class VK_TO_WCHARS1(
    public var VirtualKey: UByte = 0u,
    public var Attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VK_TO_WCHARS1) return false
        if (this.VirtualKey != other.VirtualKey) return false
        if (this.Attributes != other.Attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VirtualKey.hashCode()
        result = 31 * result + this.Attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VK_TO_WCHARS10(
    public var VirtualKey: UByte = 0u,
    public var Attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VK_TO_WCHARS10) return false
        if (this.VirtualKey != other.VirtualKey) return false
        if (this.Attributes != other.Attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VirtualKey.hashCode()
        result = 31 * result + this.Attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VK_TO_WCHARS2(
    public var VirtualKey: UByte = 0u,
    public var Attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VK_TO_WCHARS2) return false
        if (this.VirtualKey != other.VirtualKey) return false
        if (this.Attributes != other.Attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VirtualKey.hashCode()
        result = 31 * result + this.Attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VK_TO_WCHARS3(
    public var VirtualKey: UByte = 0u,
    public var Attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VK_TO_WCHARS3) return false
        if (this.VirtualKey != other.VirtualKey) return false
        if (this.Attributes != other.Attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VirtualKey.hashCode()
        result = 31 * result + this.Attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VK_TO_WCHARS4(
    public var VirtualKey: UByte = 0u,
    public var Attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VK_TO_WCHARS4) return false
        if (this.VirtualKey != other.VirtualKey) return false
        if (this.Attributes != other.Attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VirtualKey.hashCode()
        result = 31 * result + this.Attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VK_TO_WCHARS5(
    public var VirtualKey: UByte = 0u,
    public var Attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VK_TO_WCHARS5) return false
        if (this.VirtualKey != other.VirtualKey) return false
        if (this.Attributes != other.Attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VirtualKey.hashCode()
        result = 31 * result + this.Attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VK_TO_WCHARS6(
    public var VirtualKey: UByte = 0u,
    public var Attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VK_TO_WCHARS6) return false
        if (this.VirtualKey != other.VirtualKey) return false
        if (this.Attributes != other.Attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VirtualKey.hashCode()
        result = 31 * result + this.Attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VK_TO_WCHARS7(
    public var VirtualKey: UByte = 0u,
    public var Attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VK_TO_WCHARS7) return false
        if (this.VirtualKey != other.VirtualKey) return false
        if (this.Attributes != other.Attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VirtualKey.hashCode()
        result = 31 * result + this.Attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VK_TO_WCHARS8(
    public var VirtualKey: UByte = 0u,
    public var Attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VK_TO_WCHARS8) return false
        if (this.VirtualKey != other.VirtualKey) return false
        if (this.Attributes != other.Attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VirtualKey.hashCode()
        result = 31 * result + this.Attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VK_TO_WCHARS9(
    public var VirtualKey: UByte = 0u,
    public var Attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VK_TO_WCHARS9) return false
        if (this.VirtualKey != other.VirtualKey) return false
        if (this.Attributes != other.Attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.VirtualKey.hashCode()
        result = 31 * result + this.Attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VK_TO_WCHAR_TABLE(
    public var pVkToWchars: Long = 0L,
    public var nModifications: UByte = 0u,
    public var cbSize: UByte = 0u,
)

public data class VK_VSC(public var Vk: UByte = 0u, public var Vsc: UByte = 0u)

public data class VSC_LPWSTR(public var vsc: UByte = 0u, public var pwsz: PWSTR = 0L)

public data class VSC_VK(public var Vsc: UByte = 0u, public var Vk: UShort = 0u)
