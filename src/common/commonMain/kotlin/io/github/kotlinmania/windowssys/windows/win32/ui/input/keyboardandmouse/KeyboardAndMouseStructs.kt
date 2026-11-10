@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public data class Deadkey(
    public var dwBoth: UInt = 0u,
    public var wchComposed: UShort = 0u,
    public var uFlags: UShort = 0u,
)

public data class Hardwareinput(
    public var uMsg: UInt = 0u,
    public var wParamL: UShort = 0u,
    public var wParamH: UShort = 0u,
)

public data class Input(public var type: InputType = 0u, public var anonymous: Input0 = Input0())

public data class Input0(
    public var mi: Mouseinput = Mouseinput(),
    public var ki: Keybdinput = Keybdinput(),
    public var hi: Hardwareinput = Hardwareinput(),
)

public data class Kbdnlstables(
    public var oEMIdentifier: UShort = 0u,
    public var layoutInformation: UShort = 0u,
    public var numOfVkToF: UInt = 0u,
    public var pVkToF: VkF? = null,
    public var numOfMouseVKey: Int = 0,
    public var pusMouseVKey: UShort? = null,
)

public data class Kbdtables(
    public var pCharModifiers: Modifiers? = null,
    public var pVkToWcharTable: VkToWcharTable? = null,
    public var pDeadKey: Deadkey? = null,
    public var pKeyNames: VscLpwstr? = null,
    public var pKeyNamesExt: VscLpwstr? = null,
    public var pKeyNamesDead: COpaquePointer? = null,
    public var pusVSCtoVK: UShort? = null,
    public var bMaxVSCtoVK: UByte = 0u,
    public var pVsctoVkE0: VscVk? = null,
    public var pVsctoVkE1: VscVk? = null,
    public var fLocaleFlags: UInt = 0u,
    public var nLgMax: UByte = 0u,
    public var cbLgEntry: UByte = 0u,
    public var pLigature: Ligature1? = null,
    public var dwType: UInt = 0u,
    public var dwSubType: UInt = 0u,
)

public data class KbdtableDesc(
    public var wszDllName: UShortArray = UShortArray(32),
    public var dwType: UInt = 0u,
    public var dwSubType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KbdtableDesc) return false
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

public data class KbdtableMulti(public var nTables: UInt = 0u, public var aKbdTables: List<KbdtableDesc> = List(8) { KbdtableDesc() })

public data class KbdTypeInfo(
    public var dwVersion: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwSubType: UInt = 0u,
)

public data class Keybdinput(
    public var wVk: VirtualKey = 0u,
    public var wScan: UShort = 0u,
    public var dwFlags: KeybdEventFlags = 0u,
    public var time: UInt = 0u,
    public var dwExtraInfo: Int = 0,
)

public data class Lastinputinfo(public var cbSize: UInt = 0u, public var dwTime: UInt = 0u)

public data class Ligature1(
    public var virtualKey: UByte = 0u,
    public var modificationNumber: UShort = 0u,
    public var wch: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ligature1) return false
        if (this.virtualKey != other.virtualKey) return false
        if (this.modificationNumber != other.modificationNumber) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualKey.hashCode()
        result = 31 * result + this.modificationNumber.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class Ligature2(
    public var virtualKey: UByte = 0u,
    public var modificationNumber: UShort = 0u,
    public var wch: UShortArray = UShortArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ligature2) return false
        if (this.virtualKey != other.virtualKey) return false
        if (this.modificationNumber != other.modificationNumber) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualKey.hashCode()
        result = 31 * result + this.modificationNumber.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class Ligature3(
    public var virtualKey: UByte = 0u,
    public var modificationNumber: UShort = 0u,
    public var wch: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ligature3) return false
        if (this.virtualKey != other.virtualKey) return false
        if (this.modificationNumber != other.modificationNumber) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualKey.hashCode()
        result = 31 * result + this.modificationNumber.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class Ligature4(
    public var virtualKey: UByte = 0u,
    public var modificationNumber: UShort = 0u,
    public var wch: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ligature4) return false
        if (this.virtualKey != other.virtualKey) return false
        if (this.modificationNumber != other.modificationNumber) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualKey.hashCode()
        result = 31 * result + this.modificationNumber.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class Ligature5(
    public var virtualKey: UByte = 0u,
    public var modificationNumber: UShort = 0u,
    public var wch: UShortArray = UShortArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ligature5) return false
        if (this.virtualKey != other.virtualKey) return false
        if (this.modificationNumber != other.modificationNumber) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualKey.hashCode()
        result = 31 * result + this.modificationNumber.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class Modifiers(
    public var pVkToBit: VkToBit? = null,
    public var wMaxModBits: UShort = 0u,
    public var modNumber: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Modifiers) return false
        if (this.pVkToBit != other.pVkToBit) return false
        if (this.wMaxModBits != other.wMaxModBits) return false
        if (!this.modNumber.contentEquals(other.modNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pVkToBit.hashCode()
        result = 31 * result + this.wMaxModBits.hashCode()
        result = 31 * result + this.modNumber.contentHashCode()
        return result
    }
}

public data class Mouseinput(
    public var dx: Int = 0,
    public var dy: Int = 0,
    public var mouseData: UInt = 0u,
    public var dwFlags: MouseEventFlags = 0u,
    public var time: UInt = 0u,
    public var dwExtraInfo: Int = 0,
)

public data class Mousemovepoint(
    public var x: Int = 0,
    public var y: Int = 0,
    public var time: UInt = 0u,
    public var dwExtraInfo: Int = 0,
)

public data class Trackmouseevent(
    public var cbSize: UInt = 0u,
    public var dwFlags: TrackmouseeventFlags = 0u,
    public var hwndTrack: Hwnd = null,
    public var dwHoverTime: UInt = 0u,
)

public data class VkF(
    public var vk: UByte = 0u,
    public var nLSFEProcType: UByte = 0u,
    public var nLSFEProcCurrent: UByte = 0u,
    public var nLSFEProcSwitch: UByte = 0u,
    public var nLSFEProc: List<VkFparam> = List(8) { VkFparam() },
    public var nLSFEProcAlt: List<VkFparam> = List(8) { VkFparam() },
)

public data class VkFparam(public var nLSFEProcIndex: UByte = 0u, public var nLSFEProcParam: UInt = 0u)

public data class VkToBit(public var vk: UByte = 0u, public var modBits: UByte = 0u)

public data class VkToWchars1(
    public var virtualKey: UByte = 0u,
    public var attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VkToWchars1) return false
        if (this.virtualKey != other.virtualKey) return false
        if (this.attributes != other.attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualKey.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VkToWchars10(
    public var virtualKey: UByte = 0u,
    public var attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VkToWchars10) return false
        if (this.virtualKey != other.virtualKey) return false
        if (this.attributes != other.attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualKey.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VkToWchars2(
    public var virtualKey: UByte = 0u,
    public var attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VkToWchars2) return false
        if (this.virtualKey != other.virtualKey) return false
        if (this.attributes != other.attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualKey.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VkToWchars3(
    public var virtualKey: UByte = 0u,
    public var attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VkToWchars3) return false
        if (this.virtualKey != other.virtualKey) return false
        if (this.attributes != other.attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualKey.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VkToWchars4(
    public var virtualKey: UByte = 0u,
    public var attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VkToWchars4) return false
        if (this.virtualKey != other.virtualKey) return false
        if (this.attributes != other.attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualKey.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VkToWchars5(
    public var virtualKey: UByte = 0u,
    public var attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VkToWchars5) return false
        if (this.virtualKey != other.virtualKey) return false
        if (this.attributes != other.attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualKey.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VkToWchars6(
    public var virtualKey: UByte = 0u,
    public var attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VkToWchars6) return false
        if (this.virtualKey != other.virtualKey) return false
        if (this.attributes != other.attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualKey.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VkToWchars7(
    public var virtualKey: UByte = 0u,
    public var attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VkToWchars7) return false
        if (this.virtualKey != other.virtualKey) return false
        if (this.attributes != other.attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualKey.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VkToWchars8(
    public var virtualKey: UByte = 0u,
    public var attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VkToWchars8) return false
        if (this.virtualKey != other.virtualKey) return false
        if (this.attributes != other.attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualKey.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VkToWchars9(
    public var virtualKey: UByte = 0u,
    public var attributes: UByte = 0u,
    public var wch: UShortArray = UShortArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VkToWchars9) return false
        if (this.virtualKey != other.virtualKey) return false
        if (this.attributes != other.attributes) return false
        if (!this.wch.contentEquals(other.wch)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualKey.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.wch.contentHashCode()
        return result
    }
}

public data class VkToWcharTable(
    public var pVkToWchars: VkToWchars1? = null,
    public var nModifications: UByte = 0u,
    public var cbSize: UByte = 0u,
)

public data class VkVsc(public var vk: UByte = 0u, public var vsc: UByte = 0u)

public data class VscLpwstr(public var vsc: UByte = 0u, public var pwsz: Pwstr = null)

public data class VscVk(public var vsc: UByte = 0u, public var vk: UShort = 0u)
