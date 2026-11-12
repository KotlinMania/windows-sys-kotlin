@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pwstr

public class Drmboundlicenseparams internal constructor(
    public var uVersion: UInt,
    public var hEnablingPrincipal: UInt,
    public var hSecureStore: UInt,
    wszRightsRequestedCtorArg: Pwstr,
    wszRightsGroupCtorArg: Pwstr,
    public var idResource: Drmid,
    public var cAuthenticatorCount: UInt,
    rghAuthenticatorsCtorArg: MutPtr<UInt>,
    wszDefaultEnablingPrincipalCredentialsCtorArg: Pwstr,
    public var dwFlags: UInt,
) {
    public var wszRightsRequested: Pwstr = wszRightsRequestedCtorArg
        internal set

    public var wszRightsGroup: Pwstr = wszRightsGroupCtorArg
        internal set

    public var rghAuthenticators: MutPtr<UInt> = rghAuthenticatorsCtorArg
        internal set

    public var wszDefaultEnablingPrincipalCredentials: Pwstr = wszDefaultEnablingPrincipalCredentialsCtorArg
        internal set

    public constructor() : this(
        uVersion = 0u,
        hEnablingPrincipal = 0u,
        hSecureStore = 0u,
        wszRightsRequestedCtorArg = MutPtr(0L),
        wszRightsGroupCtorArg = MutPtr(0L),
        idResource = Drmid(),
        cAuthenticatorCount = 0u,
        rghAuthenticatorsCtorArg = MutPtr(0L),
        wszDefaultEnablingPrincipalCredentialsCtorArg = MutPtr(0L),
        dwFlags = 0u,
    )

    public operator fun component1(): UInt = this.uVersion

    public operator fun component2(): UInt = this.hEnablingPrincipal

    public operator fun component3(): UInt = this.hSecureStore

    public operator fun component4(): Pwstr = this.wszRightsRequested

    public operator fun component5(): Pwstr = this.wszRightsGroup

    public operator fun component6(): Drmid = this.idResource

    public operator fun component7(): UInt = this.cAuthenticatorCount

    public operator fun component8(): MutPtr<UInt> = this.rghAuthenticators

    public operator fun component9(): Pwstr = this.wszDefaultEnablingPrincipalCredentials

    public operator fun component10(): UInt = this.dwFlags

    public fun copy(uVersion: UInt = this.uVersion, hEnablingPrincipal: UInt = this.hEnablingPrincipal, hSecureStore: UInt = this.hSecureStore, wszRightsRequested: Pwstr = this.wszRightsRequested, wszRightsGroup: Pwstr = this.wszRightsGroup, idResource: Drmid = this.idResource, cAuthenticatorCount: UInt = this.cAuthenticatorCount, rghAuthenticators: MutPtr<UInt> = this.rghAuthenticators, wszDefaultEnablingPrincipalCredentials: Pwstr = this.wszDefaultEnablingPrincipalCredentials, dwFlags: UInt = this.dwFlags): Drmboundlicenseparams = Drmboundlicenseparams(uVersion = uVersion, hEnablingPrincipal = hEnablingPrincipal, hSecureStore = hSecureStore, wszRightsRequestedCtorArg = wszRightsRequested, wszRightsGroupCtorArg = wszRightsGroup, idResource = idResource, cAuthenticatorCount = cAuthenticatorCount, rghAuthenticatorsCtorArg = rghAuthenticators, wszDefaultEnablingPrincipalCredentialsCtorArg = wszDefaultEnablingPrincipalCredentials, dwFlags = dwFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Drmboundlicenseparams) return false
        if (this.uVersion != other.uVersion) return false
        if (this.hEnablingPrincipal != other.hEnablingPrincipal) return false
        if (this.hSecureStore != other.hSecureStore) return false
        if (this.wszRightsRequested != other.wszRightsRequested) return false
        if (this.wszRightsGroup != other.wszRightsGroup) return false
        if (this.idResource != other.idResource) return false
        if (this.cAuthenticatorCount != other.cAuthenticatorCount) return false
        if (this.rghAuthenticators != other.rghAuthenticators) return false
        if (this.wszDefaultEnablingPrincipalCredentials != other.wszDefaultEnablingPrincipalCredentials) return false
        if (this.dwFlags != other.dwFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uVersion.hashCode()
        result = 31 * result + this.hEnablingPrincipal.hashCode()
        result = 31 * result + this.hSecureStore.hashCode()
        result = 31 * result + this.wszRightsRequested.hashCode()
        result = 31 * result + this.wszRightsGroup.hashCode()
        result = 31 * result + this.idResource.hashCode()
        result = 31 * result + this.cAuthenticatorCount.hashCode()
        result = 31 * result + this.rghAuthenticators.hashCode()
        result = 31 * result + this.wszDefaultEnablingPrincipalCredentials.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uVersion: UInt = 0u,
            hEnablingPrincipal: UInt = 0u,
            hSecureStore: UInt = 0u,
            wszRightsRequested: Pwstr = MutPtr(0L),
            wszRightsGroup: Pwstr = MutPtr(0L),
            idResource: Drmid = Drmid(),
            cAuthenticatorCount: UInt = 0u,
            rghAuthenticators: MutPtr<UInt> = MutPtr(0L),
            wszDefaultEnablingPrincipalCredentials: Pwstr = MutPtr(0L),
            dwFlags: UInt = 0u,
        ): Drmboundlicenseparams =
            Drmboundlicenseparams(
                uVersion = uVersion,
                hEnablingPrincipal = hEnablingPrincipal,
                hSecureStore = hSecureStore,
                wszRightsRequestedCtorArg = wszRightsRequested,
                wszRightsGroupCtorArg = wszRightsGroup,
                idResource = idResource,
                cAuthenticatorCount = cAuthenticatorCount,
                rghAuthenticatorsCtorArg = rghAuthenticators,
                wszDefaultEnablingPrincipalCredentialsCtorArg = wszDefaultEnablingPrincipalCredentials,
                dwFlags = dwFlags,
            )
    }
}

public class Drmid internal constructor(
    public var uVersion: UInt,
    wszIDTypeCtorArg: Pwstr,
    wszIDCtorArg: Pwstr,
) {
    public var wszIDType: Pwstr = wszIDTypeCtorArg
        internal set

    public var wszID: Pwstr = wszIDCtorArg
        internal set

    public constructor() : this(
        uVersion = 0u,
        wszIDTypeCtorArg = MutPtr(0L),
        wszIDCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.uVersion

    public operator fun component2(): Pwstr = this.wszIDType

    public operator fun component3(): Pwstr = this.wszID

    public fun copy(uVersion: UInt = this.uVersion, wszIDType: Pwstr = this.wszIDType, wszID: Pwstr = this.wszID): Drmid = Drmid(uVersion = uVersion, wszIDTypeCtorArg = wszIDType, wszIDCtorArg = wszID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Drmid) return false
        if (this.uVersion != other.uVersion) return false
        if (this.wszIDType != other.wszIDType) return false
        if (this.wszID != other.wszID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uVersion.hashCode()
        result = 31 * result + this.wszIDType.hashCode()
        result = 31 * result + this.wszID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uVersion: UInt = 0u,
            wszIDType: Pwstr = MutPtr(0L),
            wszID: Pwstr = MutPtr(0L),
        ): Drmid =
            Drmid(
                uVersion = uVersion,
                wszIDTypeCtorArg = wszIDType,
                wszIDCtorArg = wszID,
            )
    }
}

public class DrmActservInfo internal constructor(
    public var uVersion: UInt,
    wszPubKeyCtorArg: Pwstr,
    wszURLCtorArg: Pwstr,
) {
    public var wszPubKey: Pwstr = wszPubKeyCtorArg
        internal set

    public var wszURL: Pwstr = wszURLCtorArg
        internal set

    public constructor() : this(
        uVersion = 0u,
        wszPubKeyCtorArg = MutPtr(0L),
        wszURLCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.uVersion

    public operator fun component2(): Pwstr = this.wszPubKey

    public operator fun component3(): Pwstr = this.wszURL

    public fun copy(uVersion: UInt = this.uVersion, wszPubKey: Pwstr = this.wszPubKey, wszURL: Pwstr = this.wszURL): DrmActservInfo = DrmActservInfo(uVersion = uVersion, wszPubKeyCtorArg = wszPubKey, wszURLCtorArg = wszURL)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrmActservInfo) return false
        if (this.uVersion != other.uVersion) return false
        if (this.wszPubKey != other.wszPubKey) return false
        if (this.wszURL != other.wszURL) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uVersion.hashCode()
        result = 31 * result + this.wszPubKey.hashCode()
        result = 31 * result + this.wszURL.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uVersion: UInt = 0u,
            wszPubKey: Pwstr = MutPtr(0L),
            wszURL: Pwstr = MutPtr(0L),
        ): DrmActservInfo =
            DrmActservInfo(
                uVersion = uVersion,
                wszPubKeyCtorArg = wszPubKey,
                wszURLCtorArg = wszURL,
            )
    }
}

public data class DrmClientVersionInfo(
    public var uStructVersion: UInt = 0u,
    public var dwVersion: UIntArray = UIntArray(4),
    public var wszHierarchy: UShortArray = UShortArray(256),
    public var wszProductId: UShortArray = UShortArray(256),
    public var wszProductDescription: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrmClientVersionInfo) return false
        if (this.uStructVersion != other.uStructVersion) return false
        if (!this.dwVersion.contentEquals(other.dwVersion)) return false
        if (!this.wszHierarchy.contentEquals(other.wszHierarchy)) return false
        if (!this.wszProductId.contentEquals(other.wszProductId)) return false
        if (!this.wszProductDescription.contentEquals(other.wszProductDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uStructVersion.hashCode()
        result = 31 * result + this.dwVersion.contentHashCode()
        result = 31 * result + this.wszHierarchy.contentHashCode()
        result = 31 * result + this.wszProductId.contentHashCode()
        result = 31 * result + this.wszProductDescription.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrmClientVersionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrmClientVersionInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1556L
                override fun readNative(addr: Long): DrmClientVersionInfo =
                    DrmClientVersionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 20L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 532L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 1044L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: DrmClientVersionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uStructVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 4L, value.dwVersion.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 20L, value.wszHierarchy.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 532L, value.wszProductId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 1044L, value.wszProductDescription.toList())
                }
            }
    }
}

public class DrmLicenseAcqData internal constructor(
    public var uVersion: UInt,
    wszURLCtorArg: Pwstr,
    wszLocalFilenameCtorArg: Pwstr,
    pbPostDataCtorArg: MutPtr<UByte>,
    public var dwPostDataSize: UInt,
    wszFriendlyNameCtorArg: Pwstr,
) {
    public var wszURL: Pwstr = wszURLCtorArg
        internal set

    public var wszLocalFilename: Pwstr = wszLocalFilenameCtorArg
        internal set

    public var pbPostData: MutPtr<UByte> = pbPostDataCtorArg
        internal set

    public var wszFriendlyName: Pwstr = wszFriendlyNameCtorArg
        internal set

    public constructor() : this(
        uVersion = 0u,
        wszURLCtorArg = MutPtr(0L),
        wszLocalFilenameCtorArg = MutPtr(0L),
        pbPostDataCtorArg = MutPtr(0L),
        dwPostDataSize = 0u,
        wszFriendlyNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.uVersion

    public operator fun component2(): Pwstr = this.wszURL

    public operator fun component3(): Pwstr = this.wszLocalFilename

    public operator fun component4(): MutPtr<UByte> = this.pbPostData

    public operator fun component5(): UInt = this.dwPostDataSize

    public operator fun component6(): Pwstr = this.wszFriendlyName

    public fun copy(uVersion: UInt = this.uVersion, wszURL: Pwstr = this.wszURL, wszLocalFilename: Pwstr = this.wszLocalFilename, pbPostData: MutPtr<UByte> = this.pbPostData, dwPostDataSize: UInt = this.dwPostDataSize, wszFriendlyName: Pwstr = this.wszFriendlyName): DrmLicenseAcqData = DrmLicenseAcqData(uVersion = uVersion, wszURLCtorArg = wszURL, wszLocalFilenameCtorArg = wszLocalFilename, pbPostDataCtorArg = pbPostData, dwPostDataSize = dwPostDataSize, wszFriendlyNameCtorArg = wszFriendlyName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrmLicenseAcqData) return false
        if (this.uVersion != other.uVersion) return false
        if (this.wszURL != other.wszURL) return false
        if (this.wszLocalFilename != other.wszLocalFilename) return false
        if (this.pbPostData != other.pbPostData) return false
        if (this.dwPostDataSize != other.dwPostDataSize) return false
        if (this.wszFriendlyName != other.wszFriendlyName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uVersion.hashCode()
        result = 31 * result + this.wszURL.hashCode()
        result = 31 * result + this.wszLocalFilename.hashCode()
        result = 31 * result + this.pbPostData.hashCode()
        result = 31 * result + this.dwPostDataSize.hashCode()
        result = 31 * result + this.wszFriendlyName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uVersion: UInt = 0u,
            wszURL: Pwstr = MutPtr(0L),
            wszLocalFilename: Pwstr = MutPtr(0L),
            pbPostData: MutPtr<UByte> = MutPtr(0L),
            dwPostDataSize: UInt = 0u,
            wszFriendlyName: Pwstr = MutPtr(0L),
        ): DrmLicenseAcqData =
            DrmLicenseAcqData(
                uVersion = uVersion,
                wszURLCtorArg = wszURL,
                wszLocalFilenameCtorArg = wszLocalFilename,
                pbPostDataCtorArg = pbPostData,
                dwPostDataSize = dwPostDataSize,
                wszFriendlyNameCtorArg = wszFriendlyName,
            )
    }
}
