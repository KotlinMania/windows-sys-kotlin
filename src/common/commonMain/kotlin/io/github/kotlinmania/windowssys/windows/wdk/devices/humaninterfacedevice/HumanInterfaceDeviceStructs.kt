package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public class HidXferPacket internal constructor(
    reportBufferCtorArg: MutPtr<UByte>,
    public var reportBufferLen: UInt,
    public var reportId: UByte,
) {
    public var reportBuffer: MutPtr<UByte> = reportBufferCtorArg
        internal set

    public constructor() : this(
        reportBufferCtorArg = MutPtr(0L),
        reportBufferLen = 0u,
        reportId = 0u,
    )

    public operator fun component1(): MutPtr<UByte> = this.reportBuffer

    public operator fun component2(): UInt = this.reportBufferLen

    public operator fun component3(): UByte = this.reportId

    public fun copy(reportBuffer: MutPtr<UByte> = this.reportBuffer, reportBufferLen: UInt = this.reportBufferLen, reportId: UByte = this.reportId): HidXferPacket = HidXferPacket(reportBufferCtorArg = reportBuffer, reportBufferLen = reportBufferLen, reportId = reportId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HidXferPacket) return false
        if (this.reportBuffer != other.reportBuffer) return false
        if (this.reportBufferLen != other.reportBufferLen) return false
        if (this.reportId != other.reportId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reportBuffer.hashCode()
        result = 31 * result + this.reportBufferLen.hashCode()
        result = 31 * result + this.reportId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidXferPacket> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HidXferPacket> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): HidXferPacket =
                    HidXferPacket(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: HidXferPacket) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.reportBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reportBufferLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.reportId)
                }
            }

        public operator fun invoke(
            reportBuffer: MutPtr<UByte> = MutPtr(0L),
            reportBufferLen: UInt = 0u,
            reportId: UByte = 0u,
        ): HidXferPacket =
            HidXferPacket(
                reportBufferCtorArg = reportBuffer,
                reportBufferLen = reportBufferLen,
                reportId = reportId,
            )
    }
}

public class VhfConfig internal constructor(
    public var size: UInt,
    vhfClientContextCtorArg: MutPtr<CVoid>,
    public var operationContextSize: UInt,
    fileHandleCtorArg: Handle,
    public var vendorID: UShort,
    public var productID: UShort,
    public var versionNumber: UShort,
    public var containerID: Guid,
    public var instanceIDLength: UShort,
    instanceIDCtorArg: Pwstr,
    public var reportDescriptorLength: UShort,
    reportDescriptorCtorArg: MutPtr<UByte>,
    public var evtVhfReadyForNextReadReport: EvtVhfReadyForNextReadReport,
    public var evtVhfAsyncOperationGetFeature: EvtVhfAsyncOperation,
    public var evtVhfAsyncOperationSetFeature: EvtVhfAsyncOperation,
    public var evtVhfAsyncOperationWriteReport: EvtVhfAsyncOperation,
    public var evtVhfAsyncOperationGetInputReport: EvtVhfAsyncOperation,
    public var evtVhfCleanup: EvtVhfCleanup,
    public var hardwareIDsLength: UShort,
    hardwareIDsCtorArg: Pwstr,
) {
    public var vhfClientContext: MutPtr<CVoid> = vhfClientContextCtorArg
        internal set

    public var fileHandle: Handle = fileHandleCtorArg
        internal set

    public var instanceID: Pwstr = instanceIDCtorArg
        internal set

    public var reportDescriptor: MutPtr<UByte> = reportDescriptorCtorArg
        internal set

    public var hardwareIDs: Pwstr = hardwareIDsCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        vhfClientContextCtorArg = MutPtr(0L),
        operationContextSize = 0u,
        fileHandleCtorArg = MutPtr(0L),
        vendorID = 0u,
        productID = 0u,
        versionNumber = 0u,
        containerID = Guid(),
        instanceIDLength = 0u,
        instanceIDCtorArg = MutPtr(0L),
        reportDescriptorLength = 0u,
        reportDescriptorCtorArg = MutPtr(0L),
        evtVhfReadyForNextReadReport = null,
        evtVhfAsyncOperationGetFeature = null,
        evtVhfAsyncOperationSetFeature = null,
        evtVhfAsyncOperationWriteReport = null,
        evtVhfAsyncOperationGetInputReport = null,
        evtVhfCleanup = null,
        hardwareIDsLength = 0u,
        hardwareIDsCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            vhfClientContext: MutPtr<CVoid> = MutPtr(0L),
            operationContextSize: UInt = 0u,
            fileHandle: Handle = MutPtr(0L),
            vendorID: UShort = 0u,
            productID: UShort = 0u,
            versionNumber: UShort = 0u,
            containerID: Guid = Guid(),
            instanceIDLength: UShort = 0u,
            instanceID: Pwstr = MutPtr(0L),
            reportDescriptorLength: UShort = 0u,
            reportDescriptor: MutPtr<UByte> = MutPtr(0L),
            evtVhfReadyForNextReadReport: EvtVhfReadyForNextReadReport = null,
            evtVhfAsyncOperationGetFeature: EvtVhfAsyncOperation = null,
            evtVhfAsyncOperationSetFeature: EvtVhfAsyncOperation = null,
            evtVhfAsyncOperationWriteReport: EvtVhfAsyncOperation = null,
            evtVhfAsyncOperationGetInputReport: EvtVhfAsyncOperation = null,
            evtVhfCleanup: EvtVhfCleanup = null,
            hardwareIDsLength: UShort = 0u,
            hardwareIDs: Pwstr = MutPtr(0L),
        ): VhfConfig =
            VhfConfig(
                size = size,
                vhfClientContextCtorArg = vhfClientContext,
                operationContextSize = operationContextSize,
                fileHandleCtorArg = fileHandle,
                vendorID = vendorID,
                productID = productID,
                versionNumber = versionNumber,
                containerID = containerID,
                instanceIDLength = instanceIDLength,
                instanceIDCtorArg = instanceID,
                reportDescriptorLength = reportDescriptorLength,
                reportDescriptorCtorArg = reportDescriptor,
                evtVhfReadyForNextReadReport = evtVhfReadyForNextReadReport,
                evtVhfAsyncOperationGetFeature = evtVhfAsyncOperationGetFeature,
                evtVhfAsyncOperationSetFeature = evtVhfAsyncOperationSetFeature,
                evtVhfAsyncOperationWriteReport = evtVhfAsyncOperationWriteReport,
                evtVhfAsyncOperationGetInputReport = evtVhfAsyncOperationGetInputReport,
                evtVhfCleanup = evtVhfCleanup,
                hardwareIDsLength = hardwareIDsLength,
                hardwareIDsCtorArg = hardwareIDs,
            )
    }
}
