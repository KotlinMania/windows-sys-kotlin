package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public data class HID_XFER_PACKET(
    public var reportBuffer: Long = 0L,
    public var reportBufferLen: UInt = 0u,
    public var reportId: UByte = 0u,
)

public class VHF_CONFIG(
    public var Size: UInt = 0u,
    public var VhfClientContext: Long = 0L,
    public var OperationContextSize: UInt = 0u,
    public var FileHandle: HANDLE = 0L,
    public var VendorID: UShort = 0u,
    public var ProductID: UShort = 0u,
    public var VersionNumber: UShort = 0u,
    public var ContainerID: GUID = GUID(),
    public var InstanceIDLength: UShort = 0u,
    public var InstanceID: PWSTR = 0L,
    public var ReportDescriptorLength: UShort = 0u,
    public var ReportDescriptor: Long = 0L,
    public var EvtVhfReadyForNextReadReport: EVT_VHF_READY_FOR_NEXT_READ_REPORT = null,
    public var EvtVhfAsyncOperationGetFeature: EVT_VHF_ASYNC_OPERATION = null,
    public var EvtVhfAsyncOperationSetFeature: EVT_VHF_ASYNC_OPERATION = null,
    public var EvtVhfAsyncOperationWriteReport: EVT_VHF_ASYNC_OPERATION = null,
    public var EvtVhfAsyncOperationGetInputReport: EVT_VHF_ASYNC_OPERATION = null,
    public var EvtVhfCleanup: EVT_VHF_CLEANUP = null,
    public var HardwareIDsLength: UShort = 0u,
    public var HardwareIDs: PWSTR = 0L,
)
