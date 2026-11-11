@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.clustering

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.system.services.ScHandle

private object WindowsWin32NetworkingClusteringJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_addClusterGroupDependency(hdependentgroup: Long, hprovidergroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_addClusterGroupDependencyEx(hdependentgroup: Long, hprovidergroup: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_addClusterGroupSetDependency(hdependentgroupset: Long, hprovidergroupset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_addClusterGroupSetDependencyEx(hdependentgroupset: Long, hprovidergroupset: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependency(hdependentgroup: Long, hprovidergroupset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependencyEx(hdependentgroup: Long, hprovidergroupset: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_addClusterNode(hcluster: Long, lpsznodename: Long, pfnprogresscallback: Long, pvcallbackarg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_addClusterNodeEx(hcluster: Long, lpsznodename: Long, dwflags: Int, pfnprogresscallback: Long, pvcallbackarg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_addClusterResourceDependency(hresource: Long, hdependson: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_addClusterResourceDependencyEx(hresource: Long, hdependson: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_addClusterResourceNode(hresource: Long, hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_addClusterResourceNodeEx(hresource: Long, hnode: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_addClusterStorageNode(hcluster: Long, lpsznodename: Long, pfnprogresscallback: Long, pvcallbackarg: Long, lpszclusterstoragenodedescription: Long, lpszclusterstoragenodelocation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_addCrossClusterGroupSetDependency(hdependentgroupset: Long, lpremoteclustername: Long, lpremotegroupsetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_addResourceToClusterSharedVolumes(hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_backupClusterDatabase(hcluster: Long, lpszpathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_canResourceBeDependent(hresource: Long, hresourcedependent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_cancelClusterGroupOperation(hgroup: Long, dwcancelflagsReserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_changeClusterResourceGroup(hresource: Long, hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx(hresource: Long, hgroup: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx2(hresource: Long, hgroup: Long, flags: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_closeCluster(hcluster: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_closeClusterCryptProvider(hcluscryptprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_closeClusterGroup(hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_closeClusterGroupSet(hgroupset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_closeClusterNetInterface(hnetinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_closeClusterNetwork(hnetwork: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_closeClusterNode(hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_closeClusterNotifyPort(hchange: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_closeClusterResource(hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusAddClusterHealthFault(hcluster: Long, failure: Long, param2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusGetClusterHealthFaults(hcluster: Long, objects: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusRemoveClusterHealthFault(hcluster: Long, id: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusWorkerCheckTerminate(lpworker: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusWorkerCreate(lpworker: Long, lpstartaddress: Long, lpparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusWorkerTerminate(lpworker: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusWorkerTerminateEx(clusworker: Long, timeoutinmilliseconds: Int, waitonly: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusWorkersTerminate(clusworkers: Long, clusworkerscount: Long, timeoutinmilliseconds: Int, waitonly: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusapiSetReasonHandler(lphandler: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterAddGroupToAffinityRule(hcluster: Long, rulename: Long, hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSet(hgroupset: Long, hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomains(hgroupset: Long, hgroup: Long, faultdomain: Int, updatedomain: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomainsEx(hgroupset: Long, hgroup: Long, faultdomain: Int, updatedomain: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterAffinityRuleControl(hcluster: Long, affinityrulename: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterClearBackupStateForSharedVolume(lpszvolumepathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterCloseEnum(henum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterCloseEnumEx(hclusterenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterControl(hcluster: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterControlEx(hcluster: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterCreateAffinityRule(hcluster: Long, rulename: Long, ruletype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterDecrypt(hcluscryptprovider: Long, pcryptinput: Long, cbcryptinput: Int, ppcryptoutput: Long, pcbcryptoutput: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterEncrypt(hcluscryptprovider: Long, pdata: Long, cbdata: Int, ppdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterEnum(henum: Long, dwindex: Int, lpdwtype: Long, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterEnumEx(hclusterenum: Long, dwindex: Int, pitem: Long, cbitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGetEnumCount(henum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGetEnumCountEx(hclusterenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: Long, lpszvolumename: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGetVolumePathName(lpszfilename: Long, lpszvolumepathname: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupCloseEnum(hgroupenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupCloseEnumEx(hgroupenumex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupControl(hgroup: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupControlEx(hgroup: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupEnum(hgroupenum: Long, dwindex: Int, lpdwtype: Long, lpszresourcename: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupEnumEx(hgroupenumex: Long, dwindex: Int, pitem: Long, cbitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCount(hgroupenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCountEx(hgroupenumex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupOpenEnum(hgroup: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupOpenEnumEx(hcluster: Long, lpszproperties: Long, cbproperties: Int, lpszroproperties: Long, cbroproperties: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupSetCloseEnum(hgroupsetenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupSetControl(hgroupset: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupSetControlEx(hgroupset: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupSetEnum(hgroupsetenum: Long, dwindex: Int, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupSetGetEnumCount(hgroupsetenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterGroupSetOpenEnum(hcluster: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterIsPathOnSharedVolume(lpszpathname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNetInterfaceCloseEnum(hnetinterfaceenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNetInterfaceControl(hnetinterface: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNetInterfaceControlEx(hnetinterface: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNetInterfaceEnum(hnetinterfaceenum: Long, dwindex: Int, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNetInterfaceOpenEnum(hcluster: Long, lpsznodename: Long, lpsznetworkname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNetworkCloseEnum(hnetworkenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNetworkControl(hnetwork: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNetworkControlEx(hnetwork: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNetworkEnum(hnetworkenum: Long, dwindex: Int, lpdwtype: Long, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNetworkGetEnumCount(hnetworkenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNetworkOpenEnum(hnetwork: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNodeCloseEnum(hnodeenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNodeCloseEnumEx(hnodeenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNodeControl(hnode: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNodeControlEx(hnode: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNodeEnum(hnodeenum: Long, dwindex: Int, lpdwtype: Long, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNodeEnumEx(hnodeenum: Long, dwindex: Int, pitem: Long, cbitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCount(hnodeenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCountEx(hnodeenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNodeOpenEnum(hnode: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNodeOpenEnumEx(hnode: Long, dwtype: Int, poptions: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterNodeReplacement(hcluster: Long, lpsznodenamecurrent: Long, lpsznodenamenew: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterOpenEnum(hcluster: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterOpenEnumEx(hcluster: Long, dwtype: Int, poptions: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterPrepareSharedVolumeForBackup(lpszfilename: Long, lpszvolumepathname: Long, lpcchvolumepathname: Long, lpszvolumename: Long, lpcchvolumename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegBatchAddCommand(hregbatch: Long, dwcommand: Int, wzname: Long, dwoptions: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegBatchCloseNotification(hbatchnotification: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegBatchReadCommand(hbatchnotification: Long, pbatchcommand: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegCloseBatch(hregbatch: Long, bcommit: Int, failedcommandnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegCloseBatchEx(hregbatch: Long, flags: Int, failedcommandnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegCloseBatchNotifyPort(hbatchnotifyport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegCloseKey(hkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatch(hregreadbatch: Long, phregreadbatchreply: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchEx(hregreadbatch: Long, flags: Int, phregreadbatchreply: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchReply(hregreadbatchreply: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegCreateBatch(hkey: Long, phregbatch: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegCreateBatchNotifyPort(hkey: Long, phbatchnotifyport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegCreateKey(hkey: Long, lpszsubkey: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegCreateKeyEx(hkey: Long, lpsubkey: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegCreateReadBatch(hkey: Long, phregreadbatch: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegDeleteKey(hkey: Long, lpszsubkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegDeleteKeyEx(hkey: Long, lpsubkey: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegDeleteValue(hkey: Long, lpszvaluename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegDeleteValueEx(hkey: Long, lpszvaluename: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegEnumKey(hkey: Long, dwindex: Int, lpszname: Long, lpcchname: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegEnumValue(hkey: Long, dwindex: Int, lpszvaluename: Long, lpcchvaluename: Long, lpdwtype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegGetBatchNotification(hbatchnotify: Long, phbatchnotification: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegGetKeySecurity(hkey: Long, requestedinformation: Int, psecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegOpenKey(hkey: Long, lpszsubkey: Long, samdesired: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegQueryInfoKey(hkey: Long, lpcsubkeys: Long, lpcchmaxsubkeylen: Long, lpcvalues: Long, lpcchmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegQueryValue(hkey: Long, lpszvaluename: Long, lpdwvaluetype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegReadBatchAddCommand(hregreadbatch: Long, wzsubkeyname: Long, wzvaluename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegReadBatchReplyNextCommand(hregreadbatchreply: Long, pbatchcommand: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurity(hkey: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurityEx(hkey: Long, securityinformation: Int, psecuritydescriptor: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegSetValue(hkey: Long, lpszvaluename: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegSetValueEx(hkey: Long, lpszvaluename: Long, dwtype: Int, lpdata: Long, cbdata: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRegSyncDatabase(hcluster: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRemoveAffinityRule(hcluster: Long, rulename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromAffinityRule(hcluster: Long, rulename: Long, hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSet(hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSetEx(hgroup: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceCloseEnum(hresenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceCloseEnumEx(hresourceenumex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceControl(hresource: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceControlAsUser(hresource: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceControlAsUserEx(hresource: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceControlEx(hresource: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceEnum(hresenum: Long, dwindex: Int, lpdwtype: Long, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceEnumEx(hresourceenumex: Long, dwindex: Int, pitem: Long, cbitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCount(hresenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCountEx(hresourceenumex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceOpenEnum(hresource: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceOpenEnumEx(hcluster: Long, lpszproperties: Long, cbproperties: Int, lpszroproperties: Long, cbroproperties: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceTypeCloseEnum(hrestypeenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceTypeControl(hcluster: Long, lpszresourcetypename: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUser(hcluster: Long, lpszresourcetypename: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUserEx(hcluster: Long, lpszresourcetypename: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceTypeControlEx(hcluster: Long, lpszresourcetypename: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceTypeEnum(hrestypeenum: Long, dwindex: Int, lpdwtype: Long, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceTypeGetEnumCount(hrestypeenum: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterResourceTypeOpenEnum(hcluster: Long, lpszresourcetypename: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterSetAccountAccess(hcluster: Long, szaccountsid: Long, dwaccess: Int, dwcontroltype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_clusterUpgradeFunctionalLevel(hcluster: Long, perform: Int, pfnprogresscallback: Long, pvcallbackarg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_createCluster(pconfig: Long, pfnprogresscallback: Long, pvcallbackarg: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_createClusterAvailabilitySet(hcluster: Long, lpavailabilitysetname: Long, pavailabilitysetconfig: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_createClusterGroup(hcluster: Long, lpszgroupname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_createClusterGroupEx(hcluster: Long, lpszgroupname: Long, pgroupinfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_createClusterGroupSet(hcluster: Long, groupsetname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_createClusterNameAccount(hcluster: Long, pconfig: Long, pfnprogresscallback: Long, pvcallbackarg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_createClusterNotifyPort(hchange: Long, hcluster: Long, dwfilter: Int, dwnotifykey: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_createClusterNotifyPortV2(hchange: Long, hcluster: Long, filters: Long, dwfiltercount: Int, dwnotifykey: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_createClusterResource(hgroup: Long, lpszresourcename: Long, lpszresourcetype: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_createClusterResourceEx(hgroup: Long, lpszresourcename: Long, lpszresourcetype: Long, dwflags: Int, lpszreason: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_createClusterResourceType(hcluster: Long, lpszresourcetypename: Long, lpszdisplayname: Long, lpszresourcetypedll: Long, dwlooksalivepollinterval: Int, dwisalivepollinterval: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_createClusterResourceTypeEx(hcluster: Long, lpszresourcetypename: Long, lpszdisplayname: Long, lpszresourcetypedll: Long, dwlooksalivepollinterval: Int, dwisalivepollinterval: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_deleteClusterGroup(hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_deleteClusterGroupEx(hgroup: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_deleteClusterGroupSet(hgroupset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_deleteClusterGroupSetEx(hgroupset: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_deleteClusterResource(hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_deleteClusterResourceEx(hresource: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_deleteClusterResourceType(hcluster: Long, lpszresourcetypename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_deleteClusterResourceTypeEx(hcluster: Long, lpsztypename: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_destroyCluster(hcluster: Long, pfnprogresscallback: Long, pvcallbackarg: Long, fdeletevirtualcomputerobjects: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_destroyClusterGroup(hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_destroyClusterGroupEx(hgroup: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_determineCNOResTypeFromCluster(hcluster: Long, pcnorestype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_determineCNOResTypeFromNodelist(cnodes: Int, ppsznodenames: Long, pcnorestype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromCluster(hcluster: Long, pcloudtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromNodelist(cnodes: Int, ppsznodenames: Long, pcloudtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_evictClusterNode(hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_evictClusterNodeEx(hnode: Long, dwtimeout: Int, phrcleanupstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_evictClusterNodeEx2(hnode: Long, dwtimeout: Int, phrcleanupstatus: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_failClusterResource(hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_failClusterResourceEx(hresource: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_freeClusterCrypt(pcryptinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_freeClusterHealthFault(clusterhealthfault: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_freeClusterHealthFaultArray(clusterhealthfaultarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterFromGroup(hgroup: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterFromNetInterface(hnetinterface: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterFromNetwork(hnetwork: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterFromNode(hnode: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterFromResource(hresource: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterGroupKey(hgroup: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterGroupState(hgroup: Long, lpsznodename: Long, lpcchnodename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterInformation(hcluster: Long, lpszclustername: Long, lpcchclustername: Long, lpclusterinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterKey(hcluster: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterNetInterface(hcluster: Long, lpsznodename: Long, lpsznetworkname: Long, lpszinterfacename: Long, lpcchinterfacename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterNetInterfaceKey(hnetinterface: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterNetInterfaceState(hnetinterface: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterNetworkId(hnetwork: Long, lpsznetworkid: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterNetworkKey(hnetwork: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterNetworkState(hnetwork: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterNodeId(hnode: Long, lpsznodeid: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterNodeKey(hnode: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterNodeState(hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterNotify(hchange: Long, lpdwnotifykey: Long, lpdwfiltertype: Long, lpszname: Long, lpcchname: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterNotifyV2(hchange: Long, lpdwnotifykey: Long, pfilterandtype: Long, buffer: Long, lpbbuffersize: Long, lpszobjectid: Long, lpcchobjectid: Long, lpszparentid: Long, lpcchparentid: Long, lpszname: Long, lpcchname: Long, lpsztype: Long, lpcchtype: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterQuorumResource(hcluster: Long, lpszresourcename: Long, lpcchresourcename: Long, lpszdevicename: Long, lpcchdevicename: Long, lpdwmaxquorumlogsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterResourceDependencyExpression(hresource: Long, lpszdependencyexpression: Long, lpcchdependencyexpression: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterResourceKey(hresource: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterResourceNetworkName(hresource: Long, lpbuffer: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterResourceState(hresource: Long, lpsznodename: Long, lpcchnodename: Long, lpszgroupname: Long, lpcchgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getClusterResourceTypeKey(hcluster: Long, lpsztypename: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getNodeCloudTypeDW(ppsznodename: Long, nodecloudtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getNodeClusterState(lpsznodename: Long, pdwclusterstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_getNotifyEventHandle(hchange: Long, lphtargetevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_initializeClusterHealthFault(clusterhealthfault: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_initializeClusterHealthFaultArray(clusterhealthfaultarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_isFileOnClusterSharedVolume(lpszpathname: Long, pbfileisonsharedvolume: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_moveClusterGroup(hgroup: Long, hdestinationnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_moveClusterGroupEx(hgroup: Long, hdestinationnode: Long, dwmoveflags: Int, lpinbuffer: Long, cbinbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_moveClusterGroupEx2(hgroup: Long, hdestinationnode: Long, dwmoveflags: Int, lpinbuffer: Long, cbinbuffersize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_offlineClusterGroup(hgroup: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_offlineClusterGroupEx(hgroup: Long, dwofflineflags: Int, lpinbuffer: Long, cbinbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_offlineClusterGroupEx2(hgroup: Long, dwofflineflags: Int, lpinbuffer: Long, cbinbuffersize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_offlineClusterResource(hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_offlineClusterResourceEx(hresource: Long, dwofflineflags: Int, lpinbuffer: Long, cbinbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_offlineClusterResourceEx2(hresource: Long, dwofflineflags: Int, lpinbuffer: Long, cbinbuffersize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_onlineClusterGroup(hgroup: Long, hdestinationnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_onlineClusterGroupEx(hgroup: Long, hdestinationnode: Long, dwonlineflags: Int, lpinbuffer: Long, cbinbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_onlineClusterGroupEx2(hgroup: Long, hdestinationnode: Long, dwonlineflags: Int, lpinbuffer: Long, cbinbuffersize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_onlineClusterResource(hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_onlineClusterResourceEx(hresource: Long, dwonlineflags: Int, lpinbuffer: Long, cbinbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_onlineClusterResourceEx2(hresource: Long, dwonlineflags: Int, lpinbuffer: Long, cbinbuffersize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openCluster(lpszclustername: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openClusterCryptProvider(lpszresource: Long, lpszprovider: Long, dwtype: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openClusterCryptProviderEx(lpszresource: Long, lpszkeyname: Long, lpszprovider: Long, dwtype: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openClusterEx(lpszclustername: Long, desiredaccess: Int, grantedaccess: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openClusterGroup(hcluster: Long, lpszgroupname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openClusterGroupEx(hcluster: Long, lpszgroupname: Long, dwdesiredaccess: Int, lpdwgrantedaccess: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openClusterGroupSet(hcluster: Long, lpszgroupsetname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openClusterNetInterface(hcluster: Long, lpszinterfacename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openClusterNetInterfaceEx(hcluster: Long, lpszinterfacename: Long, dwdesiredaccess: Int, lpdwgrantedaccess: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openClusterNetwork(hcluster: Long, lpsznetworkname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openClusterNetworkEx(hcluster: Long, lpsznetworkname: Long, dwdesiredaccess: Int, lpdwgrantedaccess: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openClusterNode(hcluster: Long, lpsznodename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openClusterNodeById(hcluster: Long, nodeid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openClusterNodeEx(hcluster: Long, lpsznodename: Long, dwdesiredaccess: Int, lpdwgrantedaccess: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openClusterResource(hcluster: Long, lpszresourcename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_openClusterResourceEx(hcluster: Long, lpszresourcename: Long, dwdesiredaccess: Int, lpdwgrantedaccess: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_pauseClusterNode(hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_pauseClusterNodeEx(hnode: Long, bdrainnode: Int, dwpauseflags: Int, hnodedraintarget: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_pauseClusterNodeEx2(hnode: Long, bdrainnode: Int, dwpauseflags: Int, hnodedraintarget: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_queryAppInstanceVersion(appinstanceid: Long, instanceversionhigh: Long, instanceversionlow: Long, versionstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_registerAppInstance(processhandle: Long, appinstanceid: Long, childreninheritappinstance: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_registerAppInstanceVersion(appinstanceid: Long, instanceversionhigh: Long, instanceversionlow: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_registerClusterNotify(hchange: Long, dwfiltertype: Int, hobject: Long, dwnotifykey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_registerClusterResourceTypeNotifyV2(hchange: Long, hcluster: Long, flags: Long, restypename: Long, dwnotifykey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_removeClusterGroupDependency(hgroup: Long, hdependson: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_removeClusterGroupDependencyEx(hgroup: Long, hdependson: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependency(hgroupset: Long, hdependson: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependencyEx(hgroupset: Long, hdependson: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependency(hgroup: Long, hdependson: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependencyEx(hgroup: Long, hdependson: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_removeClusterNameAccount(hcluster: Long, bdeletecomputerobjects: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_removeClusterResourceDependency(hresource: Long, hdependson: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_removeClusterResourceDependencyEx(hresource: Long, hdependson: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_removeClusterResourceNode(hresource: Long, hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_removeClusterResourceNodeEx(hresource: Long, hnode: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_removeClusterStorageNode(hcluster: Long, lpszclusterstorageenclosurename: Long, dwtimeout: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_removeCrossClusterGroupSetDependency(hdependentgroupset: Long, lpremoteclustername: Long, lpremotegroupsetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_removeResourceFromClusterSharedVolumes(hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilAddUnknownProperties(hkeyclusterkey: Long, ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilCreateDirectoryTree(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilDupGroup(group: Long, copy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilDupParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilDupResource(group: Long, copy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilDupString(pszinstring: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilEnumGroups(hcluster: Long, hself: Long, prescallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilEnumGroupsEx(hcluster: Long, hself: Long, grouptype: Int, prescallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilEnumPrivateProperties(hkeyclusterkey: Long, pszoutproperties: Long, cboutpropertiessize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilEnumProperties(ppropertytable: Long, pszoutproperties: Long, cboutpropertiessize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilEnumResources(hself: Long, lpszrestypename: Long, prescallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx(hcluster: Long, hself: Long, lpszrestypename: Long, prescallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx2(hcluster: Long, hself: Long, lpszrestypename: Long, prescallback: Long, pparameter: Long, dwdesiredaccess: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilExpandEnvironmentStrings(pszsrc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilFindBinaryProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pbpropertyvalue: Long, pcbpropertyvaluesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilFindDependentDiskResourceDriveLetter(hcluster: Long, hresource: Long, pszdriveletter: Long, pcchdriveletter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilFindDwordProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pdwpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilFindExpandSzProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pszpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilFindExpandedSzProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pszpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilFindFileTimeProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pftpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilFindLongProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, plpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilFindMultiSzProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pszpropertyvalue: Long, pcbpropertyvaluesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilFindSzProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pszpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilFindULargeIntegerProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, plpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilFreeEnvironment(lpenvironment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilFreeParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long)

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetAllProperties(hkeyclusterkey: Long, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetBinaryProperty(ppboutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pboldvalue: Long, cboldvaluesize: Int, pppropertylist: Long, pcbpropertylistsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetBinaryValue(hkeyclusterkey: Long, pszvaluename: Long, ppboutvalue: Long, pcboutvaluesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetClusterGroupType(hgroup: Long, grouptype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetClusterId(hcluster: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetClusterRoleState(hcluster: Long, eclusterrole: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResources(hcluster: Long, phclusternameresource: Long, phclusteripaddressresource: Long, phclusterquorumresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResourcesEx(hclusterin: Long, phclusternameresourceout: Long, phclusterquorumresourceout: Long, dwdesiredaccess: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetCoreGroup(hcluster: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetDwordProperty(pdwoutvalue: Long, pvaluestruct: Long, dwoldvalue: Int, dwminimum: Int, dwmaximum: Int, pppropertylist: Long, pcbpropertylistsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetDwordValue(hkeyclusterkey: Long, pszvaluename: Long, pdwoutvalue: Long, dwdefaultvalue: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetEnvironmentWithNetName(hresource: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetLongProperty(ploutvalue: Long, pvaluestruct: Long, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: Long, pcbpropertylistsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetMultiSzProperty(ppszoutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pszoldvalue: Long, cboldvaluesize: Int, pppropertylist: Long, pcbpropertylistsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetPrivateProperties(hkeyclusterkey: Long, poutpropertylist: Long, cboutpropertylistsize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetProperties(hkeyclusterkey: Long, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetPropertiesToParameterBlock(hkeyclusterkey: Long, ppropertytable: Long, poutparams: Long, bcheckforrequiredproperties: Int, psznameofpropinerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetProperty(hkeyclusterkey: Long, ppropertytableitem: Long, poutpropertyitem: Long, pcboutpropertyitemsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetPropertyFormats(ppropertytable: Long, poutpropertyformatlist: Long, cbpropertyformatlistsize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetPropertySize(hkeyclusterkey: Long, ppropertytableitem: Long, pcboutpropertylistsize: Long, pnpropertycount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetQwordValue(hkeyclusterkey: Long, pszvaluename: Long, pqwoutvalue: Long, qwdefaultvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetResourceDependency(hself: Long, lpszresourcetype: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClass(hcluster: Long, hself: Long, prci: Long, brecurse: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClassEx(hcluster: Long, hself: Long, prci: Long, brecurse: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByName(hcluster: Long, hself: Long, lpszresourcetype: Long, brecurse: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByNameEx(hcluster: Long, hself: Long, lpszresourcetype: Long, brecurse: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyEx(hself: Long, lpszresourcetype: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetResourceDependentIPAddressProps(hresource: Long, pszaddress: Long, pcchaddress: Long, pszsubnetmask: Long, pcchsubnetmask: Long, psznetwork: Long, pcchnetwork: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetResourceName(hresource: Long, pszresourcename: Long, pcchresourcenameinout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependency(lpszresourcename: Long, lpszresourcetype: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependencyEx(lpszresourcename: Long, lpszresourcetype: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetSzProperty(ppszoutvalue: Long, pvaluestruct: Long, pszoldvalue: Long, pppropertylist: Long, pcbpropertylistsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGetSzValue(hkeyclusterkey: Long, pszvaluename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilGroupsEqual(hself: Long, hgroup: Long, pequal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilIsPathValid(pszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilIsResourceClassEqual(prci: Long, hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilLeftPaxosIsLessThanRight(left: Long, right: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilNodeEnum(hcluster: Long, pnodecallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilPaxosComparer(left: Long, right: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilPropertyListFromParameterBlock(ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: Long, pinparams: Long, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilRemoveResourceServiceEnvironment(pszservicename: Long, pfnlogevent: Long, hresourcehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilResourceDepEnum(hself: Long, enumtype: Int, prescallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilResourceTypesEqual(lpszresourcetypename: Long, hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilResourcesEqual(hself: Long, hresource: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetBinaryValue(hkeyclusterkey: Long, pszvaluename: Long, pbnewvalue: Long, cbnewvaluesize: Int, ppboutvalue: Long, pcboutvaluesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetDwordValue(hkeyclusterkey: Long, pszvaluename: Long, dwnewvalue: Int, pdwoutvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetExpandSzValue(hkeyclusterkey: Long, pszvaluename: Long, psznewvalue: Long, ppszoutstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetMultiSzValue(hkeyclusterkey: Long, pszvaluename: Long, psznewvalue: Long, cbnewvaluesize: Int, ppszoutvalue: Long, pcboutvaluesize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetPrivatePropertyList(hkeyclusterkey: Long, pinpropertylist: Long, cbinpropertylistsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlock(hkeyclusterkey: Long, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: Int, poutparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlockEx(hkeyclusterkey: Long, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: Int, bforcewrite: Int, poutparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetPropertyTable(hkeyclusterkey: Long, ppropertytable: Long, reserved: Long, ballowunknownproperties: Int, pinpropertylist: Long, cbinpropertylistsize: Int, poutparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetPropertyTableEx(hkeyclusterkey: Long, ppropertytable: Long, reserved: Long, ballowunknownproperties: Int, pinpropertylist: Long, cbinpropertylistsize: Int, bforcewrite: Int, poutparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetQwordValue(hkeyclusterkey: Long, pszvaluename: Long, qwnewvalue: Long, pqwoutvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceEnvironment(pszservicename: Long, hresource: Long, pfnlogevent: Long, hresourcehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParameters(pszservicename: Long, schscmhandle: Long, phservice: Long, pfnlogevent: Long, hresourcehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParametersEx(pszservicename: Long, schscmhandle: Long, phservice: Long, dwdesiredaccess: Int, pfnlogevent: Long, hresourcehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetSzValue(hkeyclusterkey: Long, pszvaluename: Long, psznewvalue: Long, ppszoutstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetUnknownProperties(hkeyclusterkey: Long, ppropertytable: Long, pinpropertylist: Long, cbinpropertylistsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilSetValueEx(hkeyclusterkey: Long, valuename: Long, valuetype: Int, valuedata: Long, valuesize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilStartResourceService(pszservicename: Long, phservicehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilStopResourceService(pszservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilStopService(hservicehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilTerminateServiceProcessFromResDll(dwservicepid: Int, boffline: Int, pdwresourcestate: Long, pfnlogevent: Long, hresourcehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilVerifyPrivatePropertyList(pinpropertylist: Long, cbinpropertylistsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilVerifyPropertyTable(ppropertytable: Long, reserved: Long, ballowunknownproperties: Int, pinpropertylist: Long, cbinpropertylistsize: Int, poutparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilVerifyResourceService(pszservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilVerifyService(hservicehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilVerifyShutdownSafe(flags: Int, reason: Int, presult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resUtilsDeleteKeyTree(key: Long, keyname: Long, treatnokeyaserror: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resetAllAppInstanceVersions(): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_restartClusterResource(hresource: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_restartClusterResourceEx(hresource: Long, dwflags: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_restoreClusterDatabase(lpszpathname: Long, bforce: Int, lpszquorumdriveletter: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resumeClusterNode(hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resumeClusterNodeEx(hnode: Long, eresumefailbacktype: Int, dwresumeflagsreserved: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_resumeClusterNodeEx2(hnode: Long, eresumefailbacktype: Int, dwresumeflagsreserved: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setAppInstanceCsvFlags(processhandle: Long, mask: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterGroupName(hgroup: Long, lpszgroupname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterGroupNameEx(hgroup: Long, lpszgroupname: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterGroupNodeList(hgroup: Long, nodecount: Int, nodelist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterGroupNodeListEx(hgroup: Long, nodecount: Int, nodelist: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpression(hgroupset: Long, lpszdependencyexprssion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpressionEx(hgroupset: Long, lpszdependencyexpression: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterName(hcluster: Long, lpsznewclustername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterNameEx(hcluster: Long, lpsznewclustername: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterNetworkName(hnetwork: Long, lpszname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterNetworkNameEx(hnetwork: Long, lpszname: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterNetworkPriorityOrder(hcluster: Long, networkcount: Int, networklist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterQuorumResource(hresource: Long, lpszdevicename: Long, dwmaxquologsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterQuorumResourceEx(hresource: Long, lpszdevicename: Long, dwmaxquorumlogsize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterResourceDependencyExpression(hresource: Long, lpszdependencyexpression: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterResourceName(hresource: Long, lpszresourcename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterResourceNameEx(hresource: Long, lpszresourcename: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setClusterServiceAccountPassword(lpszclustername: Long, lpsznewpassword: Long, dwflags: Int, lpreturnstatusbuffer: Long, lpcbreturnstatusbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setGroupDependencyExpression(hgroup: Long, lpszdependencyexpression: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_networking_clustering_setGroupDependencyExpressionEx(hgroup: Long, lpszdependencyexpression: Long, lpszreason: Long): Int
}

public actual fun addClusterGroupDependency(hdependentgroup: Hgroup, hprovidergroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_addClusterGroupDependency(hdependentgroup, hprovidergroup).toUInt()

public actual fun addClusterGroupDependencyEx(hdependentgroup: Hgroup, hprovidergroup: Hgroup, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_addClusterGroupDependencyEx(hdependentgroup, hprovidergroup, (lpszreason?.value ?: 0L)).toUInt()

public actual fun addClusterGroupSetDependency(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_addClusterGroupSetDependency(hdependentgroupset, hprovidergroupset).toUInt()

public actual fun addClusterGroupSetDependencyEx(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_addClusterGroupSetDependencyEx(hdependentgroupset, hprovidergroupset, (lpszreason?.value ?: 0L)).toUInt()

public actual fun addClusterGroupToGroupSetDependency(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependency(hdependentgroup, hprovidergroupset).toUInt()

public actual fun addClusterGroupToGroupSetDependencyEx(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_addClusterGroupToGroupSetDependencyEx(hdependentgroup, hprovidergroupset, (lpszreason?.value ?: 0L)).toUInt()

public actual fun addClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?): Hnode =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_addClusterNode(hcluster, (lpsznodename?.value ?: 0L), 0L, (pvcallbackarg?.value ?: 0L))

public actual fun addClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwflags: UInt, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?): Hnode =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_addClusterNodeEx(hcluster, (lpsznodename?.value ?: 0L), dwflags.toInt(), 0L, (pvcallbackarg?.value ?: 0L))

public actual fun addClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_addClusterResourceDependency(hresource, hdependson).toUInt()

public actual fun addClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_addClusterResourceDependencyEx(hresource, hdependson, (lpszreason?.value ?: 0L)).toUInt()

public actual fun addClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_addClusterResourceNode(hresource, hnode).toUInt()

public actual fun addClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_addClusterResourceNodeEx(hresource, hnode, (lpszreason?.value ?: 0L)).toUInt()

public actual fun addClusterStorageNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?, lpszclusterstoragenodedescription: Pcwstr, lpszclusterstoragenodelocation: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_addClusterStorageNode(hcluster, (lpsznodename?.value ?: 0L), 0L, (pvcallbackarg?.value ?: 0L), (lpszclusterstoragenodedescription?.value ?: 0L), (lpszclusterstoragenodelocation?.value ?: 0L)).toUInt()

public actual fun addCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_addCrossClusterGroupSetDependency(hdependentgroupset, (lpremoteclustername?.value ?: 0L), (lpremotegroupsetname?.value ?: 0L)).toUInt()

public actual fun addResourceToClusterSharedVolumes(hresource: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_addResourceToClusterSharedVolumes(hresource).toUInt()

public actual fun backupClusterDatabase(hcluster: Hcluster, lpszpathname: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_backupClusterDatabase(hcluster, (lpszpathname?.value ?: 0L)).toUInt()

public actual fun canResourceBeDependent(hresource: Hresource, hresourcedependent: Hresource): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_canResourceBeDependent(hresource, hresourcedependent)

public actual fun cancelClusterGroupOperation(hgroup: Hgroup, dwcancelflagsReserved: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_cancelClusterGroupOperation(hgroup, dwcancelflagsReserved.toInt()).toUInt()

public actual fun changeClusterResourceGroup(hresource: Hresource, hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_changeClusterResourceGroup(hresource, hgroup).toUInt()

public actual fun changeClusterResourceGroupEx(hresource: Hresource, hgroup: Hgroup, flags: ULong): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx(hresource, hgroup, flags.toLong()).toUInt()

public actual fun changeClusterResourceGroupEx2(hresource: Hresource, hgroup: Hgroup, flags: ULong, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_changeClusterResourceGroupEx2(hresource, hgroup, flags.toLong(), (lpszreason?.value ?: 0L)).toUInt()

public actual fun closeCluster(hcluster: Hcluster): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_closeCluster(hcluster)

public actual fun closeClusterCryptProvider(hcluscryptprovider: Hcluscryptprovider): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_closeClusterCryptProvider(hcluscryptprovider).toUInt()

public actual fun closeClusterGroup(hgroup: Hgroup): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_closeClusterGroup(hgroup)

public actual fun closeClusterGroupSet(hgroupset: Hgroupset): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_closeClusterGroupSet(hgroupset)

public actual fun closeClusterNetInterface(hnetinterface: Hnetinterface): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_closeClusterNetInterface(hnetinterface)

public actual fun closeClusterNetwork(hnetwork: Hnetwork): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_closeClusterNetwork(hnetwork)

public actual fun closeClusterNode(hnode: Hnode): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_closeClusterNode(hnode)

public actual fun closeClusterNotifyPort(hchange: Hchange): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_closeClusterNotifyPort(hchange)

public actual fun closeClusterResource(hresource: Hresource): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_closeClusterResource(hresource)

public actual fun clusAddClusterHealthFault(hcluster: Hcluster, failure: COpaquePointer?, param2: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusAddClusterHealthFault(hcluster, (failure?.value ?: 0L), param2.toInt()).toUInt()

public actual fun clusGetClusterHealthFaults(hcluster: Hcluster, objects: COpaquePointer?, flags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusGetClusterHealthFaults(hcluster, (objects?.value ?: 0L), flags.toInt()).toUInt()

public actual fun clusRemoveClusterHealthFault(hcluster: Hcluster, id: Pcwstr, flags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusRemoveClusterHealthFault(hcluster, (id?.value ?: 0L), flags.toInt()).toUInt()

public actual fun clusWorkerCheckTerminate(lpworker: COpaquePointer?): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusWorkerCheckTerminate((lpworker?.value ?: 0L))

public actual fun clusWorkerCreate(lpworker: COpaquePointer?, lpstartaddress: PworkerStartRoutine, lpparameter: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusWorkerCreate((lpworker?.value ?: 0L), 0L, (lpparameter?.value ?: 0L)).toUInt()

public actual fun clusWorkerTerminate(lpworker: COpaquePointer?) {
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusWorkerTerminate((lpworker?.value ?: 0L))
}

public actual fun clusWorkerTerminateEx(clusworker: COpaquePointer?, timeoutinmilliseconds: UInt, waitonly: Bool): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusWorkerTerminateEx((clusworker?.value ?: 0L), timeoutinmilliseconds.toInt(), waitonly).toUInt()

public actual fun clusWorkersTerminate(clusworkers: COpaquePointer?, clusworkerscount: ULong, timeoutinmilliseconds: UInt, waitonly: Bool): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusWorkersTerminate((clusworkers?.value ?: 0L), clusworkerscount.toLong(), timeoutinmilliseconds.toInt(), waitonly).toUInt()

public actual fun clusapiSetReasonHandler(lphandler: COpaquePointer?): COpaquePointer? =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusapiSetReasonHandler((lphandler?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clusterAddGroupToAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterAddGroupToAffinityRule(hcluster, (rulename?.value ?: 0L), hgroup).toUInt()

public actual fun clusterAddGroupToGroupSet(hgroupset: Hgroupset, hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSet(hgroupset, hgroup).toUInt()

public actual fun clusterAddGroupToGroupSetWithDomains(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomains(hgroupset, hgroup, faultdomain.toInt(), updatedomain.toInt()).toUInt()

public actual fun clusterAddGroupToGroupSetWithDomainsEx(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterAddGroupToGroupSetWithDomainsEx(hgroupset, hgroup, faultdomain.toInt(), updatedomain.toInt(), (lpszreason?.value ?: 0L)).toUInt()

public actual fun clusterAffinityRuleControl(hcluster: Hcluster, affinityrulename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterAffinityRuleControl(hcluster, (affinityrulename?.value ?: 0L), hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L)).toUInt()

public actual fun clusterClearBackupStateForSharedVolume(lpszvolumepathname: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterClearBackupStateForSharedVolume((lpszvolumepathname?.value ?: 0L)).toUInt()

public actual fun clusterCloseEnum(henum: Hclusenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterCloseEnum(henum).toUInt()

public actual fun clusterCloseEnumEx(hclusterenum: Hclusenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterCloseEnumEx(hclusterenum).toUInt()

public actual fun clusterControl(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterControl(hcluster, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L)).toUInt()

public actual fun clusterControlEx(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterControlEx(hcluster, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun clusterCreateAffinityRule(hcluster: Hcluster, rulename: Pcwstr, ruletype: ClusAffinityRuleType): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterCreateAffinityRule(hcluster, (rulename?.value ?: 0L), ruletype).toUInt()

public actual fun clusterDecrypt(hcluscryptprovider: Hcluscryptprovider, pcryptinput: COpaquePointer?, cbcryptinput: UInt, ppcryptoutput: COpaquePointer?, pcbcryptoutput: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterDecrypt(hcluscryptprovider, (pcryptinput?.value ?: 0L), cbcryptinput.toInt(), (ppcryptoutput?.value ?: 0L), (pcbcryptoutput?.value ?: 0L)).toUInt()

public actual fun clusterEncrypt(hcluscryptprovider: Hcluscryptprovider, pdata: COpaquePointer?, cbdata: UInt, ppdata: COpaquePointer?, pcbdata: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterEncrypt(hcluscryptprovider, (pdata?.value ?: 0L), cbdata.toInt(), (ppdata?.value ?: 0L), (pcbdata?.value ?: 0L)).toUInt()

public actual fun clusterEnum(henum: Hclusenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterEnum(henum, dwindex.toInt(), (lpdwtype?.value ?: 0L), (lpszname?.value ?: 0L), (lpcchname?.value ?: 0L)).toUInt()

public actual fun clusterEnumEx(hclusterenum: Hclusenumex, dwindex: UInt, pitem: COpaquePointer?, cbitem: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterEnumEx(hclusterenum, dwindex.toInt(), (pitem?.value ?: 0L), (cbitem?.value ?: 0L)).toUInt()

public actual fun clusterGetEnumCount(henum: Hclusenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGetEnumCount(henum).toUInt()

public actual fun clusterGetEnumCountEx(hclusterenum: Hclusenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGetEnumCountEx(hclusterenum).toUInt()

public actual fun clusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGetVolumeNameForVolumeMountPoint((lpszvolumemountpoint?.value ?: 0L), (lpszvolumename?.value ?: 0L), cchbufferlength.toInt())

public actual fun clusterGetVolumePathName(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGetVolumePathName((lpszfilename?.value ?: 0L), (lpszvolumepathname?.value ?: 0L), cchbufferlength.toInt())

public actual fun clusterGroupCloseEnum(hgroupenum: Hgroupenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupCloseEnum(hgroupenum).toUInt()

public actual fun clusterGroupCloseEnumEx(hgroupenumex: Hgroupenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupCloseEnumEx(hgroupenumex).toUInt()

public actual fun clusterGroupControl(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupControl(hgroup, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L)).toUInt()

public actual fun clusterGroupControlEx(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupControlEx(hgroup, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun clusterGroupEnum(hgroupenum: Hgroupenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszresourcename: Pwstr, lpcchname: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupEnum(hgroupenum, dwindex.toInt(), (lpdwtype?.value ?: 0L), (lpszresourcename?.value ?: 0L), (lpcchname?.value ?: 0L)).toUInt()

public actual fun clusterGroupEnumEx(hgroupenumex: Hgroupenumex, dwindex: UInt, pitem: COpaquePointer?, cbitem: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupEnumEx(hgroupenumex, dwindex.toInt(), (pitem?.value ?: 0L), (cbitem?.value ?: 0L)).toUInt()

public actual fun clusterGroupGetEnumCount(hgroupenum: Hgroupenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCount(hgroupenum).toUInt()

public actual fun clusterGroupGetEnumCountEx(hgroupenumex: Hgroupenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupGetEnumCountEx(hgroupenumex).toUInt()

public actual fun clusterGroupOpenEnum(hgroup: Hgroup, dwtype: UInt): Hgroupenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupOpenEnum(hgroup, dwtype.toInt())

public actual fun clusterGroupOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hgroupenumex =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupOpenEnumEx(hcluster, (lpszproperties?.value ?: 0L), cbproperties.toInt(), (lpszroproperties?.value ?: 0L), cbroproperties.toInt(), dwflags.toInt())

public actual fun clusterGroupSetCloseEnum(hgroupsetenum: Hgroupsetenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupSetCloseEnum(hgroupsetenum).toUInt()

public actual fun clusterGroupSetControl(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupSetControl(hgroupset, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L)).toUInt()

public actual fun clusterGroupSetControlEx(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupSetControlEx(hgroupset, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun clusterGroupSetEnum(hgroupsetenum: Hgroupsetenum, dwindex: UInt, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupSetEnum(hgroupsetenum, dwindex.toInt(), (lpszname?.value ?: 0L), (lpcchname?.value ?: 0L)).toUInt()

public actual fun clusterGroupSetGetEnumCount(hgroupsetenum: Hgroupsetenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupSetGetEnumCount(hgroupsetenum).toUInt()

public actual fun clusterGroupSetOpenEnum(hcluster: Hcluster): Hgroupsetenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterGroupSetOpenEnum(hcluster)

public actual fun clusterIsPathOnSharedVolume(lpszpathname: Pcwstr): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterIsPathOnSharedVolume((lpszpathname?.value ?: 0L))

public actual fun clusterNetInterfaceCloseEnum(hnetinterfaceenum: Hnetinterfaceenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNetInterfaceCloseEnum(hnetinterfaceenum).toUInt()

public actual fun clusterNetInterfaceControl(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNetInterfaceControl(hnetinterface, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L)).toUInt()

public actual fun clusterNetInterfaceControlEx(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNetInterfaceControlEx(hnetinterface, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun clusterNetInterfaceEnum(hnetinterfaceenum: Hnetinterfaceenum, dwindex: UInt, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNetInterfaceEnum(hnetinterfaceenum, dwindex.toInt(), (lpszname?.value ?: 0L), (lpcchname?.value ?: 0L)).toUInt()

public actual fun clusterNetInterfaceOpenEnum(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr): Hnetinterfaceenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNetInterfaceOpenEnum(hcluster, (lpsznodename?.value ?: 0L), (lpsznetworkname?.value ?: 0L))

public actual fun clusterNetworkCloseEnum(hnetworkenum: Hnetworkenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNetworkCloseEnum(hnetworkenum).toUInt()

public actual fun clusterNetworkControl(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNetworkControl(hnetwork, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L)).toUInt()

public actual fun clusterNetworkControlEx(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNetworkControlEx(hnetwork, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun clusterNetworkEnum(hnetworkenum: Hnetworkenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNetworkEnum(hnetworkenum, dwindex.toInt(), (lpdwtype?.value ?: 0L), (lpszname?.value ?: 0L), (lpcchname?.value ?: 0L)).toUInt()

public actual fun clusterNetworkGetEnumCount(hnetworkenum: Hnetworkenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNetworkGetEnumCount(hnetworkenum).toUInt()

public actual fun clusterNetworkOpenEnum(hnetwork: Hnetwork, dwtype: UInt): Hnetworkenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNetworkOpenEnum(hnetwork, dwtype.toInt())

public actual fun clusterNodeCloseEnum(hnodeenum: Hnodeenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNodeCloseEnum(hnodeenum).toUInt()

public actual fun clusterNodeCloseEnumEx(hnodeenum: Hnodeenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNodeCloseEnumEx(hnodeenum).toUInt()

public actual fun clusterNodeControl(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNodeControl(hnode, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L)).toUInt()

public actual fun clusterNodeControlEx(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNodeControlEx(hnode, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun clusterNodeEnum(hnodeenum: Hnodeenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNodeEnum(hnodeenum, dwindex.toInt(), (lpdwtype?.value ?: 0L), (lpszname?.value ?: 0L), (lpcchname?.value ?: 0L)).toUInt()

public actual fun clusterNodeEnumEx(hnodeenum: Hnodeenumex, dwindex: UInt, pitem: COpaquePointer?, cbitem: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNodeEnumEx(hnodeenum, dwindex.toInt(), (pitem?.value ?: 0L), (cbitem?.value ?: 0L)).toUInt()

public actual fun clusterNodeGetEnumCount(hnodeenum: Hnodeenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCount(hnodeenum).toUInt()

public actual fun clusterNodeGetEnumCountEx(hnodeenum: Hnodeenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNodeGetEnumCountEx(hnodeenum).toUInt()

public actual fun clusterNodeOpenEnum(hnode: Hnode, dwtype: UInt): Hnodeenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNodeOpenEnum(hnode, dwtype.toInt())

public actual fun clusterNodeOpenEnumEx(hnode: Hnode, dwtype: UInt, poptions: COpaquePointer?): Hnodeenumex =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNodeOpenEnumEx(hnode, dwtype.toInt(), (poptions?.value ?: 0L))

public actual fun clusterNodeReplacement(hcluster: Hcluster, lpsznodenamecurrent: Pcwstr, lpsznodenamenew: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterNodeReplacement(hcluster, (lpsznodenamecurrent?.value ?: 0L), (lpsznodenamenew?.value ?: 0L)).toUInt()

public actual fun clusterOpenEnum(hcluster: Hcluster, dwtype: UInt): Hclusenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterOpenEnum(hcluster, dwtype.toInt())

public actual fun clusterOpenEnumEx(hcluster: Hcluster, dwtype: UInt, poptions: COpaquePointer?): Hclusenumex =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterOpenEnumEx(hcluster, dwtype.toInt(), (poptions?.value ?: 0L))

public actual fun clusterPrepareSharedVolumeForBackup(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, lpcchvolumepathname: COpaquePointer?, lpszvolumename: Pwstr, lpcchvolumename: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterPrepareSharedVolumeForBackup((lpszfilename?.value ?: 0L), (lpszvolumepathname?.value ?: 0L), (lpcchvolumepathname?.value ?: 0L), (lpszvolumename?.value ?: 0L), (lpcchvolumename?.value ?: 0L)).toUInt()

public actual fun clusterRegBatchAddCommand(hregbatch: Hregbatch, dwcommand: ClusterRegCommand, wzname: Pcwstr, dwoptions: UInt, lpdata: COpaquePointer?, cbdata: UInt): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegBatchAddCommand(hregbatch, dwcommand, (wzname?.value ?: 0L), dwoptions.toInt(), (lpdata?.value ?: 0L), cbdata.toInt())

public actual fun clusterRegBatchCloseNotification(hbatchnotification: Hregbatchnotification): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegBatchCloseNotification(hbatchnotification)

public actual fun clusterRegBatchReadCommand(hbatchnotification: Hregbatchnotification, pbatchcommand: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegBatchReadCommand(hbatchnotification, (pbatchcommand?.value ?: 0L))

public actual fun clusterRegCloseBatch(hregbatch: Hregbatch, bcommit: Bool, failedcommandnumber: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegCloseBatch(hregbatch, bcommit, (failedcommandnumber?.value ?: 0L))

public actual fun clusterRegCloseBatchEx(hregbatch: Hregbatch, flags: UInt, failedcommandnumber: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegCloseBatchEx(hregbatch, flags.toInt(), (failedcommandnumber?.value ?: 0L))

public actual fun clusterRegCloseBatchNotifyPort(hbatchnotifyport: Hregbatchport): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegCloseBatchNotifyPort(hbatchnotifyport)

public actual fun clusterRegCloseKey(hkey: Hkey): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegCloseKey((hkey?.value ?: 0L))

public actual fun clusterRegCloseReadBatch(hregreadbatch: Hregreadbatch, phregreadbatchreply: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatch(hregreadbatch, (phregreadbatchreply?.value ?: 0L))

public actual fun clusterRegCloseReadBatchEx(hregreadbatch: Hregreadbatch, flags: UInt, phregreadbatchreply: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchEx(hregreadbatch, flags.toInt(), (phregreadbatchreply?.value ?: 0L))

public actual fun clusterRegCloseReadBatchReply(hregreadbatchreply: Hregreadbatchreply): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegCloseReadBatchReply(hregreadbatchreply)

public actual fun clusterRegCreateBatch(hkey: Hkey, phregbatch: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegCreateBatch((hkey?.value ?: 0L), (phregbatch?.value ?: 0L))

public actual fun clusterRegCreateBatchNotifyPort(hkey: Hkey, phbatchnotifyport: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegCreateBatchNotifyPort((hkey?.value ?: 0L), (phbatchnotifyport?.value ?: 0L))

public actual fun clusterRegCreateKey(hkey: Hkey, lpszsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegCreateKey((hkey?.value ?: 0L), (lpszsubkey?.value ?: 0L), dwoptions.toInt(), samdesired.toInt(), (lpsecurityattributes?.value ?: 0L), (phkresult?.value ?: 0L), (lpdwdisposition?.value ?: 0L))

public actual fun clusterRegCreateKeyEx(hkey: Hkey, lpsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: COpaquePointer?, phkresult: COpaquePointer?, lpdwdisposition: COpaquePointer?, lpszreason: Pcwstr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegCreateKeyEx((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), dwoptions.toInt(), samdesired.toInt(), (lpsecurityattributes?.value ?: 0L), (phkresult?.value ?: 0L), (lpdwdisposition?.value ?: 0L), (lpszreason?.value ?: 0L))

public actual fun clusterRegCreateReadBatch(hkey: Hkey, phregreadbatch: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegCreateReadBatch((hkey?.value ?: 0L), (phregreadbatch?.value ?: 0L))

public actual fun clusterRegDeleteKey(hkey: Hkey, lpszsubkey: Pcwstr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegDeleteKey((hkey?.value ?: 0L), (lpszsubkey?.value ?: 0L))

public actual fun clusterRegDeleteKeyEx(hkey: Hkey, lpsubkey: Pcwstr, lpszreason: Pcwstr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegDeleteKeyEx((hkey?.value ?: 0L), (lpsubkey?.value ?: 0L), (lpszreason?.value ?: 0L))

public actual fun clusterRegDeleteValue(hkey: Hkey, lpszvaluename: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegDeleteValue((hkey?.value ?: 0L), (lpszvaluename?.value ?: 0L)).toUInt()

public actual fun clusterRegDeleteValueEx(hkey: Hkey, lpszvaluename: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegDeleteValueEx((hkey?.value ?: 0L), (lpszvaluename?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun clusterRegEnumKey(hkey: Hkey, dwindex: UInt, lpszname: Pwstr, lpcchname: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegEnumKey((hkey?.value ?: 0L), dwindex.toInt(), (lpszname?.value ?: 0L), (lpcchname?.value ?: 0L), (lpftlastwritetime?.value ?: 0L))

public actual fun clusterRegEnumValue(hkey: Hkey, dwindex: UInt, lpszvaluename: Pwstr, lpcchvaluename: COpaquePointer?, lpdwtype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegEnumValue((hkey?.value ?: 0L), dwindex.toInt(), (lpszvaluename?.value ?: 0L), (lpcchvaluename?.value ?: 0L), (lpdwtype?.value ?: 0L), (lpdata?.value ?: 0L), (lpcbdata?.value ?: 0L)).toUInt()

public actual fun clusterRegGetBatchNotification(hbatchnotify: Hregbatchport, phbatchnotification: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegGetBatchNotification(hbatchnotify, (phbatchnotification?.value ?: 0L))

public actual fun clusterRegGetKeySecurity(hkey: Hkey, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegGetKeySecurity((hkey?.value ?: 0L), requestedinformation.toInt(), (psecuritydescriptor?.value ?: 0L), (lpcbsecuritydescriptor?.value ?: 0L))

public actual fun clusterRegOpenKey(hkey: Hkey, lpszsubkey: Pcwstr, samdesired: UInt, phkresult: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegOpenKey((hkey?.value ?: 0L), (lpszsubkey?.value ?: 0L), samdesired.toInt(), (phkresult?.value ?: 0L))

public actual fun clusterRegQueryInfoKey(hkey: Hkey, lpcsubkeys: COpaquePointer?, lpcchmaxsubkeylen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcchmaxvaluenamelen: COpaquePointer?, lpcbmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegQueryInfoKey((hkey?.value ?: 0L), (lpcsubkeys?.value ?: 0L), (lpcchmaxsubkeylen?.value ?: 0L), (lpcvalues?.value ?: 0L), (lpcchmaxvaluenamelen?.value ?: 0L), (lpcbmaxvaluelen?.value ?: 0L), (lpcbsecuritydescriptor?.value ?: 0L), (lpftlastwritetime?.value ?: 0L))

public actual fun clusterRegQueryValue(hkey: Hkey, lpszvaluename: Pcwstr, lpdwvaluetype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegQueryValue((hkey?.value ?: 0L), (lpszvaluename?.value ?: 0L), (lpdwvaluetype?.value ?: 0L), (lpdata?.value ?: 0L), (lpcbdata?.value ?: 0L))

public actual fun clusterRegReadBatchAddCommand(hregreadbatch: Hregreadbatch, wzsubkeyname: Pcwstr, wzvaluename: Pcwstr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegReadBatchAddCommand(hregreadbatch, (wzsubkeyname?.value ?: 0L), (wzvaluename?.value ?: 0L))

public actual fun clusterRegReadBatchReplyNextCommand(hregreadbatchreply: Hregreadbatchreply, pbatchcommand: COpaquePointer?): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegReadBatchReplyNextCommand(hregreadbatchreply, (pbatchcommand?.value ?: 0L))

public actual fun clusterRegSetKeySecurity(hkey: Hkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurity((hkey?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L))

public actual fun clusterRegSetKeySecurityEx(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpszreason: Pcwstr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegSetKeySecurityEx((hkey?.value ?: 0L), securityinformation.toInt(), (psecuritydescriptor?.value ?: 0L), (lpszreason?.value ?: 0L))

public actual fun clusterRegSetValue(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegSetValue((hkey?.value ?: 0L), (lpszvaluename?.value ?: 0L), dwtype.toInt(), (lpdata?.value ?: 0L), cbdata.toInt()).toUInt()

public actual fun clusterRegSetValueEx(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegSetValueEx((hkey?.value ?: 0L), (lpszvaluename?.value ?: 0L), dwtype.toInt(), (lpdata?.value ?: 0L), cbdata.toInt(), (lpszreason?.value ?: 0L)).toUInt()

public actual fun clusterRegSyncDatabase(hcluster: Hcluster, flags: UInt): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRegSyncDatabase(hcluster, flags.toInt())

public actual fun clusterRemoveAffinityRule(hcluster: Hcluster, rulename: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRemoveAffinityRule(hcluster, (rulename?.value ?: 0L)).toUInt()

public actual fun clusterRemoveGroupFromAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromAffinityRule(hcluster, (rulename?.value ?: 0L), hgroup).toUInt()

public actual fun clusterRemoveGroupFromGroupSet(hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSet(hgroup).toUInt()

public actual fun clusterRemoveGroupFromGroupSetEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterRemoveGroupFromGroupSetEx(hgroup, (lpszreason?.value ?: 0L)).toUInt()

public actual fun clusterResourceCloseEnum(hresenum: Hresenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceCloseEnum(hresenum).toUInt()

public actual fun clusterResourceCloseEnumEx(hresourceenumex: Hresenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceCloseEnumEx(hresourceenumex).toUInt()

public actual fun clusterResourceControl(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceControl(hresource, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L)).toUInt()

public actual fun clusterResourceControlAsUser(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceControlAsUser(hresource, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L)).toUInt()

public actual fun clusterResourceControlAsUserEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceControlAsUserEx(hresource, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun clusterResourceControlEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpoutbuffer: COpaquePointer?, cboutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceControlEx(hresource, hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), cboutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun clusterResourceEnum(hresenum: Hresenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceEnum(hresenum, dwindex.toInt(), (lpdwtype?.value ?: 0L), (lpszname?.value ?: 0L), (lpcchname?.value ?: 0L)).toUInt()

public actual fun clusterResourceEnumEx(hresourceenumex: Hresenumex, dwindex: UInt, pitem: COpaquePointer?, cbitem: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceEnumEx(hresourceenumex, dwindex.toInt(), (pitem?.value ?: 0L), (cbitem?.value ?: 0L)).toUInt()

public actual fun clusterResourceGetEnumCount(hresenum: Hresenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCount(hresenum).toUInt()

public actual fun clusterResourceGetEnumCountEx(hresourceenumex: Hresenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceGetEnumCountEx(hresourceenumex).toUInt()

public actual fun clusterResourceOpenEnum(hresource: Hresource, dwtype: UInt): Hresenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceOpenEnum(hresource, dwtype.toInt())

public actual fun clusterResourceOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hresenumex =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceOpenEnumEx(hcluster, (lpszproperties?.value ?: 0L), cbproperties.toInt(), (lpszroproperties?.value ?: 0L), cbroproperties.toInt(), dwflags.toInt())

public actual fun clusterResourceTypeCloseEnum(hrestypeenum: Hrestypeenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceTypeCloseEnum(hrestypeenum).toUInt()

public actual fun clusterResourceTypeControl(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceTypeControl(hcluster, (lpszresourcetypename?.value ?: 0L), hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L)).toUInt()

public actual fun clusterResourceTypeControlAsUser(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUser(hcluster, (lpszresourcetypename?.value ?: 0L), hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L)).toUInt()

public actual fun clusterResourceTypeControlAsUserEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceTypeControlAsUserEx(hcluster, (lpszresourcetypename?.value ?: 0L), hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun clusterResourceTypeControlEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: COpaquePointer?, ninbuffersize: UInt, lpoutbuffer: COpaquePointer?, noutbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceTypeControlEx(hcluster, (lpszresourcetypename?.value ?: 0L), hhostnode, dwcontrolcode.toInt(), (lpinbuffer?.value ?: 0L), ninbuffersize.toInt(), (lpoutbuffer?.value ?: 0L), noutbuffersize.toInt(), (lpbytesreturned?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun clusterResourceTypeEnum(hrestypeenum: Hrestypeenum, dwindex: UInt, lpdwtype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceTypeEnum(hrestypeenum, dwindex.toInt(), (lpdwtype?.value ?: 0L), (lpszname?.value ?: 0L), (lpcchname?.value ?: 0L)).toUInt()

public actual fun clusterResourceTypeGetEnumCount(hrestypeenum: Hrestypeenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceTypeGetEnumCount(hrestypeenum).toUInt()

public actual fun clusterResourceTypeOpenEnum(hcluster: Hcluster, lpszresourcetypename: Pcwstr, dwtype: UInt): Hrestypeenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterResourceTypeOpenEnum(hcluster, (lpszresourcetypename?.value ?: 0L), dwtype.toInt())

public actual fun clusterSetAccountAccess(hcluster: Hcluster, szaccountsid: Pcwstr, dwaccess: UInt, dwcontroltype: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterSetAccountAccess(hcluster, (szaccountsid?.value ?: 0L), dwaccess.toInt(), dwcontroltype.toInt()).toUInt()

public actual fun clusterSharedVolumeSetSnapshotState(guidsnapshotset: Guid, lpszvolumename: Pcwstr, state: ClusterSharedVolumeSnapshotState): UInt =
    0u

public actual fun clusterUpgradeFunctionalLevel(hcluster: Hcluster, perform: Bool, pfnprogresscallback: PclusterUpgradeProgressCallback, pvcallbackarg: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_clusterUpgradeFunctionalLevel(hcluster, perform, 0L, (pvcallbackarg?.value ?: 0L)).toUInt()

public actual fun createCluster(pconfig: COpaquePointer?, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_createCluster((pconfig?.value ?: 0L), 0L, (pvcallbackarg?.value ?: 0L))

public actual fun createClusterAvailabilitySet(hcluster: Hcluster, lpavailabilitysetname: Pcwstr, pavailabilitysetconfig: COpaquePointer?): Hgroupset =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_createClusterAvailabilitySet(hcluster, (lpavailabilitysetname?.value ?: 0L), (pavailabilitysetconfig?.value ?: 0L))

public actual fun createClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_createClusterGroup(hcluster, (lpszgroupname?.value ?: 0L))

public actual fun createClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, pgroupinfo: COpaquePointer?): Hgroup =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_createClusterGroupEx(hcluster, (lpszgroupname?.value ?: 0L), (pgroupinfo?.value ?: 0L))

public actual fun createClusterGroupSet(hcluster: Hcluster, groupsetname: Pcwstr): Hgroupset =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_createClusterGroupSet(hcluster, (groupsetname?.value ?: 0L))

public actual fun createClusterNameAccount(hcluster: Hcluster, pconfig: COpaquePointer?, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_createClusterNameAccount(hcluster, (pconfig?.value ?: 0L), 0L, (pvcallbackarg?.value ?: 0L)).toUInt()

public actual fun createClusterNotifyPort(hchange: Hchange, hcluster: Hcluster, dwfilter: UInt, dwnotifykey: ULong): Hchange =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_createClusterNotifyPort(hchange, hcluster, dwfilter.toInt(), dwnotifykey.toLong())

public actual fun createClusterNotifyPortV2(hchange: Hchange, hcluster: Hcluster, filters: COpaquePointer?, dwfiltercount: UInt, dwnotifykey: ULong): Hchange =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_createClusterNotifyPortV2(hchange, hcluster, (filters?.value ?: 0L), dwfiltercount.toInt(), dwnotifykey.toLong())

public actual fun createClusterResource(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_createClusterResource(hgroup, (lpszresourcename?.value ?: 0L), (lpszresourcetype?.value ?: 0L), dwflags.toInt())

public actual fun createClusterResourceEx(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt, lpszreason: Pcwstr): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_createClusterResourceEx(hgroup, (lpszresourcename?.value ?: 0L), (lpszresourcetype?.value ?: 0L), dwflags.toInt(), (lpszreason?.value ?: 0L))

public actual fun createClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_createClusterResourceType(hcluster, (lpszresourcetypename?.value ?: 0L), (lpszdisplayname?.value ?: 0L), (lpszresourcetypedll?.value ?: 0L), dwlooksalivepollinterval.toInt(), dwisalivepollinterval.toInt()).toUInt()

public actual fun createClusterResourceTypeEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_createClusterResourceTypeEx(hcluster, (lpszresourcetypename?.value ?: 0L), (lpszdisplayname?.value ?: 0L), (lpszresourcetypedll?.value ?: 0L), dwlooksalivepollinterval.toInt(), dwisalivepollinterval.toInt(), (lpszreason?.value ?: 0L)).toUInt()

public actual fun deleteClusterGroup(hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_deleteClusterGroup(hgroup).toUInt()

public actual fun deleteClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_deleteClusterGroupEx(hgroup, (lpszreason?.value ?: 0L)).toUInt()

public actual fun deleteClusterGroupSet(hgroupset: Hgroupset): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_deleteClusterGroupSet(hgroupset).toUInt()

public actual fun deleteClusterGroupSetEx(hgroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_deleteClusterGroupSetEx(hgroupset, (lpszreason?.value ?: 0L)).toUInt()

public actual fun deleteClusterResource(hresource: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_deleteClusterResource(hresource).toUInt()

public actual fun deleteClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_deleteClusterResourceEx(hresource, (lpszreason?.value ?: 0L)).toUInt()

public actual fun deleteClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_deleteClusterResourceType(hcluster, (lpszresourcetypename?.value ?: 0L)).toUInt()

public actual fun deleteClusterResourceTypeEx(hcluster: Hcluster, lpsztypename: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_deleteClusterResourceTypeEx(hcluster, (lpsztypename?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun destroyCluster(hcluster: Hcluster, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: COpaquePointer?, fdeletevirtualcomputerobjects: Bool): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_destroyCluster(hcluster, 0L, (pvcallbackarg?.value ?: 0L), fdeletevirtualcomputerobjects).toUInt()

public actual fun destroyClusterGroup(hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_destroyClusterGroup(hgroup).toUInt()

public actual fun destroyClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_destroyClusterGroupEx(hgroup, (lpszreason?.value ?: 0L)).toUInt()

public actual fun determineCNOResTypeFromCluster(hcluster: Hcluster, pcnorestype: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_determineCNOResTypeFromCluster(hcluster, (pcnorestype?.value ?: 0L)).toUInt()

public actual fun determineCNOResTypeFromNodelist(cnodes: UInt, ppsznodenames: COpaquePointer?, pcnorestype: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_determineCNOResTypeFromNodelist(cnodes.toInt(), (ppsznodenames?.value ?: 0L), (pcnorestype?.value ?: 0L)).toUInt()

public actual fun determineClusterCloudTypeFromCluster(hcluster: Hcluster, pcloudtype: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromCluster(hcluster, (pcloudtype?.value ?: 0L)).toUInt()

public actual fun determineClusterCloudTypeFromNodelist(cnodes: UInt, ppsznodenames: COpaquePointer?, pcloudtype: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_determineClusterCloudTypeFromNodelist(cnodes.toInt(), (ppsznodenames?.value ?: 0L), (pcloudtype?.value ?: 0L)).toUInt()

public actual fun evictClusterNode(hnode: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_evictClusterNode(hnode).toUInt()

public actual fun evictClusterNodeEx(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_evictClusterNodeEx(hnode, dwtimeout.toInt(), (phrcleanupstatus?.value ?: 0L)).toUInt()

public actual fun evictClusterNodeEx2(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: COpaquePointer?, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_evictClusterNodeEx2(hnode, dwtimeout.toInt(), (phrcleanupstatus?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun failClusterResource(hresource: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_failClusterResource(hresource).toUInt()

public actual fun failClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_failClusterResourceEx(hresource, (lpszreason?.value ?: 0L)).toUInt()

public actual fun freeClusterCrypt(pcryptinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_freeClusterCrypt((pcryptinfo?.value ?: 0L)).toUInt()

public actual fun freeClusterHealthFault(clusterhealthfault: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_freeClusterHealthFault((clusterhealthfault?.value ?: 0L)).toUInt()

public actual fun freeClusterHealthFaultArray(clusterhealthfaultarray: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_freeClusterHealthFaultArray((clusterhealthfaultarray?.value ?: 0L)).toUInt()

public actual fun getClusterFromGroup(hgroup: Hgroup): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterFromGroup(hgroup)

public actual fun getClusterFromNetInterface(hnetinterface: Hnetinterface): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterFromNetInterface(hnetinterface)

public actual fun getClusterFromNetwork(hnetwork: Hnetwork): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterFromNetwork(hnetwork)

public actual fun getClusterFromNode(hnode: Hnode): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterFromNode(hnode)

public actual fun getClusterFromResource(hresource: Hresource): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterFromResource(hresource)

public actual fun getClusterGroupKey(hgroup: Hgroup, samdesired: UInt): Hkey =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterGroupKey(hgroup, samdesired.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getClusterGroupState(hgroup: Hgroup, lpsznodename: Pwstr, lpcchnodename: COpaquePointer?): ClusterGroupState =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterGroupState(hgroup, (lpsznodename?.value ?: 0L), (lpcchnodename?.value ?: 0L))

public actual fun getClusterInformation(hcluster: Hcluster, lpszclustername: Pwstr, lpcchclustername: COpaquePointer?, lpclusterinfo: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterInformation(hcluster, (lpszclustername?.value ?: 0L), (lpcchclustername?.value ?: 0L), (lpclusterinfo?.value ?: 0L)).toUInt()

public actual fun getClusterKey(hcluster: Hcluster, samdesired: UInt): Hkey =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterKey(hcluster, samdesired.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getClusterNetInterface(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr, lpszinterfacename: Pwstr, lpcchinterfacename: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterNetInterface(hcluster, (lpsznodename?.value ?: 0L), (lpsznetworkname?.value ?: 0L), (lpszinterfacename?.value ?: 0L), (lpcchinterfacename?.value ?: 0L)).toUInt()

public actual fun getClusterNetInterfaceKey(hnetinterface: Hnetinterface, samdesired: UInt): Hkey =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterNetInterfaceKey(hnetinterface, samdesired.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getClusterNetInterfaceState(hnetinterface: Hnetinterface): ClusterNetinterfaceState =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterNetInterfaceState(hnetinterface)

public actual fun getClusterNetworkId(hnetwork: Hnetwork, lpsznetworkid: Pwstr, lpcchname: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterNetworkId(hnetwork, (lpsznetworkid?.value ?: 0L), (lpcchname?.value ?: 0L)).toUInt()

public actual fun getClusterNetworkKey(hnetwork: Hnetwork, samdesired: UInt): Hkey =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterNetworkKey(hnetwork, samdesired.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getClusterNetworkState(hnetwork: Hnetwork): ClusterNetworkState =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterNetworkState(hnetwork)

public actual fun getClusterNodeId(hnode: Hnode, lpsznodeid: Pwstr, lpcchname: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterNodeId(hnode, (lpsznodeid?.value ?: 0L), (lpcchname?.value ?: 0L)).toUInt()

public actual fun getClusterNodeKey(hnode: Hnode, samdesired: UInt): Hkey =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterNodeKey(hnode, samdesired.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getClusterNodeState(hnode: Hnode): ClusterNodeState =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterNodeState(hnode)

public actual fun getClusterNotify(hchange: Hchange, lpdwnotifykey: COpaquePointer?, lpdwfiltertype: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?, dwmilliseconds: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterNotify(hchange, (lpdwnotifykey?.value ?: 0L), (lpdwfiltertype?.value ?: 0L), (lpszname?.value ?: 0L), (lpcchname?.value ?: 0L), dwmilliseconds.toInt()).toUInt()

public actual fun getClusterNotifyV2(hchange: Hchange, lpdwnotifykey: COpaquePointer?, pfilterandtype: COpaquePointer?, buffer: COpaquePointer?, lpbbuffersize: COpaquePointer?, lpszobjectid: Pwstr, lpcchobjectid: COpaquePointer?, lpszparentid: Pwstr, lpcchparentid: COpaquePointer?, lpszname: Pwstr, lpcchname: COpaquePointer?, lpsztype: Pwstr, lpcchtype: COpaquePointer?, dwmilliseconds: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterNotifyV2(hchange, (lpdwnotifykey?.value ?: 0L), (pfilterandtype?.value ?: 0L), (buffer?.value ?: 0L), (lpbbuffersize?.value ?: 0L), (lpszobjectid?.value ?: 0L), (lpcchobjectid?.value ?: 0L), (lpszparentid?.value ?: 0L), (lpcchparentid?.value ?: 0L), (lpszname?.value ?: 0L), (lpcchname?.value ?: 0L), (lpsztype?.value ?: 0L), (lpcchtype?.value ?: 0L), dwmilliseconds.toInt()).toUInt()

public actual fun getClusterQuorumResource(hcluster: Hcluster, lpszresourcename: Pwstr, lpcchresourcename: COpaquePointer?, lpszdevicename: Pwstr, lpcchdevicename: COpaquePointer?, lpdwmaxquorumlogsize: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterQuorumResource(hcluster, (lpszresourcename?.value ?: 0L), (lpcchresourcename?.value ?: 0L), (lpszdevicename?.value ?: 0L), (lpcchdevicename?.value ?: 0L), (lpdwmaxquorumlogsize?.value ?: 0L)).toUInt()

public actual fun getClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pwstr, lpcchdependencyexpression: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterResourceDependencyExpression(hresource, (lpszdependencyexpression?.value ?: 0L), (lpcchdependencyexpression?.value ?: 0L)).toUInt()

public actual fun getClusterResourceKey(hresource: Hresource, samdesired: UInt): Hkey =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterResourceKey(hresource, samdesired.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getClusterResourceNetworkName(hresource: Hresource, lpbuffer: Pwstr, nsize: COpaquePointer?): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterResourceNetworkName(hresource, (lpbuffer?.value ?: 0L), (nsize?.value ?: 0L))

public actual fun getClusterResourceState(hresource: Hresource, lpsznodename: Pwstr, lpcchnodename: COpaquePointer?, lpszgroupname: Pwstr, lpcchgroupname: COpaquePointer?): ClusterResourceState =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterResourceState(hresource, (lpsznodename?.value ?: 0L), (lpcchnodename?.value ?: 0L), (lpszgroupname?.value ?: 0L), (lpcchgroupname?.value ?: 0L))

public actual fun getClusterResourceTypeKey(hcluster: Hcluster, lpsztypename: Pcwstr, samdesired: UInt): Hkey =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getClusterResourceTypeKey(hcluster, (lpsztypename?.value ?: 0L), samdesired.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getNodeCloudTypeDW(ppsznodename: Pcwstr, nodecloudtype: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getNodeCloudTypeDW((ppsznodename?.value ?: 0L), (nodecloudtype?.value ?: 0L)).toUInt()

public actual fun getNodeClusterState(lpsznodename: Pcwstr, pdwclusterstate: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getNodeClusterState((lpsznodename?.value ?: 0L), (pdwclusterstate?.value ?: 0L)).toUInt()

public actual fun getNotifyEventHandle(hchange: Hchange, lphtargetevent: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_getNotifyEventHandle(hchange, (lphtargetevent?.value ?: 0L)).toUInt()

public actual fun initializeClusterHealthFault(clusterhealthfault: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_initializeClusterHealthFault((clusterhealthfault?.value ?: 0L)).toUInt()

public actual fun initializeClusterHealthFaultArray(clusterhealthfaultarray: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_initializeClusterHealthFaultArray((clusterhealthfaultarray?.value ?: 0L)).toUInt()

public actual fun isFileOnClusterSharedVolume(lpszpathname: Pcwstr, pbfileisonsharedvolume: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_isFileOnClusterSharedVolume((lpszpathname?.value ?: 0L), (pbfileisonsharedvolume?.value ?: 0L)).toUInt()

public actual fun moveClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_moveClusterGroup(hgroup, hdestinationnode).toUInt()

public actual fun moveClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_moveClusterGroupEx(hgroup, hdestinationnode, dwmoveflags.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt()).toUInt()

public actual fun moveClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_moveClusterGroupEx2(hgroup, hdestinationnode, dwmoveflags.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt(), (lpszreason?.value ?: 0L)).toUInt()

public actual fun offlineClusterGroup(hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_offlineClusterGroup(hgroup).toUInt()

public actual fun offlineClusterGroupEx(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_offlineClusterGroupEx(hgroup, dwofflineflags.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt()).toUInt()

public actual fun offlineClusterGroupEx2(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_offlineClusterGroupEx2(hgroup, dwofflineflags.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt(), (lpszreason?.value ?: 0L)).toUInt()

public actual fun offlineClusterResource(hresource: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_offlineClusterResource(hresource).toUInt()

public actual fun offlineClusterResourceEx(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_offlineClusterResourceEx(hresource, dwofflineflags.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt()).toUInt()

public actual fun offlineClusterResourceEx2(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_offlineClusterResourceEx2(hresource, dwofflineflags.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt(), (lpszreason?.value ?: 0L)).toUInt()

public actual fun onlineClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_onlineClusterGroup(hgroup, hdestinationnode).toUInt()

public actual fun onlineClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_onlineClusterGroupEx(hgroup, hdestinationnode, dwonlineflags.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt()).toUInt()

public actual fun onlineClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_onlineClusterGroupEx2(hgroup, hdestinationnode, dwonlineflags.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt(), (lpszreason?.value ?: 0L)).toUInt()

public actual fun onlineClusterResource(hresource: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_onlineClusterResource(hresource).toUInt()

public actual fun onlineClusterResourceEx(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_onlineClusterResourceEx(hresource, dwonlineflags.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt()).toUInt()

public actual fun onlineClusterResourceEx2(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: COpaquePointer?, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_onlineClusterResourceEx2(hresource, dwonlineflags.toInt(), (lpinbuffer?.value ?: 0L), cbinbuffersize.toInt(), (lpszreason?.value ?: 0L)).toUInt()

public actual fun openCluster(lpszclustername: Pcwstr): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openCluster((lpszclustername?.value ?: 0L))

public actual fun openClusterCryptProvider(lpszresource: Pcwstr, lpszprovider: COpaquePointer?, dwtype: UInt, dwflags: UInt): Hcluscryptprovider =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openClusterCryptProvider((lpszresource?.value ?: 0L), (lpszprovider?.value ?: 0L), dwtype.toInt(), dwflags.toInt())

public actual fun openClusterCryptProviderEx(lpszresource: Pcwstr, lpszkeyname: Pcwstr, lpszprovider: COpaquePointer?, dwtype: UInt, dwflags: UInt): Hcluscryptprovider =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openClusterCryptProviderEx((lpszresource?.value ?: 0L), (lpszkeyname?.value ?: 0L), (lpszprovider?.value ?: 0L), dwtype.toInt(), dwflags.toInt())

public actual fun openClusterEx(lpszclustername: Pcwstr, desiredaccess: UInt, grantedaccess: COpaquePointer?): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openClusterEx((lpszclustername?.value ?: 0L), desiredaccess.toInt(), (grantedaccess?.value ?: 0L))

public actual fun openClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openClusterGroup(hcluster, (lpszgroupname?.value ?: 0L))

public actual fun openClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: COpaquePointer?): Hgroup =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openClusterGroupEx(hcluster, (lpszgroupname?.value ?: 0L), dwdesiredaccess.toInt(), (lpdwgrantedaccess?.value ?: 0L))

public actual fun openClusterGroupSet(hcluster: Hcluster, lpszgroupsetname: Pcwstr): Hgroupset =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openClusterGroupSet(hcluster, (lpszgroupsetname?.value ?: 0L))

public actual fun openClusterNetInterface(hcluster: Hcluster, lpszinterfacename: Pcwstr): Hnetinterface =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openClusterNetInterface(hcluster, (lpszinterfacename?.value ?: 0L))

public actual fun openClusterNetInterfaceEx(hcluster: Hcluster, lpszinterfacename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: COpaquePointer?): Hnetinterface =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openClusterNetInterfaceEx(hcluster, (lpszinterfacename?.value ?: 0L), dwdesiredaccess.toInt(), (lpdwgrantedaccess?.value ?: 0L))

public actual fun openClusterNetwork(hcluster: Hcluster, lpsznetworkname: Pcwstr): Hnetwork =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openClusterNetwork(hcluster, (lpsznetworkname?.value ?: 0L))

public actual fun openClusterNetworkEx(hcluster: Hcluster, lpsznetworkname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: COpaquePointer?): Hnetwork =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openClusterNetworkEx(hcluster, (lpsznetworkname?.value ?: 0L), dwdesiredaccess.toInt(), (lpdwgrantedaccess?.value ?: 0L))

public actual fun openClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr): Hnode =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openClusterNode(hcluster, (lpsznodename?.value ?: 0L))

public actual fun openClusterNodeById(hcluster: Hcluster, nodeid: UInt): Hnode =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openClusterNodeById(hcluster, nodeid.toInt())

public actual fun openClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: COpaquePointer?): Hnode =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openClusterNodeEx(hcluster, (lpsznodename?.value ?: 0L), dwdesiredaccess.toInt(), (lpdwgrantedaccess?.value ?: 0L))

public actual fun openClusterResource(hcluster: Hcluster, lpszresourcename: Pcwstr): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openClusterResource(hcluster, (lpszresourcename?.value ?: 0L))

public actual fun openClusterResourceEx(hcluster: Hcluster, lpszresourcename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: COpaquePointer?): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_openClusterResourceEx(hcluster, (lpszresourcename?.value ?: 0L), dwdesiredaccess.toInt(), (lpdwgrantedaccess?.value ?: 0L))

public actual fun pauseClusterNode(hnode: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_pauseClusterNode(hnode).toUInt()

public actual fun pauseClusterNodeEx(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_pauseClusterNodeEx(hnode, bdrainnode, dwpauseflags.toInt(), hnodedraintarget).toUInt()

public actual fun pauseClusterNodeEx2(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_pauseClusterNodeEx2(hnode, bdrainnode, dwpauseflags.toInt(), hnodedraintarget, (lpszreason?.value ?: 0L)).toUInt()

public actual fun queryAppInstanceVersion(appinstanceid: COpaquePointer?, instanceversionhigh: COpaquePointer?, instanceversionlow: COpaquePointer?, versionstatus: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_queryAppInstanceVersion((appinstanceid?.value ?: 0L), (instanceversionhigh?.value ?: 0L), (instanceversionlow?.value ?: 0L), (versionstatus?.value ?: 0L)).toUInt()

public actual fun registerAppInstance(processhandle: Handle, appinstanceid: COpaquePointer?, childreninheritappinstance: Bool): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_registerAppInstance((processhandle?.value ?: 0L), (appinstanceid?.value ?: 0L), childreninheritappinstance).toUInt()

public actual fun registerAppInstanceVersion(appinstanceid: COpaquePointer?, instanceversionhigh: ULong, instanceversionlow: ULong): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_registerAppInstanceVersion((appinstanceid?.value ?: 0L), instanceversionhigh.toLong(), instanceversionlow.toLong()).toUInt()

public actual fun registerClusterNotify(hchange: Hchange, dwfiltertype: UInt, hobject: Handle, dwnotifykey: ULong): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_registerClusterNotify(hchange, dwfiltertype.toInt(), (hobject?.value ?: 0L), dwnotifykey.toLong()).toUInt()

public actual fun registerClusterNotifyV2(hchange: Hchange, filter: NotifyFilterAndType, hobject: Handle, dwnotifykey: ULong): UInt =
    0u

public actual fun registerClusterResourceTypeNotifyV2(hchange: Hchange, hcluster: Hcluster, flags: Long, restypename: Pcwstr, dwnotifykey: ULong): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_registerClusterResourceTypeNotifyV2(hchange, hcluster, flags, (restypename?.value ?: 0L), dwnotifykey.toLong()).toUInt()

public actual fun removeClusterGroupDependency(hgroup: Hgroup, hdependson: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_removeClusterGroupDependency(hgroup, hdependson).toUInt()

public actual fun removeClusterGroupDependencyEx(hgroup: Hgroup, hdependson: Hgroup, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_removeClusterGroupDependencyEx(hgroup, hdependson, (lpszreason?.value ?: 0L)).toUInt()

public actual fun removeClusterGroupSetDependency(hgroupset: Hgroupset, hdependson: Hgroupset): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependency(hgroupset, hdependson).toUInt()

public actual fun removeClusterGroupSetDependencyEx(hgroupset: Hgroupset, hdependson: Hgroupset, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_removeClusterGroupSetDependencyEx(hgroupset, hdependson, (lpszreason?.value ?: 0L)).toUInt()

public actual fun removeClusterGroupToGroupSetDependency(hgroup: Hgroup, hdependson: Hgroupset): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependency(hgroup, hdependson).toUInt()

public actual fun removeClusterGroupToGroupSetDependencyEx(hgroup: Hgroup, hdependson: Hgroupset, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_removeClusterGroupToGroupSetDependencyEx(hgroup, hdependson, (lpszreason?.value ?: 0L)).toUInt()

public actual fun removeClusterNameAccount(hcluster: Hcluster, bdeletecomputerobjects: Bool): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_removeClusterNameAccount(hcluster, bdeletecomputerobjects).toUInt()

public actual fun removeClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_removeClusterResourceDependency(hresource, hdependson).toUInt()

public actual fun removeClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_removeClusterResourceDependencyEx(hresource, hdependson, (lpszreason?.value ?: 0L)).toUInt()

public actual fun removeClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_removeClusterResourceNode(hresource, hnode).toUInt()

public actual fun removeClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_removeClusterResourceNodeEx(hresource, hnode, (lpszreason?.value ?: 0L)).toUInt()

public actual fun removeClusterStorageNode(hcluster: Hcluster, lpszclusterstorageenclosurename: Pcwstr, dwtimeout: UInt, dwflags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_removeClusterStorageNode(hcluster, (lpszclusterstorageenclosurename?.value ?: 0L), dwtimeout.toInt(), dwflags.toInt()).toUInt()

public actual fun removeCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_removeCrossClusterGroupSetDependency(hdependentgroupset, (lpremoteclustername?.value ?: 0L), (lpremotegroupsetname?.value ?: 0L)).toUInt()

public actual fun removeResourceFromClusterSharedVolumes(hresource: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_removeResourceFromClusterSharedVolumes(hresource).toUInt()

public actual fun resUtilAddUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, poutpropertylist: COpaquePointer?, pcboutpropertylistsize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilAddUnknownProperties((hkeyclusterkey?.value ?: 0L), (ppropertytable?.value ?: 0L), (poutpropertylist?.value ?: 0L), pcboutpropertylistsize.toInt(), (pcbbytesreturned?.value ?: 0L), (pcbrequired?.value ?: 0L)).toUInt()

public actual fun resUtilCreateDirectoryTree(pszpath: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilCreateDirectoryTree((pszpath?.value ?: 0L)).toUInt()

public actual fun resUtilDupGroup(group: Hgroup, copy: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilDupGroup(group, (copy?.value ?: 0L)).toUInt()

public actual fun resUtilDupParameterBlock(poutparams: COpaquePointer?, pinparams: COpaquePointer?, ppropertytable: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilDupParameterBlock((poutparams?.value ?: 0L), (pinparams?.value ?: 0L), (ppropertytable?.value ?: 0L)).toUInt()

public actual fun resUtilDupResource(group: Hresource, copy: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilDupResource(group, (copy?.value ?: 0L)).toUInt()

public actual fun resUtilDupString(pszinstring: Pcwstr): Pwstr =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilDupString((pszinstring?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun resUtilEnumGroups(hcluster: Hcluster, hself: Hgroup, prescallback: LpgroupCallbackEx, pparameter: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilEnumGroups(hcluster, hself, 0L, (pparameter?.value ?: 0L)).toUInt()

public actual fun resUtilEnumGroupsEx(hcluster: Hcluster, hself: Hgroup, grouptype: ClusgroupType, prescallback: LpgroupCallbackEx, pparameter: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilEnumGroupsEx(hcluster, hself, grouptype, 0L, (pparameter?.value ?: 0L)).toUInt()

public actual fun resUtilEnumPrivateProperties(hkeyclusterkey: Hkey, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilEnumPrivateProperties((hkeyclusterkey?.value ?: 0L), (pszoutproperties?.value ?: 0L), cboutpropertiessize.toInt(), (pcbbytesreturned?.value ?: 0L), (pcbrequired?.value ?: 0L)).toUInt()

public actual fun resUtilEnumProperties(ppropertytable: COpaquePointer?, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilEnumProperties((ppropertytable?.value ?: 0L), (pszoutproperties?.value ?: 0L), cboutpropertiessize.toInt(), (pcbbytesreturned?.value ?: 0L), (pcbrequired?.value ?: 0L)).toUInt()

public actual fun resUtilEnumResources(hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallback, pparameter: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilEnumResources(hself, (lpszrestypename?.value ?: 0L), 0L, (pparameter?.value ?: 0L)).toUInt()

public actual fun resUtilEnumResourcesEx(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx(hcluster, hself, (lpszrestypename?.value ?: 0L), 0L, (pparameter?.value ?: 0L)).toUInt()

public actual fun resUtilEnumResourcesEx2(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: COpaquePointer?, dwdesiredaccess: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilEnumResourcesEx2(hcluster, hself, (lpszrestypename?.value ?: 0L), 0L, (pparameter?.value ?: 0L), dwdesiredaccess.toInt()).toUInt()

public actual fun resUtilExpandEnvironmentStrings(pszsrc: Pcwstr): Pwstr =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilExpandEnvironmentStrings((pszsrc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun resUtilFindBinaryProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pbpropertyvalue: COpaquePointer?, pcbpropertyvaluesize: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilFindBinaryProperty((ppropertylist?.value ?: 0L), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L), (pbpropertyvalue?.value ?: 0L), (pcbpropertyvaluesize?.value ?: 0L)).toUInt()

public actual fun resUtilFindDependentDiskResourceDriveLetter(hcluster: Hcluster, hresource: Hresource, pszdriveletter: Pwstr, pcchdriveletter: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilFindDependentDiskResourceDriveLetter(hcluster, hresource, (pszdriveletter?.value ?: 0L), (pcchdriveletter?.value ?: 0L)).toUInt()

public actual fun resUtilFindDwordProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pdwpropertyvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilFindDwordProperty((ppropertylist?.value ?: 0L), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L), (pdwpropertyvalue?.value ?: 0L)).toUInt()

public actual fun resUtilFindExpandSzProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilFindExpandSzProperty((ppropertylist?.value ?: 0L), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L), (pszpropertyvalue?.value ?: 0L)).toUInt()

public actual fun resUtilFindExpandedSzProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilFindExpandedSzProperty((ppropertylist?.value ?: 0L), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L), (pszpropertyvalue?.value ?: 0L)).toUInt()

public actual fun resUtilFindFileTimeProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pftpropertyvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilFindFileTimeProperty((ppropertylist?.value ?: 0L), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L), (pftpropertyvalue?.value ?: 0L)).toUInt()

public actual fun resUtilFindLongProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilFindLongProperty((ppropertylist?.value ?: 0L), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L), (plpropertyvalue?.value ?: 0L)).toUInt()

public actual fun resUtilFindMultiSzProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: COpaquePointer?, pcbpropertyvaluesize: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilFindMultiSzProperty((ppropertylist?.value ?: 0L), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L), (pszpropertyvalue?.value ?: 0L), (pcbpropertyvaluesize?.value ?: 0L)).toUInt()

public actual fun resUtilFindSzProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilFindSzProperty((ppropertylist?.value ?: 0L), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L), (pszpropertyvalue?.value ?: 0L)).toUInt()

public actual fun resUtilFindULargeIntegerProperty(ppropertylist: COpaquePointer?, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilFindULargeIntegerProperty((ppropertylist?.value ?: 0L), cbpropertylistsize.toInt(), (pszpropertyname?.value ?: 0L), (plpropertyvalue?.value ?: 0L)).toUInt()

public actual fun resUtilFreeEnvironment(lpenvironment: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilFreeEnvironment((lpenvironment?.value ?: 0L)).toUInt()

public actual fun resUtilFreeParameterBlock(poutparams: COpaquePointer?, pinparams: COpaquePointer?, ppropertytable: COpaquePointer?) {
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilFreeParameterBlock((poutparams?.value ?: 0L), (pinparams?.value ?: 0L), (ppropertytable?.value ?: 0L))
}

public actual fun resUtilGetAllProperties(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, poutpropertylist: COpaquePointer?, cboutpropertylistsize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetAllProperties((hkeyclusterkey?.value ?: 0L), (ppropertytable?.value ?: 0L), (poutpropertylist?.value ?: 0L), cboutpropertylistsize.toInt(), (pcbbytesreturned?.value ?: 0L), (pcbrequired?.value ?: 0L)).toUInt()

public actual fun resUtilGetBinaryProperty(ppboutvalue: COpaquePointer?, pcboutvaluesize: COpaquePointer?, pvaluestruct: COpaquePointer?, pboldvalue: COpaquePointer?, cboldvaluesize: UInt, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetBinaryProperty((ppboutvalue?.value ?: 0L), (pcboutvaluesize?.value ?: 0L), (pvaluestruct?.value ?: 0L), (pboldvalue?.value ?: 0L), cboldvaluesize.toInt(), (pppropertylist?.value ?: 0L), (pcbpropertylistsize?.value ?: 0L)).toUInt()

public actual fun resUtilGetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, ppboutvalue: COpaquePointer?, pcboutvaluesize: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetBinaryValue((hkeyclusterkey?.value ?: 0L), (pszvaluename?.value ?: 0L), (ppboutvalue?.value ?: 0L), (pcboutvaluesize?.value ?: 0L)).toUInt()

public actual fun resUtilGetClusterGroupType(hgroup: Hgroup, grouptype: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetClusterGroupType(hgroup, (grouptype?.value ?: 0L)).toUInt()

public actual fun resUtilGetClusterId(hcluster: Hcluster, guid: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetClusterId(hcluster, (guid?.value ?: 0L)).toUInt()

public actual fun resUtilGetClusterRoleState(hcluster: Hcluster, eclusterrole: ClusterRole): ClusterRoleState =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetClusterRoleState(hcluster, eclusterrole)

public actual fun resUtilGetCoreClusterResources(hcluster: Hcluster, phclusternameresource: COpaquePointer?, phclusteripaddressresource: COpaquePointer?, phclusterquorumresource: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResources(hcluster, (phclusternameresource?.value ?: 0L), (phclusteripaddressresource?.value ?: 0L), (phclusterquorumresource?.value ?: 0L)).toUInt()

public actual fun resUtilGetCoreClusterResourcesEx(hclusterin: Hcluster, phclusternameresourceout: COpaquePointer?, phclusterquorumresourceout: COpaquePointer?, dwdesiredaccess: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetCoreClusterResourcesEx(hclusterin, (phclusternameresourceout?.value ?: 0L), (phclusterquorumresourceout?.value ?: 0L), dwdesiredaccess.toInt()).toUInt()

public actual fun resUtilGetCoreGroup(hcluster: Hcluster): Hgroup =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetCoreGroup(hcluster)

public actual fun resUtilGetDwordProperty(pdwoutvalue: COpaquePointer?, pvaluestruct: COpaquePointer?, dwoldvalue: UInt, dwminimum: UInt, dwmaximum: UInt, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetDwordProperty((pdwoutvalue?.value ?: 0L), (pvaluestruct?.value ?: 0L), dwoldvalue.toInt(), dwminimum.toInt(), dwmaximum.toInt(), (pppropertylist?.value ?: 0L), (pcbpropertylistsize?.value ?: 0L)).toUInt()

public actual fun resUtilGetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pdwoutvalue: COpaquePointer?, dwdefaultvalue: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetDwordValue((hkeyclusterkey?.value ?: 0L), (pszvaluename?.value ?: 0L), (pdwoutvalue?.value ?: 0L), dwdefaultvalue.toInt()).toUInt()

public actual fun resUtilGetEnvironmentWithNetName(hresource: Hresource): COpaquePointer? =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetEnvironmentWithNetName(hresource).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun resUtilGetFileTimeProperty(pftoutvalue: COpaquePointer?, pvaluestruct: COpaquePointer?, ftoldvalue: Filetime, ftminimum: Filetime, ftmaximum: Filetime, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    0u

public actual fun resUtilGetLongProperty(ploutvalue: COpaquePointer?, pvaluestruct: COpaquePointer?, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetLongProperty((ploutvalue?.value ?: 0L), (pvaluestruct?.value ?: 0L), loldvalue, lminimum, lmaximum, (pppropertylist?.value ?: 0L), (pcbpropertylistsize?.value ?: 0L)).toUInt()

public actual fun resUtilGetMultiSzProperty(ppszoutvalue: COpaquePointer?, pcboutvaluesize: COpaquePointer?, pvaluestruct: COpaquePointer?, pszoldvalue: Pcwstr, cboldvaluesize: UInt, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetMultiSzProperty((ppszoutvalue?.value ?: 0L), (pcboutvaluesize?.value ?: 0L), (pvaluestruct?.value ?: 0L), (pszoldvalue?.value ?: 0L), cboldvaluesize.toInt(), (pppropertylist?.value ?: 0L), (pcbpropertylistsize?.value ?: 0L)).toUInt()

public actual fun resUtilGetPrivateProperties(hkeyclusterkey: Hkey, poutpropertylist: COpaquePointer?, cboutpropertylistsize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetPrivateProperties((hkeyclusterkey?.value ?: 0L), (poutpropertylist?.value ?: 0L), cboutpropertylistsize.toInt(), (pcbbytesreturned?.value ?: 0L), (pcbrequired?.value ?: 0L)).toUInt()

public actual fun resUtilGetProperties(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, poutpropertylist: COpaquePointer?, cboutpropertylistsize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetProperties((hkeyclusterkey?.value ?: 0L), (ppropertytable?.value ?: 0L), (poutpropertylist?.value ?: 0L), cboutpropertylistsize.toInt(), (pcbbytesreturned?.value ?: 0L), (pcbrequired?.value ?: 0L)).toUInt()

public actual fun resUtilGetPropertiesToParameterBlock(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, poutparams: COpaquePointer?, bcheckforrequiredproperties: Bool, psznameofpropinerror: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetPropertiesToParameterBlock((hkeyclusterkey?.value ?: 0L), (ppropertytable?.value ?: 0L), (poutparams?.value ?: 0L), bcheckforrequiredproperties, (psznameofpropinerror?.value ?: 0L)).toUInt()

public actual fun resUtilGetProperty(hkeyclusterkey: Hkey, ppropertytableitem: COpaquePointer?, poutpropertyitem: COpaquePointer?, pcboutpropertyitemsize: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetProperty((hkeyclusterkey?.value ?: 0L), (ppropertytableitem?.value ?: 0L), (poutpropertyitem?.value ?: 0L), (pcboutpropertyitemsize?.value ?: 0L)).toUInt()

public actual fun resUtilGetPropertyFormats(ppropertytable: COpaquePointer?, poutpropertyformatlist: COpaquePointer?, cbpropertyformatlistsize: UInt, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetPropertyFormats((ppropertytable?.value ?: 0L), (poutpropertyformatlist?.value ?: 0L), cbpropertyformatlistsize.toInt(), (pcbbytesreturned?.value ?: 0L), (pcbrequired?.value ?: 0L)).toUInt()

public actual fun resUtilGetPropertySize(hkeyclusterkey: Hkey, ppropertytableitem: COpaquePointer?, pcboutpropertylistsize: COpaquePointer?, pnpropertycount: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetPropertySize((hkeyclusterkey?.value ?: 0L), (ppropertytableitem?.value ?: 0L), (pcboutpropertylistsize?.value ?: 0L), (pnpropertycount?.value ?: 0L)).toUInt()

public actual fun resUtilGetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pqwoutvalue: COpaquePointer?, qwdefaultvalue: ULong): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetQwordValue((hkeyclusterkey?.value ?: 0L), (pszvaluename?.value ?: 0L), (pqwoutvalue?.value ?: 0L), qwdefaultvalue.toLong()).toUInt()

public actual fun resUtilGetResourceDependency(hself: Handle, lpszresourcetype: Pcwstr): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependency((hself?.value ?: 0L), (lpszresourcetype?.value ?: 0L))

public actual fun resUtilGetResourceDependencyByClass(hcluster: Hcluster, hself: Handle, prci: COpaquePointer?, brecurse: Bool): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClass(hcluster, (hself?.value ?: 0L), (prci?.value ?: 0L), brecurse)

public actual fun resUtilGetResourceDependencyByClassEx(hcluster: Hcluster, hself: Handle, prci: COpaquePointer?, brecurse: Bool, dwdesiredaccess: UInt): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByClassEx(hcluster, (hself?.value ?: 0L), (prci?.value ?: 0L), brecurse, dwdesiredaccess.toInt())

public actual fun resUtilGetResourceDependencyByName(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByName(hcluster, (hself?.value ?: 0L), (lpszresourcetype?.value ?: 0L), brecurse)

public actual fun resUtilGetResourceDependencyByNameEx(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool, dwdesiredaccess: UInt): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyByNameEx(hcluster, (hself?.value ?: 0L), (lpszresourcetype?.value ?: 0L), brecurse, dwdesiredaccess.toInt())

public actual fun resUtilGetResourceDependencyEx(hself: Handle, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependencyEx((hself?.value ?: 0L), (lpszresourcetype?.value ?: 0L), dwdesiredaccess.toInt())

public actual fun resUtilGetResourceDependentIPAddressProps(hresource: Hresource, pszaddress: Pwstr, pcchaddress: COpaquePointer?, pszsubnetmask: Pwstr, pcchsubnetmask: COpaquePointer?, psznetwork: Pwstr, pcchnetwork: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetResourceDependentIPAddressProps(hresource, (pszaddress?.value ?: 0L), (pcchaddress?.value ?: 0L), (pszsubnetmask?.value ?: 0L), (pcchsubnetmask?.value ?: 0L), (psznetwork?.value ?: 0L), (pcchnetwork?.value ?: 0L)).toUInt()

public actual fun resUtilGetResourceName(hresource: Hresource, pszresourcename: Pwstr, pcchresourcenameinout: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetResourceName(hresource, (pszresourcename?.value ?: 0L), (pcchresourcenameinout?.value ?: 0L)).toUInt()

public actual fun resUtilGetResourceNameDependency(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependency((lpszresourcename?.value ?: 0L), (lpszresourcetype?.value ?: 0L))

public actual fun resUtilGetResourceNameDependencyEx(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetResourceNameDependencyEx((lpszresourcename?.value ?: 0L), (lpszresourcetype?.value ?: 0L), dwdesiredaccess.toInt())

public actual fun resUtilGetSzProperty(ppszoutvalue: COpaquePointer?, pvaluestruct: COpaquePointer?, pszoldvalue: Pcwstr, pppropertylist: COpaquePointer?, pcbpropertylistsize: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetSzProperty((ppszoutvalue?.value ?: 0L), (pvaluestruct?.value ?: 0L), (pszoldvalue?.value ?: 0L), (pppropertylist?.value ?: 0L), (pcbpropertylistsize?.value ?: 0L)).toUInt()

public actual fun resUtilGetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr): Pwstr =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGetSzValue((hkeyclusterkey?.value ?: 0L), (pszvaluename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun resUtilGroupsEqual(hself: Hgroup, hgroup: Hgroup, pequal: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilGroupsEqual(hself, hgroup, (pequal?.value ?: 0L)).toUInt()

public actual fun resUtilIsPathValid(pszpath: Pcwstr): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilIsPathValid((pszpath?.value ?: 0L))

public actual fun resUtilIsResourceClassEqual(prci: COpaquePointer?, hresource: Hresource): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilIsResourceClassEqual((prci?.value ?: 0L), hresource)

public actual fun resUtilLeftPaxosIsLessThanRight(left: COpaquePointer?, right: COpaquePointer?): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilLeftPaxosIsLessThanRight((left?.value ?: 0L), (right?.value ?: 0L))

public actual fun resUtilNodeEnum(hcluster: Hcluster, pnodecallback: LpnodeCallback, pparameter: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilNodeEnum(hcluster, 0L, (pparameter?.value ?: 0L)).toUInt()

public actual fun resUtilPaxosComparer(left: COpaquePointer?, right: COpaquePointer?): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilPaxosComparer((left?.value ?: 0L), (right?.value ?: 0L))

public actual fun resUtilPropertyListFromParameterBlock(ppropertytable: COpaquePointer?, poutpropertylist: COpaquePointer?, pcboutpropertylistsize: COpaquePointer?, pinparams: COpaquePointer?, pcbbytesreturned: COpaquePointer?, pcbrequired: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilPropertyListFromParameterBlock((ppropertytable?.value ?: 0L), (poutpropertylist?.value ?: 0L), (pcboutpropertylistsize?.value ?: 0L), (pinparams?.value ?: 0L), (pcbbytesreturned?.value ?: 0L), (pcbrequired?.value ?: 0L)).toUInt()

public actual fun resUtilRemoveResourceServiceEnvironment(pszservicename: Pcwstr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilRemoveResourceServiceEnvironment((pszservicename?.value ?: 0L), 0L, hresourcehandle).toUInt()

public actual fun resUtilResourceDepEnum(hself: Hresource, enumtype: UInt, prescallback: LpresourceCallbackEx, pparameter: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilResourceDepEnum(hself, enumtype.toInt(), 0L, (pparameter?.value ?: 0L)).toUInt()

public actual fun resUtilResourceTypesEqual(lpszresourcetypename: Pcwstr, hresource: Hresource): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilResourceTypesEqual((lpszresourcetypename?.value ?: 0L), hresource)

public actual fun resUtilResourcesEqual(hself: Hresource, hresource: Hresource): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilResourcesEqual(hself, hresource)

public actual fun resUtilSetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pbnewvalue: COpaquePointer?, cbnewvaluesize: UInt, ppboutvalue: COpaquePointer?, pcboutvaluesize: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetBinaryValue((hkeyclusterkey?.value ?: 0L), (pszvaluename?.value ?: 0L), (pbnewvalue?.value ?: 0L), cbnewvaluesize.toInt(), (ppboutvalue?.value ?: 0L), (pcboutvaluesize?.value ?: 0L)).toUInt()

public actual fun resUtilSetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, dwnewvalue: UInt, pdwoutvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetDwordValue((hkeyclusterkey?.value ?: 0L), (pszvaluename?.value ?: 0L), dwnewvalue.toInt(), (pdwoutvalue?.value ?: 0L)).toUInt()

public actual fun resUtilSetExpandSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetExpandSzValue((hkeyclusterkey?.value ?: 0L), (pszvaluename?.value ?: 0L), (psznewvalue?.value ?: 0L), (ppszoutstring?.value ?: 0L)).toUInt()

public actual fun resUtilSetMultiSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, cbnewvaluesize: UInt, ppszoutvalue: COpaquePointer?, pcboutvaluesize: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetMultiSzValue((hkeyclusterkey?.value ?: 0L), (pszvaluename?.value ?: 0L), (psznewvalue?.value ?: 0L), cbnewvaluesize.toInt(), (ppszoutvalue?.value ?: 0L), (pcboutvaluesize?.value ?: 0L)).toUInt()

public actual fun resUtilSetPrivatePropertyList(hkeyclusterkey: Hkey, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetPrivatePropertyList((hkeyclusterkey?.value ?: 0L), (pinpropertylist?.value ?: 0L), cbinpropertylistsize.toInt()).toUInt()

public actual fun resUtilSetPropertyParameterBlock(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, reserved: COpaquePointer?, pinparams: COpaquePointer?, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt, poutparams: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlock((hkeyclusterkey?.value ?: 0L), (ppropertytable?.value ?: 0L), (reserved?.value ?: 0L), (pinparams?.value ?: 0L), (pinpropertylist?.value ?: 0L), cbinpropertylistsize.toInt(), (poutparams?.value ?: 0L)).toUInt()

public actual fun resUtilSetPropertyParameterBlockEx(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, reserved: COpaquePointer?, pinparams: COpaquePointer?, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetPropertyParameterBlockEx((hkeyclusterkey?.value ?: 0L), (ppropertytable?.value ?: 0L), (reserved?.value ?: 0L), (pinparams?.value ?: 0L), (pinpropertylist?.value ?: 0L), cbinpropertylistsize.toInt(), bforcewrite, (poutparams?.value ?: 0L)).toUInt()

public actual fun resUtilSetPropertyTable(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, reserved: COpaquePointer?, ballowunknownproperties: Bool, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt, poutparams: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetPropertyTable((hkeyclusterkey?.value ?: 0L), (ppropertytable?.value ?: 0L), (reserved?.value ?: 0L), ballowunknownproperties, (pinpropertylist?.value ?: 0L), cbinpropertylistsize.toInt(), (poutparams?.value ?: 0L)).toUInt()

public actual fun resUtilSetPropertyTableEx(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, reserved: COpaquePointer?, ballowunknownproperties: Bool, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetPropertyTableEx((hkeyclusterkey?.value ?: 0L), (ppropertytable?.value ?: 0L), (reserved?.value ?: 0L), ballowunknownproperties, (pinpropertylist?.value ?: 0L), cbinpropertylistsize.toInt(), bforcewrite, (poutparams?.value ?: 0L)).toUInt()

public actual fun resUtilSetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, qwnewvalue: ULong, pqwoutvalue: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetQwordValue((hkeyclusterkey?.value ?: 0L), (pszvaluename?.value ?: 0L), qwnewvalue.toLong(), (pqwoutvalue?.value ?: 0L)).toUInt()

public actual fun resUtilSetResourceServiceEnvironment(pszservicename: Pcwstr, hresource: Hresource, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceEnvironment((pszservicename?.value ?: 0L), hresource, 0L, hresourcehandle).toUInt()

public actual fun resUtilSetResourceServiceStartParameters(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: COpaquePointer?, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParameters((pszservicename?.value ?: 0L), (schscmhandle?.value ?: 0L), (phservice?.value ?: 0L), 0L, hresourcehandle).toUInt()

public actual fun resUtilSetResourceServiceStartParametersEx(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: COpaquePointer?, dwdesiredaccess: UInt, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetResourceServiceStartParametersEx((pszservicename?.value ?: 0L), (schscmhandle?.value ?: 0L), (phservice?.value ?: 0L), dwdesiredaccess.toInt(), 0L, hresourcehandle).toUInt()

public actual fun resUtilSetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetSzValue((hkeyclusterkey?.value ?: 0L), (pszvaluename?.value ?: 0L), (psznewvalue?.value ?: 0L), (ppszoutstring?.value ?: 0L)).toUInt()

public actual fun resUtilSetUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: COpaquePointer?, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetUnknownProperties((hkeyclusterkey?.value ?: 0L), (ppropertytable?.value ?: 0L), (pinpropertylist?.value ?: 0L), cbinpropertylistsize.toInt()).toUInt()

public actual fun resUtilSetValueEx(hkeyclusterkey: Hkey, valuename: Pcwstr, valuetype: UInt, valuedata: COpaquePointer?, valuesize: UInt, flags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilSetValueEx((hkeyclusterkey?.value ?: 0L), (valuename?.value ?: 0L), valuetype.toInt(), (valuedata?.value ?: 0L), valuesize.toInt(), flags.toInt()).toUInt()

public actual fun resUtilStartResourceService(pszservicename: Pcwstr, phservicehandle: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilStartResourceService((pszservicename?.value ?: 0L), (phservicehandle?.value ?: 0L)).toUInt()

public actual fun resUtilStopResourceService(pszservicename: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilStopResourceService((pszservicename?.value ?: 0L)).toUInt()

public actual fun resUtilStopService(hservicehandle: ScHandle): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilStopService((hservicehandle?.value ?: 0L)).toUInt()

public actual fun resUtilTerminateServiceProcessFromResDll(dwservicepid: UInt, boffline: Bool, pdwresourcestate: COpaquePointer?, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilTerminateServiceProcessFromResDll(dwservicepid.toInt(), boffline, (pdwresourcestate?.value ?: 0L), 0L, hresourcehandle).toUInt()

public actual fun resUtilVerifyPrivatePropertyList(pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilVerifyPrivatePropertyList((pinpropertylist?.value ?: 0L), cbinpropertylistsize.toInt()).toUInt()

public actual fun resUtilVerifyPropertyTable(ppropertytable: COpaquePointer?, reserved: COpaquePointer?, ballowunknownproperties: Bool, pinpropertylist: COpaquePointer?, cbinpropertylistsize: UInt, poutparams: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilVerifyPropertyTable((ppropertytable?.value ?: 0L), (reserved?.value ?: 0L), ballowunknownproperties, (pinpropertylist?.value ?: 0L), cbinpropertylistsize.toInt(), (poutparams?.value ?: 0L)).toUInt()

public actual fun resUtilVerifyResourceService(pszservicename: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilVerifyResourceService((pszservicename?.value ?: 0L)).toUInt()

public actual fun resUtilVerifyService(hservicehandle: ScHandle): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilVerifyService((hservicehandle?.value ?: 0L)).toUInt()

public actual fun resUtilVerifyShutdownSafe(flags: UInt, reason: UInt, presult: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilVerifyShutdownSafe(flags.toInt(), reason.toInt(), (presult?.value ?: 0L)).toUInt()

public actual fun resUtilsDeleteKeyTree(key: Hkey, keyname: Pcwstr, treatnokeyaserror: Bool): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resUtilsDeleteKeyTree((key?.value ?: 0L), (keyname?.value ?: 0L), treatnokeyaserror).toUInt()

public actual fun resetAllAppInstanceVersions(): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resetAllAppInstanceVersions().toUInt()

public actual fun restartClusterResource(hresource: Hresource, dwflags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_restartClusterResource(hresource, dwflags.toInt()).toUInt()

public actual fun restartClusterResourceEx(hresource: Hresource, dwflags: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_restartClusterResourceEx(hresource, dwflags.toInt(), (lpszreason?.value ?: 0L)).toUInt()

public actual fun restoreClusterDatabase(lpszpathname: Pcwstr, bforce: Bool, lpszquorumdriveletter: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_restoreClusterDatabase((lpszpathname?.value ?: 0L), bforce, (lpszquorumdriveletter?.value ?: 0L)).toUInt()

public actual fun resumeClusterNode(hnode: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resumeClusterNode(hnode).toUInt()

public actual fun resumeClusterNodeEx(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resumeClusterNodeEx(hnode, eresumefailbacktype, dwresumeflagsreserved.toInt()).toUInt()

public actual fun resumeClusterNodeEx2(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_resumeClusterNodeEx2(hnode, eresumefailbacktype, dwresumeflagsreserved.toInt(), (lpszreason?.value ?: 0L)).toUInt()

public actual fun setAppInstanceCsvFlags(processhandle: Handle, mask: UInt, flags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setAppInstanceCsvFlags((processhandle?.value ?: 0L), mask.toInt(), flags.toInt()).toUInt()

public actual fun setClusterGroupName(hgroup: Hgroup, lpszgroupname: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterGroupName(hgroup, (lpszgroupname?.value ?: 0L)).toUInt()

public actual fun setClusterGroupNameEx(hgroup: Hgroup, lpszgroupname: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterGroupNameEx(hgroup, (lpszgroupname?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun setClusterGroupNodeList(hgroup: Hgroup, nodecount: UInt, nodelist: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterGroupNodeList(hgroup, nodecount.toInt(), (nodelist?.value ?: 0L)).toUInt()

public actual fun setClusterGroupNodeListEx(hgroup: Hgroup, nodecount: UInt, nodelist: COpaquePointer?, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterGroupNodeListEx(hgroup, nodecount.toInt(), (nodelist?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun setClusterGroupSetDependencyExpression(hgroupset: Hgroupset, lpszdependencyexprssion: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpression(hgroupset, (lpszdependencyexprssion?.value ?: 0L)).toUInt()

public actual fun setClusterGroupSetDependencyExpressionEx(hgroupset: Hgroupset, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterGroupSetDependencyExpressionEx(hgroupset, (lpszdependencyexpression?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun setClusterName(hcluster: Hcluster, lpsznewclustername: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterName(hcluster, (lpsznewclustername?.value ?: 0L)).toUInt()

public actual fun setClusterNameEx(hcluster: Hcluster, lpsznewclustername: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterNameEx(hcluster, (lpsznewclustername?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun setClusterNetworkName(hnetwork: Hnetwork, lpszname: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterNetworkName(hnetwork, (lpszname?.value ?: 0L)).toUInt()

public actual fun setClusterNetworkNameEx(hnetwork: Hnetwork, lpszname: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterNetworkNameEx(hnetwork, (lpszname?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun setClusterNetworkPriorityOrder(hcluster: Hcluster, networkcount: UInt, networklist: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterNetworkPriorityOrder(hcluster, networkcount.toInt(), (networklist?.value ?: 0L)).toUInt()

public actual fun setClusterQuorumResource(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquologsize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterQuorumResource(hresource, (lpszdevicename?.value ?: 0L), dwmaxquologsize.toInt()).toUInt()

public actual fun setClusterQuorumResourceEx(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquorumlogsize: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterQuorumResourceEx(hresource, (lpszdevicename?.value ?: 0L), dwmaxquorumlogsize.toInt(), (lpszreason?.value ?: 0L)).toUInt()

public actual fun setClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterResourceDependencyExpression(hresource, (lpszdependencyexpression?.value ?: 0L)).toUInt()

public actual fun setClusterResourceName(hresource: Hresource, lpszresourcename: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterResourceName(hresource, (lpszresourcename?.value ?: 0L)).toUInt()

public actual fun setClusterResourceNameEx(hresource: Hresource, lpszresourcename: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterResourceNameEx(hresource, (lpszresourcename?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()

public actual fun setClusterServiceAccountPassword(lpszclustername: Pcwstr, lpsznewpassword: Pcwstr, dwflags: UInt, lpreturnstatusbuffer: COpaquePointer?, lpcbreturnstatusbuffersize: COpaquePointer?): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setClusterServiceAccountPassword((lpszclustername?.value ?: 0L), (lpsznewpassword?.value ?: 0L), dwflags.toInt(), (lpreturnstatusbuffer?.value ?: 0L), (lpcbreturnstatusbuffersize?.value ?: 0L)).toUInt()

public actual fun setGroupDependencyExpression(hgroup: Hgroup, lpszdependencyexpression: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setGroupDependencyExpression(hgroup, (lpszdependencyexpression?.value ?: 0L)).toUInt()

public actual fun setGroupDependencyExpressionEx(hgroup: Hgroup, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssys_windows_win32_networking_clustering_setGroupDependencyExpressionEx(hgroup, (lpszdependencyexpression?.value ?: 0L), (lpszreason?.value ?: 0L)).toUInt()
