package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.IoAllocationAction
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

public typealias DmaCommonBufferVector = Long

public fun interface DriverAddDeviceFn {
    public operator fun invoke(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?): Ntstatus
}

public typealias DriverAddDevice = DriverAddDeviceFn?

public fun interface DriverCancelFn {
    public operator fun invoke(deviceobject: COpaquePointer?, irp: COpaquePointer?)
}

public typealias DriverCancel = DriverCancelFn?

public fun interface DriverControlFn {
    public operator fun invoke(deviceobject: COpaquePointer?, irp: COpaquePointer?, mapregisterbase: COpaquePointer?, context: COpaquePointer?): IoAllocationAction
}

public typealias DriverControl = DriverControlFn?

public fun interface DriverDispatchFn {
    public operator fun invoke(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus
}

public typealias DriverDispatch = DriverDispatchFn?

public fun interface DriverDispatchPagedFn {
    public operator fun invoke(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus
}

public typealias DriverDispatchPaged = DriverDispatchPagedFn?

public fun interface DriverFsNotificationFn {
    public operator fun invoke(deviceobject: COpaquePointer?, fsactive: Boolean)
}

public typealias DriverFsNotification = DriverFsNotificationFn?

public fun interface DriverInitializeFn {
    public operator fun invoke(driverobject: COpaquePointer?, registrypath: COpaquePointer?): Ntstatus
}

public typealias DriverInitialize = DriverInitializeFn?

public fun interface DriverNotificationCallbackRoutineFn {
    public operator fun invoke(notificationstructure: COpaquePointer?, context: COpaquePointer?): Ntstatus
}

public typealias DriverNotificationCallbackRoutine = DriverNotificationCallbackRoutineFn?

public fun interface DriverReinitializeFn {
    public operator fun invoke(driverobject: COpaquePointer?, context: COpaquePointer?, count: UInt)
}

public typealias DriverReinitialize = DriverReinitializeFn?

public fun interface DriverStartioFn {
    public operator fun invoke(deviceobject: COpaquePointer?, irp: COpaquePointer?)
}

public typealias DriverStartio = DriverStartioFn?

public fun interface DriverUnloadFn {
    public operator fun invoke(driverobject: COpaquePointer?)
}

public typealias DriverUnload = DriverUnloadFn?

public typealias EcpHeader = Long

public typealias EcpList = Long

public fun interface FastIoAcquireFileFn {
    public operator fun invoke(fileobject: COpaquePointer?)
}

public typealias FastIoAcquireFile = FastIoAcquireFileFn?

public fun interface FastIoAcquireForCcflushFn {
    public operator fun invoke(fileobject: COpaquePointer?, deviceobject: COpaquePointer?): Ntstatus
}

public typealias FastIoAcquireForCcflush = FastIoAcquireForCcflushFn?

public fun interface FastIoAcquireForModWriteFn {
    public operator fun invoke(fileobject: COpaquePointer?, endingoffset: COpaquePointer?, resourcetorelease: COpaquePointer?, deviceobject: COpaquePointer?): Ntstatus
}

public typealias FastIoAcquireForModWrite = FastIoAcquireForModWriteFn?

public fun interface FastIoCheckIfPossibleFn {
    public operator fun invoke(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, lockkey: UInt, checkforreadoperation: Boolean, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoCheckIfPossible = FastIoCheckIfPossibleFn?

public fun interface FastIoDetachDeviceFn {
    public operator fun invoke(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?)
}

public typealias FastIoDetachDevice = FastIoDetachDeviceFn?

public fun interface FastIoDeviceControlFn {
    public operator fun invoke(fileobject: COpaquePointer?, wait: Boolean, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, iocontrolcode: UInt, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoDeviceControl = FastIoDeviceControlFn?

public fun interface FastIoLockFn {
    public operator fun invoke(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: COpaquePointer?, processid: Peprocess, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoLock = FastIoLockFn?

public fun interface FastIoMdlReadFn {
    public operator fun invoke(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoMdlRead = FastIoMdlReadFn?

public fun interface FastIoMdlReadCompleteFn {
    public operator fun invoke(fileobject: COpaquePointer?, mdlchain: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoMdlReadComplete = FastIoMdlReadCompleteFn?

public fun interface FastIoMdlReadCompleteCompressedFn {
    public operator fun invoke(fileobject: COpaquePointer?, mdlchain: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoMdlReadCompleteCompressed = FastIoMdlReadCompleteCompressedFn?

public fun interface FastIoMdlWriteCompleteFn {
    public operator fun invoke(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, mdlchain: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoMdlWriteComplete = FastIoMdlWriteCompleteFn?

public fun interface FastIoMdlWriteCompleteCompressedFn {
    public operator fun invoke(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, mdlchain: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoMdlWriteCompleteCompressed = FastIoMdlWriteCompleteCompressedFn?

public fun interface FastIoPrepareMdlWriteFn {
    public operator fun invoke(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, mdlchain: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoPrepareMdlWrite = FastIoPrepareMdlWriteFn?

public fun interface FastIoQueryBasicInfoFn {
    public operator fun invoke(fileobject: COpaquePointer?, wait: Boolean, buffer: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoQueryBasicInfo = FastIoQueryBasicInfoFn?

public fun interface FastIoQueryNetworkOpenInfoFn {
    public operator fun invoke(fileobject: COpaquePointer?, wait: Boolean, buffer: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoQueryNetworkOpenInfo = FastIoQueryNetworkOpenInfoFn?

public fun interface FastIoQueryOpenFn {
    public operator fun invoke(irp: COpaquePointer?, networkinformation: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoQueryOpen = FastIoQueryOpenFn?

public fun interface FastIoQueryStandardInfoFn {
    public operator fun invoke(fileobject: COpaquePointer?, wait: Boolean, buffer: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoQueryStandardInfo = FastIoQueryStandardInfoFn?

public fun interface FastIoReadFn {
    public operator fun invoke(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, lockkey: UInt, buffer: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoRead = FastIoReadFn?

public fun interface FastIoReadCompressedFn {
    public operator fun invoke(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, buffer: COpaquePointer?, mdlchain: COpaquePointer?, iostatus: COpaquePointer?, compresseddatainfo: COpaquePointer?, compresseddatainfolength: UInt, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoReadCompressed = FastIoReadCompressedFn?

public fun interface FastIoReleaseFileFn {
    public operator fun invoke(fileobject: COpaquePointer?)
}

public typealias FastIoReleaseFile = FastIoReleaseFileFn?

public fun interface FastIoReleaseForCcflushFn {
    public operator fun invoke(fileobject: COpaquePointer?, deviceobject: COpaquePointer?): Ntstatus
}

public typealias FastIoReleaseForCcflush = FastIoReleaseForCcflushFn?

public fun interface FastIoReleaseForModWriteFn {
    public operator fun invoke(fileobject: COpaquePointer?, resourcetorelease: COpaquePointer?, deviceobject: COpaquePointer?): Ntstatus
}

public typealias FastIoReleaseForModWrite = FastIoReleaseForModWriteFn?

public fun interface FastIoUnlockAllFn {
    public operator fun invoke(fileobject: COpaquePointer?, processid: Peprocess, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoUnlockAll = FastIoUnlockAllFn?

public fun interface FastIoUnlockAllByKeyFn {
    public operator fun invoke(fileobject: COpaquePointer?, processid: COpaquePointer?, key: UInt, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoUnlockAllByKey = FastIoUnlockAllByKeyFn?

public fun interface FastIoUnlockSingleFn {
    public operator fun invoke(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: COpaquePointer?, processid: Peprocess, key: UInt, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoUnlockSingle = FastIoUnlockSingleFn?

public fun interface FastIoWriteFn {
    public operator fun invoke(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, wait: Boolean, lockkey: UInt, buffer: COpaquePointer?, iostatus: COpaquePointer?, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoWrite = FastIoWriteFn?

public fun interface FastIoWriteCompressedFn {
    public operator fun invoke(fileobject: COpaquePointer?, fileoffset: COpaquePointer?, length: UInt, lockkey: UInt, buffer: COpaquePointer?, mdlchain: COpaquePointer?, iostatus: COpaquePointer?, compresseddatainfo: COpaquePointer?, compresseddatainfolength: UInt, deviceobject: COpaquePointer?): Boolean
}

public typealias FastIoWriteCompressed = FastIoWriteCompressedFn?

public typealias IommuDmaDevice = Long

public typealias IommuDmaDomain = Long

public typealias IoPriorityHint = Int

public typealias Kenlistment = Long

public typealias Kgdt = Long

public typealias Kidt = Long

public typealias Kpcr = Long

public typealias Kprcb = Long

public typealias Kresourcemanager = Long

public typealias KspinLockQueueNumber = Int

public typealias Ktm = Long

public typealias Ktransaction = Long

public typealias Ktss = Long

public typealias LoaderParameterBlock = Long

public typealias ObjectInformationClass = Int

public typealias PaffinityToken = Long

public typealias PbusHandler = Long

public typealias PcallbackObject = Long

public typealias PdeviceHandlerObject = Long

public typealias Pejob = Long

public typealias Peprocess = Long

public typealias Pesilo = Long

public typealias Pethread = Long

public typealias PexRundownRefCacheAware = Long

public typealias PexTimer = Long

public fun interface PfreeFunctionFn {
    public operator fun invoke()
}

public typealias PfreeFunction = PfreeFunctionFn?

public fun interface PioCompletionRoutineFn {
    public operator fun invoke(): Ntstatus
}

public typealias PioCompletionRoutine = PioCompletionRoutineFn?

public typealias PioRemoveLockTrackingBlock = Long

public typealias PioTimer = Long

public typealias PioWorkitem = Long

public fun interface PkdeferredRoutineFn {
    public operator fun invoke()
}

public typealias PkdeferredRoutine = PkdeferredRoutineFn?

public typealias Pkinterrupt = Long

public typealias Pkprocess = Long

public typealias Pkthread = Long

public typealias PnotifySync = Long

public typealias PobjectType = Long

public typealias Pohandle = COpaquePointer?

public typealias PoolType = Int

public typealias PpcwBuffer = Long

public typealias PpcwInstance = Long

public typealias PpcwRegistration = Long

public typealias Prkprocess = Long

public typealias Prkthread = Long

public typealias PsiloMonitor = Long

public fun interface PworkerThreadRoutineFn {
    public operator fun invoke()
}

public typealias PworkerThreadRoutine = PworkerThreadRoutineFn?

public typealias SspiAsyncContext = Long

public typealias DeviceObjectPowerExtension = Long

public typealias IoringObject = Long

public typealias ScsiRequestBlock = Long
