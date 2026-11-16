package io.github.kotlinmania.windowssys.windows.win32.devices.alljoyn

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr

public data class AlljoynAboutdatalistenerCallbacks(
    public var aboutDatalistenerGetaboutdata: AlljoynAboutdatalistenerGetaboutdataPtr = null,
    public var aboutDatalistenerGetannouncedaboutdata: AlljoynAboutdatalistenerGetannouncedaboutdataPtr = null,
)

public data class AlljoynAboutlistenerCallback(
    public var aboutListenerAnnounced: AlljoynAboutAnnouncedPtr = null,
)

public data class AlljoynApplicationstatelistenerCallbacks(
    public var state: AlljoynApplicationstatelistenerStatePtr = null,
)

public data class AlljoynAuthlistenerCallbacks(
    public var requestCredentials: AlljoynAuthlistenerRequestcredentialsPtr = null,
    public var verifyCredentials: AlljoynAuthlistenerVerifycredentialsPtr = null,
    public var securityViolation: AlljoynAuthlistenerSecurityviolationPtr = null,
    public var authenticationComplete: AlljoynAuthlistenerAuthenticationcompletePtr = null,
)

public data class AlljoynAuthlistenerasyncCallbacks(
    public var requestCredentials: AlljoynAuthlistenerRequestcredentialsasyncPtr = null,
    public var verifyCredentials: AlljoynAuthlistenerVerifycredentialsasyncPtr = null,
    public var securityViolation: AlljoynAuthlistenerSecurityviolationPtr = null,
    public var authenticationComplete: AlljoynAuthlistenerAuthenticationcompletePtr = null,
)

public data class AlljoynBuslistenerCallbacks(
    public var listenerRegistered: AlljoynBuslistenerListenerRegisteredPtr = null,
    public var listenerUnregistered: AlljoynBuslistenerListenerUnregisteredPtr = null,
    public var foundAdvertisedName: AlljoynBuslistenerFoundAdvertisedNamePtr = null,
    public var lostAdvertisedName: AlljoynBuslistenerLostAdvertisedNamePtr = null,
    public var nameOwnerChanged: AlljoynBuslistenerNameOwnerChangedPtr = null,
    public var busStopping: AlljoynBuslistenerBusStoppingPtr = null,
    public var busDisconnected: AlljoynBuslistenerBusDisconnectedPtr = null,
    public var propertyChanged: AlljoynBuslistenerBusPropChangedPtr = null,
)

public data class AlljoynBusobjectCallbacks(
    public var propertyGet: AlljoynBusobjectPropGetPtr = null,
    public var propertySet: AlljoynBusobjectPropSetPtr = null,
    public var objectRegistered: AlljoynBusobjectObjectRegistrationPtr = null,
    public var objectUnregistered: AlljoynBusobjectObjectRegistrationPtr = null,
)

public class AlljoynBusobjectMethodentry internal constructor(
    memberCtorArg: ConstPtr,
    public var methodHandler: AlljoynMessagereceiverMethodhandlerPtr,
) {
    public var member: ConstPtr = memberCtorArg
        internal set

    public constructor() : this(
        memberCtorArg = ConstPtr(0L),
        methodHandler = null,
    )

    public operator fun component1(): ConstPtr = this.member

    public operator fun component2(): AlljoynMessagereceiverMethodhandlerPtr = this.methodHandler

    public fun copy(member: ConstPtr = this.member, methodHandler: AlljoynMessagereceiverMethodhandlerPtr = this.methodHandler): AlljoynBusobjectMethodentry = AlljoynBusobjectMethodentry(memberCtorArg = member, methodHandler = methodHandler)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AlljoynBusobjectMethodentry) return false
        if (this.member != other.member) return false
        if (this.methodHandler != other.methodHandler) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.member.hashCode()
        result = 31 * result + this.methodHandler.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            member: ConstPtr = ConstPtr(0L),
            methodHandler: AlljoynMessagereceiverMethodhandlerPtr = null,
        ): AlljoynBusobjectMethodentry =
            AlljoynBusobjectMethodentry(
                memberCtorArg = member,
                methodHandler = methodHandler,
            )
    }
}

public class AlljoynCertificateid internal constructor(
    serialCtorArg: MutPtr,
    public var serialLen: Int,
    issuerPublicKeyCtorArg: MutPtr,
    issuerAkiCtorArg: MutPtr,
    public var issuerAkiLen: Int,
) {
    public var serial: MutPtr = serialCtorArg
        internal set

    public var issuerPublicKey: MutPtr = issuerPublicKeyCtorArg
        internal set

    public var issuerAki: MutPtr = issuerAkiCtorArg
        internal set

    public constructor() : this(
        serialCtorArg = MutPtr(0L),
        serialLen = 0,
        issuerPublicKeyCtorArg = MutPtr(0L),
        issuerAkiCtorArg = MutPtr(0L),
        issuerAkiLen = 0,
    )

    public operator fun component1(): MutPtr = this.serial

    public operator fun component2(): Int = this.serialLen

    public operator fun component3(): MutPtr = this.issuerPublicKey

    public operator fun component4(): MutPtr = this.issuerAki

    public operator fun component5(): Int = this.issuerAkiLen

    public fun copy(serial: MutPtr = this.serial, serialLen: Int = this.serialLen, issuerPublicKey: MutPtr = this.issuerPublicKey, issuerAki: MutPtr = this.issuerAki, issuerAkiLen: Int = this.issuerAkiLen): AlljoynCertificateid = AlljoynCertificateid(serialCtorArg = serial, serialLen = serialLen, issuerPublicKeyCtorArg = issuerPublicKey, issuerAkiCtorArg = issuerAki, issuerAkiLen = issuerAkiLen)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AlljoynCertificateid) return false
        if (this.serial != other.serial) return false
        if (this.serialLen != other.serialLen) return false
        if (this.issuerPublicKey != other.issuerPublicKey) return false
        if (this.issuerAki != other.issuerAki) return false
        if (this.issuerAkiLen != other.issuerAkiLen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.serial.hashCode()
        result = 31 * result + this.serialLen.hashCode()
        result = 31 * result + this.issuerPublicKey.hashCode()
        result = 31 * result + this.issuerAki.hashCode()
        result = 31 * result + this.issuerAkiLen.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AlljoynCertificateid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AlljoynCertificateid> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): AlljoynCertificateid =
                    AlljoynCertificateid(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: AlljoynCertificateid) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.serial)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.serialLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.issuerPublicKey)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.issuerAki)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.issuerAkiLen)
                }
            }

        public operator fun invoke(
            serial: MutPtr = MutPtr(0L),
            serialLen: Int = 0,
            issuerPublicKey: MutPtr = MutPtr(0L),
            issuerAki: MutPtr = MutPtr(0L),
            issuerAkiLen: Int = 0,
        ): AlljoynCertificateid =
            AlljoynCertificateid(
                serialCtorArg = serial,
                serialLen = serialLen,
                issuerPublicKeyCtorArg = issuerPublicKey,
                issuerAkiCtorArg = issuerAki,
                issuerAkiLen = issuerAkiLen,
            )
    }
}

public class AlljoynCertificateidarray internal constructor(
    public var count: Int,
    idsCtorArg: MutPtr,
) {
    public var ids: MutPtr = idsCtorArg
        internal set

    public constructor() : this(
        count = 0,
        idsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.count

    public operator fun component2(): MutPtr = this.ids

    public fun copy(count: Int = this.count, ids: MutPtr = this.ids): AlljoynCertificateidarray = AlljoynCertificateidarray(count = count, idsCtorArg = ids)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AlljoynCertificateidarray) return false
        if (this.count != other.count) return false
        if (this.ids != other.ids) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.ids.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AlljoynCertificateidarray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AlljoynCertificateidarray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AlljoynCertificateidarray =
                    AlljoynCertificateidarray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AlljoynCertificateidarray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.ids)
                }
            }

        public operator fun invoke(
            count: Int = 0,
            ids: MutPtr = MutPtr(0L),
        ): AlljoynCertificateidarray =
            AlljoynCertificateidarray(
                count = count,
                idsCtorArg = ids,
            )
    }
}

public class AlljoynInterfacedescriptionMember internal constructor(
    public var iface: AlljoynInterfacedescription,
    public var memberType: AlljoynMessagetype,
    nameCtorArg: Pcstr,
    signatureCtorArg: Pcstr,
    returnSignatureCtorArg: Pcstr,
    argNamesCtorArg: Pcstr,
    internalMemberCtorArg: ConstPtr,
) {
    public var name: Pcstr = nameCtorArg
        internal set

    public var signature: Pcstr = signatureCtorArg
        internal set

    public var returnSignature: Pcstr = returnSignatureCtorArg
        internal set

    public var argNames: Pcstr = argNamesCtorArg
        internal set

    public var internalMember: ConstPtr = internalMemberCtorArg
        internal set

    public constructor() : this(
        iface = 0L,
        memberType = 0,
        nameCtorArg = ConstPtr(0L),
        signatureCtorArg = ConstPtr(0L),
        returnSignatureCtorArg = ConstPtr(0L),
        argNamesCtorArg = ConstPtr(0L),
        internalMemberCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): AlljoynInterfacedescription = this.iface

    public operator fun component2(): AlljoynMessagetype = this.memberType

    public operator fun component3(): Pcstr = this.name

    public operator fun component4(): Pcstr = this.signature

    public operator fun component5(): Pcstr = this.returnSignature

    public operator fun component6(): Pcstr = this.argNames

    public operator fun component7(): ConstPtr = this.internalMember

    public fun copy(iface: AlljoynInterfacedescription = this.iface, memberType: AlljoynMessagetype = this.memberType, name: Pcstr = this.name, signature: Pcstr = this.signature, returnSignature: Pcstr = this.returnSignature, argNames: Pcstr = this.argNames, internalMember: ConstPtr = this.internalMember): AlljoynInterfacedescriptionMember = AlljoynInterfacedescriptionMember(iface = iface, memberType = memberType, nameCtorArg = name, signatureCtorArg = signature, returnSignatureCtorArg = returnSignature, argNamesCtorArg = argNames, internalMemberCtorArg = internalMember)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AlljoynInterfacedescriptionMember) return false
        if (this.iface != other.iface) return false
        if (this.memberType != other.memberType) return false
        if (this.name != other.name) return false
        if (this.signature != other.signature) return false
        if (this.returnSignature != other.returnSignature) return false
        if (this.argNames != other.argNames) return false
        if (this.internalMember != other.internalMember) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iface.hashCode()
        result = 31 * result + this.memberType.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.signature.hashCode()
        result = 31 * result + this.returnSignature.hashCode()
        result = 31 * result + this.argNames.hashCode()
        result = 31 * result + this.internalMember.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            iface: AlljoynInterfacedescription = 0L,
            memberType: AlljoynMessagetype = 0,
            name: Pcstr = ConstPtr(0L),
            signature: Pcstr = ConstPtr(0L),
            returnSignature: Pcstr = ConstPtr(0L),
            argNames: Pcstr = ConstPtr(0L),
            internalMember: ConstPtr = ConstPtr(0L),
        ): AlljoynInterfacedescriptionMember =
            AlljoynInterfacedescriptionMember(
                iface = iface,
                memberType = memberType,
                nameCtorArg = name,
                signatureCtorArg = signature,
                returnSignatureCtorArg = returnSignature,
                argNamesCtorArg = argNames,
                internalMemberCtorArg = internalMember,
            )
    }
}

public class AlljoynInterfacedescriptionProperty internal constructor(
    nameCtorArg: Pcstr,
    signatureCtorArg: Pcstr,
    public var access: UByte,
    internalPropertyCtorArg: ConstPtr,
) {
    public var name: Pcstr = nameCtorArg
        internal set

    public var signature: Pcstr = signatureCtorArg
        internal set

    public var internalProperty: ConstPtr = internalPropertyCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = ConstPtr(0L),
        signatureCtorArg = ConstPtr(0L),
        access = 0u,
        internalPropertyCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcstr = this.name

    public operator fun component2(): Pcstr = this.signature

    public operator fun component3(): UByte = this.access

    public operator fun component4(): ConstPtr = this.internalProperty

    public fun copy(name: Pcstr = this.name, signature: Pcstr = this.signature, access: UByte = this.access, internalProperty: ConstPtr = this.internalProperty): AlljoynInterfacedescriptionProperty = AlljoynInterfacedescriptionProperty(nameCtorArg = name, signatureCtorArg = signature, access = access, internalPropertyCtorArg = internalProperty)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AlljoynInterfacedescriptionProperty) return false
        if (this.name != other.name) return false
        if (this.signature != other.signature) return false
        if (this.access != other.access) return false
        if (this.internalProperty != other.internalProperty) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.signature.hashCode()
        result = 31 * result + this.access.hashCode()
        result = 31 * result + this.internalProperty.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: Pcstr = ConstPtr(0L),
            signature: Pcstr = ConstPtr(0L),
            access: UByte = 0u,
            internalProperty: ConstPtr = ConstPtr(0L),
        ): AlljoynInterfacedescriptionProperty =
            AlljoynInterfacedescriptionProperty(
                nameCtorArg = name,
                signatureCtorArg = signature,
                access = access,
                internalPropertyCtorArg = internalProperty,
            )
    }
}

public data class AlljoynKeystorelistenerCallbacks(
    public var loadRequest: AlljoynKeystorelistenerLoadrequestPtr = null,
    public var storeRequest: AlljoynKeystorelistenerStorerequestPtr = null,
)

public data class AlljoynKeystorelistenerWithSynchronizationCallbacks(
    public var loadRequest: AlljoynKeystorelistenerLoadrequestPtr = null,
    public var storeRequest: AlljoynKeystorelistenerStorerequestPtr = null,
    public var acquireExclusiveLock: AlljoynKeystorelistenerAcquireexclusivelockPtr = null,
    public var releaseExclusiveLock: AlljoynKeystorelistenerReleaseexclusivelockPtr = null,
)

public class AlljoynManifestarray internal constructor(
    public var count: Int,
    xmlsCtorArg: MutPtr,
) {
    public var xmls: MutPtr = xmlsCtorArg
        internal set

    public constructor() : this(
        count = 0,
        xmlsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.count

    public operator fun component2(): MutPtr = this.xmls

    public fun copy(count: Int = this.count, xmls: MutPtr = this.xmls): AlljoynManifestarray = AlljoynManifestarray(count = count, xmlsCtorArg = xmls)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AlljoynManifestarray) return false
        if (this.count != other.count) return false
        if (this.xmls != other.xmls) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.xmls.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AlljoynManifestarray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AlljoynManifestarray> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AlljoynManifestarray =
                    AlljoynManifestarray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AlljoynManifestarray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.xmls)
                }
            }

        public operator fun invoke(
            count: Int = 0,
            xmls: MutPtr = MutPtr(0L),
        ): AlljoynManifestarray =
            AlljoynManifestarray(
                count = count,
                xmlsCtorArg = xmls,
            )
    }
}

public data class AlljoynObserverlistenerCallback(
    public var objectDiscovered: AlljoynObserverObjectDiscoveredPtr = null,
    public var objectLost: AlljoynObserverObjectLostPtr = null,
)

public data class AlljoynPermissionconfigurationlistenerCallbacks(
    public var factoryReset: AlljoynPermissionconfigurationlistenerFactoryresetPtr = null,
    public var policyChanged: AlljoynPermissionconfigurationlistenerPolicychangedPtr = null,
    public var startManagement: AlljoynPermissionconfigurationlistenerStartmanagementPtr = null,
    public var endManagement: AlljoynPermissionconfigurationlistenerEndmanagementPtr = null,
)

public data class AlljoynPinglistenerCallback(
    public var destinationFound: AlljoynAutopingerDestinationFoundPtr = null,
    public var destinationLost: AlljoynAutopingerDestinationLostPtr = null,
)

public data class AlljoynSessionlistenerCallbacks(
    public var sessionLost: AlljoynSessionlistenerSessionlostPtr = null,
    public var sessionMemberAdded: AlljoynSessionlistenerSessionmemberaddedPtr = null,
    public var sessionMemberRemoved: AlljoynSessionlistenerSessionmemberremovedPtr = null,
)

public data class AlljoynSessionportlistenerCallbacks(
    public var acceptSessionJoiner: AlljoynSessionportlistenerAcceptsessionjoinerPtr = null,
    public var sessionJoined: AlljoynSessionportlistenerSessionjoinedPtr = null,
)
