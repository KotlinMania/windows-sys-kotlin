package io.github.kotlinmania.windowssys.windows.wdk.networkmanagement.ndis

public fun interface CL_ADD_PARTY_COMPLETE_HANDLERFn {
    public operator fun invoke()
}

public typealias CL_ADD_PARTY_COMPLETE_HANDLER = CL_ADD_PARTY_COMPLETE_HANDLERFn?

public fun interface CL_CALL_CONNECTED_HANDLERFn {
    public operator fun invoke()
}

public typealias CL_CALL_CONNECTED_HANDLER = CL_CALL_CONNECTED_HANDLERFn?

public fun interface CL_CLOSE_AF_COMPLETE_HANDLERFn {
    public operator fun invoke()
}

public typealias CL_CLOSE_AF_COMPLETE_HANDLER = CL_CLOSE_AF_COMPLETE_HANDLERFn?

public fun interface CL_CLOSE_CALL_COMPLETE_HANDLERFn {
    public operator fun invoke()
}

public typealias CL_CLOSE_CALL_COMPLETE_HANDLER = CL_CLOSE_CALL_COMPLETE_HANDLERFn?

public fun interface CL_DEREG_SAP_COMPLETE_HANDLERFn {
    public operator fun invoke()
}

public typealias CL_DEREG_SAP_COMPLETE_HANDLER = CL_DEREG_SAP_COMPLETE_HANDLERFn?

public fun interface CL_DROP_PARTY_COMPLETE_HANDLERFn {
    public operator fun invoke()
}

public typealias CL_DROP_PARTY_COMPLETE_HANDLER = CL_DROP_PARTY_COMPLETE_HANDLERFn?

public fun interface CL_INCOMING_CALL_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias CL_INCOMING_CALL_HANDLER = CL_INCOMING_CALL_HANDLERFn?

public fun interface CL_INCOMING_CALL_QOS_CHANGE_HANDLERFn {
    public operator fun invoke()
}

public typealias CL_INCOMING_CALL_QOS_CHANGE_HANDLER = CL_INCOMING_CALL_QOS_CHANGE_HANDLERFn?

public fun interface CL_INCOMING_CLOSE_CALL_HANDLERFn {
    public operator fun invoke()
}

public typealias CL_INCOMING_CLOSE_CALL_HANDLER = CL_INCOMING_CLOSE_CALL_HANDLERFn?

public fun interface CL_INCOMING_DROP_PARTY_HANDLERFn {
    public operator fun invoke()
}

public typealias CL_INCOMING_DROP_PARTY_HANDLER = CL_INCOMING_DROP_PARTY_HANDLERFn?

public fun interface CL_MAKE_CALL_COMPLETE_HANDLERFn {
    public operator fun invoke()
}

public typealias CL_MAKE_CALL_COMPLETE_HANDLER = CL_MAKE_CALL_COMPLETE_HANDLERFn?

public fun interface CL_MODIFY_CALL_QOS_COMPLETE_HANDLERFn {
    public operator fun invoke()
}

public typealias CL_MODIFY_CALL_QOS_COMPLETE_HANDLER = CL_MODIFY_CALL_QOS_COMPLETE_HANDLERFn?

public fun interface CL_OPEN_AF_COMPLETE_HANDLERFn {
    public operator fun invoke()
}

public typealias CL_OPEN_AF_COMPLETE_HANDLER = CL_OPEN_AF_COMPLETE_HANDLERFn?

public fun interface CL_REG_SAP_COMPLETE_HANDLERFn {
    public operator fun invoke()
}

public typealias CL_REG_SAP_COMPLETE_HANDLER = CL_REG_SAP_COMPLETE_HANDLERFn?

public fun interface CM_ACTIVATE_VC_COMPLETE_HANDLERFn {
    public operator fun invoke()
}

public typealias CM_ACTIVATE_VC_COMPLETE_HANDLER = CM_ACTIVATE_VC_COMPLETE_HANDLERFn?

public fun interface CM_ADD_PARTY_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias CM_ADD_PARTY_HANDLER = CM_ADD_PARTY_HANDLERFn?

public fun interface CM_CLOSE_AF_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias CM_CLOSE_AF_HANDLER = CM_CLOSE_AF_HANDLERFn?

public fun interface CM_CLOSE_CALL_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias CM_CLOSE_CALL_HANDLER = CM_CLOSE_CALL_HANDLERFn?

public fun interface CM_DEACTIVATE_VC_COMPLETE_HANDLERFn {
    public operator fun invoke()
}

public typealias CM_DEACTIVATE_VC_COMPLETE_HANDLER = CM_DEACTIVATE_VC_COMPLETE_HANDLERFn?

public fun interface CM_DEREG_SAP_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias CM_DEREG_SAP_HANDLER = CM_DEREG_SAP_HANDLERFn?

public fun interface CM_DROP_PARTY_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias CM_DROP_PARTY_HANDLER = CM_DROP_PARTY_HANDLERFn?

public fun interface CM_INCOMING_CALL_COMPLETE_HANDLERFn {
    public operator fun invoke()
}

public typealias CM_INCOMING_CALL_COMPLETE_HANDLER = CM_INCOMING_CALL_COMPLETE_HANDLERFn?

public fun interface CM_MAKE_CALL_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias CM_MAKE_CALL_HANDLER = CM_MAKE_CALL_HANDLERFn?

public fun interface CM_MODIFY_CALL_QOS_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias CM_MODIFY_CALL_QOS_HANDLER = CM_MODIFY_CALL_QOS_HANDLERFn?

public fun interface CM_OPEN_AF_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias CM_OPEN_AF_HANDLER = CM_OPEN_AF_HANDLERFn?

public fun interface CM_REG_SAP_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias CM_REG_SAP_HANDLER = CM_REG_SAP_HANDLERFn?

public fun interface CO_AF_REGISTER_NOTIFY_HANDLERFn {
    public operator fun invoke()
}

public typealias CO_AF_REGISTER_NOTIFY_HANDLER = CO_AF_REGISTER_NOTIFY_HANDLERFn?

public typealias CO_CALL_PARAMETERS = Long

public fun interface CO_CREATE_VC_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias CO_CREATE_VC_HANDLER = CO_CREATE_VC_HANDLERFn?

public fun interface CO_DELETE_VC_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias CO_DELETE_VC_HANDLER = CO_DELETE_VC_HANDLERFn?

public typealias CO_MEDIA_PARAMETERS = Long

public typealias ETH_FILTER = Long

public fun interface MINIPORT_CO_ACTIVATE_VCFn {
    public operator fun invoke(miniportvccontext: Long, callparameters: Long): Int
}

public typealias MINIPORT_CO_ACTIVATE_VC = MINIPORT_CO_ACTIVATE_VCFn?

public fun interface MINIPORT_CO_CREATE_VCFn {
    public operator fun invoke(miniportadaptercontext: Long, ndisvchandle: Long, miniportvccontext: Long): Int
}

public typealias MINIPORT_CO_CREATE_VC = MINIPORT_CO_CREATE_VCFn?

public fun interface MINIPORT_CO_DEACTIVATE_VCFn {
    public operator fun invoke(miniportvccontext: Long): Int
}

public typealias MINIPORT_CO_DEACTIVATE_VC = MINIPORT_CO_DEACTIVATE_VCFn?

public fun interface MINIPORT_CO_DELETE_VCFn {
    public operator fun invoke(miniportvccontext: Long): Int
}

public typealias MINIPORT_CO_DELETE_VC = MINIPORT_CO_DELETE_VCFn?

public typealias NDIS_802_11_AUTHENTICATION_MODE = Int

public typealias NDIS_802_11_MEDIA_STREAM_MODE = Int

public typealias NDIS_802_11_NETWORK_INFRASTRUCTURE = Int

public typealias NDIS_802_11_NETWORK_TYPE = Int

public typealias NDIS_802_11_POWER_MODE = Int

public typealias NDIS_802_11_PRIVACY_FILTER = Int

public typealias NDIS_802_11_RADIO_STATUS = Int

public typealias NDIS_802_11_RELOAD_DEFAULTS = Int

public typealias NDIS_802_11_STATUS_TYPE = Int

public typealias NDIS_802_11_WEP_STATUS = Int

public typealias NDIS_802_5_RING_STATE = Int

public typealias NDIS_AF_LIST = Long

public typealias NDIS_CALL_MANAGER_CHARACTERISTICS = Long

public typealias NDIS_CLASS_ID = Int

public typealias NDIS_DEVICE_PNP_EVENT = Int

public typealias NDIS_DEVICE_POWER_STATE = Int

public typealias NDIS_ENVIRONMENT_TYPE = Int

public typealias NDIS_FDDI_ATTACHMENT_TYPE = Int

public typealias NDIS_FDDI_LCONNECTION_STATE = Int

public typealias NDIS_FDDI_RING_MGT_STATE = Int

public typealias NDIS_HARDWARE_STATUS = Int

public typealias NDIS_INTERFACE_TYPE = Int

public typealias NDIS_INTERRUPT_MODERATION = Int

public typealias NDIS_MEDIA_STATE = Int

public typealias NDIS_MEDIUM = Int

public typealias NDIS_MINIPORT_BLOCK = Long

public typealias NDIS_M_DRIVER_BLOCK = Long

public typealias NDIS_NETWORK_CHANGE_TYPE = Int

public typealias NDIS_OPEN_BLOCK = Long

public typealias NDIS_PARAMETER_TYPE = Int

public typealias NDIS_PD_COUNTER_HANDLE = Long

public typealias NDIS_PD_FILTER_HANDLE = Long

public typealias NDIS_PD_PROVIDER_HANDLE = Long

public typealias NDIS_PER_PACKET_INFO = Int

public typealias NDIS_PHYSICAL_MEDIUM = Int

public typealias NDIS_POLL_HANDLE = Long

public typealias NDIS_PORT_AUTHORIZATION_STATE = Int

public typealias NDIS_PORT_CONTROL_STATE = Int

public typealias NDIS_PORT_TYPE = Int

public typealias NDIS_POWER_PROFILE = Int

public fun interface NDIS_PROCFn {
    public operator fun invoke()
}

public typealias NDIS_PROC = NDIS_PROCFn?

public typealias NDIS_PROCESSOR_TYPE = Int

public typealias NDIS_PROCESSOR_VENDOR = Int

public fun interface NDIS_PROC_CALLBACKFn {
    public operator fun invoke(workitem: Long, context: Long)
}

public typealias NDIS_PROC_CALLBACK = NDIS_PROC_CALLBACKFn?

public typealias NDIS_PROTOCOL_BLOCK = Long

public typealias NDIS_REQUEST_TYPE = Int

public typealias NDIS_SUPPORTED_PAUSE_FUNCTIONS = Int

public fun interface NDIS_TIMER_FUNCTIONFn {
    public operator fun invoke(systemspecific1: Long, functioncontext: Long, systemspecific2: Long, systemspecific3: Long)
}

public typealias NDIS_TIMER_FUNCTION = NDIS_TIMER_FUNCTIONFn?

public typealias NDIS_WAN_HEADER_FORMAT = Int

public typealias NDIS_WAN_MEDIUM_SUBTYPE = Int

public typealias NDIS_WAN_QUALITY = Int

public typealias NDIS_WRAPPER_HANDLE = Long

public typealias NULL_FILTER = Long

public typealias OFFLOAD_CONF_ALGO = Int

public typealias OFFLOAD_INTEGRITY_ALGO = Int

public typealias OFFLOAD_OPERATION_E = Int

public fun interface PNDIS_TIMER_FUNCTIONFn {
    public operator fun invoke()
}

public typealias PNDIS_TIMER_FUNCTION = PNDIS_TIMER_FUNCTIONFn?

public fun interface PROTCOL_CO_AF_REGISTER_NOTIFYFn {
    public operator fun invoke()
}

public typealias PROTCOL_CO_AF_REGISTER_NOTIFY = PROTCOL_CO_AF_REGISTER_NOTIFYFn?

public fun interface PROTOCOL_CL_ADD_PARTY_COMPLETEFn {
    public operator fun invoke(status: Int, protocolpartycontext: Long, ndispartyhandle: Long, callparameters: Long)
}

public typealias PROTOCOL_CL_ADD_PARTY_COMPLETE = PROTOCOL_CL_ADD_PARTY_COMPLETEFn?

public fun interface PROTOCOL_CL_CALL_CONNECTEDFn {
    public operator fun invoke(protocolvccontext: Long)
}

public typealias PROTOCOL_CL_CALL_CONNECTED = PROTOCOL_CL_CALL_CONNECTEDFn?

public fun interface PROTOCOL_CL_CLOSE_AF_COMPLETEFn {
    public operator fun invoke(status: Int, protocolafcontext: Long)
}

public typealias PROTOCOL_CL_CLOSE_AF_COMPLETE = PROTOCOL_CL_CLOSE_AF_COMPLETEFn?

public fun interface PROTOCOL_CL_CLOSE_CALL_COMPLETEFn {
    public operator fun invoke(status: Int, protocolvccontext: Long, protocolpartycontext: Long)
}

public typealias PROTOCOL_CL_CLOSE_CALL_COMPLETE = PROTOCOL_CL_CLOSE_CALL_COMPLETEFn?

public fun interface PROTOCOL_CL_DEREGISTER_SAP_COMPLETEFn {
    public operator fun invoke(status: Int, protocolsapcontext: Long)
}

public typealias PROTOCOL_CL_DEREGISTER_SAP_COMPLETE = PROTOCOL_CL_DEREGISTER_SAP_COMPLETEFn?

public fun interface PROTOCOL_CL_DROP_PARTY_COMPLETEFn {
    public operator fun invoke(status: Int, protocolpartycontext: Long)
}

public typealias PROTOCOL_CL_DROP_PARTY_COMPLETE = PROTOCOL_CL_DROP_PARTY_COMPLETEFn?

public fun interface PROTOCOL_CL_INCOMING_CALLFn {
    public operator fun invoke(protocolsapcontext: Long, protocolvccontext: Long, callparameters: Long): Int
}

public typealias PROTOCOL_CL_INCOMING_CALL = PROTOCOL_CL_INCOMING_CALLFn?

public fun interface PROTOCOL_CL_INCOMING_CALL_QOS_CHANGEFn {
    public operator fun invoke(protocolvccontext: Long, callparameters: Long)
}

public typealias PROTOCOL_CL_INCOMING_CALL_QOS_CHANGE = PROTOCOL_CL_INCOMING_CALL_QOS_CHANGEFn?

public fun interface PROTOCOL_CL_INCOMING_CLOSE_CALLFn {
    public operator fun invoke(closestatus: Int, protocolvccontext: Long, closedata: Long, size: UInt)
}

public typealias PROTOCOL_CL_INCOMING_CLOSE_CALL = PROTOCOL_CL_INCOMING_CLOSE_CALLFn?

public fun interface PROTOCOL_CL_INCOMING_DROP_PARTYFn {
    public operator fun invoke(dropstatus: Int, protocolpartycontext: Long, closedata: Long, size: UInt)
}

public typealias PROTOCOL_CL_INCOMING_DROP_PARTY = PROTOCOL_CL_INCOMING_DROP_PARTYFn?

public fun interface PROTOCOL_CL_MAKE_CALL_COMPLETEFn {
    public operator fun invoke(status: Int, protocolvccontext: Long, ndispartyhandle: Long, callparameters: Long)
}

public typealias PROTOCOL_CL_MAKE_CALL_COMPLETE = PROTOCOL_CL_MAKE_CALL_COMPLETEFn?

public fun interface PROTOCOL_CL_MODIFY_CALL_QOS_COMPLETEFn {
    public operator fun invoke(status: Int, protocolvccontext: Long, callparameters: Long)
}

public typealias PROTOCOL_CL_MODIFY_CALL_QOS_COMPLETE = PROTOCOL_CL_MODIFY_CALL_QOS_COMPLETEFn?

public fun interface PROTOCOL_CL_OPEN_AF_COMPLETEFn {
    public operator fun invoke(status: Int, protocolafcontext: Long, ndisafhandle: Long)
}

public typealias PROTOCOL_CL_OPEN_AF_COMPLETE = PROTOCOL_CL_OPEN_AF_COMPLETEFn?

public fun interface PROTOCOL_CL_REGISTER_SAP_COMPLETEFn {
    public operator fun invoke(status: Int, protocolsapcontext: Long, sap: Long, ndissaphandle: Long)
}

public typealias PROTOCOL_CL_REGISTER_SAP_COMPLETE = PROTOCOL_CL_REGISTER_SAP_COMPLETEFn?

public fun interface PROTOCOL_CM_ACTIVATE_VC_COMPLETEFn {
    public operator fun invoke(status: Int, callmgrvccontext: Long, callparameters: Long)
}

public typealias PROTOCOL_CM_ACTIVATE_VC_COMPLETE = PROTOCOL_CM_ACTIVATE_VC_COMPLETEFn?

public fun interface PROTOCOL_CM_ADD_PARTYFn {
    public operator fun invoke(callmgrvccontext: Long, callparameters: Long, ndispartyhandle: Long, callmgrpartycontext: Long): Int
}

public typealias PROTOCOL_CM_ADD_PARTY = PROTOCOL_CM_ADD_PARTYFn?

public fun interface PROTOCOL_CM_CLOSE_AFFn {
    public operator fun invoke(callmgrafcontext: Long): Int
}

public typealias PROTOCOL_CM_CLOSE_AF = PROTOCOL_CM_CLOSE_AFFn?

public fun interface PROTOCOL_CM_CLOSE_CALLFn {
    public operator fun invoke(callmgrvccontext: Long, callmgrpartycontext: Long, closedata: Long, size: UInt): Int
}

public typealias PROTOCOL_CM_CLOSE_CALL = PROTOCOL_CM_CLOSE_CALLFn?

public fun interface PROTOCOL_CM_DEACTIVATE_VC_COMPLETEFn {
    public operator fun invoke(status: Int, callmgrvccontext: Long)
}

public typealias PROTOCOL_CM_DEACTIVATE_VC_COMPLETE = PROTOCOL_CM_DEACTIVATE_VC_COMPLETEFn?

public fun interface PROTOCOL_CM_DEREGISTER_SAPFn {
    public operator fun invoke(callmgrsapcontext: Long): Int
}

public typealias PROTOCOL_CM_DEREGISTER_SAP = PROTOCOL_CM_DEREGISTER_SAPFn?

public fun interface PROTOCOL_CM_DROP_PARTYFn {
    public operator fun invoke(callmgrpartycontext: Long, closedata: Long, size: UInt): Int
}

public typealias PROTOCOL_CM_DROP_PARTY = PROTOCOL_CM_DROP_PARTYFn?

public fun interface PROTOCOL_CM_INCOMING_CALL_COMPLETEFn {
    public operator fun invoke(status: Int, callmgrvccontext: Long, callparameters: Long)
}

public typealias PROTOCOL_CM_INCOMING_CALL_COMPLETE = PROTOCOL_CM_INCOMING_CALL_COMPLETEFn?

public fun interface PROTOCOL_CM_MAKE_CALLFn {
    public operator fun invoke(callmgrvccontext: Long, callparameters: Long, ndispartyhandle: Long, callmgrpartycontext: Long): Int
}

public typealias PROTOCOL_CM_MAKE_CALL = PROTOCOL_CM_MAKE_CALLFn?

public fun interface PROTOCOL_CM_MODIFY_QOS_CALLFn {
    public operator fun invoke(callmgrvccontext: Long, callparameters: Long): Int
}

public typealias PROTOCOL_CM_MODIFY_QOS_CALL = PROTOCOL_CM_MODIFY_QOS_CALLFn?

public fun interface PROTOCOL_CM_OPEN_AFFn {
    public operator fun invoke(callmgrbindingcontext: Long, addressfamily: Long, ndisafhandle: Long, callmgrafcontext: Long): Int
}

public typealias PROTOCOL_CM_OPEN_AF = PROTOCOL_CM_OPEN_AFFn?

public fun interface PROTOCOL_CM_REG_SAPFn {
    public operator fun invoke(callmgrafcontext: Long, sap: Long, ndissaphandle: Long, callmgrsapcontext: Long): Int
}

public typealias PROTOCOL_CM_REG_SAP = PROTOCOL_CM_REG_SAPFn?

public fun interface PROTOCOL_CO_AF_REGISTER_NOTIFYFn {
    public operator fun invoke(protocolbindingcontext: Long, addressfamily: Long)
}

public typealias PROTOCOL_CO_AF_REGISTER_NOTIFY = PROTOCOL_CO_AF_REGISTER_NOTIFYFn?

public fun interface PROTOCOL_CO_CREATE_VCFn {
    public operator fun invoke(protocolafcontext: Long, ndisvchandle: Long, protocolvccontext: Long): Int
}

public typealias PROTOCOL_CO_CREATE_VC = PROTOCOL_CO_CREATE_VCFn?

public fun interface PROTOCOL_CO_DELETE_VCFn {
    public operator fun invoke(protocolvccontext: Long): Int
}

public typealias PROTOCOL_CO_DELETE_VC = PROTOCOL_CO_DELETE_VCFn?

public fun interface TDI_PNP_HANDLERFn {
    public operator fun invoke(uppercomponent: Long, lowercomponent: Long, bindlist: Long, reconfigbuffer: Long, reconfigbuffersize: UInt, operation: UInt): Win32.Foundation.NTSTATUS
}

public typealias TDI_PNP_HANDLER = TDI_PNP_HANDLERFn?

public fun interface TDI_REGISTER_CALLBACKFn {
    public operator fun invoke(devicename: Long, tdihandle: Long): Win32.Foundation.NTSTATUS
}

public typealias TDI_REGISTER_CALLBACK = TDI_REGISTER_CALLBACKFn?

public typealias TR_FILTER = Long

public typealias UDP_ENCAP_TYPE = Int

public fun interface W_CO_ACTIVATE_VC_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias W_CO_ACTIVATE_VC_HANDLER = W_CO_ACTIVATE_VC_HANDLERFn?

public fun interface W_CO_CREATE_VC_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias W_CO_CREATE_VC_HANDLER = W_CO_CREATE_VC_HANDLERFn?

public fun interface W_CO_DEACTIVATE_VC_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias W_CO_DEACTIVATE_VC_HANDLER = W_CO_DEACTIVATE_VC_HANDLERFn?

public fun interface W_CO_DELETE_VC_HANDLERFn {
    public operator fun invoke(): Int
}

public typealias W_CO_DELETE_VC_HANDLER = W_CO_DELETE_VC_HANDLERFn?
