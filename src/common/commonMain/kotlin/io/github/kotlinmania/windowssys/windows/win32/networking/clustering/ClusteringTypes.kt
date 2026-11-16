package io.github.kotlinmania.windowssys.windows.win32.networking.clustering

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.system.services.ScHandle

public typealias ClctlCodes = Int

public typealias CluadmexObjectType = Int

public typealias ClusctlAffinityruleCodes = Int

public typealias ClusctlClusterCodes = Int

public typealias ClusctlGroupsetCodes = Int

public typealias ClusctlGroupCodes = Int

public typealias ClusctlNetinterfaceCodes = Int

public typealias ClusctlNetworkCodes = Int

public typealias ClusctlNodeCodes = Int

public typealias ClusctlResourceCodes = Int

public typealias ClusctlResourceTypeCodes = Int

public typealias ClusgroupType = Int

public typealias CluspropIpaddrEnablenetbios = Int

public typealias CluspropPiflags = Int

public typealias ClustersetObjectType = Int

public typealias ClusterChange = Int

public typealias ClusterChangeClusterV2 = Int

public typealias ClusterChangeGroupsetV2 = Int

public typealias ClusterChangeGroupV2 = Int

public typealias ClusterChangeNetinterfaceV2 = Int

public typealias ClusterChangeNetworkV2 = Int

public typealias ClusterChangeNodeUpgradePhaseV2 = Int

public typealias ClusterChangeNodeV2 = Int

public typealias ClusterChangeQuorumV2 = Int

public typealias ClusterChangeRegistryV2 = Int

public typealias ClusterChangeResourceTypeV2 = Int

public typealias ClusterChangeResourceV2 = Int

public typealias ClusterChangeSharedVolumeV2 = Int

public typealias ClusterChangeSpaceportV2 = Int

public typealias ClusterCloudType = Int

public typealias ClusterControlObject = Int

public typealias ClusterCsvVolumeFaultState = Int

public typealias ClusterEnum = Int

public typealias ClusterGroupAutofailbackType = Int

public typealias ClusterGroupEnum = Int

public typealias ClusterGroupPriority = Int

public typealias ClusterGroupState = Int

public typealias ClusterMgmtPointRestype = Int

public typealias ClusterMgmtPointType = Int

public typealias ClusterNetinterfaceState = Int

public typealias ClusterNetworkEnum = Int

public typealias ClusterNetworkRole = Int

public typealias ClusterNetworkState = Int

public typealias ClusterNodeDrainStatus = Int

public typealias ClusterNodeEnum = Int

public typealias ClusterNodeResumeFailbackType = Int

public typealias ClusterNodeState = Int

public typealias ClusterNodeStatus = Int

public typealias ClusterNotificationsVersion = Int

public typealias ClusterObjectType = Int

public typealias ClusterPropertyFormat = Int

public typealias ClusterPropertySyntax = UInt

public typealias ClusterPropertyType = Int

public typealias ClusterQuorumType = Int

public typealias ClusterQuorumValue = Int

public typealias ClusterRegCommand = Int

public typealias ClusterResourceApplicationState = Int

public typealias ClusterResourceClass = Int

public typealias ClusterResourceCreateFlags = Int

public typealias ClusterResourceEmbeddedFailureAction = Int

public typealias ClusterResourceEnum = Int

public typealias ClusterResourceRestartAction = Int

public typealias ClusterResourceState = Int

public typealias ClusterResourceStateChangeReason = Int

public typealias ClusterResourceTypeEnum = Int

public typealias ClusterRole = Int

public typealias ClusterRoleState = Int

public typealias ClusterSetupPhase = Int

public typealias ClusterSetupPhaseSeverity = Int

public typealias ClusterSetupPhaseType = Int

public typealias ClusterSharedVolumeBackupState = Int

public typealias ClusterSharedVolumeRenameInputType = Int

public typealias ClusterSharedVolumeSnapshotState = Int

public typealias ClusterSharedVolumeState = Int

public typealias ClusterStoragenodeState = Int

public typealias ClusterUpgradePhase = Int

public typealias ClusAffinityRuleType = Int

public typealias ClusCharacteristics = Int

public typealias ClusFlags = Int

public typealias ClusGroupStartSetting = Int

public typealias ClusRessubclass = Int

public typealias ClusRessubclassNetwork = Int

public typealias ClusRessubclassStorage = Int

public typealias FailureType = Int

public typealias FileshareChangeEnum = Int

public typealias GrpPlacementOptions = Int

public typealias Hchange = Long

public typealias Hcluscryptprovider = Long

public typealias Hclusenum = Long

public typealias Hclusenumex = Long

public typealias Hcluster = Long

public typealias Hgroup = Long

public typealias Hgroupenum = Long

public typealias Hgroupenumex = Long

public typealias Hgroupset = Long

public typealias Hgroupsetenum = Long

public typealias Hnetinterface = Long

public typealias Hnetinterfaceenum = Long

public typealias Hnetwork = Long

public typealias Hnetworkenum = Long

public typealias Hnode = Long

public typealias Hnodeenum = Long

public typealias Hnodeenumex = Long

public typealias Hregbatch = Long

public typealias Hregbatchnotification = Long

public typealias Hregbatchport = Long

public typealias Hregreadbatch = Long

public typealias Hregreadbatchreply = Long

public typealias Hresenum = Long

public typealias Hresenumex = Long

public typealias Hresource = Long

public typealias Hrestypeenum = Long

public typealias LogLevel = Int

public fun interface LpgroupCallbackExFn {
    public operator fun invoke(param0: Hcluster, param1: Hgroup, param2: Hgroup, param3: MutPtr): UInt
}

public typealias LpgroupCallbackEx = LpgroupCallbackExFn?

public fun interface LpnodeCallbackFn {
    public operator fun invoke(param0: Hcluster, param1: Hnode, param2: ClusterNodeState, param3: MutPtr): UInt
}

public typealias LpnodeCallback = LpnodeCallbackFn?

public fun interface LpresourceCallbackFn {
    public operator fun invoke(param0: Hresource, param1: Hresource, param2: MutPtr): UInt
}

public typealias LpresourceCallback = LpresourceCallbackFn?

public fun interface LpresourceCallbackExFn {
    public operator fun invoke(param0: Hcluster, param1: Hresource, param2: Hresource, param3: MutPtr): UInt
}

public typealias LpresourceCallbackEx = LpresourceCallbackExFn?

public typealias MaintenanceModeTypeEnum = Int

public typealias NodeClusterState = Int

public fun interface ParbitrateRoutineFn {
    public operator fun invoke(resource: MutPtr, lostquorumresource: PquorumResourceLost): UInt
}

public typealias ParbitrateRoutine = ParbitrateRoutineFn?

public fun interface ParmWprWatchdogForCurrentResourceCallRoutineFn {
    public operator fun invoke(resourcehandle: Long, timeoutinms: ULong): UInt
}

public typealias ParmWprWatchdogForCurrentResourceCallRoutine = ParmWprWatchdogForCurrentResourceCallRoutineFn?

public fun interface PbeginRescallAsUserRoutineFn {
    public operator fun invoke(resource: MutPtr, tokenhandle: Handle, controlcode: UInt, inbuffer: MutPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, bytesreturned: MutPtr, context: Long, returnedasynchronously: MutPtr): UInt
}

public typealias PbeginRescallAsUserRoutine = PbeginRescallAsUserRoutineFn?

public fun interface PbeginRescallRoutineFn {
    public operator fun invoke(resource: MutPtr, controlcode: UInt, inbuffer: MutPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, bytesreturned: MutPtr, context: Long, returnedasynchronously: MutPtr): UInt
}

public typealias PbeginRescallRoutine = PbeginRescallRoutineFn?

public fun interface PbeginRestypecallAsUserRoutineFn {
    public operator fun invoke(resourcetypename: Pcwstr, tokenhandle: Handle, controlcode: UInt, inbuffer: MutPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, bytesreturned: MutPtr, context: Long, returnedasynchronously: MutPtr): UInt
}

public typealias PbeginRestypecallAsUserRoutine = PbeginRestypecallAsUserRoutineFn?

public fun interface PbeginRestypecallRoutineFn {
    public operator fun invoke(resourcetypename: Pcwstr, controlcode: UInt, inbuffer: MutPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, bytesreturned: MutPtr, context: Long, returnedasynchronously: MutPtr): UInt
}

public typealias PbeginRestypecallRoutine = PbeginRestypecallRoutineFn?

public fun interface PcancelRoutineFn {
    public operator fun invoke(resource: MutPtr, cancelflagsReserved: UInt): UInt
}

public typealias PcancelRoutine = PcancelRoutineFn?

public fun interface PchangeResourceProcessForDumpsFn {
    public operator fun invoke(resource: Long, processname: Pcwstr, processid: UInt, isadd: Bool): UInt
}

public typealias PchangeResourceProcessForDumps = PchangeResourceProcessForDumpsFn?

public fun interface PchangeResTypeProcessForDumpsFn {
    public operator fun invoke(resourcetypename: Pcwstr, processname: Pcwstr, processid: UInt, isadd: Bool): UInt
}

public typealias PchangeResTypeProcessForDumps = PchangeResTypeProcessForDumpsFn?

public fun interface PcloseClusterCryptProviderFn {
    public operator fun invoke(hcluscryptprovider: Hcluscryptprovider): UInt
}

public typealias PcloseClusterCryptProvider = PcloseClusterCryptProviderFn?

public fun interface PcloseRoutineFn {
    public operator fun invoke(resource: MutPtr)
}

public typealias PcloseRoutine = PcloseRoutineFn?

public fun interface PCLUSAPIClusWorkerCheckTerminateFn {
    public operator fun invoke(lpworker: MutPtr): Bool
}

public typealias PCLUSAPIClusWorkerCheckTerminate = PCLUSAPIClusWorkerCheckTerminateFn?

public fun interface PclusapiAddClusterGroupDependencyFn {
    public operator fun invoke(hdependentgroup: Hgroup, hprovidergroup: Hgroup): UInt
}

public typealias PclusapiAddClusterGroupDependency = PclusapiAddClusterGroupDependencyFn?

public fun interface PclusapiAddClusterGroupDependencyExFn {
    public operator fun invoke(hdependentgroup: Hgroup, hprovidergroup: Hgroup, lpszreason: Pcwstr): UInt
}

public typealias PclusapiAddClusterGroupDependencyEx = PclusapiAddClusterGroupDependencyExFn?

public fun interface PclusapiAddClusterGroupGroupsetDependencyFn {
    public operator fun invoke(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset): UInt
}

public typealias PclusapiAddClusterGroupGroupsetDependency = PclusapiAddClusterGroupGroupsetDependencyFn?

public fun interface PclusapiAddClusterGroupGroupsetDependencyExFn {
    public operator fun invoke(hdependentgroupset: Hgroupset, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt
}

public typealias PclusapiAddClusterGroupGroupsetDependencyEx = PclusapiAddClusterGroupGroupsetDependencyExFn?

public fun interface PclusapiAddClusterGroupToGroupGroupsetDependencyFn {
    public operator fun invoke(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset): UInt
}

public typealias PclusapiAddClusterGroupToGroupGroupsetDependency = PclusapiAddClusterGroupToGroupGroupsetDependencyFn?

public fun interface PclusapiAddClusterGroupToGroupGroupsetDependencyExFn {
    public operator fun invoke(hdependentgroup: Hgroup, hprovidergroupset: Hgroupset, lpszreason: Pcwstr): UInt
}

public typealias PclusapiAddClusterGroupToGroupGroupsetDependencyEx = PclusapiAddClusterGroupToGroupGroupsetDependencyExFn?

public fun interface PclusapiAddClusterNodeFn {
    public operator fun invoke(hcluster: Hcluster, lpsznodename: Pcwstr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hnode
}

public typealias PclusapiAddClusterNode = PclusapiAddClusterNodeFn?

public fun interface PclusapiAddClusterNodeExFn {
    public operator fun invoke(hcluster: Hcluster, lpsznodename: Pcwstr, dwflags: UInt, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hnode
}

public typealias PclusapiAddClusterNodeEx = PclusapiAddClusterNodeExFn?

public fun interface PclusapiAddClusterResourceDependencyFn {
    public operator fun invoke(hresource: Hresource, hdependson: Hresource): UInt
}

public typealias PclusapiAddClusterResourceDependency = PclusapiAddClusterResourceDependencyFn?

public fun interface PclusapiAddClusterResourceDependencyExFn {
    public operator fun invoke(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt
}

public typealias PclusapiAddClusterResourceDependencyEx = PclusapiAddClusterResourceDependencyExFn?

public fun interface PclusapiAddClusterResourceNodeFn {
    public operator fun invoke(hresource: Hresource, hnode: Hnode): UInt
}

public typealias PclusapiAddClusterResourceNode = PclusapiAddClusterResourceNodeFn?

public fun interface PclusapiAddClusterResourceNodeExFn {
    public operator fun invoke(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt
}

public typealias PclusapiAddClusterResourceNodeEx = PclusapiAddClusterResourceNodeExFn?

public fun interface PclusapiAddCrossClusterGroupsetDependencyFn {
    public operator fun invoke(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt
}

public typealias PclusapiAddCrossClusterGroupsetDependency = PclusapiAddCrossClusterGroupsetDependencyFn?

public fun interface PclusapiAddResourceToClusterSharedVolumesFn {
    public operator fun invoke(hresource: Hresource): UInt
}

public typealias PclusapiAddResourceToClusterSharedVolumes = PclusapiAddResourceToClusterSharedVolumesFn?

public fun interface PclusapiBackupClusterDatabaseFn {
    public operator fun invoke(hcluster: Hcluster, lpszpathname: Pcwstr): UInt
}

public typealias PclusapiBackupClusterDatabase = PclusapiBackupClusterDatabaseFn?

public fun interface PclusapiCanResourceBeDependentFn {
    public operator fun invoke(hresource: Hresource, hresourcedependent: Hresource): Bool
}

public typealias PclusapiCanResourceBeDependent = PclusapiCanResourceBeDependentFn?

public fun interface PclusapiChangeClusterResourceGroupFn {
    public operator fun invoke(hresource: Hresource, hgroup: Hgroup): UInt
}

public typealias PclusapiChangeClusterResourceGroup = PclusapiChangeClusterResourceGroupFn?

public fun interface PclusapiChangeClusterResourceGroupExFn {
    public operator fun invoke(hresource: Hresource, hgroup: Hgroup, flags: ULong): UInt
}

public typealias PclusapiChangeClusterResourceGroupEx = PclusapiChangeClusterResourceGroupExFn?

public fun interface PclusapiChangeClusterResourceGroupEx2Fn {
    public operator fun invoke(hresource: Hresource, hgroup: Hgroup, flags: ULong, lpszreason: Pcwstr): UInt
}

public typealias PclusapiChangeClusterResourceGroupEx2 = PclusapiChangeClusterResourceGroupEx2Fn?

public fun interface PclusapiCloseClusterFn {
    public operator fun invoke(hcluster: Hcluster): Bool
}

public typealias PclusapiCloseCluster = PclusapiCloseClusterFn?

public fun interface PclusapiCloseClusterGroupFn {
    public operator fun invoke(hgroup: Hgroup): Bool
}

public typealias PclusapiCloseClusterGroup = PclusapiCloseClusterGroupFn?

public fun interface PclusapiCloseClusterGroupGroupsetFn {
    public operator fun invoke(hgroupset: Hgroupset): Bool
}

public typealias PclusapiCloseClusterGroupGroupset = PclusapiCloseClusterGroupGroupsetFn?

public fun interface PclusapiCloseClusterNetworkFn {
    public operator fun invoke(hnetwork: Hnetwork): Bool
}

public typealias PclusapiCloseClusterNetwork = PclusapiCloseClusterNetworkFn?

public fun interface PclusapiCloseClusterNetInterfaceFn {
    public operator fun invoke(hnetinterface: Hnetinterface): Bool
}

public typealias PclusapiCloseClusterNetInterface = PclusapiCloseClusterNetInterfaceFn?

public fun interface PclusapiCloseClusterNodeFn {
    public operator fun invoke(hnode: Hnode): Bool
}

public typealias PclusapiCloseClusterNode = PclusapiCloseClusterNodeFn?

public fun interface PclusapiCloseClusterNotifyPortFn {
    public operator fun invoke(hchange: Hchange): Bool
}

public typealias PclusapiCloseClusterNotifyPort = PclusapiCloseClusterNotifyPortFn?

public fun interface PclusapiCloseClusterResourceFn {
    public operator fun invoke(hresource: Hresource): Bool
}

public typealias PclusapiCloseClusterResource = PclusapiCloseClusterResourceFn?

public fun interface PclusapiClusterAddGroupToAffinityRuleFn {
    public operator fun invoke(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt
}

public typealias PclusapiClusterAddGroupToAffinityRule = PclusapiClusterAddGroupToAffinityRuleFn?

public fun interface PclusapiClusterAddGroupToGroupsetWithDomainsExFn {
    public operator fun invoke(hgroupset: Hgroupset, hgroup: Hgroup, faultdomain: UInt, updatedomain: UInt, lpszreason: Pcwstr): UInt
}

public typealias PclusapiClusterAddGroupToGroupsetWithDomainsEx = PclusapiClusterAddGroupToGroupsetWithDomainsExFn?

public fun interface PclusapiClusterAddGroupToGroupGroupsetFn {
    public operator fun invoke(hgroupset: Hgroupset, hgroup: Hgroup): UInt
}

public typealias PclusapiClusterAddGroupToGroupGroupset = PclusapiClusterAddGroupToGroupGroupsetFn?

public fun interface PclusapiClusterAffinityRuleControlFn {
    public operator fun invoke(hcluster: Hcluster, affinityrulename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt
}

public typealias PclusapiClusterAffinityRuleControl = PclusapiClusterAffinityRuleControlFn?

public fun interface PclusapiClusterCloseEnumFn {
    public operator fun invoke(henum: Hclusenum): UInt
}

public typealias PclusapiClusterCloseEnum = PclusapiClusterCloseEnumFn?

public fun interface PclusapiClusterCloseEnumExFn {
    public operator fun invoke(hclusterenum: Hclusenumex): UInt
}

public typealias PclusapiClusterCloseEnumEx = PclusapiClusterCloseEnumExFn?

public fun interface PclusapiClusterControlFn {
    public operator fun invoke(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt
}

public typealias PclusapiClusterControl = PclusapiClusterControlFn?

public fun interface PclusapiClusterControlExFn {
    public operator fun invoke(hcluster: Hcluster, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiClusterControlEx = PclusapiClusterControlExFn?

public fun interface PclusapiClusterCreateAffinityRuleFn {
    public operator fun invoke(hcluster: Hcluster, rulename: Pcwstr, ruletype: ClusAffinityRuleType): UInt
}

public typealias PclusapiClusterCreateAffinityRule = PclusapiClusterCreateAffinityRuleFn?

public fun interface PclusapiClusterEnumFn {
    public operator fun invoke(henum: Hclusenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt
}

public typealias PclusapiClusterEnum = PclusapiClusterEnumFn?

public fun interface PclusapiClusterEnumExFn {
    public operator fun invoke(hclusterenum: Hclusenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt
}

public typealias PclusapiClusterEnumEx = PclusapiClusterEnumExFn?

public fun interface PclusapiClusterGetEnumCountFn {
    public operator fun invoke(henum: Hclusenum): UInt
}

public typealias PclusapiClusterGetEnumCount = PclusapiClusterGetEnumCountFn?

public fun interface PclusapiClusterGetEnumCountExFn {
    public operator fun invoke(hclusterenum: Hclusenumex): UInt
}

public typealias PclusapiClusterGetEnumCountEx = PclusapiClusterGetEnumCountExFn?

public fun interface PclusapiClusterGroupCloseEnumFn {
    public operator fun invoke(hgroupenum: Hgroupenum): UInt
}

public typealias PclusapiClusterGroupCloseEnum = PclusapiClusterGroupCloseEnumFn?

public fun interface PclusapiClusterGroupCloseEnumExFn {
    public operator fun invoke(hgroupenumex: Hgroupenumex): UInt
}

public typealias PclusapiClusterGroupCloseEnumEx = PclusapiClusterGroupCloseEnumExFn?

public fun interface PclusapiClusterGroupControlFn {
    public operator fun invoke(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt
}

public typealias PclusapiClusterGroupControl = PclusapiClusterGroupControlFn?

public fun interface PclusapiClusterGroupControlExFn {
    public operator fun invoke(hgroup: Hgroup, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiClusterGroupControlEx = PclusapiClusterGroupControlExFn?

public fun interface PclusapiClusterGroupEnumFn {
    public operator fun invoke(hgroupenum: Hgroupenum, dwindex: UInt, lpdwtype: MutPtr, lpszresourcename: Pwstr, lpcchname: MutPtr): UInt
}

public typealias PclusapiClusterGroupEnum = PclusapiClusterGroupEnumFn?

public fun interface PclusapiClusterGroupEnumExFn {
    public operator fun invoke(hgroupenumex: Hgroupenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt
}

public typealias PclusapiClusterGroupEnumEx = PclusapiClusterGroupEnumExFn?

public fun interface PclusapiClusterGroupGetEnumCountFn {
    public operator fun invoke(hgroupenum: Hgroupenum): UInt
}

public typealias PclusapiClusterGroupGetEnumCount = PclusapiClusterGroupGetEnumCountFn?

public fun interface PclusapiClusterGroupGetEnumCountExFn {
    public operator fun invoke(hgroupenumex: Hgroupenumex): UInt
}

public typealias PclusapiClusterGroupGetEnumCountEx = PclusapiClusterGroupGetEnumCountExFn?

public fun interface PclusapiClusterGroupGroupsetControlFn {
    public operator fun invoke(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt
}

public typealias PclusapiClusterGroupGroupsetControl = PclusapiClusterGroupGroupsetControlFn?

public fun interface PclusapiClusterGroupGroupsetControlExFn {
    public operator fun invoke(hgroupset: Hgroupset, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiClusterGroupGroupsetControlEx = PclusapiClusterGroupGroupsetControlExFn?

public fun interface PclusapiClusterGroupOpenEnumFn {
    public operator fun invoke(hgroup: Hgroup, dwtype: UInt): Hgroupenum
}

public typealias PclusapiClusterGroupOpenEnum = PclusapiClusterGroupOpenEnumFn?

public fun interface PclusapiClusterGroupOpenEnumExFn {
    public operator fun invoke(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hgroupenumex
}

public typealias PclusapiClusterGroupOpenEnumEx = PclusapiClusterGroupOpenEnumExFn?

public fun interface PclusapiClusterNetworkCloseEnumFn {
    public operator fun invoke(hnetworkenum: Hnetworkenum): UInt
}

public typealias PclusapiClusterNetworkCloseEnum = PclusapiClusterNetworkCloseEnumFn?

public fun interface PclusapiClusterNetworkControlFn {
    public operator fun invoke(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt
}

public typealias PclusapiClusterNetworkControl = PclusapiClusterNetworkControlFn?

public fun interface PclusapiClusterNetworkControlExFn {
    public operator fun invoke(hnetwork: Hnetwork, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiClusterNetworkControlEx = PclusapiClusterNetworkControlExFn?

public fun interface PclusapiClusterNetworkEnumFn {
    public operator fun invoke(hnetworkenum: Hnetworkenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt
}

public typealias PclusapiClusterNetworkEnum = PclusapiClusterNetworkEnumFn?

public fun interface PclusapiClusterNetworkGetEnumCountFn {
    public operator fun invoke(hnetworkenum: Hnetworkenum): UInt
}

public typealias PclusapiClusterNetworkGetEnumCount = PclusapiClusterNetworkGetEnumCountFn?

public fun interface PclusapiClusterNetworkOpenEnumFn {
    public operator fun invoke(hnetwork: Hnetwork, dwtype: UInt): Hnetworkenum
}

public typealias PclusapiClusterNetworkOpenEnum = PclusapiClusterNetworkOpenEnumFn?

public fun interface PclusapiClusterNetInterfaceControlFn {
    public operator fun invoke(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt
}

public typealias PclusapiClusterNetInterfaceControl = PclusapiClusterNetInterfaceControlFn?

public fun interface PclusapiClusterNetInterfaceControlExFn {
    public operator fun invoke(hnetinterface: Hnetinterface, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiClusterNetInterfaceControlEx = PclusapiClusterNetInterfaceControlExFn?

public fun interface PclusapiClusterNodeCloseEnumFn {
    public operator fun invoke(hnodeenum: Hnodeenum): UInt
}

public typealias PclusapiClusterNodeCloseEnum = PclusapiClusterNodeCloseEnumFn?

public fun interface PclusapiClusterNodeCloseEnumExFn {
    public operator fun invoke(hnodeenum: Hnodeenumex): UInt
}

public typealias PclusapiClusterNodeCloseEnumEx = PclusapiClusterNodeCloseEnumExFn?

public fun interface PclusapiClusterNodeControlFn {
    public operator fun invoke(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt
}

public typealias PclusapiClusterNodeControl = PclusapiClusterNodeControlFn?

public fun interface PclusapiClusterNodeControlExFn {
    public operator fun invoke(hnode: Hnode, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiClusterNodeControlEx = PclusapiClusterNodeControlExFn?

public fun interface PclusapiClusterNodeEnumFn {
    public operator fun invoke(hnodeenum: Hnodeenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt
}

public typealias PclusapiClusterNodeEnum = PclusapiClusterNodeEnumFn?

public fun interface PclusapiClusterNodeEnumExFn {
    public operator fun invoke(hnodeenum: Hnodeenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt
}

public typealias PclusapiClusterNodeEnumEx = PclusapiClusterNodeEnumExFn?

public fun interface PclusapiClusterNodeGetEnumCountFn {
    public operator fun invoke(hnodeenum: Hnodeenum): UInt
}

public typealias PclusapiClusterNodeGetEnumCount = PclusapiClusterNodeGetEnumCountFn?

public fun interface PclusapiClusterNodeGetEnumCountExFn {
    public operator fun invoke(hnodeenum: Hnodeenumex): UInt
}

public typealias PclusapiClusterNodeGetEnumCountEx = PclusapiClusterNodeGetEnumCountExFn?

public fun interface PclusapiClusterNodeOpenEnumFn {
    public operator fun invoke(hnode: Hnode, dwtype: UInt): Hnodeenum
}

public typealias PclusapiClusterNodeOpenEnum = PclusapiClusterNodeOpenEnumFn?

public fun interface PclusapiClusterNodeOpenEnumExFn {
    public operator fun invoke(hnode: Hnode, dwtype: UInt, poptions: ConstPtr): Hnodeenumex
}

public typealias PclusapiClusterNodeOpenEnumEx = PclusapiClusterNodeOpenEnumExFn?

public fun interface PclusapiClusterOpenEnumFn {
    public operator fun invoke(hcluster: Hcluster, dwtype: UInt): Hclusenum
}

public typealias PclusapiClusterOpenEnum = PclusapiClusterOpenEnumFn?

public fun interface PclusapiClusterOpenEnumExFn {
    public operator fun invoke(hcluster: Hcluster, dwtype: UInt, poptions: ConstPtr): Hclusenumex
}

public typealias PclusapiClusterOpenEnumEx = PclusapiClusterOpenEnumExFn?

public fun interface PclusapiClusterRegCloseKeyFn {
    public operator fun invoke(hkey: Hkey): Int
}

public typealias PclusapiClusterRegCloseKey = PclusapiClusterRegCloseKeyFn?

public fun interface PclusapiClusterRegCreateBatchFn {
    public operator fun invoke(hkey: Hkey, phregbatch: MutPtr): Int
}

public typealias PclusapiClusterRegCreateBatch = PclusapiClusterRegCreateBatchFn?

public fun interface PclusapiClusterRegCreateKeyFn {
    public operator fun invoke(hkey: Hkey, lpszsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr): Int
}

public typealias PclusapiClusterRegCreateKey = PclusapiClusterRegCreateKeyFn?

public fun interface PclusapiClusterRegCreateKeyExFn {
    public operator fun invoke(hkey: Hkey, lpszsubkey: Pcwstr, dwoptions: UInt, samdesired: UInt, lpsecurityattributes: ConstPtr, phkresult: MutPtr, lpdwdisposition: MutPtr, lpszreason: Pcwstr): Int
}

public typealias PclusapiClusterRegCreateKeyEx = PclusapiClusterRegCreateKeyExFn?

public fun interface PclusapiClusterRegDeleteKeyFn {
    public operator fun invoke(hkey: Hkey, lpszsubkey: Pcwstr): Int
}

public typealias PclusapiClusterRegDeleteKey = PclusapiClusterRegDeleteKeyFn?

public fun interface PclusapiClusterRegDeleteKeyExFn {
    public operator fun invoke(hkey: Hkey, lpsubkey: Pcwstr, lpszreason: Pcwstr): Int
}

public typealias PclusapiClusterRegDeleteKeyEx = PclusapiClusterRegDeleteKeyExFn?

public fun interface PclusapiClusterRegDeleteValueFn {
    public operator fun invoke(hkey: Hkey, lpszvaluename: Pcwstr): UInt
}

public typealias PclusapiClusterRegDeleteValue = PclusapiClusterRegDeleteValueFn?

public fun interface PclusapiClusterRegDeleteValueExFn {
    public operator fun invoke(hkey: Hkey, lpszvaluename: Pcwstr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiClusterRegDeleteValueEx = PclusapiClusterRegDeleteValueExFn?

public fun interface PclusapiClusterRegEnumKeyFn {
    public operator fun invoke(hkey: Hkey, dwindex: UInt, lpszname: Pwstr, lpcchname: MutPtr, lpftlastwritetime: MutPtr): Int
}

public typealias PclusapiClusterRegEnumKey = PclusapiClusterRegEnumKeyFn?

public fun interface PclusapiClusterRegEnumValueFn {
    public operator fun invoke(hkey: Hkey, dwindex: UInt, lpszvaluename: Pwstr, lpcchvaluename: MutPtr, lpdwtype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): UInt
}

public typealias PclusapiClusterRegEnumValue = PclusapiClusterRegEnumValueFn?

public fun interface PclusapiClusterRegGetKeySecurityFn {
    public operator fun invoke(hkey: Hkey, requestedinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr): Int
}

public typealias PclusapiClusterRegGetKeySecurity = PclusapiClusterRegGetKeySecurityFn?

public fun interface PclusapiClusterRegOpenKeyFn {
    public operator fun invoke(hkey: Hkey, lpszsubkey: Pcwstr, samdesired: UInt, phkresult: MutPtr): Int
}

public typealias PclusapiClusterRegOpenKey = PclusapiClusterRegOpenKeyFn?

public fun interface PclusapiClusterRegQueryInfoKeyFn {
    public operator fun invoke(hkey: Hkey, lpcsubkeys: MutPtr, lpcbmaxsubkeylen: MutPtr, lpcvalues: MutPtr, lpcbmaxvaluenamelen: MutPtr, lpcbmaxvaluelen: MutPtr, lpcbsecuritydescriptor: MutPtr, lpftlastwritetime: MutPtr): Int
}

public typealias PclusapiClusterRegQueryInfoKey = PclusapiClusterRegQueryInfoKeyFn?

public fun interface PclusapiClusterRegQueryValueFn {
    public operator fun invoke(hkey: Hkey, lpszvaluename: Pcwstr, lpdwvaluetype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Int
}

public typealias PclusapiClusterRegQueryValue = PclusapiClusterRegQueryValueFn?

public fun interface PclusapiClusterRegSetKeySecurityFn {
    public operator fun invoke(hkey: Hkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Int
}

public typealias PclusapiClusterRegSetKeySecurity = PclusapiClusterRegSetKeySecurityFn?

public fun interface PclusapiClusterRegSetKeySecurityExFn {
    public operator fun invoke(hkey: Hkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpszreason: Pcwstr): Int
}

public typealias PclusapiClusterRegSetKeySecurityEx = PclusapiClusterRegSetKeySecurityExFn?

public fun interface PclusapiClusterRegSetValueFn {
    public operator fun invoke(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): UInt
}

public typealias PclusapiClusterRegSetValue = PclusapiClusterRegSetValueFn?

public fun interface PclusapiClusterRegSetValueExFn {
    public operator fun invoke(hkey: Hkey, lpszvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt, lpszreason: Pcwstr): UInt
}

public typealias PclusapiClusterRegSetValueEx = PclusapiClusterRegSetValueExFn?

public fun interface PclusapiClusterRegSyncDatabaseFn {
    public operator fun invoke(hcluster: Hcluster, flags: UInt): Int
}

public typealias PclusapiClusterRegSyncDatabase = PclusapiClusterRegSyncDatabaseFn?

public fun interface PclusapiClusterRemoveAffinityRuleFn {
    public operator fun invoke(hcluster: Hcluster, rulename: Pcwstr): UInt
}

public typealias PclusapiClusterRemoveAffinityRule = PclusapiClusterRemoveAffinityRuleFn?

public fun interface PclusapiClusterRemoveGroupFromAffinityRuleFn {
    public operator fun invoke(hcluster: Hcluster, rulename: Pcwstr, hgroup: Hgroup): UInt
}

public typealias PclusapiClusterRemoveGroupFromAffinityRule = PclusapiClusterRemoveGroupFromAffinityRuleFn?

public fun interface PclusapiClusterRemoveGroupFromGroupsetFn {
    public operator fun invoke(hgroupset: Hgroupset): UInt
}

public typealias PclusapiClusterRemoveGroupFromGroupset = PclusapiClusterRemoveGroupFromGroupsetFn?

public fun interface PclusapiClusterRemoveGroupFromGroupsetExFn {
    public operator fun invoke(hgroupset: Hgroupset, lpszreason: Pcwstr): UInt
}

public typealias PclusapiClusterRemoveGroupFromGroupsetEx = PclusapiClusterRemoveGroupFromGroupsetExFn?

public fun interface PclusapiClusterResourceCloseEnumFn {
    public operator fun invoke(hresenum: Hresenum): UInt
}

public typealias PclusapiClusterResourceCloseEnum = PclusapiClusterResourceCloseEnumFn?

public fun interface PclusapiClusterResourceCloseEnumExFn {
    public operator fun invoke(hresourceenumex: Hresenumex): UInt
}

public typealias PclusapiClusterResourceCloseEnumEx = PclusapiClusterResourceCloseEnumExFn?

public fun interface PclusapiClusterResourceControlFn {
    public operator fun invoke(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr): UInt
}

public typealias PclusapiClusterResourceControl = PclusapiClusterResourceControlFn?

public fun interface PclusapiClusterResourceControlAsUserExFn {
    public operator fun invoke(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiClusterResourceControlAsUserEx = PclusapiClusterResourceControlAsUserExFn?

public fun interface PclusapiClusterResourceControlExFn {
    public operator fun invoke(hresource: Hresource, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, cbinbuffersize: UInt, lpoutbuffer: MutPtr, cboutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiClusterResourceControlEx = PclusapiClusterResourceControlExFn?

public fun interface PclusapiClusterResourceEnumFn {
    public operator fun invoke(hresenum: Hresenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt
}

public typealias PclusapiClusterResourceEnum = PclusapiClusterResourceEnumFn?

public fun interface PclusapiClusterResourceEnumExFn {
    public operator fun invoke(hresourceenumex: Hresenumex, dwindex: UInt, pitem: MutPtr, cbitem: MutPtr): UInt
}

public typealias PclusapiClusterResourceEnumEx = PclusapiClusterResourceEnumExFn?

public fun interface PclusapiClusterResourceGetEnumCountFn {
    public operator fun invoke(hresenum: Hresenum): UInt
}

public typealias PclusapiClusterResourceGetEnumCount = PclusapiClusterResourceGetEnumCountFn?

public fun interface PclusapiClusterResourceGetEnumCountExFn {
    public operator fun invoke(hresourceenumex: Hresenumex): UInt
}

public typealias PclusapiClusterResourceGetEnumCountEx = PclusapiClusterResourceGetEnumCountExFn?

public fun interface PclusapiClusterResourceOpenEnumFn {
    public operator fun invoke(hresource: Hresource, dwtype: UInt): Hresenum
}

public typealias PclusapiClusterResourceOpenEnum = PclusapiClusterResourceOpenEnumFn?

public fun interface PclusapiClusterResourceOpenEnumExFn {
    public operator fun invoke(hcluster: Hcluster, lpszproperties: Pcwstr, cbproperties: UInt, lpszroproperties: Pcwstr, cbroproperties: UInt, dwflags: UInt): Hresenumex
}

public typealias PclusapiClusterResourceOpenEnumEx = PclusapiClusterResourceOpenEnumExFn?

public fun interface PclusapiClusterResourceTypeCloseEnumFn {
    public operator fun invoke(hrestypeenum: Hrestypeenum): UInt
}

public typealias PclusapiClusterResourceTypeCloseEnum = PclusapiClusterResourceTypeCloseEnumFn?

public fun interface PclusapiClusterResourceTypeControlFn {
    public operator fun invoke(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr): UInt
}

public typealias PclusapiClusterResourceTypeControl = PclusapiClusterResourceTypeControlFn?

public fun interface PclusapiClusterResourceTypeControlAsUserExFn {
    public operator fun invoke(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiClusterResourceTypeControlAsUserEx = PclusapiClusterResourceTypeControlAsUserExFn?

public fun interface PclusapiClusterResourceTypeControlExFn {
    public operator fun invoke(hcluster: Hcluster, lpszresourcetypename: Pcwstr, hhostnode: Hnode, dwcontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiClusterResourceTypeControlEx = PclusapiClusterResourceTypeControlExFn?

public fun interface PclusapiClusterResourceTypeEnumFn {
    public operator fun invoke(hrestypeenum: Hrestypeenum, dwindex: UInt, lpdwtype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr): UInt
}

public typealias PclusapiClusterResourceTypeEnum = PclusapiClusterResourceTypeEnumFn?

public fun interface PclusapiClusterResourceTypeGetEnumCountFn {
    public operator fun invoke(hrestypeenum: Hrestypeenum): UInt
}

public typealias PclusapiClusterResourceTypeGetEnumCount = PclusapiClusterResourceTypeGetEnumCountFn?

public fun interface PclusapiClusterResourceTypeOpenEnumFn {
    public operator fun invoke(hcluster: Hcluster, lpszresourcetypename: Pcwstr, dwtype: UInt): Hrestypeenum
}

public typealias PclusapiClusterResourceTypeOpenEnum = PclusapiClusterResourceTypeOpenEnumFn?

public fun interface PclusapiClusterUpgradeFn {
    public operator fun invoke(hcluster: Hcluster, perform: Bool, pfnprogresscallback: PclusterUpgradeProgressCallback, pvcallbackarg: ConstPtr): UInt
}

public typealias PclusapiClusterUpgrade = PclusapiClusterUpgradeFn?

public fun interface PclusapiClusWorkerCreateFn {
    public operator fun invoke(lpworker: MutPtr, lpstartaddress: PworkerStartRoutine, lpparameter: MutPtr): UInt
}

public typealias PclusapiClusWorkerCreate = PclusapiClusWorkerCreateFn?

public fun interface PclusapiClusWorkerTerminateFn {
    public operator fun invoke(lpworker: ConstPtr)
}

public typealias PclusapiClusWorkerTerminate = PclusapiClusWorkerTerminateFn?

public fun interface PclusapiCreateClusterFn {
    public operator fun invoke(pconfig: ConstPtr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hcluster
}

public typealias PclusapiCreateCluster = PclusapiCreateClusterFn?

public fun interface PclusapiCreateClusterAvailabilitySetFn {
    public operator fun invoke(hcluster: Hcluster, lpavailabilitysetname: Pcwstr, pavailabilitysetconfig: ConstPtr): Hgroupset
}

public typealias PclusapiCreateClusterAvailabilitySet = PclusapiCreateClusterAvailabilitySetFn?

public fun interface PclusapiCreateClusterCnolessFn {
    public operator fun invoke(pconfig: ConstPtr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): Hcluster
}

public typealias PclusapiCreateClusterCnoless = PclusapiCreateClusterCnolessFn?

public fun interface PclusapiCreateClusterGroupFn {
    public operator fun invoke(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup
}

public typealias PclusapiCreateClusterGroup = PclusapiCreateClusterGroupFn?

public fun interface PclusapiCreateClusterGroupexFn {
    public operator fun invoke(hcluster: Hcluster, lpszgroupname: Pcwstr, pgroupinfo: ConstPtr): Hgroup
}

public typealias PclusapiCreateClusterGroupex = PclusapiCreateClusterGroupexFn?

public fun interface PclusapiCreateClusterGroupGroupsetFn {
    public operator fun invoke(hcluster: Hcluster, lpszgroupsetname: Pcwstr): Hgroupset
}

public typealias PclusapiCreateClusterGroupGroupset = PclusapiCreateClusterGroupGroupsetFn?

public fun interface PclusapiCreateClusterNameAccountFn {
    public operator fun invoke(hcluster: Hcluster, pconfig: ConstPtr, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr): UInt
}

public typealias PclusapiCreateClusterNameAccount = PclusapiCreateClusterNameAccountFn?

public fun interface PclusapiCreateClusterNotifyPortFn {
    public operator fun invoke(hchange: Hchange, hcluster: Hcluster, dwfilter: UInt, dwnotifykey: ULong): Hchange
}

public typealias PclusapiCreateClusterNotifyPort = PclusapiCreateClusterNotifyPortFn?

public fun interface PclusapiCreateClusterNotifyPortV2Fn {
    public operator fun invoke(hchange: Hchange, hcluster: Hcluster, filters: ConstPtr, dwfiltercount: UInt, dwnotifykey: ULong): Hchange
}

public typealias PclusapiCreateClusterNotifyPortV2 = PclusapiCreateClusterNotifyPortV2Fn?

public fun interface PclusapiCreateClusterResourceFn {
    public operator fun invoke(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt): Hresource
}

public typealias PclusapiCreateClusterResource = PclusapiCreateClusterResourceFn?

public fun interface PclusapiCreateClusterResourceExFn {
    public operator fun invoke(hgroup: Hgroup, lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwflags: UInt, lpszreason: Pcwstr): Hresource
}

public typealias PclusapiCreateClusterResourceEx = PclusapiCreateClusterResourceExFn?

public fun interface PclusapiCreateClusterResourceTypeFn {
    public operator fun invoke(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt): UInt
}

public typealias PclusapiCreateClusterResourceType = PclusapiCreateClusterResourceTypeFn?

public fun interface PclusapiCreateClusterResourceTypeExFn {
    public operator fun invoke(hcluster: Hcluster, lpszresourcetypename: Pcwstr, lpszdisplayname: Pcwstr, lpszresourcetypedll: Pcwstr, dwlooksalivepollinterval: UInt, dwisalivepollinterval: UInt, lpszreason: Pcwstr): UInt
}

public typealias PclusapiCreateClusterResourceTypeEx = PclusapiCreateClusterResourceTypeExFn?

public fun interface PclusapiDeleteClusterGroupFn {
    public operator fun invoke(hgroup: Hgroup): UInt
}

public typealias PclusapiDeleteClusterGroup = PclusapiDeleteClusterGroupFn?

public fun interface PclusapiDeleteClusterGroupExFn {
    public operator fun invoke(hgroup: Hgroup, lpszreason: Pcwstr): UInt
}

public typealias PclusapiDeleteClusterGroupEx = PclusapiDeleteClusterGroupExFn?

public fun interface PclusapiDeleteClusterGroupGroupsetFn {
    public operator fun invoke(hgroupset: Hgroupset): UInt
}

public typealias PclusapiDeleteClusterGroupGroupset = PclusapiDeleteClusterGroupGroupsetFn?

public fun interface PclusapiDeleteClusterGroupGroupsetExFn {
    public operator fun invoke(hgroupset: Hgroupset, lpszreason: Pcwstr): UInt
}

public typealias PclusapiDeleteClusterGroupGroupsetEx = PclusapiDeleteClusterGroupGroupsetExFn?

public fun interface PclusapiDeleteClusterResourceFn {
    public operator fun invoke(hresource: Hresource): UInt
}

public typealias PclusapiDeleteClusterResource = PclusapiDeleteClusterResourceFn?

public fun interface PclusapiDeleteClusterResourceExFn {
    public operator fun invoke(hresource: Hresource, lpszreason: Pcwstr): UInt
}

public typealias PclusapiDeleteClusterResourceEx = PclusapiDeleteClusterResourceExFn?

public fun interface PclusapiDeleteClusterResourceTypeFn {
    public operator fun invoke(hcluster: Hcluster, lpszresourcetypename: Pcwstr): UInt
}

public typealias PclusapiDeleteClusterResourceType = PclusapiDeleteClusterResourceTypeFn?

public fun interface PclusapiDeleteClusterResourceTypeExFn {
    public operator fun invoke(hcluster: Hcluster, lpsztypename: Pcwstr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiDeleteClusterResourceTypeEx = PclusapiDeleteClusterResourceTypeExFn?

public fun interface PclusapiDestroyClusterFn {
    public operator fun invoke(hcluster: Hcluster, pfnprogresscallback: PclusterSetupProgressCallback, pvcallbackarg: ConstPtr, fdeletevirtualcomputerobjects: Bool): UInt
}

public typealias PclusapiDestroyCluster = PclusapiDestroyClusterFn?

public fun interface PclusapiDestroyClusterGroupFn {
    public operator fun invoke(hgroup: Hgroup): UInt
}

public typealias PclusapiDestroyClusterGroup = PclusapiDestroyClusterGroupFn?

public fun interface PclusapiDestroyClusterGroupExFn {
    public operator fun invoke(hgroup: Hgroup, lpszreason: Pcwstr): UInt
}

public typealias PclusapiDestroyClusterGroupEx = PclusapiDestroyClusterGroupExFn?

public fun interface PclusapiEvictClusterNodeFn {
    public operator fun invoke(hnode: Hnode): UInt
}

public typealias PclusapiEvictClusterNode = PclusapiEvictClusterNodeFn?

public fun interface PclusapiEvictClusterNodeExFn {
    public operator fun invoke(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: MutPtr): UInt
}

public typealias PclusapiEvictClusterNodeEx = PclusapiEvictClusterNodeExFn?

public fun interface PclusapiEvictClusterNodeEx2Fn {
    public operator fun invoke(hnode: Hnode, dwtimeout: UInt, phrcleanupstatus: MutPtr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiEvictClusterNodeEx2 = PclusapiEvictClusterNodeEx2Fn?

public fun interface PclusapiFailClusterResourceFn {
    public operator fun invoke(hresource: Hresource): UInt
}

public typealias PclusapiFailClusterResource = PclusapiFailClusterResourceFn?

public fun interface PclusapiFailClusterResourceExFn {
    public operator fun invoke(hresource: Hresource, lpszreason: Pcwstr): UInt
}

public typealias PclusapiFailClusterResourceEx = PclusapiFailClusterResourceExFn?

public fun interface PclusapiGetClusterFromGroupFn {
    public operator fun invoke(hgroup: Hgroup): Hcluster
}

public typealias PclusapiGetClusterFromGroup = PclusapiGetClusterFromGroupFn?

public fun interface PclusapiGetClusterFromGroupGroupsetFn {
    public operator fun invoke(hgroupset: Hgroupset): Hcluster
}

public typealias PclusapiGetClusterFromGroupGroupset = PclusapiGetClusterFromGroupGroupsetFn?

public fun interface PclusapiGetClusterFromNetworkFn {
    public operator fun invoke(hnetwork: Hnetwork): Hcluster
}

public typealias PclusapiGetClusterFromNetwork = PclusapiGetClusterFromNetworkFn?

public fun interface PclusapiGetClusterFromNetInterfaceFn {
    public operator fun invoke(hnetinterface: Hnetinterface): Hcluster
}

public typealias PclusapiGetClusterFromNetInterface = PclusapiGetClusterFromNetInterfaceFn?

public fun interface PclusapiGetClusterFromNodeFn {
    public operator fun invoke(hnode: Hnode): Hcluster
}

public typealias PclusapiGetClusterFromNode = PclusapiGetClusterFromNodeFn?

public fun interface PclusapiGetClusterFromResourceFn {
    public operator fun invoke(hresource: Hresource): Hcluster
}

public typealias PclusapiGetClusterFromResource = PclusapiGetClusterFromResourceFn?

public fun interface PclusapiGetClusterGroupKeyFn {
    public operator fun invoke(hgroup: Hgroup, samdesired: UInt): Hkey
}

public typealias PclusapiGetClusterGroupKey = PclusapiGetClusterGroupKeyFn?

public fun interface PclusapiGetClusterGroupStateFn {
    public operator fun invoke(hgroup: Hgroup, lpsznodename: Pwstr, lpcchnodename: MutPtr): ClusterGroupState
}

public typealias PclusapiGetClusterGroupState = PclusapiGetClusterGroupStateFn?

public fun interface PclusapiGetClusterInformationFn {
    public operator fun invoke(hcluster: Hcluster, lpszclustername: Pwstr, lpcchclustername: MutPtr, lpclusterinfo: MutPtr): UInt
}

public typealias PclusapiGetClusterInformation = PclusapiGetClusterInformationFn?

public fun interface PclusapiGetClusterKeyFn {
    public operator fun invoke(hcluster: Hcluster, samdesired: UInt): Hkey
}

public typealias PclusapiGetClusterKey = PclusapiGetClusterKeyFn?

public fun interface PclusapiGetClusterNetworkIdFn {
    public operator fun invoke(hnetwork: Hnetwork, lpsznetworkid: Pwstr, lpcchname: MutPtr): UInt
}

public typealias PclusapiGetClusterNetworkId = PclusapiGetClusterNetworkIdFn?

public fun interface PclusapiGetClusterNetworkKeyFn {
    public operator fun invoke(hnetwork: Hnetwork, samdesired: UInt): Hkey
}

public typealias PclusapiGetClusterNetworkKey = PclusapiGetClusterNetworkKeyFn?

public fun interface PclusapiGetClusterNetworkStateFn {
    public operator fun invoke(hnetwork: Hnetwork): ClusterNetworkState
}

public typealias PclusapiGetClusterNetworkState = PclusapiGetClusterNetworkStateFn?

public fun interface PclusapiGetClusterNetInterfaceFn {
    public operator fun invoke(hcluster: Hcluster, lpsznodename: Pcwstr, lpsznetworkname: Pcwstr, lpszinterfacename: Pwstr, lpcchinterfacename: MutPtr): UInt
}

public typealias PclusapiGetClusterNetInterface = PclusapiGetClusterNetInterfaceFn?

public fun interface PclusapiGetClusterNetInterfaceKeyFn {
    public operator fun invoke(hnetinterface: Hnetinterface, samdesired: UInt): Hkey
}

public typealias PclusapiGetClusterNetInterfaceKey = PclusapiGetClusterNetInterfaceKeyFn?

public fun interface PclusapiGetClusterNetInterfaceStateFn {
    public operator fun invoke(hnetinterface: Hnetinterface): ClusterNetinterfaceState
}

public typealias PclusapiGetClusterNetInterfaceState = PclusapiGetClusterNetInterfaceStateFn?

public fun interface PclusapiGetClusterNodeIdFn {
    public operator fun invoke(hnode: Hnode, lpsznodeid: Pwstr, lpcchname: MutPtr): UInt
}

public typealias PclusapiGetClusterNodeId = PclusapiGetClusterNodeIdFn?

public fun interface PclusapiGetClusterNodeKeyFn {
    public operator fun invoke(hnode: Hnode, samdesired: UInt): Hkey
}

public typealias PclusapiGetClusterNodeKey = PclusapiGetClusterNodeKeyFn?

public fun interface PclusapiGetClusterNodeStateFn {
    public operator fun invoke(hnode: Hnode): ClusterNodeState
}

public typealias PclusapiGetClusterNodeState = PclusapiGetClusterNodeStateFn?

public fun interface PclusapiGetClusterNotifyFn {
    public operator fun invoke(hchange: Hchange, lpdwnotifykey: MutPtr, lpdwfiltertype: MutPtr, lpszname: Pwstr, lpcchname: MutPtr, dwmilliseconds: UInt): UInt
}

public typealias PclusapiGetClusterNotify = PclusapiGetClusterNotifyFn?

public fun interface PclusapiGetClusterNotifyV2Fn {
    public operator fun invoke(hchange: Hchange, lpdwnotifykey: MutPtr, pfilterandtype: MutPtr, buffer: MutPtr, lpcchbuffersize: MutPtr, lpszobjectid: Pwstr, lpcchobjectid: MutPtr, lpszparentid: Pwstr, lpcchparentid: MutPtr, lpszname: Pwstr, lpcchname: MutPtr, lpsztype: Pwstr, lpcchtype: MutPtr, dwmilliseconds: UInt): UInt
}

public typealias PclusapiGetClusterNotifyV2 = PclusapiGetClusterNotifyV2Fn?

public fun interface PclusapiGetClusterQuorumResourceFn {
    public operator fun invoke(hcluster: Hcluster, lpszresourcename: Pwstr, lpcchresourcename: MutPtr, lpszdevicename: Pwstr, lpcchdevicename: MutPtr, lpdwmaxquorumlogsize: MutPtr): UInt
}

public typealias PclusapiGetClusterQuorumResource = PclusapiGetClusterQuorumResourceFn?

public fun interface PclusapiGetClusterResourceDependencyExpressionFn {
    public operator fun invoke(hresource: Hresource, lpszdependencyexpression: Pwstr, lpcchdependencyexpression: MutPtr): UInt
}

public typealias PclusapiGetClusterResourceDependencyExpression = PclusapiGetClusterResourceDependencyExpressionFn?

public fun interface PclusapiGetClusterResourceKeyFn {
    public operator fun invoke(hresource: Hresource, samdesired: UInt): Hkey
}

public typealias PclusapiGetClusterResourceKey = PclusapiGetClusterResourceKeyFn?

public fun interface PclusapiGetClusterResourceNetworkNameFn {
    public operator fun invoke(hresource: Hresource, lpbuffer: Pwstr, nsize: MutPtr): Bool
}

public typealias PclusapiGetClusterResourceNetworkName = PclusapiGetClusterResourceNetworkNameFn?

public fun interface PclusapiGetClusterResourceStateFn {
    public operator fun invoke(hresource: Hresource, lpsznodename: Pwstr, lpcchnodename: MutPtr, lpszgroupname: Pwstr, lpcchgroupname: MutPtr): ClusterResourceState
}

public typealias PclusapiGetClusterResourceState = PclusapiGetClusterResourceStateFn?

public fun interface PclusapiGetClusterResourceTypeKeyFn {
    public operator fun invoke(hcluster: Hcluster, lpsztypename: Pcwstr, samdesired: UInt): Hkey
}

public typealias PclusapiGetClusterResourceTypeKey = PclusapiGetClusterResourceTypeKeyFn?

public fun interface PclusapiGetNodeClusterStateFn {
    public operator fun invoke(lpsznodename: Pcwstr, pdwclusterstate: MutPtr): UInt
}

public typealias PclusapiGetNodeClusterState = PclusapiGetNodeClusterStateFn?

public fun interface PclusapiGetNotifyEventHandleV2Fn {
    public operator fun invoke(hchange: Hchange, lphtargetevent: MutPtr): UInt
}

public typealias PclusapiGetNotifyEventHandleV2 = PclusapiGetNotifyEventHandleV2Fn?

public fun interface PclusapiIsFileOnClusterSharedVolumeFn {
    public operator fun invoke(lpszpathname: Pcwstr, pbfileisonsharedvolume: MutPtr): UInt
}

public typealias PclusapiIsFileOnClusterSharedVolume = PclusapiIsFileOnClusterSharedVolumeFn?

public fun interface PclusapiMoveClusterGroupFn {
    public operator fun invoke(hgroup: Hgroup, hdestinationnode: Hnode): UInt
}

public typealias PclusapiMoveClusterGroup = PclusapiMoveClusterGroupFn?

public fun interface PclusapiOfflineClusterGroupFn {
    public operator fun invoke(hgroup: Hgroup): UInt
}

public typealias PclusapiOfflineClusterGroup = PclusapiOfflineClusterGroupFn?

public fun interface PclusapiOfflineClusterResourceFn {
    public operator fun invoke(hresource: Hresource): UInt
}

public typealias PclusapiOfflineClusterResource = PclusapiOfflineClusterResourceFn?

public fun interface PclusapiOnlineClusterGroupFn {
    public operator fun invoke(hgroup: Hgroup, hdestinationnode: Hnode): UInt
}

public typealias PclusapiOnlineClusterGroup = PclusapiOnlineClusterGroupFn?

public fun interface PclusapiOnlineClusterResourceFn {
    public operator fun invoke(hresource: Hresource): UInt
}

public typealias PclusapiOnlineClusterResource = PclusapiOnlineClusterResourceFn?

public fun interface PclusapiOpenClusterFn {
    public operator fun invoke(lpszclustername: Pcwstr): Hcluster
}

public typealias PclusapiOpenCluster = PclusapiOpenClusterFn?

public fun interface PclusapiOpenClusterExFn {
    public operator fun invoke(lpszclustername: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hcluster
}

public typealias PclusapiOpenClusterEx = PclusapiOpenClusterExFn?

public fun interface PclusapiOpenClusterGroupFn {
    public operator fun invoke(hcluster: Hcluster, lpszgroupname: Pcwstr): Hgroup
}

public typealias PclusapiOpenClusterGroup = PclusapiOpenClusterGroupFn?

public fun interface PclusapiOpenClusterGroupExFn {
    public operator fun invoke(hcluster: Hcluster, lpszgroupname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hgroup
}

public typealias PclusapiOpenClusterGroupEx = PclusapiOpenClusterGroupExFn?

public fun interface PclusapiOpenClusterGroupGroupsetFn {
    public operator fun invoke(hcluster: Hcluster, lpszgroupsetname: Pcwstr): Hgroupset
}

public typealias PclusapiOpenClusterGroupGroupset = PclusapiOpenClusterGroupGroupsetFn?

public fun interface PclusapiOpenClusterNetinterfaceExFn {
    public operator fun invoke(hcluster: Hcluster, lpsznetinterfacename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hnetinterface
}

public typealias PclusapiOpenClusterNetinterfaceEx = PclusapiOpenClusterNetinterfaceExFn?

public fun interface PclusapiOpenClusterNetworkFn {
    public operator fun invoke(hcluster: Hcluster, lpsznetworkname: Pcwstr): Hnetwork
}

public typealias PclusapiOpenClusterNetwork = PclusapiOpenClusterNetworkFn?

public fun interface PclusapiOpenClusterNetworkExFn {
    public operator fun invoke(hcluster: Hcluster, lpsznetworkname: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hnetwork
}

public typealias PclusapiOpenClusterNetworkEx = PclusapiOpenClusterNetworkExFn?

public fun interface PclusapiOpenClusterNetInterfaceFn {
    public operator fun invoke(hcluster: Hcluster, lpszinterfacename: Pcwstr): Hnetinterface
}

public typealias PclusapiOpenClusterNetInterface = PclusapiOpenClusterNetInterfaceFn?

public fun interface PclusapiOpenClusterNodeFn {
    public operator fun invoke(hcluster: Hcluster, lpsznodename: Pcwstr): Hnode
}

public typealias PclusapiOpenClusterNode = PclusapiOpenClusterNodeFn?

public fun interface PclusapiOpenClusterNodeExFn {
    public operator fun invoke(hcluster: Hcluster, lpsznodename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hnode
}

public typealias PclusapiOpenClusterNodeEx = PclusapiOpenClusterNodeExFn?

public fun interface PclusapiOpenClusterResourceFn {
    public operator fun invoke(hcluster: Hcluster, lpszresourcename: Pcwstr): Hresource
}

public typealias PclusapiOpenClusterResource = PclusapiOpenClusterResourceFn?

public fun interface PclusapiOpenClusterResourceExFn {
    public operator fun invoke(hcluster: Hcluster, lpszresourcename: Pcwstr, dwdesiredaccess: UInt, lpdwgrantedaccess: MutPtr): Hresource
}

public typealias PclusapiOpenClusterResourceEx = PclusapiOpenClusterResourceExFn?

public fun interface PclusapiOpenNodeByIdFn {
    public operator fun invoke(hcluster: Hcluster, nodeid: UInt): Hnode
}

public typealias PclusapiOpenNodeById = PclusapiOpenNodeByIdFn?

public fun interface PclusapiPauseClusterNodeFn {
    public operator fun invoke(hnode: Hnode): UInt
}

public typealias PclusapiPauseClusterNode = PclusapiPauseClusterNodeFn?

public fun interface PclusapiPauseClusterNodeExFn {
    public operator fun invoke(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode): UInt
}

public typealias PclusapiPauseClusterNodeEx = PclusapiPauseClusterNodeExFn?

public fun interface PclusapiPauseClusterNodeEx2Fn {
    public operator fun invoke(hnode: Hnode, bdrainnode: Bool, dwpauseflags: UInt, hnodedraintarget: Hnode, lpszreason: Pcwstr): UInt
}

public typealias PclusapiPauseClusterNodeEx2 = PclusapiPauseClusterNodeEx2Fn?

public fun interface PclusapiPfnReasonHandlerFn {
    public operator fun invoke(lpparameter: ConstPtr, hcluster: Hcluster, szreason: Pwstr, lpsize: MutPtr): Bool
}

public typealias PclusapiPfnReasonHandler = PclusapiPfnReasonHandlerFn?

public fun interface PclusapiRegisterClusterNotifyFn {
    public operator fun invoke(hchange: Hchange, dwfiltertype: UInt, hobject: Handle, dwnotifykey: ULong): UInt
}

public typealias PclusapiRegisterClusterNotify = PclusapiRegisterClusterNotifyFn?

public fun interface PclusapiRegisterClusterNotifyV2Fn {
    public operator fun invoke(hchange: Hchange, filter: NotifyFilterAndType, hobject: Handle, dwnotifykey: ULong): UInt
}

public typealias PclusapiRegisterClusterNotifyV2 = PclusapiRegisterClusterNotifyV2Fn?

public fun interface PclusapiRemoveClusterGroupDependencyFn {
    public operator fun invoke(hgroup: Hgroup, hdependson: Hgroup): UInt
}

public typealias PclusapiRemoveClusterGroupDependency = PclusapiRemoveClusterGroupDependencyFn?

public fun interface PclusapiRemoveClusterGroupDependencyExFn {
    public operator fun invoke(hgroup: Hgroup, hdependson: Hgroup, lpszreason: Pcwstr): UInt
}

public typealias PclusapiRemoveClusterGroupDependencyEx = PclusapiRemoveClusterGroupDependencyExFn?

public fun interface PclusapiRemoveClusterGroupGroupsetDependencyFn {
    public operator fun invoke(hgroupset: Hgroupset, hdependson: Hgroupset): UInt
}

public typealias PclusapiRemoveClusterGroupGroupsetDependency = PclusapiRemoveClusterGroupGroupsetDependencyFn?

public fun interface PclusapiRemoveClusterGroupGroupsetDependencyExFn {
    public operator fun invoke(hgroupset: Hgroupset, hdependson: Hgroupset, lpszreason: Pcwstr): UInt
}

public typealias PclusapiRemoveClusterGroupGroupsetDependencyEx = PclusapiRemoveClusterGroupGroupsetDependencyExFn?

public fun interface PclusapiRemoveClusterGroupToGroupGroupsetDependencyFn {
    public operator fun invoke(hgroup: Hgroup, hdependson: Hgroupset): UInt
}

public typealias PclusapiRemoveClusterGroupToGroupGroupsetDependency = PclusapiRemoveClusterGroupToGroupGroupsetDependencyFn?

public fun interface PclusapiRemoveClusterGroupToGroupGroupsetDependencyExFn {
    public operator fun invoke(hgroup: Hgroup, hdependson: Hgroupset, lpszreason: Pcwstr): UInt
}

public typealias PclusapiRemoveClusterGroupToGroupGroupsetDependencyEx = PclusapiRemoveClusterGroupToGroupGroupsetDependencyExFn?

public fun interface PclusapiRemoveClusterNameAccountFn {
    public operator fun invoke(hcluster: Hcluster): UInt
}

public typealias PclusapiRemoveClusterNameAccount = PclusapiRemoveClusterNameAccountFn?

public fun interface PclusapiRemoveClusterResourceDependencyFn {
    public operator fun invoke(hresource: Hresource, hdependson: Hresource): UInt
}

public typealias PclusapiRemoveClusterResourceDependency = PclusapiRemoveClusterResourceDependencyFn?

public fun interface PclusapiRemoveClusterResourceDependencyExFn {
    public operator fun invoke(hresource: Hresource, hdependson: Hresource, lpszreason: Pcwstr): UInt
}

public typealias PclusapiRemoveClusterResourceDependencyEx = PclusapiRemoveClusterResourceDependencyExFn?

public fun interface PclusapiRemoveClusterResourceNodeFn {
    public operator fun invoke(hresource: Hresource, hnode: Hnode): UInt
}

public typealias PclusapiRemoveClusterResourceNode = PclusapiRemoveClusterResourceNodeFn?

public fun interface PclusapiRemoveClusterResourceNodeExFn {
    public operator fun invoke(hresource: Hresource, hnode: Hnode, lpszreason: Pcwstr): UInt
}

public typealias PclusapiRemoveClusterResourceNodeEx = PclusapiRemoveClusterResourceNodeExFn?

public fun interface PclusapiRemoveCrossClusterGroupsetDependencyFn {
    public operator fun invoke(hdependentgroupset: Hgroupset, lpremoteclustername: Pcwstr, lpremotegroupsetname: Pcwstr): UInt
}

public typealias PclusapiRemoveCrossClusterGroupsetDependency = PclusapiRemoveCrossClusterGroupsetDependencyFn?

public fun interface PclusapiRemoveResourceFromClusterSharedVolumesFn {
    public operator fun invoke(hresource: Hresource): UInt
}

public typealias PclusapiRemoveResourceFromClusterSharedVolumes = PclusapiRemoveResourceFromClusterSharedVolumesFn?

public fun interface PclusapiRestartClusterResourceFn {
    public operator fun invoke(hresource: Hresource, dwflags: UInt): UInt
}

public typealias PclusapiRestartClusterResource = PclusapiRestartClusterResourceFn?

public fun interface PclusapiRestartClusterResourceExFn {
    public operator fun invoke(hresource: Hresource, dwflags: UInt): UInt
}

public typealias PclusapiRestartClusterResourceEx = PclusapiRestartClusterResourceExFn?

public fun interface PclusapiRestoreClusterDatabaseFn {
    public operator fun invoke(lpszpathname: Pcwstr, bforce: Bool, lpszquorumdriveletter: Pcwstr): UInt
}

public typealias PclusapiRestoreClusterDatabase = PclusapiRestoreClusterDatabaseFn?

public fun interface PclusapiResumeClusterNodeFn {
    public operator fun invoke(hnode: Hnode): UInt
}

public typealias PclusapiResumeClusterNode = PclusapiResumeClusterNodeFn?

public fun interface PclusapiResumeClusterNodeExFn {
    public operator fun invoke(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt): UInt
}

public typealias PclusapiResumeClusterNodeEx = PclusapiResumeClusterNodeExFn?

public fun interface PclusapiResumeClusterNodeEx2Fn {
    public operator fun invoke(hnode: Hnode, eresumefailbacktype: ClusterNodeResumeFailbackType, dwresumeflagsreserved: UInt, lpszreason: Pcwstr): UInt
}

public typealias PclusapiResumeClusterNodeEx2 = PclusapiResumeClusterNodeEx2Fn?

public fun interface PclusapiSetClusterGroupGroupsetDependencyExpressionFn {
    public operator fun invoke(hgroupset: Hgroupset, lpszdependencyexpression: Pcwstr): UInt
}

public typealias PclusapiSetClusterGroupGroupsetDependencyExpression = PclusapiSetClusterGroupGroupsetDependencyExpressionFn?

public fun interface PclusapiSetClusterGroupGroupsetDependencyExpressionExFn {
    public operator fun invoke(hgroupset: Hgroupset, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiSetClusterGroupGroupsetDependencyExpressionEx = PclusapiSetClusterGroupGroupsetDependencyExpressionExFn?

public fun interface PclusapiSetClusterGroupNameFn {
    public operator fun invoke(hgroup: Hgroup, lpszgroupname: Pcwstr): UInt
}

public typealias PclusapiSetClusterGroupName = PclusapiSetClusterGroupNameFn?

public fun interface PclusapiSetClusterGroupNameExFn {
    public operator fun invoke(hgroup: Hgroup, lpszgroupname: Pcwstr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiSetClusterGroupNameEx = PclusapiSetClusterGroupNameExFn?

public fun interface PclusapiSetClusterGroupNodeListFn {
    public operator fun invoke(hgroup: Hgroup, nodecount: UInt, nodelist: ConstPtr): UInt
}

public typealias PclusapiSetClusterGroupNodeList = PclusapiSetClusterGroupNodeListFn?

public fun interface PclusapiSetClusterGroupNodeListExFn {
    public operator fun invoke(hgroup: Hgroup, nodecount: UInt, nodelist: ConstPtr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiSetClusterGroupNodeListEx = PclusapiSetClusterGroupNodeListExFn?

public fun interface PclusapiSetClusterNameExFn {
    public operator fun invoke(hcluster: Hcluster, lpsznewclustername: Pcwstr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiSetClusterNameEx = PclusapiSetClusterNameExFn?

public fun interface PclusapiSetClusterNetworkNameFn {
    public operator fun invoke(hnetwork: Hnetwork, lpszname: Pcwstr): UInt
}

public typealias PclusapiSetClusterNetworkName = PclusapiSetClusterNetworkNameFn?

public fun interface PclusapiSetClusterNetworkNameExFn {
    public operator fun invoke(hnetwork: Hnetwork, lpszname: Pcwstr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiSetClusterNetworkNameEx = PclusapiSetClusterNetworkNameExFn?

public fun interface PclusapiSetClusterNetworkPriorityOrderFn {
    public operator fun invoke(hcluster: Hcluster, networkcount: UInt, networklist: ConstPtr): UInt
}

public typealias PclusapiSetClusterNetworkPriorityOrder = PclusapiSetClusterNetworkPriorityOrderFn?

public fun interface PclusapiSetClusterQuorumResourceFn {
    public operator fun invoke(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquologsize: UInt): UInt
}

public typealias PclusapiSetClusterQuorumResource = PclusapiSetClusterQuorumResourceFn?

public fun interface PclusapiSetClusterQuorumResourceExFn {
    public operator fun invoke(hresource: Hresource, lpszdevicename: Pcwstr, dwmaxquorumlogsize: UInt, lpszreason: Pcwstr): UInt
}

public typealias PclusapiSetClusterQuorumResourceEx = PclusapiSetClusterQuorumResourceExFn?

public fun interface PclusapiSetClusterResourceDependencyExpressionFn {
    public operator fun invoke(hresource: Hresource, lpszdependencyexpression: Pcwstr): UInt
}

public typealias PclusapiSetClusterResourceDependencyExpression = PclusapiSetClusterResourceDependencyExpressionFn?

public fun interface PclusapiSetClusterResourceNameFn {
    public operator fun invoke(hresource: Hresource, lpszresourcename: Pcwstr): UInt
}

public typealias PclusapiSetClusterResourceName = PclusapiSetClusterResourceNameFn?

public fun interface PclusapiSetClusterResourceNameExFn {
    public operator fun invoke(hresource: Hresource, lpszresourcename: Pcwstr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiSetClusterResourceNameEx = PclusapiSetClusterResourceNameExFn?

public fun interface PclusapiSetClusterServiceAccountPasswordFn {
    public operator fun invoke(lpszclustername: Pcwstr, lpsznewpassword: Pcwstr, dwflags: UInt, lpreturnstatusbuffer: MutPtr, lpcbreturnstatusbuffersize: MutPtr): UInt
}

public typealias PclusapiSetClusterServiceAccountPassword = PclusapiSetClusterServiceAccountPasswordFn?

public fun interface PclusapiSetGroupDependencyExpressionFn {
    public operator fun invoke(hgroupset: Hgroup, lpszdependencyexpression: Pcwstr): UInt
}

public typealias PclusapiSetGroupDependencyExpression = PclusapiSetGroupDependencyExpressionFn?

public fun interface PclusapiSetGroupDependencyExpressionExFn {
    public operator fun invoke(hgroup: Hgroup, lpszdependencyexpression: Pcwstr, lpszreason: Pcwstr): UInt
}

public typealias PclusapiSetGroupDependencyExpressionEx = PclusapiSetGroupDependencyExpressionExFn?

public fun interface PclusapiSetReasonHandlerFn {
    public operator fun invoke(lphandler: ConstPtr): MutPtr
}

public typealias PclusapiSetReasonHandler = PclusapiSetReasonHandlerFn?

public fun interface PclusapiSharedVolumeSetSnapshotStateFn {
    public operator fun invoke(guidsnapshotset: Guid, lpszvolumename: Pcwstr, state: ClusterSharedVolumeSnapshotState): UInt
}

public typealias PclusapiSharedVolumeSetSnapshotState = PclusapiSharedVolumeSetSnapshotStateFn?

public fun interface PclusapiSetClusterNameFn {
    public operator fun invoke(hcluster: Hcluster, lpsznewclustername: Pcwstr): UInt
}

public typealias PclusapiSetClusterName = PclusapiSetClusterNameFn?

public fun interface PclusterClearBackupStateForSharedVolumeFn {
    public operator fun invoke(lpszvolumepathname: Pcwstr): UInt
}

public typealias PclusterClearBackupStateForSharedVolume = PclusterClearBackupStateForSharedVolumeFn?

public fun interface PclusterDecryptFn {
    public operator fun invoke(hcluscryptprovider: Hcluscryptprovider, pcryptinput: ConstPtr, cbcryptinput: UInt, ppcryptoutput: MutPtr, pcbcryptoutput: MutPtr): UInt
}

public typealias PclusterDecrypt = PclusterDecryptFn?

public fun interface PclusterEncryptFn {
    public operator fun invoke(hcluscryptprovider: Hcluscryptprovider, pdata: ConstPtr, cbdata: UInt, ppdata: MutPtr, pcbdata: MutPtr): UInt
}

public typealias PclusterEncrypt = PclusterEncryptFn?

public fun interface PclusterGetVolumeNameForVolumeMountPointFn {
    public operator fun invoke(lpszvolumemountpoint: Pcwstr, lpszvolumename: Pwstr, cchbufferlength: UInt): Bool
}

public typealias PclusterGetVolumeNameForVolumeMountPoint = PclusterGetVolumeNameForVolumeMountPointFn?

public fun interface PclusterGetVolumePathNameFn {
    public operator fun invoke(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, cchbufferlength: UInt): Bool
}

public typealias PclusterGetVolumePathName = PclusterGetVolumePathNameFn?

public fun interface PclusterIsPathOnSharedVolumeFn {
    public operator fun invoke(lpszpathname: Pcwstr): Bool
}

public typealias PclusterIsPathOnSharedVolume = PclusterIsPathOnSharedVolumeFn?

public fun interface PclusterPrepareSharedVolumeForBackupFn {
    public operator fun invoke(lpszfilename: Pcwstr, lpszvolumepathname: Pwstr, lpcchvolumepathname: MutPtr, lpszvolumename: Pwstr, lpcchvolumename: MutPtr): UInt
}

public typealias PclusterPrepareSharedVolumeForBackup = PclusterPrepareSharedVolumeForBackupFn?

public fun interface PclusterRegBatchAddCommandFn {
    public operator fun invoke(hregbatch: Hregbatch, dwcommand: ClusterRegCommand, wzname: Pcwstr, dwoptions: UInt, lpdata: ConstPtr, cbdata: UInt): Int
}

public typealias PclusterRegBatchAddCommand = PclusterRegBatchAddCommandFn?

public fun interface PclusterRegBatchCloseNotificationFn {
    public operator fun invoke(hbatchnotification: Hregbatchnotification): Int
}

public typealias PclusterRegBatchCloseNotification = PclusterRegBatchCloseNotificationFn?

public fun interface PclusterRegBatchReadCommandFn {
    public operator fun invoke(hbatchnotification: Hregbatchnotification, pbatchcommand: MutPtr): Int
}

public typealias PclusterRegBatchReadCommand = PclusterRegBatchReadCommandFn?

public fun interface PclusterRegCloseBatchFn {
    public operator fun invoke(hregbatch: Hregbatch, bcommit: Bool, failedcommandnumber: MutPtr): Int
}

public typealias PclusterRegCloseBatch = PclusterRegCloseBatchFn?

public fun interface PclusterRegCloseBatchNotifyPortFn {
    public operator fun invoke(hbatchnotifyport: Hregbatchport): Int
}

public typealias PclusterRegCloseBatchNotifyPort = PclusterRegCloseBatchNotifyPortFn?

public fun interface PclusterRegCloseReadBatchFn {
    public operator fun invoke(hregreadbatch: Hregreadbatch, phregreadbatchreply: MutPtr): Int
}

public typealias PclusterRegCloseReadBatch = PclusterRegCloseReadBatchFn?

public fun interface PclusterRegCloseReadBatchExFn {
    public operator fun invoke(hregreadbatch: Hregreadbatch, flags: UInt, phregreadbatchreply: MutPtr): Int
}

public typealias PclusterRegCloseReadBatchEx = PclusterRegCloseReadBatchExFn?

public fun interface PclusterRegCloseReadBatchReplyFn {
    public operator fun invoke(hregreadbatchreply: Hregreadbatchreply): Int
}

public typealias PclusterRegCloseReadBatchReply = PclusterRegCloseReadBatchReplyFn?

public fun interface PclusterRegCreateBatchNotifyPortFn {
    public operator fun invoke(hkey: Hkey, phbatchnotifyport: MutPtr): Int
}

public typealias PclusterRegCreateBatchNotifyPort = PclusterRegCreateBatchNotifyPortFn?

public fun interface PclusterRegCreateReadBatchFn {
    public operator fun invoke(hkey: Hkey, phregreadbatch: MutPtr): Int
}

public typealias PclusterRegCreateReadBatch = PclusterRegCreateReadBatchFn?

public fun interface PclusterRegGetBatchNotificationFn {
    public operator fun invoke(hbatchnotify: Hregbatchport, phbatchnotification: MutPtr): Int
}

public typealias PclusterRegGetBatchNotification = PclusterRegGetBatchNotificationFn?

public fun interface PclusterRegReadBatchAddCommandFn {
    public operator fun invoke(hregreadbatch: Hregreadbatch, wzsubkeyname: Pcwstr, wzvaluename: Pcwstr): Int
}

public typealias PclusterRegReadBatchAddCommand = PclusterRegReadBatchAddCommandFn?

public fun interface PclusterRegReadBatchReplyNextCommandFn {
    public operator fun invoke(hregreadbatchreply: Hregreadbatchreply, pbatchcommand: MutPtr): Int
}

public typealias PclusterRegReadBatchReplyNextCommand = PclusterRegReadBatchReplyNextCommandFn?

public fun interface PclusterSetupProgressCallbackFn {
    public operator fun invoke(pvcallbackarg: MutPtr, esetupphase: ClusterSetupPhase, ephasetype: ClusterSetupPhaseType, ephaseseverity: ClusterSetupPhaseSeverity, dwpercentcomplete: UInt, lpszobjectname: Pcwstr, dwstatus: UInt): Bool
}

public typealias PclusterSetupProgressCallback = PclusterSetupProgressCallbackFn?

public fun interface PclusterSetAccountAccessFn {
    public operator fun invoke(hcluster: Hcluster, szaccountsid: Pcwstr, dwaccess: UInt, dwcontroltype: UInt): UInt
}

public typealias PclusterSetAccountAccess = PclusterSetAccountAccessFn?

public fun interface PclusterUpgradeProgressCallbackFn {
    public operator fun invoke(pvcallbackarg: MutPtr, eupgradephase: ClusterUpgradePhase): Bool
}

public typealias PclusterUpgradeProgressCallback = PclusterUpgradeProgressCallbackFn?

public fun interface PendControlCallFn {
    public operator fun invoke(context: Long, status: UInt): UInt
}

public typealias PendControlCall = PendControlCallFn?

public fun interface PendTypeControlCallFn {
    public operator fun invoke(context: Long, status: UInt): UInt
}

public typealias PendTypeControlCall = PendTypeControlCallFn?

public fun interface PextendResControlCallFn {
    public operator fun invoke(context: Long, newtimeoutinms: UInt): UInt
}

public typealias PextendResControlCall = PextendResControlCallFn?

public fun interface PextendResTypeControlCallFn {
    public operator fun invoke(context: Long, newtimeoutinms: UInt): UInt
}

public typealias PextendResTypeControlCall = PextendResTypeControlCallFn?

public fun interface PfreeClusterCryptFn {
    public operator fun invoke(pcryptinfo: ConstPtr): UInt
}

public typealias PfreeClusterCrypt = PfreeClusterCryptFn?

public fun interface PisAliveRoutineFn {
    public operator fun invoke(resource: MutPtr): Bool
}

public typealias PisAliveRoutine = PisAliveRoutineFn?

public typealias PlacementOptions = Int

public fun interface PlogEventRoutineFn {
    public operator fun invoke(resourcehandle: Long, loglevel: LogLevel, formatstring: Pcwstr)
}

public typealias PlogEventRoutine = PlogEventRoutineFn?

public fun interface PlooksAliveRoutineFn {
    public operator fun invoke(resource: MutPtr): Bool
}

public typealias PlooksAliveRoutine = PlooksAliveRoutineFn?

public fun interface PofflineRoutineFn {
    public operator fun invoke(resource: MutPtr): UInt
}

public typealias PofflineRoutine = PofflineRoutineFn?

public fun interface PofflineV2RoutineFn {
    public operator fun invoke(resource: ConstPtr, destinationnodename: Pcwstr, offlineflags: UInt, inbuffer: ConstPtr, inbuffersize: UInt, reserved: UInt): UInt
}

public typealias PofflineV2Routine = PofflineV2RoutineFn?

public fun interface PonlineRoutineFn {
    public operator fun invoke(resource: MutPtr, eventhandle: MutPtr): UInt
}

public typealias PonlineRoutine = PonlineRoutineFn?

public fun interface PonlineV2RoutineFn {
    public operator fun invoke(resource: ConstPtr, eventhandle: MutPtr, onlineflags: UInt, inbuffer: ConstPtr, inbuffersize: UInt, reserved: UInt): UInt
}

public typealias PonlineV2Routine = PonlineV2RoutineFn?

public fun interface PopenClusterCryptProviderFn {
    public operator fun invoke(lpszresource: Pcwstr, lpszprovider: ConstPtr, dwtype: UInt, dwflags: UInt): Hcluscryptprovider
}

public typealias PopenClusterCryptProvider = PopenClusterCryptProviderFn?

public fun interface PopenClusterCryptProviderexFn {
    public operator fun invoke(lpszresource: Pcwstr, lpszkeyname: Pcwstr, lpszprovider: ConstPtr, dwtype: UInt, dwflags: UInt): Hcluscryptprovider
}

public typealias PopenClusterCryptProviderex = PopenClusterCryptProviderexFn?

public fun interface PopenRoutineFn {
    public operator fun invoke(resourcename: Pcwstr, resourcekey: Hkey, resourcehandle: Long): MutPtr
}

public typealias PopenRoutine = PopenRoutineFn?

public fun interface PopenV2RoutineFn {
    public operator fun invoke(resourcename: Pcwstr, resourcekey: Hkey, resourcehandle: Long, openflags: UInt): MutPtr
}

public typealias PopenV2Routine = PopenV2RoutineFn?

public fun interface PqueryAppinstanceVersionFn {
    public operator fun invoke(appinstanceid: ConstPtr, instanceversionhigh: MutPtr, instanceversionlow: MutPtr, versionstatus: MutPtr): UInt
}

public typealias PqueryAppinstanceVersion = PqueryAppinstanceVersionFn?

public fun interface PquorumResourceLostFn {
    public operator fun invoke(resource: Long)
}

public typealias PquorumResourceLost = PquorumResourceLostFn?

public fun interface PraiseResTypeNotificationFn {
    public operator fun invoke(resourcetype: Pcwstr, ppayload: ConstPtr, payloadsize: UInt): UInt
}

public typealias PraiseResTypeNotification = PraiseResTypeNotificationFn?

public fun interface PregisterAppinstanceFn {
    public operator fun invoke(processhandle: Handle, appinstanceid: ConstPtr, childreninheritappinstance: Bool): UInt
}

public typealias PregisterAppinstance = PregisterAppinstanceFn?

public fun interface PregisterAppinstanceVersionFn {
    public operator fun invoke(appinstanceid: ConstPtr, instanceversionhigh: ULong, instanceversionlow: ULong): UInt
}

public typealias PregisterAppinstanceVersion = PregisterAppinstanceVersionFn?

public fun interface PreleaseRoutineFn {
    public operator fun invoke(resource: MutPtr): UInt
}

public typealias PreleaseRoutine = PreleaseRoutineFn?

public fun interface PrequestDumpRoutineFn {
    public operator fun invoke(resourcehandle: Long, dumpduetocallinprogress: Bool, dumpdelayinms: UInt): UInt
}

public typealias PrequestDumpRoutine = PrequestDumpRoutineFn?

public fun interface PresetAllAppinstanceVersionsFn {
    public operator fun invoke(): UInt
}

public typealias PresetAllAppinstanceVersions = PresetAllAppinstanceVersionsFn?

public fun interface PresourceControlRoutineFn {
    public operator fun invoke(resource: MutPtr, controlcode: UInt, inbuffer: MutPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, bytesreturned: MutPtr): UInt
}

public typealias PresourceControlRoutine = PresourceControlRoutineFn?

public fun interface PresourceTypeControlRoutineFn {
    public operator fun invoke(resourcetypename: Pcwstr, controlcode: UInt, inbuffer: MutPtr, inbuffersize: UInt, outbuffer: MutPtr, outbuffersize: UInt, bytesreturned: MutPtr): UInt
}

public typealias PresourceTypeControlRoutine = PresourceTypeControlRoutineFn?

public fun interface PresutilAddUnknownPropertiesFn {
    public operator fun invoke(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutpropertylist: MutPtr, pcboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt
}

public typealias PresutilAddUnknownProperties = PresutilAddUnknownPropertiesFn?

public fun interface PresutilCreateDirectoryTreeFn {
    public operator fun invoke(pszpath: Pcwstr): UInt
}

public typealias PresutilCreateDirectoryTree = PresutilCreateDirectoryTreeFn?

public fun interface PresutilDupParameterBlockFn {
    public operator fun invoke(poutparams: MutPtr, pinparams: ConstPtr, ppropertytable: ConstPtr): UInt
}

public typealias PresutilDupParameterBlock = PresutilDupParameterBlockFn?

public fun interface PresutilDupStringFn {
    public operator fun invoke(pszinstring: Pcwstr): Pwstr
}

public typealias PresutilDupString = PresutilDupStringFn?

public fun interface PresutilEnumPrivatePropertiesFn {
    public operator fun invoke(hkeyclusterkey: Hkey, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt
}

public typealias PresutilEnumPrivateProperties = PresutilEnumPrivatePropertiesFn?

public fun interface PresutilEnumPropertiesFn {
    public operator fun invoke(ppropertytable: ConstPtr, pszoutproperties: Pwstr, cboutpropertiessize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt
}

public typealias PresutilEnumProperties = PresutilEnumPropertiesFn?

public fun interface PresutilEnumResourcesFn {
    public operator fun invoke(hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallback, pparameter: MutPtr): UInt
}

public typealias PresutilEnumResources = PresutilEnumResourcesFn?

public fun interface PresutilEnumResourcesExFn {
    public operator fun invoke(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: MutPtr): UInt
}

public typealias PresutilEnumResourcesEx = PresutilEnumResourcesExFn?

public fun interface PresutilEnumResourcesEx2Fn {
    public operator fun invoke(hcluster: Hcluster, hself: Hresource, lpszrestypename: Pcwstr, prescallback: LpresourceCallbackEx, pparameter: MutPtr, dwdesiredaccess: UInt): UInt
}

public typealias PresutilEnumResourcesEx2 = PresutilEnumResourcesEx2Fn?

public fun interface PresutilExpandEnvironmentStringsFn {
    public operator fun invoke(pszsrc: Pcwstr): Pwstr
}

public typealias PresutilExpandEnvironmentStrings = PresutilExpandEnvironmentStringsFn?

public fun interface PresutilFindBinaryPropertyFn {
    public operator fun invoke(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pbpropertyvalue: MutPtr, pcbpropertyvaluesize: MutPtr): UInt
}

public typealias PresutilFindBinaryProperty = PresutilFindBinaryPropertyFn?

public fun interface PresutilFindDependentDiskResourceDriveLetterFn {
    public operator fun invoke(hcluster: Hcluster, hresource: Hresource, pszdriveletter: Pwstr, pcchdriveletter: MutPtr): UInt
}

public typealias PresutilFindDependentDiskResourceDriveLetter = PresutilFindDependentDiskResourceDriveLetterFn?

public fun interface PresutilFindDwordPropertyFn {
    public operator fun invoke(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pdwpropertyvalue: MutPtr): UInt
}

public typealias PresutilFindDwordProperty = PresutilFindDwordPropertyFn?

public fun interface PresutilFindExpandedSzPropertyFn {
    public operator fun invoke(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr): UInt
}

public typealias PresutilFindExpandedSzProperty = PresutilFindExpandedSzPropertyFn?

public fun interface PresutilFindExpandSzPropertyFn {
    public operator fun invoke(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr): UInt
}

public typealias PresutilFindExpandSzProperty = PresutilFindExpandSzPropertyFn?

public fun interface PresutilFindFiletimePropertyFn {
    public operator fun invoke(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pftpropertyvalue: MutPtr): UInt
}

public typealias PresutilFindFiletimeProperty = PresutilFindFiletimePropertyFn?

public fun interface PresutilFindLongPropertyFn {
    public operator fun invoke(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: MutPtr): UInt
}

public typealias PresutilFindLongProperty = PresutilFindLongPropertyFn?

public fun interface PresutilFindMultiSzPropertyFn {
    public operator fun invoke(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr, pcbpropertyvaluesize: MutPtr): UInt
}

public typealias PresutilFindMultiSzProperty = PresutilFindMultiSzPropertyFn?

public fun interface PresutilFindSzPropertyFn {
    public operator fun invoke(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, pszpropertyvalue: MutPtr): UInt
}

public typealias PresutilFindSzProperty = PresutilFindSzPropertyFn?

public fun interface PresutilFindUlargeintegerPropertyFn {
    public operator fun invoke(ppropertylist: ConstPtr, cbpropertylistsize: UInt, pszpropertyname: Pcwstr, plpropertyvalue: MutPtr): UInt
}

public typealias PresutilFindUlargeintegerProperty = PresutilFindUlargeintegerPropertyFn?

public fun interface PresutilFreeEnvironmentFn {
    public operator fun invoke(lpenvironment: MutPtr): UInt
}

public typealias PresutilFreeEnvironment = PresutilFreeEnvironmentFn?

public fun interface PresutilFreeParameterBlockFn {
    public operator fun invoke(poutparams: MutPtr, pinparams: ConstPtr, ppropertytable: ConstPtr)
}

public typealias PresutilFreeParameterBlock = PresutilFreeParameterBlockFn?

public fun interface PresutilGetAllPropertiesFn {
    public operator fun invoke(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutpropertylist: MutPtr, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt
}

public typealias PresutilGetAllProperties = PresutilGetAllPropertiesFn?

public fun interface PresutilGetBinaryPropertyFn {
    public operator fun invoke(ppboutvalue: MutPtr, pcboutvaluesize: MutPtr, pvaluestruct: ConstPtr, pboldvalue: ConstPtr, cboldvaluesize: UInt, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt
}

public typealias PresutilGetBinaryProperty = PresutilGetBinaryPropertyFn?

public fun interface PresutilGetBinaryValueFn {
    public operator fun invoke(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, ppboutvalue: MutPtr, pcboutvaluesize: MutPtr): UInt
}

public typealias PresutilGetBinaryValue = PresutilGetBinaryValueFn?

public fun interface PresutilGetCoreClusterResourcesFn {
    public operator fun invoke(hcluster: Hcluster, phclusternameresource: MutPtr, phclusteripaddressresource: MutPtr, phclusterquorumresource: MutPtr): UInt
}

public typealias PresutilGetCoreClusterResources = PresutilGetCoreClusterResourcesFn?

public fun interface PresutilGetCoreClusterResourcesExFn {
    public operator fun invoke(hclusterin: Hcluster, phclusternameresourceout: MutPtr, phclusteripaddressresourceout: MutPtr, phclusterquorumresourceout: MutPtr, dwdesiredaccess: UInt): UInt
}

public typealias PresutilGetCoreClusterResourcesEx = PresutilGetCoreClusterResourcesExFn?

public fun interface PresutilGetDwordPropertyFn {
    public operator fun invoke(pdwoutvalue: MutPtr, pvaluestruct: ConstPtr, dwoldvalue: UInt, dwminimum: UInt, dwmaximum: UInt, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt
}

public typealias PresutilGetDwordProperty = PresutilGetDwordPropertyFn?

public fun interface PresutilGetDwordValueFn {
    public operator fun invoke(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pdwoutvalue: MutPtr, dwdefaultvalue: UInt): UInt
}

public typealias PresutilGetDwordValue = PresutilGetDwordValueFn?

public fun interface PresutilGetEnvironmentWithNetNameFn {
    public operator fun invoke(hresource: Hresource): MutPtr
}

public typealias PresutilGetEnvironmentWithNetName = PresutilGetEnvironmentWithNetNameFn?

public fun interface PresutilGetExpandSzValueFn {
    public operator fun invoke(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, bexpand: Bool): Pwstr
}

public typealias PresutilGetExpandSzValue = PresutilGetExpandSzValueFn?

public fun interface PresutilGetFiletimePropertyFn {
    public operator fun invoke(pftoutvalue: MutPtr, pvaluestruct: ConstPtr, ftoldvalue: Filetime, ftminimum: Filetime, ftmaximum: Filetime, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt
}

public typealias PresutilGetFiletimeProperty = PresutilGetFiletimePropertyFn?

public fun interface PresutilGetLongPropertyFn {
    public operator fun invoke(ploutvalue: MutPtr, pvaluestruct: ConstPtr, loldvalue: Int, lminimum: Int, lmaximum: Int, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt
}

public typealias PresutilGetLongProperty = PresutilGetLongPropertyFn?

public fun interface PresutilGetMultiSzPropertyFn {
    public operator fun invoke(ppszoutvalue: MutPtr, pcboutvaluesize: MutPtr, pvaluestruct: ConstPtr, pszoldvalue: Pcwstr, cboldvaluesize: UInt, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt
}

public typealias PresutilGetMultiSzProperty = PresutilGetMultiSzPropertyFn?

public fun interface PresutilGetPrivatePropertiesFn {
    public operator fun invoke(hkeyclusterkey: Hkey, poutpropertylist: MutPtr, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt
}

public typealias PresutilGetPrivateProperties = PresutilGetPrivatePropertiesFn?

public fun interface PresutilGetPropertiesFn {
    public operator fun invoke(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutpropertylist: MutPtr, cboutpropertylistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt
}

public typealias PresutilGetProperties = PresutilGetPropertiesFn?

public fun interface PresutilGetPropertiesToParameterBlockFn {
    public operator fun invoke(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, poutparams: MutPtr, bcheckforrequiredproperties: Bool, psznameofpropinerror: MutPtr): UInt
}

public typealias PresutilGetPropertiesToParameterBlock = PresutilGetPropertiesToParameterBlockFn?

public fun interface PresutilGetPropertyFn {
    public operator fun invoke(hkeyclusterkey: Hkey, ppropertytableitem: ConstPtr, poutpropertyitem: MutPtr, pcboutpropertyitemsize: MutPtr): UInt
}

public typealias PresutilGetProperty = PresutilGetPropertyFn?

public fun interface PresutilGetPropertyFormatsFn {
    public operator fun invoke(ppropertytable: ConstPtr, poutpropertyformatlist: MutPtr, cbpropertyformatlistsize: UInt, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt
}

public typealias PresutilGetPropertyFormats = PresutilGetPropertyFormatsFn?

public fun interface PresutilGetPropertySizeFn {
    public operator fun invoke(hkeyclusterkey: Hkey, ppropertytableitem: ConstPtr, pcboutpropertylistsize: MutPtr, pnpropertycount: MutPtr): UInt
}

public typealias PresutilGetPropertySize = PresutilGetPropertySizeFn?

public fun interface PresutilGetQwordValueFn {
    public operator fun invoke(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pqwoutvalue: MutPtr, qwdefaultvalue: ULong): UInt
}

public typealias PresutilGetQwordValue = PresutilGetQwordValueFn?

public fun interface PresutilGetResourceDependencyFn {
    public operator fun invoke(hself: Handle, lpszresourcetype: Pcwstr): Hresource
}

public typealias PresutilGetResourceDependency = PresutilGetResourceDependencyFn?

public fun interface PresutilGetResourceDependencyByClassFn {
    public operator fun invoke(hcluster: Hcluster, hself: Handle, prci: MutPtr, brecurse: Bool): Hresource
}

public typealias PresutilGetResourceDependencyByClass = PresutilGetResourceDependencyByClassFn?

public fun interface PresutilGetResourceDependencyByClassExFn {
    public operator fun invoke(hcluster: Hcluster, hself: Handle, prci: MutPtr, brecurse: Bool, dwdesiredaccess: UInt): Hresource
}

public typealias PresutilGetResourceDependencyByClassEx = PresutilGetResourceDependencyByClassExFn?

public fun interface PresutilGetResourceDependencyByNameFn {
    public operator fun invoke(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool): Hresource
}

public typealias PresutilGetResourceDependencyByName = PresutilGetResourceDependencyByNameFn?

public fun interface PresutilGetResourceDependencyByNameExFn {
    public operator fun invoke(hcluster: Hcluster, hself: Handle, lpszresourcetype: Pcwstr, brecurse: Bool, dwdesiredaccess: UInt): Hresource
}

public typealias PresutilGetResourceDependencyByNameEx = PresutilGetResourceDependencyByNameExFn?

public fun interface PresutilGetResourceDependencyExFn {
    public operator fun invoke(hself: Handle, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource
}

public typealias PresutilGetResourceDependencyEx = PresutilGetResourceDependencyExFn?

public fun interface PresutilGetResourceDependentipAddressPropsFn {
    public operator fun invoke(hresource: Hresource, pszaddress: Pwstr, pcchaddress: MutPtr, pszsubnetmask: Pwstr, pcchsubnetmask: MutPtr, psznetwork: Pwstr, pcchnetwork: MutPtr): UInt
}

public typealias PresutilGetResourceDependentipAddressProps = PresutilGetResourceDependentipAddressPropsFn?

public fun interface PresutilGetResourceNameFn {
    public operator fun invoke(hresource: Hresource, pszresourcename: Pwstr, pcchresourcenameinout: MutPtr): UInt
}

public typealias PresutilGetResourceName = PresutilGetResourceNameFn?

public fun interface PresutilGetResourceNameDependencyFn {
    public operator fun invoke(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr): Hresource
}

public typealias PresutilGetResourceNameDependency = PresutilGetResourceNameDependencyFn?

public fun interface PresutilGetResourceNameDependencyExFn {
    public operator fun invoke(lpszresourcename: Pcwstr, lpszresourcetype: Pcwstr, dwdesiredaccess: UInt): Hresource
}

public typealias PresutilGetResourceNameDependencyEx = PresutilGetResourceNameDependencyExFn?

public fun interface PresutilGetSzPropertyFn {
    public operator fun invoke(ppszoutvalue: MutPtr, pvaluestruct: ConstPtr, pszoldvalue: Pcwstr, pppropertylist: MutPtr, pcbpropertylistsize: MutPtr): UInt
}

public typealias PresutilGetSzProperty = PresutilGetSzPropertyFn?

public fun interface PresutilGetSzValueFn {
    public operator fun invoke(hkeyclusterkey: Hkey, pszvaluename: Pcwstr): Pwstr
}

public typealias PresutilGetSzValue = PresutilGetSzValueFn?

public fun interface PresutilIsPathValidFn {
    public operator fun invoke(pszpath: Pcwstr): Bool
}

public typealias PresutilIsPathValid = PresutilIsPathValidFn?

public fun interface PresutilIsResourceClassEqualFn {
    public operator fun invoke(prci: MutPtr, hresource: Hresource): Bool
}

public typealias PresutilIsResourceClassEqual = PresutilIsResourceClassEqualFn?

public fun interface PresutilPropertyListFromParameterBlockFn {
    public operator fun invoke(ppropertytable: ConstPtr, poutpropertylist: MutPtr, pcboutpropertylistsize: MutPtr, pinparams: ConstPtr, pcbbytesreturned: MutPtr, pcbrequired: MutPtr): UInt
}

public typealias PresutilPropertyListFromParameterBlock = PresutilPropertyListFromParameterBlockFn?

public fun interface PresutilRemoveResourceServiceEnvironmentFn {
    public operator fun invoke(pszservicename: Pcwstr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt
}

public typealias PresutilRemoveResourceServiceEnvironment = PresutilRemoveResourceServiceEnvironmentFn?

public fun interface PresutilResourcesEqualFn {
    public operator fun invoke(hself: Hresource, hresource: Hresource): Bool
}

public typealias PresutilResourcesEqual = PresutilResourcesEqualFn?

public fun interface PresutilResourceTypesEqualFn {
    public operator fun invoke(lpszresourcetypename: Pcwstr, hresource: Hresource): Bool
}

public typealias PresutilResourceTypesEqual = PresutilResourceTypesEqualFn?

public fun interface PresutilSetBinaryValueFn {
    public operator fun invoke(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, pbnewvalue: ConstPtr, cbnewvaluesize: UInt, ppboutvalue: MutPtr, pcboutvaluesize: MutPtr): UInt
}

public typealias PresutilSetBinaryValue = PresutilSetBinaryValueFn?

public fun interface PresutilSetDwordValueFn {
    public operator fun invoke(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, dwnewvalue: UInt, pdwoutvalue: MutPtr): UInt
}

public typealias PresutilSetDwordValue = PresutilSetDwordValueFn?

public fun interface PresutilSetExpandSzValueFn {
    public operator fun invoke(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: MutPtr): UInt
}

public typealias PresutilSetExpandSzValue = PresutilSetExpandSzValueFn?

public fun interface PresutilSetMultiSzValueFn {
    public operator fun invoke(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, cbnewvaluesize: UInt, ppszoutvalue: MutPtr, pcboutvaluesize: MutPtr): UInt
}

public typealias PresutilSetMultiSzValue = PresutilSetMultiSzValueFn?

public fun interface PresutilSetPrivatePropertyListFn {
    public operator fun invoke(hkeyclusterkey: Hkey, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt): UInt
}

public typealias PresutilSetPrivatePropertyList = PresutilSetPrivatePropertyListFn?

public fun interface PresutilSetPropertyParameterBlockFn {
    public operator fun invoke(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: MutPtr, pinparams: ConstPtr, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, poutparams: MutPtr): UInt
}

public typealias PresutilSetPropertyParameterBlock = PresutilSetPropertyParameterBlockFn?

public fun interface PresutilSetPropertyParameterBlockExFn {
    public operator fun invoke(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: MutPtr, pinparams: ConstPtr, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: MutPtr): UInt
}

public typealias PresutilSetPropertyParameterBlockEx = PresutilSetPropertyParameterBlockExFn?

public fun interface PresutilSetPropertyTableFn {
    public operator fun invoke(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: ConstPtr, ballowunknownproperties: Bool, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, poutparams: MutPtr): UInt
}

public typealias PresutilSetPropertyTable = PresutilSetPropertyTableFn?

public fun interface PresutilSetPropertyTableExFn {
    public operator fun invoke(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, reserved: MutPtr, ballowunknownproperties: Bool, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, bforcewrite: Bool, poutparams: MutPtr): UInt
}

public typealias PresutilSetPropertyTableEx = PresutilSetPropertyTableExFn?

public fun interface PresutilSetQwordValueFn {
    public operator fun invoke(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, qwnewvalue: ULong, pqwoutvalue: MutPtr): UInt
}

public typealias PresutilSetQwordValue = PresutilSetQwordValueFn?

public fun interface PresutilSetResourceServiceEnvironmentFn {
    public operator fun invoke(pszservicename: Pcwstr, hresource: Hresource, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt
}

public typealias PresutilSetResourceServiceEnvironment = PresutilSetResourceServiceEnvironmentFn?

public fun interface PresutilSetResourceServiceStartParametersFn {
    public operator fun invoke(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: MutPtr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt
}

public typealias PresutilSetResourceServiceStartParameters = PresutilSetResourceServiceStartParametersFn?

public fun interface PresutilSetResourceServiceStartParametersExFn {
    public operator fun invoke(pszservicename: Pcwstr, schscmhandle: ScHandle, phservice: MutPtr, dwdesiredaccess: UInt, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt
}

public typealias PresutilSetResourceServiceStartParametersEx = PresutilSetResourceServiceStartParametersExFn?

public fun interface PresutilSetSzValueFn {
    public operator fun invoke(hkeyclusterkey: Hkey, pszvaluename: Pcwstr, psznewvalue: Pcwstr, ppszoutstring: MutPtr): UInt
}

public typealias PresutilSetSzValue = PresutilSetSzValueFn?

public fun interface PresutilSetUnknownPropertiesFn {
    public operator fun invoke(hkeyclusterkey: Hkey, ppropertytable: ConstPtr, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt): UInt
}

public typealias PresutilSetUnknownProperties = PresutilSetUnknownPropertiesFn?

public fun interface PresutilStartResourceServiceFn {
    public operator fun invoke(pszservicename: Pcwstr, phservicehandle: MutPtr): UInt
}

public typealias PresutilStartResourceService = PresutilStartResourceServiceFn?

public fun interface PresutilStopResourceServiceFn {
    public operator fun invoke(pszservicename: Pcwstr): UInt
}

public typealias PresutilStopResourceService = PresutilStopResourceServiceFn?

public fun interface PresutilStopServiceFn {
    public operator fun invoke(hservicehandle: ScHandle): UInt
}

public typealias PresutilStopService = PresutilStopServiceFn?

public fun interface PresutilTerminateServiceProcessFromResDllFn {
    public operator fun invoke(dwservicepid: UInt, boffline: Bool, pdwresourcestate: MutPtr, pfnlogevent: PlogEventRoutine, hresourcehandle: Long): UInt
}

public typealias PresutilTerminateServiceProcessFromResDll = PresutilTerminateServiceProcessFromResDllFn?

public fun interface PresutilVerifyPrivatePropertyListFn {
    public operator fun invoke(pinpropertylist: ConstPtr, cbinpropertylistsize: UInt): UInt
}

public typealias PresutilVerifyPrivatePropertyList = PresutilVerifyPrivatePropertyListFn?

public fun interface PresutilVerifyPropertyTableFn {
    public operator fun invoke(ppropertytable: ConstPtr, reserved: ConstPtr, ballowunknownproperties: Bool, pinpropertylist: ConstPtr, cbinpropertylistsize: UInt, poutparams: MutPtr): UInt
}

public typealias PresutilVerifyPropertyTable = PresutilVerifyPropertyTableFn?

public fun interface PresutilVerifyResourceServiceFn {
    public operator fun invoke(pszservicename: Pcwstr): UInt
}

public typealias PresutilVerifyResourceService = PresutilVerifyResourceServiceFn?

public fun interface PresutilVerifyServiceFn {
    public operator fun invoke(hservicehandle: ScHandle): UInt
}

public typealias PresutilVerifyService = PresutilVerifyServiceFn?

public fun interface PresUtilVerifyShutdownSafeFn {
    public operator fun invoke(flags: UInt, reason: UInt, presult: MutPtr): UInt
}

public typealias PresUtilVerifyShutdownSafe = PresUtilVerifyShutdownSafeFn?

public fun interface PsetInternalStateFn {
    public operator fun invoke(param0: Long, statetype: ClusterResourceApplicationState, active: Bool): UInt
}

public typealias PsetInternalState = PsetInternalStateFn?

public fun interface PsetResourceInmemoryNodelocalPropertiesRoutineFn {
    public operator fun invoke(resourcehandle: Long, propertylistbuffer: ConstPtr, propertylistbuffersize: UInt): UInt
}

public typealias PsetResourceInmemoryNodelocalPropertiesRoutine = PsetResourceInmemoryNodelocalPropertiesRoutineFn?

public fun interface PsetResourceLockedModeExRoutineFn {
    public operator fun invoke(resourcehandle: Long, lockedmodeenabled: Bool, lockedmodereason: UInt, lockedmodeflags: UInt): UInt
}

public typealias PsetResourceLockedModeExRoutine = PsetResourceLockedModeExRoutineFn?

public fun interface PsetResourceLockedModeRoutineFn {
    public operator fun invoke(resourcehandle: Long, lockedmodeenabled: Bool, lockedmodereason: UInt): UInt
}

public typealias PsetResourceLockedModeRoutine = PsetResourceLockedModeRoutineFn?

public fun interface PsetResourceStatusRoutineFn {
    public operator fun invoke(resourcehandle: Long, resourcestatus: MutPtr): UInt
}

public typealias PsetResourceStatusRoutine = PsetResourceStatusRoutineFn?

public fun interface PsetResourceStatusRoutineExFn {
    public operator fun invoke(resourcehandle: Long, resourcestatus: MutPtr): UInt
}

public typealias PsetResourceStatusRoutineEx = PsetResourceStatusRoutineExFn?

public fun interface PsetResourceWprPolicyRoutineFn {
    public operator fun invoke(resourcehandle: Long, wprpolicyflags: UInt): UInt
}

public typealias PsetResourceWprPolicyRoutine = PsetResourceWprPolicyRoutineFn?

public fun interface PsignalFailureRoutineFn {
    public operator fun invoke(resourcehandle: Long, failuretype: FailureType, applicationspecificerrorcode: UInt): UInt
}

public typealias PsignalFailureRoutine = PsignalFailureRoutineFn?

public fun interface PstartupExRoutineFn {
    public operator fun invoke(resourcetype: Pcwstr, minversionsupported: UInt, maxversionsupported: UInt, monitorcallbackfunctions: MutPtr, resourcedllinterfacefunctions: MutPtr): UInt
}

public typealias PstartupExRoutine = PstartupExRoutineFn?

public fun interface PstartupRoutineFn {
    public operator fun invoke(resourcetype: Pcwstr, minversionsupported: UInt, maxversionsupported: UInt, setresourcestatus: PsetResourceStatusRoutine, logevent: PlogEventRoutine, functiontable: MutPtr): UInt
}

public typealias PstartupRoutine = PstartupRoutineFn?

public fun interface PterminateRoutineFn {
    public operator fun invoke(resource: MutPtr)
}

public typealias PterminateRoutine = PterminateRoutineFn?

public fun interface PworkerStartRoutineFn {
    public operator fun invoke(pworker: MutPtr, lpthreadparameter: MutPtr): UInt
}

public typealias PworkerStartRoutine = PworkerStartRoutineFn?

public typealias ResdllContextOperationType = Int

public typealias ResourceExitState = Int

public typealias ResourceMonitorState = Int

public fun interface SetAppInstanceCsvFlagsFn {
    public operator fun invoke(processhandle: Handle, mask: UInt, flags: UInt): UInt
}

public typealias SetAppInstanceCsvFlags = SetAppInstanceCsvFlagsFn?

public typealias SrDiskReplicationEligible = Int

public typealias SrReplicatedDiskType = Int

public typealias VmResdllContext = Int
