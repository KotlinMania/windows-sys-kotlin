package io.github.kotlinmania.windowssys.windows.wdk.foundation

public typealias DMA_COMMON_BUFFER_VECTOR = Long

public fun interface DRIVER_ADD_DEVICEFn {
    public operator fun invoke(driverobject: Long, physicaldeviceobject: Long): Win32.Foundation.NTSTATUS
}

public typealias DRIVER_ADD_DEVICE = DRIVER_ADD_DEVICEFn?

public fun interface DRIVER_CANCELFn {
    public operator fun invoke(deviceobject: Long, irp: Long)
}

public typealias DRIVER_CANCEL = DRIVER_CANCELFn?

public fun interface DRIVER_CONTROLFn {
    public operator fun invoke(deviceobject: Long, irp: Long, mapregisterbase: Long, context: Long): System.SystemServices.IO_ALLOCATION_ACTION
}

public typealias DRIVER_CONTROL = DRIVER_CONTROLFn?

public fun interface DRIVER_DISPATCHFn {
    public operator fun invoke(deviceobject: Long, irp: Long): Win32.Foundation.NTSTATUS
}

public typealias DRIVER_DISPATCH = DRIVER_DISPATCHFn?

public fun interface DRIVER_DISPATCH_PAGEDFn {
    public operator fun invoke(deviceobject: Long, irp: Long): Win32.Foundation.NTSTATUS
}

public typealias DRIVER_DISPATCH_PAGED = DRIVER_DISPATCH_PAGEDFn?

public fun interface DRIVER_FS_NOTIFICATIONFn {
    public operator fun invoke(deviceobject: Long, fsactive: Boolean)
}

public typealias DRIVER_FS_NOTIFICATION = DRIVER_FS_NOTIFICATIONFn?

public fun interface DRIVER_INITIALIZEFn {
    public operator fun invoke(driverobject: Long, registrypath: Long): Win32.Foundation.NTSTATUS
}

public typealias DRIVER_INITIALIZE = DRIVER_INITIALIZEFn?

public fun interface DRIVER_NOTIFICATION_CALLBACK_ROUTINEFn {
    public operator fun invoke(notificationstructure: Long, context: Long): Win32.Foundation.NTSTATUS
}

public typealias DRIVER_NOTIFICATION_CALLBACK_ROUTINE = DRIVER_NOTIFICATION_CALLBACK_ROUTINEFn?

public fun interface DRIVER_REINITIALIZEFn {
    public operator fun invoke(driverobject: Long, context: Long, count: UInt)
}

public typealias DRIVER_REINITIALIZE = DRIVER_REINITIALIZEFn?

public fun interface DRIVER_STARTIOFn {
    public operator fun invoke(deviceobject: Long, irp: Long)
}

public typealias DRIVER_STARTIO = DRIVER_STARTIOFn?

public fun interface DRIVER_UNLOADFn {
    public operator fun invoke(driverobject: Long)
}

public typealias DRIVER_UNLOAD = DRIVER_UNLOADFn?

public typealias ECP_HEADER = Long

public typealias ECP_LIST = Long

public fun interface FAST_IO_ACQUIRE_FILEFn {
    public operator fun invoke(fileobject: Long)
}

public typealias FAST_IO_ACQUIRE_FILE = FAST_IO_ACQUIRE_FILEFn?

public fun interface FAST_IO_ACQUIRE_FOR_CCFLUSHFn {
    public operator fun invoke(fileobject: Long, deviceobject: Long): Win32.Foundation.NTSTATUS
}

public typealias FAST_IO_ACQUIRE_FOR_CCFLUSH = FAST_IO_ACQUIRE_FOR_CCFLUSHFn?

public fun interface FAST_IO_ACQUIRE_FOR_MOD_WRITEFn {
    public operator fun invoke(fileobject: Long, endingoffset: Long, resourcetorelease: Long, deviceobject: Long): Win32.Foundation.NTSTATUS
}

public typealias FAST_IO_ACQUIRE_FOR_MOD_WRITE = FAST_IO_ACQUIRE_FOR_MOD_WRITEFn?

public fun interface FAST_IO_CHECK_IF_POSSIBLEFn {
    public operator fun invoke(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, checkforreadoperation: Boolean, iostatus: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_CHECK_IF_POSSIBLE = FAST_IO_CHECK_IF_POSSIBLEFn?

public fun interface FAST_IO_DETACH_DEVICEFn {
    public operator fun invoke(sourcedevice: Long, targetdevice: Long)
}

public typealias FAST_IO_DETACH_DEVICE = FAST_IO_DETACH_DEVICEFn?

public fun interface FAST_IO_DEVICE_CONTROLFn {
    public operator fun invoke(fileobject: Long, wait: Boolean, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, iocontrolcode: UInt, iostatus: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_DEVICE_CONTROL = FAST_IO_DEVICE_CONTROLFn?

public fun interface FAST_IO_LOCKFn {
    public operator fun invoke(fileobject: Long, fileoffset: Long, length: Long, processid: PEPROCESS, key: UInt, failimmediately: Boolean, exclusivelock: Boolean, iostatus: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_LOCK = FAST_IO_LOCKFn?

public fun interface FAST_IO_MDL_READFn {
    public operator fun invoke(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_MDL_READ = FAST_IO_MDL_READFn?

public fun interface FAST_IO_MDL_READ_COMPLETEFn {
    public operator fun invoke(fileobject: Long, mdlchain: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_MDL_READ_COMPLETE = FAST_IO_MDL_READ_COMPLETEFn?

public fun interface FAST_IO_MDL_READ_COMPLETE_COMPRESSEDFn {
    public operator fun invoke(fileobject: Long, mdlchain: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_MDL_READ_COMPLETE_COMPRESSED = FAST_IO_MDL_READ_COMPLETE_COMPRESSEDFn?

public fun interface FAST_IO_MDL_WRITE_COMPLETEFn {
    public operator fun invoke(fileobject: Long, fileoffset: Long, mdlchain: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_MDL_WRITE_COMPLETE = FAST_IO_MDL_WRITE_COMPLETEFn?

public fun interface FAST_IO_MDL_WRITE_COMPLETE_COMPRESSEDFn {
    public operator fun invoke(fileobject: Long, fileoffset: Long, mdlchain: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_MDL_WRITE_COMPLETE_COMPRESSED = FAST_IO_MDL_WRITE_COMPLETE_COMPRESSEDFn?

public fun interface FAST_IO_PREPARE_MDL_WRITEFn {
    public operator fun invoke(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, mdlchain: Long, iostatus: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_PREPARE_MDL_WRITE = FAST_IO_PREPARE_MDL_WRITEFn?

public fun interface FAST_IO_QUERY_BASIC_INFOFn {
    public operator fun invoke(fileobject: Long, wait: Boolean, buffer: Long, iostatus: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_QUERY_BASIC_INFO = FAST_IO_QUERY_BASIC_INFOFn?

public fun interface FAST_IO_QUERY_NETWORK_OPEN_INFOFn {
    public operator fun invoke(fileobject: Long, wait: Boolean, buffer: Long, iostatus: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_QUERY_NETWORK_OPEN_INFO = FAST_IO_QUERY_NETWORK_OPEN_INFOFn?

public fun interface FAST_IO_QUERY_OPENFn {
    public operator fun invoke(irp: Long, networkinformation: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_QUERY_OPEN = FAST_IO_QUERY_OPENFn?

public fun interface FAST_IO_QUERY_STANDARD_INFOFn {
    public operator fun invoke(fileobject: Long, wait: Boolean, buffer: Long, iostatus: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_QUERY_STANDARD_INFO = FAST_IO_QUERY_STANDARD_INFOFn?

public fun interface FAST_IO_READFn {
    public operator fun invoke(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_READ = FAST_IO_READFn?

public fun interface FAST_IO_READ_COMPRESSEDFn {
    public operator fun invoke(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, buffer: Long, mdlchain: Long, iostatus: Long, compresseddatainfo: Long, compresseddatainfolength: UInt, deviceobject: Long): Boolean
}

public typealias FAST_IO_READ_COMPRESSED = FAST_IO_READ_COMPRESSEDFn?

public fun interface FAST_IO_RELEASE_FILEFn {
    public operator fun invoke(fileobject: Long)
}

public typealias FAST_IO_RELEASE_FILE = FAST_IO_RELEASE_FILEFn?

public fun interface FAST_IO_RELEASE_FOR_CCFLUSHFn {
    public operator fun invoke(fileobject: Long, deviceobject: Long): Win32.Foundation.NTSTATUS
}

public typealias FAST_IO_RELEASE_FOR_CCFLUSH = FAST_IO_RELEASE_FOR_CCFLUSHFn?

public fun interface FAST_IO_RELEASE_FOR_MOD_WRITEFn {
    public operator fun invoke(fileobject: Long, resourcetorelease: Long, deviceobject: Long): Win32.Foundation.NTSTATUS
}

public typealias FAST_IO_RELEASE_FOR_MOD_WRITE = FAST_IO_RELEASE_FOR_MOD_WRITEFn?

public fun interface FAST_IO_UNLOCK_ALLFn {
    public operator fun invoke(fileobject: Long, processid: PEPROCESS, iostatus: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_UNLOCK_ALL = FAST_IO_UNLOCK_ALLFn?

public fun interface FAST_IO_UNLOCK_ALL_BY_KEYFn {
    public operator fun invoke(fileobject: Long, processid: Long, key: UInt, iostatus: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_UNLOCK_ALL_BY_KEY = FAST_IO_UNLOCK_ALL_BY_KEYFn?

public fun interface FAST_IO_UNLOCK_SINGLEFn {
    public operator fun invoke(fileobject: Long, fileoffset: Long, length: Long, processid: PEPROCESS, key: UInt, iostatus: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_UNLOCK_SINGLE = FAST_IO_UNLOCK_SINGLEFn?

public fun interface FAST_IO_WRITEFn {
    public operator fun invoke(fileobject: Long, fileoffset: Long, length: UInt, wait: Boolean, lockkey: UInt, buffer: Long, iostatus: Long, deviceobject: Long): Boolean
}

public typealias FAST_IO_WRITE = FAST_IO_WRITEFn?

public fun interface FAST_IO_WRITE_COMPRESSEDFn {
    public operator fun invoke(fileobject: Long, fileoffset: Long, length: UInt, lockkey: UInt, buffer: Long, mdlchain: Long, iostatus: Long, compresseddatainfo: Long, compresseddatainfolength: UInt, deviceobject: Long): Boolean
}

public typealias FAST_IO_WRITE_COMPRESSED = FAST_IO_WRITE_COMPRESSEDFn?

public typealias IOMMU_DMA_DEVICE = Long

public typealias IOMMU_DMA_DOMAIN = Long

public typealias IO_PRIORITY_HINT = Int

public typealias KENLISTMENT = Long

public typealias KGDT = Long

public typealias KIDT = Long

public typealias KPCR = Long

public typealias KPRCB = Long

public typealias KRESOURCEMANAGER = Long

public typealias KSPIN_LOCK_QUEUE_NUMBER = Int

public typealias KTM = Long

public typealias KTRANSACTION = Long

public typealias KTSS = Long

public typealias LOADER_PARAMETER_BLOCK = Long

public typealias OBJECT_INFORMATION_CLASS = Int

public typealias PAFFINITY_TOKEN = Long

public typealias PBUS_HANDLER = Long

public typealias PCALLBACK_OBJECT = Long

public typealias PDEVICE_HANDLER_OBJECT = Long

public typealias PEJOB = Long

public typealias PEPROCESS = Long

public typealias PESILO = Long

public typealias PETHREAD = Long

public typealias PEX_RUNDOWN_REF_CACHE_AWARE = Long

public typealias PEX_TIMER = Long

public fun interface PFREE_FUNCTIONFn {
    public operator fun invoke()
}

public typealias PFREE_FUNCTION = PFREE_FUNCTIONFn?

public fun interface PIO_COMPLETION_ROUTINEFn {
    public operator fun invoke(): Win32.Foundation.NTSTATUS
}

public typealias PIO_COMPLETION_ROUTINE = PIO_COMPLETION_ROUTINEFn?

public typealias PIO_REMOVE_LOCK_TRACKING_BLOCK = Long

public typealias PIO_TIMER = Long

public typealias PIO_WORKITEM = Long

public fun interface PKDEFERRED_ROUTINEFn {
    public operator fun invoke()
}

public typealias PKDEFERRED_ROUTINE = PKDEFERRED_ROUTINEFn?

public typealias PKINTERRUPT = Long

public typealias PKPROCESS = Long

public typealias PKTHREAD = Long

public typealias PNOTIFY_SYNC = Long

public typealias POBJECT_TYPE = Long

public typealias POHANDLE = Long

public typealias POOL_TYPE = Int

public typealias PPCW_BUFFER = Long

public typealias PPCW_INSTANCE = Long

public typealias PPCW_REGISTRATION = Long

public typealias PRKPROCESS = Long

public typealias PRKTHREAD = Long

public typealias PSILO_MONITOR = Long

public fun interface PWORKER_THREAD_ROUTINEFn {
    public operator fun invoke()
}

public typealias PWORKER_THREAD_ROUTINE = PWORKER_THREAD_ROUTINEFn?

public typealias SspiAsyncContext = Long

public typealias _DEVICE_OBJECT_POWER_EXTENSION = Long

public typealias _IORING_OBJECT = Long

public typealias _SCSI_REQUEST_BLOCK = Long
