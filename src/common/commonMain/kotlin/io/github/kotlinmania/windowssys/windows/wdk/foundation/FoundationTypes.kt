package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.CompressedDataInfo
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileBasicInformation
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileNetworkOpenInformation
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileStandardInformation
import io.github.kotlinmania.windowssys.windows.wdk.system.systemservices.IoAllocationAction
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.system.io.IoStatusBlock

public typealias DmaCommonBufferVector = Long

public fun interface DriverAddDeviceFn {
    public operator fun invoke(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>): Ntstatus
}

public typealias DriverAddDevice = DriverAddDeviceFn?

public fun interface DriverCancelFn {
    public operator fun invoke(deviceobject: MutPtr<DeviceObject>, irp: MutPtr<Irp>)
}

public typealias DriverCancel = DriverCancelFn?

public fun interface DriverControlFn {
    public operator fun invoke(deviceobject: ConstPtr<DeviceObject>, irp: MutPtr<Irp>, mapregisterbase: ConstPtr<CVoid>, context: ConstPtr<CVoid>): IoAllocationAction
}

public typealias DriverControl = DriverControlFn?

public fun interface DriverDispatchFn {
    public operator fun invoke(deviceobject: ConstPtr<DeviceObject>, irp: MutPtr<Irp>): Ntstatus
}

public typealias DriverDispatch = DriverDispatchFn?

public fun interface DriverDispatchPagedFn {
    public operator fun invoke(deviceobject: ConstPtr<DeviceObject>, irp: MutPtr<Irp>): Ntstatus
}

public typealias DriverDispatchPaged = DriverDispatchPagedFn?

public fun interface DriverFsNotificationFn {
    public operator fun invoke(deviceobject: ConstPtr<DeviceObject>, fsactive: Boolean)
}

public typealias DriverFsNotification = DriverFsNotificationFn?

public fun interface DriverInitializeFn {
    public operator fun invoke(driverobject: ConstPtr<DriverObject>, registrypath: ConstPtr<UnicodeString>): Ntstatus
}

public typealias DriverInitialize = DriverInitializeFn?

public fun interface DriverNotificationCallbackRoutineFn {
    public operator fun invoke(notificationstructure: ConstPtr<CVoid>, context: MutPtr<CVoid>): Ntstatus
}

public typealias DriverNotificationCallbackRoutine = DriverNotificationCallbackRoutineFn?

public fun interface DriverReinitializeFn {
    public operator fun invoke(driverobject: ConstPtr<DriverObject>, context: ConstPtr<CVoid>, count: UInt)
}

public typealias DriverReinitialize = DriverReinitializeFn?

public fun interface DriverStartioFn {
    public operator fun invoke(deviceobject: MutPtr<DeviceObject>, irp: MutPtr<Irp>)
}

public typealias DriverStartio = DriverStartioFn?

public fun interface DriverUnloadFn {
    public operator fun invoke(driverobject: ConstPtr<DriverObject>)
}

public typealias DriverUnload = DriverUnloadFn?

public typealias EcpHeader = Long

public typealias EcpList = Long

public fun interface FastIoAcquireFileFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>)
}

public typealias FastIoAcquireFile = FastIoAcquireFileFn?

public fun interface FastIoAcquireForCcflushFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, deviceobject: ConstPtr<DeviceObject>): Ntstatus
}

public typealias FastIoAcquireForCcflush = FastIoAcquireForCcflushFn?

public fun interface FastIoAcquireForModWriteFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, endingoffset: ConstPtr<Long>, resourcetorelease: MutPtr<MutPtr<Eresource>>, deviceobject: ConstPtr<DeviceObject>): Ntstatus
}

public typealias FastIoAcquireForModWrite = FastIoAcquireForModWriteFn?

public fun interface FastIoCheckIfPossibleFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, lockkey: UInt, checkforreadoperation: Boolean, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoCheckIfPossible = FastIoCheckIfPossibleFn?

public fun interface FastIoDetachDeviceFn {
    public operator fun invoke(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>)
}

public typealias FastIoDetachDevice = FastIoDetachDeviceFn?

public fun interface FastIoDeviceControlFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, wait: Boolean, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, iocontrolcode: UInt, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoDeviceControl = FastIoDeviceControlFn?

public fun interface FastIoLockFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: ConstPtr<Long>, processid: Peprocess, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoLock = FastIoLockFn?

public fun interface FastIoMdlReadFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoMdlRead = FastIoMdlReadFn?

public fun interface FastIoMdlReadCompleteFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, mdlchain: ConstPtr<Mdl>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoMdlReadComplete = FastIoMdlReadCompleteFn?

public fun interface FastIoMdlReadCompleteCompressedFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, mdlchain: ConstPtr<Mdl>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoMdlReadCompleteCompressed = FastIoMdlReadCompleteCompressedFn?

public fun interface FastIoMdlWriteCompleteFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, mdlchain: ConstPtr<Mdl>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoMdlWriteComplete = FastIoMdlWriteCompleteFn?

public fun interface FastIoMdlWriteCompleteCompressedFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, mdlchain: ConstPtr<Mdl>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoMdlWriteCompleteCompressed = FastIoMdlWriteCompleteCompressedFn?

public fun interface FastIoPrepareMdlWriteFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoPrepareMdlWrite = FastIoPrepareMdlWriteFn?

public fun interface FastIoQueryBasicInfoFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, wait: Boolean, buffer: MutPtr<FileBasicInformation>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoQueryBasicInfo = FastIoQueryBasicInfoFn?

public fun interface FastIoQueryNetworkOpenInfoFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, wait: Boolean, buffer: MutPtr<FileNetworkOpenInformation>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoQueryNetworkOpenInfo = FastIoQueryNetworkOpenInfoFn?

public fun interface FastIoQueryOpenFn {
    public operator fun invoke(irp: MutPtr<Irp>, networkinformation: MutPtr<FileNetworkOpenInformation>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoQueryOpen = FastIoQueryOpenFn?

public fun interface FastIoQueryStandardInfoFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, wait: Boolean, buffer: MutPtr<FileStandardInformation>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoQueryStandardInfo = FastIoQueryStandardInfoFn?

public fun interface FastIoReadFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, lockkey: UInt, buffer: MutPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoRead = FastIoReadFn?

public fun interface FastIoReadCompressedFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, buffer: MutPtr<CVoid>, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>, compresseddatainfo: MutPtr<CompressedDataInfo>, compresseddatainfolength: UInt, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoReadCompressed = FastIoReadCompressedFn?

public fun interface FastIoReleaseFileFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>)
}

public typealias FastIoReleaseFile = FastIoReleaseFileFn?

public fun interface FastIoReleaseForCcflushFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, deviceobject: ConstPtr<DeviceObject>): Ntstatus
}

public typealias FastIoReleaseForCcflush = FastIoReleaseForCcflushFn?

public fun interface FastIoReleaseForModWriteFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, resourcetorelease: ConstPtr<Eresource>, deviceobject: ConstPtr<DeviceObject>): Ntstatus
}

public typealias FastIoReleaseForModWrite = FastIoReleaseForModWriteFn?

public fun interface FastIoUnlockAllFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, processid: Peprocess, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoUnlockAll = FastIoUnlockAllFn?

public fun interface FastIoUnlockAllByKeyFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, processid: ConstPtr<CVoid>, key: UInt, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoUnlockAllByKey = FastIoUnlockAllByKeyFn?

public fun interface FastIoUnlockSingleFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: ConstPtr<Long>, processid: Peprocess, key: UInt, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoUnlockSingle = FastIoUnlockSingleFn?

public fun interface FastIoWriteFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, wait: Boolean, lockkey: UInt, buffer: ConstPtr<CVoid>, iostatus: MutPtr<IoStatusBlock>, deviceobject: ConstPtr<DeviceObject>): Boolean
}

public typealias FastIoWrite = FastIoWriteFn?

public fun interface FastIoWriteCompressedFn {
    public operator fun invoke(fileobject: ConstPtr<FileObject>, fileoffset: ConstPtr<Long>, length: UInt, lockkey: UInt, buffer: ConstPtr<CVoid>, mdlchain: MutPtr<MutPtr<Mdl>>, iostatus: MutPtr<IoStatusBlock>, compresseddatainfo: ConstPtr<CompressedDataInfo>, compresseddatainfolength: UInt, deviceobject: ConstPtr<DeviceObject>): Boolean
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

public typealias Pohandle = MutPtr<CVoid>

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
