@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.input.keyboardandmouse

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

public data class Deadkey(
    public var dwBoth: UInt = 0u,
    public var wchComposed: UShort = 0u,
    public var uFlags: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Deadkey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Deadkey> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Deadkey =
                    Deadkey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Deadkey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwBoth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wchComposed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.uFlags)
                }
            }
    }
}

public data class Hardwareinput(
    public var uMsg: UInt = 0u,
    public var wParamL: UShort = 0u,
    public var wParamH: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hardwareinput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hardwareinput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Hardwareinput =
                    Hardwareinput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Hardwareinput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uMsg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wParamL)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wParamH)
                }
            }
    }
}

public data class Input(
    public var type: InputType = 0u,
    public var anonymous: Input0 = Input0(),
)

public data class Input0(
    public var mi: Mouseinput = Mouseinput(),
    public var ki: Keybdinput = Keybdinput(),
    public var hi: Hardwareinput = Hardwareinput(),
)

public class Kbdnlstables internal constructor(
    public var oEMIdentifier: UShort,
    public var layoutInformation: UShort,
    public var numOfVkToF: UInt,
    pVkToFCtorArg: MutPtr,
    public var numOfMouseVKey: Int,
    pusMouseVKeyCtorArg: MutPtr,
) {
    public var pVkToF: MutPtr = pVkToFCtorArg
        internal set

    public var pusMouseVKey: MutPtr = pusMouseVKeyCtorArg
        internal set

    public constructor() : this(
        oEMIdentifier = 0u,
        layoutInformation = 0u,
        numOfVkToF = 0u,
        pVkToFCtorArg = MutPtr(0L),
        numOfMouseVKey = 0,
        pusMouseVKeyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.oEMIdentifier

    public operator fun component2(): UShort = this.layoutInformation

    public operator fun component3(): UInt = this.numOfVkToF

    public operator fun component4(): MutPtr = this.pVkToF

    public operator fun component5(): Int = this.numOfMouseVKey

    public operator fun component6(): MutPtr = this.pusMouseVKey

    public fun copy(oEMIdentifier: UShort = this.oEMIdentifier, layoutInformation: UShort = this.layoutInformation, numOfVkToF: UInt = this.numOfVkToF, pVkToF: MutPtr = this.pVkToF, numOfMouseVKey: Int = this.numOfMouseVKey, pusMouseVKey: MutPtr = this.pusMouseVKey): Kbdnlstables = Kbdnlstables(oEMIdentifier = oEMIdentifier, layoutInformation = layoutInformation, numOfVkToF = numOfVkToF, pVkToFCtorArg = pVkToF, numOfMouseVKey = numOfMouseVKey, pusMouseVKeyCtorArg = pusMouseVKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kbdnlstables) return false
        if (this.oEMIdentifier != other.oEMIdentifier) return false
        if (this.layoutInformation != other.layoutInformation) return false
        if (this.numOfVkToF != other.numOfVkToF) return false
        if (this.pVkToF != other.pVkToF) return false
        if (this.numOfMouseVKey != other.numOfMouseVKey) return false
        if (this.pusMouseVKey != other.pusMouseVKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.oEMIdentifier.hashCode()
        result = 31 * result + this.layoutInformation.hashCode()
        result = 31 * result + this.numOfVkToF.hashCode()
        result = 31 * result + this.pVkToF.hashCode()
        result = 31 * result + this.numOfMouseVKey.hashCode()
        result = 31 * result + this.pusMouseVKey.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kbdnlstables> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kbdnlstables> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Kbdnlstables =
                    Kbdnlstables(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Kbdnlstables) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.oEMIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.layoutInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numOfVkToF)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pVkToF)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.numOfMouseVKey)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pusMouseVKey)
                }
            }

        public operator fun invoke(
            oEMIdentifier: UShort = 0u,
            layoutInformation: UShort = 0u,
            numOfVkToF: UInt = 0u,
            pVkToF: MutPtr = MutPtr(0L),
            numOfMouseVKey: Int = 0,
            pusMouseVKey: MutPtr = MutPtr(0L),
        ): Kbdnlstables =
            Kbdnlstables(
                oEMIdentifier = oEMIdentifier,
                layoutInformation = layoutInformation,
                numOfVkToF = numOfVkToF,
                pVkToFCtorArg = pVkToF,
                numOfMouseVKey = numOfMouseVKey,
                pusMouseVKeyCtorArg = pusMouseVKey,
            )
    }
}

public class Kbdtables internal constructor(
    pCharModifiersCtorArg: MutPtr,
    pVkToWcharTableCtorArg: MutPtr,
    pDeadKeyCtorArg: MutPtr,
    pKeyNamesCtorArg: MutPtr,
    pKeyNamesExtCtorArg: MutPtr,
    pKeyNamesDeadCtorArg: MutPtr,
    pusVSCtoVKCtorArg: MutPtr,
    public var bMaxVSCtoVK: UByte,
    pVsctoVkE0CtorArg: MutPtr,
    pVsctoVkE1CtorArg: MutPtr,
    public var fLocaleFlags: UInt,
    public var nLgMax: UByte,
    public var cbLgEntry: UByte,
    pLigatureCtorArg: MutPtr,
    public var dwType: UInt,
    public var dwSubType: UInt,
) {
    public var pCharModifiers: MutPtr = pCharModifiersCtorArg
        internal set

    public var pVkToWcharTable: MutPtr = pVkToWcharTableCtorArg
        internal set

    public var pDeadKey: MutPtr = pDeadKeyCtorArg
        internal set

    public var pKeyNames: MutPtr = pKeyNamesCtorArg
        internal set

    public var pKeyNamesExt: MutPtr = pKeyNamesExtCtorArg
        internal set

    public var pKeyNamesDead: MutPtr = pKeyNamesDeadCtorArg
        internal set

    public var pusVSCtoVK: MutPtr = pusVSCtoVKCtorArg
        internal set

    public var pVsctoVkE0: MutPtr = pVsctoVkE0CtorArg
        internal set

    public var pVsctoVkE1: MutPtr = pVsctoVkE1CtorArg
        internal set

    public var pLigature: MutPtr = pLigatureCtorArg
        internal set

    public constructor() : this(
        pCharModifiersCtorArg = MutPtr(0L),
        pVkToWcharTableCtorArg = MutPtr(0L),
        pDeadKeyCtorArg = MutPtr(0L),
        pKeyNamesCtorArg = MutPtr(0L),
        pKeyNamesExtCtorArg = MutPtr(0L),
        pKeyNamesDeadCtorArg = MutPtr(0L),
        pusVSCtoVKCtorArg = MutPtr(0L),
        bMaxVSCtoVK = 0u,
        pVsctoVkE0CtorArg = MutPtr(0L),
        pVsctoVkE1CtorArg = MutPtr(0L),
        fLocaleFlags = 0u,
        nLgMax = 0u,
        cbLgEntry = 0u,
        pLigatureCtorArg = MutPtr(0L),
        dwType = 0u,
        dwSubType = 0u,
    )

    public operator fun component1(): MutPtr = this.pCharModifiers

    public operator fun component2(): MutPtr = this.pVkToWcharTable

    public operator fun component3(): MutPtr = this.pDeadKey

    public operator fun component4(): MutPtr = this.pKeyNames

    public operator fun component5(): MutPtr = this.pKeyNamesExt

    public operator fun component6(): MutPtr = this.pKeyNamesDead

    public operator fun component7(): MutPtr = this.pusVSCtoVK

    public operator fun component8(): UByte = this.bMaxVSCtoVK

    public operator fun component9(): MutPtr = this.pVsctoVkE0

    public operator fun component10(): MutPtr = this.pVsctoVkE1

    public operator fun component11(): UInt = this.fLocaleFlags

    public operator fun component12(): UByte = this.nLgMax

    public operator fun component13(): UByte = this.cbLgEntry

    public operator fun component14(): MutPtr = this.pLigature

    public operator fun component15(): UInt = this.dwType

    public operator fun component16(): UInt = this.dwSubType

    public fun copy(pCharModifiers: MutPtr = this.pCharModifiers, pVkToWcharTable: MutPtr = this.pVkToWcharTable, pDeadKey: MutPtr = this.pDeadKey, pKeyNames: MutPtr = this.pKeyNames, pKeyNamesExt: MutPtr = this.pKeyNamesExt, pKeyNamesDead: MutPtr = this.pKeyNamesDead, pusVSCtoVK: MutPtr = this.pusVSCtoVK, bMaxVSCtoVK: UByte = this.bMaxVSCtoVK, pVsctoVkE0: MutPtr = this.pVsctoVkE0, pVsctoVkE1: MutPtr = this.pVsctoVkE1, fLocaleFlags: UInt = this.fLocaleFlags, nLgMax: UByte = this.nLgMax, cbLgEntry: UByte = this.cbLgEntry, pLigature: MutPtr = this.pLigature, dwType: UInt = this.dwType, dwSubType: UInt = this.dwSubType): Kbdtables = Kbdtables(pCharModifiersCtorArg = pCharModifiers, pVkToWcharTableCtorArg = pVkToWcharTable, pDeadKeyCtorArg = pDeadKey, pKeyNamesCtorArg = pKeyNames, pKeyNamesExtCtorArg = pKeyNamesExt, pKeyNamesDeadCtorArg = pKeyNamesDead, pusVSCtoVKCtorArg = pusVSCtoVK, bMaxVSCtoVK = bMaxVSCtoVK, pVsctoVkE0CtorArg = pVsctoVkE0, pVsctoVkE1CtorArg = pVsctoVkE1, fLocaleFlags = fLocaleFlags, nLgMax = nLgMax, cbLgEntry = cbLgEntry, pLigatureCtorArg = pLigature, dwType = dwType, dwSubType = dwSubType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kbdtables) return false
        if (this.pCharModifiers != other.pCharModifiers) return false
        if (this.pVkToWcharTable != other.pVkToWcharTable) return false
        if (this.pDeadKey != other.pDeadKey) return false
        if (this.pKeyNames != other.pKeyNames) return false
        if (this.pKeyNamesExt != other.pKeyNamesExt) return false
        if (this.pKeyNamesDead != other.pKeyNamesDead) return false
        if (this.pusVSCtoVK != other.pusVSCtoVK) return false
        if (this.bMaxVSCtoVK != other.bMaxVSCtoVK) return false
        if (this.pVsctoVkE0 != other.pVsctoVkE0) return false
        if (this.pVsctoVkE1 != other.pVsctoVkE1) return false
        if (this.fLocaleFlags != other.fLocaleFlags) return false
        if (this.nLgMax != other.nLgMax) return false
        if (this.cbLgEntry != other.cbLgEntry) return false
        if (this.pLigature != other.pLigature) return false
        if (this.dwType != other.dwType) return false
        if (this.dwSubType != other.dwSubType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pCharModifiers.hashCode()
        result = 31 * result + this.pVkToWcharTable.hashCode()
        result = 31 * result + this.pDeadKey.hashCode()
        result = 31 * result + this.pKeyNames.hashCode()
        result = 31 * result + this.pKeyNamesExt.hashCode()
        result = 31 * result + this.pKeyNamesDead.hashCode()
        result = 31 * result + this.pusVSCtoVK.hashCode()
        result = 31 * result + this.bMaxVSCtoVK.hashCode()
        result = 31 * result + this.pVsctoVkE0.hashCode()
        result = 31 * result + this.pVsctoVkE1.hashCode()
        result = 31 * result + this.fLocaleFlags.hashCode()
        result = 31 * result + this.nLgMax.hashCode()
        result = 31 * result + this.cbLgEntry.hashCode()
        result = 31 * result + this.pLigature.hashCode()
        result = 31 * result + this.dwType.hashCode()
        result = 31 * result + this.dwSubType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kbdtables> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kbdtables> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): Kbdtables =
                    Kbdtables(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 85L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                    )
                override fun writeNative(addr: Long, value: Kbdtables) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pCharModifiers)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pVkToWcharTable)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pDeadKey)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pKeyNames)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.pKeyNamesExt)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.pKeyNamesDead)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.pusVSCtoVK)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 56L, value.bMaxVSCtoVK)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 64L, value.pVsctoVkE0)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 72L, value.pVsctoVkE1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.fLocaleFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 84L, value.nLgMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 85L, value.cbLgEntry)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 88L, value.pLigature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.dwSubType)
                }
            }

        public operator fun invoke(
            pCharModifiers: MutPtr = MutPtr(0L),
            pVkToWcharTable: MutPtr = MutPtr(0L),
            pDeadKey: MutPtr = MutPtr(0L),
            pKeyNames: MutPtr = MutPtr(0L),
            pKeyNamesExt: MutPtr = MutPtr(0L),
            pKeyNamesDead: MutPtr = MutPtr(0L),
            pusVSCtoVK: MutPtr = MutPtr(0L),
            bMaxVSCtoVK: UByte = 0u,
            pVsctoVkE0: MutPtr = MutPtr(0L),
            pVsctoVkE1: MutPtr = MutPtr(0L),
            fLocaleFlags: UInt = 0u,
            nLgMax: UByte = 0u,
            cbLgEntry: UByte = 0u,
            pLigature: MutPtr = MutPtr(0L),
            dwType: UInt = 0u,
            dwSubType: UInt = 0u,
        ): Kbdtables =
            Kbdtables(
                pCharModifiersCtorArg = pCharModifiers,
                pVkToWcharTableCtorArg = pVkToWcharTable,
                pDeadKeyCtorArg = pDeadKey,
                pKeyNamesCtorArg = pKeyNames,
                pKeyNamesExtCtorArg = pKeyNamesExt,
                pKeyNamesDeadCtorArg = pKeyNamesDead,
                pusVSCtoVKCtorArg = pusVSCtoVK,
                bMaxVSCtoVK = bMaxVSCtoVK,
                pVsctoVkE0CtorArg = pVsctoVkE0,
                pVsctoVkE1CtorArg = pVsctoVkE1,
                fLocaleFlags = fLocaleFlags,
                nLgMax = nLgMax,
                cbLgEntry = cbLgEntry,
                pLigatureCtorArg = pLigature,
                dwType = dwType,
                dwSubType = dwSubType,
            )
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KbdtableDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KbdtableDesc> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): KbdtableDesc =
                    KbdtableDesc(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: KbdtableDesc) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr, value.wszDllName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwSubType)
                }
            }
    }
}

public data class KbdtableMulti(
    public var nTables: UInt = 0u,
    public var aKbdTables: List<KbdtableDesc> = List(8) { KbdtableDesc() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KbdtableMulti> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KbdtableMulti> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 580L
                override fun readNative(addr: Long): KbdtableMulti =
                    KbdtableMulti(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(KbdtableDesc.typeLayout(), (8).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: KbdtableMulti) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nTables)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(KbdtableDesc.typeLayout(), (8).toInt())
                    ).writeNative(addr + 4L, value.aKbdTables)
                }
            }
    }
}

public data class KbdTypeInfo(
    public var dwVersion: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwSubType: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KbdTypeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KbdTypeInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): KbdTypeInfo =
                    KbdTypeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KbdTypeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSubType)
                }
            }
    }
}

public data class Keybdinput(
    public var wVk: VirtualKey = 0u,
    public var wScan: UShort = 0u,
    public var dwFlags: KeybdEventFlags = 0u,
    public var time: UInt = 0u,
    public var dwExtraInfo: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Keybdinput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Keybdinput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Keybdinput =
                    Keybdinput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Keybdinput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVk)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wScan)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.time)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.dwExtraInfo)
                }
            }
    }
}

public data class Lastinputinfo(
    public var cbSize: UInt = 0u,
    public var dwTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lastinputinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lastinputinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Lastinputinfo =
                    Lastinputinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Lastinputinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwTime)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ligature1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ligature1> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): Ligature1 =
                    Ligature1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Ligature1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.modificationNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.wch.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ligature2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ligature2> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ligature2 =
                    Ligature2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Ligature2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.modificationNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                    ).writeNative(addr + 4L, value.wch.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ligature3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ligature3> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): Ligature3 =
                    Ligature3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Ligature3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.modificationNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                    ).writeNative(addr + 4L, value.wch.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ligature4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ligature4> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Ligature4 =
                    Ligature4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Ligature4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.modificationNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                    ).writeNative(addr + 4L, value.wch.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ligature5> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ligature5> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 14L
                override fun readNative(addr: Long): Ligature5 =
                    Ligature5(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (5).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Ligature5) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.modificationNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (5).toInt())
                    ).writeNative(addr + 4L, value.wch.toList())
                }
            }
    }
}

public class Modifiers internal constructor(
    pVkToBitCtorArg: MutPtr,
    public var wMaxModBits: UShort,
    public var modNumber: UByteArray,
) {
    public var pVkToBit: MutPtr = pVkToBitCtorArg
        internal set

    public constructor() : this(
        pVkToBitCtorArg = MutPtr(0L),
        wMaxModBits = 0u,
        modNumber = UByteArray(1),
    )

    public operator fun component1(): MutPtr = this.pVkToBit

    public operator fun component2(): UShort = this.wMaxModBits

    public operator fun component3(): UByteArray = this.modNumber

    public fun copy(pVkToBit: MutPtr = this.pVkToBit, wMaxModBits: UShort = this.wMaxModBits, modNumber: UByteArray = this.modNumber): Modifiers = Modifiers(pVkToBitCtorArg = pVkToBit, wMaxModBits = wMaxModBits, modNumber = modNumber)

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Modifiers> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Modifiers> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Modifiers =
                    Modifiers(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 10L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Modifiers) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pVkToBit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.wMaxModBits)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 10L, value.modNumber.toList())
                }
            }

        public operator fun invoke(
            pVkToBit: MutPtr = MutPtr(0L),
            wMaxModBits: UShort = 0u,
            modNumber: UByteArray = UByteArray(1),
        ): Modifiers =
            Modifiers(
                pVkToBitCtorArg = pVkToBit,
                wMaxModBits = wMaxModBits,
                modNumber = modNumber,
            )
    }
}

public data class Mouseinput(
    public var dx: Int = 0,
    public var dy: Int = 0,
    public var mouseData: UInt = 0u,
    public var dwFlags: MouseEventFlags = 0u,
    public var time: UInt = 0u,
    public var dwExtraInfo: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mouseinput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mouseinput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Mouseinput =
                    Mouseinput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Mouseinput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.dy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.mouseData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.time)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.dwExtraInfo)
                }
            }
    }
}

public data class Mousemovepoint(
    public var x: Int = 0,
    public var y: Int = 0,
    public var time: UInt = 0u,
    public var dwExtraInfo: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mousemovepoint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mousemovepoint> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Mousemovepoint =
                    Mousemovepoint(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Mousemovepoint) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.time)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.dwExtraInfo)
                }
            }
    }
}

public class Trackmouseevent internal constructor(
    public var cbSize: UInt,
    public var dwFlags: TrackmouseeventFlags,
    hwndTrackCtorArg: Hwnd,
    public var dwHoverTime: UInt,
) {
    public var hwndTrack: Hwnd = hwndTrackCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        dwFlags = 0u,
        hwndTrackCtorArg = MutPtr(0L),
        dwHoverTime = 0u,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): TrackmouseeventFlags = this.dwFlags

    public operator fun component3(): Hwnd = this.hwndTrack

    public operator fun component4(): UInt = this.dwHoverTime

    public fun copy(cbSize: UInt = this.cbSize, dwFlags: TrackmouseeventFlags = this.dwFlags, hwndTrack: Hwnd = this.hwndTrack, dwHoverTime: UInt = this.dwHoverTime): Trackmouseevent = Trackmouseevent(cbSize = cbSize, dwFlags = dwFlags, hwndTrackCtorArg = hwndTrack, dwHoverTime = dwHoverTime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Trackmouseevent) return false
        if (this.cbSize != other.cbSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.hwndTrack != other.hwndTrack) return false
        if (this.dwHoverTime != other.dwHoverTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.hwndTrack.hashCode()
        result = 31 * result + this.dwHoverTime.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            dwFlags: TrackmouseeventFlags = 0u,
            hwndTrack: Hwnd = MutPtr(0L),
            dwHoverTime: UInt = 0u,
        ): Trackmouseevent =
            Trackmouseevent(
                cbSize = cbSize,
                dwFlags = dwFlags,
                hwndTrackCtorArg = hwndTrack,
                dwHoverTime = dwHoverTime,
            )
    }
}

public data class VkF(
    public var vk: UByte = 0u,
    public var nLSFEProcType: UByte = 0u,
    public var nLSFEProcCurrent: UByte = 0u,
    public var nLSFEProcSwitch: UByte = 0u,
    public var nLSFEProc: List<VkFparam> = List(8) { VkFparam() },
    public var nLSFEProcAlt: List<VkFparam> = List(8) { VkFparam() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkF> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkF> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 132L
                override fun readNative(addr: Long): VkF =
                    VkF(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(VkFparam.typeLayout(), (8).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(VkFparam.typeLayout(), (8).toInt())
                        ).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: VkF) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.vk)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.nLSFEProcType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.nLSFEProcCurrent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.nLSFEProcSwitch)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(VkFparam.typeLayout(), (8).toInt())
                    ).writeNative(addr + 4L, value.nLSFEProc)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(VkFparam.typeLayout(), (8).toInt())
                    ).writeNative(addr + 68L, value.nLSFEProcAlt)
                }
            }
    }
}

public data class VkFparam(
    public var nLSFEProcIndex: UByte = 0u,
    public var nLSFEProcParam: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkFparam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkFparam> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): VkFparam =
                    VkFparam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: VkFparam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.nLSFEProcIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nLSFEProcParam)
                }
            }
    }
}

public data class VkToBit(
    public var vk: UByte = 0u,
    public var modBits: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToBit> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToBit> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): VkToBit =
                    VkToBit(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: VkToBit) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.vk)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.modBits)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars1> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): VkToWchars1 =
                    VkToWchars1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: VkToWchars1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.attributes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 2L, value.wch.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars10> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 22L
                override fun readNative(addr: Long): VkToWchars10 =
                    VkToWchars10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (10).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: VkToWchars10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.attributes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (10).toInt())
                    ).writeNative(addr + 2L, value.wch.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars2> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): VkToWchars2 =
                    VkToWchars2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: VkToWchars2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.attributes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                    ).writeNative(addr + 2L, value.wch.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars3> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): VkToWchars3 =
                    VkToWchars3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: VkToWchars3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.attributes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                    ).writeNative(addr + 2L, value.wch.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars4> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): VkToWchars4 =
                    VkToWchars4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: VkToWchars4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.attributes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                    ).writeNative(addr + 2L, value.wch.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars5> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars5> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): VkToWchars5 =
                    VkToWchars5(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (5).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: VkToWchars5) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.attributes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (5).toInt())
                    ).writeNative(addr + 2L, value.wch.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars6> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 14L
                override fun readNative(addr: Long): VkToWchars6 =
                    VkToWchars6(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (6).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: VkToWchars6) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.attributes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (6).toInt())
                    ).writeNative(addr + 2L, value.wch.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars7> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars7> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): VkToWchars7 =
                    VkToWchars7(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (7).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: VkToWchars7) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.attributes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (7).toInt())
                    ).writeNative(addr + 2L, value.wch.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars8> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars8> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 18L
                override fun readNative(addr: Long): VkToWchars8 =
                    VkToWchars8(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: VkToWchars8) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.attributes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (8).toInt())
                    ).writeNative(addr + 2L, value.wch.toList())
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars9> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWchars9> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): VkToWchars9 =
                    VkToWchars9(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (9).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: VkToWchars9) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.virtualKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.attributes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (9).toInt())
                    ).writeNative(addr + 2L, value.wch.toList())
                }
            }
    }
}

public class VkToWcharTable internal constructor(
    pVkToWcharsCtorArg: MutPtr,
    public var nModifications: UByte,
    public var cbSize: UByte,
) {
    public var pVkToWchars: MutPtr = pVkToWcharsCtorArg
        internal set

    public constructor() : this(
        pVkToWcharsCtorArg = MutPtr(0L),
        nModifications = 0u,
        cbSize = 0u,
    )

    public operator fun component1(): MutPtr = this.pVkToWchars

    public operator fun component2(): UByte = this.nModifications

    public operator fun component3(): UByte = this.cbSize

    public fun copy(pVkToWchars: MutPtr = this.pVkToWchars, nModifications: UByte = this.nModifications, cbSize: UByte = this.cbSize): VkToWcharTable = VkToWcharTable(pVkToWcharsCtorArg = pVkToWchars, nModifications = nModifications, cbSize = cbSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VkToWcharTable) return false
        if (this.pVkToWchars != other.pVkToWchars) return false
        if (this.nModifications != other.nModifications) return false
        if (this.cbSize != other.cbSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pVkToWchars.hashCode()
        result = 31 * result + this.nModifications.hashCode()
        result = 31 * result + this.cbSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWcharTable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkToWcharTable> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): VkToWcharTable =
                    VkToWcharTable(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: VkToWcharTable) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pVkToWchars)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.nModifications)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.cbSize)
                }
            }

        public operator fun invoke(
            pVkToWchars: MutPtr = MutPtr(0L),
            nModifications: UByte = 0u,
            cbSize: UByte = 0u,
        ): VkToWcharTable =
            VkToWcharTable(
                pVkToWcharsCtorArg = pVkToWchars,
                nModifications = nModifications,
                cbSize = cbSize,
            )
    }
}

public data class VkVsc(
    public var vk: UByte = 0u,
    public var vsc: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkVsc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VkVsc> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): VkVsc =
                    VkVsc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: VkVsc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.vk)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.vsc)
                }
            }
    }
}

public class VscLpwstr internal constructor(
    public var vsc: UByte,
    pwszCtorArg: Pwstr,
) {
    public var pwsz: Pwstr = pwszCtorArg
        internal set

    public constructor() : this(
        vsc = 0u,
        pwszCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByte = this.vsc

    public operator fun component2(): Pwstr = this.pwsz

    public fun copy(vsc: UByte = this.vsc, pwsz: Pwstr = this.pwsz): VscLpwstr = VscLpwstr(vsc = vsc, pwszCtorArg = pwsz)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VscLpwstr) return false
        if (this.vsc != other.vsc) return false
        if (this.pwsz != other.pwsz) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vsc.hashCode()
        result = 31 * result + this.pwsz.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            vsc: UByte = 0u,
            pwsz: Pwstr = MutPtr(0L),
        ): VscLpwstr =
            VscLpwstr(
                vsc = vsc,
                pwszCtorArg = pwsz,
            )
    }
}

public data class VscVk(
    public var vsc: UByte = 0u,
    public var vk: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VscVk> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VscVk> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): VscVk =
                    VscVk(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: VscVk) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.vsc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.vk)
                }
            }
    }
}
