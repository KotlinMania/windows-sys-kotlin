@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.ldap

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr

public class BerElement internal constructor(
    opaqueCtorArg: Pstr,
) {
    public var opaque: Pstr = opaqueCtorArg
        internal set

    public constructor() : this(
        opaqueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.opaque

    public fun copy(opaque: Pstr = this.opaque): BerElement = BerElement(opaqueCtorArg = opaque)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BerElement) return false
        if (this.opaque != other.opaque) return false
        return true
    }

    override fun hashCode(): Int = this.opaque.hashCode()

    public companion object {
        public operator fun invoke(
            opaque: Pstr = MutPtr(0L),
        ): BerElement =
            BerElement(
                opaqueCtorArg = opaque,
            )
    }
}

public class Ldap internal constructor(
    public var ldSb: Ldap0,
    ldHostCtorArg: Pstr,
    public var ldVersion: UInt,
    public var ldLberoptions: UByte,
    public var ldDeref: UInt,
    public var ldTimelimit: UInt,
    public var ldSizelimit: UInt,
    public var ldErrno: UInt,
    ldMatchedCtorArg: Pstr,
    ldErrorCtorArg: Pstr,
    public var ldMsgid: UInt,
    public var reserved3: UByteArray,
    public var ldCldaptries: UInt,
    public var ldCldaptimeout: UInt,
    public var ldRefhoplimit: UInt,
    public var ldOptions: UInt,
) {
    public var ldHost: Pstr = ldHostCtorArg
        internal set

    public var ldMatched: Pstr = ldMatchedCtorArg
        internal set

    public var ldError: Pstr = ldErrorCtorArg
        internal set

    public constructor() : this(
        ldSb = Ldap0(),
        ldHostCtorArg = MutPtr(0L),
        ldVersion = 0u,
        ldLberoptions = 0u,
        ldDeref = 0u,
        ldTimelimit = 0u,
        ldSizelimit = 0u,
        ldErrno = 0u,
        ldMatchedCtorArg = MutPtr(0L),
        ldErrorCtorArg = MutPtr(0L),
        ldMsgid = 0u,
        reserved3 = UByteArray(25),
        ldCldaptries = 0u,
        ldCldaptimeout = 0u,
        ldRefhoplimit = 0u,
        ldOptions = 0u,
    )

    public operator fun component1(): Ldap0 = this.ldSb

    public operator fun component2(): Pstr = this.ldHost

    public operator fun component3(): UInt = this.ldVersion

    public operator fun component4(): UByte = this.ldLberoptions

    public operator fun component5(): UInt = this.ldDeref

    public operator fun component6(): UInt = this.ldTimelimit

    public operator fun component7(): UInt = this.ldSizelimit

    public operator fun component8(): UInt = this.ldErrno

    public operator fun component9(): Pstr = this.ldMatched

    public operator fun component10(): Pstr = this.ldError

    public operator fun component11(): UInt = this.ldMsgid

    public operator fun component12(): UByteArray = this.reserved3

    public operator fun component13(): UInt = this.ldCldaptries

    public operator fun component14(): UInt = this.ldCldaptimeout

    public operator fun component15(): UInt = this.ldRefhoplimit

    public operator fun component16(): UInt = this.ldOptions

    public fun copy(ldSb: Ldap0 = this.ldSb, ldHost: Pstr = this.ldHost, ldVersion: UInt = this.ldVersion, ldLberoptions: UByte = this.ldLberoptions, ldDeref: UInt = this.ldDeref, ldTimelimit: UInt = this.ldTimelimit, ldSizelimit: UInt = this.ldSizelimit, ldErrno: UInt = this.ldErrno, ldMatched: Pstr = this.ldMatched, ldError: Pstr = this.ldError, ldMsgid: UInt = this.ldMsgid, reserved3: UByteArray = this.reserved3, ldCldaptries: UInt = this.ldCldaptries, ldCldaptimeout: UInt = this.ldCldaptimeout, ldRefhoplimit: UInt = this.ldRefhoplimit, ldOptions: UInt = this.ldOptions): Ldap = Ldap(ldSb = ldSb, ldHostCtorArg = ldHost, ldVersion = ldVersion, ldLberoptions = ldLberoptions, ldDeref = ldDeref, ldTimelimit = ldTimelimit, ldSizelimit = ldSizelimit, ldErrno = ldErrno, ldMatchedCtorArg = ldMatched, ldErrorCtorArg = ldError, ldMsgid = ldMsgid, reserved3 = reserved3, ldCldaptries = ldCldaptries, ldCldaptimeout = ldCldaptimeout, ldRefhoplimit = ldRefhoplimit, ldOptions = ldOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ldap) return false
        if (this.ldSb != other.ldSb) return false
        if (this.ldHost != other.ldHost) return false
        if (this.ldVersion != other.ldVersion) return false
        if (this.ldLberoptions != other.ldLberoptions) return false
        if (this.ldDeref != other.ldDeref) return false
        if (this.ldTimelimit != other.ldTimelimit) return false
        if (this.ldSizelimit != other.ldSizelimit) return false
        if (this.ldErrno != other.ldErrno) return false
        if (this.ldMatched != other.ldMatched) return false
        if (this.ldError != other.ldError) return false
        if (this.ldMsgid != other.ldMsgid) return false
        if (!this.reserved3.contentEquals(other.reserved3)) return false
        if (this.ldCldaptries != other.ldCldaptries) return false
        if (this.ldCldaptimeout != other.ldCldaptimeout) return false
        if (this.ldRefhoplimit != other.ldRefhoplimit) return false
        if (this.ldOptions != other.ldOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ldSb.hashCode()
        result = 31 * result + this.ldHost.hashCode()
        result = 31 * result + this.ldVersion.hashCode()
        result = 31 * result + this.ldLberoptions.hashCode()
        result = 31 * result + this.ldDeref.hashCode()
        result = 31 * result + this.ldTimelimit.hashCode()
        result = 31 * result + this.ldSizelimit.hashCode()
        result = 31 * result + this.ldErrno.hashCode()
        result = 31 * result + this.ldMatched.hashCode()
        result = 31 * result + this.ldError.hashCode()
        result = 31 * result + this.ldMsgid.hashCode()
        result = 31 * result + this.reserved3.contentHashCode()
        result = 31 * result + this.ldCldaptries.hashCode()
        result = 31 * result + this.ldCldaptimeout.hashCode()
        result = 31 * result + this.ldRefhoplimit.hashCode()
        result = 31 * result + this.ldOptions.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ldSb: Ldap0 = Ldap0(),
            ldHost: Pstr = MutPtr(0L),
            ldVersion: UInt = 0u,
            ldLberoptions: UByte = 0u,
            ldDeref: UInt = 0u,
            ldTimelimit: UInt = 0u,
            ldSizelimit: UInt = 0u,
            ldErrno: UInt = 0u,
            ldMatched: Pstr = MutPtr(0L),
            ldError: Pstr = MutPtr(0L),
            ldMsgid: UInt = 0u,
            reserved3: UByteArray = UByteArray(25),
            ldCldaptries: UInt = 0u,
            ldCldaptimeout: UInt = 0u,
            ldRefhoplimit: UInt = 0u,
            ldOptions: UInt = 0u,
        ): Ldap =
            Ldap(
                ldSb = ldSb,
                ldHostCtorArg = ldHost,
                ldVersion = ldVersion,
                ldLberoptions = ldLberoptions,
                ldDeref = ldDeref,
                ldTimelimit = ldTimelimit,
                ldSizelimit = ldSizelimit,
                ldErrno = ldErrno,
                ldMatchedCtorArg = ldMatched,
                ldErrorCtorArg = ldError,
                ldMsgid = ldMsgid,
                reserved3 = reserved3,
                ldCldaptries = ldCldaptries,
                ldCldaptimeout = ldCldaptimeout,
                ldRefhoplimit = ldRefhoplimit,
                ldOptions = ldOptions,
            )
    }
}

public data class Ldap0(
    public var sbSd: Int = 0,
    public var reserved1: UByteArray = UByteArray(41),
    public var sbNaddr: Int = 0,
    public var reserved2: UByteArray = UByteArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ldap0) return false
        if (this.sbSd != other.sbSd) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.sbNaddr != other.sbNaddr) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sbSd.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.sbNaddr.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ldap0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ldap0> {
                override val sizeBytes: Long = 88L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Ldap0 =
                    Ldap0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (41).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (24).toInt())
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: Ldap0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.sbSd)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (41).toInt())
                    ).writeNative(addr + 8L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 56L, value.sbNaddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (24).toInt())
                    ).writeNative(addr + 64L, value.reserved2)
                }
            }
    }
}

public class LDAPAPIFeatureInfoA internal constructor(
    public var ldapaifInfoVersion: Int,
    ldapaifNameCtorArg: Pstr,
    public var ldapaifVersion: Int,
) {
    public var ldapaifName: Pstr = ldapaifNameCtorArg
        internal set

    public constructor() : this(
        ldapaifInfoVersion = 0,
        ldapaifNameCtorArg = MutPtr(0L),
        ldapaifVersion = 0,
    )

    public operator fun component1(): Int = this.ldapaifInfoVersion

    public operator fun component2(): Pstr = this.ldapaifName

    public operator fun component3(): Int = this.ldapaifVersion

    public fun copy(ldapaifInfoVersion: Int = this.ldapaifInfoVersion, ldapaifName: Pstr = this.ldapaifName, ldapaifVersion: Int = this.ldapaifVersion): LDAPAPIFeatureInfoA = LDAPAPIFeatureInfoA(ldapaifInfoVersion = ldapaifInfoVersion, ldapaifNameCtorArg = ldapaifName, ldapaifVersion = ldapaifVersion)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LDAPAPIFeatureInfoA) return false
        if (this.ldapaifInfoVersion != other.ldapaifInfoVersion) return false
        if (this.ldapaifName != other.ldapaifName) return false
        if (this.ldapaifVersion != other.ldapaifVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ldapaifInfoVersion.hashCode()
        result = 31 * result + this.ldapaifName.hashCode()
        result = 31 * result + this.ldapaifVersion.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ldapaifInfoVersion: Int = 0,
            ldapaifName: Pstr = MutPtr(0L),
            ldapaifVersion: Int = 0,
        ): LDAPAPIFeatureInfoA =
            LDAPAPIFeatureInfoA(
                ldapaifInfoVersion = ldapaifInfoVersion,
                ldapaifNameCtorArg = ldapaifName,
                ldapaifVersion = ldapaifVersion,
            )
    }
}

public class LDAPAPIFeatureInfoW internal constructor(
    public var ldapaifInfoVersion: Int,
    ldapaifNameCtorArg: Pwstr,
    public var ldapaifVersion: Int,
) {
    public var ldapaifName: Pwstr = ldapaifNameCtorArg
        internal set

    public constructor() : this(
        ldapaifInfoVersion = 0,
        ldapaifNameCtorArg = MutPtr(0L),
        ldapaifVersion = 0,
    )

    public operator fun component1(): Int = this.ldapaifInfoVersion

    public operator fun component2(): Pwstr = this.ldapaifName

    public operator fun component3(): Int = this.ldapaifVersion

    public fun copy(ldapaifInfoVersion: Int = this.ldapaifInfoVersion, ldapaifName: Pwstr = this.ldapaifName, ldapaifVersion: Int = this.ldapaifVersion): LDAPAPIFeatureInfoW = LDAPAPIFeatureInfoW(ldapaifInfoVersion = ldapaifInfoVersion, ldapaifNameCtorArg = ldapaifName, ldapaifVersion = ldapaifVersion)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LDAPAPIFeatureInfoW) return false
        if (this.ldapaifInfoVersion != other.ldapaifInfoVersion) return false
        if (this.ldapaifName != other.ldapaifName) return false
        if (this.ldapaifVersion != other.ldapaifVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ldapaifInfoVersion.hashCode()
        result = 31 * result + this.ldapaifName.hashCode()
        result = 31 * result + this.ldapaifVersion.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ldapaifInfoVersion: Int = 0,
            ldapaifName: Pwstr = MutPtr(0L),
            ldapaifVersion: Int = 0,
        ): LDAPAPIFeatureInfoW =
            LDAPAPIFeatureInfoW(
                ldapaifInfoVersion = ldapaifInfoVersion,
                ldapaifNameCtorArg = ldapaifName,
                ldapaifVersion = ldapaifVersion,
            )
    }
}

public class LDAPAPIInfoA internal constructor(
    public var ldapaiInfoVersion: Int,
    public var ldapaiApiVersion: Int,
    public var ldapaiProtocolVersion: Int,
    ldapaiExtensionsCtorArg: MutPtr<MutPtr<Byte>>,
    ldapaiVendorNameCtorArg: Pstr,
    public var ldapaiVendorVersion: Int,
) {
    public var ldapaiExtensions: MutPtr<MutPtr<Byte>> = ldapaiExtensionsCtorArg
        internal set

    public var ldapaiVendorName: Pstr = ldapaiVendorNameCtorArg
        internal set

    public constructor() : this(
        ldapaiInfoVersion = 0,
        ldapaiApiVersion = 0,
        ldapaiProtocolVersion = 0,
        ldapaiExtensionsCtorArg = MutPtr(0L),
        ldapaiVendorNameCtorArg = MutPtr(0L),
        ldapaiVendorVersion = 0,
    )

    public operator fun component1(): Int = this.ldapaiInfoVersion

    public operator fun component2(): Int = this.ldapaiApiVersion

    public operator fun component3(): Int = this.ldapaiProtocolVersion

    public operator fun component4(): MutPtr<MutPtr<Byte>> = this.ldapaiExtensions

    public operator fun component5(): Pstr = this.ldapaiVendorName

    public operator fun component6(): Int = this.ldapaiVendorVersion

    public fun copy(ldapaiInfoVersion: Int = this.ldapaiInfoVersion, ldapaiApiVersion: Int = this.ldapaiApiVersion, ldapaiProtocolVersion: Int = this.ldapaiProtocolVersion, ldapaiExtensions: MutPtr<MutPtr<Byte>> = this.ldapaiExtensions, ldapaiVendorName: Pstr = this.ldapaiVendorName, ldapaiVendorVersion: Int = this.ldapaiVendorVersion): LDAPAPIInfoA = LDAPAPIInfoA(ldapaiInfoVersion = ldapaiInfoVersion, ldapaiApiVersion = ldapaiApiVersion, ldapaiProtocolVersion = ldapaiProtocolVersion, ldapaiExtensionsCtorArg = ldapaiExtensions, ldapaiVendorNameCtorArg = ldapaiVendorName, ldapaiVendorVersion = ldapaiVendorVersion)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LDAPAPIInfoA) return false
        if (this.ldapaiInfoVersion != other.ldapaiInfoVersion) return false
        if (this.ldapaiApiVersion != other.ldapaiApiVersion) return false
        if (this.ldapaiProtocolVersion != other.ldapaiProtocolVersion) return false
        if (this.ldapaiExtensions != other.ldapaiExtensions) return false
        if (this.ldapaiVendorName != other.ldapaiVendorName) return false
        if (this.ldapaiVendorVersion != other.ldapaiVendorVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ldapaiInfoVersion.hashCode()
        result = 31 * result + this.ldapaiApiVersion.hashCode()
        result = 31 * result + this.ldapaiProtocolVersion.hashCode()
        result = 31 * result + this.ldapaiExtensions.hashCode()
        result = 31 * result + this.ldapaiVendorName.hashCode()
        result = 31 * result + this.ldapaiVendorVersion.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ldapaiInfoVersion: Int = 0,
            ldapaiApiVersion: Int = 0,
            ldapaiProtocolVersion: Int = 0,
            ldapaiExtensions: MutPtr<MutPtr<Byte>> = MutPtr(0L),
            ldapaiVendorName: Pstr = MutPtr(0L),
            ldapaiVendorVersion: Int = 0,
        ): LDAPAPIInfoA =
            LDAPAPIInfoA(
                ldapaiInfoVersion = ldapaiInfoVersion,
                ldapaiApiVersion = ldapaiApiVersion,
                ldapaiProtocolVersion = ldapaiProtocolVersion,
                ldapaiExtensionsCtorArg = ldapaiExtensions,
                ldapaiVendorNameCtorArg = ldapaiVendorName,
                ldapaiVendorVersion = ldapaiVendorVersion,
            )
    }
}

public class LDAPAPIInfoW internal constructor(
    public var ldapaiInfoVersion: Int,
    public var ldapaiApiVersion: Int,
    public var ldapaiProtocolVersion: Int,
    ldapaiExtensionsCtorArg: MutPtr<Pwstr>,
    ldapaiVendorNameCtorArg: Pwstr,
    public var ldapaiVendorVersion: Int,
) {
    public var ldapaiExtensions: MutPtr<Pwstr> = ldapaiExtensionsCtorArg
        internal set

    public var ldapaiVendorName: Pwstr = ldapaiVendorNameCtorArg
        internal set

    public constructor() : this(
        ldapaiInfoVersion = 0,
        ldapaiApiVersion = 0,
        ldapaiProtocolVersion = 0,
        ldapaiExtensionsCtorArg = MutPtr(0L),
        ldapaiVendorNameCtorArg = MutPtr(0L),
        ldapaiVendorVersion = 0,
    )

    public operator fun component1(): Int = this.ldapaiInfoVersion

    public operator fun component2(): Int = this.ldapaiApiVersion

    public operator fun component3(): Int = this.ldapaiProtocolVersion

    public operator fun component4(): MutPtr<Pwstr> = this.ldapaiExtensions

    public operator fun component5(): Pwstr = this.ldapaiVendorName

    public operator fun component6(): Int = this.ldapaiVendorVersion

    public fun copy(ldapaiInfoVersion: Int = this.ldapaiInfoVersion, ldapaiApiVersion: Int = this.ldapaiApiVersion, ldapaiProtocolVersion: Int = this.ldapaiProtocolVersion, ldapaiExtensions: MutPtr<Pwstr> = this.ldapaiExtensions, ldapaiVendorName: Pwstr = this.ldapaiVendorName, ldapaiVendorVersion: Int = this.ldapaiVendorVersion): LDAPAPIInfoW = LDAPAPIInfoW(ldapaiInfoVersion = ldapaiInfoVersion, ldapaiApiVersion = ldapaiApiVersion, ldapaiProtocolVersion = ldapaiProtocolVersion, ldapaiExtensionsCtorArg = ldapaiExtensions, ldapaiVendorNameCtorArg = ldapaiVendorName, ldapaiVendorVersion = ldapaiVendorVersion)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LDAPAPIInfoW) return false
        if (this.ldapaiInfoVersion != other.ldapaiInfoVersion) return false
        if (this.ldapaiApiVersion != other.ldapaiApiVersion) return false
        if (this.ldapaiProtocolVersion != other.ldapaiProtocolVersion) return false
        if (this.ldapaiExtensions != other.ldapaiExtensions) return false
        if (this.ldapaiVendorName != other.ldapaiVendorName) return false
        if (this.ldapaiVendorVersion != other.ldapaiVendorVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ldapaiInfoVersion.hashCode()
        result = 31 * result + this.ldapaiApiVersion.hashCode()
        result = 31 * result + this.ldapaiProtocolVersion.hashCode()
        result = 31 * result + this.ldapaiExtensions.hashCode()
        result = 31 * result + this.ldapaiVendorName.hashCode()
        result = 31 * result + this.ldapaiVendorVersion.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ldapaiInfoVersion: Int = 0,
            ldapaiApiVersion: Int = 0,
            ldapaiProtocolVersion: Int = 0,
            ldapaiExtensions: MutPtr<Pwstr> = MutPtr(0L),
            ldapaiVendorName: Pwstr = MutPtr(0L),
            ldapaiVendorVersion: Int = 0,
        ): LDAPAPIInfoW =
            LDAPAPIInfoW(
                ldapaiInfoVersion = ldapaiInfoVersion,
                ldapaiApiVersion = ldapaiApiVersion,
                ldapaiProtocolVersion = ldapaiProtocolVersion,
                ldapaiExtensionsCtorArg = ldapaiExtensions,
                ldapaiVendorNameCtorArg = ldapaiVendorName,
                ldapaiVendorVersion = ldapaiVendorVersion,
            )
    }
}

public class LDAPControlA internal constructor(
    ldctlOidCtorArg: Pstr,
    public var ldctlValue: LdapBerval,
    public var ldctlIscritical: Boolean,
) {
    public var ldctlOid: Pstr = ldctlOidCtorArg
        internal set

    public constructor() : this(
        ldctlOidCtorArg = MutPtr(0L),
        ldctlValue = LdapBerval(),
        ldctlIscritical = false,
    )

    public operator fun component1(): Pstr = this.ldctlOid

    public operator fun component2(): LdapBerval = this.ldctlValue

    public operator fun component3(): Boolean = this.ldctlIscritical

    public fun copy(ldctlOid: Pstr = this.ldctlOid, ldctlValue: LdapBerval = this.ldctlValue, ldctlIscritical: Boolean = this.ldctlIscritical): LDAPControlA = LDAPControlA(ldctlOidCtorArg = ldctlOid, ldctlValue = ldctlValue, ldctlIscritical = ldctlIscritical)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LDAPControlA) return false
        if (this.ldctlOid != other.ldctlOid) return false
        if (this.ldctlValue != other.ldctlValue) return false
        if (this.ldctlIscritical != other.ldctlIscritical) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ldctlOid.hashCode()
        result = 31 * result + this.ldctlValue.hashCode()
        result = 31 * result + this.ldctlIscritical.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ldctlOid: Pstr = MutPtr(0L),
            ldctlValue: LdapBerval = LdapBerval(),
            ldctlIscritical: Boolean = false,
        ): LDAPControlA =
            LDAPControlA(
                ldctlOidCtorArg = ldctlOid,
                ldctlValue = ldctlValue,
                ldctlIscritical = ldctlIscritical,
            )
    }
}

public class LDAPControlW internal constructor(
    ldctlOidCtorArg: Pwstr,
    public var ldctlValue: LdapBerval,
    public var ldctlIscritical: Boolean,
) {
    public var ldctlOid: Pwstr = ldctlOidCtorArg
        internal set

    public constructor() : this(
        ldctlOidCtorArg = MutPtr(0L),
        ldctlValue = LdapBerval(),
        ldctlIscritical = false,
    )

    public operator fun component1(): Pwstr = this.ldctlOid

    public operator fun component2(): LdapBerval = this.ldctlValue

    public operator fun component3(): Boolean = this.ldctlIscritical

    public fun copy(ldctlOid: Pwstr = this.ldctlOid, ldctlValue: LdapBerval = this.ldctlValue, ldctlIscritical: Boolean = this.ldctlIscritical): LDAPControlW = LDAPControlW(ldctlOidCtorArg = ldctlOid, ldctlValue = ldctlValue, ldctlIscritical = ldctlIscritical)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LDAPControlW) return false
        if (this.ldctlOid != other.ldctlOid) return false
        if (this.ldctlValue != other.ldctlValue) return false
        if (this.ldctlIscritical != other.ldctlIscritical) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ldctlOid.hashCode()
        result = 31 * result + this.ldctlValue.hashCode()
        result = 31 * result + this.ldctlIscritical.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ldctlOid: Pwstr = MutPtr(0L),
            ldctlValue: LdapBerval = LdapBerval(),
            ldctlIscritical: Boolean = false,
        ): LDAPControlW =
            LDAPControlW(
                ldctlOidCtorArg = ldctlOid,
                ldctlValue = ldctlValue,
                ldctlIscritical = ldctlIscritical,
            )
    }
}

public class LDAPMessage internal constructor(
    public var lmMsgid: UInt,
    public var lmMsgtype: UInt,
    lmBerCtorArg: MutPtr<CVoid>,
    lmChainCtorArg: MutPtr<LDAPMessage>,
    lmNextCtorArg: MutPtr<LDAPMessage>,
    public var lmTime: UInt,
    connectionCtorArg: MutPtr<Ldap>,
    requestCtorArg: MutPtr<CVoid>,
    public var lmReturncode: UInt,
    public var lmReferral: UShort,
    public var lmChased: Boolean,
    public var lmEom: Boolean,
    public var connectionReferenced: Boolean,
) {
    public var lmBer: MutPtr<CVoid> = lmBerCtorArg
        internal set

    public var lmChain: MutPtr<LDAPMessage> = lmChainCtorArg
        internal set

    public var lmNext: MutPtr<LDAPMessage> = lmNextCtorArg
        internal set

    public var connection: MutPtr<Ldap> = connectionCtorArg
        internal set

    public var request: MutPtr<CVoid> = requestCtorArg
        internal set

    public constructor() : this(
        lmMsgid = 0u,
        lmMsgtype = 0u,
        lmBerCtorArg = MutPtr(0L),
        lmChainCtorArg = MutPtr(0L),
        lmNextCtorArg = MutPtr(0L),
        lmTime = 0u,
        connectionCtorArg = MutPtr(0L),
        requestCtorArg = MutPtr(0L),
        lmReturncode = 0u,
        lmReferral = 0u,
        lmChased = false,
        lmEom = false,
        connectionReferenced = false,
    )

    public operator fun component1(): UInt = this.lmMsgid

    public operator fun component2(): UInt = this.lmMsgtype

    public operator fun component3(): MutPtr<CVoid> = this.lmBer

    public operator fun component4(): MutPtr<LDAPMessage> = this.lmChain

    public operator fun component5(): MutPtr<LDAPMessage> = this.lmNext

    public operator fun component6(): UInt = this.lmTime

    public operator fun component7(): MutPtr<Ldap> = this.connection

    public operator fun component8(): MutPtr<CVoid> = this.request

    public operator fun component9(): UInt = this.lmReturncode

    public operator fun component10(): UShort = this.lmReferral

    public operator fun component11(): Boolean = this.lmChased

    public operator fun component12(): Boolean = this.lmEom

    public operator fun component13(): Boolean = this.connectionReferenced

    public fun copy(lmMsgid: UInt = this.lmMsgid, lmMsgtype: UInt = this.lmMsgtype, lmBer: MutPtr<CVoid> = this.lmBer, lmChain: MutPtr<LDAPMessage> = this.lmChain, lmNext: MutPtr<LDAPMessage> = this.lmNext, lmTime: UInt = this.lmTime, connection: MutPtr<Ldap> = this.connection, request: MutPtr<CVoid> = this.request, lmReturncode: UInt = this.lmReturncode, lmReferral: UShort = this.lmReferral, lmChased: Boolean = this.lmChased, lmEom: Boolean = this.lmEom, connectionReferenced: Boolean = this.connectionReferenced): LDAPMessage = LDAPMessage(lmMsgid = lmMsgid, lmMsgtype = lmMsgtype, lmBerCtorArg = lmBer, lmChainCtorArg = lmChain, lmNextCtorArg = lmNext, lmTime = lmTime, connectionCtorArg = connection, requestCtorArg = request, lmReturncode = lmReturncode, lmReferral = lmReferral, lmChased = lmChased, lmEom = lmEom, connectionReferenced = connectionReferenced)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LDAPMessage) return false
        if (this.lmMsgid != other.lmMsgid) return false
        if (this.lmMsgtype != other.lmMsgtype) return false
        if (this.lmBer != other.lmBer) return false
        if (this.lmChain != other.lmChain) return false
        if (this.lmNext != other.lmNext) return false
        if (this.lmTime != other.lmTime) return false
        if (this.connection != other.connection) return false
        if (this.request != other.request) return false
        if (this.lmReturncode != other.lmReturncode) return false
        if (this.lmReferral != other.lmReferral) return false
        if (this.lmChased != other.lmChased) return false
        if (this.lmEom != other.lmEom) return false
        if (this.connectionReferenced != other.connectionReferenced) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lmMsgid.hashCode()
        result = 31 * result + this.lmMsgtype.hashCode()
        result = 31 * result + this.lmBer.hashCode()
        result = 31 * result + this.lmChain.hashCode()
        result = 31 * result + this.lmNext.hashCode()
        result = 31 * result + this.lmTime.hashCode()
        result = 31 * result + this.connection.hashCode()
        result = 31 * result + this.request.hashCode()
        result = 31 * result + this.lmReturncode.hashCode()
        result = 31 * result + this.lmReferral.hashCode()
        result = 31 * result + this.lmChased.hashCode()
        result = 31 * result + this.lmEom.hashCode()
        result = 31 * result + this.connectionReferenced.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LDAPMessage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LDAPMessage> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LDAPMessage =
                    LDAPMessage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<LDAPMessage>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<LDAPMessage>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Ldap>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 62L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 63L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: LDAPMessage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lmMsgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lmMsgtype)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.lmBer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<LDAPMessage>(64)
                    ).writeNative(addr + 16L, value.lmChain)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<LDAPMessage>(64)
                    ).writeNative(addr + 24L, value.lmNext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.lmTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Ldap>(64)
                    ).writeNative(addr + 40L, value.connection)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.request)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.lmReturncode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 60L, value.lmReferral)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 62L, value.lmChased)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 63L, value.lmEom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 64L, value.connectionReferenced)
                }
            }

        public operator fun invoke(
            lmMsgid: UInt = 0u,
            lmMsgtype: UInt = 0u,
            lmBer: MutPtr<CVoid> = MutPtr(0L),
            lmChain: MutPtr<LDAPMessage> = MutPtr(0L),
            lmNext: MutPtr<LDAPMessage> = MutPtr(0L),
            lmTime: UInt = 0u,
            connection: MutPtr<Ldap> = MutPtr(0L),
            request: MutPtr<CVoid> = MutPtr(0L),
            lmReturncode: UInt = 0u,
            lmReferral: UShort = 0u,
            lmChased: Boolean = false,
            lmEom: Boolean = false,
            connectionReferenced: Boolean = false,
        ): LDAPMessage =
            LDAPMessage(
                lmMsgid = lmMsgid,
                lmMsgtype = lmMsgtype,
                lmBerCtorArg = lmBer,
                lmChainCtorArg = lmChain,
                lmNextCtorArg = lmNext,
                lmTime = lmTime,
                connectionCtorArg = connection,
                requestCtorArg = request,
                lmReturncode = lmReturncode,
                lmReferral = lmReferral,
                lmChased = lmChased,
                lmEom = lmEom,
                connectionReferenced = connectionReferenced,
            )
    }
}

public class LDAPModA internal constructor(
    public var modOp: UInt,
    modTypeCtorArg: Pstr,
    public var modVals: LdapmodA0,
) {
    public var modType: Pstr = modTypeCtorArg
        internal set

    public constructor() : this(
        modOp = 0u,
        modTypeCtorArg = MutPtr(0L),
        modVals = LdapmodA0(),
    )

    public operator fun component1(): UInt = this.modOp

    public operator fun component2(): Pstr = this.modType

    public operator fun component3(): LdapmodA0 = this.modVals

    public fun copy(modOp: UInt = this.modOp, modType: Pstr = this.modType, modVals: LdapmodA0 = this.modVals): LDAPModA = LDAPModA(modOp = modOp, modTypeCtorArg = modType, modVals = modVals)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LDAPModA) return false
        if (this.modOp != other.modOp) return false
        if (this.modType != other.modType) return false
        if (this.modVals != other.modVals) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.modOp.hashCode()
        result = 31 * result + this.modType.hashCode()
        result = 31 * result + this.modVals.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            modOp: UInt = 0u,
            modType: Pstr = MutPtr(0L),
            modVals: LdapmodA0 = LdapmodA0(),
        ): LDAPModA =
            LDAPModA(
                modOp = modOp,
                modTypeCtorArg = modType,
                modVals = modVals,
            )
    }
}

public class LdapmodA0 internal constructor(
    modvStrvalsCtorArg: MutPtr<Pstr>,
    modvBvalsCtorArg: MutPtr<MutPtr<LdapBerval>>,
) {
    public var modvStrvals: MutPtr<Pstr> = modvStrvalsCtorArg
        internal set

    public var modvBvals: MutPtr<MutPtr<LdapBerval>> = modvBvalsCtorArg
        internal set

    public constructor() : this(
        modvStrvalsCtorArg = MutPtr(0L),
        modvBvalsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Pstr> = this.modvStrvals

    public operator fun component2(): MutPtr<MutPtr<LdapBerval>> = this.modvBvals

    public fun copy(modvStrvals: MutPtr<Pstr> = this.modvStrvals, modvBvals: MutPtr<MutPtr<LdapBerval>> = this.modvBvals): LdapmodA0 = LdapmodA0(modvStrvalsCtorArg = modvStrvals, modvBvalsCtorArg = modvBvals)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LdapmodA0) return false
        if (this.modvStrvals != other.modvStrvals) return false
        if (this.modvBvals != other.modvBvals) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.modvStrvals.hashCode()
        result = 31 * result + this.modvBvals.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            modvStrvals: MutPtr<Pstr> = MutPtr(0L),
            modvBvals: MutPtr<MutPtr<LdapBerval>> = MutPtr(0L),
        ): LdapmodA0 =
            LdapmodA0(
                modvStrvalsCtorArg = modvStrvals,
                modvBvalsCtorArg = modvBvals,
            )
    }
}

public class LDAPModW internal constructor(
    public var modOp: UInt,
    modTypeCtorArg: Pwstr,
    public var modVals: LdapmodW0,
) {
    public var modType: Pwstr = modTypeCtorArg
        internal set

    public constructor() : this(
        modOp = 0u,
        modTypeCtorArg = MutPtr(0L),
        modVals = LdapmodW0(),
    )

    public operator fun component1(): UInt = this.modOp

    public operator fun component2(): Pwstr = this.modType

    public operator fun component3(): LdapmodW0 = this.modVals

    public fun copy(modOp: UInt = this.modOp, modType: Pwstr = this.modType, modVals: LdapmodW0 = this.modVals): LDAPModW = LDAPModW(modOp = modOp, modTypeCtorArg = modType, modVals = modVals)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LDAPModW) return false
        if (this.modOp != other.modOp) return false
        if (this.modType != other.modType) return false
        if (this.modVals != other.modVals) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.modOp.hashCode()
        result = 31 * result + this.modType.hashCode()
        result = 31 * result + this.modVals.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            modOp: UInt = 0u,
            modType: Pwstr = MutPtr(0L),
            modVals: LdapmodW0 = LdapmodW0(),
        ): LDAPModW =
            LDAPModW(
                modOp = modOp,
                modTypeCtorArg = modType,
                modVals = modVals,
            )
    }
}

public class LdapmodW0 internal constructor(
    modvStrvalsCtorArg: MutPtr<Pwstr>,
    modvBvalsCtorArg: MutPtr<MutPtr<LdapBerval>>,
) {
    public var modvStrvals: MutPtr<Pwstr> = modvStrvalsCtorArg
        internal set

    public var modvBvals: MutPtr<MutPtr<LdapBerval>> = modvBvalsCtorArg
        internal set

    public constructor() : this(
        modvStrvalsCtorArg = MutPtr(0L),
        modvBvalsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Pwstr> = this.modvStrvals

    public operator fun component2(): MutPtr<MutPtr<LdapBerval>> = this.modvBvals

    public fun copy(modvStrvals: MutPtr<Pwstr> = this.modvStrvals, modvBvals: MutPtr<MutPtr<LdapBerval>> = this.modvBvals): LdapmodW0 = LdapmodW0(modvStrvalsCtorArg = modvStrvals, modvBvalsCtorArg = modvBvals)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LdapmodW0) return false
        if (this.modvStrvals != other.modvStrvals) return false
        if (this.modvBvals != other.modvBvals) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.modvStrvals.hashCode()
        result = 31 * result + this.modvBvals.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            modvStrvals: MutPtr<Pwstr> = MutPtr(0L),
            modvBvals: MutPtr<MutPtr<LdapBerval>> = MutPtr(0L),
        ): LdapmodW0 =
            LdapmodW0(
                modvStrvalsCtorArg = modvStrvals,
                modvBvalsCtorArg = modvBvals,
            )
    }
}

public class LDAPSortKeyA internal constructor(
    skAttrtypeCtorArg: Pstr,
    skMatchruleoidCtorArg: Pstr,
    public var skReverseorder: Boolean,
) {
    public var skAttrtype: Pstr = skAttrtypeCtorArg
        internal set

    public var skMatchruleoid: Pstr = skMatchruleoidCtorArg
        internal set

    public constructor() : this(
        skAttrtypeCtorArg = MutPtr(0L),
        skMatchruleoidCtorArg = MutPtr(0L),
        skReverseorder = false,
    )

    public operator fun component1(): Pstr = this.skAttrtype

    public operator fun component2(): Pstr = this.skMatchruleoid

    public operator fun component3(): Boolean = this.skReverseorder

    public fun copy(skAttrtype: Pstr = this.skAttrtype, skMatchruleoid: Pstr = this.skMatchruleoid, skReverseorder: Boolean = this.skReverseorder): LDAPSortKeyA = LDAPSortKeyA(skAttrtypeCtorArg = skAttrtype, skMatchruleoidCtorArg = skMatchruleoid, skReverseorder = skReverseorder)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LDAPSortKeyA) return false
        if (this.skAttrtype != other.skAttrtype) return false
        if (this.skMatchruleoid != other.skMatchruleoid) return false
        if (this.skReverseorder != other.skReverseorder) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.skAttrtype.hashCode()
        result = 31 * result + this.skMatchruleoid.hashCode()
        result = 31 * result + this.skReverseorder.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            skAttrtype: Pstr = MutPtr(0L),
            skMatchruleoid: Pstr = MutPtr(0L),
            skReverseorder: Boolean = false,
        ): LDAPSortKeyA =
            LDAPSortKeyA(
                skAttrtypeCtorArg = skAttrtype,
                skMatchruleoidCtorArg = skMatchruleoid,
                skReverseorder = skReverseorder,
            )
    }
}

public class LDAPSortKeyW internal constructor(
    skAttrtypeCtorArg: Pwstr,
    skMatchruleoidCtorArg: Pwstr,
    public var skReverseorder: Boolean,
) {
    public var skAttrtype: Pwstr = skAttrtypeCtorArg
        internal set

    public var skMatchruleoid: Pwstr = skMatchruleoidCtorArg
        internal set

    public constructor() : this(
        skAttrtypeCtorArg = MutPtr(0L),
        skMatchruleoidCtorArg = MutPtr(0L),
        skReverseorder = false,
    )

    public operator fun component1(): Pwstr = this.skAttrtype

    public operator fun component2(): Pwstr = this.skMatchruleoid

    public operator fun component3(): Boolean = this.skReverseorder

    public fun copy(skAttrtype: Pwstr = this.skAttrtype, skMatchruleoid: Pwstr = this.skMatchruleoid, skReverseorder: Boolean = this.skReverseorder): LDAPSortKeyW = LDAPSortKeyW(skAttrtypeCtorArg = skAttrtype, skMatchruleoidCtorArg = skMatchruleoid, skReverseorder = skReverseorder)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LDAPSortKeyW) return false
        if (this.skAttrtype != other.skAttrtype) return false
        if (this.skMatchruleoid != other.skMatchruleoid) return false
        if (this.skReverseorder != other.skReverseorder) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.skAttrtype.hashCode()
        result = 31 * result + this.skMatchruleoid.hashCode()
        result = 31 * result + this.skReverseorder.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            skAttrtype: Pwstr = MutPtr(0L),
            skMatchruleoid: Pwstr = MutPtr(0L),
            skReverseorder: Boolean = false,
        ): LDAPSortKeyW =
            LDAPSortKeyW(
                skAttrtypeCtorArg = skAttrtype,
                skMatchruleoidCtorArg = skMatchruleoid,
                skReverseorder = skReverseorder,
            )
    }
}

public class LDAPVLVInfo internal constructor(
    public var ldvlvVersion: Int,
    public var ldvlvBeforeCount: UInt,
    public var ldvlvAfterCount: UInt,
    public var ldvlvOffset: UInt,
    public var ldvlvCount: UInt,
    ldvlvAttrvalueCtorArg: MutPtr<LdapBerval>,
    ldvlvContextCtorArg: MutPtr<LdapBerval>,
    ldvlvExtradataCtorArg: MutPtr<CVoid>,
) {
    public var ldvlvAttrvalue: MutPtr<LdapBerval> = ldvlvAttrvalueCtorArg
        internal set

    public var ldvlvContext: MutPtr<LdapBerval> = ldvlvContextCtorArg
        internal set

    public var ldvlvExtradata: MutPtr<CVoid> = ldvlvExtradataCtorArg
        internal set

    public constructor() : this(
        ldvlvVersion = 0,
        ldvlvBeforeCount = 0u,
        ldvlvAfterCount = 0u,
        ldvlvOffset = 0u,
        ldvlvCount = 0u,
        ldvlvAttrvalueCtorArg = MutPtr(0L),
        ldvlvContextCtorArg = MutPtr(0L),
        ldvlvExtradataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.ldvlvVersion

    public operator fun component2(): UInt = this.ldvlvBeforeCount

    public operator fun component3(): UInt = this.ldvlvAfterCount

    public operator fun component4(): UInt = this.ldvlvOffset

    public operator fun component5(): UInt = this.ldvlvCount

    public operator fun component6(): MutPtr<LdapBerval> = this.ldvlvAttrvalue

    public operator fun component7(): MutPtr<LdapBerval> = this.ldvlvContext

    public operator fun component8(): MutPtr<CVoid> = this.ldvlvExtradata

    public fun copy(ldvlvVersion: Int = this.ldvlvVersion, ldvlvBeforeCount: UInt = this.ldvlvBeforeCount, ldvlvAfterCount: UInt = this.ldvlvAfterCount, ldvlvOffset: UInt = this.ldvlvOffset, ldvlvCount: UInt = this.ldvlvCount, ldvlvAttrvalue: MutPtr<LdapBerval> = this.ldvlvAttrvalue, ldvlvContext: MutPtr<LdapBerval> = this.ldvlvContext, ldvlvExtradata: MutPtr<CVoid> = this.ldvlvExtradata): LDAPVLVInfo = LDAPVLVInfo(ldvlvVersion = ldvlvVersion, ldvlvBeforeCount = ldvlvBeforeCount, ldvlvAfterCount = ldvlvAfterCount, ldvlvOffset = ldvlvOffset, ldvlvCount = ldvlvCount, ldvlvAttrvalueCtorArg = ldvlvAttrvalue, ldvlvContextCtorArg = ldvlvContext, ldvlvExtradataCtorArg = ldvlvExtradata)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LDAPVLVInfo) return false
        if (this.ldvlvVersion != other.ldvlvVersion) return false
        if (this.ldvlvBeforeCount != other.ldvlvBeforeCount) return false
        if (this.ldvlvAfterCount != other.ldvlvAfterCount) return false
        if (this.ldvlvOffset != other.ldvlvOffset) return false
        if (this.ldvlvCount != other.ldvlvCount) return false
        if (this.ldvlvAttrvalue != other.ldvlvAttrvalue) return false
        if (this.ldvlvContext != other.ldvlvContext) return false
        if (this.ldvlvExtradata != other.ldvlvExtradata) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ldvlvVersion.hashCode()
        result = 31 * result + this.ldvlvBeforeCount.hashCode()
        result = 31 * result + this.ldvlvAfterCount.hashCode()
        result = 31 * result + this.ldvlvOffset.hashCode()
        result = 31 * result + this.ldvlvCount.hashCode()
        result = 31 * result + this.ldvlvAttrvalue.hashCode()
        result = 31 * result + this.ldvlvContext.hashCode()
        result = 31 * result + this.ldvlvExtradata.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LDAPVLVInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LDAPVLVInfo> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LDAPVLVInfo =
                    LDAPVLVInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<LdapBerval>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<LdapBerval>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: LDAPVLVInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.ldvlvVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ldvlvBeforeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ldvlvAfterCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ldvlvOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ldvlvCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<LdapBerval>(64)
                    ).writeNative(addr + 24L, value.ldvlvAttrvalue)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<LdapBerval>(64)
                    ).writeNative(addr + 32L, value.ldvlvContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.ldvlvExtradata)
                }
            }

        public operator fun invoke(
            ldvlvVersion: Int = 0,
            ldvlvBeforeCount: UInt = 0u,
            ldvlvAfterCount: UInt = 0u,
            ldvlvOffset: UInt = 0u,
            ldvlvCount: UInt = 0u,
            ldvlvAttrvalue: MutPtr<LdapBerval> = MutPtr(0L),
            ldvlvContext: MutPtr<LdapBerval> = MutPtr(0L),
            ldvlvExtradata: MutPtr<CVoid> = MutPtr(0L),
        ): LDAPVLVInfo =
            LDAPVLVInfo(
                ldvlvVersion = ldvlvVersion,
                ldvlvBeforeCount = ldvlvBeforeCount,
                ldvlvAfterCount = ldvlvAfterCount,
                ldvlvOffset = ldvlvOffset,
                ldvlvCount = ldvlvCount,
                ldvlvAttrvalueCtorArg = ldvlvAttrvalue,
                ldvlvContextCtorArg = ldvlvContext,
                ldvlvExtradataCtorArg = ldvlvExtradata,
            )
    }
}

public class LdapBerval internal constructor(
    public var bvLen: UInt,
    bvValCtorArg: Pstr,
) {
    public var bvVal: Pstr = bvValCtorArg
        internal set

    public constructor() : this(
        bvLen = 0u,
        bvValCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.bvLen

    public operator fun component2(): Pstr = this.bvVal

    public fun copy(bvLen: UInt = this.bvLen, bvVal: Pstr = this.bvVal): LdapBerval = LdapBerval(bvLen = bvLen, bvValCtorArg = bvVal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LdapBerval) return false
        if (this.bvLen != other.bvLen) return false
        if (this.bvVal != other.bvVal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bvLen.hashCode()
        result = 31 * result + this.bvVal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            bvLen: UInt = 0u,
            bvVal: Pstr = MutPtr(0L),
        ): LdapBerval =
            LdapBerval(
                bvLen = bvLen,
                bvValCtorArg = bvVal,
            )
    }
}

public data class LdapReferralCallback(
    public var sizeOfCallbacks: UInt = 0u,
    public var queryForConnection: Queryforconnection = null,
    public var notifyRoutine: Notifyofnewconnection = null,
    public var dereferenceRoutine: Dereferenceconnection = null,
)

public data class LdapTimeval(
    public var tvSec: Int = 0,
    public var tvUsec: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LdapTimeval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LdapTimeval> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): LdapTimeval =
                    LdapTimeval(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: LdapTimeval) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tvSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tvUsec)
                }
            }
    }
}

public data class LdapVersionInfo(
    public var lvSize: UInt = 0u,
    public var lvMajor: UInt = 0u,
    public var lvMinor: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LdapVersionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LdapVersionInfo> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): LdapVersionInfo =
                    LdapVersionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: LdapVersionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lvSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lvMajor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.lvMinor)
                }
            }
    }
}
