@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.authorization

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.security.AceFlags
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectTypeList
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.security.SystemAuditObjectAceFlags

public class ActrlAccessa internal constructor(
    public var cEntries: UInt,
    pPropertyAccessListCtorArg: MutPtr<ActrlPropertyEntrya>,
) {
    public var pPropertyAccessList: MutPtr<ActrlPropertyEntrya> = pPropertyAccessListCtorArg
        internal set

    public constructor() : this(
        cEntries = 0u,
        pPropertyAccessListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cEntries

    public operator fun component2(): MutPtr<ActrlPropertyEntrya> = this.pPropertyAccessList

    public fun copy(cEntries: UInt = this.cEntries, pPropertyAccessList: MutPtr<ActrlPropertyEntrya> = this.pPropertyAccessList): ActrlAccessa = ActrlAccessa(cEntries = cEntries, pPropertyAccessListCtorArg = pPropertyAccessList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActrlAccessa) return false
        if (this.cEntries != other.cEntries) return false
        if (this.pPropertyAccessList != other.pPropertyAccessList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cEntries.hashCode()
        result = 31 * result + this.pPropertyAccessList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActrlAccessa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActrlAccessa> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ActrlAccessa =
                    ActrlAccessa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ActrlPropertyEntrya>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ActrlAccessa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ActrlPropertyEntrya>(64)
                    ).writeNative(addr + 8L, value.pPropertyAccessList)
                }
            }

        public operator fun invoke(
            cEntries: UInt = 0u,
            pPropertyAccessList: MutPtr<ActrlPropertyEntrya> = MutPtr(0L),
        ): ActrlAccessa =
            ActrlAccessa(
                cEntries = cEntries,
                pPropertyAccessListCtorArg = pPropertyAccessList,
            )
    }
}

public class ActrlAccessw internal constructor(
    public var cEntries: UInt,
    pPropertyAccessListCtorArg: MutPtr<ActrlPropertyEntryw>,
) {
    public var pPropertyAccessList: MutPtr<ActrlPropertyEntryw> = pPropertyAccessListCtorArg
        internal set

    public constructor() : this(
        cEntries = 0u,
        pPropertyAccessListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cEntries

    public operator fun component2(): MutPtr<ActrlPropertyEntryw> = this.pPropertyAccessList

    public fun copy(cEntries: UInt = this.cEntries, pPropertyAccessList: MutPtr<ActrlPropertyEntryw> = this.pPropertyAccessList): ActrlAccessw = ActrlAccessw(cEntries = cEntries, pPropertyAccessListCtorArg = pPropertyAccessList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActrlAccessw) return false
        if (this.cEntries != other.cEntries) return false
        if (this.pPropertyAccessList != other.pPropertyAccessList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cEntries.hashCode()
        result = 31 * result + this.pPropertyAccessList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActrlAccessw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActrlAccessw> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ActrlAccessw =
                    ActrlAccessw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ActrlPropertyEntryw>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ActrlAccessw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ActrlPropertyEntryw>(64)
                    ).writeNative(addr + 8L, value.pPropertyAccessList)
                }
            }

        public operator fun invoke(
            cEntries: UInt = 0u,
            pPropertyAccessList: MutPtr<ActrlPropertyEntryw> = MutPtr(0L),
        ): ActrlAccessw =
            ActrlAccessw(
                cEntries = cEntries,
                pPropertyAccessListCtorArg = pPropertyAccessList,
            )
    }
}

public class ActrlAccessEntrya internal constructor(
    public var trustee: TrusteeA,
    public var fAccessFlags: ActrlAccessEntryAccessFlags,
    public var access: UInt,
    public var provSpecificAccess: UInt,
    public var inheritance: AceFlags,
    lpInheritPropertyCtorArg: Pstr,
) {
    public var lpInheritProperty: Pstr = lpInheritPropertyCtorArg
        internal set

    public constructor() : this(
        trustee = TrusteeA(),
        fAccessFlags = 0u,
        access = 0u,
        provSpecificAccess = 0u,
        inheritance = 0u,
        lpInheritPropertyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): TrusteeA = this.trustee

    public operator fun component2(): ActrlAccessEntryAccessFlags = this.fAccessFlags

    public operator fun component3(): UInt = this.access

    public operator fun component4(): UInt = this.provSpecificAccess

    public operator fun component5(): AceFlags = this.inheritance

    public operator fun component6(): Pstr = this.lpInheritProperty

    public fun copy(trustee: TrusteeA = this.trustee, fAccessFlags: ActrlAccessEntryAccessFlags = this.fAccessFlags, access: UInt = this.access, provSpecificAccess: UInt = this.provSpecificAccess, inheritance: AceFlags = this.inheritance, lpInheritProperty: Pstr = this.lpInheritProperty): ActrlAccessEntrya = ActrlAccessEntrya(trustee = trustee, fAccessFlags = fAccessFlags, access = access, provSpecificAccess = provSpecificAccess, inheritance = inheritance, lpInheritPropertyCtorArg = lpInheritProperty)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActrlAccessEntrya) return false
        if (this.trustee != other.trustee) return false
        if (this.fAccessFlags != other.fAccessFlags) return false
        if (this.access != other.access) return false
        if (this.provSpecificAccess != other.provSpecificAccess) return false
        if (this.inheritance != other.inheritance) return false
        if (this.lpInheritProperty != other.lpInheritProperty) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.trustee.hashCode()
        result = 31 * result + this.fAccessFlags.hashCode()
        result = 31 * result + this.access.hashCode()
        result = 31 * result + this.provSpecificAccess.hashCode()
        result = 31 * result + this.inheritance.hashCode()
        result = 31 * result + this.lpInheritProperty.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            trustee: TrusteeA = TrusteeA(),
            fAccessFlags: ActrlAccessEntryAccessFlags = 0u,
            access: UInt = 0u,
            provSpecificAccess: UInt = 0u,
            inheritance: AceFlags = 0u,
            lpInheritProperty: Pstr = MutPtr(0L),
        ): ActrlAccessEntrya =
            ActrlAccessEntrya(
                trustee = trustee,
                fAccessFlags = fAccessFlags,
                access = access,
                provSpecificAccess = provSpecificAccess,
                inheritance = inheritance,
                lpInheritPropertyCtorArg = lpInheritProperty,
            )
    }
}

public class ActrlAccessEntryw internal constructor(
    public var trustee: TrusteeW,
    public var fAccessFlags: ActrlAccessEntryAccessFlags,
    public var access: UInt,
    public var provSpecificAccess: UInt,
    public var inheritance: AceFlags,
    lpInheritPropertyCtorArg: Pwstr,
) {
    public var lpInheritProperty: Pwstr = lpInheritPropertyCtorArg
        internal set

    public constructor() : this(
        trustee = TrusteeW(),
        fAccessFlags = 0u,
        access = 0u,
        provSpecificAccess = 0u,
        inheritance = 0u,
        lpInheritPropertyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): TrusteeW = this.trustee

    public operator fun component2(): ActrlAccessEntryAccessFlags = this.fAccessFlags

    public operator fun component3(): UInt = this.access

    public operator fun component4(): UInt = this.provSpecificAccess

    public operator fun component5(): AceFlags = this.inheritance

    public operator fun component6(): Pwstr = this.lpInheritProperty

    public fun copy(trustee: TrusteeW = this.trustee, fAccessFlags: ActrlAccessEntryAccessFlags = this.fAccessFlags, access: UInt = this.access, provSpecificAccess: UInt = this.provSpecificAccess, inheritance: AceFlags = this.inheritance, lpInheritProperty: Pwstr = this.lpInheritProperty): ActrlAccessEntryw = ActrlAccessEntryw(trustee = trustee, fAccessFlags = fAccessFlags, access = access, provSpecificAccess = provSpecificAccess, inheritance = inheritance, lpInheritPropertyCtorArg = lpInheritProperty)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActrlAccessEntryw) return false
        if (this.trustee != other.trustee) return false
        if (this.fAccessFlags != other.fAccessFlags) return false
        if (this.access != other.access) return false
        if (this.provSpecificAccess != other.provSpecificAccess) return false
        if (this.inheritance != other.inheritance) return false
        if (this.lpInheritProperty != other.lpInheritProperty) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.trustee.hashCode()
        result = 31 * result + this.fAccessFlags.hashCode()
        result = 31 * result + this.access.hashCode()
        result = 31 * result + this.provSpecificAccess.hashCode()
        result = 31 * result + this.inheritance.hashCode()
        result = 31 * result + this.lpInheritProperty.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            trustee: TrusteeW = TrusteeW(),
            fAccessFlags: ActrlAccessEntryAccessFlags = 0u,
            access: UInt = 0u,
            provSpecificAccess: UInt = 0u,
            inheritance: AceFlags = 0u,
            lpInheritProperty: Pwstr = MutPtr(0L),
        ): ActrlAccessEntryw =
            ActrlAccessEntryw(
                trustee = trustee,
                fAccessFlags = fAccessFlags,
                access = access,
                provSpecificAccess = provSpecificAccess,
                inheritance = inheritance,
                lpInheritPropertyCtorArg = lpInheritProperty,
            )
    }
}

public class ActrlAccessEntryLista internal constructor(
    public var cEntries: UInt,
    pAccessListCtorArg: MutPtr<ActrlAccessEntrya>,
) {
    public var pAccessList: MutPtr<ActrlAccessEntrya> = pAccessListCtorArg
        internal set

    public constructor() : this(
        cEntries = 0u,
        pAccessListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cEntries

    public operator fun component2(): MutPtr<ActrlAccessEntrya> = this.pAccessList

    public fun copy(cEntries: UInt = this.cEntries, pAccessList: MutPtr<ActrlAccessEntrya> = this.pAccessList): ActrlAccessEntryLista = ActrlAccessEntryLista(cEntries = cEntries, pAccessListCtorArg = pAccessList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActrlAccessEntryLista) return false
        if (this.cEntries != other.cEntries) return false
        if (this.pAccessList != other.pAccessList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cEntries.hashCode()
        result = 31 * result + this.pAccessList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActrlAccessEntryLista> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActrlAccessEntryLista> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ActrlAccessEntryLista =
                    ActrlAccessEntryLista(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ActrlAccessEntrya>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ActrlAccessEntryLista) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ActrlAccessEntrya>(64)
                    ).writeNative(addr + 8L, value.pAccessList)
                }
            }

        public operator fun invoke(
            cEntries: UInt = 0u,
            pAccessList: MutPtr<ActrlAccessEntrya> = MutPtr(0L),
        ): ActrlAccessEntryLista =
            ActrlAccessEntryLista(
                cEntries = cEntries,
                pAccessListCtorArg = pAccessList,
            )
    }
}

public class ActrlAccessEntryListw internal constructor(
    public var cEntries: UInt,
    pAccessListCtorArg: MutPtr<ActrlAccessEntryw>,
) {
    public var pAccessList: MutPtr<ActrlAccessEntryw> = pAccessListCtorArg
        internal set

    public constructor() : this(
        cEntries = 0u,
        pAccessListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cEntries

    public operator fun component2(): MutPtr<ActrlAccessEntryw> = this.pAccessList

    public fun copy(cEntries: UInt = this.cEntries, pAccessList: MutPtr<ActrlAccessEntryw> = this.pAccessList): ActrlAccessEntryListw = ActrlAccessEntryListw(cEntries = cEntries, pAccessListCtorArg = pAccessList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActrlAccessEntryListw) return false
        if (this.cEntries != other.cEntries) return false
        if (this.pAccessList != other.pAccessList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cEntries.hashCode()
        result = 31 * result + this.pAccessList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActrlAccessEntryListw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ActrlAccessEntryListw> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ActrlAccessEntryListw =
                    ActrlAccessEntryListw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ActrlAccessEntryw>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ActrlAccessEntryListw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ActrlAccessEntryw>(64)
                    ).writeNative(addr + 8L, value.pAccessList)
                }
            }

        public operator fun invoke(
            cEntries: UInt = 0u,
            pAccessList: MutPtr<ActrlAccessEntryw> = MutPtr(0L),
        ): ActrlAccessEntryListw =
            ActrlAccessEntryListw(
                cEntries = cEntries,
                pAccessListCtorArg = pAccessList,
            )
    }
}

public class ActrlAccessInfoa internal constructor(
    public var fAccessPermission: UInt,
    lpAccessPermissionNameCtorArg: Pstr,
) {
    public var lpAccessPermissionName: Pstr = lpAccessPermissionNameCtorArg
        internal set

    public constructor() : this(
        fAccessPermission = 0u,
        lpAccessPermissionNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.fAccessPermission

    public operator fun component2(): Pstr = this.lpAccessPermissionName

    public fun copy(fAccessPermission: UInt = this.fAccessPermission, lpAccessPermissionName: Pstr = this.lpAccessPermissionName): ActrlAccessInfoa = ActrlAccessInfoa(fAccessPermission = fAccessPermission, lpAccessPermissionNameCtorArg = lpAccessPermissionName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActrlAccessInfoa) return false
        if (this.fAccessPermission != other.fAccessPermission) return false
        if (this.lpAccessPermissionName != other.lpAccessPermissionName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fAccessPermission.hashCode()
        result = 31 * result + this.lpAccessPermissionName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fAccessPermission: UInt = 0u,
            lpAccessPermissionName: Pstr = MutPtr(0L),
        ): ActrlAccessInfoa =
            ActrlAccessInfoa(
                fAccessPermission = fAccessPermission,
                lpAccessPermissionNameCtorArg = lpAccessPermissionName,
            )
    }
}

public class ActrlAccessInfow internal constructor(
    public var fAccessPermission: UInt,
    lpAccessPermissionNameCtorArg: Pwstr,
) {
    public var lpAccessPermissionName: Pwstr = lpAccessPermissionNameCtorArg
        internal set

    public constructor() : this(
        fAccessPermission = 0u,
        lpAccessPermissionNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.fAccessPermission

    public operator fun component2(): Pwstr = this.lpAccessPermissionName

    public fun copy(fAccessPermission: UInt = this.fAccessPermission, lpAccessPermissionName: Pwstr = this.lpAccessPermissionName): ActrlAccessInfow = ActrlAccessInfow(fAccessPermission = fAccessPermission, lpAccessPermissionNameCtorArg = lpAccessPermissionName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActrlAccessInfow) return false
        if (this.fAccessPermission != other.fAccessPermission) return false
        if (this.lpAccessPermissionName != other.lpAccessPermissionName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fAccessPermission.hashCode()
        result = 31 * result + this.lpAccessPermissionName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fAccessPermission: UInt = 0u,
            lpAccessPermissionName: Pwstr = MutPtr(0L),
        ): ActrlAccessInfow =
            ActrlAccessInfow(
                fAccessPermission = fAccessPermission,
                lpAccessPermissionNameCtorArg = lpAccessPermissionName,
            )
    }
}

public class ActrlControlInfoa internal constructor(
    lpControlIdCtorArg: Pstr,
    lpControlNameCtorArg: Pstr,
) {
    public var lpControlId: Pstr = lpControlIdCtorArg
        internal set

    public var lpControlName: Pstr = lpControlNameCtorArg
        internal set

    public constructor() : this(
        lpControlIdCtorArg = MutPtr(0L),
        lpControlNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.lpControlId

    public operator fun component2(): Pstr = this.lpControlName

    public fun copy(lpControlId: Pstr = this.lpControlId, lpControlName: Pstr = this.lpControlName): ActrlControlInfoa = ActrlControlInfoa(lpControlIdCtorArg = lpControlId, lpControlNameCtorArg = lpControlName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActrlControlInfoa) return false
        if (this.lpControlId != other.lpControlId) return false
        if (this.lpControlName != other.lpControlName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpControlId.hashCode()
        result = 31 * result + this.lpControlName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpControlId: Pstr = MutPtr(0L),
            lpControlName: Pstr = MutPtr(0L),
        ): ActrlControlInfoa =
            ActrlControlInfoa(
                lpControlIdCtorArg = lpControlId,
                lpControlNameCtorArg = lpControlName,
            )
    }
}

public class ActrlControlInfow internal constructor(
    lpControlIdCtorArg: Pwstr,
    lpControlNameCtorArg: Pwstr,
) {
    public var lpControlId: Pwstr = lpControlIdCtorArg
        internal set

    public var lpControlName: Pwstr = lpControlNameCtorArg
        internal set

    public constructor() : this(
        lpControlIdCtorArg = MutPtr(0L),
        lpControlNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.lpControlId

    public operator fun component2(): Pwstr = this.lpControlName

    public fun copy(lpControlId: Pwstr = this.lpControlId, lpControlName: Pwstr = this.lpControlName): ActrlControlInfow = ActrlControlInfow(lpControlIdCtorArg = lpControlId, lpControlNameCtorArg = lpControlName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActrlControlInfow) return false
        if (this.lpControlId != other.lpControlId) return false
        if (this.lpControlName != other.lpControlName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpControlId.hashCode()
        result = 31 * result + this.lpControlName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpControlId: Pwstr = MutPtr(0L),
            lpControlName: Pwstr = MutPtr(0L),
        ): ActrlControlInfow =
            ActrlControlInfow(
                lpControlIdCtorArg = lpControlId,
                lpControlNameCtorArg = lpControlName,
            )
    }
}

public class ActrlOverlapped internal constructor(
    public var anonymous: ActrlOverlapped0,
    public var reserved2: UInt,
    hEventCtorArg: Handle,
) {
    public var hEvent: Handle = hEventCtorArg
        internal set

    public constructor() : this(
        anonymous = ActrlOverlapped0(),
        reserved2 = 0u,
        hEventCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ActrlOverlapped0 = this.anonymous

    public operator fun component2(): UInt = this.reserved2

    public operator fun component3(): Handle = this.hEvent

    public fun copy(anonymous: ActrlOverlapped0 = this.anonymous, reserved2: UInt = this.reserved2, hEvent: Handle = this.hEvent): ActrlOverlapped = ActrlOverlapped(anonymous = anonymous, reserved2 = reserved2, hEventCtorArg = hEvent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActrlOverlapped) return false
        if (this.anonymous != other.anonymous) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.hEvent != other.hEvent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.hEvent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: ActrlOverlapped0 = ActrlOverlapped0(),
            reserved2: UInt = 0u,
            hEvent: Handle = MutPtr(0L),
        ): ActrlOverlapped =
            ActrlOverlapped(
                anonymous = anonymous,
                reserved2 = reserved2,
                hEventCtorArg = hEvent,
            )
    }
}

public class ActrlOverlapped0 internal constructor(
    providerCtorArg: MutPtr<CVoid>,
    public var reserved1: UInt,
) {
    public var provider: MutPtr<CVoid> = providerCtorArg
        internal set

    public constructor() : this(
        providerCtorArg = MutPtr(0L),
        reserved1 = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.provider

    public operator fun component2(): UInt = this.reserved1

    public fun copy(provider: MutPtr<CVoid> = this.provider, reserved1: UInt = this.reserved1): ActrlOverlapped0 = ActrlOverlapped0(providerCtorArg = provider, reserved1 = reserved1)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActrlOverlapped0) return false
        if (this.provider != other.provider) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.provider.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            provider: MutPtr<CVoid> = MutPtr(0L),
            reserved1: UInt = 0u,
        ): ActrlOverlapped0 =
            ActrlOverlapped0(
                providerCtorArg = provider,
                reserved1 = reserved1,
            )
    }
}

public class ActrlPropertyEntrya internal constructor(
    lpPropertyCtorArg: Pstr,
    pAccessEntryListCtorArg: MutPtr<ActrlAccessEntryLista>,
    public var fListFlags: UInt,
) {
    public var lpProperty: Pstr = lpPropertyCtorArg
        internal set

    public var pAccessEntryList: MutPtr<ActrlAccessEntryLista> = pAccessEntryListCtorArg
        internal set

    public constructor() : this(
        lpPropertyCtorArg = MutPtr(0L),
        pAccessEntryListCtorArg = MutPtr(0L),
        fListFlags = 0u,
    )

    public operator fun component1(): Pstr = this.lpProperty

    public operator fun component2(): MutPtr<ActrlAccessEntryLista> = this.pAccessEntryList

    public operator fun component3(): UInt = this.fListFlags

    public fun copy(lpProperty: Pstr = this.lpProperty, pAccessEntryList: MutPtr<ActrlAccessEntryLista> = this.pAccessEntryList, fListFlags: UInt = this.fListFlags): ActrlPropertyEntrya = ActrlPropertyEntrya(lpPropertyCtorArg = lpProperty, pAccessEntryListCtorArg = pAccessEntryList, fListFlags = fListFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActrlPropertyEntrya) return false
        if (this.lpProperty != other.lpProperty) return false
        if (this.pAccessEntryList != other.pAccessEntryList) return false
        if (this.fListFlags != other.fListFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpProperty.hashCode()
        result = 31 * result + this.pAccessEntryList.hashCode()
        result = 31 * result + this.fListFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpProperty: Pstr = MutPtr(0L),
            pAccessEntryList: MutPtr<ActrlAccessEntryLista> = MutPtr(0L),
            fListFlags: UInt = 0u,
        ): ActrlPropertyEntrya =
            ActrlPropertyEntrya(
                lpPropertyCtorArg = lpProperty,
                pAccessEntryListCtorArg = pAccessEntryList,
                fListFlags = fListFlags,
            )
    }
}

public class ActrlPropertyEntryw internal constructor(
    lpPropertyCtorArg: Pwstr,
    pAccessEntryListCtorArg: MutPtr<ActrlAccessEntryListw>,
    public var fListFlags: UInt,
) {
    public var lpProperty: Pwstr = lpPropertyCtorArg
        internal set

    public var pAccessEntryList: MutPtr<ActrlAccessEntryListw> = pAccessEntryListCtorArg
        internal set

    public constructor() : this(
        lpPropertyCtorArg = MutPtr(0L),
        pAccessEntryListCtorArg = MutPtr(0L),
        fListFlags = 0u,
    )

    public operator fun component1(): Pwstr = this.lpProperty

    public operator fun component2(): MutPtr<ActrlAccessEntryListw> = this.pAccessEntryList

    public operator fun component3(): UInt = this.fListFlags

    public fun copy(lpProperty: Pwstr = this.lpProperty, pAccessEntryList: MutPtr<ActrlAccessEntryListw> = this.pAccessEntryList, fListFlags: UInt = this.fListFlags): ActrlPropertyEntryw = ActrlPropertyEntryw(lpPropertyCtorArg = lpProperty, pAccessEntryListCtorArg = pAccessEntryList, fListFlags = fListFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActrlPropertyEntryw) return false
        if (this.lpProperty != other.lpProperty) return false
        if (this.pAccessEntryList != other.pAccessEntryList) return false
        if (this.fListFlags != other.fListFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpProperty.hashCode()
        result = 31 * result + this.pAccessEntryList.hashCode()
        result = 31 * result + this.fListFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpProperty: Pwstr = MutPtr(0L),
            pAccessEntryList: MutPtr<ActrlAccessEntryListw> = MutPtr(0L),
            fListFlags: UInt = 0u,
        ): ActrlPropertyEntryw =
            ActrlPropertyEntryw(
                lpPropertyCtorArg = lpProperty,
                pAccessEntryListCtorArg = pAccessEntryList,
                fListFlags = fListFlags,
            )
    }
}

public data class AuditIpAddress(
    public var pIpAddress: UByteArray = UByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuditIpAddress) return false
        if (!this.pIpAddress.contentEquals(other.pIpAddress)) return false
        return true
    }

    override fun hashCode(): Int = this.pIpAddress.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuditIpAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuditIpAddress> {
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): AuditIpAddress =
                    AuditIpAddress(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: AuditIpAddress) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr, value.pIpAddress)
                }
            }
    }
}

public data class AuditObjectType(
    public var objectType: Guid = Guid(),
    public var flags: UShort = 0u,
    public var level: UShort = 0u,
    public var accessMask: UInt = 0u,
)

public class AuditObjectTypes internal constructor(
    public var count: UShort,
    public var flags: UShort,
    pObjectTypesCtorArg: MutPtr<AuditObjectType>,
) {
    public var pObjectTypes: MutPtr<AuditObjectType> = pObjectTypesCtorArg
        internal set

    public constructor() : this(
        count = 0u,
        flags = 0u,
        pObjectTypesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.count

    public operator fun component2(): UShort = this.flags

    public operator fun component3(): MutPtr<AuditObjectType> = this.pObjectTypes

    public fun copy(count: UShort = this.count, flags: UShort = this.flags, pObjectTypes: MutPtr<AuditObjectType> = this.pObjectTypes): AuditObjectTypes = AuditObjectTypes(count = count, flags = flags, pObjectTypesCtorArg = pObjectTypes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuditObjectTypes) return false
        if (this.count != other.count) return false
        if (this.flags != other.flags) return false
        if (this.pObjectTypes != other.pObjectTypes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pObjectTypes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuditObjectTypes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuditObjectTypes> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): AuditObjectTypes =
                    AuditObjectTypes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<AuditObjectType>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AuditObjectTypes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.count)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<AuditObjectType>(64)
                    ).writeNative(addr + 8L, value.pObjectTypes)
                }
            }

        public operator fun invoke(
            count: UShort = 0u,
            flags: UShort = 0u,
            pObjectTypes: MutPtr<AuditObjectType> = MutPtr(0L),
        ): AuditObjectTypes =
            AuditObjectTypes(
                count = count,
                flags = flags,
                pObjectTypesCtorArg = pObjectTypes,
            )
    }
}

public data class AuditParam(
    public var type: AuditParamType = 0,
    public var length: UInt = 0u,
    public var flags: UInt = 0u,
    public var anonymous1: AuditParam0 = AuditParam0(),
    public var anonymous2: AuditParam1 = AuditParam1(),
)

public class AuditParam0 internal constructor(
    public var data0: Int,
    stringCtorArg: Pwstr,
    public var u: Int,
    psidCtorArg: MutPtr<Sid>,
    pguidCtorArg: MutPtr<Guid>,
    public var logonIdLowPart: UInt,
    pObjectTypesCtorArg: MutPtr<AuditObjectTypes>,
    pIpAddressCtorArg: MutPtr<AuditIpAddress>,
) {
    public var string: Pwstr = stringCtorArg
        internal set

    public var psid: MutPtr<Sid> = psidCtorArg
        internal set

    public var pguid: MutPtr<Guid> = pguidCtorArg
        internal set

    public var pObjectTypes: MutPtr<AuditObjectTypes> = pObjectTypesCtorArg
        internal set

    public var pIpAddress: MutPtr<AuditIpAddress> = pIpAddressCtorArg
        internal set

    public constructor() : this(
        data0 = 0,
        stringCtorArg = MutPtr(0L),
        u = 0,
        psidCtorArg = MutPtr(0L),
        pguidCtorArg = MutPtr(0L),
        logonIdLowPart = 0u,
        pObjectTypesCtorArg = MutPtr(0L),
        pIpAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.data0

    public operator fun component2(): Pwstr = this.string

    public operator fun component3(): Int = this.u

    public operator fun component4(): MutPtr<Sid> = this.psid

    public operator fun component5(): MutPtr<Guid> = this.pguid

    public operator fun component6(): UInt = this.logonIdLowPart

    public operator fun component7(): MutPtr<AuditObjectTypes> = this.pObjectTypes

    public operator fun component8(): MutPtr<AuditIpAddress> = this.pIpAddress

    public fun copy(data0: Int = this.data0, string: Pwstr = this.string, u: Int = this.u, psid: MutPtr<Sid> = this.psid, pguid: MutPtr<Guid> = this.pguid, logonIdLowPart: UInt = this.logonIdLowPart, pObjectTypes: MutPtr<AuditObjectTypes> = this.pObjectTypes, pIpAddress: MutPtr<AuditIpAddress> = this.pIpAddress): AuditParam0 = AuditParam0(data0 = data0, stringCtorArg = string, u = u, psidCtorArg = psid, pguidCtorArg = pguid, logonIdLowPart = logonIdLowPart, pObjectTypesCtorArg = pObjectTypes, pIpAddressCtorArg = pIpAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuditParam0) return false
        if (this.data0 != other.data0) return false
        if (this.string != other.string) return false
        if (this.u != other.u) return false
        if (this.psid != other.psid) return false
        if (this.pguid != other.pguid) return false
        if (this.logonIdLowPart != other.logonIdLowPart) return false
        if (this.pObjectTypes != other.pObjectTypes) return false
        if (this.pIpAddress != other.pIpAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data0.hashCode()
        result = 31 * result + this.string.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.psid.hashCode()
        result = 31 * result + this.pguid.hashCode()
        result = 31 * result + this.logonIdLowPart.hashCode()
        result = 31 * result + this.pObjectTypes.hashCode()
        result = 31 * result + this.pIpAddress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            data0: Int = 0,
            string: Pwstr = MutPtr(0L),
            u: Int = 0,
            psid: MutPtr<Sid> = MutPtr(0L),
            pguid: MutPtr<Guid> = MutPtr(0L),
            logonIdLowPart: UInt = 0u,
            pObjectTypes: MutPtr<AuditObjectTypes> = MutPtr(0L),
            pIpAddress: MutPtr<AuditIpAddress> = MutPtr(0L),
        ): AuditParam0 =
            AuditParam0(
                data0 = data0,
                stringCtorArg = string,
                u = u,
                psidCtorArg = psid,
                pguidCtorArg = pguid,
                logonIdLowPart = logonIdLowPart,
                pObjectTypesCtorArg = pObjectTypes,
                pIpAddressCtorArg = pIpAddress,
            )
    }
}

public data class AuditParam1(
    public var data1: Int = 0,
    public var logonIdHighPart: Int = 0,
)

public class AuditParams internal constructor(
    public var length: UInt,
    public var flags: UInt,
    public var count: UShort,
    parametersCtorArg: MutPtr<AuditParam>,
) {
    public var parameters: MutPtr<AuditParam> = parametersCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        flags = 0u,
        count = 0u,
        parametersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.length

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): UShort = this.count

    public operator fun component4(): MutPtr<AuditParam> = this.parameters

    public fun copy(length: UInt = this.length, flags: UInt = this.flags, count: UShort = this.count, parameters: MutPtr<AuditParam> = this.parameters): AuditParams = AuditParams(length = length, flags = flags, count = count, parametersCtorArg = parameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuditParams) return false
        if (this.length != other.length) return false
        if (this.flags != other.flags) return false
        if (this.count != other.count) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuditParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuditParams> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): AuditParams =
                    AuditParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<AuditParam>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: AuditParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<AuditParam>(64)
                    ).writeNative(addr + 16L, value.parameters)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            flags: UInt = 0u,
            count: UShort = 0u,
            parameters: MutPtr<AuditParam> = MutPtr(0L),
        ): AuditParams =
            AuditParams(
                length = length,
                flags = flags,
                count = count,
                parametersCtorArg = parameters,
            )
    }
}

public class AuthzAccessReply internal constructor(
    public var resultListLength: UInt,
    grantedAccessMaskCtorArg: MutPtr<UInt>,
    saclEvaluationResultsCtorArg: MutPtr<AuthzGenerateResults>,
    errorCtorArg: MutPtr<UInt>,
) {
    public var grantedAccessMask: MutPtr<UInt> = grantedAccessMaskCtorArg
        internal set

    public var saclEvaluationResults: MutPtr<AuthzGenerateResults> = saclEvaluationResultsCtorArg
        internal set

    public var error: MutPtr<UInt> = errorCtorArg
        internal set

    public constructor() : this(
        resultListLength = 0u,
        grantedAccessMaskCtorArg = MutPtr(0L),
        saclEvaluationResultsCtorArg = MutPtr(0L),
        errorCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.resultListLength

    public operator fun component2(): MutPtr<UInt> = this.grantedAccessMask

    public operator fun component3(): MutPtr<AuthzGenerateResults> = this.saclEvaluationResults

    public operator fun component4(): MutPtr<UInt> = this.error

    public fun copy(resultListLength: UInt = this.resultListLength, grantedAccessMask: MutPtr<UInt> = this.grantedAccessMask, saclEvaluationResults: MutPtr<AuthzGenerateResults> = this.saclEvaluationResults, error: MutPtr<UInt> = this.error): AuthzAccessReply = AuthzAccessReply(resultListLength = resultListLength, grantedAccessMaskCtorArg = grantedAccessMask, saclEvaluationResultsCtorArg = saclEvaluationResults, errorCtorArg = error)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthzAccessReply) return false
        if (this.resultListLength != other.resultListLength) return false
        if (this.grantedAccessMask != other.grantedAccessMask) return false
        if (this.saclEvaluationResults != other.saclEvaluationResults) return false
        if (this.error != other.error) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.resultListLength.hashCode()
        result = 31 * result + this.grantedAccessMask.hashCode()
        result = 31 * result + this.saclEvaluationResults.hashCode()
        result = 31 * result + this.error.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuthzAccessReply> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuthzAccessReply> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): AuthzAccessReply =
                    AuthzAccessReply(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<AuthzGenerateResults>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: AuthzAccessReply) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.resultListLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.grantedAccessMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<AuthzGenerateResults>(64)
                    ).writeNative(addr + 16L, value.saclEvaluationResults)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 24L, value.error)
                }
            }

        public operator fun invoke(
            resultListLength: UInt = 0u,
            grantedAccessMask: MutPtr<UInt> = MutPtr(0L),
            saclEvaluationResults: MutPtr<AuthzGenerateResults> = MutPtr(0L),
            error: MutPtr<UInt> = MutPtr(0L),
        ): AuthzAccessReply =
            AuthzAccessReply(
                resultListLength = resultListLength,
                grantedAccessMaskCtorArg = grantedAccessMask,
                saclEvaluationResultsCtorArg = saclEvaluationResults,
                errorCtorArg = error,
            )
    }
}

public class AuthzAccessRequest internal constructor(
    public var desiredAccess: UInt,
    principalSelfSidCtorArg: Psid,
    objectTypeListCtorArg: MutPtr<ObjectTypeList>,
    public var objectTypeListLength: UInt,
    optionalArgumentsCtorArg: MutPtr<CVoid>,
) {
    public var principalSelfSid: Psid = principalSelfSidCtorArg
        internal set

    public var objectTypeList: MutPtr<ObjectTypeList> = objectTypeListCtorArg
        internal set

    public var optionalArguments: MutPtr<CVoid> = optionalArgumentsCtorArg
        internal set

    public constructor() : this(
        desiredAccess = 0u,
        principalSelfSidCtorArg = MutPtr(0L),
        objectTypeListCtorArg = MutPtr(0L),
        objectTypeListLength = 0u,
        optionalArgumentsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.desiredAccess

    public operator fun component2(): Psid = this.principalSelfSid

    public operator fun component3(): MutPtr<ObjectTypeList> = this.objectTypeList

    public operator fun component4(): UInt = this.objectTypeListLength

    public operator fun component5(): MutPtr<CVoid> = this.optionalArguments

    public fun copy(desiredAccess: UInt = this.desiredAccess, principalSelfSid: Psid = this.principalSelfSid, objectTypeList: MutPtr<ObjectTypeList> = this.objectTypeList, objectTypeListLength: UInt = this.objectTypeListLength, optionalArguments: MutPtr<CVoid> = this.optionalArguments): AuthzAccessRequest = AuthzAccessRequest(desiredAccess = desiredAccess, principalSelfSidCtorArg = principalSelfSid, objectTypeListCtorArg = objectTypeList, objectTypeListLength = objectTypeListLength, optionalArgumentsCtorArg = optionalArguments)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthzAccessRequest) return false
        if (this.desiredAccess != other.desiredAccess) return false
        if (this.principalSelfSid != other.principalSelfSid) return false
        if (this.objectTypeList != other.objectTypeList) return false
        if (this.objectTypeListLength != other.objectTypeListLength) return false
        if (this.optionalArguments != other.optionalArguments) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.desiredAccess.hashCode()
        result = 31 * result + this.principalSelfSid.hashCode()
        result = 31 * result + this.objectTypeList.hashCode()
        result = 31 * result + this.objectTypeListLength.hashCode()
        result = 31 * result + this.optionalArguments.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            desiredAccess: UInt = 0u,
            principalSelfSid: Psid = MutPtr(0L),
            objectTypeList: MutPtr<ObjectTypeList> = MutPtr(0L),
            objectTypeListLength: UInt = 0u,
            optionalArguments: MutPtr<CVoid> = MutPtr(0L),
        ): AuthzAccessRequest =
            AuthzAccessRequest(
                desiredAccess = desiredAccess,
                principalSelfSidCtorArg = principalSelfSid,
                objectTypeListCtorArg = objectTypeList,
                objectTypeListLength = objectTypeListLength,
                optionalArgumentsCtorArg = optionalArguments,
            )
    }
}

public data class AuthzAuditEventTypeLegacy(
    public var categoryId: UShort = 0u,
    public var auditId: UShort = 0u,
    public var parameterCount: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuthzAuditEventTypeLegacy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuthzAuditEventTypeLegacy> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): AuthzAuditEventTypeLegacy =
                    AuthzAuditEventTypeLegacy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: AuthzAuditEventTypeLegacy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.categoryId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.auditId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.parameterCount)
                }
            }
    }
}

public data class AuthzAuditEventTypeOld(
    public var version: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var refCount: Int = 0,
    public var hAudit: Int = 0,
    public var linkId: Luid = Luid(),
    public var u: AuthzAuditEventTypeUnion = AuthzAuditEventTypeUnion(),
)

public data class AuthzAuditEventTypeUnion(
    public var legacy: AuthzAuditEventTypeLegacy = AuthzAuditEventTypeLegacy(),
)

public class AuthzInitInfo internal constructor(
    public var version: UShort,
    szResourceManagerNameCtorArg: Pcwstr,
    public var pfnDynamicAccessCheck: PfnAuthzDynamicAccessCheck,
    public var pfnComputeDynamicGroups: PfnAuthzComputeDynamicGroups,
    public var pfnFreeDynamicGroups: PfnAuthzFreeDynamicGroups,
    public var pfnGetCentralAccessPolicy: PfnAuthzGetCentralAccessPolicy,
    public var pfnFreeCentralAccessPolicy: PfnAuthzFreeCentralAccessPolicy,
) {
    public var szResourceManagerName: Pcwstr = szResourceManagerNameCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        szResourceManagerNameCtorArg = ConstPtr(0L),
        pfnDynamicAccessCheck = null,
        pfnComputeDynamicGroups = null,
        pfnFreeDynamicGroups = null,
        pfnGetCentralAccessPolicy = null,
        pfnFreeCentralAccessPolicy = null,
    )

    public operator fun component1(): UShort = this.version

    public operator fun component2(): Pcwstr = this.szResourceManagerName

    public operator fun component3(): PfnAuthzDynamicAccessCheck = this.pfnDynamicAccessCheck

    public operator fun component4(): PfnAuthzComputeDynamicGroups = this.pfnComputeDynamicGroups

    public operator fun component5(): PfnAuthzFreeDynamicGroups = this.pfnFreeDynamicGroups

    public operator fun component6(): PfnAuthzGetCentralAccessPolicy = this.pfnGetCentralAccessPolicy

    public operator fun component7(): PfnAuthzFreeCentralAccessPolicy = this.pfnFreeCentralAccessPolicy

    public fun copy(version: UShort = this.version, szResourceManagerName: Pcwstr = this.szResourceManagerName, pfnDynamicAccessCheck: PfnAuthzDynamicAccessCheck = this.pfnDynamicAccessCheck, pfnComputeDynamicGroups: PfnAuthzComputeDynamicGroups = this.pfnComputeDynamicGroups, pfnFreeDynamicGroups: PfnAuthzFreeDynamicGroups = this.pfnFreeDynamicGroups, pfnGetCentralAccessPolicy: PfnAuthzGetCentralAccessPolicy = this.pfnGetCentralAccessPolicy, pfnFreeCentralAccessPolicy: PfnAuthzFreeCentralAccessPolicy = this.pfnFreeCentralAccessPolicy): AuthzInitInfo = AuthzInitInfo(version = version, szResourceManagerNameCtorArg = szResourceManagerName, pfnDynamicAccessCheck = pfnDynamicAccessCheck, pfnComputeDynamicGroups = pfnComputeDynamicGroups, pfnFreeDynamicGroups = pfnFreeDynamicGroups, pfnGetCentralAccessPolicy = pfnGetCentralAccessPolicy, pfnFreeCentralAccessPolicy = pfnFreeCentralAccessPolicy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthzInitInfo) return false
        if (this.version != other.version) return false
        if (this.szResourceManagerName != other.szResourceManagerName) return false
        if (this.pfnDynamicAccessCheck != other.pfnDynamicAccessCheck) return false
        if (this.pfnComputeDynamicGroups != other.pfnComputeDynamicGroups) return false
        if (this.pfnFreeDynamicGroups != other.pfnFreeDynamicGroups) return false
        if (this.pfnGetCentralAccessPolicy != other.pfnGetCentralAccessPolicy) return false
        if (this.pfnFreeCentralAccessPolicy != other.pfnFreeCentralAccessPolicy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.szResourceManagerName.hashCode()
        result = 31 * result + this.pfnDynamicAccessCheck.hashCode()
        result = 31 * result + this.pfnComputeDynamicGroups.hashCode()
        result = 31 * result + this.pfnFreeDynamicGroups.hashCode()
        result = 31 * result + this.pfnGetCentralAccessPolicy.hashCode()
        result = 31 * result + this.pfnFreeCentralAccessPolicy.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UShort = 0u,
            szResourceManagerName: Pcwstr = ConstPtr(0L),
            pfnDynamicAccessCheck: PfnAuthzDynamicAccessCheck = null,
            pfnComputeDynamicGroups: PfnAuthzComputeDynamicGroups = null,
            pfnFreeDynamicGroups: PfnAuthzFreeDynamicGroups = null,
            pfnGetCentralAccessPolicy: PfnAuthzGetCentralAccessPolicy = null,
            pfnFreeCentralAccessPolicy: PfnAuthzFreeCentralAccessPolicy = null,
        ): AuthzInitInfo =
            AuthzInitInfo(
                version = version,
                szResourceManagerNameCtorArg = szResourceManagerName,
                pfnDynamicAccessCheck = pfnDynamicAccessCheck,
                pfnComputeDynamicGroups = pfnComputeDynamicGroups,
                pfnFreeDynamicGroups = pfnFreeDynamicGroups,
                pfnGetCentralAccessPolicy = pfnGetCentralAccessPolicy,
                pfnFreeCentralAccessPolicy = pfnFreeCentralAccessPolicy,
            )
    }
}

public class AuthzRegistrationObjectTypeNameOffset internal constructor(
    szObjectTypeNameCtorArg: Pwstr,
    public var dwOffset: UInt,
) {
    public var szObjectTypeName: Pwstr = szObjectTypeNameCtorArg
        internal set

    public constructor() : this(
        szObjectTypeNameCtorArg = MutPtr(0L),
        dwOffset = 0u,
    )

    public operator fun component1(): Pwstr = this.szObjectTypeName

    public operator fun component2(): UInt = this.dwOffset

    public fun copy(szObjectTypeName: Pwstr = this.szObjectTypeName, dwOffset: UInt = this.dwOffset): AuthzRegistrationObjectTypeNameOffset = AuthzRegistrationObjectTypeNameOffset(szObjectTypeNameCtorArg = szObjectTypeName, dwOffset = dwOffset)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthzRegistrationObjectTypeNameOffset) return false
        if (this.szObjectTypeName != other.szObjectTypeName) return false
        if (this.dwOffset != other.dwOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szObjectTypeName.hashCode()
        result = 31 * result + this.dwOffset.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szObjectTypeName: Pwstr = MutPtr(0L),
            dwOffset: UInt = 0u,
        ): AuthzRegistrationObjectTypeNameOffset =
            AuthzRegistrationObjectTypeNameOffset(
                szObjectTypeNameCtorArg = szObjectTypeName,
                dwOffset = dwOffset,
            )
    }
}

public class AuthzRpcInitInfoClient internal constructor(
    public var version: UShort,
    objectUuidCtorArg: Pwstr,
    protSeqCtorArg: Pwstr,
    networkAddrCtorArg: Pwstr,
    endpointCtorArg: Pwstr,
    optionsCtorArg: Pwstr,
    serverSpnCtorArg: Pwstr,
) {
    public var objectUuid: Pwstr = objectUuidCtorArg
        internal set

    public var protSeq: Pwstr = protSeqCtorArg
        internal set

    public var networkAddr: Pwstr = networkAddrCtorArg
        internal set

    public var endpoint: Pwstr = endpointCtorArg
        internal set

    public var options: Pwstr = optionsCtorArg
        internal set

    public var serverSpn: Pwstr = serverSpnCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        objectUuidCtorArg = MutPtr(0L),
        protSeqCtorArg = MutPtr(0L),
        networkAddrCtorArg = MutPtr(0L),
        endpointCtorArg = MutPtr(0L),
        optionsCtorArg = MutPtr(0L),
        serverSpnCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.version

    public operator fun component2(): Pwstr = this.objectUuid

    public operator fun component3(): Pwstr = this.protSeq

    public operator fun component4(): Pwstr = this.networkAddr

    public operator fun component5(): Pwstr = this.endpoint

    public operator fun component6(): Pwstr = this.options

    public operator fun component7(): Pwstr = this.serverSpn

    public fun copy(version: UShort = this.version, objectUuid: Pwstr = this.objectUuid, protSeq: Pwstr = this.protSeq, networkAddr: Pwstr = this.networkAddr, endpoint: Pwstr = this.endpoint, options: Pwstr = this.options, serverSpn: Pwstr = this.serverSpn): AuthzRpcInitInfoClient = AuthzRpcInitInfoClient(version = version, objectUuidCtorArg = objectUuid, protSeqCtorArg = protSeq, networkAddrCtorArg = networkAddr, endpointCtorArg = endpoint, optionsCtorArg = options, serverSpnCtorArg = serverSpn)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthzRpcInitInfoClient) return false
        if (this.version != other.version) return false
        if (this.objectUuid != other.objectUuid) return false
        if (this.protSeq != other.protSeq) return false
        if (this.networkAddr != other.networkAddr) return false
        if (this.endpoint != other.endpoint) return false
        if (this.options != other.options) return false
        if (this.serverSpn != other.serverSpn) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.objectUuid.hashCode()
        result = 31 * result + this.protSeq.hashCode()
        result = 31 * result + this.networkAddr.hashCode()
        result = 31 * result + this.endpoint.hashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.serverSpn.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UShort = 0u,
            objectUuid: Pwstr = MutPtr(0L),
            protSeq: Pwstr = MutPtr(0L),
            networkAddr: Pwstr = MutPtr(0L),
            endpoint: Pwstr = MutPtr(0L),
            options: Pwstr = MutPtr(0L),
            serverSpn: Pwstr = MutPtr(0L),
        ): AuthzRpcInitInfoClient =
            AuthzRpcInitInfoClient(
                version = version,
                objectUuidCtorArg = objectUuid,
                protSeqCtorArg = protSeq,
                networkAddrCtorArg = networkAddr,
                endpointCtorArg = endpoint,
                optionsCtorArg = options,
                serverSpnCtorArg = serverSpn,
            )
    }
}

public data class AuthzSecurityAttributesInformation(
    public var version: UShort = 0u,
    public var reserved: UShort = 0u,
    public var attributeCount: UInt = 0u,
    public var attribute: AuthzSecurityAttributesInformation0 = AuthzSecurityAttributesInformation0(),
)

public class AuthzSecurityAttributesInformation0 internal constructor(
    pAttributeV1CtorArg: MutPtr<AuthzSecurityAttributeV1>,
) {
    public var pAttributeV1: MutPtr<AuthzSecurityAttributeV1> = pAttributeV1CtorArg
        internal set

    public constructor() : this(
        pAttributeV1CtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<AuthzSecurityAttributeV1> = this.pAttributeV1

    public fun copy(pAttributeV1: MutPtr<AuthzSecurityAttributeV1> = this.pAttributeV1): AuthzSecurityAttributesInformation0 = AuthzSecurityAttributesInformation0(pAttributeV1CtorArg = pAttributeV1)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthzSecurityAttributesInformation0) return false
        if (this.pAttributeV1 != other.pAttributeV1) return false
        return true
    }

    override fun hashCode(): Int = this.pAttributeV1.hashCode()

    public companion object {
        public operator fun invoke(
            pAttributeV1: MutPtr<AuthzSecurityAttributeV1> = MutPtr(0L),
        ): AuthzSecurityAttributesInformation0 =
            AuthzSecurityAttributesInformation0(
                pAttributeV1CtorArg = pAttributeV1,
            )
    }
}

public class AuthzSecurityAttributeFqbnValue internal constructor(
    public var version: ULong,
    pNameCtorArg: Pwstr,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public constructor() : this(
        version = 0uL,
        pNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.version

    public operator fun component2(): Pwstr = this.pName

    public fun copy(version: ULong = this.version, pName: Pwstr = this.pName): AuthzSecurityAttributeFqbnValue = AuthzSecurityAttributeFqbnValue(version = version, pNameCtorArg = pName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthzSecurityAttributeFqbnValue) return false
        if (this.version != other.version) return false
        if (this.pName != other.pName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.pName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: ULong = 0uL,
            pName: Pwstr = MutPtr(0L),
        ): AuthzSecurityAttributeFqbnValue =
            AuthzSecurityAttributeFqbnValue(
                version = version,
                pNameCtorArg = pName,
            )
    }
}

public class AuthzSecurityAttributeOctetStringValue internal constructor(
    pValueCtorArg: MutPtr<CVoid>,
    public var valueLength: UInt,
) {
    public var pValue: MutPtr<CVoid> = pValueCtorArg
        internal set

    public constructor() : this(
        pValueCtorArg = MutPtr(0L),
        valueLength = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.pValue

    public operator fun component2(): UInt = this.valueLength

    public fun copy(pValue: MutPtr<CVoid> = this.pValue, valueLength: UInt = this.valueLength): AuthzSecurityAttributeOctetStringValue = AuthzSecurityAttributeOctetStringValue(pValueCtorArg = pValue, valueLength = valueLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthzSecurityAttributeOctetStringValue) return false
        if (this.pValue != other.pValue) return false
        if (this.valueLength != other.valueLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pValue.hashCode()
        result = 31 * result + this.valueLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuthzSecurityAttributeOctetStringValue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuthzSecurityAttributeOctetStringValue> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): AuthzSecurityAttributeOctetStringValue =
                    AuthzSecurityAttributeOctetStringValue(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AuthzSecurityAttributeOctetStringValue) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.pValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.valueLength)
                }
            }

        public operator fun invoke(
            pValue: MutPtr<CVoid> = MutPtr(0L),
            valueLength: UInt = 0u,
        ): AuthzSecurityAttributeOctetStringValue =
            AuthzSecurityAttributeOctetStringValue(
                pValueCtorArg = pValue,
                valueLength = valueLength,
            )
    }
}

public class AuthzSecurityAttributeV1 internal constructor(
    pNameCtorArg: Pwstr,
    public var valueType: UShort,
    public var reserved: UShort,
    public var flags: AuthzSecurityAttributeFlags,
    public var valueCount: UInt,
    public var values: AuthzSecurityAttributeV10,
) {
    public var pName: Pwstr = pNameCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
        valueType = 0u,
        reserved = 0u,
        flags = 0u,
        valueCount = 0u,
        values = AuthzSecurityAttributeV10(),
    )

    public operator fun component1(): Pwstr = this.pName

    public operator fun component2(): UShort = this.valueType

    public operator fun component3(): UShort = this.reserved

    public operator fun component4(): AuthzSecurityAttributeFlags = this.flags

    public operator fun component5(): UInt = this.valueCount

    public operator fun component6(): AuthzSecurityAttributeV10 = this.values

    public fun copy(pName: Pwstr = this.pName, valueType: UShort = this.valueType, reserved: UShort = this.reserved, flags: AuthzSecurityAttributeFlags = this.flags, valueCount: UInt = this.valueCount, values: AuthzSecurityAttributeV10 = this.values): AuthzSecurityAttributeV1 = AuthzSecurityAttributeV1(pNameCtorArg = pName, valueType = valueType, reserved = reserved, flags = flags, valueCount = valueCount, values = values)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthzSecurityAttributeV1) return false
        if (this.pName != other.pName) return false
        if (this.valueType != other.valueType) return false
        if (this.reserved != other.reserved) return false
        if (this.flags != other.flags) return false
        if (this.valueCount != other.valueCount) return false
        if (this.values != other.values) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pName.hashCode()
        result = 31 * result + this.valueType.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.valueCount.hashCode()
        result = 31 * result + this.values.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pName: Pwstr = MutPtr(0L),
            valueType: UShort = 0u,
            reserved: UShort = 0u,
            flags: AuthzSecurityAttributeFlags = 0u,
            valueCount: UInt = 0u,
            values: AuthzSecurityAttributeV10 = AuthzSecurityAttributeV10(),
        ): AuthzSecurityAttributeV1 =
            AuthzSecurityAttributeV1(
                pNameCtorArg = pName,
                valueType = valueType,
                reserved = reserved,
                flags = flags,
                valueCount = valueCount,
                values = values,
            )
    }
}

public class AuthzSecurityAttributeV10 internal constructor(
    pInt64CtorArg: MutPtr<Long>,
    pUint64CtorArg: MutPtr<ULong>,
    ppStringCtorArg: MutPtr<Pwstr>,
    pFqbnCtorArg: MutPtr<AuthzSecurityAttributeFqbnValue>,
    pOctetStringCtorArg: MutPtr<AuthzSecurityAttributeOctetStringValue>,
) {
    public var pInt64: MutPtr<Long> = pInt64CtorArg
        internal set

    public var pUint64: MutPtr<ULong> = pUint64CtorArg
        internal set

    public var ppString: MutPtr<Pwstr> = ppStringCtorArg
        internal set

    public var pFqbn: MutPtr<AuthzSecurityAttributeFqbnValue> = pFqbnCtorArg
        internal set

    public var pOctetString: MutPtr<AuthzSecurityAttributeOctetStringValue> = pOctetStringCtorArg
        internal set

    public constructor() : this(
        pInt64CtorArg = MutPtr(0L),
        pUint64CtorArg = MutPtr(0L),
        ppStringCtorArg = MutPtr(0L),
        pFqbnCtorArg = MutPtr(0L),
        pOctetStringCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Long> = this.pInt64

    public operator fun component2(): MutPtr<ULong> = this.pUint64

    public operator fun component3(): MutPtr<Pwstr> = this.ppString

    public operator fun component4(): MutPtr<AuthzSecurityAttributeFqbnValue> = this.pFqbn

    public operator fun component5(): MutPtr<AuthzSecurityAttributeOctetStringValue> = this.pOctetString

    public fun copy(pInt64: MutPtr<Long> = this.pInt64, pUint64: MutPtr<ULong> = this.pUint64, ppString: MutPtr<Pwstr> = this.ppString, pFqbn: MutPtr<AuthzSecurityAttributeFqbnValue> = this.pFqbn, pOctetString: MutPtr<AuthzSecurityAttributeOctetStringValue> = this.pOctetString): AuthzSecurityAttributeV10 = AuthzSecurityAttributeV10(pInt64CtorArg = pInt64, pUint64CtorArg = pUint64, ppStringCtorArg = ppString, pFqbnCtorArg = pFqbn, pOctetStringCtorArg = pOctetString)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthzSecurityAttributeV10) return false
        if (this.pInt64 != other.pInt64) return false
        if (this.pUint64 != other.pUint64) return false
        if (this.ppString != other.ppString) return false
        if (this.pFqbn != other.pFqbn) return false
        if (this.pOctetString != other.pOctetString) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pInt64.hashCode()
        result = 31 * result + this.pUint64.hashCode()
        result = 31 * result + this.ppString.hashCode()
        result = 31 * result + this.pFqbn.hashCode()
        result = 31 * result + this.pOctetString.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pInt64: MutPtr<Long> = MutPtr(0L),
            pUint64: MutPtr<ULong> = MutPtr(0L),
            ppString: MutPtr<Pwstr> = MutPtr(0L),
            pFqbn: MutPtr<AuthzSecurityAttributeFqbnValue> = MutPtr(0L),
            pOctetString: MutPtr<AuthzSecurityAttributeOctetStringValue> = MutPtr(0L),
        ): AuthzSecurityAttributeV10 =
            AuthzSecurityAttributeV10(
                pInt64CtorArg = pInt64,
                pUint64CtorArg = pUint64,
                ppStringCtorArg = ppString,
                pFqbnCtorArg = pFqbn,
                pOctetStringCtorArg = pOctetString,
            )
    }
}

public class AuthzSourceSchemaRegistration internal constructor(
    public var dwFlags: UInt,
    szEventSourceNameCtorArg: Pwstr,
    szEventMessageFileCtorArg: Pwstr,
    szEventSourceXmlSchemaFileCtorArg: Pwstr,
    szEventAccessStringsFileCtorArg: Pwstr,
    szExecutableImagePathCtorArg: Pwstr,
    public var anonymous: AuthzSourceSchemaRegistration0,
    public var dwObjectTypeNameCount: UInt,
    public var objectTypeNames: List<AuthzRegistrationObjectTypeNameOffset>,
) {
    public var szEventSourceName: Pwstr = szEventSourceNameCtorArg
        internal set

    public var szEventMessageFile: Pwstr = szEventMessageFileCtorArg
        internal set

    public var szEventSourceXmlSchemaFile: Pwstr = szEventSourceXmlSchemaFileCtorArg
        internal set

    public var szEventAccessStringsFile: Pwstr = szEventAccessStringsFileCtorArg
        internal set

    public var szExecutableImagePath: Pwstr = szExecutableImagePathCtorArg
        internal set

    public constructor() : this(
        dwFlags = 0u,
        szEventSourceNameCtorArg = MutPtr(0L),
        szEventMessageFileCtorArg = MutPtr(0L),
        szEventSourceXmlSchemaFileCtorArg = MutPtr(0L),
        szEventAccessStringsFileCtorArg = MutPtr(0L),
        szExecutableImagePathCtorArg = MutPtr(0L),
        anonymous = AuthzSourceSchemaRegistration0(),
        dwObjectTypeNameCount = 0u,
        objectTypeNames = List(1) { AuthzRegistrationObjectTypeNameOffset() },
    )

    public operator fun component1(): UInt = this.dwFlags

    public operator fun component2(): Pwstr = this.szEventSourceName

    public operator fun component3(): Pwstr = this.szEventMessageFile

    public operator fun component4(): Pwstr = this.szEventSourceXmlSchemaFile

    public operator fun component5(): Pwstr = this.szEventAccessStringsFile

    public operator fun component6(): Pwstr = this.szExecutableImagePath

    public operator fun component7(): AuthzSourceSchemaRegistration0 = this.anonymous

    public operator fun component8(): UInt = this.dwObjectTypeNameCount

    public operator fun component9(): List<AuthzRegistrationObjectTypeNameOffset> = this.objectTypeNames

    public fun copy(dwFlags: UInt = this.dwFlags, szEventSourceName: Pwstr = this.szEventSourceName, szEventMessageFile: Pwstr = this.szEventMessageFile, szEventSourceXmlSchemaFile: Pwstr = this.szEventSourceXmlSchemaFile, szEventAccessStringsFile: Pwstr = this.szEventAccessStringsFile, szExecutableImagePath: Pwstr = this.szExecutableImagePath, anonymous: AuthzSourceSchemaRegistration0 = this.anonymous, dwObjectTypeNameCount: UInt = this.dwObjectTypeNameCount, objectTypeNames: List<AuthzRegistrationObjectTypeNameOffset> = this.objectTypeNames): AuthzSourceSchemaRegistration = AuthzSourceSchemaRegistration(dwFlags = dwFlags, szEventSourceNameCtorArg = szEventSourceName, szEventMessageFileCtorArg = szEventMessageFile, szEventSourceXmlSchemaFileCtorArg = szEventSourceXmlSchemaFile, szEventAccessStringsFileCtorArg = szEventAccessStringsFile, szExecutableImagePathCtorArg = szExecutableImagePath, anonymous = anonymous, dwObjectTypeNameCount = dwObjectTypeNameCount, objectTypeNames = objectTypeNames)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthzSourceSchemaRegistration) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.szEventSourceName != other.szEventSourceName) return false
        if (this.szEventMessageFile != other.szEventMessageFile) return false
        if (this.szEventSourceXmlSchemaFile != other.szEventSourceXmlSchemaFile) return false
        if (this.szEventAccessStringsFile != other.szEventAccessStringsFile) return false
        if (this.szExecutableImagePath != other.szExecutableImagePath) return false
        if (this.anonymous != other.anonymous) return false
        if (this.dwObjectTypeNameCount != other.dwObjectTypeNameCount) return false
        if (this.objectTypeNames != other.objectTypeNames) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.szEventSourceName.hashCode()
        result = 31 * result + this.szEventMessageFile.hashCode()
        result = 31 * result + this.szEventSourceXmlSchemaFile.hashCode()
        result = 31 * result + this.szEventAccessStringsFile.hashCode()
        result = 31 * result + this.szExecutableImagePath.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.dwObjectTypeNameCount.hashCode()
        result = 31 * result + this.objectTypeNames.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwFlags: UInt = 0u,
            szEventSourceName: Pwstr = MutPtr(0L),
            szEventMessageFile: Pwstr = MutPtr(0L),
            szEventSourceXmlSchemaFile: Pwstr = MutPtr(0L),
            szEventAccessStringsFile: Pwstr = MutPtr(0L),
            szExecutableImagePath: Pwstr = MutPtr(0L),
            anonymous: AuthzSourceSchemaRegistration0 = AuthzSourceSchemaRegistration0(),
            dwObjectTypeNameCount: UInt = 0u,
            objectTypeNames: List<AuthzRegistrationObjectTypeNameOffset> = List(1) { AuthzRegistrationObjectTypeNameOffset() },
        ): AuthzSourceSchemaRegistration =
            AuthzSourceSchemaRegistration(
                dwFlags = dwFlags,
                szEventSourceNameCtorArg = szEventSourceName,
                szEventMessageFileCtorArg = szEventMessageFile,
                szEventSourceXmlSchemaFileCtorArg = szEventSourceXmlSchemaFile,
                szEventAccessStringsFileCtorArg = szEventAccessStringsFile,
                szExecutableImagePathCtorArg = szExecutableImagePath,
                anonymous = anonymous,
                dwObjectTypeNameCount = dwObjectTypeNameCount,
                objectTypeNames = objectTypeNames,
            )
    }
}

public class AuthzSourceSchemaRegistration0 internal constructor(
    pReservedCtorArg: MutPtr<CVoid>,
    pProviderGuidCtorArg: MutPtr<Guid>,
) {
    public var pReserved: MutPtr<CVoid> = pReservedCtorArg
        internal set

    public var pProviderGuid: MutPtr<Guid> = pProviderGuidCtorArg
        internal set

    public constructor() : this(
        pReservedCtorArg = MutPtr(0L),
        pProviderGuidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.pReserved

    public operator fun component2(): MutPtr<Guid> = this.pProviderGuid

    public fun copy(pReserved: MutPtr<CVoid> = this.pReserved, pProviderGuid: MutPtr<Guid> = this.pProviderGuid): AuthzSourceSchemaRegistration0 = AuthzSourceSchemaRegistration0(pReservedCtorArg = pReserved, pProviderGuidCtorArg = pProviderGuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthzSourceSchemaRegistration0) return false
        if (this.pReserved != other.pReserved) return false
        if (this.pProviderGuid != other.pProviderGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pReserved.hashCode()
        result = 31 * result + this.pProviderGuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pReserved: MutPtr<CVoid> = MutPtr(0L),
            pProviderGuid: MutPtr<Guid> = MutPtr(0L),
        ): AuthzSourceSchemaRegistration0 =
            AuthzSourceSchemaRegistration0(
                pReservedCtorArg = pReserved,
                pProviderGuidCtorArg = pProviderGuid,
            )
    }
}

public data class ExplicitAccessA(
    public var grfAccessPermissions: UInt = 0u,
    public var grfAccessMode: AccessMode = 0,
    public var grfInheritance: AceFlags = 0u,
    public var trustee: TrusteeA = TrusteeA(),
)

public data class ExplicitAccessW(
    public var grfAccessPermissions: UInt = 0u,
    public var grfAccessMode: AccessMode = 0,
    public var grfInheritance: AceFlags = 0u,
    public var trustee: TrusteeW = TrusteeW(),
)

public data class FnObjectMgrFuncts(
    public var sampleValue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FnObjectMgrFuncts> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FnObjectMgrFuncts> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FnObjectMgrFuncts =
                    FnObjectMgrFuncts(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FnObjectMgrFuncts) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sampleValue)
                }
            }
    }
}

public class InheritedFroma internal constructor(
    public var generationGap: Int,
    ancestorNameCtorArg: Pstr,
) {
    public var ancestorName: Pstr = ancestorNameCtorArg
        internal set

    public constructor() : this(
        generationGap = 0,
        ancestorNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.generationGap

    public operator fun component2(): Pstr = this.ancestorName

    public fun copy(generationGap: Int = this.generationGap, ancestorName: Pstr = this.ancestorName): InheritedFroma = InheritedFroma(generationGap = generationGap, ancestorNameCtorArg = ancestorName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InheritedFroma) return false
        if (this.generationGap != other.generationGap) return false
        if (this.ancestorName != other.ancestorName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.generationGap.hashCode()
        result = 31 * result + this.ancestorName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            generationGap: Int = 0,
            ancestorName: Pstr = MutPtr(0L),
        ): InheritedFroma =
            InheritedFroma(
                generationGap = generationGap,
                ancestorNameCtorArg = ancestorName,
            )
    }
}

public class InheritedFromw internal constructor(
    public var generationGap: Int,
    ancestorNameCtorArg: Pwstr,
) {
    public var ancestorName: Pwstr = ancestorNameCtorArg
        internal set

    public constructor() : this(
        generationGap = 0,
        ancestorNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.generationGap

    public operator fun component2(): Pwstr = this.ancestorName

    public fun copy(generationGap: Int = this.generationGap, ancestorName: Pwstr = this.ancestorName): InheritedFromw = InheritedFromw(generationGap = generationGap, ancestorNameCtorArg = ancestorName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InheritedFromw) return false
        if (this.generationGap != other.generationGap) return false
        if (this.ancestorName != other.ancestorName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.generationGap.hashCode()
        result = 31 * result + this.ancestorName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            generationGap: Int = 0,
            ancestorName: Pwstr = MutPtr(0L),
        ): InheritedFromw =
            InheritedFromw(
                generationGap = generationGap,
                ancestorNameCtorArg = ancestorName,
            )
    }
}

public class ObjectsAndNameA internal constructor(
    public var objectsPresent: SystemAuditObjectAceFlags,
    public var objectType: SeObjectType,
    objectTypeNameCtorArg: Pstr,
    inheritedObjectTypeNameCtorArg: Pstr,
    ptstrNameCtorArg: Pstr,
) {
    public var objectTypeName: Pstr = objectTypeNameCtorArg
        internal set

    public var inheritedObjectTypeName: Pstr = inheritedObjectTypeNameCtorArg
        internal set

    public var ptstrName: Pstr = ptstrNameCtorArg
        internal set

    public constructor() : this(
        objectsPresent = 0u,
        objectType = 0,
        objectTypeNameCtorArg = MutPtr(0L),
        inheritedObjectTypeNameCtorArg = MutPtr(0L),
        ptstrNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): SystemAuditObjectAceFlags = this.objectsPresent

    public operator fun component2(): SeObjectType = this.objectType

    public operator fun component3(): Pstr = this.objectTypeName

    public operator fun component4(): Pstr = this.inheritedObjectTypeName

    public operator fun component5(): Pstr = this.ptstrName

    public fun copy(objectsPresent: SystemAuditObjectAceFlags = this.objectsPresent, objectType: SeObjectType = this.objectType, objectTypeName: Pstr = this.objectTypeName, inheritedObjectTypeName: Pstr = this.inheritedObjectTypeName, ptstrName: Pstr = this.ptstrName): ObjectsAndNameA = ObjectsAndNameA(objectsPresent = objectsPresent, objectType = objectType, objectTypeNameCtorArg = objectTypeName, inheritedObjectTypeNameCtorArg = inheritedObjectTypeName, ptstrNameCtorArg = ptstrName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObjectsAndNameA) return false
        if (this.objectsPresent != other.objectsPresent) return false
        if (this.objectType != other.objectType) return false
        if (this.objectTypeName != other.objectTypeName) return false
        if (this.inheritedObjectTypeName != other.inheritedObjectTypeName) return false
        if (this.ptstrName != other.ptstrName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectsPresent.hashCode()
        result = 31 * result + this.objectType.hashCode()
        result = 31 * result + this.objectTypeName.hashCode()
        result = 31 * result + this.inheritedObjectTypeName.hashCode()
        result = 31 * result + this.ptstrName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            objectsPresent: SystemAuditObjectAceFlags = 0u,
            objectType: SeObjectType = 0,
            objectTypeName: Pstr = MutPtr(0L),
            inheritedObjectTypeName: Pstr = MutPtr(0L),
            ptstrName: Pstr = MutPtr(0L),
        ): ObjectsAndNameA =
            ObjectsAndNameA(
                objectsPresent = objectsPresent,
                objectType = objectType,
                objectTypeNameCtorArg = objectTypeName,
                inheritedObjectTypeNameCtorArg = inheritedObjectTypeName,
                ptstrNameCtorArg = ptstrName,
            )
    }
}

public class ObjectsAndNameW internal constructor(
    public var objectsPresent: SystemAuditObjectAceFlags,
    public var objectType: SeObjectType,
    objectTypeNameCtorArg: Pwstr,
    inheritedObjectTypeNameCtorArg: Pwstr,
    ptstrNameCtorArg: Pwstr,
) {
    public var objectTypeName: Pwstr = objectTypeNameCtorArg
        internal set

    public var inheritedObjectTypeName: Pwstr = inheritedObjectTypeNameCtorArg
        internal set

    public var ptstrName: Pwstr = ptstrNameCtorArg
        internal set

    public constructor() : this(
        objectsPresent = 0u,
        objectType = 0,
        objectTypeNameCtorArg = MutPtr(0L),
        inheritedObjectTypeNameCtorArg = MutPtr(0L),
        ptstrNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): SystemAuditObjectAceFlags = this.objectsPresent

    public operator fun component2(): SeObjectType = this.objectType

    public operator fun component3(): Pwstr = this.objectTypeName

    public operator fun component4(): Pwstr = this.inheritedObjectTypeName

    public operator fun component5(): Pwstr = this.ptstrName

    public fun copy(objectsPresent: SystemAuditObjectAceFlags = this.objectsPresent, objectType: SeObjectType = this.objectType, objectTypeName: Pwstr = this.objectTypeName, inheritedObjectTypeName: Pwstr = this.inheritedObjectTypeName, ptstrName: Pwstr = this.ptstrName): ObjectsAndNameW = ObjectsAndNameW(objectsPresent = objectsPresent, objectType = objectType, objectTypeNameCtorArg = objectTypeName, inheritedObjectTypeNameCtorArg = inheritedObjectTypeName, ptstrNameCtorArg = ptstrName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObjectsAndNameW) return false
        if (this.objectsPresent != other.objectsPresent) return false
        if (this.objectType != other.objectType) return false
        if (this.objectTypeName != other.objectTypeName) return false
        if (this.inheritedObjectTypeName != other.inheritedObjectTypeName) return false
        if (this.ptstrName != other.ptstrName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectsPresent.hashCode()
        result = 31 * result + this.objectType.hashCode()
        result = 31 * result + this.objectTypeName.hashCode()
        result = 31 * result + this.inheritedObjectTypeName.hashCode()
        result = 31 * result + this.ptstrName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            objectsPresent: SystemAuditObjectAceFlags = 0u,
            objectType: SeObjectType = 0,
            objectTypeName: Pwstr = MutPtr(0L),
            inheritedObjectTypeName: Pwstr = MutPtr(0L),
            ptstrName: Pwstr = MutPtr(0L),
        ): ObjectsAndNameW =
            ObjectsAndNameW(
                objectsPresent = objectsPresent,
                objectType = objectType,
                objectTypeNameCtorArg = objectTypeName,
                inheritedObjectTypeNameCtorArg = inheritedObjectTypeName,
                ptstrNameCtorArg = ptstrName,
            )
    }
}

public class ObjectsAndSid internal constructor(
    public var objectsPresent: SystemAuditObjectAceFlags,
    public var objectTypeGuid: Guid,
    public var inheritedObjectTypeGuid: Guid,
    pSidCtorArg: MutPtr<Sid>,
) {
    public var pSid: MutPtr<Sid> = pSidCtorArg
        internal set

    public constructor() : this(
        objectsPresent = 0u,
        objectTypeGuid = Guid(),
        inheritedObjectTypeGuid = Guid(),
        pSidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): SystemAuditObjectAceFlags = this.objectsPresent

    public operator fun component2(): Guid = this.objectTypeGuid

    public operator fun component3(): Guid = this.inheritedObjectTypeGuid

    public operator fun component4(): MutPtr<Sid> = this.pSid

    public fun copy(objectsPresent: SystemAuditObjectAceFlags = this.objectsPresent, objectTypeGuid: Guid = this.objectTypeGuid, inheritedObjectTypeGuid: Guid = this.inheritedObjectTypeGuid, pSid: MutPtr<Sid> = this.pSid): ObjectsAndSid = ObjectsAndSid(objectsPresent = objectsPresent, objectTypeGuid = objectTypeGuid, inheritedObjectTypeGuid = inheritedObjectTypeGuid, pSidCtorArg = pSid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObjectsAndSid) return false
        if (this.objectsPresent != other.objectsPresent) return false
        if (this.objectTypeGuid != other.objectTypeGuid) return false
        if (this.inheritedObjectTypeGuid != other.inheritedObjectTypeGuid) return false
        if (this.pSid != other.pSid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectsPresent.hashCode()
        result = 31 * result + this.objectTypeGuid.hashCode()
        result = 31 * result + this.inheritedObjectTypeGuid.hashCode()
        result = 31 * result + this.pSid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            objectsPresent: SystemAuditObjectAceFlags = 0u,
            objectTypeGuid: Guid = Guid(),
            inheritedObjectTypeGuid: Guid = Guid(),
            pSid: MutPtr<Sid> = MutPtr(0L),
        ): ObjectsAndSid =
            ObjectsAndSid(
                objectsPresent = objectsPresent,
                objectTypeGuid = objectTypeGuid,
                inheritedObjectTypeGuid = inheritedObjectTypeGuid,
                pSidCtorArg = pSid,
            )
    }
}

public class TrusteeA internal constructor(
    pMultipleTrusteeCtorArg: MutPtr<TrusteeA>,
    public var multipleTrusteeOperation: MultipleTrusteeOperation,
    public var trusteeForm: TrusteeForm,
    public var trusteeType: TrusteeType,
    ptstrNameCtorArg: Pstr,
) {
    public var pMultipleTrustee: MutPtr<TrusteeA> = pMultipleTrusteeCtorArg
        internal set

    public var ptstrName: Pstr = ptstrNameCtorArg
        internal set

    public constructor() : this(
        pMultipleTrusteeCtorArg = MutPtr(0L),
        multipleTrusteeOperation = 0,
        trusteeForm = 0,
        trusteeType = 0,
        ptstrNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<TrusteeA> = this.pMultipleTrustee

    public operator fun component2(): MultipleTrusteeOperation = this.multipleTrusteeOperation

    public operator fun component3(): TrusteeForm = this.trusteeForm

    public operator fun component4(): TrusteeType = this.trusteeType

    public operator fun component5(): Pstr = this.ptstrName

    public fun copy(pMultipleTrustee: MutPtr<TrusteeA> = this.pMultipleTrustee, multipleTrusteeOperation: MultipleTrusteeOperation = this.multipleTrusteeOperation, trusteeForm: TrusteeForm = this.trusteeForm, trusteeType: TrusteeType = this.trusteeType, ptstrName: Pstr = this.ptstrName): TrusteeA = TrusteeA(pMultipleTrusteeCtorArg = pMultipleTrustee, multipleTrusteeOperation = multipleTrusteeOperation, trusteeForm = trusteeForm, trusteeType = trusteeType, ptstrNameCtorArg = ptstrName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TrusteeA) return false
        if (this.pMultipleTrustee != other.pMultipleTrustee) return false
        if (this.multipleTrusteeOperation != other.multipleTrusteeOperation) return false
        if (this.trusteeForm != other.trusteeForm) return false
        if (this.trusteeType != other.trusteeType) return false
        if (this.ptstrName != other.ptstrName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pMultipleTrustee.hashCode()
        result = 31 * result + this.multipleTrusteeOperation.hashCode()
        result = 31 * result + this.trusteeForm.hashCode()
        result = 31 * result + this.trusteeType.hashCode()
        result = 31 * result + this.ptstrName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pMultipleTrustee: MutPtr<TrusteeA> = MutPtr(0L),
            multipleTrusteeOperation: MultipleTrusteeOperation = 0,
            trusteeForm: TrusteeForm = 0,
            trusteeType: TrusteeType = 0,
            ptstrName: Pstr = MutPtr(0L),
        ): TrusteeA =
            TrusteeA(
                pMultipleTrusteeCtorArg = pMultipleTrustee,
                multipleTrusteeOperation = multipleTrusteeOperation,
                trusteeForm = trusteeForm,
                trusteeType = trusteeType,
                ptstrNameCtorArg = ptstrName,
            )
    }
}

public class TrusteeAccessa internal constructor(
    lpPropertyCtorArg: Pstr,
    public var access: UInt,
    public var fAccessFlags: UInt,
    public var fReturnedAccess: UInt,
) {
    public var lpProperty: Pstr = lpPropertyCtorArg
        internal set

    public constructor() : this(
        lpPropertyCtorArg = MutPtr(0L),
        access = 0u,
        fAccessFlags = 0u,
        fReturnedAccess = 0u,
    )

    public operator fun component1(): Pstr = this.lpProperty

    public operator fun component2(): UInt = this.access

    public operator fun component3(): UInt = this.fAccessFlags

    public operator fun component4(): UInt = this.fReturnedAccess

    public fun copy(lpProperty: Pstr = this.lpProperty, access: UInt = this.access, fAccessFlags: UInt = this.fAccessFlags, fReturnedAccess: UInt = this.fReturnedAccess): TrusteeAccessa = TrusteeAccessa(lpPropertyCtorArg = lpProperty, access = access, fAccessFlags = fAccessFlags, fReturnedAccess = fReturnedAccess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TrusteeAccessa) return false
        if (this.lpProperty != other.lpProperty) return false
        if (this.access != other.access) return false
        if (this.fAccessFlags != other.fAccessFlags) return false
        if (this.fReturnedAccess != other.fReturnedAccess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpProperty.hashCode()
        result = 31 * result + this.access.hashCode()
        result = 31 * result + this.fAccessFlags.hashCode()
        result = 31 * result + this.fReturnedAccess.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpProperty: Pstr = MutPtr(0L),
            access: UInt = 0u,
            fAccessFlags: UInt = 0u,
            fReturnedAccess: UInt = 0u,
        ): TrusteeAccessa =
            TrusteeAccessa(
                lpPropertyCtorArg = lpProperty,
                access = access,
                fAccessFlags = fAccessFlags,
                fReturnedAccess = fReturnedAccess,
            )
    }
}

public class TrusteeAccessw internal constructor(
    lpPropertyCtorArg: Pwstr,
    public var access: UInt,
    public var fAccessFlags: UInt,
    public var fReturnedAccess: UInt,
) {
    public var lpProperty: Pwstr = lpPropertyCtorArg
        internal set

    public constructor() : this(
        lpPropertyCtorArg = MutPtr(0L),
        access = 0u,
        fAccessFlags = 0u,
        fReturnedAccess = 0u,
    )

    public operator fun component1(): Pwstr = this.lpProperty

    public operator fun component2(): UInt = this.access

    public operator fun component3(): UInt = this.fAccessFlags

    public operator fun component4(): UInt = this.fReturnedAccess

    public fun copy(lpProperty: Pwstr = this.lpProperty, access: UInt = this.access, fAccessFlags: UInt = this.fAccessFlags, fReturnedAccess: UInt = this.fReturnedAccess): TrusteeAccessw = TrusteeAccessw(lpPropertyCtorArg = lpProperty, access = access, fAccessFlags = fAccessFlags, fReturnedAccess = fReturnedAccess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TrusteeAccessw) return false
        if (this.lpProperty != other.lpProperty) return false
        if (this.access != other.access) return false
        if (this.fAccessFlags != other.fAccessFlags) return false
        if (this.fReturnedAccess != other.fReturnedAccess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpProperty.hashCode()
        result = 31 * result + this.access.hashCode()
        result = 31 * result + this.fAccessFlags.hashCode()
        result = 31 * result + this.fReturnedAccess.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lpProperty: Pwstr = MutPtr(0L),
            access: UInt = 0u,
            fAccessFlags: UInt = 0u,
            fReturnedAccess: UInt = 0u,
        ): TrusteeAccessw =
            TrusteeAccessw(
                lpPropertyCtorArg = lpProperty,
                access = access,
                fAccessFlags = fAccessFlags,
                fReturnedAccess = fReturnedAccess,
            )
    }
}

public class TrusteeW internal constructor(
    pMultipleTrusteeCtorArg: MutPtr<TrusteeW>,
    public var multipleTrusteeOperation: MultipleTrusteeOperation,
    public var trusteeForm: TrusteeForm,
    public var trusteeType: TrusteeType,
    ptstrNameCtorArg: Pwstr,
) {
    public var pMultipleTrustee: MutPtr<TrusteeW> = pMultipleTrusteeCtorArg
        internal set

    public var ptstrName: Pwstr = ptstrNameCtorArg
        internal set

    public constructor() : this(
        pMultipleTrusteeCtorArg = MutPtr(0L),
        multipleTrusteeOperation = 0,
        trusteeForm = 0,
        trusteeType = 0,
        ptstrNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<TrusteeW> = this.pMultipleTrustee

    public operator fun component2(): MultipleTrusteeOperation = this.multipleTrusteeOperation

    public operator fun component3(): TrusteeForm = this.trusteeForm

    public operator fun component4(): TrusteeType = this.trusteeType

    public operator fun component5(): Pwstr = this.ptstrName

    public fun copy(pMultipleTrustee: MutPtr<TrusteeW> = this.pMultipleTrustee, multipleTrusteeOperation: MultipleTrusteeOperation = this.multipleTrusteeOperation, trusteeForm: TrusteeForm = this.trusteeForm, trusteeType: TrusteeType = this.trusteeType, ptstrName: Pwstr = this.ptstrName): TrusteeW = TrusteeW(pMultipleTrusteeCtorArg = pMultipleTrustee, multipleTrusteeOperation = multipleTrusteeOperation, trusteeForm = trusteeForm, trusteeType = trusteeType, ptstrNameCtorArg = ptstrName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TrusteeW) return false
        if (this.pMultipleTrustee != other.pMultipleTrustee) return false
        if (this.multipleTrusteeOperation != other.multipleTrusteeOperation) return false
        if (this.trusteeForm != other.trusteeForm) return false
        if (this.trusteeType != other.trusteeType) return false
        if (this.ptstrName != other.ptstrName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pMultipleTrustee.hashCode()
        result = 31 * result + this.multipleTrusteeOperation.hashCode()
        result = 31 * result + this.trusteeForm.hashCode()
        result = 31 * result + this.trusteeType.hashCode()
        result = 31 * result + this.ptstrName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pMultipleTrustee: MutPtr<TrusteeW> = MutPtr(0L),
            multipleTrusteeOperation: MultipleTrusteeOperation = 0,
            trusteeForm: TrusteeForm = 0,
            trusteeType: TrusteeType = 0,
            ptstrName: Pwstr = MutPtr(0L),
        ): TrusteeW =
            TrusteeW(
                pMultipleTrusteeCtorArg = pMultipleTrustee,
                multipleTrusteeOperation = multipleTrusteeOperation,
                trusteeForm = trusteeForm,
                trusteeType = trusteeType,
                ptstrNameCtorArg = ptstrName,
            )
    }
}
