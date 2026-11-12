@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfilteringplatform

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.security.Sid
import io.github.kotlinmania.windowssys.windows.win32.security.SidAndAttributes

public data class FwpmAction0(
    public var type: FwpActionType = 0u,
    public var anonymous: FwpmAction00 = FwpmAction00(),
)

public data class FwpmAction00(
    public var filterType: Guid = Guid(),
    public var calloutKey: Guid = Guid(),
)

public class FwpmCallout0 internal constructor(
    public var calloutKey: Guid,
    public var displayData: FwpmDisplayData0,
    public var flags: UInt,
    providerKeyCtorArg: MutPtr<Guid>,
    public var providerData: FwpByteBlob,
    public var applicableLayer: Guid,
    public var calloutId: UInt,
) {
    public var providerKey: MutPtr<Guid> = providerKeyCtorArg
        internal set

    public constructor() : this(
        calloutKey = Guid(),
        displayData = FwpmDisplayData0(),
        flags = 0u,
        providerKeyCtorArg = MutPtr(0L),
        providerData = FwpByteBlob(),
        applicableLayer = Guid(),
        calloutId = 0u,
    )

    public operator fun component1(): Guid = this.calloutKey

    public operator fun component2(): FwpmDisplayData0 = this.displayData

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): MutPtr<Guid> = this.providerKey

    public operator fun component5(): FwpByteBlob = this.providerData

    public operator fun component6(): Guid = this.applicableLayer

    public operator fun component7(): UInt = this.calloutId

    public fun copy(calloutKey: Guid = this.calloutKey, displayData: FwpmDisplayData0 = this.displayData, flags: UInt = this.flags, providerKey: MutPtr<Guid> = this.providerKey, providerData: FwpByteBlob = this.providerData, applicableLayer: Guid = this.applicableLayer, calloutId: UInt = this.calloutId): FwpmCallout0 = FwpmCallout0(calloutKey = calloutKey, displayData = displayData, flags = flags, providerKeyCtorArg = providerKey, providerData = providerData, applicableLayer = applicableLayer, calloutId = calloutId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmCallout0) return false
        if (this.calloutKey != other.calloutKey) return false
        if (this.displayData != other.displayData) return false
        if (this.flags != other.flags) return false
        if (this.providerKey != other.providerKey) return false
        if (this.providerData != other.providerData) return false
        if (this.applicableLayer != other.applicableLayer) return false
        if (this.calloutId != other.calloutId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.calloutKey.hashCode()
        result = 31 * result + this.displayData.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.providerKey.hashCode()
        result = 31 * result + this.providerData.hashCode()
        result = 31 * result + this.applicableLayer.hashCode()
        result = 31 * result + this.calloutId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            calloutKey: Guid = Guid(),
            displayData: FwpmDisplayData0 = FwpmDisplayData0(),
            flags: UInt = 0u,
            providerKey: MutPtr<Guid> = MutPtr(0L),
            providerData: FwpByteBlob = FwpByteBlob(),
            applicableLayer: Guid = Guid(),
            calloutId: UInt = 0u,
        ): FwpmCallout0 =
            FwpmCallout0(
                calloutKey = calloutKey,
                displayData = displayData,
                flags = flags,
                providerKeyCtorArg = providerKey,
                providerData = providerData,
                applicableLayer = applicableLayer,
                calloutId = calloutId,
            )
    }
}

public data class FwpmCalloutChange0(
    public var changeType: FwpmChangeType = 0,
    public var calloutKey: Guid = Guid(),
    public var calloutId: UInt = 0u,
)

public class FwpmCalloutEnumTemplate0 internal constructor(
    providerKeyCtorArg: MutPtr<Guid>,
    public var layerKey: Guid,
) {
    public var providerKey: MutPtr<Guid> = providerKeyCtorArg
        internal set

    public constructor() : this(
        providerKeyCtorArg = MutPtr(0L),
        layerKey = Guid(),
    )

    public operator fun component1(): MutPtr<Guid> = this.providerKey

    public operator fun component2(): Guid = this.layerKey

    public fun copy(providerKey: MutPtr<Guid> = this.providerKey, layerKey: Guid = this.layerKey): FwpmCalloutEnumTemplate0 = FwpmCalloutEnumTemplate0(providerKeyCtorArg = providerKey, layerKey = layerKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmCalloutEnumTemplate0) return false
        if (this.providerKey != other.providerKey) return false
        if (this.layerKey != other.layerKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerKey.hashCode()
        result = 31 * result + this.layerKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            providerKey: MutPtr<Guid> = MutPtr(0L),
            layerKey: Guid = Guid(),
        ): FwpmCalloutEnumTemplate0 =
            FwpmCalloutEnumTemplate0(
                providerKeyCtorArg = providerKey,
                layerKey = layerKey,
            )
    }
}

public class FwpmCalloutSubscription0 internal constructor(
    enumTemplateCtorArg: MutPtr<FwpmCalloutEnumTemplate0>,
    public var flags: UInt,
    public var sessionKey: Guid,
) {
    public var enumTemplate: MutPtr<FwpmCalloutEnumTemplate0> = enumTemplateCtorArg
        internal set

    public constructor() : this(
        enumTemplateCtorArg = MutPtr(0L),
        flags = 0u,
        sessionKey = Guid(),
    )

    public operator fun component1(): MutPtr<FwpmCalloutEnumTemplate0> = this.enumTemplate

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): Guid = this.sessionKey

    public fun copy(enumTemplate: MutPtr<FwpmCalloutEnumTemplate0> = this.enumTemplate, flags: UInt = this.flags, sessionKey: Guid = this.sessionKey): FwpmCalloutSubscription0 = FwpmCalloutSubscription0(enumTemplateCtorArg = enumTemplate, flags = flags, sessionKey = sessionKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmCalloutSubscription0) return false
        if (this.enumTemplate != other.enumTemplate) return false
        if (this.flags != other.flags) return false
        if (this.sessionKey != other.sessionKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enumTemplate.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.sessionKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            enumTemplate: MutPtr<FwpmCalloutEnumTemplate0> = MutPtr(0L),
            flags: UInt = 0u,
            sessionKey: Guid = Guid(),
        ): FwpmCalloutSubscription0 =
            FwpmCalloutSubscription0(
                enumTemplateCtorArg = enumTemplate,
                flags = flags,
                sessionKey = sessionKey,
            )
    }
}

public data class FwpmClassifyOption0(
    public var type: FwpClassifyOptionType = 0,
    public var value: FwpValue0 = FwpValue0(),
)

public class FwpmClassifyOptions0 internal constructor(
    public var numOptions: UInt,
    optionsCtorArg: MutPtr<FwpmClassifyOption0>,
) {
    public var options: MutPtr<FwpmClassifyOption0> = optionsCtorArg
        internal set

    public constructor() : this(
        numOptions = 0u,
        optionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numOptions

    public operator fun component2(): MutPtr<FwpmClassifyOption0> = this.options

    public fun copy(numOptions: UInt = this.numOptions, options: MutPtr<FwpmClassifyOption0> = this.options): FwpmClassifyOptions0 = FwpmClassifyOptions0(numOptions = numOptions, optionsCtorArg = options)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmClassifyOptions0) return false
        if (this.numOptions != other.numOptions) return false
        if (this.options != other.options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numOptions.hashCode()
        result = 31 * result + this.options.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmClassifyOptions0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmClassifyOptions0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmClassifyOptions0 =
                    FwpmClassifyOptions0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<FwpmClassifyOption0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FwpmClassifyOptions0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numOptions)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<FwpmClassifyOption0>(64)
                    ).writeNative(addr + 8L, value.options)
                }
            }

        public operator fun invoke(
            numOptions: UInt = 0u,
            options: MutPtr<FwpmClassifyOption0> = MutPtr(0L),
        ): FwpmClassifyOptions0 =
            FwpmClassifyOptions0(
                numOptions = numOptions,
                optionsCtorArg = options,
            )
    }
}

public class FwpmConnection0 internal constructor(
    public var connectionId: ULong,
    public var ipVersion: FwpIpVersion,
    public var anonymous1: FwpmConnection00,
    public var anonymous2: FwpmConnection01,
    providerKeyCtorArg: MutPtr<Guid>,
    public var ipsecTrafficModeType: IpsecTrafficType,
    public var keyModuleType: IkeextKeyModuleType,
    public var mmCrypto: IkeextProposal0,
    public var mmPeer: IkeextCredential2,
    public var emPeer: IkeextCredential2,
    public var bytesTransferredIn: ULong,
    public var bytesTransferredOut: ULong,
    public var bytesTransferredTotal: ULong,
    public var startSysTime: Filetime,
) {
    public var providerKey: MutPtr<Guid> = providerKeyCtorArg
        internal set

    public constructor() : this(
        connectionId = 0uL,
        ipVersion = 0,
        anonymous1 = FwpmConnection00(),
        anonymous2 = FwpmConnection01(),
        providerKeyCtorArg = MutPtr(0L),
        ipsecTrafficModeType = 0,
        keyModuleType = 0,
        mmCrypto = IkeextProposal0(),
        mmPeer = IkeextCredential2(),
        emPeer = IkeextCredential2(),
        bytesTransferredIn = 0uL,
        bytesTransferredOut = 0uL,
        bytesTransferredTotal = 0uL,
        startSysTime = Filetime(),
    )

    public operator fun component1(): ULong = this.connectionId

    public operator fun component2(): FwpIpVersion = this.ipVersion

    public operator fun component3(): FwpmConnection00 = this.anonymous1

    public operator fun component4(): FwpmConnection01 = this.anonymous2

    public operator fun component5(): MutPtr<Guid> = this.providerKey

    public operator fun component6(): IpsecTrafficType = this.ipsecTrafficModeType

    public operator fun component7(): IkeextKeyModuleType = this.keyModuleType

    public operator fun component8(): IkeextProposal0 = this.mmCrypto

    public operator fun component9(): IkeextCredential2 = this.mmPeer

    public operator fun component10(): IkeextCredential2 = this.emPeer

    public operator fun component11(): ULong = this.bytesTransferredIn

    public operator fun component12(): ULong = this.bytesTransferredOut

    public operator fun component13(): ULong = this.bytesTransferredTotal

    public operator fun component14(): Filetime = this.startSysTime

    public fun copy(connectionId: ULong = this.connectionId, ipVersion: FwpIpVersion = this.ipVersion, anonymous1: FwpmConnection00 = this.anonymous1, anonymous2: FwpmConnection01 = this.anonymous2, providerKey: MutPtr<Guid> = this.providerKey, ipsecTrafficModeType: IpsecTrafficType = this.ipsecTrafficModeType, keyModuleType: IkeextKeyModuleType = this.keyModuleType, mmCrypto: IkeextProposal0 = this.mmCrypto, mmPeer: IkeextCredential2 = this.mmPeer, emPeer: IkeextCredential2 = this.emPeer, bytesTransferredIn: ULong = this.bytesTransferredIn, bytesTransferredOut: ULong = this.bytesTransferredOut, bytesTransferredTotal: ULong = this.bytesTransferredTotal, startSysTime: Filetime = this.startSysTime): FwpmConnection0 = FwpmConnection0(connectionId = connectionId, ipVersion = ipVersion, anonymous1 = anonymous1, anonymous2 = anonymous2, providerKeyCtorArg = providerKey, ipsecTrafficModeType = ipsecTrafficModeType, keyModuleType = keyModuleType, mmCrypto = mmCrypto, mmPeer = mmPeer, emPeer = emPeer, bytesTransferredIn = bytesTransferredIn, bytesTransferredOut = bytesTransferredOut, bytesTransferredTotal = bytesTransferredTotal, startSysTime = startSysTime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmConnection0) return false
        if (this.connectionId != other.connectionId) return false
        if (this.ipVersion != other.ipVersion) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.providerKey != other.providerKey) return false
        if (this.ipsecTrafficModeType != other.ipsecTrafficModeType) return false
        if (this.keyModuleType != other.keyModuleType) return false
        if (this.mmCrypto != other.mmCrypto) return false
        if (this.mmPeer != other.mmPeer) return false
        if (this.emPeer != other.emPeer) return false
        if (this.bytesTransferredIn != other.bytesTransferredIn) return false
        if (this.bytesTransferredOut != other.bytesTransferredOut) return false
        if (this.bytesTransferredTotal != other.bytesTransferredTotal) return false
        if (this.startSysTime != other.startSysTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connectionId.hashCode()
        result = 31 * result + this.ipVersion.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.providerKey.hashCode()
        result = 31 * result + this.ipsecTrafficModeType.hashCode()
        result = 31 * result + this.keyModuleType.hashCode()
        result = 31 * result + this.mmCrypto.hashCode()
        result = 31 * result + this.mmPeer.hashCode()
        result = 31 * result + this.emPeer.hashCode()
        result = 31 * result + this.bytesTransferredIn.hashCode()
        result = 31 * result + this.bytesTransferredOut.hashCode()
        result = 31 * result + this.bytesTransferredTotal.hashCode()
        result = 31 * result + this.startSysTime.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            connectionId: ULong = 0uL,
            ipVersion: FwpIpVersion = 0,
            anonymous1: FwpmConnection00 = FwpmConnection00(),
            anonymous2: FwpmConnection01 = FwpmConnection01(),
            providerKey: MutPtr<Guid> = MutPtr(0L),
            ipsecTrafficModeType: IpsecTrafficType = 0,
            keyModuleType: IkeextKeyModuleType = 0,
            mmCrypto: IkeextProposal0 = IkeextProposal0(),
            mmPeer: IkeextCredential2 = IkeextCredential2(),
            emPeer: IkeextCredential2 = IkeextCredential2(),
            bytesTransferredIn: ULong = 0uL,
            bytesTransferredOut: ULong = 0uL,
            bytesTransferredTotal: ULong = 0uL,
            startSysTime: Filetime = Filetime(),
        ): FwpmConnection0 =
            FwpmConnection0(
                connectionId = connectionId,
                ipVersion = ipVersion,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                providerKeyCtorArg = providerKey,
                ipsecTrafficModeType = ipsecTrafficModeType,
                keyModuleType = keyModuleType,
                mmCrypto = mmCrypto,
                mmPeer = mmPeer,
                emPeer = emPeer,
                bytesTransferredIn = bytesTransferredIn,
                bytesTransferredOut = bytesTransferredOut,
                bytesTransferredTotal = bytesTransferredTotal,
                startSysTime = startSysTime,
            )
    }
}

public data class FwpmConnection00(
    public var localV4Address: UInt = 0u,
    public var localV6Address: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmConnection00) return false
        if (this.localV4Address != other.localV4Address) return false
        if (!this.localV6Address.contentEquals(other.localV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.localV4Address.hashCode()
        result = 31 * result + this.localV6Address.contentHashCode()
        return result
    }
}

public data class FwpmConnection01(
    public var remoteV4Address: UInt = 0u,
    public var remoteV6Address: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmConnection01) return false
        if (this.remoteV4Address != other.remoteV4Address) return false
        if (!this.remoteV6Address.contentEquals(other.remoteV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.remoteV4Address.hashCode()
        result = 31 * result + this.remoteV6Address.contentHashCode()
        return result
    }
}

public data class FwpmConnectionEnumTemplate0(
    public var connectionId: ULong = 0uL,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmConnectionEnumTemplate0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmConnectionEnumTemplate0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmConnectionEnumTemplate0 =
                    FwpmConnectionEnumTemplate0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FwpmConnectionEnumTemplate0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.connectionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                }
            }
    }
}

public class FwpmConnectionSubscription0 internal constructor(
    enumTemplateCtorArg: MutPtr<FwpmConnectionEnumTemplate0>,
    public var flags: UInt,
    public var sessionKey: Guid,
) {
    public var enumTemplate: MutPtr<FwpmConnectionEnumTemplate0> = enumTemplateCtorArg
        internal set

    public constructor() : this(
        enumTemplateCtorArg = MutPtr(0L),
        flags = 0u,
        sessionKey = Guid(),
    )

    public operator fun component1(): MutPtr<FwpmConnectionEnumTemplate0> = this.enumTemplate

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): Guid = this.sessionKey

    public fun copy(enumTemplate: MutPtr<FwpmConnectionEnumTemplate0> = this.enumTemplate, flags: UInt = this.flags, sessionKey: Guid = this.sessionKey): FwpmConnectionSubscription0 = FwpmConnectionSubscription0(enumTemplateCtorArg = enumTemplate, flags = flags, sessionKey = sessionKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmConnectionSubscription0) return false
        if (this.enumTemplate != other.enumTemplate) return false
        if (this.flags != other.flags) return false
        if (this.sessionKey != other.sessionKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enumTemplate.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.sessionKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            enumTemplate: MutPtr<FwpmConnectionEnumTemplate0> = MutPtr(0L),
            flags: UInt = 0u,
            sessionKey: Guid = Guid(),
        ): FwpmConnectionSubscription0 =
            FwpmConnectionSubscription0(
                enumTemplateCtorArg = enumTemplate,
                flags = flags,
                sessionKey = sessionKey,
            )
    }
}

public class FwpmDisplayData0 internal constructor(
    nameCtorArg: Pwstr,
    descriptionCtorArg: Pwstr,
) {
    public var name: Pwstr = nameCtorArg
        internal set

    public var description: Pwstr = descriptionCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = MutPtr(0L),
        descriptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.name

    public operator fun component2(): Pwstr = this.description

    public fun copy(name: Pwstr = this.name, description: Pwstr = this.description): FwpmDisplayData0 = FwpmDisplayData0(nameCtorArg = name, descriptionCtorArg = description)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmDisplayData0) return false
        if (this.name != other.name) return false
        if (this.description != other.description) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.description.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            name: Pwstr = MutPtr(0L),
            description: Pwstr = MutPtr(0L),
        ): FwpmDisplayData0 =
            FwpmDisplayData0(
                nameCtorArg = name,
                descriptionCtorArg = description,
            )
    }
}

public class FwpmField0 internal constructor(
    fieldKeyCtorArg: MutPtr<Guid>,
    public var type: FwpmFieldType,
    public var dataType: FwpDataType,
) {
    public var fieldKey: MutPtr<Guid> = fieldKeyCtorArg
        internal set

    public constructor() : this(
        fieldKeyCtorArg = MutPtr(0L),
        type = 0,
        dataType = 0,
    )

    public operator fun component1(): MutPtr<Guid> = this.fieldKey

    public operator fun component2(): FwpmFieldType = this.type

    public operator fun component3(): FwpDataType = this.dataType

    public fun copy(fieldKey: MutPtr<Guid> = this.fieldKey, type: FwpmFieldType = this.type, dataType: FwpDataType = this.dataType): FwpmField0 = FwpmField0(fieldKeyCtorArg = fieldKey, type = type, dataType = dataType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmField0) return false
        if (this.fieldKey != other.fieldKey) return false
        if (this.type != other.type) return false
        if (this.dataType != other.dataType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fieldKey.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.dataType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmField0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmField0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmField0 =
                    FwpmField0(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: FwpmField0) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr, value.fieldKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.dataType)
                }
            }

        public operator fun invoke(
            fieldKey: MutPtr<Guid> = MutPtr(0L),
            type: FwpmFieldType = 0,
            dataType: FwpDataType = 0,
        ): FwpmField0 =
            FwpmField0(
                fieldKeyCtorArg = fieldKey,
                type = type,
                dataType = dataType,
            )
    }
}

public class FwpmFilter0 internal constructor(
    public var filterKey: Guid,
    public var displayData: FwpmDisplayData0,
    public var flags: FwpmFilterFlags,
    providerKeyCtorArg: MutPtr<Guid>,
    public var providerData: FwpByteBlob,
    public var layerKey: Guid,
    public var subLayerKey: Guid,
    public var weight: FwpValue0,
    public var numFilterConditions: UInt,
    filterConditionCtorArg: MutPtr<FwpmFilterCondition0>,
    public var action: FwpmAction0,
    public var anonymous: FwpmFilter00,
    reservedCtorArg: MutPtr<Guid>,
    public var filterId: ULong,
    public var effectiveWeight: FwpValue0,
) {
    public var providerKey: MutPtr<Guid> = providerKeyCtorArg
        internal set

    public var filterCondition: MutPtr<FwpmFilterCondition0> = filterConditionCtorArg
        internal set

    public var reserved: MutPtr<Guid> = reservedCtorArg
        internal set

    public constructor() : this(
        filterKey = Guid(),
        displayData = FwpmDisplayData0(),
        flags = 0u,
        providerKeyCtorArg = MutPtr(0L),
        providerData = FwpByteBlob(),
        layerKey = Guid(),
        subLayerKey = Guid(),
        weight = FwpValue0(),
        numFilterConditions = 0u,
        filterConditionCtorArg = MutPtr(0L),
        action = FwpmAction0(),
        anonymous = FwpmFilter00(),
        reservedCtorArg = MutPtr(0L),
        filterId = 0uL,
        effectiveWeight = FwpValue0(),
    )

    public operator fun component1(): Guid = this.filterKey

    public operator fun component2(): FwpmDisplayData0 = this.displayData

    public operator fun component3(): FwpmFilterFlags = this.flags

    public operator fun component4(): MutPtr<Guid> = this.providerKey

    public operator fun component5(): FwpByteBlob = this.providerData

    public operator fun component6(): Guid = this.layerKey

    public operator fun component7(): Guid = this.subLayerKey

    public operator fun component8(): FwpValue0 = this.weight

    public operator fun component9(): UInt = this.numFilterConditions

    public operator fun component10(): MutPtr<FwpmFilterCondition0> = this.filterCondition

    public operator fun component11(): FwpmAction0 = this.action

    public operator fun component12(): FwpmFilter00 = this.anonymous

    public operator fun component13(): MutPtr<Guid> = this.reserved

    public operator fun component14(): ULong = this.filterId

    public operator fun component15(): FwpValue0 = this.effectiveWeight

    public fun copy(filterKey: Guid = this.filterKey, displayData: FwpmDisplayData0 = this.displayData, flags: FwpmFilterFlags = this.flags, providerKey: MutPtr<Guid> = this.providerKey, providerData: FwpByteBlob = this.providerData, layerKey: Guid = this.layerKey, subLayerKey: Guid = this.subLayerKey, weight: FwpValue0 = this.weight, numFilterConditions: UInt = this.numFilterConditions, filterCondition: MutPtr<FwpmFilterCondition0> = this.filterCondition, action: FwpmAction0 = this.action, anonymous: FwpmFilter00 = this.anonymous, reserved: MutPtr<Guid> = this.reserved, filterId: ULong = this.filterId, effectiveWeight: FwpValue0 = this.effectiveWeight): FwpmFilter0 = FwpmFilter0(filterKey = filterKey, displayData = displayData, flags = flags, providerKeyCtorArg = providerKey, providerData = providerData, layerKey = layerKey, subLayerKey = subLayerKey, weight = weight, numFilterConditions = numFilterConditions, filterConditionCtorArg = filterCondition, action = action, anonymous = anonymous, reservedCtorArg = reserved, filterId = filterId, effectiveWeight = effectiveWeight)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmFilter0) return false
        if (this.filterKey != other.filterKey) return false
        if (this.displayData != other.displayData) return false
        if (this.flags != other.flags) return false
        if (this.providerKey != other.providerKey) return false
        if (this.providerData != other.providerData) return false
        if (this.layerKey != other.layerKey) return false
        if (this.subLayerKey != other.subLayerKey) return false
        if (this.weight != other.weight) return false
        if (this.numFilterConditions != other.numFilterConditions) return false
        if (this.filterCondition != other.filterCondition) return false
        if (this.action != other.action) return false
        if (this.anonymous != other.anonymous) return false
        if (this.reserved != other.reserved) return false
        if (this.filterId != other.filterId) return false
        if (this.effectiveWeight != other.effectiveWeight) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.filterKey.hashCode()
        result = 31 * result + this.displayData.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.providerKey.hashCode()
        result = 31 * result + this.providerData.hashCode()
        result = 31 * result + this.layerKey.hashCode()
        result = 31 * result + this.subLayerKey.hashCode()
        result = 31 * result + this.weight.hashCode()
        result = 31 * result + this.numFilterConditions.hashCode()
        result = 31 * result + this.filterCondition.hashCode()
        result = 31 * result + this.action.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.filterId.hashCode()
        result = 31 * result + this.effectiveWeight.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            filterKey: Guid = Guid(),
            displayData: FwpmDisplayData0 = FwpmDisplayData0(),
            flags: FwpmFilterFlags = 0u,
            providerKey: MutPtr<Guid> = MutPtr(0L),
            providerData: FwpByteBlob = FwpByteBlob(),
            layerKey: Guid = Guid(),
            subLayerKey: Guid = Guid(),
            weight: FwpValue0 = FwpValue0(),
            numFilterConditions: UInt = 0u,
            filterCondition: MutPtr<FwpmFilterCondition0> = MutPtr(0L),
            action: FwpmAction0 = FwpmAction0(),
            anonymous: FwpmFilter00 = FwpmFilter00(),
            reserved: MutPtr<Guid> = MutPtr(0L),
            filterId: ULong = 0uL,
            effectiveWeight: FwpValue0 = FwpValue0(),
        ): FwpmFilter0 =
            FwpmFilter0(
                filterKey = filterKey,
                displayData = displayData,
                flags = flags,
                providerKeyCtorArg = providerKey,
                providerData = providerData,
                layerKey = layerKey,
                subLayerKey = subLayerKey,
                weight = weight,
                numFilterConditions = numFilterConditions,
                filterConditionCtorArg = filterCondition,
                action = action,
                anonymous = anonymous,
                reservedCtorArg = reserved,
                filterId = filterId,
                effectiveWeight = effectiveWeight,
            )
    }
}

public data class FwpmFilter00(
    public var rawContext: ULong = 0uL,
    public var providerContextKey: Guid = Guid(),
)

public data class FwpmFilterChange0(
    public var changeType: FwpmChangeType = 0,
    public var filterKey: Guid = Guid(),
    public var filterId: ULong = 0uL,
)

public data class FwpmFilterCondition0(
    public var fieldKey: Guid = Guid(),
    public var matchType: FwpMatchType = 0,
    public var conditionValue: FwpConditionValue0 = FwpConditionValue0(),
)

public class FwpmFilterEnumTemplate0 internal constructor(
    providerKeyCtorArg: MutPtr<Guid>,
    public var layerKey: Guid,
    public var enumType: FwpFilterEnumType,
    public var flags: UInt,
    providerContextTemplateCtorArg: MutPtr<FwpmProviderContextEnumTemplate0>,
    public var numFilterConditions: UInt,
    filterConditionCtorArg: MutPtr<FwpmFilterCondition0>,
    public var actionMask: UInt,
    calloutKeyCtorArg: MutPtr<Guid>,
) {
    public var providerKey: MutPtr<Guid> = providerKeyCtorArg
        internal set

    public var providerContextTemplate: MutPtr<FwpmProviderContextEnumTemplate0> = providerContextTemplateCtorArg
        internal set

    public var filterCondition: MutPtr<FwpmFilterCondition0> = filterConditionCtorArg
        internal set

    public var calloutKey: MutPtr<Guid> = calloutKeyCtorArg
        internal set

    public constructor() : this(
        providerKeyCtorArg = MutPtr(0L),
        layerKey = Guid(),
        enumType = 0,
        flags = 0u,
        providerContextTemplateCtorArg = MutPtr(0L),
        numFilterConditions = 0u,
        filterConditionCtorArg = MutPtr(0L),
        actionMask = 0u,
        calloutKeyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Guid> = this.providerKey

    public operator fun component2(): Guid = this.layerKey

    public operator fun component3(): FwpFilterEnumType = this.enumType

    public operator fun component4(): UInt = this.flags

    public operator fun component5(): MutPtr<FwpmProviderContextEnumTemplate0> = this.providerContextTemplate

    public operator fun component6(): UInt = this.numFilterConditions

    public operator fun component7(): MutPtr<FwpmFilterCondition0> = this.filterCondition

    public operator fun component8(): UInt = this.actionMask

    public operator fun component9(): MutPtr<Guid> = this.calloutKey

    public fun copy(providerKey: MutPtr<Guid> = this.providerKey, layerKey: Guid = this.layerKey, enumType: FwpFilterEnumType = this.enumType, flags: UInt = this.flags, providerContextTemplate: MutPtr<FwpmProviderContextEnumTemplate0> = this.providerContextTemplate, numFilterConditions: UInt = this.numFilterConditions, filterCondition: MutPtr<FwpmFilterCondition0> = this.filterCondition, actionMask: UInt = this.actionMask, calloutKey: MutPtr<Guid> = this.calloutKey): FwpmFilterEnumTemplate0 = FwpmFilterEnumTemplate0(providerKeyCtorArg = providerKey, layerKey = layerKey, enumType = enumType, flags = flags, providerContextTemplateCtorArg = providerContextTemplate, numFilterConditions = numFilterConditions, filterConditionCtorArg = filterCondition, actionMask = actionMask, calloutKeyCtorArg = calloutKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmFilterEnumTemplate0) return false
        if (this.providerKey != other.providerKey) return false
        if (this.layerKey != other.layerKey) return false
        if (this.enumType != other.enumType) return false
        if (this.flags != other.flags) return false
        if (this.providerContextTemplate != other.providerContextTemplate) return false
        if (this.numFilterConditions != other.numFilterConditions) return false
        if (this.filterCondition != other.filterCondition) return false
        if (this.actionMask != other.actionMask) return false
        if (this.calloutKey != other.calloutKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerKey.hashCode()
        result = 31 * result + this.layerKey.hashCode()
        result = 31 * result + this.enumType.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.providerContextTemplate.hashCode()
        result = 31 * result + this.numFilterConditions.hashCode()
        result = 31 * result + this.filterCondition.hashCode()
        result = 31 * result + this.actionMask.hashCode()
        result = 31 * result + this.calloutKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            providerKey: MutPtr<Guid> = MutPtr(0L),
            layerKey: Guid = Guid(),
            enumType: FwpFilterEnumType = 0,
            flags: UInt = 0u,
            providerContextTemplate: MutPtr<FwpmProviderContextEnumTemplate0> = MutPtr(0L),
            numFilterConditions: UInt = 0u,
            filterCondition: MutPtr<FwpmFilterCondition0> = MutPtr(0L),
            actionMask: UInt = 0u,
            calloutKey: MutPtr<Guid> = MutPtr(0L),
        ): FwpmFilterEnumTemplate0 =
            FwpmFilterEnumTemplate0(
                providerKeyCtorArg = providerKey,
                layerKey = layerKey,
                enumType = enumType,
                flags = flags,
                providerContextTemplateCtorArg = providerContextTemplate,
                numFilterConditions = numFilterConditions,
                filterConditionCtorArg = filterCondition,
                actionMask = actionMask,
                calloutKeyCtorArg = calloutKey,
            )
    }
}

public class FwpmFilterSubscription0 internal constructor(
    enumTemplateCtorArg: MutPtr<FwpmFilterEnumTemplate0>,
    public var flags: UInt,
    public var sessionKey: Guid,
) {
    public var enumTemplate: MutPtr<FwpmFilterEnumTemplate0> = enumTemplateCtorArg
        internal set

    public constructor() : this(
        enumTemplateCtorArg = MutPtr(0L),
        flags = 0u,
        sessionKey = Guid(),
    )

    public operator fun component1(): MutPtr<FwpmFilterEnumTemplate0> = this.enumTemplate

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): Guid = this.sessionKey

    public fun copy(enumTemplate: MutPtr<FwpmFilterEnumTemplate0> = this.enumTemplate, flags: UInt = this.flags, sessionKey: Guid = this.sessionKey): FwpmFilterSubscription0 = FwpmFilterSubscription0(enumTemplateCtorArg = enumTemplate, flags = flags, sessionKey = sessionKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmFilterSubscription0) return false
        if (this.enumTemplate != other.enumTemplate) return false
        if (this.flags != other.flags) return false
        if (this.sessionKey != other.sessionKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enumTemplate.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.sessionKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            enumTemplate: MutPtr<FwpmFilterEnumTemplate0> = MutPtr(0L),
            flags: UInt = 0u,
            sessionKey: Guid = Guid(),
        ): FwpmFilterSubscription0 =
            FwpmFilterSubscription0(
                enumTemplateCtorArg = enumTemplate,
                flags = flags,
                sessionKey = sessionKey,
            )
    }
}

public class FwpmLayer0 internal constructor(
    public var layerKey: Guid,
    public var displayData: FwpmDisplayData0,
    public var flags: UInt,
    public var numFields: UInt,
    fieldCtorArg: MutPtr<FwpmField0>,
    public var defaultSubLayerKey: Guid,
    public var layerId: UShort,
) {
    public var field: MutPtr<FwpmField0> = fieldCtorArg
        internal set

    public constructor() : this(
        layerKey = Guid(),
        displayData = FwpmDisplayData0(),
        flags = 0u,
        numFields = 0u,
        fieldCtorArg = MutPtr(0L),
        defaultSubLayerKey = Guid(),
        layerId = 0u,
    )

    public operator fun component1(): Guid = this.layerKey

    public operator fun component2(): FwpmDisplayData0 = this.displayData

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): UInt = this.numFields

    public operator fun component5(): MutPtr<FwpmField0> = this.field

    public operator fun component6(): Guid = this.defaultSubLayerKey

    public operator fun component7(): UShort = this.layerId

    public fun copy(layerKey: Guid = this.layerKey, displayData: FwpmDisplayData0 = this.displayData, flags: UInt = this.flags, numFields: UInt = this.numFields, field: MutPtr<FwpmField0> = this.field, defaultSubLayerKey: Guid = this.defaultSubLayerKey, layerId: UShort = this.layerId): FwpmLayer0 = FwpmLayer0(layerKey = layerKey, displayData = displayData, flags = flags, numFields = numFields, fieldCtorArg = field, defaultSubLayerKey = defaultSubLayerKey, layerId = layerId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmLayer0) return false
        if (this.layerKey != other.layerKey) return false
        if (this.displayData != other.displayData) return false
        if (this.flags != other.flags) return false
        if (this.numFields != other.numFields) return false
        if (this.field != other.field) return false
        if (this.defaultSubLayerKey != other.defaultSubLayerKey) return false
        if (this.layerId != other.layerId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.layerKey.hashCode()
        result = 31 * result + this.displayData.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.numFields.hashCode()
        result = 31 * result + this.field.hashCode()
        result = 31 * result + this.defaultSubLayerKey.hashCode()
        result = 31 * result + this.layerId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            layerKey: Guid = Guid(),
            displayData: FwpmDisplayData0 = FwpmDisplayData0(),
            flags: UInt = 0u,
            numFields: UInt = 0u,
            field: MutPtr<FwpmField0> = MutPtr(0L),
            defaultSubLayerKey: Guid = Guid(),
            layerId: UShort = 0u,
        ): FwpmLayer0 =
            FwpmLayer0(
                layerKey = layerKey,
                displayData = displayData,
                flags = flags,
                numFields = numFields,
                fieldCtorArg = field,
                defaultSubLayerKey = defaultSubLayerKey,
                layerId = layerId,
            )
    }
}

public data class FwpmLayerEnumTemplate0(
    public var reserved: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmLayerEnumTemplate0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmLayerEnumTemplate0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmLayerEnumTemplate0 =
                    FwpmLayerEnumTemplate0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FwpmLayerEnumTemplate0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.reserved)
                }
            }
    }
}

public data class FwpmLayerStatistics0(
    public var layerId: Guid = Guid(),
    public var classifyPermitCount: UInt = 0u,
    public var classifyBlockCount: UInt = 0u,
    public var classifyVetoCount: UInt = 0u,
    public var numCacheEntries: UInt = 0u,
)

public data class FwpmNetworkConnectionPolicySetting0(
    public var type: FwpNetworkConnectionPolicySettingType = 0,
    public var value: FwpValue0 = FwpValue0(),
)

public class FwpmNetworkConnectionPolicySettings0 internal constructor(
    public var numSettings: UInt,
    settingsCtorArg: MutPtr<FwpmNetworkConnectionPolicySetting0>,
) {
    public var settings: MutPtr<FwpmNetworkConnectionPolicySetting0> = settingsCtorArg
        internal set

    public constructor() : this(
        numSettings = 0u,
        settingsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numSettings

    public operator fun component2(): MutPtr<FwpmNetworkConnectionPolicySetting0> = this.settings

    public fun copy(numSettings: UInt = this.numSettings, settings: MutPtr<FwpmNetworkConnectionPolicySetting0> = this.settings): FwpmNetworkConnectionPolicySettings0 = FwpmNetworkConnectionPolicySettings0(numSettings = numSettings, settingsCtorArg = settings)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetworkConnectionPolicySettings0) return false
        if (this.numSettings != other.numSettings) return false
        if (this.settings != other.settings) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numSettings.hashCode()
        result = 31 * result + this.settings.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmNetworkConnectionPolicySettings0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmNetworkConnectionPolicySettings0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmNetworkConnectionPolicySettings0 =
                    FwpmNetworkConnectionPolicySettings0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<FwpmNetworkConnectionPolicySetting0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FwpmNetworkConnectionPolicySettings0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numSettings)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<FwpmNetworkConnectionPolicySetting0>(64)
                    ).writeNative(addr + 8L, value.settings)
                }
            }

        public operator fun invoke(
            numSettings: UInt = 0u,
            settings: MutPtr<FwpmNetworkConnectionPolicySetting0> = MutPtr(0L),
        ): FwpmNetworkConnectionPolicySettings0 =
            FwpmNetworkConnectionPolicySettings0(
                numSettings = numSettings,
                settingsCtorArg = settings,
            )
    }
}

public data class FwpmNetEvent0(
    public var header: FwpmNetEventHeader0 = FwpmNetEventHeader0(),
    public var type: FwpmNetEventType = 0,
    public var anonymous: FwpmNetEvent00 = FwpmNetEvent00(),
)

public class FwpmNetEvent00 internal constructor(
    ikeMmFailureCtorArg: MutPtr<FwpmNetEventIkeextMmFailure0>,
    ikeQmFailureCtorArg: MutPtr<FwpmNetEventIkeextQmFailure0>,
    ikeEmFailureCtorArg: MutPtr<FwpmNetEventIkeextEmFailure0>,
    classifyDropCtorArg: MutPtr<FwpmNetEventClassifyDrop0>,
    ipsecDropCtorArg: MutPtr<FwpmNetEventIpsecKernelDrop0>,
    idpDropCtorArg: MutPtr<FwpmNetEventIpsecDospDrop0>,
) {
    public var ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure0> = ikeMmFailureCtorArg
        internal set

    public var ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure0> = ikeQmFailureCtorArg
        internal set

    public var ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure0> = ikeEmFailureCtorArg
        internal set

    public var classifyDrop: MutPtr<FwpmNetEventClassifyDrop0> = classifyDropCtorArg
        internal set

    public var ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = ipsecDropCtorArg
        internal set

    public var idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = idpDropCtorArg
        internal set

    public constructor() : this(
        ikeMmFailureCtorArg = MutPtr(0L),
        ikeQmFailureCtorArg = MutPtr(0L),
        ikeEmFailureCtorArg = MutPtr(0L),
        classifyDropCtorArg = MutPtr(0L),
        ipsecDropCtorArg = MutPtr(0L),
        idpDropCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<FwpmNetEventIkeextMmFailure0> = this.ikeMmFailure

    public operator fun component2(): MutPtr<FwpmNetEventIkeextQmFailure0> = this.ikeQmFailure

    public operator fun component3(): MutPtr<FwpmNetEventIkeextEmFailure0> = this.ikeEmFailure

    public operator fun component4(): MutPtr<FwpmNetEventClassifyDrop0> = this.classifyDrop

    public operator fun component5(): MutPtr<FwpmNetEventIpsecKernelDrop0> = this.ipsecDrop

    public operator fun component6(): MutPtr<FwpmNetEventIpsecDospDrop0> = this.idpDrop

    public fun copy(ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure0> = this.ikeMmFailure, ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure0> = this.ikeQmFailure, ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure0> = this.ikeEmFailure, classifyDrop: MutPtr<FwpmNetEventClassifyDrop0> = this.classifyDrop, ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = this.ipsecDrop, idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = this.idpDrop): FwpmNetEvent00 = FwpmNetEvent00(ikeMmFailureCtorArg = ikeMmFailure, ikeQmFailureCtorArg = ikeQmFailure, ikeEmFailureCtorArg = ikeEmFailure, classifyDropCtorArg = classifyDrop, ipsecDropCtorArg = ipsecDrop, idpDropCtorArg = idpDrop)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEvent00) return false
        if (this.ikeMmFailure != other.ikeMmFailure) return false
        if (this.ikeQmFailure != other.ikeQmFailure) return false
        if (this.ikeEmFailure != other.ikeEmFailure) return false
        if (this.classifyDrop != other.classifyDrop) return false
        if (this.ipsecDrop != other.ipsecDrop) return false
        if (this.idpDrop != other.idpDrop) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ikeMmFailure.hashCode()
        result = 31 * result + this.ikeQmFailure.hashCode()
        result = 31 * result + this.ikeEmFailure.hashCode()
        result = 31 * result + this.classifyDrop.hashCode()
        result = 31 * result + this.ipsecDrop.hashCode()
        result = 31 * result + this.idpDrop.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure0> = MutPtr(0L),
            ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure0> = MutPtr(0L),
            ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure0> = MutPtr(0L),
            classifyDrop: MutPtr<FwpmNetEventClassifyDrop0> = MutPtr(0L),
            ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = MutPtr(0L),
            idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = MutPtr(0L),
        ): FwpmNetEvent00 =
            FwpmNetEvent00(
                ikeMmFailureCtorArg = ikeMmFailure,
                ikeQmFailureCtorArg = ikeQmFailure,
                ikeEmFailureCtorArg = ikeEmFailure,
                classifyDropCtorArg = classifyDrop,
                ipsecDropCtorArg = ipsecDrop,
                idpDropCtorArg = idpDrop,
            )
    }
}

public data class FwpmNetEvent1(
    public var header: FwpmNetEventHeader1 = FwpmNetEventHeader1(),
    public var type: FwpmNetEventType = 0,
    public var anonymous: FwpmNetEvent10 = FwpmNetEvent10(),
)

public class FwpmNetEvent10 internal constructor(
    ikeMmFailureCtorArg: MutPtr<FwpmNetEventIkeextMmFailure1>,
    ikeQmFailureCtorArg: MutPtr<FwpmNetEventIkeextQmFailure0>,
    ikeEmFailureCtorArg: MutPtr<FwpmNetEventIkeextEmFailure1>,
    classifyDropCtorArg: MutPtr<FwpmNetEventClassifyDrop1>,
    ipsecDropCtorArg: MutPtr<FwpmNetEventIpsecKernelDrop0>,
    idpDropCtorArg: MutPtr<FwpmNetEventIpsecDospDrop0>,
) {
    public var ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure1> = ikeMmFailureCtorArg
        internal set

    public var ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure0> = ikeQmFailureCtorArg
        internal set

    public var ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure1> = ikeEmFailureCtorArg
        internal set

    public var classifyDrop: MutPtr<FwpmNetEventClassifyDrop1> = classifyDropCtorArg
        internal set

    public var ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = ipsecDropCtorArg
        internal set

    public var idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = idpDropCtorArg
        internal set

    public constructor() : this(
        ikeMmFailureCtorArg = MutPtr(0L),
        ikeQmFailureCtorArg = MutPtr(0L),
        ikeEmFailureCtorArg = MutPtr(0L),
        classifyDropCtorArg = MutPtr(0L),
        ipsecDropCtorArg = MutPtr(0L),
        idpDropCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<FwpmNetEventIkeextMmFailure1> = this.ikeMmFailure

    public operator fun component2(): MutPtr<FwpmNetEventIkeextQmFailure0> = this.ikeQmFailure

    public operator fun component3(): MutPtr<FwpmNetEventIkeextEmFailure1> = this.ikeEmFailure

    public operator fun component4(): MutPtr<FwpmNetEventClassifyDrop1> = this.classifyDrop

    public operator fun component5(): MutPtr<FwpmNetEventIpsecKernelDrop0> = this.ipsecDrop

    public operator fun component6(): MutPtr<FwpmNetEventIpsecDospDrop0> = this.idpDrop

    public fun copy(ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure1> = this.ikeMmFailure, ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure0> = this.ikeQmFailure, ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure1> = this.ikeEmFailure, classifyDrop: MutPtr<FwpmNetEventClassifyDrop1> = this.classifyDrop, ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = this.ipsecDrop, idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = this.idpDrop): FwpmNetEvent10 = FwpmNetEvent10(ikeMmFailureCtorArg = ikeMmFailure, ikeQmFailureCtorArg = ikeQmFailure, ikeEmFailureCtorArg = ikeEmFailure, classifyDropCtorArg = classifyDrop, ipsecDropCtorArg = ipsecDrop, idpDropCtorArg = idpDrop)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEvent10) return false
        if (this.ikeMmFailure != other.ikeMmFailure) return false
        if (this.ikeQmFailure != other.ikeQmFailure) return false
        if (this.ikeEmFailure != other.ikeEmFailure) return false
        if (this.classifyDrop != other.classifyDrop) return false
        if (this.ipsecDrop != other.ipsecDrop) return false
        if (this.idpDrop != other.idpDrop) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ikeMmFailure.hashCode()
        result = 31 * result + this.ikeQmFailure.hashCode()
        result = 31 * result + this.ikeEmFailure.hashCode()
        result = 31 * result + this.classifyDrop.hashCode()
        result = 31 * result + this.ipsecDrop.hashCode()
        result = 31 * result + this.idpDrop.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure1> = MutPtr(0L),
            ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure0> = MutPtr(0L),
            ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure1> = MutPtr(0L),
            classifyDrop: MutPtr<FwpmNetEventClassifyDrop1> = MutPtr(0L),
            ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = MutPtr(0L),
            idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = MutPtr(0L),
        ): FwpmNetEvent10 =
            FwpmNetEvent10(
                ikeMmFailureCtorArg = ikeMmFailure,
                ikeQmFailureCtorArg = ikeQmFailure,
                ikeEmFailureCtorArg = ikeEmFailure,
                classifyDropCtorArg = classifyDrop,
                ipsecDropCtorArg = ipsecDrop,
                idpDropCtorArg = idpDrop,
            )
    }
}

public data class FwpmNetEvent2(
    public var header: FwpmNetEventHeader2 = FwpmNetEventHeader2(),
    public var type: FwpmNetEventType = 0,
    public var anonymous: FwpmNetEvent20 = FwpmNetEvent20(),
)

public class FwpmNetEvent20 internal constructor(
    ikeMmFailureCtorArg: MutPtr<FwpmNetEventIkeextMmFailure1>,
    ikeQmFailureCtorArg: MutPtr<FwpmNetEventIkeextQmFailure0>,
    ikeEmFailureCtorArg: MutPtr<FwpmNetEventIkeextEmFailure1>,
    classifyDropCtorArg: MutPtr<FwpmNetEventClassifyDrop2>,
    ipsecDropCtorArg: MutPtr<FwpmNetEventIpsecKernelDrop0>,
    idpDropCtorArg: MutPtr<FwpmNetEventIpsecDospDrop0>,
    classifyAllowCtorArg: MutPtr<FwpmNetEventClassifyAllow0>,
    capabilityDropCtorArg: MutPtr<FwpmNetEventCapabilityDrop0>,
    capabilityAllowCtorArg: MutPtr<FwpmNetEventCapabilityAllow0>,
    classifyDropMacCtorArg: MutPtr<FwpmNetEventClassifyDropMac0>,
) {
    public var ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure1> = ikeMmFailureCtorArg
        internal set

    public var ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure0> = ikeQmFailureCtorArg
        internal set

    public var ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure1> = ikeEmFailureCtorArg
        internal set

    public var classifyDrop: MutPtr<FwpmNetEventClassifyDrop2> = classifyDropCtorArg
        internal set

    public var ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = ipsecDropCtorArg
        internal set

    public var idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = idpDropCtorArg
        internal set

    public var classifyAllow: MutPtr<FwpmNetEventClassifyAllow0> = classifyAllowCtorArg
        internal set

    public var capabilityDrop: MutPtr<FwpmNetEventCapabilityDrop0> = capabilityDropCtorArg
        internal set

    public var capabilityAllow: MutPtr<FwpmNetEventCapabilityAllow0> = capabilityAllowCtorArg
        internal set

    public var classifyDropMac: MutPtr<FwpmNetEventClassifyDropMac0> = classifyDropMacCtorArg
        internal set

    public constructor() : this(
        ikeMmFailureCtorArg = MutPtr(0L),
        ikeQmFailureCtorArg = MutPtr(0L),
        ikeEmFailureCtorArg = MutPtr(0L),
        classifyDropCtorArg = MutPtr(0L),
        ipsecDropCtorArg = MutPtr(0L),
        idpDropCtorArg = MutPtr(0L),
        classifyAllowCtorArg = MutPtr(0L),
        capabilityDropCtorArg = MutPtr(0L),
        capabilityAllowCtorArg = MutPtr(0L),
        classifyDropMacCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<FwpmNetEventIkeextMmFailure1> = this.ikeMmFailure

    public operator fun component2(): MutPtr<FwpmNetEventIkeextQmFailure0> = this.ikeQmFailure

    public operator fun component3(): MutPtr<FwpmNetEventIkeextEmFailure1> = this.ikeEmFailure

    public operator fun component4(): MutPtr<FwpmNetEventClassifyDrop2> = this.classifyDrop

    public operator fun component5(): MutPtr<FwpmNetEventIpsecKernelDrop0> = this.ipsecDrop

    public operator fun component6(): MutPtr<FwpmNetEventIpsecDospDrop0> = this.idpDrop

    public operator fun component7(): MutPtr<FwpmNetEventClassifyAllow0> = this.classifyAllow

    public operator fun component8(): MutPtr<FwpmNetEventCapabilityDrop0> = this.capabilityDrop

    public operator fun component9(): MutPtr<FwpmNetEventCapabilityAllow0> = this.capabilityAllow

    public operator fun component10(): MutPtr<FwpmNetEventClassifyDropMac0> = this.classifyDropMac

    public fun copy(ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure1> = this.ikeMmFailure, ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure0> = this.ikeQmFailure, ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure1> = this.ikeEmFailure, classifyDrop: MutPtr<FwpmNetEventClassifyDrop2> = this.classifyDrop, ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = this.ipsecDrop, idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = this.idpDrop, classifyAllow: MutPtr<FwpmNetEventClassifyAllow0> = this.classifyAllow, capabilityDrop: MutPtr<FwpmNetEventCapabilityDrop0> = this.capabilityDrop, capabilityAllow: MutPtr<FwpmNetEventCapabilityAllow0> = this.capabilityAllow, classifyDropMac: MutPtr<FwpmNetEventClassifyDropMac0> = this.classifyDropMac): FwpmNetEvent20 = FwpmNetEvent20(ikeMmFailureCtorArg = ikeMmFailure, ikeQmFailureCtorArg = ikeQmFailure, ikeEmFailureCtorArg = ikeEmFailure, classifyDropCtorArg = classifyDrop, ipsecDropCtorArg = ipsecDrop, idpDropCtorArg = idpDrop, classifyAllowCtorArg = classifyAllow, capabilityDropCtorArg = capabilityDrop, capabilityAllowCtorArg = capabilityAllow, classifyDropMacCtorArg = classifyDropMac)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEvent20) return false
        if (this.ikeMmFailure != other.ikeMmFailure) return false
        if (this.ikeQmFailure != other.ikeQmFailure) return false
        if (this.ikeEmFailure != other.ikeEmFailure) return false
        if (this.classifyDrop != other.classifyDrop) return false
        if (this.ipsecDrop != other.ipsecDrop) return false
        if (this.idpDrop != other.idpDrop) return false
        if (this.classifyAllow != other.classifyAllow) return false
        if (this.capabilityDrop != other.capabilityDrop) return false
        if (this.capabilityAllow != other.capabilityAllow) return false
        if (this.classifyDropMac != other.classifyDropMac) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ikeMmFailure.hashCode()
        result = 31 * result + this.ikeQmFailure.hashCode()
        result = 31 * result + this.ikeEmFailure.hashCode()
        result = 31 * result + this.classifyDrop.hashCode()
        result = 31 * result + this.ipsecDrop.hashCode()
        result = 31 * result + this.idpDrop.hashCode()
        result = 31 * result + this.classifyAllow.hashCode()
        result = 31 * result + this.capabilityDrop.hashCode()
        result = 31 * result + this.capabilityAllow.hashCode()
        result = 31 * result + this.classifyDropMac.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure1> = MutPtr(0L),
            ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure0> = MutPtr(0L),
            ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure1> = MutPtr(0L),
            classifyDrop: MutPtr<FwpmNetEventClassifyDrop2> = MutPtr(0L),
            ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = MutPtr(0L),
            idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = MutPtr(0L),
            classifyAllow: MutPtr<FwpmNetEventClassifyAllow0> = MutPtr(0L),
            capabilityDrop: MutPtr<FwpmNetEventCapabilityDrop0> = MutPtr(0L),
            capabilityAllow: MutPtr<FwpmNetEventCapabilityAllow0> = MutPtr(0L),
            classifyDropMac: MutPtr<FwpmNetEventClassifyDropMac0> = MutPtr(0L),
        ): FwpmNetEvent20 =
            FwpmNetEvent20(
                ikeMmFailureCtorArg = ikeMmFailure,
                ikeQmFailureCtorArg = ikeQmFailure,
                ikeEmFailureCtorArg = ikeEmFailure,
                classifyDropCtorArg = classifyDrop,
                ipsecDropCtorArg = ipsecDrop,
                idpDropCtorArg = idpDrop,
                classifyAllowCtorArg = classifyAllow,
                capabilityDropCtorArg = capabilityDrop,
                capabilityAllowCtorArg = capabilityAllow,
                classifyDropMacCtorArg = classifyDropMac,
            )
    }
}

public data class FwpmNetEvent3(
    public var header: FwpmNetEventHeader3 = FwpmNetEventHeader3(),
    public var type: FwpmNetEventType = 0,
    public var anonymous: FwpmNetEvent30 = FwpmNetEvent30(),
)

public class FwpmNetEvent30 internal constructor(
    ikeMmFailureCtorArg: MutPtr<FwpmNetEventIkeextMmFailure1>,
    ikeQmFailureCtorArg: MutPtr<FwpmNetEventIkeextQmFailure0>,
    ikeEmFailureCtorArg: MutPtr<FwpmNetEventIkeextEmFailure1>,
    classifyDropCtorArg: MutPtr<FwpmNetEventClassifyDrop2>,
    ipsecDropCtorArg: MutPtr<FwpmNetEventIpsecKernelDrop0>,
    idpDropCtorArg: MutPtr<FwpmNetEventIpsecDospDrop0>,
    classifyAllowCtorArg: MutPtr<FwpmNetEventClassifyAllow0>,
    capabilityDropCtorArg: MutPtr<FwpmNetEventCapabilityDrop0>,
    capabilityAllowCtorArg: MutPtr<FwpmNetEventCapabilityAllow0>,
    classifyDropMacCtorArg: MutPtr<FwpmNetEventClassifyDropMac0>,
) {
    public var ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure1> = ikeMmFailureCtorArg
        internal set

    public var ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure0> = ikeQmFailureCtorArg
        internal set

    public var ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure1> = ikeEmFailureCtorArg
        internal set

    public var classifyDrop: MutPtr<FwpmNetEventClassifyDrop2> = classifyDropCtorArg
        internal set

    public var ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = ipsecDropCtorArg
        internal set

    public var idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = idpDropCtorArg
        internal set

    public var classifyAllow: MutPtr<FwpmNetEventClassifyAllow0> = classifyAllowCtorArg
        internal set

    public var capabilityDrop: MutPtr<FwpmNetEventCapabilityDrop0> = capabilityDropCtorArg
        internal set

    public var capabilityAllow: MutPtr<FwpmNetEventCapabilityAllow0> = capabilityAllowCtorArg
        internal set

    public var classifyDropMac: MutPtr<FwpmNetEventClassifyDropMac0> = classifyDropMacCtorArg
        internal set

    public constructor() : this(
        ikeMmFailureCtorArg = MutPtr(0L),
        ikeQmFailureCtorArg = MutPtr(0L),
        ikeEmFailureCtorArg = MutPtr(0L),
        classifyDropCtorArg = MutPtr(0L),
        ipsecDropCtorArg = MutPtr(0L),
        idpDropCtorArg = MutPtr(0L),
        classifyAllowCtorArg = MutPtr(0L),
        capabilityDropCtorArg = MutPtr(0L),
        capabilityAllowCtorArg = MutPtr(0L),
        classifyDropMacCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<FwpmNetEventIkeextMmFailure1> = this.ikeMmFailure

    public operator fun component2(): MutPtr<FwpmNetEventIkeextQmFailure0> = this.ikeQmFailure

    public operator fun component3(): MutPtr<FwpmNetEventIkeextEmFailure1> = this.ikeEmFailure

    public operator fun component4(): MutPtr<FwpmNetEventClassifyDrop2> = this.classifyDrop

    public operator fun component5(): MutPtr<FwpmNetEventIpsecKernelDrop0> = this.ipsecDrop

    public operator fun component6(): MutPtr<FwpmNetEventIpsecDospDrop0> = this.idpDrop

    public operator fun component7(): MutPtr<FwpmNetEventClassifyAllow0> = this.classifyAllow

    public operator fun component8(): MutPtr<FwpmNetEventCapabilityDrop0> = this.capabilityDrop

    public operator fun component9(): MutPtr<FwpmNetEventCapabilityAllow0> = this.capabilityAllow

    public operator fun component10(): MutPtr<FwpmNetEventClassifyDropMac0> = this.classifyDropMac

    public fun copy(ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure1> = this.ikeMmFailure, ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure0> = this.ikeQmFailure, ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure1> = this.ikeEmFailure, classifyDrop: MutPtr<FwpmNetEventClassifyDrop2> = this.classifyDrop, ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = this.ipsecDrop, idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = this.idpDrop, classifyAllow: MutPtr<FwpmNetEventClassifyAllow0> = this.classifyAllow, capabilityDrop: MutPtr<FwpmNetEventCapabilityDrop0> = this.capabilityDrop, capabilityAllow: MutPtr<FwpmNetEventCapabilityAllow0> = this.capabilityAllow, classifyDropMac: MutPtr<FwpmNetEventClassifyDropMac0> = this.classifyDropMac): FwpmNetEvent30 = FwpmNetEvent30(ikeMmFailureCtorArg = ikeMmFailure, ikeQmFailureCtorArg = ikeQmFailure, ikeEmFailureCtorArg = ikeEmFailure, classifyDropCtorArg = classifyDrop, ipsecDropCtorArg = ipsecDrop, idpDropCtorArg = idpDrop, classifyAllowCtorArg = classifyAllow, capabilityDropCtorArg = capabilityDrop, capabilityAllowCtorArg = capabilityAllow, classifyDropMacCtorArg = classifyDropMac)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEvent30) return false
        if (this.ikeMmFailure != other.ikeMmFailure) return false
        if (this.ikeQmFailure != other.ikeQmFailure) return false
        if (this.ikeEmFailure != other.ikeEmFailure) return false
        if (this.classifyDrop != other.classifyDrop) return false
        if (this.ipsecDrop != other.ipsecDrop) return false
        if (this.idpDrop != other.idpDrop) return false
        if (this.classifyAllow != other.classifyAllow) return false
        if (this.capabilityDrop != other.capabilityDrop) return false
        if (this.capabilityAllow != other.capabilityAllow) return false
        if (this.classifyDropMac != other.classifyDropMac) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ikeMmFailure.hashCode()
        result = 31 * result + this.ikeQmFailure.hashCode()
        result = 31 * result + this.ikeEmFailure.hashCode()
        result = 31 * result + this.classifyDrop.hashCode()
        result = 31 * result + this.ipsecDrop.hashCode()
        result = 31 * result + this.idpDrop.hashCode()
        result = 31 * result + this.classifyAllow.hashCode()
        result = 31 * result + this.capabilityDrop.hashCode()
        result = 31 * result + this.capabilityAllow.hashCode()
        result = 31 * result + this.classifyDropMac.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure1> = MutPtr(0L),
            ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure0> = MutPtr(0L),
            ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure1> = MutPtr(0L),
            classifyDrop: MutPtr<FwpmNetEventClassifyDrop2> = MutPtr(0L),
            ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = MutPtr(0L),
            idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = MutPtr(0L),
            classifyAllow: MutPtr<FwpmNetEventClassifyAllow0> = MutPtr(0L),
            capabilityDrop: MutPtr<FwpmNetEventCapabilityDrop0> = MutPtr(0L),
            capabilityAllow: MutPtr<FwpmNetEventCapabilityAllow0> = MutPtr(0L),
            classifyDropMac: MutPtr<FwpmNetEventClassifyDropMac0> = MutPtr(0L),
        ): FwpmNetEvent30 =
            FwpmNetEvent30(
                ikeMmFailureCtorArg = ikeMmFailure,
                ikeQmFailureCtorArg = ikeQmFailure,
                ikeEmFailureCtorArg = ikeEmFailure,
                classifyDropCtorArg = classifyDrop,
                ipsecDropCtorArg = ipsecDrop,
                idpDropCtorArg = idpDrop,
                classifyAllowCtorArg = classifyAllow,
                capabilityDropCtorArg = capabilityDrop,
                capabilityAllowCtorArg = capabilityAllow,
                classifyDropMacCtorArg = classifyDropMac,
            )
    }
}

public data class FwpmNetEvent4(
    public var header: FwpmNetEventHeader3 = FwpmNetEventHeader3(),
    public var type: FwpmNetEventType = 0,
    public var anonymous: FwpmNetEvent40 = FwpmNetEvent40(),
)

public class FwpmNetEvent40 internal constructor(
    ikeMmFailureCtorArg: MutPtr<FwpmNetEventIkeextMmFailure2>,
    ikeQmFailureCtorArg: MutPtr<FwpmNetEventIkeextQmFailure1>,
    ikeEmFailureCtorArg: MutPtr<FwpmNetEventIkeextEmFailure1>,
    classifyDropCtorArg: MutPtr<FwpmNetEventClassifyDrop2>,
    ipsecDropCtorArg: MutPtr<FwpmNetEventIpsecKernelDrop0>,
    idpDropCtorArg: MutPtr<FwpmNetEventIpsecDospDrop0>,
    classifyAllowCtorArg: MutPtr<FwpmNetEventClassifyAllow0>,
    capabilityDropCtorArg: MutPtr<FwpmNetEventCapabilityDrop0>,
    capabilityAllowCtorArg: MutPtr<FwpmNetEventCapabilityAllow0>,
    classifyDropMacCtorArg: MutPtr<FwpmNetEventClassifyDropMac0>,
) {
    public var ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure2> = ikeMmFailureCtorArg
        internal set

    public var ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure1> = ikeQmFailureCtorArg
        internal set

    public var ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure1> = ikeEmFailureCtorArg
        internal set

    public var classifyDrop: MutPtr<FwpmNetEventClassifyDrop2> = classifyDropCtorArg
        internal set

    public var ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = ipsecDropCtorArg
        internal set

    public var idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = idpDropCtorArg
        internal set

    public var classifyAllow: MutPtr<FwpmNetEventClassifyAllow0> = classifyAllowCtorArg
        internal set

    public var capabilityDrop: MutPtr<FwpmNetEventCapabilityDrop0> = capabilityDropCtorArg
        internal set

    public var capabilityAllow: MutPtr<FwpmNetEventCapabilityAllow0> = capabilityAllowCtorArg
        internal set

    public var classifyDropMac: MutPtr<FwpmNetEventClassifyDropMac0> = classifyDropMacCtorArg
        internal set

    public constructor() : this(
        ikeMmFailureCtorArg = MutPtr(0L),
        ikeQmFailureCtorArg = MutPtr(0L),
        ikeEmFailureCtorArg = MutPtr(0L),
        classifyDropCtorArg = MutPtr(0L),
        ipsecDropCtorArg = MutPtr(0L),
        idpDropCtorArg = MutPtr(0L),
        classifyAllowCtorArg = MutPtr(0L),
        capabilityDropCtorArg = MutPtr(0L),
        capabilityAllowCtorArg = MutPtr(0L),
        classifyDropMacCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<FwpmNetEventIkeextMmFailure2> = this.ikeMmFailure

    public operator fun component2(): MutPtr<FwpmNetEventIkeextQmFailure1> = this.ikeQmFailure

    public operator fun component3(): MutPtr<FwpmNetEventIkeextEmFailure1> = this.ikeEmFailure

    public operator fun component4(): MutPtr<FwpmNetEventClassifyDrop2> = this.classifyDrop

    public operator fun component5(): MutPtr<FwpmNetEventIpsecKernelDrop0> = this.ipsecDrop

    public operator fun component6(): MutPtr<FwpmNetEventIpsecDospDrop0> = this.idpDrop

    public operator fun component7(): MutPtr<FwpmNetEventClassifyAllow0> = this.classifyAllow

    public operator fun component8(): MutPtr<FwpmNetEventCapabilityDrop0> = this.capabilityDrop

    public operator fun component9(): MutPtr<FwpmNetEventCapabilityAllow0> = this.capabilityAllow

    public operator fun component10(): MutPtr<FwpmNetEventClassifyDropMac0> = this.classifyDropMac

    public fun copy(ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure2> = this.ikeMmFailure, ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure1> = this.ikeQmFailure, ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure1> = this.ikeEmFailure, classifyDrop: MutPtr<FwpmNetEventClassifyDrop2> = this.classifyDrop, ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = this.ipsecDrop, idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = this.idpDrop, classifyAllow: MutPtr<FwpmNetEventClassifyAllow0> = this.classifyAllow, capabilityDrop: MutPtr<FwpmNetEventCapabilityDrop0> = this.capabilityDrop, capabilityAllow: MutPtr<FwpmNetEventCapabilityAllow0> = this.capabilityAllow, classifyDropMac: MutPtr<FwpmNetEventClassifyDropMac0> = this.classifyDropMac): FwpmNetEvent40 = FwpmNetEvent40(ikeMmFailureCtorArg = ikeMmFailure, ikeQmFailureCtorArg = ikeQmFailure, ikeEmFailureCtorArg = ikeEmFailure, classifyDropCtorArg = classifyDrop, ipsecDropCtorArg = ipsecDrop, idpDropCtorArg = idpDrop, classifyAllowCtorArg = classifyAllow, capabilityDropCtorArg = capabilityDrop, capabilityAllowCtorArg = capabilityAllow, classifyDropMacCtorArg = classifyDropMac)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEvent40) return false
        if (this.ikeMmFailure != other.ikeMmFailure) return false
        if (this.ikeQmFailure != other.ikeQmFailure) return false
        if (this.ikeEmFailure != other.ikeEmFailure) return false
        if (this.classifyDrop != other.classifyDrop) return false
        if (this.ipsecDrop != other.ipsecDrop) return false
        if (this.idpDrop != other.idpDrop) return false
        if (this.classifyAllow != other.classifyAllow) return false
        if (this.capabilityDrop != other.capabilityDrop) return false
        if (this.capabilityAllow != other.capabilityAllow) return false
        if (this.classifyDropMac != other.classifyDropMac) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ikeMmFailure.hashCode()
        result = 31 * result + this.ikeQmFailure.hashCode()
        result = 31 * result + this.ikeEmFailure.hashCode()
        result = 31 * result + this.classifyDrop.hashCode()
        result = 31 * result + this.ipsecDrop.hashCode()
        result = 31 * result + this.idpDrop.hashCode()
        result = 31 * result + this.classifyAllow.hashCode()
        result = 31 * result + this.capabilityDrop.hashCode()
        result = 31 * result + this.capabilityAllow.hashCode()
        result = 31 * result + this.classifyDropMac.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure2> = MutPtr(0L),
            ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure1> = MutPtr(0L),
            ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure1> = MutPtr(0L),
            classifyDrop: MutPtr<FwpmNetEventClassifyDrop2> = MutPtr(0L),
            ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = MutPtr(0L),
            idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = MutPtr(0L),
            classifyAllow: MutPtr<FwpmNetEventClassifyAllow0> = MutPtr(0L),
            capabilityDrop: MutPtr<FwpmNetEventCapabilityDrop0> = MutPtr(0L),
            capabilityAllow: MutPtr<FwpmNetEventCapabilityAllow0> = MutPtr(0L),
            classifyDropMac: MutPtr<FwpmNetEventClassifyDropMac0> = MutPtr(0L),
        ): FwpmNetEvent40 =
            FwpmNetEvent40(
                ikeMmFailureCtorArg = ikeMmFailure,
                ikeQmFailureCtorArg = ikeQmFailure,
                ikeEmFailureCtorArg = ikeEmFailure,
                classifyDropCtorArg = classifyDrop,
                ipsecDropCtorArg = ipsecDrop,
                idpDropCtorArg = idpDrop,
                classifyAllowCtorArg = classifyAllow,
                capabilityDropCtorArg = capabilityDrop,
                capabilityAllowCtorArg = capabilityAllow,
                classifyDropMacCtorArg = classifyDropMac,
            )
    }
}

public data class FwpmNetEvent5(
    public var header: FwpmNetEventHeader3 = FwpmNetEventHeader3(),
    public var type: FwpmNetEventType = 0,
    public var anonymous: FwpmNetEvent50 = FwpmNetEvent50(),
)

public class FwpmNetEvent50 internal constructor(
    ikeMmFailureCtorArg: MutPtr<FwpmNetEventIkeextMmFailure2>,
    ikeQmFailureCtorArg: MutPtr<FwpmNetEventIkeextQmFailure1>,
    ikeEmFailureCtorArg: MutPtr<FwpmNetEventIkeextEmFailure1>,
    classifyDropCtorArg: MutPtr<FwpmNetEventClassifyDrop2>,
    ipsecDropCtorArg: MutPtr<FwpmNetEventIpsecKernelDrop0>,
    idpDropCtorArg: MutPtr<FwpmNetEventIpsecDospDrop0>,
    classifyAllowCtorArg: MutPtr<FwpmNetEventClassifyAllow0>,
    capabilityDropCtorArg: MutPtr<FwpmNetEventCapabilityDrop0>,
    capabilityAllowCtorArg: MutPtr<FwpmNetEventCapabilityAllow0>,
    classifyDropMacCtorArg: MutPtr<FwpmNetEventClassifyDropMac0>,
    lpmPacketArrivalCtorArg: MutPtr<FwpmNetEventLpmPacketArrival0>,
) {
    public var ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure2> = ikeMmFailureCtorArg
        internal set

    public var ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure1> = ikeQmFailureCtorArg
        internal set

    public var ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure1> = ikeEmFailureCtorArg
        internal set

    public var classifyDrop: MutPtr<FwpmNetEventClassifyDrop2> = classifyDropCtorArg
        internal set

    public var ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = ipsecDropCtorArg
        internal set

    public var idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = idpDropCtorArg
        internal set

    public var classifyAllow: MutPtr<FwpmNetEventClassifyAllow0> = classifyAllowCtorArg
        internal set

    public var capabilityDrop: MutPtr<FwpmNetEventCapabilityDrop0> = capabilityDropCtorArg
        internal set

    public var capabilityAllow: MutPtr<FwpmNetEventCapabilityAllow0> = capabilityAllowCtorArg
        internal set

    public var classifyDropMac: MutPtr<FwpmNetEventClassifyDropMac0> = classifyDropMacCtorArg
        internal set

    public var lpmPacketArrival: MutPtr<FwpmNetEventLpmPacketArrival0> = lpmPacketArrivalCtorArg
        internal set

    public constructor() : this(
        ikeMmFailureCtorArg = MutPtr(0L),
        ikeQmFailureCtorArg = MutPtr(0L),
        ikeEmFailureCtorArg = MutPtr(0L),
        classifyDropCtorArg = MutPtr(0L),
        ipsecDropCtorArg = MutPtr(0L),
        idpDropCtorArg = MutPtr(0L),
        classifyAllowCtorArg = MutPtr(0L),
        capabilityDropCtorArg = MutPtr(0L),
        capabilityAllowCtorArg = MutPtr(0L),
        classifyDropMacCtorArg = MutPtr(0L),
        lpmPacketArrivalCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<FwpmNetEventIkeextMmFailure2> = this.ikeMmFailure

    public operator fun component2(): MutPtr<FwpmNetEventIkeextQmFailure1> = this.ikeQmFailure

    public operator fun component3(): MutPtr<FwpmNetEventIkeextEmFailure1> = this.ikeEmFailure

    public operator fun component4(): MutPtr<FwpmNetEventClassifyDrop2> = this.classifyDrop

    public operator fun component5(): MutPtr<FwpmNetEventIpsecKernelDrop0> = this.ipsecDrop

    public operator fun component6(): MutPtr<FwpmNetEventIpsecDospDrop0> = this.idpDrop

    public operator fun component7(): MutPtr<FwpmNetEventClassifyAllow0> = this.classifyAllow

    public operator fun component8(): MutPtr<FwpmNetEventCapabilityDrop0> = this.capabilityDrop

    public operator fun component9(): MutPtr<FwpmNetEventCapabilityAllow0> = this.capabilityAllow

    public operator fun component10(): MutPtr<FwpmNetEventClassifyDropMac0> = this.classifyDropMac

    public operator fun component11(): MutPtr<FwpmNetEventLpmPacketArrival0> = this.lpmPacketArrival

    public fun copy(ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure2> = this.ikeMmFailure, ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure1> = this.ikeQmFailure, ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure1> = this.ikeEmFailure, classifyDrop: MutPtr<FwpmNetEventClassifyDrop2> = this.classifyDrop, ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = this.ipsecDrop, idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = this.idpDrop, classifyAllow: MutPtr<FwpmNetEventClassifyAllow0> = this.classifyAllow, capabilityDrop: MutPtr<FwpmNetEventCapabilityDrop0> = this.capabilityDrop, capabilityAllow: MutPtr<FwpmNetEventCapabilityAllow0> = this.capabilityAllow, classifyDropMac: MutPtr<FwpmNetEventClassifyDropMac0> = this.classifyDropMac, lpmPacketArrival: MutPtr<FwpmNetEventLpmPacketArrival0> = this.lpmPacketArrival): FwpmNetEvent50 = FwpmNetEvent50(ikeMmFailureCtorArg = ikeMmFailure, ikeQmFailureCtorArg = ikeQmFailure, ikeEmFailureCtorArg = ikeEmFailure, classifyDropCtorArg = classifyDrop, ipsecDropCtorArg = ipsecDrop, idpDropCtorArg = idpDrop, classifyAllowCtorArg = classifyAllow, capabilityDropCtorArg = capabilityDrop, capabilityAllowCtorArg = capabilityAllow, classifyDropMacCtorArg = classifyDropMac, lpmPacketArrivalCtorArg = lpmPacketArrival)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEvent50) return false
        if (this.ikeMmFailure != other.ikeMmFailure) return false
        if (this.ikeQmFailure != other.ikeQmFailure) return false
        if (this.ikeEmFailure != other.ikeEmFailure) return false
        if (this.classifyDrop != other.classifyDrop) return false
        if (this.ipsecDrop != other.ipsecDrop) return false
        if (this.idpDrop != other.idpDrop) return false
        if (this.classifyAllow != other.classifyAllow) return false
        if (this.capabilityDrop != other.capabilityDrop) return false
        if (this.capabilityAllow != other.capabilityAllow) return false
        if (this.classifyDropMac != other.classifyDropMac) return false
        if (this.lpmPacketArrival != other.lpmPacketArrival) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ikeMmFailure.hashCode()
        result = 31 * result + this.ikeQmFailure.hashCode()
        result = 31 * result + this.ikeEmFailure.hashCode()
        result = 31 * result + this.classifyDrop.hashCode()
        result = 31 * result + this.ipsecDrop.hashCode()
        result = 31 * result + this.idpDrop.hashCode()
        result = 31 * result + this.classifyAllow.hashCode()
        result = 31 * result + this.capabilityDrop.hashCode()
        result = 31 * result + this.capabilityAllow.hashCode()
        result = 31 * result + this.classifyDropMac.hashCode()
        result = 31 * result + this.lpmPacketArrival.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ikeMmFailure: MutPtr<FwpmNetEventIkeextMmFailure2> = MutPtr(0L),
            ikeQmFailure: MutPtr<FwpmNetEventIkeextQmFailure1> = MutPtr(0L),
            ikeEmFailure: MutPtr<FwpmNetEventIkeextEmFailure1> = MutPtr(0L),
            classifyDrop: MutPtr<FwpmNetEventClassifyDrop2> = MutPtr(0L),
            ipsecDrop: MutPtr<FwpmNetEventIpsecKernelDrop0> = MutPtr(0L),
            idpDrop: MutPtr<FwpmNetEventIpsecDospDrop0> = MutPtr(0L),
            classifyAllow: MutPtr<FwpmNetEventClassifyAllow0> = MutPtr(0L),
            capabilityDrop: MutPtr<FwpmNetEventCapabilityDrop0> = MutPtr(0L),
            capabilityAllow: MutPtr<FwpmNetEventCapabilityAllow0> = MutPtr(0L),
            classifyDropMac: MutPtr<FwpmNetEventClassifyDropMac0> = MutPtr(0L),
            lpmPacketArrival: MutPtr<FwpmNetEventLpmPacketArrival0> = MutPtr(0L),
        ): FwpmNetEvent50 =
            FwpmNetEvent50(
                ikeMmFailureCtorArg = ikeMmFailure,
                ikeQmFailureCtorArg = ikeQmFailure,
                ikeEmFailureCtorArg = ikeEmFailure,
                classifyDropCtorArg = classifyDrop,
                ipsecDropCtorArg = ipsecDrop,
                idpDropCtorArg = idpDrop,
                classifyAllowCtorArg = classifyAllow,
                capabilityDropCtorArg = capabilityDrop,
                capabilityAllowCtorArg = capabilityAllow,
                classifyDropMacCtorArg = classifyDropMac,
                lpmPacketArrivalCtorArg = lpmPacketArrival,
            )
    }
}

public data class FwpmNetEventCapabilityAllow0(
    public var networkCapabilityId: FwpmAppcNetworkCapabilityType = 0,
    public var filterId: ULong = 0uL,
    public var isLoopback: Bool = 0,
)

public data class FwpmNetEventCapabilityDrop0(
    public var networkCapabilityId: FwpmAppcNetworkCapabilityType = 0,
    public var filterId: ULong = 0uL,
    public var isLoopback: Bool = 0,
)

public data class FwpmNetEventClassifyAllow0(
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
    public var reauthReason: UInt = 0u,
    public var originalProfile: UInt = 0u,
    public var currentProfile: UInt = 0u,
    public var msFwpDirection: UInt = 0u,
    public var isLoopback: Bool = 0,
)

public data class FwpmNetEventClassifyDrop0(
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmNetEventClassifyDrop0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmNetEventClassifyDrop0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmNetEventClassifyDrop0 =
                    FwpmNetEventClassifyDrop0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FwpmNetEventClassifyDrop0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.filterId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.layerId)
                }
            }
    }
}

public data class FwpmNetEventClassifyDrop1(
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
    public var reauthReason: UInt = 0u,
    public var originalProfile: UInt = 0u,
    public var currentProfile: UInt = 0u,
    public var msFwpDirection: UInt = 0u,
    public var isLoopback: Bool = 0,
)

public data class FwpmNetEventClassifyDrop2(
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
    public var reauthReason: UInt = 0u,
    public var originalProfile: UInt = 0u,
    public var currentProfile: UInt = 0u,
    public var msFwpDirection: UInt = 0u,
    public var isLoopback: Bool = 0,
    public var vSwitchId: FwpByteBlob = FwpByteBlob(),
    public var vSwitchSourcePort: UInt = 0u,
    public var vSwitchDestinationPort: UInt = 0u,
)

public class FwpmNetEventClassifyDropMac0(
    public var localMacAddr: FwpByteArray6 = FwpByteArray6(),
    public var remoteMacAddr: FwpByteArray6 = FwpByteArray6(),
    public var mediaType: UInt = 0u,
    public var ifType: UInt = 0u,
    public var etherType: UShort = 0u,
    public var ndisPortNumber: UInt = 0u,
    public var reserved: UInt = 0u,
    public var vlanTag: UShort = 0u,
    public var ifLuid: ULong = 0uL,
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
    public var reauthReason: UInt = 0u,
    public var originalProfile: UInt = 0u,
    public var currentProfile: UInt = 0u,
    public var msFwpDirection: UInt = 0u,
    public var isLoopback: Bool = 0,
    public var vSwitchId: FwpByteBlob = FwpByteBlob(),
    public var vSwitchSourcePort: UInt = 0u,
    public var vSwitchDestinationPort: UInt = 0u,
)

public class FwpmNetEventEnumTemplate0 internal constructor(
    public var startTime: Filetime,
    public var endTime: Filetime,
    public var numFilterConditions: UInt,
    filterConditionCtorArg: MutPtr<FwpmFilterCondition0>,
) {
    public var filterCondition: MutPtr<FwpmFilterCondition0> = filterConditionCtorArg
        internal set

    public constructor() : this(
        startTime = Filetime(),
        endTime = Filetime(),
        numFilterConditions = 0u,
        filterConditionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Filetime = this.startTime

    public operator fun component2(): Filetime = this.endTime

    public operator fun component3(): UInt = this.numFilterConditions

    public operator fun component4(): MutPtr<FwpmFilterCondition0> = this.filterCondition

    public fun copy(startTime: Filetime = this.startTime, endTime: Filetime = this.endTime, numFilterConditions: UInt = this.numFilterConditions, filterCondition: MutPtr<FwpmFilterCondition0> = this.filterCondition): FwpmNetEventEnumTemplate0 = FwpmNetEventEnumTemplate0(startTime = startTime, endTime = endTime, numFilterConditions = numFilterConditions, filterConditionCtorArg = filterCondition)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventEnumTemplate0) return false
        if (this.startTime != other.startTime) return false
        if (this.endTime != other.endTime) return false
        if (this.numFilterConditions != other.numFilterConditions) return false
        if (this.filterCondition != other.filterCondition) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.startTime.hashCode()
        result = 31 * result + this.endTime.hashCode()
        result = 31 * result + this.numFilterConditions.hashCode()
        result = 31 * result + this.filterCondition.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            startTime: Filetime = Filetime(),
            endTime: Filetime = Filetime(),
            numFilterConditions: UInt = 0u,
            filterCondition: MutPtr<FwpmFilterCondition0> = MutPtr(0L),
        ): FwpmNetEventEnumTemplate0 =
            FwpmNetEventEnumTemplate0(
                startTime = startTime,
                endTime = endTime,
                numFilterConditions = numFilterConditions,
                filterConditionCtorArg = filterCondition,
            )
    }
}

public class FwpmNetEventHeader0 internal constructor(
    public var timeStamp: Filetime,
    public var flags: UInt,
    public var ipVersion: FwpIpVersion,
    public var ipProtocol: UByte,
    public var anonymous1: FwpmNetEventHeader00,
    public var anonymous2: FwpmNetEventHeader01,
    public var localPort: UShort,
    public var remotePort: UShort,
    public var scopeId: UInt,
    public var appId: FwpByteBlob,
    userIdCtorArg: MutPtr<Sid>,
) {
    public var userId: MutPtr<Sid> = userIdCtorArg
        internal set

    public constructor() : this(
        timeStamp = Filetime(),
        flags = 0u,
        ipVersion = 0,
        ipProtocol = 0u,
        anonymous1 = FwpmNetEventHeader00(),
        anonymous2 = FwpmNetEventHeader01(),
        localPort = 0u,
        remotePort = 0u,
        scopeId = 0u,
        appId = FwpByteBlob(),
        userIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Filetime = this.timeStamp

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): FwpIpVersion = this.ipVersion

    public operator fun component4(): UByte = this.ipProtocol

    public operator fun component5(): FwpmNetEventHeader00 = this.anonymous1

    public operator fun component6(): FwpmNetEventHeader01 = this.anonymous2

    public operator fun component7(): UShort = this.localPort

    public operator fun component8(): UShort = this.remotePort

    public operator fun component9(): UInt = this.scopeId

    public operator fun component10(): FwpByteBlob = this.appId

    public operator fun component11(): MutPtr<Sid> = this.userId

    public fun copy(timeStamp: Filetime = this.timeStamp, flags: UInt = this.flags, ipVersion: FwpIpVersion = this.ipVersion, ipProtocol: UByte = this.ipProtocol, anonymous1: FwpmNetEventHeader00 = this.anonymous1, anonymous2: FwpmNetEventHeader01 = this.anonymous2, localPort: UShort = this.localPort, remotePort: UShort = this.remotePort, scopeId: UInt = this.scopeId, appId: FwpByteBlob = this.appId, userId: MutPtr<Sid> = this.userId): FwpmNetEventHeader0 = FwpmNetEventHeader0(timeStamp = timeStamp, flags = flags, ipVersion = ipVersion, ipProtocol = ipProtocol, anonymous1 = anonymous1, anonymous2 = anonymous2, localPort = localPort, remotePort = remotePort, scopeId = scopeId, appId = appId, userIdCtorArg = userId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventHeader0) return false
        if (this.timeStamp != other.timeStamp) return false
        if (this.flags != other.flags) return false
        if (this.ipVersion != other.ipVersion) return false
        if (this.ipProtocol != other.ipProtocol) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.localPort != other.localPort) return false
        if (this.remotePort != other.remotePort) return false
        if (this.scopeId != other.scopeId) return false
        if (this.appId != other.appId) return false
        if (this.userId != other.userId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timeStamp.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.ipVersion.hashCode()
        result = 31 * result + this.ipProtocol.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.localPort.hashCode()
        result = 31 * result + this.remotePort.hashCode()
        result = 31 * result + this.scopeId.hashCode()
        result = 31 * result + this.appId.hashCode()
        result = 31 * result + this.userId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            timeStamp: Filetime = Filetime(),
            flags: UInt = 0u,
            ipVersion: FwpIpVersion = 0,
            ipProtocol: UByte = 0u,
            anonymous1: FwpmNetEventHeader00 = FwpmNetEventHeader00(),
            anonymous2: FwpmNetEventHeader01 = FwpmNetEventHeader01(),
            localPort: UShort = 0u,
            remotePort: UShort = 0u,
            scopeId: UInt = 0u,
            appId: FwpByteBlob = FwpByteBlob(),
            userId: MutPtr<Sid> = MutPtr(0L),
        ): FwpmNetEventHeader0 =
            FwpmNetEventHeader0(
                timeStamp = timeStamp,
                flags = flags,
                ipVersion = ipVersion,
                ipProtocol = ipProtocol,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                localPort = localPort,
                remotePort = remotePort,
                scopeId = scopeId,
                appId = appId,
                userIdCtorArg = userId,
            )
    }
}

public data class FwpmNetEventHeader00(
    public var localAddrV4: UInt = 0u,
    public var localAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public data class FwpmNetEventHeader01(
    public var remoteAddrV4: UInt = 0u,
    public var remoteAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public class FwpmNetEventHeader1 internal constructor(
    public var timeStamp: Filetime,
    public var flags: UInt,
    public var ipVersion: FwpIpVersion,
    public var ipProtocol: UByte,
    public var anonymous1: FwpmNetEventHeader10,
    public var anonymous2: FwpmNetEventHeader11,
    public var localPort: UShort,
    public var remotePort: UShort,
    public var scopeId: UInt,
    public var appId: FwpByteBlob,
    userIdCtorArg: MutPtr<Sid>,
    public var anonymous3: FwpmNetEventHeader12,
) {
    public var userId: MutPtr<Sid> = userIdCtorArg
        internal set

    public constructor() : this(
        timeStamp = Filetime(),
        flags = 0u,
        ipVersion = 0,
        ipProtocol = 0u,
        anonymous1 = FwpmNetEventHeader10(),
        anonymous2 = FwpmNetEventHeader11(),
        localPort = 0u,
        remotePort = 0u,
        scopeId = 0u,
        appId = FwpByteBlob(),
        userIdCtorArg = MutPtr(0L),
        anonymous3 = FwpmNetEventHeader12(),
    )

    public operator fun component1(): Filetime = this.timeStamp

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): FwpIpVersion = this.ipVersion

    public operator fun component4(): UByte = this.ipProtocol

    public operator fun component5(): FwpmNetEventHeader10 = this.anonymous1

    public operator fun component6(): FwpmNetEventHeader11 = this.anonymous2

    public operator fun component7(): UShort = this.localPort

    public operator fun component8(): UShort = this.remotePort

    public operator fun component9(): UInt = this.scopeId

    public operator fun component10(): FwpByteBlob = this.appId

    public operator fun component11(): MutPtr<Sid> = this.userId

    public operator fun component12(): FwpmNetEventHeader12 = this.anonymous3

    public fun copy(timeStamp: Filetime = this.timeStamp, flags: UInt = this.flags, ipVersion: FwpIpVersion = this.ipVersion, ipProtocol: UByte = this.ipProtocol, anonymous1: FwpmNetEventHeader10 = this.anonymous1, anonymous2: FwpmNetEventHeader11 = this.anonymous2, localPort: UShort = this.localPort, remotePort: UShort = this.remotePort, scopeId: UInt = this.scopeId, appId: FwpByteBlob = this.appId, userId: MutPtr<Sid> = this.userId, anonymous3: FwpmNetEventHeader12 = this.anonymous3): FwpmNetEventHeader1 = FwpmNetEventHeader1(timeStamp = timeStamp, flags = flags, ipVersion = ipVersion, ipProtocol = ipProtocol, anonymous1 = anonymous1, anonymous2 = anonymous2, localPort = localPort, remotePort = remotePort, scopeId = scopeId, appId = appId, userIdCtorArg = userId, anonymous3 = anonymous3)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventHeader1) return false
        if (this.timeStamp != other.timeStamp) return false
        if (this.flags != other.flags) return false
        if (this.ipVersion != other.ipVersion) return false
        if (this.ipProtocol != other.ipProtocol) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.localPort != other.localPort) return false
        if (this.remotePort != other.remotePort) return false
        if (this.scopeId != other.scopeId) return false
        if (this.appId != other.appId) return false
        if (this.userId != other.userId) return false
        if (this.anonymous3 != other.anonymous3) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timeStamp.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.ipVersion.hashCode()
        result = 31 * result + this.ipProtocol.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.localPort.hashCode()
        result = 31 * result + this.remotePort.hashCode()
        result = 31 * result + this.scopeId.hashCode()
        result = 31 * result + this.appId.hashCode()
        result = 31 * result + this.userId.hashCode()
        result = 31 * result + this.anonymous3.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            timeStamp: Filetime = Filetime(),
            flags: UInt = 0u,
            ipVersion: FwpIpVersion = 0,
            ipProtocol: UByte = 0u,
            anonymous1: FwpmNetEventHeader10 = FwpmNetEventHeader10(),
            anonymous2: FwpmNetEventHeader11 = FwpmNetEventHeader11(),
            localPort: UShort = 0u,
            remotePort: UShort = 0u,
            scopeId: UInt = 0u,
            appId: FwpByteBlob = FwpByteBlob(),
            userId: MutPtr<Sid> = MutPtr(0L),
            anonymous3: FwpmNetEventHeader12 = FwpmNetEventHeader12(),
        ): FwpmNetEventHeader1 =
            FwpmNetEventHeader1(
                timeStamp = timeStamp,
                flags = flags,
                ipVersion = ipVersion,
                ipProtocol = ipProtocol,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                localPort = localPort,
                remotePort = remotePort,
                scopeId = scopeId,
                appId = appId,
                userIdCtorArg = userId,
                anonymous3 = anonymous3,
            )
    }
}

public data class FwpmNetEventHeader10(
    public var localAddrV4: UInt = 0u,
    public var localAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public data class FwpmNetEventHeader11(
    public var remoteAddrV4: UInt = 0u,
    public var remoteAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public data class FwpmNetEventHeader12(
    public var anonymous: FwpmNetEventHeader120 = FwpmNetEventHeader120(),
)

public data class FwpmNetEventHeader120(
    public var reserved1: FwpAf = 0,
    public var anonymous: FwpmNetEventHeader1200 = FwpmNetEventHeader1200(),
)

public data class FwpmNetEventHeader1200(
    public var anonymous: FwpmNetEventHeader12000 = FwpmNetEventHeader12000(),
)

public data class FwpmNetEventHeader12000(
    public var reserved2: FwpByteArray6 = FwpByteArray6(),
    public var reserved3: FwpByteArray6 = FwpByteArray6(),
    public var reserved4: UInt = 0u,
    public var reserved5: UInt = 0u,
    public var reserved6: UShort = 0u,
    public var reserved7: UInt = 0u,
    public var reserved8: UInt = 0u,
    public var reserved9: UShort = 0u,
    public var reserved10: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmNetEventHeader12000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmNetEventHeader12000> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmNetEventHeader12000 =
                    FwpmNetEventHeader12000(
                        (FwpByteArray6.typeLayout()).readNative(addr),
                        (FwpByteArray6.typeLayout()).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: FwpmNetEventHeader12000) {
                    (FwpByteArray6.typeLayout()).writeNative(addr, value.reserved2)
                    (FwpByteArray6.typeLayout()).writeNative(addr + 6L, value.reserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.reserved5)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.reserved6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.reserved7)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.reserved8)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.reserved9)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.reserved10)
                }
            }
    }
}

public class FwpmNetEventHeader2 internal constructor(
    public var timeStamp: Filetime,
    public var flags: UInt,
    public var ipVersion: FwpIpVersion,
    public var ipProtocol: UByte,
    public var anonymous1: FwpmNetEventHeader20,
    public var anonymous2: FwpmNetEventHeader21,
    public var localPort: UShort,
    public var remotePort: UShort,
    public var scopeId: UInt,
    public var appId: FwpByteBlob,
    userIdCtorArg: MutPtr<Sid>,
    public var addressFamily: FwpAf,
    packageSidCtorArg: MutPtr<Sid>,
) {
    public var userId: MutPtr<Sid> = userIdCtorArg
        internal set

    public var packageSid: MutPtr<Sid> = packageSidCtorArg
        internal set

    public constructor() : this(
        timeStamp = Filetime(),
        flags = 0u,
        ipVersion = 0,
        ipProtocol = 0u,
        anonymous1 = FwpmNetEventHeader20(),
        anonymous2 = FwpmNetEventHeader21(),
        localPort = 0u,
        remotePort = 0u,
        scopeId = 0u,
        appId = FwpByteBlob(),
        userIdCtorArg = MutPtr(0L),
        addressFamily = 0,
        packageSidCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Filetime = this.timeStamp

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): FwpIpVersion = this.ipVersion

    public operator fun component4(): UByte = this.ipProtocol

    public operator fun component5(): FwpmNetEventHeader20 = this.anonymous1

    public operator fun component6(): FwpmNetEventHeader21 = this.anonymous2

    public operator fun component7(): UShort = this.localPort

    public operator fun component8(): UShort = this.remotePort

    public operator fun component9(): UInt = this.scopeId

    public operator fun component10(): FwpByteBlob = this.appId

    public operator fun component11(): MutPtr<Sid> = this.userId

    public operator fun component12(): FwpAf = this.addressFamily

    public operator fun component13(): MutPtr<Sid> = this.packageSid

    public fun copy(timeStamp: Filetime = this.timeStamp, flags: UInt = this.flags, ipVersion: FwpIpVersion = this.ipVersion, ipProtocol: UByte = this.ipProtocol, anonymous1: FwpmNetEventHeader20 = this.anonymous1, anonymous2: FwpmNetEventHeader21 = this.anonymous2, localPort: UShort = this.localPort, remotePort: UShort = this.remotePort, scopeId: UInt = this.scopeId, appId: FwpByteBlob = this.appId, userId: MutPtr<Sid> = this.userId, addressFamily: FwpAf = this.addressFamily, packageSid: MutPtr<Sid> = this.packageSid): FwpmNetEventHeader2 = FwpmNetEventHeader2(timeStamp = timeStamp, flags = flags, ipVersion = ipVersion, ipProtocol = ipProtocol, anonymous1 = anonymous1, anonymous2 = anonymous2, localPort = localPort, remotePort = remotePort, scopeId = scopeId, appId = appId, userIdCtorArg = userId, addressFamily = addressFamily, packageSidCtorArg = packageSid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventHeader2) return false
        if (this.timeStamp != other.timeStamp) return false
        if (this.flags != other.flags) return false
        if (this.ipVersion != other.ipVersion) return false
        if (this.ipProtocol != other.ipProtocol) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.localPort != other.localPort) return false
        if (this.remotePort != other.remotePort) return false
        if (this.scopeId != other.scopeId) return false
        if (this.appId != other.appId) return false
        if (this.userId != other.userId) return false
        if (this.addressFamily != other.addressFamily) return false
        if (this.packageSid != other.packageSid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timeStamp.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.ipVersion.hashCode()
        result = 31 * result + this.ipProtocol.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.localPort.hashCode()
        result = 31 * result + this.remotePort.hashCode()
        result = 31 * result + this.scopeId.hashCode()
        result = 31 * result + this.appId.hashCode()
        result = 31 * result + this.userId.hashCode()
        result = 31 * result + this.addressFamily.hashCode()
        result = 31 * result + this.packageSid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            timeStamp: Filetime = Filetime(),
            flags: UInt = 0u,
            ipVersion: FwpIpVersion = 0,
            ipProtocol: UByte = 0u,
            anonymous1: FwpmNetEventHeader20 = FwpmNetEventHeader20(),
            anonymous2: FwpmNetEventHeader21 = FwpmNetEventHeader21(),
            localPort: UShort = 0u,
            remotePort: UShort = 0u,
            scopeId: UInt = 0u,
            appId: FwpByteBlob = FwpByteBlob(),
            userId: MutPtr<Sid> = MutPtr(0L),
            addressFamily: FwpAf = 0,
            packageSid: MutPtr<Sid> = MutPtr(0L),
        ): FwpmNetEventHeader2 =
            FwpmNetEventHeader2(
                timeStamp = timeStamp,
                flags = flags,
                ipVersion = ipVersion,
                ipProtocol = ipProtocol,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                localPort = localPort,
                remotePort = remotePort,
                scopeId = scopeId,
                appId = appId,
                userIdCtorArg = userId,
                addressFamily = addressFamily,
                packageSidCtorArg = packageSid,
            )
    }
}

public data class FwpmNetEventHeader20(
    public var localAddrV4: UInt = 0u,
    public var localAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public data class FwpmNetEventHeader21(
    public var remoteAddrV4: UInt = 0u,
    public var remoteAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public class FwpmNetEventHeader3 internal constructor(
    public var timeStamp: Filetime,
    public var flags: UInt,
    public var ipVersion: FwpIpVersion,
    public var ipProtocol: UByte,
    public var anonymous1: FwpmNetEventHeader30,
    public var anonymous2: FwpmNetEventHeader31,
    public var localPort: UShort,
    public var remotePort: UShort,
    public var scopeId: UInt,
    public var appId: FwpByteBlob,
    userIdCtorArg: MutPtr<Sid>,
    public var addressFamily: FwpAf,
    packageSidCtorArg: MutPtr<Sid>,
    enterpriseIdCtorArg: Pwstr,
    public var policyFlags: ULong,
    public var effectiveName: FwpByteBlob,
) {
    public var userId: MutPtr<Sid> = userIdCtorArg
        internal set

    public var packageSid: MutPtr<Sid> = packageSidCtorArg
        internal set

    public var enterpriseId: Pwstr = enterpriseIdCtorArg
        internal set

    public constructor() : this(
        timeStamp = Filetime(),
        flags = 0u,
        ipVersion = 0,
        ipProtocol = 0u,
        anonymous1 = FwpmNetEventHeader30(),
        anonymous2 = FwpmNetEventHeader31(),
        localPort = 0u,
        remotePort = 0u,
        scopeId = 0u,
        appId = FwpByteBlob(),
        userIdCtorArg = MutPtr(0L),
        addressFamily = 0,
        packageSidCtorArg = MutPtr(0L),
        enterpriseIdCtorArg = MutPtr(0L),
        policyFlags = 0uL,
        effectiveName = FwpByteBlob(),
    )

    public operator fun component1(): Filetime = this.timeStamp

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): FwpIpVersion = this.ipVersion

    public operator fun component4(): UByte = this.ipProtocol

    public operator fun component5(): FwpmNetEventHeader30 = this.anonymous1

    public operator fun component6(): FwpmNetEventHeader31 = this.anonymous2

    public operator fun component7(): UShort = this.localPort

    public operator fun component8(): UShort = this.remotePort

    public operator fun component9(): UInt = this.scopeId

    public operator fun component10(): FwpByteBlob = this.appId

    public operator fun component11(): MutPtr<Sid> = this.userId

    public operator fun component12(): FwpAf = this.addressFamily

    public operator fun component13(): MutPtr<Sid> = this.packageSid

    public operator fun component14(): Pwstr = this.enterpriseId

    public operator fun component15(): ULong = this.policyFlags

    public operator fun component16(): FwpByteBlob = this.effectiveName

    public fun copy(timeStamp: Filetime = this.timeStamp, flags: UInt = this.flags, ipVersion: FwpIpVersion = this.ipVersion, ipProtocol: UByte = this.ipProtocol, anonymous1: FwpmNetEventHeader30 = this.anonymous1, anonymous2: FwpmNetEventHeader31 = this.anonymous2, localPort: UShort = this.localPort, remotePort: UShort = this.remotePort, scopeId: UInt = this.scopeId, appId: FwpByteBlob = this.appId, userId: MutPtr<Sid> = this.userId, addressFamily: FwpAf = this.addressFamily, packageSid: MutPtr<Sid> = this.packageSid, enterpriseId: Pwstr = this.enterpriseId, policyFlags: ULong = this.policyFlags, effectiveName: FwpByteBlob = this.effectiveName): FwpmNetEventHeader3 = FwpmNetEventHeader3(timeStamp = timeStamp, flags = flags, ipVersion = ipVersion, ipProtocol = ipProtocol, anonymous1 = anonymous1, anonymous2 = anonymous2, localPort = localPort, remotePort = remotePort, scopeId = scopeId, appId = appId, userIdCtorArg = userId, addressFamily = addressFamily, packageSidCtorArg = packageSid, enterpriseIdCtorArg = enterpriseId, policyFlags = policyFlags, effectiveName = effectiveName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventHeader3) return false
        if (this.timeStamp != other.timeStamp) return false
        if (this.flags != other.flags) return false
        if (this.ipVersion != other.ipVersion) return false
        if (this.ipProtocol != other.ipProtocol) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.localPort != other.localPort) return false
        if (this.remotePort != other.remotePort) return false
        if (this.scopeId != other.scopeId) return false
        if (this.appId != other.appId) return false
        if (this.userId != other.userId) return false
        if (this.addressFamily != other.addressFamily) return false
        if (this.packageSid != other.packageSid) return false
        if (this.enterpriseId != other.enterpriseId) return false
        if (this.policyFlags != other.policyFlags) return false
        if (this.effectiveName != other.effectiveName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timeStamp.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.ipVersion.hashCode()
        result = 31 * result + this.ipProtocol.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.localPort.hashCode()
        result = 31 * result + this.remotePort.hashCode()
        result = 31 * result + this.scopeId.hashCode()
        result = 31 * result + this.appId.hashCode()
        result = 31 * result + this.userId.hashCode()
        result = 31 * result + this.addressFamily.hashCode()
        result = 31 * result + this.packageSid.hashCode()
        result = 31 * result + this.enterpriseId.hashCode()
        result = 31 * result + this.policyFlags.hashCode()
        result = 31 * result + this.effectiveName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            timeStamp: Filetime = Filetime(),
            flags: UInt = 0u,
            ipVersion: FwpIpVersion = 0,
            ipProtocol: UByte = 0u,
            anonymous1: FwpmNetEventHeader30 = FwpmNetEventHeader30(),
            anonymous2: FwpmNetEventHeader31 = FwpmNetEventHeader31(),
            localPort: UShort = 0u,
            remotePort: UShort = 0u,
            scopeId: UInt = 0u,
            appId: FwpByteBlob = FwpByteBlob(),
            userId: MutPtr<Sid> = MutPtr(0L),
            addressFamily: FwpAf = 0,
            packageSid: MutPtr<Sid> = MutPtr(0L),
            enterpriseId: Pwstr = MutPtr(0L),
            policyFlags: ULong = 0uL,
            effectiveName: FwpByteBlob = FwpByteBlob(),
        ): FwpmNetEventHeader3 =
            FwpmNetEventHeader3(
                timeStamp = timeStamp,
                flags = flags,
                ipVersion = ipVersion,
                ipProtocol = ipProtocol,
                anonymous1 = anonymous1,
                anonymous2 = anonymous2,
                localPort = localPort,
                remotePort = remotePort,
                scopeId = scopeId,
                appId = appId,
                userIdCtorArg = userId,
                addressFamily = addressFamily,
                packageSidCtorArg = packageSid,
                enterpriseIdCtorArg = enterpriseId,
                policyFlags = policyFlags,
                effectiveName = effectiveName,
            )
    }
}

public data class FwpmNetEventHeader30(
    public var localAddrV4: UInt = 0u,
    public var localAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public data class FwpmNetEventHeader31(
    public var remoteAddrV4: UInt = 0u,
    public var remoteAddrV6: FwpByteArray16 = FwpByteArray16(),
)

public data class FwpmNetEventIkeextEmFailure0(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IpsecFailurePoint = 0,
    public var flags: UInt = 0u,
    public var emState: IkeextEmSaState = 0,
    public var saRole: IkeextSaRole = 0,
    public var emAuthMethod: IkeextAuthenticationMethodType = 0,
    public var endCertHash: UByteArray = UByteArray(20),
    public var mmId: ULong = 0uL,
    public var qmFilterId: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventIkeextEmFailure0) return false
        if (this.failureErrorCode != other.failureErrorCode) return false
        if (this.failurePoint != other.failurePoint) return false
        if (this.flags != other.flags) return false
        if (this.emState != other.emState) return false
        if (this.saRole != other.saRole) return false
        if (this.emAuthMethod != other.emAuthMethod) return false
        if (!this.endCertHash.contentEquals(other.endCertHash)) return false
        if (this.mmId != other.mmId) return false
        if (this.qmFilterId != other.qmFilterId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.failureErrorCode.hashCode()
        result = 31 * result + this.failurePoint.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.emState.hashCode()
        result = 31 * result + this.saRole.hashCode()
        result = 31 * result + this.emAuthMethod.hashCode()
        result = 31 * result + this.endCertHash.contentHashCode()
        result = 31 * result + this.mmId.hashCode()
        result = 31 * result + this.qmFilterId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmNetEventIkeextEmFailure0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmNetEventIkeextEmFailure0> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmNetEventIkeextEmFailure0 =
                    FwpmNetEventIkeextEmFailure0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: FwpmNetEventIkeextEmFailure0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.failureErrorCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.failurePoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.emState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.saRole)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.emAuthMethod)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 24L, value.endCertHash)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.mmId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.qmFilterId)
                }
            }
    }
}

public class FwpmNetEventIkeextEmFailure1 internal constructor(
    public var failureErrorCode: UInt,
    public var failurePoint: IpsecFailurePoint,
    public var flags: UInt,
    public var emState: IkeextEmSaState,
    public var saRole: IkeextSaRole,
    public var emAuthMethod: IkeextAuthenticationMethodType,
    public var endCertHash: UByteArray,
    public var mmId: ULong,
    public var qmFilterId: ULong,
    localPrincipalNameForAuthCtorArg: Pwstr,
    remotePrincipalNameForAuthCtorArg: Pwstr,
    public var numLocalPrincipalGroupSids: UInt,
    localPrincipalGroupSidsCtorArg: MutPtr<Pwstr>,
    public var numRemotePrincipalGroupSids: UInt,
    remotePrincipalGroupSidsCtorArg: MutPtr<Pwstr>,
    public var saTrafficType: IpsecTrafficType,
) {
    public var localPrincipalNameForAuth: Pwstr = localPrincipalNameForAuthCtorArg
        internal set

    public var remotePrincipalNameForAuth: Pwstr = remotePrincipalNameForAuthCtorArg
        internal set

    public var localPrincipalGroupSids: MutPtr<Pwstr> = localPrincipalGroupSidsCtorArg
        internal set

    public var remotePrincipalGroupSids: MutPtr<Pwstr> = remotePrincipalGroupSidsCtorArg
        internal set

    public constructor() : this(
        failureErrorCode = 0u,
        failurePoint = 0,
        flags = 0u,
        emState = 0,
        saRole = 0,
        emAuthMethod = 0,
        endCertHash = UByteArray(20),
        mmId = 0uL,
        qmFilterId = 0uL,
        localPrincipalNameForAuthCtorArg = MutPtr(0L),
        remotePrincipalNameForAuthCtorArg = MutPtr(0L),
        numLocalPrincipalGroupSids = 0u,
        localPrincipalGroupSidsCtorArg = MutPtr(0L),
        numRemotePrincipalGroupSids = 0u,
        remotePrincipalGroupSidsCtorArg = MutPtr(0L),
        saTrafficType = 0,
    )

    public operator fun component1(): UInt = this.failureErrorCode

    public operator fun component2(): IpsecFailurePoint = this.failurePoint

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): IkeextEmSaState = this.emState

    public operator fun component5(): IkeextSaRole = this.saRole

    public operator fun component6(): IkeextAuthenticationMethodType = this.emAuthMethod

    public operator fun component7(): UByteArray = this.endCertHash

    public operator fun component8(): ULong = this.mmId

    public operator fun component9(): ULong = this.qmFilterId

    public operator fun component10(): Pwstr = this.localPrincipalNameForAuth

    public operator fun component11(): Pwstr = this.remotePrincipalNameForAuth

    public operator fun component12(): UInt = this.numLocalPrincipalGroupSids

    public operator fun component13(): MutPtr<Pwstr> = this.localPrincipalGroupSids

    public operator fun component14(): UInt = this.numRemotePrincipalGroupSids

    public operator fun component15(): MutPtr<Pwstr> = this.remotePrincipalGroupSids

    public operator fun component16(): IpsecTrafficType = this.saTrafficType

    public fun copy(failureErrorCode: UInt = this.failureErrorCode, failurePoint: IpsecFailurePoint = this.failurePoint, flags: UInt = this.flags, emState: IkeextEmSaState = this.emState, saRole: IkeextSaRole = this.saRole, emAuthMethod: IkeextAuthenticationMethodType = this.emAuthMethod, endCertHash: UByteArray = this.endCertHash, mmId: ULong = this.mmId, qmFilterId: ULong = this.qmFilterId, localPrincipalNameForAuth: Pwstr = this.localPrincipalNameForAuth, remotePrincipalNameForAuth: Pwstr = this.remotePrincipalNameForAuth, numLocalPrincipalGroupSids: UInt = this.numLocalPrincipalGroupSids, localPrincipalGroupSids: MutPtr<Pwstr> = this.localPrincipalGroupSids, numRemotePrincipalGroupSids: UInt = this.numRemotePrincipalGroupSids, remotePrincipalGroupSids: MutPtr<Pwstr> = this.remotePrincipalGroupSids, saTrafficType: IpsecTrafficType = this.saTrafficType): FwpmNetEventIkeextEmFailure1 = FwpmNetEventIkeextEmFailure1(failureErrorCode = failureErrorCode, failurePoint = failurePoint, flags = flags, emState = emState, saRole = saRole, emAuthMethod = emAuthMethod, endCertHash = endCertHash, mmId = mmId, qmFilterId = qmFilterId, localPrincipalNameForAuthCtorArg = localPrincipalNameForAuth, remotePrincipalNameForAuthCtorArg = remotePrincipalNameForAuth, numLocalPrincipalGroupSids = numLocalPrincipalGroupSids, localPrincipalGroupSidsCtorArg = localPrincipalGroupSids, numRemotePrincipalGroupSids = numRemotePrincipalGroupSids, remotePrincipalGroupSidsCtorArg = remotePrincipalGroupSids, saTrafficType = saTrafficType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventIkeextEmFailure1) return false
        if (this.failureErrorCode != other.failureErrorCode) return false
        if (this.failurePoint != other.failurePoint) return false
        if (this.flags != other.flags) return false
        if (this.emState != other.emState) return false
        if (this.saRole != other.saRole) return false
        if (this.emAuthMethod != other.emAuthMethod) return false
        if (!this.endCertHash.contentEquals(other.endCertHash)) return false
        if (this.mmId != other.mmId) return false
        if (this.qmFilterId != other.qmFilterId) return false
        if (this.localPrincipalNameForAuth != other.localPrincipalNameForAuth) return false
        if (this.remotePrincipalNameForAuth != other.remotePrincipalNameForAuth) return false
        if (this.numLocalPrincipalGroupSids != other.numLocalPrincipalGroupSids) return false
        if (this.localPrincipalGroupSids != other.localPrincipalGroupSids) return false
        if (this.numRemotePrincipalGroupSids != other.numRemotePrincipalGroupSids) return false
        if (this.remotePrincipalGroupSids != other.remotePrincipalGroupSids) return false
        if (this.saTrafficType != other.saTrafficType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.failureErrorCode.hashCode()
        result = 31 * result + this.failurePoint.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.emState.hashCode()
        result = 31 * result + this.saRole.hashCode()
        result = 31 * result + this.emAuthMethod.hashCode()
        result = 31 * result + this.endCertHash.contentHashCode()
        result = 31 * result + this.mmId.hashCode()
        result = 31 * result + this.qmFilterId.hashCode()
        result = 31 * result + this.localPrincipalNameForAuth.hashCode()
        result = 31 * result + this.remotePrincipalNameForAuth.hashCode()
        result = 31 * result + this.numLocalPrincipalGroupSids.hashCode()
        result = 31 * result + this.localPrincipalGroupSids.hashCode()
        result = 31 * result + this.numRemotePrincipalGroupSids.hashCode()
        result = 31 * result + this.remotePrincipalGroupSids.hashCode()
        result = 31 * result + this.saTrafficType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            failureErrorCode: UInt = 0u,
            failurePoint: IpsecFailurePoint = 0,
            flags: UInt = 0u,
            emState: IkeextEmSaState = 0,
            saRole: IkeextSaRole = 0,
            emAuthMethod: IkeextAuthenticationMethodType = 0,
            endCertHash: UByteArray = UByteArray(20),
            mmId: ULong = 0uL,
            qmFilterId: ULong = 0uL,
            localPrincipalNameForAuth: Pwstr = MutPtr(0L),
            remotePrincipalNameForAuth: Pwstr = MutPtr(0L),
            numLocalPrincipalGroupSids: UInt = 0u,
            localPrincipalGroupSids: MutPtr<Pwstr> = MutPtr(0L),
            numRemotePrincipalGroupSids: UInt = 0u,
            remotePrincipalGroupSids: MutPtr<Pwstr> = MutPtr(0L),
            saTrafficType: IpsecTrafficType = 0,
        ): FwpmNetEventIkeextEmFailure1 =
            FwpmNetEventIkeextEmFailure1(
                failureErrorCode = failureErrorCode,
                failurePoint = failurePoint,
                flags = flags,
                emState = emState,
                saRole = saRole,
                emAuthMethod = emAuthMethod,
                endCertHash = endCertHash,
                mmId = mmId,
                qmFilterId = qmFilterId,
                localPrincipalNameForAuthCtorArg = localPrincipalNameForAuth,
                remotePrincipalNameForAuthCtorArg = remotePrincipalNameForAuth,
                numLocalPrincipalGroupSids = numLocalPrincipalGroupSids,
                localPrincipalGroupSidsCtorArg = localPrincipalGroupSids,
                numRemotePrincipalGroupSids = numRemotePrincipalGroupSids,
                remotePrincipalGroupSidsCtorArg = remotePrincipalGroupSids,
                saTrafficType = saTrafficType,
            )
    }
}

public data class FwpmNetEventIkeextMmFailure0(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IpsecFailurePoint = 0,
    public var flags: UInt = 0u,
    public var keyingModuleType: IkeextKeyModuleType = 0,
    public var mmState: IkeextMmSaState = 0,
    public var saRole: IkeextSaRole = 0,
    public var mmAuthMethod: IkeextAuthenticationMethodType = 0,
    public var endCertHash: UByteArray = UByteArray(20),
    public var mmId: ULong = 0uL,
    public var mmFilterId: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventIkeextMmFailure0) return false
        if (this.failureErrorCode != other.failureErrorCode) return false
        if (this.failurePoint != other.failurePoint) return false
        if (this.flags != other.flags) return false
        if (this.keyingModuleType != other.keyingModuleType) return false
        if (this.mmState != other.mmState) return false
        if (this.saRole != other.saRole) return false
        if (this.mmAuthMethod != other.mmAuthMethod) return false
        if (!this.endCertHash.contentEquals(other.endCertHash)) return false
        if (this.mmId != other.mmId) return false
        if (this.mmFilterId != other.mmFilterId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.failureErrorCode.hashCode()
        result = 31 * result + this.failurePoint.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.keyingModuleType.hashCode()
        result = 31 * result + this.mmState.hashCode()
        result = 31 * result + this.saRole.hashCode()
        result = 31 * result + this.mmAuthMethod.hashCode()
        result = 31 * result + this.endCertHash.contentHashCode()
        result = 31 * result + this.mmId.hashCode()
        result = 31 * result + this.mmFilterId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmNetEventIkeextMmFailure0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmNetEventIkeextMmFailure0> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmNetEventIkeextMmFailure0 =
                    FwpmNetEventIkeextMmFailure0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: FwpmNetEventIkeextMmFailure0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.failureErrorCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.failurePoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.keyingModuleType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.mmState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.saRole)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.mmAuthMethod)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 28L, value.endCertHash)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.mmId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.mmFilterId)
                }
            }
    }
}

public class FwpmNetEventIkeextMmFailure1 internal constructor(
    public var failureErrorCode: UInt,
    public var failurePoint: IpsecFailurePoint,
    public var flags: UInt,
    public var keyingModuleType: IkeextKeyModuleType,
    public var mmState: IkeextMmSaState,
    public var saRole: IkeextSaRole,
    public var mmAuthMethod: IkeextAuthenticationMethodType,
    public var endCertHash: UByteArray,
    public var mmId: ULong,
    public var mmFilterId: ULong,
    localPrincipalNameForAuthCtorArg: Pwstr,
    remotePrincipalNameForAuthCtorArg: Pwstr,
    public var numLocalPrincipalGroupSids: UInt,
    localPrincipalGroupSidsCtorArg: MutPtr<Pwstr>,
    public var numRemotePrincipalGroupSids: UInt,
    remotePrincipalGroupSidsCtorArg: MutPtr<Pwstr>,
) {
    public var localPrincipalNameForAuth: Pwstr = localPrincipalNameForAuthCtorArg
        internal set

    public var remotePrincipalNameForAuth: Pwstr = remotePrincipalNameForAuthCtorArg
        internal set

    public var localPrincipalGroupSids: MutPtr<Pwstr> = localPrincipalGroupSidsCtorArg
        internal set

    public var remotePrincipalGroupSids: MutPtr<Pwstr> = remotePrincipalGroupSidsCtorArg
        internal set

    public constructor() : this(
        failureErrorCode = 0u,
        failurePoint = 0,
        flags = 0u,
        keyingModuleType = 0,
        mmState = 0,
        saRole = 0,
        mmAuthMethod = 0,
        endCertHash = UByteArray(20),
        mmId = 0uL,
        mmFilterId = 0uL,
        localPrincipalNameForAuthCtorArg = MutPtr(0L),
        remotePrincipalNameForAuthCtorArg = MutPtr(0L),
        numLocalPrincipalGroupSids = 0u,
        localPrincipalGroupSidsCtorArg = MutPtr(0L),
        numRemotePrincipalGroupSids = 0u,
        remotePrincipalGroupSidsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.failureErrorCode

    public operator fun component2(): IpsecFailurePoint = this.failurePoint

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): IkeextKeyModuleType = this.keyingModuleType

    public operator fun component5(): IkeextMmSaState = this.mmState

    public operator fun component6(): IkeextSaRole = this.saRole

    public operator fun component7(): IkeextAuthenticationMethodType = this.mmAuthMethod

    public operator fun component8(): UByteArray = this.endCertHash

    public operator fun component9(): ULong = this.mmId

    public operator fun component10(): ULong = this.mmFilterId

    public operator fun component11(): Pwstr = this.localPrincipalNameForAuth

    public operator fun component12(): Pwstr = this.remotePrincipalNameForAuth

    public operator fun component13(): UInt = this.numLocalPrincipalGroupSids

    public operator fun component14(): MutPtr<Pwstr> = this.localPrincipalGroupSids

    public operator fun component15(): UInt = this.numRemotePrincipalGroupSids

    public operator fun component16(): MutPtr<Pwstr> = this.remotePrincipalGroupSids

    public fun copy(failureErrorCode: UInt = this.failureErrorCode, failurePoint: IpsecFailurePoint = this.failurePoint, flags: UInt = this.flags, keyingModuleType: IkeextKeyModuleType = this.keyingModuleType, mmState: IkeextMmSaState = this.mmState, saRole: IkeextSaRole = this.saRole, mmAuthMethod: IkeextAuthenticationMethodType = this.mmAuthMethod, endCertHash: UByteArray = this.endCertHash, mmId: ULong = this.mmId, mmFilterId: ULong = this.mmFilterId, localPrincipalNameForAuth: Pwstr = this.localPrincipalNameForAuth, remotePrincipalNameForAuth: Pwstr = this.remotePrincipalNameForAuth, numLocalPrincipalGroupSids: UInt = this.numLocalPrincipalGroupSids, localPrincipalGroupSids: MutPtr<Pwstr> = this.localPrincipalGroupSids, numRemotePrincipalGroupSids: UInt = this.numRemotePrincipalGroupSids, remotePrincipalGroupSids: MutPtr<Pwstr> = this.remotePrincipalGroupSids): FwpmNetEventIkeextMmFailure1 = FwpmNetEventIkeextMmFailure1(failureErrorCode = failureErrorCode, failurePoint = failurePoint, flags = flags, keyingModuleType = keyingModuleType, mmState = mmState, saRole = saRole, mmAuthMethod = mmAuthMethod, endCertHash = endCertHash, mmId = mmId, mmFilterId = mmFilterId, localPrincipalNameForAuthCtorArg = localPrincipalNameForAuth, remotePrincipalNameForAuthCtorArg = remotePrincipalNameForAuth, numLocalPrincipalGroupSids = numLocalPrincipalGroupSids, localPrincipalGroupSidsCtorArg = localPrincipalGroupSids, numRemotePrincipalGroupSids = numRemotePrincipalGroupSids, remotePrincipalGroupSidsCtorArg = remotePrincipalGroupSids)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventIkeextMmFailure1) return false
        if (this.failureErrorCode != other.failureErrorCode) return false
        if (this.failurePoint != other.failurePoint) return false
        if (this.flags != other.flags) return false
        if (this.keyingModuleType != other.keyingModuleType) return false
        if (this.mmState != other.mmState) return false
        if (this.saRole != other.saRole) return false
        if (this.mmAuthMethod != other.mmAuthMethod) return false
        if (!this.endCertHash.contentEquals(other.endCertHash)) return false
        if (this.mmId != other.mmId) return false
        if (this.mmFilterId != other.mmFilterId) return false
        if (this.localPrincipalNameForAuth != other.localPrincipalNameForAuth) return false
        if (this.remotePrincipalNameForAuth != other.remotePrincipalNameForAuth) return false
        if (this.numLocalPrincipalGroupSids != other.numLocalPrincipalGroupSids) return false
        if (this.localPrincipalGroupSids != other.localPrincipalGroupSids) return false
        if (this.numRemotePrincipalGroupSids != other.numRemotePrincipalGroupSids) return false
        if (this.remotePrincipalGroupSids != other.remotePrincipalGroupSids) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.failureErrorCode.hashCode()
        result = 31 * result + this.failurePoint.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.keyingModuleType.hashCode()
        result = 31 * result + this.mmState.hashCode()
        result = 31 * result + this.saRole.hashCode()
        result = 31 * result + this.mmAuthMethod.hashCode()
        result = 31 * result + this.endCertHash.contentHashCode()
        result = 31 * result + this.mmId.hashCode()
        result = 31 * result + this.mmFilterId.hashCode()
        result = 31 * result + this.localPrincipalNameForAuth.hashCode()
        result = 31 * result + this.remotePrincipalNameForAuth.hashCode()
        result = 31 * result + this.numLocalPrincipalGroupSids.hashCode()
        result = 31 * result + this.localPrincipalGroupSids.hashCode()
        result = 31 * result + this.numRemotePrincipalGroupSids.hashCode()
        result = 31 * result + this.remotePrincipalGroupSids.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            failureErrorCode: UInt = 0u,
            failurePoint: IpsecFailurePoint = 0,
            flags: UInt = 0u,
            keyingModuleType: IkeextKeyModuleType = 0,
            mmState: IkeextMmSaState = 0,
            saRole: IkeextSaRole = 0,
            mmAuthMethod: IkeextAuthenticationMethodType = 0,
            endCertHash: UByteArray = UByteArray(20),
            mmId: ULong = 0uL,
            mmFilterId: ULong = 0uL,
            localPrincipalNameForAuth: Pwstr = MutPtr(0L),
            remotePrincipalNameForAuth: Pwstr = MutPtr(0L),
            numLocalPrincipalGroupSids: UInt = 0u,
            localPrincipalGroupSids: MutPtr<Pwstr> = MutPtr(0L),
            numRemotePrincipalGroupSids: UInt = 0u,
            remotePrincipalGroupSids: MutPtr<Pwstr> = MutPtr(0L),
        ): FwpmNetEventIkeextMmFailure1 =
            FwpmNetEventIkeextMmFailure1(
                failureErrorCode = failureErrorCode,
                failurePoint = failurePoint,
                flags = flags,
                keyingModuleType = keyingModuleType,
                mmState = mmState,
                saRole = saRole,
                mmAuthMethod = mmAuthMethod,
                endCertHash = endCertHash,
                mmId = mmId,
                mmFilterId = mmFilterId,
                localPrincipalNameForAuthCtorArg = localPrincipalNameForAuth,
                remotePrincipalNameForAuthCtorArg = remotePrincipalNameForAuth,
                numLocalPrincipalGroupSids = numLocalPrincipalGroupSids,
                localPrincipalGroupSidsCtorArg = localPrincipalGroupSids,
                numRemotePrincipalGroupSids = numRemotePrincipalGroupSids,
                remotePrincipalGroupSidsCtorArg = remotePrincipalGroupSids,
            )
    }
}

public class FwpmNetEventIkeextMmFailure2 internal constructor(
    public var failureErrorCode: UInt,
    public var failurePoint: IpsecFailurePoint,
    public var flags: UInt,
    public var keyingModuleType: IkeextKeyModuleType,
    public var mmState: IkeextMmSaState,
    public var saRole: IkeextSaRole,
    public var mmAuthMethod: IkeextAuthenticationMethodType,
    public var endCertHash: UByteArray,
    public var mmId: ULong,
    public var mmFilterId: ULong,
    localPrincipalNameForAuthCtorArg: Pwstr,
    remotePrincipalNameForAuthCtorArg: Pwstr,
    public var numLocalPrincipalGroupSids: UInt,
    localPrincipalGroupSidsCtorArg: MutPtr<Pwstr>,
    public var numRemotePrincipalGroupSids: UInt,
    remotePrincipalGroupSidsCtorArg: MutPtr<Pwstr>,
    providerContextKeyCtorArg: MutPtr<Guid>,
) {
    public var localPrincipalNameForAuth: Pwstr = localPrincipalNameForAuthCtorArg
        internal set

    public var remotePrincipalNameForAuth: Pwstr = remotePrincipalNameForAuthCtorArg
        internal set

    public var localPrincipalGroupSids: MutPtr<Pwstr> = localPrincipalGroupSidsCtorArg
        internal set

    public var remotePrincipalGroupSids: MutPtr<Pwstr> = remotePrincipalGroupSidsCtorArg
        internal set

    public var providerContextKey: MutPtr<Guid> = providerContextKeyCtorArg
        internal set

    public constructor() : this(
        failureErrorCode = 0u,
        failurePoint = 0,
        flags = 0u,
        keyingModuleType = 0,
        mmState = 0,
        saRole = 0,
        mmAuthMethod = 0,
        endCertHash = UByteArray(20),
        mmId = 0uL,
        mmFilterId = 0uL,
        localPrincipalNameForAuthCtorArg = MutPtr(0L),
        remotePrincipalNameForAuthCtorArg = MutPtr(0L),
        numLocalPrincipalGroupSids = 0u,
        localPrincipalGroupSidsCtorArg = MutPtr(0L),
        numRemotePrincipalGroupSids = 0u,
        remotePrincipalGroupSidsCtorArg = MutPtr(0L),
        providerContextKeyCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            failureErrorCode: UInt = 0u,
            failurePoint: IpsecFailurePoint = 0,
            flags: UInt = 0u,
            keyingModuleType: IkeextKeyModuleType = 0,
            mmState: IkeextMmSaState = 0,
            saRole: IkeextSaRole = 0,
            mmAuthMethod: IkeextAuthenticationMethodType = 0,
            endCertHash: UByteArray = UByteArray(20),
            mmId: ULong = 0uL,
            mmFilterId: ULong = 0uL,
            localPrincipalNameForAuth: Pwstr = MutPtr(0L),
            remotePrincipalNameForAuth: Pwstr = MutPtr(0L),
            numLocalPrincipalGroupSids: UInt = 0u,
            localPrincipalGroupSids: MutPtr<Pwstr> = MutPtr(0L),
            numRemotePrincipalGroupSids: UInt = 0u,
            remotePrincipalGroupSids: MutPtr<Pwstr> = MutPtr(0L),
            providerContextKey: MutPtr<Guid> = MutPtr(0L),
        ): FwpmNetEventIkeextMmFailure2 =
            FwpmNetEventIkeextMmFailure2(
                failureErrorCode = failureErrorCode,
                failurePoint = failurePoint,
                flags = flags,
                keyingModuleType = keyingModuleType,
                mmState = mmState,
                saRole = saRole,
                mmAuthMethod = mmAuthMethod,
                endCertHash = endCertHash,
                mmId = mmId,
                mmFilterId = mmFilterId,
                localPrincipalNameForAuthCtorArg = localPrincipalNameForAuth,
                remotePrincipalNameForAuthCtorArg = remotePrincipalNameForAuth,
                numLocalPrincipalGroupSids = numLocalPrincipalGroupSids,
                localPrincipalGroupSidsCtorArg = localPrincipalGroupSids,
                numRemotePrincipalGroupSids = numRemotePrincipalGroupSids,
                remotePrincipalGroupSidsCtorArg = remotePrincipalGroupSids,
                providerContextKeyCtorArg = providerContextKey,
            )
    }
}

public data class FwpmNetEventIkeextQmFailure0(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IpsecFailurePoint = 0,
    public var keyingModuleType: IkeextKeyModuleType = 0,
    public var qmState: IkeextQmSaState = 0,
    public var saRole: IkeextSaRole = 0,
    public var saTrafficType: IpsecTrafficType = 0,
    public var anonymous1: FwpmNetEventIkeextQmFailure00 = FwpmNetEventIkeextQmFailure00(),
    public var anonymous2: FwpmNetEventIkeextQmFailure01 = FwpmNetEventIkeextQmFailure01(),
    public var qmFilterId: ULong = 0uL,
)

public data class FwpmNetEventIkeextQmFailure00(
    public var localSubNet: FwpConditionValue0 = FwpConditionValue0(),
)

public data class FwpmNetEventIkeextQmFailure01(
    public var remoteSubNet: FwpConditionValue0 = FwpConditionValue0(),
)

public data class FwpmNetEventIkeextQmFailure1(
    public var failureErrorCode: UInt = 0u,
    public var failurePoint: IpsecFailurePoint = 0,
    public var keyingModuleType: IkeextKeyModuleType = 0,
    public var qmState: IkeextQmSaState = 0,
    public var saRole: IkeextSaRole = 0,
    public var saTrafficType: IpsecTrafficType = 0,
    public var anonymous1: FwpmNetEventIkeextQmFailure10 = FwpmNetEventIkeextQmFailure10(),
    public var anonymous2: FwpmNetEventIkeextQmFailure11 = FwpmNetEventIkeextQmFailure11(),
    public var qmFilterId: ULong = 0uL,
    public var mmSaLuid: ULong = 0uL,
    public var mmProviderContextKey: Guid = Guid(),
)

public data class FwpmNetEventIkeextQmFailure10(
    public var localSubNet: FwpConditionValue0 = FwpConditionValue0(),
)

public data class FwpmNetEventIkeextQmFailure11(
    public var remoteSubNet: FwpConditionValue0 = FwpConditionValue0(),
)

public data class FwpmNetEventIpsecDospDrop0(
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous1: FwpmNetEventIpsecDospDrop00 = FwpmNetEventIpsecDospDrop00(),
    public var anonymous2: FwpmNetEventIpsecDospDrop01 = FwpmNetEventIpsecDospDrop01(),
    public var failureStatus: Int = 0,
    public var direction: FwpDirection = 0,
)

public data class FwpmNetEventIpsecDospDrop00(
    public var publicHostV4Addr: UInt = 0u,
    public var publicHostV6Addr: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventIpsecDospDrop00) return false
        if (this.publicHostV4Addr != other.publicHostV4Addr) return false
        if (!this.publicHostV6Addr.contentEquals(other.publicHostV6Addr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.publicHostV4Addr.hashCode()
        result = 31 * result + this.publicHostV6Addr.contentHashCode()
        return result
    }
}

public data class FwpmNetEventIpsecDospDrop01(
    public var internalHostV4Addr: UInt = 0u,
    public var internalHostV6Addr: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventIpsecDospDrop01) return false
        if (this.internalHostV4Addr != other.internalHostV4Addr) return false
        if (!this.internalHostV6Addr.contentEquals(other.internalHostV6Addr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.internalHostV4Addr.hashCode()
        result = 31 * result + this.internalHostV6Addr.contentHashCode()
        return result
    }
}

public data class FwpmNetEventIpsecKernelDrop0(
    public var failureStatus: Int = 0,
    public var direction: FwpDirection = 0,
    public var spi: UInt = 0u,
    public var filterId: ULong = 0uL,
    public var layerId: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmNetEventIpsecKernelDrop0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmNetEventIpsecKernelDrop0> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmNetEventIpsecKernelDrop0 =
                    FwpmNetEventIpsecKernelDrop0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FwpmNetEventIpsecKernelDrop0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.failureStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.direction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.spi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.filterId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.layerId)
                }
            }
    }
}

public data class FwpmNetEventLpmPacketArrival0(
    public var spi: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmNetEventLpmPacketArrival0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmNetEventLpmPacketArrival0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FwpmNetEventLpmPacketArrival0 =
                    FwpmNetEventLpmPacketArrival0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FwpmNetEventLpmPacketArrival0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.spi)
                }
            }
    }
}

public class FwpmNetEventSubscription0 internal constructor(
    enumTemplateCtorArg: MutPtr<FwpmNetEventEnumTemplate0>,
    public var flags: UInt,
    public var sessionKey: Guid,
) {
    public var enumTemplate: MutPtr<FwpmNetEventEnumTemplate0> = enumTemplateCtorArg
        internal set

    public constructor() : this(
        enumTemplateCtorArg = MutPtr(0L),
        flags = 0u,
        sessionKey = Guid(),
    )

    public operator fun component1(): MutPtr<FwpmNetEventEnumTemplate0> = this.enumTemplate

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): Guid = this.sessionKey

    public fun copy(enumTemplate: MutPtr<FwpmNetEventEnumTemplate0> = this.enumTemplate, flags: UInt = this.flags, sessionKey: Guid = this.sessionKey): FwpmNetEventSubscription0 = FwpmNetEventSubscription0(enumTemplateCtorArg = enumTemplate, flags = flags, sessionKey = sessionKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmNetEventSubscription0) return false
        if (this.enumTemplate != other.enumTemplate) return false
        if (this.flags != other.flags) return false
        if (this.sessionKey != other.sessionKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enumTemplate.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.sessionKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            enumTemplate: MutPtr<FwpmNetEventEnumTemplate0> = MutPtr(0L),
            flags: UInt = 0u,
            sessionKey: Guid = Guid(),
        ): FwpmNetEventSubscription0 =
            FwpmNetEventSubscription0(
                enumTemplateCtorArg = enumTemplate,
                flags = flags,
                sessionKey = sessionKey,
            )
    }
}

public class FwpmProvider0 internal constructor(
    public var providerKey: Guid,
    public var displayData: FwpmDisplayData0,
    public var flags: UInt,
    public var providerData: FwpByteBlob,
    serviceNameCtorArg: Pwstr,
) {
    public var serviceName: Pwstr = serviceNameCtorArg
        internal set

    public constructor() : this(
        providerKey = Guid(),
        displayData = FwpmDisplayData0(),
        flags = 0u,
        providerData = FwpByteBlob(),
        serviceNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.providerKey

    public operator fun component2(): FwpmDisplayData0 = this.displayData

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): FwpByteBlob = this.providerData

    public operator fun component5(): Pwstr = this.serviceName

    public fun copy(providerKey: Guid = this.providerKey, displayData: FwpmDisplayData0 = this.displayData, flags: UInt = this.flags, providerData: FwpByteBlob = this.providerData, serviceName: Pwstr = this.serviceName): FwpmProvider0 = FwpmProvider0(providerKey = providerKey, displayData = displayData, flags = flags, providerData = providerData, serviceNameCtorArg = serviceName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmProvider0) return false
        if (this.providerKey != other.providerKey) return false
        if (this.displayData != other.displayData) return false
        if (this.flags != other.flags) return false
        if (this.providerData != other.providerData) return false
        if (this.serviceName != other.serviceName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerKey.hashCode()
        result = 31 * result + this.displayData.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.providerData.hashCode()
        result = 31 * result + this.serviceName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            providerKey: Guid = Guid(),
            displayData: FwpmDisplayData0 = FwpmDisplayData0(),
            flags: UInt = 0u,
            providerData: FwpByteBlob = FwpByteBlob(),
            serviceName: Pwstr = MutPtr(0L),
        ): FwpmProvider0 =
            FwpmProvider0(
                providerKey = providerKey,
                displayData = displayData,
                flags = flags,
                providerData = providerData,
                serviceNameCtorArg = serviceName,
            )
    }
}

public data class FwpmProviderChange0(
    public var changeType: FwpmChangeType = 0,
    public var providerKey: Guid = Guid(),
)

public class FwpmProviderContext0 internal constructor(
    public var providerContextKey: Guid,
    public var displayData: FwpmDisplayData0,
    public var flags: UInt,
    providerKeyCtorArg: MutPtr<Guid>,
    public var providerData: FwpByteBlob,
    public var type: FwpmProviderContextType,
    public var anonymous: FwpmProviderContext00,
    public var providerContextId: ULong,
) {
    public var providerKey: MutPtr<Guid> = providerKeyCtorArg
        internal set

    public constructor() : this(
        providerContextKey = Guid(),
        displayData = FwpmDisplayData0(),
        flags = 0u,
        providerKeyCtorArg = MutPtr(0L),
        providerData = FwpByteBlob(),
        type = 0,
        anonymous = FwpmProviderContext00(),
        providerContextId = 0uL,
    )

    public operator fun component1(): Guid = this.providerContextKey

    public operator fun component2(): FwpmDisplayData0 = this.displayData

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): MutPtr<Guid> = this.providerKey

    public operator fun component5(): FwpByteBlob = this.providerData

    public operator fun component6(): FwpmProviderContextType = this.type

    public operator fun component7(): FwpmProviderContext00 = this.anonymous

    public operator fun component8(): ULong = this.providerContextId

    public fun copy(providerContextKey: Guid = this.providerContextKey, displayData: FwpmDisplayData0 = this.displayData, flags: UInt = this.flags, providerKey: MutPtr<Guid> = this.providerKey, providerData: FwpByteBlob = this.providerData, type: FwpmProviderContextType = this.type, anonymous: FwpmProviderContext00 = this.anonymous, providerContextId: ULong = this.providerContextId): FwpmProviderContext0 = FwpmProviderContext0(providerContextKey = providerContextKey, displayData = displayData, flags = flags, providerKeyCtorArg = providerKey, providerData = providerData, type = type, anonymous = anonymous, providerContextId = providerContextId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmProviderContext0) return false
        if (this.providerContextKey != other.providerContextKey) return false
        if (this.displayData != other.displayData) return false
        if (this.flags != other.flags) return false
        if (this.providerKey != other.providerKey) return false
        if (this.providerData != other.providerData) return false
        if (this.type != other.type) return false
        if (this.anonymous != other.anonymous) return false
        if (this.providerContextId != other.providerContextId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerContextKey.hashCode()
        result = 31 * result + this.displayData.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.providerKey.hashCode()
        result = 31 * result + this.providerData.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.providerContextId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            providerContextKey: Guid = Guid(),
            displayData: FwpmDisplayData0 = FwpmDisplayData0(),
            flags: UInt = 0u,
            providerKey: MutPtr<Guid> = MutPtr(0L),
            providerData: FwpByteBlob = FwpByteBlob(),
            type: FwpmProviderContextType = 0,
            anonymous: FwpmProviderContext00 = FwpmProviderContext00(),
            providerContextId: ULong = 0uL,
        ): FwpmProviderContext0 =
            FwpmProviderContext0(
                providerContextKey = providerContextKey,
                displayData = displayData,
                flags = flags,
                providerKeyCtorArg = providerKey,
                providerData = providerData,
                type = type,
                anonymous = anonymous,
                providerContextId = providerContextId,
            )
    }
}

public class FwpmProviderContext00 internal constructor(
    keyingPolicyCtorArg: MutPtr<IpsecKeyingPolicy0>,
    ikeQmTransportPolicyCtorArg: MutPtr<IpsecTransportPolicy0>,
    ikeQmTunnelPolicyCtorArg: MutPtr<IpsecTunnelPolicy0>,
    authipQmTransportPolicyCtorArg: MutPtr<IpsecTransportPolicy0>,
    authipQmTunnelPolicyCtorArg: MutPtr<IpsecTunnelPolicy0>,
    ikeMmPolicyCtorArg: MutPtr<IkeextPolicy0>,
    authIpMmPolicyCtorArg: MutPtr<IkeextPolicy0>,
    dataBufferCtorArg: MutPtr<FwpByteBlob>,
    classifyOptionsCtorArg: MutPtr<FwpmClassifyOptions0>,
) {
    public var keyingPolicy: MutPtr<IpsecKeyingPolicy0> = keyingPolicyCtorArg
        internal set

    public var ikeQmTransportPolicy: MutPtr<IpsecTransportPolicy0> = ikeQmTransportPolicyCtorArg
        internal set

    public var ikeQmTunnelPolicy: MutPtr<IpsecTunnelPolicy0> = ikeQmTunnelPolicyCtorArg
        internal set

    public var authipQmTransportPolicy: MutPtr<IpsecTransportPolicy0> = authipQmTransportPolicyCtorArg
        internal set

    public var authipQmTunnelPolicy: MutPtr<IpsecTunnelPolicy0> = authipQmTunnelPolicyCtorArg
        internal set

    public var ikeMmPolicy: MutPtr<IkeextPolicy0> = ikeMmPolicyCtorArg
        internal set

    public var authIpMmPolicy: MutPtr<IkeextPolicy0> = authIpMmPolicyCtorArg
        internal set

    public var dataBuffer: MutPtr<FwpByteBlob> = dataBufferCtorArg
        internal set

    public var classifyOptions: MutPtr<FwpmClassifyOptions0> = classifyOptionsCtorArg
        internal set

    public constructor() : this(
        keyingPolicyCtorArg = MutPtr(0L),
        ikeQmTransportPolicyCtorArg = MutPtr(0L),
        ikeQmTunnelPolicyCtorArg = MutPtr(0L),
        authipQmTransportPolicyCtorArg = MutPtr(0L),
        authipQmTunnelPolicyCtorArg = MutPtr(0L),
        ikeMmPolicyCtorArg = MutPtr(0L),
        authIpMmPolicyCtorArg = MutPtr(0L),
        dataBufferCtorArg = MutPtr(0L),
        classifyOptionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IpsecKeyingPolicy0> = this.keyingPolicy

    public operator fun component2(): MutPtr<IpsecTransportPolicy0> = this.ikeQmTransportPolicy

    public operator fun component3(): MutPtr<IpsecTunnelPolicy0> = this.ikeQmTunnelPolicy

    public operator fun component4(): MutPtr<IpsecTransportPolicy0> = this.authipQmTransportPolicy

    public operator fun component5(): MutPtr<IpsecTunnelPolicy0> = this.authipQmTunnelPolicy

    public operator fun component6(): MutPtr<IkeextPolicy0> = this.ikeMmPolicy

    public operator fun component7(): MutPtr<IkeextPolicy0> = this.authIpMmPolicy

    public operator fun component8(): MutPtr<FwpByteBlob> = this.dataBuffer

    public operator fun component9(): MutPtr<FwpmClassifyOptions0> = this.classifyOptions

    public fun copy(keyingPolicy: MutPtr<IpsecKeyingPolicy0> = this.keyingPolicy, ikeQmTransportPolicy: MutPtr<IpsecTransportPolicy0> = this.ikeQmTransportPolicy, ikeQmTunnelPolicy: MutPtr<IpsecTunnelPolicy0> = this.ikeQmTunnelPolicy, authipQmTransportPolicy: MutPtr<IpsecTransportPolicy0> = this.authipQmTransportPolicy, authipQmTunnelPolicy: MutPtr<IpsecTunnelPolicy0> = this.authipQmTunnelPolicy, ikeMmPolicy: MutPtr<IkeextPolicy0> = this.ikeMmPolicy, authIpMmPolicy: MutPtr<IkeextPolicy0> = this.authIpMmPolicy, dataBuffer: MutPtr<FwpByteBlob> = this.dataBuffer, classifyOptions: MutPtr<FwpmClassifyOptions0> = this.classifyOptions): FwpmProviderContext00 = FwpmProviderContext00(keyingPolicyCtorArg = keyingPolicy, ikeQmTransportPolicyCtorArg = ikeQmTransportPolicy, ikeQmTunnelPolicyCtorArg = ikeQmTunnelPolicy, authipQmTransportPolicyCtorArg = authipQmTransportPolicy, authipQmTunnelPolicyCtorArg = authipQmTunnelPolicy, ikeMmPolicyCtorArg = ikeMmPolicy, authIpMmPolicyCtorArg = authIpMmPolicy, dataBufferCtorArg = dataBuffer, classifyOptionsCtorArg = classifyOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmProviderContext00) return false
        if (this.keyingPolicy != other.keyingPolicy) return false
        if (this.ikeQmTransportPolicy != other.ikeQmTransportPolicy) return false
        if (this.ikeQmTunnelPolicy != other.ikeQmTunnelPolicy) return false
        if (this.authipQmTransportPolicy != other.authipQmTransportPolicy) return false
        if (this.authipQmTunnelPolicy != other.authipQmTunnelPolicy) return false
        if (this.ikeMmPolicy != other.ikeMmPolicy) return false
        if (this.authIpMmPolicy != other.authIpMmPolicy) return false
        if (this.dataBuffer != other.dataBuffer) return false
        if (this.classifyOptions != other.classifyOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyingPolicy.hashCode()
        result = 31 * result + this.ikeQmTransportPolicy.hashCode()
        result = 31 * result + this.ikeQmTunnelPolicy.hashCode()
        result = 31 * result + this.authipQmTransportPolicy.hashCode()
        result = 31 * result + this.authipQmTunnelPolicy.hashCode()
        result = 31 * result + this.ikeMmPolicy.hashCode()
        result = 31 * result + this.authIpMmPolicy.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        result = 31 * result + this.classifyOptions.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            keyingPolicy: MutPtr<IpsecKeyingPolicy0> = MutPtr(0L),
            ikeQmTransportPolicy: MutPtr<IpsecTransportPolicy0> = MutPtr(0L),
            ikeQmTunnelPolicy: MutPtr<IpsecTunnelPolicy0> = MutPtr(0L),
            authipQmTransportPolicy: MutPtr<IpsecTransportPolicy0> = MutPtr(0L),
            authipQmTunnelPolicy: MutPtr<IpsecTunnelPolicy0> = MutPtr(0L),
            ikeMmPolicy: MutPtr<IkeextPolicy0> = MutPtr(0L),
            authIpMmPolicy: MutPtr<IkeextPolicy0> = MutPtr(0L),
            dataBuffer: MutPtr<FwpByteBlob> = MutPtr(0L),
            classifyOptions: MutPtr<FwpmClassifyOptions0> = MutPtr(0L),
        ): FwpmProviderContext00 =
            FwpmProviderContext00(
                keyingPolicyCtorArg = keyingPolicy,
                ikeQmTransportPolicyCtorArg = ikeQmTransportPolicy,
                ikeQmTunnelPolicyCtorArg = ikeQmTunnelPolicy,
                authipQmTransportPolicyCtorArg = authipQmTransportPolicy,
                authipQmTunnelPolicyCtorArg = authipQmTunnelPolicy,
                ikeMmPolicyCtorArg = ikeMmPolicy,
                authIpMmPolicyCtorArg = authIpMmPolicy,
                dataBufferCtorArg = dataBuffer,
                classifyOptionsCtorArg = classifyOptions,
            )
    }
}

public class FwpmProviderContext1 internal constructor(
    public var providerContextKey: Guid,
    public var displayData: FwpmDisplayData0,
    public var flags: UInt,
    providerKeyCtorArg: MutPtr<Guid>,
    public var providerData: FwpByteBlob,
    public var type: FwpmProviderContextType,
    public var anonymous: FwpmProviderContext10,
    public var providerContextId: ULong,
) {
    public var providerKey: MutPtr<Guid> = providerKeyCtorArg
        internal set

    public constructor() : this(
        providerContextKey = Guid(),
        displayData = FwpmDisplayData0(),
        flags = 0u,
        providerKeyCtorArg = MutPtr(0L),
        providerData = FwpByteBlob(),
        type = 0,
        anonymous = FwpmProviderContext10(),
        providerContextId = 0uL,
    )

    public operator fun component1(): Guid = this.providerContextKey

    public operator fun component2(): FwpmDisplayData0 = this.displayData

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): MutPtr<Guid> = this.providerKey

    public operator fun component5(): FwpByteBlob = this.providerData

    public operator fun component6(): FwpmProviderContextType = this.type

    public operator fun component7(): FwpmProviderContext10 = this.anonymous

    public operator fun component8(): ULong = this.providerContextId

    public fun copy(providerContextKey: Guid = this.providerContextKey, displayData: FwpmDisplayData0 = this.displayData, flags: UInt = this.flags, providerKey: MutPtr<Guid> = this.providerKey, providerData: FwpByteBlob = this.providerData, type: FwpmProviderContextType = this.type, anonymous: FwpmProviderContext10 = this.anonymous, providerContextId: ULong = this.providerContextId): FwpmProviderContext1 = FwpmProviderContext1(providerContextKey = providerContextKey, displayData = displayData, flags = flags, providerKeyCtorArg = providerKey, providerData = providerData, type = type, anonymous = anonymous, providerContextId = providerContextId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmProviderContext1) return false
        if (this.providerContextKey != other.providerContextKey) return false
        if (this.displayData != other.displayData) return false
        if (this.flags != other.flags) return false
        if (this.providerKey != other.providerKey) return false
        if (this.providerData != other.providerData) return false
        if (this.type != other.type) return false
        if (this.anonymous != other.anonymous) return false
        if (this.providerContextId != other.providerContextId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerContextKey.hashCode()
        result = 31 * result + this.displayData.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.providerKey.hashCode()
        result = 31 * result + this.providerData.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.providerContextId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            providerContextKey: Guid = Guid(),
            displayData: FwpmDisplayData0 = FwpmDisplayData0(),
            flags: UInt = 0u,
            providerKey: MutPtr<Guid> = MutPtr(0L),
            providerData: FwpByteBlob = FwpByteBlob(),
            type: FwpmProviderContextType = 0,
            anonymous: FwpmProviderContext10 = FwpmProviderContext10(),
            providerContextId: ULong = 0uL,
        ): FwpmProviderContext1 =
            FwpmProviderContext1(
                providerContextKey = providerContextKey,
                displayData = displayData,
                flags = flags,
                providerKeyCtorArg = providerKey,
                providerData = providerData,
                type = type,
                anonymous = anonymous,
                providerContextId = providerContextId,
            )
    }
}

public class FwpmProviderContext10 internal constructor(
    keyingPolicyCtorArg: MutPtr<IpsecKeyingPolicy0>,
    ikeQmTransportPolicyCtorArg: MutPtr<IpsecTransportPolicy1>,
    ikeQmTunnelPolicyCtorArg: MutPtr<IpsecTunnelPolicy1>,
    authipQmTransportPolicyCtorArg: MutPtr<IpsecTransportPolicy1>,
    authipQmTunnelPolicyCtorArg: MutPtr<IpsecTunnelPolicy1>,
    ikeMmPolicyCtorArg: MutPtr<IkeextPolicy1>,
    authIpMmPolicyCtorArg: MutPtr<IkeextPolicy1>,
    dataBufferCtorArg: MutPtr<FwpByteBlob>,
    classifyOptionsCtorArg: MutPtr<FwpmClassifyOptions0>,
    ikeV2QmTunnelPolicyCtorArg: MutPtr<IpsecTunnelPolicy1>,
    ikeV2MmPolicyCtorArg: MutPtr<IkeextPolicy1>,
    idpOptionsCtorArg: MutPtr<IpsecDospOptions0>,
) {
    public var keyingPolicy: MutPtr<IpsecKeyingPolicy0> = keyingPolicyCtorArg
        internal set

    public var ikeQmTransportPolicy: MutPtr<IpsecTransportPolicy1> = ikeQmTransportPolicyCtorArg
        internal set

    public var ikeQmTunnelPolicy: MutPtr<IpsecTunnelPolicy1> = ikeQmTunnelPolicyCtorArg
        internal set

    public var authipQmTransportPolicy: MutPtr<IpsecTransportPolicy1> = authipQmTransportPolicyCtorArg
        internal set

    public var authipQmTunnelPolicy: MutPtr<IpsecTunnelPolicy1> = authipQmTunnelPolicyCtorArg
        internal set

    public var ikeMmPolicy: MutPtr<IkeextPolicy1> = ikeMmPolicyCtorArg
        internal set

    public var authIpMmPolicy: MutPtr<IkeextPolicy1> = authIpMmPolicyCtorArg
        internal set

    public var dataBuffer: MutPtr<FwpByteBlob> = dataBufferCtorArg
        internal set

    public var classifyOptions: MutPtr<FwpmClassifyOptions0> = classifyOptionsCtorArg
        internal set

    public var ikeV2QmTunnelPolicy: MutPtr<IpsecTunnelPolicy1> = ikeV2QmTunnelPolicyCtorArg
        internal set

    public var ikeV2MmPolicy: MutPtr<IkeextPolicy1> = ikeV2MmPolicyCtorArg
        internal set

    public var idpOptions: MutPtr<IpsecDospOptions0> = idpOptionsCtorArg
        internal set

    public constructor() : this(
        keyingPolicyCtorArg = MutPtr(0L),
        ikeQmTransportPolicyCtorArg = MutPtr(0L),
        ikeQmTunnelPolicyCtorArg = MutPtr(0L),
        authipQmTransportPolicyCtorArg = MutPtr(0L),
        authipQmTunnelPolicyCtorArg = MutPtr(0L),
        ikeMmPolicyCtorArg = MutPtr(0L),
        authIpMmPolicyCtorArg = MutPtr(0L),
        dataBufferCtorArg = MutPtr(0L),
        classifyOptionsCtorArg = MutPtr(0L),
        ikeV2QmTunnelPolicyCtorArg = MutPtr(0L),
        ikeV2MmPolicyCtorArg = MutPtr(0L),
        idpOptionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IpsecKeyingPolicy0> = this.keyingPolicy

    public operator fun component2(): MutPtr<IpsecTransportPolicy1> = this.ikeQmTransportPolicy

    public operator fun component3(): MutPtr<IpsecTunnelPolicy1> = this.ikeQmTunnelPolicy

    public operator fun component4(): MutPtr<IpsecTransportPolicy1> = this.authipQmTransportPolicy

    public operator fun component5(): MutPtr<IpsecTunnelPolicy1> = this.authipQmTunnelPolicy

    public operator fun component6(): MutPtr<IkeextPolicy1> = this.ikeMmPolicy

    public operator fun component7(): MutPtr<IkeextPolicy1> = this.authIpMmPolicy

    public operator fun component8(): MutPtr<FwpByteBlob> = this.dataBuffer

    public operator fun component9(): MutPtr<FwpmClassifyOptions0> = this.classifyOptions

    public operator fun component10(): MutPtr<IpsecTunnelPolicy1> = this.ikeV2QmTunnelPolicy

    public operator fun component11(): MutPtr<IkeextPolicy1> = this.ikeV2MmPolicy

    public operator fun component12(): MutPtr<IpsecDospOptions0> = this.idpOptions

    public fun copy(keyingPolicy: MutPtr<IpsecKeyingPolicy0> = this.keyingPolicy, ikeQmTransportPolicy: MutPtr<IpsecTransportPolicy1> = this.ikeQmTransportPolicy, ikeQmTunnelPolicy: MutPtr<IpsecTunnelPolicy1> = this.ikeQmTunnelPolicy, authipQmTransportPolicy: MutPtr<IpsecTransportPolicy1> = this.authipQmTransportPolicy, authipQmTunnelPolicy: MutPtr<IpsecTunnelPolicy1> = this.authipQmTunnelPolicy, ikeMmPolicy: MutPtr<IkeextPolicy1> = this.ikeMmPolicy, authIpMmPolicy: MutPtr<IkeextPolicy1> = this.authIpMmPolicy, dataBuffer: MutPtr<FwpByteBlob> = this.dataBuffer, classifyOptions: MutPtr<FwpmClassifyOptions0> = this.classifyOptions, ikeV2QmTunnelPolicy: MutPtr<IpsecTunnelPolicy1> = this.ikeV2QmTunnelPolicy, ikeV2MmPolicy: MutPtr<IkeextPolicy1> = this.ikeV2MmPolicy, idpOptions: MutPtr<IpsecDospOptions0> = this.idpOptions): FwpmProviderContext10 = FwpmProviderContext10(keyingPolicyCtorArg = keyingPolicy, ikeQmTransportPolicyCtorArg = ikeQmTransportPolicy, ikeQmTunnelPolicyCtorArg = ikeQmTunnelPolicy, authipQmTransportPolicyCtorArg = authipQmTransportPolicy, authipQmTunnelPolicyCtorArg = authipQmTunnelPolicy, ikeMmPolicyCtorArg = ikeMmPolicy, authIpMmPolicyCtorArg = authIpMmPolicy, dataBufferCtorArg = dataBuffer, classifyOptionsCtorArg = classifyOptions, ikeV2QmTunnelPolicyCtorArg = ikeV2QmTunnelPolicy, ikeV2MmPolicyCtorArg = ikeV2MmPolicy, idpOptionsCtorArg = idpOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmProviderContext10) return false
        if (this.keyingPolicy != other.keyingPolicy) return false
        if (this.ikeQmTransportPolicy != other.ikeQmTransportPolicy) return false
        if (this.ikeQmTunnelPolicy != other.ikeQmTunnelPolicy) return false
        if (this.authipQmTransportPolicy != other.authipQmTransportPolicy) return false
        if (this.authipQmTunnelPolicy != other.authipQmTunnelPolicy) return false
        if (this.ikeMmPolicy != other.ikeMmPolicy) return false
        if (this.authIpMmPolicy != other.authIpMmPolicy) return false
        if (this.dataBuffer != other.dataBuffer) return false
        if (this.classifyOptions != other.classifyOptions) return false
        if (this.ikeV2QmTunnelPolicy != other.ikeV2QmTunnelPolicy) return false
        if (this.ikeV2MmPolicy != other.ikeV2MmPolicy) return false
        if (this.idpOptions != other.idpOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyingPolicy.hashCode()
        result = 31 * result + this.ikeQmTransportPolicy.hashCode()
        result = 31 * result + this.ikeQmTunnelPolicy.hashCode()
        result = 31 * result + this.authipQmTransportPolicy.hashCode()
        result = 31 * result + this.authipQmTunnelPolicy.hashCode()
        result = 31 * result + this.ikeMmPolicy.hashCode()
        result = 31 * result + this.authIpMmPolicy.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        result = 31 * result + this.classifyOptions.hashCode()
        result = 31 * result + this.ikeV2QmTunnelPolicy.hashCode()
        result = 31 * result + this.ikeV2MmPolicy.hashCode()
        result = 31 * result + this.idpOptions.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            keyingPolicy: MutPtr<IpsecKeyingPolicy0> = MutPtr(0L),
            ikeQmTransportPolicy: MutPtr<IpsecTransportPolicy1> = MutPtr(0L),
            ikeQmTunnelPolicy: MutPtr<IpsecTunnelPolicy1> = MutPtr(0L),
            authipQmTransportPolicy: MutPtr<IpsecTransportPolicy1> = MutPtr(0L),
            authipQmTunnelPolicy: MutPtr<IpsecTunnelPolicy1> = MutPtr(0L),
            ikeMmPolicy: MutPtr<IkeextPolicy1> = MutPtr(0L),
            authIpMmPolicy: MutPtr<IkeextPolicy1> = MutPtr(0L),
            dataBuffer: MutPtr<FwpByteBlob> = MutPtr(0L),
            classifyOptions: MutPtr<FwpmClassifyOptions0> = MutPtr(0L),
            ikeV2QmTunnelPolicy: MutPtr<IpsecTunnelPolicy1> = MutPtr(0L),
            ikeV2MmPolicy: MutPtr<IkeextPolicy1> = MutPtr(0L),
            idpOptions: MutPtr<IpsecDospOptions0> = MutPtr(0L),
        ): FwpmProviderContext10 =
            FwpmProviderContext10(
                keyingPolicyCtorArg = keyingPolicy,
                ikeQmTransportPolicyCtorArg = ikeQmTransportPolicy,
                ikeQmTunnelPolicyCtorArg = ikeQmTunnelPolicy,
                authipQmTransportPolicyCtorArg = authipQmTransportPolicy,
                authipQmTunnelPolicyCtorArg = authipQmTunnelPolicy,
                ikeMmPolicyCtorArg = ikeMmPolicy,
                authIpMmPolicyCtorArg = authIpMmPolicy,
                dataBufferCtorArg = dataBuffer,
                classifyOptionsCtorArg = classifyOptions,
                ikeV2QmTunnelPolicyCtorArg = ikeV2QmTunnelPolicy,
                ikeV2MmPolicyCtorArg = ikeV2MmPolicy,
                idpOptionsCtorArg = idpOptions,
            )
    }
}

public class FwpmProviderContext2 internal constructor(
    public var providerContextKey: Guid,
    public var displayData: FwpmDisplayData0,
    public var flags: UInt,
    providerKeyCtorArg: MutPtr<Guid>,
    public var providerData: FwpByteBlob,
    public var type: FwpmProviderContextType,
    public var anonymous: FwpmProviderContext20,
    public var providerContextId: ULong,
) {
    public var providerKey: MutPtr<Guid> = providerKeyCtorArg
        internal set

    public constructor() : this(
        providerContextKey = Guid(),
        displayData = FwpmDisplayData0(),
        flags = 0u,
        providerKeyCtorArg = MutPtr(0L),
        providerData = FwpByteBlob(),
        type = 0,
        anonymous = FwpmProviderContext20(),
        providerContextId = 0uL,
    )

    public operator fun component1(): Guid = this.providerContextKey

    public operator fun component2(): FwpmDisplayData0 = this.displayData

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): MutPtr<Guid> = this.providerKey

    public operator fun component5(): FwpByteBlob = this.providerData

    public operator fun component6(): FwpmProviderContextType = this.type

    public operator fun component7(): FwpmProviderContext20 = this.anonymous

    public operator fun component8(): ULong = this.providerContextId

    public fun copy(providerContextKey: Guid = this.providerContextKey, displayData: FwpmDisplayData0 = this.displayData, flags: UInt = this.flags, providerKey: MutPtr<Guid> = this.providerKey, providerData: FwpByteBlob = this.providerData, type: FwpmProviderContextType = this.type, anonymous: FwpmProviderContext20 = this.anonymous, providerContextId: ULong = this.providerContextId): FwpmProviderContext2 = FwpmProviderContext2(providerContextKey = providerContextKey, displayData = displayData, flags = flags, providerKeyCtorArg = providerKey, providerData = providerData, type = type, anonymous = anonymous, providerContextId = providerContextId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmProviderContext2) return false
        if (this.providerContextKey != other.providerContextKey) return false
        if (this.displayData != other.displayData) return false
        if (this.flags != other.flags) return false
        if (this.providerKey != other.providerKey) return false
        if (this.providerData != other.providerData) return false
        if (this.type != other.type) return false
        if (this.anonymous != other.anonymous) return false
        if (this.providerContextId != other.providerContextId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerContextKey.hashCode()
        result = 31 * result + this.displayData.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.providerKey.hashCode()
        result = 31 * result + this.providerData.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.providerContextId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            providerContextKey: Guid = Guid(),
            displayData: FwpmDisplayData0 = FwpmDisplayData0(),
            flags: UInt = 0u,
            providerKey: MutPtr<Guid> = MutPtr(0L),
            providerData: FwpByteBlob = FwpByteBlob(),
            type: FwpmProviderContextType = 0,
            anonymous: FwpmProviderContext20 = FwpmProviderContext20(),
            providerContextId: ULong = 0uL,
        ): FwpmProviderContext2 =
            FwpmProviderContext2(
                providerContextKey = providerContextKey,
                displayData = displayData,
                flags = flags,
                providerKeyCtorArg = providerKey,
                providerData = providerData,
                type = type,
                anonymous = anonymous,
                providerContextId = providerContextId,
            )
    }
}

public class FwpmProviderContext20 internal constructor(
    keyingPolicyCtorArg: MutPtr<IpsecKeyingPolicy1>,
    ikeQmTransportPolicyCtorArg: MutPtr<IpsecTransportPolicy2>,
    ikeQmTunnelPolicyCtorArg: MutPtr<IpsecTunnelPolicy2>,
    authipQmTransportPolicyCtorArg: MutPtr<IpsecTransportPolicy2>,
    authipQmTunnelPolicyCtorArg: MutPtr<IpsecTunnelPolicy2>,
    ikeMmPolicyCtorArg: MutPtr<IkeextPolicy2>,
    authIpMmPolicyCtorArg: MutPtr<IkeextPolicy2>,
    dataBufferCtorArg: MutPtr<FwpByteBlob>,
    classifyOptionsCtorArg: MutPtr<FwpmClassifyOptions0>,
    ikeV2QmTunnelPolicyCtorArg: MutPtr<IpsecTunnelPolicy2>,
    ikeV2QmTransportPolicyCtorArg: MutPtr<IpsecTransportPolicy2>,
    ikeV2MmPolicyCtorArg: MutPtr<IkeextPolicy2>,
    idpOptionsCtorArg: MutPtr<IpsecDospOptions0>,
) {
    public var keyingPolicy: MutPtr<IpsecKeyingPolicy1> = keyingPolicyCtorArg
        internal set

    public var ikeQmTransportPolicy: MutPtr<IpsecTransportPolicy2> = ikeQmTransportPolicyCtorArg
        internal set

    public var ikeQmTunnelPolicy: MutPtr<IpsecTunnelPolicy2> = ikeQmTunnelPolicyCtorArg
        internal set

    public var authipQmTransportPolicy: MutPtr<IpsecTransportPolicy2> = authipQmTransportPolicyCtorArg
        internal set

    public var authipQmTunnelPolicy: MutPtr<IpsecTunnelPolicy2> = authipQmTunnelPolicyCtorArg
        internal set

    public var ikeMmPolicy: MutPtr<IkeextPolicy2> = ikeMmPolicyCtorArg
        internal set

    public var authIpMmPolicy: MutPtr<IkeextPolicy2> = authIpMmPolicyCtorArg
        internal set

    public var dataBuffer: MutPtr<FwpByteBlob> = dataBufferCtorArg
        internal set

    public var classifyOptions: MutPtr<FwpmClassifyOptions0> = classifyOptionsCtorArg
        internal set

    public var ikeV2QmTunnelPolicy: MutPtr<IpsecTunnelPolicy2> = ikeV2QmTunnelPolicyCtorArg
        internal set

    public var ikeV2QmTransportPolicy: MutPtr<IpsecTransportPolicy2> = ikeV2QmTransportPolicyCtorArg
        internal set

    public var ikeV2MmPolicy: MutPtr<IkeextPolicy2> = ikeV2MmPolicyCtorArg
        internal set

    public var idpOptions: MutPtr<IpsecDospOptions0> = idpOptionsCtorArg
        internal set

    public constructor() : this(
        keyingPolicyCtorArg = MutPtr(0L),
        ikeQmTransportPolicyCtorArg = MutPtr(0L),
        ikeQmTunnelPolicyCtorArg = MutPtr(0L),
        authipQmTransportPolicyCtorArg = MutPtr(0L),
        authipQmTunnelPolicyCtorArg = MutPtr(0L),
        ikeMmPolicyCtorArg = MutPtr(0L),
        authIpMmPolicyCtorArg = MutPtr(0L),
        dataBufferCtorArg = MutPtr(0L),
        classifyOptionsCtorArg = MutPtr(0L),
        ikeV2QmTunnelPolicyCtorArg = MutPtr(0L),
        ikeV2QmTransportPolicyCtorArg = MutPtr(0L),
        ikeV2MmPolicyCtorArg = MutPtr(0L),
        idpOptionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IpsecKeyingPolicy1> = this.keyingPolicy

    public operator fun component2(): MutPtr<IpsecTransportPolicy2> = this.ikeQmTransportPolicy

    public operator fun component3(): MutPtr<IpsecTunnelPolicy2> = this.ikeQmTunnelPolicy

    public operator fun component4(): MutPtr<IpsecTransportPolicy2> = this.authipQmTransportPolicy

    public operator fun component5(): MutPtr<IpsecTunnelPolicy2> = this.authipQmTunnelPolicy

    public operator fun component6(): MutPtr<IkeextPolicy2> = this.ikeMmPolicy

    public operator fun component7(): MutPtr<IkeextPolicy2> = this.authIpMmPolicy

    public operator fun component8(): MutPtr<FwpByteBlob> = this.dataBuffer

    public operator fun component9(): MutPtr<FwpmClassifyOptions0> = this.classifyOptions

    public operator fun component10(): MutPtr<IpsecTunnelPolicy2> = this.ikeV2QmTunnelPolicy

    public operator fun component11(): MutPtr<IpsecTransportPolicy2> = this.ikeV2QmTransportPolicy

    public operator fun component12(): MutPtr<IkeextPolicy2> = this.ikeV2MmPolicy

    public operator fun component13(): MutPtr<IpsecDospOptions0> = this.idpOptions

    public fun copy(keyingPolicy: MutPtr<IpsecKeyingPolicy1> = this.keyingPolicy, ikeQmTransportPolicy: MutPtr<IpsecTransportPolicy2> = this.ikeQmTransportPolicy, ikeQmTunnelPolicy: MutPtr<IpsecTunnelPolicy2> = this.ikeQmTunnelPolicy, authipQmTransportPolicy: MutPtr<IpsecTransportPolicy2> = this.authipQmTransportPolicy, authipQmTunnelPolicy: MutPtr<IpsecTunnelPolicy2> = this.authipQmTunnelPolicy, ikeMmPolicy: MutPtr<IkeextPolicy2> = this.ikeMmPolicy, authIpMmPolicy: MutPtr<IkeextPolicy2> = this.authIpMmPolicy, dataBuffer: MutPtr<FwpByteBlob> = this.dataBuffer, classifyOptions: MutPtr<FwpmClassifyOptions0> = this.classifyOptions, ikeV2QmTunnelPolicy: MutPtr<IpsecTunnelPolicy2> = this.ikeV2QmTunnelPolicy, ikeV2QmTransportPolicy: MutPtr<IpsecTransportPolicy2> = this.ikeV2QmTransportPolicy, ikeV2MmPolicy: MutPtr<IkeextPolicy2> = this.ikeV2MmPolicy, idpOptions: MutPtr<IpsecDospOptions0> = this.idpOptions): FwpmProviderContext20 = FwpmProviderContext20(keyingPolicyCtorArg = keyingPolicy, ikeQmTransportPolicyCtorArg = ikeQmTransportPolicy, ikeQmTunnelPolicyCtorArg = ikeQmTunnelPolicy, authipQmTransportPolicyCtorArg = authipQmTransportPolicy, authipQmTunnelPolicyCtorArg = authipQmTunnelPolicy, ikeMmPolicyCtorArg = ikeMmPolicy, authIpMmPolicyCtorArg = authIpMmPolicy, dataBufferCtorArg = dataBuffer, classifyOptionsCtorArg = classifyOptions, ikeV2QmTunnelPolicyCtorArg = ikeV2QmTunnelPolicy, ikeV2QmTransportPolicyCtorArg = ikeV2QmTransportPolicy, ikeV2MmPolicyCtorArg = ikeV2MmPolicy, idpOptionsCtorArg = idpOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmProviderContext20) return false
        if (this.keyingPolicy != other.keyingPolicy) return false
        if (this.ikeQmTransportPolicy != other.ikeQmTransportPolicy) return false
        if (this.ikeQmTunnelPolicy != other.ikeQmTunnelPolicy) return false
        if (this.authipQmTransportPolicy != other.authipQmTransportPolicy) return false
        if (this.authipQmTunnelPolicy != other.authipQmTunnelPolicy) return false
        if (this.ikeMmPolicy != other.ikeMmPolicy) return false
        if (this.authIpMmPolicy != other.authIpMmPolicy) return false
        if (this.dataBuffer != other.dataBuffer) return false
        if (this.classifyOptions != other.classifyOptions) return false
        if (this.ikeV2QmTunnelPolicy != other.ikeV2QmTunnelPolicy) return false
        if (this.ikeV2QmTransportPolicy != other.ikeV2QmTransportPolicy) return false
        if (this.ikeV2MmPolicy != other.ikeV2MmPolicy) return false
        if (this.idpOptions != other.idpOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyingPolicy.hashCode()
        result = 31 * result + this.ikeQmTransportPolicy.hashCode()
        result = 31 * result + this.ikeQmTunnelPolicy.hashCode()
        result = 31 * result + this.authipQmTransportPolicy.hashCode()
        result = 31 * result + this.authipQmTunnelPolicy.hashCode()
        result = 31 * result + this.ikeMmPolicy.hashCode()
        result = 31 * result + this.authIpMmPolicy.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        result = 31 * result + this.classifyOptions.hashCode()
        result = 31 * result + this.ikeV2QmTunnelPolicy.hashCode()
        result = 31 * result + this.ikeV2QmTransportPolicy.hashCode()
        result = 31 * result + this.ikeV2MmPolicy.hashCode()
        result = 31 * result + this.idpOptions.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            keyingPolicy: MutPtr<IpsecKeyingPolicy1> = MutPtr(0L),
            ikeQmTransportPolicy: MutPtr<IpsecTransportPolicy2> = MutPtr(0L),
            ikeQmTunnelPolicy: MutPtr<IpsecTunnelPolicy2> = MutPtr(0L),
            authipQmTransportPolicy: MutPtr<IpsecTransportPolicy2> = MutPtr(0L),
            authipQmTunnelPolicy: MutPtr<IpsecTunnelPolicy2> = MutPtr(0L),
            ikeMmPolicy: MutPtr<IkeextPolicy2> = MutPtr(0L),
            authIpMmPolicy: MutPtr<IkeextPolicy2> = MutPtr(0L),
            dataBuffer: MutPtr<FwpByteBlob> = MutPtr(0L),
            classifyOptions: MutPtr<FwpmClassifyOptions0> = MutPtr(0L),
            ikeV2QmTunnelPolicy: MutPtr<IpsecTunnelPolicy2> = MutPtr(0L),
            ikeV2QmTransportPolicy: MutPtr<IpsecTransportPolicy2> = MutPtr(0L),
            ikeV2MmPolicy: MutPtr<IkeextPolicy2> = MutPtr(0L),
            idpOptions: MutPtr<IpsecDospOptions0> = MutPtr(0L),
        ): FwpmProviderContext20 =
            FwpmProviderContext20(
                keyingPolicyCtorArg = keyingPolicy,
                ikeQmTransportPolicyCtorArg = ikeQmTransportPolicy,
                ikeQmTunnelPolicyCtorArg = ikeQmTunnelPolicy,
                authipQmTransportPolicyCtorArg = authipQmTransportPolicy,
                authipQmTunnelPolicyCtorArg = authipQmTunnelPolicy,
                ikeMmPolicyCtorArg = ikeMmPolicy,
                authIpMmPolicyCtorArg = authIpMmPolicy,
                dataBufferCtorArg = dataBuffer,
                classifyOptionsCtorArg = classifyOptions,
                ikeV2QmTunnelPolicyCtorArg = ikeV2QmTunnelPolicy,
                ikeV2QmTransportPolicyCtorArg = ikeV2QmTransportPolicy,
                ikeV2MmPolicyCtorArg = ikeV2MmPolicy,
                idpOptionsCtorArg = idpOptions,
            )
    }
}

public class FwpmProviderContext3 internal constructor(
    public var providerContextKey: Guid,
    public var displayData: FwpmDisplayData0,
    public var flags: UInt,
    providerKeyCtorArg: MutPtr<Guid>,
    public var providerData: FwpByteBlob,
    public var type: FwpmProviderContextType,
    public var anonymous: FwpmProviderContext30,
    public var providerContextId: ULong,
) {
    public var providerKey: MutPtr<Guid> = providerKeyCtorArg
        internal set

    public constructor() : this(
        providerContextKey = Guid(),
        displayData = FwpmDisplayData0(),
        flags = 0u,
        providerKeyCtorArg = MutPtr(0L),
        providerData = FwpByteBlob(),
        type = 0,
        anonymous = FwpmProviderContext30(),
        providerContextId = 0uL,
    )

    public operator fun component1(): Guid = this.providerContextKey

    public operator fun component2(): FwpmDisplayData0 = this.displayData

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): MutPtr<Guid> = this.providerKey

    public operator fun component5(): FwpByteBlob = this.providerData

    public operator fun component6(): FwpmProviderContextType = this.type

    public operator fun component7(): FwpmProviderContext30 = this.anonymous

    public operator fun component8(): ULong = this.providerContextId

    public fun copy(providerContextKey: Guid = this.providerContextKey, displayData: FwpmDisplayData0 = this.displayData, flags: UInt = this.flags, providerKey: MutPtr<Guid> = this.providerKey, providerData: FwpByteBlob = this.providerData, type: FwpmProviderContextType = this.type, anonymous: FwpmProviderContext30 = this.anonymous, providerContextId: ULong = this.providerContextId): FwpmProviderContext3 = FwpmProviderContext3(providerContextKey = providerContextKey, displayData = displayData, flags = flags, providerKeyCtorArg = providerKey, providerData = providerData, type = type, anonymous = anonymous, providerContextId = providerContextId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmProviderContext3) return false
        if (this.providerContextKey != other.providerContextKey) return false
        if (this.displayData != other.displayData) return false
        if (this.flags != other.flags) return false
        if (this.providerKey != other.providerKey) return false
        if (this.providerData != other.providerData) return false
        if (this.type != other.type) return false
        if (this.anonymous != other.anonymous) return false
        if (this.providerContextId != other.providerContextId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerContextKey.hashCode()
        result = 31 * result + this.displayData.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.providerKey.hashCode()
        result = 31 * result + this.providerData.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.providerContextId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            providerContextKey: Guid = Guid(),
            displayData: FwpmDisplayData0 = FwpmDisplayData0(),
            flags: UInt = 0u,
            providerKey: MutPtr<Guid> = MutPtr(0L),
            providerData: FwpByteBlob = FwpByteBlob(),
            type: FwpmProviderContextType = 0,
            anonymous: FwpmProviderContext30 = FwpmProviderContext30(),
            providerContextId: ULong = 0uL,
        ): FwpmProviderContext3 =
            FwpmProviderContext3(
                providerContextKey = providerContextKey,
                displayData = displayData,
                flags = flags,
                providerKeyCtorArg = providerKey,
                providerData = providerData,
                type = type,
                anonymous = anonymous,
                providerContextId = providerContextId,
            )
    }
}

public class FwpmProviderContext30 internal constructor(
    keyingPolicyCtorArg: MutPtr<IpsecKeyingPolicy1>,
    ikeQmTransportPolicyCtorArg: MutPtr<IpsecTransportPolicy2>,
    ikeQmTunnelPolicyCtorArg: MutPtr<IpsecTunnelPolicy3>,
    authipQmTransportPolicyCtorArg: MutPtr<IpsecTransportPolicy2>,
    authipQmTunnelPolicyCtorArg: MutPtr<IpsecTunnelPolicy3>,
    ikeMmPolicyCtorArg: MutPtr<IkeextPolicy2>,
    authIpMmPolicyCtorArg: MutPtr<IkeextPolicy2>,
    dataBufferCtorArg: MutPtr<FwpByteBlob>,
    classifyOptionsCtorArg: MutPtr<FwpmClassifyOptions0>,
    ikeV2QmTunnelPolicyCtorArg: MutPtr<IpsecTunnelPolicy3>,
    ikeV2QmTransportPolicyCtorArg: MutPtr<IpsecTransportPolicy2>,
    ikeV2MmPolicyCtorArg: MutPtr<IkeextPolicy2>,
    idpOptionsCtorArg: MutPtr<IpsecDospOptions0>,
    networkConnectionPolicyCtorArg: MutPtr<FwpmNetworkConnectionPolicySettings0>,
) {
    public var keyingPolicy: MutPtr<IpsecKeyingPolicy1> = keyingPolicyCtorArg
        internal set

    public var ikeQmTransportPolicy: MutPtr<IpsecTransportPolicy2> = ikeQmTransportPolicyCtorArg
        internal set

    public var ikeQmTunnelPolicy: MutPtr<IpsecTunnelPolicy3> = ikeQmTunnelPolicyCtorArg
        internal set

    public var authipQmTransportPolicy: MutPtr<IpsecTransportPolicy2> = authipQmTransportPolicyCtorArg
        internal set

    public var authipQmTunnelPolicy: MutPtr<IpsecTunnelPolicy3> = authipQmTunnelPolicyCtorArg
        internal set

    public var ikeMmPolicy: MutPtr<IkeextPolicy2> = ikeMmPolicyCtorArg
        internal set

    public var authIpMmPolicy: MutPtr<IkeextPolicy2> = authIpMmPolicyCtorArg
        internal set

    public var dataBuffer: MutPtr<FwpByteBlob> = dataBufferCtorArg
        internal set

    public var classifyOptions: MutPtr<FwpmClassifyOptions0> = classifyOptionsCtorArg
        internal set

    public var ikeV2QmTunnelPolicy: MutPtr<IpsecTunnelPolicy3> = ikeV2QmTunnelPolicyCtorArg
        internal set

    public var ikeV2QmTransportPolicy: MutPtr<IpsecTransportPolicy2> = ikeV2QmTransportPolicyCtorArg
        internal set

    public var ikeV2MmPolicy: MutPtr<IkeextPolicy2> = ikeV2MmPolicyCtorArg
        internal set

    public var idpOptions: MutPtr<IpsecDospOptions0> = idpOptionsCtorArg
        internal set

    public var networkConnectionPolicy: MutPtr<FwpmNetworkConnectionPolicySettings0> = networkConnectionPolicyCtorArg
        internal set

    public constructor() : this(
        keyingPolicyCtorArg = MutPtr(0L),
        ikeQmTransportPolicyCtorArg = MutPtr(0L),
        ikeQmTunnelPolicyCtorArg = MutPtr(0L),
        authipQmTransportPolicyCtorArg = MutPtr(0L),
        authipQmTunnelPolicyCtorArg = MutPtr(0L),
        ikeMmPolicyCtorArg = MutPtr(0L),
        authIpMmPolicyCtorArg = MutPtr(0L),
        dataBufferCtorArg = MutPtr(0L),
        classifyOptionsCtorArg = MutPtr(0L),
        ikeV2QmTunnelPolicyCtorArg = MutPtr(0L),
        ikeV2QmTransportPolicyCtorArg = MutPtr(0L),
        ikeV2MmPolicyCtorArg = MutPtr(0L),
        idpOptionsCtorArg = MutPtr(0L),
        networkConnectionPolicyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IpsecKeyingPolicy1> = this.keyingPolicy

    public operator fun component2(): MutPtr<IpsecTransportPolicy2> = this.ikeQmTransportPolicy

    public operator fun component3(): MutPtr<IpsecTunnelPolicy3> = this.ikeQmTunnelPolicy

    public operator fun component4(): MutPtr<IpsecTransportPolicy2> = this.authipQmTransportPolicy

    public operator fun component5(): MutPtr<IpsecTunnelPolicy3> = this.authipQmTunnelPolicy

    public operator fun component6(): MutPtr<IkeextPolicy2> = this.ikeMmPolicy

    public operator fun component7(): MutPtr<IkeextPolicy2> = this.authIpMmPolicy

    public operator fun component8(): MutPtr<FwpByteBlob> = this.dataBuffer

    public operator fun component9(): MutPtr<FwpmClassifyOptions0> = this.classifyOptions

    public operator fun component10(): MutPtr<IpsecTunnelPolicy3> = this.ikeV2QmTunnelPolicy

    public operator fun component11(): MutPtr<IpsecTransportPolicy2> = this.ikeV2QmTransportPolicy

    public operator fun component12(): MutPtr<IkeextPolicy2> = this.ikeV2MmPolicy

    public operator fun component13(): MutPtr<IpsecDospOptions0> = this.idpOptions

    public operator fun component14(): MutPtr<FwpmNetworkConnectionPolicySettings0> = this.networkConnectionPolicy

    public fun copy(keyingPolicy: MutPtr<IpsecKeyingPolicy1> = this.keyingPolicy, ikeQmTransportPolicy: MutPtr<IpsecTransportPolicy2> = this.ikeQmTransportPolicy, ikeQmTunnelPolicy: MutPtr<IpsecTunnelPolicy3> = this.ikeQmTunnelPolicy, authipQmTransportPolicy: MutPtr<IpsecTransportPolicy2> = this.authipQmTransportPolicy, authipQmTunnelPolicy: MutPtr<IpsecTunnelPolicy3> = this.authipQmTunnelPolicy, ikeMmPolicy: MutPtr<IkeextPolicy2> = this.ikeMmPolicy, authIpMmPolicy: MutPtr<IkeextPolicy2> = this.authIpMmPolicy, dataBuffer: MutPtr<FwpByteBlob> = this.dataBuffer, classifyOptions: MutPtr<FwpmClassifyOptions0> = this.classifyOptions, ikeV2QmTunnelPolicy: MutPtr<IpsecTunnelPolicy3> = this.ikeV2QmTunnelPolicy, ikeV2QmTransportPolicy: MutPtr<IpsecTransportPolicy2> = this.ikeV2QmTransportPolicy, ikeV2MmPolicy: MutPtr<IkeextPolicy2> = this.ikeV2MmPolicy, idpOptions: MutPtr<IpsecDospOptions0> = this.idpOptions, networkConnectionPolicy: MutPtr<FwpmNetworkConnectionPolicySettings0> = this.networkConnectionPolicy): FwpmProviderContext30 = FwpmProviderContext30(keyingPolicyCtorArg = keyingPolicy, ikeQmTransportPolicyCtorArg = ikeQmTransportPolicy, ikeQmTunnelPolicyCtorArg = ikeQmTunnelPolicy, authipQmTransportPolicyCtorArg = authipQmTransportPolicy, authipQmTunnelPolicyCtorArg = authipQmTunnelPolicy, ikeMmPolicyCtorArg = ikeMmPolicy, authIpMmPolicyCtorArg = authIpMmPolicy, dataBufferCtorArg = dataBuffer, classifyOptionsCtorArg = classifyOptions, ikeV2QmTunnelPolicyCtorArg = ikeV2QmTunnelPolicy, ikeV2QmTransportPolicyCtorArg = ikeV2QmTransportPolicy, ikeV2MmPolicyCtorArg = ikeV2MmPolicy, idpOptionsCtorArg = idpOptions, networkConnectionPolicyCtorArg = networkConnectionPolicy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmProviderContext30) return false
        if (this.keyingPolicy != other.keyingPolicy) return false
        if (this.ikeQmTransportPolicy != other.ikeQmTransportPolicy) return false
        if (this.ikeQmTunnelPolicy != other.ikeQmTunnelPolicy) return false
        if (this.authipQmTransportPolicy != other.authipQmTransportPolicy) return false
        if (this.authipQmTunnelPolicy != other.authipQmTunnelPolicy) return false
        if (this.ikeMmPolicy != other.ikeMmPolicy) return false
        if (this.authIpMmPolicy != other.authIpMmPolicy) return false
        if (this.dataBuffer != other.dataBuffer) return false
        if (this.classifyOptions != other.classifyOptions) return false
        if (this.ikeV2QmTunnelPolicy != other.ikeV2QmTunnelPolicy) return false
        if (this.ikeV2QmTransportPolicy != other.ikeV2QmTransportPolicy) return false
        if (this.ikeV2MmPolicy != other.ikeV2MmPolicy) return false
        if (this.idpOptions != other.idpOptions) return false
        if (this.networkConnectionPolicy != other.networkConnectionPolicy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyingPolicy.hashCode()
        result = 31 * result + this.ikeQmTransportPolicy.hashCode()
        result = 31 * result + this.ikeQmTunnelPolicy.hashCode()
        result = 31 * result + this.authipQmTransportPolicy.hashCode()
        result = 31 * result + this.authipQmTunnelPolicy.hashCode()
        result = 31 * result + this.ikeMmPolicy.hashCode()
        result = 31 * result + this.authIpMmPolicy.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        result = 31 * result + this.classifyOptions.hashCode()
        result = 31 * result + this.ikeV2QmTunnelPolicy.hashCode()
        result = 31 * result + this.ikeV2QmTransportPolicy.hashCode()
        result = 31 * result + this.ikeV2MmPolicy.hashCode()
        result = 31 * result + this.idpOptions.hashCode()
        result = 31 * result + this.networkConnectionPolicy.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            keyingPolicy: MutPtr<IpsecKeyingPolicy1> = MutPtr(0L),
            ikeQmTransportPolicy: MutPtr<IpsecTransportPolicy2> = MutPtr(0L),
            ikeQmTunnelPolicy: MutPtr<IpsecTunnelPolicy3> = MutPtr(0L),
            authipQmTransportPolicy: MutPtr<IpsecTransportPolicy2> = MutPtr(0L),
            authipQmTunnelPolicy: MutPtr<IpsecTunnelPolicy3> = MutPtr(0L),
            ikeMmPolicy: MutPtr<IkeextPolicy2> = MutPtr(0L),
            authIpMmPolicy: MutPtr<IkeextPolicy2> = MutPtr(0L),
            dataBuffer: MutPtr<FwpByteBlob> = MutPtr(0L),
            classifyOptions: MutPtr<FwpmClassifyOptions0> = MutPtr(0L),
            ikeV2QmTunnelPolicy: MutPtr<IpsecTunnelPolicy3> = MutPtr(0L),
            ikeV2QmTransportPolicy: MutPtr<IpsecTransportPolicy2> = MutPtr(0L),
            ikeV2MmPolicy: MutPtr<IkeextPolicy2> = MutPtr(0L),
            idpOptions: MutPtr<IpsecDospOptions0> = MutPtr(0L),
            networkConnectionPolicy: MutPtr<FwpmNetworkConnectionPolicySettings0> = MutPtr(0L),
        ): FwpmProviderContext30 =
            FwpmProviderContext30(
                keyingPolicyCtorArg = keyingPolicy,
                ikeQmTransportPolicyCtorArg = ikeQmTransportPolicy,
                ikeQmTunnelPolicyCtorArg = ikeQmTunnelPolicy,
                authipQmTransportPolicyCtorArg = authipQmTransportPolicy,
                authipQmTunnelPolicyCtorArg = authipQmTunnelPolicy,
                ikeMmPolicyCtorArg = ikeMmPolicy,
                authIpMmPolicyCtorArg = authIpMmPolicy,
                dataBufferCtorArg = dataBuffer,
                classifyOptionsCtorArg = classifyOptions,
                ikeV2QmTunnelPolicyCtorArg = ikeV2QmTunnelPolicy,
                ikeV2QmTransportPolicyCtorArg = ikeV2QmTransportPolicy,
                ikeV2MmPolicyCtorArg = ikeV2MmPolicy,
                idpOptionsCtorArg = idpOptions,
                networkConnectionPolicyCtorArg = networkConnectionPolicy,
            )
    }
}

public data class FwpmProviderContextChange0(
    public var changeType: FwpmChangeType = 0,
    public var providerContextKey: Guid = Guid(),
    public var providerContextId: ULong = 0uL,
)

public class FwpmProviderContextEnumTemplate0 internal constructor(
    providerKeyCtorArg: MutPtr<Guid>,
    public var providerContextType: FwpmProviderContextType,
) {
    public var providerKey: MutPtr<Guid> = providerKeyCtorArg
        internal set

    public constructor() : this(
        providerKeyCtorArg = MutPtr(0L),
        providerContextType = 0,
    )

    public operator fun component1(): MutPtr<Guid> = this.providerKey

    public operator fun component2(): FwpmProviderContextType = this.providerContextType

    public fun copy(providerKey: MutPtr<Guid> = this.providerKey, providerContextType: FwpmProviderContextType = this.providerContextType): FwpmProviderContextEnumTemplate0 = FwpmProviderContextEnumTemplate0(providerKeyCtorArg = providerKey, providerContextType = providerContextType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmProviderContextEnumTemplate0) return false
        if (this.providerKey != other.providerKey) return false
        if (this.providerContextType != other.providerContextType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.providerKey.hashCode()
        result = 31 * result + this.providerContextType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmProviderContextEnumTemplate0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmProviderContextEnumTemplate0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmProviderContextEnumTemplate0 =
                    FwpmProviderContextEnumTemplate0(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FwpmProviderContextEnumTemplate0) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr, value.providerKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.providerContextType)
                }
            }

        public operator fun invoke(
            providerKey: MutPtr<Guid> = MutPtr(0L),
            providerContextType: FwpmProviderContextType = 0,
        ): FwpmProviderContextEnumTemplate0 =
            FwpmProviderContextEnumTemplate0(
                providerKeyCtorArg = providerKey,
                providerContextType = providerContextType,
            )
    }
}

public class FwpmProviderContextSubscription0 internal constructor(
    enumTemplateCtorArg: MutPtr<FwpmProviderContextEnumTemplate0>,
    public var flags: FwpmSubscriptionFlags,
    public var sessionKey: Guid,
) {
    public var enumTemplate: MutPtr<FwpmProviderContextEnumTemplate0> = enumTemplateCtorArg
        internal set

    public constructor() : this(
        enumTemplateCtorArg = MutPtr(0L),
        flags = 0u,
        sessionKey = Guid(),
    )

    public operator fun component1(): MutPtr<FwpmProviderContextEnumTemplate0> = this.enumTemplate

    public operator fun component2(): FwpmSubscriptionFlags = this.flags

    public operator fun component3(): Guid = this.sessionKey

    public fun copy(enumTemplate: MutPtr<FwpmProviderContextEnumTemplate0> = this.enumTemplate, flags: FwpmSubscriptionFlags = this.flags, sessionKey: Guid = this.sessionKey): FwpmProviderContextSubscription0 = FwpmProviderContextSubscription0(enumTemplateCtorArg = enumTemplate, flags = flags, sessionKey = sessionKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmProviderContextSubscription0) return false
        if (this.enumTemplate != other.enumTemplate) return false
        if (this.flags != other.flags) return false
        if (this.sessionKey != other.sessionKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enumTemplate.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.sessionKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            enumTemplate: MutPtr<FwpmProviderContextEnumTemplate0> = MutPtr(0L),
            flags: FwpmSubscriptionFlags = 0u,
            sessionKey: Guid = Guid(),
        ): FwpmProviderContextSubscription0 =
            FwpmProviderContextSubscription0(
                enumTemplateCtorArg = enumTemplate,
                flags = flags,
                sessionKey = sessionKey,
            )
    }
}

public data class FwpmProviderEnumTemplate0(
    public var reserved: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmProviderEnumTemplate0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmProviderEnumTemplate0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmProviderEnumTemplate0 =
                    FwpmProviderEnumTemplate0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FwpmProviderEnumTemplate0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.reserved)
                }
            }
    }
}

public class FwpmProviderSubscription0 internal constructor(
    enumTemplateCtorArg: MutPtr<FwpmProviderEnumTemplate0>,
    public var flags: UInt,
    public var sessionKey: Guid,
) {
    public var enumTemplate: MutPtr<FwpmProviderEnumTemplate0> = enumTemplateCtorArg
        internal set

    public constructor() : this(
        enumTemplateCtorArg = MutPtr(0L),
        flags = 0u,
        sessionKey = Guid(),
    )

    public operator fun component1(): MutPtr<FwpmProviderEnumTemplate0> = this.enumTemplate

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): Guid = this.sessionKey

    public fun copy(enumTemplate: MutPtr<FwpmProviderEnumTemplate0> = this.enumTemplate, flags: UInt = this.flags, sessionKey: Guid = this.sessionKey): FwpmProviderSubscription0 = FwpmProviderSubscription0(enumTemplateCtorArg = enumTemplate, flags = flags, sessionKey = sessionKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmProviderSubscription0) return false
        if (this.enumTemplate != other.enumTemplate) return false
        if (this.flags != other.flags) return false
        if (this.sessionKey != other.sessionKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enumTemplate.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.sessionKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            enumTemplate: MutPtr<FwpmProviderEnumTemplate0> = MutPtr(0L),
            flags: UInt = 0u,
            sessionKey: Guid = Guid(),
        ): FwpmProviderSubscription0 =
            FwpmProviderSubscription0(
                enumTemplateCtorArg = enumTemplate,
                flags = flags,
                sessionKey = sessionKey,
            )
    }
}

public class FwpmSession0 internal constructor(
    public var sessionKey: Guid,
    public var displayData: FwpmDisplayData0,
    public var flags: UInt,
    public var txnWaitTimeoutInMSec: UInt,
    public var processId: UInt,
    sidCtorArg: MutPtr<Sid>,
    usernameCtorArg: Pwstr,
    public var kernelMode: Bool,
) {
    public var sid: MutPtr<Sid> = sidCtorArg
        internal set

    public var username: Pwstr = usernameCtorArg
        internal set

    public constructor() : this(
        sessionKey = Guid(),
        displayData = FwpmDisplayData0(),
        flags = 0u,
        txnWaitTimeoutInMSec = 0u,
        processId = 0u,
        sidCtorArg = MutPtr(0L),
        usernameCtorArg = MutPtr(0L),
        kernelMode = 0,
    )

    public operator fun component1(): Guid = this.sessionKey

    public operator fun component2(): FwpmDisplayData0 = this.displayData

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): UInt = this.txnWaitTimeoutInMSec

    public operator fun component5(): UInt = this.processId

    public operator fun component6(): MutPtr<Sid> = this.sid

    public operator fun component7(): Pwstr = this.username

    public operator fun component8(): Bool = this.kernelMode

    public fun copy(sessionKey: Guid = this.sessionKey, displayData: FwpmDisplayData0 = this.displayData, flags: UInt = this.flags, txnWaitTimeoutInMSec: UInt = this.txnWaitTimeoutInMSec, processId: UInt = this.processId, sid: MutPtr<Sid> = this.sid, username: Pwstr = this.username, kernelMode: Bool = this.kernelMode): FwpmSession0 = FwpmSession0(sessionKey = sessionKey, displayData = displayData, flags = flags, txnWaitTimeoutInMSec = txnWaitTimeoutInMSec, processId = processId, sidCtorArg = sid, usernameCtorArg = username, kernelMode = kernelMode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmSession0) return false
        if (this.sessionKey != other.sessionKey) return false
        if (this.displayData != other.displayData) return false
        if (this.flags != other.flags) return false
        if (this.txnWaitTimeoutInMSec != other.txnWaitTimeoutInMSec) return false
        if (this.processId != other.processId) return false
        if (this.sid != other.sid) return false
        if (this.username != other.username) return false
        if (this.kernelMode != other.kernelMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionKey.hashCode()
        result = 31 * result + this.displayData.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.txnWaitTimeoutInMSec.hashCode()
        result = 31 * result + this.processId.hashCode()
        result = 31 * result + this.sid.hashCode()
        result = 31 * result + this.username.hashCode()
        result = 31 * result + this.kernelMode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sessionKey: Guid = Guid(),
            displayData: FwpmDisplayData0 = FwpmDisplayData0(),
            flags: UInt = 0u,
            txnWaitTimeoutInMSec: UInt = 0u,
            processId: UInt = 0u,
            sid: MutPtr<Sid> = MutPtr(0L),
            username: Pwstr = MutPtr(0L),
            kernelMode: Bool = 0,
        ): FwpmSession0 =
            FwpmSession0(
                sessionKey = sessionKey,
                displayData = displayData,
                flags = flags,
                txnWaitTimeoutInMSec = txnWaitTimeoutInMSec,
                processId = processId,
                sidCtorArg = sid,
                usernameCtorArg = username,
                kernelMode = kernelMode,
            )
    }
}

public data class FwpmSessionEnumTemplate0(
    public var reserved: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmSessionEnumTemplate0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmSessionEnumTemplate0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmSessionEnumTemplate0 =
                    FwpmSessionEnumTemplate0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FwpmSessionEnumTemplate0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.reserved)
                }
            }
    }
}

public class FwpmStatistics0 internal constructor(
    public var numLayerStatistics: UInt,
    layerStatisticsCtorArg: MutPtr<FwpmLayerStatistics0>,
    public var inboundAllowedConnectionsV4: UInt,
    public var inboundBlockedConnectionsV4: UInt,
    public var outboundAllowedConnectionsV4: UInt,
    public var outboundBlockedConnectionsV4: UInt,
    public var inboundAllowedConnectionsV6: UInt,
    public var inboundBlockedConnectionsV6: UInt,
    public var outboundAllowedConnectionsV6: UInt,
    public var outboundBlockedConnectionsV6: UInt,
    public var inboundActiveConnectionsV4: UInt,
    public var outboundActiveConnectionsV4: UInt,
    public var inboundActiveConnectionsV6: UInt,
    public var outboundActiveConnectionsV6: UInt,
    public var reauthDirInbound: ULong,
    public var reauthDirOutbound: ULong,
    public var reauthFamilyV4: ULong,
    public var reauthFamilyV6: ULong,
    public var reauthProtoOther: ULong,
    public var reauthProtoIPv4: ULong,
    public var reauthProtoIPv6: ULong,
    public var reauthProtoICMP: ULong,
    public var reauthProtoICMP6: ULong,
    public var reauthProtoUDP: ULong,
    public var reauthProtoTCP: ULong,
    public var reauthReasonPolicyChange: ULong,
    public var reauthReasonNewArrivalInterface: ULong,
    public var reauthReasonNewNextHopInterface: ULong,
    public var reauthReasonProfileCrossing: ULong,
    public var reauthReasonClassifyCompletion: ULong,
    public var reauthReasonIPSecPropertiesChanged: ULong,
    public var reauthReasonMidStreamInspection: ULong,
    public var reauthReasonSocketPropertyChanged: ULong,
    public var reauthReasonNewInboundMCastBCastPacket: ULong,
    public var reauthReasonEDPPolicyChanged: ULong,
    public var reauthReasonProxyHandleChanged: ULong,
) {
    public var layerStatistics: MutPtr<FwpmLayerStatistics0> = layerStatisticsCtorArg
        internal set

    public constructor() : this(
        numLayerStatistics = 0u,
        layerStatisticsCtorArg = MutPtr(0L),
        inboundAllowedConnectionsV4 = 0u,
        inboundBlockedConnectionsV4 = 0u,
        outboundAllowedConnectionsV4 = 0u,
        outboundBlockedConnectionsV4 = 0u,
        inboundAllowedConnectionsV6 = 0u,
        inboundBlockedConnectionsV6 = 0u,
        outboundAllowedConnectionsV6 = 0u,
        outboundBlockedConnectionsV6 = 0u,
        inboundActiveConnectionsV4 = 0u,
        outboundActiveConnectionsV4 = 0u,
        inboundActiveConnectionsV6 = 0u,
        outboundActiveConnectionsV6 = 0u,
        reauthDirInbound = 0uL,
        reauthDirOutbound = 0uL,
        reauthFamilyV4 = 0uL,
        reauthFamilyV6 = 0uL,
        reauthProtoOther = 0uL,
        reauthProtoIPv4 = 0uL,
        reauthProtoIPv6 = 0uL,
        reauthProtoICMP = 0uL,
        reauthProtoICMP6 = 0uL,
        reauthProtoUDP = 0uL,
        reauthProtoTCP = 0uL,
        reauthReasonPolicyChange = 0uL,
        reauthReasonNewArrivalInterface = 0uL,
        reauthReasonNewNextHopInterface = 0uL,
        reauthReasonProfileCrossing = 0uL,
        reauthReasonClassifyCompletion = 0uL,
        reauthReasonIPSecPropertiesChanged = 0uL,
        reauthReasonMidStreamInspection = 0uL,
        reauthReasonSocketPropertyChanged = 0uL,
        reauthReasonNewInboundMCastBCastPacket = 0uL,
        reauthReasonEDPPolicyChanged = 0uL,
        reauthReasonProxyHandleChanged = 0uL,
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmStatistics0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmStatistics0> {
                override val sizeBytes: Long = 240L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmStatistics0 =
                    FwpmStatistics0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<FwpmLayerStatistics0>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 232L),
                    )
                override fun writeNative(addr: Long, value: FwpmStatistics0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numLayerStatistics)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<FwpmLayerStatistics0>(64)
                    ).writeNative(addr + 8L, value.layerStatistics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.inboundAllowedConnectionsV4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.inboundBlockedConnectionsV4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.outboundAllowedConnectionsV4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.outboundBlockedConnectionsV4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.inboundAllowedConnectionsV6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.inboundBlockedConnectionsV6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.outboundAllowedConnectionsV6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.outboundBlockedConnectionsV6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.inboundActiveConnectionsV4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.outboundActiveConnectionsV4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.inboundActiveConnectionsV6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.outboundActiveConnectionsV6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.reauthDirInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.reauthDirOutbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.reauthFamilyV4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.reauthFamilyV6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.reauthProtoOther)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.reauthProtoIPv4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.reauthProtoIPv6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.reauthProtoICMP)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.reauthProtoICMP6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.reauthProtoUDP)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.reauthProtoTCP)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.reauthReasonPolicyChange)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.reauthReasonNewArrivalInterface)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.reauthReasonNewNextHopInterface)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.reauthReasonProfileCrossing)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 184L, value.reauthReasonClassifyCompletion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 192L, value.reauthReasonIPSecPropertiesChanged)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 200L, value.reauthReasonMidStreamInspection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 208L, value.reauthReasonSocketPropertyChanged)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 216L, value.reauthReasonNewInboundMCastBCastPacket)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 224L, value.reauthReasonEDPPolicyChanged)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 232L, value.reauthReasonProxyHandleChanged)
                }
            }

        public operator fun invoke(
            numLayerStatistics: UInt = 0u,
            layerStatistics: MutPtr<FwpmLayerStatistics0> = MutPtr(0L),
            inboundAllowedConnectionsV4: UInt = 0u,
            inboundBlockedConnectionsV4: UInt = 0u,
            outboundAllowedConnectionsV4: UInt = 0u,
            outboundBlockedConnectionsV4: UInt = 0u,
            inboundAllowedConnectionsV6: UInt = 0u,
            inboundBlockedConnectionsV6: UInt = 0u,
            outboundAllowedConnectionsV6: UInt = 0u,
            outboundBlockedConnectionsV6: UInt = 0u,
            inboundActiveConnectionsV4: UInt = 0u,
            outboundActiveConnectionsV4: UInt = 0u,
            inboundActiveConnectionsV6: UInt = 0u,
            outboundActiveConnectionsV6: UInt = 0u,
            reauthDirInbound: ULong = 0uL,
            reauthDirOutbound: ULong = 0uL,
            reauthFamilyV4: ULong = 0uL,
            reauthFamilyV6: ULong = 0uL,
            reauthProtoOther: ULong = 0uL,
            reauthProtoIPv4: ULong = 0uL,
            reauthProtoIPv6: ULong = 0uL,
            reauthProtoICMP: ULong = 0uL,
            reauthProtoICMP6: ULong = 0uL,
            reauthProtoUDP: ULong = 0uL,
            reauthProtoTCP: ULong = 0uL,
            reauthReasonPolicyChange: ULong = 0uL,
            reauthReasonNewArrivalInterface: ULong = 0uL,
            reauthReasonNewNextHopInterface: ULong = 0uL,
            reauthReasonProfileCrossing: ULong = 0uL,
            reauthReasonClassifyCompletion: ULong = 0uL,
            reauthReasonIPSecPropertiesChanged: ULong = 0uL,
            reauthReasonMidStreamInspection: ULong = 0uL,
            reauthReasonSocketPropertyChanged: ULong = 0uL,
            reauthReasonNewInboundMCastBCastPacket: ULong = 0uL,
            reauthReasonEDPPolicyChanged: ULong = 0uL,
            reauthReasonProxyHandleChanged: ULong = 0uL,
        ): FwpmStatistics0 =
            FwpmStatistics0(
                numLayerStatistics = numLayerStatistics,
                layerStatisticsCtorArg = layerStatistics,
                inboundAllowedConnectionsV4 = inboundAllowedConnectionsV4,
                inboundBlockedConnectionsV4 = inboundBlockedConnectionsV4,
                outboundAllowedConnectionsV4 = outboundAllowedConnectionsV4,
                outboundBlockedConnectionsV4 = outboundBlockedConnectionsV4,
                inboundAllowedConnectionsV6 = inboundAllowedConnectionsV6,
                inboundBlockedConnectionsV6 = inboundBlockedConnectionsV6,
                outboundAllowedConnectionsV6 = outboundAllowedConnectionsV6,
                outboundBlockedConnectionsV6 = outboundBlockedConnectionsV6,
                inboundActiveConnectionsV4 = inboundActiveConnectionsV4,
                outboundActiveConnectionsV4 = outboundActiveConnectionsV4,
                inboundActiveConnectionsV6 = inboundActiveConnectionsV6,
                outboundActiveConnectionsV6 = outboundActiveConnectionsV6,
                reauthDirInbound = reauthDirInbound,
                reauthDirOutbound = reauthDirOutbound,
                reauthFamilyV4 = reauthFamilyV4,
                reauthFamilyV6 = reauthFamilyV6,
                reauthProtoOther = reauthProtoOther,
                reauthProtoIPv4 = reauthProtoIPv4,
                reauthProtoIPv6 = reauthProtoIPv6,
                reauthProtoICMP = reauthProtoICMP,
                reauthProtoICMP6 = reauthProtoICMP6,
                reauthProtoUDP = reauthProtoUDP,
                reauthProtoTCP = reauthProtoTCP,
                reauthReasonPolicyChange = reauthReasonPolicyChange,
                reauthReasonNewArrivalInterface = reauthReasonNewArrivalInterface,
                reauthReasonNewNextHopInterface = reauthReasonNewNextHopInterface,
                reauthReasonProfileCrossing = reauthReasonProfileCrossing,
                reauthReasonClassifyCompletion = reauthReasonClassifyCompletion,
                reauthReasonIPSecPropertiesChanged = reauthReasonIPSecPropertiesChanged,
                reauthReasonMidStreamInspection = reauthReasonMidStreamInspection,
                reauthReasonSocketPropertyChanged = reauthReasonSocketPropertyChanged,
                reauthReasonNewInboundMCastBCastPacket = reauthReasonNewInboundMCastBCastPacket,
                reauthReasonEDPPolicyChanged = reauthReasonEDPPolicyChanged,
                reauthReasonProxyHandleChanged = reauthReasonProxyHandleChanged,
            )
    }
}

public class FwpmSublayer0 internal constructor(
    public var subLayerKey: Guid,
    public var displayData: FwpmDisplayData0,
    public var flags: UInt,
    providerKeyCtorArg: MutPtr<Guid>,
    public var providerData: FwpByteBlob,
    public var weight: UShort,
) {
    public var providerKey: MutPtr<Guid> = providerKeyCtorArg
        internal set

    public constructor() : this(
        subLayerKey = Guid(),
        displayData = FwpmDisplayData0(),
        flags = 0u,
        providerKeyCtorArg = MutPtr(0L),
        providerData = FwpByteBlob(),
        weight = 0u,
    )

    public operator fun component1(): Guid = this.subLayerKey

    public operator fun component2(): FwpmDisplayData0 = this.displayData

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): MutPtr<Guid> = this.providerKey

    public operator fun component5(): FwpByteBlob = this.providerData

    public operator fun component6(): UShort = this.weight

    public fun copy(subLayerKey: Guid = this.subLayerKey, displayData: FwpmDisplayData0 = this.displayData, flags: UInt = this.flags, providerKey: MutPtr<Guid> = this.providerKey, providerData: FwpByteBlob = this.providerData, weight: UShort = this.weight): FwpmSublayer0 = FwpmSublayer0(subLayerKey = subLayerKey, displayData = displayData, flags = flags, providerKeyCtorArg = providerKey, providerData = providerData, weight = weight)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmSublayer0) return false
        if (this.subLayerKey != other.subLayerKey) return false
        if (this.displayData != other.displayData) return false
        if (this.flags != other.flags) return false
        if (this.providerKey != other.providerKey) return false
        if (this.providerData != other.providerData) return false
        if (this.weight != other.weight) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.subLayerKey.hashCode()
        result = 31 * result + this.displayData.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.providerKey.hashCode()
        result = 31 * result + this.providerData.hashCode()
        result = 31 * result + this.weight.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            subLayerKey: Guid = Guid(),
            displayData: FwpmDisplayData0 = FwpmDisplayData0(),
            flags: UInt = 0u,
            providerKey: MutPtr<Guid> = MutPtr(0L),
            providerData: FwpByteBlob = FwpByteBlob(),
            weight: UShort = 0u,
        ): FwpmSublayer0 =
            FwpmSublayer0(
                subLayerKey = subLayerKey,
                displayData = displayData,
                flags = flags,
                providerKeyCtorArg = providerKey,
                providerData = providerData,
                weight = weight,
            )
    }
}

public data class FwpmSublayerChange0(
    public var changeType: FwpmChangeType = 0,
    public var subLayerKey: Guid = Guid(),
)

public class FwpmSublayerEnumTemplate0 internal constructor(
    providerKeyCtorArg: MutPtr<Guid>,
) {
    public var providerKey: MutPtr<Guid> = providerKeyCtorArg
        internal set

    public constructor() : this(
        providerKeyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Guid> = this.providerKey

    public fun copy(providerKey: MutPtr<Guid> = this.providerKey): FwpmSublayerEnumTemplate0 = FwpmSublayerEnumTemplate0(providerKeyCtorArg = providerKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmSublayerEnumTemplate0) return false
        if (this.providerKey != other.providerKey) return false
        return true
    }

    override fun hashCode(): Int = this.providerKey.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmSublayerEnumTemplate0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmSublayerEnumTemplate0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmSublayerEnumTemplate0 =
                    FwpmSublayerEnumTemplate0(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FwpmSublayerEnumTemplate0) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr, value.providerKey)
                }
            }

        public operator fun invoke(
            providerKey: MutPtr<Guid> = MutPtr(0L),
        ): FwpmSublayerEnumTemplate0 =
            FwpmSublayerEnumTemplate0(
                providerKeyCtorArg = providerKey,
            )
    }
}

public class FwpmSublayerSubscription0 internal constructor(
    enumTemplateCtorArg: MutPtr<FwpmSublayerEnumTemplate0>,
    public var flags: FwpmSubscriptionFlags,
    public var sessionKey: Guid,
) {
    public var enumTemplate: MutPtr<FwpmSublayerEnumTemplate0> = enumTemplateCtorArg
        internal set

    public constructor() : this(
        enumTemplateCtorArg = MutPtr(0L),
        flags = 0u,
        sessionKey = Guid(),
    )

    public operator fun component1(): MutPtr<FwpmSublayerEnumTemplate0> = this.enumTemplate

    public operator fun component2(): FwpmSubscriptionFlags = this.flags

    public operator fun component3(): Guid = this.sessionKey

    public fun copy(enumTemplate: MutPtr<FwpmSublayerEnumTemplate0> = this.enumTemplate, flags: FwpmSubscriptionFlags = this.flags, sessionKey: Guid = this.sessionKey): FwpmSublayerSubscription0 = FwpmSublayerSubscription0(enumTemplateCtorArg = enumTemplate, flags = flags, sessionKey = sessionKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmSublayerSubscription0) return false
        if (this.enumTemplate != other.enumTemplate) return false
        if (this.flags != other.flags) return false
        if (this.sessionKey != other.sessionKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enumTemplate.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.sessionKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            enumTemplate: MutPtr<FwpmSublayerEnumTemplate0> = MutPtr(0L),
            flags: FwpmSubscriptionFlags = 0u,
            sessionKey: Guid = Guid(),
        ): FwpmSublayerSubscription0 =
            FwpmSublayerSubscription0(
                enumTemplateCtorArg = enumTemplate,
                flags = flags,
                sessionKey = sessionKey,
            )
    }
}

public class FwpmSystemPorts0 internal constructor(
    public var numTypes: UInt,
    typesCtorArg: MutPtr<FwpmSystemPortsByType0>,
) {
    public var types: MutPtr<FwpmSystemPortsByType0> = typesCtorArg
        internal set

    public constructor() : this(
        numTypes = 0u,
        typesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numTypes

    public operator fun component2(): MutPtr<FwpmSystemPortsByType0> = this.types

    public fun copy(numTypes: UInt = this.numTypes, types: MutPtr<FwpmSystemPortsByType0> = this.types): FwpmSystemPorts0 = FwpmSystemPorts0(numTypes = numTypes, typesCtorArg = types)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmSystemPorts0) return false
        if (this.numTypes != other.numTypes) return false
        if (this.types != other.types) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numTypes.hashCode()
        result = 31 * result + this.types.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmSystemPorts0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmSystemPorts0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmSystemPorts0 =
                    FwpmSystemPorts0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<FwpmSystemPortsByType0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FwpmSystemPorts0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numTypes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<FwpmSystemPortsByType0>(64)
                    ).writeNative(addr + 8L, value.types)
                }
            }

        public operator fun invoke(
            numTypes: UInt = 0u,
            types: MutPtr<FwpmSystemPortsByType0> = MutPtr(0L),
        ): FwpmSystemPorts0 =
            FwpmSystemPorts0(
                numTypes = numTypes,
                typesCtorArg = types,
            )
    }
}

public class FwpmSystemPortsByType0 internal constructor(
    public var type: FwpmSystemPortType,
    public var numPorts: UInt,
    portsCtorArg: MutPtr<UShort>,
) {
    public var ports: MutPtr<UShort> = portsCtorArg
        internal set

    public constructor() : this(
        type = 0,
        numPorts = 0u,
        portsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): FwpmSystemPortType = this.type

    public operator fun component2(): UInt = this.numPorts

    public operator fun component3(): MutPtr<UShort> = this.ports

    public fun copy(type: FwpmSystemPortType = this.type, numPorts: UInt = this.numPorts, ports: MutPtr<UShort> = this.ports): FwpmSystemPortsByType0 = FwpmSystemPortsByType0(type = type, numPorts = numPorts, portsCtorArg = ports)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmSystemPortsByType0) return false
        if (this.type != other.type) return false
        if (this.numPorts != other.numPorts) return false
        if (this.ports != other.ports) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.numPorts.hashCode()
        result = 31 * result + this.ports.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmSystemPortsByType0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmSystemPortsByType0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmSystemPortsByType0 =
                    FwpmSystemPortsByType0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FwpmSystemPortsByType0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numPorts)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.ports)
                }
            }

        public operator fun invoke(
            type: FwpmSystemPortType = 0,
            numPorts: UInt = 0u,
            ports: MutPtr<UShort> = MutPtr(0L),
        ): FwpmSystemPortsByType0 =
            FwpmSystemPortsByType0(
                type = type,
                numPorts = numPorts,
                portsCtorArg = ports,
            )
    }
}

public class FwpmVswitchEvent0 internal constructor(
    public var eventType: FwpmVswitchEventType,
    vSwitchIdCtorArg: Pwstr,
    public var anonymous: FwpmVswitchEvent00,
) {
    public var vSwitchId: Pwstr = vSwitchIdCtorArg
        internal set

    public constructor() : this(
        eventType = 0,
        vSwitchIdCtorArg = MutPtr(0L),
        anonymous = FwpmVswitchEvent00(),
    )

    public operator fun component1(): FwpmVswitchEventType = this.eventType

    public operator fun component2(): Pwstr = this.vSwitchId

    public operator fun component3(): FwpmVswitchEvent00 = this.anonymous

    public fun copy(eventType: FwpmVswitchEventType = this.eventType, vSwitchId: Pwstr = this.vSwitchId, anonymous: FwpmVswitchEvent00 = this.anonymous): FwpmVswitchEvent0 = FwpmVswitchEvent0(eventType = eventType, vSwitchIdCtorArg = vSwitchId, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmVswitchEvent0) return false
        if (this.eventType != other.eventType) return false
        if (this.vSwitchId != other.vSwitchId) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventType.hashCode()
        result = 31 * result + this.vSwitchId.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            eventType: FwpmVswitchEventType = 0,
            vSwitchId: Pwstr = MutPtr(0L),
            anonymous: FwpmVswitchEvent00 = FwpmVswitchEvent00(),
        ): FwpmVswitchEvent0 =
            FwpmVswitchEvent0(
                eventType = eventType,
                vSwitchIdCtorArg = vSwitchId,
                anonymous = anonymous,
            )
    }
}

public data class FwpmVswitchEvent00(
    public var positionInfo: FwpmVswitchEvent000 = FwpmVswitchEvent000(),
    public var reorderInfo: FwpmVswitchEvent001 = FwpmVswitchEvent001(),
)

public class FwpmVswitchEvent000 internal constructor(
    public var numvSwitchFilterExtensions: UInt,
    vSwitchFilterExtensionsCtorArg: MutPtr<Pwstr>,
) {
    public var vSwitchFilterExtensions: MutPtr<Pwstr> = vSwitchFilterExtensionsCtorArg
        internal set

    public constructor() : this(
        numvSwitchFilterExtensions = 0u,
        vSwitchFilterExtensionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numvSwitchFilterExtensions

    public operator fun component2(): MutPtr<Pwstr> = this.vSwitchFilterExtensions

    public fun copy(numvSwitchFilterExtensions: UInt = this.numvSwitchFilterExtensions, vSwitchFilterExtensions: MutPtr<Pwstr> = this.vSwitchFilterExtensions): FwpmVswitchEvent000 = FwpmVswitchEvent000(numvSwitchFilterExtensions = numvSwitchFilterExtensions, vSwitchFilterExtensionsCtorArg = vSwitchFilterExtensions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmVswitchEvent000) return false
        if (this.numvSwitchFilterExtensions != other.numvSwitchFilterExtensions) return false
        if (this.vSwitchFilterExtensions != other.vSwitchFilterExtensions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numvSwitchFilterExtensions.hashCode()
        result = 31 * result + this.vSwitchFilterExtensions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmVswitchEvent000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpmVswitchEvent000> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpmVswitchEvent000 =
                    FwpmVswitchEvent000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Pwstr>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FwpmVswitchEvent000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numvSwitchFilterExtensions)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Pwstr>(64)
                    ).writeNative(addr + 8L, value.vSwitchFilterExtensions)
                }
            }

        public operator fun invoke(
            numvSwitchFilterExtensions: UInt = 0u,
            vSwitchFilterExtensions: MutPtr<Pwstr> = MutPtr(0L),
        ): FwpmVswitchEvent000 =
            FwpmVswitchEvent000(
                numvSwitchFilterExtensions = numvSwitchFilterExtensions,
                vSwitchFilterExtensionsCtorArg = vSwitchFilterExtensions,
            )
    }
}

public class FwpmVswitchEvent001 internal constructor(
    public var inRequiredPosition: Bool,
    public var numvSwitchFilterExtensions: UInt,
    vSwitchFilterExtensionsCtorArg: MutPtr<Pwstr>,
) {
    public var vSwitchFilterExtensions: MutPtr<Pwstr> = vSwitchFilterExtensionsCtorArg
        internal set

    public constructor() : this(
        inRequiredPosition = 0,
        numvSwitchFilterExtensions = 0u,
        vSwitchFilterExtensionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Bool = this.inRequiredPosition

    public operator fun component2(): UInt = this.numvSwitchFilterExtensions

    public operator fun component3(): MutPtr<Pwstr> = this.vSwitchFilterExtensions

    public fun copy(inRequiredPosition: Bool = this.inRequiredPosition, numvSwitchFilterExtensions: UInt = this.numvSwitchFilterExtensions, vSwitchFilterExtensions: MutPtr<Pwstr> = this.vSwitchFilterExtensions): FwpmVswitchEvent001 = FwpmVswitchEvent001(inRequiredPosition = inRequiredPosition, numvSwitchFilterExtensions = numvSwitchFilterExtensions, vSwitchFilterExtensionsCtorArg = vSwitchFilterExtensions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpmVswitchEvent001) return false
        if (this.inRequiredPosition != other.inRequiredPosition) return false
        if (this.numvSwitchFilterExtensions != other.numvSwitchFilterExtensions) return false
        if (this.vSwitchFilterExtensions != other.vSwitchFilterExtensions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inRequiredPosition.hashCode()
        result = 31 * result + this.numvSwitchFilterExtensions.hashCode()
        result = 31 * result + this.vSwitchFilterExtensions.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            inRequiredPosition: Bool = 0,
            numvSwitchFilterExtensions: UInt = 0u,
            vSwitchFilterExtensions: MutPtr<Pwstr> = MutPtr(0L),
        ): FwpmVswitchEvent001 =
            FwpmVswitchEvent001(
                inRequiredPosition = inRequiredPosition,
                numvSwitchFilterExtensions = numvSwitchFilterExtensions,
                vSwitchFilterExtensionsCtorArg = vSwitchFilterExtensions,
            )
    }
}

public data class FwpmVswitchEventSubscription0(
    public var flags: UInt = 0u,
    public var sessionKey: Guid = Guid(),
)

public data class FwpByteArray16(
    public var byteArray16: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpByteArray16) return false
        if (!this.byteArray16.contentEquals(other.byteArray16)) return false
        return true
    }

    override fun hashCode(): Int = this.byteArray16.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpByteArray16> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpByteArray16> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): FwpByteArray16 =
                    FwpByteArray16(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FwpByteArray16) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.byteArray16)
                }
            }
    }
}

public data class FwpByteArray6(
    public var byteArray6: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpByteArray6) return false
        if (!this.byteArray6.contentEquals(other.byteArray6)) return false
        return true
    }

    override fun hashCode(): Int = this.byteArray6.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpByteArray6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpByteArray6> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): FwpByteArray6 =
                    FwpByteArray6(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FwpByteArray6) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr, value.byteArray6)
                }
            }
    }
}

public class FwpByteBlob internal constructor(
    public var size: UInt,
    dataCtorArg: MutPtr<UByte>,
) {
    public var data: MutPtr<UByte> = dataCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        dataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): MutPtr<UByte> = this.data

    public fun copy(size: UInt = this.size, data: MutPtr<UByte> = this.data): FwpByteBlob = FwpByteBlob(size = size, dataCtorArg = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpByteBlob) return false
        if (this.size != other.size) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpByteBlob> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpByteBlob> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpByteBlob =
                    FwpByteBlob(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FwpByteBlob) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.data)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            data: MutPtr<UByte> = MutPtr(0L),
        ): FwpByteBlob =
            FwpByteBlob(
                size = size,
                dataCtorArg = data,
            )
    }
}

public data class FwpConditionValue0(
    public var type: FwpDataType = 0,
    public var anonymous: FwpConditionValue00 = FwpConditionValue00(),
)

public class FwpConditionValue00 internal constructor(
    public var uint8: UByte,
    public var uint16: UShort,
    public var uint32: UInt,
    uint64CtorArg: MutPtr<ULong>,
    public var int8: Byte,
    public var int16: Short,
    public var int32: Int,
    int64CtorArg: MutPtr<Long>,
    public var float32: Float,
    double64CtorArg: MutPtr<Double>,
    byteArray16CtorArg: MutPtr<FwpByteArray16>,
    byteBlobCtorArg: MutPtr<FwpByteBlob>,
    sidCtorArg: MutPtr<Sid>,
    sdCtorArg: MutPtr<FwpByteBlob>,
    tokenInformationCtorArg: MutPtr<FwpTokenInformation>,
    tokenAccessInformationCtorArg: MutPtr<FwpByteBlob>,
    unicodeStringCtorArg: Pwstr,
    byteArray6CtorArg: MutPtr<FwpByteArray6>,
    v4AddrMaskCtorArg: MutPtr<FwpV4AddrAndMask>,
    v6AddrMaskCtorArg: MutPtr<FwpV6AddrAndMask>,
    rangeValueCtorArg: MutPtr<FwpRange0>,
) {
    public var uint64: MutPtr<ULong> = uint64CtorArg
        internal set

    public var int64: MutPtr<Long> = int64CtorArg
        internal set

    public var double64: MutPtr<Double> = double64CtorArg
        internal set

    public var byteArray16: MutPtr<FwpByteArray16> = byteArray16CtorArg
        internal set

    public var byteBlob: MutPtr<FwpByteBlob> = byteBlobCtorArg
        internal set

    public var sid: MutPtr<Sid> = sidCtorArg
        internal set

    public var sd: MutPtr<FwpByteBlob> = sdCtorArg
        internal set

    public var tokenInformation: MutPtr<FwpTokenInformation> = tokenInformationCtorArg
        internal set

    public var tokenAccessInformation: MutPtr<FwpByteBlob> = tokenAccessInformationCtorArg
        internal set

    public var unicodeString: Pwstr = unicodeStringCtorArg
        internal set

    public var byteArray6: MutPtr<FwpByteArray6> = byteArray6CtorArg
        internal set

    public var v4AddrMask: MutPtr<FwpV4AddrAndMask> = v4AddrMaskCtorArg
        internal set

    public var v6AddrMask: MutPtr<FwpV6AddrAndMask> = v6AddrMaskCtorArg
        internal set

    public var rangeValue: MutPtr<FwpRange0> = rangeValueCtorArg
        internal set

    public constructor() : this(
        uint8 = 0u,
        uint16 = 0u,
        uint32 = 0u,
        uint64CtorArg = MutPtr(0L),
        int8 = 0,
        int16 = 0,
        int32 = 0,
        int64CtorArg = MutPtr(0L),
        float32 = 0.0f,
        double64CtorArg = MutPtr(0L),
        byteArray16CtorArg = MutPtr(0L),
        byteBlobCtorArg = MutPtr(0L),
        sidCtorArg = MutPtr(0L),
        sdCtorArg = MutPtr(0L),
        tokenInformationCtorArg = MutPtr(0L),
        tokenAccessInformationCtorArg = MutPtr(0L),
        unicodeStringCtorArg = MutPtr(0L),
        byteArray6CtorArg = MutPtr(0L),
        v4AddrMaskCtorArg = MutPtr(0L),
        v6AddrMaskCtorArg = MutPtr(0L),
        rangeValueCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            uint8: UByte = 0u,
            uint16: UShort = 0u,
            uint32: UInt = 0u,
            uint64: MutPtr<ULong> = MutPtr(0L),
            int8: Byte = 0,
            int16: Short = 0,
            int32: Int = 0,
            int64: MutPtr<Long> = MutPtr(0L),
            float32: Float = 0.0f,
            double64: MutPtr<Double> = MutPtr(0L),
            byteArray16: MutPtr<FwpByteArray16> = MutPtr(0L),
            byteBlob: MutPtr<FwpByteBlob> = MutPtr(0L),
            sid: MutPtr<Sid> = MutPtr(0L),
            sd: MutPtr<FwpByteBlob> = MutPtr(0L),
            tokenInformation: MutPtr<FwpTokenInformation> = MutPtr(0L),
            tokenAccessInformation: MutPtr<FwpByteBlob> = MutPtr(0L),
            unicodeString: Pwstr = MutPtr(0L),
            byteArray6: MutPtr<FwpByteArray6> = MutPtr(0L),
            v4AddrMask: MutPtr<FwpV4AddrAndMask> = MutPtr(0L),
            v6AddrMask: MutPtr<FwpV6AddrAndMask> = MutPtr(0L),
            rangeValue: MutPtr<FwpRange0> = MutPtr(0L),
        ): FwpConditionValue00 =
            FwpConditionValue00(
                uint8 = uint8,
                uint16 = uint16,
                uint32 = uint32,
                uint64CtorArg = uint64,
                int8 = int8,
                int16 = int16,
                int32 = int32,
                int64CtorArg = int64,
                float32 = float32,
                double64CtorArg = double64,
                byteArray16CtorArg = byteArray16,
                byteBlobCtorArg = byteBlob,
                sidCtorArg = sid,
                sdCtorArg = sd,
                tokenInformationCtorArg = tokenInformation,
                tokenAccessInformationCtorArg = tokenAccessInformation,
                unicodeStringCtorArg = unicodeString,
                byteArray6CtorArg = byteArray6,
                v4AddrMaskCtorArg = v4AddrMask,
                v6AddrMaskCtorArg = v6AddrMask,
                rangeValueCtorArg = rangeValue,
            )
    }
}

public data class FwpRange0(
    public var valueLow: FwpValue0 = FwpValue0(),
    public var valueHigh: FwpValue0 = FwpValue0(),
)

public class FwpTokenInformation internal constructor(
    public var sidCount: UInt,
    sidsCtorArg: MutPtr<SidAndAttributes>,
    public var restrictedSidCount: UInt,
    restrictedSidsCtorArg: MutPtr<SidAndAttributes>,
) {
    public var sids: MutPtr<SidAndAttributes> = sidsCtorArg
        internal set

    public var restrictedSids: MutPtr<SidAndAttributes> = restrictedSidsCtorArg
        internal set

    public constructor() : this(
        sidCount = 0u,
        sidsCtorArg = MutPtr(0L),
        restrictedSidCount = 0u,
        restrictedSidsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sidCount

    public operator fun component2(): MutPtr<SidAndAttributes> = this.sids

    public operator fun component3(): UInt = this.restrictedSidCount

    public operator fun component4(): MutPtr<SidAndAttributes> = this.restrictedSids

    public fun copy(sidCount: UInt = this.sidCount, sids: MutPtr<SidAndAttributes> = this.sids, restrictedSidCount: UInt = this.restrictedSidCount, restrictedSids: MutPtr<SidAndAttributes> = this.restrictedSids): FwpTokenInformation = FwpTokenInformation(sidCount = sidCount, sidsCtorArg = sids, restrictedSidCount = restrictedSidCount, restrictedSidsCtorArg = restrictedSids)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpTokenInformation) return false
        if (this.sidCount != other.sidCount) return false
        if (this.sids != other.sids) return false
        if (this.restrictedSidCount != other.restrictedSidCount) return false
        if (this.restrictedSids != other.restrictedSids) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sidCount.hashCode()
        result = 31 * result + this.sids.hashCode()
        result = 31 * result + this.restrictedSidCount.hashCode()
        result = 31 * result + this.restrictedSids.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpTokenInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpTokenInformation> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FwpTokenInformation =
                    FwpTokenInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SidAndAttributes>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SidAndAttributes>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: FwpTokenInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sidCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SidAndAttributes>(64)
                    ).writeNative(addr + 8L, value.sids)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.restrictedSidCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SidAndAttributes>(64)
                    ).writeNative(addr + 24L, value.restrictedSids)
                }
            }

        public operator fun invoke(
            sidCount: UInt = 0u,
            sids: MutPtr<SidAndAttributes> = MutPtr(0L),
            restrictedSidCount: UInt = 0u,
            restrictedSids: MutPtr<SidAndAttributes> = MutPtr(0L),
        ): FwpTokenInformation =
            FwpTokenInformation(
                sidCount = sidCount,
                sidsCtorArg = sids,
                restrictedSidCount = restrictedSidCount,
                restrictedSidsCtorArg = restrictedSids,
            )
    }
}

public data class FwpV4AddrAndMask(
    public var addr: UInt = 0u,
    public var mask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpV4AddrAndMask> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpV4AddrAndMask> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FwpV4AddrAndMask =
                    FwpV4AddrAndMask(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FwpV4AddrAndMask) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.addr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                }
            }
    }
}

public data class FwpV6AddrAndMask(
    public var addr: UByteArray = UByteArray(16),
    public var prefixLength: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FwpV6AddrAndMask) return false
        if (!this.addr.contentEquals(other.addr)) return false
        if (this.prefixLength != other.prefixLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addr.contentHashCode()
        result = 31 * result + this.prefixLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpV6AddrAndMask> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FwpV6AddrAndMask> {
                override val sizeBytes: Long = 17L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): FwpV6AddrAndMask =
                    FwpV6AddrAndMask(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FwpV6AddrAndMask) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.addr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.prefixLength)
                }
            }
    }
}

public data class FwpValue0(
    public var type: FwpDataType = 0,
    public var anonymous: FwpValue00 = FwpValue00(),
)

public class FwpValue00 internal constructor(
    public var uint8: UByte,
    public var uint16: UShort,
    public var uint32: UInt,
    uint64CtorArg: MutPtr<ULong>,
    public var int8: Byte,
    public var int16: Short,
    public var int32: Int,
    int64CtorArg: MutPtr<Long>,
    public var float32: Float,
    double64CtorArg: MutPtr<Double>,
    byteArray16CtorArg: MutPtr<FwpByteArray16>,
    byteBlobCtorArg: MutPtr<FwpByteBlob>,
    sidCtorArg: MutPtr<Sid>,
    sdCtorArg: MutPtr<FwpByteBlob>,
    tokenInformationCtorArg: MutPtr<FwpTokenInformation>,
    tokenAccessInformationCtorArg: MutPtr<FwpByteBlob>,
    unicodeStringCtorArg: Pwstr,
    byteArray6CtorArg: MutPtr<FwpByteArray6>,
) {
    public var uint64: MutPtr<ULong> = uint64CtorArg
        internal set

    public var int64: MutPtr<Long> = int64CtorArg
        internal set

    public var double64: MutPtr<Double> = double64CtorArg
        internal set

    public var byteArray16: MutPtr<FwpByteArray16> = byteArray16CtorArg
        internal set

    public var byteBlob: MutPtr<FwpByteBlob> = byteBlobCtorArg
        internal set

    public var sid: MutPtr<Sid> = sidCtorArg
        internal set

    public var sd: MutPtr<FwpByteBlob> = sdCtorArg
        internal set

    public var tokenInformation: MutPtr<FwpTokenInformation> = tokenInformationCtorArg
        internal set

    public var tokenAccessInformation: MutPtr<FwpByteBlob> = tokenAccessInformationCtorArg
        internal set

    public var unicodeString: Pwstr = unicodeStringCtorArg
        internal set

    public var byteArray6: MutPtr<FwpByteArray6> = byteArray6CtorArg
        internal set

    public constructor() : this(
        uint8 = 0u,
        uint16 = 0u,
        uint32 = 0u,
        uint64CtorArg = MutPtr(0L),
        int8 = 0,
        int16 = 0,
        int32 = 0,
        int64CtorArg = MutPtr(0L),
        float32 = 0.0f,
        double64CtorArg = MutPtr(0L),
        byteArray16CtorArg = MutPtr(0L),
        byteBlobCtorArg = MutPtr(0L),
        sidCtorArg = MutPtr(0L),
        sdCtorArg = MutPtr(0L),
        tokenInformationCtorArg = MutPtr(0L),
        tokenAccessInformationCtorArg = MutPtr(0L),
        unicodeStringCtorArg = MutPtr(0L),
        byteArray6CtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            uint8: UByte = 0u,
            uint16: UShort = 0u,
            uint32: UInt = 0u,
            uint64: MutPtr<ULong> = MutPtr(0L),
            int8: Byte = 0,
            int16: Short = 0,
            int32: Int = 0,
            int64: MutPtr<Long> = MutPtr(0L),
            float32: Float = 0.0f,
            double64: MutPtr<Double> = MutPtr(0L),
            byteArray16: MutPtr<FwpByteArray16> = MutPtr(0L),
            byteBlob: MutPtr<FwpByteBlob> = MutPtr(0L),
            sid: MutPtr<Sid> = MutPtr(0L),
            sd: MutPtr<FwpByteBlob> = MutPtr(0L),
            tokenInformation: MutPtr<FwpTokenInformation> = MutPtr(0L),
            tokenAccessInformation: MutPtr<FwpByteBlob> = MutPtr(0L),
            unicodeString: Pwstr = MutPtr(0L),
            byteArray6: MutPtr<FwpByteArray6> = MutPtr(0L),
        ): FwpValue00 =
            FwpValue00(
                uint8 = uint8,
                uint16 = uint16,
                uint32 = uint32,
                uint64CtorArg = uint64,
                int8 = int8,
                int16 = int16,
                int32 = int32,
                int64CtorArg = int64,
                float32 = float32,
                double64CtorArg = double64,
                byteArray16CtorArg = byteArray16,
                byteBlobCtorArg = byteBlob,
                sidCtorArg = sid,
                sdCtorArg = sd,
                tokenInformationCtorArg = tokenInformation,
                tokenAccessInformationCtorArg = tokenAccessInformation,
                unicodeStringCtorArg = unicodeString,
                byteArray6CtorArg = byteArray6,
            )
    }
}

public data class IkeextAuthenticationMethod0(
    public var authenticationMethodType: IkeextAuthenticationMethodType = 0,
    public var anonymous: IkeextAuthenticationMethod00 = IkeextAuthenticationMethod00(),
)

public data class IkeextAuthenticationMethod00(
    public var presharedKeyAuthentication: IkeextPresharedKeyAuthentication0 = IkeextPresharedKeyAuthentication0(),
    public var certificateAuthentication: IkeextCertificateAuthentication0 = IkeextCertificateAuthentication0(),
    public var kerberosAuthentication: IkeextKerberosAuthentication0 = IkeextKerberosAuthentication0(),
    public var ntlmV2Authentication: IkeextNtlmV2Authentication0 = IkeextNtlmV2Authentication0(),
    public var sslAuthentication: IkeextCertificateAuthentication0 = IkeextCertificateAuthentication0(),
    public var cgaAuthentication: IkeextIpv6CgaAuthentication0 = IkeextIpv6CgaAuthentication0(),
)

public data class IkeextAuthenticationMethod1(
    public var authenticationMethodType: IkeextAuthenticationMethodType = 0,
    public var anonymous: IkeextAuthenticationMethod10 = IkeextAuthenticationMethod10(),
)

public data class IkeextAuthenticationMethod10(
    public var presharedKeyAuthentication: IkeextPresharedKeyAuthentication1 = IkeextPresharedKeyAuthentication1(),
    public var certificateAuthentication: IkeextCertificateAuthentication1 = IkeextCertificateAuthentication1(),
    public var kerberosAuthentication: IkeextKerberosAuthentication0 = IkeextKerberosAuthentication0(),
    public var ntlmV2Authentication: IkeextNtlmV2Authentication0 = IkeextNtlmV2Authentication0(),
    public var sslAuthentication: IkeextCertificateAuthentication1 = IkeextCertificateAuthentication1(),
    public var cgaAuthentication: IkeextIpv6CgaAuthentication0 = IkeextIpv6CgaAuthentication0(),
    public var eapAuthentication: IkeextEapAuthentication0 = IkeextEapAuthentication0(),
)

public data class IkeextAuthenticationMethod2(
    public var authenticationMethodType: IkeextAuthenticationMethodType = 0,
    public var anonymous: IkeextAuthenticationMethod20 = IkeextAuthenticationMethod20(),
)

public data class IkeextAuthenticationMethod20(
    public var presharedKeyAuthentication: IkeextPresharedKeyAuthentication1 = IkeextPresharedKeyAuthentication1(),
    public var certificateAuthentication: IkeextCertificateAuthentication2 = IkeextCertificateAuthentication2(),
    public var kerberosAuthentication: IkeextKerberosAuthentication1 = IkeextKerberosAuthentication1(),
    public var reservedAuthentication: IkeextReservedAuthentication0 = IkeextReservedAuthentication0(),
    public var ntlmV2Authentication: IkeextNtlmV2Authentication0 = IkeextNtlmV2Authentication0(),
    public var sslAuthentication: IkeextCertificateAuthentication2 = IkeextCertificateAuthentication2(),
    public var cgaAuthentication: IkeextIpv6CgaAuthentication0 = IkeextIpv6CgaAuthentication0(),
    public var eapAuthentication: IkeextEapAuthentication0 = IkeextEapAuthentication0(),
)

public data class IkeextCertificateAuthentication0(
    public var inboundConfigType: IkeextCertConfigType = 0,
    public var anonymous1: IkeextCertificateAuthentication00 = IkeextCertificateAuthentication00(),
    public var outboundConfigType: IkeextCertConfigType = 0,
    public var anonymous2: IkeextCertificateAuthentication01 = IkeextCertificateAuthentication01(),
    public var flags: IkeextCertAuth = 0u,
)

public class IkeextCertificateAuthentication00 internal constructor(
    public var anonymous: IkeextCertificateAuthentication000,
    inboundEnterpriseStoreConfigCtorArg: MutPtr<IkeextCertRootConfig0>,
    inboundTrustedRootStoreConfigCtorArg: MutPtr<IkeextCertRootConfig0>,
) {
    public var inboundEnterpriseStoreConfig: MutPtr<IkeextCertRootConfig0> = inboundEnterpriseStoreConfigCtorArg
        internal set

    public var inboundTrustedRootStoreConfig: MutPtr<IkeextCertRootConfig0> = inboundTrustedRootStoreConfigCtorArg
        internal set

    public constructor() : this(
        anonymous = IkeextCertificateAuthentication000(),
        inboundEnterpriseStoreConfigCtorArg = MutPtr(0L),
        inboundTrustedRootStoreConfigCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IkeextCertificateAuthentication000 = this.anonymous

    public operator fun component2(): MutPtr<IkeextCertRootConfig0> = this.inboundEnterpriseStoreConfig

    public operator fun component3(): MutPtr<IkeextCertRootConfig0> = this.inboundTrustedRootStoreConfig

    public fun copy(anonymous: IkeextCertificateAuthentication000 = this.anonymous, inboundEnterpriseStoreConfig: MutPtr<IkeextCertRootConfig0> = this.inboundEnterpriseStoreConfig, inboundTrustedRootStoreConfig: MutPtr<IkeextCertRootConfig0> = this.inboundTrustedRootStoreConfig): IkeextCertificateAuthentication00 = IkeextCertificateAuthentication00(anonymous = anonymous, inboundEnterpriseStoreConfigCtorArg = inboundEnterpriseStoreConfig, inboundTrustedRootStoreConfigCtorArg = inboundTrustedRootStoreConfig)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertificateAuthentication00) return false
        if (this.anonymous != other.anonymous) return false
        if (this.inboundEnterpriseStoreConfig != other.inboundEnterpriseStoreConfig) return false
        if (this.inboundTrustedRootStoreConfig != other.inboundTrustedRootStoreConfig) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.inboundEnterpriseStoreConfig.hashCode()
        result = 31 * result + this.inboundTrustedRootStoreConfig.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: IkeextCertificateAuthentication000 = IkeextCertificateAuthentication000(),
            inboundEnterpriseStoreConfig: MutPtr<IkeextCertRootConfig0> = MutPtr(0L),
            inboundTrustedRootStoreConfig: MutPtr<IkeextCertRootConfig0> = MutPtr(0L),
        ): IkeextCertificateAuthentication00 =
            IkeextCertificateAuthentication00(
                anonymous = anonymous,
                inboundEnterpriseStoreConfigCtorArg = inboundEnterpriseStoreConfig,
                inboundTrustedRootStoreConfigCtorArg = inboundTrustedRootStoreConfig,
            )
    }
}

public class IkeextCertificateAuthentication000 internal constructor(
    public var inboundRootArraySize: UInt,
    inboundRootArrayCtorArg: MutPtr<IkeextCertRootConfig0>,
) {
    public var inboundRootArray: MutPtr<IkeextCertRootConfig0> = inboundRootArrayCtorArg
        internal set

    public constructor() : this(
        inboundRootArraySize = 0u,
        inboundRootArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.inboundRootArraySize

    public operator fun component2(): MutPtr<IkeextCertRootConfig0> = this.inboundRootArray

    public fun copy(inboundRootArraySize: UInt = this.inboundRootArraySize, inboundRootArray: MutPtr<IkeextCertRootConfig0> = this.inboundRootArray): IkeextCertificateAuthentication000 = IkeextCertificateAuthentication000(inboundRootArraySize = inboundRootArraySize, inboundRootArrayCtorArg = inboundRootArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertificateAuthentication000) return false
        if (this.inboundRootArraySize != other.inboundRootArraySize) return false
        if (this.inboundRootArray != other.inboundRootArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inboundRootArraySize.hashCode()
        result = 31 * result + this.inboundRootArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication000> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCertificateAuthentication000 =
                    IkeextCertificateAuthentication000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextCertRootConfig0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCertificateAuthentication000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.inboundRootArraySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextCertRootConfig0>(64)
                    ).writeNative(addr + 8L, value.inboundRootArray)
                }
            }

        public operator fun invoke(
            inboundRootArraySize: UInt = 0u,
            inboundRootArray: MutPtr<IkeextCertRootConfig0> = MutPtr(0L),
        ): IkeextCertificateAuthentication000 =
            IkeextCertificateAuthentication000(
                inboundRootArraySize = inboundRootArraySize,
                inboundRootArrayCtorArg = inboundRootArray,
            )
    }
}

public class IkeextCertificateAuthentication01 internal constructor(
    public var anonymous: IkeextCertificateAuthentication010,
    outboundEnterpriseStoreConfigCtorArg: MutPtr<IkeextCertRootConfig0>,
    outboundTrustedRootStoreConfigCtorArg: MutPtr<IkeextCertRootConfig0>,
) {
    public var outboundEnterpriseStoreConfig: MutPtr<IkeextCertRootConfig0> = outboundEnterpriseStoreConfigCtorArg
        internal set

    public var outboundTrustedRootStoreConfig: MutPtr<IkeextCertRootConfig0> = outboundTrustedRootStoreConfigCtorArg
        internal set

    public constructor() : this(
        anonymous = IkeextCertificateAuthentication010(),
        outboundEnterpriseStoreConfigCtorArg = MutPtr(0L),
        outboundTrustedRootStoreConfigCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IkeextCertificateAuthentication010 = this.anonymous

    public operator fun component2(): MutPtr<IkeextCertRootConfig0> = this.outboundEnterpriseStoreConfig

    public operator fun component3(): MutPtr<IkeextCertRootConfig0> = this.outboundTrustedRootStoreConfig

    public fun copy(anonymous: IkeextCertificateAuthentication010 = this.anonymous, outboundEnterpriseStoreConfig: MutPtr<IkeextCertRootConfig0> = this.outboundEnterpriseStoreConfig, outboundTrustedRootStoreConfig: MutPtr<IkeextCertRootConfig0> = this.outboundTrustedRootStoreConfig): IkeextCertificateAuthentication01 = IkeextCertificateAuthentication01(anonymous = anonymous, outboundEnterpriseStoreConfigCtorArg = outboundEnterpriseStoreConfig, outboundTrustedRootStoreConfigCtorArg = outboundTrustedRootStoreConfig)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertificateAuthentication01) return false
        if (this.anonymous != other.anonymous) return false
        if (this.outboundEnterpriseStoreConfig != other.outboundEnterpriseStoreConfig) return false
        if (this.outboundTrustedRootStoreConfig != other.outboundTrustedRootStoreConfig) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.outboundEnterpriseStoreConfig.hashCode()
        result = 31 * result + this.outboundTrustedRootStoreConfig.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: IkeextCertificateAuthentication010 = IkeextCertificateAuthentication010(),
            outboundEnterpriseStoreConfig: MutPtr<IkeextCertRootConfig0> = MutPtr(0L),
            outboundTrustedRootStoreConfig: MutPtr<IkeextCertRootConfig0> = MutPtr(0L),
        ): IkeextCertificateAuthentication01 =
            IkeextCertificateAuthentication01(
                anonymous = anonymous,
                outboundEnterpriseStoreConfigCtorArg = outboundEnterpriseStoreConfig,
                outboundTrustedRootStoreConfigCtorArg = outboundTrustedRootStoreConfig,
            )
    }
}

public class IkeextCertificateAuthentication010 internal constructor(
    public var outboundRootArraySize: UInt,
    outboundRootArrayCtorArg: MutPtr<IkeextCertRootConfig0>,
) {
    public var outboundRootArray: MutPtr<IkeextCertRootConfig0> = outboundRootArrayCtorArg
        internal set

    public constructor() : this(
        outboundRootArraySize = 0u,
        outboundRootArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.outboundRootArraySize

    public operator fun component2(): MutPtr<IkeextCertRootConfig0> = this.outboundRootArray

    public fun copy(outboundRootArraySize: UInt = this.outboundRootArraySize, outboundRootArray: MutPtr<IkeextCertRootConfig0> = this.outboundRootArray): IkeextCertificateAuthentication010 = IkeextCertificateAuthentication010(outboundRootArraySize = outboundRootArraySize, outboundRootArrayCtorArg = outboundRootArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertificateAuthentication010) return false
        if (this.outboundRootArraySize != other.outboundRootArraySize) return false
        if (this.outboundRootArray != other.outboundRootArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outboundRootArraySize.hashCode()
        result = 31 * result + this.outboundRootArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication010> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication010> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCertificateAuthentication010 =
                    IkeextCertificateAuthentication010(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextCertRootConfig0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCertificateAuthentication010) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outboundRootArraySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextCertRootConfig0>(64)
                    ).writeNative(addr + 8L, value.outboundRootArray)
                }
            }

        public operator fun invoke(
            outboundRootArraySize: UInt = 0u,
            outboundRootArray: MutPtr<IkeextCertRootConfig0> = MutPtr(0L),
        ): IkeextCertificateAuthentication010 =
            IkeextCertificateAuthentication010(
                outboundRootArraySize = outboundRootArraySize,
                outboundRootArrayCtorArg = outboundRootArray,
            )
    }
}

public data class IkeextCertificateAuthentication1(
    public var inboundConfigType: IkeextCertConfigType = 0,
    public var anonymous1: IkeextCertificateAuthentication10 = IkeextCertificateAuthentication10(),
    public var outboundConfigType: IkeextCertConfigType = 0,
    public var anonymous2: IkeextCertificateAuthentication11 = IkeextCertificateAuthentication11(),
    public var flags: IkeextCertAuth = 0u,
    public var localCertLocationUrl: FwpByteBlob = FwpByteBlob(),
)

public class IkeextCertificateAuthentication10 internal constructor(
    public var anonymous: IkeextCertificateAuthentication100,
    inboundEnterpriseStoreConfigCtorArg: MutPtr<IkeextCertRootConfig0>,
    inboundTrustedRootStoreConfigCtorArg: MutPtr<IkeextCertRootConfig0>,
) {
    public var inboundEnterpriseStoreConfig: MutPtr<IkeextCertRootConfig0> = inboundEnterpriseStoreConfigCtorArg
        internal set

    public var inboundTrustedRootStoreConfig: MutPtr<IkeextCertRootConfig0> = inboundTrustedRootStoreConfigCtorArg
        internal set

    public constructor() : this(
        anonymous = IkeextCertificateAuthentication100(),
        inboundEnterpriseStoreConfigCtorArg = MutPtr(0L),
        inboundTrustedRootStoreConfigCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IkeextCertificateAuthentication100 = this.anonymous

    public operator fun component2(): MutPtr<IkeextCertRootConfig0> = this.inboundEnterpriseStoreConfig

    public operator fun component3(): MutPtr<IkeextCertRootConfig0> = this.inboundTrustedRootStoreConfig

    public fun copy(anonymous: IkeextCertificateAuthentication100 = this.anonymous, inboundEnterpriseStoreConfig: MutPtr<IkeextCertRootConfig0> = this.inboundEnterpriseStoreConfig, inboundTrustedRootStoreConfig: MutPtr<IkeextCertRootConfig0> = this.inboundTrustedRootStoreConfig): IkeextCertificateAuthentication10 = IkeextCertificateAuthentication10(anonymous = anonymous, inboundEnterpriseStoreConfigCtorArg = inboundEnterpriseStoreConfig, inboundTrustedRootStoreConfigCtorArg = inboundTrustedRootStoreConfig)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertificateAuthentication10) return false
        if (this.anonymous != other.anonymous) return false
        if (this.inboundEnterpriseStoreConfig != other.inboundEnterpriseStoreConfig) return false
        if (this.inboundTrustedRootStoreConfig != other.inboundTrustedRootStoreConfig) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.inboundEnterpriseStoreConfig.hashCode()
        result = 31 * result + this.inboundTrustedRootStoreConfig.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: IkeextCertificateAuthentication100 = IkeextCertificateAuthentication100(),
            inboundEnterpriseStoreConfig: MutPtr<IkeextCertRootConfig0> = MutPtr(0L),
            inboundTrustedRootStoreConfig: MutPtr<IkeextCertRootConfig0> = MutPtr(0L),
        ): IkeextCertificateAuthentication10 =
            IkeextCertificateAuthentication10(
                anonymous = anonymous,
                inboundEnterpriseStoreConfigCtorArg = inboundEnterpriseStoreConfig,
                inboundTrustedRootStoreConfigCtorArg = inboundTrustedRootStoreConfig,
            )
    }
}

public class IkeextCertificateAuthentication100 internal constructor(
    public var inboundRootArraySize: UInt,
    inboundRootArrayCtorArg: MutPtr<IkeextCertRootConfig0>,
) {
    public var inboundRootArray: MutPtr<IkeextCertRootConfig0> = inboundRootArrayCtorArg
        internal set

    public constructor() : this(
        inboundRootArraySize = 0u,
        inboundRootArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.inboundRootArraySize

    public operator fun component2(): MutPtr<IkeextCertRootConfig0> = this.inboundRootArray

    public fun copy(inboundRootArraySize: UInt = this.inboundRootArraySize, inboundRootArray: MutPtr<IkeextCertRootConfig0> = this.inboundRootArray): IkeextCertificateAuthentication100 = IkeextCertificateAuthentication100(inboundRootArraySize = inboundRootArraySize, inboundRootArrayCtorArg = inboundRootArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertificateAuthentication100) return false
        if (this.inboundRootArraySize != other.inboundRootArraySize) return false
        if (this.inboundRootArray != other.inboundRootArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inboundRootArraySize.hashCode()
        result = 31 * result + this.inboundRootArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication100> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication100> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCertificateAuthentication100 =
                    IkeextCertificateAuthentication100(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextCertRootConfig0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCertificateAuthentication100) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.inboundRootArraySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextCertRootConfig0>(64)
                    ).writeNative(addr + 8L, value.inboundRootArray)
                }
            }

        public operator fun invoke(
            inboundRootArraySize: UInt = 0u,
            inboundRootArray: MutPtr<IkeextCertRootConfig0> = MutPtr(0L),
        ): IkeextCertificateAuthentication100 =
            IkeextCertificateAuthentication100(
                inboundRootArraySize = inboundRootArraySize,
                inboundRootArrayCtorArg = inboundRootArray,
            )
    }
}

public class IkeextCertificateAuthentication11 internal constructor(
    public var anonymous: IkeextCertificateAuthentication110,
    outboundEnterpriseStoreConfigCtorArg: MutPtr<IkeextCertRootConfig0>,
    outboundTrustedRootStoreConfigCtorArg: MutPtr<IkeextCertRootConfig0>,
) {
    public var outboundEnterpriseStoreConfig: MutPtr<IkeextCertRootConfig0> = outboundEnterpriseStoreConfigCtorArg
        internal set

    public var outboundTrustedRootStoreConfig: MutPtr<IkeextCertRootConfig0> = outboundTrustedRootStoreConfigCtorArg
        internal set

    public constructor() : this(
        anonymous = IkeextCertificateAuthentication110(),
        outboundEnterpriseStoreConfigCtorArg = MutPtr(0L),
        outboundTrustedRootStoreConfigCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IkeextCertificateAuthentication110 = this.anonymous

    public operator fun component2(): MutPtr<IkeextCertRootConfig0> = this.outboundEnterpriseStoreConfig

    public operator fun component3(): MutPtr<IkeextCertRootConfig0> = this.outboundTrustedRootStoreConfig

    public fun copy(anonymous: IkeextCertificateAuthentication110 = this.anonymous, outboundEnterpriseStoreConfig: MutPtr<IkeextCertRootConfig0> = this.outboundEnterpriseStoreConfig, outboundTrustedRootStoreConfig: MutPtr<IkeextCertRootConfig0> = this.outboundTrustedRootStoreConfig): IkeextCertificateAuthentication11 = IkeextCertificateAuthentication11(anonymous = anonymous, outboundEnterpriseStoreConfigCtorArg = outboundEnterpriseStoreConfig, outboundTrustedRootStoreConfigCtorArg = outboundTrustedRootStoreConfig)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertificateAuthentication11) return false
        if (this.anonymous != other.anonymous) return false
        if (this.outboundEnterpriseStoreConfig != other.outboundEnterpriseStoreConfig) return false
        if (this.outboundTrustedRootStoreConfig != other.outboundTrustedRootStoreConfig) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.outboundEnterpriseStoreConfig.hashCode()
        result = 31 * result + this.outboundTrustedRootStoreConfig.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: IkeextCertificateAuthentication110 = IkeextCertificateAuthentication110(),
            outboundEnterpriseStoreConfig: MutPtr<IkeextCertRootConfig0> = MutPtr(0L),
            outboundTrustedRootStoreConfig: MutPtr<IkeextCertRootConfig0> = MutPtr(0L),
        ): IkeextCertificateAuthentication11 =
            IkeextCertificateAuthentication11(
                anonymous = anonymous,
                outboundEnterpriseStoreConfigCtorArg = outboundEnterpriseStoreConfig,
                outboundTrustedRootStoreConfigCtorArg = outboundTrustedRootStoreConfig,
            )
    }
}

public class IkeextCertificateAuthentication110 internal constructor(
    public var outboundRootArraySize: UInt,
    outboundRootArrayCtorArg: MutPtr<IkeextCertRootConfig0>,
) {
    public var outboundRootArray: MutPtr<IkeextCertRootConfig0> = outboundRootArrayCtorArg
        internal set

    public constructor() : this(
        outboundRootArraySize = 0u,
        outboundRootArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.outboundRootArraySize

    public operator fun component2(): MutPtr<IkeextCertRootConfig0> = this.outboundRootArray

    public fun copy(outboundRootArraySize: UInt = this.outboundRootArraySize, outboundRootArray: MutPtr<IkeextCertRootConfig0> = this.outboundRootArray): IkeextCertificateAuthentication110 = IkeextCertificateAuthentication110(outboundRootArraySize = outboundRootArraySize, outboundRootArrayCtorArg = outboundRootArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertificateAuthentication110) return false
        if (this.outboundRootArraySize != other.outboundRootArraySize) return false
        if (this.outboundRootArray != other.outboundRootArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outboundRootArraySize.hashCode()
        result = 31 * result + this.outboundRootArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication110> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication110> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCertificateAuthentication110 =
                    IkeextCertificateAuthentication110(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextCertRootConfig0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCertificateAuthentication110) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outboundRootArraySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextCertRootConfig0>(64)
                    ).writeNative(addr + 8L, value.outboundRootArray)
                }
            }

        public operator fun invoke(
            outboundRootArraySize: UInt = 0u,
            outboundRootArray: MutPtr<IkeextCertRootConfig0> = MutPtr(0L),
        ): IkeextCertificateAuthentication110 =
            IkeextCertificateAuthentication110(
                outboundRootArraySize = outboundRootArraySize,
                outboundRootArrayCtorArg = outboundRootArray,
            )
    }
}

public data class IkeextCertificateAuthentication2(
    public var inboundConfigType: IkeextCertConfigType = 0,
    public var anonymous1: IkeextCertificateAuthentication20 = IkeextCertificateAuthentication20(),
    public var outboundConfigType: IkeextCertConfigType = 0,
    public var anonymous2: IkeextCertificateAuthentication21 = IkeextCertificateAuthentication21(),
    public var flags: IkeextCertAuth = 0u,
    public var localCertLocationUrl: FwpByteBlob = FwpByteBlob(),
)

public data class IkeextCertificateAuthentication20(
    public var anonymous1: IkeextCertificateAuthentication200 = IkeextCertificateAuthentication200(),
    public var anonymous2: IkeextCertificateAuthentication201 = IkeextCertificateAuthentication201(),
    public var anonymous3: IkeextCertificateAuthentication202 = IkeextCertificateAuthentication202(),
)

public class IkeextCertificateAuthentication200 internal constructor(
    public var inboundRootArraySize: UInt,
    inboundRootCriteriaCtorArg: MutPtr<IkeextCertificateCriteria0>,
) {
    public var inboundRootCriteria: MutPtr<IkeextCertificateCriteria0> = inboundRootCriteriaCtorArg
        internal set

    public constructor() : this(
        inboundRootArraySize = 0u,
        inboundRootCriteriaCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.inboundRootArraySize

    public operator fun component2(): MutPtr<IkeextCertificateCriteria0> = this.inboundRootCriteria

    public fun copy(inboundRootArraySize: UInt = this.inboundRootArraySize, inboundRootCriteria: MutPtr<IkeextCertificateCriteria0> = this.inboundRootCriteria): IkeextCertificateAuthentication200 = IkeextCertificateAuthentication200(inboundRootArraySize = inboundRootArraySize, inboundRootCriteriaCtorArg = inboundRootCriteria)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertificateAuthentication200) return false
        if (this.inboundRootArraySize != other.inboundRootArraySize) return false
        if (this.inboundRootCriteria != other.inboundRootCriteria) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inboundRootArraySize.hashCode()
        result = 31 * result + this.inboundRootCriteria.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication200> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication200> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCertificateAuthentication200 =
                    IkeextCertificateAuthentication200(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextCertificateCriteria0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCertificateAuthentication200) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.inboundRootArraySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextCertificateCriteria0>(64)
                    ).writeNative(addr + 8L, value.inboundRootCriteria)
                }
            }

        public operator fun invoke(
            inboundRootArraySize: UInt = 0u,
            inboundRootCriteria: MutPtr<IkeextCertificateCriteria0> = MutPtr(0L),
        ): IkeextCertificateAuthentication200 =
            IkeextCertificateAuthentication200(
                inboundRootArraySize = inboundRootArraySize,
                inboundRootCriteriaCtorArg = inboundRootCriteria,
            )
    }
}

public class IkeextCertificateAuthentication201 internal constructor(
    public var inboundEnterpriseStoreArraySize: UInt,
    inboundEnterpriseStoreCriteriaCtorArg: MutPtr<IkeextCertificateCriteria0>,
) {
    public var inboundEnterpriseStoreCriteria: MutPtr<IkeextCertificateCriteria0> = inboundEnterpriseStoreCriteriaCtorArg
        internal set

    public constructor() : this(
        inboundEnterpriseStoreArraySize = 0u,
        inboundEnterpriseStoreCriteriaCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.inboundEnterpriseStoreArraySize

    public operator fun component2(): MutPtr<IkeextCertificateCriteria0> = this.inboundEnterpriseStoreCriteria

    public fun copy(inboundEnterpriseStoreArraySize: UInt = this.inboundEnterpriseStoreArraySize, inboundEnterpriseStoreCriteria: MutPtr<IkeextCertificateCriteria0> = this.inboundEnterpriseStoreCriteria): IkeextCertificateAuthentication201 = IkeextCertificateAuthentication201(inboundEnterpriseStoreArraySize = inboundEnterpriseStoreArraySize, inboundEnterpriseStoreCriteriaCtorArg = inboundEnterpriseStoreCriteria)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertificateAuthentication201) return false
        if (this.inboundEnterpriseStoreArraySize != other.inboundEnterpriseStoreArraySize) return false
        if (this.inboundEnterpriseStoreCriteria != other.inboundEnterpriseStoreCriteria) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inboundEnterpriseStoreArraySize.hashCode()
        result = 31 * result + this.inboundEnterpriseStoreCriteria.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication201> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication201> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCertificateAuthentication201 =
                    IkeextCertificateAuthentication201(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextCertificateCriteria0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCertificateAuthentication201) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.inboundEnterpriseStoreArraySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextCertificateCriteria0>(64)
                    ).writeNative(addr + 8L, value.inboundEnterpriseStoreCriteria)
                }
            }

        public operator fun invoke(
            inboundEnterpriseStoreArraySize: UInt = 0u,
            inboundEnterpriseStoreCriteria: MutPtr<IkeextCertificateCriteria0> = MutPtr(0L),
        ): IkeextCertificateAuthentication201 =
            IkeextCertificateAuthentication201(
                inboundEnterpriseStoreArraySize = inboundEnterpriseStoreArraySize,
                inboundEnterpriseStoreCriteriaCtorArg = inboundEnterpriseStoreCriteria,
            )
    }
}

public class IkeextCertificateAuthentication202 internal constructor(
    public var inboundRootStoreArraySize: UInt,
    inboundTrustedRootStoreCriteriaCtorArg: MutPtr<IkeextCertificateCriteria0>,
) {
    public var inboundTrustedRootStoreCriteria: MutPtr<IkeextCertificateCriteria0> = inboundTrustedRootStoreCriteriaCtorArg
        internal set

    public constructor() : this(
        inboundRootStoreArraySize = 0u,
        inboundTrustedRootStoreCriteriaCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.inboundRootStoreArraySize

    public operator fun component2(): MutPtr<IkeextCertificateCriteria0> = this.inboundTrustedRootStoreCriteria

    public fun copy(inboundRootStoreArraySize: UInt = this.inboundRootStoreArraySize, inboundTrustedRootStoreCriteria: MutPtr<IkeextCertificateCriteria0> = this.inboundTrustedRootStoreCriteria): IkeextCertificateAuthentication202 = IkeextCertificateAuthentication202(inboundRootStoreArraySize = inboundRootStoreArraySize, inboundTrustedRootStoreCriteriaCtorArg = inboundTrustedRootStoreCriteria)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertificateAuthentication202) return false
        if (this.inboundRootStoreArraySize != other.inboundRootStoreArraySize) return false
        if (this.inboundTrustedRootStoreCriteria != other.inboundTrustedRootStoreCriteria) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inboundRootStoreArraySize.hashCode()
        result = 31 * result + this.inboundTrustedRootStoreCriteria.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication202> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication202> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCertificateAuthentication202 =
                    IkeextCertificateAuthentication202(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextCertificateCriteria0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCertificateAuthentication202) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.inboundRootStoreArraySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextCertificateCriteria0>(64)
                    ).writeNative(addr + 8L, value.inboundTrustedRootStoreCriteria)
                }
            }

        public operator fun invoke(
            inboundRootStoreArraySize: UInt = 0u,
            inboundTrustedRootStoreCriteria: MutPtr<IkeextCertificateCriteria0> = MutPtr(0L),
        ): IkeextCertificateAuthentication202 =
            IkeextCertificateAuthentication202(
                inboundRootStoreArraySize = inboundRootStoreArraySize,
                inboundTrustedRootStoreCriteriaCtorArg = inboundTrustedRootStoreCriteria,
            )
    }
}

public data class IkeextCertificateAuthentication21(
    public var anonymous1: IkeextCertificateAuthentication210 = IkeextCertificateAuthentication210(),
    public var anonymous2: IkeextCertificateAuthentication211 = IkeextCertificateAuthentication211(),
    public var anonymous3: IkeextCertificateAuthentication212 = IkeextCertificateAuthentication212(),
)

public class IkeextCertificateAuthentication210 internal constructor(
    public var outboundRootArraySize: UInt,
    outboundRootCriteriaCtorArg: MutPtr<IkeextCertificateCriteria0>,
) {
    public var outboundRootCriteria: MutPtr<IkeextCertificateCriteria0> = outboundRootCriteriaCtorArg
        internal set

    public constructor() : this(
        outboundRootArraySize = 0u,
        outboundRootCriteriaCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.outboundRootArraySize

    public operator fun component2(): MutPtr<IkeextCertificateCriteria0> = this.outboundRootCriteria

    public fun copy(outboundRootArraySize: UInt = this.outboundRootArraySize, outboundRootCriteria: MutPtr<IkeextCertificateCriteria0> = this.outboundRootCriteria): IkeextCertificateAuthentication210 = IkeextCertificateAuthentication210(outboundRootArraySize = outboundRootArraySize, outboundRootCriteriaCtorArg = outboundRootCriteria)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertificateAuthentication210) return false
        if (this.outboundRootArraySize != other.outboundRootArraySize) return false
        if (this.outboundRootCriteria != other.outboundRootCriteria) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outboundRootArraySize.hashCode()
        result = 31 * result + this.outboundRootCriteria.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication210> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication210> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCertificateAuthentication210 =
                    IkeextCertificateAuthentication210(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextCertificateCriteria0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCertificateAuthentication210) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outboundRootArraySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextCertificateCriteria0>(64)
                    ).writeNative(addr + 8L, value.outboundRootCriteria)
                }
            }

        public operator fun invoke(
            outboundRootArraySize: UInt = 0u,
            outboundRootCriteria: MutPtr<IkeextCertificateCriteria0> = MutPtr(0L),
        ): IkeextCertificateAuthentication210 =
            IkeextCertificateAuthentication210(
                outboundRootArraySize = outboundRootArraySize,
                outboundRootCriteriaCtorArg = outboundRootCriteria,
            )
    }
}

public class IkeextCertificateAuthentication211 internal constructor(
    public var outboundEnterpriseStoreArraySize: UInt,
    outboundEnterpriseStoreCriteriaCtorArg: MutPtr<IkeextCertificateCriteria0>,
) {
    public var outboundEnterpriseStoreCriteria: MutPtr<IkeextCertificateCriteria0> = outboundEnterpriseStoreCriteriaCtorArg
        internal set

    public constructor() : this(
        outboundEnterpriseStoreArraySize = 0u,
        outboundEnterpriseStoreCriteriaCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.outboundEnterpriseStoreArraySize

    public operator fun component2(): MutPtr<IkeextCertificateCriteria0> = this.outboundEnterpriseStoreCriteria

    public fun copy(outboundEnterpriseStoreArraySize: UInt = this.outboundEnterpriseStoreArraySize, outboundEnterpriseStoreCriteria: MutPtr<IkeextCertificateCriteria0> = this.outboundEnterpriseStoreCriteria): IkeextCertificateAuthentication211 = IkeextCertificateAuthentication211(outboundEnterpriseStoreArraySize = outboundEnterpriseStoreArraySize, outboundEnterpriseStoreCriteriaCtorArg = outboundEnterpriseStoreCriteria)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertificateAuthentication211) return false
        if (this.outboundEnterpriseStoreArraySize != other.outboundEnterpriseStoreArraySize) return false
        if (this.outboundEnterpriseStoreCriteria != other.outboundEnterpriseStoreCriteria) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outboundEnterpriseStoreArraySize.hashCode()
        result = 31 * result + this.outboundEnterpriseStoreCriteria.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication211> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication211> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCertificateAuthentication211 =
                    IkeextCertificateAuthentication211(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextCertificateCriteria0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCertificateAuthentication211) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outboundEnterpriseStoreArraySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextCertificateCriteria0>(64)
                    ).writeNative(addr + 8L, value.outboundEnterpriseStoreCriteria)
                }
            }

        public operator fun invoke(
            outboundEnterpriseStoreArraySize: UInt = 0u,
            outboundEnterpriseStoreCriteria: MutPtr<IkeextCertificateCriteria0> = MutPtr(0L),
        ): IkeextCertificateAuthentication211 =
            IkeextCertificateAuthentication211(
                outboundEnterpriseStoreArraySize = outboundEnterpriseStoreArraySize,
                outboundEnterpriseStoreCriteriaCtorArg = outboundEnterpriseStoreCriteria,
            )
    }
}

public class IkeextCertificateAuthentication212 internal constructor(
    public var outboundRootStoreArraySize: UInt,
    outboundTrustedRootStoreCriteriaCtorArg: MutPtr<IkeextCertificateCriteria0>,
) {
    public var outboundTrustedRootStoreCriteria: MutPtr<IkeextCertificateCriteria0> = outboundTrustedRootStoreCriteriaCtorArg
        internal set

    public constructor() : this(
        outboundRootStoreArraySize = 0u,
        outboundTrustedRootStoreCriteriaCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.outboundRootStoreArraySize

    public operator fun component2(): MutPtr<IkeextCertificateCriteria0> = this.outboundTrustedRootStoreCriteria

    public fun copy(outboundRootStoreArraySize: UInt = this.outboundRootStoreArraySize, outboundTrustedRootStoreCriteria: MutPtr<IkeextCertificateCriteria0> = this.outboundTrustedRootStoreCriteria): IkeextCertificateAuthentication212 = IkeextCertificateAuthentication212(outboundRootStoreArraySize = outboundRootStoreArraySize, outboundTrustedRootStoreCriteriaCtorArg = outboundTrustedRootStoreCriteria)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertificateAuthentication212) return false
        if (this.outboundRootStoreArraySize != other.outboundRootStoreArraySize) return false
        if (this.outboundTrustedRootStoreCriteria != other.outboundTrustedRootStoreCriteria) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outboundRootStoreArraySize.hashCode()
        result = 31 * result + this.outboundTrustedRootStoreCriteria.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication212> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateAuthentication212> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCertificateAuthentication212 =
                    IkeextCertificateAuthentication212(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextCertificateCriteria0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCertificateAuthentication212) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.outboundRootStoreArraySize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextCertificateCriteria0>(64)
                    ).writeNative(addr + 8L, value.outboundTrustedRootStoreCriteria)
                }
            }

        public operator fun invoke(
            outboundRootStoreArraySize: UInt = 0u,
            outboundTrustedRootStoreCriteria: MutPtr<IkeextCertificateCriteria0> = MutPtr(0L),
        ): IkeextCertificateAuthentication212 =
            IkeextCertificateAuthentication212(
                outboundRootStoreArraySize = outboundRootStoreArraySize,
                outboundTrustedRootStoreCriteriaCtorArg = outboundTrustedRootStoreCriteria,
            )
    }
}

public data class IkeextCertificateCredential0(
    public var subjectName: FwpByteBlob = FwpByteBlob(),
    public var certHash: FwpByteBlob = FwpByteBlob(),
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateCredential0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateCredential0> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCertificateCredential0 =
                    IkeextCertificateCredential0(
                        (FwpByteBlob.typeLayout()).readNative(addr),
                        (FwpByteBlob.typeLayout()).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: IkeextCertificateCredential0) {
                    (FwpByteBlob.typeLayout()).writeNative(addr, value.subjectName)
                    (FwpByteBlob.typeLayout()).writeNative(addr + 16L, value.certHash)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.flags)
                }
            }
    }
}

public data class IkeextCertificateCredential1(
    public var subjectName: FwpByteBlob = FwpByteBlob(),
    public var certHash: FwpByteBlob = FwpByteBlob(),
    public var flags: UInt = 0u,
    public var certificate: FwpByteBlob = FwpByteBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateCredential1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateCredential1> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCertificateCredential1 =
                    IkeextCertificateCredential1(
                        (FwpByteBlob.typeLayout()).readNative(addr),
                        (FwpByteBlob.typeLayout()).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (FwpByteBlob.typeLayout()).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: IkeextCertificateCredential1) {
                    (FwpByteBlob.typeLayout()).writeNative(addr, value.subjectName)
                    (FwpByteBlob.typeLayout()).writeNative(addr + 16L, value.certHash)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.flags)
                    (FwpByteBlob.typeLayout()).writeNative(addr + 40L, value.certificate)
                }
            }
    }
}

public class IkeextCertificateCriteria0 internal constructor(
    public var certData: FwpByteBlob,
    public var certHash: FwpByteBlob,
    ekuCtorArg: MutPtr<IkeextCertEkus0>,
    nameCtorArg: MutPtr<IkeextCertName0>,
    public var flags: UInt,
) {
    public var eku: MutPtr<IkeextCertEkus0> = ekuCtorArg
        internal set

    public var name: MutPtr<IkeextCertName0> = nameCtorArg
        internal set

    public constructor() : this(
        certData = FwpByteBlob(),
        certHash = FwpByteBlob(),
        ekuCtorArg = MutPtr(0L),
        nameCtorArg = MutPtr(0L),
        flags = 0u,
    )

    public operator fun component1(): FwpByteBlob = this.certData

    public operator fun component2(): FwpByteBlob = this.certHash

    public operator fun component3(): MutPtr<IkeextCertEkus0> = this.eku

    public operator fun component4(): MutPtr<IkeextCertName0> = this.name

    public operator fun component5(): UInt = this.flags

    public fun copy(certData: FwpByteBlob = this.certData, certHash: FwpByteBlob = this.certHash, eku: MutPtr<IkeextCertEkus0> = this.eku, name: MutPtr<IkeextCertName0> = this.name, flags: UInt = this.flags): IkeextCertificateCriteria0 = IkeextCertificateCriteria0(certData = certData, certHash = certHash, ekuCtorArg = eku, nameCtorArg = name, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertificateCriteria0) return false
        if (this.certData != other.certData) return false
        if (this.certHash != other.certHash) return false
        if (this.eku != other.eku) return false
        if (this.name != other.name) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.certData.hashCode()
        result = 31 * result + this.certHash.hashCode()
        result = 31 * result + this.eku.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateCriteria0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertificateCriteria0> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCertificateCriteria0 =
                    IkeextCertificateCriteria0(
                        (FwpByteBlob.typeLayout()).readNative(addr),
                        (FwpByteBlob.typeLayout()).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextCertEkus0>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextCertName0>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: IkeextCertificateCriteria0) {
                    (FwpByteBlob.typeLayout()).writeNative(addr, value.certData)
                    (FwpByteBlob.typeLayout()).writeNative(addr + 16L, value.certHash)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextCertEkus0>(64)
                    ).writeNative(addr + 32L, value.eku)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextCertName0>(64)
                    ).writeNative(addr + 40L, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.flags)
                }
            }

        public operator fun invoke(
            certData: FwpByteBlob = FwpByteBlob(),
            certHash: FwpByteBlob = FwpByteBlob(),
            eku: MutPtr<IkeextCertEkus0> = MutPtr(0L),
            name: MutPtr<IkeextCertName0> = MutPtr(0L),
            flags: UInt = 0u,
        ): IkeextCertificateCriteria0 =
            IkeextCertificateCriteria0(
                certData = certData,
                certHash = certHash,
                ekuCtorArg = eku,
                nameCtorArg = name,
                flags = flags,
            )
    }
}

public class IkeextCertEkus0 internal constructor(
    public var numEku: UInt,
    ekuCtorArg: MutPtr<Pstr>,
) {
    public var eku: MutPtr<Pstr> = ekuCtorArg
        internal set

    public constructor() : this(
        numEku = 0u,
        ekuCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numEku

    public operator fun component2(): MutPtr<Pstr> = this.eku

    public fun copy(numEku: UInt = this.numEku, eku: MutPtr<Pstr> = this.eku): IkeextCertEkus0 = IkeextCertEkus0(numEku = numEku, ekuCtorArg = eku)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertEkus0) return false
        if (this.numEku != other.numEku) return false
        if (this.eku != other.eku) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numEku.hashCode()
        result = 31 * result + this.eku.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertEkus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertEkus0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCertEkus0 =
                    IkeextCertEkus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Pstr>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCertEkus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numEku)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Pstr>(64)
                    ).writeNative(addr + 8L, value.eku)
                }
            }

        public operator fun invoke(
            numEku: UInt = 0u,
            eku: MutPtr<Pstr> = MutPtr(0L),
        ): IkeextCertEkus0 =
            IkeextCertEkus0(
                numEku = numEku,
                ekuCtorArg = eku,
            )
    }
}

public class IkeextCertName0 internal constructor(
    public var nameType: IkeextCertCriteriaNameType,
    certNameCtorArg: Pwstr,
) {
    public var certName: Pwstr = certNameCtorArg
        internal set

    public constructor() : this(
        nameType = 0,
        certNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IkeextCertCriteriaNameType = this.nameType

    public operator fun component2(): Pwstr = this.certName

    public fun copy(nameType: IkeextCertCriteriaNameType = this.nameType, certName: Pwstr = this.certName): IkeextCertName0 = IkeextCertName0(nameType = nameType, certNameCtorArg = certName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCertName0) return false
        if (this.nameType != other.nameType) return false
        if (this.certName != other.certName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nameType.hashCode()
        result = 31 * result + this.certName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nameType: IkeextCertCriteriaNameType = 0,
            certName: Pwstr = MutPtr(0L),
        ): IkeextCertName0 =
            IkeextCertName0(
                nameType = nameType,
                certNameCtorArg = certName,
            )
    }
}

public data class IkeextCertRootConfig0(
    public var certData: FwpByteBlob = FwpByteBlob(),
    public var flags: IkeextCertFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertRootConfig0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCertRootConfig0> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCertRootConfig0 =
                    IkeextCertRootConfig0(
                        (FwpByteBlob.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IkeextCertRootConfig0) {
                    (FwpByteBlob.typeLayout()).writeNative(addr, value.certData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public data class IkeextCipherAlgorithm0(
    public var algoIdentifier: IkeextCipherType = 0,
    public var keyLen: UInt = 0u,
    public var rounds: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCipherAlgorithm0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCipherAlgorithm0> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextCipherAlgorithm0 =
                    IkeextCipherAlgorithm0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCipherAlgorithm0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.algoIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.keyLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.rounds)
                }
            }
    }
}

public data class IkeextCommonStatistics0(
    public var v4Statistics: IkeextIpVersionSpecificCommonStatistics0 = IkeextIpVersionSpecificCommonStatistics0(),
    public var v6Statistics: IkeextIpVersionSpecificCommonStatistics0 = IkeextIpVersionSpecificCommonStatistics0(),
    public var totalPacketsReceived: UInt = 0u,
    public var totalInvalidPacketsReceived: UInt = 0u,
    public var currentQueuedWorkitems: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCommonStatistics0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCommonStatistics0> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextCommonStatistics0 =
                    IkeextCommonStatistics0(
                        (IkeextIpVersionSpecificCommonStatistics0.typeLayout()).readNative(addr),
                        (IkeextIpVersionSpecificCommonStatistics0.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IkeextCommonStatistics0) {
                    (IkeextIpVersionSpecificCommonStatistics0.typeLayout()).writeNative(addr, value.v4Statistics)
                    (IkeextIpVersionSpecificCommonStatistics0.typeLayout()).writeNative(addr + 8L, value.v6Statistics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.totalPacketsReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.totalInvalidPacketsReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.currentQueuedWorkitems)
                }
            }
    }
}

public data class IkeextCommonStatistics1(
    public var v4Statistics: IkeextIpVersionSpecificCommonStatistics1 = IkeextIpVersionSpecificCommonStatistics1(),
    public var v6Statistics: IkeextIpVersionSpecificCommonStatistics1 = IkeextIpVersionSpecificCommonStatistics1(),
    public var totalPacketsReceived: UInt = 0u,
    public var totalInvalidPacketsReceived: UInt = 0u,
    public var currentQueuedWorkitems: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCommonStatistics1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCommonStatistics1> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextCommonStatistics1 =
                    IkeextCommonStatistics1(
                        (IkeextIpVersionSpecificCommonStatistics1.typeLayout()).readNative(addr),
                        (IkeextIpVersionSpecificCommonStatistics1.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IkeextCommonStatistics1) {
                    (IkeextIpVersionSpecificCommonStatistics1.typeLayout()).writeNative(addr, value.v4Statistics)
                    (IkeextIpVersionSpecificCommonStatistics1.typeLayout()).writeNative(addr + 8L, value.v6Statistics)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.totalPacketsReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.totalInvalidPacketsReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.currentQueuedWorkitems)
                }
            }
    }
}

public data class IkeextCookiePair0(
    public var initiator: ULong = 0uL,
    public var responder: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCookiePair0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCookiePair0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCookiePair0 =
                    IkeextCookiePair0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCookiePair0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.initiator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.responder)
                }
            }
    }
}

public data class IkeextCredential0(
    public var authenticationMethodType: IkeextAuthenticationMethodType = 0,
    public var impersonationType: IkeextAuthenticationImpersonationType = 0,
    public var anonymous: IkeextCredential00 = IkeextCredential00(),
)

public class IkeextCredential00 internal constructor(
    presharedKeyCtorArg: MutPtr<IkeextPresharedKeyAuthentication0>,
    certificateCtorArg: MutPtr<IkeextCertificateCredential0>,
    nameCtorArg: MutPtr<IkeextNameCredential0>,
) {
    public var presharedKey: MutPtr<IkeextPresharedKeyAuthentication0> = presharedKeyCtorArg
        internal set

    public var certificate: MutPtr<IkeextCertificateCredential0> = certificateCtorArg
        internal set

    public var name: MutPtr<IkeextNameCredential0> = nameCtorArg
        internal set

    public constructor() : this(
        presharedKeyCtorArg = MutPtr(0L),
        certificateCtorArg = MutPtr(0L),
        nameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IkeextPresharedKeyAuthentication0> = this.presharedKey

    public operator fun component2(): MutPtr<IkeextCertificateCredential0> = this.certificate

    public operator fun component3(): MutPtr<IkeextNameCredential0> = this.name

    public fun copy(presharedKey: MutPtr<IkeextPresharedKeyAuthentication0> = this.presharedKey, certificate: MutPtr<IkeextCertificateCredential0> = this.certificate, name: MutPtr<IkeextNameCredential0> = this.name): IkeextCredential00 = IkeextCredential00(presharedKeyCtorArg = presharedKey, certificateCtorArg = certificate, nameCtorArg = name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCredential00) return false
        if (this.presharedKey != other.presharedKey) return false
        if (this.certificate != other.certificate) return false
        if (this.name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.presharedKey.hashCode()
        result = 31 * result + this.certificate.hashCode()
        result = 31 * result + this.name.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            presharedKey: MutPtr<IkeextPresharedKeyAuthentication0> = MutPtr(0L),
            certificate: MutPtr<IkeextCertificateCredential0> = MutPtr(0L),
            name: MutPtr<IkeextNameCredential0> = MutPtr(0L),
        ): IkeextCredential00 =
            IkeextCredential00(
                presharedKeyCtorArg = presharedKey,
                certificateCtorArg = certificate,
                nameCtorArg = name,
            )
    }
}

public data class IkeextCredential1(
    public var authenticationMethodType: IkeextAuthenticationMethodType = 0,
    public var impersonationType: IkeextAuthenticationImpersonationType = 0,
    public var anonymous: IkeextCredential10 = IkeextCredential10(),
)

public class IkeextCredential10 internal constructor(
    presharedKeyCtorArg: MutPtr<IkeextPresharedKeyAuthentication1>,
    certificateCtorArg: MutPtr<IkeextCertificateCredential1>,
    nameCtorArg: MutPtr<IkeextNameCredential0>,
) {
    public var presharedKey: MutPtr<IkeextPresharedKeyAuthentication1> = presharedKeyCtorArg
        internal set

    public var certificate: MutPtr<IkeextCertificateCredential1> = certificateCtorArg
        internal set

    public var name: MutPtr<IkeextNameCredential0> = nameCtorArg
        internal set

    public constructor() : this(
        presharedKeyCtorArg = MutPtr(0L),
        certificateCtorArg = MutPtr(0L),
        nameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IkeextPresharedKeyAuthentication1> = this.presharedKey

    public operator fun component2(): MutPtr<IkeextCertificateCredential1> = this.certificate

    public operator fun component3(): MutPtr<IkeextNameCredential0> = this.name

    public fun copy(presharedKey: MutPtr<IkeextPresharedKeyAuthentication1> = this.presharedKey, certificate: MutPtr<IkeextCertificateCredential1> = this.certificate, name: MutPtr<IkeextNameCredential0> = this.name): IkeextCredential10 = IkeextCredential10(presharedKeyCtorArg = presharedKey, certificateCtorArg = certificate, nameCtorArg = name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCredential10) return false
        if (this.presharedKey != other.presharedKey) return false
        if (this.certificate != other.certificate) return false
        if (this.name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.presharedKey.hashCode()
        result = 31 * result + this.certificate.hashCode()
        result = 31 * result + this.name.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            presharedKey: MutPtr<IkeextPresharedKeyAuthentication1> = MutPtr(0L),
            certificate: MutPtr<IkeextCertificateCredential1> = MutPtr(0L),
            name: MutPtr<IkeextNameCredential0> = MutPtr(0L),
        ): IkeextCredential10 =
            IkeextCredential10(
                presharedKeyCtorArg = presharedKey,
                certificateCtorArg = certificate,
                nameCtorArg = name,
            )
    }
}

public data class IkeextCredential2(
    public var authenticationMethodType: IkeextAuthenticationMethodType = 0,
    public var impersonationType: IkeextAuthenticationImpersonationType = 0,
    public var anonymous: IkeextCredential20 = IkeextCredential20(),
)

public class IkeextCredential20 internal constructor(
    presharedKeyCtorArg: MutPtr<IkeextPresharedKeyAuthentication1>,
    certificateCtorArg: MutPtr<IkeextCertificateCredential1>,
    nameCtorArg: MutPtr<IkeextNameCredential0>,
) {
    public var presharedKey: MutPtr<IkeextPresharedKeyAuthentication1> = presharedKeyCtorArg
        internal set

    public var certificate: MutPtr<IkeextCertificateCredential1> = certificateCtorArg
        internal set

    public var name: MutPtr<IkeextNameCredential0> = nameCtorArg
        internal set

    public constructor() : this(
        presharedKeyCtorArg = MutPtr(0L),
        certificateCtorArg = MutPtr(0L),
        nameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IkeextPresharedKeyAuthentication1> = this.presharedKey

    public operator fun component2(): MutPtr<IkeextCertificateCredential1> = this.certificate

    public operator fun component3(): MutPtr<IkeextNameCredential0> = this.name

    public fun copy(presharedKey: MutPtr<IkeextPresharedKeyAuthentication1> = this.presharedKey, certificate: MutPtr<IkeextCertificateCredential1> = this.certificate, name: MutPtr<IkeextNameCredential0> = this.name): IkeextCredential20 = IkeextCredential20(presharedKeyCtorArg = presharedKey, certificateCtorArg = certificate, nameCtorArg = name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCredential20) return false
        if (this.presharedKey != other.presharedKey) return false
        if (this.certificate != other.certificate) return false
        if (this.name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.presharedKey.hashCode()
        result = 31 * result + this.certificate.hashCode()
        result = 31 * result + this.name.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            presharedKey: MutPtr<IkeextPresharedKeyAuthentication1> = MutPtr(0L),
            certificate: MutPtr<IkeextCertificateCredential1> = MutPtr(0L),
            name: MutPtr<IkeextNameCredential0> = MutPtr(0L),
        ): IkeextCredential20 =
            IkeextCredential20(
                presharedKeyCtorArg = presharedKey,
                certificateCtorArg = certificate,
                nameCtorArg = name,
            )
    }
}

public class IkeextCredentials0 internal constructor(
    public var numCredentials: UInt,
    credentialsCtorArg: MutPtr<IkeextCredentialPair0>,
) {
    public var credentials: MutPtr<IkeextCredentialPair0> = credentialsCtorArg
        internal set

    public constructor() : this(
        numCredentials = 0u,
        credentialsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numCredentials

    public operator fun component2(): MutPtr<IkeextCredentialPair0> = this.credentials

    public fun copy(numCredentials: UInt = this.numCredentials, credentials: MutPtr<IkeextCredentialPair0> = this.credentials): IkeextCredentials0 = IkeextCredentials0(numCredentials = numCredentials, credentialsCtorArg = credentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCredentials0) return false
        if (this.numCredentials != other.numCredentials) return false
        if (this.credentials != other.credentials) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numCredentials.hashCode()
        result = 31 * result + this.credentials.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCredentials0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCredentials0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCredentials0 =
                    IkeextCredentials0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextCredentialPair0>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCredentials0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numCredentials)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextCredentialPair0>(64)
                    ).writeNative(addr + 8L, value.credentials)
                }
            }

        public operator fun invoke(
            numCredentials: UInt = 0u,
            credentials: MutPtr<IkeextCredentialPair0> = MutPtr(0L),
        ): IkeextCredentials0 =
            IkeextCredentials0(
                numCredentials = numCredentials,
                credentialsCtorArg = credentials,
            )
    }
}

public class IkeextCredentials1 internal constructor(
    public var numCredentials: UInt,
    credentialsCtorArg: MutPtr<IkeextCredentialPair1>,
) {
    public var credentials: MutPtr<IkeextCredentialPair1> = credentialsCtorArg
        internal set

    public constructor() : this(
        numCredentials = 0u,
        credentialsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numCredentials

    public operator fun component2(): MutPtr<IkeextCredentialPair1> = this.credentials

    public fun copy(numCredentials: UInt = this.numCredentials, credentials: MutPtr<IkeextCredentialPair1> = this.credentials): IkeextCredentials1 = IkeextCredentials1(numCredentials = numCredentials, credentialsCtorArg = credentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCredentials1) return false
        if (this.numCredentials != other.numCredentials) return false
        if (this.credentials != other.credentials) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numCredentials.hashCode()
        result = 31 * result + this.credentials.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCredentials1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCredentials1> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCredentials1 =
                    IkeextCredentials1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextCredentialPair1>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCredentials1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numCredentials)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextCredentialPair1>(64)
                    ).writeNative(addr + 8L, value.credentials)
                }
            }

        public operator fun invoke(
            numCredentials: UInt = 0u,
            credentials: MutPtr<IkeextCredentialPair1> = MutPtr(0L),
        ): IkeextCredentials1 =
            IkeextCredentials1(
                numCredentials = numCredentials,
                credentialsCtorArg = credentials,
            )
    }
}

public class IkeextCredentials2 internal constructor(
    public var numCredentials: UInt,
    credentialsCtorArg: MutPtr<IkeextCredentialPair2>,
) {
    public var credentials: MutPtr<IkeextCredentialPair2> = credentialsCtorArg
        internal set

    public constructor() : this(
        numCredentials = 0u,
        credentialsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numCredentials

    public operator fun component2(): MutPtr<IkeextCredentialPair2> = this.credentials

    public fun copy(numCredentials: UInt = this.numCredentials, credentials: MutPtr<IkeextCredentialPair2> = this.credentials): IkeextCredentials2 = IkeextCredentials2(numCredentials = numCredentials, credentialsCtorArg = credentials)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextCredentials2) return false
        if (this.numCredentials != other.numCredentials) return false
        if (this.credentials != other.credentials) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numCredentials.hashCode()
        result = 31 * result + this.credentials.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCredentials2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextCredentials2> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextCredentials2 =
                    IkeextCredentials2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextCredentialPair2>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IkeextCredentials2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numCredentials)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextCredentialPair2>(64)
                    ).writeNative(addr + 8L, value.credentials)
                }
            }

        public operator fun invoke(
            numCredentials: UInt = 0u,
            credentials: MutPtr<IkeextCredentialPair2> = MutPtr(0L),
        ): IkeextCredentials2 =
            IkeextCredentials2(
                numCredentials = numCredentials,
                credentialsCtorArg = credentials,
            )
    }
}

public data class IkeextCredentialPair0(
    public var localCredentials: IkeextCredential0 = IkeextCredential0(),
    public var peerCredentials: IkeextCredential0 = IkeextCredential0(),
)

public data class IkeextCredentialPair1(
    public var localCredentials: IkeextCredential1 = IkeextCredential1(),
    public var peerCredentials: IkeextCredential1 = IkeextCredential1(),
)

public data class IkeextCredentialPair2(
    public var localCredentials: IkeextCredential2 = IkeextCredential2(),
    public var peerCredentials: IkeextCredential2 = IkeextCredential2(),
)

public data class IkeextEapAuthentication0(
    public var flags: IkeextEapAuthenticationFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextEapAuthentication0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextEapAuthentication0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextEapAuthentication0 =
                    IkeextEapAuthentication0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IkeextEapAuthentication0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public class IkeextEmPolicy0 internal constructor(
    public var numAuthenticationMethods: UInt,
    authenticationMethodsCtorArg: MutPtr<IkeextAuthenticationMethod0>,
    public var initiatorImpersonationType: IkeextAuthenticationImpersonationType,
) {
    public var authenticationMethods: MutPtr<IkeextAuthenticationMethod0> = authenticationMethodsCtorArg
        internal set

    public constructor() : this(
        numAuthenticationMethods = 0u,
        authenticationMethodsCtorArg = MutPtr(0L),
        initiatorImpersonationType = 0,
    )

    public operator fun component1(): UInt = this.numAuthenticationMethods

    public operator fun component2(): MutPtr<IkeextAuthenticationMethod0> = this.authenticationMethods

    public operator fun component3(): IkeextAuthenticationImpersonationType = this.initiatorImpersonationType

    public fun copy(numAuthenticationMethods: UInt = this.numAuthenticationMethods, authenticationMethods: MutPtr<IkeextAuthenticationMethod0> = this.authenticationMethods, initiatorImpersonationType: IkeextAuthenticationImpersonationType = this.initiatorImpersonationType): IkeextEmPolicy0 = IkeextEmPolicy0(numAuthenticationMethods = numAuthenticationMethods, authenticationMethodsCtorArg = authenticationMethods, initiatorImpersonationType = initiatorImpersonationType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextEmPolicy0) return false
        if (this.numAuthenticationMethods != other.numAuthenticationMethods) return false
        if (this.authenticationMethods != other.authenticationMethods) return false
        if (this.initiatorImpersonationType != other.initiatorImpersonationType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numAuthenticationMethods.hashCode()
        result = 31 * result + this.authenticationMethods.hashCode()
        result = 31 * result + this.initiatorImpersonationType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextEmPolicy0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextEmPolicy0> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextEmPolicy0 =
                    IkeextEmPolicy0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextAuthenticationMethod0>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IkeextEmPolicy0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numAuthenticationMethods)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextAuthenticationMethod0>(64)
                    ).writeNative(addr + 8L, value.authenticationMethods)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.initiatorImpersonationType)
                }
            }

        public operator fun invoke(
            numAuthenticationMethods: UInt = 0u,
            authenticationMethods: MutPtr<IkeextAuthenticationMethod0> = MutPtr(0L),
            initiatorImpersonationType: IkeextAuthenticationImpersonationType = 0,
        ): IkeextEmPolicy0 =
            IkeextEmPolicy0(
                numAuthenticationMethods = numAuthenticationMethods,
                authenticationMethodsCtorArg = authenticationMethods,
                initiatorImpersonationType = initiatorImpersonationType,
            )
    }
}

public class IkeextEmPolicy1 internal constructor(
    public var numAuthenticationMethods: UInt,
    authenticationMethodsCtorArg: MutPtr<IkeextAuthenticationMethod1>,
    public var initiatorImpersonationType: IkeextAuthenticationImpersonationType,
) {
    public var authenticationMethods: MutPtr<IkeextAuthenticationMethod1> = authenticationMethodsCtorArg
        internal set

    public constructor() : this(
        numAuthenticationMethods = 0u,
        authenticationMethodsCtorArg = MutPtr(0L),
        initiatorImpersonationType = 0,
    )

    public operator fun component1(): UInt = this.numAuthenticationMethods

    public operator fun component2(): MutPtr<IkeextAuthenticationMethod1> = this.authenticationMethods

    public operator fun component3(): IkeextAuthenticationImpersonationType = this.initiatorImpersonationType

    public fun copy(numAuthenticationMethods: UInt = this.numAuthenticationMethods, authenticationMethods: MutPtr<IkeextAuthenticationMethod1> = this.authenticationMethods, initiatorImpersonationType: IkeextAuthenticationImpersonationType = this.initiatorImpersonationType): IkeextEmPolicy1 = IkeextEmPolicy1(numAuthenticationMethods = numAuthenticationMethods, authenticationMethodsCtorArg = authenticationMethods, initiatorImpersonationType = initiatorImpersonationType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextEmPolicy1) return false
        if (this.numAuthenticationMethods != other.numAuthenticationMethods) return false
        if (this.authenticationMethods != other.authenticationMethods) return false
        if (this.initiatorImpersonationType != other.initiatorImpersonationType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numAuthenticationMethods.hashCode()
        result = 31 * result + this.authenticationMethods.hashCode()
        result = 31 * result + this.initiatorImpersonationType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextEmPolicy1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextEmPolicy1> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextEmPolicy1 =
                    IkeextEmPolicy1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextAuthenticationMethod1>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IkeextEmPolicy1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numAuthenticationMethods)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextAuthenticationMethod1>(64)
                    ).writeNative(addr + 8L, value.authenticationMethods)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.initiatorImpersonationType)
                }
            }

        public operator fun invoke(
            numAuthenticationMethods: UInt = 0u,
            authenticationMethods: MutPtr<IkeextAuthenticationMethod1> = MutPtr(0L),
            initiatorImpersonationType: IkeextAuthenticationImpersonationType = 0,
        ): IkeextEmPolicy1 =
            IkeextEmPolicy1(
                numAuthenticationMethods = numAuthenticationMethods,
                authenticationMethodsCtorArg = authenticationMethods,
                initiatorImpersonationType = initiatorImpersonationType,
            )
    }
}

public class IkeextEmPolicy2 internal constructor(
    public var numAuthenticationMethods: UInt,
    authenticationMethodsCtorArg: MutPtr<IkeextAuthenticationMethod2>,
    public var initiatorImpersonationType: IkeextAuthenticationImpersonationType,
) {
    public var authenticationMethods: MutPtr<IkeextAuthenticationMethod2> = authenticationMethodsCtorArg
        internal set

    public constructor() : this(
        numAuthenticationMethods = 0u,
        authenticationMethodsCtorArg = MutPtr(0L),
        initiatorImpersonationType = 0,
    )

    public operator fun component1(): UInt = this.numAuthenticationMethods

    public operator fun component2(): MutPtr<IkeextAuthenticationMethod2> = this.authenticationMethods

    public operator fun component3(): IkeextAuthenticationImpersonationType = this.initiatorImpersonationType

    public fun copy(numAuthenticationMethods: UInt = this.numAuthenticationMethods, authenticationMethods: MutPtr<IkeextAuthenticationMethod2> = this.authenticationMethods, initiatorImpersonationType: IkeextAuthenticationImpersonationType = this.initiatorImpersonationType): IkeextEmPolicy2 = IkeextEmPolicy2(numAuthenticationMethods = numAuthenticationMethods, authenticationMethodsCtorArg = authenticationMethods, initiatorImpersonationType = initiatorImpersonationType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextEmPolicy2) return false
        if (this.numAuthenticationMethods != other.numAuthenticationMethods) return false
        if (this.authenticationMethods != other.authenticationMethods) return false
        if (this.initiatorImpersonationType != other.initiatorImpersonationType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numAuthenticationMethods.hashCode()
        result = 31 * result + this.authenticationMethods.hashCode()
        result = 31 * result + this.initiatorImpersonationType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextEmPolicy2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextEmPolicy2> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextEmPolicy2 =
                    IkeextEmPolicy2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextAuthenticationMethod2>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IkeextEmPolicy2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numAuthenticationMethods)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextAuthenticationMethod2>(64)
                    ).writeNative(addr + 8L, value.authenticationMethods)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.initiatorImpersonationType)
                }
            }

        public operator fun invoke(
            numAuthenticationMethods: UInt = 0u,
            authenticationMethods: MutPtr<IkeextAuthenticationMethod2> = MutPtr(0L),
            initiatorImpersonationType: IkeextAuthenticationImpersonationType = 0,
        ): IkeextEmPolicy2 =
            IkeextEmPolicy2(
                numAuthenticationMethods = numAuthenticationMethods,
                authenticationMethodsCtorArg = authenticationMethods,
                initiatorImpersonationType = initiatorImpersonationType,
            )
    }
}

public data class IkeextIntegrityAlgorithm0(
    public var algoIdentifier: IkeextIntegrityType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextIntegrityAlgorithm0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextIntegrityAlgorithm0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextIntegrityAlgorithm0 =
                    IkeextIntegrityAlgorithm0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IkeextIntegrityAlgorithm0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.algoIdentifier)
                }
            }
    }
}

public class IkeextIpv6CgaAuthentication0 internal constructor(
    keyContainerNameCtorArg: Pwstr,
    cspNameCtorArg: Pwstr,
    public var cspType: UInt,
    public var cgaModifier: FwpByteArray16,
    public var cgaCollisionCount: UByte,
) {
    public var keyContainerName: Pwstr = keyContainerNameCtorArg
        internal set

    public var cspName: Pwstr = cspNameCtorArg
        internal set

    public constructor() : this(
        keyContainerNameCtorArg = MutPtr(0L),
        cspNameCtorArg = MutPtr(0L),
        cspType = 0u,
        cgaModifier = FwpByteArray16(),
        cgaCollisionCount = 0u,
    )

    public operator fun component1(): Pwstr = this.keyContainerName

    public operator fun component2(): Pwstr = this.cspName

    public operator fun component3(): UInt = this.cspType

    public operator fun component4(): FwpByteArray16 = this.cgaModifier

    public operator fun component5(): UByte = this.cgaCollisionCount

    public fun copy(keyContainerName: Pwstr = this.keyContainerName, cspName: Pwstr = this.cspName, cspType: UInt = this.cspType, cgaModifier: FwpByteArray16 = this.cgaModifier, cgaCollisionCount: UByte = this.cgaCollisionCount): IkeextIpv6CgaAuthentication0 = IkeextIpv6CgaAuthentication0(keyContainerNameCtorArg = keyContainerName, cspNameCtorArg = cspName, cspType = cspType, cgaModifier = cgaModifier, cgaCollisionCount = cgaCollisionCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextIpv6CgaAuthentication0) return false
        if (this.keyContainerName != other.keyContainerName) return false
        if (this.cspName != other.cspName) return false
        if (this.cspType != other.cspType) return false
        if (this.cgaModifier != other.cgaModifier) return false
        if (this.cgaCollisionCount != other.cgaCollisionCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyContainerName.hashCode()
        result = 31 * result + this.cspName.hashCode()
        result = 31 * result + this.cspType.hashCode()
        result = 31 * result + this.cgaModifier.hashCode()
        result = 31 * result + this.cgaCollisionCount.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            keyContainerName: Pwstr = MutPtr(0L),
            cspName: Pwstr = MutPtr(0L),
            cspType: UInt = 0u,
            cgaModifier: FwpByteArray16 = FwpByteArray16(),
            cgaCollisionCount: UByte = 0u,
        ): IkeextIpv6CgaAuthentication0 =
            IkeextIpv6CgaAuthentication0(
                keyContainerNameCtorArg = keyContainerName,
                cspNameCtorArg = cspName,
                cspType = cspType,
                cgaModifier = cgaModifier,
                cgaCollisionCount = cgaCollisionCount,
            )
    }
}

public data class IkeextIpVersionSpecificCommonStatistics0(
    public var totalSocketReceiveFailures: UInt = 0u,
    public var totalSocketSendFailures: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextIpVersionSpecificCommonStatistics0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextIpVersionSpecificCommonStatistics0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextIpVersionSpecificCommonStatistics0 =
                    IkeextIpVersionSpecificCommonStatistics0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IkeextIpVersionSpecificCommonStatistics0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.totalSocketReceiveFailures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalSocketSendFailures)
                }
            }
    }
}

public data class IkeextIpVersionSpecificCommonStatistics1(
    public var totalSocketReceiveFailures: UInt = 0u,
    public var totalSocketSendFailures: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextIpVersionSpecificCommonStatistics1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextIpVersionSpecificCommonStatistics1> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextIpVersionSpecificCommonStatistics1 =
                    IkeextIpVersionSpecificCommonStatistics1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IkeextIpVersionSpecificCommonStatistics1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.totalSocketReceiveFailures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalSocketSendFailures)
                }
            }
    }
}

public class IkeextIpVersionSpecificKeymoduleStatistics0(
    public var currentActiveMainModes: UInt = 0u,
    public var totalMainModesStarted: UInt = 0u,
    public var totalSuccessfulMainModes: UInt = 0u,
    public var totalFailedMainModes: UInt = 0u,
    public var totalResponderMainModes: UInt = 0u,
    public var currentNewResponderMainModes: UInt = 0u,
    public var currentActiveQuickModes: UInt = 0u,
    public var totalQuickModesStarted: UInt = 0u,
    public var totalSuccessfulQuickModes: UInt = 0u,
    public var totalFailedQuickModes: UInt = 0u,
    public var totalAcquires: UInt = 0u,
    public var totalReinitAcquires: UInt = 0u,
    public var currentActiveExtendedModes: UInt = 0u,
    public var totalExtendedModesStarted: UInt = 0u,
    public var totalSuccessfulExtendedModes: UInt = 0u,
    public var totalFailedExtendedModes: UInt = 0u,
    public var totalImpersonationExtendedModes: UInt = 0u,
    public var totalImpersonationMainModes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextIpVersionSpecificKeymoduleStatistics0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextIpVersionSpecificKeymoduleStatistics0> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextIpVersionSpecificKeymoduleStatistics0 =
                    IkeextIpVersionSpecificKeymoduleStatistics0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: IkeextIpVersionSpecificKeymoduleStatistics0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.currentActiveMainModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalMainModesStarted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.totalSuccessfulMainModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.totalFailedMainModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.totalResponderMainModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.currentNewResponderMainModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.currentActiveQuickModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.totalQuickModesStarted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.totalSuccessfulQuickModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.totalFailedQuickModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.totalAcquires)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.totalReinitAcquires)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.currentActiveExtendedModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.totalExtendedModesStarted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.totalSuccessfulExtendedModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.totalFailedExtendedModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.totalImpersonationExtendedModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.totalImpersonationMainModes)
                }
            }
    }
}

public class IkeextIpVersionSpecificKeymoduleStatistics1(
    public var currentActiveMainModes: UInt = 0u,
    public var totalMainModesStarted: UInt = 0u,
    public var totalSuccessfulMainModes: UInt = 0u,
    public var totalFailedMainModes: UInt = 0u,
    public var totalResponderMainModes: UInt = 0u,
    public var currentNewResponderMainModes: UInt = 0u,
    public var currentActiveQuickModes: UInt = 0u,
    public var totalQuickModesStarted: UInt = 0u,
    public var totalSuccessfulQuickModes: UInt = 0u,
    public var totalFailedQuickModes: UInt = 0u,
    public var totalAcquires: UInt = 0u,
    public var totalReinitAcquires: UInt = 0u,
    public var currentActiveExtendedModes: UInt = 0u,
    public var totalExtendedModesStarted: UInt = 0u,
    public var totalSuccessfulExtendedModes: UInt = 0u,
    public var totalFailedExtendedModes: UInt = 0u,
    public var totalImpersonationExtendedModes: UInt = 0u,
    public var totalImpersonationMainModes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextIpVersionSpecificKeymoduleStatistics1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextIpVersionSpecificKeymoduleStatistics1> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextIpVersionSpecificKeymoduleStatistics1 =
                    IkeextIpVersionSpecificKeymoduleStatistics1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: IkeextIpVersionSpecificKeymoduleStatistics1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.currentActiveMainModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.totalMainModesStarted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.totalSuccessfulMainModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.totalFailedMainModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.totalResponderMainModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.currentNewResponderMainModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.currentActiveQuickModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.totalQuickModesStarted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.totalSuccessfulQuickModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.totalFailedQuickModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.totalAcquires)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.totalReinitAcquires)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.currentActiveExtendedModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.totalExtendedModesStarted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.totalSuccessfulExtendedModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.totalFailedExtendedModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.totalImpersonationExtendedModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.totalImpersonationMainModes)
                }
            }
    }
}

public data class IkeextKerberosAuthentication0(
    public var flags: IkeextKerberosAuthenticationFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextKerberosAuthentication0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextKerberosAuthentication0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextKerberosAuthentication0 =
                    IkeextKerberosAuthentication0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IkeextKerberosAuthentication0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public class IkeextKerberosAuthentication1 internal constructor(
    public var flags: IkeextKerberosAuthenticationFlags,
    proxyServerCtorArg: Pwstr,
) {
    public var proxyServer: Pwstr = proxyServerCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        proxyServerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IkeextKerberosAuthenticationFlags = this.flags

    public operator fun component2(): Pwstr = this.proxyServer

    public fun copy(flags: IkeextKerberosAuthenticationFlags = this.flags, proxyServer: Pwstr = this.proxyServer): IkeextKerberosAuthentication1 = IkeextKerberosAuthentication1(flags = flags, proxyServerCtorArg = proxyServer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextKerberosAuthentication1) return false
        if (this.flags != other.flags) return false
        if (this.proxyServer != other.proxyServer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.proxyServer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: IkeextKerberosAuthenticationFlags = 0u,
            proxyServer: Pwstr = MutPtr(0L),
        ): IkeextKerberosAuthentication1 =
            IkeextKerberosAuthentication1(
                flags = flags,
                proxyServerCtorArg = proxyServer,
            )
    }
}

public data class IkeextKeymoduleStatistics0(
    public var v4Statistics: IkeextIpVersionSpecificKeymoduleStatistics0 = IkeextIpVersionSpecificKeymoduleStatistics0(),
    public var v6Statistics: IkeextIpVersionSpecificKeymoduleStatistics0 = IkeextIpVersionSpecificKeymoduleStatistics0(),
    public var errorFrequencyTable: UIntArray = UIntArray(97),
    public var mainModeNegotiationTime: UInt = 0u,
    public var quickModeNegotiationTime: UInt = 0u,
    public var extendedModeNegotiationTime: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextKeymoduleStatistics0) return false
        if (this.v4Statistics != other.v4Statistics) return false
        if (this.v6Statistics != other.v6Statistics) return false
        if (!this.errorFrequencyTable.contentEquals(other.errorFrequencyTable)) return false
        if (this.mainModeNegotiationTime != other.mainModeNegotiationTime) return false
        if (this.quickModeNegotiationTime != other.quickModeNegotiationTime) return false
        if (this.extendedModeNegotiationTime != other.extendedModeNegotiationTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.v4Statistics.hashCode()
        result = 31 * result + this.v6Statistics.hashCode()
        result = 31 * result + this.errorFrequencyTable.contentHashCode()
        result = 31 * result + this.mainModeNegotiationTime.hashCode()
        result = 31 * result + this.quickModeNegotiationTime.hashCode()
        result = 31 * result + this.extendedModeNegotiationTime.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextKeymoduleStatistics0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextKeymoduleStatistics0> {
                override val sizeBytes: Long = 544L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextKeymoduleStatistics0 =
                    IkeextKeymoduleStatistics0(
                        (IkeextIpVersionSpecificKeymoduleStatistics0.typeLayout()).readNative(addr),
                        (IkeextIpVersionSpecificKeymoduleStatistics0.typeLayout()).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (97).toInt())
                        ).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 532L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 536L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 540L),
                    )
                override fun writeNative(addr: Long, value: IkeextKeymoduleStatistics0) {
                    (IkeextIpVersionSpecificKeymoduleStatistics0.typeLayout()).writeNative(addr, value.v4Statistics)
                    (IkeextIpVersionSpecificKeymoduleStatistics0.typeLayout()).writeNative(addr + 72L, value.v6Statistics)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (97).toInt())
                    ).writeNative(addr + 144L, value.errorFrequencyTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 532L, value.mainModeNegotiationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 536L, value.quickModeNegotiationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 540L, value.extendedModeNegotiationTime)
                }
            }
    }
}

public data class IkeextKeymoduleStatistics1(
    public var v4Statistics: IkeextIpVersionSpecificKeymoduleStatistics1 = IkeextIpVersionSpecificKeymoduleStatistics1(),
    public var v6Statistics: IkeextIpVersionSpecificKeymoduleStatistics1 = IkeextIpVersionSpecificKeymoduleStatistics1(),
    public var errorFrequencyTable: UIntArray = UIntArray(97),
    public var mainModeNegotiationTime: UInt = 0u,
    public var quickModeNegotiationTime: UInt = 0u,
    public var extendedModeNegotiationTime: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextKeymoduleStatistics1) return false
        if (this.v4Statistics != other.v4Statistics) return false
        if (this.v6Statistics != other.v6Statistics) return false
        if (!this.errorFrequencyTable.contentEquals(other.errorFrequencyTable)) return false
        if (this.mainModeNegotiationTime != other.mainModeNegotiationTime) return false
        if (this.quickModeNegotiationTime != other.quickModeNegotiationTime) return false
        if (this.extendedModeNegotiationTime != other.extendedModeNegotiationTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.v4Statistics.hashCode()
        result = 31 * result + this.v6Statistics.hashCode()
        result = 31 * result + this.errorFrequencyTable.contentHashCode()
        result = 31 * result + this.mainModeNegotiationTime.hashCode()
        result = 31 * result + this.quickModeNegotiationTime.hashCode()
        result = 31 * result + this.extendedModeNegotiationTime.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextKeymoduleStatistics1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextKeymoduleStatistics1> {
                override val sizeBytes: Long = 544L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextKeymoduleStatistics1 =
                    IkeextKeymoduleStatistics1(
                        (IkeextIpVersionSpecificKeymoduleStatistics1.typeLayout()).readNative(addr),
                        (IkeextIpVersionSpecificKeymoduleStatistics1.typeLayout()).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (97).toInt())
                        ).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 532L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 536L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 540L),
                    )
                override fun writeNative(addr: Long, value: IkeextKeymoduleStatistics1) {
                    (IkeextIpVersionSpecificKeymoduleStatistics1.typeLayout()).writeNative(addr, value.v4Statistics)
                    (IkeextIpVersionSpecificKeymoduleStatistics1.typeLayout()).writeNative(addr + 72L, value.v6Statistics)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (97).toInt())
                    ).writeNative(addr + 144L, value.errorFrequencyTable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 532L, value.mainModeNegotiationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 536L, value.quickModeNegotiationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 540L, value.extendedModeNegotiationTime)
                }
            }
    }
}

public class IkeextNameCredential0 internal constructor(
    principalNameCtorArg: Pwstr,
) {
    public var principalName: Pwstr = principalNameCtorArg
        internal set

    public constructor() : this(
        principalNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.principalName

    public fun copy(principalName: Pwstr = this.principalName): IkeextNameCredential0 = IkeextNameCredential0(principalNameCtorArg = principalName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextNameCredential0) return false
        if (this.principalName != other.principalName) return false
        return true
    }

    override fun hashCode(): Int = this.principalName.hashCode()

    public companion object {
        public operator fun invoke(
            principalName: Pwstr = MutPtr(0L),
        ): IkeextNameCredential0 =
            IkeextNameCredential0(
                principalNameCtorArg = principalName,
            )
    }
}

public data class IkeextNtlmV2Authentication0(
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextNtlmV2Authentication0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextNtlmV2Authentication0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextNtlmV2Authentication0 =
                    IkeextNtlmV2Authentication0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IkeextNtlmV2Authentication0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public class IkeextPolicy0 internal constructor(
    public var softExpirationTime: UInt,
    public var numAuthenticationMethods: UInt,
    authenticationMethodsCtorArg: MutPtr<IkeextAuthenticationMethod0>,
    public var initiatorImpersonationType: IkeextAuthenticationImpersonationType,
    public var numIkeProposals: UInt,
    ikeProposalsCtorArg: MutPtr<IkeextProposal0>,
    public var flags: IkeextPolicyFlag,
    public var maxDynamicFilters: UInt,
) {
    public var authenticationMethods: MutPtr<IkeextAuthenticationMethod0> = authenticationMethodsCtorArg
        internal set

    public var ikeProposals: MutPtr<IkeextProposal0> = ikeProposalsCtorArg
        internal set

    public constructor() : this(
        softExpirationTime = 0u,
        numAuthenticationMethods = 0u,
        authenticationMethodsCtorArg = MutPtr(0L),
        initiatorImpersonationType = 0,
        numIkeProposals = 0u,
        ikeProposalsCtorArg = MutPtr(0L),
        flags = 0u,
        maxDynamicFilters = 0u,
    )

    public operator fun component1(): UInt = this.softExpirationTime

    public operator fun component2(): UInt = this.numAuthenticationMethods

    public operator fun component3(): MutPtr<IkeextAuthenticationMethod0> = this.authenticationMethods

    public operator fun component4(): IkeextAuthenticationImpersonationType = this.initiatorImpersonationType

    public operator fun component5(): UInt = this.numIkeProposals

    public operator fun component6(): MutPtr<IkeextProposal0> = this.ikeProposals

    public operator fun component7(): IkeextPolicyFlag = this.flags

    public operator fun component8(): UInt = this.maxDynamicFilters

    public fun copy(softExpirationTime: UInt = this.softExpirationTime, numAuthenticationMethods: UInt = this.numAuthenticationMethods, authenticationMethods: MutPtr<IkeextAuthenticationMethod0> = this.authenticationMethods, initiatorImpersonationType: IkeextAuthenticationImpersonationType = this.initiatorImpersonationType, numIkeProposals: UInt = this.numIkeProposals, ikeProposals: MutPtr<IkeextProposal0> = this.ikeProposals, flags: IkeextPolicyFlag = this.flags, maxDynamicFilters: UInt = this.maxDynamicFilters): IkeextPolicy0 = IkeextPolicy0(softExpirationTime = softExpirationTime, numAuthenticationMethods = numAuthenticationMethods, authenticationMethodsCtorArg = authenticationMethods, initiatorImpersonationType = initiatorImpersonationType, numIkeProposals = numIkeProposals, ikeProposalsCtorArg = ikeProposals, flags = flags, maxDynamicFilters = maxDynamicFilters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextPolicy0) return false
        if (this.softExpirationTime != other.softExpirationTime) return false
        if (this.numAuthenticationMethods != other.numAuthenticationMethods) return false
        if (this.authenticationMethods != other.authenticationMethods) return false
        if (this.initiatorImpersonationType != other.initiatorImpersonationType) return false
        if (this.numIkeProposals != other.numIkeProposals) return false
        if (this.ikeProposals != other.ikeProposals) return false
        if (this.flags != other.flags) return false
        if (this.maxDynamicFilters != other.maxDynamicFilters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.softExpirationTime.hashCode()
        result = 31 * result + this.numAuthenticationMethods.hashCode()
        result = 31 * result + this.authenticationMethods.hashCode()
        result = 31 * result + this.initiatorImpersonationType.hashCode()
        result = 31 * result + this.numIkeProposals.hashCode()
        result = 31 * result + this.ikeProposals.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.maxDynamicFilters.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextPolicy0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextPolicy0> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextPolicy0 =
                    IkeextPolicy0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextAuthenticationMethod0>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextProposal0>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: IkeextPolicy0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.softExpirationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numAuthenticationMethods)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextAuthenticationMethod0>(64)
                    ).writeNative(addr + 8L, value.authenticationMethods)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.initiatorImpersonationType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.numIkeProposals)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextProposal0>(64)
                    ).writeNative(addr + 24L, value.ikeProposals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.maxDynamicFilters)
                }
            }

        public operator fun invoke(
            softExpirationTime: UInt = 0u,
            numAuthenticationMethods: UInt = 0u,
            authenticationMethods: MutPtr<IkeextAuthenticationMethod0> = MutPtr(0L),
            initiatorImpersonationType: IkeextAuthenticationImpersonationType = 0,
            numIkeProposals: UInt = 0u,
            ikeProposals: MutPtr<IkeextProposal0> = MutPtr(0L),
            flags: IkeextPolicyFlag = 0u,
            maxDynamicFilters: UInt = 0u,
        ): IkeextPolicy0 =
            IkeextPolicy0(
                softExpirationTime = softExpirationTime,
                numAuthenticationMethods = numAuthenticationMethods,
                authenticationMethodsCtorArg = authenticationMethods,
                initiatorImpersonationType = initiatorImpersonationType,
                numIkeProposals = numIkeProposals,
                ikeProposalsCtorArg = ikeProposals,
                flags = flags,
                maxDynamicFilters = maxDynamicFilters,
            )
    }
}

public class IkeextPolicy1 internal constructor(
    public var softExpirationTime: UInt,
    public var numAuthenticationMethods: UInt,
    authenticationMethodsCtorArg: MutPtr<IkeextAuthenticationMethod1>,
    public var initiatorImpersonationType: IkeextAuthenticationImpersonationType,
    public var numIkeProposals: UInt,
    ikeProposalsCtorArg: MutPtr<IkeextProposal0>,
    public var flags: IkeextPolicyFlag,
    public var maxDynamicFilters: UInt,
    public var retransmitDurationSecs: UInt,
) {
    public var authenticationMethods: MutPtr<IkeextAuthenticationMethod1> = authenticationMethodsCtorArg
        internal set

    public var ikeProposals: MutPtr<IkeextProposal0> = ikeProposalsCtorArg
        internal set

    public constructor() : this(
        softExpirationTime = 0u,
        numAuthenticationMethods = 0u,
        authenticationMethodsCtorArg = MutPtr(0L),
        initiatorImpersonationType = 0,
        numIkeProposals = 0u,
        ikeProposalsCtorArg = MutPtr(0L),
        flags = 0u,
        maxDynamicFilters = 0u,
        retransmitDurationSecs = 0u,
    )

    public operator fun component1(): UInt = this.softExpirationTime

    public operator fun component2(): UInt = this.numAuthenticationMethods

    public operator fun component3(): MutPtr<IkeextAuthenticationMethod1> = this.authenticationMethods

    public operator fun component4(): IkeextAuthenticationImpersonationType = this.initiatorImpersonationType

    public operator fun component5(): UInt = this.numIkeProposals

    public operator fun component6(): MutPtr<IkeextProposal0> = this.ikeProposals

    public operator fun component7(): IkeextPolicyFlag = this.flags

    public operator fun component8(): UInt = this.maxDynamicFilters

    public operator fun component9(): UInt = this.retransmitDurationSecs

    public fun copy(softExpirationTime: UInt = this.softExpirationTime, numAuthenticationMethods: UInt = this.numAuthenticationMethods, authenticationMethods: MutPtr<IkeextAuthenticationMethod1> = this.authenticationMethods, initiatorImpersonationType: IkeextAuthenticationImpersonationType = this.initiatorImpersonationType, numIkeProposals: UInt = this.numIkeProposals, ikeProposals: MutPtr<IkeextProposal0> = this.ikeProposals, flags: IkeextPolicyFlag = this.flags, maxDynamicFilters: UInt = this.maxDynamicFilters, retransmitDurationSecs: UInt = this.retransmitDurationSecs): IkeextPolicy1 = IkeextPolicy1(softExpirationTime = softExpirationTime, numAuthenticationMethods = numAuthenticationMethods, authenticationMethodsCtorArg = authenticationMethods, initiatorImpersonationType = initiatorImpersonationType, numIkeProposals = numIkeProposals, ikeProposalsCtorArg = ikeProposals, flags = flags, maxDynamicFilters = maxDynamicFilters, retransmitDurationSecs = retransmitDurationSecs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextPolicy1) return false
        if (this.softExpirationTime != other.softExpirationTime) return false
        if (this.numAuthenticationMethods != other.numAuthenticationMethods) return false
        if (this.authenticationMethods != other.authenticationMethods) return false
        if (this.initiatorImpersonationType != other.initiatorImpersonationType) return false
        if (this.numIkeProposals != other.numIkeProposals) return false
        if (this.ikeProposals != other.ikeProposals) return false
        if (this.flags != other.flags) return false
        if (this.maxDynamicFilters != other.maxDynamicFilters) return false
        if (this.retransmitDurationSecs != other.retransmitDurationSecs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.softExpirationTime.hashCode()
        result = 31 * result + this.numAuthenticationMethods.hashCode()
        result = 31 * result + this.authenticationMethods.hashCode()
        result = 31 * result + this.initiatorImpersonationType.hashCode()
        result = 31 * result + this.numIkeProposals.hashCode()
        result = 31 * result + this.ikeProposals.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.maxDynamicFilters.hashCode()
        result = 31 * result + this.retransmitDurationSecs.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextPolicy1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextPolicy1> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextPolicy1 =
                    IkeextPolicy1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextAuthenticationMethod1>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextProposal0>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: IkeextPolicy1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.softExpirationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numAuthenticationMethods)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextAuthenticationMethod1>(64)
                    ).writeNative(addr + 8L, value.authenticationMethods)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.initiatorImpersonationType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.numIkeProposals)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextProposal0>(64)
                    ).writeNative(addr + 24L, value.ikeProposals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.maxDynamicFilters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.retransmitDurationSecs)
                }
            }

        public operator fun invoke(
            softExpirationTime: UInt = 0u,
            numAuthenticationMethods: UInt = 0u,
            authenticationMethods: MutPtr<IkeextAuthenticationMethod1> = MutPtr(0L),
            initiatorImpersonationType: IkeextAuthenticationImpersonationType = 0,
            numIkeProposals: UInt = 0u,
            ikeProposals: MutPtr<IkeextProposal0> = MutPtr(0L),
            flags: IkeextPolicyFlag = 0u,
            maxDynamicFilters: UInt = 0u,
            retransmitDurationSecs: UInt = 0u,
        ): IkeextPolicy1 =
            IkeextPolicy1(
                softExpirationTime = softExpirationTime,
                numAuthenticationMethods = numAuthenticationMethods,
                authenticationMethodsCtorArg = authenticationMethods,
                initiatorImpersonationType = initiatorImpersonationType,
                numIkeProposals = numIkeProposals,
                ikeProposalsCtorArg = ikeProposals,
                flags = flags,
                maxDynamicFilters = maxDynamicFilters,
                retransmitDurationSecs = retransmitDurationSecs,
            )
    }
}

public class IkeextPolicy2 internal constructor(
    public var softExpirationTime: UInt,
    public var numAuthenticationMethods: UInt,
    authenticationMethodsCtorArg: MutPtr<IkeextAuthenticationMethod2>,
    public var initiatorImpersonationType: IkeextAuthenticationImpersonationType,
    public var numIkeProposals: UInt,
    ikeProposalsCtorArg: MutPtr<IkeextProposal0>,
    public var flags: IkeextPolicyFlag,
    public var maxDynamicFilters: UInt,
    public var retransmitDurationSecs: UInt,
) {
    public var authenticationMethods: MutPtr<IkeextAuthenticationMethod2> = authenticationMethodsCtorArg
        internal set

    public var ikeProposals: MutPtr<IkeextProposal0> = ikeProposalsCtorArg
        internal set

    public constructor() : this(
        softExpirationTime = 0u,
        numAuthenticationMethods = 0u,
        authenticationMethodsCtorArg = MutPtr(0L),
        initiatorImpersonationType = 0,
        numIkeProposals = 0u,
        ikeProposalsCtorArg = MutPtr(0L),
        flags = 0u,
        maxDynamicFilters = 0u,
        retransmitDurationSecs = 0u,
    )

    public operator fun component1(): UInt = this.softExpirationTime

    public operator fun component2(): UInt = this.numAuthenticationMethods

    public operator fun component3(): MutPtr<IkeextAuthenticationMethod2> = this.authenticationMethods

    public operator fun component4(): IkeextAuthenticationImpersonationType = this.initiatorImpersonationType

    public operator fun component5(): UInt = this.numIkeProposals

    public operator fun component6(): MutPtr<IkeextProposal0> = this.ikeProposals

    public operator fun component7(): IkeextPolicyFlag = this.flags

    public operator fun component8(): UInt = this.maxDynamicFilters

    public operator fun component9(): UInt = this.retransmitDurationSecs

    public fun copy(softExpirationTime: UInt = this.softExpirationTime, numAuthenticationMethods: UInt = this.numAuthenticationMethods, authenticationMethods: MutPtr<IkeextAuthenticationMethod2> = this.authenticationMethods, initiatorImpersonationType: IkeextAuthenticationImpersonationType = this.initiatorImpersonationType, numIkeProposals: UInt = this.numIkeProposals, ikeProposals: MutPtr<IkeextProposal0> = this.ikeProposals, flags: IkeextPolicyFlag = this.flags, maxDynamicFilters: UInt = this.maxDynamicFilters, retransmitDurationSecs: UInt = this.retransmitDurationSecs): IkeextPolicy2 = IkeextPolicy2(softExpirationTime = softExpirationTime, numAuthenticationMethods = numAuthenticationMethods, authenticationMethodsCtorArg = authenticationMethods, initiatorImpersonationType = initiatorImpersonationType, numIkeProposals = numIkeProposals, ikeProposalsCtorArg = ikeProposals, flags = flags, maxDynamicFilters = maxDynamicFilters, retransmitDurationSecs = retransmitDurationSecs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextPolicy2) return false
        if (this.softExpirationTime != other.softExpirationTime) return false
        if (this.numAuthenticationMethods != other.numAuthenticationMethods) return false
        if (this.authenticationMethods != other.authenticationMethods) return false
        if (this.initiatorImpersonationType != other.initiatorImpersonationType) return false
        if (this.numIkeProposals != other.numIkeProposals) return false
        if (this.ikeProposals != other.ikeProposals) return false
        if (this.flags != other.flags) return false
        if (this.maxDynamicFilters != other.maxDynamicFilters) return false
        if (this.retransmitDurationSecs != other.retransmitDurationSecs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.softExpirationTime.hashCode()
        result = 31 * result + this.numAuthenticationMethods.hashCode()
        result = 31 * result + this.authenticationMethods.hashCode()
        result = 31 * result + this.initiatorImpersonationType.hashCode()
        result = 31 * result + this.numIkeProposals.hashCode()
        result = 31 * result + this.ikeProposals.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.maxDynamicFilters.hashCode()
        result = 31 * result + this.retransmitDurationSecs.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextPolicy2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextPolicy2> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextPolicy2 =
                    IkeextPolicy2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextAuthenticationMethod2>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IkeextProposal0>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: IkeextPolicy2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.softExpirationTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numAuthenticationMethods)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextAuthenticationMethod2>(64)
                    ).writeNative(addr + 8L, value.authenticationMethods)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.initiatorImpersonationType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.numIkeProposals)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IkeextProposal0>(64)
                    ).writeNative(addr + 24L, value.ikeProposals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.maxDynamicFilters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.retransmitDurationSecs)
                }
            }

        public operator fun invoke(
            softExpirationTime: UInt = 0u,
            numAuthenticationMethods: UInt = 0u,
            authenticationMethods: MutPtr<IkeextAuthenticationMethod2> = MutPtr(0L),
            initiatorImpersonationType: IkeextAuthenticationImpersonationType = 0,
            numIkeProposals: UInt = 0u,
            ikeProposals: MutPtr<IkeextProposal0> = MutPtr(0L),
            flags: IkeextPolicyFlag = 0u,
            maxDynamicFilters: UInt = 0u,
            retransmitDurationSecs: UInt = 0u,
        ): IkeextPolicy2 =
            IkeextPolicy2(
                softExpirationTime = softExpirationTime,
                numAuthenticationMethods = numAuthenticationMethods,
                authenticationMethodsCtorArg = authenticationMethods,
                initiatorImpersonationType = initiatorImpersonationType,
                numIkeProposals = numIkeProposals,
                ikeProposalsCtorArg = ikeProposals,
                flags = flags,
                maxDynamicFilters = maxDynamicFilters,
                retransmitDurationSecs = retransmitDurationSecs,
            )
    }
}

public data class IkeextPresharedKeyAuthentication0(
    public var presharedKey: FwpByteBlob = FwpByteBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextPresharedKeyAuthentication0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextPresharedKeyAuthentication0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextPresharedKeyAuthentication0 =
                    IkeextPresharedKeyAuthentication0(
                        (FwpByteBlob.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IkeextPresharedKeyAuthentication0) {
                    (FwpByteBlob.typeLayout()).writeNative(addr, value.presharedKey)
                }
            }
    }
}

public data class IkeextPresharedKeyAuthentication1(
    public var presharedKey: FwpByteBlob = FwpByteBlob(),
    public var flags: IkeextPresharedKeyAuthenticationFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextPresharedKeyAuthentication1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextPresharedKeyAuthentication1> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IkeextPresharedKeyAuthentication1 =
                    IkeextPresharedKeyAuthentication1(
                        (FwpByteBlob.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IkeextPresharedKeyAuthentication1) {
                    (FwpByteBlob.typeLayout()).writeNative(addr, value.presharedKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }
    }
}

public data class IkeextProposal0(
    public var cipherAlgorithm: IkeextCipherAlgorithm0 = IkeextCipherAlgorithm0(),
    public var integrityAlgorithm: IkeextIntegrityAlgorithm0 = IkeextIntegrityAlgorithm0(),
    public var maxLifetimeSeconds: UInt = 0u,
    public var dhGroup: IkeextDhGroup = 0,
    public var quickModeLimit: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextProposal0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextProposal0> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextProposal0 =
                    IkeextProposal0(
                        (IkeextCipherAlgorithm0.typeLayout()).readNative(addr),
                        (IkeextIntegrityAlgorithm0.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IkeextProposal0) {
                    (IkeextCipherAlgorithm0.typeLayout()).writeNative(addr, value.cipherAlgorithm)
                    (IkeextIntegrityAlgorithm0.typeLayout()).writeNative(addr + 12L, value.integrityAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maxLifetimeSeconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.dhGroup)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.quickModeLimit)
                }
            }
    }
}

public data class IkeextReservedAuthentication0(
    public var flags: IkeextReservedAuthenticationFlags = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextReservedAuthentication0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextReservedAuthentication0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextReservedAuthentication0 =
                    IkeextReservedAuthentication0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IkeextReservedAuthentication0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                }
            }
    }
}

public data class IkeextSaDetails0(
    public var saId: ULong = 0uL,
    public var keyModuleType: IkeextKeyModuleType = 0,
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous: IkeextSaDetails00 = IkeextSaDetails00(),
    public var ikeTraffic: IkeextTraffic0 = IkeextTraffic0(),
    public var ikeProposal: IkeextProposal0 = IkeextProposal0(),
    public var cookiePair: IkeextCookiePair0 = IkeextCookiePair0(),
    public var ikeCredentials: IkeextCredentials0 = IkeextCredentials0(),
    public var ikePolicyKey: Guid = Guid(),
    public var virtualIfTunnelId: ULong = 0uL,
)

public class IkeextSaDetails00 internal constructor(
    v4UdpEncapsulationCtorArg: MutPtr<IpsecV4UdpEncapsulation0>,
) {
    public var v4UdpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = v4UdpEncapsulationCtorArg
        internal set

    public constructor() : this(
        v4UdpEncapsulationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IpsecV4UdpEncapsulation0> = this.v4UdpEncapsulation

    public fun copy(v4UdpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = this.v4UdpEncapsulation): IkeextSaDetails00 = IkeextSaDetails00(v4UdpEncapsulationCtorArg = v4UdpEncapsulation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextSaDetails00) return false
        if (this.v4UdpEncapsulation != other.v4UdpEncapsulation) return false
        return true
    }

    override fun hashCode(): Int = this.v4UdpEncapsulation.hashCode()

    public companion object {
        public operator fun invoke(
            v4UdpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = MutPtr(0L),
        ): IkeextSaDetails00 =
            IkeextSaDetails00(
                v4UdpEncapsulationCtorArg = v4UdpEncapsulation,
            )
    }
}

public data class IkeextSaDetails1(
    public var saId: ULong = 0uL,
    public var keyModuleType: IkeextKeyModuleType = 0,
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous: IkeextSaDetails10 = IkeextSaDetails10(),
    public var ikeTraffic: IkeextTraffic0 = IkeextTraffic0(),
    public var ikeProposal: IkeextProposal0 = IkeextProposal0(),
    public var cookiePair: IkeextCookiePair0 = IkeextCookiePair0(),
    public var ikeCredentials: IkeextCredentials1 = IkeextCredentials1(),
    public var ikePolicyKey: Guid = Guid(),
    public var virtualIfTunnelId: ULong = 0uL,
    public var correlationKey: FwpByteBlob = FwpByteBlob(),
)

public class IkeextSaDetails10 internal constructor(
    v4UdpEncapsulationCtorArg: MutPtr<IpsecV4UdpEncapsulation0>,
) {
    public var v4UdpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = v4UdpEncapsulationCtorArg
        internal set

    public constructor() : this(
        v4UdpEncapsulationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IpsecV4UdpEncapsulation0> = this.v4UdpEncapsulation

    public fun copy(v4UdpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = this.v4UdpEncapsulation): IkeextSaDetails10 = IkeextSaDetails10(v4UdpEncapsulationCtorArg = v4UdpEncapsulation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextSaDetails10) return false
        if (this.v4UdpEncapsulation != other.v4UdpEncapsulation) return false
        return true
    }

    override fun hashCode(): Int = this.v4UdpEncapsulation.hashCode()

    public companion object {
        public operator fun invoke(
            v4UdpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = MutPtr(0L),
        ): IkeextSaDetails10 =
            IkeextSaDetails10(
                v4UdpEncapsulationCtorArg = v4UdpEncapsulation,
            )
    }
}

public data class IkeextSaDetails2(
    public var saId: ULong = 0uL,
    public var keyModuleType: IkeextKeyModuleType = 0,
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous: IkeextSaDetails20 = IkeextSaDetails20(),
    public var ikeTraffic: IkeextTraffic0 = IkeextTraffic0(),
    public var ikeProposal: IkeextProposal0 = IkeextProposal0(),
    public var cookiePair: IkeextCookiePair0 = IkeextCookiePair0(),
    public var ikeCredentials: IkeextCredentials2 = IkeextCredentials2(),
    public var ikePolicyKey: Guid = Guid(),
    public var virtualIfTunnelId: ULong = 0uL,
    public var correlationKey: FwpByteBlob = FwpByteBlob(),
)

public class IkeextSaDetails20 internal constructor(
    v4UdpEncapsulationCtorArg: MutPtr<IpsecV4UdpEncapsulation0>,
) {
    public var v4UdpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = v4UdpEncapsulationCtorArg
        internal set

    public constructor() : this(
        v4UdpEncapsulationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IpsecV4UdpEncapsulation0> = this.v4UdpEncapsulation

    public fun copy(v4UdpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = this.v4UdpEncapsulation): IkeextSaDetails20 = IkeextSaDetails20(v4UdpEncapsulationCtorArg = v4UdpEncapsulation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextSaDetails20) return false
        if (this.v4UdpEncapsulation != other.v4UdpEncapsulation) return false
        return true
    }

    override fun hashCode(): Int = this.v4UdpEncapsulation.hashCode()

    public companion object {
        public operator fun invoke(
            v4UdpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = MutPtr(0L),
        ): IkeextSaDetails20 =
            IkeextSaDetails20(
                v4UdpEncapsulationCtorArg = v4UdpEncapsulation,
            )
    }
}

public data class IkeextSaEnumTemplate0(
    public var localSubNet: FwpConditionValue0 = FwpConditionValue0(),
    public var remoteSubNet: FwpConditionValue0 = FwpConditionValue0(),
    public var localMainModeCertHash: FwpByteBlob = FwpByteBlob(),
)

public data class IkeextStatistics0(
    public var ikeStatistics: IkeextKeymoduleStatistics0 = IkeextKeymoduleStatistics0(),
    public var authipStatistics: IkeextKeymoduleStatistics0 = IkeextKeymoduleStatistics0(),
    public var commonStatistics: IkeextCommonStatistics0 = IkeextCommonStatistics0(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextStatistics0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextStatistics0> {
                override val sizeBytes: Long = 1116L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextStatistics0 =
                    IkeextStatistics0(
                        (IkeextKeymoduleStatistics0.typeLayout()).readNative(addr),
                        (IkeextKeymoduleStatistics0.typeLayout()).readNative(addr + 544L),
                        (IkeextCommonStatistics0.typeLayout()).readNative(addr + 1088L),
                    )
                override fun writeNative(addr: Long, value: IkeextStatistics0) {
                    (IkeextKeymoduleStatistics0.typeLayout()).writeNative(addr, value.ikeStatistics)
                    (IkeextKeymoduleStatistics0.typeLayout()).writeNative(addr + 544L, value.authipStatistics)
                    (IkeextCommonStatistics0.typeLayout()).writeNative(addr + 1088L, value.commonStatistics)
                }
            }
    }
}

public data class IkeextStatistics1(
    public var ikeStatistics: IkeextKeymoduleStatistics1 = IkeextKeymoduleStatistics1(),
    public var authipStatistics: IkeextKeymoduleStatistics1 = IkeextKeymoduleStatistics1(),
    public var ikeV2Statistics: IkeextKeymoduleStatistics1 = IkeextKeymoduleStatistics1(),
    public var commonStatistics: IkeextCommonStatistics1 = IkeextCommonStatistics1(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextStatistics1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeextStatistics1> {
                override val sizeBytes: Long = 1660L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IkeextStatistics1 =
                    IkeextStatistics1(
                        (IkeextKeymoduleStatistics1.typeLayout()).readNative(addr),
                        (IkeextKeymoduleStatistics1.typeLayout()).readNative(addr + 544L),
                        (IkeextKeymoduleStatistics1.typeLayout()).readNative(addr + 1088L),
                        (IkeextCommonStatistics1.typeLayout()).readNative(addr + 1632L),
                    )
                override fun writeNative(addr: Long, value: IkeextStatistics1) {
                    (IkeextKeymoduleStatistics1.typeLayout()).writeNative(addr, value.ikeStatistics)
                    (IkeextKeymoduleStatistics1.typeLayout()).writeNative(addr + 544L, value.authipStatistics)
                    (IkeextKeymoduleStatistics1.typeLayout()).writeNative(addr + 1088L, value.ikeV2Statistics)
                    (IkeextCommonStatistics1.typeLayout()).writeNative(addr + 1632L, value.commonStatistics)
                }
            }
    }
}

public data class IkeextTraffic0(
    public var ipVersion: FwpIpVersion = 0,
    public var anonymous1: IkeextTraffic00 = IkeextTraffic00(),
    public var anonymous2: IkeextTraffic01 = IkeextTraffic01(),
    public var authIpFilterId: ULong = 0uL,
)

public data class IkeextTraffic00(
    public var localV4Address: UInt = 0u,
    public var localV6Address: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextTraffic00) return false
        if (this.localV4Address != other.localV4Address) return false
        if (!this.localV6Address.contentEquals(other.localV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.localV4Address.hashCode()
        result = 31 * result + this.localV6Address.contentHashCode()
        return result
    }
}

public data class IkeextTraffic01(
    public var remoteV4Address: UInt = 0u,
    public var remoteV6Address: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeextTraffic01) return false
        if (this.remoteV4Address != other.remoteV4Address) return false
        if (!this.remoteV6Address.contentEquals(other.remoteV6Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.remoteV4Address.hashCode()
        result = 31 * result + this.remoteV6Address.contentHashCode()
        return result
    }
}

public class IpsecAddressInfo0 internal constructor(
    public var numV4Addresses: UInt,
    v4AddressesCtorArg: MutPtr<UInt>,
    public var numV6Addresses: UInt,
    v6AddressesCtorArg: MutPtr<FwpByteArray16>,
) {
    public var v4Addresses: MutPtr<UInt> = v4AddressesCtorArg
        internal set

    public var v6Addresses: MutPtr<FwpByteArray16> = v6AddressesCtorArg
        internal set

    public constructor() : this(
        numV4Addresses = 0u,
        v4AddressesCtorArg = MutPtr(0L),
        numV6Addresses = 0u,
        v6AddressesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numV4Addresses

    public operator fun component2(): MutPtr<UInt> = this.v4Addresses

    public operator fun component3(): UInt = this.numV6Addresses

    public operator fun component4(): MutPtr<FwpByteArray16> = this.v6Addresses

    public fun copy(numV4Addresses: UInt = this.numV4Addresses, v4Addresses: MutPtr<UInt> = this.v4Addresses, numV6Addresses: UInt = this.numV6Addresses, v6Addresses: MutPtr<FwpByteArray16> = this.v6Addresses): IpsecAddressInfo0 = IpsecAddressInfo0(numV4Addresses = numV4Addresses, v4AddressesCtorArg = v4Addresses, numV6Addresses = numV6Addresses, v6AddressesCtorArg = v6Addresses)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecAddressInfo0) return false
        if (this.numV4Addresses != other.numV4Addresses) return false
        if (this.v4Addresses != other.v4Addresses) return false
        if (this.numV6Addresses != other.numV6Addresses) return false
        if (this.v6Addresses != other.v6Addresses) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numV4Addresses.hashCode()
        result = 31 * result + this.v4Addresses.hashCode()
        result = 31 * result + this.numV6Addresses.hashCode()
        result = 31 * result + this.v6Addresses.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAddressInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAddressInfo0> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecAddressInfo0 =
                    IpsecAddressInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<FwpByteArray16>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IpsecAddressInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numV4Addresses)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 8L, value.v4Addresses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numV6Addresses)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<FwpByteArray16>(64)
                    ).writeNative(addr + 24L, value.v6Addresses)
                }
            }

        public operator fun invoke(
            numV4Addresses: UInt = 0u,
            v4Addresses: MutPtr<UInt> = MutPtr(0L),
            numV6Addresses: UInt = 0u,
            v6Addresses: MutPtr<FwpByteArray16> = MutPtr(0L),
        ): IpsecAddressInfo0 =
            IpsecAddressInfo0(
                numV4Addresses = numV4Addresses,
                v4AddressesCtorArg = v4Addresses,
                numV6Addresses = numV6Addresses,
                v6AddressesCtorArg = v6Addresses,
            )
    }
}

public data class IpsecAggregateDropPacketStatistics0(
    public var invalidSpisOnInbound: UInt = 0u,
    public var decryptionFailuresOnInbound: UInt = 0u,
    public var authenticationFailuresOnInbound: UInt = 0u,
    public var udpEspValidationFailuresOnInbound: UInt = 0u,
    public var replayCheckFailuresOnInbound: UInt = 0u,
    public var invalidClearTextInbound: UInt = 0u,
    public var saNotInitializedOnInbound: UInt = 0u,
    public var receiveOverIncorrectSaInbound: UInt = 0u,
    public var secureReceivesNotMatchingFilters: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAggregateDropPacketStatistics0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAggregateDropPacketStatistics0> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IpsecAggregateDropPacketStatistics0 =
                    IpsecAggregateDropPacketStatistics0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: IpsecAggregateDropPacketStatistics0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.invalidSpisOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.decryptionFailuresOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.authenticationFailuresOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.udpEspValidationFailuresOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.replayCheckFailuresOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.invalidClearTextInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.saNotInitializedOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.receiveOverIncorrectSaInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.secureReceivesNotMatchingFilters)
                }
            }
    }
}

public data class IpsecAggregateDropPacketStatistics1(
    public var invalidSpisOnInbound: UInt = 0u,
    public var decryptionFailuresOnInbound: UInt = 0u,
    public var authenticationFailuresOnInbound: UInt = 0u,
    public var udpEspValidationFailuresOnInbound: UInt = 0u,
    public var replayCheckFailuresOnInbound: UInt = 0u,
    public var invalidClearTextInbound: UInt = 0u,
    public var saNotInitializedOnInbound: UInt = 0u,
    public var receiveOverIncorrectSaInbound: UInt = 0u,
    public var secureReceivesNotMatchingFilters: UInt = 0u,
    public var totalDropPacketsInbound: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAggregateDropPacketStatistics1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAggregateDropPacketStatistics1> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IpsecAggregateDropPacketStatistics1 =
                    IpsecAggregateDropPacketStatistics1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: IpsecAggregateDropPacketStatistics1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.invalidSpisOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.decryptionFailuresOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.authenticationFailuresOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.udpEspValidationFailuresOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.replayCheckFailuresOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.invalidClearTextInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.saNotInitializedOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.receiveOverIncorrectSaInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.secureReceivesNotMatchingFilters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.totalDropPacketsInbound)
                }
            }
    }
}

public data class IpsecAggregateSaStatistics0(
    public var activeSas: UInt = 0u,
    public var pendingSaNegotiations: UInt = 0u,
    public var totalSasAdded: UInt = 0u,
    public var totalSasDeleted: UInt = 0u,
    public var successfulRekeys: UInt = 0u,
    public var activeTunnels: UInt = 0u,
    public var offloadedSas: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAggregateSaStatistics0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAggregateSaStatistics0> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IpsecAggregateSaStatistics0 =
                    IpsecAggregateSaStatistics0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IpsecAggregateSaStatistics0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.activeSas)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pendingSaNegotiations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.totalSasAdded)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.totalSasDeleted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.successfulRekeys)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.activeTunnels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.offloadedSas)
                }
            }
    }
}

public data class IpsecAhDropPacketStatistics0(
    public var invalidSpisOnInbound: UInt = 0u,
    public var authenticationFailuresOnInbound: UInt = 0u,
    public var replayCheckFailuresOnInbound: UInt = 0u,
    public var saNotInitializedOnInbound: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAhDropPacketStatistics0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAhDropPacketStatistics0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IpsecAhDropPacketStatistics0 =
                    IpsecAhDropPacketStatistics0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: IpsecAhDropPacketStatistics0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.invalidSpisOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.authenticationFailuresOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.replayCheckFailuresOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.saNotInitializedOnInbound)
                }
            }
    }
}

public data class IpsecAuthAndCipherTransform0(
    public var authTransform: IpsecAuthTransform0 = IpsecAuthTransform0(),
    public var cipherTransform: IpsecCipherTransform0 = IpsecCipherTransform0(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAuthAndCipherTransform0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAuthAndCipherTransform0> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecAuthAndCipherTransform0 =
                    IpsecAuthAndCipherTransform0(
                        (IpsecAuthTransform0.typeLayout()).readNative(addr),
                        (IpsecCipherTransform0.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IpsecAuthAndCipherTransform0) {
                    (IpsecAuthTransform0.typeLayout()).writeNative(addr, value.authTransform)
                    (IpsecCipherTransform0.typeLayout()).writeNative(addr + 16L, value.cipherTransform)
                }
            }
    }
}

public class IpsecAuthTransform0 internal constructor(
    public var authTransformId: IpsecAuthTransformId0,
    cryptoModuleIdCtorArg: MutPtr<Guid>,
) {
    public var cryptoModuleId: MutPtr<Guid> = cryptoModuleIdCtorArg
        internal set

    public constructor() : this(
        authTransformId = IpsecAuthTransformId0(),
        cryptoModuleIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IpsecAuthTransformId0 = this.authTransformId

    public operator fun component2(): MutPtr<Guid> = this.cryptoModuleId

    public fun copy(authTransformId: IpsecAuthTransformId0 = this.authTransformId, cryptoModuleId: MutPtr<Guid> = this.cryptoModuleId): IpsecAuthTransform0 = IpsecAuthTransform0(authTransformId = authTransformId, cryptoModuleIdCtorArg = cryptoModuleId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecAuthTransform0) return false
        if (this.authTransformId != other.authTransformId) return false
        if (this.cryptoModuleId != other.cryptoModuleId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.authTransformId.hashCode()
        result = 31 * result + this.cryptoModuleId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAuthTransform0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAuthTransform0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecAuthTransform0 =
                    IpsecAuthTransform0(
                        (IpsecAuthTransformId0.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IpsecAuthTransform0) {
                    (IpsecAuthTransformId0.typeLayout()).writeNative(addr, value.authTransformId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr + 8L, value.cryptoModuleId)
                }
            }

        public operator fun invoke(
            authTransformId: IpsecAuthTransformId0 = IpsecAuthTransformId0(),
            cryptoModuleId: MutPtr<Guid> = MutPtr(0L),
        ): IpsecAuthTransform0 =
            IpsecAuthTransform0(
                authTransformId = authTransformId,
                cryptoModuleIdCtorArg = cryptoModuleId,
            )
    }
}

public data class IpsecAuthTransformId0(
    public var authType: IpsecAuthType = 0,
    public var authConfig: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAuthTransformId0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecAuthTransformId0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IpsecAuthTransformId0 =
                    IpsecAuthTransformId0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpsecAuthTransformId0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.authType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.authConfig)
                }
            }
    }
}

public class IpsecCipherTransform0 internal constructor(
    public var cipherTransformId: IpsecCipherTransformId0,
    cryptoModuleIdCtorArg: MutPtr<Guid>,
) {
    public var cryptoModuleId: MutPtr<Guid> = cryptoModuleIdCtorArg
        internal set

    public constructor() : this(
        cipherTransformId = IpsecCipherTransformId0(),
        cryptoModuleIdCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IpsecCipherTransformId0 = this.cipherTransformId

    public operator fun component2(): MutPtr<Guid> = this.cryptoModuleId

    public fun copy(cipherTransformId: IpsecCipherTransformId0 = this.cipherTransformId, cryptoModuleId: MutPtr<Guid> = this.cryptoModuleId): IpsecCipherTransform0 = IpsecCipherTransform0(cipherTransformId = cipherTransformId, cryptoModuleIdCtorArg = cryptoModuleId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecCipherTransform0) return false
        if (this.cipherTransformId != other.cipherTransformId) return false
        if (this.cryptoModuleId != other.cryptoModuleId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cipherTransformId.hashCode()
        result = 31 * result + this.cryptoModuleId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecCipherTransform0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecCipherTransform0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecCipherTransform0 =
                    IpsecCipherTransform0(
                        (IpsecCipherTransformId0.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IpsecCipherTransform0) {
                    (IpsecCipherTransformId0.typeLayout()).writeNative(addr, value.cipherTransformId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr + 8L, value.cryptoModuleId)
                }
            }

        public operator fun invoke(
            cipherTransformId: IpsecCipherTransformId0 = IpsecCipherTransformId0(),
            cryptoModuleId: MutPtr<Guid> = MutPtr(0L),
        ): IpsecCipherTransform0 =
            IpsecCipherTransform0(
                cipherTransformId = cipherTransformId,
                cryptoModuleIdCtorArg = cryptoModuleId,
            )
    }
}

public data class IpsecCipherTransformId0(
    public var cipherType: IpsecCipherType = 0,
    public var cipherConfig: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecCipherTransformId0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecCipherTransformId0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IpsecCipherTransformId0 =
                    IpsecCipherTransformId0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpsecCipherTransformId0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cipherType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.cipherConfig)
                }
            }
    }
}

public class IpsecDospOptions0 internal constructor(
    public var stateIdleTimeoutSeconds: UInt,
    public var perIPRateLimitQueueIdleTimeoutSeconds: UInt,
    public var ipV6IPsecUnauthDscp: UByte,
    public var ipV6IPsecUnauthRateLimitBytesPerSec: UInt,
    public var ipV6IPsecUnauthPerIPRateLimitBytesPerSec: UInt,
    public var ipV6IPsecAuthDscp: UByte,
    public var ipV6IPsecAuthRateLimitBytesPerSec: UInt,
    public var icmpV6Dscp: UByte,
    public var icmpV6RateLimitBytesPerSec: UInt,
    public var ipV6FilterExemptDscp: UByte,
    public var ipV6FilterExemptRateLimitBytesPerSec: UInt,
    public var defBlockExemptDscp: UByte,
    public var defBlockExemptRateLimitBytesPerSec: UInt,
    public var maxStateEntries: UInt,
    public var maxPerIPRateLimitQueues: UInt,
    public var flags: IpsecDospFlags,
    public var numPublicIFLuids: UInt,
    publicIFLuidsCtorArg: MutPtr<ULong>,
    public var numInternalIFLuids: UInt,
    internalIFLuidsCtorArg: MutPtr<ULong>,
    public var publicV6AddrMask: FwpV6AddrAndMask,
    public var internalV6AddrMask: FwpV6AddrAndMask,
) {
    public var publicIFLuids: MutPtr<ULong> = publicIFLuidsCtorArg
        internal set

    public var internalIFLuids: MutPtr<ULong> = internalIFLuidsCtorArg
        internal set

    public constructor() : this(
        stateIdleTimeoutSeconds = 0u,
        perIPRateLimitQueueIdleTimeoutSeconds = 0u,
        ipV6IPsecUnauthDscp = 0u,
        ipV6IPsecUnauthRateLimitBytesPerSec = 0u,
        ipV6IPsecUnauthPerIPRateLimitBytesPerSec = 0u,
        ipV6IPsecAuthDscp = 0u,
        ipV6IPsecAuthRateLimitBytesPerSec = 0u,
        icmpV6Dscp = 0u,
        icmpV6RateLimitBytesPerSec = 0u,
        ipV6FilterExemptDscp = 0u,
        ipV6FilterExemptRateLimitBytesPerSec = 0u,
        defBlockExemptDscp = 0u,
        defBlockExemptRateLimitBytesPerSec = 0u,
        maxStateEntries = 0u,
        maxPerIPRateLimitQueues = 0u,
        flags = 0u,
        numPublicIFLuids = 0u,
        publicIFLuidsCtorArg = MutPtr(0L),
        numInternalIFLuids = 0u,
        internalIFLuidsCtorArg = MutPtr(0L),
        publicV6AddrMask = FwpV6AddrAndMask(),
        internalV6AddrMask = FwpV6AddrAndMask(),
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecDospOptions0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecDospOptions0> {
                override val sizeBytes: Long = 136L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecDospOptions0 =
                    IpsecDospOptions0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<ULong>(64)
                        ).readNative(addr + 88L),
                        (FwpV6AddrAndMask.typeLayout()).readNative(addr + 96L),
                        (FwpV6AddrAndMask.typeLayout()).readNative(addr + 113L),
                    )
                override fun writeNative(addr: Long, value: IpsecDospOptions0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.stateIdleTimeoutSeconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.perIPRateLimitQueueIdleTimeoutSeconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.ipV6IPsecUnauthDscp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ipV6IPsecUnauthRateLimitBytesPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ipV6IPsecUnauthPerIPRateLimitBytesPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 20L, value.ipV6IPsecAuthDscp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.ipV6IPsecAuthRateLimitBytesPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 28L, value.icmpV6Dscp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.icmpV6RateLimitBytesPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 36L, value.ipV6FilterExemptDscp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ipV6FilterExemptRateLimitBytesPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 44L, value.defBlockExemptDscp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.defBlockExemptRateLimitBytesPerSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.maxStateEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.maxPerIPRateLimitQueues)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.numPublicIFLuids)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 72L, value.publicIFLuids)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.numInternalIFLuids)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<ULong>(64)
                    ).writeNative(addr + 88L, value.internalIFLuids)
                    (FwpV6AddrAndMask.typeLayout()).writeNative(addr + 96L, value.publicV6AddrMask)
                    (FwpV6AddrAndMask.typeLayout()).writeNative(addr + 113L, value.internalV6AddrMask)
                }
            }

        public operator fun invoke(
            stateIdleTimeoutSeconds: UInt = 0u,
            perIPRateLimitQueueIdleTimeoutSeconds: UInt = 0u,
            ipV6IPsecUnauthDscp: UByte = 0u,
            ipV6IPsecUnauthRateLimitBytesPerSec: UInt = 0u,
            ipV6IPsecUnauthPerIPRateLimitBytesPerSec: UInt = 0u,
            ipV6IPsecAuthDscp: UByte = 0u,
            ipV6IPsecAuthRateLimitBytesPerSec: UInt = 0u,
            icmpV6Dscp: UByte = 0u,
            icmpV6RateLimitBytesPerSec: UInt = 0u,
            ipV6FilterExemptDscp: UByte = 0u,
            ipV6FilterExemptRateLimitBytesPerSec: UInt = 0u,
            defBlockExemptDscp: UByte = 0u,
            defBlockExemptRateLimitBytesPerSec: UInt = 0u,
            maxStateEntries: UInt = 0u,
            maxPerIPRateLimitQueues: UInt = 0u,
            flags: IpsecDospFlags = 0u,
            numPublicIFLuids: UInt = 0u,
            publicIFLuids: MutPtr<ULong> = MutPtr(0L),
            numInternalIFLuids: UInt = 0u,
            internalIFLuids: MutPtr<ULong> = MutPtr(0L),
            publicV6AddrMask: FwpV6AddrAndMask = FwpV6AddrAndMask(),
            internalV6AddrMask: FwpV6AddrAndMask = FwpV6AddrAndMask(),
        ): IpsecDospOptions0 =
            IpsecDospOptions0(
                stateIdleTimeoutSeconds = stateIdleTimeoutSeconds,
                perIPRateLimitQueueIdleTimeoutSeconds = perIPRateLimitQueueIdleTimeoutSeconds,
                ipV6IPsecUnauthDscp = ipV6IPsecUnauthDscp,
                ipV6IPsecUnauthRateLimitBytesPerSec = ipV6IPsecUnauthRateLimitBytesPerSec,
                ipV6IPsecUnauthPerIPRateLimitBytesPerSec = ipV6IPsecUnauthPerIPRateLimitBytesPerSec,
                ipV6IPsecAuthDscp = ipV6IPsecAuthDscp,
                ipV6IPsecAuthRateLimitBytesPerSec = ipV6IPsecAuthRateLimitBytesPerSec,
                icmpV6Dscp = icmpV6Dscp,
                icmpV6RateLimitBytesPerSec = icmpV6RateLimitBytesPerSec,
                ipV6FilterExemptDscp = ipV6FilterExemptDscp,
                ipV6FilterExemptRateLimitBytesPerSec = ipV6FilterExemptRateLimitBytesPerSec,
                defBlockExemptDscp = defBlockExemptDscp,
                defBlockExemptRateLimitBytesPerSec = defBlockExemptRateLimitBytesPerSec,
                maxStateEntries = maxStateEntries,
                maxPerIPRateLimitQueues = maxPerIPRateLimitQueues,
                flags = flags,
                numPublicIFLuids = numPublicIFLuids,
                publicIFLuidsCtorArg = publicIFLuids,
                numInternalIFLuids = numInternalIFLuids,
                internalIFLuidsCtorArg = internalIFLuids,
                publicV6AddrMask = publicV6AddrMask,
                internalV6AddrMask = internalV6AddrMask,
            )
    }
}

public data class IpsecDospState0(
    public var publicHostV6Addr: UByteArray = UByteArray(16),
    public var internalHostV6Addr: UByteArray = UByteArray(16),
    public var totalInboundIPv6IPsecAuthPackets: ULong = 0uL,
    public var totalOutboundIPv6IPsecAuthPackets: ULong = 0uL,
    public var durationSecs: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecDospState0) return false
        if (!this.publicHostV6Addr.contentEquals(other.publicHostV6Addr)) return false
        if (!this.internalHostV6Addr.contentEquals(other.internalHostV6Addr)) return false
        if (this.totalInboundIPv6IPsecAuthPackets != other.totalInboundIPv6IPsecAuthPackets) return false
        if (this.totalOutboundIPv6IPsecAuthPackets != other.totalOutboundIPv6IPsecAuthPackets) return false
        if (this.durationSecs != other.durationSecs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.publicHostV6Addr.contentHashCode()
        result = 31 * result + this.internalHostV6Addr.contentHashCode()
        result = 31 * result + this.totalInboundIPv6IPsecAuthPackets.hashCode()
        result = 31 * result + this.totalOutboundIPv6IPsecAuthPackets.hashCode()
        result = 31 * result + this.durationSecs.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecDospState0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecDospState0> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecDospState0 =
                    IpsecDospState0(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: IpsecDospState0) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.publicHostV6Addr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.internalHostV6Addr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.totalInboundIPv6IPsecAuthPackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.totalOutboundIPv6IPsecAuthPackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.durationSecs)
                }
            }
    }
}

public data class IpsecDospStateEnumTemplate0(
    public var publicV6AddrMask: FwpV6AddrAndMask = FwpV6AddrAndMask(),
    public var internalV6AddrMask: FwpV6AddrAndMask = FwpV6AddrAndMask(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecDospStateEnumTemplate0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecDospStateEnumTemplate0> {
                override val sizeBytes: Long = 34L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): IpsecDospStateEnumTemplate0 =
                    IpsecDospStateEnumTemplate0(
                        (FwpV6AddrAndMask.typeLayout()).readNative(addr),
                        (FwpV6AddrAndMask.typeLayout()).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: IpsecDospStateEnumTemplate0) {
                    (FwpV6AddrAndMask.typeLayout()).writeNative(addr, value.publicV6AddrMask)
                    (FwpV6AddrAndMask.typeLayout()).writeNative(addr + 17L, value.internalV6AddrMask)
                }
            }
    }
}

public class IpsecDospStatistics0(
    public var totalStateEntriesCreated: ULong = 0uL,
    public var currentStateEntries: ULong = 0uL,
    public var totalInboundAllowedIPv6IPsecUnauthPkts: ULong = 0uL,
    public var totalInboundRatelimitDiscardedIPv6IPsecUnauthPkts: ULong = 0uL,
    public var totalInboundPerIPRatelimitDiscardedIPv6IPsecUnauthPkts: ULong = 0uL,
    public var totalInboundOtherDiscardedIPv6IPsecUnauthPkts: ULong = 0uL,
    public var totalInboundAllowedIPv6IPsecAuthPkts: ULong = 0uL,
    public var totalInboundRatelimitDiscardedIPv6IPsecAuthPkts: ULong = 0uL,
    public var totalInboundOtherDiscardedIPv6IPsecAuthPkts: ULong = 0uL,
    public var totalInboundAllowedICMPv6Pkts: ULong = 0uL,
    public var totalInboundRatelimitDiscardedICMPv6Pkts: ULong = 0uL,
    public var totalInboundAllowedIPv6FilterExemptPkts: ULong = 0uL,
    public var totalInboundRatelimitDiscardedIPv6FilterExemptPkts: ULong = 0uL,
    public var totalInboundDiscardedIPv6FilterBlockPkts: ULong = 0uL,
    public var totalInboundAllowedDefBlockExemptPkts: ULong = 0uL,
    public var totalInboundRatelimitDiscardedDefBlockExemptPkts: ULong = 0uL,
    public var totalInboundDiscardedDefBlockPkts: ULong = 0uL,
    public var currentInboundIPv6IPsecUnauthPerIPRateLimitQueues: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecDospStatistics0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecDospStatistics0> {
                override val sizeBytes: Long = 144L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecDospStatistics0 =
                    IpsecDospStatistics0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                    )
                override fun writeNative(addr: Long, value: IpsecDospStatistics0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.totalStateEntriesCreated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.currentStateEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.totalInboundAllowedIPv6IPsecUnauthPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.totalInboundRatelimitDiscardedIPv6IPsecUnauthPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.totalInboundPerIPRatelimitDiscardedIPv6IPsecUnauthPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.totalInboundOtherDiscardedIPv6IPsecUnauthPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.totalInboundAllowedIPv6IPsecAuthPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.totalInboundRatelimitDiscardedIPv6IPsecAuthPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.totalInboundOtherDiscardedIPv6IPsecAuthPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.totalInboundAllowedICMPv6Pkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.totalInboundRatelimitDiscardedICMPv6Pkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.totalInboundAllowedIPv6FilterExemptPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.totalInboundRatelimitDiscardedIPv6FilterExemptPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.totalInboundDiscardedIPv6FilterBlockPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.totalInboundAllowedDefBlockExemptPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.totalInboundRatelimitDiscardedDefBlockExemptPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.totalInboundDiscardedDefBlockPkts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.currentInboundIPv6IPsecUnauthPerIPRateLimitQueues)
                }
            }
    }
}

public data class IpsecEspDropPacketStatistics0(
    public var invalidSpisOnInbound: UInt = 0u,
    public var decryptionFailuresOnInbound: UInt = 0u,
    public var authenticationFailuresOnInbound: UInt = 0u,
    public var replayCheckFailuresOnInbound: UInt = 0u,
    public var saNotInitializedOnInbound: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecEspDropPacketStatistics0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecEspDropPacketStatistics0> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IpsecEspDropPacketStatistics0 =
                    IpsecEspDropPacketStatistics0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IpsecEspDropPacketStatistics0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.invalidSpisOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.decryptionFailuresOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.authenticationFailuresOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.replayCheckFailuresOnInbound)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.saNotInitializedOnInbound)
                }
            }
    }
}

public class IpsecGetspi0 internal constructor(
    public var inboundIpsecTraffic: IpsecTraffic0,
    public var ipVersion: FwpIpVersion,
    public var anonymous: IpsecGetspi00,
    rngCryptoModuleIDCtorArg: MutPtr<Guid>,
) {
    public var rngCryptoModuleID: MutPtr<Guid> = rngCryptoModuleIDCtorArg
        internal set

    public constructor() : this(
        inboundIpsecTraffic = IpsecTraffic0(),
        ipVersion = 0,
        anonymous = IpsecGetspi00(),
        rngCryptoModuleIDCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IpsecTraffic0 = this.inboundIpsecTraffic

    public operator fun component2(): FwpIpVersion = this.ipVersion

    public operator fun component3(): IpsecGetspi00 = this.anonymous

    public operator fun component4(): MutPtr<Guid> = this.rngCryptoModuleID

    public fun copy(inboundIpsecTraffic: IpsecTraffic0 = this.inboundIpsecTraffic, ipVersion: FwpIpVersion = this.ipVersion, anonymous: IpsecGetspi00 = this.anonymous, rngCryptoModuleID: MutPtr<Guid> = this.rngCryptoModuleID): IpsecGetspi0 = IpsecGetspi0(inboundIpsecTraffic = inboundIpsecTraffic, ipVersion = ipVersion, anonymous = anonymous, rngCryptoModuleIDCtorArg = rngCryptoModuleID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecGetspi0) return false
        if (this.inboundIpsecTraffic != other.inboundIpsecTraffic) return false
        if (this.ipVersion != other.ipVersion) return false
        if (this.anonymous != other.anonymous) return false
        if (this.rngCryptoModuleID != other.rngCryptoModuleID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inboundIpsecTraffic.hashCode()
        result = 31 * result + this.ipVersion.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.rngCryptoModuleID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            inboundIpsecTraffic: IpsecTraffic0 = IpsecTraffic0(),
            ipVersion: FwpIpVersion = 0,
            anonymous: IpsecGetspi00 = IpsecGetspi00(),
            rngCryptoModuleID: MutPtr<Guid> = MutPtr(0L),
        ): IpsecGetspi0 =
            IpsecGetspi0(
                inboundIpsecTraffic = inboundIpsecTraffic,
                ipVersion = ipVersion,
                anonymous = anonymous,
                rngCryptoModuleIDCtorArg = rngCryptoModuleID,
            )
    }
}

public class IpsecGetspi00 internal constructor(
    inboundUdpEncapsulationCtorArg: MutPtr<IpsecV4UdpEncapsulation0>,
) {
    public var inboundUdpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = inboundUdpEncapsulationCtorArg
        internal set

    public constructor() : this(
        inboundUdpEncapsulationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IpsecV4UdpEncapsulation0> = this.inboundUdpEncapsulation

    public fun copy(inboundUdpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = this.inboundUdpEncapsulation): IpsecGetspi00 = IpsecGetspi00(inboundUdpEncapsulationCtorArg = inboundUdpEncapsulation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecGetspi00) return false
        if (this.inboundUdpEncapsulation != other.inboundUdpEncapsulation) return false
        return true
    }

    override fun hashCode(): Int = this.inboundUdpEncapsulation.hashCode()

    public companion object {
        public operator fun invoke(
            inboundUdpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = MutPtr(0L),
        ): IpsecGetspi00 =
            IpsecGetspi00(
                inboundUdpEncapsulationCtorArg = inboundUdpEncapsulation,
            )
    }
}

public class IpsecGetspi1 internal constructor(
    public var inboundIpsecTraffic: IpsecTraffic1,
    public var ipVersion: FwpIpVersion,
    public var anonymous: IpsecGetspi10,
    rngCryptoModuleIDCtorArg: MutPtr<Guid>,
) {
    public var rngCryptoModuleID: MutPtr<Guid> = rngCryptoModuleIDCtorArg
        internal set

    public constructor() : this(
        inboundIpsecTraffic = IpsecTraffic1(),
        ipVersion = 0,
        anonymous = IpsecGetspi10(),
        rngCryptoModuleIDCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IpsecTraffic1 = this.inboundIpsecTraffic

    public operator fun component2(): FwpIpVersion = this.ipVersion

    public operator fun component3(): IpsecGetspi10 = this.anonymous

    public operator fun component4(): MutPtr<Guid> = this.rngCryptoModuleID

    public fun copy(inboundIpsecTraffic: IpsecTraffic1 = this.inboundIpsecTraffic, ipVersion: FwpIpVersion = this.ipVersion, anonymous: IpsecGetspi10 = this.anonymous, rngCryptoModuleID: MutPtr<Guid> = this.rngCryptoModuleID): IpsecGetspi1 = IpsecGetspi1(inboundIpsecTraffic = inboundIpsecTraffic, ipVersion = ipVersion, anonymous = anonymous, rngCryptoModuleIDCtorArg = rngCryptoModuleID)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecGetspi1) return false
        if (this.inboundIpsecTraffic != other.inboundIpsecTraffic) return false
        if (this.ipVersion != other.ipVersion) return false
        if (this.anonymous != other.anonymous) return false
        if (this.rngCryptoModuleID != other.rngCryptoModuleID) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inboundIpsecTraffic.hashCode()
        result = 31 * result + this.ipVersion.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.rngCryptoModuleID.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            inboundIpsecTraffic: IpsecTraffic1 = IpsecTraffic1(),
            ipVersion: FwpIpVersion = 0,
            anonymous: IpsecGetspi10 = IpsecGetspi10(),
            rngCryptoModuleID: MutPtr<Guid> = MutPtr(0L),
        ): IpsecGetspi1 =
            IpsecGetspi1(
                inboundIpsecTraffic = inboundIpsecTraffic,
                ipVersion = ipVersion,
                anonymous = anonymous,
                rngCryptoModuleIDCtorArg = rngCryptoModuleID,
            )
    }
}

public class IpsecGetspi10 internal constructor(
    inboundUdpEncapsulationCtorArg: MutPtr<IpsecV4UdpEncapsulation0>,
) {
    public var inboundUdpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = inboundUdpEncapsulationCtorArg
        internal set

    public constructor() : this(
        inboundUdpEncapsulationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IpsecV4UdpEncapsulation0> = this.inboundUdpEncapsulation

    public fun copy(inboundUdpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = this.inboundUdpEncapsulation): IpsecGetspi10 = IpsecGetspi10(inboundUdpEncapsulationCtorArg = inboundUdpEncapsulation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecGetspi10) return false
        if (this.inboundUdpEncapsulation != other.inboundUdpEncapsulation) return false
        return true
    }

    override fun hashCode(): Int = this.inboundUdpEncapsulation.hashCode()

    public companion object {
        public operator fun invoke(
            inboundUdpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = MutPtr(0L),
        ): IpsecGetspi10 =
            IpsecGetspi10(
                inboundUdpEncapsulationCtorArg = inboundUdpEncapsulation,
            )
    }
}

public class IpsecId0 internal constructor(
    mmTargetNameCtorArg: Pwstr,
    emTargetNameCtorArg: Pwstr,
    public var numTokens: UInt,
    tokensCtorArg: MutPtr<IpsecToken0>,
    public var explicitCredentials: ULong,
    public var logonId: ULong,
) {
    public var mmTargetName: Pwstr = mmTargetNameCtorArg
        internal set

    public var emTargetName: Pwstr = emTargetNameCtorArg
        internal set

    public var tokens: MutPtr<IpsecToken0> = tokensCtorArg
        internal set

    public constructor() : this(
        mmTargetNameCtorArg = MutPtr(0L),
        emTargetNameCtorArg = MutPtr(0L),
        numTokens = 0u,
        tokensCtorArg = MutPtr(0L),
        explicitCredentials = 0uL,
        logonId = 0uL,
    )

    public operator fun component1(): Pwstr = this.mmTargetName

    public operator fun component2(): Pwstr = this.emTargetName

    public operator fun component3(): UInt = this.numTokens

    public operator fun component4(): MutPtr<IpsecToken0> = this.tokens

    public operator fun component5(): ULong = this.explicitCredentials

    public operator fun component6(): ULong = this.logonId

    public fun copy(mmTargetName: Pwstr = this.mmTargetName, emTargetName: Pwstr = this.emTargetName, numTokens: UInt = this.numTokens, tokens: MutPtr<IpsecToken0> = this.tokens, explicitCredentials: ULong = this.explicitCredentials, logonId: ULong = this.logonId): IpsecId0 = IpsecId0(mmTargetNameCtorArg = mmTargetName, emTargetNameCtorArg = emTargetName, numTokens = numTokens, tokensCtorArg = tokens, explicitCredentials = explicitCredentials, logonId = logonId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecId0) return false
        if (this.mmTargetName != other.mmTargetName) return false
        if (this.emTargetName != other.emTargetName) return false
        if (this.numTokens != other.numTokens) return false
        if (this.tokens != other.tokens) return false
        if (this.explicitCredentials != other.explicitCredentials) return false
        if (this.logonId != other.logonId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mmTargetName.hashCode()
        result = 31 * result + this.emTargetName.hashCode()
        result = 31 * result + this.numTokens.hashCode()
        result = 31 * result + this.tokens.hashCode()
        result = 31 * result + this.explicitCredentials.hashCode()
        result = 31 * result + this.logonId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            mmTargetName: Pwstr = MutPtr(0L),
            emTargetName: Pwstr = MutPtr(0L),
            numTokens: UInt = 0u,
            tokens: MutPtr<IpsecToken0> = MutPtr(0L),
            explicitCredentials: ULong = 0uL,
            logonId: ULong = 0uL,
        ): IpsecId0 =
            IpsecId0(
                mmTargetNameCtorArg = mmTargetName,
                emTargetNameCtorArg = emTargetName,
                numTokens = numTokens,
                tokensCtorArg = tokens,
                explicitCredentials = explicitCredentials,
                logonId = logonId,
            )
    }
}

public class IpsecKeyingPolicy0 internal constructor(
    public var numKeyMods: UInt,
    keyModKeysCtorArg: MutPtr<Guid>,
) {
    public var keyModKeys: MutPtr<Guid> = keyModKeysCtorArg
        internal set

    public constructor() : this(
        numKeyMods = 0u,
        keyModKeysCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numKeyMods

    public operator fun component2(): MutPtr<Guid> = this.keyModKeys

    public fun copy(numKeyMods: UInt = this.numKeyMods, keyModKeys: MutPtr<Guid> = this.keyModKeys): IpsecKeyingPolicy0 = IpsecKeyingPolicy0(numKeyMods = numKeyMods, keyModKeysCtorArg = keyModKeys)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecKeyingPolicy0) return false
        if (this.numKeyMods != other.numKeyMods) return false
        if (this.keyModKeys != other.keyModKeys) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numKeyMods.hashCode()
        result = 31 * result + this.keyModKeys.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecKeyingPolicy0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecKeyingPolicy0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecKeyingPolicy0 =
                    IpsecKeyingPolicy0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IpsecKeyingPolicy0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numKeyMods)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr + 8L, value.keyModKeys)
                }
            }

        public operator fun invoke(
            numKeyMods: UInt = 0u,
            keyModKeys: MutPtr<Guid> = MutPtr(0L),
        ): IpsecKeyingPolicy0 =
            IpsecKeyingPolicy0(
                numKeyMods = numKeyMods,
                keyModKeysCtorArg = keyModKeys,
            )
    }
}

public class IpsecKeyingPolicy1 internal constructor(
    public var numKeyMods: UInt,
    keyModKeysCtorArg: MutPtr<Guid>,
    public var flags: UInt,
) {
    public var keyModKeys: MutPtr<Guid> = keyModKeysCtorArg
        internal set

    public constructor() : this(
        numKeyMods = 0u,
        keyModKeysCtorArg = MutPtr(0L),
        flags = 0u,
    )

    public operator fun component1(): UInt = this.numKeyMods

    public operator fun component2(): MutPtr<Guid> = this.keyModKeys

    public operator fun component3(): UInt = this.flags

    public fun copy(numKeyMods: UInt = this.numKeyMods, keyModKeys: MutPtr<Guid> = this.keyModKeys, flags: UInt = this.flags): IpsecKeyingPolicy1 = IpsecKeyingPolicy1(numKeyMods = numKeyMods, keyModKeysCtorArg = keyModKeys, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecKeyingPolicy1) return false
        if (this.numKeyMods != other.numKeyMods) return false
        if (this.keyModKeys != other.keyModKeys) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numKeyMods.hashCode()
        result = 31 * result + this.keyModKeys.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecKeyingPolicy1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecKeyingPolicy1> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecKeyingPolicy1 =
                    IpsecKeyingPolicy1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IpsecKeyingPolicy1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numKeyMods)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr + 8L, value.keyModKeys)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                }
            }

        public operator fun invoke(
            numKeyMods: UInt = 0u,
            keyModKeys: MutPtr<Guid> = MutPtr(0L),
            flags: UInt = 0u,
        ): IpsecKeyingPolicy1 =
            IpsecKeyingPolicy1(
                numKeyMods = numKeyMods,
                keyModKeysCtorArg = keyModKeys,
                flags = flags,
            )
    }
}

public data class IpsecKeymoduleState0(
    public var keyModuleKey: Guid = Guid(),
    public var stateBlob: FwpByteBlob = FwpByteBlob(),
)

public data class IpsecKeyManager0(
    public var keyManagerKey: Guid = Guid(),
    public var displayData: FwpmDisplayData0 = FwpmDisplayData0(),
    public var flags: UInt = 0u,
    public var keyDictationTimeoutHint: UByte = 0u,
)

public data class IpsecKeyManagerCallbacks0(
    public var reserved: Guid = Guid(),
    public var flags: UInt = 0u,
    public var keyDictationCheck: IpsecKeyManagerKeyDictationCheck0 = null,
    public var keyDictation: IpsecKeyManagerDictateKey0 = null,
    public var keyNotify: IpsecKeyManagerNotifyKey0 = null,
)

public class IpsecProposal0 internal constructor(
    public var lifetime: IpsecSaLifetime0,
    public var numSaTransforms: UInt,
    saTransformsCtorArg: MutPtr<IpsecSaTransform0>,
    public var pfsGroup: IpsecPfsGroup,
) {
    public var saTransforms: MutPtr<IpsecSaTransform0> = saTransformsCtorArg
        internal set

    public constructor() : this(
        lifetime = IpsecSaLifetime0(),
        numSaTransforms = 0u,
        saTransformsCtorArg = MutPtr(0L),
        pfsGroup = 0,
    )

    public operator fun component1(): IpsecSaLifetime0 = this.lifetime

    public operator fun component2(): UInt = this.numSaTransforms

    public operator fun component3(): MutPtr<IpsecSaTransform0> = this.saTransforms

    public operator fun component4(): IpsecPfsGroup = this.pfsGroup

    public fun copy(lifetime: IpsecSaLifetime0 = this.lifetime, numSaTransforms: UInt = this.numSaTransforms, saTransforms: MutPtr<IpsecSaTransform0> = this.saTransforms, pfsGroup: IpsecPfsGroup = this.pfsGroup): IpsecProposal0 = IpsecProposal0(lifetime = lifetime, numSaTransforms = numSaTransforms, saTransformsCtorArg = saTransforms, pfsGroup = pfsGroup)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecProposal0) return false
        if (this.lifetime != other.lifetime) return false
        if (this.numSaTransforms != other.numSaTransforms) return false
        if (this.saTransforms != other.saTransforms) return false
        if (this.pfsGroup != other.pfsGroup) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lifetime.hashCode()
        result = 31 * result + this.numSaTransforms.hashCode()
        result = 31 * result + this.saTransforms.hashCode()
        result = 31 * result + this.pfsGroup.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecProposal0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecProposal0> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecProposal0 =
                    IpsecProposal0(
                        (IpsecSaLifetime0.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IpsecSaTransform0>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IpsecProposal0) {
                    (IpsecSaLifetime0.typeLayout()).writeNative(addr, value.lifetime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numSaTransforms)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IpsecSaTransform0>(64)
                    ).writeNative(addr + 16L, value.saTransforms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.pfsGroup)
                }
            }

        public operator fun invoke(
            lifetime: IpsecSaLifetime0 = IpsecSaLifetime0(),
            numSaTransforms: UInt = 0u,
            saTransforms: MutPtr<IpsecSaTransform0> = MutPtr(0L),
            pfsGroup: IpsecPfsGroup = 0,
        ): IpsecProposal0 =
            IpsecProposal0(
                lifetime = lifetime,
                numSaTransforms = numSaTransforms,
                saTransformsCtorArg = saTransforms,
                pfsGroup = pfsGroup,
            )
    }
}

public data class IpsecSa0(
    public var spi: UInt = 0u,
    public var saTransformType: IpsecTransformType = 0,
    public var anonymous: IpsecSa00 = IpsecSa00(),
)

public class IpsecSa00 internal constructor(
    ahInformationCtorArg: MutPtr<IpsecSaAuthInformation0>,
    espAuthInformationCtorArg: MutPtr<IpsecSaAuthInformation0>,
    espCipherInformationCtorArg: MutPtr<IpsecSaCipherInformation0>,
    espAuthAndCipherInformationCtorArg: MutPtr<IpsecSaAuthAndCipherInformation0>,
    espAuthFwInformationCtorArg: MutPtr<IpsecSaAuthInformation0>,
) {
    public var ahInformation: MutPtr<IpsecSaAuthInformation0> = ahInformationCtorArg
        internal set

    public var espAuthInformation: MutPtr<IpsecSaAuthInformation0> = espAuthInformationCtorArg
        internal set

    public var espCipherInformation: MutPtr<IpsecSaCipherInformation0> = espCipherInformationCtorArg
        internal set

    public var espAuthAndCipherInformation: MutPtr<IpsecSaAuthAndCipherInformation0> = espAuthAndCipherInformationCtorArg
        internal set

    public var espAuthFwInformation: MutPtr<IpsecSaAuthInformation0> = espAuthFwInformationCtorArg
        internal set

    public constructor() : this(
        ahInformationCtorArg = MutPtr(0L),
        espAuthInformationCtorArg = MutPtr(0L),
        espCipherInformationCtorArg = MutPtr(0L),
        espAuthAndCipherInformationCtorArg = MutPtr(0L),
        espAuthFwInformationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IpsecSaAuthInformation0> = this.ahInformation

    public operator fun component2(): MutPtr<IpsecSaAuthInformation0> = this.espAuthInformation

    public operator fun component3(): MutPtr<IpsecSaCipherInformation0> = this.espCipherInformation

    public operator fun component4(): MutPtr<IpsecSaAuthAndCipherInformation0> = this.espAuthAndCipherInformation

    public operator fun component5(): MutPtr<IpsecSaAuthInformation0> = this.espAuthFwInformation

    public fun copy(ahInformation: MutPtr<IpsecSaAuthInformation0> = this.ahInformation, espAuthInformation: MutPtr<IpsecSaAuthInformation0> = this.espAuthInformation, espCipherInformation: MutPtr<IpsecSaCipherInformation0> = this.espCipherInformation, espAuthAndCipherInformation: MutPtr<IpsecSaAuthAndCipherInformation0> = this.espAuthAndCipherInformation, espAuthFwInformation: MutPtr<IpsecSaAuthInformation0> = this.espAuthFwInformation): IpsecSa00 = IpsecSa00(ahInformationCtorArg = ahInformation, espAuthInformationCtorArg = espAuthInformation, espCipherInformationCtorArg = espCipherInformation, espAuthAndCipherInformationCtorArg = espAuthAndCipherInformation, espAuthFwInformationCtorArg = espAuthFwInformation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecSa00) return false
        if (this.ahInformation != other.ahInformation) return false
        if (this.espAuthInformation != other.espAuthInformation) return false
        if (this.espCipherInformation != other.espCipherInformation) return false
        if (this.espAuthAndCipherInformation != other.espAuthAndCipherInformation) return false
        if (this.espAuthFwInformation != other.espAuthFwInformation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ahInformation.hashCode()
        result = 31 * result + this.espAuthInformation.hashCode()
        result = 31 * result + this.espCipherInformation.hashCode()
        result = 31 * result + this.espAuthAndCipherInformation.hashCode()
        result = 31 * result + this.espAuthFwInformation.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ahInformation: MutPtr<IpsecSaAuthInformation0> = MutPtr(0L),
            espAuthInformation: MutPtr<IpsecSaAuthInformation0> = MutPtr(0L),
            espCipherInformation: MutPtr<IpsecSaCipherInformation0> = MutPtr(0L),
            espAuthAndCipherInformation: MutPtr<IpsecSaAuthAndCipherInformation0> = MutPtr(0L),
            espAuthFwInformation: MutPtr<IpsecSaAuthInformation0> = MutPtr(0L),
        ): IpsecSa00 =
            IpsecSa00(
                ahInformationCtorArg = ahInformation,
                espAuthInformationCtorArg = espAuthInformation,
                espCipherInformationCtorArg = espCipherInformation,
                espAuthAndCipherInformationCtorArg = espAuthAndCipherInformation,
                espAuthFwInformationCtorArg = espAuthFwInformation,
            )
    }
}

public data class IpsecSaAuthAndCipherInformation0(
    public var saCipherInformation: IpsecSaCipherInformation0 = IpsecSaCipherInformation0(),
    public var saAuthInformation: IpsecSaAuthInformation0 = IpsecSaAuthInformation0(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaAuthAndCipherInformation0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaAuthAndCipherInformation0> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecSaAuthAndCipherInformation0 =
                    IpsecSaAuthAndCipherInformation0(
                        (IpsecSaCipherInformation0.typeLayout()).readNative(addr),
                        (IpsecSaAuthInformation0.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: IpsecSaAuthAndCipherInformation0) {
                    (IpsecSaCipherInformation0.typeLayout()).writeNative(addr, value.saCipherInformation)
                    (IpsecSaAuthInformation0.typeLayout()).writeNative(addr + 32L, value.saAuthInformation)
                }
            }
    }
}

public data class IpsecSaAuthInformation0(
    public var authTransform: IpsecAuthTransform0 = IpsecAuthTransform0(),
    public var authKey: FwpByteBlob = FwpByteBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaAuthInformation0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaAuthInformation0> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecSaAuthInformation0 =
                    IpsecSaAuthInformation0(
                        (IpsecAuthTransform0.typeLayout()).readNative(addr),
                        (FwpByteBlob.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IpsecSaAuthInformation0) {
                    (IpsecAuthTransform0.typeLayout()).writeNative(addr, value.authTransform)
                    (FwpByteBlob.typeLayout()).writeNative(addr + 16L, value.authKey)
                }
            }
    }
}

public class IpsecSaBundle0 internal constructor(
    public var flags: IpsecSaBundleFlags,
    public var lifetime: IpsecSaLifetime0,
    public var idleTimeoutSeconds: UInt,
    public var ndAllowClearTimeoutSeconds: UInt,
    ipsecIdCtorArg: MutPtr<IpsecId0>,
    public var napContext: UInt,
    public var qmSaId: UInt,
    public var numSAs: UInt,
    saListCtorArg: MutPtr<IpsecSa0>,
    keyModuleStateCtorArg: MutPtr<IpsecKeymoduleState0>,
    public var ipVersion: FwpIpVersion,
    public var anonymous: IpsecSaBundle00,
    public var mmSaId: ULong,
    public var pfsGroup: IpsecPfsGroup,
) {
    public var ipsecId: MutPtr<IpsecId0> = ipsecIdCtorArg
        internal set

    public var saList: MutPtr<IpsecSa0> = saListCtorArg
        internal set

    public var keyModuleState: MutPtr<IpsecKeymoduleState0> = keyModuleStateCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        lifetime = IpsecSaLifetime0(),
        idleTimeoutSeconds = 0u,
        ndAllowClearTimeoutSeconds = 0u,
        ipsecIdCtorArg = MutPtr(0L),
        napContext = 0u,
        qmSaId = 0u,
        numSAs = 0u,
        saListCtorArg = MutPtr(0L),
        keyModuleStateCtorArg = MutPtr(0L),
        ipVersion = 0,
        anonymous = IpsecSaBundle00(),
        mmSaId = 0uL,
        pfsGroup = 0,
    )

    public operator fun component1(): IpsecSaBundleFlags = this.flags

    public operator fun component2(): IpsecSaLifetime0 = this.lifetime

    public operator fun component3(): UInt = this.idleTimeoutSeconds

    public operator fun component4(): UInt = this.ndAllowClearTimeoutSeconds

    public operator fun component5(): MutPtr<IpsecId0> = this.ipsecId

    public operator fun component6(): UInt = this.napContext

    public operator fun component7(): UInt = this.qmSaId

    public operator fun component8(): UInt = this.numSAs

    public operator fun component9(): MutPtr<IpsecSa0> = this.saList

    public operator fun component10(): MutPtr<IpsecKeymoduleState0> = this.keyModuleState

    public operator fun component11(): FwpIpVersion = this.ipVersion

    public operator fun component12(): IpsecSaBundle00 = this.anonymous

    public operator fun component13(): ULong = this.mmSaId

    public operator fun component14(): IpsecPfsGroup = this.pfsGroup

    public fun copy(flags: IpsecSaBundleFlags = this.flags, lifetime: IpsecSaLifetime0 = this.lifetime, idleTimeoutSeconds: UInt = this.idleTimeoutSeconds, ndAllowClearTimeoutSeconds: UInt = this.ndAllowClearTimeoutSeconds, ipsecId: MutPtr<IpsecId0> = this.ipsecId, napContext: UInt = this.napContext, qmSaId: UInt = this.qmSaId, numSAs: UInt = this.numSAs, saList: MutPtr<IpsecSa0> = this.saList, keyModuleState: MutPtr<IpsecKeymoduleState0> = this.keyModuleState, ipVersion: FwpIpVersion = this.ipVersion, anonymous: IpsecSaBundle00 = this.anonymous, mmSaId: ULong = this.mmSaId, pfsGroup: IpsecPfsGroup = this.pfsGroup): IpsecSaBundle0 = IpsecSaBundle0(flags = flags, lifetime = lifetime, idleTimeoutSeconds = idleTimeoutSeconds, ndAllowClearTimeoutSeconds = ndAllowClearTimeoutSeconds, ipsecIdCtorArg = ipsecId, napContext = napContext, qmSaId = qmSaId, numSAs = numSAs, saListCtorArg = saList, keyModuleStateCtorArg = keyModuleState, ipVersion = ipVersion, anonymous = anonymous, mmSaId = mmSaId, pfsGroup = pfsGroup)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecSaBundle0) return false
        if (this.flags != other.flags) return false
        if (this.lifetime != other.lifetime) return false
        if (this.idleTimeoutSeconds != other.idleTimeoutSeconds) return false
        if (this.ndAllowClearTimeoutSeconds != other.ndAllowClearTimeoutSeconds) return false
        if (this.ipsecId != other.ipsecId) return false
        if (this.napContext != other.napContext) return false
        if (this.qmSaId != other.qmSaId) return false
        if (this.numSAs != other.numSAs) return false
        if (this.saList != other.saList) return false
        if (this.keyModuleState != other.keyModuleState) return false
        if (this.ipVersion != other.ipVersion) return false
        if (this.anonymous != other.anonymous) return false
        if (this.mmSaId != other.mmSaId) return false
        if (this.pfsGroup != other.pfsGroup) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.lifetime.hashCode()
        result = 31 * result + this.idleTimeoutSeconds.hashCode()
        result = 31 * result + this.ndAllowClearTimeoutSeconds.hashCode()
        result = 31 * result + this.ipsecId.hashCode()
        result = 31 * result + this.napContext.hashCode()
        result = 31 * result + this.qmSaId.hashCode()
        result = 31 * result + this.numSAs.hashCode()
        result = 31 * result + this.saList.hashCode()
        result = 31 * result + this.keyModuleState.hashCode()
        result = 31 * result + this.ipVersion.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.mmSaId.hashCode()
        result = 31 * result + this.pfsGroup.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: IpsecSaBundleFlags = 0u,
            lifetime: IpsecSaLifetime0 = IpsecSaLifetime0(),
            idleTimeoutSeconds: UInt = 0u,
            ndAllowClearTimeoutSeconds: UInt = 0u,
            ipsecId: MutPtr<IpsecId0> = MutPtr(0L),
            napContext: UInt = 0u,
            qmSaId: UInt = 0u,
            numSAs: UInt = 0u,
            saList: MutPtr<IpsecSa0> = MutPtr(0L),
            keyModuleState: MutPtr<IpsecKeymoduleState0> = MutPtr(0L),
            ipVersion: FwpIpVersion = 0,
            anonymous: IpsecSaBundle00 = IpsecSaBundle00(),
            mmSaId: ULong = 0uL,
            pfsGroup: IpsecPfsGroup = 0,
        ): IpsecSaBundle0 =
            IpsecSaBundle0(
                flags = flags,
                lifetime = lifetime,
                idleTimeoutSeconds = idleTimeoutSeconds,
                ndAllowClearTimeoutSeconds = ndAllowClearTimeoutSeconds,
                ipsecIdCtorArg = ipsecId,
                napContext = napContext,
                qmSaId = qmSaId,
                numSAs = numSAs,
                saListCtorArg = saList,
                keyModuleStateCtorArg = keyModuleState,
                ipVersion = ipVersion,
                anonymous = anonymous,
                mmSaId = mmSaId,
                pfsGroup = pfsGroup,
            )
    }
}

public data class IpsecSaBundle00(
    public var peerV4PrivateAddress: UInt = 0u,
)

public class IpsecSaBundle1 internal constructor(
    public var flags: IpsecSaBundleFlags,
    public var lifetime: IpsecSaLifetime0,
    public var idleTimeoutSeconds: UInt,
    public var ndAllowClearTimeoutSeconds: UInt,
    ipsecIdCtorArg: MutPtr<IpsecId0>,
    public var napContext: UInt,
    public var qmSaId: UInt,
    public var numSAs: UInt,
    saListCtorArg: MutPtr<IpsecSa0>,
    keyModuleStateCtorArg: MutPtr<IpsecKeymoduleState0>,
    public var ipVersion: FwpIpVersion,
    public var anonymous: IpsecSaBundle10,
    public var mmSaId: ULong,
    public var pfsGroup: IpsecPfsGroup,
    public var saLookupContext: Guid,
    public var qmFilterId: ULong,
) {
    public var ipsecId: MutPtr<IpsecId0> = ipsecIdCtorArg
        internal set

    public var saList: MutPtr<IpsecSa0> = saListCtorArg
        internal set

    public var keyModuleState: MutPtr<IpsecKeymoduleState0> = keyModuleStateCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        lifetime = IpsecSaLifetime0(),
        idleTimeoutSeconds = 0u,
        ndAllowClearTimeoutSeconds = 0u,
        ipsecIdCtorArg = MutPtr(0L),
        napContext = 0u,
        qmSaId = 0u,
        numSAs = 0u,
        saListCtorArg = MutPtr(0L),
        keyModuleStateCtorArg = MutPtr(0L),
        ipVersion = 0,
        anonymous = IpsecSaBundle10(),
        mmSaId = 0uL,
        pfsGroup = 0,
        saLookupContext = Guid(),
        qmFilterId = 0uL,
    )

    public operator fun component1(): IpsecSaBundleFlags = this.flags

    public operator fun component2(): IpsecSaLifetime0 = this.lifetime

    public operator fun component3(): UInt = this.idleTimeoutSeconds

    public operator fun component4(): UInt = this.ndAllowClearTimeoutSeconds

    public operator fun component5(): MutPtr<IpsecId0> = this.ipsecId

    public operator fun component6(): UInt = this.napContext

    public operator fun component7(): UInt = this.qmSaId

    public operator fun component8(): UInt = this.numSAs

    public operator fun component9(): MutPtr<IpsecSa0> = this.saList

    public operator fun component10(): MutPtr<IpsecKeymoduleState0> = this.keyModuleState

    public operator fun component11(): FwpIpVersion = this.ipVersion

    public operator fun component12(): IpsecSaBundle10 = this.anonymous

    public operator fun component13(): ULong = this.mmSaId

    public operator fun component14(): IpsecPfsGroup = this.pfsGroup

    public operator fun component15(): Guid = this.saLookupContext

    public operator fun component16(): ULong = this.qmFilterId

    public fun copy(flags: IpsecSaBundleFlags = this.flags, lifetime: IpsecSaLifetime0 = this.lifetime, idleTimeoutSeconds: UInt = this.idleTimeoutSeconds, ndAllowClearTimeoutSeconds: UInt = this.ndAllowClearTimeoutSeconds, ipsecId: MutPtr<IpsecId0> = this.ipsecId, napContext: UInt = this.napContext, qmSaId: UInt = this.qmSaId, numSAs: UInt = this.numSAs, saList: MutPtr<IpsecSa0> = this.saList, keyModuleState: MutPtr<IpsecKeymoduleState0> = this.keyModuleState, ipVersion: FwpIpVersion = this.ipVersion, anonymous: IpsecSaBundle10 = this.anonymous, mmSaId: ULong = this.mmSaId, pfsGroup: IpsecPfsGroup = this.pfsGroup, saLookupContext: Guid = this.saLookupContext, qmFilterId: ULong = this.qmFilterId): IpsecSaBundle1 = IpsecSaBundle1(flags = flags, lifetime = lifetime, idleTimeoutSeconds = idleTimeoutSeconds, ndAllowClearTimeoutSeconds = ndAllowClearTimeoutSeconds, ipsecIdCtorArg = ipsecId, napContext = napContext, qmSaId = qmSaId, numSAs = numSAs, saListCtorArg = saList, keyModuleStateCtorArg = keyModuleState, ipVersion = ipVersion, anonymous = anonymous, mmSaId = mmSaId, pfsGroup = pfsGroup, saLookupContext = saLookupContext, qmFilterId = qmFilterId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecSaBundle1) return false
        if (this.flags != other.flags) return false
        if (this.lifetime != other.lifetime) return false
        if (this.idleTimeoutSeconds != other.idleTimeoutSeconds) return false
        if (this.ndAllowClearTimeoutSeconds != other.ndAllowClearTimeoutSeconds) return false
        if (this.ipsecId != other.ipsecId) return false
        if (this.napContext != other.napContext) return false
        if (this.qmSaId != other.qmSaId) return false
        if (this.numSAs != other.numSAs) return false
        if (this.saList != other.saList) return false
        if (this.keyModuleState != other.keyModuleState) return false
        if (this.ipVersion != other.ipVersion) return false
        if (this.anonymous != other.anonymous) return false
        if (this.mmSaId != other.mmSaId) return false
        if (this.pfsGroup != other.pfsGroup) return false
        if (this.saLookupContext != other.saLookupContext) return false
        if (this.qmFilterId != other.qmFilterId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.lifetime.hashCode()
        result = 31 * result + this.idleTimeoutSeconds.hashCode()
        result = 31 * result + this.ndAllowClearTimeoutSeconds.hashCode()
        result = 31 * result + this.ipsecId.hashCode()
        result = 31 * result + this.napContext.hashCode()
        result = 31 * result + this.qmSaId.hashCode()
        result = 31 * result + this.numSAs.hashCode()
        result = 31 * result + this.saList.hashCode()
        result = 31 * result + this.keyModuleState.hashCode()
        result = 31 * result + this.ipVersion.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.mmSaId.hashCode()
        result = 31 * result + this.pfsGroup.hashCode()
        result = 31 * result + this.saLookupContext.hashCode()
        result = 31 * result + this.qmFilterId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: IpsecSaBundleFlags = 0u,
            lifetime: IpsecSaLifetime0 = IpsecSaLifetime0(),
            idleTimeoutSeconds: UInt = 0u,
            ndAllowClearTimeoutSeconds: UInt = 0u,
            ipsecId: MutPtr<IpsecId0> = MutPtr(0L),
            napContext: UInt = 0u,
            qmSaId: UInt = 0u,
            numSAs: UInt = 0u,
            saList: MutPtr<IpsecSa0> = MutPtr(0L),
            keyModuleState: MutPtr<IpsecKeymoduleState0> = MutPtr(0L),
            ipVersion: FwpIpVersion = 0,
            anonymous: IpsecSaBundle10 = IpsecSaBundle10(),
            mmSaId: ULong = 0uL,
            pfsGroup: IpsecPfsGroup = 0,
            saLookupContext: Guid = Guid(),
            qmFilterId: ULong = 0uL,
        ): IpsecSaBundle1 =
            IpsecSaBundle1(
                flags = flags,
                lifetime = lifetime,
                idleTimeoutSeconds = idleTimeoutSeconds,
                ndAllowClearTimeoutSeconds = ndAllowClearTimeoutSeconds,
                ipsecIdCtorArg = ipsecId,
                napContext = napContext,
                qmSaId = qmSaId,
                numSAs = numSAs,
                saListCtorArg = saList,
                keyModuleStateCtorArg = keyModuleState,
                ipVersion = ipVersion,
                anonymous = anonymous,
                mmSaId = mmSaId,
                pfsGroup = pfsGroup,
                saLookupContext = saLookupContext,
                qmFilterId = qmFilterId,
            )
    }
}

public data class IpsecSaBundle10(
    public var peerV4PrivateAddress: UInt = 0u,
)

public data class IpsecSaCipherInformation0(
    public var cipherTransform: IpsecCipherTransform0 = IpsecCipherTransform0(),
    public var cipherKey: FwpByteBlob = FwpByteBlob(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaCipherInformation0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaCipherInformation0> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecSaCipherInformation0 =
                    IpsecSaCipherInformation0(
                        (IpsecCipherTransform0.typeLayout()).readNative(addr),
                        (FwpByteBlob.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IpsecSaCipherInformation0) {
                    (IpsecCipherTransform0.typeLayout()).writeNative(addr, value.cipherTransform)
                    (FwpByteBlob.typeLayout()).writeNative(addr + 16L, value.cipherKey)
                }
            }
    }
}

public class IpsecSaContext0 internal constructor(
    public var saContextId: ULong,
    inboundSaCtorArg: MutPtr<IpsecSaDetails0>,
    outboundSaCtorArg: MutPtr<IpsecSaDetails0>,
) {
    public var inboundSa: MutPtr<IpsecSaDetails0> = inboundSaCtorArg
        internal set

    public var outboundSa: MutPtr<IpsecSaDetails0> = outboundSaCtorArg
        internal set

    public constructor() : this(
        saContextId = 0uL,
        inboundSaCtorArg = MutPtr(0L),
        outboundSaCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.saContextId

    public operator fun component2(): MutPtr<IpsecSaDetails0> = this.inboundSa

    public operator fun component3(): MutPtr<IpsecSaDetails0> = this.outboundSa

    public fun copy(saContextId: ULong = this.saContextId, inboundSa: MutPtr<IpsecSaDetails0> = this.inboundSa, outboundSa: MutPtr<IpsecSaDetails0> = this.outboundSa): IpsecSaContext0 = IpsecSaContext0(saContextId = saContextId, inboundSaCtorArg = inboundSa, outboundSaCtorArg = outboundSa)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecSaContext0) return false
        if (this.saContextId != other.saContextId) return false
        if (this.inboundSa != other.inboundSa) return false
        if (this.outboundSa != other.outboundSa) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saContextId.hashCode()
        result = 31 * result + this.inboundSa.hashCode()
        result = 31 * result + this.outboundSa.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaContext0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaContext0> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecSaContext0 =
                    IpsecSaContext0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IpsecSaDetails0>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IpsecSaDetails0>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IpsecSaContext0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.saContextId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IpsecSaDetails0>(64)
                    ).writeNative(addr + 8L, value.inboundSa)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IpsecSaDetails0>(64)
                    ).writeNative(addr + 16L, value.outboundSa)
                }
            }

        public operator fun invoke(
            saContextId: ULong = 0uL,
            inboundSa: MutPtr<IpsecSaDetails0> = MutPtr(0L),
            outboundSa: MutPtr<IpsecSaDetails0> = MutPtr(0L),
        ): IpsecSaContext0 =
            IpsecSaContext0(
                saContextId = saContextId,
                inboundSaCtorArg = inboundSa,
                outboundSaCtorArg = outboundSa,
            )
    }
}

public class IpsecSaContext1 internal constructor(
    public var saContextId: ULong,
    inboundSaCtorArg: MutPtr<IpsecSaDetails1>,
    outboundSaCtorArg: MutPtr<IpsecSaDetails1>,
) {
    public var inboundSa: MutPtr<IpsecSaDetails1> = inboundSaCtorArg
        internal set

    public var outboundSa: MutPtr<IpsecSaDetails1> = outboundSaCtorArg
        internal set

    public constructor() : this(
        saContextId = 0uL,
        inboundSaCtorArg = MutPtr(0L),
        outboundSaCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.saContextId

    public operator fun component2(): MutPtr<IpsecSaDetails1> = this.inboundSa

    public operator fun component3(): MutPtr<IpsecSaDetails1> = this.outboundSa

    public fun copy(saContextId: ULong = this.saContextId, inboundSa: MutPtr<IpsecSaDetails1> = this.inboundSa, outboundSa: MutPtr<IpsecSaDetails1> = this.outboundSa): IpsecSaContext1 = IpsecSaContext1(saContextId = saContextId, inboundSaCtorArg = inboundSa, outboundSaCtorArg = outboundSa)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecSaContext1) return false
        if (this.saContextId != other.saContextId) return false
        if (this.inboundSa != other.inboundSa) return false
        if (this.outboundSa != other.outboundSa) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saContextId.hashCode()
        result = 31 * result + this.inboundSa.hashCode()
        result = 31 * result + this.outboundSa.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaContext1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaContext1> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecSaContext1 =
                    IpsecSaContext1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IpsecSaDetails1>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<IpsecSaDetails1>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IpsecSaContext1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.saContextId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IpsecSaDetails1>(64)
                    ).writeNative(addr + 8L, value.inboundSa)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<IpsecSaDetails1>(64)
                    ).writeNative(addr + 16L, value.outboundSa)
                }
            }

        public operator fun invoke(
            saContextId: ULong = 0uL,
            inboundSa: MutPtr<IpsecSaDetails1> = MutPtr(0L),
            outboundSa: MutPtr<IpsecSaDetails1> = MutPtr(0L),
        ): IpsecSaContext1 =
            IpsecSaContext1(
                saContextId = saContextId,
                inboundSaCtorArg = inboundSa,
                outboundSaCtorArg = outboundSa,
            )
    }
}

public data class IpsecSaContextChange0(
    public var changeType: IpsecSaContextEventType0 = 0,
    public var saContextId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaContextChange0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaContextChange0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IpsecSaContextChange0 =
                    IpsecSaContextChange0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IpsecSaContextChange0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.changeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.saContextId)
                }
            }
    }
}

public data class IpsecSaContextEnumTemplate0(
    public var localSubNet: FwpConditionValue0 = FwpConditionValue0(),
    public var remoteSubNet: FwpConditionValue0 = FwpConditionValue0(),
)

public class IpsecSaContextSubscription0 internal constructor(
    enumTemplateCtorArg: MutPtr<IpsecSaContextEnumTemplate0>,
    public var flags: UInt,
    public var sessionKey: Guid,
) {
    public var enumTemplate: MutPtr<IpsecSaContextEnumTemplate0> = enumTemplateCtorArg
        internal set

    public constructor() : this(
        enumTemplateCtorArg = MutPtr(0L),
        flags = 0u,
        sessionKey = Guid(),
    )

    public operator fun component1(): MutPtr<IpsecSaContextEnumTemplate0> = this.enumTemplate

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): Guid = this.sessionKey

    public fun copy(enumTemplate: MutPtr<IpsecSaContextEnumTemplate0> = this.enumTemplate, flags: UInt = this.flags, sessionKey: Guid = this.sessionKey): IpsecSaContextSubscription0 = IpsecSaContextSubscription0(enumTemplateCtorArg = enumTemplate, flags = flags, sessionKey = sessionKey)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecSaContextSubscription0) return false
        if (this.enumTemplate != other.enumTemplate) return false
        if (this.flags != other.flags) return false
        if (this.sessionKey != other.sessionKey) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enumTemplate.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.sessionKey.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            enumTemplate: MutPtr<IpsecSaContextEnumTemplate0> = MutPtr(0L),
            flags: UInt = 0u,
            sessionKey: Guid = Guid(),
        ): IpsecSaContextSubscription0 =
            IpsecSaContextSubscription0(
                enumTemplateCtorArg = enumTemplate,
                flags = flags,
                sessionKey = sessionKey,
            )
    }
}

public class IpsecSaDetails0 internal constructor(
    public var ipVersion: FwpIpVersion,
    public var saDirection: FwpDirection,
    public var traffic: IpsecTraffic0,
    public var saBundle: IpsecSaBundle0,
    public var anonymous: IpsecSaDetails00,
    transportFilterCtorArg: MutPtr<FwpmFilter0>,
) {
    public var transportFilter: MutPtr<FwpmFilter0> = transportFilterCtorArg
        internal set

    public constructor() : this(
        ipVersion = 0,
        saDirection = 0,
        traffic = IpsecTraffic0(),
        saBundle = IpsecSaBundle0(),
        anonymous = IpsecSaDetails00(),
        transportFilterCtorArg = MutPtr(0L),
    )

    public operator fun component1(): FwpIpVersion = this.ipVersion

    public operator fun component2(): FwpDirection = this.saDirection

    public operator fun component3(): IpsecTraffic0 = this.traffic

    public operator fun component4(): IpsecSaBundle0 = this.saBundle

    public operator fun component5(): IpsecSaDetails00 = this.anonymous

    public operator fun component6(): MutPtr<FwpmFilter0> = this.transportFilter

    public fun copy(ipVersion: FwpIpVersion = this.ipVersion, saDirection: FwpDirection = this.saDirection, traffic: IpsecTraffic0 = this.traffic, saBundle: IpsecSaBundle0 = this.saBundle, anonymous: IpsecSaDetails00 = this.anonymous, transportFilter: MutPtr<FwpmFilter0> = this.transportFilter): IpsecSaDetails0 = IpsecSaDetails0(ipVersion = ipVersion, saDirection = saDirection, traffic = traffic, saBundle = saBundle, anonymous = anonymous, transportFilterCtorArg = transportFilter)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecSaDetails0) return false
        if (this.ipVersion != other.ipVersion) return false
        if (this.saDirection != other.saDirection) return false
        if (this.traffic != other.traffic) return false
        if (this.saBundle != other.saBundle) return false
        if (this.anonymous != other.anonymous) return false
        if (this.transportFilter != other.transportFilter) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ipVersion.hashCode()
        result = 31 * result + this.saDirection.hashCode()
        result = 31 * result + this.traffic.hashCode()
        result = 31 * result + this.saBundle.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.transportFilter.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ipVersion: FwpIpVersion = 0,
            saDirection: FwpDirection = 0,
            traffic: IpsecTraffic0 = IpsecTraffic0(),
            saBundle: IpsecSaBundle0 = IpsecSaBundle0(),
            anonymous: IpsecSaDetails00 = IpsecSaDetails00(),
            transportFilter: MutPtr<FwpmFilter0> = MutPtr(0L),
        ): IpsecSaDetails0 =
            IpsecSaDetails0(
                ipVersion = ipVersion,
                saDirection = saDirection,
                traffic = traffic,
                saBundle = saBundle,
                anonymous = anonymous,
                transportFilterCtorArg = transportFilter,
            )
    }
}

public class IpsecSaDetails00 internal constructor(
    udpEncapsulationCtorArg: MutPtr<IpsecV4UdpEncapsulation0>,
) {
    public var udpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = udpEncapsulationCtorArg
        internal set

    public constructor() : this(
        udpEncapsulationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IpsecV4UdpEncapsulation0> = this.udpEncapsulation

    public fun copy(udpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = this.udpEncapsulation): IpsecSaDetails00 = IpsecSaDetails00(udpEncapsulationCtorArg = udpEncapsulation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecSaDetails00) return false
        if (this.udpEncapsulation != other.udpEncapsulation) return false
        return true
    }

    override fun hashCode(): Int = this.udpEncapsulation.hashCode()

    public companion object {
        public operator fun invoke(
            udpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = MutPtr(0L),
        ): IpsecSaDetails00 =
            IpsecSaDetails00(
                udpEncapsulationCtorArg = udpEncapsulation,
            )
    }
}

public class IpsecSaDetails1 internal constructor(
    public var ipVersion: FwpIpVersion,
    public var saDirection: FwpDirection,
    public var traffic: IpsecTraffic1,
    public var saBundle: IpsecSaBundle1,
    public var anonymous: IpsecSaDetails10,
    transportFilterCtorArg: MutPtr<FwpmFilter0>,
    public var virtualIfTunnelInfo: IpsecVirtualIfTunnelInfo0,
) {
    public var transportFilter: MutPtr<FwpmFilter0> = transportFilterCtorArg
        internal set

    public constructor() : this(
        ipVersion = 0,
        saDirection = 0,
        traffic = IpsecTraffic1(),
        saBundle = IpsecSaBundle1(),
        anonymous = IpsecSaDetails10(),
        transportFilterCtorArg = MutPtr(0L),
        virtualIfTunnelInfo = IpsecVirtualIfTunnelInfo0(),
    )

    public operator fun component1(): FwpIpVersion = this.ipVersion

    public operator fun component2(): FwpDirection = this.saDirection

    public operator fun component3(): IpsecTraffic1 = this.traffic

    public operator fun component4(): IpsecSaBundle1 = this.saBundle

    public operator fun component5(): IpsecSaDetails10 = this.anonymous

    public operator fun component6(): MutPtr<FwpmFilter0> = this.transportFilter

    public operator fun component7(): IpsecVirtualIfTunnelInfo0 = this.virtualIfTunnelInfo

    public fun copy(ipVersion: FwpIpVersion = this.ipVersion, saDirection: FwpDirection = this.saDirection, traffic: IpsecTraffic1 = this.traffic, saBundle: IpsecSaBundle1 = this.saBundle, anonymous: IpsecSaDetails10 = this.anonymous, transportFilter: MutPtr<FwpmFilter0> = this.transportFilter, virtualIfTunnelInfo: IpsecVirtualIfTunnelInfo0 = this.virtualIfTunnelInfo): IpsecSaDetails1 = IpsecSaDetails1(ipVersion = ipVersion, saDirection = saDirection, traffic = traffic, saBundle = saBundle, anonymous = anonymous, transportFilterCtorArg = transportFilter, virtualIfTunnelInfo = virtualIfTunnelInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecSaDetails1) return false
        if (this.ipVersion != other.ipVersion) return false
        if (this.saDirection != other.saDirection) return false
        if (this.traffic != other.traffic) return false
        if (this.saBundle != other.saBundle) return false
        if (this.anonymous != other.anonymous) return false
        if (this.transportFilter != other.transportFilter) return false
        if (this.virtualIfTunnelInfo != other.virtualIfTunnelInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ipVersion.hashCode()
        result = 31 * result + this.saDirection.hashCode()
        result = 31 * result + this.traffic.hashCode()
        result = 31 * result + this.saBundle.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.transportFilter.hashCode()
        result = 31 * result + this.virtualIfTunnelInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ipVersion: FwpIpVersion = 0,
            saDirection: FwpDirection = 0,
            traffic: IpsecTraffic1 = IpsecTraffic1(),
            saBundle: IpsecSaBundle1 = IpsecSaBundle1(),
            anonymous: IpsecSaDetails10 = IpsecSaDetails10(),
            transportFilter: MutPtr<FwpmFilter0> = MutPtr(0L),
            virtualIfTunnelInfo: IpsecVirtualIfTunnelInfo0 = IpsecVirtualIfTunnelInfo0(),
        ): IpsecSaDetails1 =
            IpsecSaDetails1(
                ipVersion = ipVersion,
                saDirection = saDirection,
                traffic = traffic,
                saBundle = saBundle,
                anonymous = anonymous,
                transportFilterCtorArg = transportFilter,
                virtualIfTunnelInfo = virtualIfTunnelInfo,
            )
    }
}

public class IpsecSaDetails10 internal constructor(
    udpEncapsulationCtorArg: MutPtr<IpsecV4UdpEncapsulation0>,
) {
    public var udpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = udpEncapsulationCtorArg
        internal set

    public constructor() : this(
        udpEncapsulationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IpsecV4UdpEncapsulation0> = this.udpEncapsulation

    public fun copy(udpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = this.udpEncapsulation): IpsecSaDetails10 = IpsecSaDetails10(udpEncapsulationCtorArg = udpEncapsulation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecSaDetails10) return false
        if (this.udpEncapsulation != other.udpEncapsulation) return false
        return true
    }

    override fun hashCode(): Int = this.udpEncapsulation.hashCode()

    public companion object {
        public operator fun invoke(
            udpEncapsulation: MutPtr<IpsecV4UdpEncapsulation0> = MutPtr(0L),
        ): IpsecSaDetails10 =
            IpsecSaDetails10(
                udpEncapsulationCtorArg = udpEncapsulation,
            )
    }
}

public data class IpsecSaEnumTemplate0(
    public var saDirection: FwpDirection = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaEnumTemplate0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaEnumTemplate0> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IpsecSaEnumTemplate0 =
                    IpsecSaEnumTemplate0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IpsecSaEnumTemplate0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.saDirection)
                }
            }
    }
}

public data class IpsecSaIdleTimeout0(
    public var idleTimeoutSeconds: UInt = 0u,
    public var idleTimeoutSecondsFailOver: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaIdleTimeout0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaIdleTimeout0> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IpsecSaIdleTimeout0 =
                    IpsecSaIdleTimeout0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpsecSaIdleTimeout0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.idleTimeoutSeconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.idleTimeoutSecondsFailOver)
                }
            }
    }
}

public data class IpsecSaLifetime0(
    public var lifetimeSeconds: UInt = 0u,
    public var lifetimeKilobytes: UInt = 0u,
    public var lifetimePackets: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaLifetime0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpsecSaLifetime0> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IpsecSaLifetime0 =
                    IpsecSaLifetime0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IpsecSaLifetime0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lifetimeSeconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lifetimeKilobytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.lifetimePackets)
                }
            }
    }
}

public data class IpsecSaTransform0(
    public var ipsecTransformType: IpsecTransformType = 0,
    public var anonymous: IpsecSaTransform00 = IpsecSaTransform00(),
)

public class IpsecSaTransform00 internal constructor(
    ahTransformCtorArg: MutPtr<IpsecAuthTransform0>,
    espAuthTransformCtorArg: MutPtr<IpsecAuthTransform0>,
    espCipherTransformCtorArg: MutPtr<IpsecCipherTransform0>,
    espAuthAndCipherTransformCtorArg: MutPtr<IpsecAuthAndCipherTransform0>,
    espAuthFwTransformCtorArg: MutPtr<IpsecAuthTransform0>,
) {
    public var ahTransform: MutPtr<IpsecAuthTransform0> = ahTransformCtorArg
        internal set

    public var espAuthTransform: MutPtr<IpsecAuthTransform0> = espAuthTransformCtorArg
        internal set

    public var espCipherTransform: MutPtr<IpsecCipherTransform0> = espCipherTransformCtorArg
        internal set

    public var espAuthAndCipherTransform: MutPtr<IpsecAuthAndCipherTransform0> = espAuthAndCipherTransformCtorArg
        internal set

    public var espAuthFwTransform: MutPtr<IpsecAuthTransform0> = espAuthFwTransformCtorArg
        internal set

    public constructor() : this(
        ahTransformCtorArg = MutPtr(0L),
        espAuthTransformCtorArg = MutPtr(0L),
        espCipherTransformCtorArg = MutPtr(0L),
        espAuthAndCipherTransformCtorArg = MutPtr(0L),
        espAuthFwTransformCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<IpsecAuthTransform0> = this.ahTransform

    public operator fun component2(): MutPtr<IpsecAuthTransform0> = this.espAuthTransform

    public operator fun component3(): MutPtr<IpsecCipherTransform0> = this.espCipherTransform

    public operator fun component4(): MutPtr<IpsecAuthAndCipherTransform0> = this.espAuthAndCipherTransform

    public operator fun component5(): MutPtr<IpsecAuthTransform0> = this.espAuthFwTransform

    public fun copy(ahTransform: MutPtr<IpsecAuthTransform0> = this.ahTransform, espAuthTransform: MutPtr<IpsecAuthTransform0> = this.espAuthTransform, espCipherTransform: MutPtr<IpsecCipherTransform0> = this.espCipherTransform, espAuthAndCipherTransform: MutPtr<IpsecAuthAndCipherTransform0> = this.espAuthAndCipherTransform, espAuthFwTransform: MutPtr<IpsecAuthTransform0> = this.espAuthFwTransform): IpsecSaTransform00 = IpsecSaTransform00(ahTransformCtorArg = ahTransform, espAuthTransformCtorArg = espAuthTransform, espCipherTransformCtorArg = espCipherTransform, espAuthAndCipherTransformCtorArg = espAuthAndCipherTransform, espAuthFwTransformCtorArg = espAuthFwTransform)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpsecSaTransform00) return false
        if (this.ahTransform != other.ahTransform) return false
        if (this.espAuthTransform != other.espAuthTransform) return false
        if (this.espCipherTransform != other.espCipherTransform) return false
        if (this.espAuthAndCipherTransform != other.espAuthAndCipherTransform) return false
        if (this.espAuthFwTransform != other.espAuthFwTransform) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ahTransform.hashCode()
        result = 31 * result + this.espAuthTransform.hashCode()
        result = 31 * result + this.espCipherTransform.hashCode()
        result = 31 * result + this.espAuthAndCipherTransform.hashCode()
        result = 31 * result + this.espAuthFwTransform.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ahTransform: MutPtr<IpsecAuthTransform0> = MutPtr(0L),
            espAuthTransform: MutPtr<IpsecAuthTransform0> = MutPtr(0L),
            espCipherTransform: MutPtr<IpsecCipherTransform0> = MutPtr(0L),
            espAuthAndCipherTransform: MutPtr<IpsecAuthAndCipherTransform0> = MutPtr(0L),
            espAuthFwTransform: MutPtr<IpsecAuthTransform0> = MutPtr(0L),
        ): IpsecSaTransform00 =
            IpsecSaTransform00(
                ahTransformCtorArg = ahTransform,
                espAuthTransformCtorArg = espAuthTransform,
                espCipherTransformCtorArg = espCipherTransform,
                espAuthAndCipherTransformCtorArg = espAuthAndCipherTransform,
                espAuthFwTransformCtorArg = espAuthFwTransform,
            )
    }
}
