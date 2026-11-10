package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class HidXferPacket(
    public var reportBuffer: COpaquePointer? = null,
    public var reportBufferLen: UInt = 0u,
    public var reportId: UByte = 0u,
)

public class VhfConfig(
    public var size: UInt = 0u,
    public var vhfClientContext: COpaquePointer? = null,
    public var operationContextSize: UInt = 0u,
    public var fileHandle: Handle = null,
    public var vendorID: UShort = 0u,
    public var productID: UShort = 0u,
    public var versionNumber: UShort = 0u,
    public var containerID: Guid = Guid(),
    public var instanceIDLength: UShort = 0u,
    public var instanceID: Pwstr = null,
    public var reportDescriptorLength: UShort = 0u,
    public var reportDescriptor: COpaquePointer? = null,
    public var evtVhfReadyForNextReadReport: EvtVhfReadyForNextReadReport = null,
    public var evtVhfAsyncOperationGetFeature: EvtVhfAsyncOperation = null,
    public var evtVhfAsyncOperationSetFeature: EvtVhfAsyncOperation = null,
    public var evtVhfAsyncOperationWriteReport: EvtVhfAsyncOperation = null,
    public var evtVhfAsyncOperationGetInputReport: EvtVhfAsyncOperation = null,
    public var evtVhfCleanup: EvtVhfCleanup = null,
    public var hardwareIDsLength: UShort = 0u,
    public var hardwareIDs: Pwstr = null,
)
