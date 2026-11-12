@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.clustering

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    external fun windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependency(hdependentgroup: Long, hprovidergroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependencyEx(hdependentgroup: Long, hprovidergroup: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependency(hdependentgroupset: Long, hprovidergroupset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependencyEx(hdependentgroupset: Long, hprovidergroupset: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependency(hdependentgroup: Long, hprovidergroupset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependencyEx(hdependentgroup: Long, hprovidergroupset: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringAddClusterNode(hcluster: Long, lpsznodename: Long, pfnprogresscallback: Long, pvcallbackarg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringAddClusterNodeEx(hcluster: Long, lpsznodename: Long, dwflags: Int, pfnprogresscallback: Long, pvcallbackarg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependency(hresource: Long, hdependson: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependencyEx(hresource: Long, hdependson: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringAddClusterResourceNode(hresource: Long, hnode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringAddClusterResourceNodeEx(hresource: Long, hnode: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringAddClusterStorageNode(hcluster: Long, lpsznodename: Long, pfnprogresscallback: Long, pvcallbackarg: Long, lpszclusterstoragenodedescription: Long, lpszclusterstoragenodelocation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringAddCrossClusterGroupSetDependency(hdependentgroupset: Long, lpremoteclustername: Long, lpremotegroupsetname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringAddResourceToClusterSharedVolumes(hresource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringBackupClusterDatabase(hcluster: Long, lpszpathname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCanResourceBeDependent(hresource: Long, hresourcedependent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCancelClusterGroupOperation(hgroup: Long, dwcancelflagsReserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroup(hresource: Long, hgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx(hresource: Long, hgroup: Long, flags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx2(hresource: Long, hgroup: Long, flags: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCloseCluster(hcluster: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCloseClusterCryptProvider(hcluscryptprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCloseClusterGroup(hgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCloseClusterGroupSet(hgroupset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCloseClusterNetInterface(hnetinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCloseClusterNetwork(hnetwork: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCloseClusterNode(hnode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCloseClusterNotifyPort(hchange: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCloseClusterResource(hresource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusAddClusterHealthFault(hcluster: Long, failure: Long, param2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusGetClusterHealthFaults(hcluster: Long, objects: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusRemoveClusterHealthFault(hcluster: Long, id: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusWorkerCheckTerminate(lpworker: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusWorkerCreate(lpworker: Long, lpstartaddress: Long, lpparameter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusWorkerTerminate(lpworker: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusWorkerTerminateEx(clusworker: Long, timeoutinmilliseconds: Int, waitonly: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusWorkersTerminate(clusworkers: Long, clusworkerscount: Long, timeoutinmilliseconds: Int, waitonly: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusapiSetReasonHandler(lphandler: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterAddGroupToAffinityRule(hcluster: Long, rulename: Long, hgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSet(hgroupset: Long, hgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomains(hgroupset: Long, hgroup: Long, faultdomain: Int, updatedomain: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomainsEx(hgroupset: Long, hgroup: Long, faultdomain: Int, updatedomain: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterAffinityRuleControl(hcluster: Long, affinityrulename: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterClearBackupStateForSharedVolume(lpszvolumepathname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterCloseEnum(henum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterCloseEnumEx(hclusterenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterControl(hcluster: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterControlEx(hcluster: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterCreateAffinityRule(hcluster: Long, rulename: Long, ruletype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterDecrypt(hcluscryptprovider: Long, pcryptinput: Long, cbcryptinput: Int, ppcryptoutput: Long, pcbcryptoutput: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterEncrypt(hcluscryptprovider: Long, pdata: Long, cbdata: Int, ppdata: Long, pcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterEnum(henum: Long, dwindex: Int, lpdwtype: Long, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterEnumEx(hclusterenum: Long, dwindex: Int, pitem: Long, cbitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGetEnumCount(henum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGetEnumCountEx(hclusterenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: Long, lpszvolumename: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGetVolumePathName(lpszfilename: Long, lpszvolumepathname: Long, cchbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnum(hgroupenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnumEx(hgroupenumex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupControl(hgroup: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupControlEx(hgroup: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupEnum(hgroupenum: Long, dwindex: Int, lpdwtype: Long, lpszresourcename: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupEnumEx(hgroupenumex: Long, dwindex: Int, pitem: Long, cbitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCount(hgroupenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCountEx(hgroupenumex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnum(hgroup: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnumEx(hcluster: Long, lpszproperties: Long, cbproperties: Int, lpszroproperties: Long, cbroproperties: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupSetCloseEnum(hgroupsetenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupSetControl(hgroupset: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupSetControlEx(hgroupset: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupSetEnum(hgroupsetenum: Long, dwindex: Int, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupSetGetEnumCount(hgroupsetenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterGroupSetOpenEnum(hcluster: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterIsPathOnSharedVolume(lpszpathname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceCloseEnum(hnetinterfaceenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControl(hnetinterface: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControlEx(hnetinterface: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceEnum(hnetinterfaceenum: Long, dwindex: Int, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceOpenEnum(hcluster: Long, lpsznodename: Long, lpsznetworkname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNetworkCloseEnum(hnetworkenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNetworkControl(hnetwork: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNetworkControlEx(hnetwork: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNetworkEnum(hnetworkenum: Long, dwindex: Int, lpdwtype: Long, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNetworkGetEnumCount(hnetworkenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNetworkOpenEnum(hnetwork: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnum(hnodeenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnumEx(hnodeenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNodeControl(hnode: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNodeControlEx(hnode: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNodeEnum(hnodeenum: Long, dwindex: Int, lpdwtype: Long, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNodeEnumEx(hnodeenum: Long, dwindex: Int, pitem: Long, cbitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCount(hnodeenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCountEx(hnodeenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnum(hnode: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnumEx(hnode: Long, dwtype: Int, poptions: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterNodeReplacement(hcluster: Long, lpsznodenamecurrent: Long, lpsznodenamenew: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterOpenEnum(hcluster: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterOpenEnumEx(hcluster: Long, dwtype: Int, poptions: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterPrepareSharedVolumeForBackup(lpszfilename: Long, lpszvolumepathname: Long, lpcchvolumepathname: Long, lpszvolumename: Long, lpcchvolumename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegBatchAddCommand(hregbatch: Long, dwcommand: Int, wzname: Long, dwoptions: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegBatchCloseNotification(hbatchnotification: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegBatchReadCommand(hbatchnotification: Long, pbatchcommand: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatch(hregbatch: Long, bcommit: Int, failedcommandnumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchEx(hregbatch: Long, flags: Int, failedcommandnumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchNotifyPort(hbatchnotifyport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegCloseKey(hkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatch(hregreadbatch: Long, phregreadbatchreply: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchEx(hregreadbatch: Long, flags: Int, phregreadbatchreply: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchReply(hregreadbatchreply: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatch(hkey: Long, phregbatch: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatchNotifyPort(hkey: Long, phbatchnotifyport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegCreateKey(hkey: Long, lpszsubkey: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegCreateKeyEx(hkey: Long, lpsubkey: Long, dwoptions: Int, samdesired: Int, lpsecurityattributes: Long, phkresult: Long, lpdwdisposition: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegCreateReadBatch(hkey: Long, phregreadbatch: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKey(hkey: Long, lpszsubkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKeyEx(hkey: Long, lpsubkey: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValue(hkey: Long, lpszvaluename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValueEx(hkey: Long, lpszvaluename: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegEnumKey(hkey: Long, dwindex: Int, lpszname: Long, lpcchname: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegEnumValue(hkey: Long, dwindex: Int, lpszvaluename: Long, lpcchvaluename: Long, lpdwtype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegGetBatchNotification(hbatchnotify: Long, phbatchnotification: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegGetKeySecurity(hkey: Long, requestedinformation: Int, psecuritydescriptor: Long, lpcbsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegOpenKey(hkey: Long, lpszsubkey: Long, samdesired: Int, phkresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegQueryInfoKey(hkey: Long, lpcsubkeys: Long, lpcchmaxsubkeylen: Long, lpcvalues: Long, lpcchmaxvaluenamelen: Long, lpcbmaxvaluelen: Long, lpcbsecuritydescriptor: Long, lpftlastwritetime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegQueryValue(hkey: Long, lpszvaluename: Long, lpdwvaluetype: Long, lpdata: Long, lpcbdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchAddCommand(hregreadbatch: Long, wzsubkeyname: Long, wzvaluename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchReplyNextCommand(hregreadbatchreply: Long, pbatchcommand: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurity(hkey: Long, securityinformation: Int, psecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurityEx(hkey: Long, securityinformation: Int, psecuritydescriptor: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegSetValue(hkey: Long, lpszvaluename: Long, dwtype: Int, lpdata: Long, cbdata: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegSetValueEx(hkey: Long, lpszvaluename: Long, dwtype: Int, lpdata: Long, cbdata: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRegSyncDatabase(hcluster: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRemoveAffinityRule(hcluster: Long, rulename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromAffinityRule(hcluster: Long, rulename: Long, hgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSet(hgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSetEx(hgroup: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnum(hresenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnumEx(hresourceenumex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceControl(hresource: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUser(hresource: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUserEx(hresource: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceControlEx(hresource: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, cbinbuffersize: Int, lpoutbuffer: Long, cboutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceEnum(hresenum: Long, dwindex: Int, lpdwtype: Long, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceEnumEx(hresourceenumex: Long, dwindex: Int, pitem: Long, cbitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCount(hresenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCountEx(hresourceenumex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnum(hresource: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnumEx(hcluster: Long, lpszproperties: Long, cbproperties: Int, lpszroproperties: Long, cbroproperties: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceTypeCloseEnum(hrestypeenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControl(hcluster: Long, lpszresourcetypename: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUser(hcluster: Long, lpszresourcetypename: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUserEx(hcluster: Long, lpszresourcetypename: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlEx(hcluster: Long, lpszresourcetypename: Long, hhostnode: Long, dwcontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceTypeEnum(hrestypeenum: Long, dwindex: Int, lpdwtype: Long, lpszname: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceTypeGetEnumCount(hrestypeenum: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterResourceTypeOpenEnum(hcluster: Long, lpszresourcetypename: Long, dwtype: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterSetAccountAccess(hcluster: Long, szaccountsid: Long, dwaccess: Int, dwcontroltype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringClusterUpgradeFunctionalLevel(hcluster: Long, perform: Int, pfnprogresscallback: Long, pvcallbackarg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCreateCluster(pconfig: Long, pfnprogresscallback: Long, pvcallbackarg: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCreateClusterAvailabilitySet(hcluster: Long, lpavailabilitysetname: Long, pavailabilitysetconfig: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCreateClusterGroup(hcluster: Long, lpszgroupname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCreateClusterGroupEx(hcluster: Long, lpszgroupname: Long, pgroupinfo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCreateClusterGroupSet(hcluster: Long, groupsetname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCreateClusterNameAccount(hcluster: Long, pconfig: Long, pfnprogresscallback: Long, pvcallbackarg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPort(hchange: Long, hcluster: Long, dwfilter: Int, dwnotifykey: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPortV2(hchange: Long, hcluster: Long, filters: Long, dwfiltercount: Int, dwnotifykey: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCreateClusterResource(hgroup: Long, lpszresourcename: Long, lpszresourcetype: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCreateClusterResourceEx(hgroup: Long, lpszresourcename: Long, lpszresourcetype: Long, dwflags: Int, lpszreason: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCreateClusterResourceType(hcluster: Long, lpszresourcetypename: Long, lpszdisplayname: Long, lpszresourcetypedll: Long, dwlooksalivepollinterval: Int, dwisalivepollinterval: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringCreateClusterResourceTypeEx(hcluster: Long, lpszresourcetypename: Long, lpszdisplayname: Long, lpszresourcetypedll: Long, dwlooksalivepollinterval: Int, dwisalivepollinterval: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringDeleteClusterGroup(hgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupEx(hgroup: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSet(hgroupset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSetEx(hgroupset: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringDeleteClusterResource(hresource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceEx(hresource: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceType(hcluster: Long, lpszresourcetypename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceTypeEx(hcluster: Long, lpsztypename: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringDestroyCluster(hcluster: Long, pfnprogresscallback: Long, pvcallbackarg: Long, fdeletevirtualcomputerobjects: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringDestroyClusterGroup(hgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringDestroyClusterGroupEx(hgroup: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromCluster(hcluster: Long, pcnorestype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromNodelist(cnodes: Int, ppsznodenames: Long, pcnorestype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromCluster(hcluster: Long, pcloudtype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromNodelist(cnodes: Int, ppsznodenames: Long, pcloudtype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringEvictClusterNode(hnode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx(hnode: Long, dwtimeout: Int, phrcleanupstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx2(hnode: Long, dwtimeout: Int, phrcleanupstatus: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringFailClusterResource(hresource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringFailClusterResourceEx(hresource: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringFreeClusterCrypt(pcryptinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFault(clusterhealthfault: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFaultArray(clusterhealthfaultarray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterFromGroup(hgroup: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterFromNetInterface(hnetinterface: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterFromNetwork(hnetwork: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterFromNode(hnode: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterFromResource(hresource: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterGroupKey(hgroup: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterGroupState(hgroup: Long, lpsznodename: Long, lpcchnodename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterInformation(hcluster: Long, lpszclustername: Long, lpcchclustername: Long, lpclusterinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterKey(hcluster: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterNetInterface(hcluster: Long, lpsznodename: Long, lpsznetworkname: Long, lpszinterfacename: Long, lpcchinterfacename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceKey(hnetinterface: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceState(hnetinterface: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterNetworkId(hnetwork: Long, lpsznetworkid: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterNetworkKey(hnetwork: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterNetworkState(hnetwork: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterNodeId(hnode: Long, lpsznodeid: Long, lpcchname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterNodeKey(hnode: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterNodeState(hnode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterNotify(hchange: Long, lpdwnotifykey: Long, lpdwfiltertype: Long, lpszname: Long, lpcchname: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterNotifyV2(hchange: Long, lpdwnotifykey: Long, pfilterandtype: Long, buffer: Long, lpbbuffersize: Long, lpszobjectid: Long, lpcchobjectid: Long, lpszparentid: Long, lpcchparentid: Long, lpszname: Long, lpcchname: Long, lpsztype: Long, lpcchtype: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterQuorumResource(hcluster: Long, lpszresourcename: Long, lpcchresourcename: Long, lpszdevicename: Long, lpcchdevicename: Long, lpdwmaxquorumlogsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterResourceDependencyExpression(hresource: Long, lpszdependencyexpression: Long, lpcchdependencyexpression: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterResourceKey(hresource: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterResourceNetworkName(hresource: Long, lpbuffer: Long, nsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterResourceState(hresource: Long, lpsznodename: Long, lpcchnodename: Long, lpszgroupname: Long, lpcchgroupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetClusterResourceTypeKey(hcluster: Long, lpsztypename: Long, samdesired: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetNodeCloudTypeDW(ppsznodename: Long, nodecloudtype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetNodeClusterState(lpsznodename: Long, pdwclusterstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringGetNotifyEventHandle(hchange: Long, lphtargetevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFault(clusterhealthfault: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFaultArray(clusterhealthfaultarray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringIsFileOnClusterSharedVolume(lpszpathname: Long, pbfileisonsharedvolume: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringMoveClusterGroup(hgroup: Long, hdestinationnode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx(hgroup: Long, hdestinationnode: Long, dwmoveflags: Int, lpinbuffer: Long, cbinbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx2(hgroup: Long, hdestinationnode: Long, dwmoveflags: Int, lpinbuffer: Long, cbinbuffersize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOfflineClusterGroup(hgroup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx(hgroup: Long, dwofflineflags: Int, lpinbuffer: Long, cbinbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx2(hgroup: Long, dwofflineflags: Int, lpinbuffer: Long, cbinbuffersize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOfflineClusterResource(hresource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx(hresource: Long, dwofflineflags: Int, lpinbuffer: Long, cbinbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx2(hresource: Long, dwofflineflags: Int, lpinbuffer: Long, cbinbuffersize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOnlineClusterGroup(hgroup: Long, hdestinationnode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx(hgroup: Long, hdestinationnode: Long, dwonlineflags: Int, lpinbuffer: Long, cbinbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx2(hgroup: Long, hdestinationnode: Long, dwonlineflags: Int, lpinbuffer: Long, cbinbuffersize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOnlineClusterResource(hresource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx(hresource: Long, dwonlineflags: Int, lpinbuffer: Long, cbinbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx2(hresource: Long, dwonlineflags: Int, lpinbuffer: Long, cbinbuffersize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenCluster(lpszclustername: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProvider(lpszresource: Long, lpszprovider: Long, dwtype: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProviderEx(lpszresource: Long, lpszkeyname: Long, lpszprovider: Long, dwtype: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenClusterEx(lpszclustername: Long, desiredaccess: Int, grantedaccess: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenClusterGroup(hcluster: Long, lpszgroupname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenClusterGroupEx(hcluster: Long, lpszgroupname: Long, dwdesiredaccess: Int, lpdwgrantedaccess: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenClusterGroupSet(hcluster: Long, lpszgroupsetname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterface(hcluster: Long, lpszinterfacename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterfaceEx(hcluster: Long, lpszinterfacename: Long, dwdesiredaccess: Int, lpdwgrantedaccess: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenClusterNetwork(hcluster: Long, lpsznetworkname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenClusterNetworkEx(hcluster: Long, lpsznetworkname: Long, dwdesiredaccess: Int, lpdwgrantedaccess: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenClusterNode(hcluster: Long, lpsznodename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenClusterNodeById(hcluster: Long, nodeid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenClusterNodeEx(hcluster: Long, lpsznodename: Long, dwdesiredaccess: Int, lpdwgrantedaccess: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenClusterResource(hcluster: Long, lpszresourcename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringOpenClusterResourceEx(hcluster: Long, lpszresourcename: Long, dwdesiredaccess: Int, lpdwgrantedaccess: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringPauseClusterNode(hnode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx(hnode: Long, bdrainnode: Int, dwpauseflags: Int, hnodedraintarget: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx2(hnode: Long, bdrainnode: Int, dwpauseflags: Int, hnodedraintarget: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringQueryAppInstanceVersion(appinstanceid: Long, instanceversionhigh: Long, instanceversionlow: Long, versionstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRegisterAppInstance(processhandle: Long, appinstanceid: Long, childreninheritappinstance: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRegisterAppInstanceVersion(appinstanceid: Long, instanceversionhigh: Long, instanceversionlow: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRegisterClusterNotify(hchange: Long, dwfiltertype: Int, hobject: Long, dwnotifykey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRegisterClusterResourceTypeNotifyV2(hchange: Long, hcluster: Long, flags: Long, restypename: Long, dwnotifykey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependency(hgroup: Long, hdependson: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependencyEx(hgroup: Long, hdependson: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependency(hgroupset: Long, hdependson: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependencyEx(hgroupset: Long, hdependson: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependency(hgroup: Long, hdependson: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependencyEx(hgroup: Long, hdependson: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRemoveClusterNameAccount(hcluster: Long, bdeletecomputerobjects: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependency(hresource: Long, hdependson: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependencyEx(hresource: Long, hdependson: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNode(hresource: Long, hnode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNodeEx(hresource: Long, hnode: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRemoveClusterStorageNode(hcluster: Long, lpszclusterstorageenclosurename: Long, dwtimeout: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRemoveCrossClusterGroupSetDependency(hdependentgroupset: Long, lpremoteclustername: Long, lpremotegroupsetname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRemoveResourceFromClusterSharedVolumes(hresource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilAddUnknownProperties(hkeyclusterkey: Long, ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilCreateDirectoryTree(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilDupGroup(group: Long, copy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilDupParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilDupResource(group: Long, copy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilDupString(pszinstring: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilEnumGroups(hcluster: Long, hself: Long, prescallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilEnumGroupsEx(hcluster: Long, hself: Long, grouptype: Int, prescallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilEnumPrivateProperties(hkeyclusterkey: Long, pszoutproperties: Long, cboutpropertiessize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilEnumProperties(ppropertytable: Long, pszoutproperties: Long, cboutpropertiessize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilEnumResources(hself: Long, lpszrestypename: Long, prescallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx(hcluster: Long, hself: Long, lpszrestypename: Long, prescallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx2(hcluster: Long, hself: Long, lpszrestypename: Long, prescallback: Long, pparameter: Long, dwdesiredaccess: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilExpandEnvironmentStrings(pszsrc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilFindBinaryProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pbpropertyvalue: Long, pcbpropertyvaluesize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilFindDependentDiskResourceDriveLetter(hcluster: Long, hresource: Long, pszdriveletter: Long, pcchdriveletter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilFindDwordProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pdwpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilFindExpandSzProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pszpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilFindExpandedSzProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pszpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilFindFileTimeProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pftpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilFindLongProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, plpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilFindMultiSzProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pszpropertyvalue: Long, pcbpropertyvaluesize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilFindSzProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, pszpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilFindULargeIntegerProperty(ppropertylist: Long, cbpropertylistsize: Int, pszpropertyname: Long, plpropertyvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilFreeEnvironment(lpenvironment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilFreeParameterBlock(poutparams: Long, pinparams: Long, ppropertytable: Long)

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetAllProperties(hkeyclusterkey: Long, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryProperty(ppboutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pboldvalue: Long, cboldvaluesize: Int, pppropertylist: Long, pcbpropertylistsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryValue(hkeyclusterkey: Long, pszvaluename: Long, ppboutvalue: Long, pcboutvaluesize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetClusterGroupType(hgroup: Long, grouptype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetClusterId(hcluster: Long, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetClusterRoleState(hcluster: Long, eclusterrole: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResources(hcluster: Long, phclusternameresource: Long, phclusteripaddressresource: Long, phclusterquorumresource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResourcesEx(hclusterin: Long, phclusternameresourceout: Long, phclusterquorumresourceout: Long, dwdesiredaccess: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetCoreGroup(hcluster: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetDwordProperty(pdwoutvalue: Long, pvaluestruct: Long, dwoldvalue: Int, dwminimum: Int, dwmaximum: Int, pppropertylist: Long, pcbpropertylistsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetDwordValue(hkeyclusterkey: Long, pszvaluename: Long, pdwoutvalue: Long, dwdefaultvalue: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetEnvironmentWithNetName(hresource: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetLongProperty(ploutvalue: Long, pvaluestruct: Long, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: Long, pcbpropertylistsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetMultiSzProperty(ppszoutvalue: Long, pcboutvaluesize: Long, pvaluestruct: Long, pszoldvalue: Long, cboldvaluesize: Int, pppropertylist: Long, pcbpropertylistsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetPrivateProperties(hkeyclusterkey: Long, poutpropertylist: Long, cboutpropertylistsize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetProperties(hkeyclusterkey: Long, ppropertytable: Long, poutpropertylist: Long, cboutpropertylistsize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetPropertiesToParameterBlock(hkeyclusterkey: Long, ppropertytable: Long, poutparams: Long, bcheckforrequiredproperties: Int, psznameofpropinerror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetProperty(hkeyclusterkey: Long, ppropertytableitem: Long, poutpropertyitem: Long, pcboutpropertyitemsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetPropertyFormats(ppropertytable: Long, poutpropertyformatlist: Long, cbpropertyformatlistsize: Int, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetPropertySize(hkeyclusterkey: Long, ppropertytableitem: Long, pcboutpropertylistsize: Long, pnpropertycount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetQwordValue(hkeyclusterkey: Long, pszvaluename: Long, pqwoutvalue: Long, qwdefaultvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependency(hself: Long, lpszresourcetype: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClass(hcluster: Long, hself: Long, prci: Long, brecurse: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClassEx(hcluster: Long, hself: Long, prci: Long, brecurse: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByName(hcluster: Long, hself: Long, lpszresourcetype: Long, brecurse: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByNameEx(hcluster: Long, hself: Long, lpszresourcetype: Long, brecurse: Int, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyEx(hself: Long, lpszresourcetype: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependentIPAddressProps(hresource: Long, pszaddress: Long, pcchaddress: Long, pszsubnetmask: Long, pcchsubnetmask: Long, psznetwork: Long, pcchnetwork: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetResourceName(hresource: Long, pszresourcename: Long, pcchresourcenameinout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependency(lpszresourcename: Long, lpszresourcetype: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependencyEx(lpszresourcename: Long, lpszresourcetype: Long, dwdesiredaccess: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetSzProperty(ppszoutvalue: Long, pvaluestruct: Long, pszoldvalue: Long, pppropertylist: Long, pcbpropertylistsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGetSzValue(hkeyclusterkey: Long, pszvaluename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilGroupsEqual(hself: Long, hgroup: Long, pequal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilIsPathValid(pszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilIsResourceClassEqual(prci: Long, hresource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilLeftPaxosIsLessThanRight(left: Long, right: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilNodeEnum(hcluster: Long, pnodecallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilPaxosComparer(left: Long, right: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilPropertyListFromParameterBlock(ppropertytable: Long, poutpropertylist: Long, pcboutpropertylistsize: Long, pinparams: Long, pcbbytesreturned: Long, pcbrequired: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilRemoveResourceServiceEnvironment(pszservicename: Long, pfnlogevent: Long, hresourcehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilResourceDepEnum(hself: Long, enumtype: Int, prescallback: Long, pparameter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilResourceTypesEqual(lpszresourcetypename: Long, hresource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilResourcesEqual(hself: Long, hresource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetBinaryValue(hkeyclusterkey: Long, pszvaluename: Long, pbnewvalue: Long, cbnewvaluesize: Int, ppboutvalue: Long, pcboutvaluesize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetDwordValue(hkeyclusterkey: Long, pszvaluename: Long, dwnewvalue: Int, pdwoutvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetExpandSzValue(hkeyclusterkey: Long, pszvaluename: Long, psznewvalue: Long, ppszoutstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetMultiSzValue(hkeyclusterkey: Long, pszvaluename: Long, psznewvalue: Long, cbnewvaluesize: Int, ppszoutvalue: Long, pcboutvaluesize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetPrivatePropertyList(hkeyclusterkey: Long, pinpropertylist: Long, cbinpropertylistsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlock(hkeyclusterkey: Long, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: Int, poutparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlockEx(hkeyclusterkey: Long, ppropertytable: Long, reserved: Long, pinparams: Long, pinpropertylist: Long, cbinpropertylistsize: Int, bforcewrite: Int, poutparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTable(hkeyclusterkey: Long, ppropertytable: Long, reserved: Long, ballowunknownproperties: Int, pinpropertylist: Long, cbinpropertylistsize: Int, poutparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTableEx(hkeyclusterkey: Long, ppropertytable: Long, reserved: Long, ballowunknownproperties: Int, pinpropertylist: Long, cbinpropertylistsize: Int, bforcewrite: Int, poutparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetQwordValue(hkeyclusterkey: Long, pszvaluename: Long, qwnewvalue: Long, pqwoutvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceEnvironment(pszservicename: Long, hresource: Long, pfnlogevent: Long, hresourcehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParameters(pszservicename: Long, schscmhandle: Long, phservice: Long, pfnlogevent: Long, hresourcehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParametersEx(pszservicename: Long, schscmhandle: Long, phservice: Long, dwdesiredaccess: Int, pfnlogevent: Long, hresourcehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetSzValue(hkeyclusterkey: Long, pszvaluename: Long, psznewvalue: Long, ppszoutstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetUnknownProperties(hkeyclusterkey: Long, ppropertytable: Long, pinpropertylist: Long, cbinpropertylistsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilSetValueEx(hkeyclusterkey: Long, valuename: Long, valuetype: Int, valuedata: Long, valuesize: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilStartResourceService(pszservicename: Long, phservicehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilStopResourceService(pszservicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilStopService(hservicehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilTerminateServiceProcessFromResDll(dwservicepid: Int, boffline: Int, pdwresourcestate: Long, pfnlogevent: Long, hresourcehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilVerifyPrivatePropertyList(pinpropertylist: Long, cbinpropertylistsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilVerifyPropertyTable(ppropertytable: Long, reserved: Long, ballowunknownproperties: Int, pinpropertylist: Long, cbinpropertylistsize: Int, poutparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilVerifyResourceService(pszservicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilVerifyService(hservicehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilVerifyShutdownSafe(flags: Int, reason: Int, presult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResUtilsDeleteKeyTree(key: Long, keyname: Long, treatnokeyaserror: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResetAllAppInstanceVersions(): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRestartClusterResource(hresource: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRestartClusterResourceEx(hresource: Long, dwflags: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringRestoreClusterDatabase(lpszpathname: Long, bforce: Int, lpszquorumdriveletter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResumeClusterNode(hnode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx(hnode: Long, eresumefailbacktype: Int, dwresumeflagsreserved: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx2(hnode: Long, eresumefailbacktype: Int, dwresumeflagsreserved: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetAppInstanceCsvFlags(processhandle: Long, mask: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterGroupName(hgroup: Long, lpszgroupname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterGroupNameEx(hgroup: Long, lpszgroupname: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeList(hgroup: Long, nodecount: Int, nodelist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeListEx(hgroup: Long, nodecount: Int, nodelist: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpression(hgroupset: Long, lpszdependencyexprssion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpressionEx(hgroupset: Long, lpszdependencyexpression: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterName(hcluster: Long, lpsznewclustername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterNameEx(hcluster: Long, lpsznewclustername: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterNetworkName(hnetwork: Long, lpszname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterNetworkNameEx(hnetwork: Long, lpszname: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterNetworkPriorityOrder(hcluster: Long, networkcount: Int, networklist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResource(hresource: Long, lpszdevicename: Long, dwmaxquologsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResourceEx(hresource: Long, lpszdevicename: Long, dwmaxquorumlogsize: Int, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterResourceDependencyExpression(hresource: Long, lpszdependencyexpression: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterResourceName(hresource: Long, lpszresourcename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterResourceNameEx(hresource: Long, lpszresourcename: Long, lpszreason: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetClusterServiceAccountPassword(lpszclustername: Long, lpsznewpassword: Long, dwflags: Int, lpreturnstatusbuffer: Long, lpcbreturnstatusbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpression(hgroup: Long, lpszdependencyexpression: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpressionEx(hgroup: Long, lpszdependencyexpression: Long, lpszreason: Long): Int
}

public actual fun addClusterGroupDependency(hdependentgroup: Hgroup, hprovidergroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependency(hdependentgroup, hprovidergroup).toUInt()

public actual fun addClusterGroupDependencyEx(hdependentgroup: Hgroup, hprovidergroup: Hgroup, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringAddClusterGroupDependencyEx(hdependentgroup, hprovidergroup, lpszreason.rawAddress).toUInt()

public actual fun addClusterGroupSetDependency(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependency(hdependentgroupset, hprovidergroupset).toUInt()

public actual fun addClusterGroupSetDependencyEx(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringAddClusterGroupSetDependencyEx(hdependentgroupset, hprovidergroupset, lpszreason.rawAddress).toUInt()

public actual fun addClusterGroupToGroupSetDependency(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependency(hdependentgroup, hprovidergroupset).toUInt()

public actual fun addClusterGroupToGroupSetDependencyEx(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringAddClusterGroupToGroupSetDependencyEx(hdependentgroup, hprovidergroupset, lpszreason.rawAddress).toUInt()

public actual fun addClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hnode =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringAddClusterNode(hcluster, lpsznodename.rawAddress, 0L, pvcallbackarg.rawAddress)

public actual fun addClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwflags: UInt, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hnode =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringAddClusterNodeEx(hcluster, lpsznodename.rawAddress, dwflags.toInt(), 0L, pvcallbackarg.rawAddress)

public actual fun addClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependency(hresource, hdependson).toUInt()

public actual fun addClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringAddClusterResourceDependencyEx(hresource, hdependson, lpszreason.rawAddress).toUInt()

public actual fun addClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringAddClusterResourceNode(hresource, hnode).toUInt()

public actual fun addClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringAddClusterResourceNodeEx(hresource, hnode, lpszreason.rawAddress).toUInt()

public actual fun addClusterStorageNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr, lpszclusterstoragenodedescription: Pcwstr, lpszclusterstoragenodelocation: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringAddClusterStorageNode(hcluster, lpsznodename.rawAddress, 0L, pvcallbackarg.rawAddress, lpszclusterstoragenodedescription.rawAddress, lpszclusterstoragenodelocation.rawAddress).toUInt()

public actual fun addCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringAddCrossClusterGroupSetDependency(hdependentgroupset, lpremoteclustername.rawAddress, lpremotegroupsetname.rawAddress).toUInt()

public actual fun addResourceToClusterSharedVolumes(hresource: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringAddResourceToClusterSharedVolumes(hresource).toUInt()

public actual fun backupClusterDatabase(hcluster: Hcluster, lpszpathname: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringBackupClusterDatabase(hcluster, lpszpathname.rawAddress).toUInt()

public actual fun canResourceBeDependent(hresource: Hresource, hresourcedependent: Hresource): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCanResourceBeDependent(hresource, hresourcedependent)

public actual fun cancelClusterGroupOperation(hgroup: Hgroup, dwcancelflagsReserved: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCancelClusterGroupOperation(hgroup, dwcancelflagsReserved.toInt()).toUInt()

public actual fun changeClusterResourceGroup(hresource: Hresource, hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroup(hresource, hgroup).toUInt()

public actual fun changeClusterResourceGroupEx(hresource: Hresource, hgroup: Hgroup, flags: ULong): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx(hresource, hgroup, flags.toLong()).toUInt()

public actual fun changeClusterResourceGroupEx2(hresource: Hresource, hgroup: Hgroup, flags: ULong, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringChangeClusterResourceGroupEx2(hresource, hgroup, flags.toLong(), lpszreason.rawAddress).toUInt()

public actual fun closeCluster(hcluster: Hcluster): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCloseCluster(hcluster)

public actual fun closeClusterCryptProvider(hcluscryptprovider: Hcluscryptprovider): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCloseClusterCryptProvider(hcluscryptprovider).toUInt()

public actual fun closeClusterGroup(hgroup: Hgroup): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCloseClusterGroup(hgroup)

public actual fun closeClusterGroupSet(hgroupset: Hgroupset): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCloseClusterGroupSet(hgroupset)

public actual fun closeClusterNetInterface(hnetinterface: Hnetinterface): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCloseClusterNetInterface(hnetinterface)

public actual fun closeClusterNetwork(hnetwork: Hnetwork): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCloseClusterNetwork(hnetwork)

public actual fun closeClusterNode(hnode: Hnode): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCloseClusterNode(hnode)

public actual fun closeClusterNotifyPort(hchange: Hchange): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCloseClusterNotifyPort(hchange)

public actual fun closeClusterResource(hresource: Hresource): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCloseClusterResource(hresource)

public actual fun clusAddClusterHealthFault(hcluster: Hcluster, failure: ConstPtr, param2: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusAddClusterHealthFault(hcluster, failure.rawAddress, param2.toInt()).toUInt()

public actual fun clusGetClusterHealthFaults(hcluster: Hcluster, objects: MutPtr, flags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusGetClusterHealthFaults(hcluster, objects.rawAddress, flags.toInt()).toUInt()

public actual fun clusRemoveClusterHealthFault(hcluster: Hcluster, id: Pcwstr, flags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusRemoveClusterHealthFault(hcluster, id.rawAddress, flags.toInt()).toUInt()

public actual fun clusWorkerCheckTerminate(lpworker: MutPtr): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusWorkerCheckTerminate(lpworker.rawAddress)

public actual fun clusWorkerCreate(lpworker: MutPtr, lpstartaddress: PworkerStartRoutine, lpparameter: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusWorkerCreate(lpworker.rawAddress, 0L, lpparameter.rawAddress).toUInt()

public actual fun clusWorkerTerminate(lpworker: ConstPtr) {
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusWorkerTerminate(lpworker.rawAddress)
}

public actual fun clusWorkerTerminateEx(clusworker: MutPtr, timeoutinmilliseconds: UInt, waitonly: Bool): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusWorkerTerminateEx(clusworker.rawAddress, timeoutinmilliseconds.toInt(), waitonly).toUInt()

public actual fun clusWorkersTerminate(clusworkers: MutPtr, clusworkerscount: ULong, timeoutinmilliseconds: UInt, waitonly: Bool): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusWorkersTerminate(clusworkers.rawAddress, clusworkerscount.toLong(), timeoutinmilliseconds.toInt(), waitonly).toUInt()

public actual fun clusapiSetReasonHandler(lphandler: ConstPtr): MutPtr =
    MutPtr(WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusapiSetReasonHandler(lphandler.rawAddress))

public actual fun clusterAddGroupToAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterAddGroupToAffinityRule(hcluster, rulename.rawAddress, hgroup).toUInt()

public actual fun clusterAddGroupToGroupSet(hgroupset: Hgroupset, hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSet(hgroupset, hgroup).toUInt()

public actual fun clusterAddGroupToGroupSetWithDomains(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomains(hgroupset, hgroup, faultdomain.toInt(), updatedomain.toInt()).toUInt()

public actual fun clusterAddGroupToGroupSetWithDomainsEx(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterAddGroupToGroupSetWithDomainsEx(hgroupset, hgroup, faultdomain.toInt(), updatedomain.toInt(), lpszreason.rawAddress).toUInt()

public actual fun clusterAffinityRuleControl(hcluster: Hcluster, affinityrulename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterAffinityRuleControl(hcluster, affinityrulename.rawAddress, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt(), lpoutbuffer.rawAddress, cboutbuffersize.toInt(), lpbytesreturned.rawAddress).toUInt()

public actual fun clusterClearBackupStateForSharedVolume(lpszvolumepathname: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterClearBackupStateForSharedVolume(lpszvolumepathname.rawAddress).toUInt()

public actual fun clusterCloseEnum(henum: Hclusenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterCloseEnum(henum).toUInt()

public actual fun clusterCloseEnumEx(hclusterenum: Hclusenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterCloseEnumEx(hclusterenum).toUInt()

public actual fun clusterControl(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterControl(hcluster, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesreturned.rawAddress).toUInt()

public actual fun clusterControlEx(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterControlEx(hcluster, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesreturned.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun clusterCreateAffinityRule(hcluster: Hcluster, rulename: Pcwstr, ruletype: ClusAffinityRuleType): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterCreateAffinityRule(hcluster, rulename.rawAddress, ruletype).toUInt()

public actual fun clusterDecrypt(hcluscryptprovider: Hcluscryptprovider, pcryptinput: ConstPtr, cbcryptinput: UInt, ppcryptoutput: MutPtr, pcbcryptoutput: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterDecrypt(hcluscryptprovider, pcryptinput.rawAddress, cbcryptinput.toInt(), ppcryptoutput.rawAddress, pcbcryptoutput.rawAddress).toUInt()

public actual fun clusterEncrypt(hcluscryptprovider: Hcluscryptprovider, pdata: ConstPtr, cbdata: UInt, ppdata: MutPtr, pcbdata: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterEncrypt(hcluscryptprovider, pdata.rawAddress, cbdata.toInt(), ppdata.rawAddress, pcbdata.rawAddress).toUInt()

public actual fun clusterEnum(henum: Hclusenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterEnum(henum, dwindex.toInt(), lpdwtype.rawAddress, lpszname.rawAddress, lpcchname.rawAddress).toUInt()

public actual fun clusterEnumEx(hclusterenum: Hclusenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterEnumEx(hclusterenum, dwindex.toInt(), pitem.rawAddress, cbitem.rawAddress).toUInt()

public actual fun clusterGetEnumCount(henum: Hclusenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGetEnumCount(henum).toUInt()

public actual fun clusterGetEnumCountEx(hclusterenum: Hclusenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGetEnumCountEx(hclusterenum).toUInt()

public actual fun clusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint.rawAddress, lpszvolumename.rawAddress, cchbufferlength.toInt())

public actual fun clusterGetVolumePathName(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGetVolumePathName(lpszfilename.rawAddress, lpszvolumepathname.rawAddress, cchbufferlength.toInt())

public actual fun clusterGroupCloseEnum(hgroupenum: Hgroupenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnum(hgroupenum).toUInt()

public actual fun clusterGroupCloseEnumEx(hgroupenumex: Hgroupenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupCloseEnumEx(hgroupenumex).toUInt()

public actual fun clusterGroupControl(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupControl(hgroup, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesreturned.rawAddress).toUInt()

public actual fun clusterGroupControlEx(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupControlEx(hgroup, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesreturned.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun clusterGroupEnum(hgroupenum: Hgroupenum, dwindex: UInt, lpdwtype: MutPtr, lpszresourcename: Pwstr, lpcchname: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupEnum(hgroupenum, dwindex.toInt(), lpdwtype.rawAddress, lpszresourcename.rawAddress, lpcchname.rawAddress).toUInt()

public actual fun clusterGroupEnumEx(hgroupenumex: Hgroupenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupEnumEx(hgroupenumex, dwindex.toInt(), pitem.rawAddress, cbitem.rawAddress).toUInt()

public actual fun clusterGroupGetEnumCount(hgroupenum: Hgroupenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCount(hgroupenum).toUInt()

public actual fun clusterGroupGetEnumCountEx(hgroupenumex: Hgroupenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupGetEnumCountEx(hgroupenumex).toUInt()

public actual fun clusterGroupOpenEnum(hgroup: Hgroup, dwtype: UInt): Hgroupenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnum(hgroup, dwtype.toInt())

public actual fun clusterGroupOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hgroupenumex =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupOpenEnumEx(hcluster, lpszproperties.rawAddress, cbproperties.toInt(), lpszroproperties.rawAddress, cbroproperties.toInt(), dwflags.toInt())

public actual fun clusterGroupSetCloseEnum(hgroupsetenum: Hgroupsetenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupSetCloseEnum(hgroupsetenum).toUInt()

public actual fun clusterGroupSetControl(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupSetControl(hgroupset, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt(), lpoutbuffer.rawAddress, cboutbuffersize.toInt(), lpbytesreturned.rawAddress).toUInt()

public actual fun clusterGroupSetControlEx(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupSetControlEx(hgroupset, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt(), lpoutbuffer.rawAddress, cboutbuffersize.toInt(), lpbytesreturned.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun clusterGroupSetEnum(hgroupsetenum: Hgroupsetenum, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupSetEnum(hgroupsetenum, dwindex.toInt(), lpszname.rawAddress, lpcchname.rawAddress).toUInt()

public actual fun clusterGroupSetGetEnumCount(hgroupsetenum: Hgroupsetenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupSetGetEnumCount(hgroupsetenum).toUInt()

public actual fun clusterGroupSetOpenEnum(hcluster: Hcluster): Hgroupsetenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterGroupSetOpenEnum(hcluster)

public actual fun clusterIsPathOnSharedVolume(lpszpathname: Pcwstr): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterIsPathOnSharedVolume(lpszpathname.rawAddress)

public actual fun clusterNetInterfaceCloseEnum(hnetinterfaceenum: Hnetinterfaceenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceCloseEnum(hnetinterfaceenum).toUInt()

public actual fun clusterNetInterfaceControl(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControl(hnetinterface, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesreturned.rawAddress).toUInt()

public actual fun clusterNetInterfaceControlEx(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceControlEx(hnetinterface, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesreturned.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun clusterNetInterfaceEnum(hnetinterfaceenum: Hnetinterfaceenum, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceEnum(hnetinterfaceenum, dwindex.toInt(), lpszname.rawAddress, lpcchname.rawAddress).toUInt()

public actual fun clusterNetInterfaceOpenEnum(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr): Hnetinterfaceenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNetInterfaceOpenEnum(hcluster, lpsznodename.rawAddress, lpsznetworkname.rawAddress)

public actual fun clusterNetworkCloseEnum(hnetworkenum: Hnetworkenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNetworkCloseEnum(hnetworkenum).toUInt()

public actual fun clusterNetworkControl(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNetworkControl(hnetwork, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesreturned.rawAddress).toUInt()

public actual fun clusterNetworkControlEx(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNetworkControlEx(hnetwork, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesreturned.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun clusterNetworkEnum(hnetworkenum: Hnetworkenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNetworkEnum(hnetworkenum, dwindex.toInt(), lpdwtype.rawAddress, lpszname.rawAddress, lpcchname.rawAddress).toUInt()

public actual fun clusterNetworkGetEnumCount(hnetworkenum: Hnetworkenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNetworkGetEnumCount(hnetworkenum).toUInt()

public actual fun clusterNetworkOpenEnum(hnetwork: Hnetwork, dwtype: UInt): Hnetworkenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNetworkOpenEnum(hnetwork, dwtype.toInt())

public actual fun clusterNodeCloseEnum(hnodeenum: Hnodeenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnum(hnodeenum).toUInt()

public actual fun clusterNodeCloseEnumEx(hnodeenum: Hnodeenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNodeCloseEnumEx(hnodeenum).toUInt()

public actual fun clusterNodeControl(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNodeControl(hnode, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesreturned.rawAddress).toUInt()

public actual fun clusterNodeControlEx(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNodeControlEx(hnode, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesreturned.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun clusterNodeEnum(hnodeenum: Hnodeenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNodeEnum(hnodeenum, dwindex.toInt(), lpdwtype.rawAddress, lpszname.rawAddress, lpcchname.rawAddress).toUInt()

public actual fun clusterNodeEnumEx(hnodeenum: Hnodeenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNodeEnumEx(hnodeenum, dwindex.toInt(), pitem.rawAddress, cbitem.rawAddress).toUInt()

public actual fun clusterNodeGetEnumCount(hnodeenum: Hnodeenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCount(hnodeenum).toUInt()

public actual fun clusterNodeGetEnumCountEx(hnodeenum: Hnodeenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNodeGetEnumCountEx(hnodeenum).toUInt()

public actual fun clusterNodeOpenEnum(hnode: Hnode, dwtype: UInt): Hnodeenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnum(hnode, dwtype.toInt())

public actual fun clusterNodeOpenEnumEx(hnode: Hnode, dwtype: UInt, poptions: ConstPtr): Hnodeenumex =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNodeOpenEnumEx(hnode, dwtype.toInt(), poptions.rawAddress)

public actual fun clusterNodeReplacement(hcluster: Hcluster, lpsznodenamecurrent: Pcwstr, lpsznodenamenew: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterNodeReplacement(hcluster, lpsznodenamecurrent.rawAddress, lpsznodenamenew.rawAddress).toUInt()

public actual fun clusterOpenEnum(hcluster: Hcluster, dwtype: UInt): Hclusenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterOpenEnum(hcluster, dwtype.toInt())

public actual fun clusterOpenEnumEx(hcluster: Hcluster, dwtype: UInt, poptions: ConstPtr): Hclusenumex =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterOpenEnumEx(hcluster, dwtype.toInt(), poptions.rawAddress)

public actual fun clusterPrepareSharedVolumeForBackup(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, lpcchvolumepathname: MutPtr, lpszvolumename: Pwstr, lpcchvolumename: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterPrepareSharedVolumeForBackup(lpszfilename.rawAddress, lpszvolumepathname.rawAddress, lpcchvolumepathname.rawAddress, lpszvolumename.rawAddress, lpcchvolumename.rawAddress).toUInt()

public actual fun clusterRegBatchAddCommand(hregbatch: Hregbatch, dwcommand: ClusterRegCommand, wzname: Pcwstr, dwoptions: UInt, lpdata: ConstPtr, cbdata: UInt): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegBatchAddCommand(hregbatch, dwcommand, wzname.rawAddress, dwoptions.toInt(), lpdata.rawAddress, cbdata.toInt())

public actual fun clusterRegBatchCloseNotification(hbatchnotification: Hregbatchnotification): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegBatchCloseNotification(hbatchnotification)

public actual fun clusterRegBatchReadCommand(hbatchnotification: Hregbatchnotification, pbatchcommand: MutPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegBatchReadCommand(hbatchnotification, pbatchcommand.rawAddress)

public actual fun clusterRegCloseBatch(hregbatch: Hregbatch, bcommit: Bool, failedcommandnumber: MutPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatch(hregbatch, bcommit, failedcommandnumber.rawAddress)

public actual fun clusterRegCloseBatchEx(hregbatch: Hregbatch, flags: UInt, failedcommandnumber: MutPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchEx(hregbatch, flags.toInt(), failedcommandnumber.rawAddress)

public actual fun clusterRegCloseBatchNotifyPort(hbatchnotifyport: Hregbatchport): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegCloseBatchNotifyPort(hbatchnotifyport)

public actual fun clusterRegCloseKey(hkey: Hkey): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegCloseKey(hkey.rawAddress)

public actual fun clusterRegCloseReadBatch(hregreadbatch: Hregreadbatch, phregreadbatchreply: MutPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatch(hregreadbatch, phregreadbatchreply.rawAddress)

public actual fun clusterRegCloseReadBatchEx(hregreadbatch: Hregreadbatch, flags: UInt, phregreadbatchreply: MutPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchEx(hregreadbatch, flags.toInt(), phregreadbatchreply.rawAddress)

public actual fun clusterRegCloseReadBatchReply(hregreadbatchreply: Hregreadbatchreply): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegCloseReadBatchReply(hregreadbatchreply)

public actual fun clusterRegCreateBatch(hkey: Hkey, phregbatch: MutPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatch(hkey.rawAddress, phregbatch.rawAddress)

public actual fun clusterRegCreateBatchNotifyPort(hkey: Hkey, phbatchnotifyport: MutPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegCreateBatchNotifyPort(hkey.rawAddress, phbatchnotifyport.rawAddress)

public actual fun clusterRegCreateKey(hkey: Hkey, lpszsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegCreateKey(hkey.rawAddress, lpszsubkey.rawAddress, dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress, phkresult.rawAddress, lpdwdisposition.rawAddress)

public actual fun clusterRegCreateKeyEx(hkey: Hkey, lpsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr, lpszreason: Pcwstr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegCreateKeyEx(hkey.rawAddress, lpsubkey.rawAddress, dwoptions.toInt(), samdesired.toInt(), lpsecurityattributes.rawAddress, phkresult.rawAddress, lpdwdisposition.rawAddress, lpszreason.rawAddress)

public actual fun clusterRegCreateReadBatch(hkey: Hkey, phregreadbatch: MutPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegCreateReadBatch(hkey.rawAddress, phregreadbatch.rawAddress)

public actual fun clusterRegDeleteKey(hkey: Hkey, lpszsubkey: Pcwstr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKey(hkey.rawAddress, lpszsubkey.rawAddress)

public actual fun clusterRegDeleteKeyEx(hkey: Hkey, lpsubkey: Pcwstr, lpszreason: Pcwstr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegDeleteKeyEx(hkey.rawAddress, lpsubkey.rawAddress, lpszreason.rawAddress)

public actual fun clusterRegDeleteValue(hkey: Hkey, lpszvaluename: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValue(hkey.rawAddress, lpszvaluename.rawAddress).toUInt()

public actual fun clusterRegDeleteValueEx(hkey: Hkey, lpszvaluename: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegDeleteValueEx(hkey.rawAddress, lpszvaluename.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun clusterRegEnumKey(hkey: Hkey, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr, lpftlastwritetime: MutPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegEnumKey(hkey.rawAddress, dwindex.toInt(), lpszname.rawAddress, lpcchname.rawAddress, lpftlastwritetime.rawAddress)

public actual fun clusterRegEnumValue(hkey: Hkey, dwindex: UInt, lpszvaluename: Pwstr, lpcchvaluename: MutPtr, lpdwtype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegEnumValue(hkey.rawAddress, dwindex.toInt(), lpszvaluename.rawAddress, lpcchvaluename.rawAddress, lpdwtype.rawAddress, lpdata.rawAddress, lpcbdata.rawAddress).toUInt()

public actual fun clusterRegGetBatchNotification(hbatchnotify: Hregbatchport, phbatchnotification: MutPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegGetBatchNotification(hbatchnotify, phbatchnotification.rawAddress)

public actual fun clusterRegGetKeySecurity(hkey: Hkey, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegGetKeySecurity(hkey.rawAddress, requestedinformation.toInt(), psecuritydescriptor.rawAddress, lpcbsecuritydescriptor.rawAddress)

public actual fun clusterRegOpenKey(hkey: Hkey, lpszsubkey: Pcwstr, samdesired: UInt, phkresult: MutPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegOpenKey(hkey.rawAddress, lpszsubkey.rawAddress, samdesired.toInt(), phkresult.rawAddress)

public actual fun clusterRegQueryInfoKey(hkey: Hkey, lpcsubkeys: ConstPtr, lpcchmaxsubkeylen: ConstPtr, lpcvalues: ConstPtr, lpcchmaxvaluenamelen: ConstPtr, lpcbmaxvaluelen: ConstPtr, lpcbsecuritydescriptor: ConstPtr, lpftlastwritetime: ConstPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegQueryInfoKey(hkey.rawAddress, lpcsubkeys.rawAddress, lpcchmaxsubkeylen.rawAddress, lpcvalues.rawAddress, lpcchmaxvaluenamelen.rawAddress, lpcbmaxvaluelen.rawAddress, lpcbsecuritydescriptor.rawAddress, lpftlastwritetime.rawAddress)

public actual fun clusterRegQueryValue(hkey: Hkey, lpszvaluename: Pcwstr, lpdwvaluetype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegQueryValue(hkey.rawAddress, lpszvaluename.rawAddress, lpdwvaluetype.rawAddress, lpdata.rawAddress, lpcbdata.rawAddress)

public actual fun clusterRegReadBatchAddCommand(hregreadbatch: Hregreadbatch, wzsubkeyname: Pcwstr, wzvaluename: Pcwstr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchAddCommand(hregreadbatch, wzsubkeyname.rawAddress, wzvaluename.rawAddress)

public actual fun clusterRegReadBatchReplyNextCommand(hregreadbatchreply: Hregreadbatchreply, pbatchcommand: MutPtr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegReadBatchReplyNextCommand(hregreadbatchreply, pbatchcommand.rawAddress)

public actual fun clusterRegSetKeySecurity(hkey: Hkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurity(hkey.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress)

public actual fun clusterRegSetKeySecurityEx(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpszreason: Pcwstr): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegSetKeySecurityEx(hkey.rawAddress, securityinformation.toInt(), psecuritydescriptor.rawAddress, lpszreason.rawAddress)

public actual fun clusterRegSetValue(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegSetValue(hkey.rawAddress, lpszvaluename.rawAddress, dwtype.toInt(), lpdata.rawAddress, cbdata.toInt()).toUInt()

public actual fun clusterRegSetValueEx(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegSetValueEx(hkey.rawAddress, lpszvaluename.rawAddress, dwtype.toInt(), lpdata.rawAddress, cbdata.toInt(), lpszreason.rawAddress).toUInt()

public actual fun clusterRegSyncDatabase(hcluster: Hcluster, flags: UInt): Int =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRegSyncDatabase(hcluster, flags.toInt())

public actual fun clusterRemoveAffinityRule(hcluster: Hcluster, rulename: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRemoveAffinityRule(hcluster, rulename.rawAddress).toUInt()

public actual fun clusterRemoveGroupFromAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromAffinityRule(hcluster, rulename.rawAddress, hgroup).toUInt()

public actual fun clusterRemoveGroupFromGroupSet(hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSet(hgroup).toUInt()

public actual fun clusterRemoveGroupFromGroupSetEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterRemoveGroupFromGroupSetEx(hgroup, lpszreason.rawAddress).toUInt()

public actual fun clusterResourceCloseEnum(hresenum: Hresenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnum(hresenum).toUInt()

public actual fun clusterResourceCloseEnumEx(hresourceenumex: Hresenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceCloseEnumEx(hresourceenumex).toUInt()

public actual fun clusterResourceControl(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceControl(hresource, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt(), lpoutbuffer.rawAddress, cboutbuffersize.toInt(), lpbytesreturned.rawAddress).toUInt()

public actual fun clusterResourceControlAsUser(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUser(hresource, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt(), lpoutbuffer.rawAddress, cboutbuffersize.toInt(), lpbytesreturned.rawAddress).toUInt()

public actual fun clusterResourceControlAsUserEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceControlAsUserEx(hresource, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt(), lpoutbuffer.rawAddress, cboutbuffersize.toInt(), lpbytesreturned.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun clusterResourceControlEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceControlEx(hresource, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt(), lpoutbuffer.rawAddress, cboutbuffersize.toInt(), lpbytesreturned.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun clusterResourceEnum(hresenum: Hresenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceEnum(hresenum, dwindex.toInt(), lpdwtype.rawAddress, lpszname.rawAddress, lpcchname.rawAddress).toUInt()

public actual fun clusterResourceEnumEx(hresourceenumex: Hresenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceEnumEx(hresourceenumex, dwindex.toInt(), pitem.rawAddress, cbitem.rawAddress).toUInt()

public actual fun clusterResourceGetEnumCount(hresenum: Hresenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCount(hresenum).toUInt()

public actual fun clusterResourceGetEnumCountEx(hresourceenumex: Hresenumex): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceGetEnumCountEx(hresourceenumex).toUInt()

public actual fun clusterResourceOpenEnum(hresource: Hresource, dwtype: UInt): Hresenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnum(hresource, dwtype.toInt())

public actual fun clusterResourceOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hresenumex =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceOpenEnumEx(hcluster, lpszproperties.rawAddress, cbproperties.toInt(), lpszroproperties.rawAddress, cbroproperties.toInt(), dwflags.toInt())

public actual fun clusterResourceTypeCloseEnum(hrestypeenum: Hrestypeenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeCloseEnum(hrestypeenum).toUInt()

public actual fun clusterResourceTypeControl(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControl(hcluster, lpszresourcetypename.rawAddress, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesreturned.rawAddress).toUInt()

public actual fun clusterResourceTypeControlAsUser(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUser(hcluster, lpszresourcetypename.rawAddress, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesreturned.rawAddress).toUInt()

public actual fun clusterResourceTypeControlAsUserEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlAsUserEx(hcluster, lpszresourcetypename.rawAddress, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesreturned.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun clusterResourceTypeControlEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeControlEx(hcluster, lpszresourcetypename.rawAddress, hhostnode, dwcontrolcode.toInt(), lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesreturned.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun clusterResourceTypeEnum(hrestypeenum: Hrestypeenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeEnum(hrestypeenum, dwindex.toInt(), lpdwtype.rawAddress, lpszname.rawAddress, lpcchname.rawAddress).toUInt()

public actual fun clusterResourceTypeGetEnumCount(hrestypeenum: Hrestypeenum): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeGetEnumCount(hrestypeenum).toUInt()

public actual fun clusterResourceTypeOpenEnum(hcluster: Hcluster, lpszresourcetypename: Pcwstr, dwtype: UInt): Hrestypeenum =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterResourceTypeOpenEnum(hcluster, lpszresourcetypename.rawAddress, dwtype.toInt())

public actual fun clusterSetAccountAccess(hcluster: Hcluster, szaccountsid: Pcwstr, dwaccess: UInt, dwcontroltype: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterSetAccountAccess(hcluster, szaccountsid.rawAddress, dwaccess.toInt(), dwcontroltype.toInt()).toUInt()

public actual fun clusterSharedVolumeSetSnapshotState(guidsnapshotset: Guid, lpszvolumename: Pcwstr, state: ClusterSharedVolumeSnapshotState): UInt =
    0u

public actual fun clusterUpgradeFunctionalLevel(hcluster: Hcluster, perform: Bool, pfnprogresscallback: PclusterUpgradeProgressCallback, pvcallbackarg: ConstPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringClusterUpgradeFunctionalLevel(hcluster, perform, 0L, pvcallbackarg.rawAddress).toUInt()

public actual fun createCluster(pconfig: ConstPtr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCreateCluster(pconfig.rawAddress, 0L, pvcallbackarg.rawAddress)

public actual fun createClusterAvailabilitySet(hcluster: Hcluster, lpavailabilitysetname: Pcwstr, pavailabilitysetconfig: ConstPtr): Hgroupset =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCreateClusterAvailabilitySet(hcluster, lpavailabilitysetname.rawAddress, pavailabilitysetconfig.rawAddress)

public actual fun createClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCreateClusterGroup(hcluster, lpszgroupname.rawAddress)

public actual fun createClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, pgroupinfo: ConstPtr): Hgroup =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCreateClusterGroupEx(hcluster, lpszgroupname.rawAddress, pgroupinfo.rawAddress)

public actual fun createClusterGroupSet(hcluster: Hcluster, groupsetname: Pcwstr): Hgroupset =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCreateClusterGroupSet(hcluster, groupsetname.rawAddress)

public actual fun createClusterNameAccount(hcluster: Hcluster, pconfig: ConstPtr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCreateClusterNameAccount(hcluster, pconfig.rawAddress, 0L, pvcallbackarg.rawAddress).toUInt()

public actual fun createClusterNotifyPort(hchange: Hchange, hcluster: Hcluster, dwfilter: UInt, dwnotifykey: ULong): Hchange =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPort(hchange, hcluster, dwfilter.toInt(), dwnotifykey.toLong())

public actual fun createClusterNotifyPortV2(hchange: Hchange, hcluster: Hcluster, filters: ConstPtr, dwfiltercount: UInt, dwnotifykey: ULong): Hchange =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCreateClusterNotifyPortV2(hchange, hcluster, filters.rawAddress, dwfiltercount.toInt(), dwnotifykey.toLong())

public actual fun createClusterResource(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCreateClusterResource(hgroup, lpszresourcename.rawAddress, lpszresourcetype.rawAddress, dwflags.toInt())

public actual fun createClusterResourceEx(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt, lpszreason: Pcwstr): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCreateClusterResourceEx(hgroup, lpszresourcename.rawAddress, lpszresourcetype.rawAddress, dwflags.toInt(), lpszreason.rawAddress)

public actual fun createClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCreateClusterResourceType(hcluster, lpszresourcetypename.rawAddress, lpszdisplayname.rawAddress, lpszresourcetypedll.rawAddress, dwlooksalivepollinterval.toInt(), dwisalivepollinterval.toInt()).toUInt()

public actual fun createClusterResourceTypeEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringCreateClusterResourceTypeEx(hcluster, lpszresourcetypename.rawAddress, lpszdisplayname.rawAddress, lpszresourcetypedll.rawAddress, dwlooksalivepollinterval.toInt(), dwisalivepollinterval.toInt(), lpszreason.rawAddress).toUInt()

public actual fun deleteClusterGroup(hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringDeleteClusterGroup(hgroup).toUInt()

public actual fun deleteClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupEx(hgroup, lpszreason.rawAddress).toUInt()

public actual fun deleteClusterGroupSet(hgroupset: Hgroupset): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSet(hgroupset).toUInt()

public actual fun deleteClusterGroupSetEx(hgroupset: Hgroupset, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringDeleteClusterGroupSetEx(hgroupset, lpszreason.rawAddress).toUInt()

public actual fun deleteClusterResource(hresource: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringDeleteClusterResource(hresource).toUInt()

public actual fun deleteClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceEx(hresource, lpszreason.rawAddress).toUInt()

public actual fun deleteClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceType(hcluster, lpszresourcetypename.rawAddress).toUInt()

public actual fun deleteClusterResourceTypeEx(hcluster: Hcluster, lpsztypename: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringDeleteClusterResourceTypeEx(hcluster, lpsztypename.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun destroyCluster(hcluster: Hcluster, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr, fdeletevirtualcomputerobjects: Bool): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringDestroyCluster(hcluster, 0L, pvcallbackarg.rawAddress, fdeletevirtualcomputerobjects).toUInt()

public actual fun destroyClusterGroup(hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringDestroyClusterGroup(hgroup).toUInt()

public actual fun destroyClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringDestroyClusterGroupEx(hgroup, lpszreason.rawAddress).toUInt()

public actual fun determineCNOResTypeFromCluster(hcluster: Hcluster, pcnorestype: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromCluster(hcluster, pcnorestype.rawAddress).toUInt()

public actual fun determineCNOResTypeFromNodelist(cnodes: UInt, ppsznodenames: ConstPtr, pcnorestype: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringDetermineCNOResTypeFromNodelist(cnodes.toInt(), ppsznodenames.rawAddress, pcnorestype.rawAddress).toUInt()

public actual fun determineClusterCloudTypeFromCluster(hcluster: Hcluster, pcloudtype: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromCluster(hcluster, pcloudtype.rawAddress).toUInt()

public actual fun determineClusterCloudTypeFromNodelist(cnodes: UInt, ppsznodenames: ConstPtr, pcloudtype: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringDetermineClusterCloudTypeFromNodelist(cnodes.toInt(), ppsznodenames.rawAddress, pcloudtype.rawAddress).toUInt()

public actual fun evictClusterNode(hnode: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringEvictClusterNode(hnode).toUInt()

public actual fun evictClusterNodeEx(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx(hnode, dwtimeout.toInt(), phrcleanupstatus.rawAddress).toUInt()

public actual fun evictClusterNodeEx2(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: MutPtr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringEvictClusterNodeEx2(hnode, dwtimeout.toInt(), phrcleanupstatus.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun failClusterResource(hresource: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringFailClusterResource(hresource).toUInt()

public actual fun failClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringFailClusterResourceEx(hresource, lpszreason.rawAddress).toUInt()

public actual fun freeClusterCrypt(pcryptinfo: ConstPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringFreeClusterCrypt(pcryptinfo.rawAddress).toUInt()

public actual fun freeClusterHealthFault(clusterhealthfault: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFault(clusterhealthfault.rawAddress).toUInt()

public actual fun freeClusterHealthFaultArray(clusterhealthfaultarray: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringFreeClusterHealthFaultArray(clusterhealthfaultarray.rawAddress).toUInt()

public actual fun getClusterFromGroup(hgroup: Hgroup): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterFromGroup(hgroup)

public actual fun getClusterFromNetInterface(hnetinterface: Hnetinterface): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterFromNetInterface(hnetinterface)

public actual fun getClusterFromNetwork(hnetwork: Hnetwork): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterFromNetwork(hnetwork)

public actual fun getClusterFromNode(hnode: Hnode): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterFromNode(hnode)

public actual fun getClusterFromResource(hresource: Hresource): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterFromResource(hresource)

public actual fun getClusterGroupKey(hgroup: Hgroup, samdesired: UInt): Hkey =
    MutPtr(WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterGroupKey(hgroup, samdesired.toInt()))

public actual fun getClusterGroupState(hgroup: Hgroup, lpsznodename: Pwstr, lpcchnodename: MutPtr): ClusterGroupState =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterGroupState(hgroup, lpsznodename.rawAddress, lpcchnodename.rawAddress)

public actual fun getClusterInformation(hcluster: Hcluster, lpszclustername: Pwstr, lpcchclustername: MutPtr, lpclusterinfo: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterInformation(hcluster, lpszclustername.rawAddress, lpcchclustername.rawAddress, lpclusterinfo.rawAddress).toUInt()

public actual fun getClusterKey(hcluster: Hcluster, samdesired: UInt): Hkey =
    MutPtr(WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterKey(hcluster, samdesired.toInt()))

public actual fun getClusterNetInterface(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr, lpszinterfacename: Pwstr, lpcchinterfacename: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterNetInterface(hcluster, lpsznodename.rawAddress, lpsznetworkname.rawAddress, lpszinterfacename.rawAddress, lpcchinterfacename.rawAddress).toUInt()

public actual fun getClusterNetInterfaceKey(hnetinterface: Hnetinterface, samdesired: UInt): Hkey =
    MutPtr(WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceKey(hnetinterface, samdesired.toInt()))

public actual fun getClusterNetInterfaceState(hnetinterface: Hnetinterface): ClusterNetinterfaceState =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterNetInterfaceState(hnetinterface)

public actual fun getClusterNetworkId(hnetwork: Hnetwork, lpsznetworkid: Pwstr, lpcchname: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterNetworkId(hnetwork, lpsznetworkid.rawAddress, lpcchname.rawAddress).toUInt()

public actual fun getClusterNetworkKey(hnetwork: Hnetwork, samdesired: UInt): Hkey =
    MutPtr(WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterNetworkKey(hnetwork, samdesired.toInt()))

public actual fun getClusterNetworkState(hnetwork: Hnetwork): ClusterNetworkState =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterNetworkState(hnetwork)

public actual fun getClusterNodeId(hnode: Hnode, lpsznodeid: Pwstr, lpcchname: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterNodeId(hnode, lpsznodeid.rawAddress, lpcchname.rawAddress).toUInt()

public actual fun getClusterNodeKey(hnode: Hnode, samdesired: UInt): Hkey =
    MutPtr(WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterNodeKey(hnode, samdesired.toInt()))

public actual fun getClusterNodeState(hnode: Hnode): ClusterNodeState =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterNodeState(hnode)

public actual fun getClusterNotify(hchange: Hchange, lpdwnotifykey: MutPtr, lpdwfiltertype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr, dwmilliseconds: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterNotify(hchange, lpdwnotifykey.rawAddress, lpdwfiltertype.rawAddress, lpszname.rawAddress, lpcchname.rawAddress, dwmilliseconds.toInt()).toUInt()

public actual fun getClusterNotifyV2(hchange: Hchange, lpdwnotifykey: MutPtr, pfilterandtype: MutPtr, buffer: MutPtr, lpbbuffersize: MutPtr, lpszobjectid: Pwstr, lpcchobjectid: MutPtr, lpszparentid: Pwstr, lpcchparentid: MutPtr, lpszname: Pwstr, lpcchname: MutPtr, lpsztype: Pwstr, lpcchtype: MutPtr, dwmilliseconds: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterNotifyV2(hchange, lpdwnotifykey.rawAddress, pfilterandtype.rawAddress, buffer.rawAddress, lpbbuffersize.rawAddress, lpszobjectid.rawAddress, lpcchobjectid.rawAddress, lpszparentid.rawAddress, lpcchparentid.rawAddress, lpszname.rawAddress, lpcchname.rawAddress, lpsztype.rawAddress, lpcchtype.rawAddress, dwmilliseconds.toInt()).toUInt()

public actual fun getClusterQuorumResource(hcluster: Hcluster, lpszresourcename: Pwstr, lpcchresourcename: MutPtr, lpszdevicename: Pwstr, lpcchdevicename: MutPtr, lpdwmaxquorumlogsize: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterQuorumResource(hcluster, lpszresourcename.rawAddress, lpcchresourcename.rawAddress, lpszdevicename.rawAddress, lpcchdevicename.rawAddress, lpdwmaxquorumlogsize.rawAddress).toUInt()

public actual fun getClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pwstr, lpcchdependencyexpression: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterResourceDependencyExpression(hresource, lpszdependencyexpression.rawAddress, lpcchdependencyexpression.rawAddress).toUInt()

public actual fun getClusterResourceKey(hresource: Hresource, samdesired: UInt): Hkey =
    MutPtr(WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterResourceKey(hresource, samdesired.toInt()))

public actual fun getClusterResourceNetworkName(hresource: Hresource, lpbuffer: Pwstr, nsize: MutPtr): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterResourceNetworkName(hresource, lpbuffer.rawAddress, nsize.rawAddress)

public actual fun getClusterResourceState(hresource: Hresource, lpsznodename: Pwstr, lpcchnodename: MutPtr, lpszgroupname: Pwstr, lpcchgroupname: MutPtr): ClusterResourceState =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterResourceState(hresource, lpsznodename.rawAddress, lpcchnodename.rawAddress, lpszgroupname.rawAddress, lpcchgroupname.rawAddress)

public actual fun getClusterResourceTypeKey(hcluster: Hcluster, lpsztypename: Pcwstr, samdesired: UInt): Hkey =
    MutPtr(WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetClusterResourceTypeKey(hcluster, lpsztypename.rawAddress, samdesired.toInt()))

public actual fun getNodeCloudTypeDW(ppsznodename: Pcwstr, nodecloudtype: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetNodeCloudTypeDW(ppsznodename.rawAddress, nodecloudtype.rawAddress).toUInt()

public actual fun getNodeClusterState(lpsznodename: Pcwstr, pdwclusterstate: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetNodeClusterState(lpsznodename.rawAddress, pdwclusterstate.rawAddress).toUInt()

public actual fun getNotifyEventHandle(hchange: Hchange, lphtargetevent: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringGetNotifyEventHandle(hchange, lphtargetevent.rawAddress).toUInt()

public actual fun initializeClusterHealthFault(clusterhealthfault: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFault(clusterhealthfault.rawAddress).toUInt()

public actual fun initializeClusterHealthFaultArray(clusterhealthfaultarray: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringInitializeClusterHealthFaultArray(clusterhealthfaultarray.rawAddress).toUInt()

public actual fun isFileOnClusterSharedVolume(lpszpathname: Pcwstr, pbfileisonsharedvolume: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringIsFileOnClusterSharedVolume(lpszpathname.rawAddress, pbfileisonsharedvolume.rawAddress).toUInt()

public actual fun moveClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringMoveClusterGroup(hgroup, hdestinationnode).toUInt()

public actual fun moveClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx(hgroup, hdestinationnode, dwmoveflags.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt()).toUInt()

public actual fun moveClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringMoveClusterGroupEx2(hgroup, hdestinationnode, dwmoveflags.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt(), lpszreason.rawAddress).toUInt()

public actual fun offlineClusterGroup(hgroup: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOfflineClusterGroup(hgroup).toUInt()

public actual fun offlineClusterGroupEx(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx(hgroup, dwofflineflags.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt()).toUInt()

public actual fun offlineClusterGroupEx2(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOfflineClusterGroupEx2(hgroup, dwofflineflags.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt(), lpszreason.rawAddress).toUInt()

public actual fun offlineClusterResource(hresource: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOfflineClusterResource(hresource).toUInt()

public actual fun offlineClusterResourceEx(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx(hresource, dwofflineflags.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt()).toUInt()

public actual fun offlineClusterResourceEx2(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOfflineClusterResourceEx2(hresource, dwofflineflags.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt(), lpszreason.rawAddress).toUInt()

public actual fun onlineClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOnlineClusterGroup(hgroup, hdestinationnode).toUInt()

public actual fun onlineClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx(hgroup, hdestinationnode, dwonlineflags.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt()).toUInt()

public actual fun onlineClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOnlineClusterGroupEx2(hgroup, hdestinationnode, dwonlineflags.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt(), lpszreason.rawAddress).toUInt()

public actual fun onlineClusterResource(hresource: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOnlineClusterResource(hresource).toUInt()

public actual fun onlineClusterResourceEx(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx(hresource, dwonlineflags.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt()).toUInt()

public actual fun onlineClusterResourceEx2(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOnlineClusterResourceEx2(hresource, dwonlineflags.toInt(), lpinbuffer.rawAddress, cbinbuffersize.toInt(), lpszreason.rawAddress).toUInt()

public actual fun openCluster(lpszclustername: Pcwstr): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenCluster(lpszclustername.rawAddress)

public actual fun openClusterCryptProvider(lpszresource: Pcwstr, lpszprovider: ConstPtr, dwtype: UInt, dwflags: UInt): Hcluscryptprovider =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProvider(lpszresource.rawAddress, lpszprovider.rawAddress, dwtype.toInt(), dwflags.toInt())

public actual fun openClusterCryptProviderEx(lpszresource: Pcwstr, lpszkeyname: Pcwstr, lpszprovider: ConstPtr, dwtype: UInt, dwflags: UInt): Hcluscryptprovider =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenClusterCryptProviderEx(lpszresource.rawAddress, lpszkeyname.rawAddress, lpszprovider.rawAddress, dwtype.toInt(), dwflags.toInt())

public actual fun openClusterEx(lpszclustername: Pcwstr, desiredaccess: UInt, grantedaccess: MutPtr): Hcluster =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenClusterEx(lpszclustername.rawAddress, desiredaccess.toInt(), grantedaccess.rawAddress)

public actual fun openClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenClusterGroup(hcluster, lpszgroupname.rawAddress)

public actual fun openClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hgroup =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenClusterGroupEx(hcluster, lpszgroupname.rawAddress, dwdesiredaccess.toInt(), lpdwgrantedaccess.rawAddress)

public actual fun openClusterGroupSet(hcluster: Hcluster, lpszgroupsetname: Pcwstr): Hgroupset =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenClusterGroupSet(hcluster, lpszgroupsetname.rawAddress)

public actual fun openClusterNetInterface(hcluster: Hcluster, lpszinterfacename: Pcwstr): Hnetinterface =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterface(hcluster, lpszinterfacename.rawAddress)

public actual fun openClusterNetInterfaceEx(hcluster: Hcluster, lpszinterfacename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hnetinterface =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenClusterNetInterfaceEx(hcluster, lpszinterfacename.rawAddress, dwdesiredaccess.toInt(), lpdwgrantedaccess.rawAddress)

public actual fun openClusterNetwork(hcluster: Hcluster, lpsznetworkname: Pcwstr): Hnetwork =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenClusterNetwork(hcluster, lpsznetworkname.rawAddress)

public actual fun openClusterNetworkEx(hcluster: Hcluster, lpsznetworkname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hnetwork =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenClusterNetworkEx(hcluster, lpsznetworkname.rawAddress, dwdesiredaccess.toInt(), lpdwgrantedaccess.rawAddress)

public actual fun openClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr): Hnode =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenClusterNode(hcluster, lpsznodename.rawAddress)

public actual fun openClusterNodeById(hcluster: Hcluster, nodeid: UInt): Hnode =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenClusterNodeById(hcluster, nodeid.toInt())

public actual fun openClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hnode =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenClusterNodeEx(hcluster, lpsznodename.rawAddress, dwdesiredaccess.toInt(), lpdwgrantedaccess.rawAddress)

public actual fun openClusterResource(hcluster: Hcluster, lpszresourcename: Pcwstr): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenClusterResource(hcluster, lpszresourcename.rawAddress)

public actual fun openClusterResourceEx(hcluster: Hcluster, lpszresourcename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringOpenClusterResourceEx(hcluster, lpszresourcename.rawAddress, dwdesiredaccess.toInt(), lpdwgrantedaccess.rawAddress)

public actual fun pauseClusterNode(hnode: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringPauseClusterNode(hnode).toUInt()

public actual fun pauseClusterNodeEx(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx(hnode, bdrainnode, dwpauseflags.toInt(), hnodedraintarget).toUInt()

public actual fun pauseClusterNodeEx2(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringPauseClusterNodeEx2(hnode, bdrainnode, dwpauseflags.toInt(), hnodedraintarget, lpszreason.rawAddress).toUInt()

public actual fun queryAppInstanceVersion(appinstanceid: ConstPtr, instanceversionhigh: MutPtr, instanceversionlow: MutPtr, versionstatus: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringQueryAppInstanceVersion(appinstanceid.rawAddress, instanceversionhigh.rawAddress, instanceversionlow.rawAddress, versionstatus.rawAddress).toUInt()

public actual fun registerAppInstance(processhandle: Handle, appinstanceid: ConstPtr, childreninheritappinstance: Bool): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRegisterAppInstance(processhandle.rawAddress, appinstanceid.rawAddress, childreninheritappinstance).toUInt()

public actual fun registerAppInstanceVersion(appinstanceid: ConstPtr, instanceversionhigh: ULong, instanceversionlow: ULong): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRegisterAppInstanceVersion(appinstanceid.rawAddress, instanceversionhigh.toLong(), instanceversionlow.toLong()).toUInt()

public actual fun registerClusterNotify(hchange: Hchange, dwfiltertype: UInt, hobject: Handle, dwnotifykey: ULong): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRegisterClusterNotify(hchange, dwfiltertype.toInt(), hobject.rawAddress, dwnotifykey.toLong()).toUInt()

public actual fun registerClusterNotifyV2(hchange: Hchange, filter: NotifyFilterAndType, hobject: Handle, dwnotifykey: ULong): UInt =
    0u

public actual fun registerClusterResourceTypeNotifyV2(hchange: Hchange, hcluster: Hcluster, flags: Long, restypename: Pcwstr, dwnotifykey: ULong): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRegisterClusterResourceTypeNotifyV2(hchange, hcluster, flags, restypename.rawAddress, dwnotifykey.toLong()).toUInt()

public actual fun removeClusterGroupDependency(hgroup: Hgroup, hdependson: Hgroup): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependency(hgroup, hdependson).toUInt()

public actual fun removeClusterGroupDependencyEx(hgroup: Hgroup, hdependson: Hgroup, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupDependencyEx(hgroup, hdependson, lpszreason.rawAddress).toUInt()

public actual fun removeClusterGroupSetDependency(hgroupset: Hgroupset, hdependson: Hgroupset): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependency(hgroupset, hdependson).toUInt()

public actual fun removeClusterGroupSetDependencyEx(hgroupset: Hgroupset, hdependson: Hgroupset, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupSetDependencyEx(hgroupset, hdependson, lpszreason.rawAddress).toUInt()

public actual fun removeClusterGroupToGroupSetDependency(hgroup: Hgroup, hdependson: Hgroupset): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependency(hgroup, hdependson).toUInt()

public actual fun removeClusterGroupToGroupSetDependencyEx(hgroup: Hgroup, hdependson: Hgroupset, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRemoveClusterGroupToGroupSetDependencyEx(hgroup, hdependson, lpszreason.rawAddress).toUInt()

public actual fun removeClusterNameAccount(hcluster: Hcluster, bdeletecomputerobjects: Bool): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRemoveClusterNameAccount(hcluster, bdeletecomputerobjects).toUInt()

public actual fun removeClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependency(hresource, hdependson).toUInt()

public actual fun removeClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceDependencyEx(hresource, hdependson, lpszreason.rawAddress).toUInt()

public actual fun removeClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNode(hresource, hnode).toUInt()

public actual fun removeClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRemoveClusterResourceNodeEx(hresource, hnode, lpszreason.rawAddress).toUInt()

public actual fun removeClusterStorageNode(hcluster: Hcluster, lpszclusterstorageenclosurename: Pcwstr, dwtimeout: UInt, dwflags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRemoveClusterStorageNode(hcluster, lpszclusterstorageenclosurename.rawAddress, dwtimeout.toInt(), dwflags.toInt()).toUInt()

public actual fun removeCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRemoveCrossClusterGroupSetDependency(hdependentgroupset, lpremoteclustername.rawAddress, lpremotegroupsetname.rawAddress).toUInt()

public actual fun removeResourceFromClusterSharedVolumes(hresource: Hresource): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRemoveResourceFromClusterSharedVolumes(hresource).toUInt()

public actual fun resUtilAddUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutpropertylist: MutPtr, pcboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilAddUnknownProperties(hkeyclusterkey.rawAddress, ppropertytable.rawAddress, poutpropertylist.rawAddress, pcboutpropertylistsize.toInt(), pcbbytesreturned.rawAddress, pcbrequired.rawAddress).toUInt()

public actual fun resUtilCreateDirectoryTree(pszpath: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilCreateDirectoryTree(pszpath.rawAddress).toUInt()

public actual fun resUtilDupGroup(group: Hgroup, copy: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilDupGroup(group, copy.rawAddress).toUInt()

public actual fun resUtilDupParameterBlock(poutparams: MutPtr, pinparams: ConstPtr, ppropertytable: ConstPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilDupParameterBlock(poutparams.rawAddress, pinparams.rawAddress, ppropertytable.rawAddress).toUInt()

public actual fun resUtilDupResource(group: Hresource, copy: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilDupResource(group, copy.rawAddress).toUInt()

public actual fun resUtilDupString(pszinstring: Pcwstr): Pwstr =
    MutPtr(WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilDupString(pszinstring.rawAddress))

public actual fun resUtilEnumGroups(hcluster: Hcluster, hself: Hgroup, prescallback: LpgroupCallbackEx, pparameter: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilEnumGroups(hcluster, hself, 0L, pparameter.rawAddress).toUInt()

public actual fun resUtilEnumGroupsEx(hcluster: Hcluster, hself: Hgroup, grouptype: ClusgroupType, prescallback: LpgroupCallbackEx, pparameter: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilEnumGroupsEx(hcluster, hself, grouptype, 0L, pparameter.rawAddress).toUInt()

public actual fun resUtilEnumPrivateProperties(hkeyclusterkey: Hkey, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilEnumPrivateProperties(hkeyclusterkey.rawAddress, pszoutproperties.rawAddress, cboutpropertiessize.toInt(), pcbbytesreturned.rawAddress, pcbrequired.rawAddress).toUInt()

public actual fun resUtilEnumProperties(ppropertytable: ConstPtr, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilEnumProperties(ppropertytable.rawAddress, pszoutproperties.rawAddress, cboutpropertiessize.toInt(), pcbbytesreturned.rawAddress, pcbrequired.rawAddress).toUInt()

public actual fun resUtilEnumResources(hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallback, pparameter: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilEnumResources(hself, lpszrestypename.rawAddress, 0L, pparameter.rawAddress).toUInt()

public actual fun resUtilEnumResourcesEx(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx(hcluster, hself, lpszrestypename.rawAddress, 0L, pparameter.rawAddress).toUInt()

public actual fun resUtilEnumResourcesEx2(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: MutPtr, dwdesiredaccess: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilEnumResourcesEx2(hcluster, hself, lpszrestypename.rawAddress, 0L, pparameter.rawAddress, dwdesiredaccess.toInt()).toUInt()

public actual fun resUtilExpandEnvironmentStrings(pszsrc: Pcwstr): Pwstr =
    MutPtr(WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilExpandEnvironmentStrings(pszsrc.rawAddress))

public actual fun resUtilFindBinaryProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pbpropertyvalue: MutPtr, pcbpropertyvaluesize: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilFindBinaryProperty(ppropertylist.rawAddress, cbpropertylistsize.toInt(), pszpropertyname.rawAddress, pbpropertyvalue.rawAddress, pcbpropertyvaluesize.rawAddress).toUInt()

public actual fun resUtilFindDependentDiskResourceDriveLetter(hcluster: Hcluster, hresource: Hresource, pszdriveletter: Pwstr, pcchdriveletter: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilFindDependentDiskResourceDriveLetter(hcluster, hresource, pszdriveletter.rawAddress, pcchdriveletter.rawAddress).toUInt()

public actual fun resUtilFindDwordProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pdwpropertyvalue: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilFindDwordProperty(ppropertylist.rawAddress, cbpropertylistsize.toInt(), pszpropertyname.rawAddress, pdwpropertyvalue.rawAddress).toUInt()

public actual fun resUtilFindExpandSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilFindExpandSzProperty(ppropertylist.rawAddress, cbpropertylistsize.toInt(), pszpropertyname.rawAddress, pszpropertyvalue.rawAddress).toUInt()

public actual fun resUtilFindExpandedSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilFindExpandedSzProperty(ppropertylist.rawAddress, cbpropertylistsize.toInt(), pszpropertyname.rawAddress, pszpropertyvalue.rawAddress).toUInt()

public actual fun resUtilFindFileTimeProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pftpropertyvalue: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilFindFileTimeProperty(ppropertylist.rawAddress, cbpropertylistsize.toInt(), pszpropertyname.rawAddress, pftpropertyvalue.rawAddress).toUInt()

public actual fun resUtilFindLongProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilFindLongProperty(ppropertylist.rawAddress, cbpropertylistsize.toInt(), pszpropertyname.rawAddress, plpropertyvalue.rawAddress).toUInt()

public actual fun resUtilFindMultiSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr, pcbpropertyvaluesize: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilFindMultiSzProperty(ppropertylist.rawAddress, cbpropertylistsize.toInt(), pszpropertyname.rawAddress, pszpropertyvalue.rawAddress, pcbpropertyvaluesize.rawAddress).toUInt()

public actual fun resUtilFindSzProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilFindSzProperty(ppropertylist.rawAddress, cbpropertylistsize.toInt(), pszpropertyname.rawAddress, pszpropertyvalue.rawAddress).toUInt()

public actual fun resUtilFindULargeIntegerProperty(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilFindULargeIntegerProperty(ppropertylist.rawAddress, cbpropertylistsize.toInt(), pszpropertyname.rawAddress, plpropertyvalue.rawAddress).toUInt()

public actual fun resUtilFreeEnvironment(lpenvironment: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilFreeEnvironment(lpenvironment.rawAddress).toUInt()

public actual fun resUtilFreeParameterBlock(poutparams: MutPtr, pinparams: ConstPtr, ppropertytable: ConstPtr) {
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilFreeParameterBlock(poutparams.rawAddress, pinparams.rawAddress, ppropertytable.rawAddress)
}

public actual fun resUtilGetAllProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutpropertylist: MutPtr, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetAllProperties(hkeyclusterkey.rawAddress, ppropertytable.rawAddress, poutpropertylist.rawAddress, cboutpropertylistsize.toInt(), pcbbytesreturned.rawAddress, pcbrequired.rawAddress).toUInt()

public actual fun resUtilGetBinaryProperty(ppboutvalue: MutPtr, pcboutvaluesize: MutPtr, pvaluestruct: ConstPtr, pboldvalue: ConstPtr, cboldvaluesize: UInt, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryProperty(ppboutvalue.rawAddress, pcboutvaluesize.rawAddress, pvaluestruct.rawAddress, pboldvalue.rawAddress, cboldvaluesize.toInt(), pppropertylist.rawAddress, pcbpropertylistsize.rawAddress).toUInt()

public actual fun resUtilGetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, ppboutvalue: MutPtr, pcboutvaluesize: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetBinaryValue(hkeyclusterkey.rawAddress, pszvaluename.rawAddress, ppboutvalue.rawAddress, pcboutvaluesize.rawAddress).toUInt()

public actual fun resUtilGetClusterGroupType(hgroup: Hgroup, grouptype: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetClusterGroupType(hgroup, grouptype.rawAddress).toUInt()

public actual fun resUtilGetClusterId(hcluster: Hcluster, guid: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetClusterId(hcluster, guid.rawAddress).toUInt()

public actual fun resUtilGetClusterRoleState(hcluster: Hcluster, eclusterrole: ClusterRole): ClusterRoleState =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetClusterRoleState(hcluster, eclusterrole)

public actual fun resUtilGetCoreClusterResources(hcluster: Hcluster, phclusternameresource: MutPtr, phclusteripaddressresource: MutPtr, phclusterquorumresource: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResources(hcluster, phclusternameresource.rawAddress, phclusteripaddressresource.rawAddress, phclusterquorumresource.rawAddress).toUInt()

public actual fun resUtilGetCoreClusterResourcesEx(hclusterin: Hcluster, phclusternameresourceout: MutPtr, phclusterquorumresourceout: MutPtr, dwdesiredaccess: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetCoreClusterResourcesEx(hclusterin, phclusternameresourceout.rawAddress, phclusterquorumresourceout.rawAddress, dwdesiredaccess.toInt()).toUInt()

public actual fun resUtilGetCoreGroup(hcluster: Hcluster): Hgroup =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetCoreGroup(hcluster)

public actual fun resUtilGetDwordProperty(pdwoutvalue: MutPtr, pvaluestruct: ConstPtr, dwoldvalue: UInt, dwminimum: UInt, dwmaximum: UInt, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetDwordProperty(pdwoutvalue.rawAddress, pvaluestruct.rawAddress, dwoldvalue.toInt(), dwminimum.toInt(), dwmaximum.toInt(), pppropertylist.rawAddress, pcbpropertylistsize.rawAddress).toUInt()

public actual fun resUtilGetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pdwoutvalue: MutPtr, dwdefaultvalue: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetDwordValue(hkeyclusterkey.rawAddress, pszvaluename.rawAddress, pdwoutvalue.rawAddress, dwdefaultvalue.toInt()).toUInt()

public actual fun resUtilGetEnvironmentWithNetName(hresource: Hresource): MutPtr =
    MutPtr(WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetEnvironmentWithNetName(hresource))

public actual fun resUtilGetFileTimeProperty(pftoutvalue: MutPtr, pvaluestruct: ConstPtr, ftoldvalue: Filetime, ftminimum: Filetime, ftmaximum: Filetime, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    0u

public actual fun resUtilGetLongProperty(ploutvalue: MutPtr, pvaluestruct: ConstPtr, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetLongProperty(ploutvalue.rawAddress, pvaluestruct.rawAddress, loldvalue, lminimum, lmaximum, pppropertylist.rawAddress, pcbpropertylistsize.rawAddress).toUInt()

public actual fun resUtilGetMultiSzProperty(ppszoutvalue: MutPtr, pcboutvaluesize: MutPtr, pvaluestruct: ConstPtr, pszoldvalue: Pcwstr, cboldvaluesize: UInt, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetMultiSzProperty(ppszoutvalue.rawAddress, pcboutvaluesize.rawAddress, pvaluestruct.rawAddress, pszoldvalue.rawAddress, cboldvaluesize.toInt(), pppropertylist.rawAddress, pcbpropertylistsize.rawAddress).toUInt()

public actual fun resUtilGetPrivateProperties(hkeyclusterkey: Hkey, poutpropertylist: MutPtr, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetPrivateProperties(hkeyclusterkey.rawAddress, poutpropertylist.rawAddress, cboutpropertylistsize.toInt(), pcbbytesreturned.rawAddress, pcbrequired.rawAddress).toUInt()

public actual fun resUtilGetProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutpropertylist: MutPtr, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetProperties(hkeyclusterkey.rawAddress, ppropertytable.rawAddress, poutpropertylist.rawAddress, cboutpropertylistsize.toInt(), pcbbytesreturned.rawAddress, pcbrequired.rawAddress).toUInt()

public actual fun resUtilGetPropertiesToParameterBlock(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutparams: MutPtr, bcheckforrequiredproperties: Bool, psznameofpropinerror: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetPropertiesToParameterBlock(hkeyclusterkey.rawAddress, ppropertytable.rawAddress, poutparams.rawAddress, bcheckforrequiredproperties, psznameofpropinerror.rawAddress).toUInt()

public actual fun resUtilGetProperty(hkeyclusterkey: Hkey, ppropertytableitem: ConstPtr, poutpropertyitem: MutPtr, pcboutpropertyitemsize: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetProperty(hkeyclusterkey.rawAddress, ppropertytableitem.rawAddress, poutpropertyitem.rawAddress, pcboutpropertyitemsize.rawAddress).toUInt()

public actual fun resUtilGetPropertyFormats(ppropertytable: ConstPtr, poutpropertyformatlist: MutPtr, cbpropertyformatlistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetPropertyFormats(ppropertytable.rawAddress, poutpropertyformatlist.rawAddress, cbpropertyformatlistsize.toInt(), pcbbytesreturned.rawAddress, pcbrequired.rawAddress).toUInt()

public actual fun resUtilGetPropertySize(hkeyclusterkey: Hkey, ppropertytableitem: ConstPtr, pcboutpropertylistsize: MutPtr, pnpropertycount: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetPropertySize(hkeyclusterkey.rawAddress, ppropertytableitem.rawAddress, pcboutpropertylistsize.rawAddress, pnpropertycount.rawAddress).toUInt()

public actual fun resUtilGetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pqwoutvalue: MutPtr, qwdefaultvalue: ULong): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetQwordValue(hkeyclusterkey.rawAddress, pszvaluename.rawAddress, pqwoutvalue.rawAddress, qwdefaultvalue.toLong()).toUInt()

public actual fun resUtilGetResourceDependency(hself: Handle, lpszresourcetype: Pcwstr): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependency(hself.rawAddress, lpszresourcetype.rawAddress)

public actual fun resUtilGetResourceDependencyByClass(hcluster: Hcluster, hself: Handle, prci: MutPtr, brecurse: Bool): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClass(hcluster, hself.rawAddress, prci.rawAddress, brecurse)

public actual fun resUtilGetResourceDependencyByClassEx(hcluster: Hcluster, hself: Handle, prci: MutPtr, brecurse: Bool, dwdesiredaccess: UInt): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByClassEx(hcluster, hself.rawAddress, prci.rawAddress, brecurse, dwdesiredaccess.toInt())

public actual fun resUtilGetResourceDependencyByName(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByName(hcluster, hself.rawAddress, lpszresourcetype.rawAddress, brecurse)

public actual fun resUtilGetResourceDependencyByNameEx(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool, dwdesiredaccess: UInt): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyByNameEx(hcluster, hself.rawAddress, lpszresourcetype.rawAddress, brecurse, dwdesiredaccess.toInt())

public actual fun resUtilGetResourceDependencyEx(hself: Handle, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependencyEx(hself.rawAddress, lpszresourcetype.rawAddress, dwdesiredaccess.toInt())

public actual fun resUtilGetResourceDependentIPAddressProps(hresource: Hresource, pszaddress: Pwstr, pcchaddress: MutPtr, pszsubnetmask: Pwstr, pcchsubnetmask: MutPtr, psznetwork: Pwstr, pcchnetwork: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceDependentIPAddressProps(hresource, pszaddress.rawAddress, pcchaddress.rawAddress, pszsubnetmask.rawAddress, pcchsubnetmask.rawAddress, psznetwork.rawAddress, pcchnetwork.rawAddress).toUInt()

public actual fun resUtilGetResourceName(hresource: Hresource, pszresourcename: Pwstr, pcchresourcenameinout: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceName(hresource, pszresourcename.rawAddress, pcchresourcenameinout.rawAddress).toUInt()

public actual fun resUtilGetResourceNameDependency(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependency(lpszresourcename.rawAddress, lpszresourcetype.rawAddress)

public actual fun resUtilGetResourceNameDependencyEx(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetResourceNameDependencyEx(lpszresourcename.rawAddress, lpszresourcetype.rawAddress, dwdesiredaccess.toInt())

public actual fun resUtilGetSzProperty(ppszoutvalue: MutPtr, pvaluestruct: ConstPtr, pszoldvalue: Pcwstr, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetSzProperty(ppszoutvalue.rawAddress, pvaluestruct.rawAddress, pszoldvalue.rawAddress, pppropertylist.rawAddress, pcbpropertylistsize.rawAddress).toUInt()

public actual fun resUtilGetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr): Pwstr =
    MutPtr(WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGetSzValue(hkeyclusterkey.rawAddress, pszvaluename.rawAddress))

public actual fun resUtilGroupsEqual(hself: Hgroup, hgroup: Hgroup, pequal: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilGroupsEqual(hself, hgroup, pequal.rawAddress).toUInt()

public actual fun resUtilIsPathValid(pszpath: Pcwstr): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilIsPathValid(pszpath.rawAddress)

public actual fun resUtilIsResourceClassEqual(prci: MutPtr, hresource: Hresource): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilIsResourceClassEqual(prci.rawAddress, hresource)

public actual fun resUtilLeftPaxosIsLessThanRight(left: ConstPtr, right: ConstPtr): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilLeftPaxosIsLessThanRight(left.rawAddress, right.rawAddress)

public actual fun resUtilNodeEnum(hcluster: Hcluster, pnodecallback: LpnodeCallback, pparameter: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilNodeEnum(hcluster, 0L, pparameter.rawAddress).toUInt()

public actual fun resUtilPaxosComparer(left: ConstPtr, right: ConstPtr): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilPaxosComparer(left.rawAddress, right.rawAddress)

public actual fun resUtilPropertyListFromParameterBlock(ppropertytable: ConstPtr, poutpropertylist: MutPtr, pcboutpropertylistsize: MutPtr, pinparams: ConstPtr, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilPropertyListFromParameterBlock(ppropertytable.rawAddress, poutpropertylist.rawAddress, pcboutpropertylistsize.rawAddress, pinparams.rawAddress, pcbbytesreturned.rawAddress, pcbrequired.rawAddress).toUInt()

public actual fun resUtilRemoveResourceServiceEnvironment(pszservicename: Pcwstr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilRemoveResourceServiceEnvironment(pszservicename.rawAddress, 0L, hresourcehandle).toUInt()

public actual fun resUtilResourceDepEnum(hself: Hresource, enumtype: UInt, prescallback: LpresourceCallbackEx, pparameter: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilResourceDepEnum(hself, enumtype.toInt(), 0L, pparameter.rawAddress).toUInt()

public actual fun resUtilResourceTypesEqual(lpszresourcetypename: Pcwstr, hresource: Hresource): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilResourceTypesEqual(lpszresourcetypename.rawAddress, hresource)

public actual fun resUtilResourcesEqual(hself: Hresource, hresource: Hresource): Bool =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilResourcesEqual(hself, hresource)

public actual fun resUtilSetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pbnewvalue: ConstPtr, cbnewvaluesize: UInt, ppboutvalue: MutPtr, pcboutvaluesize: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetBinaryValue(hkeyclusterkey.rawAddress, pszvaluename.rawAddress, pbnewvalue.rawAddress, cbnewvaluesize.toInt(), ppboutvalue.rawAddress, pcboutvaluesize.rawAddress).toUInt()

public actual fun resUtilSetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, dwnewvalue: UInt, pdwoutvalue: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetDwordValue(hkeyclusterkey.rawAddress, pszvaluename.rawAddress, dwnewvalue.toInt(), pdwoutvalue.rawAddress).toUInt()

public actual fun resUtilSetExpandSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetExpandSzValue(hkeyclusterkey.rawAddress, pszvaluename.rawAddress, psznewvalue.rawAddress, ppszoutstring.rawAddress).toUInt()

public actual fun resUtilSetMultiSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, cbnewvaluesize: UInt, ppszoutvalue: MutPtr, pcboutvaluesize: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetMultiSzValue(hkeyclusterkey.rawAddress, pszvaluename.rawAddress, psznewvalue.rawAddress, cbnewvaluesize.toInt(), ppszoutvalue.rawAddress, pcboutvaluesize.rawAddress).toUInt()

public actual fun resUtilSetPrivatePropertyList(hkeyclusterkey: Hkey, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetPrivatePropertyList(hkeyclusterkey.rawAddress, pinpropertylist.rawAddress, cbinpropertylistsize.toInt()).toUInt()

public actual fun resUtilSetPropertyParameterBlock(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: MutPtr, pinparams: ConstPtr, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, poutparams: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlock(hkeyclusterkey.rawAddress, ppropertytable.rawAddress, reserved.rawAddress, pinparams.rawAddress, pinpropertylist.rawAddress, cbinpropertylistsize.toInt(), poutparams.rawAddress).toUInt()

public actual fun resUtilSetPropertyParameterBlockEx(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: MutPtr, pinparams: ConstPtr, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyParameterBlockEx(hkeyclusterkey.rawAddress, ppropertytable.rawAddress, reserved.rawAddress, pinparams.rawAddress, pinpropertylist.rawAddress, cbinpropertylistsize.toInt(), bforcewrite, poutparams.rawAddress).toUInt()

public actual fun resUtilSetPropertyTable(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: ConstPtr, ballowunknownproperties: Bool, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, poutparams: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTable(hkeyclusterkey.rawAddress, ppropertytable.rawAddress, reserved.rawAddress, ballowunknownproperties, pinpropertylist.rawAddress, cbinpropertylistsize.toInt(), poutparams.rawAddress).toUInt()

public actual fun resUtilSetPropertyTableEx(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: MutPtr, ballowunknownproperties: Bool, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetPropertyTableEx(hkeyclusterkey.rawAddress, ppropertytable.rawAddress, reserved.rawAddress, ballowunknownproperties, pinpropertylist.rawAddress, cbinpropertylistsize.toInt(), bforcewrite, poutparams.rawAddress).toUInt()

public actual fun resUtilSetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, qwnewvalue: ULong, pqwoutvalue: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetQwordValue(hkeyclusterkey.rawAddress, pszvaluename.rawAddress, qwnewvalue.toLong(), pqwoutvalue.rawAddress).toUInt()

public actual fun resUtilSetResourceServiceEnvironment(pszservicename: Pcwstr, hresource: Hresource, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceEnvironment(pszservicename.rawAddress, hresource, 0L, hresourcehandle).toUInt()

public actual fun resUtilSetResourceServiceStartParameters(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: MutPtr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParameters(pszservicename.rawAddress, schscmhandle.rawAddress, phservice.rawAddress, 0L, hresourcehandle).toUInt()

public actual fun resUtilSetResourceServiceStartParametersEx(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: MutPtr, dwdesiredaccess: UInt, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetResourceServiceStartParametersEx(pszservicename.rawAddress, schscmhandle.rawAddress, phservice.rawAddress, dwdesiredaccess.toInt(), 0L, hresourcehandle).toUInt()

public actual fun resUtilSetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetSzValue(hkeyclusterkey.rawAddress, pszvaluename.rawAddress, psznewvalue.rawAddress, ppszoutstring.rawAddress).toUInt()

public actual fun resUtilSetUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetUnknownProperties(hkeyclusterkey.rawAddress, ppropertytable.rawAddress, pinpropertylist.rawAddress, cbinpropertylistsize.toInt()).toUInt()

public actual fun resUtilSetValueEx(hkeyclusterkey: Hkey, valuename: Pcwstr, valuetype: UInt, valuedata: ConstPtr, valuesize: UInt, flags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilSetValueEx(hkeyclusterkey.rawAddress, valuename.rawAddress, valuetype.toInt(), valuedata.rawAddress, valuesize.toInt(), flags.toInt()).toUInt()

public actual fun resUtilStartResourceService(pszservicename: Pcwstr, phservicehandle: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilStartResourceService(pszservicename.rawAddress, phservicehandle.rawAddress).toUInt()

public actual fun resUtilStopResourceService(pszservicename: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilStopResourceService(pszservicename.rawAddress).toUInt()

public actual fun resUtilStopService(hservicehandle: ScHandle): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilStopService(hservicehandle.rawAddress).toUInt()

public actual fun resUtilTerminateServiceProcessFromResDll(dwservicepid: UInt, boffline: Bool, pdwresourcestate: MutPtr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilTerminateServiceProcessFromResDll(dwservicepid.toInt(), boffline, pdwresourcestate.rawAddress, 0L, hresourcehandle).toUInt()

public actual fun resUtilVerifyPrivatePropertyList(pinpropertylist: ConstPtr, cbinpropertylistsize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilVerifyPrivatePropertyList(pinpropertylist.rawAddress, cbinpropertylistsize.toInt()).toUInt()

public actual fun resUtilVerifyPropertyTable(ppropertytable: ConstPtr, reserved: ConstPtr, ballowunknownproperties: Bool, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, poutparams: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilVerifyPropertyTable(ppropertytable.rawAddress, reserved.rawAddress, ballowunknownproperties, pinpropertylist.rawAddress, cbinpropertylistsize.toInt(), poutparams.rawAddress).toUInt()

public actual fun resUtilVerifyResourceService(pszservicename: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilVerifyResourceService(pszservicename.rawAddress).toUInt()

public actual fun resUtilVerifyService(hservicehandle: ScHandle): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilVerifyService(hservicehandle.rawAddress).toUInt()

public actual fun resUtilVerifyShutdownSafe(flags: UInt, reason: UInt, presult: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilVerifyShutdownSafe(flags.toInt(), reason.toInt(), presult.rawAddress).toUInt()

public actual fun resUtilsDeleteKeyTree(key: Hkey, keyname: Pcwstr, treatnokeyaserror: Bool): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResUtilsDeleteKeyTree(key.rawAddress, keyname.rawAddress, treatnokeyaserror).toUInt()

public actual fun resetAllAppInstanceVersions(): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResetAllAppInstanceVersions().toUInt()

public actual fun restartClusterResource(hresource: Hresource, dwflags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRestartClusterResource(hresource, dwflags.toInt()).toUInt()

public actual fun restartClusterResourceEx(hresource: Hresource, dwflags: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRestartClusterResourceEx(hresource, dwflags.toInt(), lpszreason.rawAddress).toUInt()

public actual fun restoreClusterDatabase(lpszpathname: Pcwstr, bforce: Bool, lpszquorumdriveletter: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringRestoreClusterDatabase(lpszpathname.rawAddress, bforce, lpszquorumdriveletter.rawAddress).toUInt()

public actual fun resumeClusterNode(hnode: Hnode): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResumeClusterNode(hnode).toUInt()

public actual fun resumeClusterNodeEx(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx(hnode, eresumefailbacktype, dwresumeflagsreserved.toInt()).toUInt()

public actual fun resumeClusterNodeEx2(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringResumeClusterNodeEx2(hnode, eresumefailbacktype, dwresumeflagsreserved.toInt(), lpszreason.rawAddress).toUInt()

public actual fun setAppInstanceCsvFlags(processhandle: Handle, mask: UInt, flags: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetAppInstanceCsvFlags(processhandle.rawAddress, mask.toInt(), flags.toInt()).toUInt()

public actual fun setClusterGroupName(hgroup: Hgroup, lpszgroupname: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterGroupName(hgroup, lpszgroupname.rawAddress).toUInt()

public actual fun setClusterGroupNameEx(hgroup: Hgroup, lpszgroupname: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterGroupNameEx(hgroup, lpszgroupname.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun setClusterGroupNodeList(hgroup: Hgroup, nodecount: UInt, nodelist: ConstPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeList(hgroup, nodecount.toInt(), nodelist.rawAddress).toUInt()

public actual fun setClusterGroupNodeListEx(hgroup: Hgroup, nodecount: UInt, nodelist: ConstPtr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterGroupNodeListEx(hgroup, nodecount.toInt(), nodelist.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun setClusterGroupSetDependencyExpression(hgroupset: Hgroupset, lpszdependencyexprssion: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpression(hgroupset, lpszdependencyexprssion.rawAddress).toUInt()

public actual fun setClusterGroupSetDependencyExpressionEx(hgroupset: Hgroupset, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterGroupSetDependencyExpressionEx(hgroupset, lpszdependencyexpression.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun setClusterName(hcluster: Hcluster, lpsznewclustername: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterName(hcluster, lpsznewclustername.rawAddress).toUInt()

public actual fun setClusterNameEx(hcluster: Hcluster, lpsznewclustername: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterNameEx(hcluster, lpsznewclustername.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun setClusterNetworkName(hnetwork: Hnetwork, lpszname: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterNetworkName(hnetwork, lpszname.rawAddress).toUInt()

public actual fun setClusterNetworkNameEx(hnetwork: Hnetwork, lpszname: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterNetworkNameEx(hnetwork, lpszname.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun setClusterNetworkPriorityOrder(hcluster: Hcluster, networkcount: UInt, networklist: ConstPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterNetworkPriorityOrder(hcluster, networkcount.toInt(), networklist.rawAddress).toUInt()

public actual fun setClusterQuorumResource(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquologsize: UInt): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResource(hresource, lpszdevicename.rawAddress, dwmaxquologsize.toInt()).toUInt()

public actual fun setClusterQuorumResourceEx(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquorumlogsize: UInt, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterQuorumResourceEx(hresource, lpszdevicename.rawAddress, dwmaxquorumlogsize.toInt(), lpszreason.rawAddress).toUInt()

public actual fun setClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterResourceDependencyExpression(hresource, lpszdependencyexpression.rawAddress).toUInt()

public actual fun setClusterResourceName(hresource: Hresource, lpszresourcename: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterResourceName(hresource, lpszresourcename.rawAddress).toUInt()

public actual fun setClusterResourceNameEx(hresource: Hresource, lpszresourcename: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterResourceNameEx(hresource, lpszresourcename.rawAddress, lpszreason.rawAddress).toUInt()

public actual fun setClusterServiceAccountPassword(lpszclustername: Pcwstr, lpsznewpassword: Pcwstr, dwflags: UInt, lpreturnstatusbuffer: MutPtr, lpcbreturnstatusbuffersize: MutPtr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetClusterServiceAccountPassword(lpszclustername.rawAddress, lpsznewpassword.rawAddress, dwflags.toInt(), lpreturnstatusbuffer.rawAddress, lpcbreturnstatusbuffersize.rawAddress).toUInt()

public actual fun setGroupDependencyExpression(hgroup: Hgroup, lpszdependencyexpression: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpression(hgroup, lpszdependencyexpression.rawAddress).toUInt()

public actual fun setGroupDependencyExpressionEx(hgroup: Hgroup, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt =
    WindowsWin32NetworkingClusteringJniBridge.windowssysWindowsWin32NetworkingClusteringSetGroupDependencyExpressionEx(hgroup, lpszdependencyexpression.rawAddress, lpszreason.rawAddress).toUInt()
