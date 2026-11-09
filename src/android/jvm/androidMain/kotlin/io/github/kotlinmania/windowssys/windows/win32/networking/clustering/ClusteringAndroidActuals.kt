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

private object WindowsWin32NetworkingClusteringJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_AddClusterGroupDependency(hdependentgroup: Long, hprovidergroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_AddClusterGroupDependencyEx(hdependentgroup: Long, hprovidergroup: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependency(hdependentgroupset: Long, hprovidergroupset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependencyEx(hdependentgroupset: Long, hprovidergroupset: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependency(hdependentgroup: Long, hprovidergroupset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependencyEx(hdependentgroup: Long, hprovidergroupset: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_AddClusterNode(hcluster: Long, lpsznodename: Long, pfnprogresscallback: Long, pvcallbackarg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_AddClusterNodeEx(hcluster: Long, lpsznodename: Long, dwflags: Int, pfnprogresscallback: Long, pvcallbackarg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_AddClusterResourceDependency(hresource: Long, hdependson: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_AddClusterResourceDependencyEx(hresource: Long, hdependson: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_AddClusterResourceNode(hresource: Long, hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_AddClusterResourceNodeEx(hresource: Long, hnode: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_AddClusterStorageNode(hcluster: Long, lpsznodename: Long, pfnprogresscallback: Long, pvcallbackarg: Long, lpszclusterstoragenodedescription: Long, lpszclusterstoragenodelocation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_AddCrossClusterGroupSetDependency(hdependentgroupset: Long, lpremoteclustername: Long, lpremotegroupsetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_AddResourceToClusterSharedVolumes(hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_BackupClusterDatabase(hcluster: Long, lpszpathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CanResourceBeDependent(hresource: Long, hresourcedependent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CancelClusterGroupOperation(hgroup: Long, dwcancelflags_reserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroup(hresource: Long, hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx(hresource: Long, hgroup: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx2(hresource: Long, hgroup: Long, flags: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CloseCluster(hcluster: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CloseClusterCryptProvider(hcluscryptprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CloseClusterGroup(hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CloseClusterGroupSet(hgroupset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CloseClusterNetInterface(hnetinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CloseClusterNetwork(hnetwork: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CloseClusterNode(hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CloseClusterNotifyPort(hchange: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CloseClusterResource(hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusAddClusterHealthFault(hcluster: Long, failure: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusGetClusterHealthFaults(hcluster: Long, objects: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusRemoveClusterHealthFault(hcluster: Long, id: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusWorkerCheckTerminate(lpworker: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusWorkerCreate(lpworker: Long, lpstartaddress: Long, lpparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusWorkerTerminate(lpworker: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusWorkerTerminateEx(clusworker: Long, timeoutinmilliseconds: Int, waitonly: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusWorkersTerminate(clusworkers: Long, clusworkerscount: Long, timeoutinmilliseconds: Int, waitonly: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusapiSetReasonHandler(lphandler: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterAddGroupToAffinityRule(hcluster: Long, rulename: Long, hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSet(hgroupset: Long, hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomains(hgroupset: Long, hgroup: Long, faultdomain: Int, updatedomain: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomainsEx(hgroupset: Long, hgroup: Long, faultdomain: Int, updatedomain: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterAffinityRuleControl(hcluster: Long, affinityrulename: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterClearBackupStateForSharedVolume(lpszvolumepathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterCloseEnum(henum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterCloseEnumEx(hclusterenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterControl(hcluster: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterControlEx(hcluster: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterCreateAffinityRule(hcluster: Long, rulename: Long, ruletype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterDecrypt(hcluscryptprovider: Long, pcryptinput: Long, cbcryptinput: Int, ppcryptoutput: Long, pcbcryptoutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterEncrypt(hcluscryptprovider: Long, pdata: Long, cbdata: Int, ppdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterEnum(henum: Long, dwindex: Int, lpdwtype: Long, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterEnumEx(hclusterenum: Long, dwindex: Int, pitem: Long, cbitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGetEnumCount(henum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGetEnumCountEx(hclusterenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: Long, lpszvolumename: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGetVolumePathName(lpszfilename: Long, lpszvolumepathname: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnum(hgroupenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnumEx(hgroupenumex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupControl(hgroup: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupControlEx(hgroup: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupEnum(hgroupenum: Long, dwindex: Int, lpdwtype: Long, lpszresourcename: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupEnumEx(hgroupenumex: Long, dwindex: Int, pitem: Long, cbitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCount(hgroupenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCountEx(hgroupenumex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnum(hgroup: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnumEx(hcluster: Long, lpszproperties: Long, cbproperties: Int, lpszroproperties: Long, cbroproperties: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupSetCloseEnum(hgroupsetenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupSetControl(hgroupset: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupSetControlEx(hgroupset: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupSetEnum(hgroupsetenum: Long, dwindex: Int, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupSetGetEnumCount(hgroupsetenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterGroupSetOpenEnum(hcluster: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterIsPathOnSharedVolume(lpszpathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNetInterfaceCloseEnum(hnetinterfaceenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControl(hnetinterface: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControlEx(hnetinterface: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNetInterfaceEnum(hnetinterfaceenum: Long, dwindex: Int, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNetInterfaceOpenEnum(hcluster: Long, lpsznodename: Long, lpsznetworkname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNetworkCloseEnum(hnetworkenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNetworkControl(hnetwork: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNetworkControlEx(hnetwork: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNetworkEnum(hnetworkenum: Long, dwindex: Int, lpdwtype: Long, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNetworkGetEnumCount(hnetworkenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNetworkOpenEnum(hnetwork: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnum(hnodeenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnumEx(hnodeenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNodeControl(hnode: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNodeControlEx(hnode: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNodeEnum(hnodeenum: Long, dwindex: Int, lpdwtype: Long, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNodeEnumEx(hnodeenum: Long, dwindex: Int, pitem: Long, cbitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCount(hnodeenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCountEx(hnodeenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnum(hnode: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnumEx(hnode: Long, dwtype: Int, poptions: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterNodeReplacement(hcluster: Long, lpsznodenamecurrent: Long, lpsznodenamenew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterOpenEnum(hcluster: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterOpenEnumEx(hcluster: Long, dwtype: Int, poptions: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterPrepareSharedVolumeForBackup(lpszfilename: Long, lpszvolumepathname: Long, lpcchvolumepathname: Long, lpszvolumename: Long, lpcchvolumename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegBatchAddCommand(hregbatch: Long, dwcommand: Int, wzname: Long, dwoptions: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegBatchCloseNotification(hbatchnotification: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegBatchReadCommand(hbatchnotification: Long, pbatchcommand: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegCloseBatch(hregbatch: Long, bcommit: Int, failedcommandnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchEx(hregbatch: Long, flags: Int, failedcommandnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchNotifyPort(hbatchnotifyport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegCloseKey(hkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatch(hregreadbatch: Long, phregreadbatchreply: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchEx(hregreadbatch: Long, flags: Int, phregreadbatchreply: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchReply(hregreadbatchreply: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegCreateBatch(hkey: Long, phregbatch: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegCreateBatchNotifyPort(hkey: Long, phbatchnotifyport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegCreateKey(hkey: Long, lpszsubkey: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegCreateKeyEx(hkey: Long, lpsubkey: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegCreateReadBatch(hkey: Long, phregreadbatch: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegDeleteKey(hkey: Long, lpszsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegDeleteKeyEx(hkey: Long, lpsubkey: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegDeleteValue(hkey: Long, lpszvaluename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegDeleteValueEx(hkey: Long, lpszvaluename: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegEnumKey(hkey: Long, dwindex: Int, lpszname: Long, lpcchname: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegEnumValue(hkey: Long, dwindex: Int, lpszvaluename: Long, lpcchvaluename: Long, lpdwtype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegGetBatchNotification(hbatchnotify: Long, phbatchnotification: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegGetKeySecurity(hkey: Long, requestedinformation: Int, psecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegOpenKey(hkey: Long, lpszsubkey: Long, samdesired: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegQueryInfoKey(hkey: Long, lpcsubkeys: Long, lpcchmaxsubkeylen: Long, lpcvalues: Long, lpcchmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegQueryValue(hkey: Long, lpszvaluename: Long, lpdwvaluetype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegReadBatchAddCommand(hregreadbatch: Long, wzsubkeyname: Long, wzvaluename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegReadBatchReplyNextCommand(hregreadbatchreply: Long, pbatchcommand: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurity(hkey: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurityEx(hkey: Long, securityinformation: Int, psecuritydescriptor: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegSetValue(hkey: Long, lpszvaluename: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegSetValueEx(hkey: Long, lpszvaluename: Long, dwtype: Int, lpdata: Long, cbdata: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRegSyncDatabase(hcluster: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRemoveAffinityRule(hcluster: Long, rulename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromAffinityRule(hcluster: Long, rulename: Long, hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSet(hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSetEx(hgroup: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnum(hresenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnumEx(hresourceenumex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceControl(hresource: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUser(hresource: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUserEx(hresource: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceControlEx(hresource: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceEnum(hresenum: Long, dwindex: Int, lpdwtype: Long, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceEnumEx(hresourceenumex: Long, dwindex: Int, pitem: Long, cbitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCount(hresenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCountEx(hresourceenumex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnum(hresource: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnumEx(hcluster: Long, lpszproperties: Long, cbproperties: Int, lpszroproperties: Long, cbroproperties: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceTypeCloseEnum(hrestypeenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceTypeControl(hcluster: Long, lpszresourcetypename: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUser(hcluster: Long, lpszresourcetypename: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUserEx(hcluster: Long, lpszresourcetypename: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlEx(hcluster: Long, lpszresourcetypename: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceTypeEnum(hrestypeenum: Long, dwindex: Int, lpdwtype: Long, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceTypeGetEnumCount(hrestypeenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterResourceTypeOpenEnum(hcluster: Long, lpszresourcetypename: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterSetAccountAccess(hcluster: Long, szaccountsid: Long, dwaccess: Int, dwcontroltype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ClusterUpgradeFunctionalLevel(hcluster: Long, perform: Int, pfnprogresscallback: Long, pvcallbackarg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CreateCluster(pconfig: Long, pfnprogresscallback: Long, pvcallbackarg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CreateClusterAvailabilitySet(hcluster: Long, lpavailabilitysetname: Long, pavailabilitysetconfig: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CreateClusterGroup(hcluster: Long, lpszgroupname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CreateClusterGroupEx(hcluster: Long, lpszgroupname: Long, pgroupinfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CreateClusterGroupSet(hcluster: Long, groupsetname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CreateClusterNameAccount(hcluster: Long, pconfig: Long, pfnprogresscallback: Long, pvcallbackarg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CreateClusterNotifyPort(hchange: Long, hcluster: Long, dwfilter: Int, dwnotifykey: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CreateClusterNotifyPortV2(hchange: Long, hcluster: Long, filters: Long, dwfiltercount: Int, dwnotifykey: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CreateClusterResource(hgroup: Long, lpszresourcename: Long, lpszresourcetype: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CreateClusterResourceEx(hgroup: Long, lpszresourcename: Long, lpszresourcetype: Long, dwflags: Int, lpszreason: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CreateClusterResourceType(hcluster: Long, lpszresourcetypename: Long, lpszdisplayname: Long, lpszresourcetypedll: Long, dwlooksalivepollinterval: Int, dwisalivepollinterval: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_CreateClusterResourceTypeEx(hcluster: Long, lpszresourcetypename: Long, lpszdisplayname: Long, lpszresourcetypedll: Long, dwlooksalivepollinterval: Int, dwisalivepollinterval: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_DeleteClusterGroup(hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_DeleteClusterGroupEx(hgroup: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_DeleteClusterGroupSet(hgroupset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_DeleteClusterGroupSetEx(hgroupset: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_DeleteClusterResource(hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_DeleteClusterResourceEx(hresource: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_DeleteClusterResourceType(hcluster: Long, lpszresourcetypename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_DeleteClusterResourceTypeEx(hcluster: Long, lpsztypename: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_DestroyCluster(hcluster: Long, pfnprogresscallback: Long, pvcallbackarg: Long, fdeletevirtualcomputerobjects: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_DestroyClusterGroup(hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_DestroyClusterGroupEx(hgroup: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromCluster(hcluster: Long, pcnorestype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromNodelist(cnodes: Int, ppsznodenames: Long, pcnorestype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromCluster(hcluster: Long, pcloudtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromNodelist(cnodes: Int, ppsznodenames: Long, pcloudtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_EvictClusterNode(hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_EvictClusterNodeEx(hnode: Long, dwtimeout: Int, phrcleanupstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_EvictClusterNodeEx2(hnode: Long, dwtimeout: Int, phrcleanupstatus: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_FailClusterResource(hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_FailClusterResourceEx(hresource: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_FreeClusterCrypt(pcryptinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_FreeClusterHealthFault(clusterhealthfault: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_FreeClusterHealthFaultArray(clusterhealthfaultarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterFromGroup(hgroup: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterFromNetInterface(hnetinterface: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterFromNetwork(hnetwork: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterFromNode(hnode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterFromResource(hresource: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterGroupKey(hgroup: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterGroupState(hgroup: Long, lpsznodename: Long, lpcchnodename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterInformation(hcluster: Long, lpszclustername: Long, lpcchclustername: Long, lpclusterinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterKey(hcluster: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterNetInterface(hcluster: Long, lpsznodename: Long, lpsznetworkname: Long, lpszinterfacename: Long, lpcchinterfacename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceKey(hnetinterface: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceState(hnetinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterNetworkId(hnetwork: Long, lpsznetworkid: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterNetworkKey(hnetwork: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterNetworkState(hnetwork: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterNodeId(hnode: Long, lpsznodeid: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterNodeKey(hnode: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterNodeState(hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterNotify(hchange: Long, lpdwnotifykey: Long, lpdwfiltertype: Long, lpszname: Long, lpcchname: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterNotifyV2(hchange: Long, lpdwnotifykey: Long, pfilterandtype: Long, buffer: Long, lpbbuffersize: Long, lpszobjectid: Long, lpcchobjectid: Long, lpszparentid: Long, lpcchparentid: Long, lpszname: Long, lpcchname: Long, lpsztype: Long, lpcchtype: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterQuorumResource(hcluster: Long, lpszresourcename: Long, lpcchresourcename: Long, lpszdevicename: Long, lpcchdevicename: Long, lpdwmaxquorumlogsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterResourceDependencyExpression(hresource: Long, lpszdependencyexpression: Long, lpcchdependencyexpression: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterResourceKey(hresource: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterResourceNetworkName(hresource: Long, lpbuffer: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterResourceState(hresource: Long, lpsznodename: Long, lpcchnodename: Long, lpszgroupname: Long, lpcchgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetClusterResourceTypeKey(hcluster: Long, lpsztypename: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetNodeCloudTypeDW(ppsznodename: Long, nodecloudtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetNodeClusterState(lpsznodename: Long, pdwclusterstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_GetNotifyEventHandle(hchange: Long, lphtargetevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_InitializeClusterHealthFault(clusterhealthfault: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_InitializeClusterHealthFaultArray(clusterhealthfaultarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_IsFileOnClusterSharedVolume(lpszpathname: Long, pbfileisonsharedvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_MoveClusterGroup(hgroup: Long, hdestinationnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_MoveClusterGroupEx(hgroup: Long, hdestinationnode: Long, dwmoveflags: Int, lpinbuffer: Long, cbinbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_MoveClusterGroupEx2(hgroup: Long, hdestinationnode: Long, dwmoveflags: Int, lpinbuffer: Long, cbinbuffersize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OfflineClusterGroup(hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx(hgroup: Long, dwofflineflags: Int, lpinbuffer: Long, cbinbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx2(hgroup: Long, dwofflineflags: Int, lpinbuffer: Long, cbinbuffersize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OfflineClusterResource(hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx(hresource: Long, dwofflineflags: Int, lpinbuffer: Long, cbinbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx2(hresource: Long, dwofflineflags: Int, lpinbuffer: Long, cbinbuffersize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OnlineClusterGroup(hgroup: Long, hdestinationnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx(hgroup: Long, hdestinationnode: Long, dwonlineflags: Int, lpinbuffer: Long, cbinbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx2(hgroup: Long, hdestinationnode: Long, dwonlineflags: Int, lpinbuffer: Long, cbinbuffersize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OnlineClusterResource(hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx(hresource: Long, dwonlineflags: Int, lpinbuffer: Long, cbinbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx2(hresource: Long, dwonlineflags: Int, lpinbuffer: Long, cbinbuffersize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenCluster(lpszclustername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenClusterCryptProvider(lpszresource: Long, lpszprovider: Long, dwtype: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenClusterCryptProviderEx(lpszresource: Long, lpszkeyname: Long, lpszprovider: Long, dwtype: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenClusterEx(lpszclustername: Long, desiredaccess: Int, grantedaccess: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenClusterGroup(hcluster: Long, lpszgroupname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenClusterGroupEx(hcluster: Long, lpszgroupname: Long, dwdesiredaccess: Int, lpdwgrantedaccess: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenClusterGroupSet(hcluster: Long, lpszgroupsetname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenClusterNetInterface(hcluster: Long, lpszinterfacename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenClusterNetInterfaceEx(hcluster: Long, lpszinterfacename: Long, dwdesiredaccess: Int, lpdwgrantedaccess: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenClusterNetwork(hcluster: Long, lpsznetworkname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenClusterNetworkEx(hcluster: Long, lpsznetworkname: Long, dwdesiredaccess: Int, lpdwgrantedaccess: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenClusterNode(hcluster: Long, lpsznodename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenClusterNodeById(hcluster: Long, nodeid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenClusterNodeEx(hcluster: Long, lpsznodename: Long, dwdesiredaccess: Int, lpdwgrantedaccess: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenClusterResource(hcluster: Long, lpszresourcename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_OpenClusterResourceEx(hcluster: Long, lpszresourcename: Long, dwdesiredaccess: Int, lpdwgrantedaccess: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_PauseClusterNode(hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_PauseClusterNodeEx(hnode: Long, bdrainnode: Int, dwpauseflags: Int, hnodedraintarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_PauseClusterNodeEx2(hnode: Long, bdrainnode: Int, dwpauseflags: Int, hnodedraintarget: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_QueryAppInstanceVersion(appinstanceid: Long, instanceversionhigh: Long, instanceversionlow: Long, versionstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RegisterAppInstance(processhandle: Long, appinstanceid: Long, childreninheritappinstance: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RegisterAppInstanceVersion(appinstanceid: Long, instanceversionhigh: Long, instanceversionlow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RegisterClusterNotify(hchange: Long, dwfiltertype: Int, hobject: Long, dwnotifykey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RegisterClusterResourceTypeNotifyV2(hchange: Long, hcluster: Long, flags: Long, restypename: Long, dwnotifykey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependency(hgroup: Long, hdependson: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependencyEx(hgroup: Long, hdependson: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependency(hgroupset: Long, hdependson: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependencyEx(hgroupset: Long, hdependson: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependency(hgroup: Long, hdependson: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependencyEx(hgroup: Long, hdependson: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RemoveClusterNameAccount(hcluster: Long, bdeletecomputerobjects: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependency(hresource: Long, hdependson: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependencyEx(hresource: Long, hdependson: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RemoveClusterResourceNode(hresource: Long, hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RemoveClusterResourceNodeEx(hresource: Long, hnode: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RemoveClusterStorageNode(hcluster: Long, lpszclusterstorageenclosurename: Long, dwtimeout: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RemoveCrossClusterGroupSetDependency(hdependentgroupset: Long, lpremoteclustername: Long, lpremotegroupsetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RemoveResourceFromClusterSharedVolumes(hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilAddUnknownProperties(hkeyclusterkey: Long, ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilCreateDirectoryTree(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilDupGroup(group: Long, copy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilDupParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilDupResource(group: Long, copy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilDupString(pszinstring: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilEnumGroups(hcluster: Long, hself: Long, prescallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilEnumGroupsEx(hcluster: Long, hself: Long, grouptype: Int, prescallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilEnumPrivateProperties(hkeyclusterkey: Long, pszoutproperties: Long, cboutpropertiessize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilEnumProperties(ppropertytable: Long, pszoutproperties: Long, cboutpropertiessize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilEnumResources(hself: Long, lpszrestypename: Long, prescallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx(hcluster: Long, hself: Long, lpszrestypename: Long, prescallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx2(hcluster: Long, hself: Long, lpszrestypename: Long, prescallback: Long, pparameter: Long, dwdesiredaccess: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilExpandEnvironmentStrings(pszsrc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilFindBinaryProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pbpropertyvalue: Long, pcbpropertyvaluesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilFindDependentDiskResourceDriveLetter(hcluster: Long, hresource: Long, pszdriveletter: Long, pcchdriveletter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilFindDwordProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pdwpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilFindExpandSzProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pszpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilFindExpandedSzProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pszpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilFindFileTimeProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pftpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilFindLongProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, plpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilFindMultiSzProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pszpropertyvalue: Long, pcbpropertyvaluesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilFindSzProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pszpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilFindULargeIntegerProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, plpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilFreeEnvironment(lpenvironment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilFreeParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetAllProperties(hkeyclusterkey: Long, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetBinaryProperty(ppboutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pboldvalue: Long, cboldvaluesize: Int, pppropertylist: Long, pcbpropertylistsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetBinaryValue(hkeyclusterkey: Long, pszvaluename: Long, ppboutvalue: Long, pcboutvaluesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetClusterGroupType(hgroup: Long, grouptype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetClusterId(hcluster: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetClusterRoleState(hcluster: Long, eclusterrole: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResources(hcluster: Long, phclusternameresource: Long, phclusteripaddressresource: Long, phclusterquorumresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResourcesEx(hclusterin: Long, phclusternameresourceout: Long, phclusterquorumresourceout: Long, dwdesiredaccess: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetCoreGroup(hcluster: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetDwordProperty(pdwoutvalue: Long, pvaluestruct: Long, dwoldvalue: Int, dwminimum: Int, dwmaximum: Int, pppropertylist: Long, pcbpropertylistsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetDwordValue(hkeyclusterkey: Long, pszvaluename: Long, pdwoutvalue: Long, dwdefaultvalue: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetEnvironmentWithNetName(hresource: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetLongProperty(ploutvalue: Long, pvaluestruct: Long, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: Long, pcbpropertylistsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetMultiSzProperty(ppszoutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pszoldvalue: Long, cboldvaluesize: Int, pppropertylist: Long, pcbpropertylistsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetPrivateProperties(hkeyclusterkey: Long, poutpropertylist: Long, cboutpropertylistsize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetProperties(hkeyclusterkey: Long, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetPropertiesToParameterBlock(hkeyclusterkey: Long, ppropertytable: Long, poutparams: Long, bcheckforrequiredproperties: Int, psznameofpropinerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetProperty(hkeyclusterkey: Long, ppropertytableitem: Long, poutpropertyitem: Long, pcboutpropertyitemsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetPropertyFormats(ppropertytable: Long, poutpropertyformatlist: Long, cbpropertyformatlistsize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetPropertySize(hkeyclusterkey: Long, ppropertytableitem: Long, pcboutpropertylistsize: Long, pnpropertycount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetQwordValue(hkeyclusterkey: Long, pszvaluename: Long, pqwoutvalue: Long, qwdefaultvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependency(hself: Long, lpszresourcetype: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClass(hcluster: Long, hself: Long, prci: Long, brecurse: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClassEx(hcluster: Long, hself: Long, prci: Long, brecurse: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByName(hcluster: Long, hself: Long, lpszresourcetype: Long, brecurse: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByNameEx(hcluster: Long, hself: Long, lpszresourcetype: Long, brecurse: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyEx(hself: Long, lpszresourcetype: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependentIPAddressProps(hresource: Long, pszaddress: Long, pcchaddress: Long, pszsubnetmask: Long, pcchsubnetmask: Long, psznetwork: Long, pcchnetwork: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetResourceName(hresource: Long, pszresourcename: Long, pcchresourcenameinout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependency(lpszresourcename: Long, lpszresourcetype: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependencyEx(lpszresourcename: Long, lpszresourcetype: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetSzProperty(ppszoutvalue: Long, pvaluestruct: Long, pszoldvalue: Long, pppropertylist: Long, pcbpropertylistsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGetSzValue(hkeyclusterkey: Long, pszvaluename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilGroupsEqual(hself: Long, hgroup: Long, pequal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilIsPathValid(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilIsResourceClassEqual(prci: Long, hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilLeftPaxosIsLessThanRight(left: Long, right: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilNodeEnum(hcluster: Long, pnodecallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilPaxosComparer(left: Long, right: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilPropertyListFromParameterBlock(ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: Long, pinparams: Long, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilRemoveResourceServiceEnvironment(pszservicename: Long, pfnlogevent: Long, hresourcehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilResourceDepEnum(hself: Long, enumtype: Int, prescallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilResourceTypesEqual(lpszresourcetypename: Long, hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilResourcesEqual(hself: Long, hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetBinaryValue(hkeyclusterkey: Long, pszvaluename: Long, pbnewvalue: Long, cbnewvaluesize: Int, ppboutvalue: Long, pcboutvaluesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetDwordValue(hkeyclusterkey: Long, pszvaluename: Long, dwnewvalue: Int, pdwoutvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetExpandSzValue(hkeyclusterkey: Long, pszvaluename: Long, psznewvalue: Long, ppszoutstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetMultiSzValue(hkeyclusterkey: Long, pszvaluename: Long, psznewvalue: Long, cbnewvaluesize: Int, ppszoutvalue: Long, pcboutvaluesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetPrivatePropertyList(hkeyclusterkey: Long, pinpropertylist: Long, cbinpropertylistsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlock(hkeyclusterkey: Long, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: Int, poutparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlockEx(hkeyclusterkey: Long, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: Int, bforcewrite: Int, poutparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTable(hkeyclusterkey: Long, ppropertytable: Long, reserved: Long, ballowunknownproperties: Int, pinpropertylist: Long, cbinpropertylistsize: Int, poutparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTableEx(hkeyclusterkey: Long, ppropertytable: Long, reserved: Long, ballowunknownproperties: Int, pinpropertylist: Long, cbinpropertylistsize: Int, bforcewrite: Int, poutparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetQwordValue(hkeyclusterkey: Long, pszvaluename: Long, qwnewvalue: Long, pqwoutvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceEnvironment(pszservicename: Long, hresource: Long, pfnlogevent: Long, hresourcehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParameters(pszservicename: Long, schscmhandle: Long, phservice: Long, pfnlogevent: Long, hresourcehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParametersEx(pszservicename: Long, schscmhandle: Long, phservice: Long, dwdesiredaccess: Int, pfnlogevent: Long, hresourcehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetSzValue(hkeyclusterkey: Long, pszvaluename: Long, psznewvalue: Long, ppszoutstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetUnknownProperties(hkeyclusterkey: Long, ppropertytable: Long, pinpropertylist: Long, cbinpropertylistsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilSetValueEx(hkeyclusterkey: Long, valuename: Long, valuetype: Int, valuedata: Long, valuesize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilStartResourceService(pszservicename: Long, phservicehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilStopResourceService(pszservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilStopService(hservicehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilTerminateServiceProcessFromResDll(dwservicepid: Int, boffline: Int, pdwresourcestate: Long, pfnlogevent: Long, hresourcehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilVerifyPrivatePropertyList(pinpropertylist: Long, cbinpropertylistsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilVerifyPropertyTable(ppropertytable: Long, reserved: Long, ballowunknownproperties: Int, pinpropertylist: Long, cbinpropertylistsize: Int, poutparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilVerifyResourceService(pszservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilVerifyService(hservicehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilVerifyShutdownSafe(flags: Int, reason: Int, presult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResUtilsDeleteKeyTree(key: Long, keyname: Long, treatnokeyaserror: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResetAllAppInstanceVersions(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RestartClusterResource(hresource: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RestartClusterResourceEx(hresource: Long, dwflags: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_RestoreClusterDatabase(lpszpathname: Long, bforce: Int, lpszquorumdriveletter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResumeClusterNode(hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx(hnode: Long, eresumefailbacktype: Int, dwresumeflagsreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx2(hnode: Long, eresumefailbacktype: Int, dwresumeflagsreserved: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetAppInstanceCsvFlags(processhandle: Long, mask: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterGroupName(hgroup: Long, lpszgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterGroupNameEx(hgroup: Long, lpszgroupname: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterGroupNodeList(hgroup: Long, nodecount: Int, nodelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterGroupNodeListEx(hgroup: Long, nodecount: Int, nodelist: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpression(hgroupset: Long, lpszdependencyexprssion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpressionEx(hgroupset: Long, lpszdependencyexpression: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterName(hcluster: Long, lpsznewclustername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterNameEx(hcluster: Long, lpsznewclustername: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterNetworkName(hnetwork: Long, lpszname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterNetworkNameEx(hnetwork: Long, lpszname: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterNetworkPriorityOrder(hcluster: Long, networkcount: Int, networklist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterQuorumResource(hresource: Long, lpszdevicename: Long, dwmaxquologsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterQuorumResourceEx(hresource: Long, lpszdevicename: Long, dwmaxquorumlogsize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterResourceDependencyExpression(hresource: Long, lpszdependencyexpression: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterResourceName(hresource: Long, lpszresourcename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterResourceNameEx(hresource: Long, lpszresourcename: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetClusterServiceAccountPassword(lpszclustername: Long, lpsznewpassword: Long, dwflags: Int, lpreturnstatusbuffer: Long, lpcbreturnstatusbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetGroupDependencyExpression(hgroup: Long, lpszdependencyexpression: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_SetGroupDependencyExpressionEx(hgroup: Long, lpszdependencyexpression: Long, lpszreason: Long): Int
}

public actual fun AddClusterGroupDependency(hdependentgroup: HGROUP, hprovidergroup: HGROUP): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_AddClusterGroupDependency(hdependentgroup, hprovidergroup).toUInt()

public actual fun AddClusterGroupDependencyEx(hdependentgroup: HGROUP, hprovidergroup: HGROUP, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_AddClusterGroupDependencyEx(hdependentgroup, hprovidergroup, lpszreason).toUInt()

public actual fun AddClusterGroupSetDependency(hdependentgroupset: HGROUPSET, hprovidergroupset: HGROUPSET): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependency(hdependentgroupset, hprovidergroupset).toUInt()

public actual fun AddClusterGroupSetDependencyEx(hdependentgroupset: HGROUPSET, hprovidergroupset: HGROUPSET, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_AddClusterGroupSetDependencyEx(hdependentgroupset, hprovidergroupset, lpszreason).toUInt()

public actual fun AddClusterGroupToGroupSetDependency(hdependentgroup: HGROUP, hprovidergroupset: HGROUPSET): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependency(hdependentgroup, hprovidergroupset).toUInt()

public actual fun AddClusterGroupToGroupSetDependencyEx(hdependentgroup: HGROUP, hprovidergroupset: HGROUPSET, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_AddClusterGroupToGroupSetDependencyEx(hdependentgroup, hprovidergroupset, lpszreason).toUInt()

public actual fun AddClusterNode(hcluster: HCLUSTER, lpsznodename: PCWSTR, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HNODE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_AddClusterNode(hcluster, lpsznodename, pfnprogresscallback.toLong(), pvcallbackarg)

public actual fun AddClusterNodeEx(hcluster: HCLUSTER, lpsznodename: PCWSTR, dwflags: UInt, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HNODE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_AddClusterNodeEx(hcluster, lpsznodename, dwflags.toInt(), pfnprogresscallback.toLong(), pvcallbackarg)

public actual fun AddClusterResourceDependency(hresource: HRESOURCE, hdependson: HRESOURCE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_AddClusterResourceDependency(hresource, hdependson).toUInt()

public actual fun AddClusterResourceDependencyEx(hresource: HRESOURCE, hdependson: HRESOURCE, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_AddClusterResourceDependencyEx(hresource, hdependson, lpszreason).toUInt()

public actual fun AddClusterResourceNode(hresource: HRESOURCE, hnode: HNODE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_AddClusterResourceNode(hresource, hnode).toUInt()

public actual fun AddClusterResourceNodeEx(hresource: HRESOURCE, hnode: HNODE, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_AddClusterResourceNodeEx(hresource, hnode, lpszreason).toUInt()

public actual fun AddClusterStorageNode(hcluster: HCLUSTER, lpsznodename: PCWSTR, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long, lpszclusterstoragenodedescription: PCWSTR, lpszclusterstoragenodelocation: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_AddClusterStorageNode(hcluster, lpsznodename, pfnprogresscallback.toLong(), pvcallbackarg, lpszclusterstoragenodedescription, lpszclusterstoragenodelocation).toUInt()

public actual fun AddCrossClusterGroupSetDependency(hdependentgroupset: HGROUPSET, lpremoteclustername: PCWSTR, lpremotegroupsetname: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_AddCrossClusterGroupSetDependency(hdependentgroupset, lpremoteclustername, lpremotegroupsetname).toUInt()

public actual fun AddResourceToClusterSharedVolumes(hresource: HRESOURCE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_AddResourceToClusterSharedVolumes(hresource).toUInt()

public actual fun BackupClusterDatabase(hcluster: HCLUSTER, lpszpathname: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_BackupClusterDatabase(hcluster, lpszpathname).toUInt()

public actual fun CanResourceBeDependent(hresource: HRESOURCE, hresourcedependent: HRESOURCE): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CanResourceBeDependent(hresource, hresourcedependent)

public actual fun CancelClusterGroupOperation(hgroup: HGROUP, dwcancelflags_reserved: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CancelClusterGroupOperation(hgroup, dwcancelflags_reserved.toInt()).toUInt()

public actual fun ChangeClusterResourceGroup(hresource: HRESOURCE, hgroup: HGROUP): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroup(hresource, hgroup).toUInt()

public actual fun ChangeClusterResourceGroupEx(hresource: HRESOURCE, hgroup: HGROUP, flags: ULong): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx(hresource, hgroup, flags.toLong()).toUInt()

public actual fun ChangeClusterResourceGroupEx2(hresource: HRESOURCE, hgroup: HGROUP, flags: ULong, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ChangeClusterResourceGroupEx2(hresource, hgroup, flags.toLong(), lpszreason).toUInt()

public actual fun CloseCluster(hcluster: HCLUSTER): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CloseCluster(hcluster)

public actual fun CloseClusterCryptProvider(hcluscryptprovider: HCLUSCRYPTPROVIDER): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CloseClusterCryptProvider(hcluscryptprovider).toUInt()

public actual fun CloseClusterGroup(hgroup: HGROUP): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CloseClusterGroup(hgroup)

public actual fun CloseClusterGroupSet(hgroupset: HGROUPSET): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CloseClusterGroupSet(hgroupset)

public actual fun CloseClusterNetInterface(hnetinterface: HNETINTERFACE): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CloseClusterNetInterface(hnetinterface)

public actual fun CloseClusterNetwork(hnetwork: HNETWORK): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CloseClusterNetwork(hnetwork)

public actual fun CloseClusterNode(hnode: HNODE): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CloseClusterNode(hnode)

public actual fun CloseClusterNotifyPort(hchange: HCHANGE): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CloseClusterNotifyPort(hchange)

public actual fun CloseClusterResource(hresource: HRESOURCE): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CloseClusterResource(hresource)

public actual fun ClusAddClusterHealthFault(hcluster: HCLUSTER, failure: Long, param2: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusAddClusterHealthFault(hcluster, failure, param2.toInt()).toUInt()

public actual fun ClusGetClusterHealthFaults(hcluster: HCLUSTER, objects: Long, flags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusGetClusterHealthFaults(hcluster, objects, flags.toInt()).toUInt()

public actual fun ClusRemoveClusterHealthFault(hcluster: HCLUSTER, id: PCWSTR, flags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusRemoveClusterHealthFault(hcluster, id, flags.toInt()).toUInt()

public actual fun ClusWorkerCheckTerminate(lpworker: Long): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusWorkerCheckTerminate(lpworker)

public actual fun ClusWorkerCreate(lpworker: Long, lpstartaddress: PWORKER_START_ROUTINE, lpparameter: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusWorkerCreate(lpworker, lpstartaddress.toLong(), lpparameter).toUInt()

public actual fun ClusWorkerTerminate(lpworker: Long) {
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusWorkerTerminate(lpworker)
}

public actual fun ClusWorkerTerminateEx(clusworker: Long, timeoutinmilliseconds: UInt, waitonly: BOOL): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusWorkerTerminateEx(clusworker, timeoutinmilliseconds.toInt(), waitonly).toUInt()

public actual fun ClusWorkersTerminate(clusworkers: Long, clusworkerscount: ULong, timeoutinmilliseconds: UInt, waitonly: BOOL): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusWorkersTerminate(clusworkers, clusworkerscount.toLong(), timeoutinmilliseconds.toInt(), waitonly).toUInt()

public actual fun ClusapiSetReasonHandler(lphandler: Long): Long =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusapiSetReasonHandler(lphandler)

public actual fun ClusterAddGroupToAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR, hgroup: HGROUP): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterAddGroupToAffinityRule(hcluster, rulename, hgroup).toUInt()

public actual fun ClusterAddGroupToGroupSet(hgroupset: HGROUPSET, hgroup: HGROUP): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSet(hgroupset, hgroup).toUInt()

public actual fun ClusterAddGroupToGroupSetWithDomains(hgroupset: HGROUPSET, hgroup: HGROUP, faultdomain: UInt, updatedomain: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomains(hgroupset, hgroup, faultdomain.toInt(), updatedomain.toInt()).toUInt()

public actual fun ClusterAddGroupToGroupSetWithDomainsEx(hgroupset: HGROUPSET, hgroup: HGROUP, faultdomain: UInt, updatedomain: UInt, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterAddGroupToGroupSetWithDomainsEx(hgroupset, hgroup, faultdomain.toInt(), updatedomain.toInt(), lpszreason).toUInt()

public actual fun ClusterAffinityRuleControl(hcluster: HCLUSTER, affinityrulename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterAffinityRuleControl(hcluster, affinityrulename, hhostnode, dwcontrolcode.toInt(), lpinbuffer, cbinbuffersize.toInt(), lpoutbuffer, cboutbuffersize.toInt(), lpbytesreturned).toUInt()

public actual fun ClusterClearBackupStateForSharedVolume(lpszvolumepathname: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterClearBackupStateForSharedVolume(lpszvolumepathname).toUInt()

public actual fun ClusterCloseEnum(henum: HCLUSENUM): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterCloseEnum(henum).toUInt()

public actual fun ClusterCloseEnumEx(hclusterenum: HCLUSENUMEX): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterCloseEnumEx(hclusterenum).toUInt()

public actual fun ClusterControl(hcluster: HCLUSTER, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterControl(hcluster, hhostnode, dwcontrolcode.toInt(), lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesreturned).toUInt()

public actual fun ClusterControlEx(hcluster: HCLUSTER, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterControlEx(hcluster, hhostnode, dwcontrolcode.toInt(), lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesreturned, lpszreason).toUInt()

public actual fun ClusterCreateAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR, ruletype: CLUS_AFFINITY_RULE_TYPE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterCreateAffinityRule(hcluster, rulename, ruletype).toUInt()

public actual fun ClusterDecrypt(hcluscryptprovider: HCLUSCRYPTPROVIDER, pcryptinput: Long, cbcryptinput: UInt, ppcryptoutput: Long, pcbcryptoutput: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterDecrypt(hcluscryptprovider, pcryptinput, cbcryptinput.toInt(), ppcryptoutput, pcbcryptoutput).toUInt()

public actual fun ClusterEncrypt(hcluscryptprovider: HCLUSCRYPTPROVIDER, pdata: Long, cbdata: UInt, ppdata: Long, pcbdata: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterEncrypt(hcluscryptprovider, pdata, cbdata.toInt(), ppdata, pcbdata).toUInt()

public actual fun ClusterEnum(henum: HCLUSENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterEnum(henum, dwindex.toInt(), lpdwtype, lpszname, lpcchname).toUInt()

public actual fun ClusterEnumEx(hclusterenum: HCLUSENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterEnumEx(hclusterenum, dwindex.toInt(), pitem, cbitem).toUInt()

public actual fun ClusterGetEnumCount(henum: HCLUSENUM): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGetEnumCount(henum).toUInt()

public actual fun ClusterGetEnumCountEx(hclusterenum: HCLUSENUMEX): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGetEnumCountEx(hclusterenum).toUInt()

public actual fun ClusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: PCWSTR, lpszvolumename: PWSTR, cchbufferlength: UInt): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint, lpszvolumename, cchbufferlength.toInt())

public actual fun ClusterGetVolumePathName(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, cchbufferlength: UInt): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGetVolumePathName(lpszfilename, lpszvolumepathname, cchbufferlength.toInt())

public actual fun ClusterGroupCloseEnum(hgroupenum: HGROUPENUM): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnum(hgroupenum).toUInt()

public actual fun ClusterGroupCloseEnumEx(hgroupenumex: HGROUPENUMEX): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupCloseEnumEx(hgroupenumex).toUInt()

public actual fun ClusterGroupControl(hgroup: HGROUP, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupControl(hgroup, hhostnode, dwcontrolcode.toInt(), lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesreturned).toUInt()

public actual fun ClusterGroupControlEx(hgroup: HGROUP, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupControlEx(hgroup, hhostnode, dwcontrolcode.toInt(), lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesreturned, lpszreason).toUInt()

public actual fun ClusterGroupEnum(hgroupenum: HGROUPENUM, dwindex: UInt, lpdwtype: Long, lpszresourcename: PWSTR, lpcchname: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupEnum(hgroupenum, dwindex.toInt(), lpdwtype, lpszresourcename, lpcchname).toUInt()

public actual fun ClusterGroupEnumEx(hgroupenumex: HGROUPENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupEnumEx(hgroupenumex, dwindex.toInt(), pitem, cbitem).toUInt()

public actual fun ClusterGroupGetEnumCount(hgroupenum: HGROUPENUM): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCount(hgroupenum).toUInt()

public actual fun ClusterGroupGetEnumCountEx(hgroupenumex: HGROUPENUMEX): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupGetEnumCountEx(hgroupenumex).toUInt()

public actual fun ClusterGroupOpenEnum(hgroup: HGROUP, dwtype: UInt): HGROUPENUM =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnum(hgroup, dwtype.toInt())

public actual fun ClusterGroupOpenEnumEx(hcluster: HCLUSTER, lpszproperties: PCWSTR, cbproperties: UInt, lpszroproperties: PCWSTR, cbroproperties: UInt, dwflags: UInt): HGROUPENUMEX =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupOpenEnumEx(hcluster, lpszproperties, cbproperties.toInt(), lpszroproperties, cbroproperties.toInt(), dwflags.toInt())

public actual fun ClusterGroupSetCloseEnum(hgroupsetenum: HGROUPSETENUM): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupSetCloseEnum(hgroupsetenum).toUInt()

public actual fun ClusterGroupSetControl(hgroupset: HGROUPSET, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupSetControl(hgroupset, hhostnode, dwcontrolcode.toInt(), lpinbuffer, cbinbuffersize.toInt(), lpoutbuffer, cboutbuffersize.toInt(), lpbytesreturned).toUInt()

public actual fun ClusterGroupSetControlEx(hgroupset: HGROUPSET, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupSetControlEx(hgroupset, hhostnode, dwcontrolcode.toInt(), lpinbuffer, cbinbuffersize.toInt(), lpoutbuffer, cboutbuffersize.toInt(), lpbytesreturned, lpszreason).toUInt()

public actual fun ClusterGroupSetEnum(hgroupsetenum: HGROUPSETENUM, dwindex: UInt, lpszname: PWSTR, lpcchname: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupSetEnum(hgroupsetenum, dwindex.toInt(), lpszname, lpcchname).toUInt()

public actual fun ClusterGroupSetGetEnumCount(hgroupsetenum: HGROUPSETENUM): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupSetGetEnumCount(hgroupsetenum).toUInt()

public actual fun ClusterGroupSetOpenEnum(hcluster: HCLUSTER): HGROUPSETENUM =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterGroupSetOpenEnum(hcluster)

public actual fun ClusterIsPathOnSharedVolume(lpszpathname: PCWSTR): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterIsPathOnSharedVolume(lpszpathname)

public actual fun ClusterNetInterfaceCloseEnum(hnetinterfaceenum: HNETINTERFACEENUM): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNetInterfaceCloseEnum(hnetinterfaceenum).toUInt()

public actual fun ClusterNetInterfaceControl(hnetinterface: HNETINTERFACE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControl(hnetinterface, hhostnode, dwcontrolcode.toInt(), lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesreturned).toUInt()

public actual fun ClusterNetInterfaceControlEx(hnetinterface: HNETINTERFACE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNetInterfaceControlEx(hnetinterface, hhostnode, dwcontrolcode.toInt(), lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesreturned, lpszreason).toUInt()

public actual fun ClusterNetInterfaceEnum(hnetinterfaceenum: HNETINTERFACEENUM, dwindex: UInt, lpszname: PWSTR, lpcchname: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNetInterfaceEnum(hnetinterfaceenum, dwindex.toInt(), lpszname, lpcchname).toUInt()

public actual fun ClusterNetInterfaceOpenEnum(hcluster: HCLUSTER, lpsznodename: PCWSTR, lpsznetworkname: PCWSTR): HNETINTERFACEENUM =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNetInterfaceOpenEnum(hcluster, lpsznodename, lpsznetworkname)

public actual fun ClusterNetworkCloseEnum(hnetworkenum: HNETWORKENUM): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNetworkCloseEnum(hnetworkenum).toUInt()

public actual fun ClusterNetworkControl(hnetwork: HNETWORK, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNetworkControl(hnetwork, hhostnode, dwcontrolcode.toInt(), lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesreturned).toUInt()

public actual fun ClusterNetworkControlEx(hnetwork: HNETWORK, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNetworkControlEx(hnetwork, hhostnode, dwcontrolcode.toInt(), lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesreturned, lpszreason).toUInt()

public actual fun ClusterNetworkEnum(hnetworkenum: HNETWORKENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNetworkEnum(hnetworkenum, dwindex.toInt(), lpdwtype, lpszname, lpcchname).toUInt()

public actual fun ClusterNetworkGetEnumCount(hnetworkenum: HNETWORKENUM): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNetworkGetEnumCount(hnetworkenum).toUInt()

public actual fun ClusterNetworkOpenEnum(hnetwork: HNETWORK, dwtype: UInt): HNETWORKENUM =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNetworkOpenEnum(hnetwork, dwtype.toInt())

public actual fun ClusterNodeCloseEnum(hnodeenum: HNODEENUM): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnum(hnodeenum).toUInt()

public actual fun ClusterNodeCloseEnumEx(hnodeenum: HNODEENUMEX): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNodeCloseEnumEx(hnodeenum).toUInt()

public actual fun ClusterNodeControl(hnode: HNODE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNodeControl(hnode, hhostnode, dwcontrolcode.toInt(), lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesreturned).toUInt()

public actual fun ClusterNodeControlEx(hnode: HNODE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNodeControlEx(hnode, hhostnode, dwcontrolcode.toInt(), lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesreturned, lpszreason).toUInt()

public actual fun ClusterNodeEnum(hnodeenum: HNODEENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNodeEnum(hnodeenum, dwindex.toInt(), lpdwtype, lpszname, lpcchname).toUInt()

public actual fun ClusterNodeEnumEx(hnodeenum: HNODEENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNodeEnumEx(hnodeenum, dwindex.toInt(), pitem, cbitem).toUInt()

public actual fun ClusterNodeGetEnumCount(hnodeenum: HNODEENUM): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCount(hnodeenum).toUInt()

public actual fun ClusterNodeGetEnumCountEx(hnodeenum: HNODEENUMEX): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNodeGetEnumCountEx(hnodeenum).toUInt()

public actual fun ClusterNodeOpenEnum(hnode: HNODE, dwtype: UInt): HNODEENUM =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnum(hnode, dwtype.toInt())

public actual fun ClusterNodeOpenEnumEx(hnode: HNODE, dwtype: UInt, poptions: Long): HNODEENUMEX =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNodeOpenEnumEx(hnode, dwtype.toInt(), poptions)

public actual fun ClusterNodeReplacement(hcluster: HCLUSTER, lpsznodenamecurrent: PCWSTR, lpsznodenamenew: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterNodeReplacement(hcluster, lpsznodenamecurrent, lpsznodenamenew).toUInt()

public actual fun ClusterOpenEnum(hcluster: HCLUSTER, dwtype: UInt): HCLUSENUM =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterOpenEnum(hcluster, dwtype.toInt())

public actual fun ClusterOpenEnumEx(hcluster: HCLUSTER, dwtype: UInt, poptions: Long): HCLUSENUMEX =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterOpenEnumEx(hcluster, dwtype.toInt(), poptions)

public actual fun ClusterPrepareSharedVolumeForBackup(lpszfilename: PCWSTR, lpszvolumepathname: PWSTR, lpcchvolumepathname: Long, lpszvolumename: PWSTR, lpcchvolumename: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterPrepareSharedVolumeForBackup(lpszfilename, lpszvolumepathname, lpcchvolumepathname, lpszvolumename, lpcchvolumename).toUInt()

public actual fun ClusterRegBatchAddCommand(hregbatch: HREGBATCH, dwcommand: CLUSTER_REG_COMMAND, wzname: PCWSTR, dwoptions: UInt, lpdata: Long, cbdata: UInt): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegBatchAddCommand(hregbatch, dwcommand, wzname, dwoptions.toInt(), lpdata, cbdata.toInt())

public actual fun ClusterRegBatchCloseNotification(hbatchnotification: HREGBATCHNOTIFICATION): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegBatchCloseNotification(hbatchnotification)

public actual fun ClusterRegBatchReadCommand(hbatchnotification: HREGBATCHNOTIFICATION, pbatchcommand: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegBatchReadCommand(hbatchnotification, pbatchcommand)

public actual fun ClusterRegCloseBatch(hregbatch: HREGBATCH, bcommit: BOOL, failedcommandnumber: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegCloseBatch(hregbatch, bcommit, failedcommandnumber)

public actual fun ClusterRegCloseBatchEx(hregbatch: HREGBATCH, flags: UInt, failedcommandnumber: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchEx(hregbatch, flags.toInt(), failedcommandnumber)

public actual fun ClusterRegCloseBatchNotifyPort(hbatchnotifyport: HREGBATCHPORT): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegCloseBatchNotifyPort(hbatchnotifyport)

public actual fun ClusterRegCloseKey(hkey: HKEY): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegCloseKey(hkey)

public actual fun ClusterRegCloseReadBatch(hregreadbatch: HREGREADBATCH, phregreadbatchreply: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatch(hregreadbatch, phregreadbatchreply)

public actual fun ClusterRegCloseReadBatchEx(hregreadbatch: HREGREADBATCH, flags: UInt, phregreadbatchreply: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchEx(hregreadbatch, flags.toInt(), phregreadbatchreply)

public actual fun ClusterRegCloseReadBatchReply(hregreadbatchreply: HREGREADBATCHREPLY): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegCloseReadBatchReply(hregreadbatchreply)

public actual fun ClusterRegCreateBatch(hkey: HKEY, phregbatch: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegCreateBatch(hkey, phregbatch)

public actual fun ClusterRegCreateBatchNotifyPort(hkey: HKEY, phbatchnotifyport: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegCreateBatchNotifyPort(hkey, phbatchnotifyport)

public actual fun ClusterRegCreateKey(hkey: HKEY, lpszsubkey: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegCreateKey(hkey, lpszsubkey, dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes, phkresult, lpdwdisposition)

public actual fun ClusterRegCreateKeyEx(hkey: HKEY, lpsubkey: PCWSTR, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, lpszreason: PCWSTR): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegCreateKeyEx(hkey, lpsubkey, dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes, phkresult, lpdwdisposition, lpszreason)

public actual fun ClusterRegCreateReadBatch(hkey: HKEY, phregreadbatch: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegCreateReadBatch(hkey, phregreadbatch)

public actual fun ClusterRegDeleteKey(hkey: HKEY, lpszsubkey: PCWSTR): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegDeleteKey(hkey, lpszsubkey)

public actual fun ClusterRegDeleteKeyEx(hkey: HKEY, lpsubkey: PCWSTR, lpszreason: PCWSTR): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegDeleteKeyEx(hkey, lpsubkey, lpszreason)

public actual fun ClusterRegDeleteValue(hkey: HKEY, lpszvaluename: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegDeleteValue(hkey, lpszvaluename).toUInt()

public actual fun ClusterRegDeleteValueEx(hkey: HKEY, lpszvaluename: PCWSTR, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegDeleteValueEx(hkey, lpszvaluename, lpszreason).toUInt()

public actual fun ClusterRegEnumKey(hkey: HKEY, dwindex: UInt, lpszname: PWSTR, lpcchname: Long, lpftlastwritetime: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegEnumKey(hkey, dwindex.toInt(), lpszname, lpcchname, lpftlastwritetime)

public actual fun ClusterRegEnumValue(hkey: HKEY, dwindex: UInt, lpszvaluename: PWSTR, lpcchvaluename: Long, lpdwtype: Long, lpdata: Long, lpcbdata: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegEnumValue(hkey, dwindex.toInt(), lpszvaluename, lpcchvaluename, lpdwtype, lpdata, lpcbdata).toUInt()

public actual fun ClusterRegGetBatchNotification(hbatchnotify: HREGBATCHPORT, phbatchnotification: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegGetBatchNotification(hbatchnotify, phbatchnotification)

public actual fun ClusterRegGetKeySecurity(hkey: HKEY, requestedinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegGetKeySecurity(hkey, requestedinformation.toInt(), psecuritydescriptor, lpcbsecuritydescriptor)

public actual fun ClusterRegOpenKey(hkey: HKEY, lpszsubkey: PCWSTR, samdesired: UInt, phkresult: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegOpenKey(hkey, lpszsubkey, samdesired.toInt(), phkresult)

public actual fun ClusterRegQueryInfoKey(hkey: HKEY, lpcsubkeys: Long, lpcchmaxsubkeylen: Long, lpcvalues: Long, lpcchmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegQueryInfoKey(hkey, lpcsubkeys, lpcchmaxsubkeylen, lpcvalues, lpcchmaxvaluenamelen, lpcbmaxvaluelen, lpcbsecuritydescriptor, lpftlastwritetime)

public actual fun ClusterRegQueryValue(hkey: HKEY, lpszvaluename: PCWSTR, lpdwvaluetype: Long, lpdata: Long, lpcbdata: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegQueryValue(hkey, lpszvaluename, lpdwvaluetype, lpdata, lpcbdata)

public actual fun ClusterRegReadBatchAddCommand(hregreadbatch: HREGREADBATCH, wzsubkeyname: PCWSTR, wzvaluename: PCWSTR): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegReadBatchAddCommand(hregreadbatch, wzsubkeyname, wzvaluename)

public actual fun ClusterRegReadBatchReplyNextCommand(hregreadbatchreply: HREGREADBATCHREPLY, pbatchcommand: Long): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegReadBatchReplyNextCommand(hregreadbatchreply, pbatchcommand)

public actual fun ClusterRegSetKeySecurity(hkey: HKEY, securityinformation: UInt, psecuritydescriptor: PSECURITY_DESCRIPTOR): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurity(hkey, securityinformation.toInt(), psecuritydescriptor)

public actual fun ClusterRegSetKeySecurityEx(hkey: HKEY, securityinformation: OBJECT_SECURITY_INFORMATION, psecuritydescriptor: PSECURITY_DESCRIPTOR, lpszreason: PCWSTR): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegSetKeySecurityEx(hkey, securityinformation.toInt(), psecuritydescriptor, lpszreason)

public actual fun ClusterRegSetValue(hkey: HKEY, lpszvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegSetValue(hkey, lpszvaluename, dwtype.toInt(), lpdata, cbdata.toInt()).toUInt()

public actual fun ClusterRegSetValueEx(hkey: HKEY, lpszvaluename: PCWSTR, dwtype: UInt, lpdata: Long, cbdata: UInt, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegSetValueEx(hkey, lpszvaluename, dwtype.toInt(), lpdata, cbdata.toInt(), lpszreason).toUInt()

public actual fun ClusterRegSyncDatabase(hcluster: HCLUSTER, flags: UInt): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRegSyncDatabase(hcluster, flags.toInt())

public actual fun ClusterRemoveAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRemoveAffinityRule(hcluster, rulename).toUInt()

public actual fun ClusterRemoveGroupFromAffinityRule(hcluster: HCLUSTER, rulename: PCWSTR, hgroup: HGROUP): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromAffinityRule(hcluster, rulename, hgroup).toUInt()

public actual fun ClusterRemoveGroupFromGroupSet(hgroup: HGROUP): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSet(hgroup).toUInt()

public actual fun ClusterRemoveGroupFromGroupSetEx(hgroup: HGROUP, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterRemoveGroupFromGroupSetEx(hgroup, lpszreason).toUInt()

public actual fun ClusterResourceCloseEnum(hresenum: HRESENUM): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnum(hresenum).toUInt()

public actual fun ClusterResourceCloseEnumEx(hresourceenumex: HRESENUMEX): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceCloseEnumEx(hresourceenumex).toUInt()

public actual fun ClusterResourceControl(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceControl(hresource, hhostnode, dwcontrolcode.toInt(), lpinbuffer, cbinbuffersize.toInt(), lpoutbuffer, cboutbuffersize.toInt(), lpbytesreturned).toUInt()

public actual fun ClusterResourceControlAsUser(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUser(hresource, hhostnode, dwcontrolcode.toInt(), lpinbuffer, cbinbuffersize.toInt(), lpoutbuffer, cboutbuffersize.toInt(), lpbytesreturned).toUInt()

public actual fun ClusterResourceControlAsUserEx(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceControlAsUserEx(hresource, hhostnode, dwcontrolcode.toInt(), lpinbuffer, cbinbuffersize.toInt(), lpoutbuffer, cboutbuffersize.toInt(), lpbytesreturned, lpszreason).toUInt()

public actual fun ClusterResourceControlEx(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpoutbuffer: Long, cboutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceControlEx(hresource, hhostnode, dwcontrolcode.toInt(), lpinbuffer, cbinbuffersize.toInt(), lpoutbuffer, cboutbuffersize.toInt(), lpbytesreturned, lpszreason).toUInt()

public actual fun ClusterResourceEnum(hresenum: HRESENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceEnum(hresenum, dwindex.toInt(), lpdwtype, lpszname, lpcchname).toUInt()

public actual fun ClusterResourceEnumEx(hresourceenumex: HRESENUMEX, dwindex: UInt, pitem: Long, cbitem: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceEnumEx(hresourceenumex, dwindex.toInt(), pitem, cbitem).toUInt()

public actual fun ClusterResourceGetEnumCount(hresenum: HRESENUM): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCount(hresenum).toUInt()

public actual fun ClusterResourceGetEnumCountEx(hresourceenumex: HRESENUMEX): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceGetEnumCountEx(hresourceenumex).toUInt()

public actual fun ClusterResourceOpenEnum(hresource: HRESOURCE, dwtype: UInt): HRESENUM =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnum(hresource, dwtype.toInt())

public actual fun ClusterResourceOpenEnumEx(hcluster: HCLUSTER, lpszproperties: PCWSTR, cbproperties: UInt, lpszroproperties: PCWSTR, cbroproperties: UInt, dwflags: UInt): HRESENUMEX =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceOpenEnumEx(hcluster, lpszproperties, cbproperties.toInt(), lpszroproperties, cbroproperties.toInt(), dwflags.toInt())

public actual fun ClusterResourceTypeCloseEnum(hrestypeenum: HRESTYPEENUM): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceTypeCloseEnum(hrestypeenum).toUInt()

public actual fun ClusterResourceTypeControl(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceTypeControl(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode.toInt(), lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesreturned).toUInt()

public actual fun ClusterResourceTypeControlAsUser(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUser(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode.toInt(), lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesreturned).toUInt()

public actual fun ClusterResourceTypeControlAsUserEx(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlAsUserEx(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode.toInt(), lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesreturned, lpszreason).toUInt()

public actual fun ClusterResourceTypeControlEx(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, hhostnode: HNODE, dwcontrolcode: UInt, lpinbuffer: Long, ninbuffersize: UInt, lpoutbuffer: Long, noutbuffersize: UInt, lpbytesreturned: Long, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceTypeControlEx(hcluster, lpszresourcetypename, hhostnode, dwcontrolcode.toInt(), lpinbuffer, ninbuffersize.toInt(), lpoutbuffer, noutbuffersize.toInt(), lpbytesreturned, lpszreason).toUInt()

public actual fun ClusterResourceTypeEnum(hrestypeenum: HRESTYPEENUM, dwindex: UInt, lpdwtype: Long, lpszname: PWSTR, lpcchname: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceTypeEnum(hrestypeenum, dwindex.toInt(), lpdwtype, lpszname, lpcchname).toUInt()

public actual fun ClusterResourceTypeGetEnumCount(hrestypeenum: HRESTYPEENUM): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceTypeGetEnumCount(hrestypeenum).toUInt()

public actual fun ClusterResourceTypeOpenEnum(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, dwtype: UInt): HRESTYPEENUM =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterResourceTypeOpenEnum(hcluster, lpszresourcetypename, dwtype.toInt())

public actual fun ClusterSetAccountAccess(hcluster: HCLUSTER, szaccountsid: PCWSTR, dwaccess: UInt, dwcontroltype: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterSetAccountAccess(hcluster, szaccountsid, dwaccess.toInt(), dwcontroltype.toInt()).toUInt()

public actual fun ClusterSharedVolumeSetSnapshotState(guidsnapshotset: GUID, lpszvolumename: PCWSTR, state: CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE): UInt =
    0u

public actual fun ClusterUpgradeFunctionalLevel(hcluster: HCLUSTER, perform: BOOL, pfnprogresscallback: PCLUSTER_UPGRADE_PROGRESS_CALLBACK, pvcallbackarg: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ClusterUpgradeFunctionalLevel(hcluster, perform, pfnprogresscallback.toLong(), pvcallbackarg).toUInt()

public actual fun CreateCluster(pconfig: Long, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): HCLUSTER =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CreateCluster(pconfig, pfnprogresscallback.toLong(), pvcallbackarg)

public actual fun CreateClusterAvailabilitySet(hcluster: HCLUSTER, lpavailabilitysetname: PCWSTR, pavailabilitysetconfig: Long): HGROUPSET =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CreateClusterAvailabilitySet(hcluster, lpavailabilitysetname, pavailabilitysetconfig)

public actual fun CreateClusterGroup(hcluster: HCLUSTER, lpszgroupname: PCWSTR): HGROUP =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CreateClusterGroup(hcluster, lpszgroupname)

public actual fun CreateClusterGroupEx(hcluster: HCLUSTER, lpszgroupname: PCWSTR, pgroupinfo: Long): HGROUP =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CreateClusterGroupEx(hcluster, lpszgroupname, pgroupinfo)

public actual fun CreateClusterGroupSet(hcluster: HCLUSTER, groupsetname: PCWSTR): HGROUPSET =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CreateClusterGroupSet(hcluster, groupsetname)

public actual fun CreateClusterNameAccount(hcluster: HCLUSTER, pconfig: Long, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CreateClusterNameAccount(hcluster, pconfig, pfnprogresscallback.toLong(), pvcallbackarg).toUInt()

public actual fun CreateClusterNotifyPort(hchange: HCHANGE, hcluster: HCLUSTER, dwfilter: UInt, dwnotifykey: ULong): HCHANGE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CreateClusterNotifyPort(hchange, hcluster, dwfilter.toInt(), dwnotifykey.toLong())

public actual fun CreateClusterNotifyPortV2(hchange: HCHANGE, hcluster: HCLUSTER, filters: Long, dwfiltercount: UInt, dwnotifykey: ULong): HCHANGE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CreateClusterNotifyPortV2(hchange, hcluster, filters, dwfiltercount.toInt(), dwnotifykey.toLong())

public actual fun CreateClusterResource(hgroup: HGROUP, lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwflags: UInt): HRESOURCE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CreateClusterResource(hgroup, lpszresourcename, lpszresourcetype, dwflags.toInt())

public actual fun CreateClusterResourceEx(hgroup: HGROUP, lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwflags: UInt, lpszreason: PCWSTR): HRESOURCE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CreateClusterResourceEx(hgroup, lpszresourcename, lpszresourcetype, dwflags.toInt(), lpszreason)

public actual fun CreateClusterResourceType(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, lpszdisplayname: PCWSTR, lpszresourcetypedll: PCWSTR, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CreateClusterResourceType(hcluster, lpszresourcetypename, lpszdisplayname, lpszresourcetypedll, dwlooksalivepollinterval.toInt(), dwisalivepollinterval.toInt()).toUInt()

public actual fun CreateClusterResourceTypeEx(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR, lpszdisplayname: PCWSTR, lpszresourcetypedll: PCWSTR, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_CreateClusterResourceTypeEx(hcluster, lpszresourcetypename, lpszdisplayname, lpszresourcetypedll, dwlooksalivepollinterval.toInt(), dwisalivepollinterval.toInt(), lpszreason).toUInt()

public actual fun DeleteClusterGroup(hgroup: HGROUP): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_DeleteClusterGroup(hgroup).toUInt()

public actual fun DeleteClusterGroupEx(hgroup: HGROUP, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_DeleteClusterGroupEx(hgroup, lpszreason).toUInt()

public actual fun DeleteClusterGroupSet(hgroupset: HGROUPSET): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_DeleteClusterGroupSet(hgroupset).toUInt()

public actual fun DeleteClusterGroupSetEx(hgroupset: HGROUPSET, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_DeleteClusterGroupSetEx(hgroupset, lpszreason).toUInt()

public actual fun DeleteClusterResource(hresource: HRESOURCE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_DeleteClusterResource(hresource).toUInt()

public actual fun DeleteClusterResourceEx(hresource: HRESOURCE, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_DeleteClusterResourceEx(hresource, lpszreason).toUInt()

public actual fun DeleteClusterResourceType(hcluster: HCLUSTER, lpszresourcetypename: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_DeleteClusterResourceType(hcluster, lpszresourcetypename).toUInt()

public actual fun DeleteClusterResourceTypeEx(hcluster: HCLUSTER, lpsztypename: PCWSTR, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_DeleteClusterResourceTypeEx(hcluster, lpsztypename, lpszreason).toUInt()

public actual fun DestroyCluster(hcluster: HCLUSTER, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: Long, fdeletevirtualcomputerobjects: BOOL): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_DestroyCluster(hcluster, pfnprogresscallback.toLong(), pvcallbackarg, fdeletevirtualcomputerobjects).toUInt()

public actual fun DestroyClusterGroup(hgroup: HGROUP): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_DestroyClusterGroup(hgroup).toUInt()

public actual fun DestroyClusterGroupEx(hgroup: HGROUP, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_DestroyClusterGroupEx(hgroup, lpszreason).toUInt()

public actual fun DetermineCNOResTypeFromCluster(hcluster: HCLUSTER, pcnorestype: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromCluster(hcluster, pcnorestype).toUInt()

public actual fun DetermineCNOResTypeFromNodelist(cnodes: UInt, ppsznodenames: Long, pcnorestype: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_DetermineCNOResTypeFromNodelist(cnodes.toInt(), ppsznodenames, pcnorestype).toUInt()

public actual fun DetermineClusterCloudTypeFromCluster(hcluster: HCLUSTER, pcloudtype: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromCluster(hcluster, pcloudtype).toUInt()

public actual fun DetermineClusterCloudTypeFromNodelist(cnodes: UInt, ppsznodenames: Long, pcloudtype: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_DetermineClusterCloudTypeFromNodelist(cnodes.toInt(), ppsznodenames, pcloudtype).toUInt()

public actual fun EvictClusterNode(hnode: HNODE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_EvictClusterNode(hnode).toUInt()

public actual fun EvictClusterNodeEx(hnode: HNODE, dwtimeout: UInt, phrcleanupstatus: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_EvictClusterNodeEx(hnode, dwtimeout.toInt(), phrcleanupstatus).toUInt()

public actual fun EvictClusterNodeEx2(hnode: HNODE, dwtimeout: UInt, phrcleanupstatus: Long, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_EvictClusterNodeEx2(hnode, dwtimeout.toInt(), phrcleanupstatus, lpszreason).toUInt()

public actual fun FailClusterResource(hresource: HRESOURCE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_FailClusterResource(hresource).toUInt()

public actual fun FailClusterResourceEx(hresource: HRESOURCE, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_FailClusterResourceEx(hresource, lpszreason).toUInt()

public actual fun FreeClusterCrypt(pcryptinfo: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_FreeClusterCrypt(pcryptinfo).toUInt()

public actual fun FreeClusterHealthFault(clusterhealthfault: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_FreeClusterHealthFault(clusterhealthfault).toUInt()

public actual fun FreeClusterHealthFaultArray(clusterhealthfaultarray: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_FreeClusterHealthFaultArray(clusterhealthfaultarray).toUInt()

public actual fun GetClusterFromGroup(hgroup: HGROUP): HCLUSTER =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterFromGroup(hgroup)

public actual fun GetClusterFromNetInterface(hnetinterface: HNETINTERFACE): HCLUSTER =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterFromNetInterface(hnetinterface)

public actual fun GetClusterFromNetwork(hnetwork: HNETWORK): HCLUSTER =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterFromNetwork(hnetwork)

public actual fun GetClusterFromNode(hnode: HNODE): HCLUSTER =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterFromNode(hnode)

public actual fun GetClusterFromResource(hresource: HRESOURCE): HCLUSTER =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterFromResource(hresource)

public actual fun GetClusterGroupKey(hgroup: HGROUP, samdesired: UInt): HKEY =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterGroupKey(hgroup, samdesired.toInt())

public actual fun GetClusterGroupState(hgroup: HGROUP, lpsznodename: PWSTR, lpcchnodename: Long): CLUSTER_GROUP_STATE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterGroupState(hgroup, lpsznodename, lpcchnodename)

public actual fun GetClusterInformation(hcluster: HCLUSTER, lpszclustername: PWSTR, lpcchclustername: Long, lpclusterinfo: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterInformation(hcluster, lpszclustername, lpcchclustername, lpclusterinfo).toUInt()

public actual fun GetClusterKey(hcluster: HCLUSTER, samdesired: UInt): HKEY =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterKey(hcluster, samdesired.toInt())

public actual fun GetClusterNetInterface(hcluster: HCLUSTER, lpsznodename: PCWSTR, lpsznetworkname: PCWSTR, lpszinterfacename: PWSTR, lpcchinterfacename: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterNetInterface(hcluster, lpsznodename, lpsznetworkname, lpszinterfacename, lpcchinterfacename).toUInt()

public actual fun GetClusterNetInterfaceKey(hnetinterface: HNETINTERFACE, samdesired: UInt): HKEY =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceKey(hnetinterface, samdesired.toInt())

public actual fun GetClusterNetInterfaceState(hnetinterface: HNETINTERFACE): CLUSTER_NETINTERFACE_STATE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterNetInterfaceState(hnetinterface)

public actual fun GetClusterNetworkId(hnetwork: HNETWORK, lpsznetworkid: PWSTR, lpcchname: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterNetworkId(hnetwork, lpsznetworkid, lpcchname).toUInt()

public actual fun GetClusterNetworkKey(hnetwork: HNETWORK, samdesired: UInt): HKEY =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterNetworkKey(hnetwork, samdesired.toInt())

public actual fun GetClusterNetworkState(hnetwork: HNETWORK): CLUSTER_NETWORK_STATE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterNetworkState(hnetwork)

public actual fun GetClusterNodeId(hnode: HNODE, lpsznodeid: PWSTR, lpcchname: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterNodeId(hnode, lpsznodeid, lpcchname).toUInt()

public actual fun GetClusterNodeKey(hnode: HNODE, samdesired: UInt): HKEY =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterNodeKey(hnode, samdesired.toInt())

public actual fun GetClusterNodeState(hnode: HNODE): CLUSTER_NODE_STATE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterNodeState(hnode)

public actual fun GetClusterNotify(hchange: HCHANGE, lpdwnotifykey: Long, lpdwfiltertype: Long, lpszname: PWSTR, lpcchname: Long, dwmilliseconds: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterNotify(hchange, lpdwnotifykey, lpdwfiltertype, lpszname, lpcchname, dwmilliseconds.toInt()).toUInt()

public actual fun GetClusterNotifyV2(hchange: HCHANGE, lpdwnotifykey: Long, pfilterandtype: Long, buffer: Long, lpbbuffersize: Long, lpszobjectid: PWSTR, lpcchobjectid: Long, lpszparentid: PWSTR, lpcchparentid: Long, lpszname: PWSTR, lpcchname: Long, lpsztype: PWSTR, lpcchtype: Long, dwmilliseconds: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterNotifyV2(hchange, lpdwnotifykey, pfilterandtype, buffer, lpbbuffersize, lpszobjectid, lpcchobjectid, lpszparentid, lpcchparentid, lpszname, lpcchname, lpsztype, lpcchtype, dwmilliseconds.toInt()).toUInt()

public actual fun GetClusterQuorumResource(hcluster: HCLUSTER, lpszresourcename: PWSTR, lpcchresourcename: Long, lpszdevicename: PWSTR, lpcchdevicename: Long, lpdwmaxquorumlogsize: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterQuorumResource(hcluster, lpszresourcename, lpcchresourcename, lpszdevicename, lpcchdevicename, lpdwmaxquorumlogsize).toUInt()

public actual fun GetClusterResourceDependencyExpression(hresource: HRESOURCE, lpszdependencyexpression: PWSTR, lpcchdependencyexpression: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterResourceDependencyExpression(hresource, lpszdependencyexpression, lpcchdependencyexpression).toUInt()

public actual fun GetClusterResourceKey(hresource: HRESOURCE, samdesired: UInt): HKEY =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterResourceKey(hresource, samdesired.toInt())

public actual fun GetClusterResourceNetworkName(hresource: HRESOURCE, lpbuffer: PWSTR, nsize: Long): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterResourceNetworkName(hresource, lpbuffer, nsize)

public actual fun GetClusterResourceState(hresource: HRESOURCE, lpsznodename: PWSTR, lpcchnodename: Long, lpszgroupname: PWSTR, lpcchgroupname: Long): CLUSTER_RESOURCE_STATE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterResourceState(hresource, lpsznodename, lpcchnodename, lpszgroupname, lpcchgroupname)

public actual fun GetClusterResourceTypeKey(hcluster: HCLUSTER, lpsztypename: PCWSTR, samdesired: UInt): HKEY =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetClusterResourceTypeKey(hcluster, lpsztypename, samdesired.toInt())

public actual fun GetNodeCloudTypeDW(ppsznodename: PCWSTR, nodecloudtype: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetNodeCloudTypeDW(ppsznodename, nodecloudtype).toUInt()

public actual fun GetNodeClusterState(lpsznodename: PCWSTR, pdwclusterstate: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetNodeClusterState(lpsznodename, pdwclusterstate).toUInt()

public actual fun GetNotifyEventHandle(hchange: HCHANGE, lphtargetevent: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_GetNotifyEventHandle(hchange, lphtargetevent).toUInt()

public actual fun InitializeClusterHealthFault(clusterhealthfault: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_InitializeClusterHealthFault(clusterhealthfault).toUInt()

public actual fun InitializeClusterHealthFaultArray(clusterhealthfaultarray: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_InitializeClusterHealthFaultArray(clusterhealthfaultarray).toUInt()

public actual fun IsFileOnClusterSharedVolume(lpszpathname: PCWSTR, pbfileisonsharedvolume: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_IsFileOnClusterSharedVolume(lpszpathname, pbfileisonsharedvolume).toUInt()

public actual fun MoveClusterGroup(hgroup: HGROUP, hdestinationnode: HNODE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_MoveClusterGroup(hgroup, hdestinationnode).toUInt()

public actual fun MoveClusterGroupEx(hgroup: HGROUP, hdestinationnode: HNODE, dwmoveflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_MoveClusterGroupEx(hgroup, hdestinationnode, dwmoveflags.toInt(), lpinbuffer, cbinbuffersize.toInt()).toUInt()

public actual fun MoveClusterGroupEx2(hgroup: HGROUP, hdestinationnode: HNODE, dwmoveflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_MoveClusterGroupEx2(hgroup, hdestinationnode, dwmoveflags.toInt(), lpinbuffer, cbinbuffersize.toInt(), lpszreason).toUInt()

public actual fun OfflineClusterGroup(hgroup: HGROUP): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OfflineClusterGroup(hgroup).toUInt()

public actual fun OfflineClusterGroupEx(hgroup: HGROUP, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx(hgroup, dwofflineflags.toInt(), lpinbuffer, cbinbuffersize.toInt()).toUInt()

public actual fun OfflineClusterGroupEx2(hgroup: HGROUP, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OfflineClusterGroupEx2(hgroup, dwofflineflags.toInt(), lpinbuffer, cbinbuffersize.toInt(), lpszreason).toUInt()

public actual fun OfflineClusterResource(hresource: HRESOURCE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OfflineClusterResource(hresource).toUInt()

public actual fun OfflineClusterResourceEx(hresource: HRESOURCE, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx(hresource, dwofflineflags.toInt(), lpinbuffer, cbinbuffersize.toInt()).toUInt()

public actual fun OfflineClusterResourceEx2(hresource: HRESOURCE, dwofflineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OfflineClusterResourceEx2(hresource, dwofflineflags.toInt(), lpinbuffer, cbinbuffersize.toInt(), lpszreason).toUInt()

public actual fun OnlineClusterGroup(hgroup: HGROUP, hdestinationnode: HNODE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OnlineClusterGroup(hgroup, hdestinationnode).toUInt()

public actual fun OnlineClusterGroupEx(hgroup: HGROUP, hdestinationnode: HNODE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx(hgroup, hdestinationnode, dwonlineflags.toInt(), lpinbuffer, cbinbuffersize.toInt()).toUInt()

public actual fun OnlineClusterGroupEx2(hgroup: HGROUP, hdestinationnode: HNODE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OnlineClusterGroupEx2(hgroup, hdestinationnode, dwonlineflags.toInt(), lpinbuffer, cbinbuffersize.toInt(), lpszreason).toUInt()

public actual fun OnlineClusterResource(hresource: HRESOURCE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OnlineClusterResource(hresource).toUInt()

public actual fun OnlineClusterResourceEx(hresource: HRESOURCE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx(hresource, dwonlineflags.toInt(), lpinbuffer, cbinbuffersize.toInt()).toUInt()

public actual fun OnlineClusterResourceEx2(hresource: HRESOURCE, dwonlineflags: UInt, lpinbuffer: Long, cbinbuffersize: UInt, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OnlineClusterResourceEx2(hresource, dwonlineflags.toInt(), lpinbuffer, cbinbuffersize.toInt(), lpszreason).toUInt()

public actual fun OpenCluster(lpszclustername: PCWSTR): HCLUSTER =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenCluster(lpszclustername)

public actual fun OpenClusterCryptProvider(lpszresource: PCWSTR, lpszprovider: Long, dwtype: UInt, dwflags: UInt): HCLUSCRYPTPROVIDER =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenClusterCryptProvider(lpszresource, lpszprovider, dwtype.toInt(), dwflags.toInt())

public actual fun OpenClusterCryptProviderEx(lpszresource: PCWSTR, lpszkeyname: PCWSTR, lpszprovider: Long, dwtype: UInt, dwflags: UInt): HCLUSCRYPTPROVIDER =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenClusterCryptProviderEx(lpszresource, lpszkeyname, lpszprovider, dwtype.toInt(), dwflags.toInt())

public actual fun OpenClusterEx(lpszclustername: PCWSTR, desiredaccess: UInt, grantedaccess: Long): HCLUSTER =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenClusterEx(lpszclustername, desiredaccess.toInt(), grantedaccess)

public actual fun OpenClusterGroup(hcluster: HCLUSTER, lpszgroupname: PCWSTR): HGROUP =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenClusterGroup(hcluster, lpszgroupname)

public actual fun OpenClusterGroupEx(hcluster: HCLUSTER, lpszgroupname: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HGROUP =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenClusterGroupEx(hcluster, lpszgroupname, dwdesiredaccess.toInt(), lpdwgrantedaccess)

public actual fun OpenClusterGroupSet(hcluster: HCLUSTER, lpszgroupsetname: PCWSTR): HGROUPSET =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenClusterGroupSet(hcluster, lpszgroupsetname)

public actual fun OpenClusterNetInterface(hcluster: HCLUSTER, lpszinterfacename: PCWSTR): HNETINTERFACE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenClusterNetInterface(hcluster, lpszinterfacename)

public actual fun OpenClusterNetInterfaceEx(hcluster: HCLUSTER, lpszinterfacename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNETINTERFACE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenClusterNetInterfaceEx(hcluster, lpszinterfacename, dwdesiredaccess.toInt(), lpdwgrantedaccess)

public actual fun OpenClusterNetwork(hcluster: HCLUSTER, lpsznetworkname: PCWSTR): HNETWORK =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenClusterNetwork(hcluster, lpsznetworkname)

public actual fun OpenClusterNetworkEx(hcluster: HCLUSTER, lpsznetworkname: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNETWORK =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenClusterNetworkEx(hcluster, lpsznetworkname, dwdesiredaccess.toInt(), lpdwgrantedaccess)

public actual fun OpenClusterNode(hcluster: HCLUSTER, lpsznodename: PCWSTR): HNODE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenClusterNode(hcluster, lpsznodename)

public actual fun OpenClusterNodeById(hcluster: HCLUSTER, nodeid: UInt): HNODE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenClusterNodeById(hcluster, nodeid.toInt())

public actual fun OpenClusterNodeEx(hcluster: HCLUSTER, lpsznodename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HNODE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenClusterNodeEx(hcluster, lpsznodename, dwdesiredaccess.toInt(), lpdwgrantedaccess)

public actual fun OpenClusterResource(hcluster: HCLUSTER, lpszresourcename: PCWSTR): HRESOURCE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenClusterResource(hcluster, lpszresourcename)

public actual fun OpenClusterResourceEx(hcluster: HCLUSTER, lpszresourcename: PCWSTR, dwdesiredaccess: UInt, lpdwgrantedaccess: Long): HRESOURCE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_OpenClusterResourceEx(hcluster, lpszresourcename, dwdesiredaccess.toInt(), lpdwgrantedaccess)

public actual fun PauseClusterNode(hnode: HNODE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_PauseClusterNode(hnode).toUInt()

public actual fun PauseClusterNodeEx(hnode: HNODE, bdrainnode: BOOL, dwpauseflags: UInt, hnodedraintarget: HNODE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_PauseClusterNodeEx(hnode, bdrainnode, dwpauseflags.toInt(), hnodedraintarget).toUInt()

public actual fun PauseClusterNodeEx2(hnode: HNODE, bdrainnode: BOOL, dwpauseflags: UInt, hnodedraintarget: HNODE, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_PauseClusterNodeEx2(hnode, bdrainnode, dwpauseflags.toInt(), hnodedraintarget, lpszreason).toUInt()

public actual fun QueryAppInstanceVersion(appinstanceid: Long, instanceversionhigh: Long, instanceversionlow: Long, versionstatus: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_QueryAppInstanceVersion(appinstanceid, instanceversionhigh, instanceversionlow, versionstatus).toUInt()

public actual fun RegisterAppInstance(processhandle: HANDLE, appinstanceid: Long, childreninheritappinstance: BOOL): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RegisterAppInstance(processhandle, appinstanceid, childreninheritappinstance).toUInt()

public actual fun RegisterAppInstanceVersion(appinstanceid: Long, instanceversionhigh: ULong, instanceversionlow: ULong): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RegisterAppInstanceVersion(appinstanceid, instanceversionhigh.toLong(), instanceversionlow.toLong()).toUInt()

public actual fun RegisterClusterNotify(hchange: HCHANGE, dwfiltertype: UInt, hobject: HANDLE, dwnotifykey: ULong): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RegisterClusterNotify(hchange, dwfiltertype.toInt(), hobject, dwnotifykey.toLong()).toUInt()

public actual fun RegisterClusterNotifyV2(hchange: HCHANGE, filter: NOTIFY_FILTER_AND_TYPE, hobject: HANDLE, dwnotifykey: ULong): UInt =
    0u

public actual fun RegisterClusterResourceTypeNotifyV2(hchange: HCHANGE, hcluster: HCLUSTER, flags: Long, restypename: PCWSTR, dwnotifykey: ULong): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RegisterClusterResourceTypeNotifyV2(hchange, hcluster, flags, restypename, dwnotifykey.toLong()).toUInt()

public actual fun RemoveClusterGroupDependency(hgroup: HGROUP, hdependson: HGROUP): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependency(hgroup, hdependson).toUInt()

public actual fun RemoveClusterGroupDependencyEx(hgroup: HGROUP, hdependson: HGROUP, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RemoveClusterGroupDependencyEx(hgroup, hdependson, lpszreason).toUInt()

public actual fun RemoveClusterGroupSetDependency(hgroupset: HGROUPSET, hdependson: HGROUPSET): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependency(hgroupset, hdependson).toUInt()

public actual fun RemoveClusterGroupSetDependencyEx(hgroupset: HGROUPSET, hdependson: HGROUPSET, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RemoveClusterGroupSetDependencyEx(hgroupset, hdependson, lpszreason).toUInt()

public actual fun RemoveClusterGroupToGroupSetDependency(hgroup: HGROUP, hdependson: HGROUPSET): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependency(hgroup, hdependson).toUInt()

public actual fun RemoveClusterGroupToGroupSetDependencyEx(hgroup: HGROUP, hdependson: HGROUPSET, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RemoveClusterGroupToGroupSetDependencyEx(hgroup, hdependson, lpszreason).toUInt()

public actual fun RemoveClusterNameAccount(hcluster: HCLUSTER, bdeletecomputerobjects: BOOL): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RemoveClusterNameAccount(hcluster, bdeletecomputerobjects).toUInt()

public actual fun RemoveClusterResourceDependency(hresource: HRESOURCE, hdependson: HRESOURCE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependency(hresource, hdependson).toUInt()

public actual fun RemoveClusterResourceDependencyEx(hresource: HRESOURCE, hdependson: HRESOURCE, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RemoveClusterResourceDependencyEx(hresource, hdependson, lpszreason).toUInt()

public actual fun RemoveClusterResourceNode(hresource: HRESOURCE, hnode: HNODE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RemoveClusterResourceNode(hresource, hnode).toUInt()

public actual fun RemoveClusterResourceNodeEx(hresource: HRESOURCE, hnode: HNODE, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RemoveClusterResourceNodeEx(hresource, hnode, lpszreason).toUInt()

public actual fun RemoveClusterStorageNode(hcluster: HCLUSTER, lpszclusterstorageenclosurename: PCWSTR, dwtimeout: UInt, dwflags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RemoveClusterStorageNode(hcluster, lpszclusterstorageenclosurename, dwtimeout.toInt(), dwflags.toInt()).toUInt()

public actual fun RemoveCrossClusterGroupSetDependency(hdependentgroupset: HGROUPSET, lpremoteclustername: PCWSTR, lpremotegroupsetname: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RemoveCrossClusterGroupSetDependency(hdependentgroupset, lpremoteclustername, lpremotegroupsetname).toUInt()

public actual fun RemoveResourceFromClusterSharedVolumes(hresource: HRESOURCE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RemoveResourceFromClusterSharedVolumes(hresource).toUInt()

public actual fun ResUtilAddUnknownProperties(hkeyclusterkey: HKEY, ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilAddUnknownProperties(hkeyclusterkey, ppropertytable, poutpropertylist, pcboutpropertylistsize.toInt(), pcbbytesreturned, pcbrequired).toUInt()

public actual fun ResUtilCreateDirectoryTree(pszpath: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilCreateDirectoryTree(pszpath).toUInt()

public actual fun ResUtilDupGroup(group: HGROUP, copy: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilDupGroup(group, copy).toUInt()

public actual fun ResUtilDupParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilDupParameterBlock(poutparams, pinparams, ppropertytable).toUInt()

public actual fun ResUtilDupResource(group: HRESOURCE, copy: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilDupResource(group, copy).toUInt()

public actual fun ResUtilDupString(pszinstring: PCWSTR): PWSTR =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilDupString(pszinstring)

public actual fun ResUtilEnumGroups(hcluster: HCLUSTER, hself: HGROUP, prescallback: LPGROUP_CALLBACK_EX, pparameter: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilEnumGroups(hcluster, hself, prescallback.toLong(), pparameter).toUInt()

public actual fun ResUtilEnumGroupsEx(hcluster: HCLUSTER, hself: HGROUP, grouptype: CLUSGROUP_TYPE, prescallback: LPGROUP_CALLBACK_EX, pparameter: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilEnumGroupsEx(hcluster, hself, grouptype, prescallback.toLong(), pparameter).toUInt()

public actual fun ResUtilEnumPrivateProperties(hkeyclusterkey: HKEY, pszoutproperties: PWSTR, cboutpropertiessize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilEnumPrivateProperties(hkeyclusterkey, pszoutproperties, cboutpropertiessize.toInt(), pcbbytesreturned, pcbrequired).toUInt()

public actual fun ResUtilEnumProperties(ppropertytable: Long, pszoutproperties: PWSTR, cboutpropertiessize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilEnumProperties(ppropertytable, pszoutproperties, cboutpropertiessize.toInt(), pcbbytesreturned, pcbrequired).toUInt()

public actual fun ResUtilEnumResources(hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK, pparameter: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilEnumResources(hself, lpszrestypename, prescallback.toLong(), pparameter).toUInt()

public actual fun ResUtilEnumResourcesEx(hcluster: HCLUSTER, hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx(hcluster, hself, lpszrestypename, prescallback.toLong(), pparameter).toUInt()

public actual fun ResUtilEnumResourcesEx2(hcluster: HCLUSTER, hself: HRESOURCE, lpszrestypename: PCWSTR, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long, dwdesiredaccess: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilEnumResourcesEx2(hcluster, hself, lpszrestypename, prescallback.toLong(), pparameter, dwdesiredaccess.toInt()).toUInt()

public actual fun ResUtilExpandEnvironmentStrings(pszsrc: PCWSTR): PWSTR =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilExpandEnvironmentStrings(pszsrc)

public actual fun ResUtilFindBinaryProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pbpropertyvalue: Long, pcbpropertyvaluesize: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilFindBinaryProperty(ppropertylist, cbpropertylistsize.toInt(), pszpropertyname, pbpropertyvalue, pcbpropertyvaluesize).toUInt()

public actual fun ResUtilFindDependentDiskResourceDriveLetter(hcluster: HCLUSTER, hresource: HRESOURCE, pszdriveletter: PWSTR, pcchdriveletter: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilFindDependentDiskResourceDriveLetter(hcluster, hresource, pszdriveletter, pcchdriveletter).toUInt()

public actual fun ResUtilFindDwordProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pdwpropertyvalue: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilFindDwordProperty(ppropertylist, cbpropertylistsize.toInt(), pszpropertyname, pdwpropertyvalue).toUInt()

public actual fun ResUtilFindExpandSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilFindExpandSzProperty(ppropertylist, cbpropertylistsize.toInt(), pszpropertyname, pszpropertyvalue).toUInt()

public actual fun ResUtilFindExpandedSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilFindExpandedSzProperty(ppropertylist, cbpropertylistsize.toInt(), pszpropertyname, pszpropertyvalue).toUInt()

public actual fun ResUtilFindFileTimeProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pftpropertyvalue: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilFindFileTimeProperty(ppropertylist, cbpropertylistsize.toInt(), pszpropertyname, pftpropertyvalue).toUInt()

public actual fun ResUtilFindLongProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, plpropertyvalue: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilFindLongProperty(ppropertylist, cbpropertylistsize.toInt(), pszpropertyname, plpropertyvalue).toUInt()

public actual fun ResUtilFindMultiSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long, pcbpropertyvaluesize: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilFindMultiSzProperty(ppropertylist, cbpropertylistsize.toInt(), pszpropertyname, pszpropertyvalue, pcbpropertyvaluesize).toUInt()

public actual fun ResUtilFindSzProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, pszpropertyvalue: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilFindSzProperty(ppropertylist, cbpropertylistsize.toInt(), pszpropertyname, pszpropertyvalue).toUInt()

public actual fun ResUtilFindULargeIntegerProperty(ppropertylist: Long, cbpropertylistsize: UInt, pszpropertyname: PCWSTR, plpropertyvalue: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilFindULargeIntegerProperty(ppropertylist, cbpropertylistsize.toInt(), pszpropertyname, plpropertyvalue).toUInt()

public actual fun ResUtilFreeEnvironment(lpenvironment: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilFreeEnvironment(lpenvironment).toUInt()

public actual fun ResUtilFreeParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long) {
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilFreeParameterBlock(poutparams, pinparams, ppropertytable)
}

public actual fun ResUtilGetAllProperties(hkeyclusterkey: HKEY, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetAllProperties(hkeyclusterkey, ppropertytable, poutpropertylist, cboutpropertylistsize.toInt(), pcbbytesreturned, pcbrequired).toUInt()

public actual fun ResUtilGetBinaryProperty(ppboutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pboldvalue: Long, cboldvaluesize: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetBinaryProperty(ppboutvalue, pcboutvaluesize, pvaluestruct, pboldvalue, cboldvaluesize.toInt(), pppropertylist, pcbpropertylistsize).toUInt()

public actual fun ResUtilGetBinaryValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, ppboutvalue: Long, pcboutvaluesize: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetBinaryValue(hkeyclusterkey, pszvaluename, ppboutvalue, pcboutvaluesize).toUInt()

public actual fun ResUtilGetClusterGroupType(hgroup: HGROUP, grouptype: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetClusterGroupType(hgroup, grouptype).toUInt()

public actual fun ResUtilGetClusterId(hcluster: HCLUSTER, guid: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetClusterId(hcluster, guid).toUInt()

public actual fun ResUtilGetClusterRoleState(hcluster: HCLUSTER, eclusterrole: CLUSTER_ROLE): CLUSTER_ROLE_STATE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetClusterRoleState(hcluster, eclusterrole)

public actual fun ResUtilGetCoreClusterResources(hcluster: HCLUSTER, phclusternameresource: Long, phclusteripaddressresource: Long, phclusterquorumresource: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResources(hcluster, phclusternameresource, phclusteripaddressresource, phclusterquorumresource).toUInt()

public actual fun ResUtilGetCoreClusterResourcesEx(hclusterin: HCLUSTER, phclusternameresourceout: Long, phclusterquorumresourceout: Long, dwdesiredaccess: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetCoreClusterResourcesEx(hclusterin, phclusternameresourceout, phclusterquorumresourceout, dwdesiredaccess.toInt()).toUInt()

public actual fun ResUtilGetCoreGroup(hcluster: HCLUSTER): HGROUP =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetCoreGroup(hcluster)

public actual fun ResUtilGetDwordProperty(pdwoutvalue: Long, pvaluestruct: Long, dwoldvalue: UInt, dwminimum: UInt, dwmaximum: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetDwordProperty(pdwoutvalue, pvaluestruct, dwoldvalue.toInt(), dwminimum.toInt(), dwmaximum.toInt(), pppropertylist, pcbpropertylistsize).toUInt()

public actual fun ResUtilGetDwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, pdwoutvalue: Long, dwdefaultvalue: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetDwordValue(hkeyclusterkey, pszvaluename, pdwoutvalue, dwdefaultvalue.toInt()).toUInt()

public actual fun ResUtilGetEnvironmentWithNetName(hresource: HRESOURCE): Long =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetEnvironmentWithNetName(hresource)

public actual fun ResUtilGetFileTimeProperty(pftoutvalue: Long, pvaluestruct: Long, ftoldvalue: FILETIME, ftminimum: FILETIME, ftmaximum: FILETIME, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    0u

public actual fun ResUtilGetLongProperty(ploutvalue: Long, pvaluestruct: Long, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetLongProperty(ploutvalue, pvaluestruct, loldvalue, lminimum, lmaximum, pppropertylist, pcbpropertylistsize).toUInt()

public actual fun ResUtilGetMultiSzProperty(ppszoutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pszoldvalue: PCWSTR, cboldvaluesize: UInt, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetMultiSzProperty(ppszoutvalue, pcboutvaluesize, pvaluestruct, pszoldvalue, cboldvaluesize.toInt(), pppropertylist, pcbpropertylistsize).toUInt()

public actual fun ResUtilGetPrivateProperties(hkeyclusterkey: HKEY, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetPrivateProperties(hkeyclusterkey, poutpropertylist, cboutpropertylistsize.toInt(), pcbbytesreturned, pcbrequired).toUInt()

public actual fun ResUtilGetProperties(hkeyclusterkey: HKEY, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetProperties(hkeyclusterkey, ppropertytable, poutpropertylist, cboutpropertylistsize.toInt(), pcbbytesreturned, pcbrequired).toUInt()

public actual fun ResUtilGetPropertiesToParameterBlock(hkeyclusterkey: HKEY, ppropertytable: Long, poutparams: Long, bcheckforrequiredproperties: BOOL, psznameofpropinerror: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetPropertiesToParameterBlock(hkeyclusterkey, ppropertytable, poutparams, bcheckforrequiredproperties, psznameofpropinerror).toUInt()

public actual fun ResUtilGetProperty(hkeyclusterkey: HKEY, ppropertytableitem: Long, poutpropertyitem: Long, pcboutpropertyitemsize: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetProperty(hkeyclusterkey, ppropertytableitem, poutpropertyitem, pcboutpropertyitemsize).toUInt()

public actual fun ResUtilGetPropertyFormats(ppropertytable: Long, poutpropertyformatlist: Long, cbpropertyformatlistsize: UInt, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetPropertyFormats(ppropertytable, poutpropertyformatlist, cbpropertyformatlistsize.toInt(), pcbbytesreturned, pcbrequired).toUInt()

public actual fun ResUtilGetPropertySize(hkeyclusterkey: HKEY, ppropertytableitem: Long, pcboutpropertylistsize: Long, pnpropertycount: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetPropertySize(hkeyclusterkey, ppropertytableitem, pcboutpropertylistsize, pnpropertycount).toUInt()

public actual fun ResUtilGetQwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, pqwoutvalue: Long, qwdefaultvalue: ULong): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetQwordValue(hkeyclusterkey, pszvaluename, pqwoutvalue, qwdefaultvalue.toLong()).toUInt()

public actual fun ResUtilGetResourceDependency(hself: HANDLE, lpszresourcetype: PCWSTR): HRESOURCE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependency(hself, lpszresourcetype)

public actual fun ResUtilGetResourceDependencyByClass(hcluster: HCLUSTER, hself: HANDLE, prci: Long, brecurse: BOOL): HRESOURCE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClass(hcluster, hself, prci, brecurse)

public actual fun ResUtilGetResourceDependencyByClassEx(hcluster: HCLUSTER, hself: HANDLE, prci: Long, brecurse: BOOL, dwdesiredaccess: UInt): HRESOURCE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByClassEx(hcluster, hself, prci, brecurse, dwdesiredaccess.toInt())

public actual fun ResUtilGetResourceDependencyByName(hcluster: HCLUSTER, hself: HANDLE, lpszresourcetype: PCWSTR, brecurse: BOOL): HRESOURCE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByName(hcluster, hself, lpszresourcetype, brecurse)

public actual fun ResUtilGetResourceDependencyByNameEx(hcluster: HCLUSTER, hself: HANDLE, lpszresourcetype: PCWSTR, brecurse: BOOL, dwdesiredaccess: UInt): HRESOURCE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyByNameEx(hcluster, hself, lpszresourcetype, brecurse, dwdesiredaccess.toInt())

public actual fun ResUtilGetResourceDependencyEx(hself: HANDLE, lpszresourcetype: PCWSTR, dwdesiredaccess: UInt): HRESOURCE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependencyEx(hself, lpszresourcetype, dwdesiredaccess.toInt())

public actual fun ResUtilGetResourceDependentIPAddressProps(hresource: HRESOURCE, pszaddress: PWSTR, pcchaddress: Long, pszsubnetmask: PWSTR, pcchsubnetmask: Long, psznetwork: PWSTR, pcchnetwork: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetResourceDependentIPAddressProps(hresource, pszaddress, pcchaddress, pszsubnetmask, pcchsubnetmask, psznetwork, pcchnetwork).toUInt()

public actual fun ResUtilGetResourceName(hresource: HRESOURCE, pszresourcename: PWSTR, pcchresourcenameinout: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetResourceName(hresource, pszresourcename, pcchresourcenameinout).toUInt()

public actual fun ResUtilGetResourceNameDependency(lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR): HRESOURCE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependency(lpszresourcename, lpszresourcetype)

public actual fun ResUtilGetResourceNameDependencyEx(lpszresourcename: PCWSTR, lpszresourcetype: PCWSTR, dwdesiredaccess: UInt): HRESOURCE =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetResourceNameDependencyEx(lpszresourcename, lpszresourcetype, dwdesiredaccess.toInt())

public actual fun ResUtilGetSzProperty(ppszoutvalue: Long, pvaluestruct: Long, pszoldvalue: PCWSTR, pppropertylist: Long, pcbpropertylistsize: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetSzProperty(ppszoutvalue, pvaluestruct, pszoldvalue, pppropertylist, pcbpropertylistsize).toUInt()

public actual fun ResUtilGetSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR): PWSTR =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGetSzValue(hkeyclusterkey, pszvaluename)

public actual fun ResUtilGroupsEqual(hself: HGROUP, hgroup: HGROUP, pequal: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilGroupsEqual(hself, hgroup, pequal).toUInt()

public actual fun ResUtilIsPathValid(pszpath: PCWSTR): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilIsPathValid(pszpath)

public actual fun ResUtilIsResourceClassEqual(prci: Long, hresource: HRESOURCE): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilIsResourceClassEqual(prci, hresource)

public actual fun ResUtilLeftPaxosIsLessThanRight(left: Long, right: Long): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilLeftPaxosIsLessThanRight(left, right)

public actual fun ResUtilNodeEnum(hcluster: HCLUSTER, pnodecallback: LPNODE_CALLBACK, pparameter: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilNodeEnum(hcluster, pnodecallback.toLong(), pparameter).toUInt()

public actual fun ResUtilPaxosComparer(left: Long, right: Long): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilPaxosComparer(left, right)

public actual fun ResUtilPropertyListFromParameterBlock(ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: Long, pinparams: Long, pcbbytesreturned: Long, pcbrequired: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilPropertyListFromParameterBlock(ppropertytable, poutpropertylist, pcboutpropertylistsize, pinparams, pcbbytesreturned, pcbrequired).toUInt()

public actual fun ResUtilRemoveResourceServiceEnvironment(pszservicename: PCWSTR, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilRemoveResourceServiceEnvironment(pszservicename, pfnlogevent.toLong(), hresourcehandle).toUInt()

public actual fun ResUtilResourceDepEnum(hself: HRESOURCE, enumtype: UInt, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilResourceDepEnum(hself, enumtype.toInt(), prescallback.toLong(), pparameter).toUInt()

public actual fun ResUtilResourceTypesEqual(lpszresourcetypename: PCWSTR, hresource: HRESOURCE): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilResourceTypesEqual(lpszresourcetypename, hresource)

public actual fun ResUtilResourcesEqual(hself: HRESOURCE, hresource: HRESOURCE): BOOL =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilResourcesEqual(hself, hresource)

public actual fun ResUtilSetBinaryValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, pbnewvalue: Long, cbnewvaluesize: UInt, ppboutvalue: Long, pcboutvaluesize: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetBinaryValue(hkeyclusterkey, pszvaluename, pbnewvalue, cbnewvaluesize.toInt(), ppboutvalue, pcboutvaluesize).toUInt()

public actual fun ResUtilSetDwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, dwnewvalue: UInt, pdwoutvalue: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetDwordValue(hkeyclusterkey, pszvaluename, dwnewvalue.toInt(), pdwoutvalue).toUInt()

public actual fun ResUtilSetExpandSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, ppszoutstring: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetExpandSzValue(hkeyclusterkey, pszvaluename, psznewvalue, ppszoutstring).toUInt()

public actual fun ResUtilSetMultiSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, cbnewvaluesize: UInt, ppszoutvalue: Long, pcboutvaluesize: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetMultiSzValue(hkeyclusterkey, pszvaluename, psznewvalue, cbnewvaluesize.toInt(), ppszoutvalue, pcboutvaluesize).toUInt()

public actual fun ResUtilSetPrivatePropertyList(hkeyclusterkey: HKEY, pinpropertylist: Long, cbinpropertylistsize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetPrivatePropertyList(hkeyclusterkey, pinpropertylist, cbinpropertylistsize.toInt()).toUInt()

public actual fun ResUtilSetPropertyParameterBlock(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlock(hkeyclusterkey, ppropertytable, reserved, pinparams, pinpropertylist, cbinpropertylistsize.toInt(), poutparams).toUInt()

public actual fun ResUtilSetPropertyParameterBlockEx(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: UInt, bforcewrite: BOOL, poutparams: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetPropertyParameterBlockEx(hkeyclusterkey, ppropertytable, reserved, pinparams, pinpropertylist, cbinpropertylistsize.toInt(), bforcewrite, poutparams).toUInt()

public actual fun ResUtilSetPropertyTable(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTable(hkeyclusterkey, ppropertytable, reserved, ballowunknownproperties, pinpropertylist, cbinpropertylistsize.toInt(), poutparams).toUInt()

public actual fun ResUtilSetPropertyTableEx(hkeyclusterkey: HKEY, ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, bforcewrite: BOOL, poutparams: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetPropertyTableEx(hkeyclusterkey, ppropertytable, reserved, ballowunknownproperties, pinpropertylist, cbinpropertylistsize.toInt(), bforcewrite, poutparams).toUInt()

public actual fun ResUtilSetQwordValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, qwnewvalue: ULong, pqwoutvalue: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetQwordValue(hkeyclusterkey, pszvaluename, qwnewvalue.toLong(), pqwoutvalue).toUInt()

public actual fun ResUtilSetResourceServiceEnvironment(pszservicename: PCWSTR, hresource: HRESOURCE, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceEnvironment(pszservicename, hresource, pfnlogevent.toLong(), hresourcehandle).toUInt()

public actual fun ResUtilSetResourceServiceStartParameters(pszservicename: PCWSTR, schscmhandle: SC_HANDLE, phservice: Long, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParameters(pszservicename, schscmhandle, phservice, pfnlogevent.toLong(), hresourcehandle).toUInt()

public actual fun ResUtilSetResourceServiceStartParametersEx(pszservicename: PCWSTR, schscmhandle: SC_HANDLE, phservice: Long, dwdesiredaccess: UInt, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetResourceServiceStartParametersEx(pszservicename, schscmhandle, phservice, dwdesiredaccess.toInt(), pfnlogevent.toLong(), hresourcehandle).toUInt()

public actual fun ResUtilSetSzValue(hkeyclusterkey: HKEY, pszvaluename: PCWSTR, psznewvalue: PCWSTR, ppszoutstring: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetSzValue(hkeyclusterkey, pszvaluename, psznewvalue, ppszoutstring).toUInt()

public actual fun ResUtilSetUnknownProperties(hkeyclusterkey: HKEY, ppropertytable: Long, pinpropertylist: Long, cbinpropertylistsize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetUnknownProperties(hkeyclusterkey, ppropertytable, pinpropertylist, cbinpropertylistsize.toInt()).toUInt()

public actual fun ResUtilSetValueEx(hkeyclusterkey: HKEY, valuename: PCWSTR, valuetype: UInt, valuedata: Long, valuesize: UInt, flags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilSetValueEx(hkeyclusterkey, valuename, valuetype.toInt(), valuedata, valuesize.toInt(), flags.toInt()).toUInt()

public actual fun ResUtilStartResourceService(pszservicename: PCWSTR, phservicehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilStartResourceService(pszservicename, phservicehandle).toUInt()

public actual fun ResUtilStopResourceService(pszservicename: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilStopResourceService(pszservicename).toUInt()

public actual fun ResUtilStopService(hservicehandle: SC_HANDLE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilStopService(hservicehandle).toUInt()

public actual fun ResUtilTerminateServiceProcessFromResDll(dwservicepid: UInt, boffline: BOOL, pdwresourcestate: Long, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilTerminateServiceProcessFromResDll(dwservicepid.toInt(), boffline, pdwresourcestate, pfnlogevent.toLong(), hresourcehandle).toUInt()

public actual fun ResUtilVerifyPrivatePropertyList(pinpropertylist: Long, cbinpropertylistsize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilVerifyPrivatePropertyList(pinpropertylist, cbinpropertylistsize.toInt()).toUInt()

public actual fun ResUtilVerifyPropertyTable(ppropertytable: Long, reserved: Long, ballowunknownproperties: BOOL, pinpropertylist: Long, cbinpropertylistsize: UInt, poutparams: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilVerifyPropertyTable(ppropertytable, reserved, ballowunknownproperties, pinpropertylist, cbinpropertylistsize.toInt(), poutparams).toUInt()

public actual fun ResUtilVerifyResourceService(pszservicename: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilVerifyResourceService(pszservicename).toUInt()

public actual fun ResUtilVerifyService(hservicehandle: SC_HANDLE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilVerifyService(hservicehandle).toUInt()

public actual fun ResUtilVerifyShutdownSafe(flags: UInt, reason: UInt, presult: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilVerifyShutdownSafe(flags.toInt(), reason.toInt(), presult).toUInt()

public actual fun ResUtilsDeleteKeyTree(key: HKEY, keyname: PCWSTR, treatnokeyaserror: BOOL): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResUtilsDeleteKeyTree(key, keyname, treatnokeyaserror).toUInt()

public actual fun ResetAllAppInstanceVersions(): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResetAllAppInstanceVersions().toUInt()

public actual fun RestartClusterResource(hresource: HRESOURCE, dwflags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RestartClusterResource(hresource, dwflags.toInt()).toUInt()

public actual fun RestartClusterResourceEx(hresource: HRESOURCE, dwflags: UInt, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RestartClusterResourceEx(hresource, dwflags.toInt(), lpszreason).toUInt()

public actual fun RestoreClusterDatabase(lpszpathname: PCWSTR, bforce: BOOL, lpszquorumdriveletter: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_RestoreClusterDatabase(lpszpathname, bforce, lpszquorumdriveletter).toUInt()

public actual fun ResumeClusterNode(hnode: HNODE): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResumeClusterNode(hnode).toUInt()

public actual fun ResumeClusterNodeEx(hnode: HNODE, eresumefailbacktype: CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx(hnode, eresumefailbacktype, dwresumeflagsreserved.toInt()).toUInt()

public actual fun ResumeClusterNodeEx2(hnode: HNODE, eresumefailbacktype: CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved: UInt, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_ResumeClusterNodeEx2(hnode, eresumefailbacktype, dwresumeflagsreserved.toInt(), lpszreason).toUInt()

public actual fun SetAppInstanceCsvFlags(processhandle: HANDLE, mask: UInt, flags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetAppInstanceCsvFlags(processhandle, mask.toInt(), flags.toInt()).toUInt()

public actual fun SetClusterGroupName(hgroup: HGROUP, lpszgroupname: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterGroupName(hgroup, lpszgroupname).toUInt()

public actual fun SetClusterGroupNameEx(hgroup: HGROUP, lpszgroupname: PCWSTR, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterGroupNameEx(hgroup, lpszgroupname, lpszreason).toUInt()

public actual fun SetClusterGroupNodeList(hgroup: HGROUP, nodecount: UInt, nodelist: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterGroupNodeList(hgroup, nodecount.toInt(), nodelist).toUInt()

public actual fun SetClusterGroupNodeListEx(hgroup: HGROUP, nodecount: UInt, nodelist: Long, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterGroupNodeListEx(hgroup, nodecount.toInt(), nodelist, lpszreason).toUInt()

public actual fun SetClusterGroupSetDependencyExpression(hgroupset: HGROUPSET, lpszdependencyexprssion: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpression(hgroupset, lpszdependencyexprssion).toUInt()

public actual fun SetClusterGroupSetDependencyExpressionEx(hgroupset: HGROUPSET, lpszdependencyexpression: PCWSTR, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterGroupSetDependencyExpressionEx(hgroupset, lpszdependencyexpression, lpszreason).toUInt()

public actual fun SetClusterName(hcluster: HCLUSTER, lpsznewclustername: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterName(hcluster, lpsznewclustername).toUInt()

public actual fun SetClusterNameEx(hcluster: HCLUSTER, lpsznewclustername: PCWSTR, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterNameEx(hcluster, lpsznewclustername, lpszreason).toUInt()

public actual fun SetClusterNetworkName(hnetwork: HNETWORK, lpszname: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterNetworkName(hnetwork, lpszname).toUInt()

public actual fun SetClusterNetworkNameEx(hnetwork: HNETWORK, lpszname: PCWSTR, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterNetworkNameEx(hnetwork, lpszname, lpszreason).toUInt()

public actual fun SetClusterNetworkPriorityOrder(hcluster: HCLUSTER, networkcount: UInt, networklist: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterNetworkPriorityOrder(hcluster, networkcount.toInt(), networklist).toUInt()

public actual fun SetClusterQuorumResource(hresource: HRESOURCE, lpszdevicename: PCWSTR, dwmaxquologsize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterQuorumResource(hresource, lpszdevicename, dwmaxquologsize.toInt()).toUInt()

public actual fun SetClusterQuorumResourceEx(hresource: HRESOURCE, lpszdevicename: PCWSTR, dwmaxquorumlogsize: UInt, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterQuorumResourceEx(hresource, lpszdevicename, dwmaxquorumlogsize.toInt(), lpszreason).toUInt()

public actual fun SetClusterResourceDependencyExpression(hresource: HRESOURCE, lpszdependencyexpression: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterResourceDependencyExpression(hresource, lpszdependencyexpression).toUInt()

public actual fun SetClusterResourceName(hresource: HRESOURCE, lpszresourcename: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterResourceName(hresource, lpszresourcename).toUInt()

public actual fun SetClusterResourceNameEx(hresource: HRESOURCE, lpszresourcename: PCWSTR, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterResourceNameEx(hresource, lpszresourcename, lpszreason).toUInt()

public actual fun SetClusterServiceAccountPassword(lpszclustername: PCWSTR, lpsznewpassword: PCWSTR, dwflags: UInt, lpreturnstatusbuffer: Long, lpcbreturnstatusbuffersize: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetClusterServiceAccountPassword(lpszclustername, lpsznewpassword, dwflags.toInt(), lpreturnstatusbuffer, lpcbreturnstatusbuffersize).toUInt()

public actual fun SetGroupDependencyExpression(hgroup: HGROUP, lpszdependencyexpression: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetGroupDependencyExpression(hgroup, lpszdependencyexpression).toUInt()

public actual fun SetGroupDependencyExpressionEx(hgroup: HGROUP, lpszdependencyexpression: PCWSTR, lpszreason: PCWSTR): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_SetGroupDependencyExpressionEx(hgroup, lpszdependencyexpression, lpszreason).toUInt()
