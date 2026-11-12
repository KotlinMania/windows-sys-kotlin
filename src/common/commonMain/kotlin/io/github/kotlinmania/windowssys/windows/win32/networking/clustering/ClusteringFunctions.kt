package io.github.kotlinmania.windowssys.windows.win32.networking.clustering

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.system.services.ScHandle

public expect fun addClusterGroupDependency(hdependentgroup: Hgroup, hprovidergroup: Hgroup): UInt

public expect fun addClusterGroupDependencyEx(hdependentgroup: Hgroup, hprovidergroup: Hgroup, lpszreason: Pcwstr): UInt

public expect fun addClusterGroupSetDependency(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset): UInt

public expect fun addClusterGroupSetDependencyEx(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt

public expect fun addClusterGroupToGroupSetDependency(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset): UInt

public expect fun addClusterGroupToGroupSetDependencyEx(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt

public expect fun addClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr<CVoid>): Hnode

public expect fun addClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwflags: UInt, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr<CVoid>): Hnode

public expect fun addClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt

public expect fun addClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt

public expect fun addClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt

public expect fun addClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt

public expect fun addClusterStorageNode(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr<CVoid>, lpszclusterstoragenodedescription: Pcwstr, lpszclusterstoragenodelocation: Pcwstr): UInt

public expect fun addCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt

public expect fun addResourceToClusterSharedVolumes(hresource: Hresource): UInt

public expect fun backupClusterDatabase(hcluster: Hcluster, lpszpathname: Pcwstr): UInt

public expect fun canResourceBeDependent(hresource: Hresource, hresourcedependent: Hresource): Bool

public expect fun cancelClusterGroupOperation(hgroup: Hgroup, dwcancelflagsReserved: UInt): UInt

public expect fun changeClusterResourceGroup(hresource: Hresource, hgroup: Hgroup): UInt

public expect fun changeClusterResourceGroupEx(hresource: Hresource, hgroup: Hgroup, flags: ULong): UInt

public expect fun changeClusterResourceGroupEx2(hresource: Hresource, hgroup: Hgroup, flags: ULong, lpszreason: Pcwstr): UInt

public expect fun closeCluster(hcluster: Hcluster): Bool

public expect fun closeClusterCryptProvider(hcluscryptprovider: Hcluscryptprovider): UInt

public expect fun closeClusterGroup(hgroup: Hgroup): Bool

public expect fun closeClusterGroupSet(hgroupset: Hgroupset): Bool

public expect fun closeClusterNetInterface(hnetinterface: Hnetinterface): Bool

public expect fun closeClusterNetwork(hnetwork: Hnetwork): Bool

public expect fun closeClusterNode(hnode: Hnode): Bool

public expect fun closeClusterNotifyPort(hchange: Hchange): Bool

public expect fun closeClusterResource(hresource: Hresource): Bool

public expect fun clusAddClusterHealthFault(hcluster: Hcluster, failure: ConstPtr<ClusterHealthFault>, param2: UInt): UInt

public expect fun clusGetClusterHealthFaults(hcluster: Hcluster, objects: MutPtr<ClusterHealthFaultArray>, flags: UInt): UInt

public expect fun clusRemoveClusterHealthFault(hcluster: Hcluster, id: Pcwstr, flags: UInt): UInt

public expect fun clusWorkerCheckTerminate(lpworker: MutPtr<ClusWorker>): Bool

public expect fun clusWorkerCreate(lpworker: MutPtr<ClusWorker>, lpstartaddress: PworkerStartRoutine, lpparameter: MutPtr<CVoid>): UInt

public expect fun clusWorkerTerminate(lpworker: ConstPtr<ClusWorker>)

public expect fun clusWorkerTerminateEx(clusworker: MutPtr<ClusWorker>, timeoutinmilliseconds: UInt, waitonly: Bool): UInt

public expect fun clusWorkersTerminate(clusworkers: MutPtr<MutPtr<ClusWorker>>, clusworkerscount: ULong, timeoutinmilliseconds: UInt, waitonly: Bool): UInt

public expect fun clusapiSetReasonHandler(lphandler: ConstPtr<ClusapiReasonHandler>): MutPtr<ClusapiReasonHandler>

public expect fun clusterAddGroupToAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt

public expect fun clusterAddGroupToGroupSet(hgroupset: Hgroupset, hgroup: Hgroup): UInt

public expect fun clusterAddGroupToGroupSetWithDomains(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt): UInt

public expect fun clusterAddGroupToGroupSetWithDomainsEx(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt, lpszreason: Pcwstr): UInt

public expect fun clusterAffinityRuleControl(hcluster: Hcluster, affinityrulename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, cbinbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, cboutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): UInt

public expect fun clusterClearBackupStateForSharedVolume(lpszvolumepathname: Pcwstr): UInt

public expect fun clusterCloseEnum(henum: Hclusenum): UInt

public expect fun clusterCloseEnumEx(hclusterenum: Hclusenumex): UInt

public expect fun clusterControl(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): UInt

public expect fun clusterControlEx(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpszreason: Pcwstr): UInt

public expect fun clusterCreateAffinityRule(hcluster: Hcluster, rulename: Pcwstr, ruletype: ClusAffinityRuleType): UInt

public expect fun clusterDecrypt(hcluscryptprovider: Hcluscryptprovider, pcryptinput: ConstPtr<UByte>, cbcryptinput: UInt, ppcryptoutput: MutPtr<MutPtr<UByte>>, pcbcryptoutput: MutPtr<UInt>): UInt

public expect fun clusterEncrypt(hcluscryptprovider: Hcluscryptprovider, pdata: ConstPtr<UByte>, cbdata: UInt, ppdata: MutPtr<MutPtr<UByte>>, pcbdata: MutPtr<UInt>): UInt

public expect fun clusterEnum(henum: Hclusenum, dwindex: UInt, lpdwtype: MutPtr<UInt>, lpszname: Pwstr, lpcchname: MutPtr<UInt>): UInt

public expect fun clusterEnumEx(hclusterenum: Hclusenumex, dwindex: UInt, pitem: MutPtr<ClusterEnumItem>, cbitem: MutPtr<UInt>): UInt

public expect fun clusterGetEnumCount(henum: Hclusenum): UInt

public expect fun clusterGetEnumCountEx(hclusterenum: Hclusenumex): UInt

public expect fun clusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool

public expect fun clusterGetVolumePathName(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool

public expect fun clusterGroupCloseEnum(hgroupenum: Hgroupenum): UInt

public expect fun clusterGroupCloseEnumEx(hgroupenumex: Hgroupenumex): UInt

public expect fun clusterGroupControl(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): UInt

public expect fun clusterGroupControlEx(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpszreason: Pcwstr): UInt

public expect fun clusterGroupEnum(hgroupenum: Hgroupenum, dwindex: UInt, lpdwtype: MutPtr<UInt>, lpszresourcename: Pwstr, lpcchname: MutPtr<UInt>): UInt

public expect fun clusterGroupEnumEx(hgroupenumex: Hgroupenumex, dwindex: UInt, pitem: MutPtr<ClusterGroupEnumItem>, cbitem: MutPtr<UInt>): UInt

public expect fun clusterGroupGetEnumCount(hgroupenum: Hgroupenum): UInt

public expect fun clusterGroupGetEnumCountEx(hgroupenumex: Hgroupenumex): UInt

public expect fun clusterGroupOpenEnum(hgroup: Hgroup, dwtype: UInt): Hgroupenum

public expect fun clusterGroupOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hgroupenumex

public expect fun clusterGroupSetCloseEnum(hgroupsetenum: Hgroupsetenum): UInt

public expect fun clusterGroupSetControl(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, cbinbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, cboutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): UInt

public expect fun clusterGroupSetControlEx(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, cbinbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, cboutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpszreason: Pcwstr): UInt

public expect fun clusterGroupSetEnum(hgroupsetenum: Hgroupsetenum, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr<UInt>): UInt

public expect fun clusterGroupSetGetEnumCount(hgroupsetenum: Hgroupsetenum): UInt

public expect fun clusterGroupSetOpenEnum(hcluster: Hcluster): Hgroupsetenum

public expect fun clusterIsPathOnSharedVolume(lpszpathname: Pcwstr): Bool

public expect fun clusterNetInterfaceCloseEnum(hnetinterfaceenum: Hnetinterfaceenum): UInt

public expect fun clusterNetInterfaceControl(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): UInt

public expect fun clusterNetInterfaceControlEx(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpszreason: Pcwstr): UInt

public expect fun clusterNetInterfaceEnum(hnetinterfaceenum: Hnetinterfaceenum, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr<UInt>): UInt

public expect fun clusterNetInterfaceOpenEnum(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr): Hnetinterfaceenum

public expect fun clusterNetworkCloseEnum(hnetworkenum: Hnetworkenum): UInt

public expect fun clusterNetworkControl(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): UInt

public expect fun clusterNetworkControlEx(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpszreason: Pcwstr): UInt

public expect fun clusterNetworkEnum(hnetworkenum: Hnetworkenum, dwindex: UInt, lpdwtype: MutPtr<UInt>, lpszname: Pwstr, lpcchname: MutPtr<UInt>): UInt

public expect fun clusterNetworkGetEnumCount(hnetworkenum: Hnetworkenum): UInt

public expect fun clusterNetworkOpenEnum(hnetwork: Hnetwork, dwtype: UInt): Hnetworkenum

public expect fun clusterNodeCloseEnum(hnodeenum: Hnodeenum): UInt

public expect fun clusterNodeCloseEnumEx(hnodeenum: Hnodeenumex): UInt

public expect fun clusterNodeControl(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): UInt

public expect fun clusterNodeControlEx(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpszreason: Pcwstr): UInt

public expect fun clusterNodeEnum(hnodeenum: Hnodeenum, dwindex: UInt, lpdwtype: MutPtr<UInt>, lpszname: Pwstr, lpcchname: MutPtr<UInt>): UInt

public expect fun clusterNodeEnumEx(hnodeenum: Hnodeenumex, dwindex: UInt, pitem: MutPtr<ClusterEnumItem>, cbitem: MutPtr<UInt>): UInt

public expect fun clusterNodeGetEnumCount(hnodeenum: Hnodeenum): UInt

public expect fun clusterNodeGetEnumCountEx(hnodeenum: Hnodeenumex): UInt

public expect fun clusterNodeOpenEnum(hnode: Hnode, dwtype: UInt): Hnodeenum

public expect fun clusterNodeOpenEnumEx(hnode: Hnode, dwtype: UInt, poptions: ConstPtr<CVoid>): Hnodeenumex

public expect fun clusterNodeReplacement(hcluster: Hcluster, lpsznodenamecurrent: Pcwstr, lpsznodenamenew: Pcwstr): UInt

public expect fun clusterOpenEnum(hcluster: Hcluster, dwtype: UInt): Hclusenum

public expect fun clusterOpenEnumEx(hcluster: Hcluster, dwtype: UInt, poptions: ConstPtr<CVoid>): Hclusenumex

public expect fun clusterPrepareSharedVolumeForBackup(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, lpcchvolumepathname: MutPtr<UInt>, lpszvolumename: Pwstr, lpcchvolumename: MutPtr<UInt>): UInt

public expect fun clusterRegBatchAddCommand(hregbatch: Hregbatch, dwcommand: ClusterRegCommand, wzname: Pcwstr, dwoptions: UInt, lpdata: ConstPtr<CVoid>, cbdata: UInt): Int

public expect fun clusterRegBatchCloseNotification(hbatchnotification: Hregbatchnotification): Int

public expect fun clusterRegBatchReadCommand(hbatchnotification: Hregbatchnotification, pbatchcommand: MutPtr<ClusterBatchCommand>): Int

public expect fun clusterRegCloseBatch(hregbatch: Hregbatch, bcommit: Bool, failedcommandnumber: MutPtr<Int>): Int

public expect fun clusterRegCloseBatchEx(hregbatch: Hregbatch, flags: UInt, failedcommandnumber: MutPtr<Int>): Int

public expect fun clusterRegCloseBatchNotifyPort(hbatchnotifyport: Hregbatchport): Int

public expect fun clusterRegCloseKey(hkey: Hkey): Int

public expect fun clusterRegCloseReadBatch(hregreadbatch: Hregreadbatch, phregreadbatchreply: MutPtr<Hregreadbatchreply>): Int

public expect fun clusterRegCloseReadBatchEx(hregreadbatch: Hregreadbatch, flags: UInt, phregreadbatchreply: MutPtr<Hregreadbatchreply>): Int

public expect fun clusterRegCloseReadBatchReply(hregreadbatchreply: Hregreadbatchreply): Int

public expect fun clusterRegCreateBatch(hkey: Hkey, phregbatch: MutPtr<Hregbatch>): Int

public expect fun clusterRegCreateBatchNotifyPort(hkey: Hkey, phbatchnotifyport: MutPtr<Hregbatchport>): Int

public expect fun clusterRegCreateKey(hkey: Hkey, lpszsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>, phkresult: MutPtr<Hkey>, lpdwdisposition: MutPtr<UInt>): Int

public expect fun clusterRegCreateKeyEx(hkey: Hkey, lpsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr<SecurityAttributes>, phkresult: MutPtr<Hkey>, lpdwdisposition: MutPtr<UInt>, lpszreason: Pcwstr): Int

public expect fun clusterRegCreateReadBatch(hkey: Hkey, phregreadbatch: MutPtr<Hregreadbatch>): Int

public expect fun clusterRegDeleteKey(hkey: Hkey, lpszsubkey: Pcwstr): Int

public expect fun clusterRegDeleteKeyEx(hkey: Hkey, lpsubkey: Pcwstr, lpszreason: Pcwstr): Int

public expect fun clusterRegDeleteValue(hkey: Hkey, lpszvaluename: Pcwstr): UInt

public expect fun clusterRegDeleteValueEx(hkey: Hkey, lpszvaluename: Pcwstr, lpszreason: Pcwstr): UInt

public expect fun clusterRegEnumKey(hkey: Hkey, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr<UInt>, lpftlastwritetime: MutPtr<Filetime>): Int

public expect fun clusterRegEnumValue(hkey: Hkey, dwindex: UInt, lpszvaluename: Pwstr, lpcchvaluename: MutPtr<UInt>, lpdwtype: MutPtr<UInt>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): UInt

public expect fun clusterRegGetBatchNotification(hbatchnotify: Hregbatchport, phbatchnotification: MutPtr<Hregbatchnotification>): Int

public expect fun clusterRegGetKeySecurity(hkey: Hkey, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr<UInt>): Int

public expect fun clusterRegOpenKey(hkey: Hkey, lpszsubkey: Pcwstr, samdesired: UInt, phkresult: MutPtr<Hkey>): Int

public expect fun clusterRegQueryInfoKey(hkey: Hkey, lpcsubkeys: ConstPtr<UInt>, lpcchmaxsubkeylen: ConstPtr<UInt>, lpcvalues: ConstPtr<UInt>, lpcchmaxvaluenamelen: ConstPtr<UInt>, lpcbmaxvaluelen: ConstPtr<UInt>, lpcbsecuritydescriptor: ConstPtr<UInt>, lpftlastwritetime: ConstPtr<Filetime>): Int

public expect fun clusterRegQueryValue(hkey: Hkey, lpszvaluename: Pcwstr, lpdwvaluetype: MutPtr<UInt>, lpdata: MutPtr<UByte>, lpcbdata: MutPtr<UInt>): Int

public expect fun clusterRegReadBatchAddCommand(hregreadbatch: Hregreadbatch, wzsubkeyname: Pcwstr, wzvaluename: Pcwstr): Int

public expect fun clusterRegReadBatchReplyNextCommand(hregreadbatchreply: Hregreadbatchreply, pbatchcommand: MutPtr<ClusterReadBatchCommand>): Int

public expect fun clusterRegSetKeySecurity(hkey: Hkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Int

public expect fun clusterRegSetKeySecurityEx(hkey: Hkey, securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor, lpszreason: Pcwstr): Int

public expect fun clusterRegSetValue(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr<UByte>, cbdata: UInt): UInt

public expect fun clusterRegSetValueEx(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr<UByte>, cbdata: UInt, lpszreason: Pcwstr): UInt

public expect fun clusterRegSyncDatabase(hcluster: Hcluster, flags: UInt): Int

public expect fun clusterRemoveAffinityRule(hcluster: Hcluster, rulename: Pcwstr): UInt

public expect fun clusterRemoveGroupFromAffinityRule(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt

public expect fun clusterRemoveGroupFromGroupSet(hgroup: Hgroup): UInt

public expect fun clusterRemoveGroupFromGroupSetEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt

public expect fun clusterResourceCloseEnum(hresenum: Hresenum): UInt

public expect fun clusterResourceCloseEnumEx(hresourceenumex: Hresenumex): UInt

public expect fun clusterResourceControl(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, cbinbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, cboutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): UInt

public expect fun clusterResourceControlAsUser(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, cbinbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, cboutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): UInt

public expect fun clusterResourceControlAsUserEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, cbinbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, cboutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpszreason: Pcwstr): UInt

public expect fun clusterResourceControlEx(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, cbinbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, cboutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpszreason: Pcwstr): UInt

public expect fun clusterResourceEnum(hresenum: Hresenum, dwindex: UInt, lpdwtype: MutPtr<UInt>, lpszname: Pwstr, lpcchname: MutPtr<UInt>): UInt

public expect fun clusterResourceEnumEx(hresourceenumex: Hresenumex, dwindex: UInt, pitem: MutPtr<ClusterResourceEnumItem>, cbitem: MutPtr<UInt>): UInt

public expect fun clusterResourceGetEnumCount(hresenum: Hresenum): UInt

public expect fun clusterResourceGetEnumCountEx(hresourceenumex: Hresenumex): UInt

public expect fun clusterResourceOpenEnum(hresource: Hresource, dwtype: UInt): Hresenum

public expect fun clusterResourceOpenEnumEx(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hresenumex

public expect fun clusterResourceTypeCloseEnum(hrestypeenum: Hrestypeenum): UInt

public expect fun clusterResourceTypeControl(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): UInt

public expect fun clusterResourceTypeControlAsUser(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): UInt

public expect fun clusterResourceTypeControlAsUserEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpszreason: Pcwstr): UInt

public expect fun clusterResourceTypeControlEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr<CVoid>, ninbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, noutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpszreason: Pcwstr): UInt

public expect fun clusterResourceTypeEnum(hrestypeenum: Hrestypeenum, dwindex: UInt, lpdwtype: MutPtr<UInt>, lpszname: Pwstr, lpcchname: MutPtr<UInt>): UInt

public expect fun clusterResourceTypeGetEnumCount(hrestypeenum: Hrestypeenum): UInt

public expect fun clusterResourceTypeOpenEnum(hcluster: Hcluster, lpszresourcetypename: Pcwstr, dwtype: UInt): Hrestypeenum

public expect fun clusterSetAccountAccess(hcluster: Hcluster, szaccountsid: Pcwstr, dwaccess: UInt, dwcontroltype: UInt): UInt

public expect fun clusterSharedVolumeSetSnapshotState(guidsnapshotset: Guid, lpszvolumename: Pcwstr, state: ClusterSharedVolumeSnapshotState): UInt

public expect fun clusterUpgradeFunctionalLevel(hcluster: Hcluster, perform: Bool, pfnprogresscallback: PclusterUpgradeProgressCallback, pvcallbackarg: ConstPtr<CVoid>): UInt

public expect fun createCluster(pconfig: ConstPtr<CreateClusterConfig>, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr<CVoid>): Hcluster

public expect fun createClusterAvailabilitySet(hcluster: Hcluster, lpavailabilitysetname: Pcwstr, pavailabilitysetconfig: ConstPtr<ClusterAvailabilitySetConfig>): Hgroupset

public expect fun createClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup

public expect fun createClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, pgroupinfo: ConstPtr<ClusterCreateGroupInfo>): Hgroup

public expect fun createClusterGroupSet(hcluster: Hcluster, groupsetname: Pcwstr): Hgroupset

public expect fun createClusterNameAccount(hcluster: Hcluster, pconfig: ConstPtr<CreateClusterNameAccount>, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr<CVoid>): UInt

public expect fun createClusterNotifyPort(hchange: Hchange, hcluster: Hcluster, dwfilter: UInt, dwnotifykey: ULong): Hchange

public expect fun createClusterNotifyPortV2(hchange: Hchange, hcluster: Hcluster, filters: ConstPtr<NotifyFilterAndType>, dwfiltercount: UInt, dwnotifykey: ULong): Hchange

public expect fun createClusterResource(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt): Hresource

public expect fun createClusterResourceEx(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt, lpszreason: Pcwstr): Hresource

public expect fun createClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt): UInt

public expect fun createClusterResourceTypeEx(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt, lpszreason: Pcwstr): UInt

public expect fun deleteClusterGroup(hgroup: Hgroup): UInt

public expect fun deleteClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt

public expect fun deleteClusterGroupSet(hgroupset: Hgroupset): UInt

public expect fun deleteClusterGroupSetEx(hgroupset: Hgroupset, lpszreason: Pcwstr): UInt

public expect fun deleteClusterResource(hresource: Hresource): UInt

public expect fun deleteClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt

public expect fun deleteClusterResourceType(hcluster: Hcluster, lpszresourcetypename: Pcwstr): UInt

public expect fun deleteClusterResourceTypeEx(hcluster: Hcluster, lpsztypename: Pcwstr, lpszreason: Pcwstr): UInt

public expect fun destroyCluster(hcluster: Hcluster, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr<CVoid>, fdeletevirtualcomputerobjects: Bool): UInt

public expect fun destroyClusterGroup(hgroup: Hgroup): UInt

public expect fun destroyClusterGroupEx(hgroup: Hgroup, lpszreason: Pcwstr): UInt

public expect fun determineCNOResTypeFromCluster(hcluster: Hcluster, pcnorestype: MutPtr<ClusterMgmtPointRestype>): UInt

public expect fun determineCNOResTypeFromNodelist(cnodes: UInt, ppsznodenames: ConstPtr<Pcwstr>, pcnorestype: MutPtr<ClusterMgmtPointRestype>): UInt

public expect fun determineClusterCloudTypeFromCluster(hcluster: Hcluster, pcloudtype: MutPtr<ClusterCloudType>): UInt

public expect fun determineClusterCloudTypeFromNodelist(cnodes: UInt, ppsznodenames: ConstPtr<Pcwstr>, pcloudtype: MutPtr<ClusterCloudType>): UInt

public expect fun evictClusterNode(hnode: Hnode): UInt

public expect fun evictClusterNodeEx(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: MutPtr<Hresult>): UInt

public expect fun evictClusterNodeEx2(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: MutPtr<Hresult>, lpszreason: Pcwstr): UInt

public expect fun failClusterResource(hresource: Hresource): UInt

public expect fun failClusterResourceEx(hresource: Hresource, lpszreason: Pcwstr): UInt

public expect fun freeClusterCrypt(pcryptinfo: ConstPtr<CVoid>): UInt

public expect fun freeClusterHealthFault(clusterhealthfault: MutPtr<ClusterHealthFault>): UInt

public expect fun freeClusterHealthFaultArray(clusterhealthfaultarray: MutPtr<ClusterHealthFaultArray>): UInt

public expect fun getClusterFromGroup(hgroup: Hgroup): Hcluster

public expect fun getClusterFromNetInterface(hnetinterface: Hnetinterface): Hcluster

public expect fun getClusterFromNetwork(hnetwork: Hnetwork): Hcluster

public expect fun getClusterFromNode(hnode: Hnode): Hcluster

public expect fun getClusterFromResource(hresource: Hresource): Hcluster

public expect fun getClusterGroupKey(hgroup: Hgroup, samdesired: UInt): Hkey

public expect fun getClusterGroupState(hgroup: Hgroup, lpsznodename: Pwstr, lpcchnodename: MutPtr<UInt>): ClusterGroupState

public expect fun getClusterInformation(hcluster: Hcluster, lpszclustername: Pwstr, lpcchclustername: MutPtr<UInt>, lpclusterinfo: MutPtr<Clusterversioninfo>): UInt

public expect fun getClusterKey(hcluster: Hcluster, samdesired: UInt): Hkey

public expect fun getClusterNetInterface(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr, lpszinterfacename: Pwstr, lpcchinterfacename: MutPtr<UInt>): UInt

public expect fun getClusterNetInterfaceKey(hnetinterface: Hnetinterface, samdesired: UInt): Hkey

public expect fun getClusterNetInterfaceState(hnetinterface: Hnetinterface): ClusterNetinterfaceState

public expect fun getClusterNetworkId(hnetwork: Hnetwork, lpsznetworkid: Pwstr, lpcchname: MutPtr<UInt>): UInt

public expect fun getClusterNetworkKey(hnetwork: Hnetwork, samdesired: UInt): Hkey

public expect fun getClusterNetworkState(hnetwork: Hnetwork): ClusterNetworkState

public expect fun getClusterNodeId(hnode: Hnode, lpsznodeid: Pwstr, lpcchname: MutPtr<UInt>): UInt

public expect fun getClusterNodeKey(hnode: Hnode, samdesired: UInt): Hkey

public expect fun getClusterNodeState(hnode: Hnode): ClusterNodeState

public expect fun getClusterNotify(hchange: Hchange, lpdwnotifykey: MutPtr<ULong>, lpdwfiltertype: MutPtr<UInt>, lpszname: Pwstr, lpcchname: MutPtr<UInt>, dwmilliseconds: UInt): UInt

public expect fun getClusterNotifyV2(hchange: Hchange, lpdwnotifykey: MutPtr<ULong>, pfilterandtype: MutPtr<NotifyFilterAndType>, buffer: MutPtr<UByte>, lpbbuffersize: MutPtr<UInt>, lpszobjectid: Pwstr, lpcchobjectid: MutPtr<UInt>, lpszparentid: Pwstr, lpcchparentid: MutPtr<UInt>, lpszname: Pwstr, lpcchname: MutPtr<UInt>, lpsztype: Pwstr, lpcchtype: MutPtr<UInt>, dwmilliseconds: UInt): UInt

public expect fun getClusterQuorumResource(hcluster: Hcluster, lpszresourcename: Pwstr, lpcchresourcename: MutPtr<UInt>, lpszdevicename: Pwstr, lpcchdevicename: MutPtr<UInt>, lpdwmaxquorumlogsize: MutPtr<UInt>): UInt

public expect fun getClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pwstr, lpcchdependencyexpression: MutPtr<UInt>): UInt

public expect fun getClusterResourceKey(hresource: Hresource, samdesired: UInt): Hkey

public expect fun getClusterResourceNetworkName(hresource: Hresource, lpbuffer: Pwstr, nsize: MutPtr<UInt>): Bool

public expect fun getClusterResourceState(hresource: Hresource, lpsznodename: Pwstr, lpcchnodename: MutPtr<UInt>, lpszgroupname: Pwstr, lpcchgroupname: MutPtr<UInt>): ClusterResourceState

public expect fun getClusterResourceTypeKey(hcluster: Hcluster, lpsztypename: Pcwstr, samdesired: UInt): Hkey

public expect fun getNodeCloudTypeDW(ppsznodename: Pcwstr, nodecloudtype: MutPtr<UInt>): UInt

public expect fun getNodeClusterState(lpsznodename: Pcwstr, pdwclusterstate: MutPtr<UInt>): UInt

public expect fun getNotifyEventHandle(hchange: Hchange, lphtargetevent: MutPtr<Handle>): UInt

public expect fun initializeClusterHealthFault(clusterhealthfault: MutPtr<ClusterHealthFault>): UInt

public expect fun initializeClusterHealthFaultArray(clusterhealthfaultarray: MutPtr<ClusterHealthFaultArray>): UInt

public expect fun isFileOnClusterSharedVolume(lpszpathname: Pcwstr, pbfileisonsharedvolume: MutPtr<Bool>): UInt

public expect fun moveClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt

public expect fun moveClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: ConstPtr<UByte>, cbinbuffersize: UInt): UInt

public expect fun moveClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwmoveflags: UInt, lpinbuffer: ConstPtr<UByte>, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt

public expect fun offlineClusterGroup(hgroup: Hgroup): UInt

public expect fun offlineClusterGroupEx(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: ConstPtr<UByte>, cbinbuffersize: UInt): UInt

public expect fun offlineClusterGroupEx2(hgroup: Hgroup, dwofflineflags: UInt, lpinbuffer: ConstPtr<UByte>, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt

public expect fun offlineClusterResource(hresource: Hresource): UInt

public expect fun offlineClusterResourceEx(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: ConstPtr<UByte>, cbinbuffersize: UInt): UInt

public expect fun offlineClusterResourceEx2(hresource: Hresource, dwofflineflags: UInt, lpinbuffer: ConstPtr<UByte>, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt

public expect fun onlineClusterGroup(hgroup: Hgroup, hdestinationnode: Hnode): UInt

public expect fun onlineClusterGroupEx(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: ConstPtr<UByte>, cbinbuffersize: UInt): UInt

public expect fun onlineClusterGroupEx2(hgroup: Hgroup, hdestinationnode: Hnode, dwonlineflags: UInt, lpinbuffer: ConstPtr<UByte>, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt

public expect fun onlineClusterResource(hresource: Hresource): UInt

public expect fun onlineClusterResourceEx(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: ConstPtr<UByte>, cbinbuffersize: UInt): UInt

public expect fun onlineClusterResourceEx2(hresource: Hresource, dwonlineflags: UInt, lpinbuffer: ConstPtr<UByte>, cbinbuffersize: UInt, lpszreason: Pcwstr): UInt

public expect fun openCluster(lpszclustername: Pcwstr): Hcluster

public expect fun openClusterCryptProvider(lpszresource: Pcwstr, lpszprovider: ConstPtr<Byte>, dwtype: UInt, dwflags: UInt): Hcluscryptprovider

public expect fun openClusterCryptProviderEx(lpszresource: Pcwstr, lpszkeyname: Pcwstr, lpszprovider: ConstPtr<Byte>, dwtype: UInt, dwflags: UInt): Hcluscryptprovider

public expect fun openClusterEx(lpszclustername: Pcwstr, desiredaccess: UInt, grantedaccess: MutPtr<UInt>): Hcluster

public expect fun openClusterGroup(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup

public expect fun openClusterGroupEx(hcluster: Hcluster, lpszgroupname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr<UInt>): Hgroup

public expect fun openClusterGroupSet(hcluster: Hcluster, lpszgroupsetname: Pcwstr): Hgroupset

public expect fun openClusterNetInterface(hcluster: Hcluster, lpszinterfacename: Pcwstr): Hnetinterface

public expect fun openClusterNetInterfaceEx(hcluster: Hcluster, lpszinterfacename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr<UInt>): Hnetinterface

public expect fun openClusterNetwork(hcluster: Hcluster, lpsznetworkname: Pcwstr): Hnetwork

public expect fun openClusterNetworkEx(hcluster: Hcluster, lpsznetworkname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr<UInt>): Hnetwork

public expect fun openClusterNode(hcluster: Hcluster, lpsznodename: Pcwstr): Hnode

public expect fun openClusterNodeById(hcluster: Hcluster, nodeid: UInt): Hnode

public expect fun openClusterNodeEx(hcluster: Hcluster, lpsznodename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr<UInt>): Hnode

public expect fun openClusterResource(hcluster: Hcluster, lpszresourcename: Pcwstr): Hresource

public expect fun openClusterResourceEx(hcluster: Hcluster, lpszresourcename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr<UInt>): Hresource

public expect fun pauseClusterNode(hnode: Hnode): UInt

public expect fun pauseClusterNodeEx(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode): UInt

public expect fun pauseClusterNodeEx2(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode, lpszreason: Pcwstr): UInt

public expect fun queryAppInstanceVersion(appinstanceid: ConstPtr<Guid>, instanceversionhigh: MutPtr<ULong>, instanceversionlow: MutPtr<ULong>, versionstatus: MutPtr<Ntstatus>): UInt

public expect fun registerAppInstance(processhandle: Handle, appinstanceid: ConstPtr<Guid>, childreninheritappinstance: Bool): UInt

public expect fun registerAppInstanceVersion(appinstanceid: ConstPtr<Guid>, instanceversionhigh: ULong, instanceversionlow: ULong): UInt

public expect fun registerClusterNotify(hchange: Hchange, dwfiltertype: UInt, hobject: Handle, dwnotifykey: ULong): UInt

public expect fun registerClusterNotifyV2(hchange: Hchange, filter: NotifyFilterAndType, hobject: Handle, dwnotifykey: ULong): UInt

public expect fun registerClusterResourceTypeNotifyV2(hchange: Hchange, hcluster: Hcluster, flags: Long, restypename: Pcwstr, dwnotifykey: ULong): UInt

public expect fun removeClusterGroupDependency(hgroup: Hgroup, hdependson: Hgroup): UInt

public expect fun removeClusterGroupDependencyEx(hgroup: Hgroup, hdependson: Hgroup, lpszreason: Pcwstr): UInt

public expect fun removeClusterGroupSetDependency(hgroupset: Hgroupset, hdependson: Hgroupset): UInt

public expect fun removeClusterGroupSetDependencyEx(hgroupset: Hgroupset, hdependson: Hgroupset, lpszreason: Pcwstr): UInt

public expect fun removeClusterGroupToGroupSetDependency(hgroup: Hgroup, hdependson: Hgroupset): UInt

public expect fun removeClusterGroupToGroupSetDependencyEx(hgroup: Hgroup, hdependson: Hgroupset, lpszreason: Pcwstr): UInt

public expect fun removeClusterNameAccount(hcluster: Hcluster, bdeletecomputerobjects: Bool): UInt

public expect fun removeClusterResourceDependency(hresource: Hresource, hdependson: Hresource): UInt

public expect fun removeClusterResourceDependencyEx(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt

public expect fun removeClusterResourceNode(hresource: Hresource, hnode: Hnode): UInt

public expect fun removeClusterResourceNodeEx(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt

public expect fun removeClusterStorageNode(hcluster: Hcluster, lpszclusterstorageenclosurename: Pcwstr, dwtimeout: UInt, dwflags: UInt): UInt

public expect fun removeCrossClusterGroupSetDependency(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt

public expect fun removeResourceFromClusterSharedVolumes(hresource: Hresource): UInt

public expect fun resUtilAddUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr<ResutilPropertyItem>, poutpropertylist: MutPtr<CVoid>, pcboutpropertylistsize: UInt, pcbbytesreturned: MutPtr<UInt>, pcbrequired: MutPtr<UInt>): UInt

public expect fun resUtilCreateDirectoryTree(pszpath: Pcwstr): UInt

public expect fun resUtilDupGroup(group: Hgroup, copy: MutPtr<Hgroup>): UInt

public expect fun resUtilDupParameterBlock(poutparams: MutPtr<UByte>, pinparams: ConstPtr<UByte>, ppropertytable: ConstPtr<ResutilPropertyItem>): UInt

public expect fun resUtilDupResource(group: Hresource, copy: MutPtr<Hresource>): UInt

public expect fun resUtilDupString(pszinstring: Pcwstr): Pwstr

public expect fun resUtilEnumGroups(hcluster: Hcluster, hself: Hgroup, prescallback: LpgroupCallbackEx, pparameter: MutPtr<CVoid>): UInt

public expect fun resUtilEnumGroupsEx(hcluster: Hcluster, hself: Hgroup, grouptype: ClusgroupType, prescallback: LpgroupCallbackEx, pparameter: MutPtr<CVoid>): UInt

public expect fun resUtilEnumPrivateProperties(hkeyclusterkey: Hkey, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: MutPtr<UInt>, pcbrequired: MutPtr<UInt>): UInt

public expect fun resUtilEnumProperties(ppropertytable: ConstPtr<ResutilPropertyItem>, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: MutPtr<UInt>, pcbrequired: MutPtr<UInt>): UInt

public expect fun resUtilEnumResources(hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallback, pparameter: MutPtr<CVoid>): UInt

public expect fun resUtilEnumResourcesEx(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: MutPtr<CVoid>): UInt

public expect fun resUtilEnumResourcesEx2(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: MutPtr<CVoid>, dwdesiredaccess: UInt): UInt

public expect fun resUtilExpandEnvironmentStrings(pszsrc: Pcwstr): Pwstr

public expect fun resUtilFindBinaryProperty(ppropertylist: ConstPtr<CVoid>, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pbpropertyvalue: MutPtr<MutPtr<UByte>>, pcbpropertyvaluesize: MutPtr<UInt>): UInt

public expect fun resUtilFindDependentDiskResourceDriveLetter(hcluster: Hcluster, hresource: Hresource, pszdriveletter: Pwstr, pcchdriveletter: MutPtr<UInt>): UInt

public expect fun resUtilFindDwordProperty(ppropertylist: ConstPtr<CVoid>, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pdwpropertyvalue: MutPtr<UInt>): UInt

public expect fun resUtilFindExpandSzProperty(ppropertylist: ConstPtr<CVoid>, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr<Pwstr>): UInt

public expect fun resUtilFindExpandedSzProperty(ppropertylist: ConstPtr<CVoid>, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr<Pwstr>): UInt

public expect fun resUtilFindFileTimeProperty(ppropertylist: ConstPtr<CVoid>, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pftpropertyvalue: MutPtr<Filetime>): UInt

public expect fun resUtilFindLongProperty(ppropertylist: ConstPtr<CVoid>, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: MutPtr<Int>): UInt

public expect fun resUtilFindMultiSzProperty(ppropertylist: ConstPtr<CVoid>, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr<Pwstr>, pcbpropertyvaluesize: MutPtr<UInt>): UInt

public expect fun resUtilFindSzProperty(ppropertylist: ConstPtr<CVoid>, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr<Pwstr>): UInt

public expect fun resUtilFindULargeIntegerProperty(ppropertylist: ConstPtr<CVoid>, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: MutPtr<ULong>): UInt

public expect fun resUtilFreeEnvironment(lpenvironment: MutPtr<CVoid>): UInt

public expect fun resUtilFreeParameterBlock(poutparams: MutPtr<UByte>, pinparams: ConstPtr<UByte>, ppropertytable: ConstPtr<ResutilPropertyItem>)

public expect fun resUtilGetAllProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr<ResutilPropertyItem>, poutpropertylist: MutPtr<CVoid>, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr<UInt>, pcbrequired: MutPtr<UInt>): UInt

public expect fun resUtilGetBinaryProperty(ppboutvalue: MutPtr<MutPtr<UByte>>, pcboutvaluesize: MutPtr<UInt>, pvaluestruct: ConstPtr<CluspropBinary>, pboldvalue: ConstPtr<UByte>, cboldvaluesize: UInt, pppropertylist: MutPtr<MutPtr<UByte>>, pcbpropertylistsize: MutPtr<UInt>): UInt

public expect fun resUtilGetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, ppboutvalue: MutPtr<MutPtr<UByte>>, pcboutvaluesize: MutPtr<UInt>): UInt

public expect fun resUtilGetClusterGroupType(hgroup: Hgroup, grouptype: MutPtr<ClusgroupType>): UInt

public expect fun resUtilGetClusterId(hcluster: Hcluster, guid: MutPtr<Guid>): UInt

public expect fun resUtilGetClusterRoleState(hcluster: Hcluster, eclusterrole: ClusterRole): ClusterRoleState

public expect fun resUtilGetCoreClusterResources(hcluster: Hcluster, phclusternameresource: MutPtr<Hresource>, phclusteripaddressresource: MutPtr<Hresource>, phclusterquorumresource: MutPtr<Hresource>): UInt

public expect fun resUtilGetCoreClusterResourcesEx(hclusterin: Hcluster, phclusternameresourceout: MutPtr<Hresource>, phclusterquorumresourceout: MutPtr<Hresource>, dwdesiredaccess: UInt): UInt

public expect fun resUtilGetCoreGroup(hcluster: Hcluster): Hgroup

public expect fun resUtilGetDwordProperty(pdwoutvalue: MutPtr<UInt>, pvaluestruct: ConstPtr<CluspropDword>, dwoldvalue: UInt, dwminimum: UInt, dwmaximum: UInt, pppropertylist: MutPtr<MutPtr<UByte>>, pcbpropertylistsize: MutPtr<UInt>): UInt

public expect fun resUtilGetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pdwoutvalue: MutPtr<UInt>, dwdefaultvalue: UInt): UInt

public expect fun resUtilGetEnvironmentWithNetName(hresource: Hresource): MutPtr<CVoid>

public expect fun resUtilGetFileTimeProperty(pftoutvalue: MutPtr<Filetime>, pvaluestruct: ConstPtr<CluspropFiletime>, ftoldvalue: Filetime, ftminimum: Filetime, ftmaximum: Filetime, pppropertylist: MutPtr<MutPtr<UByte>>, pcbpropertylistsize: MutPtr<UInt>): UInt

public expect fun resUtilGetLongProperty(ploutvalue: MutPtr<Int>, pvaluestruct: ConstPtr<CluspropLong>, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: MutPtr<MutPtr<UByte>>, pcbpropertylistsize: MutPtr<UInt>): UInt

public expect fun resUtilGetMultiSzProperty(ppszoutvalue: MutPtr<Pwstr>, pcboutvaluesize: MutPtr<UInt>, pvaluestruct: ConstPtr<CluspropSz>, pszoldvalue: Pcwstr, cboldvaluesize: UInt, pppropertylist: MutPtr<MutPtr<UByte>>, pcbpropertylistsize: MutPtr<UInt>): UInt

public expect fun resUtilGetPrivateProperties(hkeyclusterkey: Hkey, poutpropertylist: MutPtr<CVoid>, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr<UInt>, pcbrequired: MutPtr<UInt>): UInt

public expect fun resUtilGetProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr<ResutilPropertyItem>, poutpropertylist: MutPtr<CVoid>, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr<UInt>, pcbrequired: MutPtr<UInt>): UInt

public expect fun resUtilGetPropertiesToParameterBlock(hkeyclusterkey: Hkey, ppropertytable: ConstPtr<ResutilPropertyItem>, poutparams: MutPtr<UByte>, bcheckforrequiredproperties: Bool, psznameofpropinerror: MutPtr<Pwstr>): UInt

public expect fun resUtilGetProperty(hkeyclusterkey: Hkey, ppropertytableitem: ConstPtr<ResutilPropertyItem>, poutpropertyitem: MutPtr<MutPtr<CVoid>>, pcboutpropertyitemsize: MutPtr<UInt>): UInt

public expect fun resUtilGetPropertyFormats(ppropertytable: ConstPtr<ResutilPropertyItem>, poutpropertyformatlist: MutPtr<CVoid>, cbpropertyformatlistsize: UInt, pcbbytesreturned: MutPtr<UInt>, pcbrequired: MutPtr<UInt>): UInt

public expect fun resUtilGetPropertySize(hkeyclusterkey: Hkey, ppropertytableitem: ConstPtr<ResutilPropertyItem>, pcboutpropertylistsize: MutPtr<UInt>, pnpropertycount: MutPtr<UInt>): UInt

public expect fun resUtilGetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pqwoutvalue: MutPtr<ULong>, qwdefaultvalue: ULong): UInt

public expect fun resUtilGetResourceDependency(hself: Handle, lpszresourcetype: Pcwstr): Hresource

public expect fun resUtilGetResourceDependencyByClass(hcluster: Hcluster, hself: Handle, prci: MutPtr<ClusResourceClassInfo>, brecurse: Bool): Hresource

public expect fun resUtilGetResourceDependencyByClassEx(hcluster: Hcluster, hself: Handle, prci: MutPtr<ClusResourceClassInfo>, brecurse: Bool, dwdesiredaccess: UInt): Hresource

public expect fun resUtilGetResourceDependencyByName(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool): Hresource

public expect fun resUtilGetResourceDependencyByNameEx(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool, dwdesiredaccess: UInt): Hresource

public expect fun resUtilGetResourceDependencyEx(hself: Handle, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource

public expect fun resUtilGetResourceDependentIPAddressProps(hresource: Hresource, pszaddress: Pwstr, pcchaddress: MutPtr<UInt>, pszsubnetmask: Pwstr, pcchsubnetmask: MutPtr<UInt>, psznetwork: Pwstr, pcchnetwork: MutPtr<UInt>): UInt

public expect fun resUtilGetResourceName(hresource: Hresource, pszresourcename: Pwstr, pcchresourcenameinout: MutPtr<UInt>): UInt

public expect fun resUtilGetResourceNameDependency(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr): Hresource

public expect fun resUtilGetResourceNameDependencyEx(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource

public expect fun resUtilGetSzProperty(ppszoutvalue: MutPtr<Pwstr>, pvaluestruct: ConstPtr<CluspropSz>, pszoldvalue: Pcwstr, pppropertylist: MutPtr<MutPtr<UByte>>, pcbpropertylistsize: MutPtr<UInt>): UInt

public expect fun resUtilGetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr): Pwstr

public expect fun resUtilGroupsEqual(hself: Hgroup, hgroup: Hgroup, pequal: MutPtr<Bool>): UInt

public expect fun resUtilIsPathValid(pszpath: Pcwstr): Bool

public expect fun resUtilIsResourceClassEqual(prci: MutPtr<ClusResourceClassInfo>, hresource: Hresource): Bool

public expect fun resUtilLeftPaxosIsLessThanRight(left: ConstPtr<PaxosTagCStruct>, right: ConstPtr<PaxosTagCStruct>): Bool

public expect fun resUtilNodeEnum(hcluster: Hcluster, pnodecallback: LpnodeCallback, pparameter: MutPtr<CVoid>): UInt

public expect fun resUtilPaxosComparer(left: ConstPtr<PaxosTagCStruct>, right: ConstPtr<PaxosTagCStruct>): Bool

public expect fun resUtilPropertyListFromParameterBlock(ppropertytable: ConstPtr<ResutilPropertyItem>, poutpropertylist: MutPtr<CVoid>, pcboutpropertylistsize: MutPtr<UInt>, pinparams: ConstPtr<UByte>, pcbbytesreturned: MutPtr<UInt>, pcbrequired: MutPtr<UInt>): UInt

public expect fun resUtilRemoveResourceServiceEnvironment(pszservicename: Pcwstr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt

public expect fun resUtilResourceDepEnum(hself: Hresource, enumtype: UInt, prescallback: LpresourceCallbackEx, pparameter: MutPtr<CVoid>): UInt

public expect fun resUtilResourceTypesEqual(lpszresourcetypename: Pcwstr, hresource: Hresource): Bool

public expect fun resUtilResourcesEqual(hself: Hresource, hresource: Hresource): Bool

public expect fun resUtilSetBinaryValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pbnewvalue: ConstPtr<UByte>, cbnewvaluesize: UInt, ppboutvalue: MutPtr<MutPtr<UByte>>, pcboutvaluesize: MutPtr<UInt>): UInt

public expect fun resUtilSetDwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, dwnewvalue: UInt, pdwoutvalue: MutPtr<UInt>): UInt

public expect fun resUtilSetExpandSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: MutPtr<Pwstr>): UInt

public expect fun resUtilSetMultiSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, cbnewvaluesize: UInt, ppszoutvalue: MutPtr<Pwstr>, pcboutvaluesize: MutPtr<UInt>): UInt

public expect fun resUtilSetPrivatePropertyList(hkeyclusterkey: Hkey, pinpropertylist: ConstPtr<CVoid>, cbinpropertylistsize: UInt): UInt

public expect fun resUtilSetPropertyParameterBlock(hkeyclusterkey: Hkey, ppropertytable: ConstPtr<ResutilPropertyItem>, reserved: MutPtr<CVoid>, pinparams: ConstPtr<UByte>, pinpropertylist: ConstPtr<CVoid>, cbinpropertylistsize: UInt, poutparams: MutPtr<UByte>): UInt

public expect fun resUtilSetPropertyParameterBlockEx(hkeyclusterkey: Hkey, ppropertytable: ConstPtr<ResutilPropertyItem>, reserved: MutPtr<CVoid>, pinparams: ConstPtr<UByte>, pinpropertylist: ConstPtr<CVoid>, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: MutPtr<UByte>): UInt

public expect fun resUtilSetPropertyTable(hkeyclusterkey: Hkey, ppropertytable: ConstPtr<ResutilPropertyItem>, reserved: ConstPtr<CVoid>, ballowunknownproperties: Bool, pinpropertylist: ConstPtr<CVoid>, cbinpropertylistsize: UInt, poutparams: MutPtr<UByte>): UInt

public expect fun resUtilSetPropertyTableEx(hkeyclusterkey: Hkey, ppropertytable: ConstPtr<ResutilPropertyItem>, reserved: MutPtr<CVoid>, ballowunknownproperties: Bool, pinpropertylist: ConstPtr<CVoid>, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: MutPtr<UByte>): UInt

public expect fun resUtilSetQwordValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, qwnewvalue: ULong, pqwoutvalue: MutPtr<ULong>): UInt

public expect fun resUtilSetResourceServiceEnvironment(pszservicename: Pcwstr, hresource: Hresource, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt

public expect fun resUtilSetResourceServiceStartParameters(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: MutPtr<ScHandle>, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt

public expect fun resUtilSetResourceServiceStartParametersEx(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: MutPtr<ScHandle>, dwdesiredaccess: UInt, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt

public expect fun resUtilSetSzValue(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: MutPtr<Pwstr>): UInt

public expect fun resUtilSetUnknownProperties(hkeyclusterkey: Hkey, ppropertytable: ConstPtr<ResutilPropertyItem>, pinpropertylist: ConstPtr<CVoid>, cbinpropertylistsize: UInt): UInt

public expect fun resUtilSetValueEx(hkeyclusterkey: Hkey, valuename: Pcwstr, valuetype: UInt, valuedata: ConstPtr<UByte>, valuesize: UInt, flags: UInt): UInt

public expect fun resUtilStartResourceService(pszservicename: Pcwstr, phservicehandle: MutPtr<ScHandle>): UInt

public expect fun resUtilStopResourceService(pszservicename: Pcwstr): UInt

public expect fun resUtilStopService(hservicehandle: ScHandle): UInt

public expect fun resUtilTerminateServiceProcessFromResDll(dwservicepid: UInt, boffline: Bool, pdwresourcestate: MutPtr<UInt>, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt

public expect fun resUtilVerifyPrivatePropertyList(pinpropertylist: ConstPtr<CVoid>, cbinpropertylistsize: UInt): UInt

public expect fun resUtilVerifyPropertyTable(ppropertytable: ConstPtr<ResutilPropertyItem>, reserved: ConstPtr<CVoid>, ballowunknownproperties: Bool, pinpropertylist: ConstPtr<CVoid>, cbinpropertylistsize: UInt, poutparams: MutPtr<UByte>): UInt

public expect fun resUtilVerifyResourceService(pszservicename: Pcwstr): UInt

public expect fun resUtilVerifyService(hservicehandle: ScHandle): UInt

public expect fun resUtilVerifyShutdownSafe(flags: UInt, reason: UInt, presult: MutPtr<UInt>): UInt

public expect fun resUtilsDeleteKeyTree(key: Hkey, keyname: Pcwstr, treatnokeyaserror: Bool): UInt

public expect fun resetAllAppInstanceVersions(): UInt

public expect fun restartClusterResource(hresource: Hresource, dwflags: UInt): UInt

public expect fun restartClusterResourceEx(hresource: Hresource, dwflags: UInt, lpszreason: Pcwstr): UInt

public expect fun restoreClusterDatabase(lpszpathname: Pcwstr, bforce: Bool, lpszquorumdriveletter: Pcwstr): UInt

public expect fun resumeClusterNode(hnode: Hnode): UInt

public expect fun resumeClusterNodeEx(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt): UInt

public expect fun resumeClusterNodeEx2(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt, lpszreason: Pcwstr): UInt

public expect fun setAppInstanceCsvFlags(processhandle: Handle, mask: UInt, flags: UInt): UInt

public expect fun setClusterGroupName(hgroup: Hgroup, lpszgroupname: Pcwstr): UInt

public expect fun setClusterGroupNameEx(hgroup: Hgroup, lpszgroupname: Pcwstr, lpszreason: Pcwstr): UInt

public expect fun setClusterGroupNodeList(hgroup: Hgroup, nodecount: UInt, nodelist: ConstPtr<Hnode>): UInt

public expect fun setClusterGroupNodeListEx(hgroup: Hgroup, nodecount: UInt, nodelist: ConstPtr<Hnode>, lpszreason: Pcwstr): UInt

public expect fun setClusterGroupSetDependencyExpression(hgroupset: Hgroupset, lpszdependencyexprssion: Pcwstr): UInt

public expect fun setClusterGroupSetDependencyExpressionEx(hgroupset: Hgroupset, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt

public expect fun setClusterName(hcluster: Hcluster, lpsznewclustername: Pcwstr): UInt

public expect fun setClusterNameEx(hcluster: Hcluster, lpsznewclustername: Pcwstr, lpszreason: Pcwstr): UInt

public expect fun setClusterNetworkName(hnetwork: Hnetwork, lpszname: Pcwstr): UInt

public expect fun setClusterNetworkNameEx(hnetwork: Hnetwork, lpszname: Pcwstr, lpszreason: Pcwstr): UInt

public expect fun setClusterNetworkPriorityOrder(hcluster: Hcluster, networkcount: UInt, networklist: ConstPtr<Hnetwork>): UInt

public expect fun setClusterQuorumResource(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquologsize: UInt): UInt

public expect fun setClusterQuorumResourceEx(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquorumlogsize: UInt, lpszreason: Pcwstr): UInt

public expect fun setClusterResourceDependencyExpression(hresource: Hresource, lpszdependencyexpression: Pcwstr): UInt

public expect fun setClusterResourceName(hresource: Hresource, lpszresourcename: Pcwstr): UInt

public expect fun setClusterResourceNameEx(hresource: Hresource, lpszresourcename: Pcwstr, lpszreason: Pcwstr): UInt

public expect fun setClusterServiceAccountPassword(lpszclustername: Pcwstr, lpsznewpassword: Pcwstr, dwflags: UInt, lpreturnstatusbuffer: MutPtr<ClusterSetPasswordStatus>, lpcbreturnstatusbuffersize: MutPtr<UInt>): UInt

public expect fun setGroupDependencyExpression(hgroup: Hgroup, lpszdependencyexpression: Pcwstr): UInt

public expect fun setGroupDependencyExpressionEx(hgroup: Hgroup, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt
