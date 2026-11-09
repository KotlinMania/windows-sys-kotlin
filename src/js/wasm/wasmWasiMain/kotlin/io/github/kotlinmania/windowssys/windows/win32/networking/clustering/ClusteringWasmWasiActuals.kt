@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.clustering

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.OBJECT_SECURITY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.security.PSECURITY_DESCRIPTOR
import io.github.kotlinmania.windowssys.windows.win32.system.registry.HKEY
import io.github.kotlinmania.windowssys.windows.win32.system.services.SC_HANDLE

public actual fun AddClusterGroupDependency(hdependentgroup: HGROUP, hprovidergroup: HGROUP): UInt =
    0u

public actual fun AddClusterGroupDependencyEx(hdependentgroup: HGROUP, hprovidergroup: HGROUP, lpszreason: PCWSTR): UInt =
    0u

public actual fun AddClusterGroupSetDependency(hdependentgroupset: HGROUPSET, hprovidergroupset: HGROUPSET): UInt =
    0u

public actual fun AddClusterGroupSetDependencyEx(hdependentgroupset: HGROUPSET, hprovidergroupset: HGROUPSET, lpszreason: PCWSTR): UInt =
    0u

public actual fun AddClusterGroupToGroupSetDependency(hdependentgroup: HGROUP, hprovidergroupset: HGROUPSET): UInt =
    0u

public actual fun AddClusterGroupToGroupSetDependencyEx(hdependentgroup: HGROUP, hprovidergroupset: HGROUPSET, lpszreason: PCWSTR): UInt =
    0u

public actual fun AddClusterNode(hcluster: HCLUSTER, lpsznodename: PCWSTR, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HNODE =
    0L

public actual fun AddClusterNodeEx(hcluster: HCLUSTER, lpsznodename: PCWSTR, dwflags: UInt, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HNODE =
    0L

public actual fun AddClusterResourceDependency(hresource: HRESOURCE, hdependson: HRESOURCE): UInt =
    0u

public actual fun AddClusterResourceDependencyEx(hresource: HRESOURCE, hdependson: HRESOURCE, lpszreason: PCWSTR): UInt =
    0u

public actual fun AddClusterResourceNode(hresource: HRESOURCE, hnode: HNODE): UInt =
    0u

public actual fun AddClusterResourceNodeEx(hresource: HRESOURCE, hnode: HNODE, lpszreason: PCWSTR): UInt =
    0u

public actual fun AddClusterStorageNode(hcluster: HCLUSTER, lpsznodename: PCWSTR, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long, lpszclusterstoragenodedescription: PCWSTR, lpszclusterstoragenodelocation: PCWSTR): UInt =
    0u

public actual fun AddCrossClusterGroupSetDependency(hdependentgroupset: HGROUPSET, lpremoteclustername: PCWSTR, lpremotegroupsetname: PCWSTR): UInt =
    0u

public actual fun AddResourceToClusterSharedVolumes(hresource: HRESOURCE): UInt =
    0u

public actual fun BackupClusterDatabase(hcluster: HCLUSTER, lpszpathname: PCWSTR): UInt =
    0u

public actual fun CanResourceBeDependent(hresource: HRESOURCE, hresourcedependent: HRESOURCE): BOOL =
    0

public actual fun CancelClusterGroupOperation(hgroup: HGROUP, dwcancelflags_reserved: UInt): UInt =
    0u

public actual fun ChangeClusterResourceGroup(hresource: HRESOURCE, hgroup: HGROUP): UInt =
    0u

public actual fun ChangeClusterResourceGroupEx(hresource: HRESOURCE, hgroup: HGROUP, flags: ULong): UInt =
    0u

public actual fun ChangeClusterResourceGroupEx2(hresource: HRESOURCE, hgroup: HGROUP, flags: ULong, lpszreason: PCWSTR): UInt =
    0u

public actual fun CloseCluster(hcluster: HCLUSTER): BOOL =
    0

public actual fun CloseClusterCryptProvider(hcluscryptprovider: HCLUSCRYPTPROVIDER): UInt =
    0u

public actual fun CloseClusterGroup(hgroup: HGROUP): BOOL =
    0

public actual fun CloseClusterGroupSet(hgroupset: HGROUPSET): BOOL =
    0

public actual fun CloseClusterNetInterface(hnetinterface: HNETINTERFACE): BOOL =
    0

public actual fun CloseClusterNetwork(hnetwork: HNETWORK): BOOL =
    0

public actual fun CloseClusterNode(hnode: HNODE): BOOL =
    0

public actual fun CloseClusterNotifyPort(hchange: HCHANGE): BOOL =
    0

public actual fun CloseClusterResource(hresource: HRESOURCE): BOOL =
    0

public actual fun ClusAddClusterHealthFault(hcluster: HCLUSTER, failure: Long, param2: UInt): UInt =
    0u

public actual fun ClusGetClusterHealthFaults(hcluster: HCLUSTER, objects: Long, flags: UInt): UInt =
    0u

public actual fun ClusRemoveClusterHealthFault(hcluster: HCLUSTER, id: PCWSTR, flags: UInt): UInt =
    0u

public actual fun ClusWorkerCheckTerminate(lpworker: Long): BOOL =
    0

public actual fun ClusWorkerCreate(lpworker: Long, lpstartaddress: PWORKER_START_ROUTINE, lpparameter: Long): UInt =
    0u

public actual fun ClusWorkerTerminate(lpworker: Long) {
}

public actual fun ClusWorkerTerminateEx(clusworker: Long, timeoutinmilliseconds: UInt, waitonly: BOOL): UInt =
    0u

public actual fun ClusWorkersTerminate(clusworkers: Long, clusworkerscount: ULong, timeoutinmilliseconds: UInt, waitonly: BOOL): UInt =
    0u

public actual fun ClusapiSetReasonHandler(lphandler: Long): Long =
    0L

public actual fun ClusterAddGroupToAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR, hgroup: HGROUP): UInt =
    0u

public actual fun ClusterAddGroupToGroupSet(hgroupset: HGROUPSET, hgroup: HGROUP): UInt =
    0u

public actual fun ClusterAddGroupToGroupSetWithDomains(hgroupset: HGROUPSET, hgroup: HGROUP, faultdomain: UInt, updatedomain: UInt): UInt =
    0u

public actual fun ClusterAddGroupToGroupSetWithDomainsEx(hgroupset: HGROUPSET, hgroup: HGROUP, faultdomain: UInt, updatedomain: UInt, lpszreason: PCWSTR): UInt =
    0u

public actual fun ClusterAffinityRuleControl(hcluster: HCLUSTER, affinityrulename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    0u

public actual fun ClusterClearBackupStateForSharedVolume(lpszvolumepathname: PCWSTR): UInt =
    0u

public actual fun ClusterCloseEnum(henum: HCLUSENUM): UInt =
    0u

public actual fun ClusterCloseEnumEx(hclusterenum: HCLUSENUMEX): UInt =
    0u

public actual fun ClusterControl(hcluster: HCLUSTER, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    0u

public actual fun ClusterControlEx(hcluster: HCLUSTER, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    0u

public actual fun ClusterCreateAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR, ruletype: CLUS_AFFINITY_RULE_TYPE): UInt =
    0u

public actual fun ClusterDecrypt(hcluscryptprovider: HCLUSCRYPTPROVIDER, pcryptinput: Long, cbcryptinput: UInt, ppcryptoutput: Long, pcbcryptoutput: Long): UInt =
    0u

public actual fun ClusterEncrypt(hcluscryptprovider: HCLUSCRYPTPROVIDER, pdata: Long, cbdata: UInt, ppdata: Long, pcbdata: Long): UInt =
    0u

public actual fun ClusterEnum(henum: HCLUSENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    0u

public actual fun ClusterEnumEx(hclusterenum: HCLUSENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    0u

public actual fun ClusterGetEnumCount(henum: HCLUSENUM): UInt =
    0u

public actual fun ClusterGetEnumCountEx(hclusterenum: HCLUSENUMEX): UInt =
    0u

public actual fun ClusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: PCWSTR, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL =
    0

public actual fun ClusterGetVolumePathName(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, cchbufferlength: UInt): BOOL =
    0

public actual fun ClusterGroupCloseEnum(hgroupenum: HGROUPENUM): UInt =
    0u

public actual fun ClusterGroupCloseEnumEx(hgroupenumex: HGROUPENUMEX): UInt =
    0u

public actual fun ClusterGroupControl(hgroup: HGROUP, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    0u

public actual fun ClusterGroupControlEx(hgroup: HGROUP, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    0u

public actual fun ClusterGroupEnum(hgroupenum: HGROUPENUM, dwindex: UInt, lpdwtype: Long, lpszresourcename: PWSTR, lpcchname: Long): UInt =
    0u

public actual fun ClusterGroupEnumEx(hgroupenumex: HGROUPENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    0u

public actual fun ClusterGroupGetEnumCount(hgroupenum: HGROUPENUM): UInt =
    0u

public actual fun ClusterGroupGetEnumCountEx(hgroupenumex: HGROUPENUMEX): UInt =
    0u

public actual fun ClusterGroupOpenEnum(hgroup: HGROUP, dwtype: UInt): HGROUPENUM =
    0L

public actual fun ClusterGroupOpenEnumEx(hcluster: HCLUSTER, lpszproperties: PCWSTR, cbproperties: UInt, lpszroproperties: PCWSTR, cbroproperties: UInt, dwflags: UInt): HGROUPENUMEX =
    0L

public actual fun ClusterGroupSetCloseEnum(hgroupsetenum: HGROUPSETENUM): UInt =
    0u

public actual fun ClusterGroupSetControl(hgroupset: HGROUPSET, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    0u

public actual fun ClusterGroupSetControlEx(hgroupset: HGROUPSET, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    0u

public actual fun ClusterGroupSetEnum(hgroupsetenum: HGROUPSETENUM, dwindex: UInt, lpszname: PWSTR, lpcchname: Long): UInt =
    0u

public actual fun ClusterGroupSetGetEnumCount(hgroupsetenum: HGROUPSETENUM): UInt =
    0u

public actual fun ClusterGroupSetOpenEnum(hcluster: HCLUSTER): HGROUPSETENUM =
    0L

public actual fun ClusterIsPathOnSharedVolume(lpszpathname: PCWSTR): BOOL =
    0

public actual fun ClusterNetInterfaceCloseEnum(hnetinterfaceenum: HNETINTERFACEENUM): UInt =
    0u

public actual fun ClusterNetInterfaceControl(hnetinterface: HNETINTERFACE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    0u

public actual fun ClusterNetInterfaceControlEx(hnetinterface: HNETINTERFACE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    0u

public actual fun ClusterNetInterfaceEnum(hnetinterfaceenum: HNETINTERFACEENUM, dwindex: UInt, lpszname: PWSTR, lpcchname: Long): UInt =
    0u

public actual fun ClusterNetInterfaceOpenEnum(hcluster: HCLUSTER, lpsznodename: PCWSTR, lpsznetworkname: PCWSTR): HNETINTERFACEENUM =
    0L

public actual fun ClusterNetworkCloseEnum(hnetworkenum: HNETWORKENUM): UInt =
    0u

public actual fun ClusterNetworkControl(hnetwork: HNETWORK, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    0u

public actual fun ClusterNetworkControlEx(hnetwork: HNETWORK, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    0u

public actual fun ClusterNetworkEnum(hnetworkenum: HNETWORKENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    0u

public actual fun ClusterNetworkGetEnumCount(hnetworkenum: HNETWORKENUM): UInt =
    0u

public actual fun ClusterNetworkOpenEnum(hnetwork: HNETWORK, dwtype: UInt): HNETWORKENUM =
    0L

public actual fun ClusterNodeCloseEnum(hnodeenum: HNODEENUM): UInt =
    0u

public actual fun ClusterNodeCloseEnumEx(hnodeenum: HNODEENUMEX): UInt =
    0u

public actual fun ClusterNodeControl(hnode: HNODE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    0u

public actual fun ClusterNodeControlEx(hnode: HNODE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    0u

public actual fun ClusterNodeEnum(hnodeenum: HNODEENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    0u

public actual fun ClusterNodeEnumEx(hnodeenum: HNODEENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    0u

public actual fun ClusterNodeGetEnumCount(hnodeenum: HNODEENUM): UInt =
    0u

public actual fun ClusterNodeGetEnumCountEx(hnodeenum: HNODEENUMEX): UInt =
    0u

public actual fun ClusterNodeOpenEnum(hnode: HNODE, dwtype: UInt): HNODEENUM =
    0L

public actual fun ClusterNodeOpenEnumEx(hnode: HNODE, dwtype: UInt, poptions: Long): HNODEENUMEX =
    0L

public actual fun ClusterNodeReplacement(hcluster: HCLUSTER, lpsznodenamecurrent: PCWSTR, lpsznodenamenew: PCWSTR): UInt =
    0u

public actual fun ClusterOpenEnum(hcluster: HCLUSTER, dwtype: UInt): HCLUSENUM =
    0L

public actual fun ClusterOpenEnumEx(hcluster: HCLUSTER, dwtype: UInt, poptions: Long): HCLUSENUMEX =
    0L

public actual fun ClusterPrepareSharedVolumeForBackup(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, lpcchvolumepathname: Long, lpszvolumename: PWSTR, lpcchvolumename: Long): UInt =
    0u

public actual fun ClusterRegBatchAddCommand(hregbatch: HREGBATCH, dwcommand: CLUSTER_REG_COMMAND, wzname: PCWSTR, dwoptions: UInt, lpdata: Long, cbdata: UInt): Int =
    0

public actual fun ClusterRegBatchCloseNotification(hbatchnotification: HREGBATCHNOTIFICATION): Int =
    0

public actual fun ClusterRegBatchReadCommand(hbatchnotification: HREGBATCHNOTIFICATION, pbatchcommand: Long): Int =
    0

public actual fun ClusterRegCloseBatch(hregbatch: HREGBATCH, bcommit: BOOL, failedcommandnumber: Long): Int =
    0

public actual fun ClusterRegCloseBatchEx(hregbatch: HREGBATCH, flags: UInt, failedcommandnumber: Long): Int =
    0

public actual fun ClusterRegCloseBatchNotifyPort(hbatchnotifyport: HREGBATCHPORT): Int =
    0

public actual fun ClusterRegCloseKey(hkey: HKEY): Int =
    0

public actual fun ClusterRegCloseReadBatch(hregreadbatch: HREGREADBATCH, phregreadbatchreply: Long): Int =
    0

public actual fun ClusterRegCloseReadBatchEx(hregreadbatch: HREGREADBATCH, flags: UInt, phregreadbatchreply: Long): Int =
    0

public actual fun ClusterRegCloseReadBatchReply(hregreadbatchreply: HREGREADBATCHREPLY): Int =
    0

public actual fun ClusterRegCreateBatch(hkey: HKEY, phregbatch: Long): Int =
    0

public actual fun ClusterRegCreateBatchNotifyPort(hkey: HKEY, phbatchnotifyport: Long): Int =
    0

public actual fun ClusterRegCreateKey(hkey: HKEY, lpszsubkey: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int =
    0

public actual fun ClusterRegCreateKeyEx(hkey: HKEY, lpsubkey: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, lpszreason: PCWSTR): Int =
    0

public actual fun ClusterRegCreateReadBatch(hkey: HKEY, phregreadbatch: Long): Int =
    0

public actual fun ClusterRegDeleteKey(hkey: HKEY, lpszsubkey: PCWSTR): Int =
    0

public actual fun ClusterRegDeleteKeyEx(hkey: HKEY, lpsubkey: PCWSTR, lpszreason: PCWSTR): Int =
    0

public actual fun ClusterRegDeleteValue(hkey: HKEY, lpszvaluename: PCWSTR): UInt =
    0u

public actual fun ClusterRegDeleteValueEx(hkey: HKEY, lpszvaluename: PCWSTR, lpszreason: PCWSTR): UInt =
    0u

public actual fun ClusterRegEnumKey(hkey: HKEY, dwindex: UInt, lpszname: PWSTR, lpcchname: Long, lpftlastwritetime: Long): Int =
    0

public actual fun ClusterRegEnumValue(hkey: HKEY, dwindex: UInt, lpszvaluename: PWSTR, lpcchvaluename: Long, lpdwtype: Long, lpdata: Long, lpcbdata: Long): UInt =
    0u

public actual fun ClusterRegGetBatchNotification(hbatchnotify: HREGBATCHPORT, phbatchnotification: Long): Int =
    0

public actual fun ClusterRegGetKeySecurity(hkey: HKEY, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): Int =
    0

public actual fun ClusterRegOpenKey(hkey: HKEY, lpszsubkey: PCWSTR, samdesired: UInt, phkresult: Long): Int =
    0

public actual fun ClusterRegQueryInfoKey(hkey: HKEY, lpcsubkeys: Long, lpcchmaxsubkeylen: Long, lpcvalues: Long, lpcchmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int =
    0

public actual fun ClusterRegQueryValue(hkey: HKEY, lpszvaluename: PCWSTR, lpdwvaluetype: Long, lpdata: Long, lpcbdata: Long): Int =
    0

public actual fun ClusterRegReadBatchAddCommand(hregreadbatch: HREGREADBATCH, wzsubkeyname: PCWSTR, wzvaluename: PCWSTR): Int =
    0

public actual fun ClusterRegReadBatchReplyNextCommand(hregreadbatchreply: HREGREADBATCHREPLY, pbatchcommand: Long): Int =
    0

public actual fun ClusterRegSetKeySecurity(hkey: HKEY, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): Int =
    0

public actual fun ClusterRegSetKeySecurityEx(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpszreason: PCWSTR): Int =
    0

public actual fun ClusterRegSetValue(hkey: HKEY, lpszvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): UInt =
    0u

public actual fun ClusterRegSetValueEx(hkey: HKEY, lpszvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt, lpszreason: PCWSTR): UInt =
    0u

public actual fun ClusterRegSyncDatabase(hcluster: HCLUSTER, flags: UInt): Int =
    0

public actual fun ClusterRemoveAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR): UInt =
    0u

public actual fun ClusterRemoveGroupFromAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR, hgroup: HGROUP): UInt =
    0u

public actual fun ClusterRemoveGroupFromGroupSet(hgroup: HGROUP): UInt =
    0u

public actual fun ClusterRemoveGroupFromGroupSetEx(hgroup: HGROUP, lpszreason: PCWSTR): UInt =
    0u

public actual fun ClusterResourceCloseEnum(hresenum: HRESENUM): UInt =
    0u

public actual fun ClusterResourceCloseEnumEx(hresourceenumex: HRESENUMEX): UInt =
    0u

public actual fun ClusterResourceControl(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    0u

public actual fun ClusterResourceControlAsUser(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    0u

public actual fun ClusterResourceControlAsUserEx(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    0u

public actual fun ClusterResourceControlEx(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    0u

public actual fun ClusterResourceEnum(hresenum: HRESENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    0u

public actual fun ClusterResourceEnumEx(hresourceenumex: HRESENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    0u

public actual fun ClusterResourceGetEnumCount(hresenum: HRESENUM): UInt =
    0u

public actual fun ClusterResourceGetEnumCountEx(hresourceenumex: HRESENUMEX): UInt =
    0u

public actual fun ClusterResourceOpenEnum(hresource: HRESOURCE, dwtype: UInt): HRESENUM =
    0L

public actual fun ClusterResourceOpenEnumEx(hcluster: HCLUSTER, lpszproperties: PCWSTR, cbproperties: UInt, lpszroproperties: PCWSTR, cbroproperties: UInt, dwflags: UInt): HRESENUMEX =
    0L

public actual fun ClusterResourceTypeCloseEnum(hrestypeenum: HRESTYPEENUM): UInt =
    0u

public actual fun ClusterResourceTypeControl(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    0u

public actual fun ClusterResourceTypeControlAsUser(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    0u

public actual fun ClusterResourceTypeControlAsUserEx(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    0u

public actual fun ClusterResourceTypeControlEx(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    0u

public actual fun ClusterResourceTypeEnum(hrestypeenum: HRESTYPEENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    0u

public actual fun ClusterResourceTypeGetEnumCount(hrestypeenum: HRESTYPEENUM): UInt =
    0u

public actual fun ClusterResourceTypeOpenEnum(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, dwtype: UInt): HRESTYPEENUM =
    0L

public actual fun ClusterSetAccountAccess(hcluster: HCLUSTER, szaccountsid: PCWSTR, dwaccess: UInt, dwcontroltype: UInt): UInt =
    0u

public actual fun ClusterSharedVolumeSetSnapshotState(guidsnapshotset: GUID, lpszvolumename: PCWSTR, state: CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE): UInt =
    0u

public actual fun ClusterUpgradeFunctionalLevel(hcluster: HCLUSTER, perform: BOOL, pfnprogresscallback: PCLUSTER_UPGRADE_PROGRESS_CALLBACK, pvcallbackarg: Long): UInt =
    0u

public actual fun CreateCluster(pconfig: Long, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HCLUSTER =
    0L

public actual fun CreateClusterAvailabilitySet(hcluster: HCLUSTER, lpavailabilitysetname: PCWSTR, pavailabilitysetconfig: Long): HGROUPSET =
    0L

public actual fun CreateClusterGroup(hcluster: HCLUSTER, lpszgroupname: PCWSTR): HGROUP =
    0L

public actual fun CreateClusterGroupEx(hcluster: HCLUSTER, lpszgroupname: PCWSTR, pgroupinfo: Long): HGROUP =
    0L

public actual fun CreateClusterGroupSet(hcluster: HCLUSTER, groupsetname: PCWSTR): HGROUPSET =
    0L

public actual fun CreateClusterNameAccount(hcluster: HCLUSTER, pconfig: Long, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): UInt =
    0u

public actual fun CreateClusterNotifyPort(hchange: HCHANGE, hcluster: HCLUSTER, dwfilter: UInt, dwnotifykey: ULong): HCHANGE =
    0L

public actual fun CreateClusterNotifyPortV2(hchange: HCHANGE, hcluster: HCLUSTER, filters: Long, dwfiltercount: UInt, dwnotifykey: ULong): HCHANGE =
    0L

public actual fun CreateClusterResource(hgroup: HGROUP, lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwflags: UInt): HRESOURCE =
    0L

public actual fun CreateClusterResourceEx(hgroup: HGROUP, lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwflags: UInt, lpszreason: PCWSTR): HRESOURCE =
    0L

public actual fun CreateClusterResourceType(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, lpszdisplayname: PCWSTR, lpszresourcetypedll: PCWSTR, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt): UInt =
    0u

public actual fun CreateClusterResourceTypeEx(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, lpszdisplayname: PCWSTR, lpszresourcetypedll: PCWSTR, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt, lpszreason: PCWSTR): UInt =
    0u

public actual fun DeleteClusterGroup(hgroup: HGROUP): UInt =
    0u

public actual fun DeleteClusterGroupEx(hgroup: HGROUP, lpszreason: PCWSTR): UInt =
    0u

public actual fun DeleteClusterGroupSet(hgroupset: HGROUPSET): UInt =
    0u

public actual fun DeleteClusterGroupSetEx(hgroupset: HGROUPSET, lpszreason: PCWSTR): UInt =
    0u

public actual fun DeleteClusterResource(hresource: HRESOURCE): UInt =
    0u

public actual fun DeleteClusterResourceEx(hresource: HRESOURCE, lpszreason: PCWSTR): UInt =
    0u

public actual fun DeleteClusterResourceType(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR): UInt =
    0u

public actual fun DeleteClusterResourceTypeEx(hcluster: HCLUSTER, lpsztypename: PCWSTR, lpszreason: PCWSTR): UInt =
    0u

public actual fun DestroyCluster(hcluster: HCLUSTER, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long, fdeletevirtualcomputerobjects: BOOL): UInt =
    0u

public actual fun DestroyClusterGroup(hgroup: HGROUP): UInt =
    0u

public actual fun DestroyClusterGroupEx(hgroup: HGROUP, lpszreason: PCWSTR): UInt =
    0u

public actual fun DetermineCNOResTypeFromCluster(hcluster: HCLUSTER, pcnorestype: Long): UInt =
    0u

public actual fun DetermineCNOResTypeFromNodelist(cnodes: UInt, ppsznodenames: Long, pcnorestype: Long): UInt =
    0u

public actual fun DetermineClusterCloudTypeFromCluster(hcluster: HCLUSTER, pcloudtype: Long): UInt =
    0u

public actual fun DetermineClusterCloudTypeFromNodelist(cnodes: UInt, ppsznodenames: Long, pcloudtype: Long): UInt =
    0u

public actual fun EvictClusterNode(hnode: HNODE): UInt =
    0u

public actual fun EvictClusterNodeEx(hnode: HNODE, dwtimeout: UInt, phrcleanupstatus: Long): UInt =
    0u

public actual fun EvictClusterNodeEx2(hnode: HNODE, dwtimeout: UInt, phrcleanupstatus: Long, lpszreason: PCWSTR): UInt =
    0u

public actual fun FailClusterResource(hresource: HRESOURCE): UInt =
    0u

public actual fun FailClusterResourceEx(hresource: HRESOURCE, lpszreason: PCWSTR): UInt =
    0u

public actual fun FreeClusterCrypt(pcryptinfo: Long): UInt =
    0u

public actual fun FreeClusterHealthFault(clusterhealthfault: Long): UInt =
    0u

public actual fun FreeClusterHealthFaultArray(clusterhealthfaultarray: Long): UInt =
    0u

public actual fun GetClusterFromGroup(hgroup: HGROUP): HCLUSTER =
    0L

public actual fun GetClusterFromNetInterface(hnetinterface: HNETINTERFACE): HCLUSTER =
    0L

public actual fun GetClusterFromNetwork(hnetwork: HNETWORK): HCLUSTER =
    0L

public actual fun GetClusterFromNode(hnode: HNODE): HCLUSTER =
    0L

public actual fun GetClusterFromResource(hresource: HRESOURCE): HCLUSTER =
    0L

public actual fun GetClusterGroupKey(hgroup: HGROUP, samdesired: UInt): HKEY =
    0L

public actual fun GetClusterGroupState(hgroup: HGROUP, lpsznodename: PWSTR, lpcchnodename: Long): CLUSTER_GROUP_STATE =
    0

public actual fun GetClusterInformation(hcluster: HCLUSTER, lpszclustername: PWSTR, lpcchclustername: Long, lpclusterinfo: Long): UInt =
    0u

public actual fun GetClusterKey(hcluster: HCLUSTER, samdesired: UInt): HKEY =
    0L

public actual fun GetClusterNetInterface(hcluster: HCLUSTER, lpsznodename: PCWSTR, lpsznetworkname: PCWSTR, lpszinterfacename: PWSTR, lpcchinterfacename: Long): UInt =
    0u

public actual fun GetClusterNetInterfaceKey(hnetinterface: HNETINTERFACE, samdesired: UInt): HKEY =
    0L

public actual fun GetClusterNetInterfaceState(hnetinterface: HNETINTERFACE): CLUSTER_NETINTERFACE_STATE =
    0

public actual fun GetClusterNetworkId(hnetwork: HNETWORK, lpsznetworkid: PWSTR, lpcchname: Long): UInt =
    0u

public actual fun GetClusterNetworkKey(hnetwork: HNETWORK, samdesired: UInt): HKEY =
    0L

public actual fun GetClusterNetworkState(hnetwork: HNETWORK): CLUSTER_NETWORK_STATE =
    0

public actual fun GetClusterNodeId(hnode: HNODE, lpsznodeid: PWSTR, lpcchname: Long): UInt =
    0u

public actual fun GetClusterNodeKey(hnode: HNODE, samdesired: UInt): HKEY =
    0L

public actual fun GetClusterNodeState(hnode: HNODE): CLUSTER_NODE_STATE =
    0

public actual fun GetClusterNotify(hchange: HCHANGE, lpdwnotifykey: Long, lpdwfiltertype: Long, lpszname: PWSTR, lpcchname: Long, dwmilliseconds: UInt): UInt =
    0u

public actual fun GetClusterNotifyV2(hchange: HCHANGE, lpdwnotifykey: Long, pfilterandtype: Long, buffer: Long, lpbbuffersize: Long, lpszobjectid: PWSTR, lpcchobjectid: Long, lpszparentid: PWSTR, lpcchparentid: Long, lpszname: PWSTR, lpcchname: Long, lpsztype: PWSTR, lpcchtype: Long, dwmilliseconds: UInt): UInt =
    0u

public actual fun GetClusterQuorumResource(hcluster: HCLUSTER, lpszresourcename: PWSTR, lpcchresourcename: Long, lpszdevicename: PWSTR, lpcchdevicename: Long, lpdwmaxquorumlogsize: Long): UInt =
    0u

public actual fun GetClusterResourceDependencyExpression(hresource: HRESOURCE, lpszdependencyexpression: PWSTR, lpcchdependencyexpression: Long): UInt =
    0u

public actual fun GetClusterResourceKey(hresource: HRESOURCE, samdesired: UInt): HKEY =
    0L

public actual fun GetClusterResourceNetworkName(hresource: HRESOURCE, lpbuffer: PWSTR, nsize: Long): BOOL =
    0

public actual fun GetClusterResourceState(hresource: HRESOURCE, lpsznodename: PWSTR, lpcchnodename: Long, lpszgroupname: PWSTR, lpcchgroupname: Long): CLUSTER_RESOURCE_STATE =
    0

public actual fun GetClusterResourceTypeKey(hcluster: HCLUSTER, lpsztypename: PCWSTR, samdesired: UInt): HKEY =
    0L

public actual fun GetNodeCloudTypeDW(ppsznodename: PCWSTR, nodecloudtype: Long): UInt =
    0u

public actual fun GetNodeClusterState(lpsznodename: PCWSTR, pdwclusterstate: Long): UInt =
    0u

public actual fun GetNotifyEventHandle(hchange: HCHANGE, lphtargetevent: Long): UInt =
    0u

public actual fun InitializeClusterHealthFault(clusterhealthfault: Long): UInt =
    0u

public actual fun InitializeClusterHealthFaultArray(clusterhealthfaultarray: Long): UInt =
    0u

public actual fun IsFileOnClusterSharedVolume(lpszpathname: PCWSTR, pbfileisonsharedvolume: Long): UInt =
    0u

public actual fun MoveClusterGroup(hgroup: HGROUP, hdestinationnode: HNODE): UInt =
    0u

public actual fun MoveClusterGroupEx(hgroup: HGROUP, hdestinationnode: HNODE, dwmoveflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    0u

public actual fun MoveClusterGroupEx2(hgroup: HGROUP, hdestinationnode: HNODE, dwmoveflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    0u

public actual fun OfflineClusterGroup(hgroup: HGROUP): UInt =
    0u

public actual fun OfflineClusterGroupEx(hgroup: HGROUP, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    0u

public actual fun OfflineClusterGroupEx2(hgroup: HGROUP, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    0u

public actual fun OfflineClusterResource(hresource: HRESOURCE): UInt =
    0u

public actual fun OfflineClusterResourceEx(hresource: HRESOURCE, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    0u

public actual fun OfflineClusterResourceEx2(hresource: HRESOURCE, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    0u

public actual fun OnlineClusterGroup(hgroup: HGROUP, hdestinationnode: HNODE): UInt =
    0u

public actual fun OnlineClusterGroupEx(hgroup: HGROUP, hdestinationnode: HNODE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    0u

public actual fun OnlineClusterGroupEx2(hgroup: HGROUP, hdestinationnode: HNODE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    0u

public actual fun OnlineClusterResource(hresource: HRESOURCE): UInt =
    0u

public actual fun OnlineClusterResourceEx(hresource: HRESOURCE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    0u

public actual fun OnlineClusterResourceEx2(hresource: HRESOURCE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    0u

public actual fun OpenCluster(lpszclustername: PCWSTR): HCLUSTER =
    0L

public actual fun OpenClusterCryptProvider(lpszresource: PCWSTR, lpszprovider: Long, dwtype: UInt, dwflags: UInt): HCLUSCRYPTPROVIDER =
    0L

public actual fun OpenClusterCryptProviderEx(lpszresource: PCWSTR, lpszkeyname: PCWSTR, lpszprovider: Long, dwtype: UInt, dwflags: UInt): HCLUSCRYPTPROVIDER =
    0L

public actual fun OpenClusterEx(lpszclustername: PCWSTR, desiredaccess: UInt, grantedaccess: Long): HCLUSTER =
    0L

public actual fun OpenClusterGroup(hcluster: HCLUSTER, lpszgroupname: PCWSTR): HGROUP =
    0L

public actual fun OpenClusterGroupEx(hcluster: HCLUSTER, lpszgroupname: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HGROUP =
    0L

public actual fun OpenClusterGroupSet(hcluster: HCLUSTER, lpszgroupsetname: PCWSTR): HGROUPSET =
    0L

public actual fun OpenClusterNetInterface(hcluster: HCLUSTER, lpszinterfacename: PCWSTR): HNETINTERFACE =
    0L

public actual fun OpenClusterNetInterfaceEx(hcluster: HCLUSTER, lpszinterfacename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNETINTERFACE =
    0L

public actual fun OpenClusterNetwork(hcluster: HCLUSTER, lpsznetworkname: PCWSTR): HNETWORK =
    0L

public actual fun OpenClusterNetworkEx(hcluster: HCLUSTER, lpsznetworkname: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNETWORK =
    0L

public actual fun OpenClusterNode(hcluster: HCLUSTER, lpsznodename: PCWSTR): HNODE =
    0L

public actual fun OpenClusterNodeById(hcluster: HCLUSTER, nodeid: UInt): HNODE =
    0L

public actual fun OpenClusterNodeEx(hcluster: HCLUSTER, lpsznodename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNODE =
    0L

public actual fun OpenClusterResource(hcluster: HCLUSTER, lpszresourcename: PCWSTR): HRESOURCE =
    0L

public actual fun OpenClusterResourceEx(hcluster: HCLUSTER, lpszresourcename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HRESOURCE =
    0L

public actual fun PauseClusterNode(hnode: HNODE): UInt =
    0u

public actual fun PauseClusterNodeEx(hnode: HNODE, bdrainnode: BOOL, dwpauseflags: UInt, hnodedraintarget: HNODE): UInt =
    0u

public actual fun PauseClusterNodeEx2(hnode: HNODE, bdrainnode: BOOL, dwpauseflags: UInt, hnodedraintarget: HNODE, lpszreason: PCWSTR): UInt =
    0u

public actual fun QueryAppInstanceVersion(appinstanceid: Long, instanceversionhigh: Long, instanceversionlow: Long, versionstatus: Long): UInt =
    0u

public actual fun RegisterAppInstance(processhandle: HANDLE, appinstanceid: Long, childreninheritappinstance: BOOL): UInt =
    0u

public actual fun RegisterAppInstanceVersion(appinstanceid: Long, instanceversionhigh: ULong, instanceversionlow: ULong): UInt =
    0u

public actual fun RegisterClusterNotify(hchange: HCHANGE, dwfiltertype: UInt, hobject: HANDLE, dwnotifykey: ULong): UInt =
    0u

public actual fun RegisterClusterNotifyV2(hchange: HCHANGE, filter: NOTIFY_FILTER_AND_TYPE, hobject: HANDLE, dwnotifykey: ULong): UInt =
    0u

public actual fun RegisterClusterResourceTypeNotifyV2(hchange: HCHANGE, hcluster: HCLUSTER, flags: Long, restypename: PCWSTR, dwnotifykey: ULong): UInt =
    0u

public actual fun RemoveClusterGroupDependency(hgroup: HGROUP, hdependson: HGROUP): UInt =
    0u

public actual fun RemoveClusterGroupDependencyEx(hgroup: HGROUP, hdependson: HGROUP, lpszreason: PCWSTR): UInt =
    0u

public actual fun RemoveClusterGroupSetDependency(hgroupset: HGROUPSET, hdependson: HGROUPSET): UInt =
    0u

public actual fun RemoveClusterGroupSetDependencyEx(hgroupset: HGROUPSET, hdependson: HGROUPSET, lpszreason: PCWSTR): UInt =
    0u

public actual fun RemoveClusterGroupToGroupSetDependency(hgroup: HGROUP, hdependson: HGROUPSET): UInt =
    0u

public actual fun RemoveClusterGroupToGroupSetDependencyEx(hgroup: HGROUP, hdependson: HGROUPSET, lpszreason: PCWSTR): UInt =
    0u

public actual fun RemoveClusterNameAccount(hcluster: HCLUSTER, bdeletecomputerobjects: BOOL): UInt =
    0u

public actual fun RemoveClusterResourceDependency(hresource: HRESOURCE, hdependson: HRESOURCE): UInt =
    0u

public actual fun RemoveClusterResourceDependencyEx(hresource: HRESOURCE, hdependson: HRESOURCE, lpszreason: PCWSTR): UInt =
    0u

public actual fun RemoveClusterResourceNode(hresource: HRESOURCE, hnode: HNODE): UInt =
    0u

public actual fun RemoveClusterResourceNodeEx(hresource: HRESOURCE, hnode: HNODE, lpszreason: PCWSTR): UInt =
    0u

public actual fun RemoveClusterStorageNode(hcluster: HCLUSTER, lpszclusterstorageenclosurename: PCWSTR, dwtimeout: UInt, dwflags: UInt): UInt =
    0u

public actual fun RemoveCrossClusterGroupSetDependency(hdependentgroupset: HGROUPSET, lpremoteclustername: PCWSTR, lpremotegroupsetname: PCWSTR): UInt =
    0u

public actual fun RemoveResourceFromClusterSharedVolumes(hresource: HRESOURCE): UInt =
    0u

public actual fun ResUtilAddUnknownProperties(hkeyclusterkey: HKEY, ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    0u

public actual fun ResUtilCreateDirectoryTree(pszpath: PCWSTR): UInt =
    0u

public actual fun ResUtilDupGroup(group: HGROUP, copy: Long): UInt =
    0u

public actual fun ResUtilDupParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long): UInt =
    0u

public actual fun ResUtilDupResource(group: HRESOURCE, copy: Long): UInt =
    0u

public actual fun ResUtilDupString(pszinstring: PCWSTR): PWSTR =
    0L

public actual fun ResUtilEnumGroups(hcluster: HCLUSTER, hself: HGROUP, prescallback: LPGROUP_CALLBACK_EX, pparameter: Long): UInt =
    0u

public actual fun ResUtilEnumGroupsEx(hcluster: HCLUSTER, hself: HGROUP, grouptype: CLUSGROUP_TYPE, prescallback: LPGROUP_CALLBACK_EX, pparameter: Long): UInt =
    0u

public actual fun ResUtilEnumPrivateProperties(hkeyclusterkey: HKEY, pszoutproperties: PWSTR, cboutpropertiessize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    0u

public actual fun ResUtilEnumProperties(ppropertytable: Long, pszoutproperties: PWSTR, cboutpropertiessize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    0u

public actual fun ResUtilEnumResources(hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK, pparameter: Long): UInt =
    0u

public actual fun ResUtilEnumResourcesEx(hcluster: HCLUSTER, hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long): UInt =
    0u

public actual fun ResUtilEnumResourcesEx2(hcluster: HCLUSTER, hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long, dwdesiredaccess: UInt): UInt =
    0u

public actual fun ResUtilExpandEnvironmentStrings(pszsrc: PCWSTR): PWSTR =
    0L

public actual fun ResUtilFindBinaryProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pbpropertyvalue: Long, pcbpropertyvaluesize: Long): UInt =
    0u

public actual fun ResUtilFindDependentDiskResourceDriveLetter(hcluster: HCLUSTER, hresource: HRESOURCE, pszdriveletter: PWSTR, pcchdriveletter: Long): UInt =
    0u

public actual fun ResUtilFindDwordProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pdwpropertyvalue: Long): UInt =
    0u

public actual fun ResUtilFindExpandSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt =
    0u

public actual fun ResUtilFindExpandedSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt =
    0u

public actual fun ResUtilFindFileTimeProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pftpropertyvalue: Long): UInt =
    0u

public actual fun ResUtilFindLongProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, plpropertyvalue: Long): UInt =
    0u

public actual fun ResUtilFindMultiSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long, pcbpropertyvaluesize: Long): UInt =
    0u

public actual fun ResUtilFindSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt =
    0u

public actual fun ResUtilFindULargeIntegerProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, plpropertyvalue: Long): UInt =
    0u

public actual fun ResUtilFreeEnvironment(lpenvironment: Long): UInt =
    0u

public actual fun ResUtilFreeParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long) {
}

public actual fun ResUtilGetAllProperties(hkeyclusterkey: HKEY, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    0u

public actual fun ResUtilGetBinaryProperty(ppboutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pboldvalue: Long, cboldvaluesize: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    0u

public actual fun ResUtilGetBinaryValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, ppboutvalue: Long, pcboutvaluesize: Long): UInt =
    0u

public actual fun ResUtilGetClusterGroupType(hgroup: HGROUP, grouptype: Long): UInt =
    0u

public actual fun ResUtilGetClusterId(hcluster: HCLUSTER, guid: Long): UInt =
    0u

public actual fun ResUtilGetClusterRoleState(hcluster: HCLUSTER, eclusterrole: CLUSTER_ROLE): CLUSTER_ROLE_STATE =
    0

public actual fun ResUtilGetCoreClusterResources(hcluster: HCLUSTER, phclusternameresource: Long, phclusteripaddressresource: Long, phclusterquorumresource: Long): UInt =
    0u

public actual fun ResUtilGetCoreClusterResourcesEx(hclusterin: HCLUSTER, phclusternameresourceout: Long, phclusterquorumresourceout: Long, dwdesiredaccess: UInt): UInt =
    0u

public actual fun ResUtilGetCoreGroup(hcluster: HCLUSTER): HGROUP =
    0L

public actual fun ResUtilGetDwordProperty(pdwoutvalue: Long, pvaluestruct: Long, dwoldvalue: UInt, dwminimum: UInt, dwmaximum: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    0u

public actual fun ResUtilGetDwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, pdwoutvalue: Long, dwdefaultvalue: UInt): UInt =
    0u

public actual fun ResUtilGetEnvironmentWithNetName(hresource: HRESOURCE): Long =
    0L

public actual fun ResUtilGetFileTimeProperty(pftoutvalue: Long, pvaluestruct: Long, ftoldvalue: FILETIME, ftminimum: FILETIME, ftmaximum: FILETIME, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    0u

public actual fun ResUtilGetLongProperty(ploutvalue: Long, pvaluestruct: Long, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    0u

public actual fun ResUtilGetMultiSzProperty(ppszoutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pszoldvalue: PCWSTR, cboldvaluesize: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    0u

public actual fun ResUtilGetPrivateProperties(hkeyclusterkey: HKEY, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    0u

public actual fun ResUtilGetProperties(hkeyclusterkey: HKEY, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    0u

public actual fun ResUtilGetPropertiesToParameterBlock(hkeyclusterkey: HKEY, ppropertytable: Long, poutparams: Long, bcheckforrequiredproperties: BOOL, psznameofpropinerror: Long): UInt =
    0u

public actual fun ResUtilGetProperty(hkeyclusterkey: HKEY, ppropertytableitem: Long, poutpropertyitem: Long, pcboutpropertyitemsize: Long): UInt =
    0u

public actual fun ResUtilGetPropertyFormats(ppropertytable: Long, poutpropertyformatlist: Long, cbpropertyformatlistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    0u

public actual fun ResUtilGetPropertySize(hkeyclusterkey: HKEY, ppropertytableitem: Long, pcboutpropertylistsize: Long, pnpropertycount: Long): UInt =
    0u

public actual fun ResUtilGetQwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, pqwoutvalue: Long, qwdefaultvalue: ULong): UInt =
    0u

public actual fun ResUtilGetResourceDependency(hself: HANDLE, lpszresourcetype: PCWSTR): HRESOURCE =
    0L

public actual fun ResUtilGetResourceDependencyByClass(hcluster: HCLUSTER, hself: HANDLE, prci: Long, brecurse: BOOL): HRESOURCE =
    0L

public actual fun ResUtilGetResourceDependencyByClassEx(hcluster: HCLUSTER, hself: HANDLE, prci: Long, brecurse: BOOL, dwdesiredaccess: UInt): HRESOURCE =
    0L

public actual fun ResUtilGetResourceDependencyByName(hcluster: HCLUSTER, hself: HANDLE, lpszresourcetype: PCWSTR, brecurse: BOOL): HRESOURCE =
    0L

public actual fun ResUtilGetResourceDependencyByNameEx(hcluster: HCLUSTER, hself: HANDLE, lpszresourcetype: PCWSTR, brecurse: BOOL, dwdesiredaccess: UInt): HRESOURCE =
    0L

public actual fun ResUtilGetResourceDependencyEx(hself: HANDLE, lpszresourcetype: PCWSTR, dwdesiredaccess: UInt): HRESOURCE =
    0L

public actual fun ResUtilGetResourceDependentIPAddressProps(hresource: HRESOURCE, pszaddress: PWSTR, pcchaddress: Long, pszsubnetmask: PWSTR, pcchsubnetmask: Long, psznetwork: PWSTR, pcchnetwork: Long): UInt =
    0u

public actual fun ResUtilGetResourceName(hresource: HRESOURCE, pszresourcename: PWSTR, pcchresourcenameinout: Long): UInt =
    0u

public actual fun ResUtilGetResourceNameDependency(lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR): HRESOURCE =
    0L

public actual fun ResUtilGetResourceNameDependencyEx(lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwdesiredaccess: UInt): HRESOURCE =
    0L

public actual fun ResUtilGetSzProperty(ppszoutvalue: Long, pvaluestruct: Long, pszoldvalue: PCWSTR, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    0u

public actual fun ResUtilGetSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR): PWSTR =
    0L

public actual fun ResUtilGroupsEqual(hself: HGROUP, hgroup: HGROUP, pequal: Long): UInt =
    0u

public actual fun ResUtilIsPathValid(pszpath: PCWSTR): BOOL =
    0

public actual fun ResUtilIsResourceClassEqual(prci: Long, hresource: HRESOURCE): BOOL =
    0

public actual fun ResUtilLeftPaxosIsLessThanRight(left: Long, right: Long): BOOL =
    0

public actual fun ResUtilNodeEnum(hcluster: HCLUSTER, pnodecallback: LPNODE_CALLBACK, pparameter: Long): UInt =
    0u

public actual fun ResUtilPaxosComparer(left: Long, right: Long): BOOL =
    0

public actual fun ResUtilPropertyListFromParameterBlock(ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: Long, pinparams: Long, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    0u

public actual fun ResUtilRemoveResourceServiceEnvironment(pszservicename: PCWSTR, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    0u

public actual fun ResUtilResourceDepEnum(hself: HRESOURCE, enumtype: UInt, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long): UInt =
    0u

public actual fun ResUtilResourceTypesEqual(lpszresourcetypename: PCWSTR, hresource: HRESOURCE): BOOL =
    0

public actual fun ResUtilResourcesEqual(hself: HRESOURCE, hresource: HRESOURCE): BOOL =
    0

public actual fun ResUtilSetBinaryValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, pbnewvalue: Long, cbnewvaluesize: UInt, ppboutvalue: Long, pcboutvaluesize: Long): UInt =
    0u

public actual fun ResUtilSetDwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, dwnewvalue: UInt, pdwoutvalue: Long): UInt =
    0u

public actual fun ResUtilSetExpandSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, ppszoutstring: Long): UInt =
    0u

public actual fun ResUtilSetMultiSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, cbnewvaluesize: UInt, ppszoutvalue: Long, pcboutvaluesize: Long): UInt =
    0u

public actual fun ResUtilSetPrivatePropertyList(hkeyclusterkey: HKEY, pinpropertylist: Long, cbinpropertylistsize: UInt): UInt =
    0u

public actual fun ResUtilSetPropertyParameterBlock(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt =
    0u

public actual fun ResUtilSetPropertyParameterBlockEx(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: UInt, bforcewrite: BOOL, poutparams: Long): UInt =
    0u

public actual fun ResUtilSetPropertyTable(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt =
    0u

public actual fun ResUtilSetPropertyTableEx(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, bforcewrite: BOOL, poutparams: Long): UInt =
    0u

public actual fun ResUtilSetQwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, qwnewvalue: ULong, pqwoutvalue: Long): UInt =
    0u

public actual fun ResUtilSetResourceServiceEnvironment(pszservicename: PCWSTR, hresource: HRESOURCE, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    0u

public actual fun ResUtilSetResourceServiceStartParameters(pszservicename: PCWSTR, schscmhandle: SC_HANDLE, phservice: Long, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    0u

public actual fun ResUtilSetResourceServiceStartParametersEx(pszservicename: PCWSTR, schscmhandle: SC_HANDLE, phservice: Long, dwdesiredaccess: UInt, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    0u

public actual fun ResUtilSetSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, ppszoutstring: Long): UInt =
    0u

public actual fun ResUtilSetUnknownProperties(hkeyclusterkey: HKEY, ppropertytable: Long, pinpropertylist: Long, cbinpropertylistsize: UInt): UInt =
    0u

public actual fun ResUtilSetValueEx(hkeyclusterkey: HKEY, valuename: PCWSTR, valuetype: UInt, valuedata: Long, valuesize: UInt, flags: UInt): UInt =
    0u

public actual fun ResUtilStartResourceService(pszservicename: PCWSTR, phservicehandle: Long): UInt =
    0u

public actual fun ResUtilStopResourceService(pszservicename: PCWSTR): UInt =
    0u

public actual fun ResUtilStopService(hservicehandle: SC_HANDLE): UInt =
    0u

public actual fun ResUtilTerminateServiceProcessFromResDll(dwservicepid: UInt, boffline: BOOL, pdwresourcestate: Long, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    0u

public actual fun ResUtilVerifyPrivatePropertyList(pinpropertylist: Long, cbinpropertylistsize: UInt): UInt =
    0u

public actual fun ResUtilVerifyPropertyTable(ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt =
    0u

public actual fun ResUtilVerifyResourceService(pszservicename: PCWSTR): UInt =
    0u

public actual fun ResUtilVerifyService(hservicehandle: SC_HANDLE): UInt =
    0u

public actual fun ResUtilVerifyShutdownSafe(flags: UInt, reason: UInt, presult: Long): UInt =
    0u

public actual fun ResUtilsDeleteKeyTree(key: HKEY, keyname: PCWSTR, treatnokeyaserror: BOOL): UInt =
    0u

public actual fun ResetAllAppInstanceVersions(): UInt =
    0u

public actual fun RestartClusterResource(hresource: HRESOURCE, dwflags: UInt): UInt =
    0u

public actual fun RestartClusterResourceEx(hresource: HRESOURCE, dwflags: UInt, lpszreason: PCWSTR): UInt =
    0u

public actual fun RestoreClusterDatabase(lpszpathname: PCWSTR, bforce: BOOL, lpszquorumdriveletter: PCWSTR): UInt =
    0u

public actual fun ResumeClusterNode(hnode: HNODE): UInt =
    0u

public actual fun ResumeClusterNodeEx(hnode: HNODE, eresumefailbacktype: CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved: UInt): UInt =
    0u

public actual fun ResumeClusterNodeEx2(hnode: HNODE, eresumefailbacktype: CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved: UInt, lpszreason: PCWSTR): UInt =
    0u

public actual fun SetAppInstanceCsvFlags(processhandle: HANDLE, mask: UInt, flags: UInt): UInt =
    0u

public actual fun SetClusterGroupName(hgroup: HGROUP, lpszgroupname: PCWSTR): UInt =
    0u

public actual fun SetClusterGroupNameEx(hgroup: HGROUP, lpszgroupname: PCWSTR, lpszreason: PCWSTR): UInt =
    0u

public actual fun SetClusterGroupNodeList(hgroup: HGROUP, nodecount: UInt, nodelist: Long): UInt =
    0u

public actual fun SetClusterGroupNodeListEx(hgroup: HGROUP, nodecount: UInt, nodelist: Long, lpszreason: PCWSTR): UInt =
    0u

public actual fun SetClusterGroupSetDependencyExpression(hgroupset: HGROUPSET, lpszdependencyexprssion: PCWSTR): UInt =
    0u

public actual fun SetClusterGroupSetDependencyExpressionEx(hgroupset: HGROUPSET, lpszdependencyexpression: PCWSTR, lpszreason: PCWSTR): UInt =
    0u

public actual fun SetClusterName(hcluster: HCLUSTER, lpsznewclustername: PCWSTR): UInt =
    0u

public actual fun SetClusterNameEx(hcluster: HCLUSTER, lpsznewclustername: PCWSTR, lpszreason: PCWSTR): UInt =
    0u

public actual fun SetClusterNetworkName(hnetwork: HNETWORK, lpszname: PCWSTR): UInt =
    0u

public actual fun SetClusterNetworkNameEx(hnetwork: HNETWORK, lpszname: PCWSTR, lpszreason: PCWSTR): UInt =
    0u

public actual fun SetClusterNetworkPriorityOrder(hcluster: HCLUSTER, networkcount: UInt, networklist: Long): UInt =
    0u

public actual fun SetClusterQuorumResource(hresource: HRESOURCE, lpszdevicename: PCWSTR, dwmaxquologsize: UInt): UInt =
    0u

public actual fun SetClusterQuorumResourceEx(hresource: HRESOURCE, lpszdevicename: PCWSTR, dwmaxquorumlogsize: UInt, lpszreason: PCWSTR): UInt =
    0u

public actual fun SetClusterResourceDependencyExpression(hresource: HRESOURCE, lpszdependencyexpression: PCWSTR): UInt =
    0u

public actual fun SetClusterResourceName(hresource: HRESOURCE, lpszresourcename: PCWSTR): UInt =
    0u

public actual fun SetClusterResourceNameEx(hresource: HRESOURCE, lpszresourcename: PCWSTR, lpszreason: PCWSTR): UInt =
    0u

public actual fun SetClusterServiceAccountPassword(lpszclustername: PCWSTR, lpsznewpassword: PCWSTR, dwflags: UInt, lpreturnstatusbuffer: Long, lpcbreturnstatusbuffersize: Long): UInt =
    0u

public actual fun SetGroupDependencyExpression(hgroup: HGROUP, lpszdependencyexpression: PCWSTR): UInt =
    0u

public actual fun SetGroupDependencyExpressionEx(hgroup: HGROUP, lpszdependencyexpression: PCWSTR, lpszreason: PCWSTR): UInt =
    0u
