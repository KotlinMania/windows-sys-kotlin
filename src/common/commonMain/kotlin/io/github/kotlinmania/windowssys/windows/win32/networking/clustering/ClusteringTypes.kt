package io.github.kotlinmania.windowssys.windows.win32.networking.clustering

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public typealias CLCTL_CODES = Int

public typealias CLUADMEX_OBJECT_TYPE = Int

public typealias CLUSCTL_AFFINITYRULE_CODES = Int

public typealias CLUSCTL_CLUSTER_CODES = Int

public typealias CLUSCTL_GROUPSET_CODES = Int

public typealias CLUSCTL_GROUP_CODES = Int

public typealias CLUSCTL_NETINTERFACE_CODES = Int

public typealias CLUSCTL_NETWORK_CODES = Int

public typealias CLUSCTL_NODE_CODES = Int

public typealias CLUSCTL_RESOURCE_CODES = Int

public typealias CLUSCTL_RESOURCE_TYPE_CODES = Int

public typealias CLUSGROUP_TYPE = Int

public typealias CLUSPROP_IPADDR_ENABLENETBIOS = Int

public typealias CLUSPROP_PIFLAGS = Int

public typealias CLUSTERSET_OBJECT_TYPE = Int

public typealias CLUSTER_CHANGE = Int

public typealias CLUSTER_CHANGE_CLUSTER_V2 = Int

public typealias CLUSTER_CHANGE_GROUPSET_V2 = Int

public typealias CLUSTER_CHANGE_GROUP_V2 = Int

public typealias CLUSTER_CHANGE_NETINTERFACE_V2 = Int

public typealias CLUSTER_CHANGE_NETWORK_V2 = Int

public typealias CLUSTER_CHANGE_NODE_UPGRADE_PHASE_V2 = Int

public typealias CLUSTER_CHANGE_NODE_V2 = Int

public typealias CLUSTER_CHANGE_QUORUM_V2 = Int

public typealias CLUSTER_CHANGE_REGISTRY_V2 = Int

public typealias CLUSTER_CHANGE_RESOURCE_TYPE_V2 = Int

public typealias CLUSTER_CHANGE_RESOURCE_V2 = Int

public typealias CLUSTER_CHANGE_SHARED_VOLUME_V2 = Int

public typealias CLUSTER_CHANGE_SPACEPORT_V2 = Int

public typealias CLUSTER_CLOUD_TYPE = Int

public typealias CLUSTER_CONTROL_OBJECT = Int

public typealias CLUSTER_CSV_VOLUME_FAULT_STATE = Int

public typealias CLUSTER_ENUM = Int

public typealias CLUSTER_GROUP_AUTOFAILBACK_TYPE = Int

public typealias CLUSTER_GROUP_ENUM = Int

public typealias CLUSTER_GROUP_PRIORITY = Int

public typealias CLUSTER_GROUP_STATE = Int

public typealias CLUSTER_MGMT_POINT_RESTYPE = Int

public typealias CLUSTER_MGMT_POINT_TYPE = Int

public typealias CLUSTER_NETINTERFACE_STATE = Int

public typealias CLUSTER_NETWORK_ENUM = Int

public typealias CLUSTER_NETWORK_ROLE = Int

public typealias CLUSTER_NETWORK_STATE = Int

public typealias CLUSTER_NODE_DRAIN_STATUS = Int

public typealias CLUSTER_NODE_ENUM = Int

public typealias CLUSTER_NODE_RESUME_FAILBACK_TYPE = Int

public typealias CLUSTER_NODE_STATE = Int

public typealias CLUSTER_NODE_STATUS = Int

public typealias CLUSTER_NOTIFICATIONS_VERSION = Int

public typealias CLUSTER_OBJECT_TYPE = Int

public typealias CLUSTER_PROPERTY_FORMAT = Int

public typealias CLUSTER_PROPERTY_SYNTAX = UInt

public typealias CLUSTER_PROPERTY_TYPE = Int

public typealias CLUSTER_QUORUM_TYPE = Int

public typealias CLUSTER_QUORUM_VALUE = Int

public typealias CLUSTER_REG_COMMAND = Int

public typealias CLUSTER_RESOURCE_APPLICATION_STATE = Int

public typealias CLUSTER_RESOURCE_CLASS = Int

public typealias CLUSTER_RESOURCE_CREATE_FLAGS = Int

public typealias CLUSTER_RESOURCE_EMBEDDED_FAILURE_ACTION = Int

public typealias CLUSTER_RESOURCE_ENUM = Int

public typealias CLUSTER_RESOURCE_RESTART_ACTION = Int

public typealias CLUSTER_RESOURCE_STATE = Int

public typealias CLUSTER_RESOURCE_STATE_CHANGE_REASON = Int

public typealias CLUSTER_RESOURCE_TYPE_ENUM = Int

public typealias CLUSTER_ROLE = Int

public typealias CLUSTER_ROLE_STATE = Int

public typealias CLUSTER_SETUP_PHASE = Int

public typealias CLUSTER_SETUP_PHASE_SEVERITY = Int

public typealias CLUSTER_SETUP_PHASE_TYPE = Int

public typealias CLUSTER_SHARED_VOLUME_BACKUP_STATE = Int

public typealias CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE = Int

public typealias CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE = Int

public typealias CLUSTER_SHARED_VOLUME_STATE = Int

public typealias CLUSTER_STORAGENODE_STATE = Int

public typealias CLUSTER_UPGRADE_PHASE = Int

public typealias CLUS_AFFINITY_RULE_TYPE = Int

public typealias CLUS_CHARACTERISTICS = Int

public typealias CLUS_FLAGS = Int

public typealias CLUS_GROUP_START_SETTING = Int

public typealias CLUS_RESSUBCLASS = Int

public typealias CLUS_RESSUBCLASS_NETWORK = Int

public typealias CLUS_RESSUBCLASS_STORAGE = Int

public typealias FAILURE_TYPE = Int

public typealias FILESHARE_CHANGE_ENUM = Int

public typealias GRP_PLACEMENT_OPTIONS = Int

public typealias HCHANGE = Long

public typealias HCLUSCRYPTPROVIDER = Long

public typealias HCLUSENUM = Long

public typealias HCLUSENUMEX = Long

public typealias HCLUSTER = Long

public typealias HGROUP = Long

public typealias HGROUPENUM = Long

public typealias HGROUPENUMEX = Long

public typealias HGROUPSET = Long

public typealias HGROUPSETENUM = Long

public typealias HNETINTERFACE = Long

public typealias HNETINTERFACEENUM = Long

public typealias HNETWORK = Long

public typealias HNETWORKENUM = Long

public typealias HNODE = Long

public typealias HNODEENUM = Long

public typealias HNODEENUMEX = Long

public typealias HREGBATCH = Long

public typealias HREGBATCHNOTIFICATION = Long

public typealias HREGBATCHPORT = Long

public typealias HREGREADBATCH = Long

public typealias HREGREADBATCHREPLY = Long

public typealias HRESENUM = Long

public typealias HRESENUMEX = Long

public typealias HRESOURCE = Long

public typealias HRESTYPEENUM = Long

public typealias LOG_LEVEL = Int

public fun interface LPGROUP_CALLBACK_EXFn {
    public operator fun invoke(param0: HCLUSTER, param1: HGROUP, param2: HGROUP, param3: Long): UInt
}

public typealias LPGROUP_CALLBACK_EX = LPGROUP_CALLBACK_EXFn?

public fun interface LPNODE_CALLBACKFn {
    public operator fun invoke(param0: HCLUSTER, param1: HNODE, param2: CLUSTER_NODE_STATE, param3: Long): UInt
}

public typealias LPNODE_CALLBACK = LPNODE_CALLBACKFn?

public fun interface LPRESOURCE_CALLBACKFn {
    public operator fun invoke(param0: HRESOURCE, param1: HRESOURCE, param2: Long): UInt
}

public typealias LPRESOURCE_CALLBACK = LPRESOURCE_CALLBACKFn?

public fun interface LPRESOURCE_CALLBACK_EXFn {
    public operator fun invoke(param0: HCLUSTER, param1: HRESOURCE, param2: HRESOURCE, param3: Long): UInt
}

public typealias LPRESOURCE_CALLBACK_EX = LPRESOURCE_CALLBACK_EXFn?

public typealias MAINTENANCE_MODE_TYPE_ENUM = Int

public typealias NODE_CLUSTER_STATE = Int

public fun interface PARBITRATE_ROUTINEFn {
    public operator fun invoke(resource: Long, lostquorumresource: PQUORUM_RESOURCE_LOST): UInt
}

public typealias PARBITRATE_ROUTINE = PARBITRATE_ROUTINEFn?

public fun interface PARM_WPR_WATCHDOG_FOR_CURRENT_RESOURCE_CALL_ROUTINEFn {
    public operator fun invoke(resourcehandle: Long, timeoutinms: ULong): UInt
}

public typealias PARM_WPR_WATCHDOG_FOR_CURRENT_RESOURCE_CALL_ROUTINE = PARM_WPR_WATCHDOG_FOR_CURRENT_RESOURCE_CALL_ROUTINEFn?

public fun interface PBEGIN_RESCALL_AS_USER_ROUTINEFn {
    public operator fun invoke(resource: Long, tokenhandle: Foundation.HANDLE, controlcode: UInt, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, bytesreturned: Long, context: Long, returnedasynchronously: Long): UInt
}

public typealias PBEGIN_RESCALL_AS_USER_ROUTINE = PBEGIN_RESCALL_AS_USER_ROUTINEFn?

public fun interface PBEGIN_RESCALL_ROUTINEFn {
    public operator fun invoke(resource: Long, controlcode: UInt, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, bytesreturned: Long, context: Long, returnedasynchronously: Long): UInt
}

public typealias PBEGIN_RESCALL_ROUTINE = PBEGIN_RESCALL_ROUTINEFn?

public fun interface PBEGIN_RESTYPECALL_AS_USER_ROUTINEFn {
    public operator fun invoke(resourcetypename: PCWSTR, tokenhandle: Foundation.HANDLE, controlcode: UInt, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, bytesreturned: Long, context: Long, returnedasynchronously: Long): UInt
}

public typealias PBEGIN_RESTYPECALL_AS_USER_ROUTINE = PBEGIN_RESTYPECALL_AS_USER_ROUTINEFn?

public fun interface PBEGIN_RESTYPECALL_ROUTINEFn {
    public operator fun invoke(resourcetypename: PCWSTR, controlcode: UInt, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, bytesreturned: Long, context: Long, returnedasynchronously: Long): UInt
}

public typealias PBEGIN_RESTYPECALL_ROUTINE = PBEGIN_RESTYPECALL_ROUTINEFn?

public fun interface PCANCEL_ROUTINEFn {
    public operator fun invoke(resource: Long, cancelflags_reserved: UInt): UInt
}

public typealias PCANCEL_ROUTINE = PCANCEL_ROUTINEFn?

public fun interface PCHANGE_RESOURCE_PROCESS_FOR_DUMPSFn {
    public operator fun invoke(resource: Long, processname: PCWSTR, processid: UInt, isadd: BOOL): UInt
}

public typealias PCHANGE_RESOURCE_PROCESS_FOR_DUMPS = PCHANGE_RESOURCE_PROCESS_FOR_DUMPSFn?

public fun interface PCHANGE_RES_TYPE_PROCESS_FOR_DUMPSFn {
    public operator fun invoke(resourcetypename: PCWSTR, processname: PCWSTR, processid: UInt, isadd: BOOL): UInt
}

public typealias PCHANGE_RES_TYPE_PROCESS_FOR_DUMPS = PCHANGE_RES_TYPE_PROCESS_FOR_DUMPSFn?

public fun interface PCLOSE_CLUSTER_CRYPT_PROVIDERFn {
    public operator fun invoke(hcluscryptprovider: HCLUSCRYPTPROVIDER): UInt
}

public typealias PCLOSE_CLUSTER_CRYPT_PROVIDER = PCLOSE_CLUSTER_CRYPT_PROVIDERFn?

public fun interface PCLOSE_ROUTINEFn {
    public operator fun invoke(resource: Long)
}

public typealias PCLOSE_ROUTINE = PCLOSE_ROUTINEFn?

public fun interface PCLUSAPIClusWorkerCheckTerminateFn {
    public operator fun invoke(lpworker: Long): BOOL
}

public typealias PCLUSAPIClusWorkerCheckTerminate = PCLUSAPIClusWorkerCheckTerminateFn?

public fun interface PCLUSAPI_ADD_CLUSTER_GROUP_DEPENDENCYFn {
    public operator fun invoke(hdependentgroup: HGROUP, hprovidergroup: HGROUP): UInt
}

public typealias PCLUSAPI_ADD_CLUSTER_GROUP_DEPENDENCY = PCLUSAPI_ADD_CLUSTER_GROUP_DEPENDENCYFn?

public fun interface PCLUSAPI_ADD_CLUSTER_GROUP_DEPENDENCY_EXFn {
    public operator fun invoke(hdependentgroup: HGROUP, hprovidergroup: HGROUP, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_ADD_CLUSTER_GROUP_DEPENDENCY_EX = PCLUSAPI_ADD_CLUSTER_GROUP_DEPENDENCY_EXFn?

public fun interface PCLUSAPI_ADD_CLUSTER_GROUP_GROUPSET_DEPENDENCYFn {
    public operator fun invoke(hdependentgroupset: HGROUPSET, hprovidergroupset: HGROUPSET): UInt
}

public typealias PCLUSAPI_ADD_CLUSTER_GROUP_GROUPSET_DEPENDENCY = PCLUSAPI_ADD_CLUSTER_GROUP_GROUPSET_DEPENDENCYFn?

public fun interface PCLUSAPI_ADD_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EXFn {
    public operator fun invoke(hdependentgroupset: HGROUPSET, hprovidergroupset: HGROUPSET, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_ADD_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EX = PCLUSAPI_ADD_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EXFn?

public fun interface PCLUSAPI_ADD_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCYFn {
    public operator fun invoke(hdependentgroup: HGROUP, hprovidergroupset: HGROUPSET): UInt
}

public typealias PCLUSAPI_ADD_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCY = PCLUSAPI_ADD_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCYFn?

public fun interface PCLUSAPI_ADD_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCY_EXFn {
    public operator fun invoke(hdependentgroup: HGROUP, hprovidergroupset: HGROUPSET, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_ADD_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCY_EX = PCLUSAPI_ADD_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCY_EXFn?

public fun interface PCLUSAPI_ADD_CLUSTER_NODEFn {
    public operator fun invoke(hcluster: HCLUSTER, lpsznodename: PCWSTR, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HNODE
}

public typealias PCLUSAPI_ADD_CLUSTER_NODE = PCLUSAPI_ADD_CLUSTER_NODEFn?

public fun interface PCLUSAPI_ADD_CLUSTER_NODE_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, lpsznodename: PCWSTR, dwflags: UInt, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HNODE
}

public typealias PCLUSAPI_ADD_CLUSTER_NODE_EX = PCLUSAPI_ADD_CLUSTER_NODE_EXFn?

public fun interface PCLUSAPI_ADD_CLUSTER_RESOURCE_DEPENDENCYFn {
    public operator fun invoke(hresource: HRESOURCE, hdependson: HRESOURCE): UInt
}

public typealias PCLUSAPI_ADD_CLUSTER_RESOURCE_DEPENDENCY = PCLUSAPI_ADD_CLUSTER_RESOURCE_DEPENDENCYFn?

public fun interface PCLUSAPI_ADD_CLUSTER_RESOURCE_DEPENDENCY_EXFn {
    public operator fun invoke(hresource: HRESOURCE, hdependson: HRESOURCE, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_ADD_CLUSTER_RESOURCE_DEPENDENCY_EX = PCLUSAPI_ADD_CLUSTER_RESOURCE_DEPENDENCY_EXFn?

public fun interface PCLUSAPI_ADD_CLUSTER_RESOURCE_NODEFn {
    public operator fun invoke(hresource: HRESOURCE, hnode: HNODE): UInt
}

public typealias PCLUSAPI_ADD_CLUSTER_RESOURCE_NODE = PCLUSAPI_ADD_CLUSTER_RESOURCE_NODEFn?

public fun interface PCLUSAPI_ADD_CLUSTER_RESOURCE_NODE_EXFn {
    public operator fun invoke(hresource: HRESOURCE, hnode: HNODE, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_ADD_CLUSTER_RESOURCE_NODE_EX = PCLUSAPI_ADD_CLUSTER_RESOURCE_NODE_EXFn?

public fun interface PCLUSAPI_ADD_CROSS_CLUSTER_GROUPSET_DEPENDENCYFn {
    public operator fun invoke(hdependentgroupset: HGROUPSET, lpremoteclustername: PCWSTR, lpremotegroupsetname: PCWSTR): UInt
}

public typealias PCLUSAPI_ADD_CROSS_CLUSTER_GROUPSET_DEPENDENCY = PCLUSAPI_ADD_CROSS_CLUSTER_GROUPSET_DEPENDENCYFn?

public fun interface PCLUSAPI_ADD_RESOURCE_TO_CLUSTER_SHARED_VOLUMESFn {
    public operator fun invoke(hresource: HRESOURCE): UInt
}

public typealias PCLUSAPI_ADD_RESOURCE_TO_CLUSTER_SHARED_VOLUMES = PCLUSAPI_ADD_RESOURCE_TO_CLUSTER_SHARED_VOLUMESFn?

public fun interface PCLUSAPI_BACKUP_CLUSTER_DATABASEFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszpathname: PCWSTR): UInt
}

public typealias PCLUSAPI_BACKUP_CLUSTER_DATABASE = PCLUSAPI_BACKUP_CLUSTER_DATABASEFn?

public fun interface PCLUSAPI_CAN_RESOURCE_BE_DEPENDENTFn {
    public operator fun invoke(hresource: HRESOURCE, hresourcedependent: HRESOURCE): BOOL
}

public typealias PCLUSAPI_CAN_RESOURCE_BE_DEPENDENT = PCLUSAPI_CAN_RESOURCE_BE_DEPENDENTFn?

public fun interface PCLUSAPI_CHANGE_CLUSTER_RESOURCE_GROUPFn {
    public operator fun invoke(hresource: HRESOURCE, hgroup: HGROUP): UInt
}

public typealias PCLUSAPI_CHANGE_CLUSTER_RESOURCE_GROUP = PCLUSAPI_CHANGE_CLUSTER_RESOURCE_GROUPFn?

public fun interface PCLUSAPI_CHANGE_CLUSTER_RESOURCE_GROUP_EXFn {
    public operator fun invoke(hresource: HRESOURCE, hgroup: HGROUP, flags: ULong): UInt
}

public typealias PCLUSAPI_CHANGE_CLUSTER_RESOURCE_GROUP_EX = PCLUSAPI_CHANGE_CLUSTER_RESOURCE_GROUP_EXFn?

public fun interface PCLUSAPI_CHANGE_CLUSTER_RESOURCE_GROUP_EX2Fn {
    public operator fun invoke(hresource: HRESOURCE, hgroup: HGROUP, flags: ULong, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CHANGE_CLUSTER_RESOURCE_GROUP_EX2 = PCLUSAPI_CHANGE_CLUSTER_RESOURCE_GROUP_EX2Fn?

public fun interface PCLUSAPI_CLOSE_CLUSTERFn {
    public operator fun invoke(hcluster: HCLUSTER): BOOL
}

public typealias PCLUSAPI_CLOSE_CLUSTER = PCLUSAPI_CLOSE_CLUSTERFn?

public fun interface PCLUSAPI_CLOSE_CLUSTER_GROUPFn {
    public operator fun invoke(hgroup: HGROUP): BOOL
}

public typealias PCLUSAPI_CLOSE_CLUSTER_GROUP = PCLUSAPI_CLOSE_CLUSTER_GROUPFn?

public fun interface PCLUSAPI_CLOSE_CLUSTER_GROUP_GROUPSETFn {
    public operator fun invoke(hgroupset: HGROUPSET): BOOL
}

public typealias PCLUSAPI_CLOSE_CLUSTER_GROUP_GROUPSET = PCLUSAPI_CLOSE_CLUSTER_GROUP_GROUPSETFn?

public fun interface PCLUSAPI_CLOSE_CLUSTER_NETWORKFn {
    public operator fun invoke(hnetwork: HNETWORK): BOOL
}

public typealias PCLUSAPI_CLOSE_CLUSTER_NETWORK = PCLUSAPI_CLOSE_CLUSTER_NETWORKFn?

public fun interface PCLUSAPI_CLOSE_CLUSTER_NET_INTERFACEFn {
    public operator fun invoke(hnetinterface: HNETINTERFACE): BOOL
}

public typealias PCLUSAPI_CLOSE_CLUSTER_NET_INTERFACE = PCLUSAPI_CLOSE_CLUSTER_NET_INTERFACEFn?

public fun interface PCLUSAPI_CLOSE_CLUSTER_NODEFn {
    public operator fun invoke(hnode: HNODE): BOOL
}

public typealias PCLUSAPI_CLOSE_CLUSTER_NODE = PCLUSAPI_CLOSE_CLUSTER_NODEFn?

public fun interface PCLUSAPI_CLOSE_CLUSTER_NOTIFY_PORTFn {
    public operator fun invoke(hchange: HCHANGE): BOOL
}

public typealias PCLUSAPI_CLOSE_CLUSTER_NOTIFY_PORT = PCLUSAPI_CLOSE_CLUSTER_NOTIFY_PORTFn?

public fun interface PCLUSAPI_CLOSE_CLUSTER_RESOURCEFn {
    public operator fun invoke(hresource: HRESOURCE): BOOL
}

public typealias PCLUSAPI_CLOSE_CLUSTER_RESOURCE = PCLUSAPI_CLOSE_CLUSTER_RESOURCEFn?

public fun interface PCLUSAPI_CLUSTER_ADD_GROUP_TO_AFFINITY_RULEFn {
    public operator fun invoke(hcluster: HCLUSTER, rulename: PCWSTR, hgroup: HGROUP): UInt
}

public typealias PCLUSAPI_CLUSTER_ADD_GROUP_TO_AFFINITY_RULE = PCLUSAPI_CLUSTER_ADD_GROUP_TO_AFFINITY_RULEFn?

public fun interface PCLUSAPI_CLUSTER_ADD_GROUP_TO_GROUPSET_WITH_DOMAINS_EXFn {
    public operator fun invoke(hgroupset: HGROUPSET, hgroup: HGROUP, faultdomain: UInt, updatedomain: UInt, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_ADD_GROUP_TO_GROUPSET_WITH_DOMAINS_EX = PCLUSAPI_CLUSTER_ADD_GROUP_TO_GROUPSET_WITH_DOMAINS_EXFn?

public fun interface PCLUSAPI_CLUSTER_ADD_GROUP_TO_GROUP_GROUPSETFn {
    public operator fun invoke(hgroupset: HGROUPSET, hgroup: HGROUP): UInt
}

public typealias PCLUSAPI_CLUSTER_ADD_GROUP_TO_GROUP_GROUPSET = PCLUSAPI_CLUSTER_ADD_GROUP_TO_GROUP_GROUPSETFn?

public fun interface PCLUSAPI_CLUSTER_AFFINITY_RULE_CONTROLFn {
    public operator fun invoke(hcluster: HCLUSTER, affinityrulename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_AFFINITY_RULE_CONTROL = PCLUSAPI_CLUSTER_AFFINITY_RULE_CONTROLFn?

public fun interface PCLUSAPI_CLUSTER_CLOSE_ENUMFn {
    public operator fun invoke(henum: HCLUSENUM): UInt
}

public typealias PCLUSAPI_CLUSTER_CLOSE_ENUM = PCLUSAPI_CLUSTER_CLOSE_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_CLOSE_ENUM_EXFn {
    public operator fun invoke(hclusterenum: HCLUSENUMEX): UInt
}

public typealias PCLUSAPI_CLUSTER_CLOSE_ENUM_EX = PCLUSAPI_CLUSTER_CLOSE_ENUM_EXFn?

public fun interface PCLUSAPI_CLUSTER_CONTROLFn {
    public operator fun invoke(hcluster: HCLUSTER, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_CONTROL = PCLUSAPI_CLUSTER_CONTROLFn?

public fun interface PCLUSAPI_CLUSTER_CONTROL_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_CONTROL_EX = PCLUSAPI_CLUSTER_CONTROL_EXFn?

public fun interface PCLUSAPI_CLUSTER_CREATE_AFFINITY_RULEFn {
    public operator fun invoke(hcluster: HCLUSTER, rulename: PCWSTR, ruletype: CLUS_AFFINITY_RULE_TYPE): UInt
}

public typealias PCLUSAPI_CLUSTER_CREATE_AFFINITY_RULE = PCLUSAPI_CLUSTER_CREATE_AFFINITY_RULEFn?

public fun interface PCLUSAPI_CLUSTER_ENUMFn {
    public operator fun invoke(henum: HCLUSENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_ENUM = PCLUSAPI_CLUSTER_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_ENUM_EXFn {
    public operator fun invoke(hclusterenum: HCLUSENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_ENUM_EX = PCLUSAPI_CLUSTER_ENUM_EXFn?

public fun interface PCLUSAPI_CLUSTER_GET_ENUM_COUNTFn {
    public operator fun invoke(henum: HCLUSENUM): UInt
}

public typealias PCLUSAPI_CLUSTER_GET_ENUM_COUNT = PCLUSAPI_CLUSTER_GET_ENUM_COUNTFn?

public fun interface PCLUSAPI_CLUSTER_GET_ENUM_COUNT_EXFn {
    public operator fun invoke(hclusterenum: HCLUSENUMEX): UInt
}

public typealias PCLUSAPI_CLUSTER_GET_ENUM_COUNT_EX = PCLUSAPI_CLUSTER_GET_ENUM_COUNT_EXFn?

public fun interface PCLUSAPI_CLUSTER_GROUP_CLOSE_ENUMFn {
    public operator fun invoke(hgroupenum: HGROUPENUM): UInt
}

public typealias PCLUSAPI_CLUSTER_GROUP_CLOSE_ENUM = PCLUSAPI_CLUSTER_GROUP_CLOSE_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_GROUP_CLOSE_ENUM_EXFn {
    public operator fun invoke(hgroupenumex: HGROUPENUMEX): UInt
}

public typealias PCLUSAPI_CLUSTER_GROUP_CLOSE_ENUM_EX = PCLUSAPI_CLUSTER_GROUP_CLOSE_ENUM_EXFn?

public fun interface PCLUSAPI_CLUSTER_GROUP_CONTROLFn {
    public operator fun invoke(hgroup: HGROUP, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_GROUP_CONTROL = PCLUSAPI_CLUSTER_GROUP_CONTROLFn?

public fun interface PCLUSAPI_CLUSTER_GROUP_CONTROL_EXFn {
    public operator fun invoke(hgroup: HGROUP, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_GROUP_CONTROL_EX = PCLUSAPI_CLUSTER_GROUP_CONTROL_EXFn?

public fun interface PCLUSAPI_CLUSTER_GROUP_ENUMFn {
    public operator fun invoke(hgroupenum: HGROUPENUM, dwindex: UInt, lpdwtype: Long, lpszresourcename: PWSTR, lpcchname: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_GROUP_ENUM = PCLUSAPI_CLUSTER_GROUP_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_GROUP_ENUM_EXFn {
    public operator fun invoke(hgroupenumex: HGROUPENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_GROUP_ENUM_EX = PCLUSAPI_CLUSTER_GROUP_ENUM_EXFn?

public fun interface PCLUSAPI_CLUSTER_GROUP_GET_ENUM_COUNTFn {
    public operator fun invoke(hgroupenum: HGROUPENUM): UInt
}

public typealias PCLUSAPI_CLUSTER_GROUP_GET_ENUM_COUNT = PCLUSAPI_CLUSTER_GROUP_GET_ENUM_COUNTFn?

public fun interface PCLUSAPI_CLUSTER_GROUP_GET_ENUM_COUNT_EXFn {
    public operator fun invoke(hgroupenumex: HGROUPENUMEX): UInt
}

public typealias PCLUSAPI_CLUSTER_GROUP_GET_ENUM_COUNT_EX = PCLUSAPI_CLUSTER_GROUP_GET_ENUM_COUNT_EXFn?

public fun interface PCLUSAPI_CLUSTER_GROUP_GROUPSET_CONTROLFn {
    public operator fun invoke(hgroupset: HGROUPSET, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_GROUP_GROUPSET_CONTROL = PCLUSAPI_CLUSTER_GROUP_GROUPSET_CONTROLFn?

public fun interface PCLUSAPI_CLUSTER_GROUP_GROUPSET_CONTROL_EXFn {
    public operator fun invoke(hgroupset: HGROUPSET, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_GROUP_GROUPSET_CONTROL_EX = PCLUSAPI_CLUSTER_GROUP_GROUPSET_CONTROL_EXFn?

public fun interface PCLUSAPI_CLUSTER_GROUP_OPEN_ENUMFn {
    public operator fun invoke(hgroup: HGROUP, dwtype: UInt): HGROUPENUM
}

public typealias PCLUSAPI_CLUSTER_GROUP_OPEN_ENUM = PCLUSAPI_CLUSTER_GROUP_OPEN_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_GROUP_OPEN_ENUM_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszproperties: PCWSTR, cbproperties: UInt, lpszroproperties: PCWSTR, cbroproperties: UInt, dwflags: UInt): HGROUPENUMEX
}

public typealias PCLUSAPI_CLUSTER_GROUP_OPEN_ENUM_EX = PCLUSAPI_CLUSTER_GROUP_OPEN_ENUM_EXFn?

public fun interface PCLUSAPI_CLUSTER_NETWORK_CLOSE_ENUMFn {
    public operator fun invoke(hnetworkenum: HNETWORKENUM): UInt
}

public typealias PCLUSAPI_CLUSTER_NETWORK_CLOSE_ENUM = PCLUSAPI_CLUSTER_NETWORK_CLOSE_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_NETWORK_CONTROLFn {
    public operator fun invoke(hnetwork: HNETWORK, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_NETWORK_CONTROL = PCLUSAPI_CLUSTER_NETWORK_CONTROLFn?

public fun interface PCLUSAPI_CLUSTER_NETWORK_CONTROL_EXFn {
    public operator fun invoke(hnetwork: HNETWORK, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_NETWORK_CONTROL_EX = PCLUSAPI_CLUSTER_NETWORK_CONTROL_EXFn?

public fun interface PCLUSAPI_CLUSTER_NETWORK_ENUMFn {
    public operator fun invoke(hnetworkenum: HNETWORKENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_NETWORK_ENUM = PCLUSAPI_CLUSTER_NETWORK_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_NETWORK_GET_ENUM_COUNTFn {
    public operator fun invoke(hnetworkenum: HNETWORKENUM): UInt
}

public typealias PCLUSAPI_CLUSTER_NETWORK_GET_ENUM_COUNT = PCLUSAPI_CLUSTER_NETWORK_GET_ENUM_COUNTFn?

public fun interface PCLUSAPI_CLUSTER_NETWORK_OPEN_ENUMFn {
    public operator fun invoke(hnetwork: HNETWORK, dwtype: UInt): HNETWORKENUM
}

public typealias PCLUSAPI_CLUSTER_NETWORK_OPEN_ENUM = PCLUSAPI_CLUSTER_NETWORK_OPEN_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_NET_INTERFACE_CONTROLFn {
    public operator fun invoke(hnetinterface: HNETINTERFACE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_NET_INTERFACE_CONTROL = PCLUSAPI_CLUSTER_NET_INTERFACE_CONTROLFn?

public fun interface PCLUSAPI_CLUSTER_NET_INTERFACE_CONTROL_EXFn {
    public operator fun invoke(hnetinterface: HNETINTERFACE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_NET_INTERFACE_CONTROL_EX = PCLUSAPI_CLUSTER_NET_INTERFACE_CONTROL_EXFn?

public fun interface PCLUSAPI_CLUSTER_NODE_CLOSE_ENUMFn {
    public operator fun invoke(hnodeenum: HNODEENUM): UInt
}

public typealias PCLUSAPI_CLUSTER_NODE_CLOSE_ENUM = PCLUSAPI_CLUSTER_NODE_CLOSE_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_NODE_CLOSE_ENUM_EXFn {
    public operator fun invoke(hnodeenum: HNODEENUMEX): UInt
}

public typealias PCLUSAPI_CLUSTER_NODE_CLOSE_ENUM_EX = PCLUSAPI_CLUSTER_NODE_CLOSE_ENUM_EXFn?

public fun interface PCLUSAPI_CLUSTER_NODE_CONTROLFn {
    public operator fun invoke(hnode: HNODE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_NODE_CONTROL = PCLUSAPI_CLUSTER_NODE_CONTROLFn?

public fun interface PCLUSAPI_CLUSTER_NODE_CONTROL_EXFn {
    public operator fun invoke(hnode: HNODE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_NODE_CONTROL_EX = PCLUSAPI_CLUSTER_NODE_CONTROL_EXFn?

public fun interface PCLUSAPI_CLUSTER_NODE_ENUMFn {
    public operator fun invoke(hnodeenum: HNODEENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_NODE_ENUM = PCLUSAPI_CLUSTER_NODE_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_NODE_ENUM_EXFn {
    public operator fun invoke(hnodeenum: HNODEENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_NODE_ENUM_EX = PCLUSAPI_CLUSTER_NODE_ENUM_EXFn?

public fun interface PCLUSAPI_CLUSTER_NODE_GET_ENUM_COUNTFn {
    public operator fun invoke(hnodeenum: HNODEENUM): UInt
}

public typealias PCLUSAPI_CLUSTER_NODE_GET_ENUM_COUNT = PCLUSAPI_CLUSTER_NODE_GET_ENUM_COUNTFn?

public fun interface PCLUSAPI_CLUSTER_NODE_GET_ENUM_COUNT_EXFn {
    public operator fun invoke(hnodeenum: HNODEENUMEX): UInt
}

public typealias PCLUSAPI_CLUSTER_NODE_GET_ENUM_COUNT_EX = PCLUSAPI_CLUSTER_NODE_GET_ENUM_COUNT_EXFn?

public fun interface PCLUSAPI_CLUSTER_NODE_OPEN_ENUMFn {
    public operator fun invoke(hnode: HNODE, dwtype: UInt): HNODEENUM
}

public typealias PCLUSAPI_CLUSTER_NODE_OPEN_ENUM = PCLUSAPI_CLUSTER_NODE_OPEN_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_NODE_OPEN_ENUM_EXFn {
    public operator fun invoke(hnode: HNODE, dwtype: UInt, poptions: Long): HNODEENUMEX
}

public typealias PCLUSAPI_CLUSTER_NODE_OPEN_ENUM_EX = PCLUSAPI_CLUSTER_NODE_OPEN_ENUM_EXFn?

public fun interface PCLUSAPI_CLUSTER_OPEN_ENUMFn {
    public operator fun invoke(hcluster: HCLUSTER, dwtype: UInt): HCLUSENUM
}

public typealias PCLUSAPI_CLUSTER_OPEN_ENUM = PCLUSAPI_CLUSTER_OPEN_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_OPEN_ENUM_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, dwtype: UInt, poptions: Long): HCLUSENUMEX
}

public typealias PCLUSAPI_CLUSTER_OPEN_ENUM_EX = PCLUSAPI_CLUSTER_OPEN_ENUM_EXFn?

public fun interface PCLUSAPI_CLUSTER_REG_CLOSE_KEYFn {
    public operator fun invoke(hkey: System.Registry.HKEY): Int
}

public typealias PCLUSAPI_CLUSTER_REG_CLOSE_KEY = PCLUSAPI_CLUSTER_REG_CLOSE_KEYFn?

public fun interface PCLUSAPI_CLUSTER_REG_CREATE_BATCHFn {
    public operator fun invoke(hkey: System.Registry.HKEY, phregbatch: Long): Int
}

public typealias PCLUSAPI_CLUSTER_REG_CREATE_BATCH = PCLUSAPI_CLUSTER_REG_CREATE_BATCHFn?

public fun interface PCLUSAPI_CLUSTER_REG_CREATE_KEYFn {
    public operator fun invoke(hkey: System.Registry.HKEY, lpszsubkey: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int
}

public typealias PCLUSAPI_CLUSTER_REG_CREATE_KEY = PCLUSAPI_CLUSTER_REG_CREATE_KEYFn?

public fun interface PCLUSAPI_CLUSTER_REG_CREATE_KEY_EXFn {
    public operator fun invoke(hkey: System.Registry.HKEY, lpszsubkey: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, lpszreason: PCWSTR): Int
}

public typealias PCLUSAPI_CLUSTER_REG_CREATE_KEY_EX = PCLUSAPI_CLUSTER_REG_CREATE_KEY_EXFn?

public fun interface PCLUSAPI_CLUSTER_REG_DELETE_KEYFn {
    public operator fun invoke(hkey: System.Registry.HKEY, lpszsubkey: PCWSTR): Int
}

public typealias PCLUSAPI_CLUSTER_REG_DELETE_KEY = PCLUSAPI_CLUSTER_REG_DELETE_KEYFn?

public fun interface PCLUSAPI_CLUSTER_REG_DELETE_KEY_EXFn {
    public operator fun invoke(hkey: System.Registry.HKEY, lpsubkey: PCWSTR, lpszreason: PCWSTR): Int
}

public typealias PCLUSAPI_CLUSTER_REG_DELETE_KEY_EX = PCLUSAPI_CLUSTER_REG_DELETE_KEY_EXFn?

public fun interface PCLUSAPI_CLUSTER_REG_DELETE_VALUEFn {
    public operator fun invoke(hkey: System.Registry.HKEY, lpszvaluename: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_REG_DELETE_VALUE = PCLUSAPI_CLUSTER_REG_DELETE_VALUEFn?

public fun interface PCLUSAPI_CLUSTER_REG_DELETE_VALUE_EXFn {
    public operator fun invoke(hkey: System.Registry.HKEY, lpszvaluename: PCWSTR, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_REG_DELETE_VALUE_EX = PCLUSAPI_CLUSTER_REG_DELETE_VALUE_EXFn?

public fun interface PCLUSAPI_CLUSTER_REG_ENUM_KEYFn {
    public operator fun invoke(hkey: System.Registry.HKEY, dwindex: UInt, lpszname: PWSTR, lpcchname: Long, lpftlastwritetime: Long): Int
}

public typealias PCLUSAPI_CLUSTER_REG_ENUM_KEY = PCLUSAPI_CLUSTER_REG_ENUM_KEYFn?

public fun interface PCLUSAPI_CLUSTER_REG_ENUM_VALUEFn {
    public operator fun invoke(hkey: System.Registry.HKEY, dwindex: UInt, lpszvaluename: PWSTR, lpcchvaluename: Long, lpdwtype: Long, lpdata: Long, lpcbdata: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_REG_ENUM_VALUE = PCLUSAPI_CLUSTER_REG_ENUM_VALUEFn?

public fun interface PCLUSAPI_CLUSTER_REG_GET_KEY_SECURITYFn {
    public operator fun invoke(hkey: System.Registry.HKEY, requestedinformation: UInt, psecuritydescriptor: Security.PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): Int
}

public typealias PCLUSAPI_CLUSTER_REG_GET_KEY_SECURITY = PCLUSAPI_CLUSTER_REG_GET_KEY_SECURITYFn?

public fun interface PCLUSAPI_CLUSTER_REG_OPEN_KEYFn {
    public operator fun invoke(hkey: System.Registry.HKEY, lpszsubkey: PCWSTR, samdesired: UInt, phkresult: Long): Int
}

public typealias PCLUSAPI_CLUSTER_REG_OPEN_KEY = PCLUSAPI_CLUSTER_REG_OPEN_KEYFn?

public fun interface PCLUSAPI_CLUSTER_REG_QUERY_INFO_KEYFn {
    public operator fun invoke(hkey: System.Registry.HKEY, lpcsubkeys: Long, lpcbmaxsubkeylen: Long, lpcvalues: Long, lpcbmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int
}

public typealias PCLUSAPI_CLUSTER_REG_QUERY_INFO_KEY = PCLUSAPI_CLUSTER_REG_QUERY_INFO_KEYFn?

public fun interface PCLUSAPI_CLUSTER_REG_QUERY_VALUEFn {
    public operator fun invoke(hkey: System.Registry.HKEY, lpszvaluename: PCWSTR, lpdwvaluetype: Long, lpdata: Long, lpcbdata: Long): Int
}

public typealias PCLUSAPI_CLUSTER_REG_QUERY_VALUE = PCLUSAPI_CLUSTER_REG_QUERY_VALUEFn?

public fun interface PCLUSAPI_CLUSTER_REG_SET_KEY_SECURITYFn {
    public operator fun invoke(hkey: System.Registry.HKEY, securityinformation: UInt, psecuritydescriptor: Security.PSECURITY_DESCRIPTOR): Int
}

public typealias PCLUSAPI_CLUSTER_REG_SET_KEY_SECURITY = PCLUSAPI_CLUSTER_REG_SET_KEY_SECURITYFn?

public fun interface PCLUSAPI_CLUSTER_REG_SET_KEY_SECURITY_EXFn {
    public operator fun invoke(hkey: System.Registry.HKEY, securityinformation: UInt, psecuritydescriptor: Security.PSECURITY_DESCRIPTOR, lpszreason: PCWSTR): Int
}

public typealias PCLUSAPI_CLUSTER_REG_SET_KEY_SECURITY_EX = PCLUSAPI_CLUSTER_REG_SET_KEY_SECURITY_EXFn?

public fun interface PCLUSAPI_CLUSTER_REG_SET_VALUEFn {
    public operator fun invoke(hkey: System.Registry.HKEY, lpszvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): UInt
}

public typealias PCLUSAPI_CLUSTER_REG_SET_VALUE = PCLUSAPI_CLUSTER_REG_SET_VALUEFn?

public fun interface PCLUSAPI_CLUSTER_REG_SET_VALUE_EXFn {
    public operator fun invoke(hkey: System.Registry.HKEY, lpszvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_REG_SET_VALUE_EX = PCLUSAPI_CLUSTER_REG_SET_VALUE_EXFn?

public fun interface PCLUSAPI_CLUSTER_REG_SYNC_DATABASEFn {
    public operator fun invoke(hcluster: HCLUSTER, flags: UInt): Int
}

public typealias PCLUSAPI_CLUSTER_REG_SYNC_DATABASE = PCLUSAPI_CLUSTER_REG_SYNC_DATABASEFn?

public fun interface PCLUSAPI_CLUSTER_REMOVE_AFFINITY_RULEFn {
    public operator fun invoke(hcluster: HCLUSTER, rulename: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_REMOVE_AFFINITY_RULE = PCLUSAPI_CLUSTER_REMOVE_AFFINITY_RULEFn?

public fun interface PCLUSAPI_CLUSTER_REMOVE_GROUP_FROM_AFFINITY_RULEFn {
    public operator fun invoke(hcluster: HCLUSTER, rulename: PCWSTR, hgroup: HGROUP): UInt
}

public typealias PCLUSAPI_CLUSTER_REMOVE_GROUP_FROM_AFFINITY_RULE = PCLUSAPI_CLUSTER_REMOVE_GROUP_FROM_AFFINITY_RULEFn?

public fun interface PCLUSAPI_CLUSTER_REMOVE_GROUP_FROM_GROUPSETFn {
    public operator fun invoke(hgroupset: HGROUPSET): UInt
}

public typealias PCLUSAPI_CLUSTER_REMOVE_GROUP_FROM_GROUPSET = PCLUSAPI_CLUSTER_REMOVE_GROUP_FROM_GROUPSETFn?

public fun interface PCLUSAPI_CLUSTER_REMOVE_GROUP_FROM_GROUPSET_EXFn {
    public operator fun invoke(hgroupset: HGROUPSET, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_REMOVE_GROUP_FROM_GROUPSET_EX = PCLUSAPI_CLUSTER_REMOVE_GROUP_FROM_GROUPSET_EXFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_CLOSE_ENUMFn {
    public operator fun invoke(hresenum: HRESENUM): UInt
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_CLOSE_ENUM = PCLUSAPI_CLUSTER_RESOURCE_CLOSE_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_CLOSE_ENUM_EXFn {
    public operator fun invoke(hresourceenumex: HRESENUMEX): UInt
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_CLOSE_ENUM_EX = PCLUSAPI_CLUSTER_RESOURCE_CLOSE_ENUM_EXFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_CONTROLFn {
    public operator fun invoke(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_CONTROL = PCLUSAPI_CLUSTER_RESOURCE_CONTROLFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_CONTROL_AS_USER_EXFn {
    public operator fun invoke(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_CONTROL_AS_USER_EX = PCLUSAPI_CLUSTER_RESOURCE_CONTROL_AS_USER_EXFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_CONTROL_EXFn {
    public operator fun invoke(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_CONTROL_EX = PCLUSAPI_CLUSTER_RESOURCE_CONTROL_EXFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_ENUMFn {
    public operator fun invoke(hresenum: HRESENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_ENUM = PCLUSAPI_CLUSTER_RESOURCE_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_ENUM_EXFn {
    public operator fun invoke(hresourceenumex: HRESENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_ENUM_EX = PCLUSAPI_CLUSTER_RESOURCE_ENUM_EXFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_GET_ENUM_COUNTFn {
    public operator fun invoke(hresenum: HRESENUM): UInt
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_GET_ENUM_COUNT = PCLUSAPI_CLUSTER_RESOURCE_GET_ENUM_COUNTFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_GET_ENUM_COUNT_EXFn {
    public operator fun invoke(hresourceenumex: HRESENUMEX): UInt
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_GET_ENUM_COUNT_EX = PCLUSAPI_CLUSTER_RESOURCE_GET_ENUM_COUNT_EXFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_OPEN_ENUMFn {
    public operator fun invoke(hresource: HRESOURCE, dwtype: UInt): HRESENUM
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_OPEN_ENUM = PCLUSAPI_CLUSTER_RESOURCE_OPEN_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_OPEN_ENUM_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszproperties: PCWSTR, cbproperties: UInt, lpszroproperties: PCWSTR, cbroproperties: UInt, dwflags: UInt): HRESENUMEX
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_OPEN_ENUM_EX = PCLUSAPI_CLUSTER_RESOURCE_OPEN_ENUM_EXFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_TYPE_CLOSE_ENUMFn {
    public operator fun invoke(hrestypeenum: HRESTYPEENUM): UInt
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_TYPE_CLOSE_ENUM = PCLUSAPI_CLUSTER_RESOURCE_TYPE_CLOSE_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_TYPE_CONTROLFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_TYPE_CONTROL = PCLUSAPI_CLUSTER_RESOURCE_TYPE_CONTROLFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_TYPE_CONTROL_AS_USER_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_TYPE_CONTROL_AS_USER_EX = PCLUSAPI_CLUSTER_RESOURCE_TYPE_CONTROL_AS_USER_EXFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_TYPE_CONTROL_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_TYPE_CONTROL_EX = PCLUSAPI_CLUSTER_RESOURCE_TYPE_CONTROL_EXFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_TYPE_ENUMFn {
    public operator fun invoke(hrestypeenum: HRESTYPEENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_TYPE_ENUM = PCLUSAPI_CLUSTER_RESOURCE_TYPE_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_TYPE_GET_ENUM_COUNTFn {
    public operator fun invoke(hrestypeenum: HRESTYPEENUM): UInt
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_TYPE_GET_ENUM_COUNT = PCLUSAPI_CLUSTER_RESOURCE_TYPE_GET_ENUM_COUNTFn?

public fun interface PCLUSAPI_CLUSTER_RESOURCE_TYPE_OPEN_ENUMFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, dwtype: UInt): HRESTYPEENUM
}

public typealias PCLUSAPI_CLUSTER_RESOURCE_TYPE_OPEN_ENUM = PCLUSAPI_CLUSTER_RESOURCE_TYPE_OPEN_ENUMFn?

public fun interface PCLUSAPI_CLUSTER_UPGRADEFn {
    public operator fun invoke(hcluster: HCLUSTER, perform: BOOL, pfnprogresscallback: PCLUSTER_UPGRADE_PROGRESS_CALLBACK, pvcallbackarg: Long): UInt
}

public typealias PCLUSAPI_CLUSTER_UPGRADE = PCLUSAPI_CLUSTER_UPGRADEFn?

public fun interface PCLUSAPI_CLUS_WORKER_CREATEFn {
    public operator fun invoke(lpworker: Long, lpstartaddress: PWORKER_START_ROUTINE, lpparameter: Long): UInt
}

public typealias PCLUSAPI_CLUS_WORKER_CREATE = PCLUSAPI_CLUS_WORKER_CREATEFn?

public fun interface PCLUSAPI_CLUS_WORKER_TERMINATEFn {
    public operator fun invoke(lpworker: Long)
}

public typealias PCLUSAPI_CLUS_WORKER_TERMINATE = PCLUSAPI_CLUS_WORKER_TERMINATEFn?

public fun interface PCLUSAPI_CREATE_CLUSTERFn {
    public operator fun invoke(pconfig: Long, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HCLUSTER
}

public typealias PCLUSAPI_CREATE_CLUSTER = PCLUSAPI_CREATE_CLUSTERFn?

public fun interface PCLUSAPI_CREATE_CLUSTER_AVAILABILITY_SETFn {
    public operator fun invoke(hcluster: HCLUSTER, lpavailabilitysetname: PCWSTR, pavailabilitysetconfig: Long): HGROUPSET
}

public typealias PCLUSAPI_CREATE_CLUSTER_AVAILABILITY_SET = PCLUSAPI_CREATE_CLUSTER_AVAILABILITY_SETFn?

public fun interface PCLUSAPI_CREATE_CLUSTER_CNOLESSFn {
    public operator fun invoke(pconfig: Long, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HCLUSTER
}

public typealias PCLUSAPI_CREATE_CLUSTER_CNOLESS = PCLUSAPI_CREATE_CLUSTER_CNOLESSFn?

public fun interface PCLUSAPI_CREATE_CLUSTER_GROUPFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszgroupname: PCWSTR): HGROUP
}

public typealias PCLUSAPI_CREATE_CLUSTER_GROUP = PCLUSAPI_CREATE_CLUSTER_GROUPFn?

public fun interface PCLUSAPI_CREATE_CLUSTER_GROUPEXFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszgroupname: PCWSTR, pgroupinfo: Long): HGROUP
}

public typealias PCLUSAPI_CREATE_CLUSTER_GROUPEX = PCLUSAPI_CREATE_CLUSTER_GROUPEXFn?

public fun interface PCLUSAPI_CREATE_CLUSTER_GROUP_GROUPSETFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszgroupsetname: PCWSTR): HGROUPSET
}

public typealias PCLUSAPI_CREATE_CLUSTER_GROUP_GROUPSET = PCLUSAPI_CREATE_CLUSTER_GROUP_GROUPSETFn?

public fun interface PCLUSAPI_CREATE_CLUSTER_NAME_ACCOUNTFn {
    public operator fun invoke(hcluster: HCLUSTER, pconfig: Long, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): UInt
}

public typealias PCLUSAPI_CREATE_CLUSTER_NAME_ACCOUNT = PCLUSAPI_CREATE_CLUSTER_NAME_ACCOUNTFn?

public fun interface PCLUSAPI_CREATE_CLUSTER_NOTIFY_PORTFn {
    public operator fun invoke(hchange: HCHANGE, hcluster: HCLUSTER, dwfilter: UInt, dwnotifykey: ULong): HCHANGE
}

public typealias PCLUSAPI_CREATE_CLUSTER_NOTIFY_PORT = PCLUSAPI_CREATE_CLUSTER_NOTIFY_PORTFn?

public fun interface PCLUSAPI_CREATE_CLUSTER_NOTIFY_PORT_V2Fn {
    public operator fun invoke(hchange: HCHANGE, hcluster: HCLUSTER, filters: Long, dwfiltercount: UInt, dwnotifykey: ULong): HCHANGE
}

public typealias PCLUSAPI_CREATE_CLUSTER_NOTIFY_PORT_V2 = PCLUSAPI_CREATE_CLUSTER_NOTIFY_PORT_V2Fn?

public fun interface PCLUSAPI_CREATE_CLUSTER_RESOURCEFn {
    public operator fun invoke(hgroup: HGROUP, lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwflags: UInt): HRESOURCE
}

public typealias PCLUSAPI_CREATE_CLUSTER_RESOURCE = PCLUSAPI_CREATE_CLUSTER_RESOURCEFn?

public fun interface PCLUSAPI_CREATE_CLUSTER_RESOURCE_EXFn {
    public operator fun invoke(hgroup: HGROUP, lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwflags: UInt, lpszreason: PCWSTR): HRESOURCE
}

public typealias PCLUSAPI_CREATE_CLUSTER_RESOURCE_EX = PCLUSAPI_CREATE_CLUSTER_RESOURCE_EXFn?

public fun interface PCLUSAPI_CREATE_CLUSTER_RESOURCE_TYPEFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, lpszdisplayname: PCWSTR, lpszresourcetypedll: PCWSTR, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt): UInt
}

public typealias PCLUSAPI_CREATE_CLUSTER_RESOURCE_TYPE = PCLUSAPI_CREATE_CLUSTER_RESOURCE_TYPEFn?

public fun interface PCLUSAPI_CREATE_CLUSTER_RESOURCE_TYPE_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, lpszdisplayname: PCWSTR, lpszresourcetypedll: PCWSTR, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_CREATE_CLUSTER_RESOURCE_TYPE_EX = PCLUSAPI_CREATE_CLUSTER_RESOURCE_TYPE_EXFn?

public fun interface PCLUSAPI_DELETE_CLUSTER_GROUPFn {
    public operator fun invoke(hgroup: HGROUP): UInt
}

public typealias PCLUSAPI_DELETE_CLUSTER_GROUP = PCLUSAPI_DELETE_CLUSTER_GROUPFn?

public fun interface PCLUSAPI_DELETE_CLUSTER_GROUP_EXFn {
    public operator fun invoke(hgroup: HGROUP, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_DELETE_CLUSTER_GROUP_EX = PCLUSAPI_DELETE_CLUSTER_GROUP_EXFn?

public fun interface PCLUSAPI_DELETE_CLUSTER_GROUP_GROUPSETFn {
    public operator fun invoke(hgroupset: HGROUPSET): UInt
}

public typealias PCLUSAPI_DELETE_CLUSTER_GROUP_GROUPSET = PCLUSAPI_DELETE_CLUSTER_GROUP_GROUPSETFn?

public fun interface PCLUSAPI_DELETE_CLUSTER_GROUP_GROUPSET_EXFn {
    public operator fun invoke(hgroupset: HGROUPSET, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_DELETE_CLUSTER_GROUP_GROUPSET_EX = PCLUSAPI_DELETE_CLUSTER_GROUP_GROUPSET_EXFn?

public fun interface PCLUSAPI_DELETE_CLUSTER_RESOURCEFn {
    public operator fun invoke(hresource: HRESOURCE): UInt
}

public typealias PCLUSAPI_DELETE_CLUSTER_RESOURCE = PCLUSAPI_DELETE_CLUSTER_RESOURCEFn?

public fun interface PCLUSAPI_DELETE_CLUSTER_RESOURCE_EXFn {
    public operator fun invoke(hresource: HRESOURCE, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_DELETE_CLUSTER_RESOURCE_EX = PCLUSAPI_DELETE_CLUSTER_RESOURCE_EXFn?

public fun interface PCLUSAPI_DELETE_CLUSTER_RESOURCE_TYPEFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR): UInt
}

public typealias PCLUSAPI_DELETE_CLUSTER_RESOURCE_TYPE = PCLUSAPI_DELETE_CLUSTER_RESOURCE_TYPEFn?

public fun interface PCLUSAPI_DELETE_CLUSTER_RESOURCE_TYPE_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, lpsztypename: PCWSTR, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_DELETE_CLUSTER_RESOURCE_TYPE_EX = PCLUSAPI_DELETE_CLUSTER_RESOURCE_TYPE_EXFn?

public fun interface PCLUSAPI_DESTROY_CLUSTERFn {
    public operator fun invoke(hcluster: HCLUSTER, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long, fdeletevirtualcomputerobjects: BOOL): UInt
}

public typealias PCLUSAPI_DESTROY_CLUSTER = PCLUSAPI_DESTROY_CLUSTERFn?

public fun interface PCLUSAPI_DESTROY_CLUSTER_GROUPFn {
    public operator fun invoke(hgroup: HGROUP): UInt
}

public typealias PCLUSAPI_DESTROY_CLUSTER_GROUP = PCLUSAPI_DESTROY_CLUSTER_GROUPFn?

public fun interface PCLUSAPI_DESTROY_CLUSTER_GROUP_EXFn {
    public operator fun invoke(hgroup: HGROUP, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_DESTROY_CLUSTER_GROUP_EX = PCLUSAPI_DESTROY_CLUSTER_GROUP_EXFn?

public fun interface PCLUSAPI_EVICT_CLUSTER_NODEFn {
    public operator fun invoke(hnode: HNODE): UInt
}

public typealias PCLUSAPI_EVICT_CLUSTER_NODE = PCLUSAPI_EVICT_CLUSTER_NODEFn?

public fun interface PCLUSAPI_EVICT_CLUSTER_NODE_EXFn {
    public operator fun invoke(hnode: HNODE, dwtimeout: UInt, phrcleanupstatus: Long): UInt
}

public typealias PCLUSAPI_EVICT_CLUSTER_NODE_EX = PCLUSAPI_EVICT_CLUSTER_NODE_EXFn?

public fun interface PCLUSAPI_EVICT_CLUSTER_NODE_EX2Fn {
    public operator fun invoke(hnode: HNODE, dwtimeout: UInt, phrcleanupstatus: Long, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_EVICT_CLUSTER_NODE_EX2 = PCLUSAPI_EVICT_CLUSTER_NODE_EX2Fn?

public fun interface PCLUSAPI_FAIL_CLUSTER_RESOURCEFn {
    public operator fun invoke(hresource: HRESOURCE): UInt
}

public typealias PCLUSAPI_FAIL_CLUSTER_RESOURCE = PCLUSAPI_FAIL_CLUSTER_RESOURCEFn?

public fun interface PCLUSAPI_FAIL_CLUSTER_RESOURCE_EXFn {
    public operator fun invoke(hresource: HRESOURCE, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_FAIL_CLUSTER_RESOURCE_EX = PCLUSAPI_FAIL_CLUSTER_RESOURCE_EXFn?

public fun interface PCLUSAPI_GET_CLUSTER_FROM_GROUPFn {
    public operator fun invoke(hgroup: HGROUP): HCLUSTER
}

public typealias PCLUSAPI_GET_CLUSTER_FROM_GROUP = PCLUSAPI_GET_CLUSTER_FROM_GROUPFn?

public fun interface PCLUSAPI_GET_CLUSTER_FROM_GROUP_GROUPSETFn {
    public operator fun invoke(hgroupset: HGROUPSET): HCLUSTER
}

public typealias PCLUSAPI_GET_CLUSTER_FROM_GROUP_GROUPSET = PCLUSAPI_GET_CLUSTER_FROM_GROUP_GROUPSETFn?

public fun interface PCLUSAPI_GET_CLUSTER_FROM_NETWORKFn {
    public operator fun invoke(hnetwork: HNETWORK): HCLUSTER
}

public typealias PCLUSAPI_GET_CLUSTER_FROM_NETWORK = PCLUSAPI_GET_CLUSTER_FROM_NETWORKFn?

public fun interface PCLUSAPI_GET_CLUSTER_FROM_NET_INTERFACEFn {
    public operator fun invoke(hnetinterface: HNETINTERFACE): HCLUSTER
}

public typealias PCLUSAPI_GET_CLUSTER_FROM_NET_INTERFACE = PCLUSAPI_GET_CLUSTER_FROM_NET_INTERFACEFn?

public fun interface PCLUSAPI_GET_CLUSTER_FROM_NODEFn {
    public operator fun invoke(hnode: HNODE): HCLUSTER
}

public typealias PCLUSAPI_GET_CLUSTER_FROM_NODE = PCLUSAPI_GET_CLUSTER_FROM_NODEFn?

public fun interface PCLUSAPI_GET_CLUSTER_FROM_RESOURCEFn {
    public operator fun invoke(hresource: HRESOURCE): HCLUSTER
}

public typealias PCLUSAPI_GET_CLUSTER_FROM_RESOURCE = PCLUSAPI_GET_CLUSTER_FROM_RESOURCEFn?

public fun interface PCLUSAPI_GET_CLUSTER_GROUP_KEYFn {
    public operator fun invoke(hgroup: HGROUP, samdesired: UInt): System.Registry.HKEY
}

public typealias PCLUSAPI_GET_CLUSTER_GROUP_KEY = PCLUSAPI_GET_CLUSTER_GROUP_KEYFn?

public fun interface PCLUSAPI_GET_CLUSTER_GROUP_STATEFn {
    public operator fun invoke(hgroup: HGROUP, lpsznodename: PWSTR, lpcchnodename: Long): CLUSTER_GROUP_STATE
}

public typealias PCLUSAPI_GET_CLUSTER_GROUP_STATE = PCLUSAPI_GET_CLUSTER_GROUP_STATEFn?

public fun interface PCLUSAPI_GET_CLUSTER_INFORMATIONFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszclustername: PWSTR, lpcchclustername: Long, lpclusterinfo: Long): UInt
}

public typealias PCLUSAPI_GET_CLUSTER_INFORMATION = PCLUSAPI_GET_CLUSTER_INFORMATIONFn?

public fun interface PCLUSAPI_GET_CLUSTER_KEYFn {
    public operator fun invoke(hcluster: HCLUSTER, samdesired: UInt): System.Registry.HKEY
}

public typealias PCLUSAPI_GET_CLUSTER_KEY = PCLUSAPI_GET_CLUSTER_KEYFn?

public fun interface PCLUSAPI_GET_CLUSTER_NETWORK_IDFn {
    public operator fun invoke(hnetwork: HNETWORK, lpsznetworkid: PWSTR, lpcchname: Long): UInt
}

public typealias PCLUSAPI_GET_CLUSTER_NETWORK_ID = PCLUSAPI_GET_CLUSTER_NETWORK_IDFn?

public fun interface PCLUSAPI_GET_CLUSTER_NETWORK_KEYFn {
    public operator fun invoke(hnetwork: HNETWORK, samdesired: UInt): System.Registry.HKEY
}

public typealias PCLUSAPI_GET_CLUSTER_NETWORK_KEY = PCLUSAPI_GET_CLUSTER_NETWORK_KEYFn?

public fun interface PCLUSAPI_GET_CLUSTER_NETWORK_STATEFn {
    public operator fun invoke(hnetwork: HNETWORK): CLUSTER_NETWORK_STATE
}

public typealias PCLUSAPI_GET_CLUSTER_NETWORK_STATE = PCLUSAPI_GET_CLUSTER_NETWORK_STATEFn?

public fun interface PCLUSAPI_GET_CLUSTER_NET_INTERFACEFn {
    public operator fun invoke(hcluster: HCLUSTER, lpsznodename: PCWSTR, lpsznetworkname: PCWSTR, lpszinterfacename: PWSTR, lpcchinterfacename: Long): UInt
}

public typealias PCLUSAPI_GET_CLUSTER_NET_INTERFACE = PCLUSAPI_GET_CLUSTER_NET_INTERFACEFn?

public fun interface PCLUSAPI_GET_CLUSTER_NET_INTERFACE_KEYFn {
    public operator fun invoke(hnetinterface: HNETINTERFACE, samdesired: UInt): System.Registry.HKEY
}

public typealias PCLUSAPI_GET_CLUSTER_NET_INTERFACE_KEY = PCLUSAPI_GET_CLUSTER_NET_INTERFACE_KEYFn?

public fun interface PCLUSAPI_GET_CLUSTER_NET_INTERFACE_STATEFn {
    public operator fun invoke(hnetinterface: HNETINTERFACE): CLUSTER_NETINTERFACE_STATE
}

public typealias PCLUSAPI_GET_CLUSTER_NET_INTERFACE_STATE = PCLUSAPI_GET_CLUSTER_NET_INTERFACE_STATEFn?

public fun interface PCLUSAPI_GET_CLUSTER_NODE_IDFn {
    public operator fun invoke(hnode: HNODE, lpsznodeid: PWSTR, lpcchname: Long): UInt
}

public typealias PCLUSAPI_GET_CLUSTER_NODE_ID = PCLUSAPI_GET_CLUSTER_NODE_IDFn?

public fun interface PCLUSAPI_GET_CLUSTER_NODE_KEYFn {
    public operator fun invoke(hnode: HNODE, samdesired: UInt): System.Registry.HKEY
}

public typealias PCLUSAPI_GET_CLUSTER_NODE_KEY = PCLUSAPI_GET_CLUSTER_NODE_KEYFn?

public fun interface PCLUSAPI_GET_CLUSTER_NODE_STATEFn {
    public operator fun invoke(hnode: HNODE): CLUSTER_NODE_STATE
}

public typealias PCLUSAPI_GET_CLUSTER_NODE_STATE = PCLUSAPI_GET_CLUSTER_NODE_STATEFn?

public fun interface PCLUSAPI_GET_CLUSTER_NOTIFYFn {
    public operator fun invoke(hchange: HCHANGE, lpdwnotifykey: Long, lpdwfiltertype: Long, lpszname: PWSTR, lpcchname: Long, dwmilliseconds: UInt): UInt
}

public typealias PCLUSAPI_GET_CLUSTER_NOTIFY = PCLUSAPI_GET_CLUSTER_NOTIFYFn?

public fun interface PCLUSAPI_GET_CLUSTER_NOTIFY_V2Fn {
    public operator fun invoke(hchange: HCHANGE, lpdwnotifykey: Long, pfilterandtype: Long, buffer: Long, lpcchbuffersize: Long, lpszobjectid: PWSTR, lpcchobjectid: Long, lpszparentid: PWSTR, lpcchparentid: Long, lpszname: PWSTR, lpcchname: Long, lpsztype: PWSTR, lpcchtype: Long, dwmilliseconds: UInt): UInt
}

public typealias PCLUSAPI_GET_CLUSTER_NOTIFY_V2 = PCLUSAPI_GET_CLUSTER_NOTIFY_V2Fn?

public fun interface PCLUSAPI_GET_CLUSTER_QUORUM_RESOURCEFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszresourcename: PWSTR, lpcchresourcename: Long, lpszdevicename: PWSTR, lpcchdevicename: Long, lpdwmaxquorumlogsize: Long): UInt
}

public typealias PCLUSAPI_GET_CLUSTER_QUORUM_RESOURCE = PCLUSAPI_GET_CLUSTER_QUORUM_RESOURCEFn?

public fun interface PCLUSAPI_GET_CLUSTER_RESOURCE_DEPENDENCY_EXPRESSIONFn {
    public operator fun invoke(hresource: HRESOURCE, lpszdependencyexpression: PWSTR, lpcchdependencyexpression: Long): UInt
}

public typealias PCLUSAPI_GET_CLUSTER_RESOURCE_DEPENDENCY_EXPRESSION = PCLUSAPI_GET_CLUSTER_RESOURCE_DEPENDENCY_EXPRESSIONFn?

public fun interface PCLUSAPI_GET_CLUSTER_RESOURCE_KEYFn {
    public operator fun invoke(hresource: HRESOURCE, samdesired: UInt): System.Registry.HKEY
}

public typealias PCLUSAPI_GET_CLUSTER_RESOURCE_KEY = PCLUSAPI_GET_CLUSTER_RESOURCE_KEYFn?

public fun interface PCLUSAPI_GET_CLUSTER_RESOURCE_NETWORK_NAMEFn {
    public operator fun invoke(hresource: HRESOURCE, lpbuffer: PWSTR, nsize: Long): BOOL
}

public typealias PCLUSAPI_GET_CLUSTER_RESOURCE_NETWORK_NAME = PCLUSAPI_GET_CLUSTER_RESOURCE_NETWORK_NAMEFn?

public fun interface PCLUSAPI_GET_CLUSTER_RESOURCE_STATEFn {
    public operator fun invoke(hresource: HRESOURCE, lpsznodename: PWSTR, lpcchnodename: Long, lpszgroupname: PWSTR, lpcchgroupname: Long): CLUSTER_RESOURCE_STATE
}

public typealias PCLUSAPI_GET_CLUSTER_RESOURCE_STATE = PCLUSAPI_GET_CLUSTER_RESOURCE_STATEFn?

public fun interface PCLUSAPI_GET_CLUSTER_RESOURCE_TYPE_KEYFn {
    public operator fun invoke(hcluster: HCLUSTER, lpsztypename: PCWSTR, samdesired: UInt): System.Registry.HKEY
}

public typealias PCLUSAPI_GET_CLUSTER_RESOURCE_TYPE_KEY = PCLUSAPI_GET_CLUSTER_RESOURCE_TYPE_KEYFn?

public fun interface PCLUSAPI_GET_NODE_CLUSTER_STATEFn {
    public operator fun invoke(lpsznodename: PCWSTR, pdwclusterstate: Long): UInt
}

public typealias PCLUSAPI_GET_NODE_CLUSTER_STATE = PCLUSAPI_GET_NODE_CLUSTER_STATEFn?

public fun interface PCLUSAPI_GET_NOTIFY_EVENT_HANDLE_V2Fn {
    public operator fun invoke(hchange: HCHANGE, lphtargetevent: Long): UInt
}

public typealias PCLUSAPI_GET_NOTIFY_EVENT_HANDLE_V2 = PCLUSAPI_GET_NOTIFY_EVENT_HANDLE_V2Fn?

public fun interface PCLUSAPI_IS_FILE_ON_CLUSTER_SHARED_VOLUMEFn {
    public operator fun invoke(lpszpathname: PCWSTR, pbfileisonsharedvolume: Long): UInt
}

public typealias PCLUSAPI_IS_FILE_ON_CLUSTER_SHARED_VOLUME = PCLUSAPI_IS_FILE_ON_CLUSTER_SHARED_VOLUMEFn?

public fun interface PCLUSAPI_MOVE_CLUSTER_GROUPFn {
    public operator fun invoke(hgroup: HGROUP, hdestinationnode: HNODE): UInt
}

public typealias PCLUSAPI_MOVE_CLUSTER_GROUP = PCLUSAPI_MOVE_CLUSTER_GROUPFn?

public fun interface PCLUSAPI_OFFLINE_CLUSTER_GROUPFn {
    public operator fun invoke(hgroup: HGROUP): UInt
}

public typealias PCLUSAPI_OFFLINE_CLUSTER_GROUP = PCLUSAPI_OFFLINE_CLUSTER_GROUPFn?

public fun interface PCLUSAPI_OFFLINE_CLUSTER_RESOURCEFn {
    public operator fun invoke(hresource: HRESOURCE): UInt
}

public typealias PCLUSAPI_OFFLINE_CLUSTER_RESOURCE = PCLUSAPI_OFFLINE_CLUSTER_RESOURCEFn?

public fun interface PCLUSAPI_ONLINE_CLUSTER_GROUPFn {
    public operator fun invoke(hgroup: HGROUP, hdestinationnode: HNODE): UInt
}

public typealias PCLUSAPI_ONLINE_CLUSTER_GROUP = PCLUSAPI_ONLINE_CLUSTER_GROUPFn?

public fun interface PCLUSAPI_ONLINE_CLUSTER_RESOURCEFn {
    public operator fun invoke(hresource: HRESOURCE): UInt
}

public typealias PCLUSAPI_ONLINE_CLUSTER_RESOURCE = PCLUSAPI_ONLINE_CLUSTER_RESOURCEFn?

public fun interface PCLUSAPI_OPEN_CLUSTERFn {
    public operator fun invoke(lpszclustername: PCWSTR): HCLUSTER
}

public typealias PCLUSAPI_OPEN_CLUSTER = PCLUSAPI_OPEN_CLUSTERFn?

public fun interface PCLUSAPI_OPEN_CLUSTER_EXFn {
    public operator fun invoke(lpszclustername: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HCLUSTER
}

public typealias PCLUSAPI_OPEN_CLUSTER_EX = PCLUSAPI_OPEN_CLUSTER_EXFn?

public fun interface PCLUSAPI_OPEN_CLUSTER_GROUPFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszgroupname: PCWSTR): HGROUP
}

public typealias PCLUSAPI_OPEN_CLUSTER_GROUP = PCLUSAPI_OPEN_CLUSTER_GROUPFn?

public fun interface PCLUSAPI_OPEN_CLUSTER_GROUP_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszgroupname: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HGROUP
}

public typealias PCLUSAPI_OPEN_CLUSTER_GROUP_EX = PCLUSAPI_OPEN_CLUSTER_GROUP_EXFn?

public fun interface PCLUSAPI_OPEN_CLUSTER_GROUP_GROUPSETFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszgroupsetname: PCWSTR): HGROUPSET
}

public typealias PCLUSAPI_OPEN_CLUSTER_GROUP_GROUPSET = PCLUSAPI_OPEN_CLUSTER_GROUP_GROUPSETFn?

public fun interface PCLUSAPI_OPEN_CLUSTER_NETINTERFACE_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, lpsznetinterfacename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNETINTERFACE
}

public typealias PCLUSAPI_OPEN_CLUSTER_NETINTERFACE_EX = PCLUSAPI_OPEN_CLUSTER_NETINTERFACE_EXFn?

public fun interface PCLUSAPI_OPEN_CLUSTER_NETWORKFn {
    public operator fun invoke(hcluster: HCLUSTER, lpsznetworkname: PCWSTR): HNETWORK
}

public typealias PCLUSAPI_OPEN_CLUSTER_NETWORK = PCLUSAPI_OPEN_CLUSTER_NETWORKFn?

public fun interface PCLUSAPI_OPEN_CLUSTER_NETWORK_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, lpsznetworkname: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNETWORK
}

public typealias PCLUSAPI_OPEN_CLUSTER_NETWORK_EX = PCLUSAPI_OPEN_CLUSTER_NETWORK_EXFn?

public fun interface PCLUSAPI_OPEN_CLUSTER_NET_INTERFACEFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszinterfacename: PCWSTR): HNETINTERFACE
}

public typealias PCLUSAPI_OPEN_CLUSTER_NET_INTERFACE = PCLUSAPI_OPEN_CLUSTER_NET_INTERFACEFn?

public fun interface PCLUSAPI_OPEN_CLUSTER_NODEFn {
    public operator fun invoke(hcluster: HCLUSTER, lpsznodename: PCWSTR): HNODE
}

public typealias PCLUSAPI_OPEN_CLUSTER_NODE = PCLUSAPI_OPEN_CLUSTER_NODEFn?

public fun interface PCLUSAPI_OPEN_CLUSTER_NODE_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, lpsznodename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNODE
}

public typealias PCLUSAPI_OPEN_CLUSTER_NODE_EX = PCLUSAPI_OPEN_CLUSTER_NODE_EXFn?

public fun interface PCLUSAPI_OPEN_CLUSTER_RESOURCEFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszresourcename: PCWSTR): HRESOURCE
}

public typealias PCLUSAPI_OPEN_CLUSTER_RESOURCE = PCLUSAPI_OPEN_CLUSTER_RESOURCEFn?

public fun interface PCLUSAPI_OPEN_CLUSTER_RESOURCE_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, lpszresourcename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HRESOURCE
}

public typealias PCLUSAPI_OPEN_CLUSTER_RESOURCE_EX = PCLUSAPI_OPEN_CLUSTER_RESOURCE_EXFn?

public fun interface PCLUSAPI_OPEN_NODE_BY_IDFn {
    public operator fun invoke(hcluster: HCLUSTER, nodeid: UInt): HNODE
}

public typealias PCLUSAPI_OPEN_NODE_BY_ID = PCLUSAPI_OPEN_NODE_BY_IDFn?

public fun interface PCLUSAPI_PAUSE_CLUSTER_NODEFn {
    public operator fun invoke(hnode: HNODE): UInt
}

public typealias PCLUSAPI_PAUSE_CLUSTER_NODE = PCLUSAPI_PAUSE_CLUSTER_NODEFn?

public fun interface PCLUSAPI_PAUSE_CLUSTER_NODE_EXFn {
    public operator fun invoke(hnode: HNODE, bdrainnode: BOOL, dwpauseflags: UInt, hnodedraintarget: HNODE): UInt
}

public typealias PCLUSAPI_PAUSE_CLUSTER_NODE_EX = PCLUSAPI_PAUSE_CLUSTER_NODE_EXFn?

public fun interface PCLUSAPI_PAUSE_CLUSTER_NODE_EX2Fn {
    public operator fun invoke(hnode: HNODE, bdrainnode: BOOL, dwpauseflags: UInt, hnodedraintarget: HNODE, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_PAUSE_CLUSTER_NODE_EX2 = PCLUSAPI_PAUSE_CLUSTER_NODE_EX2Fn?

public fun interface PCLUSAPI_PFN_REASON_HANDLERFn {
    public operator fun invoke(lpparameter: Long, hcluster: HCLUSTER, szreason: PWSTR, lpsize: Long): BOOL
}

public typealias PCLUSAPI_PFN_REASON_HANDLER = PCLUSAPI_PFN_REASON_HANDLERFn?

public fun interface PCLUSAPI_REGISTER_CLUSTER_NOTIFYFn {
    public operator fun invoke(hchange: HCHANGE, dwfiltertype: UInt, hobject: Foundation.HANDLE, dwnotifykey: ULong): UInt
}

public typealias PCLUSAPI_REGISTER_CLUSTER_NOTIFY = PCLUSAPI_REGISTER_CLUSTER_NOTIFYFn?

public fun interface PCLUSAPI_REGISTER_CLUSTER_NOTIFY_V2Fn {
    public operator fun invoke(hchange: HCHANGE, filter: NOTIFY_FILTER_AND_TYPE, hobject: Foundation.HANDLE, dwnotifykey: ULong): UInt
}

public typealias PCLUSAPI_REGISTER_CLUSTER_NOTIFY_V2 = PCLUSAPI_REGISTER_CLUSTER_NOTIFY_V2Fn?

public fun interface PCLUSAPI_REMOVE_CLUSTER_GROUP_DEPENDENCYFn {
    public operator fun invoke(hgroup: HGROUP, hdependson: HGROUP): UInt
}

public typealias PCLUSAPI_REMOVE_CLUSTER_GROUP_DEPENDENCY = PCLUSAPI_REMOVE_CLUSTER_GROUP_DEPENDENCYFn?

public fun interface PCLUSAPI_REMOVE_CLUSTER_GROUP_DEPENDENCY_EXFn {
    public operator fun invoke(hgroup: HGROUP, hdependson: HGROUP, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_REMOVE_CLUSTER_GROUP_DEPENDENCY_EX = PCLUSAPI_REMOVE_CLUSTER_GROUP_DEPENDENCY_EXFn?

public fun interface PCLUSAPI_REMOVE_CLUSTER_GROUP_GROUPSET_DEPENDENCYFn {
    public operator fun invoke(hgroupset: HGROUPSET, hdependson: HGROUPSET): UInt
}

public typealias PCLUSAPI_REMOVE_CLUSTER_GROUP_GROUPSET_DEPENDENCY = PCLUSAPI_REMOVE_CLUSTER_GROUP_GROUPSET_DEPENDENCYFn?

public fun interface PCLUSAPI_REMOVE_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EXFn {
    public operator fun invoke(hgroupset: HGROUPSET, hdependson: HGROUPSET, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_REMOVE_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EX = PCLUSAPI_REMOVE_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EXFn?

public fun interface PCLUSAPI_REMOVE_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCYFn {
    public operator fun invoke(hgroup: HGROUP, hdependson: HGROUPSET): UInt
}

public typealias PCLUSAPI_REMOVE_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCY = PCLUSAPI_REMOVE_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCYFn?

public fun interface PCLUSAPI_REMOVE_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCY_EXFn {
    public operator fun invoke(hgroup: HGROUP, hdependson: HGROUPSET, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_REMOVE_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCY_EX = PCLUSAPI_REMOVE_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCY_EXFn?

public fun interface PCLUSAPI_REMOVE_CLUSTER_NAME_ACCOUNTFn {
    public operator fun invoke(hcluster: HCLUSTER): UInt
}

public typealias PCLUSAPI_REMOVE_CLUSTER_NAME_ACCOUNT = PCLUSAPI_REMOVE_CLUSTER_NAME_ACCOUNTFn?

public fun interface PCLUSAPI_REMOVE_CLUSTER_RESOURCE_DEPENDENCYFn {
    public operator fun invoke(hresource: HRESOURCE, hdependson: HRESOURCE): UInt
}

public typealias PCLUSAPI_REMOVE_CLUSTER_RESOURCE_DEPENDENCY = PCLUSAPI_REMOVE_CLUSTER_RESOURCE_DEPENDENCYFn?

public fun interface PCLUSAPI_REMOVE_CLUSTER_RESOURCE_DEPENDENCY_EXFn {
    public operator fun invoke(hresource: HRESOURCE, hdependson: HRESOURCE, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_REMOVE_CLUSTER_RESOURCE_DEPENDENCY_EX = PCLUSAPI_REMOVE_CLUSTER_RESOURCE_DEPENDENCY_EXFn?

public fun interface PCLUSAPI_REMOVE_CLUSTER_RESOURCE_NODEFn {
    public operator fun invoke(hresource: HRESOURCE, hnode: HNODE): UInt
}

public typealias PCLUSAPI_REMOVE_CLUSTER_RESOURCE_NODE = PCLUSAPI_REMOVE_CLUSTER_RESOURCE_NODEFn?

public fun interface PCLUSAPI_REMOVE_CLUSTER_RESOURCE_NODE_EXFn {
    public operator fun invoke(hresource: HRESOURCE, hnode: HNODE, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_REMOVE_CLUSTER_RESOURCE_NODE_EX = PCLUSAPI_REMOVE_CLUSTER_RESOURCE_NODE_EXFn?

public fun interface PCLUSAPI_REMOVE_CROSS_CLUSTER_GROUPSET_DEPENDENCYFn {
    public operator fun invoke(hdependentgroupset: HGROUPSET, lpremoteclustername: PCWSTR, lpremotegroupsetname: PCWSTR): UInt
}

public typealias PCLUSAPI_REMOVE_CROSS_CLUSTER_GROUPSET_DEPENDENCY = PCLUSAPI_REMOVE_CROSS_CLUSTER_GROUPSET_DEPENDENCYFn?

public fun interface PCLUSAPI_REMOVE_RESOURCE_FROM_CLUSTER_SHARED_VOLUMESFn {
    public operator fun invoke(hresource: HRESOURCE): UInt
}

public typealias PCLUSAPI_REMOVE_RESOURCE_FROM_CLUSTER_SHARED_VOLUMES = PCLUSAPI_REMOVE_RESOURCE_FROM_CLUSTER_SHARED_VOLUMESFn?

public fun interface PCLUSAPI_RESTART_CLUSTER_RESOURCEFn {
    public operator fun invoke(hresource: HRESOURCE, dwflags: UInt): UInt
}

public typealias PCLUSAPI_RESTART_CLUSTER_RESOURCE = PCLUSAPI_RESTART_CLUSTER_RESOURCEFn?

public fun interface PCLUSAPI_RESTART_CLUSTER_RESOURCE_EXFn {
    public operator fun invoke(hresource: HRESOURCE, dwflags: UInt): UInt
}

public typealias PCLUSAPI_RESTART_CLUSTER_RESOURCE_EX = PCLUSAPI_RESTART_CLUSTER_RESOURCE_EXFn?

public fun interface PCLUSAPI_RESTORE_CLUSTER_DATABASEFn {
    public operator fun invoke(lpszpathname: PCWSTR, bforce: BOOL, lpszquorumdriveletter: PCWSTR): UInt
}

public typealias PCLUSAPI_RESTORE_CLUSTER_DATABASE = PCLUSAPI_RESTORE_CLUSTER_DATABASEFn?

public fun interface PCLUSAPI_RESUME_CLUSTER_NODEFn {
    public operator fun invoke(hnode: HNODE): UInt
}

public typealias PCLUSAPI_RESUME_CLUSTER_NODE = PCLUSAPI_RESUME_CLUSTER_NODEFn?

public fun interface PCLUSAPI_RESUME_CLUSTER_NODE_EXFn {
    public operator fun invoke(hnode: HNODE, eresumefailbacktype: CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved: UInt): UInt
}

public typealias PCLUSAPI_RESUME_CLUSTER_NODE_EX = PCLUSAPI_RESUME_CLUSTER_NODE_EXFn?

public fun interface PCLUSAPI_RESUME_CLUSTER_NODE_EX2Fn {
    public operator fun invoke(hnode: HNODE, eresumefailbacktype: CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved: UInt, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_RESUME_CLUSTER_NODE_EX2 = PCLUSAPI_RESUME_CLUSTER_NODE_EX2Fn?

public fun interface PCLUSAPI_SET_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EXPRESSIONFn {
    public operator fun invoke(hgroupset: HGROUPSET, lpszdependencyexpression: PCWSTR): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EXPRESSION = PCLUSAPI_SET_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EXPRESSIONFn?

public fun interface PCLUSAPI_SET_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EXPRESSION_EXFn {
    public operator fun invoke(hgroupset: HGROUPSET, lpszdependencyexpression: PCWSTR, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EXPRESSION_EX = PCLUSAPI_SET_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EXPRESSION_EXFn?

public fun interface PCLUSAPI_SET_CLUSTER_GROUP_NAMEFn {
    public operator fun invoke(hgroup: HGROUP, lpszgroupname: PCWSTR): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_GROUP_NAME = PCLUSAPI_SET_CLUSTER_GROUP_NAMEFn?

public fun interface PCLUSAPI_SET_CLUSTER_GROUP_NAME_EXFn {
    public operator fun invoke(hgroup: HGROUP, lpszgroupname: PCWSTR, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_GROUP_NAME_EX = PCLUSAPI_SET_CLUSTER_GROUP_NAME_EXFn?

public fun interface PCLUSAPI_SET_CLUSTER_GROUP_NODE_LISTFn {
    public operator fun invoke(hgroup: HGROUP, nodecount: UInt, nodelist: Long): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_GROUP_NODE_LIST = PCLUSAPI_SET_CLUSTER_GROUP_NODE_LISTFn?

public fun interface PCLUSAPI_SET_CLUSTER_GROUP_NODE_LIST_EXFn {
    public operator fun invoke(hgroup: HGROUP, nodecount: UInt, nodelist: Long, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_GROUP_NODE_LIST_EX = PCLUSAPI_SET_CLUSTER_GROUP_NODE_LIST_EXFn?

public fun interface PCLUSAPI_SET_CLUSTER_NAME_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, lpsznewclustername: PCWSTR, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_NAME_EX = PCLUSAPI_SET_CLUSTER_NAME_EXFn?

public fun interface PCLUSAPI_SET_CLUSTER_NETWORK_NAMEFn {
    public operator fun invoke(hnetwork: HNETWORK, lpszname: PCWSTR): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_NETWORK_NAME = PCLUSAPI_SET_CLUSTER_NETWORK_NAMEFn?

public fun interface PCLUSAPI_SET_CLUSTER_NETWORK_NAME_EXFn {
    public operator fun invoke(hnetwork: HNETWORK, lpszname: PCWSTR, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_NETWORK_NAME_EX = PCLUSAPI_SET_CLUSTER_NETWORK_NAME_EXFn?

public fun interface PCLUSAPI_SET_CLUSTER_NETWORK_PRIORITY_ORDERFn {
    public operator fun invoke(hcluster: HCLUSTER, networkcount: UInt, networklist: Long): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_NETWORK_PRIORITY_ORDER = PCLUSAPI_SET_CLUSTER_NETWORK_PRIORITY_ORDERFn?

public fun interface PCLUSAPI_SET_CLUSTER_QUORUM_RESOURCEFn {
    public operator fun invoke(hresource: HRESOURCE, lpszdevicename: PCWSTR, dwmaxquologsize: UInt): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_QUORUM_RESOURCE = PCLUSAPI_SET_CLUSTER_QUORUM_RESOURCEFn?

public fun interface PCLUSAPI_SET_CLUSTER_QUORUM_RESOURCE_EXFn {
    public operator fun invoke(hresource: HRESOURCE, lpszdevicename: PCWSTR, dwmaxquorumlogsize: UInt, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_QUORUM_RESOURCE_EX = PCLUSAPI_SET_CLUSTER_QUORUM_RESOURCE_EXFn?

public fun interface PCLUSAPI_SET_CLUSTER_RESOURCE_DEPENDENCY_EXPRESSIONFn {
    public operator fun invoke(hresource: HRESOURCE, lpszdependencyexpression: PCWSTR): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_RESOURCE_DEPENDENCY_EXPRESSION = PCLUSAPI_SET_CLUSTER_RESOURCE_DEPENDENCY_EXPRESSIONFn?

public fun interface PCLUSAPI_SET_CLUSTER_RESOURCE_NAMEFn {
    public operator fun invoke(hresource: HRESOURCE, lpszresourcename: PCWSTR): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_RESOURCE_NAME = PCLUSAPI_SET_CLUSTER_RESOURCE_NAMEFn?

public fun interface PCLUSAPI_SET_CLUSTER_RESOURCE_NAME_EXFn {
    public operator fun invoke(hresource: HRESOURCE, lpszresourcename: PCWSTR, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_RESOURCE_NAME_EX = PCLUSAPI_SET_CLUSTER_RESOURCE_NAME_EXFn?

public fun interface PCLUSAPI_SET_CLUSTER_SERVICE_ACCOUNT_PASSWORDFn {
    public operator fun invoke(lpszclustername: PCWSTR, lpsznewpassword: PCWSTR, dwflags: UInt, lpreturnstatusbuffer: Long, lpcbreturnstatusbuffersize: Long): UInt
}

public typealias PCLUSAPI_SET_CLUSTER_SERVICE_ACCOUNT_PASSWORD = PCLUSAPI_SET_CLUSTER_SERVICE_ACCOUNT_PASSWORDFn?

public fun interface PCLUSAPI_SET_GROUP_DEPENDENCY_EXPRESSIONFn {
    public operator fun invoke(hgroupset: HGROUP, lpszdependencyexpression: PCWSTR): UInt
}

public typealias PCLUSAPI_SET_GROUP_DEPENDENCY_EXPRESSION = PCLUSAPI_SET_GROUP_DEPENDENCY_EXPRESSIONFn?

public fun interface PCLUSAPI_SET_GROUP_DEPENDENCY_EXPRESSION_EXFn {
    public operator fun invoke(hgroup: HGROUP, lpszdependencyexpression: PCWSTR, lpszreason: PCWSTR): UInt
}

public typealias PCLUSAPI_SET_GROUP_DEPENDENCY_EXPRESSION_EX = PCLUSAPI_SET_GROUP_DEPENDENCY_EXPRESSION_EXFn?

public fun interface PCLUSAPI_SET_REASON_HANDLERFn {
    public operator fun invoke(lphandler: Long): Long
}

public typealias PCLUSAPI_SET_REASON_HANDLER = PCLUSAPI_SET_REASON_HANDLERFn?

public fun interface PCLUSAPI_SHARED_VOLUME_SET_SNAPSHOT_STATEFn {
    public operator fun invoke(guidsnapshotset: GUID, lpszvolumename: PCWSTR, state: CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE): UInt
}

public typealias PCLUSAPI_SHARED_VOLUME_SET_SNAPSHOT_STATE = PCLUSAPI_SHARED_VOLUME_SET_SNAPSHOT_STATEFn?

public fun interface PCLUSAPI_SetClusterNameFn {
    public operator fun invoke(hcluster: HCLUSTER, lpsznewclustername: PCWSTR): UInt
}

public typealias PCLUSAPI_SetClusterName = PCLUSAPI_SetClusterNameFn?

public fun interface PCLUSTER_CLEAR_BACKUP_STATE_FOR_SHARED_VOLUMEFn {
    public operator fun invoke(lpszvolumepathname: PCWSTR): UInt
}

public typealias PCLUSTER_CLEAR_BACKUP_STATE_FOR_SHARED_VOLUME = PCLUSTER_CLEAR_BACKUP_STATE_FOR_SHARED_VOLUMEFn?

public fun interface PCLUSTER_DECRYPTFn {
    public operator fun invoke(hcluscryptprovider: HCLUSCRYPTPROVIDER, pcryptinput: Long, cbcryptinput: UInt, ppcryptoutput: Long, pcbcryptoutput: Long): UInt
}

public typealias PCLUSTER_DECRYPT = PCLUSTER_DECRYPTFn?

public fun interface PCLUSTER_ENCRYPTFn {
    public operator fun invoke(hcluscryptprovider: HCLUSCRYPTPROVIDER, pdata: Long, cbdata: UInt, ppdata: Long, pcbdata: Long): UInt
}

public typealias PCLUSTER_ENCRYPT = PCLUSTER_ENCRYPTFn?

public fun interface PCLUSTER_GET_VOLUME_NAME_FOR_VOLUME_MOUNT_POINTFn {
    public operator fun invoke(lpszvolumemountpoint: PCWSTR, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL
}

public typealias PCLUSTER_GET_VOLUME_NAME_FOR_VOLUME_MOUNT_POINT = PCLUSTER_GET_VOLUME_NAME_FOR_VOLUME_MOUNT_POINTFn?

public fun interface PCLUSTER_GET_VOLUME_PATH_NAMEFn {
    public operator fun invoke(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, cchbufferlength: UInt): BOOL
}

public typealias PCLUSTER_GET_VOLUME_PATH_NAME = PCLUSTER_GET_VOLUME_PATH_NAMEFn?

public fun interface PCLUSTER_IS_PATH_ON_SHARED_VOLUMEFn {
    public operator fun invoke(lpszpathname: PCWSTR): BOOL
}

public typealias PCLUSTER_IS_PATH_ON_SHARED_VOLUME = PCLUSTER_IS_PATH_ON_SHARED_VOLUMEFn?

public fun interface PCLUSTER_PREPARE_SHARED_VOLUME_FOR_BACKUPFn {
    public operator fun invoke(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, lpcchvolumepathname: Long, lpszvolumename: PWSTR, lpcchvolumename: Long): UInt
}

public typealias PCLUSTER_PREPARE_SHARED_VOLUME_FOR_BACKUP = PCLUSTER_PREPARE_SHARED_VOLUME_FOR_BACKUPFn?

public fun interface PCLUSTER_REG_BATCH_ADD_COMMANDFn {
    public operator fun invoke(hregbatch: HREGBATCH, dwcommand: CLUSTER_REG_COMMAND, wzname: PCWSTR, dwoptions: UInt, lpdata: Long, cbdata: UInt): Int
}

public typealias PCLUSTER_REG_BATCH_ADD_COMMAND = PCLUSTER_REG_BATCH_ADD_COMMANDFn?

public fun interface PCLUSTER_REG_BATCH_CLOSE_NOTIFICATIONFn {
    public operator fun invoke(hbatchnotification: HREGBATCHNOTIFICATION): Int
}

public typealias PCLUSTER_REG_BATCH_CLOSE_NOTIFICATION = PCLUSTER_REG_BATCH_CLOSE_NOTIFICATIONFn?

public fun interface PCLUSTER_REG_BATCH_READ_COMMANDFn {
    public operator fun invoke(hbatchnotification: HREGBATCHNOTIFICATION, pbatchcommand: Long): Int
}

public typealias PCLUSTER_REG_BATCH_READ_COMMAND = PCLUSTER_REG_BATCH_READ_COMMANDFn?

public fun interface PCLUSTER_REG_CLOSE_BATCHFn {
    public operator fun invoke(hregbatch: HREGBATCH, bcommit: BOOL, failedcommandnumber: Long): Int
}

public typealias PCLUSTER_REG_CLOSE_BATCH = PCLUSTER_REG_CLOSE_BATCHFn?

public fun interface PCLUSTER_REG_CLOSE_BATCH_NOTIFY_PORTFn {
    public operator fun invoke(hbatchnotifyport: HREGBATCHPORT): Int
}

public typealias PCLUSTER_REG_CLOSE_BATCH_NOTIFY_PORT = PCLUSTER_REG_CLOSE_BATCH_NOTIFY_PORTFn?

public fun interface PCLUSTER_REG_CLOSE_READ_BATCHFn {
    public operator fun invoke(hregreadbatch: HREGREADBATCH, phregreadbatchreply: Long): Int
}

public typealias PCLUSTER_REG_CLOSE_READ_BATCH = PCLUSTER_REG_CLOSE_READ_BATCHFn?

public fun interface PCLUSTER_REG_CLOSE_READ_BATCH_EXFn {
    public operator fun invoke(hregreadbatch: HREGREADBATCH, flags: UInt, phregreadbatchreply: Long): Int
}

public typealias PCLUSTER_REG_CLOSE_READ_BATCH_EX = PCLUSTER_REG_CLOSE_READ_BATCH_EXFn?

public fun interface PCLUSTER_REG_CLOSE_READ_BATCH_REPLYFn {
    public operator fun invoke(hregreadbatchreply: HREGREADBATCHREPLY): Int
}

public typealias PCLUSTER_REG_CLOSE_READ_BATCH_REPLY = PCLUSTER_REG_CLOSE_READ_BATCH_REPLYFn?

public fun interface PCLUSTER_REG_CREATE_BATCH_NOTIFY_PORTFn {
    public operator fun invoke(hkey: System.Registry.HKEY, phbatchnotifyport: Long): Int
}

public typealias PCLUSTER_REG_CREATE_BATCH_NOTIFY_PORT = PCLUSTER_REG_CREATE_BATCH_NOTIFY_PORTFn?

public fun interface PCLUSTER_REG_CREATE_READ_BATCHFn {
    public operator fun invoke(hkey: System.Registry.HKEY, phregreadbatch: Long): Int
}

public typealias PCLUSTER_REG_CREATE_READ_BATCH = PCLUSTER_REG_CREATE_READ_BATCHFn?

public fun interface PCLUSTER_REG_GET_BATCH_NOTIFICATIONFn {
    public operator fun invoke(hbatchnotify: HREGBATCHPORT, phbatchnotification: Long): Int
}

public typealias PCLUSTER_REG_GET_BATCH_NOTIFICATION = PCLUSTER_REG_GET_BATCH_NOTIFICATIONFn?

public fun interface PCLUSTER_REG_READ_BATCH_ADD_COMMANDFn {
    public operator fun invoke(hregreadbatch: HREGREADBATCH, wzsubkeyname: PCWSTR, wzvaluename: PCWSTR): Int
}

public typealias PCLUSTER_REG_READ_BATCH_ADD_COMMAND = PCLUSTER_REG_READ_BATCH_ADD_COMMANDFn?

public fun interface PCLUSTER_REG_READ_BATCH_REPLY_NEXT_COMMANDFn {
    public operator fun invoke(hregreadbatchreply: HREGREADBATCHREPLY, pbatchcommand: Long): Int
}

public typealias PCLUSTER_REG_READ_BATCH_REPLY_NEXT_COMMAND = PCLUSTER_REG_READ_BATCH_REPLY_NEXT_COMMANDFn?

public fun interface PCLUSTER_SETUP_PROGRESS_CALLBACKFn {
    public operator fun invoke(pvcallbackarg: Long, esetupphase: CLUSTER_SETUP_PHASE, ephasetype: CLUSTER_SETUP_PHASE_TYPE, ephaseseverity: CLUSTER_SETUP_PHASE_SEVERITY, dwpercentcomplete: UInt, lpszobjectname: PCWSTR, dwstatus: UInt): BOOL
}

public typealias PCLUSTER_SETUP_PROGRESS_CALLBACK = PCLUSTER_SETUP_PROGRESS_CALLBACKFn?

public fun interface PCLUSTER_SET_ACCOUNT_ACCESSFn {
    public operator fun invoke(hcluster: HCLUSTER, szaccountsid: PCWSTR, dwaccess: UInt, dwcontroltype: UInt): UInt
}

public typealias PCLUSTER_SET_ACCOUNT_ACCESS = PCLUSTER_SET_ACCOUNT_ACCESSFn?

public fun interface PCLUSTER_UPGRADE_PROGRESS_CALLBACKFn {
    public operator fun invoke(pvcallbackarg: Long, eupgradephase: CLUSTER_UPGRADE_PHASE): BOOL
}

public typealias PCLUSTER_UPGRADE_PROGRESS_CALLBACK = PCLUSTER_UPGRADE_PROGRESS_CALLBACKFn?

public fun interface PEND_CONTROL_CALLFn {
    public operator fun invoke(context: Long, status: UInt): UInt
}

public typealias PEND_CONTROL_CALL = PEND_CONTROL_CALLFn?

public fun interface PEND_TYPE_CONTROL_CALLFn {
    public operator fun invoke(context: Long, status: UInt): UInt
}

public typealias PEND_TYPE_CONTROL_CALL = PEND_TYPE_CONTROL_CALLFn?

public fun interface PEXTEND_RES_CONTROL_CALLFn {
    public operator fun invoke(context: Long, newtimeoutinms: UInt): UInt
}

public typealias PEXTEND_RES_CONTROL_CALL = PEXTEND_RES_CONTROL_CALLFn?

public fun interface PEXTEND_RES_TYPE_CONTROL_CALLFn {
    public operator fun invoke(context: Long, newtimeoutinms: UInt): UInt
}

public typealias PEXTEND_RES_TYPE_CONTROL_CALL = PEXTEND_RES_TYPE_CONTROL_CALLFn?

public fun interface PFREE_CLUSTER_CRYPTFn {
    public operator fun invoke(pcryptinfo: Long): UInt
}

public typealias PFREE_CLUSTER_CRYPT = PFREE_CLUSTER_CRYPTFn?

public fun interface PIS_ALIVE_ROUTINEFn {
    public operator fun invoke(resource: Long): BOOL
}

public typealias PIS_ALIVE_ROUTINE = PIS_ALIVE_ROUTINEFn?

public typealias PLACEMENT_OPTIONS = Int

public fun interface PLOG_EVENT_ROUTINEFn {
    public operator fun invoke(resourcehandle: Long, loglevel: LOG_LEVEL, formatstring: PCWSTR)
}

public typealias PLOG_EVENT_ROUTINE = PLOG_EVENT_ROUTINEFn?

public fun interface PLOOKS_ALIVE_ROUTINEFn {
    public operator fun invoke(resource: Long): BOOL
}

public typealias PLOOKS_ALIVE_ROUTINE = PLOOKS_ALIVE_ROUTINEFn?

public fun interface POFFLINE_ROUTINEFn {
    public operator fun invoke(resource: Long): UInt
}

public typealias POFFLINE_ROUTINE = POFFLINE_ROUTINEFn?

public fun interface POFFLINE_V2_ROUTINEFn {
    public operator fun invoke(resource: Long, destinationnodename: PCWSTR, offlineflags: UInt, inbuffer: Long, inbuffersize: UInt, reserved: UInt): UInt
}

public typealias POFFLINE_V2_ROUTINE = POFFLINE_V2_ROUTINEFn?

public fun interface PONLINE_ROUTINEFn {
    public operator fun invoke(resource: Long, eventhandle: Long): UInt
}

public typealias PONLINE_ROUTINE = PONLINE_ROUTINEFn?

public fun interface PONLINE_V2_ROUTINEFn {
    public operator fun invoke(resource: Long, eventhandle: Long, onlineflags: UInt, inbuffer: Long, inbuffersize: UInt, reserved: UInt): UInt
}

public typealias PONLINE_V2_ROUTINE = PONLINE_V2_ROUTINEFn?

public fun interface POPEN_CLUSTER_CRYPT_PROVIDERFn {
    public operator fun invoke(lpszresource: PCWSTR, lpszprovider: Long, dwtype: UInt, dwflags: UInt): HCLUSCRYPTPROVIDER
}

public typealias POPEN_CLUSTER_CRYPT_PROVIDER = POPEN_CLUSTER_CRYPT_PROVIDERFn?

public fun interface POPEN_CLUSTER_CRYPT_PROVIDEREXFn {
    public operator fun invoke(lpszresource: PCWSTR, lpszkeyname: PCWSTR, lpszprovider: Long, dwtype: UInt, dwflags: UInt): HCLUSCRYPTPROVIDER
}

public typealias POPEN_CLUSTER_CRYPT_PROVIDEREX = POPEN_CLUSTER_CRYPT_PROVIDEREXFn?

public fun interface POPEN_ROUTINEFn {
    public operator fun invoke(resourcename: PCWSTR, resourcekey: System.Registry.HKEY, resourcehandle: Long): Long
}

public typealias POPEN_ROUTINE = POPEN_ROUTINEFn?

public fun interface POPEN_V2_ROUTINEFn {
    public operator fun invoke(resourcename: PCWSTR, resourcekey: System.Registry.HKEY, resourcehandle: Long, openflags: UInt): Long
}

public typealias POPEN_V2_ROUTINE = POPEN_V2_ROUTINEFn?

public fun interface PQUERY_APPINSTANCE_VERSIONFn {
    public operator fun invoke(appinstanceid: Long, instanceversionhigh: Long, instanceversionlow: Long, versionstatus: Long): UInt
}

public typealias PQUERY_APPINSTANCE_VERSION = PQUERY_APPINSTANCE_VERSIONFn?

public fun interface PQUORUM_RESOURCE_LOSTFn {
    public operator fun invoke(resource: Long)
}

public typealias PQUORUM_RESOURCE_LOST = PQUORUM_RESOURCE_LOSTFn?

public fun interface PRAISE_RES_TYPE_NOTIFICATIONFn {
    public operator fun invoke(resourcetype: PCWSTR, ppayload: Long, payloadsize: UInt): UInt
}

public typealias PRAISE_RES_TYPE_NOTIFICATION = PRAISE_RES_TYPE_NOTIFICATIONFn?

public fun interface PREGISTER_APPINSTANCEFn {
    public operator fun invoke(processhandle: Foundation.HANDLE, appinstanceid: Long, childreninheritappinstance: BOOL): UInt
}

public typealias PREGISTER_APPINSTANCE = PREGISTER_APPINSTANCEFn?

public fun interface PREGISTER_APPINSTANCE_VERSIONFn {
    public operator fun invoke(appinstanceid: Long, instanceversionhigh: ULong, instanceversionlow: ULong): UInt
}

public typealias PREGISTER_APPINSTANCE_VERSION = PREGISTER_APPINSTANCE_VERSIONFn?

public fun interface PRELEASE_ROUTINEFn {
    public operator fun invoke(resource: Long): UInt
}

public typealias PRELEASE_ROUTINE = PRELEASE_ROUTINEFn?

public fun interface PREQUEST_DUMP_ROUTINEFn {
    public operator fun invoke(resourcehandle: Long, dumpduetocallinprogress: BOOL, dumpdelayinms: UInt): UInt
}

public typealias PREQUEST_DUMP_ROUTINE = PREQUEST_DUMP_ROUTINEFn?

public fun interface PRESET_ALL_APPINSTANCE_VERSIONSFn {
    public operator fun invoke(): UInt
}

public typealias PRESET_ALL_APPINSTANCE_VERSIONS = PRESET_ALL_APPINSTANCE_VERSIONSFn?

public fun interface PRESOURCE_CONTROL_ROUTINEFn {
    public operator fun invoke(resource: Long, controlcode: UInt, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, bytesreturned: Long): UInt
}

public typealias PRESOURCE_CONTROL_ROUTINE = PRESOURCE_CONTROL_ROUTINEFn?

public fun interface PRESOURCE_TYPE_CONTROL_ROUTINEFn {
    public operator fun invoke(resourcetypename: PCWSTR, controlcode: UInt, inbuffer: Long, inbuffersize: UInt, outbuffer: Long, outbuffersize: UInt, bytesreturned: Long): UInt
}

public typealias PRESOURCE_TYPE_CONTROL_ROUTINE = PRESOURCE_TYPE_CONTROL_ROUTINEFn?

public fun interface PRESUTIL_ADD_UNKNOWN_PROPERTIESFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt
}

public typealias PRESUTIL_ADD_UNKNOWN_PROPERTIES = PRESUTIL_ADD_UNKNOWN_PROPERTIESFn?

public fun interface PRESUTIL_CREATE_DIRECTORY_TREEFn {
    public operator fun invoke(pszpath: PCWSTR): UInt
}

public typealias PRESUTIL_CREATE_DIRECTORY_TREE = PRESUTIL_CREATE_DIRECTORY_TREEFn?

public fun interface PRESUTIL_DUP_PARAMETER_BLOCKFn {
    public operator fun invoke(poutparams: Long, pinparams: Long, ppropertytable: Long): UInt
}

public typealias PRESUTIL_DUP_PARAMETER_BLOCK = PRESUTIL_DUP_PARAMETER_BLOCKFn?

public fun interface PRESUTIL_DUP_STRINGFn {
    public operator fun invoke(pszinstring: PCWSTR): PWSTR
}

public typealias PRESUTIL_DUP_STRING = PRESUTIL_DUP_STRINGFn?

public fun interface PRESUTIL_ENUM_PRIVATE_PROPERTIESFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, pszoutproperties: PWSTR, cboutpropertiessize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt
}

public typealias PRESUTIL_ENUM_PRIVATE_PROPERTIES = PRESUTIL_ENUM_PRIVATE_PROPERTIESFn?

public fun interface PRESUTIL_ENUM_PROPERTIESFn {
    public operator fun invoke(ppropertytable: Long, pszoutproperties: PWSTR, cboutpropertiessize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt
}

public typealias PRESUTIL_ENUM_PROPERTIES = PRESUTIL_ENUM_PROPERTIESFn?

public fun interface PRESUTIL_ENUM_RESOURCESFn {
    public operator fun invoke(hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK, pparameter: Long): UInt
}

public typealias PRESUTIL_ENUM_RESOURCES = PRESUTIL_ENUM_RESOURCESFn?

public fun interface PRESUTIL_ENUM_RESOURCES_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long): UInt
}

public typealias PRESUTIL_ENUM_RESOURCES_EX = PRESUTIL_ENUM_RESOURCES_EXFn?

public fun interface PRESUTIL_ENUM_RESOURCES_EX2Fn {
    public operator fun invoke(hcluster: HCLUSTER, hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long, dwdesiredaccess: UInt): UInt
}

public typealias PRESUTIL_ENUM_RESOURCES_EX2 = PRESUTIL_ENUM_RESOURCES_EX2Fn?

public fun interface PRESUTIL_EXPAND_ENVIRONMENT_STRINGSFn {
    public operator fun invoke(pszsrc: PCWSTR): PWSTR
}

public typealias PRESUTIL_EXPAND_ENVIRONMENT_STRINGS = PRESUTIL_EXPAND_ENVIRONMENT_STRINGSFn?

public fun interface PRESUTIL_FIND_BINARY_PROPERTYFn {
    public operator fun invoke(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pbpropertyvalue: Long, pcbpropertyvaluesize: Long): UInt
}

public typealias PRESUTIL_FIND_BINARY_PROPERTY = PRESUTIL_FIND_BINARY_PROPERTYFn?

public fun interface PRESUTIL_FIND_DEPENDENT_DISK_RESOURCE_DRIVE_LETTERFn {
    public operator fun invoke(hcluster: HCLUSTER, hresource: HRESOURCE, pszdriveletter: PWSTR, pcchdriveletter: Long): UInt
}

public typealias PRESUTIL_FIND_DEPENDENT_DISK_RESOURCE_DRIVE_LETTER = PRESUTIL_FIND_DEPENDENT_DISK_RESOURCE_DRIVE_LETTERFn?

public fun interface PRESUTIL_FIND_DWORD_PROPERTYFn {
    public operator fun invoke(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pdwpropertyvalue: Long): UInt
}

public typealias PRESUTIL_FIND_DWORD_PROPERTY = PRESUTIL_FIND_DWORD_PROPERTYFn?

public fun interface PRESUTIL_FIND_EXPANDED_SZ_PROPERTYFn {
    public operator fun invoke(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt
}

public typealias PRESUTIL_FIND_EXPANDED_SZ_PROPERTY = PRESUTIL_FIND_EXPANDED_SZ_PROPERTYFn?

public fun interface PRESUTIL_FIND_EXPAND_SZ_PROPERTYFn {
    public operator fun invoke(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt
}

public typealias PRESUTIL_FIND_EXPAND_SZ_PROPERTY = PRESUTIL_FIND_EXPAND_SZ_PROPERTYFn?

public fun interface PRESUTIL_FIND_FILETIME_PROPERTYFn {
    public operator fun invoke(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pftpropertyvalue: Long): UInt
}

public typealias PRESUTIL_FIND_FILETIME_PROPERTY = PRESUTIL_FIND_FILETIME_PROPERTYFn?

public fun interface PRESUTIL_FIND_LONG_PROPERTYFn {
    public operator fun invoke(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, plpropertyvalue: Long): UInt
}

public typealias PRESUTIL_FIND_LONG_PROPERTY = PRESUTIL_FIND_LONG_PROPERTYFn?

public fun interface PRESUTIL_FIND_MULTI_SZ_PROPERTYFn {
    public operator fun invoke(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long, pcbpropertyvaluesize: Long): UInt
}

public typealias PRESUTIL_FIND_MULTI_SZ_PROPERTY = PRESUTIL_FIND_MULTI_SZ_PROPERTYFn?

public fun interface PRESUTIL_FIND_SZ_PROPERTYFn {
    public operator fun invoke(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt
}

public typealias PRESUTIL_FIND_SZ_PROPERTY = PRESUTIL_FIND_SZ_PROPERTYFn?

public fun interface PRESUTIL_FIND_ULARGEINTEGER_PROPERTYFn {
    public operator fun invoke(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, plpropertyvalue: Long): UInt
}

public typealias PRESUTIL_FIND_ULARGEINTEGER_PROPERTY = PRESUTIL_FIND_ULARGEINTEGER_PROPERTYFn?

public fun interface PRESUTIL_FREE_ENVIRONMENTFn {
    public operator fun invoke(lpenvironment: Long): UInt
}

public typealias PRESUTIL_FREE_ENVIRONMENT = PRESUTIL_FREE_ENVIRONMENTFn?

public fun interface PRESUTIL_FREE_PARAMETER_BLOCKFn {
    public operator fun invoke(poutparams: Long, pinparams: Long, ppropertytable: Long)
}

public typealias PRESUTIL_FREE_PARAMETER_BLOCK = PRESUTIL_FREE_PARAMETER_BLOCKFn?

public fun interface PRESUTIL_GET_ALL_PROPERTIESFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt
}

public typealias PRESUTIL_GET_ALL_PROPERTIES = PRESUTIL_GET_ALL_PROPERTIESFn?

public fun interface PRESUTIL_GET_BINARY_PROPERTYFn {
    public operator fun invoke(ppboutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pboldvalue: Long, cboldvaluesize: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt
}

public typealias PRESUTIL_GET_BINARY_PROPERTY = PRESUTIL_GET_BINARY_PROPERTYFn?

public fun interface PRESUTIL_GET_BINARY_VALUEFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, pszvaluename: PCWSTR, ppboutvalue: Long, pcboutvaluesize: Long): UInt
}

public typealias PRESUTIL_GET_BINARY_VALUE = PRESUTIL_GET_BINARY_VALUEFn?

public fun interface PRESUTIL_GET_CORE_CLUSTER_RESOURCESFn {
    public operator fun invoke(hcluster: HCLUSTER, phclusternameresource: Long, phclusteripaddressresource: Long, phclusterquorumresource: Long): UInt
}

public typealias PRESUTIL_GET_CORE_CLUSTER_RESOURCES = PRESUTIL_GET_CORE_CLUSTER_RESOURCESFn?

public fun interface PRESUTIL_GET_CORE_CLUSTER_RESOURCES_EXFn {
    public operator fun invoke(hclusterin: HCLUSTER, phclusternameresourceout: Long, phclusteripaddressresourceout: Long, phclusterquorumresourceout: Long, dwdesiredaccess: UInt): UInt
}

public typealias PRESUTIL_GET_CORE_CLUSTER_RESOURCES_EX = PRESUTIL_GET_CORE_CLUSTER_RESOURCES_EXFn?

public fun interface PRESUTIL_GET_DWORD_PROPERTYFn {
    public operator fun invoke(pdwoutvalue: Long, pvaluestruct: Long, dwoldvalue: UInt, dwminimum: UInt, dwmaximum: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt
}

public typealias PRESUTIL_GET_DWORD_PROPERTY = PRESUTIL_GET_DWORD_PROPERTYFn?

public fun interface PRESUTIL_GET_DWORD_VALUEFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, pszvaluename: PCWSTR, pdwoutvalue: Long, dwdefaultvalue: UInt): UInt
}

public typealias PRESUTIL_GET_DWORD_VALUE = PRESUTIL_GET_DWORD_VALUEFn?

public fun interface PRESUTIL_GET_ENVIRONMENT_WITH_NET_NAMEFn {
    public operator fun invoke(hresource: HRESOURCE): Long
}

public typealias PRESUTIL_GET_ENVIRONMENT_WITH_NET_NAME = PRESUTIL_GET_ENVIRONMENT_WITH_NET_NAMEFn?

public fun interface PRESUTIL_GET_EXPAND_SZ_VALUEFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, pszvaluename: PCWSTR, bexpand: BOOL): PWSTR
}

public typealias PRESUTIL_GET_EXPAND_SZ_VALUE = PRESUTIL_GET_EXPAND_SZ_VALUEFn?

public fun interface PRESUTIL_GET_FILETIME_PROPERTYFn {
    public operator fun invoke(pftoutvalue: Long, pvaluestruct: Long, ftoldvalue: Foundation.FILETIME, ftminimum: Foundation.FILETIME, ftmaximum: Foundation.FILETIME, pppropertylist: Long, pcbpropertylistsize: Long): UInt
}

public typealias PRESUTIL_GET_FILETIME_PROPERTY = PRESUTIL_GET_FILETIME_PROPERTYFn?

public fun interface PRESUTIL_GET_LONG_PROPERTYFn {
    public operator fun invoke(ploutvalue: Long, pvaluestruct: Long, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: Long, pcbpropertylistsize: Long): UInt
}

public typealias PRESUTIL_GET_LONG_PROPERTY = PRESUTIL_GET_LONG_PROPERTYFn?

public fun interface PRESUTIL_GET_MULTI_SZ_PROPERTYFn {
    public operator fun invoke(ppszoutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pszoldvalue: PCWSTR, cboldvaluesize: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt
}

public typealias PRESUTIL_GET_MULTI_SZ_PROPERTY = PRESUTIL_GET_MULTI_SZ_PROPERTYFn?

public fun interface PRESUTIL_GET_PRIVATE_PROPERTIESFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt
}

public typealias PRESUTIL_GET_PRIVATE_PROPERTIES = PRESUTIL_GET_PRIVATE_PROPERTIESFn?

public fun interface PRESUTIL_GET_PROPERTIESFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt
}

public typealias PRESUTIL_GET_PROPERTIES = PRESUTIL_GET_PROPERTIESFn?

public fun interface PRESUTIL_GET_PROPERTIES_TO_PARAMETER_BLOCKFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, ppropertytable: Long, poutparams: Long, bcheckforrequiredproperties: BOOL, psznameofpropinerror: Long): UInt
}

public typealias PRESUTIL_GET_PROPERTIES_TO_PARAMETER_BLOCK = PRESUTIL_GET_PROPERTIES_TO_PARAMETER_BLOCKFn?

public fun interface PRESUTIL_GET_PROPERTYFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, ppropertytableitem: Long, poutpropertyitem: Long, pcboutpropertyitemsize: Long): UInt
}

public typealias PRESUTIL_GET_PROPERTY = PRESUTIL_GET_PROPERTYFn?

public fun interface PRESUTIL_GET_PROPERTY_FORMATSFn {
    public operator fun invoke(ppropertytable: Long, poutpropertyformatlist: Long, cbpropertyformatlistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt
}

public typealias PRESUTIL_GET_PROPERTY_FORMATS = PRESUTIL_GET_PROPERTY_FORMATSFn?

public fun interface PRESUTIL_GET_PROPERTY_SIZEFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, ppropertytableitem: Long, pcboutpropertylistsize: Long, pnpropertycount: Long): UInt
}

public typealias PRESUTIL_GET_PROPERTY_SIZE = PRESUTIL_GET_PROPERTY_SIZEFn?

public fun interface PRESUTIL_GET_QWORD_VALUEFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, pszvaluename: PCWSTR, pqwoutvalue: Long, qwdefaultvalue: ULong): UInt
}

public typealias PRESUTIL_GET_QWORD_VALUE = PRESUTIL_GET_QWORD_VALUEFn?

public fun interface PRESUTIL_GET_RESOURCE_DEPENDENCYFn {
    public operator fun invoke(hself: Foundation.HANDLE, lpszresourcetype: PCWSTR): HRESOURCE
}

public typealias PRESUTIL_GET_RESOURCE_DEPENDENCY = PRESUTIL_GET_RESOURCE_DEPENDENCYFn?

public fun interface PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_CLASSFn {
    public operator fun invoke(hcluster: HCLUSTER, hself: Foundation.HANDLE, prci: Long, brecurse: BOOL): HRESOURCE
}

public typealias PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_CLASS = PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_CLASSFn?

public fun interface PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_CLASS_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, hself: Foundation.HANDLE, prci: Long, brecurse: BOOL, dwdesiredaccess: UInt): HRESOURCE
}

public typealias PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_CLASS_EX = PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_CLASS_EXFn?

public fun interface PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_NAMEFn {
    public operator fun invoke(hcluster: HCLUSTER, hself: Foundation.HANDLE, lpszresourcetype: PCWSTR, brecurse: BOOL): HRESOURCE
}

public typealias PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_NAME = PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_NAMEFn?

public fun interface PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_NAME_EXFn {
    public operator fun invoke(hcluster: HCLUSTER, hself: Foundation.HANDLE, lpszresourcetype: PCWSTR, brecurse: BOOL, dwdesiredaccess: UInt): HRESOURCE
}

public typealias PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_NAME_EX = PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_NAME_EXFn?

public fun interface PRESUTIL_GET_RESOURCE_DEPENDENCY_EXFn {
    public operator fun invoke(hself: Foundation.HANDLE, lpszresourcetype: PCWSTR, dwdesiredaccess: UInt): HRESOURCE
}

public typealias PRESUTIL_GET_RESOURCE_DEPENDENCY_EX = PRESUTIL_GET_RESOURCE_DEPENDENCY_EXFn?

public fun interface PRESUTIL_GET_RESOURCE_DEPENDENTIP_ADDRESS_PROPSFn {
    public operator fun invoke(hresource: HRESOURCE, pszaddress: PWSTR, pcchaddress: Long, pszsubnetmask: PWSTR, pcchsubnetmask: Long, psznetwork: PWSTR, pcchnetwork: Long): UInt
}

public typealias PRESUTIL_GET_RESOURCE_DEPENDENTIP_ADDRESS_PROPS = PRESUTIL_GET_RESOURCE_DEPENDENTIP_ADDRESS_PROPSFn?

public fun interface PRESUTIL_GET_RESOURCE_NAMEFn {
    public operator fun invoke(hresource: HRESOURCE, pszresourcename: PWSTR, pcchresourcenameinout: Long): UInt
}

public typealias PRESUTIL_GET_RESOURCE_NAME = PRESUTIL_GET_RESOURCE_NAMEFn?

public fun interface PRESUTIL_GET_RESOURCE_NAME_DEPENDENCYFn {
    public operator fun invoke(lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR): HRESOURCE
}

public typealias PRESUTIL_GET_RESOURCE_NAME_DEPENDENCY = PRESUTIL_GET_RESOURCE_NAME_DEPENDENCYFn?

public fun interface PRESUTIL_GET_RESOURCE_NAME_DEPENDENCY_EXFn {
    public operator fun invoke(lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwdesiredaccess: UInt): HRESOURCE
}

public typealias PRESUTIL_GET_RESOURCE_NAME_DEPENDENCY_EX = PRESUTIL_GET_RESOURCE_NAME_DEPENDENCY_EXFn?

public fun interface PRESUTIL_GET_SZ_PROPERTYFn {
    public operator fun invoke(ppszoutvalue: Long, pvaluestruct: Long, pszoldvalue: PCWSTR, pppropertylist: Long, pcbpropertylistsize: Long): UInt
}

public typealias PRESUTIL_GET_SZ_PROPERTY = PRESUTIL_GET_SZ_PROPERTYFn?

public fun interface PRESUTIL_GET_SZ_VALUEFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, pszvaluename: PCWSTR): PWSTR
}

public typealias PRESUTIL_GET_SZ_VALUE = PRESUTIL_GET_SZ_VALUEFn?

public fun interface PRESUTIL_IS_PATH_VALIDFn {
    public operator fun invoke(pszpath: PCWSTR): BOOL
}

public typealias PRESUTIL_IS_PATH_VALID = PRESUTIL_IS_PATH_VALIDFn?

public fun interface PRESUTIL_IS_RESOURCE_CLASS_EQUALFn {
    public operator fun invoke(prci: Long, hresource: HRESOURCE): BOOL
}

public typealias PRESUTIL_IS_RESOURCE_CLASS_EQUAL = PRESUTIL_IS_RESOURCE_CLASS_EQUALFn?

public fun interface PRESUTIL_PROPERTY_LIST_FROM_PARAMETER_BLOCKFn {
    public operator fun invoke(ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: Long, pinparams: Long, pcbbytesreturned: Long, pcbrequired: Long): UInt
}

public typealias PRESUTIL_PROPERTY_LIST_FROM_PARAMETER_BLOCK = PRESUTIL_PROPERTY_LIST_FROM_PARAMETER_BLOCKFn?

public fun interface PRESUTIL_REMOVE_RESOURCE_SERVICE_ENVIRONMENTFn {
    public operator fun invoke(pszservicename: PCWSTR, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt
}

public typealias PRESUTIL_REMOVE_RESOURCE_SERVICE_ENVIRONMENT = PRESUTIL_REMOVE_RESOURCE_SERVICE_ENVIRONMENTFn?

public fun interface PRESUTIL_RESOURCES_EQUALFn {
    public operator fun invoke(hself: HRESOURCE, hresource: HRESOURCE): BOOL
}

public typealias PRESUTIL_RESOURCES_EQUAL = PRESUTIL_RESOURCES_EQUALFn?

public fun interface PRESUTIL_RESOURCE_TYPES_EQUALFn {
    public operator fun invoke(lpszresourcetypename: PCWSTR, hresource: HRESOURCE): BOOL
}

public typealias PRESUTIL_RESOURCE_TYPES_EQUAL = PRESUTIL_RESOURCE_TYPES_EQUALFn?

public fun interface PRESUTIL_SET_BINARY_VALUEFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, pszvaluename: PCWSTR, pbnewvalue: Long, cbnewvaluesize: UInt, ppboutvalue: Long, pcboutvaluesize: Long): UInt
}

public typealias PRESUTIL_SET_BINARY_VALUE = PRESUTIL_SET_BINARY_VALUEFn?

public fun interface PRESUTIL_SET_DWORD_VALUEFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, pszvaluename: PCWSTR, dwnewvalue: UInt, pdwoutvalue: Long): UInt
}

public typealias PRESUTIL_SET_DWORD_VALUE = PRESUTIL_SET_DWORD_VALUEFn?

public fun interface PRESUTIL_SET_EXPAND_SZ_VALUEFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, ppszoutstring: Long): UInt
}

public typealias PRESUTIL_SET_EXPAND_SZ_VALUE = PRESUTIL_SET_EXPAND_SZ_VALUEFn?

public fun interface PRESUTIL_SET_MULTI_SZ_VALUEFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, cbnewvaluesize: UInt, ppszoutvalue: Long, pcboutvaluesize: Long): UInt
}

public typealias PRESUTIL_SET_MULTI_SZ_VALUE = PRESUTIL_SET_MULTI_SZ_VALUEFn?

public fun interface PRESUTIL_SET_PRIVATE_PROPERTY_LISTFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, pinpropertylist: Long, cbinpropertylistsize: UInt): UInt
}

public typealias PRESUTIL_SET_PRIVATE_PROPERTY_LIST = PRESUTIL_SET_PRIVATE_PROPERTY_LISTFn?

public fun interface PRESUTIL_SET_PROPERTY_PARAMETER_BLOCKFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt
}

public typealias PRESUTIL_SET_PROPERTY_PARAMETER_BLOCK = PRESUTIL_SET_PROPERTY_PARAMETER_BLOCKFn?

public fun interface PRESUTIL_SET_PROPERTY_PARAMETER_BLOCK_EXFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: UInt, bforcewrite: BOOL, poutparams: Long): UInt
}

public typealias PRESUTIL_SET_PROPERTY_PARAMETER_BLOCK_EX = PRESUTIL_SET_PROPERTY_PARAMETER_BLOCK_EXFn?

public fun interface PRESUTIL_SET_PROPERTY_TABLEFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt
}

public typealias PRESUTIL_SET_PROPERTY_TABLE = PRESUTIL_SET_PROPERTY_TABLEFn?

public fun interface PRESUTIL_SET_PROPERTY_TABLE_EXFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, bforcewrite: BOOL, poutparams: Long): UInt
}

public typealias PRESUTIL_SET_PROPERTY_TABLE_EX = PRESUTIL_SET_PROPERTY_TABLE_EXFn?

public fun interface PRESUTIL_SET_QWORD_VALUEFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, pszvaluename: PCWSTR, qwnewvalue: ULong, pqwoutvalue: Long): UInt
}

public typealias PRESUTIL_SET_QWORD_VALUE = PRESUTIL_SET_QWORD_VALUEFn?

public fun interface PRESUTIL_SET_RESOURCE_SERVICE_ENVIRONMENTFn {
    public operator fun invoke(pszservicename: PCWSTR, hresource: HRESOURCE, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt
}

public typealias PRESUTIL_SET_RESOURCE_SERVICE_ENVIRONMENT = PRESUTIL_SET_RESOURCE_SERVICE_ENVIRONMENTFn?

public fun interface PRESUTIL_SET_RESOURCE_SERVICE_START_PARAMETERSFn {
    public operator fun invoke(pszservicename: PCWSTR, schscmhandle: System.Services.SC_HANDLE, phservice: Long, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt
}

public typealias PRESUTIL_SET_RESOURCE_SERVICE_START_PARAMETERS = PRESUTIL_SET_RESOURCE_SERVICE_START_PARAMETERSFn?

public fun interface PRESUTIL_SET_RESOURCE_SERVICE_START_PARAMETERS_EXFn {
    public operator fun invoke(pszservicename: PCWSTR, schscmhandle: System.Services.SC_HANDLE, phservice: Long, dwdesiredaccess: UInt, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt
}

public typealias PRESUTIL_SET_RESOURCE_SERVICE_START_PARAMETERS_EX = PRESUTIL_SET_RESOURCE_SERVICE_START_PARAMETERS_EXFn?

public fun interface PRESUTIL_SET_SZ_VALUEFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, ppszoutstring: Long): UInt
}

public typealias PRESUTIL_SET_SZ_VALUE = PRESUTIL_SET_SZ_VALUEFn?

public fun interface PRESUTIL_SET_UNKNOWN_PROPERTIESFn {
    public operator fun invoke(hkeyclusterkey: System.Registry.HKEY, ppropertytable: Long, pinpropertylist: Long, cbinpropertylistsize: UInt): UInt
}

public typealias PRESUTIL_SET_UNKNOWN_PROPERTIES = PRESUTIL_SET_UNKNOWN_PROPERTIESFn?

public fun interface PRESUTIL_START_RESOURCE_SERVICEFn {
    public operator fun invoke(pszservicename: PCWSTR, phservicehandle: Long): UInt
}

public typealias PRESUTIL_START_RESOURCE_SERVICE = PRESUTIL_START_RESOURCE_SERVICEFn?

public fun interface PRESUTIL_STOP_RESOURCE_SERVICEFn {
    public operator fun invoke(pszservicename: PCWSTR): UInt
}

public typealias PRESUTIL_STOP_RESOURCE_SERVICE = PRESUTIL_STOP_RESOURCE_SERVICEFn?

public fun interface PRESUTIL_STOP_SERVICEFn {
    public operator fun invoke(hservicehandle: System.Services.SC_HANDLE): UInt
}

public typealias PRESUTIL_STOP_SERVICE = PRESUTIL_STOP_SERVICEFn?

public fun interface PRESUTIL_TERMINATE_SERVICE_PROCESS_FROM_RES_DLLFn {
    public operator fun invoke(dwservicepid: UInt, boffline: BOOL, pdwresourcestate: Long, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt
}

public typealias PRESUTIL_TERMINATE_SERVICE_PROCESS_FROM_RES_DLL = PRESUTIL_TERMINATE_SERVICE_PROCESS_FROM_RES_DLLFn?

public fun interface PRESUTIL_VERIFY_PRIVATE_PROPERTY_LISTFn {
    public operator fun invoke(pinpropertylist: Long, cbinpropertylistsize: UInt): UInt
}

public typealias PRESUTIL_VERIFY_PRIVATE_PROPERTY_LIST = PRESUTIL_VERIFY_PRIVATE_PROPERTY_LISTFn?

public fun interface PRESUTIL_VERIFY_PROPERTY_TABLEFn {
    public operator fun invoke(ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt
}

public typealias PRESUTIL_VERIFY_PROPERTY_TABLE = PRESUTIL_VERIFY_PROPERTY_TABLEFn?

public fun interface PRESUTIL_VERIFY_RESOURCE_SERVICEFn {
    public operator fun invoke(pszservicename: PCWSTR): UInt
}

public typealias PRESUTIL_VERIFY_RESOURCE_SERVICE = PRESUTIL_VERIFY_RESOURCE_SERVICEFn?

public fun interface PRESUTIL_VERIFY_SERVICEFn {
    public operator fun invoke(hservicehandle: System.Services.SC_HANDLE): UInt
}

public typealias PRESUTIL_VERIFY_SERVICE = PRESUTIL_VERIFY_SERVICEFn?

public fun interface PRES_UTIL_VERIFY_SHUTDOWN_SAFEFn {
    public operator fun invoke(flags: UInt, reason: UInt, presult: Long): UInt
}

public typealias PRES_UTIL_VERIFY_SHUTDOWN_SAFE = PRES_UTIL_VERIFY_SHUTDOWN_SAFEFn?

public fun interface PSET_INTERNAL_STATEFn {
    public operator fun invoke(param0: Long, statetype: CLUSTER_RESOURCE_APPLICATION_STATE, active: BOOL): UInt
}

public typealias PSET_INTERNAL_STATE = PSET_INTERNAL_STATEFn?

public fun interface PSET_RESOURCE_INMEMORY_NODELOCAL_PROPERTIES_ROUTINEFn {
    public operator fun invoke(resourcehandle: Long, propertylistbuffer: Long, propertylistbuffersize: UInt): UInt
}

public typealias PSET_RESOURCE_INMEMORY_NODELOCAL_PROPERTIES_ROUTINE = PSET_RESOURCE_INMEMORY_NODELOCAL_PROPERTIES_ROUTINEFn?

public fun interface PSET_RESOURCE_LOCKED_MODE_EX_ROUTINEFn {
    public operator fun invoke(resourcehandle: Long, lockedmodeenabled: BOOL, lockedmodereason: UInt, lockedmodeflags: UInt): UInt
}

public typealias PSET_RESOURCE_LOCKED_MODE_EX_ROUTINE = PSET_RESOURCE_LOCKED_MODE_EX_ROUTINEFn?

public fun interface PSET_RESOURCE_LOCKED_MODE_ROUTINEFn {
    public operator fun invoke(resourcehandle: Long, lockedmodeenabled: BOOL, lockedmodereason: UInt): UInt
}

public typealias PSET_RESOURCE_LOCKED_MODE_ROUTINE = PSET_RESOURCE_LOCKED_MODE_ROUTINEFn?

public fun interface PSET_RESOURCE_STATUS_ROUTINEFn {
    public operator fun invoke(resourcehandle: Long, resourcestatus: Long): UInt
}

public typealias PSET_RESOURCE_STATUS_ROUTINE = PSET_RESOURCE_STATUS_ROUTINEFn?

public fun interface PSET_RESOURCE_STATUS_ROUTINE_EXFn {
    public operator fun invoke(resourcehandle: Long, resourcestatus: Long): UInt
}

public typealias PSET_RESOURCE_STATUS_ROUTINE_EX = PSET_RESOURCE_STATUS_ROUTINE_EXFn?

public fun interface PSET_RESOURCE_WPR_POLICY_ROUTINEFn {
    public operator fun invoke(resourcehandle: Long, wprpolicyflags: UInt): UInt
}

public typealias PSET_RESOURCE_WPR_POLICY_ROUTINE = PSET_RESOURCE_WPR_POLICY_ROUTINEFn?

public fun interface PSIGNAL_FAILURE_ROUTINEFn {
    public operator fun invoke(resourcehandle: Long, failuretype: FAILURE_TYPE, applicationspecificerrorcode: UInt): UInt
}

public typealias PSIGNAL_FAILURE_ROUTINE = PSIGNAL_FAILURE_ROUTINEFn?

public fun interface PSTARTUP_EX_ROUTINEFn {
    public operator fun invoke(resourcetype: PCWSTR, minversionsupported: UInt, maxversionsupported: UInt, monitorcallbackfunctions: Long, resourcedllinterfacefunctions: Long): UInt
}

public typealias PSTARTUP_EX_ROUTINE = PSTARTUP_EX_ROUTINEFn?

public fun interface PSTARTUP_ROUTINEFn {
    public operator fun invoke(resourcetype: PCWSTR, minversionsupported: UInt, maxversionsupported: UInt, setresourcestatus: PSET_RESOURCE_STATUS_ROUTINE, logevent: PLOG_EVENT_ROUTINE, functiontable: Long): UInt
}

public typealias PSTARTUP_ROUTINE = PSTARTUP_ROUTINEFn?

public fun interface PTERMINATE_ROUTINEFn {
    public operator fun invoke(resource: Long)
}

public typealias PTERMINATE_ROUTINE = PTERMINATE_ROUTINEFn?

public fun interface PWORKER_START_ROUTINEFn {
    public operator fun invoke(pworker: Long, lpthreadparameter: Long): UInt
}

public typealias PWORKER_START_ROUTINE = PWORKER_START_ROUTINEFn?

public typealias RESDLL_CONTEXT_OPERATION_TYPE = Int

public typealias RESOURCE_EXIT_STATE = Int

public typealias RESOURCE_MONITOR_STATE = Int

public fun interface SET_APP_INSTANCE_CSV_FLAGSFn {
    public operator fun invoke(processhandle: Foundation.HANDLE, mask: UInt, flags: UInt): UInt
}

public typealias SET_APP_INSTANCE_CSV_FLAGS = SET_APP_INSTANCE_CSV_FLAGSFn?

public typealias SR_DISK_REPLICATION_ELIGIBLE = Int

public typealias SR_REPLICATED_DISK_TYPE = Int

public typealias VM_RESDLL_CONTEXT = Int
