package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.windowssys.core.BOOL

public typealias CM_CDFLAGS = UInt

public typealias CM_CDMASK = UInt

public typealias CM_DEVCAP = UInt

public typealias CM_DEVNODE_STATUS_FLAGS = UInt

public typealias CM_ENUMERATE_FLAGS = UInt

public typealias CM_GET_DEVICE_INTERFACE_LIST_FLAGS = UInt

public typealias CM_INSTALL_STATE = UInt

public typealias CM_LOCATE_DEVNODE_FLAGS = UInt

public typealias CM_LOG_CONF = UInt

public typealias CM_NOTIFY_ACTION = Int

public typealias CM_NOTIFY_FILTER_TYPE = Int

public typealias CM_PROB = UInt

public typealias CM_REENUMERATE_FLAGS = UInt

public typealias CM_REMOVAL_POLICY = UInt

public typealias CM_RESTYPE = UInt

public typealias CONFIGRET = UInt

public typealias DD_FLAGS = UInt

public typealias DIINSTALLDEVICE_FLAGS = UInt

public typealias DIINSTALLDRIVER_FLAGS = UInt

public typealias DIROLLBACKDRIVER_FLAGS = UInt

public typealias DIUNINSTALLDRIVER_FLAGS = UInt

public typealias DI_FUNCTION = UInt

public typealias FILE_COMPRESSION_TYPE = UInt

public typealias HCMNOTIFICATION = Long

public typealias HDEVINFO = Long

public typealias INF_STYLE = UInt

public typealias IOD_DESFLAGS = UInt

public typealias IRQD_FLAGS = UInt

public typealias MD_FLAGS = UInt

public typealias OEM_SOURCE_MEDIA_TYPE = UInt

public typealias PCD_FLAGS = UInt

public fun interface PCM_NOTIFY_CALLBACKFn {
    public operator fun invoke(hnotify: HCMNOTIFICATION, context: Long, action: CM_NOTIFY_ACTION, eventdata: Long, eventdatasize: UInt): UInt
}

public typealias PCM_NOTIFY_CALLBACK = PCM_NOTIFY_CALLBACKFn?

public fun interface PDETECT_PROGRESS_NOTIFYFn {
    public operator fun invoke(progressnotifyparam: Long, detectcomplete: UInt): BOOL
}

public typealias PDETECT_PROGRESS_NOTIFY = PDETECT_PROGRESS_NOTIFYFn?

public typealias PMF_FLAGS = UInt

public typealias PNP_VETO_TYPE = Int

public fun interface PSP_DETSIG_CMPPROCFn {
    public operator fun invoke(deviceinfoset: HDEVINFO, newdevicedata: Long, existingdevicedata: Long, comparecontext: Long): UInt
}

public typealias PSP_DETSIG_CMPPROC = PSP_DETSIG_CMPPROCFn?

public fun interface PSP_FILE_CALLBACK_AFn {
    public operator fun invoke(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt
}

public typealias PSP_FILE_CALLBACK_A = PSP_FILE_CALLBACK_AFn?

public fun interface PSP_FILE_CALLBACK_WFn {
    public operator fun invoke(context: Long, notification: UInt, param1: ULong, param2: ULong): UInt
}

public typealias PSP_FILE_CALLBACK_W = PSP_FILE_CALLBACK_WFn?

public typealias SETUPSCANFILEQUEUE_FLAGS = UInt

public typealias SETUP_DI_DEVICE_CONFIGURATION_FLAGS = UInt

public typealias SETUP_DI_DEVICE_CREATION_FLAGS = UInt

public typealias SETUP_DI_DEVICE_INSTALL_FLAGS = UInt

public typealias SETUP_DI_DEVICE_INSTALL_FLAGS_EX = UInt

public typealias SETUP_DI_DRIVER_INSTALL_FLAGS = UInt

public typealias SETUP_DI_DRIVER_TYPE = UInt

public typealias SETUP_DI_GET_CLASS_DEVS_FLAGS = UInt

public typealias SETUP_DI_PROPERTY_CHANGE_SCOPE = UInt

public typealias SETUP_DI_REGISTRY_PROPERTY = UInt

public typealias SETUP_DI_REMOVE_DEVICE_SCOPE = UInt

public typealias SETUP_DI_STATE_CHANGE = UInt

public typealias SETUP_FILE_OPERATION = UInt

public typealias SPSVCINST_FLAGS = UInt

public typealias SP_COPY_STYLE = UInt

public typealias SetupFileLogInfo = Int

public typealias UPDATEDRIVERFORPLUGANDPLAYDEVICES_FLAGS = UInt
