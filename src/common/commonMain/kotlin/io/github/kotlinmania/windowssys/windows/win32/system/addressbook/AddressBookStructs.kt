@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.system.com.CY

public class Adrentry internal constructor(
    public var ulReserved1: UInt,
    public var cValues: UInt,
    rgPropValsCtorArg: MutPtr,
) {
    public var rgPropVals: MutPtr = rgPropValsCtorArg
        internal set

    public constructor() : this(
        ulReserved1 = 0u,
        cValues = 0u,
        rgPropValsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulReserved1

    public operator fun component2(): UInt = this.cValues

    public operator fun component3(): MutPtr = this.rgPropVals

    public fun copy(ulReserved1: UInt = this.ulReserved1, cValues: UInt = this.cValues, rgPropVals: MutPtr = this.rgPropVals): Adrentry = Adrentry(ulReserved1 = ulReserved1, cValues = cValues, rgPropValsCtorArg = rgPropVals)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Adrentry) return false
        if (this.ulReserved1 != other.ulReserved1) return false
        if (this.cValues != other.cValues) return false
        if (this.rgPropVals != other.rgPropVals) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulReserved1.hashCode()
        result = 31 * result + this.cValues.hashCode()
        result = 31 * result + this.rgPropVals.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Adrentry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Adrentry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Adrentry =
                    Adrentry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Adrentry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.rgPropVals)
                }
            }

        public operator fun invoke(
            ulReserved1: UInt = 0u,
            cValues: UInt = 0u,
            rgPropVals: MutPtr = MutPtr(0L),
        ): Adrentry =
            Adrentry(
                ulReserved1 = ulReserved1,
                cValues = cValues,
                rgPropValsCtorArg = rgPropVals,
            )
    }
}

public data class Adrlist(
    public var cEntries: UInt = 0u,
    public var aEntries: List<Adrentry> = List(1) { Adrentry() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Adrlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Adrlist> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Adrlist =
                    Adrlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Adrentry.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Adrlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Adrentry.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.aEntries)
                }
            }
    }
}

public class Adrparm internal constructor(
    public var cbABContEntryID: UInt,
    lpABContEntryIDCtorArg: MutPtr,
    public var ulFlags: UInt,
    lpReservedCtorArg: MutPtr,
    public var ulHelpContext: UInt,
    lpszHelpFileNameCtorArg: MutPtr,
    public var lpfnABSDI: Lpfnabsdi,
    public var lpfnDismiss: Lpfndismiss,
    lpvDismissContextCtorArg: MutPtr,
    lpszCaptionCtorArg: MutPtr,
    lpszNewEntryTitleCtorArg: MutPtr,
    lpszDestWellsTitleCtorArg: MutPtr,
    public var cDestFields: UInt,
    public var nDestFieldFocus: UInt,
    lppszDestTitlesCtorArg: MutPtr,
    lpulDestCompsCtorArg: MutPtr,
    lpContRestrictionCtorArg: MutPtr,
    lpHierRestrictionCtorArg: MutPtr,
) {
    public var lpABContEntryID: MutPtr = lpABContEntryIDCtorArg
        internal set

    public var lpReserved: MutPtr = lpReservedCtorArg
        internal set

    public var lpszHelpFileName: MutPtr = lpszHelpFileNameCtorArg
        internal set

    public var lpvDismissContext: MutPtr = lpvDismissContextCtorArg
        internal set

    public var lpszCaption: MutPtr = lpszCaptionCtorArg
        internal set

    public var lpszNewEntryTitle: MutPtr = lpszNewEntryTitleCtorArg
        internal set

    public var lpszDestWellsTitle: MutPtr = lpszDestWellsTitleCtorArg
        internal set

    public var lppszDestTitles: MutPtr = lppszDestTitlesCtorArg
        internal set

    public var lpulDestComps: MutPtr = lpulDestCompsCtorArg
        internal set

    public var lpContRestriction: MutPtr = lpContRestrictionCtorArg
        internal set

    public var lpHierRestriction: MutPtr = lpHierRestrictionCtorArg
        internal set

    public constructor() : this(
        cbABContEntryID = 0u,
        lpABContEntryIDCtorArg = MutPtr(0L),
        ulFlags = 0u,
        lpReservedCtorArg = MutPtr(0L),
        ulHelpContext = 0u,
        lpszHelpFileNameCtorArg = MutPtr(0L),
        lpfnABSDI = null,
        lpfnDismiss = null,
        lpvDismissContextCtorArg = MutPtr(0L),
        lpszCaptionCtorArg = MutPtr(0L),
        lpszNewEntryTitleCtorArg = MutPtr(0L),
        lpszDestWellsTitleCtorArg = MutPtr(0L),
        cDestFields = 0u,
        nDestFieldFocus = 0u,
        lppszDestTitlesCtorArg = MutPtr(0L),
        lpulDestCompsCtorArg = MutPtr(0L),
        lpContRestrictionCtorArg = MutPtr(0L),
        lpHierRestrictionCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cbABContEntryID: UInt = 0u,
            lpABContEntryID: MutPtr = MutPtr(0L),
            ulFlags: UInt = 0u,
            lpReserved: MutPtr = MutPtr(0L),
            ulHelpContext: UInt = 0u,
            lpszHelpFileName: MutPtr = MutPtr(0L),
            lpfnABSDI: Lpfnabsdi = null,
            lpfnDismiss: Lpfndismiss = null,
            lpvDismissContext: MutPtr = MutPtr(0L),
            lpszCaption: MutPtr = MutPtr(0L),
            lpszNewEntryTitle: MutPtr = MutPtr(0L),
            lpszDestWellsTitle: MutPtr = MutPtr(0L),
            cDestFields: UInt = 0u,
            nDestFieldFocus: UInt = 0u,
            lppszDestTitles: MutPtr = MutPtr(0L),
            lpulDestComps: MutPtr = MutPtr(0L),
            lpContRestriction: MutPtr = MutPtr(0L),
            lpHierRestriction: MutPtr = MutPtr(0L),
        ): Adrparm =
            Adrparm(
                cbABContEntryID = cbABContEntryID,
                lpABContEntryIDCtorArg = lpABContEntryID,
                ulFlags = ulFlags,
                lpReservedCtorArg = lpReserved,
                ulHelpContext = ulHelpContext,
                lpszHelpFileNameCtorArg = lpszHelpFileName,
                lpfnABSDI = lpfnABSDI,
                lpfnDismiss = lpfnDismiss,
                lpvDismissContextCtorArg = lpvDismissContext,
                lpszCaptionCtorArg = lpszCaption,
                lpszNewEntryTitleCtorArg = lpszNewEntryTitle,
                lpszDestWellsTitleCtorArg = lpszDestWellsTitle,
                cDestFields = cDestFields,
                nDestFieldFocus = nDestFieldFocus,
                lppszDestTitlesCtorArg = lppszDestTitles,
                lpulDestCompsCtorArg = lpulDestComps,
                lpContRestrictionCtorArg = lpContRestriction,
                lpHierRestrictionCtorArg = lpHierRestriction,
            )
    }
}

public data class Dtblbutton(
    public var ulbLpszLabel: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulPRControl: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblbutton> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblbutton> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Dtblbutton =
                    Dtblbutton(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dtblbutton) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulbLpszLabel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulPRControl)
                }
            }
    }
}

public data class Dtblcheckbox(
    public var ulbLpszLabel: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulPRPropertyName: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblcheckbox> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblcheckbox> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Dtblcheckbox =
                    Dtblcheckbox(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dtblcheckbox) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulbLpszLabel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulPRPropertyName)
                }
            }
    }
}

public data class Dtblcombobox(
    public var ulbLpszCharsAllowed: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulNumCharsAllowed: UInt = 0u,
    public var ulPRPropertyName: UInt = 0u,
    public var ulPRTableName: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblcombobox> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblcombobox> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Dtblcombobox =
                    Dtblcombobox(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dtblcombobox) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulbLpszCharsAllowed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulNumCharsAllowed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulPRPropertyName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulPRTableName)
                }
            }
    }
}

public data class Dtblddlbx(
    public var ulFlags: UInt = 0u,
    public var ulPRDisplayProperty: UInt = 0u,
    public var ulPRSetProperty: UInt = 0u,
    public var ulPRTableName: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblddlbx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblddlbx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Dtblddlbx =
                    Dtblddlbx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dtblddlbx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulPRDisplayProperty)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulPRSetProperty)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulPRTableName)
                }
            }
    }
}

public data class Dtbledit(
    public var ulbLpszCharsAllowed: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulNumCharsAllowed: UInt = 0u,
    public var ulPropTag: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtbledit> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtbledit> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Dtbledit =
                    Dtbledit(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dtbledit) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulbLpszCharsAllowed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulNumCharsAllowed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulPropTag)
                }
            }
    }
}

public data class Dtblgroupbox(
    public var ulbLpszLabel: UInt = 0u,
    public var ulFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblgroupbox> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblgroupbox> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Dtblgroupbox =
                    Dtblgroupbox(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dtblgroupbox) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulbLpszLabel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulFlags)
                }
            }
    }
}

public data class Dtbllabel(
    public var ulbLpszLabelName: UInt = 0u,
    public var ulFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtbllabel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtbllabel> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Dtbllabel =
                    Dtbllabel(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dtbllabel) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulbLpszLabelName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulFlags)
                }
            }
    }
}

public data class Dtbllbx(
    public var ulFlags: UInt = 0u,
    public var ulPRSetProperty: UInt = 0u,
    public var ulPRTableName: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtbllbx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtbllbx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Dtbllbx =
                    Dtbllbx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Dtbllbx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulPRSetProperty)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulPRTableName)
                }
            }
    }
}

public data class Dtblmvddlbx(
    public var ulFlags: UInt = 0u,
    public var ulMVPropTag: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblmvddlbx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblmvddlbx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Dtblmvddlbx =
                    Dtblmvddlbx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dtblmvddlbx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulMVPropTag)
                }
            }
    }
}

public data class Dtblmvlistbox(
    public var ulFlags: UInt = 0u,
    public var ulMVPropTag: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblmvlistbox> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblmvlistbox> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Dtblmvlistbox =
                    Dtblmvlistbox(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Dtblmvlistbox) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulMVPropTag)
                }
            }
    }
}

public data class Dtblpage(
    public var ulbLpszLabel: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulbLpszComponent: UInt = 0u,
    public var ulContext: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblpage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblpage> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Dtblpage =
                    Dtblpage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Dtblpage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulbLpszLabel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulbLpszComponent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulContext)
                }
            }
    }
}

public data class Dtblradiobutton(
    public var ulbLpszLabel: UInt = 0u,
    public var ulFlags: UInt = 0u,
    public var ulcButtons: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var lReturnValue: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblradiobutton> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dtblradiobutton> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Dtblradiobutton =
                    Dtblradiobutton(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Dtblradiobutton) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulbLpszLabel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulcButtons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulPropTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.lReturnValue)
                }
            }
    }
}

public class Dtctl internal constructor(
    public var ulCtlType: UInt,
    public var ulCtlFlags: UInt,
    lpbNotifCtorArg: MutPtr,
    public var cbNotif: UInt,
    lpszFilterCtorArg: MutPtr,
    public var ulItemID: UInt,
    public var ctl: Dtctl0,
) {
    public var lpbNotif: MutPtr = lpbNotifCtorArg
        internal set

    public var lpszFilter: MutPtr = lpszFilterCtorArg
        internal set

    public constructor() : this(
        ulCtlType = 0u,
        ulCtlFlags = 0u,
        lpbNotifCtorArg = MutPtr(0L),
        cbNotif = 0u,
        lpszFilterCtorArg = MutPtr(0L),
        ulItemID = 0u,
        ctl = Dtctl0(),
    )

    public operator fun component1(): UInt = this.ulCtlType

    public operator fun component2(): UInt = this.ulCtlFlags

    public operator fun component3(): MutPtr = this.lpbNotif

    public operator fun component4(): UInt = this.cbNotif

    public operator fun component5(): MutPtr = this.lpszFilter

    public operator fun component6(): UInt = this.ulItemID

    public operator fun component7(): Dtctl0 = this.ctl

    public fun copy(ulCtlType: UInt = this.ulCtlType, ulCtlFlags: UInt = this.ulCtlFlags, lpbNotif: MutPtr = this.lpbNotif, cbNotif: UInt = this.cbNotif, lpszFilter: MutPtr = this.lpszFilter, ulItemID: UInt = this.ulItemID, ctl: Dtctl0 = this.ctl): Dtctl = Dtctl(ulCtlType = ulCtlType, ulCtlFlags = ulCtlFlags, lpbNotifCtorArg = lpbNotif, cbNotif = cbNotif, lpszFilterCtorArg = lpszFilter, ulItemID = ulItemID, ctl = ctl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dtctl) return false
        if (this.ulCtlType != other.ulCtlType) return false
        if (this.ulCtlFlags != other.ulCtlFlags) return false
        if (this.lpbNotif != other.lpbNotif) return false
        if (this.cbNotif != other.cbNotif) return false
        if (this.lpszFilter != other.lpszFilter) return false
        if (this.ulItemID != other.ulItemID) return false
        if (this.ctl != other.ctl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulCtlType.hashCode()
        result = 31 * result + this.ulCtlFlags.hashCode()
        result = 31 * result + this.lpbNotif.hashCode()
        result = 31 * result + this.cbNotif.hashCode()
        result = 31 * result + this.lpszFilter.hashCode()
        result = 31 * result + this.ulItemID.hashCode()
        result = 31 * result + this.ctl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ulCtlType: UInt = 0u,
            ulCtlFlags: UInt = 0u,
            lpbNotif: MutPtr = MutPtr(0L),
            cbNotif: UInt = 0u,
            lpszFilter: MutPtr = MutPtr(0L),
            ulItemID: UInt = 0u,
            ctl: Dtctl0 = Dtctl0(),
        ): Dtctl =
            Dtctl(
                ulCtlType = ulCtlType,
                ulCtlFlags = ulCtlFlags,
                lpbNotifCtorArg = lpbNotif,
                cbNotif = cbNotif,
                lpszFilterCtorArg = lpszFilter,
                ulItemID = ulItemID,
                ctl = ctl,
            )
    }
}

public class Dtctl0 internal constructor(
    lpvCtorArg: MutPtr,
    lplabelCtorArg: MutPtr,
    lpeditCtorArg: MutPtr,
    lplbxCtorArg: MutPtr,
    lpcomboboxCtorArg: MutPtr,
    lpddlbxCtorArg: MutPtr,
    lpcheckboxCtorArg: MutPtr,
    lpgroupboxCtorArg: MutPtr,
    lpbuttonCtorArg: MutPtr,
    lpradiobuttonCtorArg: MutPtr,
    lpmvlbxCtorArg: MutPtr,
    lpmvddlbxCtorArg: MutPtr,
    lppageCtorArg: MutPtr,
) {
    public var lpv: MutPtr = lpvCtorArg
        internal set

    public var lplabel: MutPtr = lplabelCtorArg
        internal set

    public var lpedit: MutPtr = lpeditCtorArg
        internal set

    public var lplbx: MutPtr = lplbxCtorArg
        internal set

    public var lpcombobox: MutPtr = lpcomboboxCtorArg
        internal set

    public var lpddlbx: MutPtr = lpddlbxCtorArg
        internal set

    public var lpcheckbox: MutPtr = lpcheckboxCtorArg
        internal set

    public var lpgroupbox: MutPtr = lpgroupboxCtorArg
        internal set

    public var lpbutton: MutPtr = lpbuttonCtorArg
        internal set

    public var lpradiobutton: MutPtr = lpradiobuttonCtorArg
        internal set

    public var lpmvlbx: MutPtr = lpmvlbxCtorArg
        internal set

    public var lpmvddlbx: MutPtr = lpmvddlbxCtorArg
        internal set

    public var lppage: MutPtr = lppageCtorArg
        internal set

    public constructor() : this(
        lpvCtorArg = MutPtr(0L),
        lplabelCtorArg = MutPtr(0L),
        lpeditCtorArg = MutPtr(0L),
        lplbxCtorArg = MutPtr(0L),
        lpcomboboxCtorArg = MutPtr(0L),
        lpddlbxCtorArg = MutPtr(0L),
        lpcheckboxCtorArg = MutPtr(0L),
        lpgroupboxCtorArg = MutPtr(0L),
        lpbuttonCtorArg = MutPtr(0L),
        lpradiobuttonCtorArg = MutPtr(0L),
        lpmvlbxCtorArg = MutPtr(0L),
        lpmvddlbxCtorArg = MutPtr(0L),
        lppageCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.lpv

    public operator fun component2(): MutPtr = this.lplabel

    public operator fun component3(): MutPtr = this.lpedit

    public operator fun component4(): MutPtr = this.lplbx

    public operator fun component5(): MutPtr = this.lpcombobox

    public operator fun component6(): MutPtr = this.lpddlbx

    public operator fun component7(): MutPtr = this.lpcheckbox

    public operator fun component8(): MutPtr = this.lpgroupbox

    public operator fun component9(): MutPtr = this.lpbutton

    public operator fun component10(): MutPtr = this.lpradiobutton

    public operator fun component11(): MutPtr = this.lpmvlbx

    public operator fun component12(): MutPtr = this.lpmvddlbx

    public operator fun component13(): MutPtr = this.lppage

    public fun copy(lpv: MutPtr = this.lpv, lplabel: MutPtr = this.lplabel, lpedit: MutPtr = this.lpedit, lplbx: MutPtr = this.lplbx, lpcombobox: MutPtr = this.lpcombobox, lpddlbx: MutPtr = this.lpddlbx, lpcheckbox: MutPtr = this.lpcheckbox, lpgroupbox: MutPtr = this.lpgroupbox, lpbutton: MutPtr = this.lpbutton, lpradiobutton: MutPtr = this.lpradiobutton, lpmvlbx: MutPtr = this.lpmvlbx, lpmvddlbx: MutPtr = this.lpmvddlbx, lppage: MutPtr = this.lppage): Dtctl0 = Dtctl0(lpvCtorArg = lpv, lplabelCtorArg = lplabel, lpeditCtorArg = lpedit, lplbxCtorArg = lplbx, lpcomboboxCtorArg = lpcombobox, lpddlbxCtorArg = lpddlbx, lpcheckboxCtorArg = lpcheckbox, lpgroupboxCtorArg = lpgroupbox, lpbuttonCtorArg = lpbutton, lpradiobuttonCtorArg = lpradiobutton, lpmvlbxCtorArg = lpmvlbx, lpmvddlbxCtorArg = lpmvddlbx, lppageCtorArg = lppage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dtctl0) return false
        if (this.lpv != other.lpv) return false
        if (this.lplabel != other.lplabel) return false
        if (this.lpedit != other.lpedit) return false
        if (this.lplbx != other.lplbx) return false
        if (this.lpcombobox != other.lpcombobox) return false
        if (this.lpddlbx != other.lpddlbx) return false
        if (this.lpcheckbox != other.lpcheckbox) return false
        if (this.lpgroupbox != other.lpgroupbox) return false
        if (this.lpbutton != other.lpbutton) return false
        if (this.lpradiobutton != other.lpradiobutton) return false
        if (this.lpmvlbx != other.lpmvlbx) return false
        if (this.lpmvddlbx != other.lpmvddlbx) return false
        if (this.lppage != other.lppage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpv.hashCode()
        result = 31 * result + this.lplabel.hashCode()
        result = 31 * result + this.lpedit.hashCode()
        result = 31 * result + this.lplbx.hashCode()
        result = 31 * result + this.lpcombobox.hashCode()
        result = 31 * result + this.lpddlbx.hashCode()
        result = 31 * result + this.lpcheckbox.hashCode()
        result = 31 * result + this.lpgroupbox.hashCode()
        result = 31 * result + this.lpbutton.hashCode()
        result = 31 * result + this.lpradiobutton.hashCode()
        result = 31 * result + this.lpmvlbx.hashCode()
        result = 31 * result + this.lpmvddlbx.hashCode()
        result = 31 * result + this.lppage.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpv: MutPtr = MutPtr(0L),
            lplabel: MutPtr = MutPtr(0L),
            lpedit: MutPtr = MutPtr(0L),
            lplbx: MutPtr = MutPtr(0L),
            lpcombobox: MutPtr = MutPtr(0L),
            lpddlbx: MutPtr = MutPtr(0L),
            lpcheckbox: MutPtr = MutPtr(0L),
            lpgroupbox: MutPtr = MutPtr(0L),
            lpbutton: MutPtr = MutPtr(0L),
            lpradiobutton: MutPtr = MutPtr(0L),
            lpmvlbx: MutPtr = MutPtr(0L),
            lpmvddlbx: MutPtr = MutPtr(0L),
            lppage: MutPtr = MutPtr(0L),
        ): Dtctl0 =
            Dtctl0(
                lpvCtorArg = lpv,
                lplabelCtorArg = lplabel,
                lpeditCtorArg = lpedit,
                lplbxCtorArg = lplbx,
                lpcomboboxCtorArg = lpcombobox,
                lpddlbxCtorArg = lpddlbx,
                lpcheckboxCtorArg = lpcheckbox,
                lpgroupboxCtorArg = lpgroupbox,
                lpbuttonCtorArg = lpbutton,
                lpradiobuttonCtorArg = lpradiobutton,
                lpmvlbxCtorArg = lpmvlbx,
                lpmvddlbxCtorArg = lpmvddlbx,
                lppageCtorArg = lppage,
            )
    }
}

public class Dtpage internal constructor(
    public var cctl: UInt,
    lpszResourceNameCtorArg: MutPtr,
    public var anonymous: Dtpage0,
    lpctlCtorArg: MutPtr,
) {
    public var lpszResourceName: MutPtr = lpszResourceNameCtorArg
        internal set

    public var lpctl: MutPtr = lpctlCtorArg
        internal set

    public constructor() : this(
        cctl = 0u,
        lpszResourceNameCtorArg = MutPtr(0L),
        anonymous = Dtpage0(),
        lpctlCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cctl

    public operator fun component2(): MutPtr = this.lpszResourceName

    public operator fun component3(): Dtpage0 = this.anonymous

    public operator fun component4(): MutPtr = this.lpctl

    public fun copy(cctl: UInt = this.cctl, lpszResourceName: MutPtr = this.lpszResourceName, anonymous: Dtpage0 = this.anonymous, lpctl: MutPtr = this.lpctl): Dtpage = Dtpage(cctl = cctl, lpszResourceNameCtorArg = lpszResourceName, anonymous = anonymous, lpctlCtorArg = lpctl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dtpage) return false
        if (this.cctl != other.cctl) return false
        if (this.lpszResourceName != other.lpszResourceName) return false
        if (this.anonymous != other.anonymous) return false
        if (this.lpctl != other.lpctl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cctl.hashCode()
        result = 31 * result + this.lpszResourceName.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.lpctl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cctl: UInt = 0u,
            lpszResourceName: MutPtr = MutPtr(0L),
            anonymous: Dtpage0 = Dtpage0(),
            lpctl: MutPtr = MutPtr(0L),
        ): Dtpage =
            Dtpage(
                cctl = cctl,
                lpszResourceNameCtorArg = lpszResourceName,
                anonymous = anonymous,
                lpctlCtorArg = lpctl,
            )
    }
}

public class Dtpage0 internal constructor(
    lpszComponentCtorArg: MutPtr,
    public var ulItemID: UInt,
) {
    public var lpszComponent: MutPtr = lpszComponentCtorArg
        internal set

    public constructor() : this(
        lpszComponentCtorArg = MutPtr(0L),
        ulItemID = 0u,
    )

    public operator fun component1(): MutPtr = this.lpszComponent

    public operator fun component2(): UInt = this.ulItemID

    public fun copy(lpszComponent: MutPtr = this.lpszComponent, ulItemID: UInt = this.ulItemID): Dtpage0 = Dtpage0(lpszComponentCtorArg = lpszComponent, ulItemID = ulItemID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dtpage0) return false
        if (this.lpszComponent != other.lpszComponent) return false
        if (this.ulItemID != other.ulItemID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpszComponent.hashCode()
        result = 31 * result + this.ulItemID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpszComponent: MutPtr = MutPtr(0L),
            ulItemID: UInt = 0u,
        ): Dtpage0 =
            Dtpage0(
                lpszComponentCtorArg = lpszComponent,
                ulItemID = ulItemID,
            )
    }
}

public data class Entryid(
    public var abFlags: UByteArray = UByteArray(4),
    public var ab: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Entryid) return false
        if (!this.abFlags.contentEquals(other.abFlags)) return false
        if (!this.ab.contentEquals(other.ab)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.abFlags.contentHashCode()
        result = 31 * result + this.ab.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Entryid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Entryid> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 5L
                override fun readNative(addr: Long): Entryid =
                    Entryid(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Entryid) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.abFlags.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.ab.toList())
                }
            }
    }
}

public class ErrorNotification internal constructor(
    public var cbEntryID: UInt,
    lpEntryIDCtorArg: MutPtr,
    public var scode: Int,
    public var ulFlags: UInt,
    lpMAPIErrorCtorArg: MutPtr,
) {
    public var lpEntryID: MutPtr = lpEntryIDCtorArg
        internal set

    public var lpMAPIError: MutPtr = lpMAPIErrorCtorArg
        internal set

    public constructor() : this(
        cbEntryID = 0u,
        lpEntryIDCtorArg = MutPtr(0L),
        scode = 0,
        ulFlags = 0u,
        lpMAPIErrorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbEntryID

    public operator fun component2(): MutPtr = this.lpEntryID

    public operator fun component3(): Int = this.scode

    public operator fun component4(): UInt = this.ulFlags

    public operator fun component5(): MutPtr = this.lpMAPIError

    public fun copy(cbEntryID: UInt = this.cbEntryID, lpEntryID: MutPtr = this.lpEntryID, scode: Int = this.scode, ulFlags: UInt = this.ulFlags, lpMAPIError: MutPtr = this.lpMAPIError): ErrorNotification = ErrorNotification(cbEntryID = cbEntryID, lpEntryIDCtorArg = lpEntryID, scode = scode, ulFlags = ulFlags, lpMAPIErrorCtorArg = lpMAPIError)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ErrorNotification) return false
        if (this.cbEntryID != other.cbEntryID) return false
        if (this.lpEntryID != other.lpEntryID) return false
        if (this.scode != other.scode) return false
        if (this.ulFlags != other.ulFlags) return false
        if (this.lpMAPIError != other.lpMAPIError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbEntryID.hashCode()
        result = 31 * result + this.lpEntryID.hashCode()
        result = 31 * result + this.scode.hashCode()
        result = 31 * result + this.ulFlags.hashCode()
        result = 31 * result + this.lpMAPIError.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ErrorNotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ErrorNotification> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): ErrorNotification =
                    ErrorNotification(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ErrorNotification) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbEntryID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpEntryID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.scode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ulFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.lpMAPIError)
                }
            }

        public operator fun invoke(
            cbEntryID: UInt = 0u,
            lpEntryID: MutPtr = MutPtr(0L),
            scode: Int = 0,
            ulFlags: UInt = 0u,
            lpMAPIError: MutPtr = MutPtr(0L),
        ): ErrorNotification =
            ErrorNotification(
                cbEntryID = cbEntryID,
                lpEntryIDCtorArg = lpEntryID,
                scode = scode,
                ulFlags = ulFlags,
                lpMAPIErrorCtorArg = lpMAPIError,
            )
    }
}

public class ExtendedNotification internal constructor(
    public var ulEvent: UInt,
    public var cb: UInt,
    pbEventParametersCtorArg: MutPtr,
) {
    public var pbEventParameters: MutPtr = pbEventParametersCtorArg
        internal set

    public constructor() : this(
        ulEvent = 0u,
        cb = 0u,
        pbEventParametersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulEvent

    public operator fun component2(): UInt = this.cb

    public operator fun component3(): MutPtr = this.pbEventParameters

    public fun copy(ulEvent: UInt = this.ulEvent, cb: UInt = this.cb, pbEventParameters: MutPtr = this.pbEventParameters): ExtendedNotification = ExtendedNotification(ulEvent = ulEvent, cb = cb, pbEventParametersCtorArg = pbEventParameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExtendedNotification) return false
        if (this.ulEvent != other.ulEvent) return false
        if (this.cb != other.cb) return false
        if (this.pbEventParameters != other.pbEventParameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulEvent.hashCode()
        result = 31 * result + this.cb.hashCode()
        result = 31 * result + this.pbEventParameters.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtendedNotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtendedNotification> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ExtendedNotification =
                    ExtendedNotification(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ExtendedNotification) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cb)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pbEventParameters)
                }
            }

        public operator fun invoke(
            ulEvent: UInt = 0u,
            cb: UInt = 0u,
            pbEventParameters: MutPtr = MutPtr(0L),
        ): ExtendedNotification =
            ExtendedNotification(
                ulEvent = ulEvent,
                cb = cb,
                pbEventParametersCtorArg = pbEventParameters,
            )
    }
}

public data class Flatentry(
    public var cb: UInt = 0u,
    public var abEntry: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Flatentry) return false
        if (this.cb != other.cb) return false
        if (!this.abEntry.contentEquals(other.abEntry)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.abEntry.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flatentry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flatentry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Flatentry =
                    Flatentry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Flatentry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.abEntry.toList())
                }
            }
    }
}

public data class Flatentrylist(
    public var cEntries: UInt = 0u,
    public var cbEntries: UInt = 0u,
    public var abEntries: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Flatentrylist) return false
        if (this.cEntries != other.cEntries) return false
        if (this.cbEntries != other.cbEntries) return false
        if (!this.abEntries.contentEquals(other.abEntries)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cEntries.hashCode()
        result = 31 * result + this.cbEntries.hashCode()
        result = 31 * result + this.abEntries.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flatentrylist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flatentrylist> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Flatentrylist =
                    Flatentrylist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Flatentrylist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.abEntries.toList())
                }
            }
    }
}

public data class Flatmtsidlist(
    public var cMTSIDs: UInt = 0u,
    public var cbMTSIDs: UInt = 0u,
    public var abMTSIDs: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Flatmtsidlist) return false
        if (this.cMTSIDs != other.cMTSIDs) return false
        if (this.cbMTSIDs != other.cbMTSIDs) return false
        if (!this.abMTSIDs.contentEquals(other.abMTSIDs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cMTSIDs.hashCode()
        result = 31 * result + this.cbMTSIDs.hashCode()
        result = 31 * result + this.abMTSIDs.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flatmtsidlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flatmtsidlist> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Flatmtsidlist =
                    Flatmtsidlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Flatmtsidlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cMTSIDs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbMTSIDs)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.abMTSIDs.toList())
                }
            }
    }
}

public data class FlagList(
    public var cFlags: UInt = 0u,
    public var ulFlag: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FlagList) return false
        if (this.cFlags != other.cFlags) return false
        if (!this.ulFlag.contentEquals(other.ulFlag)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cFlags.hashCode()
        result = 31 * result + this.ulFlag.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FlagList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FlagList> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FlagList =
                    FlagList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: FlagList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.ulFlag.toList())
                }
            }
    }
}

public class Mapierror internal constructor(
    public var ulVersion: UInt,
    lpszErrorCtorArg: MutPtr,
    lpszComponentCtorArg: MutPtr,
    public var ulLowLevelError: UInt,
    public var ulContext: UInt,
) {
    public var lpszError: MutPtr = lpszErrorCtorArg
        internal set

    public var lpszComponent: MutPtr = lpszComponentCtorArg
        internal set

    public constructor() : this(
        ulVersion = 0u,
        lpszErrorCtorArg = MutPtr(0L),
        lpszComponentCtorArg = MutPtr(0L),
        ulLowLevelError = 0u,
        ulContext = 0u,
    )

    public operator fun component1(): UInt = this.ulVersion

    public operator fun component2(): MutPtr = this.lpszError

    public operator fun component3(): MutPtr = this.lpszComponent

    public operator fun component4(): UInt = this.ulLowLevelError

    public operator fun component5(): UInt = this.ulContext

    public fun copy(ulVersion: UInt = this.ulVersion, lpszError: MutPtr = this.lpszError, lpszComponent: MutPtr = this.lpszComponent, ulLowLevelError: UInt = this.ulLowLevelError, ulContext: UInt = this.ulContext): Mapierror = Mapierror(ulVersion = ulVersion, lpszErrorCtorArg = lpszError, lpszComponentCtorArg = lpszComponent, ulLowLevelError = ulLowLevelError, ulContext = ulContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mapierror) return false
        if (this.ulVersion != other.ulVersion) return false
        if (this.lpszError != other.lpszError) return false
        if (this.lpszComponent != other.lpszComponent) return false
        if (this.ulLowLevelError != other.ulLowLevelError) return false
        if (this.ulContext != other.ulContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulVersion.hashCode()
        result = 31 * result + this.lpszError.hashCode()
        result = 31 * result + this.lpszComponent.hashCode()
        result = 31 * result + this.ulLowLevelError.hashCode()
        result = 31 * result + this.ulContext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mapierror> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mapierror> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Mapierror =
                    Mapierror(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Mapierror) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpszError)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.lpszComponent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ulLowLevelError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.ulContext)
                }
            }

        public operator fun invoke(
            ulVersion: UInt = 0u,
            lpszError: MutPtr = MutPtr(0L),
            lpszComponent: MutPtr = MutPtr(0L),
            ulLowLevelError: UInt = 0u,
            ulContext: UInt = 0u,
        ): Mapierror =
            Mapierror(
                ulVersion = ulVersion,
                lpszErrorCtorArg = lpszError,
                lpszComponentCtorArg = lpszComponent,
                ulLowLevelError = ulLowLevelError,
                ulContext = ulContext,
            )
    }
}

public class Mapinameid internal constructor(
    lpguidCtorArg: MutPtr,
    public var ulKind: UInt,
    public var kind: Mapinameid0,
) {
    public var lpguid: MutPtr = lpguidCtorArg
        internal set

    public constructor() : this(
        lpguidCtorArg = MutPtr(0L),
        ulKind = 0u,
        kind = Mapinameid0(),
    )

    public operator fun component1(): MutPtr = this.lpguid

    public operator fun component2(): UInt = this.ulKind

    public operator fun component3(): Mapinameid0 = this.kind

    public fun copy(lpguid: MutPtr = this.lpguid, ulKind: UInt = this.ulKind, kind: Mapinameid0 = this.kind): Mapinameid = Mapinameid(lpguidCtorArg = lpguid, ulKind = ulKind, kind = kind)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mapinameid) return false
        if (this.lpguid != other.lpguid) return false
        if (this.ulKind != other.ulKind) return false
        if (this.kind != other.kind) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpguid.hashCode()
        result = 31 * result + this.ulKind.hashCode()
        result = 31 * result + this.kind.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpguid: MutPtr = MutPtr(0L),
            ulKind: UInt = 0u,
            kind: Mapinameid0 = Mapinameid0(),
        ): Mapinameid =
            Mapinameid(
                lpguidCtorArg = lpguid,
                ulKind = ulKind,
                kind = kind,
            )
    }
}

public class Mapinameid0 internal constructor(
    public var lID: Int,
    lpwstrNameCtorArg: Pwstr,
) {
    public var lpwstrName: Pwstr = lpwstrNameCtorArg
        internal set

    public constructor() : this(
        lID = 0,
        lpwstrNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.lID

    public operator fun component2(): Pwstr = this.lpwstrName

    public fun copy(lID: Int = this.lID, lpwstrName: Pwstr = this.lpwstrName): Mapinameid0 = Mapinameid0(lID = lID, lpwstrNameCtorArg = lpwstrName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mapinameid0) return false
        if (this.lID != other.lID) return false
        if (this.lpwstrName != other.lpwstrName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lID.hashCode()
        result = 31 * result + this.lpwstrName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lID: Int = 0,
            lpwstrName: Pwstr = MutPtr(0L),
        ): Mapinameid0 =
            Mapinameid0(
                lID = lID,
                lpwstrNameCtorArg = lpwstrName,
            )
    }
}

public data class Mapiuid(
    public var ab: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mapiuid) return false
        if (!this.ab.contentEquals(other.ab)) return false
        return true
    }

    override fun hashCode(): Int = this.ab.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mapiuid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mapiuid> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Mapiuid =
                    Mapiuid(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Mapiuid) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.ab.toList())
                }
            }
    }
}

public data class Mtsid(
    public var cb: UInt = 0u,
    public var ab: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Mtsid) return false
        if (this.cb != other.cb) return false
        if (!this.ab.contentEquals(other.ab)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.ab.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mtsid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mtsid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Mtsid =
                    Mtsid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Mtsid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.ab.toList())
                }
            }
    }
}

public class NewmailNotification internal constructor(
    public var cbEntryID: UInt,
    lpEntryIDCtorArg: MutPtr,
    public var cbParentID: UInt,
    lpParentIDCtorArg: MutPtr,
    public var ulFlags: UInt,
    lpszMessageClassCtorArg: MutPtr,
    public var ulMessageFlags: UInt,
) {
    public var lpEntryID: MutPtr = lpEntryIDCtorArg
        internal set

    public var lpParentID: MutPtr = lpParentIDCtorArg
        internal set

    public var lpszMessageClass: MutPtr = lpszMessageClassCtorArg
        internal set

    public constructor() : this(
        cbEntryID = 0u,
        lpEntryIDCtorArg = MutPtr(0L),
        cbParentID = 0u,
        lpParentIDCtorArg = MutPtr(0L),
        ulFlags = 0u,
        lpszMessageClassCtorArg = MutPtr(0L),
        ulMessageFlags = 0u,
    )

    public operator fun component1(): UInt = this.cbEntryID

    public operator fun component2(): MutPtr = this.lpEntryID

    public operator fun component3(): UInt = this.cbParentID

    public operator fun component4(): MutPtr = this.lpParentID

    public operator fun component5(): UInt = this.ulFlags

    public operator fun component6(): MutPtr = this.lpszMessageClass

    public operator fun component7(): UInt = this.ulMessageFlags

    public fun copy(cbEntryID: UInt = this.cbEntryID, lpEntryID: MutPtr = this.lpEntryID, cbParentID: UInt = this.cbParentID, lpParentID: MutPtr = this.lpParentID, ulFlags: UInt = this.ulFlags, lpszMessageClass: MutPtr = this.lpszMessageClass, ulMessageFlags: UInt = this.ulMessageFlags): NewmailNotification = NewmailNotification(cbEntryID = cbEntryID, lpEntryIDCtorArg = lpEntryID, cbParentID = cbParentID, lpParentIDCtorArg = lpParentID, ulFlags = ulFlags, lpszMessageClassCtorArg = lpszMessageClass, ulMessageFlags = ulMessageFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NewmailNotification) return false
        if (this.cbEntryID != other.cbEntryID) return false
        if (this.lpEntryID != other.lpEntryID) return false
        if (this.cbParentID != other.cbParentID) return false
        if (this.lpParentID != other.lpParentID) return false
        if (this.ulFlags != other.ulFlags) return false
        if (this.lpszMessageClass != other.lpszMessageClass) return false
        if (this.ulMessageFlags != other.ulMessageFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbEntryID.hashCode()
        result = 31 * result + this.lpEntryID.hashCode()
        result = 31 * result + this.cbParentID.hashCode()
        result = 31 * result + this.lpParentID.hashCode()
        result = 31 * result + this.ulFlags.hashCode()
        result = 31 * result + this.lpszMessageClass.hashCode()
        result = 31 * result + this.ulMessageFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NewmailNotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NewmailNotification> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): NewmailNotification =
                    NewmailNotification(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: NewmailNotification) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbEntryID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpEntryID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbParentID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.lpParentID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.ulFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.lpszMessageClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.ulMessageFlags)
                }
            }

        public operator fun invoke(
            cbEntryID: UInt = 0u,
            lpEntryID: MutPtr = MutPtr(0L),
            cbParentID: UInt = 0u,
            lpParentID: MutPtr = MutPtr(0L),
            ulFlags: UInt = 0u,
            lpszMessageClass: MutPtr = MutPtr(0L),
            ulMessageFlags: UInt = 0u,
        ): NewmailNotification =
            NewmailNotification(
                cbEntryID = cbEntryID,
                lpEntryIDCtorArg = lpEntryID,
                cbParentID = cbParentID,
                lpParentIDCtorArg = lpParentID,
                ulFlags = ulFlags,
                lpszMessageClassCtorArg = lpszMessageClass,
                ulMessageFlags = ulMessageFlags,
            )
    }
}

public data class Notification(
    public var ulEventType: UInt = 0u,
    public var ulAlignPad: UInt = 0u,
    public var info: Notification0 = Notification0(),
)

public data class Notification0(
    public var err: ErrorNotification = ErrorNotification(),
    public var newmail: NewmailNotification = NewmailNotification(),
    public var obj: ObjectNotification = ObjectNotification(),
    public var tab: TableNotification = TableNotification(),
    public var ext: ExtendedNotification = ExtendedNotification(),
    public var statobj: StatusObjectNotification = StatusObjectNotification(),
)

public data class Notifkey(
    public var cb: UInt = 0u,
    public var ab: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Notifkey) return false
        if (this.cb != other.cb) return false
        if (!this.ab.contentEquals(other.ab)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.ab.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Notifkey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Notifkey> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Notifkey =
                    Notifkey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Notifkey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.ab.toList())
                }
            }
    }
}

public class ObjectNotification internal constructor(
    public var cbEntryID: UInt,
    lpEntryIDCtorArg: MutPtr,
    public var ulObjType: UInt,
    public var cbParentID: UInt,
    lpParentIDCtorArg: MutPtr,
    public var cbOldID: UInt,
    lpOldIDCtorArg: MutPtr,
    public var cbOldParentID: UInt,
    lpOldParentIDCtorArg: MutPtr,
    lpPropTagArrayCtorArg: MutPtr,
) {
    public var lpEntryID: MutPtr = lpEntryIDCtorArg
        internal set

    public var lpParentID: MutPtr = lpParentIDCtorArg
        internal set

    public var lpOldID: MutPtr = lpOldIDCtorArg
        internal set

    public var lpOldParentID: MutPtr = lpOldParentIDCtorArg
        internal set

    public var lpPropTagArray: MutPtr = lpPropTagArrayCtorArg
        internal set

    public constructor() : this(
        cbEntryID = 0u,
        lpEntryIDCtorArg = MutPtr(0L),
        ulObjType = 0u,
        cbParentID = 0u,
        lpParentIDCtorArg = MutPtr(0L),
        cbOldID = 0u,
        lpOldIDCtorArg = MutPtr(0L),
        cbOldParentID = 0u,
        lpOldParentIDCtorArg = MutPtr(0L),
        lpPropTagArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbEntryID

    public operator fun component2(): MutPtr = this.lpEntryID

    public operator fun component3(): UInt = this.ulObjType

    public operator fun component4(): UInt = this.cbParentID

    public operator fun component5(): MutPtr = this.lpParentID

    public operator fun component6(): UInt = this.cbOldID

    public operator fun component7(): MutPtr = this.lpOldID

    public operator fun component8(): UInt = this.cbOldParentID

    public operator fun component9(): MutPtr = this.lpOldParentID

    public operator fun component10(): MutPtr = this.lpPropTagArray

    public fun copy(cbEntryID: UInt = this.cbEntryID, lpEntryID: MutPtr = this.lpEntryID, ulObjType: UInt = this.ulObjType, cbParentID: UInt = this.cbParentID, lpParentID: MutPtr = this.lpParentID, cbOldID: UInt = this.cbOldID, lpOldID: MutPtr = this.lpOldID, cbOldParentID: UInt = this.cbOldParentID, lpOldParentID: MutPtr = this.lpOldParentID, lpPropTagArray: MutPtr = this.lpPropTagArray): ObjectNotification = ObjectNotification(cbEntryID = cbEntryID, lpEntryIDCtorArg = lpEntryID, ulObjType = ulObjType, cbParentID = cbParentID, lpParentIDCtorArg = lpParentID, cbOldID = cbOldID, lpOldIDCtorArg = lpOldID, cbOldParentID = cbOldParentID, lpOldParentIDCtorArg = lpOldParentID, lpPropTagArrayCtorArg = lpPropTagArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObjectNotification) return false
        if (this.cbEntryID != other.cbEntryID) return false
        if (this.lpEntryID != other.lpEntryID) return false
        if (this.ulObjType != other.ulObjType) return false
        if (this.cbParentID != other.cbParentID) return false
        if (this.lpParentID != other.lpParentID) return false
        if (this.cbOldID != other.cbOldID) return false
        if (this.lpOldID != other.lpOldID) return false
        if (this.cbOldParentID != other.cbOldParentID) return false
        if (this.lpOldParentID != other.lpOldParentID) return false
        if (this.lpPropTagArray != other.lpPropTagArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbEntryID.hashCode()
        result = 31 * result + this.lpEntryID.hashCode()
        result = 31 * result + this.ulObjType.hashCode()
        result = 31 * result + this.cbParentID.hashCode()
        result = 31 * result + this.lpParentID.hashCode()
        result = 31 * result + this.cbOldID.hashCode()
        result = 31 * result + this.lpOldID.hashCode()
        result = 31 * result + this.cbOldParentID.hashCode()
        result = 31 * result + this.lpOldParentID.hashCode()
        result = 31 * result + this.lpPropTagArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObjectNotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObjectNotification> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): ObjectNotification =
                    ObjectNotification(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: ObjectNotification) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbEntryID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpEntryID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulObjType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbParentID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.lpParentID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.cbOldID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.lpOldID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.cbOldParentID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 56L, value.lpOldParentID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 64L, value.lpPropTagArray)
                }
            }

        public operator fun invoke(
            cbEntryID: UInt = 0u,
            lpEntryID: MutPtr = MutPtr(0L),
            ulObjType: UInt = 0u,
            cbParentID: UInt = 0u,
            lpParentID: MutPtr = MutPtr(0L),
            cbOldID: UInt = 0u,
            lpOldID: MutPtr = MutPtr(0L),
            cbOldParentID: UInt = 0u,
            lpOldParentID: MutPtr = MutPtr(0L),
            lpPropTagArray: MutPtr = MutPtr(0L),
        ): ObjectNotification =
            ObjectNotification(
                cbEntryID = cbEntryID,
                lpEntryIDCtorArg = lpEntryID,
                ulObjType = ulObjType,
                cbParentID = cbParentID,
                lpParentIDCtorArg = lpParentID,
                cbOldID = cbOldID,
                lpOldIDCtorArg = lpOldID,
                cbOldParentID = cbOldParentID,
                lpOldParentIDCtorArg = lpOldParentID,
                lpPropTagArrayCtorArg = lpPropTagArray,
            )
    }
}

public class SAndRestriction internal constructor(
    public var cRes: UInt,
    lpResCtorArg: MutPtr,
) {
    public var lpRes: MutPtr = lpResCtorArg
        internal set

    public constructor() : this(
        cRes = 0u,
        lpResCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cRes

    public operator fun component2(): MutPtr = this.lpRes

    public fun copy(cRes: UInt = this.cRes, lpRes: MutPtr = this.lpRes): SAndRestriction = SAndRestriction(cRes = cRes, lpResCtorArg = lpRes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SAndRestriction) return false
        if (this.cRes != other.cRes) return false
        if (this.lpRes != other.lpRes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cRes.hashCode()
        result = 31 * result + this.lpRes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SAndRestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SAndRestriction> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SAndRestriction =
                    SAndRestriction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SAndRestriction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cRes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpRes)
                }
            }

        public operator fun invoke(
            cRes: UInt = 0u,
            lpRes: MutPtr = MutPtr(0L),
        ): SAndRestriction =
            SAndRestriction(
                cRes = cRes,
                lpResCtorArg = lpRes,
            )
    }
}

public class SAppTimeArray internal constructor(
    public var cValues: UInt,
    lpatCtorArg: MutPtr,
) {
    public var lpat: MutPtr = lpatCtorArg
        internal set

    public constructor() : this(
        cValues = 0u,
        lpatCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cValues

    public operator fun component2(): MutPtr = this.lpat

    public fun copy(cValues: UInt = this.cValues, lpat: MutPtr = this.lpat): SAppTimeArray = SAppTimeArray(cValues = cValues, lpatCtorArg = lpat)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SAppTimeArray) return false
        if (this.cValues != other.cValues) return false
        if (this.lpat != other.lpat) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.lpat.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SAppTimeArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SAppTimeArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SAppTimeArray =
                    SAppTimeArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SAppTimeArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpat)
                }
            }

        public operator fun invoke(
            cValues: UInt = 0u,
            lpat: MutPtr = MutPtr(0L),
        ): SAppTimeArray =
            SAppTimeArray(
                cValues = cValues,
                lpatCtorArg = lpat,
            )
    }
}

public class SBinary internal constructor(
    public var cb: UInt,
    lpbCtorArg: MutPtr,
) {
    public var lpb: MutPtr = lpbCtorArg
        internal set

    public constructor() : this(
        cb = 0u,
        lpbCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cb

    public operator fun component2(): MutPtr = this.lpb

    public fun copy(cb: UInt = this.cb, lpb: MutPtr = this.lpb): SBinary = SBinary(cb = cb, lpbCtorArg = lpb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SBinary) return false
        if (this.cb != other.cb) return false
        if (this.lpb != other.lpb) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.lpb.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SBinary> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SBinary> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SBinary =
                    SBinary(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SBinary) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpb)
                }
            }

        public operator fun invoke(
            cb: UInt = 0u,
            lpb: MutPtr = MutPtr(0L),
        ): SBinary =
            SBinary(
                cb = cb,
                lpbCtorArg = lpb,
            )
    }
}

public class SBinaryArray internal constructor(
    public var cValues: UInt,
    lpbinCtorArg: MutPtr,
) {
    public var lpbin: MutPtr = lpbinCtorArg
        internal set

    public constructor() : this(
        cValues = 0u,
        lpbinCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cValues

    public operator fun component2(): MutPtr = this.lpbin

    public fun copy(cValues: UInt = this.cValues, lpbin: MutPtr = this.lpbin): SBinaryArray = SBinaryArray(cValues = cValues, lpbinCtorArg = lpbin)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SBinaryArray) return false
        if (this.cValues != other.cValues) return false
        if (this.lpbin != other.lpbin) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.lpbin.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SBinaryArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SBinaryArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SBinaryArray =
                    SBinaryArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SBinaryArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpbin)
                }
            }

        public operator fun invoke(
            cValues: UInt = 0u,
            lpbin: MutPtr = MutPtr(0L),
        ): SBinaryArray =
            SBinaryArray(
                cValues = cValues,
                lpbinCtorArg = lpbin,
            )
    }
}

public data class SBitMaskRestriction(
    public var relBMR: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var ulMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SBitMaskRestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SBitMaskRestriction> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SBitMaskRestriction =
                    SBitMaskRestriction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SBitMaskRestriction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.relBMR)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulPropTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulMask)
                }
            }
    }
}

public class SCommentRestriction internal constructor(
    public var cValues: UInt,
    lpResCtorArg: MutPtr,
    lpPropCtorArg: MutPtr,
) {
    public var lpRes: MutPtr = lpResCtorArg
        internal set

    public var lpProp: MutPtr = lpPropCtorArg
        internal set

    public constructor() : this(
        cValues = 0u,
        lpResCtorArg = MutPtr(0L),
        lpPropCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cValues

    public operator fun component2(): MutPtr = this.lpRes

    public operator fun component3(): MutPtr = this.lpProp

    public fun copy(cValues: UInt = this.cValues, lpRes: MutPtr = this.lpRes, lpProp: MutPtr = this.lpProp): SCommentRestriction = SCommentRestriction(cValues = cValues, lpResCtorArg = lpRes, lpPropCtorArg = lpProp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCommentRestriction) return false
        if (this.cValues != other.cValues) return false
        if (this.lpRes != other.lpRes) return false
        if (this.lpProp != other.lpProp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.lpRes.hashCode()
        result = 31 * result + this.lpProp.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SCommentRestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SCommentRestriction> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SCommentRestriction =
                    SCommentRestriction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SCommentRestriction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpRes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.lpProp)
                }
            }

        public operator fun invoke(
            cValues: UInt = 0u,
            lpRes: MutPtr = MutPtr(0L),
            lpProp: MutPtr = MutPtr(0L),
        ): SCommentRestriction =
            SCommentRestriction(
                cValues = cValues,
                lpResCtorArg = lpRes,
                lpPropCtorArg = lpProp,
            )
    }
}

public data class SComparePropsRestriction(
    public var relop: UInt = 0u,
    public var ulPropTag1: UInt = 0u,
    public var ulPropTag2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SComparePropsRestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SComparePropsRestriction> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SComparePropsRestriction =
                    SComparePropsRestriction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SComparePropsRestriction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.relop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulPropTag1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulPropTag2)
                }
            }
    }
}

public class SContentRestriction internal constructor(
    public var ulFuzzyLevel: UInt,
    public var ulPropTag: UInt,
    lpPropCtorArg: MutPtr,
) {
    public var lpProp: MutPtr = lpPropCtorArg
        internal set

    public constructor() : this(
        ulFuzzyLevel = 0u,
        ulPropTag = 0u,
        lpPropCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulFuzzyLevel

    public operator fun component2(): UInt = this.ulPropTag

    public operator fun component3(): MutPtr = this.lpProp

    public fun copy(ulFuzzyLevel: UInt = this.ulFuzzyLevel, ulPropTag: UInt = this.ulPropTag, lpProp: MutPtr = this.lpProp): SContentRestriction = SContentRestriction(ulFuzzyLevel = ulFuzzyLevel, ulPropTag = ulPropTag, lpPropCtorArg = lpProp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SContentRestriction) return false
        if (this.ulFuzzyLevel != other.ulFuzzyLevel) return false
        if (this.ulPropTag != other.ulPropTag) return false
        if (this.lpProp != other.lpProp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulFuzzyLevel.hashCode()
        result = 31 * result + this.ulPropTag.hashCode()
        result = 31 * result + this.lpProp.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SContentRestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SContentRestriction> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SContentRestriction =
                    SContentRestriction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SContentRestriction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulFuzzyLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulPropTag)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpProp)
                }
            }

        public operator fun invoke(
            ulFuzzyLevel: UInt = 0u,
            ulPropTag: UInt = 0u,
            lpProp: MutPtr = MutPtr(0L),
        ): SContentRestriction =
            SContentRestriction(
                ulFuzzyLevel = ulFuzzyLevel,
                ulPropTag = ulPropTag,
                lpPropCtorArg = lpProp,
            )
    }
}

public class SCurrencyArray internal constructor(
    public var cValues: UInt,
    lpcurCtorArg: MutPtr,
) {
    public var lpcur: MutPtr = lpcurCtorArg
        internal set

    public constructor() : this(
        cValues = 0u,
        lpcurCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cValues

    public operator fun component2(): MutPtr = this.lpcur

    public fun copy(cValues: UInt = this.cValues, lpcur: MutPtr = this.lpcur): SCurrencyArray = SCurrencyArray(cValues = cValues, lpcurCtorArg = lpcur)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SCurrencyArray) return false
        if (this.cValues != other.cValues) return false
        if (this.lpcur != other.lpcur) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.lpcur.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SCurrencyArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SCurrencyArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SCurrencyArray =
                    SCurrencyArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SCurrencyArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpcur)
                }
            }

        public operator fun invoke(
            cValues: UInt = 0u,
            lpcur: MutPtr = MutPtr(0L),
        ): SCurrencyArray =
            SCurrencyArray(
                cValues = cValues,
                lpcurCtorArg = lpcur,
            )
    }
}

public class SDateTimeArray internal constructor(
    public var cValues: UInt,
    lpftCtorArg: MutPtr,
) {
    public var lpft: MutPtr = lpftCtorArg
        internal set

    public constructor() : this(
        cValues = 0u,
        lpftCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cValues

    public operator fun component2(): MutPtr = this.lpft

    public fun copy(cValues: UInt = this.cValues, lpft: MutPtr = this.lpft): SDateTimeArray = SDateTimeArray(cValues = cValues, lpftCtorArg = lpft)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SDateTimeArray) return false
        if (this.cValues != other.cValues) return false
        if (this.lpft != other.lpft) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.lpft.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SDateTimeArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SDateTimeArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SDateTimeArray =
                    SDateTimeArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SDateTimeArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpft)
                }
            }

        public operator fun invoke(
            cValues: UInt = 0u,
            lpft: MutPtr = MutPtr(0L),
        ): SDateTimeArray =
            SDateTimeArray(
                cValues = cValues,
                lpftCtorArg = lpft,
            )
    }
}

public class SDoubleArray internal constructor(
    public var cValues: UInt,
    lpdblCtorArg: MutPtr,
) {
    public var lpdbl: MutPtr = lpdblCtorArg
        internal set

    public constructor() : this(
        cValues = 0u,
        lpdblCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cValues

    public operator fun component2(): MutPtr = this.lpdbl

    public fun copy(cValues: UInt = this.cValues, lpdbl: MutPtr = this.lpdbl): SDoubleArray = SDoubleArray(cValues = cValues, lpdblCtorArg = lpdbl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SDoubleArray) return false
        if (this.cValues != other.cValues) return false
        if (this.lpdbl != other.lpdbl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.lpdbl.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SDoubleArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SDoubleArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SDoubleArray =
                    SDoubleArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SDoubleArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpdbl)
                }
            }

        public operator fun invoke(
            cValues: UInt = 0u,
            lpdbl: MutPtr = MutPtr(0L),
        ): SDoubleArray =
            SDoubleArray(
                cValues = cValues,
                lpdblCtorArg = lpdbl,
            )
    }
}

public data class SExistRestriction(
    public var ulReserved1: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var ulReserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SExistRestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SExistRestriction> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SExistRestriction =
                    SExistRestriction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SExistRestriction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulPropTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ulReserved2)
                }
            }
    }
}

public class SGuidArray internal constructor(
    public var cValues: UInt,
    lpguidCtorArg: MutPtr,
) {
    public var lpguid: MutPtr = lpguidCtorArg
        internal set

    public constructor() : this(
        cValues = 0u,
        lpguidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cValues

    public operator fun component2(): MutPtr = this.lpguid

    public fun copy(cValues: UInt = this.cValues, lpguid: MutPtr = this.lpguid): SGuidArray = SGuidArray(cValues = cValues, lpguidCtorArg = lpguid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SGuidArray) return false
        if (this.cValues != other.cValues) return false
        if (this.lpguid != other.lpguid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.lpguid.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SGuidArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SGuidArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SGuidArray =
                    SGuidArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SGuidArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpguid)
                }
            }

        public operator fun invoke(
            cValues: UInt = 0u,
            lpguid: MutPtr = MutPtr(0L),
        ): SGuidArray =
            SGuidArray(
                cValues = cValues,
                lpguidCtorArg = lpguid,
            )
    }
}

public class SLPSTRArray internal constructor(
    public var cValues: UInt,
    lppszACtorArg: MutPtr,
) {
    public var lppszA: MutPtr = lppszACtorArg
        internal set

    public constructor() : this(
        cValues = 0u,
        lppszACtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cValues

    public operator fun component2(): MutPtr = this.lppszA

    public fun copy(cValues: UInt = this.cValues, lppszA: MutPtr = this.lppszA): SLPSTRArray = SLPSTRArray(cValues = cValues, lppszACtorArg = lppszA)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SLPSTRArray) return false
        if (this.cValues != other.cValues) return false
        if (this.lppszA != other.lppszA) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.lppszA.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SLPSTRArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SLPSTRArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SLPSTRArray =
                    SLPSTRArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SLPSTRArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lppszA)
                }
            }

        public operator fun invoke(
            cValues: UInt = 0u,
            lppszA: MutPtr = MutPtr(0L),
        ): SLPSTRArray =
            SLPSTRArray(
                cValues = cValues,
                lppszACtorArg = lppszA,
            )
    }
}

public class SLargeIntegerArray internal constructor(
    public var cValues: UInt,
    lpliCtorArg: MutPtr,
) {
    public var lpli: MutPtr = lpliCtorArg
        internal set

    public constructor() : this(
        cValues = 0u,
        lpliCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cValues

    public operator fun component2(): MutPtr = this.lpli

    public fun copy(cValues: UInt = this.cValues, lpli: MutPtr = this.lpli): SLargeIntegerArray = SLargeIntegerArray(cValues = cValues, lpliCtorArg = lpli)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SLargeIntegerArray) return false
        if (this.cValues != other.cValues) return false
        if (this.lpli != other.lpli) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.lpli.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SLargeIntegerArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SLargeIntegerArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SLargeIntegerArray =
                    SLargeIntegerArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SLargeIntegerArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpli)
                }
            }

        public operator fun invoke(
            cValues: UInt = 0u,
            lpli: MutPtr = MutPtr(0L),
        ): SLargeIntegerArray =
            SLargeIntegerArray(
                cValues = cValues,
                lpliCtorArg = lpli,
            )
    }
}

public class SLongArray internal constructor(
    public var cValues: UInt,
    lplCtorArg: MutPtr,
) {
    public var lpl: MutPtr = lplCtorArg
        internal set

    public constructor() : this(
        cValues = 0u,
        lplCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cValues

    public operator fun component2(): MutPtr = this.lpl

    public fun copy(cValues: UInt = this.cValues, lpl: MutPtr = this.lpl): SLongArray = SLongArray(cValues = cValues, lplCtorArg = lpl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SLongArray) return false
        if (this.cValues != other.cValues) return false
        if (this.lpl != other.lpl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.lpl.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SLongArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SLongArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SLongArray =
                    SLongArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SLongArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpl)
                }
            }

        public operator fun invoke(
            cValues: UInt = 0u,
            lpl: MutPtr = MutPtr(0L),
        ): SLongArray =
            SLongArray(
                cValues = cValues,
                lplCtorArg = lpl,
            )
    }
}

public class SNotRestriction internal constructor(
    public var ulReserved: UInt,
    lpResCtorArg: MutPtr,
) {
    public var lpRes: MutPtr = lpResCtorArg
        internal set

    public constructor() : this(
        ulReserved = 0u,
        lpResCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulReserved

    public operator fun component2(): MutPtr = this.lpRes

    public fun copy(ulReserved: UInt = this.ulReserved, lpRes: MutPtr = this.lpRes): SNotRestriction = SNotRestriction(ulReserved = ulReserved, lpResCtorArg = lpRes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SNotRestriction) return false
        if (this.ulReserved != other.ulReserved) return false
        if (this.lpRes != other.lpRes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulReserved.hashCode()
        result = 31 * result + this.lpRes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SNotRestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SNotRestriction> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SNotRestriction =
                    SNotRestriction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SNotRestriction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpRes)
                }
            }

        public operator fun invoke(
            ulReserved: UInt = 0u,
            lpRes: MutPtr = MutPtr(0L),
        ): SNotRestriction =
            SNotRestriction(
                ulReserved = ulReserved,
                lpResCtorArg = lpRes,
            )
    }
}

public class SOrRestriction internal constructor(
    public var cRes: UInt,
    lpResCtorArg: MutPtr,
) {
    public var lpRes: MutPtr = lpResCtorArg
        internal set

    public constructor() : this(
        cRes = 0u,
        lpResCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cRes

    public operator fun component2(): MutPtr = this.lpRes

    public fun copy(cRes: UInt = this.cRes, lpRes: MutPtr = this.lpRes): SOrRestriction = SOrRestriction(cRes = cRes, lpResCtorArg = lpRes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SOrRestriction) return false
        if (this.cRes != other.cRes) return false
        if (this.lpRes != other.lpRes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cRes.hashCode()
        result = 31 * result + this.lpRes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SOrRestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SOrRestriction> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SOrRestriction =
                    SOrRestriction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SOrRestriction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cRes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpRes)
                }
            }

        public operator fun invoke(
            cRes: UInt = 0u,
            lpRes: MutPtr = MutPtr(0L),
        ): SOrRestriction =
            SOrRestriction(
                cRes = cRes,
                lpResCtorArg = lpRes,
            )
    }
}

public data class SPropProblem(
    public var ulIndex: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var scode: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SPropProblem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SPropProblem> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SPropProblem =
                    SPropProblem(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SPropProblem) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulPropTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.scode)
                }
            }
    }
}

public data class SPropProblemArray(
    public var cProblem: UInt = 0u,
    public var aProblem: List<SPropProblem> = List(1) { SPropProblem() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SPropProblemArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SPropProblemArray> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SPropProblemArray =
                    SPropProblemArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(SPropProblem.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SPropProblemArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cProblem)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(SPropProblem.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.aProblem)
                }
            }
    }
}

public data class SPropTagArray(
    public var cValues: UInt = 0u,
    public var aulPropTag: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SPropTagArray) return false
        if (this.cValues != other.cValues) return false
        if (!this.aulPropTag.contentEquals(other.aulPropTag)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.aulPropTag.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SPropTagArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SPropTagArray> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SPropTagArray =
                    SPropTagArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: SPropTagArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 4L, value.aulPropTag.toList())
                }
            }
    }
}

public data class SPropValue(
    public var ulPropTag: UInt = 0u,
    public var dwAlignPad: UInt = 0u,
    public var value: Upv = Upv(),
)

public class SPropertyRestriction internal constructor(
    public var relop: UInt,
    public var ulPropTag: UInt,
    lpPropCtorArg: MutPtr,
) {
    public var lpProp: MutPtr = lpPropCtorArg
        internal set

    public constructor() : this(
        relop = 0u,
        ulPropTag = 0u,
        lpPropCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.relop

    public operator fun component2(): UInt = this.ulPropTag

    public operator fun component3(): MutPtr = this.lpProp

    public fun copy(relop: UInt = this.relop, ulPropTag: UInt = this.ulPropTag, lpProp: MutPtr = this.lpProp): SPropertyRestriction = SPropertyRestriction(relop = relop, ulPropTag = ulPropTag, lpPropCtorArg = lpProp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SPropertyRestriction) return false
        if (this.relop != other.relop) return false
        if (this.ulPropTag != other.ulPropTag) return false
        if (this.lpProp != other.lpProp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.relop.hashCode()
        result = 31 * result + this.ulPropTag.hashCode()
        result = 31 * result + this.lpProp.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SPropertyRestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SPropertyRestriction> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SPropertyRestriction =
                    SPropertyRestriction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SPropertyRestriction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.relop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulPropTag)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpProp)
                }
            }

        public operator fun invoke(
            relop: UInt = 0u,
            ulPropTag: UInt = 0u,
            lpProp: MutPtr = MutPtr(0L),
        ): SPropertyRestriction =
            SPropertyRestriction(
                relop = relop,
                ulPropTag = ulPropTag,
                lpPropCtorArg = lpProp,
            )
    }
}

public class SRealArray internal constructor(
    public var cValues: UInt,
    lpfltCtorArg: MutPtr,
) {
    public var lpflt: MutPtr = lpfltCtorArg
        internal set

    public constructor() : this(
        cValues = 0u,
        lpfltCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cValues

    public operator fun component2(): MutPtr = this.lpflt

    public fun copy(cValues: UInt = this.cValues, lpflt: MutPtr = this.lpflt): SRealArray = SRealArray(cValues = cValues, lpfltCtorArg = lpflt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SRealArray) return false
        if (this.cValues != other.cValues) return false
        if (this.lpflt != other.lpflt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.lpflt.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SRealArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SRealArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SRealArray =
                    SRealArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SRealArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpflt)
                }
            }

        public operator fun invoke(
            cValues: UInt = 0u,
            lpflt: MutPtr = MutPtr(0L),
        ): SRealArray =
            SRealArray(
                cValues = cValues,
                lpfltCtorArg = lpflt,
            )
    }
}

public data class SRestriction(
    public var rt: UInt = 0u,
    public var res: Srestriction0 = Srestriction0(),
)

public data class Srestriction0(
    public var resCompareProps: SComparePropsRestriction = SComparePropsRestriction(),
    public var resAnd: SAndRestriction = SAndRestriction(),
    public var resOr: SOrRestriction = SOrRestriction(),
    public var resNot: SNotRestriction = SNotRestriction(),
    public var resContent: SContentRestriction = SContentRestriction(),
    public var resProperty: SPropertyRestriction = SPropertyRestriction(),
    public var resBitMask: SBitMaskRestriction = SBitMaskRestriction(),
    public var resSize: SSizeRestriction = SSizeRestriction(),
    public var resExist: SExistRestriction = SExistRestriction(),
    public var resSub: SSubRestriction = SSubRestriction(),
    public var resComment: SCommentRestriction = SCommentRestriction(),
)

public class SRow internal constructor(
    public var ulAdrEntryPad: UInt,
    public var cValues: UInt,
    lpPropsCtorArg: MutPtr,
) {
    public var lpProps: MutPtr = lpPropsCtorArg
        internal set

    public constructor() : this(
        ulAdrEntryPad = 0u,
        cValues = 0u,
        lpPropsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulAdrEntryPad

    public operator fun component2(): UInt = this.cValues

    public operator fun component3(): MutPtr = this.lpProps

    public fun copy(ulAdrEntryPad: UInt = this.ulAdrEntryPad, cValues: UInt = this.cValues, lpProps: MutPtr = this.lpProps): SRow = SRow(ulAdrEntryPad = ulAdrEntryPad, cValues = cValues, lpPropsCtorArg = lpProps)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SRow) return false
        if (this.ulAdrEntryPad != other.ulAdrEntryPad) return false
        if (this.cValues != other.cValues) return false
        if (this.lpProps != other.lpProps) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulAdrEntryPad.hashCode()
        result = 31 * result + this.cValues.hashCode()
        result = 31 * result + this.lpProps.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SRow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SRow> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SRow =
                    SRow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SRow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulAdrEntryPad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpProps)
                }
            }

        public operator fun invoke(
            ulAdrEntryPad: UInt = 0u,
            cValues: UInt = 0u,
            lpProps: MutPtr = MutPtr(0L),
        ): SRow =
            SRow(
                ulAdrEntryPad = ulAdrEntryPad,
                cValues = cValues,
                lpPropsCtorArg = lpProps,
            )
    }
}

public data class SRowSet(
    public var cRows: UInt = 0u,
    public var aRow: List<SRow> = List(1) { SRow() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SRowSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SRowSet> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SRowSet =
                    SRowSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(SRow.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SRowSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cRows)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(SRow.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.aRow)
                }
            }
    }
}

public class SShortArray internal constructor(
    public var cValues: UInt,
    lpiCtorArg: MutPtr,
) {
    public var lpi: MutPtr = lpiCtorArg
        internal set

    public constructor() : this(
        cValues = 0u,
        lpiCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cValues

    public operator fun component2(): MutPtr = this.lpi

    public fun copy(cValues: UInt = this.cValues, lpi: MutPtr = this.lpi): SShortArray = SShortArray(cValues = cValues, lpiCtorArg = lpi)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SShortArray) return false
        if (this.cValues != other.cValues) return false
        if (this.lpi != other.lpi) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.lpi.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SShortArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SShortArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SShortArray =
                    SShortArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SShortArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpi)
                }
            }

        public operator fun invoke(
            cValues: UInt = 0u,
            lpi: MutPtr = MutPtr(0L),
        ): SShortArray =
            SShortArray(
                cValues = cValues,
                lpiCtorArg = lpi,
            )
    }
}

public data class SSizeRestriction(
    public var relop: UInt = 0u,
    public var ulPropTag: UInt = 0u,
    public var cb: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SSizeRestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SSizeRestriction> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SSizeRestriction =
                    SSizeRestriction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SSizeRestriction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.relop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulPropTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cb)
                }
            }
    }
}

public data class SSortOrder(
    public var ulPropTag: UInt = 0u,
    public var ulOrder: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SSortOrder> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SSortOrder> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SSortOrder =
                    SSortOrder(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SSortOrder) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulPropTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulOrder)
                }
            }
    }
}

public data class SSortOrderSet(
    public var cSorts: UInt = 0u,
    public var cCategories: UInt = 0u,
    public var cExpanded: UInt = 0u,
    public var aSort: List<SSortOrder> = List(1) { SSortOrder() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SSortOrderSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SSortOrderSet> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): SSortOrderSet =
                    SSortOrderSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(SSortOrder.typeLayout(), (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SSortOrderSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cSorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cCategories)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cExpanded)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(SSortOrder.typeLayout(), (1).toInt())
                    ).writeNative(addr + 12L, value.aSort)
                }
            }
    }
}

public class SSubRestriction internal constructor(
    public var ulSubObject: UInt,
    lpResCtorArg: MutPtr,
) {
    public var lpRes: MutPtr = lpResCtorArg
        internal set

    public constructor() : this(
        ulSubObject = 0u,
        lpResCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulSubObject

    public operator fun component2(): MutPtr = this.lpRes

    public fun copy(ulSubObject: UInt = this.ulSubObject, lpRes: MutPtr = this.lpRes): SSubRestriction = SSubRestriction(ulSubObject = ulSubObject, lpResCtorArg = lpRes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SSubRestriction) return false
        if (this.ulSubObject != other.ulSubObject) return false
        if (this.lpRes != other.lpRes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulSubObject.hashCode()
        result = 31 * result + this.lpRes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SSubRestriction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SSubRestriction> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SSubRestriction =
                    SSubRestriction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SSubRestriction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulSubObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpRes)
                }
            }

        public operator fun invoke(
            ulSubObject: UInt = 0u,
            lpRes: MutPtr = MutPtr(0L),
        ): SSubRestriction =
            SSubRestriction(
                ulSubObject = ulSubObject,
                lpResCtorArg = lpRes,
            )
    }
}

public class StatusObjectNotification internal constructor(
    public var cbEntryID: UInt,
    lpEntryIDCtorArg: MutPtr,
    public var cValues: UInt,
    lpPropValsCtorArg: MutPtr,
) {
    public var lpEntryID: MutPtr = lpEntryIDCtorArg
        internal set

    public var lpPropVals: MutPtr = lpPropValsCtorArg
        internal set

    public constructor() : this(
        cbEntryID = 0u,
        lpEntryIDCtorArg = MutPtr(0L),
        cValues = 0u,
        lpPropValsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbEntryID

    public operator fun component2(): MutPtr = this.lpEntryID

    public operator fun component3(): UInt = this.cValues

    public operator fun component4(): MutPtr = this.lpPropVals

    public fun copy(cbEntryID: UInt = this.cbEntryID, lpEntryID: MutPtr = this.lpEntryID, cValues: UInt = this.cValues, lpPropVals: MutPtr = this.lpPropVals): StatusObjectNotification = StatusObjectNotification(cbEntryID = cbEntryID, lpEntryIDCtorArg = lpEntryID, cValues = cValues, lpPropValsCtorArg = lpPropVals)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StatusObjectNotification) return false
        if (this.cbEntryID != other.cbEntryID) return false
        if (this.lpEntryID != other.lpEntryID) return false
        if (this.cValues != other.cValues) return false
        if (this.lpPropVals != other.lpPropVals) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbEntryID.hashCode()
        result = 31 * result + this.lpEntryID.hashCode()
        result = 31 * result + this.cValues.hashCode()
        result = 31 * result + this.lpPropVals.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StatusObjectNotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StatusObjectNotification> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): StatusObjectNotification =
                    StatusObjectNotification(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: StatusObjectNotification) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbEntryID)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpEntryID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.lpPropVals)
                }
            }

        public operator fun invoke(
            cbEntryID: UInt = 0u,
            lpEntryID: MutPtr = MutPtr(0L),
            cValues: UInt = 0u,
            lpPropVals: MutPtr = MutPtr(0L),
        ): StatusObjectNotification =
            StatusObjectNotification(
                cbEntryID = cbEntryID,
                lpEntryIDCtorArg = lpEntryID,
                cValues = cValues,
                lpPropValsCtorArg = lpPropVals,
            )
    }
}

public class SWStringArray internal constructor(
    public var cValues: UInt,
    lppszWCtorArg: MutPtr,
) {
    public var lppszW: MutPtr = lppszWCtorArg
        internal set

    public constructor() : this(
        cValues = 0u,
        lppszWCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cValues

    public operator fun component2(): MutPtr = this.lppszW

    public fun copy(cValues: UInt = this.cValues, lppszW: MutPtr = this.lppszW): SWStringArray = SWStringArray(cValues = cValues, lppszWCtorArg = lppszW)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SWStringArray) return false
        if (this.cValues != other.cValues) return false
        if (this.lppszW != other.lppszW) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cValues.hashCode()
        result = 31 * result + this.lppszW.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SWStringArray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SWStringArray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SWStringArray =
                    SWStringArray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SWStringArray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cValues)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lppszW)
                }
            }

        public operator fun invoke(
            cValues: UInt = 0u,
            lppszW: MutPtr = MutPtr(0L),
        ): SWStringArray =
            SWStringArray(
                cValues = cValues,
                lppszWCtorArg = lppszW,
            )
    }
}

public data class TableNotification(
    public var ulTableEvent: UInt = 0u,
    public var hResult: Hresult = 0,
    public var propIndex: SPropValue = SPropValue(),
    public var propPrior: SPropValue = SPropValue(),
    public var row: SRow = SRow(),
    public var ulPad: UInt = 0u,
)

public class Wabextdisplay internal constructor(
    public var cbSize: UInt,
    lpWABObjectCtorArg: MutPtr,
    lpAdrBookCtorArg: MutPtr,
    lpPropObjCtorArg: MutPtr,
    public var fReadOnly: Bool,
    public var fDataChanged: Bool,
    public var ulFlags: UInt,
    lpvCtorArg: MutPtr,
    lpszCtorArg: MutPtr,
) {
    public var lpWABObject: MutPtr = lpWABObjectCtorArg
        internal set

    public var lpAdrBook: MutPtr = lpAdrBookCtorArg
        internal set

    public var lpPropObj: MutPtr = lpPropObjCtorArg
        internal set

    public var lpv: MutPtr = lpvCtorArg
        internal set

    public var lpsz: MutPtr = lpszCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        lpWABObjectCtorArg = MutPtr(0L),
        lpAdrBookCtorArg = MutPtr(0L),
        lpPropObjCtorArg = MutPtr(0L),
        fReadOnly = 0,
        fDataChanged = 0,
        ulFlags = 0u,
        lpvCtorArg = MutPtr(0L),
        lpszCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.lpWABObject

    public operator fun component3(): MutPtr = this.lpAdrBook

    public operator fun component4(): MutPtr = this.lpPropObj

    public operator fun component5(): Bool = this.fReadOnly

    public operator fun component6(): Bool = this.fDataChanged

    public operator fun component7(): UInt = this.ulFlags

    public operator fun component8(): MutPtr = this.lpv

    public operator fun component9(): MutPtr = this.lpsz

    public fun copy(cbSize: UInt = this.cbSize, lpWABObject: MutPtr = this.lpWABObject, lpAdrBook: MutPtr = this.lpAdrBook, lpPropObj: MutPtr = this.lpPropObj, fReadOnly: Bool = this.fReadOnly, fDataChanged: Bool = this.fDataChanged, ulFlags: UInt = this.ulFlags, lpv: MutPtr = this.lpv, lpsz: MutPtr = this.lpsz): Wabextdisplay = Wabextdisplay(cbSize = cbSize, lpWABObjectCtorArg = lpWABObject, lpAdrBookCtorArg = lpAdrBook, lpPropObjCtorArg = lpPropObj, fReadOnly = fReadOnly, fDataChanged = fDataChanged, ulFlags = ulFlags, lpvCtorArg = lpv, lpszCtorArg = lpsz)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wabextdisplay) return false
        if (this.cbSize != other.cbSize) return false
        if (this.lpWABObject != other.lpWABObject) return false
        if (this.lpAdrBook != other.lpAdrBook) return false
        if (this.lpPropObj != other.lpPropObj) return false
        if (this.fReadOnly != other.fReadOnly) return false
        if (this.fDataChanged != other.fDataChanged) return false
        if (this.ulFlags != other.ulFlags) return false
        if (this.lpv != other.lpv) return false
        if (this.lpsz != other.lpsz) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.lpWABObject.hashCode()
        result = 31 * result + this.lpAdrBook.hashCode()
        result = 31 * result + this.lpPropObj.hashCode()
        result = 31 * result + this.fReadOnly.hashCode()
        result = 31 * result + this.fDataChanged.hashCode()
        result = 31 * result + this.ulFlags.hashCode()
        result = 31 * result + this.lpv.hashCode()
        result = 31 * result + this.lpsz.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wabextdisplay> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wabextdisplay> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): Wabextdisplay =
                    Wabextdisplay(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: Wabextdisplay) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpWABObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.lpAdrBook)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.lpPropObj)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.fReadOnly)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.fDataChanged)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ulFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.lpv)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 56L, value.lpsz)
                }
            }

        public operator fun invoke(
            cbSize: UInt = 0u,
            lpWABObject: MutPtr = MutPtr(0L),
            lpAdrBook: MutPtr = MutPtr(0L),
            lpPropObj: MutPtr = MutPtr(0L),
            fReadOnly: Bool = 0,
            fDataChanged: Bool = 0,
            ulFlags: UInt = 0u,
            lpv: MutPtr = MutPtr(0L),
            lpsz: MutPtr = MutPtr(0L),
        ): Wabextdisplay =
            Wabextdisplay(
                cbSize = cbSize,
                lpWABObjectCtorArg = lpWABObject,
                lpAdrBookCtorArg = lpAdrBook,
                lpPropObjCtorArg = lpPropObj,
                fReadOnly = fReadOnly,
                fDataChanged = fDataChanged,
                ulFlags = ulFlags,
                lpvCtorArg = lpv,
                lpszCtorArg = lpsz,
            )
    }
}

public class Wabimportparam internal constructor(
    public var cbSize: UInt,
    lpAdrBookCtorArg: MutPtr,
    hWndCtorArg: Hwnd,
    public var ulFlags: UInt,
    lpszFileNameCtorArg: Pstr,
) {
    public var lpAdrBook: MutPtr = lpAdrBookCtorArg
        internal set

    public var hWnd: Hwnd = hWndCtorArg
        internal set

    public var lpszFileName: Pstr = lpszFileNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        lpAdrBookCtorArg = MutPtr(0L),
        hWndCtorArg = MutPtr(0L),
        ulFlags = 0u,
        lpszFileNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): MutPtr = this.lpAdrBook

    public operator fun component3(): Hwnd = this.hWnd

    public operator fun component4(): UInt = this.ulFlags

    public operator fun component5(): Pstr = this.lpszFileName

    public fun copy(cbSize: UInt = this.cbSize, lpAdrBook: MutPtr = this.lpAdrBook, hWnd: Hwnd = this.hWnd, ulFlags: UInt = this.ulFlags, lpszFileName: Pstr = this.lpszFileName): Wabimportparam = Wabimportparam(cbSize = cbSize, lpAdrBookCtorArg = lpAdrBook, hWndCtorArg = hWnd, ulFlags = ulFlags, lpszFileNameCtorArg = lpszFileName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wabimportparam) return false
        if (this.cbSize != other.cbSize) return false
        if (this.lpAdrBook != other.lpAdrBook) return false
        if (this.hWnd != other.hWnd) return false
        if (this.ulFlags != other.ulFlags) return false
        if (this.lpszFileName != other.lpszFileName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.lpAdrBook.hashCode()
        result = 31 * result + this.hWnd.hashCode()
        result = 31 * result + this.ulFlags.hashCode()
        result = 31 * result + this.lpszFileName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            lpAdrBook: MutPtr = MutPtr(0L),
            hWnd: Hwnd = MutPtr(0L),
            ulFlags: UInt = 0u,
            lpszFileName: Pstr = MutPtr(0L),
        ): Wabimportparam =
            Wabimportparam(
                cbSize = cbSize,
                lpAdrBookCtorArg = lpAdrBook,
                hWndCtorArg = hWnd,
                ulFlags = ulFlags,
                lpszFileNameCtorArg = lpszFileName,
            )
    }
}

public class WabParam internal constructor(
    public var cbSize: UInt,
    hwndCtorArg: Hwnd,
    szFileNameCtorArg: Pstr,
    public var ulFlags: UInt,
    public var guidPSExt: Guid,
) {
    public var hwnd: Hwnd = hwndCtorArg
        internal set

    public var szFileName: Pstr = szFileNameCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hwndCtorArg = MutPtr(0L),
        szFileNameCtorArg = MutPtr(0L),
        ulFlags = 0u,
        guidPSExt = Guid(),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hwnd = this.hwnd

    public operator fun component3(): Pstr = this.szFileName

    public operator fun component4(): UInt = this.ulFlags

    public operator fun component5(): Guid = this.guidPSExt

    public fun copy(cbSize: UInt = this.cbSize, hwnd: Hwnd = this.hwnd, szFileName: Pstr = this.szFileName, ulFlags: UInt = this.ulFlags, guidPSExt: Guid = this.guidPSExt): WabParam = WabParam(cbSize = cbSize, hwndCtorArg = hwnd, szFileNameCtorArg = szFileName, ulFlags = ulFlags, guidPSExt = guidPSExt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WabParam) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hwnd != other.hwnd) return false
        if (this.szFileName != other.szFileName) return false
        if (this.ulFlags != other.ulFlags) return false
        if (this.guidPSExt != other.guidPSExt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hwnd.hashCode()
        result = 31 * result + this.szFileName.hashCode()
        result = 31 * result + this.ulFlags.hashCode()
        result = 31 * result + this.guidPSExt.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hwnd: Hwnd = MutPtr(0L),
            szFileName: Pstr = MutPtr(0L),
            ulFlags: UInt = 0u,
            guidPSExt: Guid = Guid(),
        ): WabParam =
            WabParam(
                cbSize = cbSize,
                hwndCtorArg = hwnd,
                szFileNameCtorArg = szFileName,
                ulFlags = ulFlags,
                guidPSExt = guidPSExt,
            )
    }
}

public class Upv internal constructor(
    public var i: Short,
    public var l: Int,
    public var ul: UInt,
    public var flt: Float,
    public var dbl: Double,
    public var b: UShort,
    public var cur: CY,
    public var at: Double,
    public var ft: Filetime,
    lpszACtorArg: Pstr,
    public var bin: SBinary,
    lpszWCtorArg: Pwstr,
    lpguidCtorArg: MutPtr,
    public var li: Long,
    public var mVi: SShortArray,
    public var mVl: SLongArray,
    public var mVflt: SRealArray,
    public var mVdbl: SDoubleArray,
    public var mVcur: SCurrencyArray,
    public var mVat: SAppTimeArray,
    public var mVft: SDateTimeArray,
    public var mVbin: SBinaryArray,
    public var mVszA: SLPSTRArray,
    public var mVszW: SWStringArray,
    public var mVguid: SGuidArray,
    public var mVli: SLargeIntegerArray,
    public var err: Int,
    public var x: Int,
) {
    public var lpszA: Pstr = lpszACtorArg
        internal set

    public var lpszW: Pwstr = lpszWCtorArg
        internal set

    public var lpguid: MutPtr = lpguidCtorArg
        internal set

    public constructor() : this(
        i = 0,
        l = 0,
        ul = 0u,
        flt = 0.0f,
        dbl = 0.0,
        b = 0u,
        cur = CY(),
        at = 0.0,
        ft = Filetime(),
        lpszACtorArg = MutPtr(0L),
        bin = SBinary(),
        lpszWCtorArg = MutPtr(0L),
        lpguidCtorArg = MutPtr(0L),
        li = 0L,
        mVi = SShortArray(),
        mVl = SLongArray(),
        mVflt = SRealArray(),
        mVdbl = SDoubleArray(),
        mVcur = SCurrencyArray(),
        mVat = SAppTimeArray(),
        mVft = SDateTimeArray(),
        mVbin = SBinaryArray(),
        mVszA = SLPSTRArray(),
        mVszW = SWStringArray(),
        mVguid = SGuidArray(),
        mVli = SLargeIntegerArray(),
        err = 0,
        x = 0,
    )

    public companion object {
        public operator fun invoke(
            i: Short = 0,
            l: Int = 0,
            ul: UInt = 0u,
            flt: Float = 0.0f,
            dbl: Double = 0.0,
            b: UShort = 0u,
            cur: CY = CY(),
            at: Double = 0.0,
            ft: Filetime = Filetime(),
            lpszA: Pstr = MutPtr(0L),
            bin: SBinary = SBinary(),
            lpszW: Pwstr = MutPtr(0L),
            lpguid: MutPtr = MutPtr(0L),
            li: Long = 0L,
            mVi: SShortArray = SShortArray(),
            mVl: SLongArray = SLongArray(),
            mVflt: SRealArray = SRealArray(),
            mVdbl: SDoubleArray = SDoubleArray(),
            mVcur: SCurrencyArray = SCurrencyArray(),
            mVat: SAppTimeArray = SAppTimeArray(),
            mVft: SDateTimeArray = SDateTimeArray(),
            mVbin: SBinaryArray = SBinaryArray(),
            mVszA: SLPSTRArray = SLPSTRArray(),
            mVszW: SWStringArray = SWStringArray(),
            mVguid: SGuidArray = SGuidArray(),
            mVli: SLargeIntegerArray = SLargeIntegerArray(),
            err: Int = 0,
            x: Int = 0,
        ): Upv =
            Upv(
                i = i,
                l = l,
                ul = ul,
                flt = flt,
                dbl = dbl,
                b = b,
                cur = cur,
                at = at,
                ft = ft,
                lpszACtorArg = lpszA,
                bin = bin,
                lpszWCtorArg = lpszW,
                lpguidCtorArg = lpguid,
                li = li,
                mVi = mVi,
                mVl = mVl,
                mVflt = mVflt,
                mVdbl = mVdbl,
                mVcur = mVcur,
                mVat = mVat,
                mVft = mVft,
                mVbin = mVbin,
                mVszA = mVszA,
                mVszW = mVszW,
                mVguid = mVguid,
                mVli = mVli,
                err = err,
                x = x,
            )
    }
}
