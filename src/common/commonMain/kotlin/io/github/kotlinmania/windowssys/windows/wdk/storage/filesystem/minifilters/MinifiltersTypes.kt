package io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.minifilters

public typealias FLT_CALLBACK_DATA_QUEUE_FLAGS = Int

public typealias FLT_POSTOP_CALLBACK_STATUS = Int

public typealias FLT_PREOP_CALLBACK_STATUS = Int

public typealias FLT_SET_CONTEXT_OPERATION = Int

public fun interface PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINEFn {
    public operator fun invoke(callbackdata: Long, context: Long)
}

public typealias PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINE = PFLTOPLOCK_PREPOST_CALLBACKDATA_ROUTINEFn?

public fun interface PFLTOPLOCK_WAIT_COMPLETE_ROUTINEFn {
    public operator fun invoke(callbackdata: Long, context: Long)
}

public typealias PFLTOPLOCK_WAIT_COMPLETE_ROUTINE = PFLTOPLOCK_WAIT_COMPLETE_ROUTINEFn?

public fun interface PFLT_CALLBACK_DATA_QUEUE_ACQUIREFn {
    public operator fun invoke(cbdq: Long, irql: Long)
}

public typealias PFLT_CALLBACK_DATA_QUEUE_ACQUIRE = PFLT_CALLBACK_DATA_QUEUE_ACQUIREFn?

public fun interface PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IOFn {
    public operator fun invoke(cbdq: Long, cbd: Long)
}

public typealias PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IO = PFLT_CALLBACK_DATA_QUEUE_COMPLETE_CANCELED_IOFn?

public fun interface PFLT_CALLBACK_DATA_QUEUE_INSERT_IOFn {
    public operator fun invoke(cbdq: Long, cbd: Long, insertcontext: Long): Win32.Foundation.NTSTATUS
}

public typealias PFLT_CALLBACK_DATA_QUEUE_INSERT_IO = PFLT_CALLBACK_DATA_QUEUE_INSERT_IOFn?

public fun interface PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IOFn {
    public operator fun invoke(cbdq: Long, cbd: Long, peekcontext: Long): Long
}

public typealias PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IO = PFLT_CALLBACK_DATA_QUEUE_PEEK_NEXT_IOFn?

public fun interface PFLT_CALLBACK_DATA_QUEUE_RELEASEFn {
    public operator fun invoke(cbdq: Long, irql: UByte)
}

public typealias PFLT_CALLBACK_DATA_QUEUE_RELEASE = PFLT_CALLBACK_DATA_QUEUE_RELEASEFn?

public fun interface PFLT_CALLBACK_DATA_QUEUE_REMOVE_IOFn {
    public operator fun invoke(cbdq: Long, cbd: Long)
}

public typealias PFLT_CALLBACK_DATA_QUEUE_REMOVE_IO = PFLT_CALLBACK_DATA_QUEUE_REMOVE_IOFn?

public fun interface PFLT_COMPLETED_ASYNC_IO_CALLBACKFn {
    public operator fun invoke(callbackdata: Long, context: PFLT_CONTEXT)
}

public typealias PFLT_COMPLETED_ASYNC_IO_CALLBACK = PFLT_COMPLETED_ASYNC_IO_CALLBACKFn?

public fun interface PFLT_COMPLETE_CANCELED_CALLBACKFn {
    public operator fun invoke(callbackdata: Long)
}

public typealias PFLT_COMPLETE_CANCELED_CALLBACK = PFLT_COMPLETE_CANCELED_CALLBACKFn?

public fun interface PFLT_COMPLETE_LOCK_CALLBACK_DATA_ROUTINEFn {
    public operator fun invoke(context: Long, callbackdata: Long): Win32.Foundation.NTSTATUS
}

public typealias PFLT_COMPLETE_LOCK_CALLBACK_DATA_ROUTINE = PFLT_COMPLETE_LOCK_CALLBACK_DATA_ROUTINEFn?

public fun interface PFLT_CONNECT_NOTIFYFn {
    public operator fun invoke(clientport: PFLT_PORT, serverportcookie: Long, connectioncontext: Long, sizeofcontext: UInt, connectionportcookie: Long): Win32.Foundation.NTSTATUS
}

public typealias PFLT_CONNECT_NOTIFY = PFLT_CONNECT_NOTIFYFn?

public typealias PFLT_CONTEXT = Long

public fun interface PFLT_CONTEXT_ALLOCATE_CALLBACKFn {
    public operator fun invoke(pooltype: Foundation.POOL_TYPE, size: ULong, contexttype: UShort): Long
}

public typealias PFLT_CONTEXT_ALLOCATE_CALLBACK = PFLT_CONTEXT_ALLOCATE_CALLBACKFn?

public fun interface PFLT_CONTEXT_CLEANUP_CALLBACKFn {
    public operator fun invoke(context: PFLT_CONTEXT, contexttype: UShort)
}

public typealias PFLT_CONTEXT_CLEANUP_CALLBACK = PFLT_CONTEXT_CLEANUP_CALLBACKFn?

public fun interface PFLT_CONTEXT_FREE_CALLBACKFn {
    public operator fun invoke(pool: Long, contexttype: UShort)
}

public typealias PFLT_CONTEXT_FREE_CALLBACK = PFLT_CONTEXT_FREE_CALLBACKFn?

public typealias PFLT_DEFERRED_IO_WORKITEM = Long

public fun interface PFLT_DEFERRED_IO_WORKITEM_ROUTINEFn {
    public operator fun invoke(fltworkitem: PFLT_DEFERRED_IO_WORKITEM, callbackdata: Long, context: Long)
}

public typealias PFLT_DEFERRED_IO_WORKITEM_ROUTINE = PFLT_DEFERRED_IO_WORKITEM_ROUTINEFn?

public fun interface PFLT_DISCONNECT_NOTIFYFn {
    public operator fun invoke(connectioncookie: Long)
}

public typealias PFLT_DISCONNECT_NOTIFY = PFLT_DISCONNECT_NOTIFYFn?

public typealias PFLT_FILTER = Long

public fun interface PFLT_FILTER_UNLOAD_CALLBACKFn {
    public operator fun invoke(flags: UInt): Win32.Foundation.NTSTATUS
}

public typealias PFLT_FILTER_UNLOAD_CALLBACK = PFLT_FILTER_UNLOAD_CALLBACKFn?

public fun interface PFLT_GENERATE_FILE_NAMEFn {
    public operator fun invoke(instance: PFLT_INSTANCE, fileobject: Long, callbackdata: Long, nameoptions: UInt, cachefilenameinformation: Long, filename: Long): Win32.Foundation.NTSTATUS
}

public typealias PFLT_GENERATE_FILE_NAME = PFLT_GENERATE_FILE_NAMEFn?

public typealias PFLT_GENERIC_WORKITEM = Long

public fun interface PFLT_GENERIC_WORKITEM_ROUTINEFn {
    public operator fun invoke(fltworkitem: PFLT_GENERIC_WORKITEM, fltobject: Long, context: Long)
}

public typealias PFLT_GENERIC_WORKITEM_ROUTINE = PFLT_GENERIC_WORKITEM_ROUTINEFn?

public fun interface PFLT_GET_OPERATION_STATUS_CALLBACKFn {
    public operator fun invoke(fltobjects: Long, iopbsnapshot: Long, operationstatus: Win32.Foundation.NTSTATUS, requestercontext: Long)
}

public typealias PFLT_GET_OPERATION_STATUS_CALLBACK = PFLT_GET_OPERATION_STATUS_CALLBACKFn?

public typealias PFLT_INSTANCE = Long

public fun interface PFLT_INSTANCE_QUERY_TEARDOWN_CALLBACKFn {
    public operator fun invoke(fltobjects: Long, flags: UInt): Win32.Foundation.NTSTATUS
}

public typealias PFLT_INSTANCE_QUERY_TEARDOWN_CALLBACK = PFLT_INSTANCE_QUERY_TEARDOWN_CALLBACKFn?

public fun interface PFLT_INSTANCE_SETUP_CALLBACKFn {
    public operator fun invoke(fltobjects: Long, flags: UInt, volumedevicetype: UInt, volumefilesystemtype: Win32.Storage.InstallableFileSystems.FLT_FILESYSTEM_TYPE): Win32.Foundation.NTSTATUS
}

public typealias PFLT_INSTANCE_SETUP_CALLBACK = PFLT_INSTANCE_SETUP_CALLBACKFn?

public fun interface PFLT_INSTANCE_TEARDOWN_CALLBACKFn {
    public operator fun invoke(fltobjects: Long, reason: UInt)
}

public typealias PFLT_INSTANCE_TEARDOWN_CALLBACK = PFLT_INSTANCE_TEARDOWN_CALLBACKFn?

public fun interface PFLT_MESSAGE_NOTIFYFn {
    public operator fun invoke(portcookie: Long, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, returnoutputbufferlength: Long): Win32.Foundation.NTSTATUS
}

public typealias PFLT_MESSAGE_NOTIFY = PFLT_MESSAGE_NOTIFYFn?

public fun interface PFLT_NORMALIZE_CONTEXT_CLEANUPFn {
    public operator fun invoke(normalizationcontext: Long)
}

public typealias PFLT_NORMALIZE_CONTEXT_CLEANUP = PFLT_NORMALIZE_CONTEXT_CLEANUPFn?

public fun interface PFLT_NORMALIZE_NAME_COMPONENTFn {
    public operator fun invoke(instance: PFLT_INSTANCE, parentdirectory: Long, volumenamelength: UShort, component: Long, expandcomponentname: Long, expandcomponentnamelength: UInt, flags: UInt, normalizationcontext: Long): Win32.Foundation.NTSTATUS
}

public typealias PFLT_NORMALIZE_NAME_COMPONENT = PFLT_NORMALIZE_NAME_COMPONENTFn?

public fun interface PFLT_NORMALIZE_NAME_COMPONENT_EXFn {
    public operator fun invoke(instance: PFLT_INSTANCE, fileobject: Long, parentdirectory: Long, volumenamelength: UShort, component: Long, expandcomponentname: Long, expandcomponentnamelength: UInt, flags: UInt, normalizationcontext: Long): Win32.Foundation.NTSTATUS
}

public typealias PFLT_NORMALIZE_NAME_COMPONENT_EX = PFLT_NORMALIZE_NAME_COMPONENT_EXFn?

public typealias PFLT_PORT = Long

public fun interface PFLT_POST_OPERATION_CALLBACKFn {
    public operator fun invoke(data: Long, fltobjects: Long, completioncontext: Long, flags: UInt): FLT_POSTOP_CALLBACK_STATUS
}

public typealias PFLT_POST_OPERATION_CALLBACK = PFLT_POST_OPERATION_CALLBACKFn?

public fun interface PFLT_PRE_OPERATION_CALLBACKFn {
    public operator fun invoke(data: Long, fltobjects: Long, completioncontext: Long): FLT_PREOP_CALLBACK_STATUS
}

public typealias PFLT_PRE_OPERATION_CALLBACK = PFLT_PRE_OPERATION_CALLBACKFn?

public fun interface PFLT_SECTION_CONFLICT_NOTIFICATION_CALLBACKFn {
    public operator fun invoke(instance: PFLT_INSTANCE, sectioncontext: PFLT_CONTEXT, data: Long): Win32.Foundation.NTSTATUS
}

public typealias PFLT_SECTION_CONFLICT_NOTIFICATION_CALLBACK = PFLT_SECTION_CONFLICT_NOTIFICATION_CALLBACKFn?

public fun interface PFLT_TRANSACTION_NOTIFICATION_CALLBACKFn {
    public operator fun invoke(fltobjects: Long, transactioncontext: PFLT_CONTEXT, notificationmask: UInt): Win32.Foundation.NTSTATUS
}

public typealias PFLT_TRANSACTION_NOTIFICATION_CALLBACK = PFLT_TRANSACTION_NOTIFICATION_CALLBACKFn?

public typealias PFLT_VOLUME = Long
