@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.credentials

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

public class BinaryBlobCredentialInfo internal constructor(
    public var cbBlob: UInt,
    pbBlobCtorArg: MutPtr,
) {
    public var pbBlob: MutPtr = pbBlobCtorArg
        internal set

    public constructor() : this(
        cbBlob = 0u,
        pbBlobCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbBlob

    public operator fun component2(): MutPtr = this.pbBlob

    public fun copy(cbBlob: UInt = this.cbBlob, pbBlob: MutPtr = this.pbBlob): BinaryBlobCredentialInfo = BinaryBlobCredentialInfo(cbBlob = cbBlob, pbBlobCtorArg = pbBlob)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BinaryBlobCredentialInfo) return false
        if (this.cbBlob != other.cbBlob) return false
        if (this.pbBlob != other.pbBlob) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbBlob.hashCode()
        result = 31 * result + this.pbBlob.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BinaryBlobCredentialInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BinaryBlobCredentialInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BinaryBlobCredentialInfo =
                    BinaryBlobCredentialInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BinaryBlobCredentialInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbBlob)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pbBlob)
                }
            }

        public operator fun invoke(
            cbBlob: UInt = 0u,
            pbBlob: MutPtr = MutPtr(0L),
        ): BinaryBlobCredentialInfo =
            BinaryBlobCredentialInfo(
                cbBlob = cbBlob,
                pbBlobCtorArg = pbBlob,
            )
    }
}

public data class CertCredentialInfo(
    public var cbSize: UInt = 0u,
    public var rgbHashOfCert: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CertCredentialInfo) return false
        if (this.cbSize != other.cbSize) return false
        if (!this.rgbHashOfCert.contentEquals(other.rgbHashOfCert)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.rgbHashOfCert.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertCredentialInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CertCredentialInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CertCredentialInfo =
                    CertCredentialInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: CertCredentialInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 4L, value.rgbHashOfCert.toList())
                }
            }
    }
}

public class Credentiala internal constructor(
    public var flags: CredFlags,
    public var type: CredType,
    targetNameCtorArg: Pstr,
    commentCtorArg: Pstr,
    public var lastWritten: Filetime,
    public var credentialBlobSize: UInt,
    credentialBlobCtorArg: MutPtr,
    public var persist: CredPersist,
    public var attributeCount: UInt,
    attributesCtorArg: MutPtr,
    targetAliasCtorArg: Pstr,
    userNameCtorArg: Pstr,
) {
    public var targetName: Pstr = targetNameCtorArg
        internal set

    public var comment: Pstr = commentCtorArg
        internal set

    public var credentialBlob: MutPtr = credentialBlobCtorArg
        internal set

    public var attributes: MutPtr = attributesCtorArg
        internal set

    public var targetAlias: Pstr = targetAliasCtorArg
        internal set

    public var userName: Pstr = userNameCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        type = 0u,
        targetNameCtorArg = MutPtr(0L),
        commentCtorArg = MutPtr(0L),
        lastWritten = Filetime(),
        credentialBlobSize = 0u,
        credentialBlobCtorArg = MutPtr(0L),
        persist = 0u,
        attributeCount = 0u,
        attributesCtorArg = MutPtr(0L),
        targetAliasCtorArg = MutPtr(0L),
        userNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CredFlags = this.flags

    public operator fun component2(): CredType = this.type

    public operator fun component3(): Pstr = this.targetName

    public operator fun component4(): Pstr = this.comment

    public operator fun component5(): Filetime = this.lastWritten

    public operator fun component6(): UInt = this.credentialBlobSize

    public operator fun component7(): MutPtr = this.credentialBlob

    public operator fun component8(): CredPersist = this.persist

    public operator fun component9(): UInt = this.attributeCount

    public operator fun component10(): MutPtr = this.attributes

    public operator fun component11(): Pstr = this.targetAlias

    public operator fun component12(): Pstr = this.userName

    public fun copy(flags: CredFlags = this.flags, type: CredType = this.type, targetName: Pstr = this.targetName, comment: Pstr = this.comment, lastWritten: Filetime = this.lastWritten, credentialBlobSize: UInt = this.credentialBlobSize, credentialBlob: MutPtr = this.credentialBlob, persist: CredPersist = this.persist, attributeCount: UInt = this.attributeCount, attributes: MutPtr = this.attributes, targetAlias: Pstr = this.targetAlias, userName: Pstr = this.userName): Credentiala = Credentiala(flags = flags, type = type, targetNameCtorArg = targetName, commentCtorArg = comment, lastWritten = lastWritten, credentialBlobSize = credentialBlobSize, credentialBlobCtorArg = credentialBlob, persist = persist, attributeCount = attributeCount, attributesCtorArg = attributes, targetAliasCtorArg = targetAlias, userNameCtorArg = userName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Credentiala) return false
        if (this.flags != other.flags) return false
        if (this.type != other.type) return false
        if (this.targetName != other.targetName) return false
        if (this.comment != other.comment) return false
        if (this.lastWritten != other.lastWritten) return false
        if (this.credentialBlobSize != other.credentialBlobSize) return false
        if (this.credentialBlob != other.credentialBlob) return false
        if (this.persist != other.persist) return false
        if (this.attributeCount != other.attributeCount) return false
        if (this.attributes != other.attributes) return false
        if (this.targetAlias != other.targetAlias) return false
        if (this.userName != other.userName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.targetName.hashCode()
        result = 31 * result + this.comment.hashCode()
        result = 31 * result + this.lastWritten.hashCode()
        result = 31 * result + this.credentialBlobSize.hashCode()
        result = 31 * result + this.credentialBlob.hashCode()
        result = 31 * result + this.persist.hashCode()
        result = 31 * result + this.attributeCount.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.targetAlias.hashCode()
        result = 31 * result + this.userName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: CredFlags = 0u,
            type: CredType = 0u,
            targetName: Pstr = MutPtr(0L),
            comment: Pstr = MutPtr(0L),
            lastWritten: Filetime = Filetime(),
            credentialBlobSize: UInt = 0u,
            credentialBlob: MutPtr = MutPtr(0L),
            persist: CredPersist = 0u,
            attributeCount: UInt = 0u,
            attributes: MutPtr = MutPtr(0L),
            targetAlias: Pstr = MutPtr(0L),
            userName: Pstr = MutPtr(0L),
        ): Credentiala =
            Credentiala(
                flags = flags,
                type = type,
                targetNameCtorArg = targetName,
                commentCtorArg = comment,
                lastWritten = lastWritten,
                credentialBlobSize = credentialBlobSize,
                credentialBlobCtorArg = credentialBlob,
                persist = persist,
                attributeCount = attributeCount,
                attributesCtorArg = attributes,
                targetAliasCtorArg = targetAlias,
                userNameCtorArg = userName,
            )
    }
}

public class Credentialw internal constructor(
    public var flags: CredFlags,
    public var type: CredType,
    targetNameCtorArg: Pwstr,
    commentCtorArg: Pwstr,
    public var lastWritten: Filetime,
    public var credentialBlobSize: UInt,
    credentialBlobCtorArg: MutPtr,
    public var persist: CredPersist,
    public var attributeCount: UInt,
    attributesCtorArg: MutPtr,
    targetAliasCtorArg: Pwstr,
    userNameCtorArg: Pwstr,
) {
    public var targetName: Pwstr = targetNameCtorArg
        internal set

    public var comment: Pwstr = commentCtorArg
        internal set

    public var credentialBlob: MutPtr = credentialBlobCtorArg
        internal set

    public var attributes: MutPtr = attributesCtorArg
        internal set

    public var targetAlias: Pwstr = targetAliasCtorArg
        internal set

    public var userName: Pwstr = userNameCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        type = 0u,
        targetNameCtorArg = MutPtr(0L),
        commentCtorArg = MutPtr(0L),
        lastWritten = Filetime(),
        credentialBlobSize = 0u,
        credentialBlobCtorArg = MutPtr(0L),
        persist = 0u,
        attributeCount = 0u,
        attributesCtorArg = MutPtr(0L),
        targetAliasCtorArg = MutPtr(0L),
        userNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CredFlags = this.flags

    public operator fun component2(): CredType = this.type

    public operator fun component3(): Pwstr = this.targetName

    public operator fun component4(): Pwstr = this.comment

    public operator fun component5(): Filetime = this.lastWritten

    public operator fun component6(): UInt = this.credentialBlobSize

    public operator fun component7(): MutPtr = this.credentialBlob

    public operator fun component8(): CredPersist = this.persist

    public operator fun component9(): UInt = this.attributeCount

    public operator fun component10(): MutPtr = this.attributes

    public operator fun component11(): Pwstr = this.targetAlias

    public operator fun component12(): Pwstr = this.userName

    public fun copy(flags: CredFlags = this.flags, type: CredType = this.type, targetName: Pwstr = this.targetName, comment: Pwstr = this.comment, lastWritten: Filetime = this.lastWritten, credentialBlobSize: UInt = this.credentialBlobSize, credentialBlob: MutPtr = this.credentialBlob, persist: CredPersist = this.persist, attributeCount: UInt = this.attributeCount, attributes: MutPtr = this.attributes, targetAlias: Pwstr = this.targetAlias, userName: Pwstr = this.userName): Credentialw = Credentialw(flags = flags, type = type, targetNameCtorArg = targetName, commentCtorArg = comment, lastWritten = lastWritten, credentialBlobSize = credentialBlobSize, credentialBlobCtorArg = credentialBlob, persist = persist, attributeCount = attributeCount, attributesCtorArg = attributes, targetAliasCtorArg = targetAlias, userNameCtorArg = userName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Credentialw) return false
        if (this.flags != other.flags) return false
        if (this.type != other.type) return false
        if (this.targetName != other.targetName) return false
        if (this.comment != other.comment) return false
        if (this.lastWritten != other.lastWritten) return false
        if (this.credentialBlobSize != other.credentialBlobSize) return false
        if (this.credentialBlob != other.credentialBlob) return false
        if (this.persist != other.persist) return false
        if (this.attributeCount != other.attributeCount) return false
        if (this.attributes != other.attributes) return false
        if (this.targetAlias != other.targetAlias) return false
        if (this.userName != other.userName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.targetName.hashCode()
        result = 31 * result + this.comment.hashCode()
        result = 31 * result + this.lastWritten.hashCode()
        result = 31 * result + this.credentialBlobSize.hashCode()
        result = 31 * result + this.credentialBlob.hashCode()
        result = 31 * result + this.persist.hashCode()
        result = 31 * result + this.attributeCount.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.targetAlias.hashCode()
        result = 31 * result + this.userName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: CredFlags = 0u,
            type: CredType = 0u,
            targetName: Pwstr = MutPtr(0L),
            comment: Pwstr = MutPtr(0L),
            lastWritten: Filetime = Filetime(),
            credentialBlobSize: UInt = 0u,
            credentialBlob: MutPtr = MutPtr(0L),
            persist: CredPersist = 0u,
            attributeCount: UInt = 0u,
            attributes: MutPtr = MutPtr(0L),
            targetAlias: Pwstr = MutPtr(0L),
            userName: Pwstr = MutPtr(0L),
        ): Credentialw =
            Credentialw(
                flags = flags,
                type = type,
                targetNameCtorArg = targetName,
                commentCtorArg = comment,
                lastWritten = lastWritten,
                credentialBlobSize = credentialBlobSize,
                credentialBlobCtorArg = credentialBlob,
                persist = persist,
                attributeCount = attributeCount,
                attributesCtorArg = attributes,
                targetAliasCtorArg = targetAlias,
                userNameCtorArg = userName,
            )
    }
}

public class CredentialAttributea internal constructor(
    keywordCtorArg: Pstr,
    public var flags: UInt,
    public var valueSize: UInt,
    valueCtorArg: MutPtr,
) {
    public var keyword: Pstr = keywordCtorArg
        internal set

    public var value: MutPtr = valueCtorArg
        internal set

    public constructor() : this(
        keywordCtorArg = MutPtr(0L),
        flags = 0u,
        valueSize = 0u,
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.keyword

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): UInt = this.valueSize

    public operator fun component4(): MutPtr = this.value

    public fun copy(keyword: Pstr = this.keyword, flags: UInt = this.flags, valueSize: UInt = this.valueSize, value: MutPtr = this.value): CredentialAttributea = CredentialAttributea(keywordCtorArg = keyword, flags = flags, valueSize = valueSize, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CredentialAttributea) return false
        if (this.keyword != other.keyword) return false
        if (this.flags != other.flags) return false
        if (this.valueSize != other.valueSize) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyword.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            keyword: Pstr = MutPtr(0L),
            flags: UInt = 0u,
            valueSize: UInt = 0u,
            value: MutPtr = MutPtr(0L),
        ): CredentialAttributea =
            CredentialAttributea(
                keywordCtorArg = keyword,
                flags = flags,
                valueSize = valueSize,
                valueCtorArg = value,
            )
    }
}

public class CredentialAttributew internal constructor(
    keywordCtorArg: Pwstr,
    public var flags: UInt,
    public var valueSize: UInt,
    valueCtorArg: MutPtr,
) {
    public var keyword: Pwstr = keywordCtorArg
        internal set

    public var value: MutPtr = valueCtorArg
        internal set

    public constructor() : this(
        keywordCtorArg = MutPtr(0L),
        flags = 0u,
        valueSize = 0u,
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.keyword

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): UInt = this.valueSize

    public operator fun component4(): MutPtr = this.value

    public fun copy(keyword: Pwstr = this.keyword, flags: UInt = this.flags, valueSize: UInt = this.valueSize, value: MutPtr = this.value): CredentialAttributew = CredentialAttributew(keywordCtorArg = keyword, flags = flags, valueSize = valueSize, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CredentialAttributew) return false
        if (this.keyword != other.keyword) return false
        if (this.flags != other.flags) return false
        if (this.valueSize != other.valueSize) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyword.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.valueSize.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            keyword: Pwstr = MutPtr(0L),
            flags: UInt = 0u,
            valueSize: UInt = 0u,
            value: MutPtr = MutPtr(0L),
        ): CredentialAttributew =
            CredentialAttributew(
                keywordCtorArg = keyword,
                flags = flags,
                valueSize = valueSize,
                valueCtorArg = value,
            )
    }
}

public class CredentialTargetInformationa internal constructor(
    targetNameCtorArg: Pstr,
    netbiosServerNameCtorArg: Pstr,
    dnsServerNameCtorArg: Pstr,
    netbiosDomainNameCtorArg: Pstr,
    dnsDomainNameCtorArg: Pstr,
    dnsTreeNameCtorArg: Pstr,
    packageNameCtorArg: Pstr,
    public var flags: UInt,
    public var credTypeCount: UInt,
    credTypesCtorArg: MutPtr,
) {
    public var targetName: Pstr = targetNameCtorArg
        internal set

    public var netbiosServerName: Pstr = netbiosServerNameCtorArg
        internal set

    public var dnsServerName: Pstr = dnsServerNameCtorArg
        internal set

    public var netbiosDomainName: Pstr = netbiosDomainNameCtorArg
        internal set

    public var dnsDomainName: Pstr = dnsDomainNameCtorArg
        internal set

    public var dnsTreeName: Pstr = dnsTreeNameCtorArg
        internal set

    public var packageName: Pstr = packageNameCtorArg
        internal set

    public var credTypes: MutPtr = credTypesCtorArg
        internal set

    public constructor() : this(
        targetNameCtorArg = MutPtr(0L),
        netbiosServerNameCtorArg = MutPtr(0L),
        dnsServerNameCtorArg = MutPtr(0L),
        netbiosDomainNameCtorArg = MutPtr(0L),
        dnsDomainNameCtorArg = MutPtr(0L),
        dnsTreeNameCtorArg = MutPtr(0L),
        packageNameCtorArg = MutPtr(0L),
        flags = 0u,
        credTypeCount = 0u,
        credTypesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pstr = this.targetName

    public operator fun component2(): Pstr = this.netbiosServerName

    public operator fun component3(): Pstr = this.dnsServerName

    public operator fun component4(): Pstr = this.netbiosDomainName

    public operator fun component5(): Pstr = this.dnsDomainName

    public operator fun component6(): Pstr = this.dnsTreeName

    public operator fun component7(): Pstr = this.packageName

    public operator fun component8(): UInt = this.flags

    public operator fun component9(): UInt = this.credTypeCount

    public operator fun component10(): MutPtr = this.credTypes

    public fun copy(targetName: Pstr = this.targetName, netbiosServerName: Pstr = this.netbiosServerName, dnsServerName: Pstr = this.dnsServerName, netbiosDomainName: Pstr = this.netbiosDomainName, dnsDomainName: Pstr = this.dnsDomainName, dnsTreeName: Pstr = this.dnsTreeName, packageName: Pstr = this.packageName, flags: UInt = this.flags, credTypeCount: UInt = this.credTypeCount, credTypes: MutPtr = this.credTypes): CredentialTargetInformationa = CredentialTargetInformationa(targetNameCtorArg = targetName, netbiosServerNameCtorArg = netbiosServerName, dnsServerNameCtorArg = dnsServerName, netbiosDomainNameCtorArg = netbiosDomainName, dnsDomainNameCtorArg = dnsDomainName, dnsTreeNameCtorArg = dnsTreeName, packageNameCtorArg = packageName, flags = flags, credTypeCount = credTypeCount, credTypesCtorArg = credTypes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CredentialTargetInformationa) return false
        if (this.targetName != other.targetName) return false
        if (this.netbiosServerName != other.netbiosServerName) return false
        if (this.dnsServerName != other.dnsServerName) return false
        if (this.netbiosDomainName != other.netbiosDomainName) return false
        if (this.dnsDomainName != other.dnsDomainName) return false
        if (this.dnsTreeName != other.dnsTreeName) return false
        if (this.packageName != other.packageName) return false
        if (this.flags != other.flags) return false
        if (this.credTypeCount != other.credTypeCount) return false
        if (this.credTypes != other.credTypes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.targetName.hashCode()
        result = 31 * result + this.netbiosServerName.hashCode()
        result = 31 * result + this.dnsServerName.hashCode()
        result = 31 * result + this.netbiosDomainName.hashCode()
        result = 31 * result + this.dnsDomainName.hashCode()
        result = 31 * result + this.dnsTreeName.hashCode()
        result = 31 * result + this.packageName.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.credTypeCount.hashCode()
        result = 31 * result + this.credTypes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            targetName: Pstr = MutPtr(0L),
            netbiosServerName: Pstr = MutPtr(0L),
            dnsServerName: Pstr = MutPtr(0L),
            netbiosDomainName: Pstr = MutPtr(0L),
            dnsDomainName: Pstr = MutPtr(0L),
            dnsTreeName: Pstr = MutPtr(0L),
            packageName: Pstr = MutPtr(0L),
            flags: UInt = 0u,
            credTypeCount: UInt = 0u,
            credTypes: MutPtr = MutPtr(0L),
        ): CredentialTargetInformationa =
            CredentialTargetInformationa(
                targetNameCtorArg = targetName,
                netbiosServerNameCtorArg = netbiosServerName,
                dnsServerNameCtorArg = dnsServerName,
                netbiosDomainNameCtorArg = netbiosDomainName,
                dnsDomainNameCtorArg = dnsDomainName,
                dnsTreeNameCtorArg = dnsTreeName,
                packageNameCtorArg = packageName,
                flags = flags,
                credTypeCount = credTypeCount,
                credTypesCtorArg = credTypes,
            )
    }
}

public class CredentialTargetInformationw internal constructor(
    targetNameCtorArg: Pwstr,
    netbiosServerNameCtorArg: Pwstr,
    dnsServerNameCtorArg: Pwstr,
    netbiosDomainNameCtorArg: Pwstr,
    dnsDomainNameCtorArg: Pwstr,
    dnsTreeNameCtorArg: Pwstr,
    packageNameCtorArg: Pwstr,
    public var flags: UInt,
    public var credTypeCount: UInt,
    credTypesCtorArg: MutPtr,
) {
    public var targetName: Pwstr = targetNameCtorArg
        internal set

    public var netbiosServerName: Pwstr = netbiosServerNameCtorArg
        internal set

    public var dnsServerName: Pwstr = dnsServerNameCtorArg
        internal set

    public var netbiosDomainName: Pwstr = netbiosDomainNameCtorArg
        internal set

    public var dnsDomainName: Pwstr = dnsDomainNameCtorArg
        internal set

    public var dnsTreeName: Pwstr = dnsTreeNameCtorArg
        internal set

    public var packageName: Pwstr = packageNameCtorArg
        internal set

    public var credTypes: MutPtr = credTypesCtorArg
        internal set

    public constructor() : this(
        targetNameCtorArg = MutPtr(0L),
        netbiosServerNameCtorArg = MutPtr(0L),
        dnsServerNameCtorArg = MutPtr(0L),
        netbiosDomainNameCtorArg = MutPtr(0L),
        dnsDomainNameCtorArg = MutPtr(0L),
        dnsTreeNameCtorArg = MutPtr(0L),
        packageNameCtorArg = MutPtr(0L),
        flags = 0u,
        credTypeCount = 0u,
        credTypesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.targetName

    public operator fun component2(): Pwstr = this.netbiosServerName

    public operator fun component3(): Pwstr = this.dnsServerName

    public operator fun component4(): Pwstr = this.netbiosDomainName

    public operator fun component5(): Pwstr = this.dnsDomainName

    public operator fun component6(): Pwstr = this.dnsTreeName

    public operator fun component7(): Pwstr = this.packageName

    public operator fun component8(): UInt = this.flags

    public operator fun component9(): UInt = this.credTypeCount

    public operator fun component10(): MutPtr = this.credTypes

    public fun copy(targetName: Pwstr = this.targetName, netbiosServerName: Pwstr = this.netbiosServerName, dnsServerName: Pwstr = this.dnsServerName, netbiosDomainName: Pwstr = this.netbiosDomainName, dnsDomainName: Pwstr = this.dnsDomainName, dnsTreeName: Pwstr = this.dnsTreeName, packageName: Pwstr = this.packageName, flags: UInt = this.flags, credTypeCount: UInt = this.credTypeCount, credTypes: MutPtr = this.credTypes): CredentialTargetInformationw = CredentialTargetInformationw(targetNameCtorArg = targetName, netbiosServerNameCtorArg = netbiosServerName, dnsServerNameCtorArg = dnsServerName, netbiosDomainNameCtorArg = netbiosDomainName, dnsDomainNameCtorArg = dnsDomainName, dnsTreeNameCtorArg = dnsTreeName, packageNameCtorArg = packageName, flags = flags, credTypeCount = credTypeCount, credTypesCtorArg = credTypes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CredentialTargetInformationw) return false
        if (this.targetName != other.targetName) return false
        if (this.netbiosServerName != other.netbiosServerName) return false
        if (this.dnsServerName != other.dnsServerName) return false
        if (this.netbiosDomainName != other.netbiosDomainName) return false
        if (this.dnsDomainName != other.dnsDomainName) return false
        if (this.dnsTreeName != other.dnsTreeName) return false
        if (this.packageName != other.packageName) return false
        if (this.flags != other.flags) return false
        if (this.credTypeCount != other.credTypeCount) return false
        if (this.credTypes != other.credTypes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.targetName.hashCode()
        result = 31 * result + this.netbiosServerName.hashCode()
        result = 31 * result + this.dnsServerName.hashCode()
        result = 31 * result + this.netbiosDomainName.hashCode()
        result = 31 * result + this.dnsDomainName.hashCode()
        result = 31 * result + this.dnsTreeName.hashCode()
        result = 31 * result + this.packageName.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.credTypeCount.hashCode()
        result = 31 * result + this.credTypes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            targetName: Pwstr = MutPtr(0L),
            netbiosServerName: Pwstr = MutPtr(0L),
            dnsServerName: Pwstr = MutPtr(0L),
            netbiosDomainName: Pwstr = MutPtr(0L),
            dnsDomainName: Pwstr = MutPtr(0L),
            dnsTreeName: Pwstr = MutPtr(0L),
            packageName: Pwstr = MutPtr(0L),
            flags: UInt = 0u,
            credTypeCount: UInt = 0u,
            credTypes: MutPtr = MutPtr(0L),
        ): CredentialTargetInformationw =
            CredentialTargetInformationw(
                targetNameCtorArg = targetName,
                netbiosServerNameCtorArg = netbiosServerName,
                dnsServerNameCtorArg = dnsServerName,
                netbiosDomainNameCtorArg = netbiosDomainName,
                dnsDomainNameCtorArg = dnsDomainName,
                dnsTreeNameCtorArg = dnsTreeName,
                packageNameCtorArg = packageName,
                flags = flags,
                credTypeCount = credTypeCount,
                credTypesCtorArg = credTypes,
            )
    }
}

public class CredsspCred internal constructor(
    public var type: CredsppSubmitType,
    pSchannelCredCtorArg: MutPtr,
    pSpnegoCredCtorArg: MutPtr,
) {
    public var pSchannelCred: MutPtr = pSchannelCredCtorArg
        internal set

    public var pSpnegoCred: MutPtr = pSpnegoCredCtorArg
        internal set

    public constructor() : this(
        type = 0,
        pSchannelCredCtorArg = MutPtr(0L),
        pSpnegoCredCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CredsppSubmitType = this.type

    public operator fun component2(): MutPtr = this.pSchannelCred

    public operator fun component3(): MutPtr = this.pSpnegoCred

    public fun copy(type: CredsppSubmitType = this.type, pSchannelCred: MutPtr = this.pSchannelCred, pSpnegoCred: MutPtr = this.pSpnegoCred): CredsspCred = CredsspCred(type = type, pSchannelCredCtorArg = pSchannelCred, pSpnegoCredCtorArg = pSpnegoCred)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CredsspCred) return false
        if (this.type != other.type) return false
        if (this.pSchannelCred != other.pSchannelCred) return false
        if (this.pSpnegoCred != other.pSpnegoCred) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.pSchannelCred.hashCode()
        result = 31 * result + this.pSpnegoCred.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CredsspCred> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CredsspCred> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CredsspCred =
                    CredsspCred(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CredsspCred) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pSchannelCred)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pSpnegoCred)
                }
            }

        public operator fun invoke(
            type: CredsppSubmitType = 0,
            pSchannelCred: MutPtr = MutPtr(0L),
            pSpnegoCred: MutPtr = MutPtr(0L),
        ): CredsspCred =
            CredsspCred(
                type = type,
                pSchannelCredCtorArg = pSchannelCred,
                pSpnegoCredCtorArg = pSpnegoCred,
            )
    }
}

public data class CredsspCredEx(
    public var type: CredsppSubmitType = 0,
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
    public var cred: CredsspCred = CredsspCred(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CredsspCredEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CredsspCredEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): CredsspCredEx =
                    CredsspCredEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (CredsspCred.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: CredsspCredEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                    (CredsspCred.typeLayout()).writeNative(addr + 16L, value.cred)
                }
            }
    }
}

public class CreduiInfoa internal constructor(
    public var cbSize: UInt,
    hwndParentCtorArg: Hwnd,
    pszMessageTextCtorArg: Pcstr,
    pszCaptionTextCtorArg: Pcstr,
    hbmBannerCtorArg: Hbitmap,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var pszMessageText: Pcstr = pszMessageTextCtorArg
        internal set

    public var pszCaptionText: Pcstr = pszCaptionTextCtorArg
        internal set

    public var hbmBanner: Hbitmap = hbmBannerCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hwndParentCtorArg = MutPtr(0L),
        pszMessageTextCtorArg = ConstPtr(0L),
        pszCaptionTextCtorArg = ConstPtr(0L),
        hbmBannerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hwnd = this.hwndParent

    public operator fun component3(): Pcstr = this.pszMessageText

    public operator fun component4(): Pcstr = this.pszCaptionText

    public operator fun component5(): Hbitmap = this.hbmBanner

    public fun copy(cbSize: UInt = this.cbSize, hwndParent: Hwnd = this.hwndParent, pszMessageText: Pcstr = this.pszMessageText, pszCaptionText: Pcstr = this.pszCaptionText, hbmBanner: Hbitmap = this.hbmBanner): CreduiInfoa = CreduiInfoa(cbSize = cbSize, hwndParentCtorArg = hwndParent, pszMessageTextCtorArg = pszMessageText, pszCaptionTextCtorArg = pszCaptionText, hbmBannerCtorArg = hbmBanner)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CreduiInfoa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.pszMessageText != other.pszMessageText) return false
        if (this.pszCaptionText != other.pszCaptionText) return false
        if (this.hbmBanner != other.hbmBanner) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.pszMessageText.hashCode()
        result = 31 * result + this.pszCaptionText.hashCode()
        result = 31 * result + this.hbmBanner.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            pszMessageText: Pcstr = ConstPtr(0L),
            pszCaptionText: Pcstr = ConstPtr(0L),
            hbmBanner: Hbitmap = MutPtr(0L),
        ): CreduiInfoa =
            CreduiInfoa(
                cbSize = cbSize,
                hwndParentCtorArg = hwndParent,
                pszMessageTextCtorArg = pszMessageText,
                pszCaptionTextCtorArg = pszCaptionText,
                hbmBannerCtorArg = hbmBanner,
            )
    }
}

public class CreduiInfow internal constructor(
    public var cbSize: UInt,
    hwndParentCtorArg: Hwnd,
    pszMessageTextCtorArg: Pcwstr,
    pszCaptionTextCtorArg: Pcwstr,
    hbmBannerCtorArg: Hbitmap,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public var pszMessageText: Pcwstr = pszMessageTextCtorArg
        internal set

    public var pszCaptionText: Pcwstr = pszCaptionTextCtorArg
        internal set

    public var hbmBanner: Hbitmap = hbmBannerCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hwndParentCtorArg = MutPtr(0L),
        pszMessageTextCtorArg = ConstPtr(0L),
        pszCaptionTextCtorArg = ConstPtr(0L),
        hbmBannerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Hwnd = this.hwndParent

    public operator fun component3(): Pcwstr = this.pszMessageText

    public operator fun component4(): Pcwstr = this.pszCaptionText

    public operator fun component5(): Hbitmap = this.hbmBanner

    public fun copy(cbSize: UInt = this.cbSize, hwndParent: Hwnd = this.hwndParent, pszMessageText: Pcwstr = this.pszMessageText, pszCaptionText: Pcwstr = this.pszCaptionText, hbmBanner: Hbitmap = this.hbmBanner): CreduiInfow = CreduiInfow(cbSize = cbSize, hwndParentCtorArg = hwndParent, pszMessageTextCtorArg = pszMessageText, pszCaptionTextCtorArg = pszCaptionText, hbmBannerCtorArg = hbmBanner)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CreduiInfow) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.pszMessageText != other.pszMessageText) return false
        if (this.pszCaptionText != other.pszCaptionText) return false
        if (this.hbmBanner != other.hbmBanner) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.pszMessageText.hashCode()
        result = 31 * result + this.pszCaptionText.hashCode()
        result = 31 * result + this.hbmBanner.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            pszMessageText: Pcwstr = ConstPtr(0L),
            pszCaptionText: Pcwstr = ConstPtr(0L),
            hbmBanner: Hbitmap = MutPtr(0L),
        ): CreduiInfow =
            CreduiInfow(
                cbSize = cbSize,
                hwndParentCtorArg = hwndParent,
                pszMessageTextCtorArg = pszMessageText,
                pszCaptionTextCtorArg = pszCaptionText,
                hbmBannerCtorArg = hbmBanner,
            )
    }
}

public data class KeyCredentialManagerInfo(
    public var containerId: Guid = Guid(),
)

public class Opencardnamea internal constructor(
    public var dwStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    public var hSCardContext: Int,
    lpstrGroupNamesCtorArg: Pstr,
    public var nMaxGroupNames: UInt,
    lpstrCardNamesCtorArg: Pstr,
    public var nMaxCardNames: UInt,
    rgguidInterfacesCtorArg: ConstPtr,
    public var cguidInterfaces: UInt,
    lpstrRdrCtorArg: Pstr,
    public var nMaxRdr: UInt,
    lpstrCardCtorArg: Pstr,
    public var nMaxCard: UInt,
    lpstrTitleCtorArg: Pcstr,
    public var dwFlags: UInt,
    pvUserDataCtorArg: MutPtr,
    public var dwShareMode: UInt,
    public var dwPreferredProtocols: UInt,
    public var dwActiveProtocol: UInt,
    public var lpfnConnect: Lpocnconnproca,
    public var lpfnCheck: Lpocnchkproc,
    public var lpfnDisconnect: Lpocndscproc,
    public var hCardHandle: Int,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var lpstrGroupNames: Pstr = lpstrGroupNamesCtorArg
        internal set

    public var lpstrCardNames: Pstr = lpstrCardNamesCtorArg
        internal set

    public var rgguidInterfaces: ConstPtr = rgguidInterfacesCtorArg
        internal set

    public var lpstrRdr: Pstr = lpstrRdrCtorArg
        internal set

    public var lpstrCard: Pstr = lpstrCardCtorArg
        internal set

    public var lpstrTitle: Pcstr = lpstrTitleCtorArg
        internal set

    public var pvUserData: MutPtr = pvUserDataCtorArg
        internal set

    public constructor() : this(
        dwStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hSCardContext = 0,
        lpstrGroupNamesCtorArg = MutPtr(0L),
        nMaxGroupNames = 0u,
        lpstrCardNamesCtorArg = MutPtr(0L),
        nMaxCardNames = 0u,
        rgguidInterfacesCtorArg = ConstPtr(0L),
        cguidInterfaces = 0u,
        lpstrRdrCtorArg = MutPtr(0L),
        nMaxRdr = 0u,
        lpstrCardCtorArg = MutPtr(0L),
        nMaxCard = 0u,
        lpstrTitleCtorArg = ConstPtr(0L),
        dwFlags = 0u,
        pvUserDataCtorArg = MutPtr(0L),
        dwShareMode = 0u,
        dwPreferredProtocols = 0u,
        dwActiveProtocol = 0u,
        lpfnConnect = null,
        lpfnCheck = null,
        lpfnDisconnect = null,
        hCardHandle = 0,
    )

    public companion object {
        public operator fun invoke(
            dwStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hSCardContext: Int = 0,
            lpstrGroupNames: Pstr = MutPtr(0L),
            nMaxGroupNames: UInt = 0u,
            lpstrCardNames: Pstr = MutPtr(0L),
            nMaxCardNames: UInt = 0u,
            rgguidInterfaces: ConstPtr = ConstPtr(0L),
            cguidInterfaces: UInt = 0u,
            lpstrRdr: Pstr = MutPtr(0L),
            nMaxRdr: UInt = 0u,
            lpstrCard: Pstr = MutPtr(0L),
            nMaxCard: UInt = 0u,
            lpstrTitle: Pcstr = ConstPtr(0L),
            dwFlags: UInt = 0u,
            pvUserData: MutPtr = MutPtr(0L),
            dwShareMode: UInt = 0u,
            dwPreferredProtocols: UInt = 0u,
            dwActiveProtocol: UInt = 0u,
            lpfnConnect: Lpocnconnproca = null,
            lpfnCheck: Lpocnchkproc = null,
            lpfnDisconnect: Lpocndscproc = null,
            hCardHandle: Int = 0,
        ): Opencardnamea =
            Opencardnamea(
                dwStructSize = dwStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hSCardContext = hSCardContext,
                lpstrGroupNamesCtorArg = lpstrGroupNames,
                nMaxGroupNames = nMaxGroupNames,
                lpstrCardNamesCtorArg = lpstrCardNames,
                nMaxCardNames = nMaxCardNames,
                rgguidInterfacesCtorArg = rgguidInterfaces,
                cguidInterfaces = cguidInterfaces,
                lpstrRdrCtorArg = lpstrRdr,
                nMaxRdr = nMaxRdr,
                lpstrCardCtorArg = lpstrCard,
                nMaxCard = nMaxCard,
                lpstrTitleCtorArg = lpstrTitle,
                dwFlags = dwFlags,
                pvUserDataCtorArg = pvUserData,
                dwShareMode = dwShareMode,
                dwPreferredProtocols = dwPreferredProtocols,
                dwActiveProtocol = dwActiveProtocol,
                lpfnConnect = lpfnConnect,
                lpfnCheck = lpfnCheck,
                lpfnDisconnect = lpfnDisconnect,
                hCardHandle = hCardHandle,
            )
    }
}

public class Opencardnamew internal constructor(
    public var dwStructSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    public var hSCardContext: Int,
    lpstrGroupNamesCtorArg: Pwstr,
    public var nMaxGroupNames: UInt,
    lpstrCardNamesCtorArg: Pwstr,
    public var nMaxCardNames: UInt,
    rgguidInterfacesCtorArg: ConstPtr,
    public var cguidInterfaces: UInt,
    lpstrRdrCtorArg: Pwstr,
    public var nMaxRdr: UInt,
    lpstrCardCtorArg: Pwstr,
    public var nMaxCard: UInt,
    lpstrTitleCtorArg: Pcwstr,
    public var dwFlags: UInt,
    pvUserDataCtorArg: MutPtr,
    public var dwShareMode: UInt,
    public var dwPreferredProtocols: UInt,
    public var dwActiveProtocol: UInt,
    public var lpfnConnect: Lpocnconnprocw,
    public var lpfnCheck: Lpocnchkproc,
    public var lpfnDisconnect: Lpocndscproc,
    public var hCardHandle: Int,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var lpstrGroupNames: Pwstr = lpstrGroupNamesCtorArg
        internal set

    public var lpstrCardNames: Pwstr = lpstrCardNamesCtorArg
        internal set

    public var rgguidInterfaces: ConstPtr = rgguidInterfacesCtorArg
        internal set

    public var lpstrRdr: Pwstr = lpstrRdrCtorArg
        internal set

    public var lpstrCard: Pwstr = lpstrCardCtorArg
        internal set

    public var lpstrTitle: Pcwstr = lpstrTitleCtorArg
        internal set

    public var pvUserData: MutPtr = pvUserDataCtorArg
        internal set

    public constructor() : this(
        dwStructSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        hSCardContext = 0,
        lpstrGroupNamesCtorArg = MutPtr(0L),
        nMaxGroupNames = 0u,
        lpstrCardNamesCtorArg = MutPtr(0L),
        nMaxCardNames = 0u,
        rgguidInterfacesCtorArg = ConstPtr(0L),
        cguidInterfaces = 0u,
        lpstrRdrCtorArg = MutPtr(0L),
        nMaxRdr = 0u,
        lpstrCardCtorArg = MutPtr(0L),
        nMaxCard = 0u,
        lpstrTitleCtorArg = ConstPtr(0L),
        dwFlags = 0u,
        pvUserDataCtorArg = MutPtr(0L),
        dwShareMode = 0u,
        dwPreferredProtocols = 0u,
        dwActiveProtocol = 0u,
        lpfnConnect = null,
        lpfnCheck = null,
        lpfnDisconnect = null,
        hCardHandle = 0,
    )

    public companion object {
        public operator fun invoke(
            dwStructSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            hSCardContext: Int = 0,
            lpstrGroupNames: Pwstr = MutPtr(0L),
            nMaxGroupNames: UInt = 0u,
            lpstrCardNames: Pwstr = MutPtr(0L),
            nMaxCardNames: UInt = 0u,
            rgguidInterfaces: ConstPtr = ConstPtr(0L),
            cguidInterfaces: UInt = 0u,
            lpstrRdr: Pwstr = MutPtr(0L),
            nMaxRdr: UInt = 0u,
            lpstrCard: Pwstr = MutPtr(0L),
            nMaxCard: UInt = 0u,
            lpstrTitle: Pcwstr = ConstPtr(0L),
            dwFlags: UInt = 0u,
            pvUserData: MutPtr = MutPtr(0L),
            dwShareMode: UInt = 0u,
            dwPreferredProtocols: UInt = 0u,
            dwActiveProtocol: UInt = 0u,
            lpfnConnect: Lpocnconnprocw = null,
            lpfnCheck: Lpocnchkproc = null,
            lpfnDisconnect: Lpocndscproc = null,
            hCardHandle: Int = 0,
        ): Opencardnamew =
            Opencardnamew(
                dwStructSize = dwStructSize,
                hwndOwnerCtorArg = hwndOwner,
                hSCardContext = hSCardContext,
                lpstrGroupNamesCtorArg = lpstrGroupNames,
                nMaxGroupNames = nMaxGroupNames,
                lpstrCardNamesCtorArg = lpstrCardNames,
                nMaxCardNames = nMaxCardNames,
                rgguidInterfacesCtorArg = rgguidInterfaces,
                cguidInterfaces = cguidInterfaces,
                lpstrRdrCtorArg = lpstrRdr,
                nMaxRdr = nMaxRdr,
                lpstrCardCtorArg = lpstrCard,
                nMaxCard = nMaxCard,
                lpstrTitleCtorArg = lpstrTitle,
                dwFlags = dwFlags,
                pvUserDataCtorArg = pvUserData,
                dwShareMode = dwShareMode,
                dwPreferredProtocols = dwPreferredProtocols,
                dwActiveProtocol = dwActiveProtocol,
                lpfnConnect = lpfnConnect,
                lpfnCheck = lpfnCheck,
                lpfnDisconnect = lpfnDisconnect,
                hCardHandle = hCardHandle,
            )
    }
}

public class OpencardnameExa internal constructor(
    public var dwStructSize: UInt,
    public var hSCardContext: Int,
    hwndOwnerCtorArg: Hwnd,
    public var dwFlags: UInt,
    lpstrTitleCtorArg: Pcstr,
    lpstrSearchDescCtorArg: Pcstr,
    hIconCtorArg: Hicon,
    pOpenCardSearchCriteriaCtorArg: MutPtr,
    public var lpfnConnect: Lpocnconnproca,
    pvUserDataCtorArg: MutPtr,
    public var dwShareMode: UInt,
    public var dwPreferredProtocols: UInt,
    lpstrRdrCtorArg: Pstr,
    public var nMaxRdr: UInt,
    lpstrCardCtorArg: Pstr,
    public var nMaxCard: UInt,
    public var dwActiveProtocol: UInt,
    public var hCardHandle: Int,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var lpstrTitle: Pcstr = lpstrTitleCtorArg
        internal set

    public var lpstrSearchDesc: Pcstr = lpstrSearchDescCtorArg
        internal set

    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var pOpenCardSearchCriteria: MutPtr = pOpenCardSearchCriteriaCtorArg
        internal set

    public var pvUserData: MutPtr = pvUserDataCtorArg
        internal set

    public var lpstrRdr: Pstr = lpstrRdrCtorArg
        internal set

    public var lpstrCard: Pstr = lpstrCardCtorArg
        internal set

    public constructor() : this(
        dwStructSize = 0u,
        hSCardContext = 0,
        hwndOwnerCtorArg = MutPtr(0L),
        dwFlags = 0u,
        lpstrTitleCtorArg = ConstPtr(0L),
        lpstrSearchDescCtorArg = ConstPtr(0L),
        hIconCtorArg = MutPtr(0L),
        pOpenCardSearchCriteriaCtorArg = MutPtr(0L),
        lpfnConnect = null,
        pvUserDataCtorArg = MutPtr(0L),
        dwShareMode = 0u,
        dwPreferredProtocols = 0u,
        lpstrRdrCtorArg = MutPtr(0L),
        nMaxRdr = 0u,
        lpstrCardCtorArg = MutPtr(0L),
        nMaxCard = 0u,
        dwActiveProtocol = 0u,
        hCardHandle = 0,
    )

    public companion object {
        public operator fun invoke(
            dwStructSize: UInt = 0u,
            hSCardContext: Int = 0,
            hwndOwner: Hwnd = MutPtr(0L),
            dwFlags: UInt = 0u,
            lpstrTitle: Pcstr = ConstPtr(0L),
            lpstrSearchDesc: Pcstr = ConstPtr(0L),
            hIcon: Hicon = MutPtr(0L),
            pOpenCardSearchCriteria: MutPtr = MutPtr(0L),
            lpfnConnect: Lpocnconnproca = null,
            pvUserData: MutPtr = MutPtr(0L),
            dwShareMode: UInt = 0u,
            dwPreferredProtocols: UInt = 0u,
            lpstrRdr: Pstr = MutPtr(0L),
            nMaxRdr: UInt = 0u,
            lpstrCard: Pstr = MutPtr(0L),
            nMaxCard: UInt = 0u,
            dwActiveProtocol: UInt = 0u,
            hCardHandle: Int = 0,
        ): OpencardnameExa =
            OpencardnameExa(
                dwStructSize = dwStructSize,
                hSCardContext = hSCardContext,
                hwndOwnerCtorArg = hwndOwner,
                dwFlags = dwFlags,
                lpstrTitleCtorArg = lpstrTitle,
                lpstrSearchDescCtorArg = lpstrSearchDesc,
                hIconCtorArg = hIcon,
                pOpenCardSearchCriteriaCtorArg = pOpenCardSearchCriteria,
                lpfnConnect = lpfnConnect,
                pvUserDataCtorArg = pvUserData,
                dwShareMode = dwShareMode,
                dwPreferredProtocols = dwPreferredProtocols,
                lpstrRdrCtorArg = lpstrRdr,
                nMaxRdr = nMaxRdr,
                lpstrCardCtorArg = lpstrCard,
                nMaxCard = nMaxCard,
                dwActiveProtocol = dwActiveProtocol,
                hCardHandle = hCardHandle,
            )
    }
}

public class OpencardnameExw internal constructor(
    public var dwStructSize: UInt,
    public var hSCardContext: Int,
    hwndOwnerCtorArg: Hwnd,
    public var dwFlags: UInt,
    lpstrTitleCtorArg: Pcwstr,
    lpstrSearchDescCtorArg: Pcwstr,
    hIconCtorArg: Hicon,
    pOpenCardSearchCriteriaCtorArg: MutPtr,
    public var lpfnConnect: Lpocnconnprocw,
    pvUserDataCtorArg: MutPtr,
    public var dwShareMode: UInt,
    public var dwPreferredProtocols: UInt,
    lpstrRdrCtorArg: Pwstr,
    public var nMaxRdr: UInt,
    lpstrCardCtorArg: Pwstr,
    public var nMaxCard: UInt,
    public var dwActiveProtocol: UInt,
    public var hCardHandle: Int,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public var lpstrTitle: Pcwstr = lpstrTitleCtorArg
        internal set

    public var lpstrSearchDesc: Pcwstr = lpstrSearchDescCtorArg
        internal set

    public var hIcon: Hicon = hIconCtorArg
        internal set

    public var pOpenCardSearchCriteria: MutPtr = pOpenCardSearchCriteriaCtorArg
        internal set

    public var pvUserData: MutPtr = pvUserDataCtorArg
        internal set

    public var lpstrRdr: Pwstr = lpstrRdrCtorArg
        internal set

    public var lpstrCard: Pwstr = lpstrCardCtorArg
        internal set

    public constructor() : this(
        dwStructSize = 0u,
        hSCardContext = 0,
        hwndOwnerCtorArg = MutPtr(0L),
        dwFlags = 0u,
        lpstrTitleCtorArg = ConstPtr(0L),
        lpstrSearchDescCtorArg = ConstPtr(0L),
        hIconCtorArg = MutPtr(0L),
        pOpenCardSearchCriteriaCtorArg = MutPtr(0L),
        lpfnConnect = null,
        pvUserDataCtorArg = MutPtr(0L),
        dwShareMode = 0u,
        dwPreferredProtocols = 0u,
        lpstrRdrCtorArg = MutPtr(0L),
        nMaxRdr = 0u,
        lpstrCardCtorArg = MutPtr(0L),
        nMaxCard = 0u,
        dwActiveProtocol = 0u,
        hCardHandle = 0,
    )

    public companion object {
        public operator fun invoke(
            dwStructSize: UInt = 0u,
            hSCardContext: Int = 0,
            hwndOwner: Hwnd = MutPtr(0L),
            dwFlags: UInt = 0u,
            lpstrTitle: Pcwstr = ConstPtr(0L),
            lpstrSearchDesc: Pcwstr = ConstPtr(0L),
            hIcon: Hicon = MutPtr(0L),
            pOpenCardSearchCriteria: MutPtr = MutPtr(0L),
            lpfnConnect: Lpocnconnprocw = null,
            pvUserData: MutPtr = MutPtr(0L),
            dwShareMode: UInt = 0u,
            dwPreferredProtocols: UInt = 0u,
            lpstrRdr: Pwstr = MutPtr(0L),
            nMaxRdr: UInt = 0u,
            lpstrCard: Pwstr = MutPtr(0L),
            nMaxCard: UInt = 0u,
            dwActiveProtocol: UInt = 0u,
            hCardHandle: Int = 0,
        ): OpencardnameExw =
            OpencardnameExw(
                dwStructSize = dwStructSize,
                hSCardContext = hSCardContext,
                hwndOwnerCtorArg = hwndOwner,
                dwFlags = dwFlags,
                lpstrTitleCtorArg = lpstrTitle,
                lpstrSearchDescCtorArg = lpstrSearchDesc,
                hIconCtorArg = hIcon,
                pOpenCardSearchCriteriaCtorArg = pOpenCardSearchCriteria,
                lpfnConnect = lpfnConnect,
                pvUserDataCtorArg = pvUserData,
                dwShareMode = dwShareMode,
                dwPreferredProtocols = dwPreferredProtocols,
                lpstrRdrCtorArg = lpstrRdr,
                nMaxRdr = nMaxRdr,
                lpstrCardCtorArg = lpstrCard,
                nMaxCard = nMaxCard,
                dwActiveProtocol = dwActiveProtocol,
                hCardHandle = hCardHandle,
            )
    }
}

public class OpencardSearchCriteriaa internal constructor(
    public var dwStructSize: UInt,
    lpstrGroupNamesCtorArg: Pstr,
    public var nMaxGroupNames: UInt,
    rgguidInterfacesCtorArg: ConstPtr,
    public var cguidInterfaces: UInt,
    lpstrCardNamesCtorArg: Pstr,
    public var nMaxCardNames: UInt,
    public var lpfnCheck: Lpocnchkproc,
    public var lpfnConnect: Lpocnconnproca,
    public var lpfnDisconnect: Lpocndscproc,
    pvUserDataCtorArg: MutPtr,
    public var dwShareMode: UInt,
    public var dwPreferredProtocols: UInt,
) {
    public var lpstrGroupNames: Pstr = lpstrGroupNamesCtorArg
        internal set

    public var rgguidInterfaces: ConstPtr = rgguidInterfacesCtorArg
        internal set

    public var lpstrCardNames: Pstr = lpstrCardNamesCtorArg
        internal set

    public var pvUserData: MutPtr = pvUserDataCtorArg
        internal set

    public constructor() : this(
        dwStructSize = 0u,
        lpstrGroupNamesCtorArg = MutPtr(0L),
        nMaxGroupNames = 0u,
        rgguidInterfacesCtorArg = ConstPtr(0L),
        cguidInterfaces = 0u,
        lpstrCardNamesCtorArg = MutPtr(0L),
        nMaxCardNames = 0u,
        lpfnCheck = null,
        lpfnConnect = null,
        lpfnDisconnect = null,
        pvUserDataCtorArg = MutPtr(0L),
        dwShareMode = 0u,
        dwPreferredProtocols = 0u,
    )

    public operator fun component1(): UInt = this.dwStructSize

    public operator fun component2(): Pstr = this.lpstrGroupNames

    public operator fun component3(): UInt = this.nMaxGroupNames

    public operator fun component4(): ConstPtr = this.rgguidInterfaces

    public operator fun component5(): UInt = this.cguidInterfaces

    public operator fun component6(): Pstr = this.lpstrCardNames

    public operator fun component7(): UInt = this.nMaxCardNames

    public operator fun component8(): Lpocnchkproc = this.lpfnCheck

    public operator fun component9(): Lpocnconnproca = this.lpfnConnect

    public operator fun component10(): Lpocndscproc = this.lpfnDisconnect

    public operator fun component11(): MutPtr = this.pvUserData

    public operator fun component12(): UInt = this.dwShareMode

    public operator fun component13(): UInt = this.dwPreferredProtocols

    public fun copy(dwStructSize: UInt = this.dwStructSize, lpstrGroupNames: Pstr = this.lpstrGroupNames, nMaxGroupNames: UInt = this.nMaxGroupNames, rgguidInterfaces: ConstPtr = this.rgguidInterfaces, cguidInterfaces: UInt = this.cguidInterfaces, lpstrCardNames: Pstr = this.lpstrCardNames, nMaxCardNames: UInt = this.nMaxCardNames, lpfnCheck: Lpocnchkproc = this.lpfnCheck, lpfnConnect: Lpocnconnproca = this.lpfnConnect, lpfnDisconnect: Lpocndscproc = this.lpfnDisconnect, pvUserData: MutPtr = this.pvUserData, dwShareMode: UInt = this.dwShareMode, dwPreferredProtocols: UInt = this.dwPreferredProtocols): OpencardSearchCriteriaa = OpencardSearchCriteriaa(dwStructSize = dwStructSize, lpstrGroupNamesCtorArg = lpstrGroupNames, nMaxGroupNames = nMaxGroupNames, rgguidInterfacesCtorArg = rgguidInterfaces, cguidInterfaces = cguidInterfaces, lpstrCardNamesCtorArg = lpstrCardNames, nMaxCardNames = nMaxCardNames, lpfnCheck = lpfnCheck, lpfnConnect = lpfnConnect, lpfnDisconnect = lpfnDisconnect, pvUserDataCtorArg = pvUserData, dwShareMode = dwShareMode, dwPreferredProtocols = dwPreferredProtocols)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OpencardSearchCriteriaa) return false
        if (this.dwStructSize != other.dwStructSize) return false
        if (this.lpstrGroupNames != other.lpstrGroupNames) return false
        if (this.nMaxGroupNames != other.nMaxGroupNames) return false
        if (this.rgguidInterfaces != other.rgguidInterfaces) return false
        if (this.cguidInterfaces != other.cguidInterfaces) return false
        if (this.lpstrCardNames != other.lpstrCardNames) return false
        if (this.nMaxCardNames != other.nMaxCardNames) return false
        if (this.lpfnCheck != other.lpfnCheck) return false
        if (this.lpfnConnect != other.lpfnConnect) return false
        if (this.lpfnDisconnect != other.lpfnDisconnect) return false
        if (this.pvUserData != other.pvUserData) return false
        if (this.dwShareMode != other.dwShareMode) return false
        if (this.dwPreferredProtocols != other.dwPreferredProtocols) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStructSize.hashCode()
        result = 31 * result + this.lpstrGroupNames.hashCode()
        result = 31 * result + this.nMaxGroupNames.hashCode()
        result = 31 * result + this.rgguidInterfaces.hashCode()
        result = 31 * result + this.cguidInterfaces.hashCode()
        result = 31 * result + this.lpstrCardNames.hashCode()
        result = 31 * result + this.nMaxCardNames.hashCode()
        result = 31 * result + this.lpfnCheck.hashCode()
        result = 31 * result + this.lpfnConnect.hashCode()
        result = 31 * result + this.lpfnDisconnect.hashCode()
        result = 31 * result + this.pvUserData.hashCode()
        result = 31 * result + this.dwShareMode.hashCode()
        result = 31 * result + this.dwPreferredProtocols.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStructSize: UInt = 0u,
            lpstrGroupNames: Pstr = MutPtr(0L),
            nMaxGroupNames: UInt = 0u,
            rgguidInterfaces: ConstPtr = ConstPtr(0L),
            cguidInterfaces: UInt = 0u,
            lpstrCardNames: Pstr = MutPtr(0L),
            nMaxCardNames: UInt = 0u,
            lpfnCheck: Lpocnchkproc = null,
            lpfnConnect: Lpocnconnproca = null,
            lpfnDisconnect: Lpocndscproc = null,
            pvUserData: MutPtr = MutPtr(0L),
            dwShareMode: UInt = 0u,
            dwPreferredProtocols: UInt = 0u,
        ): OpencardSearchCriteriaa =
            OpencardSearchCriteriaa(
                dwStructSize = dwStructSize,
                lpstrGroupNamesCtorArg = lpstrGroupNames,
                nMaxGroupNames = nMaxGroupNames,
                rgguidInterfacesCtorArg = rgguidInterfaces,
                cguidInterfaces = cguidInterfaces,
                lpstrCardNamesCtorArg = lpstrCardNames,
                nMaxCardNames = nMaxCardNames,
                lpfnCheck = lpfnCheck,
                lpfnConnect = lpfnConnect,
                lpfnDisconnect = lpfnDisconnect,
                pvUserDataCtorArg = pvUserData,
                dwShareMode = dwShareMode,
                dwPreferredProtocols = dwPreferredProtocols,
            )
    }
}

public class OpencardSearchCriteriaw internal constructor(
    public var dwStructSize: UInt,
    lpstrGroupNamesCtorArg: Pwstr,
    public var nMaxGroupNames: UInt,
    rgguidInterfacesCtorArg: ConstPtr,
    public var cguidInterfaces: UInt,
    lpstrCardNamesCtorArg: Pwstr,
    public var nMaxCardNames: UInt,
    public var lpfnCheck: Lpocnchkproc,
    public var lpfnConnect: Lpocnconnprocw,
    public var lpfnDisconnect: Lpocndscproc,
    pvUserDataCtorArg: MutPtr,
    public var dwShareMode: UInt,
    public var dwPreferredProtocols: UInt,
) {
    public var lpstrGroupNames: Pwstr = lpstrGroupNamesCtorArg
        internal set

    public var rgguidInterfaces: ConstPtr = rgguidInterfacesCtorArg
        internal set

    public var lpstrCardNames: Pwstr = lpstrCardNamesCtorArg
        internal set

    public var pvUserData: MutPtr = pvUserDataCtorArg
        internal set

    public constructor() : this(
        dwStructSize = 0u,
        lpstrGroupNamesCtorArg = MutPtr(0L),
        nMaxGroupNames = 0u,
        rgguidInterfacesCtorArg = ConstPtr(0L),
        cguidInterfaces = 0u,
        lpstrCardNamesCtorArg = MutPtr(0L),
        nMaxCardNames = 0u,
        lpfnCheck = null,
        lpfnConnect = null,
        lpfnDisconnect = null,
        pvUserDataCtorArg = MutPtr(0L),
        dwShareMode = 0u,
        dwPreferredProtocols = 0u,
    )

    public operator fun component1(): UInt = this.dwStructSize

    public operator fun component2(): Pwstr = this.lpstrGroupNames

    public operator fun component3(): UInt = this.nMaxGroupNames

    public operator fun component4(): ConstPtr = this.rgguidInterfaces

    public operator fun component5(): UInt = this.cguidInterfaces

    public operator fun component6(): Pwstr = this.lpstrCardNames

    public operator fun component7(): UInt = this.nMaxCardNames

    public operator fun component8(): Lpocnchkproc = this.lpfnCheck

    public operator fun component9(): Lpocnconnprocw = this.lpfnConnect

    public operator fun component10(): Lpocndscproc = this.lpfnDisconnect

    public operator fun component11(): MutPtr = this.pvUserData

    public operator fun component12(): UInt = this.dwShareMode

    public operator fun component13(): UInt = this.dwPreferredProtocols

    public fun copy(dwStructSize: UInt = this.dwStructSize, lpstrGroupNames: Pwstr = this.lpstrGroupNames, nMaxGroupNames: UInt = this.nMaxGroupNames, rgguidInterfaces: ConstPtr = this.rgguidInterfaces, cguidInterfaces: UInt = this.cguidInterfaces, lpstrCardNames: Pwstr = this.lpstrCardNames, nMaxCardNames: UInt = this.nMaxCardNames, lpfnCheck: Lpocnchkproc = this.lpfnCheck, lpfnConnect: Lpocnconnprocw = this.lpfnConnect, lpfnDisconnect: Lpocndscproc = this.lpfnDisconnect, pvUserData: MutPtr = this.pvUserData, dwShareMode: UInt = this.dwShareMode, dwPreferredProtocols: UInt = this.dwPreferredProtocols): OpencardSearchCriteriaw = OpencardSearchCriteriaw(dwStructSize = dwStructSize, lpstrGroupNamesCtorArg = lpstrGroupNames, nMaxGroupNames = nMaxGroupNames, rgguidInterfacesCtorArg = rgguidInterfaces, cguidInterfaces = cguidInterfaces, lpstrCardNamesCtorArg = lpstrCardNames, nMaxCardNames = nMaxCardNames, lpfnCheck = lpfnCheck, lpfnConnect = lpfnConnect, lpfnDisconnect = lpfnDisconnect, pvUserDataCtorArg = pvUserData, dwShareMode = dwShareMode, dwPreferredProtocols = dwPreferredProtocols)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OpencardSearchCriteriaw) return false
        if (this.dwStructSize != other.dwStructSize) return false
        if (this.lpstrGroupNames != other.lpstrGroupNames) return false
        if (this.nMaxGroupNames != other.nMaxGroupNames) return false
        if (this.rgguidInterfaces != other.rgguidInterfaces) return false
        if (this.cguidInterfaces != other.cguidInterfaces) return false
        if (this.lpstrCardNames != other.lpstrCardNames) return false
        if (this.nMaxCardNames != other.nMaxCardNames) return false
        if (this.lpfnCheck != other.lpfnCheck) return false
        if (this.lpfnConnect != other.lpfnConnect) return false
        if (this.lpfnDisconnect != other.lpfnDisconnect) return false
        if (this.pvUserData != other.pvUserData) return false
        if (this.dwShareMode != other.dwShareMode) return false
        if (this.dwPreferredProtocols != other.dwPreferredProtocols) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStructSize.hashCode()
        result = 31 * result + this.lpstrGroupNames.hashCode()
        result = 31 * result + this.nMaxGroupNames.hashCode()
        result = 31 * result + this.rgguidInterfaces.hashCode()
        result = 31 * result + this.cguidInterfaces.hashCode()
        result = 31 * result + this.lpstrCardNames.hashCode()
        result = 31 * result + this.nMaxCardNames.hashCode()
        result = 31 * result + this.lpfnCheck.hashCode()
        result = 31 * result + this.lpfnConnect.hashCode()
        result = 31 * result + this.lpfnDisconnect.hashCode()
        result = 31 * result + this.pvUserData.hashCode()
        result = 31 * result + this.dwShareMode.hashCode()
        result = 31 * result + this.dwPreferredProtocols.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwStructSize: UInt = 0u,
            lpstrGroupNames: Pwstr = MutPtr(0L),
            nMaxGroupNames: UInt = 0u,
            rgguidInterfaces: ConstPtr = ConstPtr(0L),
            cguidInterfaces: UInt = 0u,
            lpstrCardNames: Pwstr = MutPtr(0L),
            nMaxCardNames: UInt = 0u,
            lpfnCheck: Lpocnchkproc = null,
            lpfnConnect: Lpocnconnprocw = null,
            lpfnDisconnect: Lpocndscproc = null,
            pvUserData: MutPtr = MutPtr(0L),
            dwShareMode: UInt = 0u,
            dwPreferredProtocols: UInt = 0u,
        ): OpencardSearchCriteriaw =
            OpencardSearchCriteriaw(
                dwStructSize = dwStructSize,
                lpstrGroupNamesCtorArg = lpstrGroupNames,
                nMaxGroupNames = nMaxGroupNames,
                rgguidInterfacesCtorArg = rgguidInterfaces,
                cguidInterfaces = cguidInterfaces,
                lpstrCardNamesCtorArg = lpstrCardNames,
                nMaxCardNames = nMaxCardNames,
                lpfnCheck = lpfnCheck,
                lpfnConnect = lpfnConnect,
                lpfnDisconnect = lpfnDisconnect,
                pvUserDataCtorArg = pvUserData,
                dwShareMode = dwShareMode,
                dwPreferredProtocols = dwPreferredProtocols,
            )
    }
}

public data class ReaderSelRequest(
    public var dwShareMode: UInt = 0u,
    public var dwPreferredProtocols: UInt = 0u,
    public var matchType: ReaderSelRequestMatchType = 0,
    public var anonymous: ReaderSelRequest0 = ReaderSelRequest0(),
)

public data class ReaderSelRequest0(
    public var readerAndContainerParameter: ReaderSelRequest00 = ReaderSelRequest00(),
    public var serialNumberParameter: ReaderSelRequest01 = ReaderSelRequest01(),
)

public data class ReaderSelRequest00(
    public var cbReaderNameOffset: UInt = 0u,
    public var cchReaderNameLength: UInt = 0u,
    public var cbContainerNameOffset: UInt = 0u,
    public var cchContainerNameLength: UInt = 0u,
    public var dwDesiredCardModuleVersion: UInt = 0u,
    public var dwCspFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReaderSelRequest00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReaderSelRequest00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ReaderSelRequest00 =
                    ReaderSelRequest00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: ReaderSelRequest00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbReaderNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cchReaderNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbContainerNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cchContainerNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwDesiredCardModuleVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwCspFlags)
                }
            }
    }
}

public data class ReaderSelRequest01(
    public var cbSerialNumberOffset: UInt = 0u,
    public var cbSerialNumberLength: UInt = 0u,
    public var dwDesiredCardModuleVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReaderSelRequest01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReaderSelRequest01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ReaderSelRequest01 =
                    ReaderSelRequest01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ReaderSelRequest01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSerialNumberOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbSerialNumberLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDesiredCardModuleVersion)
                }
            }
    }
}

public data class ReaderSelResponse(
    public var cbReaderNameOffset: UInt = 0u,
    public var cchReaderNameLength: UInt = 0u,
    public var cbCardNameOffset: UInt = 0u,
    public var cchCardNameLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReaderSelResponse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ReaderSelResponse> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ReaderSelResponse =
                    ReaderSelResponse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ReaderSelResponse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbReaderNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cchReaderNameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbCardNameOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cchCardNameLength)
                }
            }
    }
}

public data class ScardAtrmask(
    public var cbAtr: UInt = 0u,
    public var rgbAtr: UByteArray = UByteArray(36),
    public var rgbMask: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScardAtrmask) return false
        if (this.cbAtr != other.cbAtr) return false
        if (!this.rgbAtr.contentEquals(other.rgbAtr)) return false
        if (!this.rgbMask.contentEquals(other.rgbMask)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbAtr.hashCode()
        result = 31 * result + this.rgbAtr.contentHashCode()
        result = 31 * result + this.rgbMask.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScardAtrmask> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScardAtrmask> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 76L
                override fun readNative(addr: Long): ScardAtrmask =
                    ScardAtrmask(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                        ).readNative(addr + 40L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScardAtrmask) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbAtr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                    ).writeNative(addr + 4L, value.rgbAtr.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                    ).writeNative(addr + 40L, value.rgbMask.toList())
                }
            }
    }
}

public data class ScardIoRequest(
    public var dwProtocol: UInt = 0u,
    public var cbPciLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScardIoRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScardIoRequest> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ScardIoRequest =
                    ScardIoRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScardIoRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cbPciLength)
                }
            }
    }
}

public class ScardReaderstatea internal constructor(
    szReaderCtorArg: Pcstr,
    pvUserDataCtorArg: MutPtr,
    public var dwCurrentState: ScardState,
    public var dwEventState: ScardState,
    public var cbAtr: UInt,
    public var rgbAtr: UByteArray,
) {
    public var szReader: Pcstr = szReaderCtorArg
        internal set

    public var pvUserData: MutPtr = pvUserDataCtorArg
        internal set

    public constructor() : this(
        szReaderCtorArg = ConstPtr(0L),
        pvUserDataCtorArg = MutPtr(0L),
        dwCurrentState = 0u,
        dwEventState = 0u,
        cbAtr = 0u,
        rgbAtr = UByteArray(36),
    )

    public operator fun component1(): Pcstr = this.szReader

    public operator fun component2(): MutPtr = this.pvUserData

    public operator fun component3(): ScardState = this.dwCurrentState

    public operator fun component4(): ScardState = this.dwEventState

    public operator fun component5(): UInt = this.cbAtr

    public operator fun component6(): UByteArray = this.rgbAtr

    public fun copy(szReader: Pcstr = this.szReader, pvUserData: MutPtr = this.pvUserData, dwCurrentState: ScardState = this.dwCurrentState, dwEventState: ScardState = this.dwEventState, cbAtr: UInt = this.cbAtr, rgbAtr: UByteArray = this.rgbAtr): ScardReaderstatea = ScardReaderstatea(szReaderCtorArg = szReader, pvUserDataCtorArg = pvUserData, dwCurrentState = dwCurrentState, dwEventState = dwEventState, cbAtr = cbAtr, rgbAtr = rgbAtr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScardReaderstatea) return false
        if (this.szReader != other.szReader) return false
        if (this.pvUserData != other.pvUserData) return false
        if (this.dwCurrentState != other.dwCurrentState) return false
        if (this.dwEventState != other.dwEventState) return false
        if (this.cbAtr != other.cbAtr) return false
        if (!this.rgbAtr.contentEquals(other.rgbAtr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szReader.hashCode()
        result = 31 * result + this.pvUserData.hashCode()
        result = 31 * result + this.dwCurrentState.hashCode()
        result = 31 * result + this.dwEventState.hashCode()
        result = 31 * result + this.cbAtr.hashCode()
        result = 31 * result + this.rgbAtr.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szReader: Pcstr = ConstPtr(0L),
            pvUserData: MutPtr = MutPtr(0L),
            dwCurrentState: ScardState = 0u,
            dwEventState: ScardState = 0u,
            cbAtr: UInt = 0u,
            rgbAtr: UByteArray = UByteArray(36),
        ): ScardReaderstatea =
            ScardReaderstatea(
                szReaderCtorArg = szReader,
                pvUserDataCtorArg = pvUserData,
                dwCurrentState = dwCurrentState,
                dwEventState = dwEventState,
                cbAtr = cbAtr,
                rgbAtr = rgbAtr,
            )
    }
}

public class ScardReaderstatew internal constructor(
    szReaderCtorArg: Pcwstr,
    pvUserDataCtorArg: MutPtr,
    public var dwCurrentState: ScardState,
    public var dwEventState: ScardState,
    public var cbAtr: UInt,
    public var rgbAtr: UByteArray,
) {
    public var szReader: Pcwstr = szReaderCtorArg
        internal set

    public var pvUserData: MutPtr = pvUserDataCtorArg
        internal set

    public constructor() : this(
        szReaderCtorArg = ConstPtr(0L),
        pvUserDataCtorArg = MutPtr(0L),
        dwCurrentState = 0u,
        dwEventState = 0u,
        cbAtr = 0u,
        rgbAtr = UByteArray(36),
    )

    public operator fun component1(): Pcwstr = this.szReader

    public operator fun component2(): MutPtr = this.pvUserData

    public operator fun component3(): ScardState = this.dwCurrentState

    public operator fun component4(): ScardState = this.dwEventState

    public operator fun component5(): UInt = this.cbAtr

    public operator fun component6(): UByteArray = this.rgbAtr

    public fun copy(szReader: Pcwstr = this.szReader, pvUserData: MutPtr = this.pvUserData, dwCurrentState: ScardState = this.dwCurrentState, dwEventState: ScardState = this.dwEventState, cbAtr: UInt = this.cbAtr, rgbAtr: UByteArray = this.rgbAtr): ScardReaderstatew = ScardReaderstatew(szReaderCtorArg = szReader, pvUserDataCtorArg = pvUserData, dwCurrentState = dwCurrentState, dwEventState = dwEventState, cbAtr = cbAtr, rgbAtr = rgbAtr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScardReaderstatew) return false
        if (this.szReader != other.szReader) return false
        if (this.pvUserData != other.pvUserData) return false
        if (this.dwCurrentState != other.dwCurrentState) return false
        if (this.dwEventState != other.dwEventState) return false
        if (this.cbAtr != other.cbAtr) return false
        if (!this.rgbAtr.contentEquals(other.rgbAtr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szReader.hashCode()
        result = 31 * result + this.pvUserData.hashCode()
        result = 31 * result + this.dwCurrentState.hashCode()
        result = 31 * result + this.dwEventState.hashCode()
        result = 31 * result + this.cbAtr.hashCode()
        result = 31 * result + this.rgbAtr.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szReader: Pcwstr = ConstPtr(0L),
            pvUserData: MutPtr = MutPtr(0L),
            dwCurrentState: ScardState = 0u,
            dwEventState: ScardState = 0u,
            cbAtr: UInt = 0u,
            rgbAtr: UByteArray = UByteArray(36),
        ): ScardReaderstatew =
            ScardReaderstatew(
                szReaderCtorArg = szReader,
                pvUserDataCtorArg = pvUserData,
                dwCurrentState = dwCurrentState,
                dwEventState = dwEventState,
                cbAtr = cbAtr,
                rgbAtr = rgbAtr,
            )
    }
}

public data class ScardT0Command(
    public var bCla: UByte = 0u,
    public var bIns: UByte = 0u,
    public var bP1: UByte = 0u,
    public var bP2: UByte = 0u,
    public var bP3: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScardT0Command> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScardT0Command> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 5L
                override fun readNative(addr: Long): ScardT0Command =
                    ScardT0Command(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScardT0Command) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bCla)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bIns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bP1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bP2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bP3)
                }
            }
    }
}

public data class ScardT0Request(
    public var ioRequest: ScardIoRequest = ScardIoRequest(),
    public var bSw1: UByte = 0u,
    public var bSw2: UByte = 0u,
    public var anonymous: ScardT0Request0 = ScardT0Request0(),
)

public data class ScardT0Request0(
    public var cmdBytes: ScardT0Command = ScardT0Command(),
    public var rgbHeader: UByteArray = UByteArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScardT0Request0) return false
        if (this.cmdBytes != other.cmdBytes) return false
        if (!this.rgbHeader.contentEquals(other.rgbHeader)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cmdBytes.hashCode()
        result = 31 * result + this.rgbHeader.contentHashCode()
        return result
    }
}

public data class ScardT1Request(
    public var ioRequest: ScardIoRequest = ScardIoRequest(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScardT1Request> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScardT1Request> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ScardT1Request =
                    ScardT1Request(
                        (ScardIoRequest.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ScardT1Request) {
                    (ScardIoRequest.typeLayout()).writeNative(addr, value.ioRequest)
                }
            }
    }
}

public data class SecHandle(
    public var dwLower: Int = 0,
    public var dwUpper: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecHandle> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecHandle =
                    SecHandle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecHandle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwLower)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.dwUpper)
                }
            }
    }
}

public class SecPkgContextClientCreds internal constructor(
    public var authBufferLen: UInt,
    authBufferCtorArg: MutPtr,
) {
    public var authBuffer: MutPtr = authBufferCtorArg
        internal set

    public constructor() : this(
        authBufferLen = 0u,
        authBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.authBufferLen

    public operator fun component2(): MutPtr = this.authBuffer

    public fun copy(authBufferLen: UInt = this.authBufferLen, authBuffer: MutPtr = this.authBuffer): SecPkgContextClientCreds = SecPkgContextClientCreds(authBufferLen = authBufferLen, authBufferCtorArg = authBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecPkgContextClientCreds) return false
        if (this.authBufferLen != other.authBufferLen) return false
        if (this.authBuffer != other.authBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.authBufferLen.hashCode()
        result = 31 * result + this.authBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextClientCreds> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecPkgContextClientCreds> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SecPkgContextClientCreds =
                    SecPkgContextClientCreds(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SecPkgContextClientCreds) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.authBufferLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.authBuffer)
                }
            }

        public operator fun invoke(
            authBufferLen: UInt = 0u,
            authBuffer: MutPtr = MutPtr(0L),
        ): SecPkgContextClientCreds =
            SecPkgContextClientCreds(
                authBufferLen = authBufferLen,
                authBufferCtorArg = authBuffer,
            )
    }
}

public class UsernameTargetCredentialInfo internal constructor(
    userNameCtorArg: Pwstr,
) {
    public var userName: Pwstr = userNameCtorArg
        internal set

    public constructor() : this(
        userNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.userName

    public fun copy(userName: Pwstr = this.userName): UsernameTargetCredentialInfo = UsernameTargetCredentialInfo(userNameCtorArg = userName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsernameTargetCredentialInfo) return false
        if (this.userName != other.userName) return false
        return true
    }

    override fun hashCode(): Int = this.userName.hashCode()

    public companion object {
        public operator fun invoke(
            userName: Pwstr = MutPtr(0L),
        ): UsernameTargetCredentialInfo =
            UsernameTargetCredentialInfo(
                userNameCtorArg = userName,
            )
    }
}
