@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.biometricframework

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

public data class WinbioAccountPolicy(
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var antiSpoofBehavior: WinbioAntiSpoofPolicyAction = 0,
)

public data class WinbioAdapterInterfaceVersion(
    public var majorVersion: UShort = 0u,
    public var minorVersion: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAdapterInterfaceVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAdapterInterfaceVersion> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): WinbioAdapterInterfaceVersion =
                    WinbioAdapterInterfaceVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WinbioAdapterInterfaceVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.minorVersion)
                }
            }
    }
}

public data class WinbioAntiSpoofPolicy(
    public var action: WinbioAntiSpoofPolicyAction = 0,
    public var source: WinbioPolicySource = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAntiSpoofPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAntiSpoofPolicy> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioAntiSpoofPolicy =
                    WinbioAntiSpoofPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinbioAntiSpoofPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.action)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.source)
                }
            }
    }
}

public class WinbioAsyncResult internal constructor(
    public var sessionHandle: UInt,
    public var operation: UInt,
    public var sequenceNumber: ULong,
    public var timeStamp: Long,
    public var apiStatus: Hresult,
    public var unitId: UInt,
    userDataCtorArg: MutPtr<CVoid>,
    public var parameters: WinbioAsyncResult0,
) {
    public var userData: MutPtr<CVoid> = userDataCtorArg
        internal set

    public constructor() : this(
        sessionHandle = 0u,
        operation = 0u,
        sequenceNumber = 0uL,
        timeStamp = 0L,
        apiStatus = 0,
        unitId = 0u,
        userDataCtorArg = MutPtr(0L),
        parameters = WinbioAsyncResult0(),
    )

    public operator fun component1(): UInt = this.sessionHandle

    public operator fun component2(): UInt = this.operation

    public operator fun component3(): ULong = this.sequenceNumber

    public operator fun component4(): Long = this.timeStamp

    public operator fun component5(): Hresult = this.apiStatus

    public operator fun component6(): UInt = this.unitId

    public operator fun component7(): MutPtr<CVoid> = this.userData

    public operator fun component8(): WinbioAsyncResult0 = this.parameters

    public fun copy(sessionHandle: UInt = this.sessionHandle, operation: UInt = this.operation, sequenceNumber: ULong = this.sequenceNumber, timeStamp: Long = this.timeStamp, apiStatus: Hresult = this.apiStatus, unitId: UInt = this.unitId, userData: MutPtr<CVoid> = this.userData, parameters: WinbioAsyncResult0 = this.parameters): WinbioAsyncResult = WinbioAsyncResult(sessionHandle = sessionHandle, operation = operation, sequenceNumber = sequenceNumber, timeStamp = timeStamp, apiStatus = apiStatus, unitId = unitId, userDataCtorArg = userData, parameters = parameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioAsyncResult) return false
        if (this.sessionHandle != other.sessionHandle) return false
        if (this.operation != other.operation) return false
        if (this.sequenceNumber != other.sequenceNumber) return false
        if (this.timeStamp != other.timeStamp) return false
        if (this.apiStatus != other.apiStatus) return false
        if (this.unitId != other.unitId) return false
        if (this.userData != other.userData) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionHandle.hashCode()
        result = 31 * result + this.operation.hashCode()
        result = 31 * result + this.sequenceNumber.hashCode()
        result = 31 * result + this.timeStamp.hashCode()
        result = 31 * result + this.apiStatus.hashCode()
        result = 31 * result + this.unitId.hashCode()
        result = 31 * result + this.userData.hashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sessionHandle: UInt = 0u,
            operation: UInt = 0u,
            sequenceNumber: ULong = 0uL,
            timeStamp: Long = 0L,
            apiStatus: Hresult = 0,
            unitId: UInt = 0u,
            userData: MutPtr<CVoid> = MutPtr(0L),
            parameters: WinbioAsyncResult0 = WinbioAsyncResult0(),
        ): WinbioAsyncResult =
            WinbioAsyncResult(
                sessionHandle = sessionHandle,
                operation = operation,
                sequenceNumber = sequenceNumber,
                timeStamp = timeStamp,
                apiStatus = apiStatus,
                unitId = unitId,
                userDataCtorArg = userData,
                parameters = parameters,
            )
    }
}

public class WinbioAsyncResult0(
    public var verify: WinbioAsyncResult00 = WinbioAsyncResult00(),
    public var identify: WinbioAsyncResult01 = WinbioAsyncResult01(),
    public var enrollBegin: WinbioAsyncResult02 = WinbioAsyncResult02(),
    public var enrollCapture: WinbioAsyncResult03 = WinbioAsyncResult03(),
    public var enrollCommit: WinbioAsyncResult04 = WinbioAsyncResult04(),
    public var enumEnrollments: WinbioAsyncResult05 = WinbioAsyncResult05(),
    public var captureSample: WinbioAsyncResult06 = WinbioAsyncResult06(),
    public var deleteTemplate: WinbioAsyncResult07 = WinbioAsyncResult07(),
    public var getProperty: WinbioAsyncResult08 = WinbioAsyncResult08(),
    public var setProperty: WinbioAsyncResult09 = WinbioAsyncResult09(),
    public var getEvent: WinbioAsyncResult010 = WinbioAsyncResult010(),
    public var controlUnit: WinbioAsyncResult011 = WinbioAsyncResult011(),
    public var enumServiceProviders: WinbioAsyncResult012 = WinbioAsyncResult012(),
    public var enumBiometricUnits: WinbioAsyncResult013 = WinbioAsyncResult013(),
    public var enumDatabases: WinbioAsyncResult014 = WinbioAsyncResult014(),
    public var verifyAndReleaseTicket: WinbioAsyncResult015 = WinbioAsyncResult015(),
    public var identifyAndReleaseTicket: WinbioAsyncResult016 = WinbioAsyncResult016(),
    public var enrollSelect: WinbioAsyncResult017 = WinbioAsyncResult017(),
    public var monitorPresence: WinbioAsyncResult018 = WinbioAsyncResult018(),
    public var getProtectionPolicy: WinbioAsyncResult019 = WinbioAsyncResult019(),
    public var notifyUnitStatusChange: WinbioAsyncResult020 = WinbioAsyncResult020(),
)

public class WinbioAsyncResult06 internal constructor(
    sampleCtorArg: MutPtr<WinbioBir>,
    public var sampleSize: Int,
    public var rejectDetail: UInt,
) {
    public var sample: MutPtr<WinbioBir> = sampleCtorArg
        internal set

    public constructor() : this(
        sampleCtorArg = MutPtr(0L),
        sampleSize = 0,
        rejectDetail = 0u,
    )

    public operator fun component1(): MutPtr<WinbioBir> = this.sample

    public operator fun component2(): Int = this.sampleSize

    public operator fun component3(): UInt = this.rejectDetail

    public fun copy(sample: MutPtr<WinbioBir> = this.sample, sampleSize: Int = this.sampleSize, rejectDetail: UInt = this.rejectDetail): WinbioAsyncResult06 = WinbioAsyncResult06(sampleCtorArg = sample, sampleSize = sampleSize, rejectDetail = rejectDetail)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioAsyncResult06) return false
        if (this.sample != other.sample) return false
        if (this.sampleSize != other.sampleSize) return false
        if (this.rejectDetail != other.rejectDetail) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sample.hashCode()
        result = 31 * result + this.sampleSize.hashCode()
        result = 31 * result + this.rejectDetail.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult06> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult06> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioAsyncResult06 =
                    WinbioAsyncResult06(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WinbioBir>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WinbioAsyncResult06) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WinbioBir>(64)
                    ).writeNative(addr, value.sample)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.sampleSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.rejectDetail)
                }
            }

        public operator fun invoke(
            sample: MutPtr<WinbioBir> = MutPtr(0L),
            sampleSize: Int = 0,
            rejectDetail: UInt = 0u,
        ): WinbioAsyncResult06 =
            WinbioAsyncResult06(
                sampleCtorArg = sample,
                sampleSize = sampleSize,
                rejectDetail = rejectDetail,
            )
    }
}

public class WinbioAsyncResult011 internal constructor(
    public var component: WinbioComponent,
    public var controlCode: UInt,
    public var operationStatus: UInt,
    sendBufferCtorArg: MutPtr<UByte>,
    public var sendBufferSize: Int,
    receiveBufferCtorArg: MutPtr<UByte>,
    public var receiveBufferSize: Int,
    public var receiveDataSize: Int,
) {
    public var sendBuffer: MutPtr<UByte> = sendBufferCtorArg
        internal set

    public var receiveBuffer: MutPtr<UByte> = receiveBufferCtorArg
        internal set

    public constructor() : this(
        component = 0u,
        controlCode = 0u,
        operationStatus = 0u,
        sendBufferCtorArg = MutPtr(0L),
        sendBufferSize = 0,
        receiveBufferCtorArg = MutPtr(0L),
        receiveBufferSize = 0,
        receiveDataSize = 0,
    )

    public operator fun component1(): WinbioComponent = this.component

    public operator fun component2(): UInt = this.controlCode

    public operator fun component3(): UInt = this.operationStatus

    public operator fun component4(): MutPtr<UByte> = this.sendBuffer

    public operator fun component5(): Int = this.sendBufferSize

    public operator fun component6(): MutPtr<UByte> = this.receiveBuffer

    public operator fun component7(): Int = this.receiveBufferSize

    public operator fun component8(): Int = this.receiveDataSize

    public fun copy(component: WinbioComponent = this.component, controlCode: UInt = this.controlCode, operationStatus: UInt = this.operationStatus, sendBuffer: MutPtr<UByte> = this.sendBuffer, sendBufferSize: Int = this.sendBufferSize, receiveBuffer: MutPtr<UByte> = this.receiveBuffer, receiveBufferSize: Int = this.receiveBufferSize, receiveDataSize: Int = this.receiveDataSize): WinbioAsyncResult011 = WinbioAsyncResult011(component = component, controlCode = controlCode, operationStatus = operationStatus, sendBufferCtorArg = sendBuffer, sendBufferSize = sendBufferSize, receiveBufferCtorArg = receiveBuffer, receiveBufferSize = receiveBufferSize, receiveDataSize = receiveDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioAsyncResult011) return false
        if (this.component != other.component) return false
        if (this.controlCode != other.controlCode) return false
        if (this.operationStatus != other.operationStatus) return false
        if (this.sendBuffer != other.sendBuffer) return false
        if (this.sendBufferSize != other.sendBufferSize) return false
        if (this.receiveBuffer != other.receiveBuffer) return false
        if (this.receiveBufferSize != other.receiveBufferSize) return false
        if (this.receiveDataSize != other.receiveDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.component.hashCode()
        result = 31 * result + this.controlCode.hashCode()
        result = 31 * result + this.operationStatus.hashCode()
        result = 31 * result + this.sendBuffer.hashCode()
        result = 31 * result + this.sendBufferSize.hashCode()
        result = 31 * result + this.receiveBuffer.hashCode()
        result = 31 * result + this.receiveBufferSize.hashCode()
        result = 31 * result + this.receiveDataSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult011> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult011> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioAsyncResult011 =
                    WinbioAsyncResult011(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: WinbioAsyncResult011) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.component)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.controlCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.operationStatus)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.sendBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.sendBufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.receiveBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.receiveBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.receiveDataSize)
                }
            }

        public operator fun invoke(
            component: WinbioComponent = 0u,
            controlCode: UInt = 0u,
            operationStatus: UInt = 0u,
            sendBuffer: MutPtr<UByte> = MutPtr(0L),
            sendBufferSize: Int = 0,
            receiveBuffer: MutPtr<UByte> = MutPtr(0L),
            receiveBufferSize: Int = 0,
            receiveDataSize: Int = 0,
        ): WinbioAsyncResult011 =
            WinbioAsyncResult011(
                component = component,
                controlCode = controlCode,
                operationStatus = operationStatus,
                sendBufferCtorArg = sendBuffer,
                sendBufferSize = sendBufferSize,
                receiveBufferCtorArg = receiveBuffer,
                receiveBufferSize = receiveBufferSize,
                receiveDataSize = receiveDataSize,
            )
    }
}

public data class WinbioAsyncResult07(
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var subFactor: UByte = 0u,
)

public data class WinbioAsyncResult02(
    public var subFactor: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult02> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): WinbioAsyncResult02 =
                    WinbioAsyncResult02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WinbioAsyncResult02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.subFactor)
                }
            }
    }
}

public data class WinbioAsyncResult03(
    public var rejectDetail: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult03> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioAsyncResult03 =
                    WinbioAsyncResult03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WinbioAsyncResult03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rejectDetail)
                }
            }
    }
}

public data class WinbioAsyncResult04(
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var isNewTemplate: Boolean = false,
)

public data class WinbioAsyncResult017(
    public var selectorValue: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult017> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult017> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioAsyncResult017 =
                    WinbioAsyncResult017(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WinbioAsyncResult017) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.selectorValue)
                }
            }
    }
}

public class WinbioAsyncResult013 internal constructor(
    public var unitCount: Int,
    unitSchemaArrayCtorArg: MutPtr<WinbioUnitSchema>,
) {
    public var unitSchemaArray: MutPtr<WinbioUnitSchema> = unitSchemaArrayCtorArg
        internal set

    public constructor() : this(
        unitCount = 0,
        unitSchemaArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.unitCount

    public operator fun component2(): MutPtr<WinbioUnitSchema> = this.unitSchemaArray

    public fun copy(unitCount: Int = this.unitCount, unitSchemaArray: MutPtr<WinbioUnitSchema> = this.unitSchemaArray): WinbioAsyncResult013 = WinbioAsyncResult013(unitCount = unitCount, unitSchemaArrayCtorArg = unitSchemaArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioAsyncResult013) return false
        if (this.unitCount != other.unitCount) return false
        if (this.unitSchemaArray != other.unitSchemaArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.unitCount.hashCode()
        result = 31 * result + this.unitSchemaArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult013> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult013> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioAsyncResult013 =
                    WinbioAsyncResult013(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WinbioUnitSchema>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WinbioAsyncResult013) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.unitCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WinbioUnitSchema>(64)
                    ).writeNative(addr + 8L, value.unitSchemaArray)
                }
            }

        public operator fun invoke(
            unitCount: Int = 0,
            unitSchemaArray: MutPtr<WinbioUnitSchema> = MutPtr(0L),
        ): WinbioAsyncResult013 =
            WinbioAsyncResult013(
                unitCount = unitCount,
                unitSchemaArrayCtorArg = unitSchemaArray,
            )
    }
}

public class WinbioAsyncResult014 internal constructor(
    public var storageCount: Int,
    storageSchemaArrayCtorArg: MutPtr<WinbioStorageSchema>,
) {
    public var storageSchemaArray: MutPtr<WinbioStorageSchema> = storageSchemaArrayCtorArg
        internal set

    public constructor() : this(
        storageCount = 0,
        storageSchemaArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.storageCount

    public operator fun component2(): MutPtr<WinbioStorageSchema> = this.storageSchemaArray

    public fun copy(storageCount: Int = this.storageCount, storageSchemaArray: MutPtr<WinbioStorageSchema> = this.storageSchemaArray): WinbioAsyncResult014 = WinbioAsyncResult014(storageCount = storageCount, storageSchemaArrayCtorArg = storageSchemaArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioAsyncResult014) return false
        if (this.storageCount != other.storageCount) return false
        if (this.storageSchemaArray != other.storageSchemaArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.storageCount.hashCode()
        result = 31 * result + this.storageSchemaArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult014> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult014> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioAsyncResult014 =
                    WinbioAsyncResult014(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WinbioStorageSchema>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WinbioAsyncResult014) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.storageCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WinbioStorageSchema>(64)
                    ).writeNative(addr + 8L, value.storageSchemaArray)
                }
            }

        public operator fun invoke(
            storageCount: Int = 0,
            storageSchemaArray: MutPtr<WinbioStorageSchema> = MutPtr(0L),
        ): WinbioAsyncResult014 =
            WinbioAsyncResult014(
                storageCount = storageCount,
                storageSchemaArrayCtorArg = storageSchemaArray,
            )
    }
}

public class WinbioAsyncResult05 internal constructor(
    public var identity: WinbioIdentity,
    public var subFactorCount: Int,
    subFactorArrayCtorArg: MutPtr<UByte>,
) {
    public var subFactorArray: MutPtr<UByte> = subFactorArrayCtorArg
        internal set

    public constructor() : this(
        identity = WinbioIdentity(),
        subFactorCount = 0,
        subFactorArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): WinbioIdentity = this.identity

    public operator fun component2(): Int = this.subFactorCount

    public operator fun component3(): MutPtr<UByte> = this.subFactorArray

    public fun copy(identity: WinbioIdentity = this.identity, subFactorCount: Int = this.subFactorCount, subFactorArray: MutPtr<UByte> = this.subFactorArray): WinbioAsyncResult05 = WinbioAsyncResult05(identity = identity, subFactorCount = subFactorCount, subFactorArrayCtorArg = subFactorArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioAsyncResult05) return false
        if (this.identity != other.identity) return false
        if (this.subFactorCount != other.subFactorCount) return false
        if (this.subFactorArray != other.subFactorArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.identity.hashCode()
        result = 31 * result + this.subFactorCount.hashCode()
        result = 31 * result + this.subFactorArray.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            identity: WinbioIdentity = WinbioIdentity(),
            subFactorCount: Int = 0,
            subFactorArray: MutPtr<UByte> = MutPtr(0L),
        ): WinbioAsyncResult05 =
            WinbioAsyncResult05(
                identity = identity,
                subFactorCount = subFactorCount,
                subFactorArrayCtorArg = subFactorArray,
            )
    }
}

public class WinbioAsyncResult012 internal constructor(
    public var bspCount: Int,
    bspSchemaArrayCtorArg: MutPtr<WinbioBspSchema>,
) {
    public var bspSchemaArray: MutPtr<WinbioBspSchema> = bspSchemaArrayCtorArg
        internal set

    public constructor() : this(
        bspCount = 0,
        bspSchemaArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.bspCount

    public operator fun component2(): MutPtr<WinbioBspSchema> = this.bspSchemaArray

    public fun copy(bspCount: Int = this.bspCount, bspSchemaArray: MutPtr<WinbioBspSchema> = this.bspSchemaArray): WinbioAsyncResult012 = WinbioAsyncResult012(bspCount = bspCount, bspSchemaArrayCtorArg = bspSchemaArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioAsyncResult012) return false
        if (this.bspCount != other.bspCount) return false
        if (this.bspSchemaArray != other.bspSchemaArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bspCount.hashCode()
        result = 31 * result + this.bspSchemaArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult012> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult012> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioAsyncResult012 =
                    WinbioAsyncResult012(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WinbioBspSchema>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WinbioAsyncResult012) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.bspCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WinbioBspSchema>(64)
                    ).writeNative(addr + 8L, value.bspSchemaArray)
                }
            }

        public operator fun invoke(
            bspCount: Int = 0,
            bspSchemaArray: MutPtr<WinbioBspSchema> = MutPtr(0L),
        ): WinbioAsyncResult012 =
            WinbioAsyncResult012(
                bspCount = bspCount,
                bspSchemaArrayCtorArg = bspSchemaArray,
            )
    }
}

public data class WinbioAsyncResult010(
    public var event: WinbioEvent = WinbioEvent(),
)

public class WinbioAsyncResult08 internal constructor(
    public var propertyType: UInt,
    public var propertyId: UInt,
    public var identity: WinbioIdentity,
    public var subFactor: UByte,
    public var propertyBufferSize: Int,
    propertyBufferCtorArg: MutPtr<CVoid>,
) {
    public var propertyBuffer: MutPtr<CVoid> = propertyBufferCtorArg
        internal set

    public constructor() : this(
        propertyType = 0u,
        propertyId = 0u,
        identity = WinbioIdentity(),
        subFactor = 0u,
        propertyBufferSize = 0,
        propertyBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.propertyType

    public operator fun component2(): UInt = this.propertyId

    public operator fun component3(): WinbioIdentity = this.identity

    public operator fun component4(): UByte = this.subFactor

    public operator fun component5(): Int = this.propertyBufferSize

    public operator fun component6(): MutPtr<CVoid> = this.propertyBuffer

    public fun copy(propertyType: UInt = this.propertyType, propertyId: UInt = this.propertyId, identity: WinbioIdentity = this.identity, subFactor: UByte = this.subFactor, propertyBufferSize: Int = this.propertyBufferSize, propertyBuffer: MutPtr<CVoid> = this.propertyBuffer): WinbioAsyncResult08 = WinbioAsyncResult08(propertyType = propertyType, propertyId = propertyId, identity = identity, subFactor = subFactor, propertyBufferSize = propertyBufferSize, propertyBufferCtorArg = propertyBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioAsyncResult08) return false
        if (this.propertyType != other.propertyType) return false
        if (this.propertyId != other.propertyId) return false
        if (this.identity != other.identity) return false
        if (this.subFactor != other.subFactor) return false
        if (this.propertyBufferSize != other.propertyBufferSize) return false
        if (this.propertyBuffer != other.propertyBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.propertyType.hashCode()
        result = 31 * result + this.propertyId.hashCode()
        result = 31 * result + this.identity.hashCode()
        result = 31 * result + this.subFactor.hashCode()
        result = 31 * result + this.propertyBufferSize.hashCode()
        result = 31 * result + this.propertyBuffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            propertyType: UInt = 0u,
            propertyId: UInt = 0u,
            identity: WinbioIdentity = WinbioIdentity(),
            subFactor: UByte = 0u,
            propertyBufferSize: Int = 0,
            propertyBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): WinbioAsyncResult08 =
            WinbioAsyncResult08(
                propertyType = propertyType,
                propertyId = propertyId,
                identity = identity,
                subFactor = subFactor,
                propertyBufferSize = propertyBufferSize,
                propertyBufferCtorArg = propertyBuffer,
            )
    }
}

public data class WinbioAsyncResult019(
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var policy: WinbioProtectionPolicy = WinbioProtectionPolicy(),
)

public data class WinbioAsyncResult016(
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var subFactor: UByte = 0u,
    public var rejectDetail: UInt = 0u,
    public var ticket: ULong = 0uL,
)

public data class WinbioAsyncResult01(
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var subFactor: UByte = 0u,
    public var rejectDetail: UInt = 0u,
)

public class WinbioAsyncResult018 internal constructor(
    public var changeType: UInt,
    public var presenceCount: Int,
    presenceArrayCtorArg: MutPtr<WinbioPresence>,
) {
    public var presenceArray: MutPtr<WinbioPresence> = presenceArrayCtorArg
        internal set

    public constructor() : this(
        changeType = 0u,
        presenceCount = 0,
        presenceArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.changeType

    public operator fun component2(): Int = this.presenceCount

    public operator fun component3(): MutPtr<WinbioPresence> = this.presenceArray

    public fun copy(changeType: UInt = this.changeType, presenceCount: Int = this.presenceCount, presenceArray: MutPtr<WinbioPresence> = this.presenceArray): WinbioAsyncResult018 = WinbioAsyncResult018(changeType = changeType, presenceCount = presenceCount, presenceArrayCtorArg = presenceArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioAsyncResult018) return false
        if (this.changeType != other.changeType) return false
        if (this.presenceCount != other.presenceCount) return false
        if (this.presenceArray != other.presenceArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.changeType.hashCode()
        result = 31 * result + this.presenceCount.hashCode()
        result = 31 * result + this.presenceArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult018> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult018> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioAsyncResult018 =
                    WinbioAsyncResult018(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WinbioPresence>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WinbioAsyncResult018) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.changeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.presenceCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WinbioPresence>(64)
                    ).writeNative(addr + 16L, value.presenceArray)
                }
            }

        public operator fun invoke(
            changeType: UInt = 0u,
            presenceCount: Int = 0,
            presenceArray: MutPtr<WinbioPresence> = MutPtr(0L),
        ): WinbioAsyncResult018 =
            WinbioAsyncResult018(
                changeType = changeType,
                presenceCount = presenceCount,
                presenceArrayCtorArg = presenceArray,
            )
    }
}

public data class WinbioAsyncResult020(
    public var extendedStatus: WinbioExtendedUnitStatus = WinbioExtendedUnitStatus(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult020> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult020> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioAsyncResult020 =
                    WinbioAsyncResult020(
                        (WinbioExtendedUnitStatus.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WinbioAsyncResult020) {
                    (WinbioExtendedUnitStatus.typeLayout()).writeNative(addr, value.extendedStatus)
                }
            }
    }
}

public class WinbioAsyncResult09 internal constructor(
    public var propertyType: UInt,
    public var propertyId: UInt,
    public var identity: WinbioIdentity,
    public var subFactor: UByte,
    public var propertyBufferSize: Int,
    propertyBufferCtorArg: MutPtr<CVoid>,
) {
    public var propertyBuffer: MutPtr<CVoid> = propertyBufferCtorArg
        internal set

    public constructor() : this(
        propertyType = 0u,
        propertyId = 0u,
        identity = WinbioIdentity(),
        subFactor = 0u,
        propertyBufferSize = 0,
        propertyBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.propertyType

    public operator fun component2(): UInt = this.propertyId

    public operator fun component3(): WinbioIdentity = this.identity

    public operator fun component4(): UByte = this.subFactor

    public operator fun component5(): Int = this.propertyBufferSize

    public operator fun component6(): MutPtr<CVoid> = this.propertyBuffer

    public fun copy(propertyType: UInt = this.propertyType, propertyId: UInt = this.propertyId, identity: WinbioIdentity = this.identity, subFactor: UByte = this.subFactor, propertyBufferSize: Int = this.propertyBufferSize, propertyBuffer: MutPtr<CVoid> = this.propertyBuffer): WinbioAsyncResult09 = WinbioAsyncResult09(propertyType = propertyType, propertyId = propertyId, identity = identity, subFactor = subFactor, propertyBufferSize = propertyBufferSize, propertyBufferCtorArg = propertyBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioAsyncResult09) return false
        if (this.propertyType != other.propertyType) return false
        if (this.propertyId != other.propertyId) return false
        if (this.identity != other.identity) return false
        if (this.subFactor != other.subFactor) return false
        if (this.propertyBufferSize != other.propertyBufferSize) return false
        if (this.propertyBuffer != other.propertyBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.propertyType.hashCode()
        result = 31 * result + this.propertyId.hashCode()
        result = 31 * result + this.identity.hashCode()
        result = 31 * result + this.subFactor.hashCode()
        result = 31 * result + this.propertyBufferSize.hashCode()
        result = 31 * result + this.propertyBuffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            propertyType: UInt = 0u,
            propertyId: UInt = 0u,
            identity: WinbioIdentity = WinbioIdentity(),
            subFactor: UByte = 0u,
            propertyBufferSize: Int = 0,
            propertyBuffer: MutPtr<CVoid> = MutPtr(0L),
        ): WinbioAsyncResult09 =
            WinbioAsyncResult09(
                propertyType = propertyType,
                propertyId = propertyId,
                identity = identity,
                subFactor = subFactor,
                propertyBufferSize = propertyBufferSize,
                propertyBufferCtorArg = propertyBuffer,
            )
    }
}

public data class WinbioAsyncResult015(
    public var match: Boolean = false,
    public var rejectDetail: UInt = 0u,
    public var ticket: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult015> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult015> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioAsyncResult015 =
                    WinbioAsyncResult015(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WinbioAsyncResult015) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.match)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.rejectDetail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ticket)
                }
            }
    }
}

public data class WinbioAsyncResult00(
    public var match: Boolean = false,
    public var rejectDetail: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioAsyncResult00> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioAsyncResult00 =
                    WinbioAsyncResult00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinbioAsyncResult00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.match)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.rejectDetail)
                }
            }
    }
}

public data class WinbioBdbAnsi381Header(
    public var recordLength: ULong = 0uL,
    public var formatIdentifier: UInt = 0u,
    public var versionNumber: UInt = 0u,
    public var productId: WinbioRegisteredFormat = WinbioRegisteredFormat(),
    public var captureDeviceId: UShort = 0u,
    public var imageAcquisitionLevel: UShort = 0u,
    public var horizontalScanResolution: UShort = 0u,
    public var verticalScanResolution: UShort = 0u,
    public var horizontalImageResolution: UShort = 0u,
    public var verticalImageResolution: UShort = 0u,
    public var elementCount: UByte = 0u,
    public var scaleUnits: UByte = 0u,
    public var pixelDepth: UByte = 0u,
    public var imageCompressionAlg: UByte = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioBdbAnsi381Header> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioBdbAnsi381Header> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioBdbAnsi381Header =
                    WinbioBdbAnsi381Header(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (WinbioRegisteredFormat.typeLayout()).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 33L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 35L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: WinbioBdbAnsi381Header) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.recordLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.formatIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.versionNumber)
                    (WinbioRegisteredFormat.typeLayout()).writeNative(addr + 16L, value.productId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.captureDeviceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.imageAcquisitionLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.horizontalScanResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.verticalScanResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 28L, value.horizontalImageResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 30L, value.verticalImageResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 32L, value.elementCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 33L, value.scaleUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 34L, value.pixelDepth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 35L, value.imageCompressionAlg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 36L, value.reserved)
                }
            }
    }
}

public data class WinbioBdbAnsi381Record(
    public var blockLength: UInt = 0u,
    public var horizontalLineLength: UShort = 0u,
    public var verticalLineLength: UShort = 0u,
    public var position: UByte = 0u,
    public var countOfViews: UByte = 0u,
    public var viewNumber: UByte = 0u,
    public var imageQuality: UByte = 0u,
    public var impressionType: UByte = 0u,
    public var reserved: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioBdbAnsi381Record> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioBdbAnsi381Record> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioBdbAnsi381Record =
                    WinbioBdbAnsi381Record(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                    )
                override fun writeNative(addr: Long, value: WinbioBdbAnsi381Record) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.blockLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.horizontalLineLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.verticalLineLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.position)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.countOfViews)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.viewNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.imageQuality)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.impressionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.reserved)
                }
            }
    }
}

public data class WinbioBir(
    public var headerBlock: WinbioBirData = WinbioBirData(),
    public var standardDataBlock: WinbioBirData = WinbioBirData(),
    public var vendorDataBlock: WinbioBirData = WinbioBirData(),
    public var signatureBlock: WinbioBirData = WinbioBirData(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioBir> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioBir> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioBir =
                    WinbioBir(
                        (WinbioBirData.typeLayout()).readNative(addr),
                        (WinbioBirData.typeLayout()).readNative(addr + 8L),
                        (WinbioBirData.typeLayout()).readNative(addr + 16L),
                        (WinbioBirData.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: WinbioBir) {
                    (WinbioBirData.typeLayout()).writeNative(addr, value.headerBlock)
                    (WinbioBirData.typeLayout()).writeNative(addr + 8L, value.standardDataBlock)
                    (WinbioBirData.typeLayout()).writeNative(addr + 16L, value.vendorDataBlock)
                    (WinbioBirData.typeLayout()).writeNative(addr + 24L, value.signatureBlock)
                }
            }
    }
}

public data class WinbioBirData(
    public var size: UInt = 0u,
    public var offset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioBirData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioBirData> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioBirData =
                    WinbioBirData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinbioBirData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.offset)
                }
            }
    }
}

public data class WinbioBirHeader(
    public var validFields: UShort = 0u,
    public var headerVersion: UByte = 0u,
    public var patronHeaderVersion: UByte = 0u,
    public var dataFlags: UByte = 0u,
    public var type: UInt = 0u,
    public var subtype: UByte = 0u,
    public var purpose: UByte = 0u,
    public var dataQuality: Byte = 0,
    public var creationDate: Long = 0L,
    public var validityPeriod: WinbioBirHeader0 = WinbioBirHeader0(),
    public var biometricDataFormat: WinbioRegisteredFormat = WinbioRegisteredFormat(),
    public var productId: WinbioRegisteredFormat = WinbioRegisteredFormat(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioBirHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioBirHeader> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioBirHeader =
                    WinbioBirHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (WinbioBirHeader0.typeLayout()).readNative(addr + 24L),
                        (WinbioRegisteredFormat.typeLayout()).readNative(addr + 40L),
                        (WinbioRegisteredFormat.typeLayout()).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: WinbioBirHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.validFields)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.headerVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.patronHeaderVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.dataFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.subtype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.purpose)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 14L, value.dataQuality)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.creationDate)
                    (WinbioBirHeader0.typeLayout()).writeNative(addr + 24L, value.validityPeriod)
                    (WinbioRegisteredFormat.typeLayout()).writeNative(addr + 40L, value.biometricDataFormat)
                    (WinbioRegisteredFormat.typeLayout()).writeNative(addr + 44L, value.productId)
                }
            }
    }
}

public data class WinbioBirHeader0(
    public var beginDate: Long = 0L,
    public var endDate: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioBirHeader0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioBirHeader0> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioBirHeader0 =
                    WinbioBirHeader0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WinbioBirHeader0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.beginDate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.endDate)
                }
            }
    }
}

public data class WinbioBlankPayload(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
)

public data class WinbioBspSchema(
    public var biometricFactor: UInt = 0u,
    public var bspId: Guid = Guid(),
    public var description: UShortArray = UShortArray(256),
    public var vendor: UShortArray = UShortArray(256),
    public var version: WinbioVersion = WinbioVersion(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioBspSchema) return false
        if (this.biometricFactor != other.biometricFactor) return false
        if (this.bspId != other.bspId) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.vendor.contentEquals(other.vendor)) return false
        if (this.version != other.version) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.biometricFactor.hashCode()
        result = 31 * result + this.bspId.hashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.vendor.contentHashCode()
        result = 31 * result + this.version.hashCode()
        return result
    }
}

public data class WinbioCalibrationInfo(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var calibrationData: WinbioData = WinbioData(),
)

public data class WinbioCaptureData(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var sensorStatus: UInt = 0u,
    public var rejectDetail: UInt = 0u,
    public var captureData: WinbioData = WinbioData(),
)

public data class WinbioCaptureParameters(
    public var payloadSize: UInt = 0u,
    public var purpose: UByte = 0u,
    public var format: WinbioRegisteredFormat = WinbioRegisteredFormat(),
    public var vendorFormat: Guid = Guid(),
    public var flags: UByte = 0u,
)

public data class WinbioData(
    public var size: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioData) return false
        if (this.size != other.size) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioData> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioData =
                    WinbioData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinbioData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.data)
                }
            }
    }
}

public data class WinbioDiagnostics(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var sensorStatus: UInt = 0u,
    public var vendorDiagnostics: WinbioData = WinbioData(),
)

public data class WinbioEncryptedCaptureParams(
    public var payloadSize: UInt = 0u,
    public var purpose: UByte = 0u,
    public var format: WinbioRegisteredFormat = WinbioRegisteredFormat(),
    public var vendorFormat: Guid = Guid(),
    public var flags: UByte = 0u,
    public var nonceSize: UInt = 0u,
)

public class WinbioEngineInterface(
    public var version: WinbioAdapterInterfaceVersion = WinbioAdapterInterfaceVersion(),
    public var type: UInt = 0u,
    public var size: Int = 0,
    public var adapterId: Guid = Guid(),
    public var attach: PibioEngineAttachFn = null,
    public var detach: PibioEngineDetachFn = null,
    public var clearContext: PibioEngineClearContextFn = null,
    public var queryPreferredFormat: PibioEngineQueryPreferredFormatFn = null,
    public var queryIndexVectorSize: PibioEngineQueryIndexVectorSizeFn = null,
    public var queryHashAlgorithms: PibioEngineQueryHashAlgorithmsFn = null,
    public var setHashAlgorithm: PibioEngineSetHashAlgorithmFn = null,
    public var querySampleHint: PibioEngineQuerySampleHintFn = null,
    public var acceptSampleData: PibioEngineAcceptSampleDataFn = null,
    public var exportEngineData: PibioEngineExportEngineDataFn = null,
    public var verifyFeatureSet: PibioEngineVerifyFeatureSetFn = null,
    public var identifyFeatureSet: PibioEngineIdentifyFeatureSetFn = null,
    public var createEnrollment: PibioEngineCreateEnrollmentFn = null,
    public var updateEnrollment: PibioEngineUpdateEnrollmentFn = null,
    public var getEnrollmentStatus: PibioEngineGetEnrollmentStatusFn = null,
    public var getEnrollmentHash: PibioEngineGetEnrollmentHashFn = null,
    public var checkForDuplicate: PibioEngineCheckForDuplicateFn = null,
    public var commitEnrollment: PibioEngineCommitEnrollmentFn = null,
    public var discardEnrollment: PibioEngineDiscardEnrollmentFn = null,
    public var controlUnit: PibioEngineControlUnitFn = null,
    public var controlUnitPrivileged: PibioEngineControlUnitPrivilegedFn = null,
    public var notifyPowerChange: PibioEngineNotifyPowerChangeFn = null,
    public var reserved1: PibioEngineReserved1Fn = null,
    public var pipelineInit: PibioEnginePipelineInitFn = null,
    public var pipelineCleanup: PibioEnginePipelineCleanupFn = null,
    public var activate: PibioEngineActivateFn = null,
    public var deactivate: PibioEngineDeactivateFn = null,
    public var queryExtendedInfo: PibioEngineQueryExtendedInfoFn = null,
    public var identifyAll: PibioEngineIdentifyAllFn = null,
    public var setEnrollmentSelector: PibioEngineSetEnrollmentSelectorFn = null,
    public var setEnrollmentParameters: PibioEngineSetEnrollmentParametersFn = null,
    public var queryExtendedEnrollmentStatus: PibioEngineQueryExtendedEnrollmentStatusFn = null,
    public var refreshCache: PibioEngineRefreshCacheFn = null,
    public var selectCalibrationFormat: PibioEngineSelectCalibrationFormatFn = null,
    public var queryCalibrationData: PibioEngineQueryCalibrationDataFn = null,
    public var setAccountPolicy: PibioEngineSetAccountPolicyFn = null,
    public var createKey: PibioEngineCreateKeyFn = null,
    public var identifyFeatureSetSecure: PibioEngineIdentifyFeatureSetSecureFn = null,
    public var acceptPrivateSensorTypeInfo: PibioEngineAcceptPrivateSensorTypeInfoFn = null,
    public var createEnrollmentAuthenticated: PibioEngineCreateEnrollmentAuthenticatedFn = null,
    public var identifyFeatureSetAuthenticated: PibioEngineIdentifyFeatureSetAuthenticatedFn = null,
)

public data class WinbioEvent(
    public var type: UInt = 0u,
    public var parameters: WinbioEvent0 = WinbioEvent0(),
)

public data class WinbioEvent0(
    public var unclaimed: WinbioEvent00 = WinbioEvent00(),
    public var unclaimedIdentify: WinbioEvent01 = WinbioEvent01(),
    public var error: WinbioEvent02 = WinbioEvent02(),
)

public data class WinbioEvent02(
    public var errorCode: Hresult = 0,
)

public data class WinbioEvent01(
    public var unitId: UInt = 0u,
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var subFactor: UByte = 0u,
    public var rejectDetail: UInt = 0u,
)

public data class WinbioEvent00(
    public var unitId: UInt = 0u,
    public var rejectDetail: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioEvent00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioEvent00> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioEvent00 =
                    WinbioEvent00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinbioEvent00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.unitId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.rejectDetail)
                }
            }
    }
}

public data class WinbioExtendedEngineInfo(
    public var genericEngineCapabilities: UInt = 0u,
    public var factor: UInt = 0u,
    public var specific: WinbioExtendedEngineInfo0 = WinbioExtendedEngineInfo0(),
)

public data class WinbioExtendedEngineInfo0(
    public var nullVal: UInt = 0u,
    public var facialFeatures: WinbioExtendedEngineInfo00 = WinbioExtendedEngineInfo00(),
    public var fingerprint: WinbioExtendedEngineInfo01 = WinbioExtendedEngineInfo01(),
    public var iris: WinbioExtendedEngineInfo02 = WinbioExtendedEngineInfo02(),
    public var voice: WinbioExtendedEngineInfo03 = WinbioExtendedEngineInfo03(),
)

public data class WinbioExtendedEngineInfo00(
    public var capabilities: UInt = 0u,
    public var enrollmentRequirements: WinbioExtendedEngineInfo000 = WinbioExtendedEngineInfo000(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo00> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedEngineInfo00 =
                    WinbioExtendedEngineInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (WinbioExtendedEngineInfo000.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedEngineInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.capabilities)
                    (WinbioExtendedEngineInfo000.typeLayout()).writeNative(addr + 4L, value.enrollmentRequirements)
                }
            }
    }
}

public data class WinbioExtendedEngineInfo000(
    public var nullVal: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo000> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedEngineInfo000 =
                    WinbioExtendedEngineInfo000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedEngineInfo000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nullVal)
                }
            }
    }
}

public data class WinbioExtendedEngineInfo01(
    public var capabilities: UInt = 0u,
    public var enrollmentRequirements: WinbioExtendedEngineInfo010 = WinbioExtendedEngineInfo010(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo01> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedEngineInfo01 =
                    WinbioExtendedEngineInfo01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (WinbioExtendedEngineInfo010.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedEngineInfo01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.capabilities)
                    (WinbioExtendedEngineInfo010.typeLayout()).writeNative(addr + 4L, value.enrollmentRequirements)
                }
            }
    }
}

public data class WinbioExtendedEngineInfo010(
    public var generalSamples: UInt = 0u,
    public var center: UInt = 0u,
    public var topEdge: UInt = 0u,
    public var bottomEdge: UInt = 0u,
    public var leftEdge: UInt = 0u,
    public var rightEdge: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo010> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo010> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedEngineInfo010 =
                    WinbioExtendedEngineInfo010(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedEngineInfo010) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.generalSamples)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.center)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.topEdge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bottomEdge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.leftEdge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.rightEdge)
                }
            }
    }
}

public data class WinbioExtendedEngineInfo02(
    public var capabilities: UInt = 0u,
    public var enrollmentRequirements: WinbioExtendedEngineInfo020 = WinbioExtendedEngineInfo020(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo02> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedEngineInfo02 =
                    WinbioExtendedEngineInfo02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (WinbioExtendedEngineInfo020.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedEngineInfo02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.capabilities)
                    (WinbioExtendedEngineInfo020.typeLayout()).writeNative(addr + 4L, value.enrollmentRequirements)
                }
            }
    }
}

public data class WinbioExtendedEngineInfo020(
    public var nullVal: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo020> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo020> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedEngineInfo020 =
                    WinbioExtendedEngineInfo020(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedEngineInfo020) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nullVal)
                }
            }
    }
}

public data class WinbioExtendedEngineInfo03(
    public var capabilities: UInt = 0u,
    public var enrollmentRequirements: WinbioExtendedEngineInfo030 = WinbioExtendedEngineInfo030(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo03> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedEngineInfo03 =
                    WinbioExtendedEngineInfo03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (WinbioExtendedEngineInfo030.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedEngineInfo03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.capabilities)
                    (WinbioExtendedEngineInfo030.typeLayout()).writeNative(addr + 4L, value.enrollmentRequirements)
                }
            }
    }
}

public data class WinbioExtendedEngineInfo030(
    public var nullVal: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo030> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEngineInfo030> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedEngineInfo030 =
                    WinbioExtendedEngineInfo030(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedEngineInfo030) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nullVal)
                }
            }
    }
}

public data class WinbioExtendedEnrollmentParameters(
    public var size: Int = 0,
    public var subFactor: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEnrollmentParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEnrollmentParameters> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioExtendedEnrollmentParameters =
                    WinbioExtendedEnrollmentParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedEnrollmentParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.subFactor)
                }
            }
    }
}

public data class WinbioExtendedEnrollmentStatus(
    public var templateStatus: Hresult = 0,
    public var rejectDetail: UInt = 0u,
    public var percentComplete: UInt = 0u,
    public var factor: UInt = 0u,
    public var subFactor: UByte = 0u,
    public var specific: WinbioExtendedEnrollmentStatus0 = WinbioExtendedEnrollmentStatus0(),
)

public data class WinbioExtendedEnrollmentStatus0(
    public var nullVal: UInt = 0u,
    public var facialFeatures: WinbioExtendedEnrollmentStatus00 = WinbioExtendedEnrollmentStatus00(),
    public var fingerprint: WinbioExtendedEnrollmentStatus01 = WinbioExtendedEnrollmentStatus01(),
    public var iris: WinbioExtendedEnrollmentStatus02 = WinbioExtendedEnrollmentStatus02(),
    public var voice: WinbioExtendedEnrollmentStatus03 = WinbioExtendedEnrollmentStatus03(),
)

public data class WinbioExtendedEnrollmentStatus00(
    public var boundingBox: Rect = Rect(),
    public var distance: Int = 0,
    public var opaqueEngineData: WinbioExtendedEnrollmentStatus000 = WinbioExtendedEnrollmentStatus000(),
)

public data class WinbioExtendedEnrollmentStatus000(
    public var adapterId: Guid = Guid(),
    public var data: UIntArray = UIntArray(78),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioExtendedEnrollmentStatus000) return false
        if (this.adapterId != other.adapterId) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adapterId.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WinbioExtendedEnrollmentStatus01(
    public var generalSamples: UInt = 0u,
    public var center: UInt = 0u,
    public var topEdge: UInt = 0u,
    public var bottomEdge: UInt = 0u,
    public var leftEdge: UInt = 0u,
    public var rightEdge: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEnrollmentStatus01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEnrollmentStatus01> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedEnrollmentStatus01 =
                    WinbioExtendedEnrollmentStatus01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedEnrollmentStatus01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.generalSamples)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.center)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.topEdge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bottomEdge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.leftEdge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.rightEdge)
                }
            }
    }
}

public data class WinbioExtendedEnrollmentStatus02(
    public var eyeBoundingBox1: Rect = Rect(),
    public var eyeBoundingBox2: Rect = Rect(),
    public var pupilCenter1: Point = Point(),
    public var pupilCenter2: Point = Point(),
    public var distance: Int = 0,
    public var gridPointCompletionPercent: UInt = 0u,
    public var gridPointIndex: UShort = 0u,
    public var point3D: WinbioExtendedEnrollmentStatus020 = WinbioExtendedEnrollmentStatus020(),
    public var stopCaptureAndShowCriticalFeedback: Bool = 0,
)

public data class WinbioExtendedEnrollmentStatus020(
    public var x: Double = 0.0,
    public var y: Double = 0.0,
    public var z: Double = 0.0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEnrollmentStatus020> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEnrollmentStatus020> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioExtendedEnrollmentStatus020 =
                    WinbioExtendedEnrollmentStatus020(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedEnrollmentStatus020) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 8L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr + 16L, value.z)
                }
            }
    }
}

public data class WinbioExtendedEnrollmentStatus03(
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEnrollmentStatus03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedEnrollmentStatus03> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedEnrollmentStatus03 =
                    WinbioExtendedEnrollmentStatus03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedEnrollmentStatus03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reserved)
                }
            }
    }
}

public data class WinbioExtendedSensorInfo(
    public var genericSensorCapabilities: UInt = 0u,
    public var factor: UInt = 0u,
    public var specific: WinbioExtendedSensorInfo0 = WinbioExtendedSensorInfo0(),
)

public data class WinbioExtendedSensorInfo0(
    public var nullVal: UInt = 0u,
    public var facialFeatures: WinbioExtendedSensorInfo00 = WinbioExtendedSensorInfo00(),
    public var fingerprint: WinbioExtendedSensorInfo01 = WinbioExtendedSensorInfo01(),
    public var iris: WinbioExtendedSensorInfo02 = WinbioExtendedSensorInfo02(),
    public var voice: WinbioExtendedSensorInfo03 = WinbioExtendedSensorInfo03(),
)

public data class WinbioExtendedSensorInfo00(
    public var frameSize: Rect = Rect(),
    public var frameOffset: Point = Point(),
    public var mandatoryOrientation: UInt = 0u,
    public var hardwareInfo: WinbioExtendedSensorInfo000 = WinbioExtendedSensorInfo000(),
)

public data class WinbioExtendedSensorInfo000(
    public var colorSensorId: UShortArray = UShortArray(260),
    public var infraredSensorId: UShortArray = UShortArray(260),
    public var infraredSensorRotationAngle: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioExtendedSensorInfo000) return false
        if (!this.colorSensorId.contentEquals(other.colorSensorId)) return false
        if (!this.infraredSensorId.contentEquals(other.infraredSensorId)) return false
        if (this.infraredSensorRotationAngle != other.infraredSensorRotationAngle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.colorSensorId.contentHashCode()
        result = 31 * result + this.infraredSensorId.contentHashCode()
        result = 31 * result + this.infraredSensorRotationAngle.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedSensorInfo000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedSensorInfo000> {
                override val sizeBytes: Long = 1044L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedSensorInfo000 =
                    WinbioExtendedSensorInfo000(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 520L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1040L),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedSensorInfo000) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.colorSensorId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 520L, value.infraredSensorId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1040L, value.infraredSensorRotationAngle)
                }
            }
    }
}

public data class WinbioExtendedSensorInfo01(
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedSensorInfo01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedSensorInfo01> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedSensorInfo01 =
                    WinbioExtendedSensorInfo01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedSensorInfo01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reserved)
                }
            }
    }
}

public data class WinbioExtendedSensorInfo02(
    public var frameSize: Rect = Rect(),
    public var frameOffset: Point = Point(),
    public var mandatoryOrientation: UInt = 0u,
)

public data class WinbioExtendedSensorInfo03(
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedSensorInfo03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedSensorInfo03> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedSensorInfo03 =
                    WinbioExtendedSensorInfo03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedSensorInfo03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reserved)
                }
            }
    }
}

public data class WinbioExtendedStorageInfo(
    public var genericStorageCapabilities: UInt = 0u,
    public var factor: UInt = 0u,
    public var specific: WinbioExtendedStorageInfo0 = WinbioExtendedStorageInfo0(),
)

public data class WinbioExtendedStorageInfo0(
    public var nullVal: UInt = 0u,
    public var facialFeatures: WinbioExtendedStorageInfo00 = WinbioExtendedStorageInfo00(),
    public var fingerprint: WinbioExtendedStorageInfo01 = WinbioExtendedStorageInfo01(),
    public var iris: WinbioExtendedStorageInfo02 = WinbioExtendedStorageInfo02(),
    public var voice: WinbioExtendedStorageInfo03 = WinbioExtendedStorageInfo03(),
)

public data class WinbioExtendedStorageInfo00(
    public var capabilities: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedStorageInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedStorageInfo00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedStorageInfo00 =
                    WinbioExtendedStorageInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedStorageInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.capabilities)
                }
            }
    }
}

public data class WinbioExtendedStorageInfo01(
    public var capabilities: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedStorageInfo01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedStorageInfo01> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedStorageInfo01 =
                    WinbioExtendedStorageInfo01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedStorageInfo01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.capabilities)
                }
            }
    }
}

public data class WinbioExtendedStorageInfo02(
    public var capabilities: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedStorageInfo02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedStorageInfo02> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedStorageInfo02 =
                    WinbioExtendedStorageInfo02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedStorageInfo02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.capabilities)
                }
            }
    }
}

public data class WinbioExtendedStorageInfo03(
    public var capabilities: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedStorageInfo03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedStorageInfo03> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedStorageInfo03 =
                    WinbioExtendedStorageInfo03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedStorageInfo03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.capabilities)
                }
            }
    }
}

public data class WinbioExtendedUnitStatus(
    public var availability: UInt = 0u,
    public var reasonCode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedUnitStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioExtendedUnitStatus> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioExtendedUnitStatus =
                    WinbioExtendedUnitStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinbioExtendedUnitStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.availability)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reasonCode)
                }
            }
    }
}

public data class WinbioFpBuState(
    public var sensorAttached: Bool = 0,
    public var creationResult: Hresult = 0,
)

public class WinbioFrameworkInterface(
    public var version: WinbioAdapterInterfaceVersion = WinbioAdapterInterfaceVersion(),
    public var type: UInt = 0u,
    public var size: Int = 0,
    public var adapterId: Guid = Guid(),
    public var setUnitStatus: PibioFrameworkSetUnitStatusFn = null,
    public var vsmStorageAttach: PibioStorageAttachFn = null,
    public var vsmStorageDetach: PibioStorageDetachFn = null,
    public var vsmStorageClearContext: PibioStorageClearContextFn = null,
    public var vsmStorageCreateDatabase: PibioStorageCreateDatabaseFn = null,
    public var vsmStorageOpenDatabase: PibioStorageOpenDatabaseFn = null,
    public var vsmStorageCloseDatabase: PibioStorageCloseDatabaseFn = null,
    public var vsmStorageDeleteRecord: PibioStorageDeleteRecordFn = null,
    public var vsmStorageNotifyPowerChange: PibioStorageNotifyPowerChangeFn = null,
    public var vsmStoragePipelineInit: PibioStoragePipelineInitFn = null,
    public var vsmStoragePipelineCleanup: PibioStoragePipelineCleanupFn = null,
    public var vsmStorageActivate: PibioStorageActivateFn = null,
    public var vsmStorageDeactivate: PibioStorageDeactivateFn = null,
    public var vsmStorageQueryExtendedInfo: PibioStorageQueryExtendedInfoFn = null,
    public var vsmStorageCacheClear: PibioFrameworkVsmCacheClearFn = null,
    public var vsmStorageCacheImportBegin: PibioFrameworkVsmCacheImportBeginFn = null,
    public var vsmStorageCacheImportNext: PibioFrameworkVsmCacheImportNextFn = null,
    public var vsmStorageCacheImportEnd: PibioFrameworkVsmCacheImportEndFn = null,
    public var vsmStorageCacheExportBegin: PibioFrameworkVsmCacheExportBeginFn = null,
    public var vsmStorageCacheExportNext: PibioFrameworkVsmCacheExportNextFn = null,
    public var vsmStorageCacheExportEnd: PibioFrameworkVsmCacheExportEndFn = null,
    public var vsmSensorAttach: PibioSensorAttachFn = null,
    public var vsmSensorDetach: PibioSensorDetachFn = null,
    public var vsmSensorClearContext: PibioSensorClearContextFn = null,
    public var vsmSensorPushDataToEngine: PibioSensorPushDataToEngineFn = null,
    public var vsmSensorNotifyPowerChange: PibioSensorNotifyPowerChangeFn = null,
    public var vsmSensorPipelineInit: PibioSensorPipelineInitFn = null,
    public var vsmSensorPipelineCleanup: PibioSensorPipelineCleanupFn = null,
    public var vsmSensorActivate: PibioSensorActivateFn = null,
    public var vsmSensorDeactivate: PibioSensorDeactivateFn = null,
    public var vsmSensorAsyncImportRawBuffer: PibioSensorAsyncImportRawBufferFn = null,
    public var vsmSensorAsyncImportSecureBuffer: PibioSensorAsyncImportSecureBufferFn = null,
    public var reserved1: PibioFrameworkVsmStorageReserved1Fn = null,
    public var reserved2: PibioFrameworkVsmStorageReserved2Fn = null,
    public var reserved3: PibioFrameworkVsmStorageReserved3Fn = null,
    public var reserved4: PibioStorageReserved1Fn = null,
    public var reserved5: PibioStorageReserved2Fn = null,
    public var allocateMemory: PibioFrameworkAllocateMemoryFn = null,
    public var freeMemory: PibioFrameworkFreeMemoryFn = null,
    public var getProperty: PibioFrameworkGetPropertyFn = null,
    public var lockAndValidateSecureBuffer: PibioFrameworkLockAndValidateSecureBufferFn = null,
    public var releaseSecureBuffer: PibioFrameworkReleaseSecureBufferFn = null,
    public var queryAuthorizedEnrollments: PibioFrameworkVsmQueryAuthorizedEnrollmentsFn = null,
    public var decryptSample: PibioFrameworkVsmDecryptSampleFn = null,
)

public data class WinbioGestureMetadata(
    public var size: Int = 0,
    public var biometricType: UInt = 0u,
    public var matchType: UInt = 0u,
    public var protectionType: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioGestureMetadata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioGestureMetadata> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioGestureMetadata =
                    WinbioGestureMetadata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WinbioGestureMetadata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.biometricType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.matchType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.protectionType)
                }
            }
    }
}

public data class WinbioGetIndicator(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var indicatorStatus: UInt = 0u,
)

public data class WinbioIdentity(
    public var type: UInt = 0u,
    public var value: WinbioIdentity0 = WinbioIdentity0(),
)

public data class WinbioIdentity0(
    public var nullVal: UInt = 0u,
    public var wildcard: UInt = 0u,
    public var templateGuid: Guid = Guid(),
    public var accountSid: WinbioIdentity00 = WinbioIdentity00(),
    public var secureId: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioIdentity0) return false
        if (this.nullVal != other.nullVal) return false
        if (this.wildcard != other.wildcard) return false
        if (this.templateGuid != other.templateGuid) return false
        if (this.accountSid != other.accountSid) return false
        if (!this.secureId.contentEquals(other.secureId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nullVal.hashCode()
        result = 31 * result + this.wildcard.hashCode()
        result = 31 * result + this.templateGuid.hashCode()
        result = 31 * result + this.accountSid.hashCode()
        result = 31 * result + this.secureId.contentHashCode()
        return result
    }
}

public data class WinbioIdentity00(
    public var size: UInt = 0u,
    public var data: UByteArray = UByteArray(68),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioIdentity00) return false
        if (this.size != other.size) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioIdentity00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioIdentity00> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioIdentity00 =
                    WinbioIdentity00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (68).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinbioIdentity00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (68).toInt())
                    ).writeNative(addr + 4L, value.data)
                }
            }
    }
}

public data class WinbioNotifyWake(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var reason: UInt = 0u,
)

public class WinbioPipeline internal constructor(
    sensorHandleCtorArg: Handle,
    engineHandleCtorArg: Handle,
    storageHandleCtorArg: Handle,
    sensorInterfaceCtorArg: MutPtr<WinbioSensorInterface>,
    engineInterfaceCtorArg: MutPtr<WinbioEngineInterface>,
    storageInterfaceCtorArg: MutPtr<WinbioStorageInterface>,
    sensorContextCtorArg: MutPtr<WinibioSensorContext>,
    engineContextCtorArg: MutPtr<WinibioEngineContext>,
    storageContextCtorArg: MutPtr<WinibioStorageContext>,
    frameworkInterfaceCtorArg: MutPtr<WinbioFrameworkInterface>,
) {
    public var sensorHandle: Handle = sensorHandleCtorArg
        internal set

    public var engineHandle: Handle = engineHandleCtorArg
        internal set

    public var storageHandle: Handle = storageHandleCtorArg
        internal set

    public var sensorInterface: MutPtr<WinbioSensorInterface> = sensorInterfaceCtorArg
        internal set

    public var engineInterface: MutPtr<WinbioEngineInterface> = engineInterfaceCtorArg
        internal set

    public var storageInterface: MutPtr<WinbioStorageInterface> = storageInterfaceCtorArg
        internal set

    public var sensorContext: MutPtr<WinibioSensorContext> = sensorContextCtorArg
        internal set

    public var engineContext: MutPtr<WinibioEngineContext> = engineContextCtorArg
        internal set

    public var storageContext: MutPtr<WinibioStorageContext> = storageContextCtorArg
        internal set

    public var frameworkInterface: MutPtr<WinbioFrameworkInterface> = frameworkInterfaceCtorArg
        internal set

    public constructor() : this(
        sensorHandleCtorArg = MutPtr(0L),
        engineHandleCtorArg = MutPtr(0L),
        storageHandleCtorArg = MutPtr(0L),
        sensorInterfaceCtorArg = MutPtr(0L),
        engineInterfaceCtorArg = MutPtr(0L),
        storageInterfaceCtorArg = MutPtr(0L),
        sensorContextCtorArg = MutPtr(0L),
        engineContextCtorArg = MutPtr(0L),
        storageContextCtorArg = MutPtr(0L),
        frameworkInterfaceCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.sensorHandle

    public operator fun component2(): Handle = this.engineHandle

    public operator fun component3(): Handle = this.storageHandle

    public operator fun component4(): MutPtr<WinbioSensorInterface> = this.sensorInterface

    public operator fun component5(): MutPtr<WinbioEngineInterface> = this.engineInterface

    public operator fun component6(): MutPtr<WinbioStorageInterface> = this.storageInterface

    public operator fun component7(): MutPtr<WinibioSensorContext> = this.sensorContext

    public operator fun component8(): MutPtr<WinibioEngineContext> = this.engineContext

    public operator fun component9(): MutPtr<WinibioStorageContext> = this.storageContext

    public operator fun component10(): MutPtr<WinbioFrameworkInterface> = this.frameworkInterface

    public fun copy(sensorHandle: Handle = this.sensorHandle, engineHandle: Handle = this.engineHandle, storageHandle: Handle = this.storageHandle, sensorInterface: MutPtr<WinbioSensorInterface> = this.sensorInterface, engineInterface: MutPtr<WinbioEngineInterface> = this.engineInterface, storageInterface: MutPtr<WinbioStorageInterface> = this.storageInterface, sensorContext: MutPtr<WinibioSensorContext> = this.sensorContext, engineContext: MutPtr<WinibioEngineContext> = this.engineContext, storageContext: MutPtr<WinibioStorageContext> = this.storageContext, frameworkInterface: MutPtr<WinbioFrameworkInterface> = this.frameworkInterface): WinbioPipeline = WinbioPipeline(sensorHandleCtorArg = sensorHandle, engineHandleCtorArg = engineHandle, storageHandleCtorArg = storageHandle, sensorInterfaceCtorArg = sensorInterface, engineInterfaceCtorArg = engineInterface, storageInterfaceCtorArg = storageInterface, sensorContextCtorArg = sensorContext, engineContextCtorArg = engineContext, storageContextCtorArg = storageContext, frameworkInterfaceCtorArg = frameworkInterface)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioPipeline) return false
        if (this.sensorHandle != other.sensorHandle) return false
        if (this.engineHandle != other.engineHandle) return false
        if (this.storageHandle != other.storageHandle) return false
        if (this.sensorInterface != other.sensorInterface) return false
        if (this.engineInterface != other.engineInterface) return false
        if (this.storageInterface != other.storageInterface) return false
        if (this.sensorContext != other.sensorContext) return false
        if (this.engineContext != other.engineContext) return false
        if (this.storageContext != other.storageContext) return false
        if (this.frameworkInterface != other.frameworkInterface) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sensorHandle.hashCode()
        result = 31 * result + this.engineHandle.hashCode()
        result = 31 * result + this.storageHandle.hashCode()
        result = 31 * result + this.sensorInterface.hashCode()
        result = 31 * result + this.engineInterface.hashCode()
        result = 31 * result + this.storageInterface.hashCode()
        result = 31 * result + this.sensorContext.hashCode()
        result = 31 * result + this.engineContext.hashCode()
        result = 31 * result + this.storageContext.hashCode()
        result = 31 * result + this.frameworkInterface.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sensorHandle: Handle = MutPtr(0L),
            engineHandle: Handle = MutPtr(0L),
            storageHandle: Handle = MutPtr(0L),
            sensorInterface: MutPtr<WinbioSensorInterface> = MutPtr(0L),
            engineInterface: MutPtr<WinbioEngineInterface> = MutPtr(0L),
            storageInterface: MutPtr<WinbioStorageInterface> = MutPtr(0L),
            sensorContext: MutPtr<WinibioSensorContext> = MutPtr(0L),
            engineContext: MutPtr<WinibioEngineContext> = MutPtr(0L),
            storageContext: MutPtr<WinibioStorageContext> = MutPtr(0L),
            frameworkInterface: MutPtr<WinbioFrameworkInterface> = MutPtr(0L),
        ): WinbioPipeline =
            WinbioPipeline(
                sensorHandleCtorArg = sensorHandle,
                engineHandleCtorArg = engineHandle,
                storageHandleCtorArg = storageHandle,
                sensorInterfaceCtorArg = sensorInterface,
                engineInterfaceCtorArg = engineInterface,
                storageInterfaceCtorArg = storageInterface,
                sensorContextCtorArg = sensorContext,
                engineContextCtorArg = engineContext,
                storageContextCtorArg = storageContext,
                frameworkInterfaceCtorArg = frameworkInterface,
            )
    }
}

public data class WinbioPresence(
    public var factor: UInt = 0u,
    public var subFactor: UByte = 0u,
    public var status: Hresult = 0,
    public var rejectDetail: UInt = 0u,
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var trackingId: ULong = 0uL,
    public var ticket: ULong = 0uL,
    public var properties: WinbioPresenceProperties = WinbioPresenceProperties(),
    public var authorization: WinbioPresence0 = WinbioPresence0(),
)

public data class WinbioPresence0(
    public var size: UInt = 0u,
    public var data: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioPresence0) return false
        if (this.size != other.size) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioPresence0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioPresence0> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioPresence0 =
                    WinbioPresence0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinbioPresence0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 4L, value.data)
                }
            }
    }
}

public data class WinbioPresenceProperties(
    public var facialFeatures: WinbioPresenceProperties0 = WinbioPresenceProperties0(),
    public var iris: WinbioPresenceProperties1 = WinbioPresenceProperties1(),
)

public data class WinbioPresenceProperties0(
    public var boundingBox: Rect = Rect(),
    public var distance: Int = 0,
    public var opaqueEngineData: WinbioPresenceProperties00 = WinbioPresenceProperties00(),
)

public data class WinbioPresenceProperties00(
    public var adapterId: Guid = Guid(),
    public var data: UIntArray = UIntArray(78),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioPresenceProperties00) return false
        if (this.adapterId != other.adapterId) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adapterId.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class WinbioPresenceProperties1(
    public var eyeBoundingBox1: Rect = Rect(),
    public var eyeBoundingBox2: Rect = Rect(),
    public var pupilCenter1: Point = Point(),
    public var pupilCenter2: Point = Point(),
    public var distance: Int = 0,
)

public data class WinbioPrivateSensorTypeInfo(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var privateSensorTypeInfo: WinbioData = WinbioData(),
)

public data class WinbioProtectionPolicy(
    public var version: UInt = 0u,
    public var identity: WinbioIdentity = WinbioIdentity(),
    public var databaseId: Guid = Guid(),
    public var userState: ULong = 0uL,
    public var policySize: Int = 0,
    public var policy: UByteArray = UByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioProtectionPolicy) return false
        if (this.version != other.version) return false
        if (this.identity != other.identity) return false
        if (this.databaseId != other.databaseId) return false
        if (this.userState != other.userState) return false
        if (this.policySize != other.policySize) return false
        if (!this.policy.contentEquals(other.policy)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.identity.hashCode()
        result = 31 * result + this.databaseId.hashCode()
        result = 31 * result + this.userState.hashCode()
        result = 31 * result + this.policySize.hashCode()
        result = 31 * result + this.policy.contentHashCode()
        return result
    }
}

public data class WinbioRegisteredFormat(
    public var owner: UShort = 0u,
    public var type: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioRegisteredFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioRegisteredFormat> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): WinbioRegisteredFormat =
                    WinbioRegisteredFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: WinbioRegisteredFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.owner)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.type)
                }
            }
    }
}

public data class WinbioSecureBufferHeaderV1(
    public var type: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var validationTag: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioSecureBufferHeaderV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioSecureBufferHeaderV1> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioSecureBufferHeaderV1 =
                    WinbioSecureBufferHeaderV1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WinbioSecureBufferHeaderV1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.validationTag)
                }
            }
    }
}

public data class WinbioSecureConnectionData(
    public var size: UInt = 0u,
    public var version: UShort = 0u,
    public var flags: UShort = 0u,
    public var modelCertificateSize: UInt = 0u,
    public var intermediateCA1Size: UInt = 0u,
    public var intermediateCA2Size: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioSecureConnectionData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioSecureConnectionData> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioSecureConnectionData =
                    WinbioSecureConnectionData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: WinbioSecureConnectionData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.modelCertificateSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.intermediateCA1Size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.intermediateCA2Size)
                }
            }
    }
}

public data class WinbioSecureConnectionParams(
    public var payloadSize: UInt = 0u,
    public var version: UShort = 0u,
    public var flags: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioSecureConnectionParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioSecureConnectionParams> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioSecureConnectionParams =
                    WinbioSecureConnectionParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: WinbioSecureConnectionParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.payloadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.flags)
                }
            }
    }
}

public data class WinbioSensorAttributes(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var winBioVersion: WinbioVersion = WinbioVersion(),
    public var sensorType: UInt = 0u,
    public var sensorSubType: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var manufacturerName: UShortArray = UShortArray(256),
    public var modelName: UShortArray = UShortArray(256),
    public var serialNumber: UShortArray = UShortArray(256),
    public var firmwareVersion: WinbioVersion = WinbioVersion(),
    public var supportedFormatEntries: UInt = 0u,
    public var supportedFormat: List<WinbioRegisteredFormat> = List(1) { WinbioRegisteredFormat() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioSensorAttributes) return false
        if (this.payloadSize != other.payloadSize) return false
        if (this.winBioHresult != other.winBioHresult) return false
        if (this.winBioVersion != other.winBioVersion) return false
        if (this.sensorType != other.sensorType) return false
        if (this.sensorSubType != other.sensorSubType) return false
        if (this.capabilities != other.capabilities) return false
        if (!this.manufacturerName.contentEquals(other.manufacturerName)) return false
        if (!this.modelName.contentEquals(other.modelName)) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        if (this.firmwareVersion != other.firmwareVersion) return false
        if (this.supportedFormatEntries != other.supportedFormatEntries) return false
        if (this.supportedFormat != other.supportedFormat) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.payloadSize.hashCode()
        result = 31 * result + this.winBioHresult.hashCode()
        result = 31 * result + this.winBioVersion.hashCode()
        result = 31 * result + this.sensorType.hashCode()
        result = 31 * result + this.sensorSubType.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        result = 31 * result + this.manufacturerName.contentHashCode()
        result = 31 * result + this.modelName.contentHashCode()
        result = 31 * result + this.serialNumber.contentHashCode()
        result = 31 * result + this.firmwareVersion.hashCode()
        result = 31 * result + this.supportedFormatEntries.hashCode()
        result = 31 * result + this.supportedFormat.hashCode()
        return result
    }
}

public class WinbioSensorInterface(
    public var version: WinbioAdapterInterfaceVersion = WinbioAdapterInterfaceVersion(),
    public var type: UInt = 0u,
    public var size: Int = 0,
    public var adapterId: Guid = Guid(),
    public var attach: PibioSensorAttachFn = null,
    public var detach: PibioSensorDetachFn = null,
    public var clearContext: PibioSensorClearContextFn = null,
    public var queryStatus: PibioSensorQueryStatusFn = null,
    public var reset: PibioSensorResetFn = null,
    public var setMode: PibioSensorSetModeFn = null,
    public var setIndicatorStatus: PibioSensorSetIndicatorStatusFn = null,
    public var getIndicatorStatus: PibioSensorGetIndicatorStatusFn = null,
    public var startCapture: PibioSensorStartCaptureFn = null,
    public var finishCapture: PibioSensorFinishCaptureFn = null,
    public var exportSensorData: PibioSensorExportSensorDataFn = null,
    public var cancel: PibioSensorCancelFn = null,
    public var pushDataToEngine: PibioSensorPushDataToEngineFn = null,
    public var controlUnit: PibioSensorControlUnitFn = null,
    public var controlUnitPrivileged: PibioSensorControlUnitPrivilegedFn = null,
    public var notifyPowerChange: PibioSensorNotifyPowerChangeFn = null,
    public var pipelineInit: PibioSensorPipelineInitFn = null,
    public var pipelineCleanup: PibioSensorPipelineCleanupFn = null,
    public var activate: PibioSensorActivateFn = null,
    public var deactivate: PibioSensorDeactivateFn = null,
    public var queryExtendedInfo: PibioSensorQueryExtendedInfoFn = null,
    public var queryCalibrationFormats: PibioSensorQueryCalibrationFormatsFn = null,
    public var setCalibrationFormat: PibioSensorSetCalibrationFormatFn = null,
    public var acceptCalibrationData: PibioSensorAcceptCalibrationDataFn = null,
    public var asyncImportRawBuffer: PibioSensorAsyncImportRawBufferFn = null,
    public var asyncImportSecureBuffer: PibioSensorAsyncImportSecureBufferFn = null,
    public var queryPrivateSensorType: PibioSensorQueryPrivateSensorTypeFn = null,
    public var connectSecure: PibioSensorConnectSecureFn = null,
    public var startCaptureEx: PibioSensorStartCaptureExFn = null,
    public var startNotifyWake: PibioSensorStartNotifyWakeFn = null,
    public var finishNotifyWake: PibioSensorFinishNotifyWakeFn = null,
)

public data class WinbioSetIndicator(
    public var payloadSize: UInt = 0u,
    public var indicatorStatus: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioSetIndicator> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioSetIndicator> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioSetIndicator =
                    WinbioSetIndicator(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinbioSetIndicator) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.payloadSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.indicatorStatus)
                }
            }
    }
}

public class WinbioStorageInterface(
    public var version: WinbioAdapterInterfaceVersion = WinbioAdapterInterfaceVersion(),
    public var type: UInt = 0u,
    public var size: Int = 0,
    public var adapterId: Guid = Guid(),
    public var attach: PibioStorageAttachFn = null,
    public var detach: PibioStorageDetachFn = null,
    public var clearContext: PibioStorageClearContextFn = null,
    public var createDatabase: PibioStorageCreateDatabaseFn = null,
    public var eraseDatabase: PibioStorageEraseDatabaseFn = null,
    public var openDatabase: PibioStorageOpenDatabaseFn = null,
    public var closeDatabase: PibioStorageCloseDatabaseFn = null,
    public var getDataFormat: PibioStorageGetDataFormatFn = null,
    public var getDatabaseSize: PibioStorageGetDatabaseSizeFn = null,
    public var addRecord: PibioStorageAddRecordFn = null,
    public var deleteRecord: PibioStorageDeleteRecordFn = null,
    public var queryBySubject: PibioStorageQueryBySubjectFn = null,
    public var queryByContent: PibioStorageQueryByContentFn = null,
    public var getRecordCount: PibioStorageGetRecordCountFn = null,
    public var firstRecord: PibioStorageFirstRecordFn = null,
    public var nextRecord: PibioStorageNextRecordFn = null,
    public var getCurrentRecord: PibioStorageGetCurrentRecordFn = null,
    public var controlUnit: PibioStorageControlUnitFn = null,
    public var controlUnitPrivileged: PibioStorageControlUnitPrivilegedFn = null,
    public var notifyPowerChange: PibioStorageNotifyPowerChangeFn = null,
    public var pipelineInit: PibioStoragePipelineInitFn = null,
    public var pipelineCleanup: PibioStoragePipelineCleanupFn = null,
    public var activate: PibioStorageActivateFn = null,
    public var deactivate: PibioStorageDeactivateFn = null,
    public var queryExtendedInfo: PibioStorageQueryExtendedInfoFn = null,
    public var notifyDatabaseChange: PibioStorageNotifyDatabaseChangeFn = null,
    public var reserved1: PibioStorageReserved1Fn = null,
    public var reserved2: PibioStorageReserved2Fn = null,
    public var updateRecordBegin: PibioStorageUpdateRecordBeginFn = null,
    public var updateRecordCommit: PibioStorageUpdateRecordCommitFn = null,
)

public class WinbioStorageRecord internal constructor(
    identityCtorArg: MutPtr<WinbioIdentity>,
    public var subFactor: UByte,
    indexVectorCtorArg: MutPtr<UInt>,
    public var indexElementCount: Int,
    templateBlobCtorArg: MutPtr<UByte>,
    public var templateBlobSize: Int,
    payloadBlobCtorArg: MutPtr<UByte>,
    public var payloadBlobSize: Int,
) {
    public var identity: MutPtr<WinbioIdentity> = identityCtorArg
        internal set

    public var indexVector: MutPtr<UInt> = indexVectorCtorArg
        internal set

    public var templateBlob: MutPtr<UByte> = templateBlobCtorArg
        internal set

    public var payloadBlob: MutPtr<UByte> = payloadBlobCtorArg
        internal set

    public constructor() : this(
        identityCtorArg = MutPtr(0L),
        subFactor = 0u,
        indexVectorCtorArg = MutPtr(0L),
        indexElementCount = 0,
        templateBlobCtorArg = MutPtr(0L),
        templateBlobSize = 0,
        payloadBlobCtorArg = MutPtr(0L),
        payloadBlobSize = 0,
    )

    public operator fun component1(): MutPtr<WinbioIdentity> = this.identity

    public operator fun component2(): UByte = this.subFactor

    public operator fun component3(): MutPtr<UInt> = this.indexVector

    public operator fun component4(): Int = this.indexElementCount

    public operator fun component5(): MutPtr<UByte> = this.templateBlob

    public operator fun component6(): Int = this.templateBlobSize

    public operator fun component7(): MutPtr<UByte> = this.payloadBlob

    public operator fun component8(): Int = this.payloadBlobSize

    public fun copy(identity: MutPtr<WinbioIdentity> = this.identity, subFactor: UByte = this.subFactor, indexVector: MutPtr<UInt> = this.indexVector, indexElementCount: Int = this.indexElementCount, templateBlob: MutPtr<UByte> = this.templateBlob, templateBlobSize: Int = this.templateBlobSize, payloadBlob: MutPtr<UByte> = this.payloadBlob, payloadBlobSize: Int = this.payloadBlobSize): WinbioStorageRecord = WinbioStorageRecord(identityCtorArg = identity, subFactor = subFactor, indexVectorCtorArg = indexVector, indexElementCount = indexElementCount, templateBlobCtorArg = templateBlob, templateBlobSize = templateBlobSize, payloadBlobCtorArg = payloadBlob, payloadBlobSize = payloadBlobSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioStorageRecord) return false
        if (this.identity != other.identity) return false
        if (this.subFactor != other.subFactor) return false
        if (this.indexVector != other.indexVector) return false
        if (this.indexElementCount != other.indexElementCount) return false
        if (this.templateBlob != other.templateBlob) return false
        if (this.templateBlobSize != other.templateBlobSize) return false
        if (this.payloadBlob != other.payloadBlob) return false
        if (this.payloadBlobSize != other.payloadBlobSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.identity.hashCode()
        result = 31 * result + this.subFactor.hashCode()
        result = 31 * result + this.indexVector.hashCode()
        result = 31 * result + this.indexElementCount.hashCode()
        result = 31 * result + this.templateBlob.hashCode()
        result = 31 * result + this.templateBlobSize.hashCode()
        result = 31 * result + this.payloadBlob.hashCode()
        result = 31 * result + this.payloadBlobSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioStorageRecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioStorageRecord> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): WinbioStorageRecord =
                    WinbioStorageRecord(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<WinbioIdentity>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: WinbioStorageRecord) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<WinbioIdentity>(64)
                    ).writeNative(addr, value.identity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.subFactor)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 16L, value.indexVector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.indexElementCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.templateBlob)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.templateBlobSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 48L, value.payloadBlob)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 56L, value.payloadBlobSize)
                }
            }

        public operator fun invoke(
            identity: MutPtr<WinbioIdentity> = MutPtr(0L),
            subFactor: UByte = 0u,
            indexVector: MutPtr<UInt> = MutPtr(0L),
            indexElementCount: Int = 0,
            templateBlob: MutPtr<UByte> = MutPtr(0L),
            templateBlobSize: Int = 0,
            payloadBlob: MutPtr<UByte> = MutPtr(0L),
            payloadBlobSize: Int = 0,
        ): WinbioStorageRecord =
            WinbioStorageRecord(
                identityCtorArg = identity,
                subFactor = subFactor,
                indexVectorCtorArg = indexVector,
                indexElementCount = indexElementCount,
                templateBlobCtorArg = templateBlob,
                templateBlobSize = templateBlobSize,
                payloadBlobCtorArg = payloadBlob,
                payloadBlobSize = payloadBlobSize,
            )
    }
}

public data class WinbioStorageSchema(
    public var biometricFactor: UInt = 0u,
    public var databaseId: Guid = Guid(),
    public var dataFormat: Guid = Guid(),
    public var attributes: UInt = 0u,
    public var filePath: UShortArray = UShortArray(256),
    public var connectionString: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioStorageSchema) return false
        if (this.biometricFactor != other.biometricFactor) return false
        if (this.databaseId != other.databaseId) return false
        if (this.dataFormat != other.dataFormat) return false
        if (this.attributes != other.attributes) return false
        if (!this.filePath.contentEquals(other.filePath)) return false
        if (!this.connectionString.contentEquals(other.connectionString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.biometricFactor.hashCode()
        result = 31 * result + this.databaseId.hashCode()
        result = 31 * result + this.dataFormat.hashCode()
        result = 31 * result + this.attributes.hashCode()
        result = 31 * result + this.filePath.contentHashCode()
        result = 31 * result + this.connectionString.contentHashCode()
        return result
    }
}

public data class WinbioSupportedAlgorithms(
    public var payloadSize: UInt = 0u,
    public var winBioHresult: Hresult = 0,
    public var numberOfAlgorithms: UInt = 0u,
    public var algorithmData: WinbioData = WinbioData(),
)

public data class WinbioUnitSchema(
    public var unitId: UInt = 0u,
    public var poolType: UInt = 0u,
    public var biometricFactor: UInt = 0u,
    public var sensorSubType: UInt = 0u,
    public var capabilities: UInt = 0u,
    public var deviceInstanceId: UShortArray = UShortArray(256),
    public var description: UShortArray = UShortArray(256),
    public var manufacturer: UShortArray = UShortArray(256),
    public var model: UShortArray = UShortArray(256),
    public var serialNumber: UShortArray = UShortArray(256),
    public var firmwareVersion: WinbioVersion = WinbioVersion(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WinbioUnitSchema) return false
        if (this.unitId != other.unitId) return false
        if (this.poolType != other.poolType) return false
        if (this.biometricFactor != other.biometricFactor) return false
        if (this.sensorSubType != other.sensorSubType) return false
        if (this.capabilities != other.capabilities) return false
        if (!this.deviceInstanceId.contentEquals(other.deviceInstanceId)) return false
        if (!this.description.contentEquals(other.description)) return false
        if (!this.manufacturer.contentEquals(other.manufacturer)) return false
        if (!this.model.contentEquals(other.model)) return false
        if (!this.serialNumber.contentEquals(other.serialNumber)) return false
        if (this.firmwareVersion != other.firmwareVersion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.unitId.hashCode()
        result = 31 * result + this.poolType.hashCode()
        result = 31 * result + this.biometricFactor.hashCode()
        result = 31 * result + this.sensorSubType.hashCode()
        result = 31 * result + this.capabilities.hashCode()
        result = 31 * result + this.deviceInstanceId.contentHashCode()
        result = 31 * result + this.description.contentHashCode()
        result = 31 * result + this.manufacturer.contentHashCode()
        result = 31 * result + this.model.contentHashCode()
        result = 31 * result + this.serialNumber.contentHashCode()
        result = 31 * result + this.firmwareVersion.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioUnitSchema> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioUnitSchema> {
                override val sizeBytes: Long = 2588L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioUnitSchema =
                    WinbioUnitSchema(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 532L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 1044L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 1556L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 2068L),
                        (WinbioVersion.typeLayout()).readNative(addr + 2580L),
                    )
                override fun writeNative(addr: Long, value: WinbioUnitSchema) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.unitId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.poolType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.biometricFactor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sensorSubType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.capabilities)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 20L, value.deviceInstanceId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 532L, value.description)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 1044L, value.manufacturer)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 1556L, value.model)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 2068L, value.serialNumber)
                    (WinbioVersion.typeLayout()).writeNative(addr + 2580L, value.firmwareVersion)
                }
            }
    }
}

public data class WinbioUpdateFirmware(
    public var payloadSize: UInt = 0u,
    public var firmwareData: WinbioData = WinbioData(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioUpdateFirmware> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioUpdateFirmware> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioUpdateFirmware =
                    WinbioUpdateFirmware(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (WinbioData.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinbioUpdateFirmware) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.payloadSize)
                    (WinbioData.typeLayout()).writeNative(addr + 4L, value.firmwareData)
                }
            }
    }
}

public data class WinbioVersion(
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WinbioVersion> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WinbioVersion =
                    WinbioVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WinbioVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minorVersion)
                }
            }
    }
}
