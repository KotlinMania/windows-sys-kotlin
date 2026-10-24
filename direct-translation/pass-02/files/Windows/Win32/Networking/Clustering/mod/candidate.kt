// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// UNSUPPORTED Rust 1:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn AddClusterGroupDependency(hdependentgroup : HGROUP, hprovidergroup : HGROUP) -> u32);

// UNSUPPORTED Rust 2:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn AddClusterGroupDependencyEx(hdependentgroup : HGROUP, hprovidergroup : HGROUP, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 3:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn AddClusterGroupSetDependency(hdependentgroupset : HGROUPSET, hprovidergroupset : HGROUPSET) -> u32);

// UNSUPPORTED Rust 4:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn AddClusterGroupSetDependencyEx(hdependentgroupset : HGROUPSET, hprovidergroupset : HGROUPSET, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 5:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn AddClusterGroupToGroupSetDependency(hdependentgroup : HGROUP, hprovidergroupset : HGROUPSET) -> u32);

// UNSUPPORTED Rust 6:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn AddClusterGroupToGroupSetDependencyEx(hdependentgroup : HGROUP, hprovidergroupset : HGROUPSET, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 7:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn AddClusterNode(hcluster : HCLUSTER, lpsznodename : windows_sys::core::PCWSTR, pfnprogresscallback : PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg : *const core::ffi::c_void) -> HNODE);

// UNSUPPORTED Rust 8:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn AddClusterNodeEx(hcluster : HCLUSTER, lpsznodename : windows_sys::core::PCWSTR, dwflags : u32, pfnprogresscallback : PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg : *const core::ffi::c_void) -> HNODE);

// UNSUPPORTED Rust 9:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn AddClusterResourceDependency(hresource : HRESOURCE, hdependson : HRESOURCE) -> u32);

// UNSUPPORTED Rust 10:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn AddClusterResourceDependencyEx(hresource : HRESOURCE, hdependson : HRESOURCE, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 11:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn AddClusterResourceNode(hresource : HRESOURCE, hnode : HNODE) -> u32);

// UNSUPPORTED Rust 12:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn AddClusterResourceNodeEx(hresource : HRESOURCE, hnode : HNODE, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 13:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn AddClusterStorageNode(hcluster : HCLUSTER, lpsznodename : windows_sys::core::PCWSTR, pfnprogresscallback : PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg : *const core::ffi::c_void, lpszclusterstoragenodedescription : windows_sys::core::PCWSTR, lpszclusterstoragenodelocation : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 14:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn AddCrossClusterGroupSetDependency(hdependentgroupset : HGROUPSET, lpremoteclustername : windows_sys::core::PCWSTR, lpremotegroupsetname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 15:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn AddResourceToClusterSharedVolumes(hresource : HRESOURCE) -> u32);

// UNSUPPORTED Rust 16:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn BackupClusterDatabase(hcluster : HCLUSTER, lpszpathname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 17:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CanResourceBeDependent(hresource : HRESOURCE, hresourcedependent : HRESOURCE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 18:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CancelClusterGroupOperation(hgroup : HGROUP, dwcancelflags_reserved : u32) -> u32);

// UNSUPPORTED Rust 19:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ChangeClusterResourceGroup(hresource : HRESOURCE, hgroup : HGROUP) -> u32);

// UNSUPPORTED Rust 20:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ChangeClusterResourceGroupEx(hresource : HRESOURCE, hgroup : HGROUP, flags : u64) -> u32);

// UNSUPPORTED Rust 21:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ChangeClusterResourceGroupEx2(hresource : HRESOURCE, hgroup : HGROUP, flags : u64, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 22:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CloseCluster(hcluster : HCLUSTER) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 23:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn CloseClusterCryptProvider(hcluscryptprovider : HCLUSCRYPTPROVIDER) -> u32);

// UNSUPPORTED Rust 24:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CloseClusterGroup(hgroup : HGROUP) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 25:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CloseClusterGroupSet(hgroupset : HGROUPSET) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 26:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CloseClusterNetInterface(hnetinterface : HNETINTERFACE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 27:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CloseClusterNetwork(hnetwork : HNETWORK) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 28:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CloseClusterNode(hnode : HNODE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 29:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CloseClusterNotifyPort(hchange : HCHANGE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 30:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CloseClusterResource(hresource : HRESOURCE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 31:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ClusAddClusterHealthFault(hcluster : HCLUSTER, failure : *const CLUSTER_HEALTH_FAULT, param2 : u32) -> u32);

// UNSUPPORTED Rust 32:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ClusGetClusterHealthFaults(hcluster : HCLUSTER, objects : *mut CLUSTER_HEALTH_FAULT_ARRAY, flags : u32) -> u32);

// UNSUPPORTED Rust 33:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ClusRemoveClusterHealthFault(hcluster : HCLUSTER, id : windows_sys::core::PCWSTR, flags : u32) -> u32);

// UNSUPPORTED Rust 34:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ClusWorkerCheckTerminate(lpworker : *mut CLUS_WORKER) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 35:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ClusWorkerCreate(lpworker : *mut CLUS_WORKER, lpstartaddress : PWORKER_START_ROUTINE, lpparameter : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 36:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ClusWorkerTerminate(lpworker : *const CLUS_WORKER));

// UNSUPPORTED Rust 37:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ClusWorkerTerminateEx(clusworker : *mut CLUS_WORKER, timeoutinmilliseconds : u32, waitonly : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 38:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ClusWorkersTerminate(clusworkers : *mut *mut CLUS_WORKER, clusworkerscount : usize, timeoutinmilliseconds : u32, waitonly : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 39:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusapiSetReasonHandler(lphandler : *const CLUSAPI_REASON_HANDLER) -> *mut CLUSAPI_REASON_HANDLER);

// UNSUPPORTED Rust 40:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterAddGroupToAffinityRule(hcluster : HCLUSTER, rulename : windows_sys::core::PCWSTR, hgroup : HGROUP) -> u32);

// UNSUPPORTED Rust 41:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterAddGroupToGroupSet(hgroupset : HGROUPSET, hgroup : HGROUP) -> u32);

// UNSUPPORTED Rust 42:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterAddGroupToGroupSetWithDomains(hgroupset : HGROUPSET, hgroup : HGROUP, faultdomain : u32, updatedomain : u32) -> u32);

// UNSUPPORTED Rust 43:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterAddGroupToGroupSetWithDomainsEx(hgroupset : HGROUPSET, hgroup : HGROUP, faultdomain : u32, updatedomain : u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 44:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterAffinityRuleControl(hcluster : HCLUSTER, affinityrulename : windows_sys::core::PCWSTR, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, cbinbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, cboutbuffersize : u32, lpbytesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 45:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ClusterClearBackupStateForSharedVolume(lpszvolumepathname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 46:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterCloseEnum(henum : HCLUSENUM) -> u32);

// UNSUPPORTED Rust 47:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterCloseEnumEx(hclusterenum : HCLUSENUMEX) -> u32);

// UNSUPPORTED Rust 48:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterControl(hcluster : HCLUSTER, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, ninbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, noutbuffersize : u32, lpbytesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 49:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterControlEx(hcluster : HCLUSTER, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, ninbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, noutbuffersize : u32, lpbytesreturned : *mut u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 50:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterCreateAffinityRule(hcluster : HCLUSTER, rulename : windows_sys::core::PCWSTR, ruletype : CLUS_AFFINITY_RULE_TYPE) -> u32);

// UNSUPPORTED Rust 51:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ClusterDecrypt(hcluscryptprovider : HCLUSCRYPTPROVIDER, pcryptinput : *const u8, cbcryptinput : u32, ppcryptoutput : *mut *mut u8, pcbcryptoutput : *mut u32) -> u32);

// UNSUPPORTED Rust 52:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ClusterEncrypt(hcluscryptprovider : HCLUSCRYPTPROVIDER, pdata : *const u8, cbdata : u32, ppdata : *mut *mut u8, pcbdata : *mut u32) -> u32);

// UNSUPPORTED Rust 53:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterEnum(henum : HCLUSENUM, dwindex : u32, lpdwtype : *mut u32, lpszname : windows_sys::core::PWSTR, lpcchname : *mut u32) -> u32);

// UNSUPPORTED Rust 54:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterEnumEx(hclusterenum : HCLUSENUMEX, dwindex : u32, pitem : *mut CLUSTER_ENUM_ITEM, cbitem : *mut u32) -> u32);

// UNSUPPORTED Rust 55:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGetEnumCount(henum : HCLUSENUM) -> u32);

// UNSUPPORTED Rust 56:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGetEnumCountEx(hclusterenum : HCLUSENUMEX) -> u32);

// UNSUPPORTED Rust 57:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ClusterGetVolumeNameForVolumeMountPoint(lpszvolumemountpoint : windows_sys::core::PCWSTR, lpszvolumename : windows_sys::core::PWSTR, cchbufferlength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 58:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ClusterGetVolumePathName(lpszfilename : windows_sys::core::PCWSTR, lpszvolumepathname : windows_sys::core::PWSTR, cchbufferlength : u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 59:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupCloseEnum(hgroupenum : HGROUPENUM) -> u32);

// UNSUPPORTED Rust 60:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupCloseEnumEx(hgroupenumex : HGROUPENUMEX) -> u32);

// UNSUPPORTED Rust 61:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupControl(hgroup : HGROUP, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, ninbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, noutbuffersize : u32, lpbytesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 62:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupControlEx(hgroup : HGROUP, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, ninbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, noutbuffersize : u32, lpbytesreturned : *mut u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 63:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupEnum(hgroupenum : HGROUPENUM, dwindex : u32, lpdwtype : *mut u32, lpszresourcename : windows_sys::core::PWSTR, lpcchname : *mut u32) -> u32);

// UNSUPPORTED Rust 64:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupEnumEx(hgroupenumex : HGROUPENUMEX, dwindex : u32, pitem : *mut CLUSTER_GROUP_ENUM_ITEM, cbitem : *mut u32) -> u32);

// UNSUPPORTED Rust 65:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupGetEnumCount(hgroupenum : HGROUPENUM) -> u32);

// UNSUPPORTED Rust 66:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupGetEnumCountEx(hgroupenumex : HGROUPENUMEX) -> u32);

// UNSUPPORTED Rust 67:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupOpenEnum(hgroup : HGROUP, dwtype : u32) -> HGROUPENUM);

// UNSUPPORTED Rust 68:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupOpenEnumEx(hcluster : HCLUSTER, lpszproperties : windows_sys::core::PCWSTR, cbproperties : u32, lpszroproperties : windows_sys::core::PCWSTR, cbroproperties : u32, dwflags : u32) -> HGROUPENUMEX);

// UNSUPPORTED Rust 69:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupSetCloseEnum(hgroupsetenum : HGROUPSETENUM) -> u32);

// UNSUPPORTED Rust 70:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupSetControl(hgroupset : HGROUPSET, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, cbinbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, cboutbuffersize : u32, lpbytesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 71:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupSetControlEx(hgroupset : HGROUPSET, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, cbinbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, cboutbuffersize : u32, lpbytesreturned : *mut u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 72:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupSetEnum(hgroupsetenum : HGROUPSETENUM, dwindex : u32, lpszname : windows_sys::core::PWSTR, lpcchname : *mut u32) -> u32);

// UNSUPPORTED Rust 73:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupSetGetEnumCount(hgroupsetenum : HGROUPSETENUM) -> u32);

// UNSUPPORTED Rust 74:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterGroupSetOpenEnum(hcluster : HCLUSTER) -> HGROUPSETENUM);

// UNSUPPORTED Rust 75:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ClusterIsPathOnSharedVolume(lpszpathname : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 76:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNetInterfaceCloseEnum(hnetinterfaceenum : HNETINTERFACEENUM) -> u32);

// UNSUPPORTED Rust 77:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNetInterfaceControl(hnetinterface : HNETINTERFACE, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, ninbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, noutbuffersize : u32, lpbytesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 78:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNetInterfaceControlEx(hnetinterface : HNETINTERFACE, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, ninbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, noutbuffersize : u32, lpbytesreturned : *mut u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 79:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNetInterfaceEnum(hnetinterfaceenum : HNETINTERFACEENUM, dwindex : u32, lpszname : windows_sys::core::PWSTR, lpcchname : *mut u32) -> u32);

// UNSUPPORTED Rust 80:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNetInterfaceOpenEnum(hcluster : HCLUSTER, lpsznodename : windows_sys::core::PCWSTR, lpsznetworkname : windows_sys::core::PCWSTR) -> HNETINTERFACEENUM);

// UNSUPPORTED Rust 81:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNetworkCloseEnum(hnetworkenum : HNETWORKENUM) -> u32);

// UNSUPPORTED Rust 82:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNetworkControl(hnetwork : HNETWORK, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, ninbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, noutbuffersize : u32, lpbytesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 83:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNetworkControlEx(hnetwork : HNETWORK, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, ninbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, noutbuffersize : u32, lpbytesreturned : *mut u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 84:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNetworkEnum(hnetworkenum : HNETWORKENUM, dwindex : u32, lpdwtype : *mut u32, lpszname : windows_sys::core::PWSTR, lpcchname : *mut u32) -> u32);

// UNSUPPORTED Rust 85:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNetworkGetEnumCount(hnetworkenum : HNETWORKENUM) -> u32);

// UNSUPPORTED Rust 86:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNetworkOpenEnum(hnetwork : HNETWORK, dwtype : u32) -> HNETWORKENUM);

// UNSUPPORTED Rust 87:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNodeCloseEnum(hnodeenum : HNODEENUM) -> u32);

// UNSUPPORTED Rust 88:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNodeCloseEnumEx(hnodeenum : HNODEENUMEX) -> u32);

// UNSUPPORTED Rust 89:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNodeControl(hnode : HNODE, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, ninbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, noutbuffersize : u32, lpbytesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 90:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNodeControlEx(hnode : HNODE, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, ninbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, noutbuffersize : u32, lpbytesreturned : *mut u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 91:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNodeEnum(hnodeenum : HNODEENUM, dwindex : u32, lpdwtype : *mut u32, lpszname : windows_sys::core::PWSTR, lpcchname : *mut u32) -> u32);

// UNSUPPORTED Rust 92:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNodeEnumEx(hnodeenum : HNODEENUMEX, dwindex : u32, pitem : *mut CLUSTER_ENUM_ITEM, cbitem : *mut u32) -> u32);

// UNSUPPORTED Rust 93:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNodeGetEnumCount(hnodeenum : HNODEENUM) -> u32);

// UNSUPPORTED Rust 94:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNodeGetEnumCountEx(hnodeenum : HNODEENUMEX) -> u32);

// UNSUPPORTED Rust 95:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNodeOpenEnum(hnode : HNODE, dwtype : u32) -> HNODEENUM);

// UNSUPPORTED Rust 96:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNodeOpenEnumEx(hnode : HNODE, dwtype : u32, poptions : *const core::ffi::c_void) -> HNODEENUMEX);

// UNSUPPORTED Rust 97:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterNodeReplacement(hcluster : HCLUSTER, lpsznodenamecurrent : windows_sys::core::PCWSTR, lpsznodenamenew : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 98:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterOpenEnum(hcluster : HCLUSTER, dwtype : u32) -> HCLUSENUM);

// UNSUPPORTED Rust 99:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterOpenEnumEx(hcluster : HCLUSTER, dwtype : u32, poptions : *const core::ffi::c_void) -> HCLUSENUMEX);

// UNSUPPORTED Rust 100:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ClusterPrepareSharedVolumeForBackup(lpszfilename : windows_sys::core::PCWSTR, lpszvolumepathname : windows_sys::core::PWSTR, lpcchvolumepathname : *mut u32, lpszvolumename : windows_sys::core::PWSTR, lpcchvolumename : *mut u32) -> u32);

// UNSUPPORTED Rust 101:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRegBatchAddCommand(hregbatch : HREGBATCH, dwcommand : CLUSTER_REG_COMMAND, wzname : windows_sys::core::PCWSTR, dwoptions : u32, lpdata : *const core::ffi::c_void, cbdata : u32) -> i32);

// UNSUPPORTED Rust 102:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRegBatchCloseNotification(hbatchnotification : HREGBATCHNOTIFICATION) -> i32);

// UNSUPPORTED Rust 103:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRegBatchReadCommand(hbatchnotification : HREGBATCHNOTIFICATION, pbatchcommand : *mut CLUSTER_BATCH_COMMAND) -> i32);

// UNSUPPORTED Rust 104:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRegCloseBatch(hregbatch : HREGBATCH, bcommit : windows_sys::core::BOOL, failedcommandnumber : *mut i32) -> i32);

// UNSUPPORTED Rust 105:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRegCloseBatchEx(hregbatch : HREGBATCH, flags : u32, failedcommandnumber : *mut i32) -> i32);

// UNSUPPORTED Rust 106:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRegCloseBatchNotifyPort(hbatchnotifyport : HREGBATCHPORT) -> i32);

// UNSUPPORTED Rust 107:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegCloseKey(hkey : super::super::System::Registry:: HKEY) -> i32);

// UNSUPPORTED Rust 109:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRegCloseReadBatch(hregreadbatch : HREGREADBATCH, phregreadbatchreply : *mut HREGREADBATCHREPLY) -> i32);

// UNSUPPORTED Rust 110:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRegCloseReadBatchEx(hregreadbatch : HREGREADBATCH, flags : u32, phregreadbatchreply : *mut HREGREADBATCHREPLY) -> i32);

// UNSUPPORTED Rust 111:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRegCloseReadBatchReply(hregreadbatchreply : HREGREADBATCHREPLY) -> i32);

// UNSUPPORTED Rust 112:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegCreateBatch(hkey : super::super::System::Registry:: HKEY, phregbatch : *mut HREGBATCH) -> i32);

// UNSUPPORTED Rust 114:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegCreateBatchNotifyPort(hkey : super::super::System::Registry:: HKEY, phbatchnotifyport : *mut HREGBATCHPORT) -> i32);

// UNSUPPORTED Rust 116:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Registry"))]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegCreateKey(hkey : super::super::System::Registry:: HKEY, lpszsubkey : windows_sys::core::PCWSTR, dwoptions : u32, samdesired : u32, lpsecurityattributes : *const super::super::Security:: SECURITY_ATTRIBUTES, phkresult : *mut super::super::System::Registry:: HKEY, lpdwdisposition : *mut u32) -> i32);

// UNSUPPORTED Rust 118:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Registry"))]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegCreateKeyEx(hkey : super::super::System::Registry:: HKEY, lpsubkey : windows_sys::core::PCWSTR, dwoptions : u32, samdesired : u32, lpsecurityattributes : *const super::super::Security:: SECURITY_ATTRIBUTES, phkresult : *mut super::super::System::Registry:: HKEY, lpdwdisposition : *mut u32, lpszreason : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 120:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegCreateReadBatch(hkey : super::super::System::Registry:: HKEY, phregreadbatch : *mut HREGREADBATCH) -> i32);

// UNSUPPORTED Rust 122:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegDeleteKey(hkey : super::super::System::Registry:: HKEY, lpszsubkey : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 124:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegDeleteKeyEx(hkey : super::super::System::Registry:: HKEY, lpsubkey : windows_sys::core::PCWSTR, lpszreason : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 126:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegDeleteValue(hkey : super::super::System::Registry:: HKEY, lpszvaluename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 128:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegDeleteValueEx(hkey : super::super::System::Registry:: HKEY, lpszvaluename : windows_sys::core::PCWSTR, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 130:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegEnumKey(hkey : super::super::System::Registry:: HKEY, dwindex : u32, lpszname : windows_sys::core::PWSTR, lpcchname : *mut u32, lpftlastwritetime : *mut super::super::Foundation:: FILETIME) -> i32);

// UNSUPPORTED Rust 132:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegEnumValue(hkey : super::super::System::Registry:: HKEY, dwindex : u32, lpszvaluename : windows_sys::core::PWSTR, lpcchvaluename : *mut u32, lpdwtype : *mut u32, lpdata : *mut u8, lpcbdata : *mut u32) -> u32);

// UNSUPPORTED Rust 134:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRegGetBatchNotification(hbatchnotify : HREGBATCHPORT, phbatchnotification : *mut HREGBATCHNOTIFICATION) -> i32);

// UNSUPPORTED Rust 135:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Registry"))]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegGetKeySecurity(hkey : super::super::System::Registry:: HKEY, requestedinformation : u32, psecuritydescriptor : super::super::Security:: PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor : *mut u32) -> i32);

// UNSUPPORTED Rust 137:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegOpenKey(hkey : super::super::System::Registry:: HKEY, lpszsubkey : windows_sys::core::PCWSTR, samdesired : u32, phkresult : *mut super::super::System::Registry:: HKEY) -> i32);

// UNSUPPORTED Rust 139:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegQueryInfoKey(hkey : super::super::System::Registry:: HKEY, lpcsubkeys : *const u32, lpcchmaxsubkeylen : *const u32, lpcvalues : *const u32, lpcchmaxvaluenamelen : *const u32, lpcbmaxvaluelen : *const u32, lpcbsecuritydescriptor : *const u32, lpftlastwritetime : *const super::super::Foundation:: FILETIME) -> i32);

// UNSUPPORTED Rust 141:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegQueryValue(hkey : super::super::System::Registry:: HKEY, lpszvaluename : windows_sys::core::PCWSTR, lpdwvaluetype : *mut u32, lpdata : *mut u8, lpcbdata : *mut u32) -> i32);

// UNSUPPORTED Rust 143:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRegReadBatchAddCommand(hregreadbatch : HREGREADBATCH, wzsubkeyname : windows_sys::core::PCWSTR, wzvaluename : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 144:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRegReadBatchReplyNextCommand(hregreadbatchreply : HREGREADBATCHREPLY, pbatchcommand : *mut CLUSTER_READ_BATCH_COMMAND) -> i32);

// UNSUPPORTED Rust 145:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Registry"))]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegSetKeySecurity(hkey : super::super::System::Registry:: HKEY, securityinformation : u32, psecuritydescriptor : super::super::Security:: PSECURITY_DESCRIPTOR) -> i32);

// UNSUPPORTED Rust 147:1: declaration Macro has no candidate rule
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Registry"))]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegSetKeySecurityEx(hkey : super::super::System::Registry:: HKEY, securityinformation : super::super::Security:: OBJECT_SECURITY_INFORMATION, psecuritydescriptor : super::super::Security:: PSECURITY_DESCRIPTOR, lpszreason : windows_sys::core::PCWSTR) -> i32);

// UNSUPPORTED Rust 149:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegSetValue(hkey : super::super::System::Registry:: HKEY, lpszvaluename : windows_sys::core::PCWSTR, dwtype : u32, lpdata : *const u8, cbdata : u32) -> u32);

// UNSUPPORTED Rust 151:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn ClusterRegSetValueEx(hkey : super::super::System::Registry:: HKEY, lpszvaluename : windows_sys::core::PCWSTR, dwtype : u32, lpdata : *const u8, cbdata : u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 153:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRegSyncDatabase(hcluster : HCLUSTER, flags : u32) -> i32);

// UNSUPPORTED Rust 154:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRemoveAffinityRule(hcluster : HCLUSTER, rulename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 155:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRemoveGroupFromAffinityRule(hcluster : HCLUSTER, rulename : windows_sys::core::PCWSTR, hgroup : HGROUP) -> u32);

// UNSUPPORTED Rust 156:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRemoveGroupFromGroupSet(hgroup : HGROUP) -> u32);

// UNSUPPORTED Rust 157:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterRemoveGroupFromGroupSetEx(hgroup : HGROUP, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 158:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceCloseEnum(hresenum : HRESENUM) -> u32);

// UNSUPPORTED Rust 159:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceCloseEnumEx(hresourceenumex : HRESENUMEX) -> u32);

// UNSUPPORTED Rust 160:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceControl(hresource : HRESOURCE, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, cbinbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, cboutbuffersize : u32, lpbytesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 161:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceControlAsUser(hresource : HRESOURCE, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, cbinbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, cboutbuffersize : u32, lpbytesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 162:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceControlAsUserEx(hresource : HRESOURCE, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, cbinbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, cboutbuffersize : u32, lpbytesreturned : *mut u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 163:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceControlEx(hresource : HRESOURCE, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, cbinbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, cboutbuffersize : u32, lpbytesreturned : *mut u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 164:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceEnum(hresenum : HRESENUM, dwindex : u32, lpdwtype : *mut u32, lpszname : windows_sys::core::PWSTR, lpcchname : *mut u32) -> u32);

// UNSUPPORTED Rust 165:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceEnumEx(hresourceenumex : HRESENUMEX, dwindex : u32, pitem : *mut CLUSTER_RESOURCE_ENUM_ITEM, cbitem : *mut u32) -> u32);

// UNSUPPORTED Rust 166:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceGetEnumCount(hresenum : HRESENUM) -> u32);

// UNSUPPORTED Rust 167:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceGetEnumCountEx(hresourceenumex : HRESENUMEX) -> u32);

// UNSUPPORTED Rust 168:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceOpenEnum(hresource : HRESOURCE, dwtype : u32) -> HRESENUM);

// UNSUPPORTED Rust 169:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceOpenEnumEx(hcluster : HCLUSTER, lpszproperties : windows_sys::core::PCWSTR, cbproperties : u32, lpszroproperties : windows_sys::core::PCWSTR, cbroproperties : u32, dwflags : u32) -> HRESENUMEX);

// UNSUPPORTED Rust 170:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceTypeCloseEnum(hrestypeenum : HRESTYPEENUM) -> u32);

// UNSUPPORTED Rust 171:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceTypeControl(hcluster : HCLUSTER, lpszresourcetypename : windows_sys::core::PCWSTR, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, ninbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, noutbuffersize : u32, lpbytesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 172:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceTypeControlAsUser(hcluster : HCLUSTER, lpszresourcetypename : windows_sys::core::PCWSTR, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, ninbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, noutbuffersize : u32, lpbytesreturned : *mut u32) -> u32);

// UNSUPPORTED Rust 173:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceTypeControlAsUserEx(hcluster : HCLUSTER, lpszresourcetypename : windows_sys::core::PCWSTR, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, ninbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, noutbuffersize : u32, lpbytesreturned : *mut u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 174:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceTypeControlEx(hcluster : HCLUSTER, lpszresourcetypename : windows_sys::core::PCWSTR, hhostnode : HNODE, dwcontrolcode : u32, lpinbuffer : *const core::ffi::c_void, ninbuffersize : u32, lpoutbuffer : *mut core::ffi::c_void, noutbuffersize : u32, lpbytesreturned : *mut u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 175:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceTypeEnum(hrestypeenum : HRESTYPEENUM, dwindex : u32, lpdwtype : *mut u32, lpszname : windows_sys::core::PWSTR, lpcchname : *mut u32) -> u32);

// UNSUPPORTED Rust 176:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceTypeGetEnumCount(hrestypeenum : HRESTYPEENUM) -> u32);

// UNSUPPORTED Rust 177:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterResourceTypeOpenEnum(hcluster : HCLUSTER, lpszresourcetypename : windows_sys::core::PCWSTR, dwtype : u32) -> HRESTYPEENUM);

// UNSUPPORTED Rust 178:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterSetAccountAccess(hcluster : HCLUSTER, szaccountsid : windows_sys::core::PCWSTR, dwaccess : u32, dwcontroltype : u32) -> u32);

// UNSUPPORTED Rust 179:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterSharedVolumeSetSnapshotState(guidsnapshotset : windows_sys::core::GUID, lpszvolumename : windows_sys::core::PCWSTR, state : CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE) -> u32);

// UNSUPPORTED Rust 180:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ClusterUpgradeFunctionalLevel(hcluster : HCLUSTER, perform : windows_sys::core::BOOL, pfnprogresscallback : PCLUSTER_UPGRADE_PROGRESS_CALLBACK, pvcallbackarg : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 181:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CreateCluster(pconfig : *const CREATE_CLUSTER_CONFIG, pfnprogresscallback : PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg : *const core::ffi::c_void) -> HCLUSTER);

// UNSUPPORTED Rust 182:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CreateClusterAvailabilitySet(hcluster : HCLUSTER, lpavailabilitysetname : windows_sys::core::PCWSTR, pavailabilitysetconfig : *const CLUSTER_AVAILABILITY_SET_CONFIG) -> HGROUPSET);

// UNSUPPORTED Rust 183:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CreateClusterGroup(hcluster : HCLUSTER, lpszgroupname : windows_sys::core::PCWSTR) -> HGROUP);

// UNSUPPORTED Rust 184:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CreateClusterGroupEx(hcluster : HCLUSTER, lpszgroupname : windows_sys::core::PCWSTR, pgroupinfo : *const CLUSTER_CREATE_GROUP_INFO) -> HGROUP);

// UNSUPPORTED Rust 185:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CreateClusterGroupSet(hcluster : HCLUSTER, groupsetname : windows_sys::core::PCWSTR) -> HGROUPSET);

// UNSUPPORTED Rust 186:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CreateClusterNameAccount(hcluster : HCLUSTER, pconfig : *const CREATE_CLUSTER_NAME_ACCOUNT, pfnprogresscallback : PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 187:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CreateClusterNotifyPort(hchange : HCHANGE, hcluster : HCLUSTER, dwfilter : u32, dwnotifykey : usize) -> HCHANGE);

// UNSUPPORTED Rust 188:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CreateClusterNotifyPortV2(hchange : HCHANGE, hcluster : HCLUSTER, filters : *const NOTIFY_FILTER_AND_TYPE, dwfiltercount : u32, dwnotifykey : usize) -> HCHANGE);

// UNSUPPORTED Rust 189:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CreateClusterResource(hgroup : HGROUP, lpszresourcename : windows_sys::core::PCWSTR, lpszresourcetype : windows_sys::core::PCWSTR, dwflags : u32) -> HRESOURCE);

// UNSUPPORTED Rust 190:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CreateClusterResourceEx(hgroup : HGROUP, lpszresourcename : windows_sys::core::PCWSTR, lpszresourcetype : windows_sys::core::PCWSTR, dwflags : u32, lpszreason : windows_sys::core::PCWSTR) -> HRESOURCE);

// UNSUPPORTED Rust 191:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CreateClusterResourceType(hcluster : HCLUSTER, lpszresourcetypename : windows_sys::core::PCWSTR, lpszdisplayname : windows_sys::core::PCWSTR, lpszresourcetypedll : windows_sys::core::PCWSTR, dwlooksalivepollinterval : u32, dwisalivepollinterval : u32) -> u32);

// UNSUPPORTED Rust 192:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn CreateClusterResourceTypeEx(hcluster : HCLUSTER, lpszresourcetypename : windows_sys::core::PCWSTR, lpszdisplayname : windows_sys::core::PCWSTR, lpszresourcetypedll : windows_sys::core::PCWSTR, dwlooksalivepollinterval : u32, dwisalivepollinterval : u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 193:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn DeleteClusterGroup(hgroup : HGROUP) -> u32);

// UNSUPPORTED Rust 194:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn DeleteClusterGroupEx(hgroup : HGROUP, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 195:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn DeleteClusterGroupSet(hgroupset : HGROUPSET) -> u32);

// UNSUPPORTED Rust 196:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn DeleteClusterGroupSetEx(hgroupset : HGROUPSET, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 197:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn DeleteClusterResource(hresource : HRESOURCE) -> u32);

// UNSUPPORTED Rust 198:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn DeleteClusterResourceEx(hresource : HRESOURCE, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 199:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn DeleteClusterResourceType(hcluster : HCLUSTER, lpszresourcetypename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 200:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn DeleteClusterResourceTypeEx(hcluster : HCLUSTER, lpsztypename : windows_sys::core::PCWSTR, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 201:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn DestroyCluster(hcluster : HCLUSTER, pfnprogresscallback : PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg : *const core::ffi::c_void, fdeletevirtualcomputerobjects : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 202:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn DestroyClusterGroup(hgroup : HGROUP) -> u32);

// UNSUPPORTED Rust 203:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn DestroyClusterGroupEx(hgroup : HGROUP, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 204:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn DetermineCNOResTypeFromCluster(hcluster : HCLUSTER, pcnorestype : *mut CLUSTER_MGMT_POINT_RESTYPE) -> u32);

// UNSUPPORTED Rust 205:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn DetermineCNOResTypeFromNodelist(cnodes : u32, ppsznodenames : *const windows_sys::core::PCWSTR, pcnorestype : *mut CLUSTER_MGMT_POINT_RESTYPE) -> u32);

// UNSUPPORTED Rust 206:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn DetermineClusterCloudTypeFromCluster(hcluster : HCLUSTER, pcloudtype : *mut CLUSTER_CLOUD_TYPE) -> u32);

// UNSUPPORTED Rust 207:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn DetermineClusterCloudTypeFromNodelist(cnodes : u32, ppsznodenames : *const windows_sys::core::PCWSTR, pcloudtype : *mut CLUSTER_CLOUD_TYPE) -> u32);

// UNSUPPORTED Rust 208:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn EvictClusterNode(hnode : HNODE) -> u32);

// UNSUPPORTED Rust 209:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn EvictClusterNodeEx(hnode : HNODE, dwtimeout : u32, phrcleanupstatus : *mut windows_sys::core::HRESULT) -> u32);

// UNSUPPORTED Rust 210:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn EvictClusterNodeEx2(hnode : HNODE, dwtimeout : u32, phrcleanupstatus : *mut windows_sys::core::HRESULT, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 211:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn FailClusterResource(hresource : HRESOURCE) -> u32);

// UNSUPPORTED Rust 212:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn FailClusterResourceEx(hresource : HRESOURCE, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 213:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn FreeClusterCrypt(pcryptinfo : *const core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 214:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn FreeClusterHealthFault(clusterhealthfault : *mut CLUSTER_HEALTH_FAULT) -> u32);

// UNSUPPORTED Rust 215:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn FreeClusterHealthFaultArray(clusterhealthfaultarray : *mut CLUSTER_HEALTH_FAULT_ARRAY) -> u32);

// UNSUPPORTED Rust 216:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterFromGroup(hgroup : HGROUP) -> HCLUSTER);

// UNSUPPORTED Rust 217:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterFromNetInterface(hnetinterface : HNETINTERFACE) -> HCLUSTER);

// UNSUPPORTED Rust 218:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterFromNetwork(hnetwork : HNETWORK) -> HCLUSTER);

// UNSUPPORTED Rust 219:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterFromNode(hnode : HNODE) -> HCLUSTER);

// UNSUPPORTED Rust 220:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterFromResource(hresource : HRESOURCE) -> HCLUSTER);

// UNSUPPORTED Rust 221:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn GetClusterGroupKey(hgroup : HGROUP, samdesired : u32) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 223:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterGroupState(hgroup : HGROUP, lpsznodename : windows_sys::core::PWSTR, lpcchnodename : *mut u32) -> CLUSTER_GROUP_STATE);

// UNSUPPORTED Rust 224:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterInformation(hcluster : HCLUSTER, lpszclustername : windows_sys::core::PWSTR, lpcchclustername : *mut u32, lpclusterinfo : *mut CLUSTERVERSIONINFO) -> u32);

// UNSUPPORTED Rust 225:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn GetClusterKey(hcluster : HCLUSTER, samdesired : u32) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 227:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterNetInterface(hcluster : HCLUSTER, lpsznodename : windows_sys::core::PCWSTR, lpsznetworkname : windows_sys::core::PCWSTR, lpszinterfacename : windows_sys::core::PWSTR, lpcchinterfacename : *mut u32) -> u32);

// UNSUPPORTED Rust 228:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn GetClusterNetInterfaceKey(hnetinterface : HNETINTERFACE, samdesired : u32) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 230:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterNetInterfaceState(hnetinterface : HNETINTERFACE) -> CLUSTER_NETINTERFACE_STATE);

// UNSUPPORTED Rust 231:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterNetworkId(hnetwork : HNETWORK, lpsznetworkid : windows_sys::core::PWSTR, lpcchname : *mut u32) -> u32);

// UNSUPPORTED Rust 232:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn GetClusterNetworkKey(hnetwork : HNETWORK, samdesired : u32) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 234:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterNetworkState(hnetwork : HNETWORK) -> CLUSTER_NETWORK_STATE);

// UNSUPPORTED Rust 235:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterNodeId(hnode : HNODE, lpsznodeid : windows_sys::core::PWSTR, lpcchname : *mut u32) -> u32);

// UNSUPPORTED Rust 236:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn GetClusterNodeKey(hnode : HNODE, samdesired : u32) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 238:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterNodeState(hnode : HNODE) -> CLUSTER_NODE_STATE);

// UNSUPPORTED Rust 239:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterNotify(hchange : HCHANGE, lpdwnotifykey : *mut usize, lpdwfiltertype : *mut u32, lpszname : windows_sys::core::PWSTR, lpcchname : *mut u32, dwmilliseconds : u32) -> u32);

// UNSUPPORTED Rust 240:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterNotifyV2(hchange : HCHANGE, lpdwnotifykey : *mut usize, pfilterandtype : *mut NOTIFY_FILTER_AND_TYPE, buffer : *mut u8, lpbbuffersize : *mut u32, lpszobjectid : windows_sys::core::PWSTR, lpcchobjectid : *mut u32, lpszparentid : windows_sys::core::PWSTR, lpcchparentid : *mut u32, lpszname : windows_sys::core::PWSTR, lpcchname : *mut u32, lpsztype : windows_sys::core::PWSTR, lpcchtype : *mut u32, dwmilliseconds : u32) -> u32);

// UNSUPPORTED Rust 241:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterQuorumResource(hcluster : HCLUSTER, lpszresourcename : windows_sys::core::PWSTR, lpcchresourcename : *mut u32, lpszdevicename : windows_sys::core::PWSTR, lpcchdevicename : *mut u32, lpdwmaxquorumlogsize : *mut u32) -> u32);

// UNSUPPORTED Rust 242:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterResourceDependencyExpression(hresource : HRESOURCE, lpszdependencyexpression : windows_sys::core::PWSTR, lpcchdependencyexpression : *mut u32) -> u32);

// UNSUPPORTED Rust 243:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn GetClusterResourceKey(hresource : HRESOURCE, samdesired : u32) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 245:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterResourceNetworkName(hresource : HRESOURCE, lpbuffer : windows_sys::core::PWSTR, nsize : *mut u32) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 246:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetClusterResourceState(hresource : HRESOURCE, lpsznodename : windows_sys::core::PWSTR, lpcchnodename : *mut u32, lpszgroupname : windows_sys::core::PWSTR, lpcchgroupname : *mut u32) -> CLUSTER_RESOURCE_STATE);

// UNSUPPORTED Rust 247:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("clusapi.dll" "system" fn GetClusterResourceTypeKey(hcluster : HCLUSTER, lpsztypename : windows_sys::core::PCWSTR, samdesired : u32) -> super::super::System::Registry:: HKEY);

// UNSUPPORTED Rust 249:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetNodeCloudTypeDW(ppsznodename : windows_sys::core::PCWSTR, nodecloudtype : *mut u32) -> u32);

// UNSUPPORTED Rust 250:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetNodeClusterState(lpsznodename : windows_sys::core::PCWSTR, pdwclusterstate : *mut u32) -> u32);

// UNSUPPORTED Rust 251:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn GetNotifyEventHandle(hchange : HCHANGE, lphtargetevent : *mut super::super::Foundation:: HANDLE) -> u32);

// UNSUPPORTED Rust 252:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn InitializeClusterHealthFault(clusterhealthfault : *mut CLUSTER_HEALTH_FAULT) -> u32);

// UNSUPPORTED Rust 253:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn InitializeClusterHealthFaultArray(clusterhealthfaultarray : *mut CLUSTER_HEALTH_FAULT_ARRAY) -> u32);

// UNSUPPORTED Rust 254:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn IsFileOnClusterSharedVolume(lpszpathname : windows_sys::core::PCWSTR, pbfileisonsharedvolume : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 255:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn MoveClusterGroup(hgroup : HGROUP, hdestinationnode : HNODE) -> u32);

// UNSUPPORTED Rust 256:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn MoveClusterGroupEx(hgroup : HGROUP, hdestinationnode : HNODE, dwmoveflags : u32, lpinbuffer : *const u8, cbinbuffersize : u32) -> u32);

// UNSUPPORTED Rust 257:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn MoveClusterGroupEx2(hgroup : HGROUP, hdestinationnode : HNODE, dwmoveflags : u32, lpinbuffer : *const u8, cbinbuffersize : u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 258:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OfflineClusterGroup(hgroup : HGROUP) -> u32);

// UNSUPPORTED Rust 259:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OfflineClusterGroupEx(hgroup : HGROUP, dwofflineflags : u32, lpinbuffer : *const u8, cbinbuffersize : u32) -> u32);

// UNSUPPORTED Rust 260:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OfflineClusterGroupEx2(hgroup : HGROUP, dwofflineflags : u32, lpinbuffer : *const u8, cbinbuffersize : u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 261:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OfflineClusterResource(hresource : HRESOURCE) -> u32);

// UNSUPPORTED Rust 262:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OfflineClusterResourceEx(hresource : HRESOURCE, dwofflineflags : u32, lpinbuffer : *const u8, cbinbuffersize : u32) -> u32);

// UNSUPPORTED Rust 263:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OfflineClusterResourceEx2(hresource : HRESOURCE, dwofflineflags : u32, lpinbuffer : *const u8, cbinbuffersize : u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 264:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OnlineClusterGroup(hgroup : HGROUP, hdestinationnode : HNODE) -> u32);

// UNSUPPORTED Rust 265:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OnlineClusterGroupEx(hgroup : HGROUP, hdestinationnode : HNODE, dwonlineflags : u32, lpinbuffer : *const u8, cbinbuffersize : u32) -> u32);

// UNSUPPORTED Rust 266:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OnlineClusterGroupEx2(hgroup : HGROUP, hdestinationnode : HNODE, dwonlineflags : u32, lpinbuffer : *const u8, cbinbuffersize : u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 267:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OnlineClusterResource(hresource : HRESOURCE) -> u32);

// UNSUPPORTED Rust 268:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OnlineClusterResourceEx(hresource : HRESOURCE, dwonlineflags : u32, lpinbuffer : *const u8, cbinbuffersize : u32) -> u32);

// UNSUPPORTED Rust 269:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OnlineClusterResourceEx2(hresource : HRESOURCE, dwonlineflags : u32, lpinbuffer : *const u8, cbinbuffersize : u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 270:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OpenCluster(lpszclustername : windows_sys::core::PCWSTR) -> HCLUSTER);

// UNSUPPORTED Rust 271:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn OpenClusterCryptProvider(lpszresource : windows_sys::core::PCWSTR, lpszprovider : *const i8, dwtype : u32, dwflags : u32) -> HCLUSCRYPTPROVIDER);

// UNSUPPORTED Rust 272:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn OpenClusterCryptProviderEx(lpszresource : windows_sys::core::PCWSTR, lpszkeyname : windows_sys::core::PCWSTR, lpszprovider : *const i8, dwtype : u32, dwflags : u32) -> HCLUSCRYPTPROVIDER);

// UNSUPPORTED Rust 273:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OpenClusterEx(lpszclustername : windows_sys::core::PCWSTR, desiredaccess : u32, grantedaccess : *mut u32) -> HCLUSTER);

// UNSUPPORTED Rust 274:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OpenClusterGroup(hcluster : HCLUSTER, lpszgroupname : windows_sys::core::PCWSTR) -> HGROUP);

// UNSUPPORTED Rust 275:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OpenClusterGroupEx(hcluster : HCLUSTER, lpszgroupname : windows_sys::core::PCWSTR, dwdesiredaccess : u32, lpdwgrantedaccess : *mut u32) -> HGROUP);

// UNSUPPORTED Rust 276:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OpenClusterGroupSet(hcluster : HCLUSTER, lpszgroupsetname : windows_sys::core::PCWSTR) -> HGROUPSET);

// UNSUPPORTED Rust 277:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OpenClusterNetInterface(hcluster : HCLUSTER, lpszinterfacename : windows_sys::core::PCWSTR) -> HNETINTERFACE);

// UNSUPPORTED Rust 278:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OpenClusterNetInterfaceEx(hcluster : HCLUSTER, lpszinterfacename : windows_sys::core::PCWSTR, dwdesiredaccess : u32, lpdwgrantedaccess : *mut u32) -> HNETINTERFACE);

// UNSUPPORTED Rust 279:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OpenClusterNetwork(hcluster : HCLUSTER, lpsznetworkname : windows_sys::core::PCWSTR) -> HNETWORK);

// UNSUPPORTED Rust 280:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OpenClusterNetworkEx(hcluster : HCLUSTER, lpsznetworkname : windows_sys::core::PCWSTR, dwdesiredaccess : u32, lpdwgrantedaccess : *mut u32) -> HNETWORK);

// UNSUPPORTED Rust 281:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OpenClusterNode(hcluster : HCLUSTER, lpsznodename : windows_sys::core::PCWSTR) -> HNODE);

// UNSUPPORTED Rust 282:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OpenClusterNodeById(hcluster : HCLUSTER, nodeid : u32) -> HNODE);

// UNSUPPORTED Rust 283:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OpenClusterNodeEx(hcluster : HCLUSTER, lpsznodename : windows_sys::core::PCWSTR, dwdesiredaccess : u32, lpdwgrantedaccess : *mut u32) -> HNODE);

// UNSUPPORTED Rust 284:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OpenClusterResource(hcluster : HCLUSTER, lpszresourcename : windows_sys::core::PCWSTR) -> HRESOURCE);

// UNSUPPORTED Rust 285:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn OpenClusterResourceEx(hcluster : HCLUSTER, lpszresourcename : windows_sys::core::PCWSTR, dwdesiredaccess : u32, lpdwgrantedaccess : *mut u32) -> HRESOURCE);

// UNSUPPORTED Rust 286:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn PauseClusterNode(hnode : HNODE) -> u32);

// UNSUPPORTED Rust 287:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn PauseClusterNodeEx(hnode : HNODE, bdrainnode : windows_sys::core::BOOL, dwpauseflags : u32, hnodedraintarget : HNODE) -> u32);

// UNSUPPORTED Rust 288:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn PauseClusterNodeEx2(hnode : HNODE, bdrainnode : windows_sys::core::BOOL, dwpauseflags : u32, hnodedraintarget : HNODE, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 289:1: declaration Macro has no candidate rule
// windows_link::link!("ntlanman.dll" "system" fn QueryAppInstanceVersion(appinstanceid : *const windows_sys::core::GUID, instanceversionhigh : *mut u64, instanceversionlow : *mut u64, versionstatus : *mut super::super::Foundation:: NTSTATUS) -> u32);

// UNSUPPORTED Rust 290:1: declaration Macro has no candidate rule
// windows_link::link!("ntlanman.dll" "system" fn RegisterAppInstance(processhandle : super::super::Foundation:: HANDLE, appinstanceid : *const windows_sys::core::GUID, childreninheritappinstance : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 291:1: declaration Macro has no candidate rule
// windows_link::link!("ntlanman.dll" "system" fn RegisterAppInstanceVersion(appinstanceid : *const windows_sys::core::GUID, instanceversionhigh : u64, instanceversionlow : u64) -> u32);

// UNSUPPORTED Rust 292:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RegisterClusterNotify(hchange : HCHANGE, dwfiltertype : u32, hobject : super::super::Foundation:: HANDLE, dwnotifykey : usize) -> u32);

// UNSUPPORTED Rust 293:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RegisterClusterNotifyV2(hchange : HCHANGE, filter : NOTIFY_FILTER_AND_TYPE, hobject : super::super::Foundation:: HANDLE, dwnotifykey : usize) -> u32);

// UNSUPPORTED Rust 294:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RegisterClusterResourceTypeNotifyV2(hchange : HCHANGE, hcluster : HCLUSTER, flags : i64, restypename : windows_sys::core::PCWSTR, dwnotifykey : usize) -> u32);

// UNSUPPORTED Rust 295:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RemoveClusterGroupDependency(hgroup : HGROUP, hdependson : HGROUP) -> u32);

// UNSUPPORTED Rust 296:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RemoveClusterGroupDependencyEx(hgroup : HGROUP, hdependson : HGROUP, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 297:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RemoveClusterGroupSetDependency(hgroupset : HGROUPSET, hdependson : HGROUPSET) -> u32);

// UNSUPPORTED Rust 298:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RemoveClusterGroupSetDependencyEx(hgroupset : HGROUPSET, hdependson : HGROUPSET, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 299:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RemoveClusterGroupToGroupSetDependency(hgroup : HGROUP, hdependson : HGROUPSET) -> u32);

// UNSUPPORTED Rust 300:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RemoveClusterGroupToGroupSetDependencyEx(hgroup : HGROUP, hdependson : HGROUPSET, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 301:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RemoveClusterNameAccount(hcluster : HCLUSTER, bdeletecomputerobjects : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 302:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RemoveClusterResourceDependency(hresource : HRESOURCE, hdependson : HRESOURCE) -> u32);

// UNSUPPORTED Rust 303:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RemoveClusterResourceDependencyEx(hresource : HRESOURCE, hdependson : HRESOURCE, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 304:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RemoveClusterResourceNode(hresource : HRESOURCE, hnode : HNODE) -> u32);

// UNSUPPORTED Rust 305:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RemoveClusterResourceNodeEx(hresource : HRESOURCE, hnode : HNODE, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 306:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RemoveClusterStorageNode(hcluster : HCLUSTER, lpszclusterstorageenclosurename : windows_sys::core::PCWSTR, dwtimeout : u32, dwflags : u32) -> u32);

// UNSUPPORTED Rust 307:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RemoveCrossClusterGroupSetDependency(hdependentgroupset : HGROUPSET, lpremoteclustername : windows_sys::core::PCWSTR, lpremotegroupsetname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 308:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RemoveResourceFromClusterSharedVolumes(hresource : HRESOURCE) -> u32);

// UNSUPPORTED Rust 309:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilAddUnknownProperties(hkeyclusterkey : super::super::System::Registry:: HKEY, ppropertytable : *const RESUTIL_PROPERTY_ITEM, poutpropertylist : *mut core::ffi::c_void, pcboutpropertylistsize : u32, pcbbytesreturned : *mut u32, pcbrequired : *mut u32) -> u32);

// UNSUPPORTED Rust 311:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilCreateDirectoryTree(pszpath : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 312:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilDupGroup(group : HGROUP, copy : *mut HGROUP) -> u32);

// UNSUPPORTED Rust 313:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilDupParameterBlock(poutparams : *mut u8, pinparams : *const u8, ppropertytable : *const RESUTIL_PROPERTY_ITEM) -> u32);

// UNSUPPORTED Rust 314:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilDupResource(group : HRESOURCE, copy : *mut HRESOURCE) -> u32);

// UNSUPPORTED Rust 315:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilDupString(pszinstring : windows_sys::core::PCWSTR) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 316:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilEnumGroups(hcluster : HCLUSTER, hself : HGROUP, prescallback : LPGROUP_CALLBACK_EX, pparameter : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 317:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilEnumGroupsEx(hcluster : HCLUSTER, hself : HGROUP, grouptype : CLUSGROUP_TYPE, prescallback : LPGROUP_CALLBACK_EX, pparameter : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 318:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilEnumPrivateProperties(hkeyclusterkey : super::super::System::Registry:: HKEY, pszoutproperties : windows_sys::core::PWSTR, cboutpropertiessize : u32, pcbbytesreturned : *mut u32, pcbrequired : *mut u32) -> u32);

// UNSUPPORTED Rust 320:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilEnumProperties(ppropertytable : *const RESUTIL_PROPERTY_ITEM, pszoutproperties : windows_sys::core::PWSTR, cboutpropertiessize : u32, pcbbytesreturned : *mut u32, pcbrequired : *mut u32) -> u32);

// UNSUPPORTED Rust 321:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilEnumResources(hself : HRESOURCE, lpszrestypename : windows_sys::core::PCWSTR, prescallback : LPRESOURCE_CALLBACK, pparameter : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 322:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilEnumResourcesEx(hcluster : HCLUSTER, hself : HRESOURCE, lpszrestypename : windows_sys::core::PCWSTR, prescallback : LPRESOURCE_CALLBACK_EX, pparameter : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 323:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilEnumResourcesEx2(hcluster : HCLUSTER, hself : HRESOURCE, lpszrestypename : windows_sys::core::PCWSTR, prescallback : LPRESOURCE_CALLBACK_EX, pparameter : *mut core::ffi::c_void, dwdesiredaccess : u32) -> u32);

// UNSUPPORTED Rust 324:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilExpandEnvironmentStrings(pszsrc : windows_sys::core::PCWSTR) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 325:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilFindBinaryProperty(ppropertylist : *const core::ffi::c_void, cbpropertylistsize : u32, pszpropertyname : windows_sys::core::PCWSTR, pbpropertyvalue : *mut *mut u8, pcbpropertyvaluesize : *mut u32) -> u32);

// UNSUPPORTED Rust 326:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilFindDependentDiskResourceDriveLetter(hcluster : HCLUSTER, hresource : HRESOURCE, pszdriveletter : windows_sys::core::PWSTR, pcchdriveletter : *mut u32) -> u32);

// UNSUPPORTED Rust 327:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilFindDwordProperty(ppropertylist : *const core::ffi::c_void, cbpropertylistsize : u32, pszpropertyname : windows_sys::core::PCWSTR, pdwpropertyvalue : *mut u32) -> u32);

// UNSUPPORTED Rust 328:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilFindExpandSzProperty(ppropertylist : *const core::ffi::c_void, cbpropertylistsize : u32, pszpropertyname : windows_sys::core::PCWSTR, pszpropertyvalue : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 329:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilFindExpandedSzProperty(ppropertylist : *const core::ffi::c_void, cbpropertylistsize : u32, pszpropertyname : windows_sys::core::PCWSTR, pszpropertyvalue : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 330:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilFindFileTimeProperty(ppropertylist : *const core::ffi::c_void, cbpropertylistsize : u32, pszpropertyname : windows_sys::core::PCWSTR, pftpropertyvalue : *mut super::super::Foundation:: FILETIME) -> u32);

// UNSUPPORTED Rust 331:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilFindLongProperty(ppropertylist : *const core::ffi::c_void, cbpropertylistsize : u32, pszpropertyname : windows_sys::core::PCWSTR, plpropertyvalue : *mut i32) -> u32);

// UNSUPPORTED Rust 332:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilFindMultiSzProperty(ppropertylist : *const core::ffi::c_void, cbpropertylistsize : u32, pszpropertyname : windows_sys::core::PCWSTR, pszpropertyvalue : *mut windows_sys::core::PWSTR, pcbpropertyvaluesize : *mut u32) -> u32);

// UNSUPPORTED Rust 333:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilFindSzProperty(ppropertylist : *const core::ffi::c_void, cbpropertylistsize : u32, pszpropertyname : windows_sys::core::PCWSTR, pszpropertyvalue : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 334:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilFindULargeIntegerProperty(ppropertylist : *const core::ffi::c_void, cbpropertylistsize : u32, pszpropertyname : windows_sys::core::PCWSTR, plpropertyvalue : *mut u64) -> u32);

// UNSUPPORTED Rust 335:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilFreeEnvironment(lpenvironment : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 336:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilFreeParameterBlock(poutparams : *mut u8, pinparams : *const u8, ppropertytable : *const RESUTIL_PROPERTY_ITEM));

// UNSUPPORTED Rust 337:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilGetAllProperties(hkeyclusterkey : super::super::System::Registry:: HKEY, ppropertytable : *const RESUTIL_PROPERTY_ITEM, poutpropertylist : *mut core::ffi::c_void, cboutpropertylistsize : u32, pcbbytesreturned : *mut u32, pcbrequired : *mut u32) -> u32);

// UNSUPPORTED Rust 339:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetBinaryProperty(ppboutvalue : *mut *mut u8, pcboutvaluesize : *mut u32, pvaluestruct : *const CLUSPROP_BINARY, pboldvalue : *const u8, cboldvaluesize : u32, pppropertylist : *mut *mut u8, pcbpropertylistsize : *mut u32) -> u32);

// UNSUPPORTED Rust 340:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilGetBinaryValue(hkeyclusterkey : super::super::System::Registry:: HKEY, pszvaluename : windows_sys::core::PCWSTR, ppboutvalue : *mut *mut u8, pcboutvaluesize : *mut u32) -> u32);

// UNSUPPORTED Rust 342:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetClusterGroupType(hgroup : HGROUP, grouptype : *mut CLUSGROUP_TYPE) -> u32);

// UNSUPPORTED Rust 343:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetClusterId(hcluster : HCLUSTER, guid : *mut windows_sys::core::GUID) -> u32);

// UNSUPPORTED Rust 344:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetClusterRoleState(hcluster : HCLUSTER, eclusterrole : CLUSTER_ROLE) -> CLUSTER_ROLE_STATE);

// UNSUPPORTED Rust 345:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetCoreClusterResources(hcluster : HCLUSTER, phclusternameresource : *mut HRESOURCE, phclusteripaddressresource : *mut HRESOURCE, phclusterquorumresource : *mut HRESOURCE) -> u32);

// UNSUPPORTED Rust 346:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetCoreClusterResourcesEx(hclusterin : HCLUSTER, phclusternameresourceout : *mut HRESOURCE, phclusterquorumresourceout : *mut HRESOURCE, dwdesiredaccess : u32) -> u32);

// UNSUPPORTED Rust 347:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetCoreGroup(hcluster : HCLUSTER) -> HGROUP);

// UNSUPPORTED Rust 348:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetDwordProperty(pdwoutvalue : *mut u32, pvaluestruct : *const CLUSPROP_DWORD, dwoldvalue : u32, dwminimum : u32, dwmaximum : u32, pppropertylist : *mut *mut u8, pcbpropertylistsize : *mut u32) -> u32);

// UNSUPPORTED Rust 349:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilGetDwordValue(hkeyclusterkey : super::super::System::Registry:: HKEY, pszvaluename : windows_sys::core::PCWSTR, pdwoutvalue : *mut u32, dwdefaultvalue : u32) -> u32);

// UNSUPPORTED Rust 351:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetEnvironmentWithNetName(hresource : HRESOURCE) -> *mut core::ffi::c_void);

// UNSUPPORTED Rust 352:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetFileTimeProperty(pftoutvalue : *mut super::super::Foundation:: FILETIME, pvaluestruct : *const CLUSPROP_FILETIME, ftoldvalue : super::super::Foundation:: FILETIME, ftminimum : super::super::Foundation:: FILETIME, ftmaximum : super::super::Foundation:: FILETIME, pppropertylist : *mut *mut u8, pcbpropertylistsize : *mut u32) -> u32);

// UNSUPPORTED Rust 353:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetLongProperty(ploutvalue : *mut i32, pvaluestruct : *const CLUSPROP_LONG, loldvalue : i32, lminimum : i32, lmaximum : i32, pppropertylist : *mut *mut u8, pcbpropertylistsize : *mut u32) -> u32);

// UNSUPPORTED Rust 354:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetMultiSzProperty(ppszoutvalue : *mut windows_sys::core::PWSTR, pcboutvaluesize : *mut u32, pvaluestruct : *const CLUSPROP_SZ, pszoldvalue : windows_sys::core::PCWSTR, cboldvaluesize : u32, pppropertylist : *mut *mut u8, pcbpropertylistsize : *mut u32) -> u32);

// UNSUPPORTED Rust 355:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilGetPrivateProperties(hkeyclusterkey : super::super::System::Registry:: HKEY, poutpropertylist : *mut core::ffi::c_void, cboutpropertylistsize : u32, pcbbytesreturned : *mut u32, pcbrequired : *mut u32) -> u32);

// UNSUPPORTED Rust 357:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilGetProperties(hkeyclusterkey : super::super::System::Registry:: HKEY, ppropertytable : *const RESUTIL_PROPERTY_ITEM, poutpropertylist : *mut core::ffi::c_void, cboutpropertylistsize : u32, pcbbytesreturned : *mut u32, pcbrequired : *mut u32) -> u32);

// UNSUPPORTED Rust 359:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilGetPropertiesToParameterBlock(hkeyclusterkey : super::super::System::Registry:: HKEY, ppropertytable : *const RESUTIL_PROPERTY_ITEM, poutparams : *mut u8, bcheckforrequiredproperties : windows_sys::core::BOOL, psznameofpropinerror : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 361:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilGetProperty(hkeyclusterkey : super::super::System::Registry:: HKEY, ppropertytableitem : *const RESUTIL_PROPERTY_ITEM, poutpropertyitem : *mut *mut core::ffi::c_void, pcboutpropertyitemsize : *mut u32) -> u32);

// UNSUPPORTED Rust 363:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetPropertyFormats(ppropertytable : *const RESUTIL_PROPERTY_ITEM, poutpropertyformatlist : *mut core::ffi::c_void, cbpropertyformatlistsize : u32, pcbbytesreturned : *mut u32, pcbrequired : *mut u32) -> u32);

// UNSUPPORTED Rust 364:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilGetPropertySize(hkeyclusterkey : super::super::System::Registry:: HKEY, ppropertytableitem : *const RESUTIL_PROPERTY_ITEM, pcboutpropertylistsize : *mut u32, pnpropertycount : *mut u32) -> u32);

// UNSUPPORTED Rust 366:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilGetQwordValue(hkeyclusterkey : super::super::System::Registry:: HKEY, pszvaluename : windows_sys::core::PCWSTR, pqwoutvalue : *mut u64, qwdefaultvalue : u64) -> u32);

// UNSUPPORTED Rust 368:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetResourceDependency(hself : super::super::Foundation:: HANDLE, lpszresourcetype : windows_sys::core::PCWSTR) -> HRESOURCE);

// UNSUPPORTED Rust 369:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetResourceDependencyByClass(hcluster : HCLUSTER, hself : super::super::Foundation:: HANDLE, prci : *mut CLUS_RESOURCE_CLASS_INFO, brecurse : windows_sys::core::BOOL) -> HRESOURCE);

// UNSUPPORTED Rust 370:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetResourceDependencyByClassEx(hcluster : HCLUSTER, hself : super::super::Foundation:: HANDLE, prci : *mut CLUS_RESOURCE_CLASS_INFO, brecurse : windows_sys::core::BOOL, dwdesiredaccess : u32) -> HRESOURCE);

// UNSUPPORTED Rust 371:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetResourceDependencyByName(hcluster : HCLUSTER, hself : super::super::Foundation:: HANDLE, lpszresourcetype : windows_sys::core::PCWSTR, brecurse : windows_sys::core::BOOL) -> HRESOURCE);

// UNSUPPORTED Rust 372:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetResourceDependencyByNameEx(hcluster : HCLUSTER, hself : super::super::Foundation:: HANDLE, lpszresourcetype : windows_sys::core::PCWSTR, brecurse : windows_sys::core::BOOL, dwdesiredaccess : u32) -> HRESOURCE);

// UNSUPPORTED Rust 373:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetResourceDependencyEx(hself : super::super::Foundation:: HANDLE, lpszresourcetype : windows_sys::core::PCWSTR, dwdesiredaccess : u32) -> HRESOURCE);

// UNSUPPORTED Rust 374:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetResourceDependentIPAddressProps(hresource : HRESOURCE, pszaddress : windows_sys::core::PWSTR, pcchaddress : *mut u32, pszsubnetmask : windows_sys::core::PWSTR, pcchsubnetmask : *mut u32, psznetwork : windows_sys::core::PWSTR, pcchnetwork : *mut u32) -> u32);

// UNSUPPORTED Rust 375:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetResourceName(hresource : HRESOURCE, pszresourcename : windows_sys::core::PWSTR, pcchresourcenameinout : *mut u32) -> u32);

// UNSUPPORTED Rust 376:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetResourceNameDependency(lpszresourcename : windows_sys::core::PCWSTR, lpszresourcetype : windows_sys::core::PCWSTR) -> HRESOURCE);

// UNSUPPORTED Rust 377:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetResourceNameDependencyEx(lpszresourcename : windows_sys::core::PCWSTR, lpszresourcetype : windows_sys::core::PCWSTR, dwdesiredaccess : u32) -> HRESOURCE);

// UNSUPPORTED Rust 378:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGetSzProperty(ppszoutvalue : *mut windows_sys::core::PWSTR, pvaluestruct : *const CLUSPROP_SZ, pszoldvalue : windows_sys::core::PCWSTR, pppropertylist : *mut *mut u8, pcbpropertylistsize : *mut u32) -> u32);

// UNSUPPORTED Rust 379:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilGetSzValue(hkeyclusterkey : super::super::System::Registry:: HKEY, pszvaluename : windows_sys::core::PCWSTR) -> windows_sys::core::PWSTR);

// UNSUPPORTED Rust 381:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilGroupsEqual(hself : HGROUP, hgroup : HGROUP, pequal : *mut windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 382:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilIsPathValid(pszpath : windows_sys::core::PCWSTR) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 383:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilIsResourceClassEqual(prci : *mut CLUS_RESOURCE_CLASS_INFO, hresource : HRESOURCE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 384:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilLeftPaxosIsLessThanRight(left : *const PaxosTagCStruct, right : *const PaxosTagCStruct) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 385:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilNodeEnum(hcluster : HCLUSTER, pnodecallback : LPNODE_CALLBACK, pparameter : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 386:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilPaxosComparer(left : *const PaxosTagCStruct, right : *const PaxosTagCStruct) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 387:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilPropertyListFromParameterBlock(ppropertytable : *const RESUTIL_PROPERTY_ITEM, poutpropertylist : *mut core::ffi::c_void, pcboutpropertylistsize : *mut u32, pinparams : *const u8, pcbbytesreturned : *mut u32, pcbrequired : *mut u32) -> u32);

// UNSUPPORTED Rust 388:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilRemoveResourceServiceEnvironment(pszservicename : windows_sys::core::PCWSTR, pfnlogevent : PLOG_EVENT_ROUTINE, hresourcehandle : isize) -> u32);

// UNSUPPORTED Rust 389:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilResourceDepEnum(hself : HRESOURCE, enumtype : u32, prescallback : LPRESOURCE_CALLBACK_EX, pparameter : *mut core::ffi::c_void) -> u32);

// UNSUPPORTED Rust 390:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilResourceTypesEqual(lpszresourcetypename : windows_sys::core::PCWSTR, hresource : HRESOURCE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 391:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilResourcesEqual(hself : HRESOURCE, hresource : HRESOURCE) -> windows_sys::core::BOOL);

// UNSUPPORTED Rust 392:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilSetBinaryValue(hkeyclusterkey : super::super::System::Registry:: HKEY, pszvaluename : windows_sys::core::PCWSTR, pbnewvalue : *const u8, cbnewvaluesize : u32, ppboutvalue : *mut *mut u8, pcboutvaluesize : *mut u32) -> u32);

// UNSUPPORTED Rust 394:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilSetDwordValue(hkeyclusterkey : super::super::System::Registry:: HKEY, pszvaluename : windows_sys::core::PCWSTR, dwnewvalue : u32, pdwoutvalue : *mut u32) -> u32);

// UNSUPPORTED Rust 396:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilSetExpandSzValue(hkeyclusterkey : super::super::System::Registry:: HKEY, pszvaluename : windows_sys::core::PCWSTR, psznewvalue : windows_sys::core::PCWSTR, ppszoutstring : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 398:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilSetMultiSzValue(hkeyclusterkey : super::super::System::Registry:: HKEY, pszvaluename : windows_sys::core::PCWSTR, psznewvalue : windows_sys::core::PCWSTR, cbnewvaluesize : u32, ppszoutvalue : *mut windows_sys::core::PWSTR, pcboutvaluesize : *mut u32) -> u32);

// UNSUPPORTED Rust 400:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilSetPrivatePropertyList(hkeyclusterkey : super::super::System::Registry:: HKEY, pinpropertylist : *const core::ffi::c_void, cbinpropertylistsize : u32) -> u32);

// UNSUPPORTED Rust 402:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilSetPropertyParameterBlock(hkeyclusterkey : super::super::System::Registry:: HKEY, ppropertytable : *const RESUTIL_PROPERTY_ITEM, reserved : *mut core::ffi::c_void, pinparams : *const u8, pinpropertylist : *const core::ffi::c_void, cbinpropertylistsize : u32, poutparams : *mut u8) -> u32);

// UNSUPPORTED Rust 404:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilSetPropertyParameterBlockEx(hkeyclusterkey : super::super::System::Registry:: HKEY, ppropertytable : *const RESUTIL_PROPERTY_ITEM, reserved : *mut core::ffi::c_void, pinparams : *const u8, pinpropertylist : *const core::ffi::c_void, cbinpropertylistsize : u32, bforcewrite : windows_sys::core::BOOL, poutparams : *mut u8) -> u32);

// UNSUPPORTED Rust 406:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilSetPropertyTable(hkeyclusterkey : super::super::System::Registry:: HKEY, ppropertytable : *const RESUTIL_PROPERTY_ITEM, reserved : *const core::ffi::c_void, ballowunknownproperties : windows_sys::core::BOOL, pinpropertylist : *const core::ffi::c_void, cbinpropertylistsize : u32, poutparams : *mut u8) -> u32);

// UNSUPPORTED Rust 408:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilSetPropertyTableEx(hkeyclusterkey : super::super::System::Registry:: HKEY, ppropertytable : *const RESUTIL_PROPERTY_ITEM, reserved : *mut core::ffi::c_void, ballowunknownproperties : windows_sys::core::BOOL, pinpropertylist : *const core::ffi::c_void, cbinpropertylistsize : u32, bforcewrite : windows_sys::core::BOOL, poutparams : *mut u8) -> u32);

// UNSUPPORTED Rust 410:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilSetQwordValue(hkeyclusterkey : super::super::System::Registry:: HKEY, pszvaluename : windows_sys::core::PCWSTR, qwnewvalue : u64, pqwoutvalue : *mut u64) -> u32);

// UNSUPPORTED Rust 412:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilSetResourceServiceEnvironment(pszservicename : windows_sys::core::PCWSTR, hresource : HRESOURCE, pfnlogevent : PLOG_EVENT_ROUTINE, hresourcehandle : isize) -> u32);

// UNSUPPORTED Rust 413:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Services")]
// windows_link::link!("resutils.dll" "system" fn ResUtilSetResourceServiceStartParameters(pszservicename : windows_sys::core::PCWSTR, schscmhandle : super::super::System::Services:: SC_HANDLE, phservice : *mut super::super::System::Services:: SC_HANDLE, pfnlogevent : PLOG_EVENT_ROUTINE, hresourcehandle : isize) -> u32);

// UNSUPPORTED Rust 415:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Services")]
// windows_link::link!("resutils.dll" "system" fn ResUtilSetResourceServiceStartParametersEx(pszservicename : windows_sys::core::PCWSTR, schscmhandle : super::super::System::Services:: SC_HANDLE, phservice : *mut super::super::System::Services:: SC_HANDLE, dwdesiredaccess : u32, pfnlogevent : PLOG_EVENT_ROUTINE, hresourcehandle : isize) -> u32);

// UNSUPPORTED Rust 417:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilSetSzValue(hkeyclusterkey : super::super::System::Registry:: HKEY, pszvaluename : windows_sys::core::PCWSTR, psznewvalue : windows_sys::core::PCWSTR, ppszoutstring : *mut windows_sys::core::PWSTR) -> u32);

// UNSUPPORTED Rust 419:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilSetUnknownProperties(hkeyclusterkey : super::super::System::Registry:: HKEY, ppropertytable : *const RESUTIL_PROPERTY_ITEM, pinpropertylist : *const core::ffi::c_void, cbinpropertylistsize : u32) -> u32);

// UNSUPPORTED Rust 421:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilSetValueEx(hkeyclusterkey : super::super::System::Registry:: HKEY, valuename : windows_sys::core::PCWSTR, valuetype : u32, valuedata : *const u8, valuesize : u32, flags : u32) -> u32);

// UNSUPPORTED Rust 423:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Services")]
// windows_link::link!("resutils.dll" "system" fn ResUtilStartResourceService(pszservicename : windows_sys::core::PCWSTR, phservicehandle : *mut super::super::System::Services:: SC_HANDLE) -> u32);

// UNSUPPORTED Rust 425:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilStopResourceService(pszservicename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 426:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Services")]
// windows_link::link!("resutils.dll" "system" fn ResUtilStopService(hservicehandle : super::super::System::Services:: SC_HANDLE) -> u32);

// UNSUPPORTED Rust 428:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilTerminateServiceProcessFromResDll(dwservicepid : u32, boffline : windows_sys::core::BOOL, pdwresourcestate : *mut u32, pfnlogevent : PLOG_EVENT_ROUTINE, hresourcehandle : isize) -> u32);

// UNSUPPORTED Rust 429:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilVerifyPrivatePropertyList(pinpropertylist : *const core::ffi::c_void, cbinpropertylistsize : u32) -> u32);

// UNSUPPORTED Rust 430:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilVerifyPropertyTable(ppropertytable : *const RESUTIL_PROPERTY_ITEM, reserved : *const core::ffi::c_void, ballowunknownproperties : windows_sys::core::BOOL, pinpropertylist : *const core::ffi::c_void, cbinpropertylistsize : u32, poutparams : *mut u8) -> u32);

// UNSUPPORTED Rust 431:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilVerifyResourceService(pszservicename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 432:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Services")]
// windows_link::link!("resutils.dll" "system" fn ResUtilVerifyService(hservicehandle : super::super::System::Services:: SC_HANDLE) -> u32);

// UNSUPPORTED Rust 434:1: declaration Macro has no candidate rule
// windows_link::link!("resutils.dll" "system" fn ResUtilVerifyShutdownSafe(flags : u32, reason : u32, presult : *mut u32) -> u32);

// UNSUPPORTED Rust 435:1: declaration Macro has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// windows_link::link!("resutils.dll" "system" fn ResUtilsDeleteKeyTree(key : super::super::System::Registry:: HKEY, keyname : windows_sys::core::PCWSTR, treatnokeyaserror : windows_sys::core::BOOL) -> u32);

// UNSUPPORTED Rust 437:1: declaration Macro has no candidate rule
// windows_link::link!("ntlanman.dll" "system" fn ResetAllAppInstanceVersions() -> u32);

// UNSUPPORTED Rust 438:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RestartClusterResource(hresource : HRESOURCE, dwflags : u32) -> u32);

// UNSUPPORTED Rust 439:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RestartClusterResourceEx(hresource : HRESOURCE, dwflags : u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 440:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn RestoreClusterDatabase(lpszpathname : windows_sys::core::PCWSTR, bforce : windows_sys::core::BOOL, lpszquorumdriveletter : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 441:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ResumeClusterNode(hnode : HNODE) -> u32);

// UNSUPPORTED Rust 442:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ResumeClusterNodeEx(hnode : HNODE, eresumefailbacktype : CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved : u32) -> u32);

// UNSUPPORTED Rust 443:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn ResumeClusterNodeEx2(hnode : HNODE, eresumefailbacktype : CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved : u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 444:1: declaration Macro has no candidate rule
// windows_link::link!("ntlanman.dll" "system" fn SetAppInstanceCsvFlags(processhandle : super::super::Foundation:: HANDLE, mask : u32, flags : u32) -> u32);

// UNSUPPORTED Rust 445:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterGroupName(hgroup : HGROUP, lpszgroupname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 446:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterGroupNameEx(hgroup : HGROUP, lpszgroupname : windows_sys::core::PCWSTR, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 447:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterGroupNodeList(hgroup : HGROUP, nodecount : u32, nodelist : *const HNODE) -> u32);

// UNSUPPORTED Rust 448:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterGroupNodeListEx(hgroup : HGROUP, nodecount : u32, nodelist : *const HNODE, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 449:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterGroupSetDependencyExpression(hgroupset : HGROUPSET, lpszdependencyexprssion : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 450:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterGroupSetDependencyExpressionEx(hgroupset : HGROUPSET, lpszdependencyexpression : windows_sys::core::PCWSTR, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 451:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterName(hcluster : HCLUSTER, lpsznewclustername : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 452:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterNameEx(hcluster : HCLUSTER, lpsznewclustername : windows_sys::core::PCWSTR, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 453:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterNetworkName(hnetwork : HNETWORK, lpszname : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 454:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterNetworkNameEx(hnetwork : HNETWORK, lpszname : windows_sys::core::PCWSTR, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 455:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterNetworkPriorityOrder(hcluster : HCLUSTER, networkcount : u32, networklist : *const HNETWORK) -> u32);

// UNSUPPORTED Rust 456:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterQuorumResource(hresource : HRESOURCE, lpszdevicename : windows_sys::core::PCWSTR, dwmaxquologsize : u32) -> u32);

// UNSUPPORTED Rust 457:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterQuorumResourceEx(hresource : HRESOURCE, lpszdevicename : windows_sys::core::PCWSTR, dwmaxquorumlogsize : u32, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 458:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterResourceDependencyExpression(hresource : HRESOURCE, lpszdependencyexpression : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 459:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterResourceName(hresource : HRESOURCE, lpszresourcename : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 460:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterResourceNameEx(hresource : HRESOURCE, lpszresourcename : windows_sys::core::PCWSTR, lpszreason : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 461:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetClusterServiceAccountPassword(lpszclustername : windows_sys::core::PCWSTR, lpsznewpassword : windows_sys::core::PCWSTR, dwflags : u32, lpreturnstatusbuffer : *mut CLUSTER_SET_PASSWORD_STATUS, lpcbreturnstatusbuffersize : *mut u32) -> u32);

// UNSUPPORTED Rust 462:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetGroupDependencyExpression(hgroup : HGROUP, lpszdependencyexpression : windows_sys::core::PCWSTR) -> u32);

// UNSUPPORTED Rust 463:1: declaration Macro has no candidate rule
// windows_link::link!("clusapi.dll" "system" fn SetGroupDependencyExpressionEx(hgroup : HGROUP, lpszdependencyexpression : windows_sys::core::PCWSTR, lpszreason : windows_sys::core::PCWSTR) -> u32);

public const val `BitLockerDecrypted`: Int = 4;
public const val `BitLockerDecrypting`: Int = 16;
public const val `BitLockerEnabled`: Int = 1;
public const val `BitLockerPaused`: Int = 64;
public const val `BitLockerStopped`: Int = 128;
public const val `BitlockerEncrypted`: Int = 8;
public const val `BitlockerEncrypting`: Int = 32;
public const val `CA_UPGRADE_VERSION`: UInt = 1u;
public const val `CLCTL_ADD_CRYPTO_CHECKPOINT`: `CLCTL_CODES` = 4194478;
public const val `CLCTL_ADD_CRYPTO_CHECKPOINT_EX`: `CLCTL_CODES` = 4195030;
public const val `CLCTL_ADD_DEPENDENCY`: `CLCTL_CODES` = 5242898;
public const val `CLCTL_ADD_OWNER`: `CLCTL_CODES` = 5242906;
public const val `CLCTL_ADD_REGISTRY_CHECKPOINT`: `CLCTL_CODES` = 4194466;
public const val `CLCTL_ADD_REGISTRY_CHECKPOINT_32BIT`: `CLCTL_CODES` = 4194498;
public const val `CLCTL_ADD_REGISTRY_CHECKPOINT_64BIT`: `CLCTL_CODES` = 4194494;
public const val `CLCTL_BATCH_BLOCK_KEY`: `CLCTL_CODES` = 574;
public const val `CLCTL_BATCH_UNBLOCK_KEY`: `CLCTL_CODES` = 577;
public const val `CLCTL_BLOCK_GEM_SEND_RECV`: `CLCTL_CODES` = 717;
public const val `CLCTL_CHECK_DRAIN_VETO`: `CLCTL_CODES` = 1057069;
public const val `CLCTL_CHECK_VOTER_DOWN`: `CLCTL_CODES` = 73;
public const val `CLCTL_CHECK_VOTER_DOWN_WITNESS`: `CLCTL_CODES` = 113;
public const val `CLCTL_CHECK_VOTER_EVICT`: `CLCTL_CODES` = 69;
public const val `CLCTL_CHECK_VOTER_EVICT_WITNESS`: `CLCTL_CODES` = 109;
public const val `CLCTL_CLEAR_NODE_CONNECTION_INFO`: `CLCTL_CODES` = 4195078;
public const val `CLCTL_CLOUD_WITNESS_RESOURCE_TYPE_VALIDATE_CREDENTIALS`: `CLCTL_CODES` = 8417;
public const val `CLCTL_CLOUD_WITNESS_RESOURCE_TYPE_VALIDATE_CREDENTIALS_WITH_KEY`: `CLCTL_CODES` = 8433;
public const val `CLCTL_CLOUD_WITNESS_RESOURCE_UPDATE_KEY`: `CLCTL_CODES` = 4202742;
public const val `CLCTL_CLOUD_WITNESS_RESOURCE_UPDATE_TOKEN`: `CLCTL_CODES` = 4202726;
public const val `CLCTL_CLUSTER_BASE`: UInt = 0u;
public const val `CLCTL_CLUSTER_NAME_CHANGED`: `CLCTL_CODES` = 5242922;
public const val `CLCTL_CLUSTER_VERSION_CHANGED`: `CLCTL_CODES` = 5242926;
public typealias `CLCTL_CODES` = Int;
public const val `CLCTL_DELETE`: `CLCTL_CODES` = 5242886;
public const val `CLCTL_DELETE_CRYPTO_CHECKPOINT`: `CLCTL_CODES` = 4194482;
public const val `CLCTL_DELETE_REGISTRY_CHECKPOINT`: `CLCTL_CODES` = 4194470;
public const val `CLCTL_DISABLE_SHARED_VOLUME_DIRECTIO`: `CLCTL_CODES` = 4194958;
public const val `CLCTL_ENABLE_SHARED_VOLUME_DIRECTIO`: `CLCTL_CODES` = 4194954;
public const val `CLCTL_ENUM_AFFINITY_RULE_NAMES`: `CLCTL_CODES` = 11741;
public const val `CLCTL_ENUM_COMMON_PROPERTIES`: `CLCTL_CODES` = 81;
public const val `CLCTL_ENUM_PRIVATE_PROPERTIES`: `CLCTL_CODES` = 121;
public const val `CLCTL_EVICT_NODE`: `CLCTL_CODES` = 5242894;
public const val `CLCTL_FILESERVER_SHARE_ADD`: `CLCTL_CODES` = 4194886;
public const val `CLCTL_FILESERVER_SHARE_DEL`: `CLCTL_CODES` = 4194890;
public const val `CLCTL_FILESERVER_SHARE_MODIFY`: `CLCTL_CODES` = 4194894;
public const val `CLCTL_FILESERVER_SHARE_REPORT`: `CLCTL_CODES` = 593;
public const val `CLCTL_FIXUP_ON_UPGRADE`: `CLCTL_CODES` = 5242930;
public const val `CLCTL_FORCE_DB_FLUSH`: `CLCTL_CODES` = 4206054;
public const val `CLCTL_FORCE_QUORUM`: `CLCTL_CODES` = 5242950;
public const val `CLCTL_FSWITNESS_GET_EPOCH_INFO`: `CLCTL_CODES` = 1048669;
public const val `CLCTL_FSWITNESS_RELEASE_LOCK`: `CLCTL_CODES` = 5242982;
public const val `CLCTL_FSWITNESS_SET_EPOCH_INFO`: `CLCTL_CODES` = 5242978;
public const val `CLCTL_GET_ARB_TIMEOUT`: `CLCTL_CODES` = 21;
public const val `CLCTL_GET_CHARACTERISTICS`: `CLCTL_CODES` = 5;
public const val `CLCTL_GET_CLASS_INFO`: `CLCTL_CODES` = 13;
public const val `CLCTL_GET_CLUSDB_TIMESTAMP`: `CLCTL_CODES` = 681;
public const val `CLCTL_GET_CLUSTER_SERVICE_ACCOUNT_NAME`: `CLCTL_CODES` = 65;
public const val `CLCTL_GET_COMMON_PROPERTIES`: `CLCTL_CODES` = 89;
public const val `CLCTL_GET_COMMON_PROPERTY_FMTS`: `CLCTL_CODES` = 101;
public const val `CLCTL_GET_COMMON_RESOURCE_PROPERTY_FMTS`: `CLCTL_CODES` = 105;
public const val `CLCTL_GET_CRYPTO_CHECKPOINTS`: `CLCTL_CODES` = 181;
public const val `CLCTL_GET_DNS_NAME`: `CLCTL_CODES` = 373;
public const val `CLCTL_GET_FAILURE_INFO`: `CLCTL_CODES` = 25;
public const val `CLCTL_GET_FLAGS`: `CLCTL_CODES` = 9;
public const val `CLCTL_GET_FQDN`: `CLCTL_CODES` = 61;
public const val `CLCTL_GET_GEMID_VECTOR`: `CLCTL_CODES` = 721;
public const val `CLCTL_GET_GUM_LOCK_OWNER`: `CLCTL_CODES` = 697;
public const val `CLCTL_GET_ID`: `CLCTL_CODES` = 57;
public const val `CLCTL_GET_INFRASTRUCTURE_SOFS_BUFFER`: `CLCTL_CODES` = 11657;
public const val `CLCTL_GET_LOADBAL_PROCESS_LIST`: `CLCTL_CODES` = 201;
public const val `CLCTL_GET_NAME`: `CLCTL_CODES` = 41;
public const val `CLCTL_GET_NETWORK`: `CLCTL_CODES` = 53;
public const val `CLCTL_GET_NETWORK_NAME`: `CLCTL_CODES` = 361;
public const val `CLCTL_GET_NODE`: `CLCTL_CODES` = 49;
public const val `CLCTL_GET_NODES_IN_FD`: `CLCTL_CODES` = 11745;
public const val `CLCTL_GET_OPERATION_CONTEXT`: `CLCTL_CODES` = 1057001;
public const val `CLCTL_GET_PRIVATE_PROPERTIES`: `CLCTL_CODES` = 129;
public const val `CLCTL_GET_PRIVATE_PROPERTY_FMTS`: `CLCTL_CODES` = 141;
public const val `CLCTL_GET_PRIVATE_RESOURCE_PROPERTY_FMTS`: `CLCTL_CODES` = 145;
public const val `CLCTL_GET_REGISTRY_CHECKPOINTS`: `CLCTL_CODES` = 169;
public const val `CLCTL_GET_REQUIRED_DEPENDENCIES`: `CLCTL_CODES` = 17;
public const val `CLCTL_GET_RESOURCE_TYPE`: `CLCTL_CODES` = 45;
public const val `CLCTL_GET_RO_COMMON_PROPERTIES`: `CLCTL_CODES` = 85;
public const val `CLCTL_GET_RO_PRIVATE_PROPERTIES`: `CLCTL_CODES` = 125;
public const val `CLCTL_GET_SHARED_VOLUME_ID`: `CLCTL_CODES` = 657;
public const val `CLCTL_GET_STATE_CHANGE_TIME`: `CLCTL_CODES` = 11613;
public const val `CLCTL_GET_STORAGE_CONFIGURATION`: `CLCTL_CODES` = 741;
public const val `CLCTL_GET_STORAGE_CONFIG_ATTRIBUTES`: `CLCTL_CODES` = 745;
public const val `CLCTL_GET_STUCK_NODES`: `CLCTL_CODES` = 701;
public const val `CLCTL_GLOBAL_SHIFT`: UInt = 23u;
public const val `CLCTL_GROUPSET_GET_GROUPS`: `CLCTL_CODES` = 11633;
public const val `CLCTL_GROUPSET_GET_PROVIDER_GROUPS`: `CLCTL_CODES` = 11637;
public const val `CLCTL_GROUPSET_GET_PROVIDER_GROUPSETS`: `CLCTL_CODES` = 11641;
public const val `CLCTL_GROUP_GET_LAST_MOVE_TIME`: `CLCTL_CODES` = 729;
public const val `CLCTL_GROUP_GET_PROVIDER_GROUPS`: `CLCTL_CODES` = 11645;
public const val `CLCTL_GROUP_GET_PROVIDER_GROUPSETS`: `CLCTL_CODES` = 11649;
public const val `CLCTL_GROUP_SET_CCF_FROM_MASTER`: `CLCTL_CODES` = 4205958;
public const val `CLCTL_HOLD_IO`: `CLCTL_CODES` = 5242942;
public const val `CLCTL_INITIALIZE`: `CLCTL_CODES` = 5242954;
public const val `CLCTL_INJECT_GEM_FAULT`: `CLCTL_CODES` = 705;
public const val `CLCTL_INSTALL_NODE`: `CLCTL_CODES` = 5242890;
public const val `CLCTL_INTERNAL_SHIFT`: UInt = 20u;
public const val `CLCTL_INTRODUCE_GEM_REPAIR_DELAY`: `CLCTL_CODES` = 709;
public const val `CLCTL_IPADDRESS_RELEASE_LEASE`: `CLCTL_CODES` = 4194754;
public const val `CLCTL_IPADDRESS_RENEW_LEASE`: `CLCTL_CODES` = 4194750;
public const val `CLCTL_IS_FEATURE_INSTALLED`: `CLCTL_CODES` = 753;
public const val `CLCTL_IS_QUORUM_BLOCKED`: `CLCTL_CODES` = 689;
public const val `CLCTL_IS_S2D_FEATURE_SUPPORTED`: `CLCTL_CODES` = 757;
public const val `CLCTL_JOINING_GROUP`: `CLCTL_CODES` = 5242970;
public const val `CLCTL_LEAVING_GROUP`: `CLCTL_CODES` = 5242966;
public const val `CLCTL_MODIFY_SHIFT`: UInt = 22u;
public const val `CLCTL_NETNAME_CREDS_NOTIFYCAM`: `CLCTL_CODES` = 5242986;
public const val `CLCTL_NETNAME_DELETE_CO`: `CLCTL_CODES` = 382;
public const val `CLCTL_NETNAME_GET_OU_FOR_VCO`: `CLCTL_CODES` = 4194926;
public const val `CLCTL_NETNAME_GET_VIRTUAL_SERVER_TOKEN`: `CLCTL_CODES` = 365;
public const val `CLCTL_NETNAME_REGISTER_DNS_RECORDS`: `CLCTL_CODES` = 370;
public const val `CLCTL_NETNAME_REPAIR_VCO`: `CLCTL_CODES` = 397;
public const val `CLCTL_NETNAME_RESET_VCO`: `CLCTL_CODES` = 389;
public const val `CLCTL_NETNAME_SET_PWD_INFO`: `CLCTL_CODES` = 378;
public const val `CLCTL_NETNAME_SET_PWD_INFOEX`: `CLCTL_CODES` = 794;
public const val `CLCTL_NETNAME_VALIDATE_VCO`: `CLCTL_CODES` = 385;
public const val `CLCTL_NOTIFY_DRAIN_COMPLETE`: `CLCTL_CODES` = 1057073;
public const val `CLCTL_NOTIFY_INFRASTRUCTURE_SOFS_CHANGED`: `CLCTL_CODES` = 4205970;
public const val `CLCTL_NOTIFY_MONITOR_SHUTTING_DOWN`: `CLCTL_CODES` = 1048705;
public const val `CLCTL_NOTIFY_OWNER_CHANGE`: `CLCTL_CODES` = 5251362;
public const val `CLCTL_NOTIFY_QUORUM_STATUS`: `CLCTL_CODES` = 5243006;
public const val `CLCTL_POOL_GET_DRIVE_INFO`: `CLCTL_CODES` = 693;
public const val `CLCTL_PROVIDER_STATE_CHANGE`: `CLCTL_CODES` = 5242962;
public const val `CLCTL_QUERY_DELETE`: `CLCTL_CODES` = 441;
public const val `CLCTL_QUERY_MAINTENANCE_MODE`: `CLCTL_CODES` = 481;
public const val `CLCTL_RELOAD_AUTOLOGGER_CONFIG`: `CLCTL_CODES` = 11730;
public const val `CLCTL_REMOVE_DEPENDENCY`: `CLCTL_CODES` = 5242902;
public const val `CLCTL_REMOVE_NODE`: `CLCTL_CODES` = 4195054;
public const val `CLCTL_REMOVE_OWNER`: `CLCTL_CODES` = 5242910;
public const val `CLCTL_REPLICATION_ADD_REPLICATION_GROUP`: `CLCTL_CODES` = 8514;
public const val `CLCTL_REPLICATION_GET_ELIGIBLE_LOGDISKS`: `CLCTL_CODES` = 8521;
public const val `CLCTL_REPLICATION_GET_ELIGIBLE_SOURCE_DATADISKS`: `CLCTL_CODES` = 8529;
public const val `CLCTL_REPLICATION_GET_ELIGIBLE_TARGET_DATADISKS`: `CLCTL_CODES` = 8525;
public const val `CLCTL_REPLICATION_GET_LOG_INFO`: `CLCTL_CODES` = 8517;
public const val `CLCTL_REPLICATION_GET_LOG_VOLUME`: `CLCTL_CODES` = 8541;
public const val `CLCTL_REPLICATION_GET_REPLICATED_DISKS`: `CLCTL_CODES` = 8533;
public const val `CLCTL_REPLICATION_GET_REPLICATED_PARTITION_INFO`: `CLCTL_CODES` = 8549;
public const val `CLCTL_REPLICATION_GET_REPLICA_VOLUMES`: `CLCTL_CODES` = 8537;
public const val `CLCTL_REPLICATION_GET_RESOURCE_GROUP`: `CLCTL_CODES` = 8545;
public const val `CLCTL_RESOURCE_PREPARE_UPGRADE`: `CLCTL_CODES` = 4202730;
public const val `CLCTL_RESOURCE_UPGRADE_COMPLETED`: `CLCTL_CODES` = 4202734;
public const val `CLCTL_RESOURCE_UPGRADE_DLL`: `CLCTL_CODES` = 4194490;
public const val `CLCTL_RESUME_IO`: `CLCTL_CODES` = 5242946;
public const val `CLCTL_RW_MODIFY_NOOP`: `CLCTL_CODES` = 4194990;
public const val `CLCTL_SCALEOUT_COMMAND`: `CLCTL_CODES` = 4205974;
public const val `CLCTL_SCALEOUT_CONTROL`: `CLCTL_CODES` = 4205978;
public const val `CLCTL_SCALEOUT_GET_CLUSTERS`: `CLCTL_CODES` = 4205981;
public const val `CLCTL_SEND_DUMMY_GEM_MESSAGES`: `CLCTL_CODES` = 713;
public const val `CLCTL_SET_ACCOUNT_ACCESS`: `CLCTL_CODES` = 4194546;
public const val `CLCTL_SET_CLUSTER_S2D_CACHE_METADATA_RESERVE_BYTES`: `CLCTL_CODES` = 4205934;
public const val `CLCTL_SET_CLUSTER_S2D_ENABLED`: `CLCTL_CODES` = 4205922;
public const val `CLCTL_SET_COMMON_PROPERTIES`: `CLCTL_CODES` = 4194398;
public const val `CLCTL_SET_CSV_MAINTENANCE_MODE`: `CLCTL_CODES` = 4194966;
public const val `CLCTL_SET_DNS_DOMAIN`: `CLCTL_CODES` = 4195082;
public const val `CLCTL_SET_INFRASTRUCTURE_SOFS_BUFFER`: `CLCTL_CODES` = 4205966;
public const val `CLCTL_SET_MAINTENANCE_MODE`: `CLCTL_CODES` = 4194790;
public const val `CLCTL_SET_NAME`: `CLCTL_CODES` = 5242918;
public const val `CLCTL_SET_PRIVATE_PROPERTIES`: `CLCTL_CODES` = 4194438;
public const val `CLCTL_SET_SHARED_VOLUME_BACKUP_MODE`: `CLCTL_CODES` = 4194970;
public const val `CLCTL_SET_STORAGE_CONFIGURATION`: `CLCTL_CODES` = 4195042;
public const val `CLCTL_SHUTDOWN`: `CLCTL_CODES` = 77;
public const val `CLCTL_STARTING_PHASE1`: `CLCTL_CODES` = 5242934;
public const val `CLCTL_STARTING_PHASE2`: `CLCTL_CODES` = 5242938;
public const val `CLCTL_STATE_CHANGE_REASON`: `CLCTL_CODES` = 5242958;
public const val `CLCTL_STORAGE_GET_AVAILABLE_DISKS`: `CLCTL_CODES` = 405;
public const val `CLCTL_STORAGE_GET_AVAILABLE_DISKS_EX`: `CLCTL_CODES` = 501;
public const val `CLCTL_STORAGE_GET_AVAILABLE_DISKS_EX2_INT`: `CLCTL_CODES` = 8161;
public const val `CLCTL_STORAGE_GET_CLUSBFLT_PATHINFO`: `CLCTL_CODES` = 769;
public const val `CLCTL_STORAGE_GET_CLUSBFLT_PATHS`: `CLCTL_CODES` = 765;
public const val `CLCTL_STORAGE_GET_CLUSPORT_DISK_COUNT`: `CLCTL_CODES` = 509;
public const val `CLCTL_STORAGE_GET_DIRTY`: `CLCTL_CODES` = 537;
public const val `CLCTL_STORAGE_GET_DISKID`: `CLCTL_CODES` = 517;
public const val `CLCTL_STORAGE_GET_DISK_INFO`: `CLCTL_CODES` = 401;
public const val `CLCTL_STORAGE_GET_DISK_INFO_EX`: `CLCTL_CODES` = 497;
public const val `CLCTL_STORAGE_GET_DISK_INFO_EX2`: `CLCTL_CODES` = 505;
public const val `CLCTL_STORAGE_GET_DISK_NUMBER_INFO`: `CLCTL_CODES` = 417;
public const val `CLCTL_STORAGE_GET_DRIVELETTERS`: `CLCTL_CODES` = 493;
public const val `CLCTL_STORAGE_GET_MOUNTPOINTS`: `CLCTL_CODES` = 529;
public const val `CLCTL_STORAGE_GET_PHYSICAL_DISK_INFO`: `CLCTL_CODES` = 761;
public const val `CLCTL_STORAGE_GET_RESOURCEID`: `CLCTL_CODES` = 557;
public const val `CLCTL_STORAGE_GET_SHARED_VOLUME_INFO`: `CLCTL_CODES` = 549;
public const val `CLCTL_STORAGE_GET_SHARED_VOLUME_PARTITION_NAMES`: `CLCTL_CODES` = 669;
public const val `CLCTL_STORAGE_GET_SHARED_VOLUME_STATES`: `CLCTL_CODES` = 4194978;
public const val `CLCTL_STORAGE_IS_CLUSTERABLE`: `CLCTL_CODES` = 521;
public const val `CLCTL_STORAGE_IS_CSV_FILE`: `CLCTL_CODES` = 553;
public const val `CLCTL_STORAGE_IS_PATH_VALID`: `CLCTL_CODES` = 409;
public const val `CLCTL_STORAGE_IS_SHARED_VOLUME`: `CLCTL_CODES` = 677;
public const val `CLCTL_STORAGE_REMAP_DRIVELETTER`: `CLCTL_CODES` = 513;
public const val `CLCTL_STORAGE_REMOVE_VM_OWNERSHIP`: `CLCTL_CODES` = 4194830;
public const val `CLCTL_STORAGE_RENAME_SHARED_VOLUME`: `CLCTL_CODES` = 11734;
public const val `CLCTL_STORAGE_RENAME_SHARED_VOLUME_GUID`: `CLCTL_CODES` = 11738;
public const val `CLCTL_STORAGE_SET_DRIVELETTER`: `CLCTL_CODES` = 4194794;
public const val `CLCTL_STORAGE_SYNC_CLUSDISK_DB`: `CLCTL_CODES` = 4194718;
public const val `CLCTL_UNDELETE`: `CLCTL_CODES` = 5243014;
public const val `CLCTL_UNKNOWN`: `CLCTL_CODES` = 0;
public const val `CLCTL_USER_SHIFT`: UInt = 21u;
public const val `CLCTL_VALIDATE_CHANGE_GROUP`: `CLCTL_CODES` = 1057061;
public const val `CLCTL_VALIDATE_COMMON_PROPERTIES`: `CLCTL_CODES` = 97;
public const val `CLCTL_VALIDATE_DIRECTORY`: `CLCTL_CODES` = 569;
public const val `CLCTL_VALIDATE_NETNAME`: `CLCTL_CODES` = 565;
public const val `CLCTL_VALIDATE_PATH`: `CLCTL_CODES` = 561;
public const val `CLCTL_VALIDATE_PRIVATE_PROPERTIES`: `CLCTL_CODES` = 137;
// UNSUPPORTED Rust 670:1: non-scalar type Ptr unsupported
// pub const CLOUD_WITNESS_CONTAINER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("msft-cloud-witness");

// UNSUPPORTED Rust 671:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLRES_CALLBACK_FUNCTION_TABLE {
//     pub LogEvent: PLOG_EVENT_ROUTINE,
//     pub SetResourceStatusEx: PSET_RESOURCE_STATUS_ROUTINE_EX,
//     pub SetResourceLockedMode: PSET_RESOURCE_LOCKED_MODE_ROUTINE,
//     pub SignalFailure: PSIGNAL_FAILURE_ROUTINE,
//     pub SetResourceInMemoryNodeLocalProperties: PSET_RESOURCE_INMEMORY_NODELOCAL_PROPERTIES_ROUTINE,
//     pub EndControlCall: PEND_CONTROL_CALL,
//     pub EndTypeControlCall: PEND_TYPE_CONTROL_CALL,
//     pub ExtendControlCall: PEXTEND_RES_CONTROL_CALL,
//     pub ExtendTypeControlCall: PEXTEND_RES_TYPE_CONTROL_CALL,
//     pub RaiseResTypeNotification: PRAISE_RES_TYPE_NOTIFICATION,
//     pub ChangeResourceProcessForDumps: PCHANGE_RESOURCE_PROCESS_FOR_DUMPS,
//     pub ChangeResTypeProcessForDumps: PCHANGE_RES_TYPE_PROCESS_FOR_DUMPS,
//     pub SetInternalState: PSET_INTERNAL_STATE,
//     pub SetResourceLockedModeEx: PSET_RESOURCE_LOCKED_MODE_EX_ROUTINE,
//     pub RequestDump: PREQUEST_DUMP_ROUTINE,
//     pub SetResourceWprPolicy: PSET_RESOURCE_WPR_POLICY_ROUTINE,
//     pub ArmWprWatchdogForCurrentResourceCall: PARM_WPR_WATCHDOG_FOR_CURRENT_RESOURCE_CALL_ROUTINE,
// }

// UNSUPPORTED Rust 692:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Registry")]
// #[derive(Clone, Copy)]
// pub struct CLRES_FUNCTION_TABLE {
//     pub TableSize: u32,
//     pub Version: u32,
//     pub Anonymous: CLRES_FUNCTION_TABLE_0,
// }

// UNSUPPORTED Rust 700:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// impl Default for CLRES_FUNCTION_TABLE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 706:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Registry")]
// #[derive(Clone, Copy)]
// pub union CLRES_FUNCTION_TABLE_0 {
//     pub V1Functions: CLRES_V1_FUNCTIONS,
//     pub V2Functions: CLRES_V2_FUNCTIONS,
//     pub V3Functions: CLRES_V3_FUNCTIONS,
//     pub V4Functions: CLRES_V4_FUNCTIONS,
// }

// UNSUPPORTED Rust 715:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_System_Registry")]
// impl Default for CLRES_FUNCTION_TABLE_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 721:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Registry")]
// #[derive(Clone, Copy, Default)]
// pub struct CLRES_V1_FUNCTIONS {
//     pub Open: POPEN_ROUTINE,
//     pub Close: PCLOSE_ROUTINE,
//     pub Online: PONLINE_ROUTINE,
//     pub Offline: POFFLINE_ROUTINE,
//     pub Terminate: PTERMINATE_ROUTINE,
//     pub LooksAlive: PLOOKS_ALIVE_ROUTINE,
//     pub IsAlive: PIS_ALIVE_ROUTINE,
//     pub Arbitrate: PARBITRATE_ROUTINE,
//     pub Release: PRELEASE_ROUTINE,
//     pub ResourceControl: PRESOURCE_CONTROL_ROUTINE,
//     pub ResourceTypeControl: PRESOURCE_TYPE_CONTROL_ROUTINE,
// }

// UNSUPPORTED Rust 737:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Registry")]
// #[derive(Clone, Copy, Default)]
// pub struct CLRES_V2_FUNCTIONS {
//     pub Open: POPEN_V2_ROUTINE,
//     pub Close: PCLOSE_ROUTINE,
//     pub Online: PONLINE_V2_ROUTINE,
//     pub Offline: POFFLINE_V2_ROUTINE,
//     pub Terminate: PTERMINATE_ROUTINE,
//     pub LooksAlive: PLOOKS_ALIVE_ROUTINE,
//     pub IsAlive: PIS_ALIVE_ROUTINE,
//     pub Arbitrate: PARBITRATE_ROUTINE,
//     pub Release: PRELEASE_ROUTINE,
//     pub ResourceControl: PRESOURCE_CONTROL_ROUTINE,
//     pub ResourceTypeControl: PRESOURCE_TYPE_CONTROL_ROUTINE,
//     pub Cancel: PCANCEL_ROUTINE,
// }

// UNSUPPORTED Rust 754:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Registry")]
// #[derive(Clone, Copy, Default)]
// pub struct CLRES_V3_FUNCTIONS {
//     pub Open: POPEN_V2_ROUTINE,
//     pub Close: PCLOSE_ROUTINE,
//     pub Online: PONLINE_V2_ROUTINE,
//     pub Offline: POFFLINE_V2_ROUTINE,
//     pub Terminate: PTERMINATE_ROUTINE,
//     pub LooksAlive: PLOOKS_ALIVE_ROUTINE,
//     pub IsAlive: PIS_ALIVE_ROUTINE,
//     pub Arbitrate: PARBITRATE_ROUTINE,
//     pub Release: PRELEASE_ROUTINE,
//     pub BeginResourceControl: PBEGIN_RESCALL_ROUTINE,
//     pub BeginResourceTypeControl: PBEGIN_RESTYPECALL_ROUTINE,
//     pub Cancel: PCANCEL_ROUTINE,
// }

// UNSUPPORTED Rust 771:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_System_Registry")]
// #[derive(Clone, Copy, Default)]
// pub struct CLRES_V4_FUNCTIONS {
//     pub Open: POPEN_V2_ROUTINE,
//     pub Close: PCLOSE_ROUTINE,
//     pub Online: PONLINE_V2_ROUTINE,
//     pub Offline: POFFLINE_V2_ROUTINE,
//     pub Terminate: PTERMINATE_ROUTINE,
//     pub LooksAlive: PLOOKS_ALIVE_ROUTINE,
//     pub IsAlive: PIS_ALIVE_ROUTINE,
//     pub Arbitrate: PARBITRATE_ROUTINE,
//     pub Release: PRELEASE_ROUTINE,
//     pub BeginResourceControl: PBEGIN_RESCALL_ROUTINE,
//     pub BeginResourceTypeControl: PBEGIN_RESTYPECALL_ROUTINE,
//     pub Cancel: PCANCEL_ROUTINE,
//     pub BeginResourceControlAsUser: PBEGIN_RESCALL_AS_USER_ROUTINE,
//     pub BeginResourceTypeControlAsUser: PBEGIN_RESTYPECALL_AS_USER_ROUTINE,
// }

public const val `CLRES_VERSION_V1_00`: UInt = 256u;
public const val `CLRES_VERSION_V2_00`: UInt = 512u;
public const val `CLRES_VERSION_V3_00`: UInt = 768u;
public const val `CLRES_VERSION_V4_00`: UInt = 1024u;
public typealias `CLUADMEX_OBJECT_TYPE` = Int;
public const val `CLUADMEX_OT_CLUSTER`: `CLUADMEX_OBJECT_TYPE` = 1;
public const val `CLUADMEX_OT_GROUP`: `CLUADMEX_OBJECT_TYPE` = 3;
public const val `CLUADMEX_OT_NETINTERFACE`: `CLUADMEX_OBJECT_TYPE` = 7;
public const val `CLUADMEX_OT_NETWORK`: `CLUADMEX_OBJECT_TYPE` = 6;
public const val `CLUADMEX_OT_NODE`: `CLUADMEX_OBJECT_TYPE` = 2;
public const val `CLUADMEX_OT_NONE`: `CLUADMEX_OBJECT_TYPE` = 0;
public const val `CLUADMEX_OT_RESOURCE`: `CLUADMEX_OBJECT_TYPE` = 4;
public const val `CLUADMEX_OT_RESOURCETYPE`: `CLUADMEX_OBJECT_TYPE` = 5;
public const val `CLUSAPI_CHANGE_ACCESS`: Int = 2;
public const val `CLUSAPI_CHANGE_RESOURCE_GROUP_FORCE_MOVE_TO_CSV`: ULong = 1uL;
public const val `CLUSAPI_GROUP_MOVE_FAILBACK`: UInt = 16u;
public const val `CLUSAPI_GROUP_MOVE_HIGH_PRIORITY_START`: UInt = 8u;
public const val `CLUSAPI_GROUP_MOVE_IGNORE_AFFINITY_RULE`: UInt = 32u;
public const val `CLUSAPI_GROUP_MOVE_IGNORE_RESOURCE_STATUS`: UInt = 1u;
public const val `CLUSAPI_GROUP_MOVE_QUEUE_ENABLED`: UInt = 4u;
public const val `CLUSAPI_GROUP_MOVE_RETURN_TO_SOURCE_NODE_ON_ERROR`: UInt = 2u;
public const val `CLUSAPI_GROUP_OFFLINE_IGNORE_RESOURCE_STATUS`: UInt = 1u;
public const val `CLUSAPI_GROUP_ONLINE_BEST_POSSIBLE_NODE`: UInt = 4u;
public const val `CLUSAPI_GROUP_ONLINE_IGNORE_AFFINITY_RULE`: UInt = 8u;
public const val `CLUSAPI_GROUP_ONLINE_IGNORE_RESOURCE_STATUS`: UInt = 1u;
public const val `CLUSAPI_GROUP_ONLINE_SYNCHRONOUS`: UInt = 2u;
public const val `CLUSAPI_NODE_AVOID_PLACEMENT`: UInt = 2u;
public const val `CLUSAPI_NODE_PAUSE_REMAIN_ON_PAUSED_NODE_ON_MOVE_ERROR`: UInt = 1u;
public const val `CLUSAPI_NODE_PAUSE_RETRY_DRAIN_ON_FAILURE`: UInt = 4u;
public const val `CLUSAPI_NODE_RESUME_FAILBACK_PINNED_VMS_ONLY`: UInt = 4u;
public const val `CLUSAPI_NODE_RESUME_FAILBACK_STORAGE`: UInt = 1u;
public const val `CLUSAPI_NODE_RESUME_FAILBACK_VMS`: UInt = 2u;
public const val `CLUSAPI_NO_ACCESS`: Int = 4;
public const val `CLUSAPI_READ_ACCESS`: Int = 1;
// UNSUPPORTED Rust 824:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSAPI_REASON_HANDLER {
//     pub lpParameter: *mut core::ffi::c_void,
//     pub pfnHandler: PCLUSAPI_PFN_REASON_HANDLER,
// }

// UNSUPPORTED Rust 830:1: declaration Impl has no candidate rule
// impl Default for CLUSAPI_REASON_HANDLER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLUSAPI_RESOURCE_OFFLINE_DO_NOT_UPDATE_PERSISTENT_STATE`: UInt = 4u;
public const val `CLUSAPI_RESOURCE_OFFLINE_FORCE_WITH_TERMINATION`: UInt = 2u;
public const val `CLUSAPI_RESOURCE_OFFLINE_IGNORE_RESOURCE_STATUS`: UInt = 1u;
public const val `CLUSAPI_RESOURCE_OFFLINE_REASON_BEING_DELETED`: UInt = 8u;
public const val `CLUSAPI_RESOURCE_OFFLINE_REASON_BEING_RESTARTED`: UInt = 16u;
public const val `CLUSAPI_RESOURCE_OFFLINE_REASON_MOVING`: UInt = 2u;
public const val `CLUSAPI_RESOURCE_OFFLINE_REASON_NONE`: UInt = 0u;
public const val `CLUSAPI_RESOURCE_OFFLINE_REASON_PREEMPTED`: UInt = 32u;
public const val `CLUSAPI_RESOURCE_OFFLINE_REASON_SHUTTING_DOWN`: UInt = 64u;
public const val `CLUSAPI_RESOURCE_OFFLINE_REASON_UNKNOWN`: UInt = 1u;
public const val `CLUSAPI_RESOURCE_OFFLINE_REASON_USER_REQUESTED`: UInt = 4u;
public const val `CLUSAPI_RESOURCE_ONLINE_BEST_POSSIBLE_NODE`: UInt = 8u;
public const val `CLUSAPI_RESOURCE_ONLINE_DO_NOT_UPDATE_PERSISTENT_STATE`: UInt = 2u;
public const val `CLUSAPI_RESOURCE_ONLINE_IGNORE_AFFINITY_RULE`: UInt = 32u;
public const val `CLUSAPI_RESOURCE_ONLINE_IGNORE_RESOURCE_STATUS`: UInt = 1u;
public const val `CLUSAPI_RESOURCE_ONLINE_NECESSARY_FOR_QUORUM`: UInt = 4u;
public const val `CLUSAPI_VALID_CHANGE_RESOURCE_GROUP_FLAGS`: ULong = 1uL;
public const val `CLUSAPI_VERSION`: UInt = 2572u;
public const val `CLUSAPI_VERSION_NI`: UInt = 2572u;
public const val `CLUSAPI_VERSION_RS3`: UInt = 2560u;
public const val `CLUSAPI_VERSION_SERVER2008`: UInt = 1536u;
public const val `CLUSAPI_VERSION_SERVER2008R2`: UInt = 1792u;
public const val `CLUSAPI_VERSION_WINDOWS8`: UInt = 1793u;
public const val `CLUSAPI_VERSION_WINDOWSBLUE`: UInt = 1794u;
public const val `CLUSAPI_VERSION_WINTHRESHOLD`: UInt = 1795u;
public const val `CLUSCTL_ACCESS_MODE_MASK`: UInt = 3u;
public const val `CLUSCTL_ACCESS_SHIFT`: UInt = 0u;
public typealias `CLUSCTL_AFFINITYRULE_CODES` = Int;
public const val `CLUSCTL_AFFINITYRULE_GET_COMMON_PROPERTIES`: `CLUSCTL_AFFINITYRULE_CODES` = 150995033;
public const val `CLUSCTL_AFFINITYRULE_GET_GROUPNAMES`: `CLUSCTL_AFFINITYRULE_CODES` = 151006577;
public const val `CLUSCTL_AFFINITYRULE_GET_ID`: `CLUSCTL_AFFINITYRULE_CODES` = 150995001;
public const val `CLUSCTL_AFFINITYRULE_GET_RO_COMMON_PROPERTIES`: `CLUSCTL_AFFINITYRULE_CODES` = 150995029;
public const val `CLUSCTL_AFFINITYRULE_SET_COMMON_PROPERTIES`: `CLUSCTL_AFFINITYRULE_CODES` = 155189342;
public const val `CLUSCTL_CLOUD_WITNESS_RESOURCE_TYPE_VALIDATE_CREDENTIALS`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33562849;
public const val `CLUSCTL_CLOUD_WITNESS_RESOURCE_TYPE_VALIDATE_CREDENTIALS_WITH_KEY`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33562865;
public const val `CLUSCTL_CLOUD_WITNESS_RESOURCE_UPDATE_KEY`: `CLUSCTL_RESOURCE_CODES` = 20979958;
public const val `CLUSCTL_CLOUD_WITNESS_RESOURCE_UPDATE_TOKEN`: `CLUSCTL_RESOURCE_CODES` = 20979942;
public const val `CLUSCTL_CLUSTER_BATCH_BLOCK_KEY`: `CLUSCTL_CLUSTER_CODES` = 117441086;
public const val `CLUSCTL_CLUSTER_BATCH_UNBLOCK_KEY`: `CLUSCTL_CLUSTER_CODES` = 117441089;
public const val `CLUSCTL_CLUSTER_CHECK_VOTER_DOWN`: `CLUSCTL_CLUSTER_CODES` = 117440585;
public const val `CLUSCTL_CLUSTER_CHECK_VOTER_DOWN_WITNESS`: `CLUSCTL_CLUSTER_CODES` = 117440625;
public const val `CLUSCTL_CLUSTER_CHECK_VOTER_EVICT`: `CLUSCTL_CLUSTER_CODES` = 117440581;
public const val `CLUSCTL_CLUSTER_CHECK_VOTER_EVICT_WITNESS`: `CLUSCTL_CLUSTER_CODES` = 117440621;
public const val `CLUSCTL_CLUSTER_CLEAR_NODE_CONNECTION_INFO`: `CLUSCTL_CLUSTER_CODES` = 121635590;
public typealias `CLUSCTL_CLUSTER_CODES` = Int;
public const val `CLUSCTL_CLUSTER_ENUM_AFFINITY_RULE_NAMES`: `CLUSCTL_CLUSTER_CODES` = 117452253;
public const val `CLUSCTL_CLUSTER_ENUM_COMMON_PROPERTIES`: `CLUSCTL_CLUSTER_CODES` = 117440593;
public const val `CLUSCTL_CLUSTER_ENUM_PRIVATE_PROPERTIES`: `CLUSCTL_CLUSTER_CODES` = 117440633;
public const val `CLUSCTL_CLUSTER_FORCE_FLUSH_DB`: `CLUSCTL_CLUSTER_CODES` = 121646566;
public const val `CLUSCTL_CLUSTER_GET_CLMUSR_TOKEN`: `CLUSCTL_CLUSTER_CODES` = 117440877;
public const val `CLUSCTL_CLUSTER_GET_CLUSDB_TIMESTAMP`: `CLUSCTL_CLUSTER_CODES` = 117441193;
public const val `CLUSCTL_CLUSTER_GET_COMMON_PROPERTIES`: `CLUSCTL_CLUSTER_CODES` = 117440601;
public const val `CLUSCTL_CLUSTER_GET_COMMON_PROPERTY_FMTS`: `CLUSCTL_CLUSTER_CODES` = 117440613;
public const val `CLUSCTL_CLUSTER_GET_FQDN`: `CLUSCTL_CLUSTER_CODES` = 117440573;
public const val `CLUSCTL_CLUSTER_GET_GUM_LOCK_OWNER`: `CLUSCTL_CLUSTER_CODES` = 117441209;
public const val `CLUSCTL_CLUSTER_GET_NODES_IN_FD`: `CLUSCTL_CLUSTER_CODES` = 117452257;
public const val `CLUSCTL_CLUSTER_GET_PRIVATE_PROPERTIES`: `CLUSCTL_CLUSTER_CODES` = 117440641;
public const val `CLUSCTL_CLUSTER_GET_PRIVATE_PROPERTY_FMTS`: `CLUSCTL_CLUSTER_CODES` = 117440653;
public const val `CLUSCTL_CLUSTER_GET_RO_COMMON_PROPERTIES`: `CLUSCTL_CLUSTER_CODES` = 117440597;
public const val `CLUSCTL_CLUSTER_GET_RO_PRIVATE_PROPERTIES`: `CLUSCTL_CLUSTER_CODES` = 117440637;
public const val `CLUSCTL_CLUSTER_GET_SHARED_VOLUME_ID`: `CLUSCTL_CLUSTER_CODES` = 117441169;
public const val `CLUSCTL_CLUSTER_GET_STORAGE_CONFIGURATION`: `CLUSCTL_CLUSTER_CODES` = 117441253;
public const val `CLUSCTL_CLUSTER_GET_STORAGE_CONFIG_ATTRIBUTES`: `CLUSCTL_CLUSTER_CODES` = 117441257;
public const val `CLUSCTL_CLUSTER_RELOAD_AUTOLOGGER_CONFIG`: `CLUSCTL_CLUSTER_CODES` = 117452242;
public const val `CLUSCTL_CLUSTER_REMOVE_NODE`: `CLUSCTL_CLUSTER_CODES` = 121635566;
public const val `CLUSCTL_CLUSTER_SET_ACCOUNT_ACCESS`: `CLUSCTL_CLUSTER_CODES` = 121635058;
public const val `CLUSCTL_CLUSTER_SET_CLUSTER_S2D_CACHE_METADATA_RESERVE_BYTES`: `CLUSCTL_CLUSTER_CODES` = 121646446;
public const val `CLUSCTL_CLUSTER_SET_CLUSTER_S2D_ENABLED`: `CLUSCTL_CLUSTER_CODES` = 121646434;
public const val `CLUSCTL_CLUSTER_SET_COMMON_PROPERTIES`: `CLUSCTL_CLUSTER_CODES` = 121634910;
public const val `CLUSCTL_CLUSTER_SET_DNS_DOMAIN`: `CLUSCTL_CLUSTER_CODES` = 121635594;
public const val `CLUSCTL_CLUSTER_SET_PRIVATE_PROPERTIES`: `CLUSCTL_CLUSTER_CODES` = 121634950;
public const val `CLUSCTL_CLUSTER_SET_STORAGE_CONFIGURATION`: `CLUSCTL_CLUSTER_CODES` = 121635554;
public const val `CLUSCTL_CLUSTER_SHUTDOWN`: `CLUSCTL_CLUSTER_CODES` = 117440589;
public const val `CLUSCTL_CLUSTER_STORAGE_RENAME_SHARED_VOLUME`: `CLUSCTL_CLUSTER_CODES` = 117452246;
public const val `CLUSCTL_CLUSTER_STORAGE_RENAME_SHARED_VOLUME_GUID`: `CLUSCTL_CLUSTER_CODES` = 117452250;
public const val `CLUSCTL_CLUSTER_UNKNOWN`: `CLUSCTL_CLUSTER_CODES` = 117440512;
public const val `CLUSCTL_CLUSTER_VALIDATE_COMMON_PROPERTIES`: `CLUSCTL_CLUSTER_CODES` = 117440609;
public const val `CLUSCTL_CLUSTER_VALIDATE_PRIVATE_PROPERTIES`: `CLUSCTL_CLUSTER_CODES` = 117440649;
public const val `CLUSCTL_CONTROL_CODE_MASK`: UInt = 4194303u;
public const val `CLUSCTL_FUNCTION_SHIFT`: UInt = 2u;
public const val `CLUSCTL_GET_OPERATION_CONTEXT_PARAMS_VERSION_1`: UInt = 1u;
public typealias `CLUSCTL_GROUPSET_CODES` = Int;
public const val `CLUSCTL_GROUPSET_GET_COMMON_PROPERTIES`: `CLUSCTL_GROUPSET_CODES` = 134217817;
public const val `CLUSCTL_GROUPSET_GET_GROUPS`: `CLUSCTL_GROUPSET_CODES` = 134229361;
public const val `CLUSCTL_GROUPSET_GET_ID`: `CLUSCTL_GROUPSET_CODES` = 134217785;
public const val `CLUSCTL_GROUPSET_GET_PROVIDER_GROUPS`: `CLUSCTL_GROUPSET_CODES` = 134229365;
public const val `CLUSCTL_GROUPSET_GET_PROVIDER_GROUPSETS`: `CLUSCTL_GROUPSET_CODES` = 134229369;
public const val `CLUSCTL_GROUPSET_GET_RO_COMMON_PROPERTIES`: `CLUSCTL_GROUPSET_CODES` = 134217813;
public const val `CLUSCTL_GROUPSET_SET_COMMON_PROPERTIES`: `CLUSCTL_GROUPSET_CODES` = 138412126;
public typealias `CLUSCTL_GROUP_CODES` = Int;
public const val `CLUSCTL_GROUP_ENUM_COMMON_PROPERTIES`: `CLUSCTL_GROUP_CODES` = 50331729;
public const val `CLUSCTL_GROUP_ENUM_PRIVATE_PROPERTIES`: `CLUSCTL_GROUP_CODES` = 50331769;
public const val `CLUSCTL_GROUP_GET_CHARACTERISTICS`: `CLUSCTL_GROUP_CODES` = 50331653;
public const val `CLUSCTL_GROUP_GET_COMMON_PROPERTIES`: `CLUSCTL_GROUP_CODES` = 50331737;
public const val `CLUSCTL_GROUP_GET_COMMON_PROPERTY_FMTS`: `CLUSCTL_GROUP_CODES` = 50331749;
public const val `CLUSCTL_GROUP_GET_FAILURE_INFO`: `CLUSCTL_GROUP_CODES` = 50331673;
public const val `CLUSCTL_GROUP_GET_FLAGS`: `CLUSCTL_GROUP_CODES` = 50331657;
public const val `CLUSCTL_GROUP_GET_ID`: `CLUSCTL_GROUP_CODES` = 50331705;
public const val `CLUSCTL_GROUP_GET_LAST_MOVE_TIME`: `CLUSCTL_GROUP_CODES` = 50332377;
// UNSUPPORTED Rust 934:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUSCTL_GROUP_GET_LAST_MOVE_TIME_OUTPUT {
//     pub GetTickCount64: u64,
//     pub GetSystemTime: super::super::Foundation::SYSTEMTIME,
//     pub NodeId: u32,
// }

public const val `CLUSCTL_GROUP_GET_NAME`: `CLUSCTL_GROUP_CODES` = 50331689;
public const val `CLUSCTL_GROUP_GET_PRIVATE_PROPERTIES`: `CLUSCTL_GROUP_CODES` = 50331777;
public const val `CLUSCTL_GROUP_GET_PRIVATE_PROPERTY_FMTS`: `CLUSCTL_GROUP_CODES` = 50331789;
public const val `CLUSCTL_GROUP_GET_PROVIDER_GROUPS`: `CLUSCTL_GROUPSET_CODES` = 134229373;
public const val `CLUSCTL_GROUP_GET_PROVIDER_GROUPSETS`: `CLUSCTL_GROUPSET_CODES` = 134229377;
public const val `CLUSCTL_GROUP_GET_RO_COMMON_PROPERTIES`: `CLUSCTL_GROUP_CODES` = 50331733;
public const val `CLUSCTL_GROUP_GET_RO_PRIVATE_PROPERTIES`: `CLUSCTL_GROUP_CODES` = 50331773;
public const val `CLUSCTL_GROUP_QUERY_DELETE`: `CLUSCTL_GROUP_CODES` = 50332089;
public const val `CLUSCTL_GROUP_SET_CCF_FROM_MASTER`: `CLUSCTL_GROUP_CODES` = 54537606;
public const val `CLUSCTL_GROUP_SET_COMMON_PROPERTIES`: `CLUSCTL_GROUP_CODES` = 54526046;
public const val `CLUSCTL_GROUP_SET_PRIVATE_PROPERTIES`: `CLUSCTL_GROUP_CODES` = 54526086;
public const val `CLUSCTL_GROUP_UNKNOWN`: `CLUSCTL_GROUP_CODES` = 50331648;
public const val `CLUSCTL_GROUP_VALIDATE_COMMON_PROPERTIES`: `CLUSCTL_GROUP_CODES` = 50331745;
public const val `CLUSCTL_GROUP_VALIDATE_PRIVATE_PROPERTIES`: `CLUSCTL_GROUP_CODES` = 50331785;
public typealias `CLUSCTL_NETINTERFACE_CODES` = Int;
public const val `CLUSCTL_NETINTERFACE_ENUM_COMMON_PROPERTIES`: `CLUSCTL_NETINTERFACE_CODES` = 100663377;
public const val `CLUSCTL_NETINTERFACE_ENUM_PRIVATE_PROPERTIES`: `CLUSCTL_NETINTERFACE_CODES` = 100663417;
public const val `CLUSCTL_NETINTERFACE_GET_CHARACTERISTICS`: `CLUSCTL_NETINTERFACE_CODES` = 100663301;
public const val `CLUSCTL_NETINTERFACE_GET_COMMON_PROPERTIES`: `CLUSCTL_NETINTERFACE_CODES` = 100663385;
public const val `CLUSCTL_NETINTERFACE_GET_COMMON_PROPERTY_FMTS`: `CLUSCTL_NETINTERFACE_CODES` = 100663397;
public const val `CLUSCTL_NETINTERFACE_GET_FLAGS`: `CLUSCTL_NETINTERFACE_CODES` = 100663305;
public const val `CLUSCTL_NETINTERFACE_GET_ID`: `CLUSCTL_NETINTERFACE_CODES` = 100663353;
public const val `CLUSCTL_NETINTERFACE_GET_NAME`: `CLUSCTL_NETINTERFACE_CODES` = 100663337;
public const val `CLUSCTL_NETINTERFACE_GET_NETWORK`: `CLUSCTL_NETINTERFACE_CODES` = 100663349;
public const val `CLUSCTL_NETINTERFACE_GET_NODE`: `CLUSCTL_NETINTERFACE_CODES` = 100663345;
public const val `CLUSCTL_NETINTERFACE_GET_PRIVATE_PROPERTIES`: `CLUSCTL_NETINTERFACE_CODES` = 100663425;
public const val `CLUSCTL_NETINTERFACE_GET_PRIVATE_PROPERTY_FMTS`: `CLUSCTL_NETINTERFACE_CODES` = 100663437;
public const val `CLUSCTL_NETINTERFACE_GET_RO_COMMON_PROPERTIES`: `CLUSCTL_NETINTERFACE_CODES` = 100663381;
public const val `CLUSCTL_NETINTERFACE_GET_RO_PRIVATE_PROPERTIES`: `CLUSCTL_NETINTERFACE_CODES` = 100663421;
public const val `CLUSCTL_NETINTERFACE_SET_COMMON_PROPERTIES`: `CLUSCTL_NETINTERFACE_CODES` = 104857694;
public const val `CLUSCTL_NETINTERFACE_SET_PRIVATE_PROPERTIES`: `CLUSCTL_NETINTERFACE_CODES` = 104857734;
public const val `CLUSCTL_NETINTERFACE_UNKNOWN`: `CLUSCTL_NETINTERFACE_CODES` = 100663296;
public const val `CLUSCTL_NETINTERFACE_VALIDATE_COMMON_PROPERTIES`: `CLUSCTL_NETINTERFACE_CODES` = 100663393;
public const val `CLUSCTL_NETINTERFACE_VALIDATE_PRIVATE_PROPERTIES`: `CLUSCTL_NETINTERFACE_CODES` = 100663433;
public typealias `CLUSCTL_NETWORK_CODES` = Int;
public const val `CLUSCTL_NETWORK_ENUM_COMMON_PROPERTIES`: `CLUSCTL_NETWORK_CODES` = 83886161;
public const val `CLUSCTL_NETWORK_ENUM_PRIVATE_PROPERTIES`: `CLUSCTL_NETWORK_CODES` = 83886201;
public const val `CLUSCTL_NETWORK_GET_CHARACTERISTICS`: `CLUSCTL_NETWORK_CODES` = 83886085;
public const val `CLUSCTL_NETWORK_GET_COMMON_PROPERTIES`: `CLUSCTL_NETWORK_CODES` = 83886169;
public const val `CLUSCTL_NETWORK_GET_COMMON_PROPERTY_FMTS`: `CLUSCTL_NETWORK_CODES` = 83886181;
public const val `CLUSCTL_NETWORK_GET_FLAGS`: `CLUSCTL_NETWORK_CODES` = 83886089;
public const val `CLUSCTL_NETWORK_GET_ID`: `CLUSCTL_NETWORK_CODES` = 83886137;
public const val `CLUSCTL_NETWORK_GET_NAME`: `CLUSCTL_NETWORK_CODES` = 83886121;
public const val `CLUSCTL_NETWORK_GET_PRIVATE_PROPERTIES`: `CLUSCTL_NETWORK_CODES` = 83886209;
public const val `CLUSCTL_NETWORK_GET_PRIVATE_PROPERTY_FMTS`: `CLUSCTL_NETWORK_CODES` = 83886221;
public const val `CLUSCTL_NETWORK_GET_RO_COMMON_PROPERTIES`: `CLUSCTL_NETWORK_CODES` = 83886165;
public const val `CLUSCTL_NETWORK_GET_RO_PRIVATE_PROPERTIES`: `CLUSCTL_NETWORK_CODES` = 83886205;
public const val `CLUSCTL_NETWORK_SET_COMMON_PROPERTIES`: `CLUSCTL_NETWORK_CODES` = 88080478;
public const val `CLUSCTL_NETWORK_SET_PRIVATE_PROPERTIES`: `CLUSCTL_NETWORK_CODES` = 88080518;
public const val `CLUSCTL_NETWORK_UNKNOWN`: `CLUSCTL_NETWORK_CODES` = 83886080;
public const val `CLUSCTL_NETWORK_VALIDATE_COMMON_PROPERTIES`: `CLUSCTL_NETWORK_CODES` = 83886177;
public const val `CLUSCTL_NETWORK_VALIDATE_PRIVATE_PROPERTIES`: `CLUSCTL_NETWORK_CODES` = 83886217;
public const val `CLUSCTL_NODE_BLOCK_GEM_SEND_RECV`: `CLUSCTL_NODE_CODES` = 67109581;
public typealias `CLUSCTL_NODE_CODES` = Int;
public const val `CLUSCTL_NODE_ENUM_COMMON_PROPERTIES`: `CLUSCTL_NODE_CODES` = 67108945;
public const val `CLUSCTL_NODE_ENUM_PRIVATE_PROPERTIES`: `CLUSCTL_NODE_CODES` = 67108985;
public const val `CLUSCTL_NODE_GET_CHARACTERISTICS`: `CLUSCTL_NODE_CODES` = 67108869;
public const val `CLUSCTL_NODE_GET_CLUSTER_SERVICE_ACCOUNT_NAME`: `CLUSCTL_NODE_CODES` = 67108929;
public const val `CLUSCTL_NODE_GET_COMMON_PROPERTIES`: `CLUSCTL_NODE_CODES` = 67108953;
public const val `CLUSCTL_NODE_GET_COMMON_PROPERTY_FMTS`: `CLUSCTL_NODE_CODES` = 67108965;
public const val `CLUSCTL_NODE_GET_FLAGS`: `CLUSCTL_NODE_CODES` = 67108873;
public const val `CLUSCTL_NODE_GET_GEMID_VECTOR`: `CLUSCTL_NODE_CODES` = 67109585;
public const val `CLUSCTL_NODE_GET_ID`: `CLUSCTL_NODE_CODES` = 67108921;
public const val `CLUSCTL_NODE_GET_NAME`: `CLUSCTL_NODE_CODES` = 67108905;
public const val `CLUSCTL_NODE_GET_PRIVATE_PROPERTIES`: `CLUSCTL_NODE_CODES` = 67108993;
public const val `CLUSCTL_NODE_GET_PRIVATE_PROPERTY_FMTS`: `CLUSCTL_NODE_CODES` = 67109005;
public const val `CLUSCTL_NODE_GET_RO_COMMON_PROPERTIES`: `CLUSCTL_NODE_CODES` = 67108949;
public const val `CLUSCTL_NODE_GET_RO_PRIVATE_PROPERTIES`: `CLUSCTL_NODE_CODES` = 67108989;
public const val `CLUSCTL_NODE_GET_STUCK_NODES`: `CLUSCTL_NODE_CODES` = 67109565;
public const val `CLUSCTL_NODE_INJECT_GEM_FAULT`: `CLUSCTL_NODE_CODES` = 67109569;
public const val `CLUSCTL_NODE_INTRODUCE_GEM_REPAIR_DELAY`: `CLUSCTL_NODE_CODES` = 67109573;
public const val `CLUSCTL_NODE_SEND_DUMMY_GEM_MESSAGES`: `CLUSCTL_NODE_CODES` = 67109577;
public const val `CLUSCTL_NODE_SET_COMMON_PROPERTIES`: `CLUSCTL_NODE_CODES` = 71303262;
public const val `CLUSCTL_NODE_SET_PRIVATE_PROPERTIES`: `CLUSCTL_NODE_CODES` = 71303302;
public const val `CLUSCTL_NODE_UNKNOWN`: `CLUSCTL_NODE_CODES` = 67108864;
public const val `CLUSCTL_NODE_VALIDATE_COMMON_PROPERTIES`: `CLUSCTL_NODE_CODES` = 67108961;
public const val `CLUSCTL_NODE_VALIDATE_PRIVATE_PROPERTIES`: `CLUSCTL_NODE_CODES` = 67109001;
public const val `CLUSCTL_OBJECT_MASK`: UInt = 255u;
public const val `CLUSCTL_OBJECT_SHIFT`: UInt = 24u;
public const val `CLUSCTL_RESOURCE_ADD_CRYPTO_CHECKPOINT`: `CLUSCTL_RESOURCE_CODES` = 20971694;
public const val `CLUSCTL_RESOURCE_ADD_CRYPTO_CHECKPOINT_EX`: `CLUSCTL_RESOURCE_CODES` = 20972246;
public const val `CLUSCTL_RESOURCE_ADD_DEPENDENCY`: `CLUSCTL_RESOURCE_CODES` = 22020114;
public const val `CLUSCTL_RESOURCE_ADD_OWNER`: `CLUSCTL_RESOURCE_CODES` = 22020122;
public const val `CLUSCTL_RESOURCE_ADD_REGISTRY_CHECKPOINT`: `CLUSCTL_RESOURCE_CODES` = 20971682;
public const val `CLUSCTL_RESOURCE_ADD_REGISTRY_CHECKPOINT_32BIT`: `CLUSCTL_RESOURCE_CODES` = 20971714;
public const val `CLUSCTL_RESOURCE_ADD_REGISTRY_CHECKPOINT_64BIT`: `CLUSCTL_RESOURCE_CODES` = 20971710;
public const val `CLUSCTL_RESOURCE_CHECK_DRAIN_VETO`: `CLUSCTL_RESOURCE_CODES` = 17834285;
public const val `CLUSCTL_RESOURCE_CLUSTER_NAME_CHANGED`: `CLUSCTL_RESOURCE_CODES` = 22020138;
public const val `CLUSCTL_RESOURCE_CLUSTER_VERSION_CHANGED`: `CLUSCTL_RESOURCE_CODES` = 22020142;
public typealias `CLUSCTL_RESOURCE_CODES` = Int;
public const val `CLUSCTL_RESOURCE_DELETE`: `CLUSCTL_RESOURCE_CODES` = 22020102;
public const val `CLUSCTL_RESOURCE_DELETE_CRYPTO_CHECKPOINT`: `CLUSCTL_RESOURCE_CODES` = 20971698;
public const val `CLUSCTL_RESOURCE_DELETE_REGISTRY_CHECKPOINT`: `CLUSCTL_RESOURCE_CODES` = 20971686;
public const val `CLUSCTL_RESOURCE_DISABLE_SHARED_VOLUME_DIRECTIO`: `CLUSCTL_RESOURCE_CODES` = 20972174;
public const val `CLUSCTL_RESOURCE_ENABLE_SHARED_VOLUME_DIRECTIO`: `CLUSCTL_RESOURCE_CODES` = 20972170;
public const val `CLUSCTL_RESOURCE_ENUM_COMMON_PROPERTIES`: `CLUSCTL_RESOURCE_CODES` = 16777297;
public const val `CLUSCTL_RESOURCE_ENUM_PRIVATE_PROPERTIES`: `CLUSCTL_RESOURCE_CODES` = 16777337;
public const val `CLUSCTL_RESOURCE_EVICT_NODE`: `CLUSCTL_RESOURCE_CODES` = 22020110;
public const val `CLUSCTL_RESOURCE_FORCE_QUORUM`: `CLUSCTL_RESOURCE_CODES` = 22020166;
public const val `CLUSCTL_RESOURCE_FSWITNESS_GET_EPOCH_INFO`: `CLUSCTL_RESOURCE_CODES` = 17825885;
public const val `CLUSCTL_RESOURCE_FSWITNESS_RELEASE_LOCK`: `CLUSCTL_RESOURCE_CODES` = 22020198;
public const val `CLUSCTL_RESOURCE_FSWITNESS_SET_EPOCH_INFO`: `CLUSCTL_RESOURCE_CODES` = 22020194;
public const val `CLUSCTL_RESOURCE_GET_CHARACTERISTICS`: `CLUSCTL_RESOURCE_CODES` = 16777221;
public const val `CLUSCTL_RESOURCE_GET_CLASS_INFO`: `CLUSCTL_RESOURCE_CODES` = 16777229;
public const val `CLUSCTL_RESOURCE_GET_COMMON_PROPERTIES`: `CLUSCTL_RESOURCE_CODES` = 16777305;
public const val `CLUSCTL_RESOURCE_GET_COMMON_PROPERTY_FMTS`: `CLUSCTL_RESOURCE_CODES` = 16777317;
public const val `CLUSCTL_RESOURCE_GET_CRYPTO_CHECKPOINTS`: `CLUSCTL_RESOURCE_CODES` = 16777397;
public const val `CLUSCTL_RESOURCE_GET_DNS_NAME`: `CLUSCTL_RESOURCE_CODES` = 16777589;
public const val `CLUSCTL_RESOURCE_GET_FAILURE_INFO`: `CLUSCTL_RESOURCE_CODES` = 16777241;
public const val `CLUSCTL_RESOURCE_GET_FLAGS`: `CLUSCTL_RESOURCE_CODES` = 16777225;
public const val `CLUSCTL_RESOURCE_GET_ID`: `CLUSCTL_RESOURCE_CODES` = 16777273;
public const val `CLUSCTL_RESOURCE_GET_INFRASTRUCTURE_SOFS_BUFFER`: `CLUSCTL_RESOURCE_CODES` = 16788873;
public const val `CLUSCTL_RESOURCE_GET_LOADBAL_PROCESS_LIST`: `CLUSCTL_RESOURCE_CODES` = 16777417;
public const val `CLUSCTL_RESOURCE_GET_NAME`: `CLUSCTL_RESOURCE_CODES` = 16777257;
public const val `CLUSCTL_RESOURCE_GET_NETWORK_NAME`: `CLUSCTL_RESOURCE_CODES` = 16777577;
public const val `CLUSCTL_RESOURCE_GET_NODES_IN_FD`: `CLUSCTL_RESOURCE_CODES` = 16788961;
public const val `CLUSCTL_RESOURCE_GET_OPERATION_CONTEXT`: `CLUSCTL_RESOURCE_CODES` = 17834217;
public const val `CLUSCTL_RESOURCE_GET_PRIVATE_PROPERTIES`: `CLUSCTL_RESOURCE_CODES` = 16777345;
public const val `CLUSCTL_RESOURCE_GET_PRIVATE_PROPERTY_FMTS`: `CLUSCTL_RESOURCE_CODES` = 16777357;
public const val `CLUSCTL_RESOURCE_GET_REGISTRY_CHECKPOINTS`: `CLUSCTL_RESOURCE_CODES` = 16777385;
public const val `CLUSCTL_RESOURCE_GET_REQUIRED_DEPENDENCIES`: `CLUSCTL_RESOURCE_CODES` = 16777233;
public const val `CLUSCTL_RESOURCE_GET_RESOURCE_TYPE`: `CLUSCTL_RESOURCE_CODES` = 16777261;
public const val `CLUSCTL_RESOURCE_GET_RO_COMMON_PROPERTIES`: `CLUSCTL_RESOURCE_CODES` = 16777301;
public const val `CLUSCTL_RESOURCE_GET_RO_PRIVATE_PROPERTIES`: `CLUSCTL_RESOURCE_CODES` = 16777341;
public const val `CLUSCTL_RESOURCE_GET_STATE_CHANGE_TIME`: `CLUSCTL_RESOURCE_CODES` = 16788829;
public const val `CLUSCTL_RESOURCE_INITIALIZE`: `CLUSCTL_RESOURCE_CODES` = 22020170;
public const val `CLUSCTL_RESOURCE_INSTALL_NODE`: `CLUSCTL_RESOURCE_CODES` = 22020106;
public const val `CLUSCTL_RESOURCE_IPADDRESS_RELEASE_LEASE`: `CLUSCTL_RESOURCE_CODES` = 20971970;
public const val `CLUSCTL_RESOURCE_IPADDRESS_RENEW_LEASE`: `CLUSCTL_RESOURCE_CODES` = 20971966;
public const val `CLUSCTL_RESOURCE_IS_QUORUM_BLOCKED`: `CLUSCTL_RESOURCE_CODES` = 16777905;
public const val `CLUSCTL_RESOURCE_JOINING_GROUP`: `CLUSCTL_RESOURCE_CODES` = 22020186;
public const val `CLUSCTL_RESOURCE_LEAVING_GROUP`: `CLUSCTL_RESOURCE_CODES` = 22020182;
public const val `CLUSCTL_RESOURCE_NETNAME_CREDS_NOTIFYCAM`: `CLUSCTL_RESOURCE_CODES` = 22020202;
public const val `CLUSCTL_RESOURCE_NETNAME_DELETE_CO`: `CLUSCTL_RESOURCE_CODES` = 16777598;
public const val `CLUSCTL_RESOURCE_NETNAME_GET_VIRTUAL_SERVER_TOKEN`: `CLUSCTL_RESOURCE_CODES` = 16777581;
public const val `CLUSCTL_RESOURCE_NETNAME_REGISTER_DNS_RECORDS`: `CLUSCTL_RESOURCE_CODES` = 16777586;
public const val `CLUSCTL_RESOURCE_NETNAME_REPAIR_VCO`: `CLUSCTL_RESOURCE_CODES` = 16777613;
public const val `CLUSCTL_RESOURCE_NETNAME_RESET_VCO`: `CLUSCTL_RESOURCE_CODES` = 16777605;
public const val `CLUSCTL_RESOURCE_NETNAME_SET_PWD_INFO`: `CLUSCTL_RESOURCE_CODES` = 16777594;
public const val `CLUSCTL_RESOURCE_NETNAME_SET_PWD_INFOEX`: `CLUSCTL_RESOURCE_CODES` = 16778010;
public const val `CLUSCTL_RESOURCE_NETNAME_VALIDATE_VCO`: `CLUSCTL_RESOURCE_CODES` = 16777601;
public const val `CLUSCTL_RESOURCE_NOTIFY_DRAIN_COMPLETE`: `CLUSCTL_RESOURCE_CODES` = 17834289;
public const val `CLUSCTL_RESOURCE_NOTIFY_OWNER_CHANGE`: `CLUSCTL_RESOURCE_CODES` = 22028578;
public const val `CLUSCTL_RESOURCE_NOTIFY_QUORUM_STATUS`: `CLUSCTL_RESOURCE_CODES` = 22020222;
public const val `CLUSCTL_RESOURCE_POOL_GET_DRIVE_INFO`: `CLUSCTL_RESOURCE_CODES` = 16777909;
public const val `CLUSCTL_RESOURCE_PREPARE_UPGRADE`: `CLUSCTL_RESOURCE_CODES` = 20979946;
public const val `CLUSCTL_RESOURCE_PROVIDER_STATE_CHANGE`: `CLUSCTL_RESOURCE_CODES` = 22020178;
public const val `CLUSCTL_RESOURCE_QUERY_DELETE`: `CLUSCTL_RESOURCE_CODES` = 16777657;
public const val `CLUSCTL_RESOURCE_QUERY_MAINTENANCE_MODE`: `CLUSCTL_RESOURCE_CODES` = 16777697;
public const val `CLUSCTL_RESOURCE_REMOVE_DEPENDENCY`: `CLUSCTL_RESOURCE_CODES` = 22020118;
public const val `CLUSCTL_RESOURCE_REMOVE_OWNER`: `CLUSCTL_RESOURCE_CODES` = 22020126;
public const val `CLUSCTL_RESOURCE_RLUA_GET_VIRTUAL_SERVER_TOKEN`: `CLUSCTL_RESOURCE_CODES` = 16777581;
public const val `CLUSCTL_RESOURCE_RLUA_SET_PWD_INFO`: `CLUSCTL_RESOURCE_CODES` = 16777594;
public const val `CLUSCTL_RESOURCE_RLUA_SET_PWD_INFOEX`: `CLUSCTL_RESOURCE_CODES` = 16778010;
public const val `CLUSCTL_RESOURCE_RW_MODIFY_NOOP`: `CLUSCTL_RESOURCE_CODES` = 20972206;
public const val `CLUSCTL_RESOURCE_SCALEOUT_COMMAND`: `CLUSCTL_RESOURCE_CODES` = 20983190;
public const val `CLUSCTL_RESOURCE_SCALEOUT_CONTROL`: `CLUSCTL_RESOURCE_CODES` = 20983194;
public const val `CLUSCTL_RESOURCE_SCALEOUT_GET_CLUSTERS`: `CLUSCTL_RESOURCE_CODES` = 20983197;
public const val `CLUSCTL_RESOURCE_SET_COMMON_PROPERTIES`: `CLUSCTL_RESOURCE_CODES` = 20971614;
public const val `CLUSCTL_RESOURCE_SET_CSV_MAINTENANCE_MODE`: `CLUSCTL_RESOURCE_CODES` = 20972182;
public const val `CLUSCTL_RESOURCE_SET_INFRASTRUCTURE_SOFS_BUFFER`: `CLUSCTL_RESOURCE_CODES` = 20983182;
public const val `CLUSCTL_RESOURCE_SET_MAINTENANCE_MODE`: `CLUSCTL_RESOURCE_CODES` = 20972006;
public const val `CLUSCTL_RESOURCE_SET_NAME`: `CLUSCTL_RESOURCE_CODES` = 22020134;
public const val `CLUSCTL_RESOURCE_SET_PRIVATE_PROPERTIES`: `CLUSCTL_RESOURCE_CODES` = 20971654;
public const val `CLUSCTL_RESOURCE_SET_SHARED_VOLUME_BACKUP_MODE`: `CLUSCTL_RESOURCE_CODES` = 20972186;
public const val `CLUSCTL_RESOURCE_STATE_CHANGE_REASON`: `CLUSCTL_RESOURCE_CODES` = 22020174;
// UNSUPPORTED Rust 1107:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUSCTL_RESOURCE_STATE_CHANGE_REASON_STRUCT {
//     pub dwSize: u32,
//     pub dwVersion: u32,
//     pub eReason: CLUSTER_RESOURCE_STATE_CHANGE_REASON,
// }

public const val `CLUSCTL_RESOURCE_STATE_CHANGE_REASON_VERSION_1`: UInt = 1u;
public const val `CLUSCTL_RESOURCE_STORAGE_GET_DIRTY`: `CLUSCTL_RESOURCE_CODES` = 16777753;
public const val `CLUSCTL_RESOURCE_STORAGE_GET_DISKID`: `CLUSCTL_RESOURCE_CODES` = 16777733;
public const val `CLUSCTL_RESOURCE_STORAGE_GET_DISK_INFO`: `CLUSCTL_RESOURCE_CODES` = 16777617;
public const val `CLUSCTL_RESOURCE_STORAGE_GET_DISK_INFO_EX`: `CLUSCTL_RESOURCE_CODES` = 16777713;
public const val `CLUSCTL_RESOURCE_STORAGE_GET_DISK_INFO_EX2`: `CLUSCTL_RESOURCE_CODES` = 16777721;
public const val `CLUSCTL_RESOURCE_STORAGE_GET_DISK_NUMBER_INFO`: `CLUSCTL_RESOURCE_CODES` = 16777633;
public const val `CLUSCTL_RESOURCE_STORAGE_GET_MOUNTPOINTS`: `CLUSCTL_RESOURCE_CODES` = 16777745;
public const val `CLUSCTL_RESOURCE_STORAGE_GET_SHARED_VOLUME_INFO`: `CLUSCTL_RESOURCE_CODES` = 16777765;
public const val `CLUSCTL_RESOURCE_STORAGE_GET_SHARED_VOLUME_PARTITION_NAMES`: `CLUSCTL_RESOURCE_CODES` = 16777885;
public const val `CLUSCTL_RESOURCE_STORAGE_GET_SHARED_VOLUME_STATES`: `CLUSCTL_RESOURCE_CODES` = 20972194;
public const val `CLUSCTL_RESOURCE_STORAGE_IS_PATH_VALID`: `CLUSCTL_RESOURCE_CODES` = 16777625;
public const val `CLUSCTL_RESOURCE_STORAGE_IS_SHARED_VOLUME`: `CLUSCTL_RESOURCE_CODES` = 16777893;
public const val `CLUSCTL_RESOURCE_STORAGE_RENAME_SHARED_VOLUME`: `CLUSCTL_RESOURCE_CODES` = 16788950;
public const val `CLUSCTL_RESOURCE_STORAGE_RENAME_SHARED_VOLUME_GUID`: `CLUSCTL_RESOURCE_CODES` = 16788954;
public const val `CLUSCTL_RESOURCE_STORAGE_SET_DRIVELETTER`: `CLUSCTL_RESOURCE_CODES` = 20972010;
public const val `CLUSCTL_RESOURCE_TYPE_CHECK_DRAIN_VETO`: `CLUSCTL_RESOURCE_TYPE_CODES` = 34611501;
public const val `CLUSCTL_RESOURCE_TYPE_CLUSTER_VERSION_CHANGED`: `CLUSCTL_RESOURCE_TYPE_CODES` = 38797358;
public typealias `CLUSCTL_RESOURCE_TYPE_CODES` = Int;
public const val `CLUSCTL_RESOURCE_TYPE_ENUM_COMMON_PROPERTIES`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554513;
public const val `CLUSCTL_RESOURCE_TYPE_ENUM_PRIVATE_PROPERTIES`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554553;
public const val `CLUSCTL_RESOURCE_TYPE_EVICT_NODE`: `CLUSCTL_RESOURCE_TYPE_CODES` = 38797326;
public const val `CLUSCTL_RESOURCE_TYPE_FIXUP_ON_UPGRADE`: `CLUSCTL_RESOURCE_TYPE_CODES` = 38797362;
public const val `CLUSCTL_RESOURCE_TYPE_GEN_APP_VALIDATE_DIRECTORY`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33555001;
public const val `CLUSCTL_RESOURCE_TYPE_GEN_APP_VALIDATE_PATH`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554993;
public const val `CLUSCTL_RESOURCE_TYPE_GEN_SCRIPT_VALIDATE_PATH`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554993;
public const val `CLUSCTL_RESOURCE_TYPE_GET_ARB_TIMEOUT`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554453;
public const val `CLUSCTL_RESOURCE_TYPE_GET_CHARACTERISTICS`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554437;
public const val `CLUSCTL_RESOURCE_TYPE_GET_CLASS_INFO`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554445;
public const val `CLUSCTL_RESOURCE_TYPE_GET_COMMON_PROPERTIES`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554521;
public const val `CLUSCTL_RESOURCE_TYPE_GET_COMMON_PROPERTY_FMTS`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554533;
public const val `CLUSCTL_RESOURCE_TYPE_GET_COMMON_RESOURCE_PROPERTY_FMTS`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554537;
public const val `CLUSCTL_RESOURCE_TYPE_GET_CRYPTO_CHECKPOINTS`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554613;
public const val `CLUSCTL_RESOURCE_TYPE_GET_FLAGS`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554441;
public const val `CLUSCTL_RESOURCE_TYPE_GET_PRIVATE_PROPERTIES`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554561;
public const val `CLUSCTL_RESOURCE_TYPE_GET_PRIVATE_PROPERTY_FMTS`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554573;
public const val `CLUSCTL_RESOURCE_TYPE_GET_PRIVATE_RESOURCE_PROPERTY_FMTS`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554577;
public const val `CLUSCTL_RESOURCE_TYPE_GET_REGISTRY_CHECKPOINTS`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554601;
public const val `CLUSCTL_RESOURCE_TYPE_GET_REQUIRED_DEPENDENCIES`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554449;
public const val `CLUSCTL_RESOURCE_TYPE_GET_RO_COMMON_PROPERTIES`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554517;
public const val `CLUSCTL_RESOURCE_TYPE_GET_RO_PRIVATE_PROPERTIES`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554557;
public const val `CLUSCTL_RESOURCE_TYPE_HOLD_IO`: `CLUSCTL_RESOURCE_TYPE_CODES` = 38797374;
public const val `CLUSCTL_RESOURCE_TYPE_INSTALL_NODE`: `CLUSCTL_RESOURCE_TYPE_CODES` = 38797322;
public const val `CLUSCTL_RESOURCE_TYPE_NETNAME_GET_OU_FOR_VCO`: `CLUSCTL_RESOURCE_TYPE_CODES` = 37749358;
public const val `CLUSCTL_RESOURCE_TYPE_NETNAME_VALIDATE_NETNAME`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554997;
public const val `CLUSCTL_RESOURCE_TYPE_NOTIFY_DRAIN_COMPLETE`: `CLUSCTL_RESOURCE_TYPE_CODES` = 34611505;
public const val `CLUSCTL_RESOURCE_TYPE_NOTIFY_MONITOR_SHUTTING_DOWN`: `CLUSCTL_RESOURCE_TYPE_CODES` = 34603137;
public const val `CLUSCTL_RESOURCE_TYPE_PREPARE_UPGRADE`: `CLUSCTL_RESOURCE_TYPE_CODES` = 37757162;
public const val `CLUSCTL_RESOURCE_TYPE_QUERY_DELETE`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554873;
public const val `CLUSCTL_RESOURCE_TYPE_REPLICATION_ADD_REPLICATION_GROUP`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33562946;
public const val `CLUSCTL_RESOURCE_TYPE_REPLICATION_GET_ELIGIBLE_LOGDISKS`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33562953;
public const val `CLUSCTL_RESOURCE_TYPE_REPLICATION_GET_ELIGIBLE_SOURCE_DATADISKS`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33562961;
public const val `CLUSCTL_RESOURCE_TYPE_REPLICATION_GET_ELIGIBLE_TARGET_DATADISKS`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33562957;
public const val `CLUSCTL_RESOURCE_TYPE_REPLICATION_GET_LOG_INFO`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33562949;
public const val `CLUSCTL_RESOURCE_TYPE_REPLICATION_GET_LOG_VOLUME`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33562973;
public const val `CLUSCTL_RESOURCE_TYPE_REPLICATION_GET_REPLICATED_DISKS`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33562965;
public const val `CLUSCTL_RESOURCE_TYPE_REPLICATION_GET_REPLICATED_PARTITION_INFO`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33562981;
public const val `CLUSCTL_RESOURCE_TYPE_REPLICATION_GET_REPLICA_VOLUMES`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33562969;
public const val `CLUSCTL_RESOURCE_TYPE_REPLICATION_GET_RESOURCE_GROUP`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33562977;
public const val `CLUSCTL_RESOURCE_TYPE_RESUME_IO`: `CLUSCTL_RESOURCE_TYPE_CODES` = 38797378;
public const val `CLUSCTL_RESOURCE_TYPE_SET_COMMON_PROPERTIES`: `CLUSCTL_RESOURCE_TYPE_CODES` = 37748830;
public const val `CLUSCTL_RESOURCE_TYPE_SET_PRIVATE_PROPERTIES`: `CLUSCTL_RESOURCE_TYPE_CODES` = 37748870;
public const val `CLUSCTL_RESOURCE_TYPE_STARTING_PHASE1`: `CLUSCTL_RESOURCE_TYPE_CODES` = 38797366;
public const val `CLUSCTL_RESOURCE_TYPE_STARTING_PHASE2`: `CLUSCTL_RESOURCE_TYPE_CODES` = 38797370;
public const val `CLUSCTL_RESOURCE_TYPE_STORAGE_GET_AVAILABLE_DISKS`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554837;
public const val `CLUSCTL_RESOURCE_TYPE_STORAGE_GET_AVAILABLE_DISKS_EX`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554933;
public const val `CLUSCTL_RESOURCE_TYPE_STORAGE_GET_AVAILABLE_DISKS_EX2_FLAG_ADD_VOLUME_INFO`: UInt = 1u;
public const val `CLUSCTL_RESOURCE_TYPE_STORAGE_GET_AVAILABLE_DISKS_EX2_FLAG_FILTER_BY_POOL`: UInt = 2u;
public const val `CLUSCTL_RESOURCE_TYPE_STORAGE_GET_AVAILABLE_DISKS_EX2_FLAG_INCLUDE_NON_SHARED_DISKS`: UInt = 4u;
// UNSUPPORTED Rust 1183:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUSCTL_RESOURCE_TYPE_STORAGE_GET_AVAILABLE_DISKS_EX2_INPUT {
//     pub dwFlags: u32,
//     pub guidPoolFilter: windows_sys::core::GUID,
// }

public const val `CLUSCTL_RESOURCE_TYPE_STORAGE_GET_AVAILABLE_DISKS_EX2_INT`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33562593;
public const val `CLUSCTL_RESOURCE_TYPE_STORAGE_GET_DISKID`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554949;
public const val `CLUSCTL_RESOURCE_TYPE_STORAGE_GET_DRIVELETTERS`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554925;
public const val `CLUSCTL_RESOURCE_TYPE_STORAGE_GET_RESOURCEID`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554989;
public const val `CLUSCTL_RESOURCE_TYPE_STORAGE_IS_CLUSTERABLE`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554953;
public const val `CLUSCTL_RESOURCE_TYPE_STORAGE_IS_CSV_FILE`: `CLUSCTL_RESOURCE_TYPE_CODES` = 16777769;
public const val `CLUSCTL_RESOURCE_TYPE_STORAGE_REMAP_DRIVELETTER`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554945;
public const val `CLUSCTL_RESOURCE_TYPE_STORAGE_REMOVE_VM_OWNERSHIP`: `CLUSCTL_RESOURCE_TYPE_CODES` = 37749262;
public const val `CLUSCTL_RESOURCE_TYPE_STORAGE_SYNC_CLUSDISK_DB`: `CLUSCTL_RESOURCE_TYPE_CODES` = 37749150;
public const val `CLUSCTL_RESOURCE_TYPE_UNKNOWN`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554432;
public const val `CLUSCTL_RESOURCE_TYPE_UPGRADE_COMPLETED`: `CLUSCTL_RESOURCE_TYPE_CODES` = 37757166;
public const val `CLUSCTL_RESOURCE_TYPE_VALIDATE_COMMON_PROPERTIES`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554529;
public const val `CLUSCTL_RESOURCE_TYPE_VALIDATE_PRIVATE_PROPERTIES`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554569;
public const val `CLUSCTL_RESOURCE_TYPE_WITNESS_VALIDATE_PATH`: `CLUSCTL_RESOURCE_TYPE_CODES` = 33554993;
public const val `CLUSCTL_RESOURCE_UNDELETE`: `CLUSCTL_RESOURCE_CODES` = 22020230;
public const val `CLUSCTL_RESOURCE_UNKNOWN`: `CLUSCTL_RESOURCE_CODES` = 16777216;
public const val `CLUSCTL_RESOURCE_UPGRADE_COMPLETED`: `CLUSCTL_RESOURCE_CODES` = 20979950;
public const val `CLUSCTL_RESOURCE_UPGRADE_DLL`: `CLUSCTL_RESOURCE_CODES` = 20971706;
public const val `CLUSCTL_RESOURCE_VALIDATE_CHANGE_GROUP`: `CLUSCTL_RESOURCE_CODES` = 17834277;
public const val `CLUSCTL_RESOURCE_VALIDATE_COMMON_PROPERTIES`: `CLUSCTL_RESOURCE_CODES` = 16777313;
public const val `CLUSCTL_RESOURCE_VALIDATE_PRIVATE_PROPERTIES`: `CLUSCTL_RESOURCE_CODES` = 16777353;
public const val `CLUSGROUPSET_STATUS_APPLICATION_READY`: ULong = 8uL;
public const val `CLUSGROUPSET_STATUS_GROUPS_ONLINE`: ULong = 2uL;
public const val `CLUSGROUPSET_STATUS_GROUPS_PENDING`: ULong = 1uL;
public const val `CLUSGROUPSET_STATUS_OS_HEARTBEAT`: ULong = 4uL;
public typealias `CLUSGROUP_TYPE` = Int;
public const val `CLUSGRP_STATUS_APPLICATION_READY`: ULong = 1024uL;
public const val `CLUSGRP_STATUS_EMBEDDED_FAILURE`: ULong = 32uL;
public const val `CLUSGRP_STATUS_LOCKED_MODE`: ULong = 1uL;
public const val `CLUSGRP_STATUS_NETWORK_FAILURE`: ULong = 128uL;
public const val `CLUSGRP_STATUS_OFFLINE_DUE_TO_ANTIAFFINITY_CONFLICT`: ULong = 64uL;
public const val `CLUSGRP_STATUS_OFFLINE_NOT_LOCAL_DISK_OWNER`: ULong = 2048uL;
public const val `CLUSGRP_STATUS_OS_HEARTBEAT`: ULong = 512uL;
public const val `CLUSGRP_STATUS_PHYSICAL_RESOURCES_LACKING`: ULong = 8uL;
public const val `CLUSGRP_STATUS_PREEMPTED`: ULong = 2uL;
public const val `CLUSGRP_STATUS_UNMONITORED`: ULong = 256uL;
public const val `CLUSGRP_STATUS_WAITING_FOR_DEPENDENCIES`: ULong = 4096uL;
public const val `CLUSGRP_STATUS_WAITING_IN_QUEUE_FOR_MOVE`: ULong = 4uL;
public const val `CLUSGRP_STATUS_WAITING_TO_START`: ULong = 16uL;
// UNSUPPORTED Rust 1228:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_BINARY {
//     pub Base: CLUSPROP_VALUE,
//     pub rgb: [u8; 1],
// }

// UNSUPPORTED Rust 1234:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_BINARY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1239:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union CLUSPROP_BUFFER_HELPER {
//     pub pb: *mut u8,
//     pub pw: *mut u16,
//     pub pdw: *mut u32,
//     pub pl: *mut i32,
//     pub psz: windows_sys::core::PWSTR,
//     pub pList: *mut CLUSPROP_LIST,
//     pub pSyntax: *mut CLUSPROP_SYNTAX,
//     pub pName: *mut CLUSPROP_SZ,
//     pub pValue: *mut CLUSPROP_VALUE,
//     pub pBinaryValue: *mut CLUSPROP_BINARY,
//     pub pWordValue: *mut CLUSPROP_WORD,
//     pub pDwordValue: *mut CLUSPROP_DWORD,
//     pub pLongValue: *mut CLUSPROP_LONG,
//     pub pULargeIntegerValue: *mut CLUSPROP_ULARGE_INTEGER,
//     pub pLargeIntegerValue: *mut CLUSPROP_LARGE_INTEGER,
//     pub pStringValue: *mut CLUSPROP_SZ,
//     pub pMultiSzValue: *mut CLUSPROP_SZ,
//     pub pSecurityDescriptor: *mut CLUSPROP_SECURITY_DESCRIPTOR,
//     pub pResourceClassValue: *mut CLUSPROP_RESOURCE_CLASS,
//     pub pResourceClassInfoValue: *mut CLUSPROP_RESOURCE_CLASS_INFO,
//     pub pDiskSignatureValue: *mut CLUSPROP_DWORD,
//     pub pScsiAddressValue: *mut CLUSPROP_SCSI_ADDRESS,
//     pub pDiskNumberValue: *mut CLUSPROP_DWORD,
//     pub pPartitionInfoValue: *mut CLUSPROP_PARTITION_INFO,
//     pub pRequiredDependencyValue: *mut CLUSPROP_REQUIRED_DEPENDENCY,
//     pub pPartitionInfoValueEx: *mut CLUSPROP_PARTITION_INFO_EX,
//     pub pPartitionInfoValueEx2: *mut CLUSPROP_PARTITION_INFO_EX2,
//     pub pFileTimeValue: *mut CLUSPROP_FILETIME,
// }

// UNSUPPORTED Rust 1272:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for CLUSPROP_BUFFER_HELPER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1278:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_DWORD {
//     pub Base: CLUSPROP_VALUE,
//     pub dw: u32,
// }

// UNSUPPORTED Rust 1284:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_DWORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1289:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_FILETIME {
//     pub Base: CLUSPROP_VALUE,
//     pub ft: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 1295:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_FILETIME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLUSPROP_FORMAT_BINARY`: `CLUSTER_PROPERTY_FORMAT` = 1;
public const val `CLUSPROP_FORMAT_DWORD`: `CLUSTER_PROPERTY_FORMAT` = 2;
public const val `CLUSPROP_FORMAT_EXPANDED_SZ`: `CLUSTER_PROPERTY_FORMAT` = 8;
public const val `CLUSPROP_FORMAT_EXPAND_SZ`: `CLUSTER_PROPERTY_FORMAT` = 4;
public const val `CLUSPROP_FORMAT_FILETIME`: `CLUSTER_PROPERTY_FORMAT` = 12;
public const val `CLUSPROP_FORMAT_LARGE_INTEGER`: `CLUSTER_PROPERTY_FORMAT` = 10;
public const val `CLUSPROP_FORMAT_LONG`: `CLUSTER_PROPERTY_FORMAT` = 7;
public const val `CLUSPROP_FORMAT_MULTI_SZ`: `CLUSTER_PROPERTY_FORMAT` = 5;
public const val `CLUSPROP_FORMAT_PROPERTY_LIST`: `CLUSTER_PROPERTY_FORMAT` = 14;
public const val `CLUSPROP_FORMAT_SECURITY_DESCRIPTOR`: `CLUSTER_PROPERTY_FORMAT` = 9;
public const val `CLUSPROP_FORMAT_SZ`: `CLUSTER_PROPERTY_FORMAT` = 3;
public const val `CLUSPROP_FORMAT_ULARGE_INTEGER`: `CLUSTER_PROPERTY_FORMAT` = 6;
public const val `CLUSPROP_FORMAT_UNKNOWN`: `CLUSTER_PROPERTY_FORMAT` = 0;
public const val `CLUSPROP_FORMAT_USER`: `CLUSTER_PROPERTY_FORMAT` = 32768;
public const val `CLUSPROP_FORMAT_VALUE_LIST`: `CLUSTER_PROPERTY_FORMAT` = 13;
public const val `CLUSPROP_FORMAT_WORD`: `CLUSTER_PROPERTY_FORMAT` = 11;
// UNSUPPORTED Rust 1316:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_FTSET_INFO {
//     pub Base: CLUSPROP_VALUE,
//     pub Base2: CLUS_FTSET_INFO,
// }

// UNSUPPORTED Rust 1322:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_FTSET_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CLUSPROP_IPADDR_ENABLENETBIOS` = Int;
public const val `CLUSPROP_IPADDR_ENABLENETBIOS_DISABLED`: `CLUSPROP_IPADDR_ENABLENETBIOS` = 0;
public const val `CLUSPROP_IPADDR_ENABLENETBIOS_ENABLED`: `CLUSPROP_IPADDR_ENABLENETBIOS` = 1;
public const val `CLUSPROP_IPADDR_ENABLENETBIOS_TRACK_NIC`: `CLUSPROP_IPADDR_ENABLENETBIOS` = 2;
// UNSUPPORTED Rust 1331:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_LARGE_INTEGER {
//     pub Base: CLUSPROP_VALUE,
//     pub li: i64,
// }

// UNSUPPORTED Rust 1337:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_LARGE_INTEGER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1342:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_LIST {
//     pub nPropertyCount: u32,
//     pub PropertyName: CLUSPROP_SZ,
// }

// UNSUPPORTED Rust 1348:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1353:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_LONG {
//     pub Base: CLUSPROP_VALUE,
//     pub l: i32,
// }

// UNSUPPORTED Rust 1359:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_LONG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1364:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_PARTITION_INFO {
//     pub Base: CLUSPROP_VALUE,
//     pub Base2: CLUS_PARTITION_INFO,
// }

// UNSUPPORTED Rust 1370:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_PARTITION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1375:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_PARTITION_INFO_EX {
//     pub Base: CLUSPROP_VALUE,
//     pub Base2: CLUS_PARTITION_INFO_EX,
// }

// UNSUPPORTED Rust 1381:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_PARTITION_INFO_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1386:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_PARTITION_INFO_EX2 {
//     pub Base: CLUSPROP_PARTITION_INFO_EX,
//     pub Base2: CLUS_PARTITION_INFO_EX2,
// }

// UNSUPPORTED Rust 1392:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_PARTITION_INFO_EX2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CLUSPROP_PIFLAGS` = Int;
public const val `CLUSPROP_PIFLAG_DEFAULT_QUORUM`: `CLUSPROP_PIFLAGS` = 8;
public const val `CLUSPROP_PIFLAG_ENCRYPTION_ENABLED`: `CLUSPROP_PIFLAGS` = 32;
public const val `CLUSPROP_PIFLAG_RAW`: `CLUSPROP_PIFLAGS` = 64;
public const val `CLUSPROP_PIFLAG_REMOVABLE`: `CLUSPROP_PIFLAGS` = 2;
public const val `CLUSPROP_PIFLAG_STICKY`: `CLUSPROP_PIFLAGS` = 1;
public const val `CLUSPROP_PIFLAG_UNKNOWN`: `CLUSPROP_PIFLAGS` = -2147483648;
public const val `CLUSPROP_PIFLAG_USABLE`: `CLUSPROP_PIFLAGS` = 4;
public const val `CLUSPROP_PIFLAG_USABLE_FOR_CSV`: `CLUSPROP_PIFLAGS` = 16;
// UNSUPPORTED Rust 1406:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CLUSPROP_REQUIRED_DEPENDENCY {
//     pub Value: CLUSPROP_VALUE,
//     pub ResClass: CLUSPROP_RESOURCE_CLASS,
//     pub ResTypeName: CLUSPROP_SZ,
// }

// UNSUPPORTED Rust 1413:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_REQUIRED_DEPENDENCY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1418:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_RESOURCE_CLASS {
//     pub Base: CLUSPROP_VALUE,
//     pub rc: CLUSTER_RESOURCE_CLASS,
// }

// UNSUPPORTED Rust 1424:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_RESOURCE_CLASS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1429:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_RESOURCE_CLASS_INFO {
//     pub Base: CLUSPROP_VALUE,
//     pub Base2: CLUS_RESOURCE_CLASS_INFO,
// }

// UNSUPPORTED Rust 1435:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_RESOURCE_CLASS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1440:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_SCSI_ADDRESS {
//     pub Base: CLUSPROP_VALUE,
//     pub Base2: CLUS_SCSI_ADDRESS,
// }

// UNSUPPORTED Rust 1446:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_SCSI_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1451:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_SECURITY_DESCRIPTOR {
//     pub Base: CLUSPROP_VALUE,
//     pub Anonymous: CLUSPROP_SECURITY_DESCRIPTOR_0,
// }

// UNSUPPORTED Rust 1458:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for CLUSPROP_SECURITY_DESCRIPTOR {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1464:1: declaration Union has no candidate rule
// #[repr(C)]
// #[cfg(feature = "Win32_Security")]
// #[derive(Clone, Copy)]
// pub union CLUSPROP_SECURITY_DESCRIPTOR_0 {
//     pub sd: super::super::Security::SECURITY_DESCRIPTOR_RELATIVE,
//     pub rgbSecurityDescriptor: [u8; 1],
// }

// UNSUPPORTED Rust 1471:1: declaration Impl has no candidate rule
// #[cfg(feature = "Win32_Security")]
// impl Default for CLUSPROP_SECURITY_DESCRIPTOR_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1477:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CLUSPROP_SYNTAX {
//     pub dw: u32,
//     pub Anonymous: CLUSPROP_SYNTAX_0,
// }

// UNSUPPORTED Rust 1483:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_SYNTAX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1488:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUSPROP_SYNTAX_0 {
//     pub wFormat: u16,
//     pub wType: u16,
// }

public const val `CLUSPROP_SYNTAX_DISK_GUID`: `CLUSTER_PROPERTY_SYNTAX` = 720899u;
public const val `CLUSPROP_SYNTAX_DISK_NUMBER`: `CLUSTER_PROPERTY_SYNTAX` = 458754u;
public const val `CLUSPROP_SYNTAX_DISK_SERIALNUMBER`: `CLUSTER_PROPERTY_SYNTAX` = 655363u;
public const val `CLUSPROP_SYNTAX_DISK_SIGNATURE`: `CLUSTER_PROPERTY_SYNTAX` = 327682u;
public const val `CLUSPROP_SYNTAX_DISK_SIZE`: `CLUSTER_PROPERTY_SYNTAX` = 786438u;
public const val `CLUSPROP_SYNTAX_ENDMARK`: `CLUSTER_PROPERTY_SYNTAX` = 0u;
public const val `CLUSPROP_SYNTAX_FTSET_INFO`: `CLUSTER_PROPERTY_SYNTAX` = 589825u;
public const val `CLUSPROP_SYNTAX_LIST_VALUE_BINARY`: `CLUSTER_PROPERTY_SYNTAX` = 65537u;
public const val `CLUSPROP_SYNTAX_LIST_VALUE_DWORD`: `CLUSTER_PROPERTY_SYNTAX` = 65538u;
public const val `CLUSPROP_SYNTAX_LIST_VALUE_EXPANDED_SZ`: `CLUSTER_PROPERTY_SYNTAX` = 65544u;
public const val `CLUSPROP_SYNTAX_LIST_VALUE_EXPAND_SZ`: `CLUSTER_PROPERTY_SYNTAX` = 65540u;
public const val `CLUSPROP_SYNTAX_LIST_VALUE_FILETIME`: `CLUSTER_PROPERTY_SYNTAX` = 65548u;
public const val `CLUSPROP_SYNTAX_LIST_VALUE_LARGE_INTEGER`: `CLUSTER_PROPERTY_SYNTAX` = 65546u;
public const val `CLUSPROP_SYNTAX_LIST_VALUE_LONG`: `CLUSTER_PROPERTY_SYNTAX` = 65543u;
public const val `CLUSPROP_SYNTAX_LIST_VALUE_MULTI_SZ`: `CLUSTER_PROPERTY_SYNTAX` = 65541u;
public const val `CLUSPROP_SYNTAX_LIST_VALUE_PROPERTY_LIST`: `CLUSTER_PROPERTY_SYNTAX` = 65550u;
public const val `CLUSPROP_SYNTAX_LIST_VALUE_SECURITY_DESCRIPTOR`: `CLUSTER_PROPERTY_SYNTAX` = 65545u;
public const val `CLUSPROP_SYNTAX_LIST_VALUE_SZ`: `CLUSTER_PROPERTY_SYNTAX` = 65539u;
public const val `CLUSPROP_SYNTAX_LIST_VALUE_ULARGE_INTEGER`: `CLUSTER_PROPERTY_SYNTAX` = 65542u;
public const val `CLUSPROP_SYNTAX_LIST_VALUE_WORD`: `CLUSTER_PROPERTY_SYNTAX` = 65547u;
public const val `CLUSPROP_SYNTAX_NAME`: `CLUSTER_PROPERTY_SYNTAX` = 262147u;
public const val `CLUSPROP_SYNTAX_PARTITION_INFO`: `CLUSTER_PROPERTY_SYNTAX` = 524289u;
public const val `CLUSPROP_SYNTAX_PARTITION_INFO_EX`: `CLUSTER_PROPERTY_SYNTAX` = 851969u;
public const val `CLUSPROP_SYNTAX_PARTITION_INFO_EX2`: `CLUSTER_PROPERTY_SYNTAX` = 917505u;
public const val `CLUSPROP_SYNTAX_RESCLASS`: `CLUSTER_PROPERTY_SYNTAX` = 131074u;
public const val `CLUSPROP_SYNTAX_SCSI_ADDRESS`: `CLUSTER_PROPERTY_SYNTAX` = 393218u;
public const val `CLUSPROP_SYNTAX_STORAGE_DEVICE_ID_DESCRIPTOR`: `CLUSTER_PROPERTY_SYNTAX` = 983041u;
// UNSUPPORTED Rust 1521:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_SZ {
//     pub Base: CLUSPROP_VALUE,
//     pub sz: [u16; 1],
// }

// UNSUPPORTED Rust 1527:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_SZ {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLUSPROP_TYPE_DISK_GUID`: `CLUSTER_PROPERTY_TYPE` = 11;
public const val `CLUSPROP_TYPE_DISK_NUMBER`: `CLUSTER_PROPERTY_TYPE` = 7;
public const val `CLUSPROP_TYPE_DISK_SERIALNUMBER`: `CLUSTER_PROPERTY_TYPE` = 10;
public const val `CLUSPROP_TYPE_DISK_SIZE`: `CLUSTER_PROPERTY_TYPE` = 12;
public const val `CLUSPROP_TYPE_ENDMARK`: `CLUSTER_PROPERTY_TYPE` = 0;
public const val `CLUSPROP_TYPE_FTSET_INFO`: `CLUSTER_PROPERTY_TYPE` = 9;
public const val `CLUSPROP_TYPE_LIST_VALUE`: `CLUSTER_PROPERTY_TYPE` = 1;
public const val `CLUSPROP_TYPE_NAME`: `CLUSTER_PROPERTY_TYPE` = 4;
public const val `CLUSPROP_TYPE_PARTITION_INFO`: `CLUSTER_PROPERTY_TYPE` = 8;
public const val `CLUSPROP_TYPE_PARTITION_INFO_EX`: `CLUSTER_PROPERTY_TYPE` = 13;
public const val `CLUSPROP_TYPE_PARTITION_INFO_EX2`: `CLUSTER_PROPERTY_TYPE` = 14;
public const val `CLUSPROP_TYPE_RESCLASS`: `CLUSTER_PROPERTY_TYPE` = 2;
public const val `CLUSPROP_TYPE_RESERVED1`: `CLUSTER_PROPERTY_TYPE` = 3;
public const val `CLUSPROP_TYPE_SCSI_ADDRESS`: `CLUSTER_PROPERTY_TYPE` = 6;
public const val `CLUSPROP_TYPE_SIGNATURE`: `CLUSTER_PROPERTY_TYPE` = 5;
public const val `CLUSPROP_TYPE_STORAGE_DEVICE_ID_DESCRIPTOR`: `CLUSTER_PROPERTY_TYPE` = 15;
public const val `CLUSPROP_TYPE_UNKNOWN`: `CLUSTER_PROPERTY_TYPE` = -1;
public const val `CLUSPROP_TYPE_USER`: `CLUSTER_PROPERTY_TYPE` = 32768;
// UNSUPPORTED Rust 1550:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_ULARGE_INTEGER {
//     pub Base: CLUSPROP_VALUE,
//     pub li: u64,
// }

// UNSUPPORTED Rust 1556:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_ULARGE_INTEGER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1561:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_VALUE {
//     pub Syntax: CLUSPROP_SYNTAX,
//     pub cbLength: u32,
// }

// UNSUPPORTED Rust 1567:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_VALUE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1572:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSPROP_WORD {
//     pub Base: CLUSPROP_VALUE,
//     pub w: u16,
// }

// UNSUPPORTED Rust 1578:1: declaration Impl has no candidate rule
// impl Default for CLUSPROP_WORD {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLUSREG_COMMAND_NONE`: `CLUSTER_REG_COMMAND` = 0;
public const val `CLUSREG_CONDITION_EXISTS`: `CLUSTER_REG_COMMAND` = 11;
public const val `CLUSREG_CONDITION_IS_EQUAL`: `CLUSTER_REG_COMMAND` = 13;
public const val `CLUSREG_CONDITION_IS_GREATER_THAN`: `CLUSTER_REG_COMMAND` = 15;
public const val `CLUSREG_CONDITION_IS_LESS_THAN`: `CLUSTER_REG_COMMAND` = 16;
public const val `CLUSREG_CONDITION_IS_NOT_EQUAL`: `CLUSTER_REG_COMMAND` = 14;
public const val `CLUSREG_CONDITION_KEY_EXISTS`: `CLUSTER_REG_COMMAND` = 17;
public const val `CLUSREG_CONDITION_KEY_NOT_EXISTS`: `CLUSTER_REG_COMMAND` = 18;
public const val `CLUSREG_CONDITION_NOT_EXISTS`: `CLUSTER_REG_COMMAND` = 12;
public const val `CLUSREG_CONTROL_COMMAND`: `CLUSTER_REG_COMMAND` = 10;
public const val `CLUSREG_CREATE_KEY`: `CLUSTER_REG_COMMAND` = 2;
public const val `CLUSREG_DATABASE_ISOLATE_READ`: UInt = 2u;
public const val `CLUSREG_DATABASE_SYNC_WRITE_TO_ALL_NODES`: UInt = 1u;
public const val `CLUSREG_DELETE_KEY`: `CLUSTER_REG_COMMAND` = 3;
public const val `CLUSREG_DELETE_VALUE`: `CLUSTER_REG_COMMAND` = 4;
// UNSUPPORTED Rust 1598:1: non-scalar type Ptr unsupported
// pub const CLUSREG_KEYNAME_OBJECTGUIDS: windows_sys::core::PCWSTR = windows_sys::core::w!("ObjectGUIDs");

public const val `CLUSREG_LAST_COMMAND`: `CLUSTER_REG_COMMAND` = 19;
// UNSUPPORTED Rust 1600:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_AFFINITYRULE_ENABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("Enabled");

// UNSUPPORTED Rust 1601:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_AFFINITYRULE_GROUPS: windows_sys::core::PCWSTR = windows_sys::core::w!("Groups");

// UNSUPPORTED Rust 1602:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_AFFINITYRULE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Name");

// UNSUPPORTED Rust 1603:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_AFFINITYRULE_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("RuleType");

// UNSUPPORTED Rust 1604:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_CLOUDWITNESS_ACCOUNT_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AccountName");

// UNSUPPORTED Rust 1605:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_CLOUDWITNESS_CONTAINER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ContainerName");

// UNSUPPORTED Rust 1606:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_CLOUDWITNESS_ENDPOINT_INFO: windows_sys::core::PCWSTR = windows_sys::core::w!("EndpointInfo");

// UNSUPPORTED Rust 1607:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_CLOUDWITNESS_PRIMARY_KEY: windows_sys::core::PCWSTR = windows_sys::core::w!("PrimaryKey");

// UNSUPPORTED Rust 1608:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_CLOUDWITNESS_PRIMARY_TOKEN: windows_sys::core::PCWSTR = windows_sys::core::w!("PrimaryToken");

// UNSUPPORTED Rust 1609:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_CLUS_DEFAULT_NETWORK_ROLE: windows_sys::core::PCWSTR = windows_sys::core::w!("DefaultNetworkRole");

// UNSUPPORTED Rust 1610:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_CLUS_DESC: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

// UNSUPPORTED Rust 1611:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_CLUS_SD: windows_sys::core::PCWSTR = windows_sys::core::w!("Security Descriptor");

// UNSUPPORTED Rust 1612:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_CROSS_SITE_DELAY: windows_sys::core::PCWSTR = windows_sys::core::w!("CrossSiteDelay");

// UNSUPPORTED Rust 1613:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_CROSS_SITE_THRESHOLD: windows_sys::core::PCWSTR = windows_sys::core::w!("CrossSiteThreshold");

// UNSUPPORTED Rust 1614:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_CROSS_SUBNET_DELAY: windows_sys::core::PCWSTR = windows_sys::core::w!("CrossSubnetDelay");

// UNSUPPORTED Rust 1615:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_CROSS_SUBNET_THRESHOLD: windows_sys::core::PCWSTR = windows_sys::core::w!("CrossSubnetThreshold");

// UNSUPPORTED Rust 1616:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_CSV_BLOCK_CACHE: windows_sys::core::PCWSTR = windows_sys::core::w!("BlockCacheSize");

// UNSUPPORTED Rust 1617:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_CSV_MDS_SD: windows_sys::core::PCWSTR = windows_sys::core::w!("SharedVolumeSecurityDescriptor");

// UNSUPPORTED Rust 1618:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_DATABASE_READ_WRITE_MODE: windows_sys::core::PCWSTR = windows_sys::core::w!("DatabaseReadWriteMode");

// UNSUPPORTED Rust 1619:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_DDA_DEVICE_ALLOCATIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("DdaDeviceAllocations");

// UNSUPPORTED Rust 1620:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_DHCP_BACKUP_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("BackupPath");

// UNSUPPORTED Rust 1621:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_DHCP_DATABASE_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("DatabasePath");

// UNSUPPORTED Rust 1622:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_DRAIN_ON_SHUTDOWN: windows_sys::core::PCWSTR = windows_sys::core::w!("DrainOnShutdown");

// UNSUPPORTED Rust 1623:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_ENABLED_EVENT_LOGS: windows_sys::core::PCWSTR = windows_sys::core::w!("EnabledEventLogs");

// UNSUPPORTED Rust 1624:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FAILOVER_MOVE_MIGRATION_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("FailoverMoveMigrationType");

// UNSUPPORTED Rust 1625:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FILESHR_CA_TIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("CATimeout");

// UNSUPPORTED Rust 1626:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FILESHR_HIDE_SUBDIR_SHARES: windows_sys::core::PCWSTR = windows_sys::core::w!("HideSubDirShares");

// UNSUPPORTED Rust 1627:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FILESHR_IS_DFS_ROOT: windows_sys::core::PCWSTR = windows_sys::core::w!("IsDfsRoot");

// UNSUPPORTED Rust 1628:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FILESHR_MAX_USERS: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxUsers");

// UNSUPPORTED Rust 1629:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FILESHR_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("Path");

// UNSUPPORTED Rust 1630:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FILESHR_QOS_FLOWSCOPE: windows_sys::core::PCWSTR = windows_sys::core::w!("QosFlowScope");

// UNSUPPORTED Rust 1631:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FILESHR_QOS_POLICYID: windows_sys::core::PCWSTR = windows_sys::core::w!("QosPolicyId");

// UNSUPPORTED Rust 1632:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FILESHR_REMARK: windows_sys::core::PCWSTR = windows_sys::core::w!("Remark");

// UNSUPPORTED Rust 1633:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FILESHR_SD: windows_sys::core::PCWSTR = windows_sys::core::w!("Security Descriptor");

// UNSUPPORTED Rust 1634:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FILESHR_SERVER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ServerName");

// UNSUPPORTED Rust 1635:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FILESHR_SHARE_FLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("ShareFlags");

// UNSUPPORTED Rust 1636:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FILESHR_SHARE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ShareName");

// UNSUPPORTED Rust 1637:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FILESHR_SHARE_SUBDIRS: windows_sys::core::PCWSTR = windows_sys::core::w!("ShareSubDirs");

// UNSUPPORTED Rust 1638:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FIXQUORUM: windows_sys::core::PCWSTR = windows_sys::core::w!("FixQuorum");

// UNSUPPORTED Rust 1639:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FSWITNESS_ARB_DELAY: windows_sys::core::PCWSTR = windows_sys::core::w!("ArbitrationDelay");

// UNSUPPORTED Rust 1640:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FSWITNESS_IMPERSONATE_CNO: windows_sys::core::PCWSTR = windows_sys::core::w!("ImpersonateCNO");

// UNSUPPORTED Rust 1641:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FSWITNESS_SHARE_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("SharePath");

// UNSUPPORTED Rust 1642:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_FUNCTIONAL_LEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("ClusterFunctionalLevel");

// UNSUPPORTED Rust 1643:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GENAPP_COMMAND_LINE: windows_sys::core::PCWSTR = windows_sys::core::w!("CommandLine");

// UNSUPPORTED Rust 1644:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GENAPP_CURRENT_DIRECTORY: windows_sys::core::PCWSTR = windows_sys::core::w!("CurrentDirectory");

// UNSUPPORTED Rust 1645:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GENAPP_USE_NETWORK_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("UseNetworkName");

// UNSUPPORTED Rust 1646:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GENSCRIPT_SCRIPT_FILEPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("ScriptFilepath");

// UNSUPPORTED Rust 1647:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GENSVC_SERVICE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ServiceName");

// UNSUPPORTED Rust 1648:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GENSVC_STARTUP_PARAMS: windows_sys::core::PCWSTR = windows_sys::core::w!("StartupParameters");

// UNSUPPORTED Rust 1649:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GENSVC_USE_NETWORK_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("UseNetworkName");

// UNSUPPORTED Rust 1650:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GPUP_DEVICE_ALLOCATIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("GpupDeviceAllocations");

// UNSUPPORTED Rust 1651:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GROUPSET_AVAILABILITY_SET_INDEX_TO_NODE_MAPPING: windows_sys::core::PCWSTR = windows_sys::core::w!("NodeDomainInfo");

// UNSUPPORTED Rust 1652:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GROUPSET_FAULT_DOMAINS: windows_sys::core::PCWSTR = windows_sys::core::w!("FaultDomains");

// UNSUPPORTED Rust 1653:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GROUPSET_IS_AVAILABILITY_SET: windows_sys::core::PCWSTR = windows_sys::core::w!("IsAvailabilitySet");

// UNSUPPORTED Rust 1654:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GROUPSET_IS_GLOBAL: windows_sys::core::PCWSTR = windows_sys::core::w!("IsGlobal");

// UNSUPPORTED Rust 1655:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GROUPSET_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Name");

// UNSUPPORTED Rust 1656:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GROUPSET_RESERVE_NODE: windows_sys::core::PCWSTR = windows_sys::core::w!("ReserveSpareNode");

// UNSUPPORTED Rust 1657:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GROUPSET_STARTUP_COUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("StartupCount");

// UNSUPPORTED Rust 1658:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GROUPSET_STARTUP_DELAY: windows_sys::core::PCWSTR = windows_sys::core::w!("StartupDelay");

// UNSUPPORTED Rust 1659:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GROUPSET_STARTUP_SETTING: windows_sys::core::PCWSTR = windows_sys::core::w!("StartupSetting");

// UNSUPPORTED Rust 1660:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GROUPSET_STATUS_INFORMATION: windows_sys::core::PCWSTR = windows_sys::core::w!("StatusInformation");

// UNSUPPORTED Rust 1661:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GROUPSET_UPDATE_DOMAINS: windows_sys::core::PCWSTR = windows_sys::core::w!("UpdateDomains");

// UNSUPPORTED Rust 1662:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GROUP_DEPENDENCY_TIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("GroupDependencyTimeout");

// UNSUPPORTED Rust 1663:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_ANTI_AFFINITY_CLASS_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AntiAffinityClassNames");

// UNSUPPORTED Rust 1664:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_CCF_EPOCH: windows_sys::core::PCWSTR = windows_sys::core::w!("CCFEpoch");

// UNSUPPORTED Rust 1665:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_CCF_EPOCH_HIGH: windows_sys::core::PCWSTR = windows_sys::core::w!("CCFEpochHigh");

// UNSUPPORTED Rust 1666:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_COLD_START_SETTING: windows_sys::core::PCWSTR = windows_sys::core::w!("ColdStartSetting");

// UNSUPPORTED Rust 1667:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_DEFAULT_OWNER: windows_sys::core::PCWSTR = windows_sys::core::w!("DefaultOwner");

// UNSUPPORTED Rust 1668:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_DESC: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

// UNSUPPORTED Rust 1669:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_FAILBACK_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("AutoFailbackType");

// UNSUPPORTED Rust 1670:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_FAILBACK_WIN_END: windows_sys::core::PCWSTR = windows_sys::core::w!("FailbackWindowEnd");

// UNSUPPORTED Rust 1671:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_FAILBACK_WIN_START: windows_sys::core::PCWSTR = windows_sys::core::w!("FailbackWindowStart");

// UNSUPPORTED Rust 1672:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_FAILOVER_PERIOD: windows_sys::core::PCWSTR = windows_sys::core::w!("FailoverPeriod");

// UNSUPPORTED Rust 1673:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_FAILOVER_THRESHOLD: windows_sys::core::PCWSTR = windows_sys::core::w!("FailoverThreshold");

// UNSUPPORTED Rust 1674:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_FAULT_DOMAIN: windows_sys::core::PCWSTR = windows_sys::core::w!("FaultDomain");

// UNSUPPORTED Rust 1675:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_LOCK_MOVE: windows_sys::core::PCWSTR = windows_sys::core::w!("LockedFromMoving");

// UNSUPPORTED Rust 1676:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Name");

// UNSUPPORTED Rust 1677:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_PERSISTENT_STATE: windows_sys::core::PCWSTR = windows_sys::core::w!("PersistentState");

// UNSUPPORTED Rust 1678:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_PLACEMENT_OPTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("PlacementOptions");

// UNSUPPORTED Rust 1679:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_PREFERRED_SITE: windows_sys::core::PCWSTR = windows_sys::core::w!("PreferredSite");

// UNSUPPORTED Rust 1680:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_PRIORITY: windows_sys::core::PCWSTR = windows_sys::core::w!("Priority");

// UNSUPPORTED Rust 1681:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_RESILIENCY_PERIOD: windows_sys::core::PCWSTR = windows_sys::core::w!("ResiliencyPeriod");

// UNSUPPORTED Rust 1682:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_START_DELAY: windows_sys::core::PCWSTR = windows_sys::core::w!("GroupStartDelay");

// UNSUPPORTED Rust 1683:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_STATUS_INFORMATION: windows_sys::core::PCWSTR = windows_sys::core::w!("StatusInformation");

// UNSUPPORTED Rust 1684:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("GroupType");

// UNSUPPORTED Rust 1685:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_GRP_UPDATE_DOMAIN: windows_sys::core::PCWSTR = windows_sys::core::w!("UpdateDomain");

// UNSUPPORTED Rust 1686:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IGNORE_PERSISTENT_STATE: windows_sys::core::PCWSTR = windows_sys::core::w!("IgnorePersistentStateOnStartup");

// UNSUPPORTED Rust 1687:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_ADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("Address");

// UNSUPPORTED Rust 1688:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_DHCP_ADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("DhcpAddress");

// UNSUPPORTED Rust 1689:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_DHCP_SERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("DhcpServer");

// UNSUPPORTED Rust 1690:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_DHCP_SUBNET_MASK: windows_sys::core::PCWSTR = windows_sys::core::w!("DhcpSubnetMask");

// UNSUPPORTED Rust 1691:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_ENABLE_DHCP: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableDhcp");

// UNSUPPORTED Rust 1692:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_ENABLE_NETBIOS: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableNetBIOS");

// UNSUPPORTED Rust 1693:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_LEASE_OBTAINED_TIME: windows_sys::core::PCWSTR = windows_sys::core::w!("LeaseObtainedTime");

// UNSUPPORTED Rust 1694:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_LEASE_TERMINATES_TIME: windows_sys::core::PCWSTR = windows_sys::core::w!("LeaseExpiresTime");

// UNSUPPORTED Rust 1695:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_NETWORK: windows_sys::core::PCWSTR = windows_sys::core::w!("Network");

// UNSUPPORTED Rust 1696:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_OVERRIDE_ADDRMATCH: windows_sys::core::PCWSTR = windows_sys::core::w!("OverrideAddressMatch");

// UNSUPPORTED Rust 1697:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_PROBE_FAILURE_THRESHOLD: windows_sys::core::PCWSTR = windows_sys::core::w!("ProbeFailureThreshold");

// UNSUPPORTED Rust 1698:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_PROBE_PORT: windows_sys::core::PCWSTR = windows_sys::core::w!("ProbePort");

// UNSUPPORTED Rust 1699:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_SHARED_NETNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("SharedNetname");

// UNSUPPORTED Rust 1700:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_SUBNET_MASK: windows_sys::core::PCWSTR = windows_sys::core::w!("SubnetMask");

// UNSUPPORTED Rust 1701:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_T1: windows_sys::core::PCWSTR = windows_sys::core::w!("T1");

// UNSUPPORTED Rust 1702:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPADDR_T2: windows_sys::core::PCWSTR = windows_sys::core::w!("T2");

// UNSUPPORTED Rust 1703:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPV6_NATIVE_ADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("Address");

// UNSUPPORTED Rust 1704:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPV6_NATIVE_NETWORK: windows_sys::core::PCWSTR = windows_sys::core::w!("Network");

// UNSUPPORTED Rust 1705:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPV6_NATIVE_PREFIX_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("PrefixLength");

// UNSUPPORTED Rust 1706:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPV6_TUNNEL_ADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("Address");

// UNSUPPORTED Rust 1707:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_IPV6_TUNNEL_TUNNELTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("TunnelType");

// UNSUPPORTED Rust 1708:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_LAST_RECENT_EVENTS_RESET_TIME: windows_sys::core::PCWSTR = windows_sys::core::w!("RecentEventsResetTime");

// UNSUPPORTED Rust 1709:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_LOG_FILE_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("LogFilePath");

// UNSUPPORTED Rust 1710:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_MESSAGE_BUFFER_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("MessageBufferLength");

// UNSUPPORTED Rust 1711:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_MIXED_MODE: windows_sys::core::PCWSTR = windows_sys::core::w!("MixedMode");

// UNSUPPORTED Rust 1712:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETFT_IPSEC_ENABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("NetftIPSecEnabled");

// UNSUPPORTED Rust 1713:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETIFACE_ADAPTER_ID: windows_sys::core::PCWSTR = windows_sys::core::w!("AdapterId");

// UNSUPPORTED Rust 1714:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETIFACE_ADAPTER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Adapter");

// UNSUPPORTED Rust 1715:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETIFACE_ADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("Address");

// UNSUPPORTED Rust 1716:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETIFACE_DESC: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

// UNSUPPORTED Rust 1717:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETIFACE_DHCP_ENABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("DhcpEnabled");

// UNSUPPORTED Rust 1718:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETIFACE_IPV4_ADDRESSES: windows_sys::core::PCWSTR = windows_sys::core::w!("IPv4Addresses");

// UNSUPPORTED Rust 1719:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETIFACE_IPV6_ADDRESSES: windows_sys::core::PCWSTR = windows_sys::core::w!("IPv6Addresses");

// UNSUPPORTED Rust 1720:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETIFACE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Name");

// UNSUPPORTED Rust 1721:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETIFACE_NETWORK: windows_sys::core::PCWSTR = windows_sys::core::w!("Network");

// UNSUPPORTED Rust 1722:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETIFACE_NODE: windows_sys::core::PCWSTR = windows_sys::core::w!("Node");

// UNSUPPORTED Rust 1723:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_AD_AWARE: windows_sys::core::PCWSTR = windows_sys::core::w!("ADAware");

// UNSUPPORTED Rust 1724:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_ALIASES: windows_sys::core::PCWSTR = windows_sys::core::w!("Aliases");

// UNSUPPORTED Rust 1725:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_CONTAINERGUID: windows_sys::core::PCWSTR = windows_sys::core::w!("CryptoContainerGUID");

// UNSUPPORTED Rust 1726:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_CREATING_DC: windows_sys::core::PCWSTR = windows_sys::core::w!("CreatingDC");

// UNSUPPORTED Rust 1727:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_DNN_DISABLE_CLONES: windows_sys::core::PCWSTR = windows_sys::core::w!("DisableClones");

// UNSUPPORTED Rust 1728:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_DNS_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DnsName");

// UNSUPPORTED Rust 1729:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_DNS_SUFFIX: windows_sys::core::PCWSTR = windows_sys::core::w!("DnsSuffix");

// UNSUPPORTED Rust 1730:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_EXCLUDE_NETWORKS: windows_sys::core::PCWSTR = windows_sys::core::w!("ExcludeNetworks");

// UNSUPPORTED Rust 1731:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_HOST_TTL: windows_sys::core::PCWSTR = windows_sys::core::w!("HostRecordTTL");

// UNSUPPORTED Rust 1732:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_IN_USE_NETWORKS: windows_sys::core::PCWSTR = windows_sys::core::w!("InUseNetworks");

// UNSUPPORTED Rust 1733:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_LAST_DNS_UPDATE: windows_sys::core::PCWSTR = windows_sys::core::w!("LastDNSUpdateTime");

// UNSUPPORTED Rust 1734:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Name");

// UNSUPPORTED Rust 1735:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_OBJECT_ID: windows_sys::core::PCWSTR = windows_sys::core::w!("ObjectGUID");

// UNSUPPORTED Rust 1736:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_PUBLISH_PTR: windows_sys::core::PCWSTR = windows_sys::core::w!("PublishPTRRecords");

// UNSUPPORTED Rust 1737:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_REGISTER_ALL_IP: windows_sys::core::PCWSTR = windows_sys::core::w!("RegisterAllProvidersIP");

// UNSUPPORTED Rust 1738:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_REMAP_PIPE_NAMES: windows_sys::core::PCWSTR = windows_sys::core::w!("RemapPipeNames");

// UNSUPPORTED Rust 1739:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_REMOVEVCO_ONDELETE: windows_sys::core::PCWSTR = windows_sys::core::w!("DeleteVcoOnResCleanup");

// UNSUPPORTED Rust 1740:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_RESOURCE_DATA: windows_sys::core::PCWSTR = windows_sys::core::w!("ResourceData");

// UNSUPPORTED Rust 1741:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_STATUS_DNS: windows_sys::core::PCWSTR = windows_sys::core::w!("StatusDNS");

// UNSUPPORTED Rust 1742:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_STATUS_KERBEROS: windows_sys::core::PCWSTR = windows_sys::core::w!("StatusKerberos");

// UNSUPPORTED Rust 1743:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_STATUS_NETBIOS: windows_sys::core::PCWSTR = windows_sys::core::w!("StatusNetBIOS");

// UNSUPPORTED Rust 1744:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NETNAME_VCO_CONTAINER: windows_sys::core::PCWSTR = windows_sys::core::w!("VcoContainer");

// UNSUPPORTED Rust 1745:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NET_ADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("Address");

// UNSUPPORTED Rust 1746:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NET_ADDRESS_MASK: windows_sys::core::PCWSTR = windows_sys::core::w!("AddressMask");

// UNSUPPORTED Rust 1747:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NET_AUTOMETRIC: windows_sys::core::PCWSTR = windows_sys::core::w!("AutoMetric");

// UNSUPPORTED Rust 1748:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NET_DESC: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

// UNSUPPORTED Rust 1749:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NET_IPV4_ADDRESSES: windows_sys::core::PCWSTR = windows_sys::core::w!("IPv4Addresses");

// UNSUPPORTED Rust 1750:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NET_IPV4_PREFIXLENGTHS: windows_sys::core::PCWSTR = windows_sys::core::w!("IPv4PrefixLengths");

// UNSUPPORTED Rust 1751:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NET_IPV6_ADDRESSES: windows_sys::core::PCWSTR = windows_sys::core::w!("IPv6Addresses");

// UNSUPPORTED Rust 1752:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NET_IPV6_PREFIXLENGTHS: windows_sys::core::PCWSTR = windows_sys::core::w!("IPv6PrefixLengths");

// UNSUPPORTED Rust 1753:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NET_METRIC: windows_sys::core::PCWSTR = windows_sys::core::w!("Metric");

// UNSUPPORTED Rust 1754:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NET_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Name");

// UNSUPPORTED Rust 1755:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NET_RDMA_CAPABLE: windows_sys::core::PCWSTR = windows_sys::core::w!("RdmaCapable");

// UNSUPPORTED Rust 1756:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NET_ROLE: windows_sys::core::PCWSTR = windows_sys::core::w!("Role");

// UNSUPPORTED Rust 1757:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NET_RSS_CAPABLE: windows_sys::core::PCWSTR = windows_sys::core::w!("RssCapable");

// UNSUPPORTED Rust 1758:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NET_SPEED: windows_sys::core::PCWSTR = windows_sys::core::w!("LinkSpeed");

// UNSUPPORTED Rust 1759:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_BUILD_NUMBER: windows_sys::core::PCWSTR = windows_sys::core::w!("BuildNumber");

// UNSUPPORTED Rust 1760:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_CSDVERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("CSDVersion");

// UNSUPPORTED Rust 1761:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_DESC: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

// UNSUPPORTED Rust 1762:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_DRAIN_STATUS: windows_sys::core::PCWSTR = windows_sys::core::w!("NodeDrainStatus");

// UNSUPPORTED Rust 1763:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_DRAIN_TARGET: windows_sys::core::PCWSTR = windows_sys::core::w!("NodeDrainTarget");

// UNSUPPORTED Rust 1764:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_DYNAMIC_WEIGHT: windows_sys::core::PCWSTR = windows_sys::core::w!("DynamicWeight");

// UNSUPPORTED Rust 1765:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_FAULT_DOMAIN: windows_sys::core::PCWSTR = windows_sys::core::w!("FaultDomain");

// UNSUPPORTED Rust 1766:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_FDID: windows_sys::core::PCWSTR = windows_sys::core::w!("FaultDomainId");

// UNSUPPORTED Rust 1767:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_HIGHEST_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("NodeHighestVersion");

// UNSUPPORTED Rust 1768:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_IS_PRIMARY: windows_sys::core::PCWSTR = windows_sys::core::w!("IsPrimary");

// UNSUPPORTED Rust 1769:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_LOWEST_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("NodeLowestVersion");

// UNSUPPORTED Rust 1770:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_MAJOR_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("MajorVersion");

// UNSUPPORTED Rust 1771:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_MANUFACTURER: windows_sys::core::PCWSTR = windows_sys::core::w!("Manufacturer");

// UNSUPPORTED Rust 1772:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_MINOR_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("MinorVersion");

// UNSUPPORTED Rust 1773:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_MODEL: windows_sys::core::PCWSTR = windows_sys::core::w!("Model");

// UNSUPPORTED Rust 1774:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("NodeName");

// UNSUPPORTED Rust 1775:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_NEEDS_PQ: windows_sys::core::PCWSTR = windows_sys::core::w!("NeedsPreventQuorum");

// UNSUPPORTED Rust 1776:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_SERIALNUMBER: windows_sys::core::PCWSTR = windows_sys::core::w!("SerialNumber");

// UNSUPPORTED Rust 1777:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_STATUS_INFO: windows_sys::core::PCWSTR = windows_sys::core::w!("StatusInformation");

// UNSUPPORTED Rust 1778:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_UNIQUEID: windows_sys::core::PCWSTR = windows_sys::core::w!("UniqueID");

// UNSUPPORTED Rust 1779:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_NODE_WEIGHT: windows_sys::core::PCWSTR = windows_sys::core::w!("NodeWeight");

// UNSUPPORTED Rust 1780:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_CSVBLOCKCACHE: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableBlockCache");

// UNSUPPORTED Rust 1781:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_CSVSNAPSHOTAGELIMIT: windows_sys::core::PCWSTR = windows_sys::core::w!("SnapshotAgeLimit");

// UNSUPPORTED Rust 1782:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_CSVSNAPSHOTDIFFAREASIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("SnapshotDiffSize");

// UNSUPPORTED Rust 1783:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_CSVWRITETHROUGH: windows_sys::core::PCWSTR = windows_sys::core::w!("CsvEnforceWriteThrough");

// UNSUPPORTED Rust 1784:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_DISKARBINTERVAL: windows_sys::core::PCWSTR = windows_sys::core::w!("DiskArbInterval");

// UNSUPPORTED Rust 1785:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_DISKARBTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("DiskArbType");

// UNSUPPORTED Rust 1786:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_DISKGUID: windows_sys::core::PCWSTR = windows_sys::core::w!("DiskGuid");

// UNSUPPORTED Rust 1787:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_DISKIDGUID: windows_sys::core::PCWSTR = windows_sys::core::w!("DiskIdGuid");

// UNSUPPORTED Rust 1788:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_DISKIDTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("DiskIdType");

// UNSUPPORTED Rust 1789:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_DISKIODELAY: windows_sys::core::PCWSTR = windows_sys::core::w!("MaxIoLatency");

// UNSUPPORTED Rust 1790:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_DISKPATH: windows_sys::core::PCWSTR = windows_sys::core::w!("DiskPath");

// UNSUPPORTED Rust 1791:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_DISKRECOVERYACTION: windows_sys::core::PCWSTR = windows_sys::core::w!("DiskRecoveryAction");

// UNSUPPORTED Rust 1792:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_DISKRELOAD: windows_sys::core::PCWSTR = windows_sys::core::w!("DiskReload");

// UNSUPPORTED Rust 1793:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_DISKRUNCHKDSK: windows_sys::core::PCWSTR = windows_sys::core::w!("DiskRunChkDsk");

// UNSUPPORTED Rust 1794:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_DISKSIGNATURE: windows_sys::core::PCWSTR = windows_sys::core::w!("DiskSignature");

// UNSUPPORTED Rust 1795:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_DISKUNIQUEIDS: windows_sys::core::PCWSTR = windows_sys::core::w!("DiskUniqueIds");

// UNSUPPORTED Rust 1796:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_DISKVOLUMEINFO: windows_sys::core::PCWSTR = windows_sys::core::w!("DiskVolumeInfo");

// UNSUPPORTED Rust 1797:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_FASTONLINEARBITRATE: windows_sys::core::PCWSTR = windows_sys::core::w!("FastOnlineArbitrate");

// UNSUPPORTED Rust 1798:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_MAINTMODE: windows_sys::core::PCWSTR = windows_sys::core::w!("MaintenanceMode");

// UNSUPPORTED Rust 1799:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_MIGRATEFIXUP: windows_sys::core::PCWSTR = windows_sys::core::w!("MigrateDriveLetters");

// UNSUPPORTED Rust 1800:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_SPACEIDGUID: windows_sys::core::PCWSTR = windows_sys::core::w!("VirtualDiskId");

// UNSUPPORTED Rust 1801:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PHYSDISK_VOLSNAPACTIVATETIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("VolsnapActivateTimeout");

// UNSUPPORTED Rust 1802:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PLACEMENT_OPTIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("PlacementOptions");

// UNSUPPORTED Rust 1803:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PLUMB_ALL_CROSS_SUBNET_ROUTES: windows_sys::core::PCWSTR = windows_sys::core::w!("PlumbAllCrossSubnetRoutes");

// UNSUPPORTED Rust 1804:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PREVENTQUORUM: windows_sys::core::PCWSTR = windows_sys::core::w!("PreventQuorum");

// UNSUPPORTED Rust 1805:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PRTSPOOL_DEFAULT_SPOOL_DIR: windows_sys::core::PCWSTR = windows_sys::core::w!("DefaultSpoolDirectory");

// UNSUPPORTED Rust 1806:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_PRTSPOOL_TIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("JobCompletionTimeout");

// UNSUPPORTED Rust 1807:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_QUARANTINE_DURATION: windows_sys::core::PCWSTR = windows_sys::core::w!("QuarantineDuration");

// UNSUPPORTED Rust 1808:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_QUARANTINE_THRESHOLD: windows_sys::core::PCWSTR = windows_sys::core::w!("QuarantineThreshold");

// UNSUPPORTED Rust 1809:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_QUORUM_ARBITRATION_TIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("QuorumArbitrationTimeMax");

// UNSUPPORTED Rust 1810:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESILIENCY_DEFAULT_SECONDS: windows_sys::core::PCWSTR = windows_sys::core::w!("ResiliencyDefaultPeriod");

// UNSUPPORTED Rust 1811:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESILIENCY_LEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("ResiliencyLevel");

// UNSUPPORTED Rust 1812:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESTYPE_ADMIN_EXTENSIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("AdminExtensions");

// UNSUPPORTED Rust 1813:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESTYPE_DEADLOCK_TIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("DeadlockTimeout");

// UNSUPPORTED Rust 1814:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESTYPE_DESC: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

// UNSUPPORTED Rust 1815:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESTYPE_DLL_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("DllName");

// UNSUPPORTED Rust 1816:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESTYPE_DUMP_LOG_QUERY: windows_sys::core::PCWSTR = windows_sys::core::w!("DumpLogQuery");

// UNSUPPORTED Rust 1817:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESTYPE_DUMP_POLICY: windows_sys::core::PCWSTR = windows_sys::core::w!("DumpPolicy");

// UNSUPPORTED Rust 1818:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESTYPE_DUMP_SERVICES: windows_sys::core::PCWSTR = windows_sys::core::w!("DumpServices");

// UNSUPPORTED Rust 1819:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESTYPE_ENABLED_EVENT_LOGS: windows_sys::core::PCWSTR = windows_sys::core::w!("EnabledEventLogs");

// UNSUPPORTED Rust 1820:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESTYPE_IS_ALIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("IsAlivePollInterval");

// UNSUPPORTED Rust 1821:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESTYPE_LOOKS_ALIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("LooksAlivePollInterval");

// UNSUPPORTED Rust 1822:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESTYPE_MAX_MONITORS: windows_sys::core::PCWSTR = windows_sys::core::w!("MaximumMonitors");

// UNSUPPORTED Rust 1823:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESTYPE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Name");

// UNSUPPORTED Rust 1824:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESTYPE_PENDING_TIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("PendingTimeout");

// UNSUPPORTED Rust 1825:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESTYPE_WPR_PROFILES: windows_sys::core::PCWSTR = windows_sys::core::w!("WprProfiles");

// UNSUPPORTED Rust 1826:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RESTYPE_WPR_START_AFTER: windows_sys::core::PCWSTR = windows_sys::core::w!("WprStartAfter");

// UNSUPPORTED Rust 1827:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_DATA1: windows_sys::core::PCWSTR = windows_sys::core::w!("ResourceSpecificData1");

// UNSUPPORTED Rust 1828:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_DATA2: windows_sys::core::PCWSTR = windows_sys::core::w!("ResourceSpecificData2");

// UNSUPPORTED Rust 1829:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_DEADLOCK_TIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("DeadlockTimeout");

// UNSUPPORTED Rust 1830:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_DESC: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

// UNSUPPORTED Rust 1831:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_EMBEDDED_FAILURE_ACTION: windows_sys::core::PCWSTR = windows_sys::core::w!("EmbeddedFailureAction");

// UNSUPPORTED Rust 1832:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_IS_ALIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("IsAlivePollInterval");

// UNSUPPORTED Rust 1833:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_LAST_OPERATION_STATUS_CODE: windows_sys::core::PCWSTR = windows_sys::core::w!("LastOperationStatusCode");

// UNSUPPORTED Rust 1834:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_LOOKS_ALIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("LooksAlivePollInterval");

// UNSUPPORTED Rust 1835:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_MONITOR_PID: windows_sys::core::PCWSTR = windows_sys::core::w!("MonitorProcessId");

// UNSUPPORTED Rust 1836:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Name");

// UNSUPPORTED Rust 1837:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_PENDING_TIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("PendingTimeout");

// UNSUPPORTED Rust 1838:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_PERSISTENT_STATE: windows_sys::core::PCWSTR = windows_sys::core::w!("PersistentState");

// UNSUPPORTED Rust 1839:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_RESTART_ACTION: windows_sys::core::PCWSTR = windows_sys::core::w!("RestartAction");

// UNSUPPORTED Rust 1840:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_RESTART_DELAY: windows_sys::core::PCWSTR = windows_sys::core::w!("RestartDelay");

// UNSUPPORTED Rust 1841:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_RESTART_PERIOD: windows_sys::core::PCWSTR = windows_sys::core::w!("RestartPeriod");

// UNSUPPORTED Rust 1842:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_RESTART_THRESHOLD: windows_sys::core::PCWSTR = windows_sys::core::w!("RestartThreshold");

// UNSUPPORTED Rust 1843:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_RETRY_PERIOD_ON_FAILURE: windows_sys::core::PCWSTR = windows_sys::core::w!("RetryPeriodOnFailure");

// UNSUPPORTED Rust 1844:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_SEPARATE_MONITOR: windows_sys::core::PCWSTR = windows_sys::core::w!("SeparateMonitor");

// UNSUPPORTED Rust 1845:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_STATUS: windows_sys::core::PCWSTR = windows_sys::core::w!("ResourceSpecificStatus");

// UNSUPPORTED Rust 1846:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_STATUS_INFORMATION: windows_sys::core::PCWSTR = windows_sys::core::w!("StatusInformation");

// UNSUPPORTED Rust 1847:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_RES_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("Type");

// UNSUPPORTED Rust 1848:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_ROUTE_HISTORY_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("RouteHistoryLength");

// UNSUPPORTED Rust 1849:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_SAME_SUBNET_DELAY: windows_sys::core::PCWSTR = windows_sys::core::w!("SameSubnetDelay");

// UNSUPPORTED Rust 1850:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_SAME_SUBNET_THRESHOLD: windows_sys::core::PCWSTR = windows_sys::core::w!("SameSubnetThreshold");

// UNSUPPORTED Rust 1851:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_SHUTDOWN_TIMEOUT_MINUTES: windows_sys::core::PCWSTR = windows_sys::core::w!("ShutdownTimeoutInMinutes");

// UNSUPPORTED Rust 1852:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_SOFS_SMBASYMMETRYMODE: windows_sys::core::PCWSTR = windows_sys::core::w!("SmbAsymmetryMode");

// UNSUPPORTED Rust 1853:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_START_MEMORY: windows_sys::core::PCWSTR = windows_sys::core::w!("StartMemory");

// UNSUPPORTED Rust 1854:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_DESCRIPTION: windows_sys::core::PCWSTR = windows_sys::core::w!("VirtualDiskDescription");

// UNSUPPORTED Rust 1855:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_HEALTH: windows_sys::core::PCWSTR = windows_sys::core::w!("VirtualDiskHealth");

// UNSUPPORTED Rust 1856:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("VirtualDiskName");

// UNSUPPORTED Rust 1857:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_POOLARBITRATE: windows_sys::core::PCWSTR = windows_sys::core::w!("Arbitrate");

// UNSUPPORTED Rust 1858:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_POOLCONSUMEDCAPACITY: windows_sys::core::PCWSTR = windows_sys::core::w!("ConsumedCapacity");

// UNSUPPORTED Rust 1859:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_POOLDESC: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

// UNSUPPORTED Rust 1860:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_POOLDRIVEIDS: windows_sys::core::PCWSTR = windows_sys::core::w!("DriveIds");

// UNSUPPORTED Rust 1861:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_POOLHEALTH: windows_sys::core::PCWSTR = windows_sys::core::w!("Health");

// UNSUPPORTED Rust 1862:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_POOLIDGUID: windows_sys::core::PCWSTR = windows_sys::core::w!("PoolId");

// UNSUPPORTED Rust 1863:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_POOLNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Name");

// UNSUPPORTED Rust 1864:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_POOLQUORUMSHARE: windows_sys::core::PCWSTR = windows_sys::core::w!("PoolQuorumShare");

// UNSUPPORTED Rust 1865:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_POOLQUORUMUSERACCOUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("PoolQuorumUserAccount");

// UNSUPPORTED Rust 1866:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_POOLREEVALTIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("ReEvaluatePlacementTimeout");

// UNSUPPORTED Rust 1867:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_POOLSTATE: windows_sys::core::PCWSTR = windows_sys::core::w!("State");

// UNSUPPORTED Rust 1868:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_POOLTOTALCAPACITY: windows_sys::core::PCWSTR = windows_sys::core::w!("TotalCapacity");

// UNSUPPORTED Rust 1869:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_PROVISIONING: windows_sys::core::PCWSTR = windows_sys::core::w!("VirtualDiskProvisioning");

// UNSUPPORTED Rust 1870:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_RESILIENCYCOLUMNS: windows_sys::core::PCWSTR = windows_sys::core::w!("VirtualDiskResiliencyColumns");

// UNSUPPORTED Rust 1871:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_RESILIENCYINTERLEAVE: windows_sys::core::PCWSTR = windows_sys::core::w!("VirtualDiskResiliencyInterleave");

// UNSUPPORTED Rust 1872:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_RESILIENCYTYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("VirtualDiskResiliencyType");

// UNSUPPORTED Rust 1873:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_STORAGESPACE_STATE: windows_sys::core::PCWSTR = windows_sys::core::w!("VirtualDiskState");

// UNSUPPORTED Rust 1874:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_UPGRADE_VERSION: windows_sys::core::PCWSTR = windows_sys::core::w!("ClusterUpgradeVersion");

// UNSUPPORTED Rust 1875:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_VIP_ADAPTER_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("AdapterName");

// UNSUPPORTED Rust 1876:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_VIP_ADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("Address");

// UNSUPPORTED Rust 1877:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_VIP_PREFIX_LENGTH: windows_sys::core::PCWSTR = windows_sys::core::w!("PrefixLength");

// UNSUPPORTED Rust 1878:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_VIP_RDID: windows_sys::core::PCWSTR = windows_sys::core::w!("RDID");

// UNSUPPORTED Rust 1879:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_VIP_VSID: windows_sys::core::PCWSTR = windows_sys::core::w!("VSID");

// UNSUPPORTED Rust 1880:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_VIRTUAL_NUMA_COUNT: windows_sys::core::PCWSTR = windows_sys::core::w!("VirtualNumaCount");

// UNSUPPORTED Rust 1881:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_VSSTASK_APPNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ApplicationName");

// UNSUPPORTED Rust 1882:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_VSSTASK_APPPARAMS: windows_sys::core::PCWSTR = windows_sys::core::w!("ApplicationParams");

// UNSUPPORTED Rust 1883:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_VSSTASK_CURRENTDIRECTORY: windows_sys::core::PCWSTR = windows_sys::core::w!("CurrentDirectory");

// UNSUPPORTED Rust 1884:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_VSSTASK_TRIGGERARRAY: windows_sys::core::PCWSTR = windows_sys::core::w!("TriggerArray");

// UNSUPPORTED Rust 1885:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_WINS_BACKUP_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("BackupPath");

// UNSUPPORTED Rust 1886:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_WINS_DATABASE_PATH: windows_sys::core::PCWSTR = windows_sys::core::w!("DatabasePath");

// UNSUPPORTED Rust 1887:1: non-scalar type Ptr unsupported
// pub const CLUSREG_NAME_WITNESS_DYNAMIC_WEIGHT: windows_sys::core::PCWSTR = windows_sys::core::w!("WitnessDynamicWeight");

public const val `CLUSREG_READ_ERROR`: `CLUSTER_REG_COMMAND` = 9;
public const val `CLUSREG_READ_KEY`: `CLUSTER_REG_COMMAND` = 7;
public const val `CLUSREG_READ_VALUE`: `CLUSTER_REG_COMMAND` = 8;
public const val `CLUSREG_SET_KEY_SECURITY`: `CLUSTER_REG_COMMAND` = 5;
public const val `CLUSREG_SET_VALUE`: `CLUSTER_REG_COMMAND` = 1;
public const val `CLUSREG_VALUE_DELETED`: `CLUSTER_REG_COMMAND` = 6;
public const val `CLUSRESDLL_STATUS_DO_NOT_COLLECT_WER_REPORT`: UInt = 1073741824u;
public const val `CLUSRESDLL_STATUS_DUMP_NOW`: UInt = 2147483648u;
public const val `CLUSRESDLL_STATUS_INSUFFICIENT_MEMORY`: UInt = 16u;
public const val `CLUSRESDLL_STATUS_INSUFFICIENT_OTHER_RESOURCES`: UInt = 64u;
public const val `CLUSRESDLL_STATUS_INSUFFICIENT_PROCESSOR`: UInt = 32u;
public const val `CLUSRESDLL_STATUS_INVALID_PARAMETERS`: UInt = 128u;
public const val `CLUSRESDLL_STATUS_NETWORK_NOT_AVAILABLE`: UInt = 256u;
public const val `CLUSRESDLL_STATUS_OFFLINE_BUSY`: UInt = 1u;
public const val `CLUSRESDLL_STATUS_OFFLINE_DESTINATION_REJECTED`: UInt = 8u;
public const val `CLUSRESDLL_STATUS_OFFLINE_DESTINATION_THROTTLED`: UInt = 4u;
public const val `CLUSRESDLL_STATUS_OFFLINE_SOURCE_THROTTLED`: UInt = 2u;
public const val `CLUSRES_DISABLE_WPR_WATCHDOG_FOR_OFFLINE_CALLS`: UInt = 2u;
public const val `CLUSRES_DISABLE_WPR_WATCHDOG_FOR_ONLINE_CALLS`: UInt = 1u;
// UNSUPPORTED Rust 1907:1: non-scalar type Ptr unsupported
// pub const CLUSRES_NAME_GET_OPERATION_CONTEXT_FLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("Flags");

public const val `CLUSRES_STATUS_APPLICATION_READY`: ULong = 256uL;
public const val `CLUSRES_STATUS_EMBEDDED_FAILURE`: ULong = 2uL;
public const val `CLUSRES_STATUS_FAILED_DUE_TO_INSUFFICIENT_CPU`: ULong = 4uL;
public const val `CLUSRES_STATUS_FAILED_DUE_TO_INSUFFICIENT_GENERIC_RESOURCES`: ULong = 16uL;
public const val `CLUSRES_STATUS_FAILED_DUE_TO_INSUFFICIENT_MEMORY`: ULong = 8uL;
public const val `CLUSRES_STATUS_LOCKED_MODE`: ULong = 1uL;
public const val `CLUSRES_STATUS_NETWORK_FAILURE`: ULong = 32uL;
public const val `CLUSRES_STATUS_OFFLINE_NOT_LOCAL_DISK_OWNER`: ULong = 512uL;
public const val `CLUSRES_STATUS_OS_HEARTBEAT`: ULong = 128uL;
public const val `CLUSRES_STATUS_UNMONITORED`: ULong = 64uL;
public typealias `CLUSTERSET_OBJECT_TYPE` = Int;
public const val `CLUSTERSET_OBJECT_TYPE_DATABASE`: `CLUSTERSET_OBJECT_TYPE` = 3;
public const val `CLUSTERSET_OBJECT_TYPE_MEMBER`: `CLUSTERSET_OBJECT_TYPE` = 1;
public const val `CLUSTERSET_OBJECT_TYPE_NONE`: `CLUSTERSET_OBJECT_TYPE` = 0;
public const val `CLUSTERSET_OBJECT_TYPE_WORKLOAD`: `CLUSTERSET_OBJECT_TYPE` = 2;
// UNSUPPORTED Rust 1923:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTERVERSIONINFO {
//     pub dwVersionInfoSize: u32,
//     pub MajorVersion: u16,
//     pub MinorVersion: u16,
//     pub BuildNumber: u16,
//     pub szVendorId: [u16; 64],
//     pub szCSDVersion: [u16; 64],
//     pub dwClusterHighestVersion: u32,
//     pub dwClusterLowestVersion: u32,
//     pub dwFlags: u32,
//     pub dwReserved: u32,
// }

// UNSUPPORTED Rust 1937:1: declaration Impl has no candidate rule
// impl Default for CLUSTERVERSIONINFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1942:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTERVERSIONINFO_NT4 {
//     pub dwVersionInfoSize: u32,
//     pub MajorVersion: u16,
//     pub MinorVersion: u16,
//     pub BuildNumber: u16,
//     pub szVendorId: [u16; 64],
//     pub szCSDVersion: [u16; 64],
// }

// UNSUPPORTED Rust 1952:1: declaration Impl has no candidate rule
// impl Default for CLUSTERVERSIONINFO_NT4 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1957:1: non-scalar type Ptr unsupported
// pub const CLUSTER_ADD_EVICT_DELAY: windows_sys::core::PCWSTR = windows_sys::core::w!("AddEvictDelay");

// UNSUPPORTED Rust 1958:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUSTER_AVAILABILITY_SET_CONFIG {
//     pub dwVersion: u32,
//     pub dwUpdateDomains: u32,
//     pub dwFaultDomains: u32,
//     pub bReserveSpareNode: windows_sys::core::BOOL,
// }

public const val `CLUSTER_AVAILABILITY_SET_CONFIG_V1`: UInt = 1u;
// UNSUPPORTED Rust 1967:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_BATCH_COMMAND {
//     pub Command: CLUSTER_REG_COMMAND,
//     pub dwOptions: u32,
//     pub wzName: windows_sys::core::PCWSTR,
//     pub lpData: *const u8,
//     pub cbData: u32,
// }

// UNSUPPORTED Rust 1976:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_BATCH_COMMAND {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CLUSTER_CHANGE` = Int;
public const val `CLUSTER_CHANGE_ALL`: `CLUSTER_CHANGE` = -1;
public const val `CLUSTER_CHANGE_CLUSTER_ALL_V2`: `CLUSTER_CHANGE_CLUSTER_V2` = 8191;
public const val `CLUSTER_CHANGE_CLUSTER_COMMON_PROPERTY_V2`: `CLUSTER_CHANGE_CLUSTER_V2` = 128;
public const val `CLUSTER_CHANGE_CLUSTER_GROUP_ADDED_V2`: `CLUSTER_CHANGE_CLUSTER_V2` = 4;
public const val `CLUSTER_CHANGE_CLUSTER_HANDLE_CLOSE_V2`: `CLUSTER_CHANGE_CLUSTER_V2` = 8;
public const val `CLUSTER_CHANGE_CLUSTER_LOST_NOTIFICATIONS_V2`: `CLUSTER_CHANGE_CLUSTER_V2` = 512;
public const val `CLUSTER_CHANGE_CLUSTER_MEMBERSHIP_V2`: `CLUSTER_CHANGE_CLUSTER_V2` = 2048;
public const val `CLUSTER_CHANGE_CLUSTER_NETWORK_ADDED_V2`: `CLUSTER_CHANGE_CLUSTER_V2` = 16;
public const val `CLUSTER_CHANGE_CLUSTER_NODE_ADDED_V2`: `CLUSTER_CHANGE_CLUSTER_V2` = 32;
public const val `CLUSTER_CHANGE_CLUSTER_PRIVATE_PROPERTY_V2`: `CLUSTER_CHANGE_CLUSTER_V2` = 256;
public const val `CLUSTER_CHANGE_CLUSTER_PROPERTY`: `CLUSTER_CHANGE` = 1073741824;
public const val `CLUSTER_CHANGE_CLUSTER_RECONNECT`: `CLUSTER_CHANGE` = 524288;
public const val `CLUSTER_CHANGE_CLUSTER_RECONNECT_V2`: `CLUSTER_CHANGE_CLUSTER_V2` = 1;
public const val `CLUSTER_CHANGE_CLUSTER_RENAME_V2`: `CLUSTER_CHANGE_CLUSTER_V2` = 1024;
public const val `CLUSTER_CHANGE_CLUSTER_RESOURCE_TYPE_ADDED_V2`: `CLUSTER_CHANGE_CLUSTER_V2` = 64;
public const val `CLUSTER_CHANGE_CLUSTER_STATE`: `CLUSTER_CHANGE` = 536870912;
public const val `CLUSTER_CHANGE_CLUSTER_STATE_V2`: `CLUSTER_CHANGE_CLUSTER_V2` = 2;
public const val `CLUSTER_CHANGE_CLUSTER_UPGRADED_V2`: `CLUSTER_CHANGE_CLUSTER_V2` = 4096;
public typealias `CLUSTER_CHANGE_CLUSTER_V2` = Int;
public const val `CLUSTER_CHANGE_GROUPSET_ALL_V2`: `CLUSTER_CHANGE_GROUPSET_V2` = 511;
public const val `CLUSTER_CHANGE_GROUPSET_COMMON_PROPERTY_V2`: `CLUSTER_CHANGE_GROUPSET_V2` = 2;
public const val `CLUSTER_CHANGE_GROUPSET_DELETED_v2`: `CLUSTER_CHANGE_GROUPSET_V2` = 1;
public const val `CLUSTER_CHANGE_GROUPSET_DEPENDENCIES_V2`: `CLUSTER_CHANGE_GROUPSET_V2` = 64;
public const val `CLUSTER_CHANGE_GROUPSET_DEPENDENTS_V2`: `CLUSTER_CHANGE_GROUPSET_V2` = 128;
public const val `CLUSTER_CHANGE_GROUPSET_GROUP_ADDED`: `CLUSTER_CHANGE_GROUPSET_V2` = 16;
public const val `CLUSTER_CHANGE_GROUPSET_GROUP_REMOVED`: `CLUSTER_CHANGE_GROUPSET_V2` = 32;
public const val `CLUSTER_CHANGE_GROUPSET_HANDLE_CLOSE_v2`: `CLUSTER_CHANGE_GROUPSET_V2` = 256;
public const val `CLUSTER_CHANGE_GROUPSET_PRIVATE_PROPERTY_V2`: `CLUSTER_CHANGE_GROUPSET_V2` = 4;
public const val `CLUSTER_CHANGE_GROUPSET_STATE_V2`: `CLUSTER_CHANGE_GROUPSET_V2` = 8;
public typealias `CLUSTER_CHANGE_GROUPSET_V2` = Int;
public const val `CLUSTER_CHANGE_GROUP_ADDED`: `CLUSTER_CHANGE` = 16384;
public const val `CLUSTER_CHANGE_GROUP_ALL_V2`: `CLUSTER_CHANGE_GROUP_V2` = 1023;
public const val `CLUSTER_CHANGE_GROUP_COMMON_PROPERTY_V2`: `CLUSTER_CHANGE_GROUP_V2` = 2;
public const val `CLUSTER_CHANGE_GROUP_DELETED`: `CLUSTER_CHANGE` = 8192;
public const val `CLUSTER_CHANGE_GROUP_DELETED_V2`: `CLUSTER_CHANGE_GROUP_V2` = 1;
public const val `CLUSTER_CHANGE_GROUP_HANDLE_CLOSE_V2`: `CLUSTER_CHANGE_GROUP_V2` = 512;
public const val `CLUSTER_CHANGE_GROUP_OWNER_NODE_V2`: `CLUSTER_CHANGE_GROUP_V2` = 16;
public const val `CLUSTER_CHANGE_GROUP_PREFERRED_OWNERS_V2`: `CLUSTER_CHANGE_GROUP_V2` = 32;
public const val `CLUSTER_CHANGE_GROUP_PRIVATE_PROPERTY_V2`: `CLUSTER_CHANGE_GROUP_V2` = 4;
public const val `CLUSTER_CHANGE_GROUP_PROPERTY`: `CLUSTER_CHANGE` = 32768;
public const val `CLUSTER_CHANGE_GROUP_RESOURCE_ADDED_V2`: `CLUSTER_CHANGE_GROUP_V2` = 64;
public const val `CLUSTER_CHANGE_GROUP_RESOURCE_GAINED_V2`: `CLUSTER_CHANGE_GROUP_V2` = 128;
public const val `CLUSTER_CHANGE_GROUP_RESOURCE_LOST_V2`: `CLUSTER_CHANGE_GROUP_V2` = 256;
public const val `CLUSTER_CHANGE_GROUP_STATE`: `CLUSTER_CHANGE` = 4096;
public const val `CLUSTER_CHANGE_GROUP_STATE_V2`: `CLUSTER_CHANGE_GROUP_V2` = 8;
public typealias `CLUSTER_CHANGE_GROUP_V2` = Int;
public const val `CLUSTER_CHANGE_HANDLE_CLOSE`: `CLUSTER_CHANGE` = -2147483648;
public const val `CLUSTER_CHANGE_NETINTERFACE_ADDED`: `CLUSTER_CHANGE` = 67108864;
public const val `CLUSTER_CHANGE_NETINTERFACE_ALL_V2`: `CLUSTER_CHANGE_NETINTERFACE_V2` = 31;
public const val `CLUSTER_CHANGE_NETINTERFACE_COMMON_PROPERTY_V2`: `CLUSTER_CHANGE_NETINTERFACE_V2` = 2;
public const val `CLUSTER_CHANGE_NETINTERFACE_DELETED`: `CLUSTER_CHANGE` = 33554432;
public const val `CLUSTER_CHANGE_NETINTERFACE_DELETED_V2`: `CLUSTER_CHANGE_NETINTERFACE_V2` = 1;
public const val `CLUSTER_CHANGE_NETINTERFACE_HANDLE_CLOSE_V2`: `CLUSTER_CHANGE_NETINTERFACE_V2` = 16;
public const val `CLUSTER_CHANGE_NETINTERFACE_PRIVATE_PROPERTY_V2`: `CLUSTER_CHANGE_NETINTERFACE_V2` = 4;
public const val `CLUSTER_CHANGE_NETINTERFACE_PROPERTY`: `CLUSTER_CHANGE` = 134217728;
public const val `CLUSTER_CHANGE_NETINTERFACE_STATE`: `CLUSTER_CHANGE` = 16777216;
public const val `CLUSTER_CHANGE_NETINTERFACE_STATE_V2`: `CLUSTER_CHANGE_NETINTERFACE_V2` = 8;
public typealias `CLUSTER_CHANGE_NETINTERFACE_V2` = Int;
public const val `CLUSTER_CHANGE_NETWORK_ADDED`: `CLUSTER_CHANGE` = 4194304;
public const val `CLUSTER_CHANGE_NETWORK_ALL_V2`: `CLUSTER_CHANGE_NETWORK_V2` = 31;
public const val `CLUSTER_CHANGE_NETWORK_COMMON_PROPERTY_V2`: `CLUSTER_CHANGE_NETWORK_V2` = 2;
public const val `CLUSTER_CHANGE_NETWORK_DELETED`: `CLUSTER_CHANGE` = 2097152;
public const val `CLUSTER_CHANGE_NETWORK_DELETED_V2`: `CLUSTER_CHANGE_NETWORK_V2` = 1;
public const val `CLUSTER_CHANGE_NETWORK_HANDLE_CLOSE_V2`: `CLUSTER_CHANGE_NETWORK_V2` = 16;
public const val `CLUSTER_CHANGE_NETWORK_PRIVATE_PROPERTY_V2`: `CLUSTER_CHANGE_NETWORK_V2` = 4;
public const val `CLUSTER_CHANGE_NETWORK_PROPERTY`: `CLUSTER_CHANGE` = 8388608;
public const val `CLUSTER_CHANGE_NETWORK_STATE`: `CLUSTER_CHANGE` = 1048576;
public const val `CLUSTER_CHANGE_NETWORK_STATE_V2`: `CLUSTER_CHANGE_NETWORK_V2` = 8;
public typealias `CLUSTER_CHANGE_NETWORK_V2` = Int;
public const val `CLUSTER_CHANGE_NODE_ADDED`: `CLUSTER_CHANGE` = 4;
public const val `CLUSTER_CHANGE_NODE_ALL_V2`: `CLUSTER_CHANGE_NODE_V2` = 255;
public const val `CLUSTER_CHANGE_NODE_COMMON_PROPERTY_V2`: `CLUSTER_CHANGE_NODE_V2` = 4;
public const val `CLUSTER_CHANGE_NODE_DELETED`: `CLUSTER_CHANGE` = 2;
public const val `CLUSTER_CHANGE_NODE_DELETED_V2`: `CLUSTER_CHANGE_NODE_V2` = 2;
public const val `CLUSTER_CHANGE_NODE_GROUP_GAINED_V2`: `CLUSTER_CHANGE_NODE_V2` = 32;
public const val `CLUSTER_CHANGE_NODE_GROUP_LOST_V2`: `CLUSTER_CHANGE_NODE_V2` = 64;
public const val `CLUSTER_CHANGE_NODE_HANDLE_CLOSE_V2`: `CLUSTER_CHANGE_NODE_V2` = 128;
public const val `CLUSTER_CHANGE_NODE_NETINTERFACE_ADDED_V2`: `CLUSTER_CHANGE_NODE_V2` = 1;
public const val `CLUSTER_CHANGE_NODE_PRIVATE_PROPERTY_V2`: `CLUSTER_CHANGE_NODE_V2` = 8;
public const val `CLUSTER_CHANGE_NODE_PROPERTY`: `CLUSTER_CHANGE` = 8;
public const val `CLUSTER_CHANGE_NODE_STATE`: `CLUSTER_CHANGE` = 1;
public const val `CLUSTER_CHANGE_NODE_STATE_V2`: `CLUSTER_CHANGE_NODE_V2` = 16;
public typealias `CLUSTER_CHANGE_NODE_UPGRADE_PHASE_V2` = Int;
public typealias `CLUSTER_CHANGE_NODE_V2` = Int;
public const val `CLUSTER_CHANGE_QUORUM_ALL_V2`: `CLUSTER_CHANGE_QUORUM_V2` = 1;
public const val `CLUSTER_CHANGE_QUORUM_STATE`: `CLUSTER_CHANGE` = 268435456;
public const val `CLUSTER_CHANGE_QUORUM_STATE_V2`: `CLUSTER_CHANGE_QUORUM_V2` = 1;
public typealias `CLUSTER_CHANGE_QUORUM_V2` = Int;
public const val `CLUSTER_CHANGE_REGISTRY_ALL_V2`: `CLUSTER_CHANGE_REGISTRY_V2` = 31;
public const val `CLUSTER_CHANGE_REGISTRY_ATTRIBUTES`: `CLUSTER_CHANGE` = 32;
public const val `CLUSTER_CHANGE_REGISTRY_ATTRIBUTES_V2`: `CLUSTER_CHANGE_REGISTRY_V2` = 1;
public const val `CLUSTER_CHANGE_REGISTRY_HANDLE_CLOSE_V2`: `CLUSTER_CHANGE_REGISTRY_V2` = 16;
public const val `CLUSTER_CHANGE_REGISTRY_NAME`: `CLUSTER_CHANGE` = 16;
public const val `CLUSTER_CHANGE_REGISTRY_NAME_V2`: `CLUSTER_CHANGE_REGISTRY_V2` = 2;
public const val `CLUSTER_CHANGE_REGISTRY_SUBTREE`: `CLUSTER_CHANGE` = 128;
public const val `CLUSTER_CHANGE_REGISTRY_SUBTREE_V2`: `CLUSTER_CHANGE_REGISTRY_V2` = 4;
public typealias `CLUSTER_CHANGE_REGISTRY_V2` = Int;
public const val `CLUSTER_CHANGE_REGISTRY_VALUE`: `CLUSTER_CHANGE` = 64;
public const val `CLUSTER_CHANGE_REGISTRY_VALUE_V2`: `CLUSTER_CHANGE_REGISTRY_V2` = 8;
public const val `CLUSTER_CHANGE_RESOURCE_ADDED`: `CLUSTER_CHANGE` = 1024;
public const val `CLUSTER_CHANGE_RESOURCE_ALL_V2`: `CLUSTER_CHANGE_RESOURCE_V2` = 2047;
public const val `CLUSTER_CHANGE_RESOURCE_COMMON_PROPERTY_V2`: `CLUSTER_CHANGE_RESOURCE_V2` = 1;
public const val `CLUSTER_CHANGE_RESOURCE_DELETED`: `CLUSTER_CHANGE` = 512;
public const val `CLUSTER_CHANGE_RESOURCE_DELETED_V2`: `CLUSTER_CHANGE_RESOURCE_V2` = 128;
public const val `CLUSTER_CHANGE_RESOURCE_DEPENDENCIES_V2`: `CLUSTER_CHANGE_RESOURCE_V2` = 16;
public const val `CLUSTER_CHANGE_RESOURCE_DEPENDENTS_V2`: `CLUSTER_CHANGE_RESOURCE_V2` = 32;
public const val `CLUSTER_CHANGE_RESOURCE_DLL_UPGRADED_V2`: `CLUSTER_CHANGE_RESOURCE_V2` = 256;
public const val `CLUSTER_CHANGE_RESOURCE_HANDLE_CLOSE_V2`: `CLUSTER_CHANGE_RESOURCE_V2` = 512;
public const val `CLUSTER_CHANGE_RESOURCE_OWNER_GROUP_V2`: `CLUSTER_CHANGE_RESOURCE_V2` = 8;
public const val `CLUSTER_CHANGE_RESOURCE_POSSIBLE_OWNERS_V2`: `CLUSTER_CHANGE_RESOURCE_V2` = 64;
public const val `CLUSTER_CHANGE_RESOURCE_PRIVATE_PROPERTY_V2`: `CLUSTER_CHANGE_RESOURCE_V2` = 2;
public const val `CLUSTER_CHANGE_RESOURCE_PROPERTY`: `CLUSTER_CHANGE` = 2048;
public const val `CLUSTER_CHANGE_RESOURCE_STATE`: `CLUSTER_CHANGE` = 256;
public const val `CLUSTER_CHANGE_RESOURCE_STATE_V2`: `CLUSTER_CHANGE_RESOURCE_V2` = 4;
public const val `CLUSTER_CHANGE_RESOURCE_TERMINAL_STATE_V2`: `CLUSTER_CHANGE_RESOURCE_V2` = 1024;
public const val `CLUSTER_CHANGE_RESOURCE_TYPE_ADDED`: `CLUSTER_CHANGE` = 131072;
public const val `CLUSTER_CHANGE_RESOURCE_TYPE_ALL_V2`: `CLUSTER_CHANGE_RESOURCE_TYPE_V2` = 63;
public const val `CLUSTER_CHANGE_RESOURCE_TYPE_COMMON_PROPERTY_V2`: `CLUSTER_CHANGE_RESOURCE_TYPE_V2` = 2;
public const val `CLUSTER_CHANGE_RESOURCE_TYPE_DELETED`: `CLUSTER_CHANGE` = 65536;
public const val `CLUSTER_CHANGE_RESOURCE_TYPE_DELETED_V2`: `CLUSTER_CHANGE_RESOURCE_TYPE_V2` = 1;
public const val `CLUSTER_CHANGE_RESOURCE_TYPE_DLL_UPGRADED_V2`: `CLUSTER_CHANGE_RESOURCE_TYPE_V2` = 16;
public const val `CLUSTER_CHANGE_RESOURCE_TYPE_POSSIBLE_OWNERS_V2`: `CLUSTER_CHANGE_RESOURCE_TYPE_V2` = 8;
public const val `CLUSTER_CHANGE_RESOURCE_TYPE_PRIVATE_PROPERTY_V2`: `CLUSTER_CHANGE_RESOURCE_TYPE_V2` = 4;
public const val `CLUSTER_CHANGE_RESOURCE_TYPE_PROPERTY`: `CLUSTER_CHANGE` = 262144;
public typealias `CLUSTER_CHANGE_RESOURCE_TYPE_V2` = Int;
public typealias `CLUSTER_CHANGE_RESOURCE_V2` = Int;
public const val `CLUSTER_CHANGE_SHARED_VOLUME_ADDED_V2`: `CLUSTER_CHANGE_SHARED_VOLUME_V2` = 2;
public const val `CLUSTER_CHANGE_SHARED_VOLUME_ALL_V2`: `CLUSTER_CHANGE_SHARED_VOLUME_V2` = 7;
public const val `CLUSTER_CHANGE_SHARED_VOLUME_REMOVED_V2`: `CLUSTER_CHANGE_SHARED_VOLUME_V2` = 4;
public const val `CLUSTER_CHANGE_SHARED_VOLUME_STATE_V2`: `CLUSTER_CHANGE_SHARED_VOLUME_V2` = 1;
public typealias `CLUSTER_CHANGE_SHARED_VOLUME_V2` = Int;
public const val `CLUSTER_CHANGE_SPACEPORT_CUSTOM_PNP_V2`: `CLUSTER_CHANGE_SPACEPORT_V2` = 1;
public typealias `CLUSTER_CHANGE_SPACEPORT_V2` = Int;
public const val `CLUSTER_CHANGE_UPGRADE_ALL`: `CLUSTER_CHANGE_NODE_UPGRADE_PHASE_V2` = 7;
public const val `CLUSTER_CHANGE_UPGRADE_NODE_COMMIT`: `CLUSTER_CHANGE_NODE_UPGRADE_PHASE_V2` = 2;
public const val `CLUSTER_CHANGE_UPGRADE_NODE_POSTCOMMIT`: `CLUSTER_CHANGE_NODE_UPGRADE_PHASE_V2` = 4;
public const val `CLUSTER_CHANGE_UPGRADE_NODE_PREPARE`: `CLUSTER_CHANGE_NODE_UPGRADE_PHASE_V2` = 1;
public typealias `CLUSTER_CLOUD_TYPE` = Int;
public const val `CLUSTER_CLOUD_TYPE_AZURE`: `CLUSTER_CLOUD_TYPE` = 1;
public const val `CLUSTER_CLOUD_TYPE_MIXED`: `CLUSTER_CLOUD_TYPE` = 128;
public const val `CLUSTER_CLOUD_TYPE_NONE`: `CLUSTER_CLOUD_TYPE` = 0;
public const val `CLUSTER_CLOUD_TYPE_UNKNOWN`: `CLUSTER_CLOUD_TYPE` = -1;
public const val `CLUSTER_CONFIGURED`: UInt = 2u;
public typealias `CLUSTER_CONTROL_OBJECT` = Int;
// UNSUPPORTED Rust 2126:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUSTER_CREATE_GROUP_INFO {
//     pub dwVersion: u32,
//     pub groupType: CLUSGROUP_TYPE,
// }

public const val `CLUSTER_CREATE_GROUP_INFO_VERSION`: UInt = 1u;
public const val `CLUSTER_CREATE_GROUP_INFO_VERSION_1`: UInt = 1u;
// UNSUPPORTED Rust 2134:1: non-scalar type Ptr unsupported
// pub const CLUSTER_CSA_VSS_STATE: windows_sys::core::PCWSTR = windows_sys::core::w!("BackupInProgress");

// UNSUPPORTED Rust 2135:1: non-scalar type Ptr unsupported
// pub const CLUSTER_CSV_COMPATIBLE_FILTERS: windows_sys::core::PCWSTR = windows_sys::core::w!("SharedVolumeCompatibleFilters");

// UNSUPPORTED Rust 2136:1: non-scalar type Ptr unsupported
// pub const CLUSTER_CSV_INCOMPATIBLE_FILTERS: windows_sys::core::PCWSTR = windows_sys::core::w!("SharedVolumeIncompatibleFilters");

public typealias `CLUSTER_CSV_VOLUME_FAULT_STATE` = Int;
public const val `CLUSTER_DELETE_ACCESS_CONTROL_ENTRY`: UInt = 2u;
// UNSUPPORTED Rust 2139:1: non-scalar type Ptr unsupported
// pub const CLUSTER_ENFORCED_ANTIAFFINITY: windows_sys::core::PCWSTR = windows_sys::core::w!("ClusterEnforcedAntiaffinity");

public typealias `CLUSTER_ENUM` = Int;
public const val `CLUSTER_ENUM_ALL`: `CLUSTER_ENUM` = 63;
public const val `CLUSTER_ENUM_GROUP`: `CLUSTER_ENUM` = 8;
public const val `CLUSTER_ENUM_INTERNAL_NETWORK`: `CLUSTER_ENUM` = -2147483648;
// UNSUPPORTED Rust 2144:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_ENUM_ITEM {
//     pub dwVersion: u32,
//     pub dwType: u32,
//     pub cbId: u32,
//     pub lpszId: windows_sys::core::PWSTR,
//     pub cbName: u32,
//     pub lpszName: windows_sys::core::PWSTR,
// }

// UNSUPPORTED Rust 2154:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_ENUM_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLUSTER_ENUM_ITEM_VERSION`: UInt = 1u;
public const val `CLUSTER_ENUM_ITEM_VERSION_1`: UInt = 1u;
public const val `CLUSTER_ENUM_NETINTERFACE`: `CLUSTER_ENUM` = 32;
public const val `CLUSTER_ENUM_NETWORK`: `CLUSTER_ENUM` = 16;
public const val `CLUSTER_ENUM_NODE`: `CLUSTER_ENUM` = 1;
public const val `CLUSTER_ENUM_RESOURCE`: `CLUSTER_ENUM` = 4;
public const val `CLUSTER_ENUM_RESTYPE`: `CLUSTER_ENUM` = 2;
public const val `CLUSTER_ENUM_SHARED_VOLUME_GROUP`: `CLUSTER_ENUM` = 536870912;
public const val `CLUSTER_ENUM_SHARED_VOLUME_RESOURCE`: `CLUSTER_ENUM` = 1073741824;
public typealias `CLUSTER_GROUP_AUTOFAILBACK_TYPE` = Int;
public typealias `CLUSTER_GROUP_ENUM` = Int;
public const val `CLUSTER_GROUP_ENUM_ALL`: `CLUSTER_GROUP_ENUM` = 3;
public const val `CLUSTER_GROUP_ENUM_CONTAINS`: `CLUSTER_GROUP_ENUM` = 1;
// UNSUPPORTED Rust 2172:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_GROUP_ENUM_ITEM {
//     pub dwVersion: u32,
//     pub cbId: u32,
//     pub lpszId: windows_sys::core::PWSTR,
//     pub cbName: u32,
//     pub lpszName: windows_sys::core::PWSTR,
//     pub state: CLUSTER_GROUP_STATE,
//     pub cbOwnerNode: u32,
//     pub lpszOwnerNode: windows_sys::core::PWSTR,
//     pub dwFlags: u32,
//     pub cbProperties: u32,
//     pub pProperties: *mut core::ffi::c_void,
//     pub cbRoProperties: u32,
//     pub pRoProperties: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2189:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_GROUP_ENUM_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLUSTER_GROUP_ENUM_ITEM_VERSION`: UInt = 1u;
public const val `CLUSTER_GROUP_ENUM_ITEM_VERSION_1`: UInt = 1u;
public const val `CLUSTER_GROUP_ENUM_NODES`: `CLUSTER_GROUP_ENUM` = 2;
public typealias `CLUSTER_GROUP_PRIORITY` = Int;
public typealias `CLUSTER_GROUP_STATE` = Int;
// UNSUPPORTED Rust 2199:1: non-scalar type Ptr unsupported
// pub const CLUSTER_GROUP_WAIT_DELAY: windows_sys::core::PCWSTR = windows_sys::core::w!("ClusterGroupWaitDelay");

// UNSUPPORTED Rust 2200:1: non-scalar type Ptr unsupported
// pub const CLUSTER_HANG_RECOVERY_ACTION_KEYNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("HangRecoveryAction");

// UNSUPPORTED Rust 2201:1: non-scalar type Ptr unsupported
// pub const CLUSTER_HANG_TIMEOUT_KEYNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ClusSvcHangTimeout");

// UNSUPPORTED Rust 2202:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_HEALTH_FAULT {
//     pub Id: windows_sys::core::PWSTR,
//     pub ErrorType: u32,
//     pub ErrorCode: u32,
//     pub Description: windows_sys::core::PWSTR,
//     pub Provider: windows_sys::core::PWSTR,
//     pub Flags: u32,
//     pub Reserved: u32,
// }

// UNSUPPORTED Rust 2213:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_HEALTH_FAULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLUSTER_HEALTH_FAULT_ARGS`: UInt = 7u;
// UNSUPPORTED Rust 2219:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_HEALTH_FAULT_ARRAY {
//     pub numFaults: u32,
//     pub faults: *mut CLUSTER_HEALTH_FAULT,
// }

// UNSUPPORTED Rust 2225:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_HEALTH_FAULT_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLUSTER_HEALTH_FAULT_DESCRIPTION`: UInt = 3u;
// UNSUPPORTED Rust 2231:1: non-scalar type Ptr unsupported
// pub const CLUSTER_HEALTH_FAULT_DESCRIPTION_LABEL: windows_sys::core::PCWSTR = windows_sys::core::w!("Description");

public const val `CLUSTER_HEALTH_FAULT_ERRORCODE`: UInt = 2u;
// UNSUPPORTED Rust 2233:1: non-scalar type Ptr unsupported
// pub const CLUSTER_HEALTH_FAULT_ERRORCODE_LABEL: windows_sys::core::PCWSTR = windows_sys::core::w!("ErrorCode");

public const val `CLUSTER_HEALTH_FAULT_ERRORTYPE`: UInt = 1u;
// UNSUPPORTED Rust 2235:1: non-scalar type Ptr unsupported
// pub const CLUSTER_HEALTH_FAULT_ERRORTYPE_LABEL: windows_sys::core::PCWSTR = windows_sys::core::w!("ErrorType");

public const val `CLUSTER_HEALTH_FAULT_FLAGS`: UInt = 5u;
// UNSUPPORTED Rust 2237:1: non-scalar type Ptr unsupported
// pub const CLUSTER_HEALTH_FAULT_FLAGS_LABEL: windows_sys::core::PCWSTR = windows_sys::core::w!("Flags");

public const val `CLUSTER_HEALTH_FAULT_ID`: UInt = 0u;
// UNSUPPORTED Rust 2239:1: non-scalar type Ptr unsupported
// pub const CLUSTER_HEALTH_FAULT_ID_LABEL: windows_sys::core::PCWSTR = windows_sys::core::w!("Id");

// UNSUPPORTED Rust 2240:1: non-scalar type Ptr unsupported
// pub const CLUSTER_HEALTH_FAULT_PROPERTY_NAME: windows_sys::core::PCWSTR = windows_sys::core::w!("ClusterHealth");

public const val `CLUSTER_HEALTH_FAULT_PROVIDER`: UInt = 4u;
// UNSUPPORTED Rust 2242:1: non-scalar type Ptr unsupported
// pub const CLUSTER_HEALTH_FAULT_PROVIDER_LABEL: windows_sys::core::PCWSTR = windows_sys::core::w!("Provider");

public const val `CLUSTER_HEALTH_FAULT_RESERVED`: UInt = 6u;
// UNSUPPORTED Rust 2244:1: non-scalar type Ptr unsupported
// pub const CLUSTER_HEALTH_FAULT_RESERVED_LABEL: windows_sys::core::PCWSTR = windows_sys::core::w!("Reserved");

public const val `CLUSTER_INSTALLED`: UInt = 1u;
// UNSUPPORTED Rust 2246:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_IP_ENTRY {
//     pub lpszIpAddress: windows_sys::core::PCWSTR,
//     pub dwPrefixLength: u32,
// }

// UNSUPPORTED Rust 2252:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_IP_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2257:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_MEMBERSHIP_INFO {
//     pub HasQuorum: windows_sys::core::BOOL,
//     pub UpnodesSize: u32,
//     pub Upnodes: [u8; 1],
// }

// UNSUPPORTED Rust 2264:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_MEMBERSHIP_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CLUSTER_MGMT_POINT_RESTYPE` = Int;
public const val `CLUSTER_MGMT_POINT_RESTYPE_AUTO`: `CLUSTER_MGMT_POINT_RESTYPE` = 0;
public const val `CLUSTER_MGMT_POINT_RESTYPE_DNN`: `CLUSTER_MGMT_POINT_RESTYPE` = 2;
public const val `CLUSTER_MGMT_POINT_RESTYPE_SNN`: `CLUSTER_MGMT_POINT_RESTYPE` = 1;
public typealias `CLUSTER_MGMT_POINT_TYPE` = Int;
public const val `CLUSTER_MGMT_POINT_TYPE_CNO`: `CLUSTER_MGMT_POINT_TYPE` = 1;
public const val `CLUSTER_MGMT_POINT_TYPE_CNO_ONLY`: `CLUSTER_MGMT_POINT_TYPE` = 3;
public const val `CLUSTER_MGMT_POINT_TYPE_DNS_ONLY`: `CLUSTER_MGMT_POINT_TYPE` = 2;
public const val `CLUSTER_MGMT_POINT_TYPE_NONE`: `CLUSTER_MGMT_POINT_TYPE` = 0;
// UNSUPPORTED Rust 2278:1: non-scalar type Ptr unsupported
// pub const CLUSTER_NAME_AUTO_BALANCER_LEVEL: windows_sys::core::PCWSTR = windows_sys::core::w!("AutoBalancerLevel");

// UNSUPPORTED Rust 2279:1: non-scalar type Ptr unsupported
// pub const CLUSTER_NAME_AUTO_BALANCER_MODE: windows_sys::core::PCWSTR = windows_sys::core::w!("AutoBalancerMode");

// UNSUPPORTED Rust 2280:1: non-scalar type Ptr unsupported
// pub const CLUSTER_NAME_PREFERRED_SITE: windows_sys::core::PCWSTR = windows_sys::core::w!("PreferredSite");

public typealias `CLUSTER_NETINTERFACE_STATE` = Int;
public typealias `CLUSTER_NETWORK_ENUM` = Int;
public const val `CLUSTER_NETWORK_ENUM_ALL`: `CLUSTER_NETWORK_ENUM` = 1;
public const val `CLUSTER_NETWORK_ENUM_NETINTERFACES`: `CLUSTER_NETWORK_ENUM` = 1;
public typealias `CLUSTER_NETWORK_ROLE` = Int;
public typealias `CLUSTER_NETWORK_STATE` = Int;
public typealias `CLUSTER_NODE_DRAIN_STATUS` = Int;
public typealias `CLUSTER_NODE_ENUM` = Int;
public const val `CLUSTER_NODE_ENUM_ALL`: `CLUSTER_NODE_ENUM` = 3;
public const val `CLUSTER_NODE_ENUM_GROUPS`: `CLUSTER_NODE_ENUM` = 2;
public const val `CLUSTER_NODE_ENUM_NETINTERFACES`: `CLUSTER_NODE_ENUM` = 1;
public const val `CLUSTER_NODE_ENUM_PREFERRED_GROUPS`: `CLUSTER_NODE_ENUM` = 4;
public typealias `CLUSTER_NODE_RESUME_FAILBACK_TYPE` = Int;
public typealias `CLUSTER_NODE_STATE` = Int;
public typealias `CLUSTER_NODE_STATUS` = Int;
public const val `CLUSTER_NOTIFICATIONS_V1`: `CLUSTER_NOTIFICATIONS_VERSION` = 1;
public const val `CLUSTER_NOTIFICATIONS_V2`: `CLUSTER_NOTIFICATIONS_VERSION` = 2;
public typealias `CLUSTER_NOTIFICATIONS_VERSION` = Int;
public typealias `CLUSTER_OBJECT_TYPE` = Int;
public const val `CLUSTER_OBJECT_TYPE_AFFINITYRULE`: `CLUSTER_OBJECT_TYPE` = 16;
public const val `CLUSTER_OBJECT_TYPE_CLUSTER`: `CLUSTER_OBJECT_TYPE` = 1;
public const val `CLUSTER_OBJECT_TYPE_FAULTDOMAIN`: `CLUSTER_OBJECT_TYPE` = 17;
public const val `CLUSTER_OBJECT_TYPE_GROUP`: `CLUSTER_OBJECT_TYPE` = 2;
public const val `CLUSTER_OBJECT_TYPE_GROUPSET`: `CLUSTER_OBJECT_TYPE` = 13;
public const val `CLUSTER_OBJECT_TYPE_NETWORK`: `CLUSTER_OBJECT_TYPE` = 6;
public const val `CLUSTER_OBJECT_TYPE_NETWORK_INTERFACE`: `CLUSTER_OBJECT_TYPE` = 5;
public const val `CLUSTER_OBJECT_TYPE_NODE`: `CLUSTER_OBJECT_TYPE` = 7;
public const val `CLUSTER_OBJECT_TYPE_NONE`: `CLUSTER_OBJECT_TYPE` = 0;
public const val `CLUSTER_OBJECT_TYPE_QUORUM`: `CLUSTER_OBJECT_TYPE` = 9;
public const val `CLUSTER_OBJECT_TYPE_REGISTRY`: `CLUSTER_OBJECT_TYPE` = 8;
public const val `CLUSTER_OBJECT_TYPE_RESOURCE`: `CLUSTER_OBJECT_TYPE` = 3;
public const val `CLUSTER_OBJECT_TYPE_RESOURCE_TYPE`: `CLUSTER_OBJECT_TYPE` = 4;
public const val `CLUSTER_OBJECT_TYPE_SHARED_VOLUME`: `CLUSTER_OBJECT_TYPE` = 10;
public typealias `CLUSTER_PROPERTY_FORMAT` = Int;
public typealias `CLUSTER_PROPERTY_SYNTAX` = UInt;
public typealias `CLUSTER_PROPERTY_TYPE` = Int;
public const val `CLUSTER_QUORUM_LOST`: `CLUSTER_QUORUM_VALUE` = 1;
public const val `CLUSTER_QUORUM_MAINTAINED`: `CLUSTER_QUORUM_VALUE` = 0;
public typealias `CLUSTER_QUORUM_TYPE` = Int;
public typealias `CLUSTER_QUORUM_VALUE` = Int;
// UNSUPPORTED Rust 2321:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_READ_BATCH_COMMAND {
//     pub Command: CLUSTER_REG_COMMAND,
//     pub dwOptions: u32,
//     pub wzSubkeyName: windows_sys::core::PCWSTR,
//     pub wzValueName: windows_sys::core::PCWSTR,
//     pub lpData: *const u8,
//     pub cbData: u32,
// }

// UNSUPPORTED Rust 2331:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_READ_BATCH_COMMAND {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CLUSTER_REG_COMMAND` = Int;
// UNSUPPORTED Rust 2337:1: non-scalar type Ptr unsupported
// pub const CLUSTER_REQUEST_REPLY_TIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("RequestReplyTimeout");

public typealias `CLUSTER_RESOURCE_APPLICATION_STATE` = Int;
public typealias `CLUSTER_RESOURCE_CLASS` = Int;
public typealias `CLUSTER_RESOURCE_CREATE_FLAGS` = Int;
public const val `CLUSTER_RESOURCE_DEFAULT_MONITOR`: `CLUSTER_RESOURCE_CREATE_FLAGS` = 0;
public typealias `CLUSTER_RESOURCE_EMBEDDED_FAILURE_ACTION` = Int;
public typealias `CLUSTER_RESOURCE_ENUM` = Int;
public const val `CLUSTER_RESOURCE_ENUM_ALL`: `CLUSTER_RESOURCE_ENUM` = 7;
public const val `CLUSTER_RESOURCE_ENUM_DEPENDS`: `CLUSTER_RESOURCE_ENUM` = 1;
// UNSUPPORTED Rust 2346:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_RESOURCE_ENUM_ITEM {
//     pub dwVersion: u32,
//     pub cbId: u32,
//     pub lpszId: windows_sys::core::PWSTR,
//     pub cbName: u32,
//     pub lpszName: windows_sys::core::PWSTR,
//     pub cbOwnerGroupName: u32,
//     pub lpszOwnerGroupName: windows_sys::core::PWSTR,
//     pub cbOwnerGroupId: u32,
//     pub lpszOwnerGroupId: windows_sys::core::PWSTR,
//     pub cbProperties: u32,
//     pub pProperties: *mut core::ffi::c_void,
//     pub cbRoProperties: u32,
//     pub pRoProperties: *mut core::ffi::c_void,
// }

// UNSUPPORTED Rust 2363:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_RESOURCE_ENUM_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLUSTER_RESOURCE_ENUM_ITEM_VERSION`: UInt = 1u;
public const val `CLUSTER_RESOURCE_ENUM_ITEM_VERSION_1`: UInt = 1u;
public const val `CLUSTER_RESOURCE_ENUM_NODES`: `CLUSTER_RESOURCE_ENUM` = 4;
public const val `CLUSTER_RESOURCE_ENUM_PROVIDES`: `CLUSTER_RESOURCE_ENUM` = 2;
public typealias `CLUSTER_RESOURCE_RESTART_ACTION` = Int;
public const val `CLUSTER_RESOURCE_SEPARATE_MONITOR`: `CLUSTER_RESOURCE_CREATE_FLAGS` = 1;
public typealias `CLUSTER_RESOURCE_STATE` = Int;
public typealias `CLUSTER_RESOURCE_STATE_CHANGE_REASON` = Int;
public typealias `CLUSTER_RESOURCE_TYPE_ENUM` = Int;
public const val `CLUSTER_RESOURCE_TYPE_ENUM_ALL`: `CLUSTER_RESOURCE_TYPE_ENUM` = 3;
public const val `CLUSTER_RESOURCE_TYPE_ENUM_NODES`: `CLUSTER_RESOURCE_TYPE_ENUM` = 1;
public const val `CLUSTER_RESOURCE_TYPE_ENUM_RESOURCES`: `CLUSTER_RESOURCE_TYPE_ENUM` = 2;
public const val `CLUSTER_RESOURCE_TYPE_SPECIFIC_V2`: `CLUSTER_CHANGE_RESOURCE_TYPE_V2` = 32;
public const val `CLUSTER_RESOURCE_VALID_FLAGS`: `CLUSTER_RESOURCE_CREATE_FLAGS` = 1;
public typealias `CLUSTER_ROLE` = Int;
public typealias `CLUSTER_ROLE_STATE` = Int;
public const val `CLUSTER_RUNNING`: UInt = 16u;
// UNSUPPORTED Rust 2385:1: non-scalar type Ptr unsupported
// pub const CLUSTER_S2D_BUS_TYPES: windows_sys::core::PCWSTR = windows_sys::core::w!("S2DBusTypes");

// UNSUPPORTED Rust 2386:1: non-scalar type Ptr unsupported
// pub const CLUSTER_S2D_CACHE_BEHAVIOR_FLAGS: windows_sys::core::PCWSTR = windows_sys::core::w!("S2DCacheBehavior");

// UNSUPPORTED Rust 2387:1: non-scalar type Ptr unsupported
// pub const CLUSTER_S2D_CACHE_DESIRED_STATE: windows_sys::core::PCWSTR = windows_sys::core::w!("S2DCacheDesiredState");

// UNSUPPORTED Rust 2388:1: non-scalar type Ptr unsupported
// pub const CLUSTER_S2D_CACHE_FLASH_RESERVE_PERCENT: windows_sys::core::PCWSTR = windows_sys::core::w!("S2DCacheFlashReservePercent");

// UNSUPPORTED Rust 2389:1: non-scalar type Ptr unsupported
// pub const CLUSTER_S2D_CACHE_METADATA_RESERVE: windows_sys::core::PCWSTR = windows_sys::core::w!("S2DCacheMetadataReserveBytes");

// UNSUPPORTED Rust 2390:1: non-scalar type Ptr unsupported
// pub const CLUSTER_S2D_CACHE_PAGE_SIZE_KBYTES: windows_sys::core::PCWSTR = windows_sys::core::w!("S2DCachePageSizeKBytes");

// UNSUPPORTED Rust 2391:1: non-scalar type Ptr unsupported
// pub const CLUSTER_S2D_ENABLED: windows_sys::core::PCWSTR = windows_sys::core::w!("S2DEnabled");

// UNSUPPORTED Rust 2392:1: non-scalar type Ptr unsupported
// pub const CLUSTER_S2D_IO_LATENCY_THRESHOLD: windows_sys::core::PCWSTR = windows_sys::core::w!("S2DIOLatencyThreshold");

// UNSUPPORTED Rust 2393:1: non-scalar type Ptr unsupported
// pub const CLUSTER_S2D_OPTIMIZATIONS: windows_sys::core::PCWSTR = windows_sys::core::w!("S2DOptimizations");

public typealias `CLUSTER_SETUP_PHASE` = Int;
public typealias `CLUSTER_SETUP_PHASE_SEVERITY` = Int;
public typealias `CLUSTER_SETUP_PHASE_TYPE` = Int;
public const val `CLUSTER_SET_ACCESS_TYPE_ALLOWED`: UInt = 0u;
public const val `CLUSTER_SET_ACCESS_TYPE_DENIED`: UInt = 1u;
// UNSUPPORTED Rust 2399:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUSTER_SET_PASSWORD_STATUS {
//     pub NodeId: u32,
//     pub SetAttempted: bool,
//     pub ReturnStatus: u32,
// }

// UNSUPPORTED Rust 2406:1: non-scalar type Ptr unsupported
// pub const CLUSTER_SHARED_VOLUMES_ROOT: windows_sys::core::PCWSTR = windows_sys::core::w!("SharedVolumesRoot");

public typealias `CLUSTER_SHARED_VOLUME_BACKUP_STATE` = Int;
// UNSUPPORTED Rust 2408:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_SHARED_VOLUME_RENAME_GUID_INPUT {
//     pub Base: CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME,
//     pub Base2: CLUSTER_SHARED_VOLUME_RENAME_INPUT_GUID_NAME,
// }

// UNSUPPORTED Rust 2414:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_SHARED_VOLUME_RENAME_GUID_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2419:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_SHARED_VOLUME_RENAME_INPUT {
//     pub Base: CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME,
//     pub Base2: CLUSTER_SHARED_VOLUME_RENAME_INPUT_NAME,
// }

// UNSUPPORTED Rust 2425:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_SHARED_VOLUME_RENAME_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2430:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_SHARED_VOLUME_RENAME_INPUT_GUID_NAME {
//     pub NewVolumeName: [u16; 260],
//     pub NewVolumeGuid: [u16; 50],
// }

// UNSUPPORTED Rust 2436:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_SHARED_VOLUME_RENAME_INPUT_GUID_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2441:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_SHARED_VOLUME_RENAME_INPUT_NAME {
//     pub NewVolumeName: [u16; 260],
// }

// UNSUPPORTED Rust 2446:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_SHARED_VOLUME_RENAME_INPUT_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE` = Int;
// UNSUPPORTED Rust 2452:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME {
//     pub InputType: CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE,
//     pub Anonymous: CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME_0,
// }

// UNSUPPORTED Rust 2458:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2463:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME_0 {
//     pub VolumeOffset: u64,
//     pub VolumeId: [u16; 260],
//     pub VolumeName: [u16; 260],
//     pub VolumeGuid: [u16; 50],
// }

// UNSUPPORTED Rust 2471:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_SHARED_VOLUME_RENAME_INPUT_VOLUME_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE` = Int;
public typealias `CLUSTER_SHARED_VOLUME_STATE` = Int;
// UNSUPPORTED Rust 2478:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_SHARED_VOLUME_STATE_INFO {
//     pub szVolumeName: [u16; 260],
//     pub szNodeName: [u16; 260],
//     pub VolumeState: CLUSTER_SHARED_VOLUME_STATE,
// }

// UNSUPPORTED Rust 2485:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_SHARED_VOLUME_STATE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2490:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_SHARED_VOLUME_STATE_INFO_EX {
//     pub szVolumeName: [u16; 260],
//     pub szNodeName: [u16; 260],
//     pub VolumeState: CLUSTER_SHARED_VOLUME_STATE,
//     pub szVolumeFriendlyName: [u16; 260],
//     pub RedirectedIOReason: u64,
//     pub VolumeRedirectedIOReason: u64,
// }

// UNSUPPORTED Rust 2500:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_SHARED_VOLUME_STATE_INFO_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2505:1: non-scalar type Ptr unsupported
// pub const CLUSTER_SHARED_VOLUME_VSS_WRITER_OPERATION_TIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("SharedVolumeVssWriterOperationTimeout");

public typealias `CLUSTER_STORAGENODE_STATE` = Int;
public typealias `CLUSTER_UPGRADE_PHASE` = Int;
// UNSUPPORTED Rust 2508:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_VALIDATE_CSV_FILENAME {
//     pub szFileName: [u16; 1],
// }

// UNSUPPORTED Rust 2513:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_VALIDATE_CSV_FILENAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2518:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_VALIDATE_DIRECTORY {
//     pub szPath: [u16; 1],
// }

// UNSUPPORTED Rust 2523:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_VALIDATE_DIRECTORY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2528:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_VALIDATE_NETNAME {
//     pub szNetworkName: [u16; 1],
// }

// UNSUPPORTED Rust 2533:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_VALIDATE_NETNAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2538:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUSTER_VALIDATE_PATH {
//     pub szPath: [u16; 1],
// }

// UNSUPPORTED Rust 2543:1: declaration Impl has no candidate rule
// impl Default for CLUSTER_VALIDATE_PATH {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLUSTER_VERSION_FLAG_MIXED_MODE`: UInt = 1u;
public const val `CLUSTER_VERSION_UNKNOWN`: UInt = 4294967295u;
// UNSUPPORTED Rust 2550:1: non-scalar type Ptr unsupported
// pub const CLUSTER_WITNESS_DATABASE_WRITE_TIMEOUT: windows_sys::core::PCWSTR = windows_sys::core::w!("WitnessDatabaseWriteTimeout");

// UNSUPPORTED Rust 2551:1: non-scalar type Ptr unsupported
// pub const CLUSTER_WITNESS_FAILED_RESTART_INTERVAL: windows_sys::core::PCWSTR = windows_sys::core::w!("WitnessRestartInterval");

public const val `CLUS_ACCESS_ANY`: UInt = 0u;
public const val `CLUS_ACCESS_READ`: UInt = 1u;
public const val `CLUS_ACCESS_WRITE`: UInt = 2u;
public const val `CLUS_AFFINITY_RULE_DIFFERENT_FAULT_DOMAIN`: `CLUS_AFFINITY_RULE_TYPE` = 3;
public const val `CLUS_AFFINITY_RULE_DIFFERENT_NODE`: `CLUS_AFFINITY_RULE_TYPE` = 4;
public const val `CLUS_AFFINITY_RULE_MAX`: `CLUS_AFFINITY_RULE_TYPE` = 4;
public const val `CLUS_AFFINITY_RULE_MIN`: `CLUS_AFFINITY_RULE_TYPE` = 0;
public const val `CLUS_AFFINITY_RULE_NONE`: `CLUS_AFFINITY_RULE_TYPE` = 0;
public const val `CLUS_AFFINITY_RULE_SAME_FAULT_DOMAIN`: `CLUS_AFFINITY_RULE_TYPE` = 1;
public const val `CLUS_AFFINITY_RULE_SAME_NODE`: `CLUS_AFFINITY_RULE_TYPE` = 2;
public typealias `CLUS_AFFINITY_RULE_TYPE` = Int;
public typealias `CLUS_CHARACTERISTICS` = Int;
public const val `CLUS_CHAR_BROADCAST_DELETE`: `CLUS_CHARACTERISTICS` = 32;
public const val `CLUS_CHAR_CLONES`: `CLUS_CHARACTERISTICS` = 8192;
public const val `CLUS_CHAR_COEXIST_IN_SHARED_VOLUME_GROUP`: `CLUS_CHARACTERISTICS` = 256;
public const val `CLUS_CHAR_DELETE_REQUIRES_ALL_NODES`: `CLUS_CHARACTERISTICS` = 2;
public const val `CLUS_CHAR_DRAIN_LOCAL_OFFLINE`: `CLUS_CHARACTERISTICS` = 524288;
public const val `CLUS_CHAR_INFRASTRUCTURE`: `CLUS_CHARACTERISTICS` = 131072;
public const val `CLUS_CHAR_LOCAL_QUORUM`: `CLUS_CHARACTERISTICS` = 4;
public const val `CLUS_CHAR_LOCAL_QUORUM_DEBUG`: `CLUS_CHARACTERISTICS` = 8;
public const val `CLUS_CHAR_MONITOR_DETACH`: `CLUS_CHARACTERISTICS` = 1024;
public const val `CLUS_CHAR_MONITOR_REATTACH`: `CLUS_CHARACTERISTICS` = 2048;
public const val `CLUS_CHAR_NOTIFY_NEW_OWNER`: `CLUS_CHARACTERISTICS` = 32768;
public const val `CLUS_CHAR_NOT_PREEMPTABLE`: `CLUS_CHARACTERISTICS` = 16384;
public const val `CLUS_CHAR_OPERATION_CONTEXT`: `CLUS_CHARACTERISTICS` = 4096;
public const val `CLUS_CHAR_PLACEMENT_DATA`: `CLUS_CHARACTERISTICS` = 512;
public const val `CLUS_CHAR_QUORUM`: `CLUS_CHARACTERISTICS` = 1;
public const val `CLUS_CHAR_REQUIRES_STATE_CHANGE_REASON`: `CLUS_CHARACTERISTICS` = 16;
public const val `CLUS_CHAR_SINGLE_CLUSTER_INSTANCE`: `CLUS_CHARACTERISTICS` = 64;
public const val `CLUS_CHAR_SINGLE_GROUP_INSTANCE`: `CLUS_CHARACTERISTICS` = 128;
public const val `CLUS_CHAR_SUPPORTS_UNMONITORED_STATE`: `CLUS_CHARACTERISTICS` = 65536;
public const val `CLUS_CHAR_UNKNOWN`: `CLUS_CHARACTERISTICS` = 0;
public const val `CLUS_CHAR_VETO_DRAIN`: `CLUS_CHARACTERISTICS` = 262144;
// UNSUPPORTED Rust 2585:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_CHKDSK_INFO {
//     pub PartitionNumber: u32,
//     pub ChkdskState: u32,
//     pub FileIdCount: u32,
//     pub FileIdList: [u64; 1],
// }

// UNSUPPORTED Rust 2593:1: declaration Impl has no candidate rule
// impl Default for CLUS_CHKDSK_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLUS_CREATE_CRYPT_CONTAINER_NOT_FOUND`: UInt = 1u;
// UNSUPPORTED Rust 2599:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_CREATE_INFRASTRUCTURE_FILESERVER_INPUT {
//     pub FileServerName: [u16; 16],
// }

// UNSUPPORTED Rust 2604:1: declaration Impl has no candidate rule
// impl Default for CLUS_CREATE_INFRASTRUCTURE_FILESERVER_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2609:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_CREATE_INFRASTRUCTURE_FILESERVER_OUTPUT {
//     pub FileServerName: [u16; 260],
// }

// UNSUPPORTED Rust 2614:1: declaration Impl has no candidate rule
// impl Default for CLUS_CREATE_INFRASTRUCTURE_FILESERVER_OUTPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2619:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_CSV_MAINTENANCE_MODE_INFO {
//     pub InMaintenance: windows_sys::core::BOOL,
//     pub VolumeName: [u16; 260],
// }

// UNSUPPORTED Rust 2625:1: declaration Impl has no candidate rule
// impl Default for CLUS_CSV_MAINTENANCE_MODE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2630:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_CSV_VOLUME_INFO {
//     pub VolumeOffset: u64,
//     pub PartitionNumber: u32,
//     pub FaultState: CLUSTER_CSV_VOLUME_FAULT_STATE,
//     pub BackupState: CLUSTER_SHARED_VOLUME_BACKUP_STATE,
//     pub szVolumeFriendlyName: [u16; 260],
//     pub szVolumeName: [u16; 50],
// }

// UNSUPPORTED Rust 2640:1: declaration Impl has no candidate rule
// impl Default for CLUS_CSV_VOLUME_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2645:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_CSV_VOLUME_NAME {
//     pub VolumeOffset: i64,
//     pub szVolumeName: [u16; 260],
//     pub szRootPath: [u16; 263],
// }

// UNSUPPORTED Rust 2652:1: declaration Impl has no candidate rule
// impl Default for CLUS_CSV_VOLUME_NAME {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2657:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUS_DISK_NUMBER_INFO {
//     pub DiskNumber: u32,
//     pub BytesPerSector: u32,
// }

// UNSUPPORTED Rust 2663:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUS_DNN_LEADER_STATUS {
//     pub IsOnline: windows_sys::core::BOOL,
//     pub IsFileServerPresent: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2669:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUS_DNN_SODAFS_CLONE_STATUS {
//     pub NodeId: u32,
//     pub Status: CLUSTER_RESOURCE_STATE,
// }

public typealias `CLUS_FLAGS` = Int;
public const val `CLUS_FLAG_CORE`: `CLUS_FLAGS` = 1;
// UNSUPPORTED Rust 2677:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_FORCE_QUORUM_INFO {
//     pub dwSize: u32,
//     pub dwNodeBitMask: u32,
//     pub dwMaxNumberofNodes: u32,
//     pub multiszNodeList: [u16; 1],
// }

// UNSUPPORTED Rust 2685:1: declaration Impl has no candidate rule
// impl Default for CLUS_FORCE_QUORUM_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2690:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUS_FTSET_INFO {
//     pub dwRootSignature: u32,
//     pub dwFtType: u32,
// }

public const val `CLUS_GLOBAL`: UInt = 1u;
public const val `CLUS_GROUP_DO_NOT_START`: `CLUS_GROUP_START_SETTING` = 1;
public const val `CLUS_GROUP_START_ALLOWED`: `CLUS_GROUP_START_SETTING` = 2;
public const val `CLUS_GROUP_START_ALWAYS`: `CLUS_GROUP_START_SETTING` = 0;
public typealias `CLUS_GROUP_START_SETTING` = Int;
public const val `CLUS_GRP_MOVE_ALLOWED`: UInt = 0u;
public const val `CLUS_GRP_MOVE_LOCKED`: UInt = 1u;
public const val `CLUS_HYBRID_QUORUM`: UInt = 1024u;
// UNSUPPORTED Rust 2704:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUS_MAINTENANCE_MODE_INFO {
//     pub InMaintenance: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 2709:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUS_MAINTENANCE_MODE_INFOEX {
//     pub InMaintenance: windows_sys::core::BOOL,
//     pub MaintainenceModeType: MAINTENANCE_MODE_TYPE_ENUM,
//     pub InternalState: CLUSTER_RESOURCE_STATE,
//     pub Signature: u32,
// }

public const val `CLUS_MODIFY`: UInt = 1u;
// UNSUPPORTED Rust 2718:1: non-scalar type Ptr unsupported
// pub const CLUS_NAME_RES_TYPE_CLUSTER_GROUPID: windows_sys::core::PCWSTR = windows_sys::core::w!("ClusterGroupId");

// UNSUPPORTED Rust 2719:1: non-scalar type Ptr unsupported
// pub const CLUS_NAME_RES_TYPE_DATA_RESID: windows_sys::core::PCWSTR = windows_sys::core::w!("DataResourceId");

// UNSUPPORTED Rust 2720:1: non-scalar type Ptr unsupported
// pub const CLUS_NAME_RES_TYPE_LOG_MULTIPLE: windows_sys::core::PCWSTR = windows_sys::core::w!("LogSizeMultiple");

// UNSUPPORTED Rust 2721:1: non-scalar type Ptr unsupported
// pub const CLUS_NAME_RES_TYPE_LOG_RESID: windows_sys::core::PCWSTR = windows_sys::core::w!("LogResourceId");

// UNSUPPORTED Rust 2722:1: non-scalar type Ptr unsupported
// pub const CLUS_NAME_RES_TYPE_LOG_VOLUME: windows_sys::core::PCWSTR = windows_sys::core::w!("LogVolume");

// UNSUPPORTED Rust 2723:1: non-scalar type Ptr unsupported
// pub const CLUS_NAME_RES_TYPE_MINIMUM_LOG_SIZE: windows_sys::core::PCWSTR = windows_sys::core::w!("MinimumLogSizeInBytes");

// UNSUPPORTED Rust 2724:1: non-scalar type Ptr unsupported
// pub const CLUS_NAME_RES_TYPE_REPLICATION_GROUPID: windows_sys::core::PCWSTR = windows_sys::core::w!("ReplicationGroupId");

// UNSUPPORTED Rust 2725:1: non-scalar type Ptr unsupported
// pub const CLUS_NAME_RES_TYPE_REPLICATION_GROUP_TYPE: windows_sys::core::PCWSTR = windows_sys::core::w!("ReplicationClusterGroupType");

// UNSUPPORTED Rust 2726:1: non-scalar type Ptr unsupported
// pub const CLUS_NAME_RES_TYPE_SOURCE_RESID: windows_sys::core::PCWSTR = windows_sys::core::w!("SourceResourceId");

// UNSUPPORTED Rust 2727:1: non-scalar type Ptr unsupported
// pub const CLUS_NAME_RES_TYPE_SOURCE_VOLUMES: windows_sys::core::PCWSTR = windows_sys::core::w!("SourceVolumes");

// UNSUPPORTED Rust 2728:1: non-scalar type Ptr unsupported
// pub const CLUS_NAME_RES_TYPE_TARGET_RESID: windows_sys::core::PCWSTR = windows_sys::core::w!("TargetResourceId");

// UNSUPPORTED Rust 2729:1: non-scalar type Ptr unsupported
// pub const CLUS_NAME_RES_TYPE_TARGET_VOLUMES: windows_sys::core::PCWSTR = windows_sys::core::w!("TargetVolumes");

// UNSUPPORTED Rust 2730:1: non-scalar type Ptr unsupported
// pub const CLUS_NAME_RES_TYPE_UNIT_LOG_SIZE_CHANGE: windows_sys::core::PCWSTR = windows_sys::core::w!("UnitOfLogSizeChangeInBytes");

// UNSUPPORTED Rust 2731:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_NETNAME_IP_INFO_ENTRY {
//     pub NodeId: u32,
//     pub AddressSize: u32,
//     pub Address: [u8; 1],
// }

// UNSUPPORTED Rust 2738:1: declaration Impl has no candidate rule
// impl Default for CLUS_NETNAME_IP_INFO_ENTRY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2743:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_NETNAME_IP_INFO_FOR_MULTICHANNEL {
//     pub szName: [u16; 64],
//     pub NumEntries: u32,
//     pub IpInfo: [CLUS_NETNAME_IP_INFO_ENTRY; 1],
// }

// UNSUPPORTED Rust 2750:1: declaration Impl has no candidate rule
// impl Default for CLUS_NETNAME_IP_INFO_FOR_MULTICHANNEL {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2755:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_NETNAME_PWD_INFO {
//     pub Flags: u32,
//     pub Password: [u16; 16],
//     pub CreatingDC: [u16; 258],
//     pub ObjectGuid: [u16; 64],
// }

// UNSUPPORTED Rust 2763:1: declaration Impl has no candidate rule
// impl Default for CLUS_NETNAME_PWD_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2768:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_NETNAME_PWD_INFOEX {
//     pub Flags: u32,
//     pub Password: [u16; 128],
//     pub CreatingDC: [u16; 258],
//     pub ObjectGuid: [u16; 64],
// }

// UNSUPPORTED Rust 2776:1: declaration Impl has no candidate rule
// impl Default for CLUS_NETNAME_PWD_INFOEX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2781:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUS_NETNAME_VS_TOKEN_INFO {
//     pub ProcessID: u32,
//     pub DesiredAccess: u32,
//     pub InheritHandle: windows_sys::core::BOOL,
// }

public const val `CLUS_NODE_MAJORITY_QUORUM`: UInt = 0u;
public const val `CLUS_NOT_GLOBAL`: UInt = 0u;
public const val `CLUS_NO_MODIFY`: UInt = 0u;
public const val `CLUS_OBJECT_AFFINITYRULE`: `CLUSTER_CONTROL_OBJECT` = 9;
public const val `CLUS_OBJECT_CLUSTER`: `CLUSTER_CONTROL_OBJECT` = 7;
public const val `CLUS_OBJECT_GROUP`: `CLUSTER_CONTROL_OBJECT` = 3;
public const val `CLUS_OBJECT_GROUPSET`: `CLUSTER_CONTROL_OBJECT` = 8;
public const val `CLUS_OBJECT_INVALID`: `CLUSTER_CONTROL_OBJECT` = 0;
public const val `CLUS_OBJECT_NETINTERFACE`: `CLUSTER_CONTROL_OBJECT` = 6;
public const val `CLUS_OBJECT_NETWORK`: `CLUSTER_CONTROL_OBJECT` = 5;
public const val `CLUS_OBJECT_NODE`: `CLUSTER_CONTROL_OBJECT` = 4;
public const val `CLUS_OBJECT_RESOURCE`: `CLUSTER_CONTROL_OBJECT` = 1;
public const val `CLUS_OBJECT_RESOURCE_TYPE`: `CLUSTER_CONTROL_OBJECT` = 2;
public const val `CLUS_OBJECT_USER`: `CLUSTER_CONTROL_OBJECT` = 128;
// UNSUPPORTED Rust 2802:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_PARTITION_INFO {
//     pub dwFlags: u32,
//     pub szDeviceName: [u16; 260],
//     pub szVolumeLabel: [u16; 260],
//     pub dwSerialNumber: u32,
//     pub rgdwMaximumComponentLength: u32,
//     pub dwFileSystemFlags: u32,
//     pub szFileSystem: [u16; 32],
// }

// UNSUPPORTED Rust 2813:1: declaration Impl has no candidate rule
// impl Default for CLUS_PARTITION_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2818:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_PARTITION_INFO_EX {
//     pub dwFlags: u32,
//     pub szDeviceName: [u16; 260],
//     pub szVolumeLabel: [u16; 260],
//     pub dwSerialNumber: u32,
//     pub rgdwMaximumComponentLength: u32,
//     pub dwFileSystemFlags: u32,
//     pub szFileSystem: [u16; 32],
//     pub TotalSizeInBytes: u64,
//     pub FreeSizeInBytes: u64,
//     pub DeviceNumber: u32,
//     pub PartitionNumber: u32,
//     pub VolumeGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 2834:1: declaration Impl has no candidate rule
// impl Default for CLUS_PARTITION_INFO_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2839:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_PARTITION_INFO_EX2 {
//     pub GptPartitionId: windows_sys::core::GUID,
//     pub szPartitionName: [u16; 260],
//     pub EncryptionFlags: u32,
// }

// UNSUPPORTED Rust 2846:1: declaration Impl has no candidate rule
// impl Default for CLUS_PARTITION_INFO_EX2 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2851:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_PROVIDER_STATE_CHANGE_INFO {
//     pub dwSize: u32,
//     pub resourceState: CLUSTER_RESOURCE_STATE,
//     pub szProviderId: [u16; 1],
// }

// UNSUPPORTED Rust 2858:1: declaration Impl has no candidate rule
// impl Default for CLUS_PROVIDER_STATE_CHANGE_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CLUS_RESCLASS_NETWORK`: `CLUSTER_RESOURCE_CLASS` = 2;
public const val `CLUS_RESCLASS_STORAGE`: `CLUSTER_RESOURCE_CLASS` = 1;
public const val `CLUS_RESCLASS_UNKNOWN`: `CLUSTER_RESOURCE_CLASS` = 0;
public const val `CLUS_RESCLASS_USER`: `CLUSTER_RESOURCE_CLASS` = 32768;
public const val `CLUS_RESDLL_OFFLINE_DO_NOT_UPDATE_PERSISTENT_STATE`: UInt = 64u;
public const val `CLUS_RESDLL_OFFLINE_DUE_TO_EMBEDDED_FAILURE`: UInt = 16u;
public const val `CLUS_RESDLL_OFFLINE_IGNORE_NETWORK_CONNECTIVITY`: UInt = 32u;
public const val `CLUS_RESDLL_OFFLINE_IGNORE_RESOURCE_STATUS`: UInt = 1u;
public const val `CLUS_RESDLL_OFFLINE_QUEUE_ENABLED`: UInt = 4u;
public const val `CLUS_RESDLL_OFFLINE_RETURNING_TO_SOURCE_NODE_BECAUSE_OF_ERROR`: UInt = 8u;
public const val `CLUS_RESDLL_OFFLINE_RETURN_TO_SOURCE_NODE_ON_ERROR`: UInt = 2u;
public const val `CLUS_RESDLL_ONLINE_IGNORE_NETWORK_CONNECTIVITY`: UInt = 16u;
public const val `CLUS_RESDLL_ONLINE_IGNORE_RESOURCE_STATUS`: UInt = 2u;
public const val `CLUS_RESDLL_ONLINE_RECOVER_MONITOR_STATE`: UInt = 1u;
public const val `CLUS_RESDLL_ONLINE_RESTORE_ONLINE_STATE`: UInt = 8u;
public const val `CLUS_RESDLL_ONLINE_RETURN_TO_SOURCE_NODE_ON_ERROR`: UInt = 4u;
public const val `CLUS_RESDLL_OPEN_DONT_DELETE_TEMP_DISK`: UInt = 2u;
public const val `CLUS_RESDLL_OPEN_RECOVER_MONITOR_STATE`: UInt = 1u;
// UNSUPPORTED Rust 2881:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_RESOURCE_CLASS_INFO {
//     pub Anonymous: CLUS_RESOURCE_CLASS_INFO_0,
// }

// UNSUPPORTED Rust 2886:1: declaration Impl has no candidate rule
// impl Default for CLUS_RESOURCE_CLASS_INFO {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2891:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CLUS_RESOURCE_CLASS_INFO_0 {
//     pub Anonymous: CLUS_RESOURCE_CLASS_INFO_0_0,
//     pub li: u64,
// }

// UNSUPPORTED Rust 2897:1: declaration Impl has no candidate rule
// impl Default for CLUS_RESOURCE_CLASS_INFO_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2902:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_RESOURCE_CLASS_INFO_0_0 {
//     pub Anonymous: CLUS_RESOURCE_CLASS_INFO_0_0_0,
//     pub SubClass: u32,
// }

// UNSUPPORTED Rust 2908:1: declaration Impl has no candidate rule
// impl Default for CLUS_RESOURCE_CLASS_INFO_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2913:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CLUS_RESOURCE_CLASS_INFO_0_0_0 {
//     pub dw: u32,
//     pub rc: CLUSTER_RESOURCE_CLASS,
// }

// UNSUPPORTED Rust 2919:1: declaration Impl has no candidate rule
// impl Default for CLUS_RESOURCE_CLASS_INFO_0_0_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CLUS_RESSUBCLASS` = Int;
public typealias `CLUS_RESSUBCLASS_NETWORK` = Int;
public const val `CLUS_RESSUBCLASS_NETWORK_INTERNET_PROTOCOL`: `CLUS_RESSUBCLASS_NETWORK` = -2147483648;
public const val `CLUS_RESSUBCLASS_SHARED`: `CLUS_RESSUBCLASS` = -2147483648;
public typealias `CLUS_RESSUBCLASS_STORAGE` = Int;
public const val `CLUS_RESSUBCLASS_STORAGE_DISK`: `CLUS_RESSUBCLASS_STORAGE` = 1073741824;
public const val `CLUS_RESSUBCLASS_STORAGE_REPLICATION`: `CLUS_RESSUBCLASS_STORAGE` = 268435456;
public const val `CLUS_RESSUBCLASS_STORAGE_SHARED_BUS`: `CLUS_RESSUBCLASS_STORAGE` = -2147483648;
// UNSUPPORTED Rust 2932:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_CAU: windows_sys::core::PCWSTR = windows_sys::core::w!("ClusterAwareUpdatingResource");

// UNSUPPORTED Rust 2933:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_CLOUD_WITNESS: windows_sys::core::PCWSTR = windows_sys::core::w!("Cloud Witness");

// UNSUPPORTED Rust 2934:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_CONTAINER: windows_sys::core::PCWSTR = windows_sys::core::w!("Container");

// UNSUPPORTED Rust 2935:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_CROSS_CLUSTER: windows_sys::core::PCWSTR = windows_sys::core::w!("Cross Cluster Dependency Orchestrator");

// UNSUPPORTED Rust 2936:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_DFS: windows_sys::core::PCWSTR = windows_sys::core::w!("Distributed File System");

// UNSUPPORTED Rust 2937:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_DFSR: windows_sys::core::PCWSTR = windows_sys::core::w!("DFS Replicated Folder");

// UNSUPPORTED Rust 2938:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_DHCP: windows_sys::core::PCWSTR = windows_sys::core::w!("DHCP Service");

// UNSUPPORTED Rust 2939:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_DNN: windows_sys::core::PCWSTR = windows_sys::core::w!("Distributed Network Name");

// UNSUPPORTED Rust 2940:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_FILESERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("File Server");

// UNSUPPORTED Rust 2941:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_FILESHR: windows_sys::core::PCWSTR = windows_sys::core::w!("File Share");

// UNSUPPORTED Rust 2942:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_FSWITNESS: windows_sys::core::PCWSTR = windows_sys::core::w!("File Share Witness");

// UNSUPPORTED Rust 2943:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_GENAPP: windows_sys::core::PCWSTR = windows_sys::core::w!("Generic Application");

// UNSUPPORTED Rust 2944:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_GENSCRIPT: windows_sys::core::PCWSTR = windows_sys::core::w!("Generic Script");

// UNSUPPORTED Rust 2945:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_GENSVC: windows_sys::core::PCWSTR = windows_sys::core::w!("Generic Service");

// UNSUPPORTED Rust 2946:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_HARDDISK: windows_sys::core::PCWSTR = windows_sys::core::w!("Physical Disk");

// UNSUPPORTED Rust 2947:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_HCSVM: windows_sys::core::PCWSTR = windows_sys::core::w!("HCS Virtual Machine");

// UNSUPPORTED Rust 2948:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_HEALTH_SERVICE: windows_sys::core::PCWSTR = windows_sys::core::w!("Health Service");

// UNSUPPORTED Rust 2949:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_IPADDR: windows_sys::core::PCWSTR = windows_sys::core::w!("IP Address");

// UNSUPPORTED Rust 2950:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_IPV6_NATIVE: windows_sys::core::PCWSTR = windows_sys::core::w!("IPv6 Address");

// UNSUPPORTED Rust 2951:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_IPV6_TUNNEL: windows_sys::core::PCWSTR = windows_sys::core::w!("IPv6 Tunnel Address");

// UNSUPPORTED Rust 2952:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_ISCSITARGET: windows_sys::core::PCWSTR = windows_sys::core::w!("iSCSI Target Server");

// UNSUPPORTED Rust 2953:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_ISNS: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft iSNS");

// UNSUPPORTED Rust 2954:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_MSDTC: windows_sys::core::PCWSTR = windows_sys::core::w!("Distributed Transaction Coordinator");

// UNSUPPORTED Rust 2955:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_MSMQ: windows_sys::core::PCWSTR = windows_sys::core::w!("Microsoft Message Queue Server");

// UNSUPPORTED Rust 2956:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_MSMQ_TRIGGER: windows_sys::core::PCWSTR = windows_sys::core::w!("MSMQTriggers");

// UNSUPPORTED Rust 2957:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_NAT: windows_sys::core::PCWSTR = windows_sys::core::w!("Nat");

// UNSUPPORTED Rust 2958:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_NETNAME: windows_sys::core::PCWSTR = windows_sys::core::w!("Network Name");

// UNSUPPORTED Rust 2959:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_NETWORK_FILE_SYSTEM: windows_sys::core::PCWSTR = windows_sys::core::w!("Network File System");

// UNSUPPORTED Rust 2960:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_NEW_MSMQ: windows_sys::core::PCWSTR = windows_sys::core::w!("MSMQ");

// UNSUPPORTED Rust 2961:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_NFS: windows_sys::core::PCWSTR = windows_sys::core::w!("NFS Share");

// UNSUPPORTED Rust 2962:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_NFS_MSNS: windows_sys::core::PCWSTR = windows_sys::core::w!("NFS Multi Server Namespace");

// UNSUPPORTED Rust 2963:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_NFS_V2: windows_sys::core::PCWSTR = windows_sys::core::w!("Network File System");

// UNSUPPORTED Rust 2964:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_NV_PROVIDER_ADDRESS: windows_sys::core::PCWSTR = windows_sys::core::w!("Provider Address");

// UNSUPPORTED Rust 2965:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_PHYS_DISK: windows_sys::core::PCWSTR = windows_sys::core::w!("Physical Disk");

// UNSUPPORTED Rust 2966:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_PRTSPLR: windows_sys::core::PCWSTR = windows_sys::core::w!("Print Spooler");

// UNSUPPORTED Rust 2967:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_SCALEOUT_MASTER: windows_sys::core::PCWSTR = windows_sys::core::w!("Scaleout Master");

// UNSUPPORTED Rust 2968:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_SCALEOUT_WORKER: windows_sys::core::PCWSTR = windows_sys::core::w!("Scaleout Worker");

// UNSUPPORTED Rust 2969:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_SDDC_MANAGEMENT: windows_sys::core::PCWSTR = windows_sys::core::w!("SDDC Management");

// UNSUPPORTED Rust 2970:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_SODAFILESERVER: windows_sys::core::PCWSTR = windows_sys::core::w!("Scale Out File Server");

// UNSUPPORTED Rust 2971:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_STORAGE_POLICIES: windows_sys::core::PCWSTR = windows_sys::core::w!("Storage Policies");

// UNSUPPORTED Rust 2972:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_STORAGE_POOL: windows_sys::core::PCWSTR = windows_sys::core::w!("Storage Pool");

// UNSUPPORTED Rust 2973:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_STORAGE_REPLICA: windows_sys::core::PCWSTR = windows_sys::core::w!("Storage Replica");

// UNSUPPORTED Rust 2974:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_STORQOS: windows_sys::core::PCWSTR = windows_sys::core::w!("Storage QoS Policy Manager");

// UNSUPPORTED Rust 2975:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_TASKSCHEDULER: windows_sys::core::PCWSTR = windows_sys::core::w!("Task Scheduler");

// UNSUPPORTED Rust 2976:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_VIRTUAL_IPV4: windows_sys::core::PCWSTR = windows_sys::core::w!("Disjoint IPv4 Address");

// UNSUPPORTED Rust 2977:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_VIRTUAL_IPV6: windows_sys::core::PCWSTR = windows_sys::core::w!("Disjoint IPv6 Address");

// UNSUPPORTED Rust 2978:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_VM: windows_sys::core::PCWSTR = windows_sys::core::w!("Virtual Machine");

// UNSUPPORTED Rust 2979:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_VMREPLICA_BROKER: windows_sys::core::PCWSTR = windows_sys::core::w!("Virtual Machine Replication Broker");

// UNSUPPORTED Rust 2980:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_VMREPLICA_COORDINATOR: windows_sys::core::PCWSTR = windows_sys::core::w!("Virtual Machine Replication Coordinator");

// UNSUPPORTED Rust 2981:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_VM_CONFIG: windows_sys::core::PCWSTR = windows_sys::core::w!("Virtual Machine Configuration");

// UNSUPPORTED Rust 2982:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_VM_WMI: windows_sys::core::PCWSTR = windows_sys::core::w!("Virtual Machine Cluster WMI");

// UNSUPPORTED Rust 2983:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_VSSTASK: windows_sys::core::PCWSTR = windows_sys::core::w!("Volume Shadow Copy Service Task");

// UNSUPPORTED Rust 2984:1: non-scalar type Ptr unsupported
// pub const CLUS_RESTYPE_NAME_WINS: windows_sys::core::PCWSTR = windows_sys::core::w!("WINS Service");

// UNSUPPORTED Rust 2985:1: non-scalar type Ptr unsupported
// pub const CLUS_RES_NAME_SCALEOUT_MASTER: windows_sys::core::PCWSTR = windows_sys::core::w!("Scaleout Master");

// UNSUPPORTED Rust 2986:1: non-scalar type Ptr unsupported
// pub const CLUS_RES_NAME_SCALEOUT_WORKER: windows_sys::core::PCWSTR = windows_sys::core::w!("Scaleout Worker");

// UNSUPPORTED Rust 2987:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_SCSI_ADDRESS {
//     pub Anonymous: CLUS_SCSI_ADDRESS_0,
// }

// UNSUPPORTED Rust 2992:1: declaration Impl has no candidate rule
// impl Default for CLUS_SCSI_ADDRESS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 2997:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union CLUS_SCSI_ADDRESS_0 {
//     pub Anonymous: CLUS_SCSI_ADDRESS_0_0,
//     pub dw: u32,
// }

// UNSUPPORTED Rust 3003:1: declaration Impl has no candidate rule
// impl Default for CLUS_SCSI_ADDRESS_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3008:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUS_SCSI_ADDRESS_0_0 {
//     pub PortNumber: u8,
//     pub PathId: u8,
//     pub TargetId: u8,
//     pub Lun: u8,
// }

// UNSUPPORTED Rust 3016:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_SET_MAINTENANCE_MODE_INPUT {
//     pub InMaintenance: windows_sys::core::BOOL,
//     pub ExtraParameterSize: u32,
//     pub ExtraParameter: [u8; 1],
// }

// UNSUPPORTED Rust 3023:1: declaration Impl has no candidate rule
// impl Default for CLUS_SET_MAINTENANCE_MODE_INPUT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3028:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_SHARED_VOLUME_BACKUP_MODE {
//     pub BackupState: CLUSTER_SHARED_VOLUME_BACKUP_STATE,
//     pub DelayTimerInSecs: u32,
//     pub VolumeName: [u16; 260],
// }

// UNSUPPORTED Rust 3035:1: declaration Impl has no candidate rule
// impl Default for CLUS_SHARED_VOLUME_BACKUP_MODE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 3040:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUS_STARTING_PARAMS {
//     pub dwSize: u32,
//     pub bForm: windows_sys::core::BOOL,
//     pub bFirst: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3047:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUS_STORAGE_GET_AVAILABLE_DRIVELETTERS {
//     pub AvailDrivelettersMask: u32,
// }

// UNSUPPORTED Rust 3052:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUS_STORAGE_REMAP_DRIVELETTER {
//     pub CurrentDriveLetterMask: u32,
//     pub TargetDriveLetterMask: u32,
// }

// UNSUPPORTED Rust 3058:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct CLUS_STORAGE_SET_DRIVELETTER {
//     pub PartitionNumber: u32,
//     pub DriveLetterMask: u32,
// }

// UNSUPPORTED Rust 3064:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CLUS_WORKER {
//     pub hThread: super::super::Foundation::HANDLE,
//     pub Terminate: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3070:1: declaration Impl has no candidate rule
// impl Default for CLUS_WORKER {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CREATEDC_PRESENT`: UInt = 2u;
// UNSUPPORTED Rust 3076:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CREATE_CLUSTER_CONFIG {
//     pub dwVersion: u32,
//     pub lpszClusterName: windows_sys::core::PCWSTR,
//     pub cNodes: u32,
//     pub ppszNodeNames: *const windows_sys::core::PCWSTR,
//     pub cIpEntries: u32,
//     pub pIpEntries: *mut CLUSTER_IP_ENTRY,
//     pub fEmptyCluster: bool,
//     pub managementPointType: CLUSTER_MGMT_POINT_TYPE,
//     pub managementPointResType: CLUSTER_MGMT_POINT_RESTYPE,
// }

// UNSUPPORTED Rust 3089:1: declaration Impl has no candidate rule
// impl Default for CREATE_CLUSTER_CONFIG {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CREATE_CLUSTER_MAJOR_VERSION_MASK`: UInt = 4294967040u;
// UNSUPPORTED Rust 3095:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct CREATE_CLUSTER_NAME_ACCOUNT {
//     pub dwVersion: u32,
//     pub lpszClusterName: windows_sys::core::PCWSTR,
//     pub dwFlags: u32,
//     pub pszUserName: windows_sys::core::PCWSTR,
//     pub pszPassword: windows_sys::core::PCWSTR,
//     pub pszDomain: windows_sys::core::PCWSTR,
//     pub managementPointType: CLUSTER_MGMT_POINT_TYPE,
//     pub managementPointResType: CLUSTER_MGMT_POINT_RESTYPE,
//     pub bUpgradeVCOs: bool,
// }

// UNSUPPORTED Rust 3108:1: declaration Impl has no candidate rule
// impl Default for CREATE_CLUSTER_NAME_ACCOUNT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `CREATE_CLUSTER_VERSION`: UInt = 1536u;
public const val `CTCTL_GET_FAULT_DOMAIN_STATE`: `CLCTL_CODES` = 789;
public const val `CTCTL_GET_ROUTESTATUS_BASIC`: `CLCTL_CODES` = 781;
public const val `CTCTL_GET_ROUTESTATUS_EXTENDED`: `CLCTL_CODES` = 785;
// UNSUPPORTED Rust 3117:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusApplication: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606e5_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3118:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusCryptoKeys: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e6072b_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3119:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusDisk: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e60723_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3120:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusDisks: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e60725_2631_11d1_89f1_00a0c90d061e);

public const val `ClusGroupTypeAvailableStorage`: `CLUSGROUP_TYPE` = 2;
public const val `ClusGroupTypeClusterUpdateAgent`: `CLUSGROUP_TYPE` = 117;
public const val `ClusGroupTypeCoreCluster`: `CLUSGROUP_TYPE` = 1;
public const val `ClusGroupTypeCoreSddc`: `CLUSGROUP_TYPE` = 123;
public const val `ClusGroupTypeCrossClusterOrchestrator`: `CLUSGROUP_TYPE` = 121;
public const val `ClusGroupTypeDhcpServer`: `CLUSGROUP_TYPE` = 102;
public const val `ClusGroupTypeDtc`: `CLUSGROUP_TYPE` = 103;
public const val `ClusGroupTypeFileServer`: `CLUSGROUP_TYPE` = 100;
public const val `ClusGroupTypeGenericApplication`: `CLUSGROUP_TYPE` = 107;
public const val `ClusGroupTypeGenericScript`: `CLUSGROUP_TYPE` = 109;
public const val `ClusGroupTypeGenericService`: `CLUSGROUP_TYPE` = 108;
public const val `ClusGroupTypeIScsiNameService`: `CLUSGROUP_TYPE` = 110;
public const val `ClusGroupTypeIScsiTarget`: `CLUSGROUP_TYPE` = 113;
public const val `ClusGroupTypeInfrastructureFileServer`: `CLUSGROUP_TYPE` = 122;
public const val `ClusGroupTypeMsmq`: `CLUSGROUP_TYPE` = 104;
public const val `ClusGroupTypePrintServer`: `CLUSGROUP_TYPE` = 101;
public const val `ClusGroupTypeScaleoutCluster`: `CLUSGROUP_TYPE` = 118;
public const val `ClusGroupTypeScaleoutFileServer`: `CLUSGROUP_TYPE` = 114;
public const val `ClusGroupTypeSharedVolume`: `CLUSGROUP_TYPE` = 4;
public const val `ClusGroupTypeStandAloneDfs`: `CLUSGROUP_TYPE` = 106;
public const val `ClusGroupTypeStoragePool`: `CLUSGROUP_TYPE` = 5;
public const val `ClusGroupTypeStorageReplica`: `CLUSGROUP_TYPE` = 119;
public const val `ClusGroupTypeTaskScheduler`: `CLUSGROUP_TYPE` = 116;
public const val `ClusGroupTypeTemporary`: `CLUSGROUP_TYPE` = 3;
public const val `ClusGroupTypeTsSessionBroker`: `CLUSGROUP_TYPE` = 112;
public const val `ClusGroupTypeUnknown`: `CLUSGROUP_TYPE` = 9999;
public const val `ClusGroupTypeVMReplicaBroker`: `CLUSGROUP_TYPE` = 115;
public const val `ClusGroupTypeVMReplicaCoordinator`: `CLUSGROUP_TYPE` = 120;
public const val `ClusGroupTypeVirtualMachine`: `CLUSGROUP_TYPE` = 111;
public const val `ClusGroupTypeWins`: `CLUSGROUP_TYPE` = 105;
// UNSUPPORTED Rust 3151:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusNetInterface: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606ed_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3152:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusNetInterfaces: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606ef_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3153:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusNetwork: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606f1_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3154:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusNetworkNetInterfaces: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606f5_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3155:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusNetworks: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606f3_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3156:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusNode: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606f7_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3157:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusNodeNetInterfaces: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606fb_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3158:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusNodes: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606f9_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3159:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusPartition: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e6071f_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3160:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusPartitionEx: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x53d51d26_b51b_4a79_b2c3_5048d93a98fc);

// UNSUPPORTED Rust 3161:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusPartitions: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e60721_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3162:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusProperties: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606ff_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3163:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusProperty: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606fd_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3164:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusPropertyValue: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e60719_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3165:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusPropertyValueData: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e6071d_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3166:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusPropertyValues: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e6071b_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3167:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusRefObject: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e60701_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3168:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusRegistryKeys: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e60729_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3169:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusResDependencies: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e60703_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3170:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusResDependents: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e6072d_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3171:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusResGroup: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e60705_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3172:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusResGroupPreferredOwnerNodes: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606e7_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3173:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusResGroupResources: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606e9_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3174:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusResGroups: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e60707_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3175:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusResPossibleOwnerNodes: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e6070d_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3176:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusResType: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e6070f_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3177:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusResTypePossibleOwnerNodes: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e60717_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3178:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusResTypeResources: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e60713_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3179:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusResTypes: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e60711_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3180:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusResource: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e60709_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3181:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusResources: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e6070b_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3182:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusScsiAddress: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e60727_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3183:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusVersion: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e60715_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3184:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const Cluster: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606e3_2631_11d1_89f1_00a0c90d061e);

public const val `ClusterGroupAllowFailback`: `CLUSTER_GROUP_AUTOFAILBACK_TYPE` = 1;
public const val `ClusterGroupFailbackTypeCount`: `CLUSTER_GROUP_AUTOFAILBACK_TYPE` = 2;
public const val `ClusterGroupFailed`: `CLUSTER_GROUP_STATE` = 2;
public const val `ClusterGroupOffline`: `CLUSTER_GROUP_STATE` = 1;
public const val `ClusterGroupOnline`: `CLUSTER_GROUP_STATE` = 0;
public const val `ClusterGroupPartialOnline`: `CLUSTER_GROUP_STATE` = 3;
public const val `ClusterGroupPending`: `CLUSTER_GROUP_STATE` = 4;
public const val `ClusterGroupPreventFailback`: `CLUSTER_GROUP_AUTOFAILBACK_TYPE` = 0;
public const val `ClusterGroupStateUnknown`: `CLUSTER_GROUP_STATE` = -1;
// UNSUPPORTED Rust 3194:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const ClusterNames: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606eb_2631_11d1_89f1_00a0c90d061e);

public const val `ClusterNetInterfaceFailed`: `CLUSTER_NETINTERFACE_STATE` = 1;
public const val `ClusterNetInterfaceStateUnknown`: `CLUSTER_NETINTERFACE_STATE` = -1;
public const val `ClusterNetInterfaceUnavailable`: `CLUSTER_NETINTERFACE_STATE` = 0;
public const val `ClusterNetInterfaceUnreachable`: `CLUSTER_NETINTERFACE_STATE` = 2;
public const val `ClusterNetInterfaceUp`: `CLUSTER_NETINTERFACE_STATE` = 3;
public const val `ClusterNetworkDown`: `CLUSTER_NETWORK_STATE` = 1;
public const val `ClusterNetworkPartitioned`: `CLUSTER_NETWORK_STATE` = 2;
public const val `ClusterNetworkRoleClientAccess`: `CLUSTER_NETWORK_ROLE` = 2;
public const val `ClusterNetworkRoleInternalAndClient`: `CLUSTER_NETWORK_ROLE` = 3;
public const val `ClusterNetworkRoleInternalUse`: `CLUSTER_NETWORK_ROLE` = 1;
public const val `ClusterNetworkRoleNone`: `CLUSTER_NETWORK_ROLE` = 0;
public const val `ClusterNetworkStateUnknown`: `CLUSTER_NETWORK_STATE` = -1;
public const val `ClusterNetworkUnavailable`: `CLUSTER_NETWORK_STATE` = 0;
public const val `ClusterNetworkUp`: `CLUSTER_NETWORK_STATE` = 3;
public const val `ClusterNodeDown`: `CLUSTER_NODE_STATE` = 1;
public const val `ClusterNodeDrainStatusCount`: `CLUSTER_NODE_DRAIN_STATUS` = 4;
public const val `ClusterNodeJoining`: `CLUSTER_NODE_STATE` = 3;
public const val `ClusterNodePaused`: `CLUSTER_NODE_STATE` = 2;
public const val `ClusterNodeResumeFailbackTypeCount`: `CLUSTER_NODE_RESUME_FAILBACK_TYPE` = 3;
public const val `ClusterNodeStateUnknown`: `CLUSTER_NODE_STATE` = -1;
public const val `ClusterNodeUp`: `CLUSTER_NODE_STATE` = 0;
public const val `ClusterResourceApplicationOSHeartBeat`: `CLUSTER_RESOURCE_APPLICATION_STATE` = 2;
public const val `ClusterResourceApplicationReady`: `CLUSTER_RESOURCE_APPLICATION_STATE` = 3;
public const val `ClusterResourceApplicationStateUnknown`: `CLUSTER_RESOURCE_APPLICATION_STATE` = 1;
public const val `ClusterResourceDontRestart`: `CLUSTER_RESOURCE_RESTART_ACTION` = 0;
public const val `ClusterResourceEmbeddedFailureActionLogOnly`: `CLUSTER_RESOURCE_EMBEDDED_FAILURE_ACTION` = 1;
public const val `ClusterResourceEmbeddedFailureActionNone`: `CLUSTER_RESOURCE_EMBEDDED_FAILURE_ACTION` = 0;
public const val `ClusterResourceEmbeddedFailureActionRecover`: `CLUSTER_RESOURCE_EMBEDDED_FAILURE_ACTION` = 2;
public const val `ClusterResourceFailed`: `CLUSTER_RESOURCE_STATE` = 4;
public const val `ClusterResourceInherited`: `CLUSTER_RESOURCE_STATE` = 0;
public const val `ClusterResourceInitializing`: `CLUSTER_RESOURCE_STATE` = 1;
public const val `ClusterResourceOffline`: `CLUSTER_RESOURCE_STATE` = 3;
public const val `ClusterResourceOfflinePending`: `CLUSTER_RESOURCE_STATE` = 130;
public const val `ClusterResourceOnline`: `CLUSTER_RESOURCE_STATE` = 2;
public const val `ClusterResourceOnlinePending`: `CLUSTER_RESOURCE_STATE` = 129;
public const val `ClusterResourcePending`: `CLUSTER_RESOURCE_STATE` = 128;
public const val `ClusterResourceRestartActionCount`: `CLUSTER_RESOURCE_RESTART_ACTION` = 3;
public const val `ClusterResourceRestartNoNotify`: `CLUSTER_RESOURCE_RESTART_ACTION` = 1;
public const val `ClusterResourceRestartNotify`: `CLUSTER_RESOURCE_RESTART_ACTION` = 2;
public const val `ClusterResourceStateUnknown`: `CLUSTER_RESOURCE_STATE` = -1;
public const val `ClusterRoleClustered`: `CLUSTER_ROLE_STATE` = 0;
public const val `ClusterRoleDFSReplicatedFolder`: `CLUSTER_ROLE` = 15;
public const val `ClusterRoleDHCP`: `CLUSTER_ROLE` = 0;
public const val `ClusterRoleDTC`: `CLUSTER_ROLE` = 1;
public const val `ClusterRoleDistributedFileSystem`: `CLUSTER_ROLE` = 16;
public const val `ClusterRoleDistributedNetworkName`: `CLUSTER_ROLE` = 17;
public const val `ClusterRoleFileServer`: `CLUSTER_ROLE` = 2;
public const val `ClusterRoleFileShare`: `CLUSTER_ROLE` = 18;
public const val `ClusterRoleFileShareWitness`: `CLUSTER_ROLE` = 19;
public const val `ClusterRoleGenericApplication`: `CLUSTER_ROLE` = 3;
public const val `ClusterRoleGenericScript`: `CLUSTER_ROLE` = 4;
public const val `ClusterRoleGenericService`: `CLUSTER_ROLE` = 5;
public const val `ClusterRoleHardDisk`: `CLUSTER_ROLE` = 20;
public const val `ClusterRoleIPAddress`: `CLUSTER_ROLE` = 21;
public const val `ClusterRoleIPV6Address`: `CLUSTER_ROLE` = 22;
public const val `ClusterRoleIPV6TunnelAddress`: `CLUSTER_ROLE` = 23;
public const val `ClusterRoleISCSINameServer`: `CLUSTER_ROLE` = 6;
public const val `ClusterRoleISCSITargetServer`: `CLUSTER_ROLE` = 24;
public const val `ClusterRoleMSMQ`: `CLUSTER_ROLE` = 7;
public const val `ClusterRoleNFS`: `CLUSTER_ROLE` = 8;
public const val `ClusterRoleNetworkFileSystem`: `CLUSTER_ROLE` = 14;
public const val `ClusterRoleNetworkName`: `CLUSTER_ROLE` = 25;
public const val `ClusterRolePhysicalDisk`: `CLUSTER_ROLE` = 26;
public const val `ClusterRolePrintServer`: `CLUSTER_ROLE` = 9;
public const val `ClusterRoleSODAFileServer`: `CLUSTER_ROLE` = 27;
public const val `ClusterRoleStandAloneNamespaceServer`: `CLUSTER_ROLE` = 10;
public const val `ClusterRoleStoragePool`: `CLUSTER_ROLE` = 28;
public const val `ClusterRoleTaskScheduler`: `CLUSTER_ROLE` = 13;
public const val `ClusterRoleUnclustered`: `CLUSTER_ROLE_STATE` = 1;
public const val `ClusterRoleUnknown`: `CLUSTER_ROLE_STATE` = -1;
public const val `ClusterRoleVirtualMachine`: `CLUSTER_ROLE` = 29;
public const val `ClusterRoleVirtualMachineConfiguration`: `CLUSTER_ROLE` = 30;
public const val `ClusterRoleVirtualMachineReplicaBroker`: `CLUSTER_ROLE` = 31;
public const val `ClusterRoleVolumeShadowCopyServiceTask`: `CLUSTER_ROLE` = 11;
public const val `ClusterRoleWINS`: `CLUSTER_ROLE` = 12;
public const val `ClusterSetupPhaseAddClusterProperties`: `CLUSTER_SETUP_PHASE` = 201;
public const val `ClusterSetupPhaseAddNodeToCluster`: `CLUSTER_SETUP_PHASE` = 301;
public const val `ClusterSetupPhaseCleanupCOs`: `CLUSTER_SETUP_PHASE` = 402;
public const val `ClusterSetupPhaseCleanupNode`: `CLUSTER_SETUP_PHASE` = 405;
public const val `ClusterSetupPhaseClusterGroupOnline`: `CLUSTER_SETUP_PHASE` = 206;
public const val `ClusterSetupPhaseConfigureClusSvc`: `CLUSTER_SETUP_PHASE` = 104;
public const val `ClusterSetupPhaseConfigureClusterAccount`: `CLUSTER_SETUP_PHASE` = 109;
public const val `ClusterSetupPhaseContinue`: `CLUSTER_SETUP_PHASE_TYPE` = 2;
public const val `ClusterSetupPhaseCoreGroupCleanup`: `CLUSTER_SETUP_PHASE` = 406;
public const val `ClusterSetupPhaseCreateClusterAccount`: `CLUSTER_SETUP_PHASE` = 108;
public const val `ClusterSetupPhaseCreateGroups`: `CLUSTER_SETUP_PHASE` = 203;
public const val `ClusterSetupPhaseCreateIPAddressResources`: `CLUSTER_SETUP_PHASE` = 204;
public const val `ClusterSetupPhaseCreateNetworkName`: `CLUSTER_SETUP_PHASE` = 205;
public const val `ClusterSetupPhaseCreateResourceTypes`: `CLUSTER_SETUP_PHASE` = 202;
public const val `ClusterSetupPhaseDeleteGroup`: `CLUSTER_SETUP_PHASE` = 401;
public const val `ClusterSetupPhaseEnd`: `CLUSTER_SETUP_PHASE_TYPE` = 3;
public const val `ClusterSetupPhaseEvictNode`: `CLUSTER_SETUP_PHASE` = 404;
public const val `ClusterSetupPhaseFailureCleanup`: `CLUSTER_SETUP_PHASE` = 999;
public const val `ClusterSetupPhaseFatal`: `CLUSTER_SETUP_PHASE_SEVERITY` = 3;
public const val `ClusterSetupPhaseFormingCluster`: `CLUSTER_SETUP_PHASE` = 200;
public const val `ClusterSetupPhaseGettingCurrentMembership`: `CLUSTER_SETUP_PHASE` = 300;
public const val `ClusterSetupPhaseInformational`: `CLUSTER_SETUP_PHASE_SEVERITY` = 1;
public const val `ClusterSetupPhaseInitialize`: `CLUSTER_SETUP_PHASE` = 1;
public const val `ClusterSetupPhaseMoveGroup`: `CLUSTER_SETUP_PHASE` = 400;
public const val `ClusterSetupPhaseNodeUp`: `CLUSTER_SETUP_PHASE` = 302;
public const val `ClusterSetupPhaseOfflineGroup`: `CLUSTER_SETUP_PHASE` = 403;
public const val `ClusterSetupPhaseQueryClusterNameAccount`: `CLUSTER_SETUP_PHASE` = 106;
public const val `ClusterSetupPhaseReport`: `CLUSTER_SETUP_PHASE_TYPE` = 4;
public const val `ClusterSetupPhaseStart`: `CLUSTER_SETUP_PHASE_TYPE` = 1;
public const val `ClusterSetupPhaseStartingClusSvc`: `CLUSTER_SETUP_PHASE` = 105;
public const val `ClusterSetupPhaseValidateClusDisk`: `CLUSTER_SETUP_PHASE` = 103;
public const val `ClusterSetupPhaseValidateClusterNameAccount`: `CLUSTER_SETUP_PHASE` = 107;
public const val `ClusterSetupPhaseValidateNetft`: `CLUSTER_SETUP_PHASE` = 102;
public const val `ClusterSetupPhaseValidateNodeState`: `CLUSTER_SETUP_PHASE` = 100;
public const val `ClusterSetupPhaseWarning`: `CLUSTER_SETUP_PHASE_SEVERITY` = 2;
public const val `ClusterSharedVolumeHWSnapshotCompleted`: `CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE` = 2;
public const val `ClusterSharedVolumePrepareForFreeze`: `CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE` = 3;
public const val `ClusterSharedVolumePrepareForHWSnapshot`: `CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE` = 1;
public const val `ClusterSharedVolumeRenameInputTypeNone`: `CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE` = 0;
public const val `ClusterSharedVolumeRenameInputTypeVolumeGuid`: `CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE` = 4;
public const val `ClusterSharedVolumeRenameInputTypeVolumeId`: `CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE` = 2;
public const val `ClusterSharedVolumeRenameInputTypeVolumeName`: `CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE` = 3;
public const val `ClusterSharedVolumeRenameInputTypeVolumeOffset`: `CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE` = 1;
public const val `ClusterSharedVolumeSnapshotStateUnknown`: `CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE` = 0;
public const val `ClusterStateNotConfigured`: `NODE_CLUSTER_STATE` = 1;
public const val `ClusterStateNotInstalled`: `NODE_CLUSTER_STATE` = 0;
public const val `ClusterStateNotRunning`: `NODE_CLUSTER_STATE` = 3;
public const val `ClusterStateRunning`: `NODE_CLUSTER_STATE` = 19;
public const val `ClusterStorageNodeDown`: `CLUSTER_STORAGENODE_STATE` = 2;
public const val `ClusterStorageNodePaused`: `CLUSTER_STORAGENODE_STATE` = 3;
public const val `ClusterStorageNodeStarting`: `CLUSTER_STORAGENODE_STATE` = 4;
public const val `ClusterStorageNodeStateUnknown`: `CLUSTER_STORAGENODE_STATE` = 0;
public const val `ClusterStorageNodeStopping`: `CLUSTER_STORAGENODE_STATE` = 5;
public const val `ClusterStorageNodeUp`: `CLUSTER_STORAGENODE_STATE` = 1;
public const val `ClusterUpgradePhaseInitialize`: `CLUSTER_UPGRADE_PHASE` = 1;
public const val `ClusterUpgradePhaseInstallingNewComponents`: `CLUSTER_UPGRADE_PHASE` = 4;
public const val `ClusterUpgradePhaseUpgradeComplete`: `CLUSTER_UPGRADE_PHASE` = 5;
public const val `ClusterUpgradePhaseUpgradingComponents`: `CLUSTER_UPGRADE_PHASE` = 3;
public const val `ClusterUpgradePhaseValidatingUpgrade`: `CLUSTER_UPGRADE_PHASE` = 2;
public const val `DNS_LENGTH`: UInt = 64u;
public const val `DoNotFailbackGroups`: `CLUSTER_NODE_RESUME_FAILBACK_TYPE` = 0;
// UNSUPPORTED Rust 3331:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID
// pub const DomainNames: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e606e1_2631_11d1_89f1_00a0c90d061e);

// UNSUPPORTED Rust 3332:1: non-scalar type Ptr unsupported
// pub const ENABLE_CLUSTER_SHARED_VOLUMES: windows_sys::core::PCWSTR = windows_sys::core::w!("EnableSharedVolumes");

public typealias `FAILURE_TYPE` = Int;
public const val `FAILURE_TYPE_EMBEDDED`: `FAILURE_TYPE` = 1;
public const val `FAILURE_TYPE_GENERAL`: `FAILURE_TYPE` = 0;
public const val `FAILURE_TYPE_NETWORK_LOSS`: `FAILURE_TYPE` = 2;
public const val `FE_UPGRADE_VERSION`: UInt = 4u;
// UNSUPPORTED Rust 3338:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILESHARE_CHANGE {
//     pub Change: FILESHARE_CHANGE_ENUM,
//     pub ShareName: [u16; 84],
// }

// UNSUPPORTED Rust 3344:1: declaration Impl has no candidate rule
// impl Default for FILESHARE_CHANGE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILESHARE_CHANGE_ADD`: `FILESHARE_CHANGE_ENUM` = 1;
public const val `FILESHARE_CHANGE_DEL`: `FILESHARE_CHANGE_ENUM` = 2;
public typealias `FILESHARE_CHANGE_ENUM` = Int;
// UNSUPPORTED Rust 3352:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct FILESHARE_CHANGE_LIST {
//     pub NumEntries: u32,
//     pub ChangeEntry: [FILESHARE_CHANGE; 1],
// }

// UNSUPPORTED Rust 3358:1: declaration Impl has no candidate rule
// impl Default for FILESHARE_CHANGE_LIST {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `FILESHARE_CHANGE_MODIFY`: `FILESHARE_CHANGE_ENUM` = 3;
public const val `FILESHARE_CHANGE_NONE`: `FILESHARE_CHANGE_ENUM` = 0;
public const val `FailbackGroupsImmediately`: `CLUSTER_NODE_RESUME_FAILBACK_TYPE` = 1;
public const val `FailbackGroupsPerPolicy`: `CLUSTER_NODE_RESUME_FAILBACK_TYPE` = 2;
// UNSUPPORTED Rust 3367:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GET_OPERATION_CONTEXT_PARAMS {
//     pub Size: u32,
//     pub Version: u32,
//     pub Type: RESDLL_CONTEXT_OPERATION_TYPE,
//     pub Priority: u32,
// }

public const val `GROUPSET_READY_SETTING_APPLICATION_READY`: UInt = 4u;
public const val `GROUPSET_READY_SETTING_DELAY`: UInt = 1u;
public const val `GROUPSET_READY_SETTING_ONLINE`: UInt = 2u;
public const val `GROUPSET_READY_SETTING_OS_HEARTBEAT`: UInt = 3u;
// UNSUPPORTED Rust 3379:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GROUP_FAILURE_INFO {
//     pub dwFailoverAttemptsRemaining: u32,
//     pub dwFailoverPeriodRemaining: u32,
// }

// UNSUPPORTED Rust 3385:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GROUP_FAILURE_INFO_BUFFER {
//     pub dwVersion: u32,
//     pub Info: GROUP_FAILURE_INFO,
// }

public const val `GROUP_FAILURE_INFO_VERSION_1`: UInt = 1u;
public typealias `GRP_PLACEMENT_OPTIONS` = Int;
public const val `GRP_PLACEMENT_OPTIONS_ALL`: `GRP_PLACEMENT_OPTIONS` = 1;
public const val `GRP_PLACEMENT_OPTIONS_DEFAULT`: `GRP_PLACEMENT_OPTIONS` = 0;
public const val `GRP_PLACEMENT_OPTIONS_DISABLE_AUTOBALANCING`: `GRP_PLACEMENT_OPTIONS` = 1;
public const val `GRP_PLACEMENT_OPTIONS_MIN_VALUE`: `GRP_PLACEMENT_OPTIONS` = 0;
public const val `GUID_PRESENT`: UInt = 1u;
public typealias `HCHANGE` = Long;
public const val `HCI_UPGRADE_BIT`: UInt = 32768u;
public typealias `HCLUSCRYPTPROVIDER` = Long;
public typealias `HCLUSENUM` = Long;
public typealias `HCLUSENUMEX` = Long;
public typealias `HCLUSTER` = Long;
public typealias `HGROUP` = Long;
public typealias `HGROUPENUM` = Long;
public typealias `HGROUPENUMEX` = Long;
public typealias `HGROUPSET` = Long;
public typealias `HGROUPSETENUM` = Long;
public typealias `HNETINTERFACE` = Long;
public typealias `HNETINTERFACEENUM` = Long;
public typealias `HNETWORK` = Long;
public typealias `HNETWORKENUM` = Long;
public typealias `HNODE` = Long;
public typealias `HNODEENUM` = Long;
public typealias `HNODEENUMEX` = Long;
public typealias `HREGBATCH` = Long;
public typealias `HREGBATCHNOTIFICATION` = Long;
public typealias `HREGBATCHPORT` = Long;
public typealias `HREGREADBATCH` = Long;
public typealias `HREGREADBATCHREPLY` = Long;
public typealias `HRESENUM` = Long;
public typealias `HRESENUMEX` = Long;
public typealias `HRESOURCE` = Long;
public typealias `HRESTYPEENUM` = Long;
public const val `LOCKED_MODE_FLAGS_DONT_REMOVE_FROM_MOVE_QUEUE`: UInt = 1u;
public const val `LOG_ERROR`: `LOG_LEVEL` = 2;
public const val `LOG_INFORMATION`: `LOG_LEVEL` = 0;
public typealias `LOG_LEVEL` = Int;
public const val `LOG_SEVERE`: `LOG_LEVEL` = 3;
public const val `LOG_WARNING`: `LOG_LEVEL` = 1;
// UNSUPPORTED Rust 3431:1: generic scalar type unsupported
// pub type LPGROUP_CALLBACK_EX = Option<unsafe extern "system" fn(param0: HCLUSTER, param1: HGROUP, param2: HGROUP, param3: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 3432:1: generic scalar type unsupported
// pub type LPNODE_CALLBACK = Option<unsafe extern "system" fn(param0: HCLUSTER, param1: HNODE, param2: CLUSTER_NODE_STATE, param3: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 3433:1: generic scalar type unsupported
// pub type LPRESOURCE_CALLBACK = Option<unsafe extern "system" fn(param0: HRESOURCE, param1: HRESOURCE, param2: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 3434:1: generic scalar type unsupported
// pub type LPRESOURCE_CALLBACK_EX = Option<unsafe extern "system" fn(param0: HCLUSTER, param1: HRESOURCE, param2: HRESOURCE, param3: *mut core::ffi::c_void) -> u32>;

public typealias `MAINTENANCE_MODE_TYPE_ENUM` = Int;
public const val `MAINTENANCE_MODE_V2_SIG`: UInt = 2881155087u;
public const val `MAX_CLUSTERNAME_LENGTH`: UInt = 63u;
public const val `MAX_CO_PASSWORD_LENGTH`: UInt = 16u;
public const val `MAX_CO_PASSWORD_LENGTHEX`: UInt = 127u;
public const val `MAX_CO_PASSWORD_STORAGEEX`: UInt = 128u;
public const val `MAX_CREATINGDC_LENGTH`: UInt = 256u;
public const val `MAX_OBJECTID`: UInt = 64u;
// UNSUPPORTED Rust 3443:1: non-scalar type Ptr unsupported
// pub const MINIMUM_NEVER_PREEMPT_PRIORITY: windows_sys::core::PCWSTR = windows_sys::core::w!("MinimumNeverPreemptPriority");

// UNSUPPORTED Rust 3444:1: non-scalar type Ptr unsupported
// pub const MINIMUM_PREEMPTOR_PRIORITY: windows_sys::core::PCWSTR = windows_sys::core::w!("MinimumPreemptorPriority");

public const val `MN_UPGRADE_VERSION`: UInt = 3u;
// UNSUPPORTED Rust 3446:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct MONITOR_STATE {
//     pub LastUpdate: i64,
//     pub State: RESOURCE_MONITOR_STATE,
//     pub ActiveResource: super::super::Foundation::HANDLE,
//     pub ResmonStop: windows_sys::core::BOOL,
// }

// UNSUPPORTED Rust 3454:1: declaration Impl has no candidate rule
// impl Default for MONITOR_STATE {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `MaintenanceModeTypeDisableIsAliveCheck`: `MAINTENANCE_MODE_TYPE_ENUM` = 1;
public const val `MaintenanceModeTypeOfflineResource`: `MAINTENANCE_MODE_TYPE_ENUM` = 2;
public const val `MaintenanceModeTypeUnclusterResource`: `MAINTENANCE_MODE_TYPE_ENUM` = 3;
public const val `ModifyQuorum`: `CLUSTER_QUORUM_TYPE` = 1;
public const val `NINETEEN_H1_UPGRADE_VERSION`: UInt = 1u;
public const val `NINETEEN_H2_UPGRADE_VERSION`: UInt = 2u;
public const val `NI_UPGRADE_VERSION`: UInt = 2u;
public const val `NNLEN`: UInt = 80u;
public typealias `NODE_CLUSTER_STATE` = Int;
// UNSUPPORTED Rust 3468:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NOTIFY_FILTER_AND_TYPE {
//     pub dwObjectType: u32,
//     pub FilterFlags: i64,
// }

public const val `NT10_MAJOR_VERSION`: UInt = 9u;
public const val `NT11_MAJOR_VERSION`: UInt = 10u;
public const val `NT12_MAJOR_VERSION`: UInt = 11u;
public const val `NT13_MAJOR_VERSION`: UInt = 12u;
public const val `NT4SP4_MAJOR_VERSION`: UInt = 2u;
public const val `NT4_MAJOR_VERSION`: UInt = 1u;
public const val `NT51_MAJOR_VERSION`: UInt = 4u;
public const val `NT5_MAJOR_VERSION`: UInt = 3u;
public const val `NT6_MAJOR_VERSION`: UInt = 5u;
public const val `NT7_MAJOR_VERSION`: UInt = 6u;
public const val `NT8_MAJOR_VERSION`: UInt = 7u;
public const val `NT9_MAJOR_VERSION`: UInt = 8u;
public const val `NodeDrainStatusCompleted`: `CLUSTER_NODE_DRAIN_STATUS` = 2;
public const val `NodeDrainStatusFailed`: `CLUSTER_NODE_DRAIN_STATUS` = 3;
public const val `NodeDrainStatusInProgress`: `CLUSTER_NODE_DRAIN_STATUS` = 1;
public const val `NodeDrainStatusNotInitiated`: `CLUSTER_NODE_DRAIN_STATUS` = 0;
public const val `NodeStatusAvoidPlacement`: `CLUSTER_NODE_STATUS` = 32;
public const val `NodeStatusDrainCompleted`: `CLUSTER_NODE_STATUS` = 8;
public const val `NodeStatusDrainFailed`: `CLUSTER_NODE_STATUS` = 16;
public const val `NodeStatusDrainInProgress`: `CLUSTER_NODE_STATUS` = 4;
public const val `NodeStatusIsolated`: `CLUSTER_NODE_STATUS` = 1;
public const val `NodeStatusMax`: `CLUSTER_NODE_STATUS` = 51;
public const val `NodeStatusNormal`: `CLUSTER_NODE_STATUS` = 0;
public const val `NodeStatusQuarantined`: `CLUSTER_NODE_STATUS` = 2;
// UNSUPPORTED Rust 3498:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct NodeUtilizationInfoElement {
//     pub Id: u64,
//     pub AvailableMemory: u64,
//     pub AvailableMemoryAfterReclamation: u64,
// }

public const val `OperationalQuorum`: `CLUSTER_QUORUM_TYPE` = 0;
// UNSUPPORTED Rust 3506:1: generic scalar type unsupported
// pub type PARBITRATE_ROUTINE = Option<unsafe extern "system" fn(resource: *mut core::ffi::c_void, lostquorumresource: PQUORUM_RESOURCE_LOST) -> u32>;

// UNSUPPORTED Rust 3507:1: generic scalar type unsupported
// pub type PARM_WPR_WATCHDOG_FOR_CURRENT_RESOURCE_CALL_ROUTINE = Option<unsafe extern "system" fn(resourcehandle: isize, timeoutinms: u64) -> u32>;

// UNSUPPORTED Rust 3508:1: generic scalar type unsupported
// pub type PBEGIN_RESCALL_AS_USER_ROUTINE = Option<unsafe extern "system" fn(resource: *mut core::ffi::c_void, tokenhandle: super::super::Foundation::HANDLE, controlcode: u32, inbuffer: *mut core::ffi::c_void, inbuffersize: u32, outbuffer: *mut core::ffi::c_void, outbuffersize: u32, bytesreturned: *mut u32, context: i64, returnedasynchronously: *mut windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 3509:1: generic scalar type unsupported
// pub type PBEGIN_RESCALL_ROUTINE = Option<unsafe extern "system" fn(resource: *mut core::ffi::c_void, controlcode: u32, inbuffer: *mut core::ffi::c_void, inbuffersize: u32, outbuffer: *mut core::ffi::c_void, outbuffersize: u32, bytesreturned: *mut u32, context: i64, returnedasynchronously: *mut windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 3510:1: generic scalar type unsupported
// pub type PBEGIN_RESTYPECALL_AS_USER_ROUTINE = Option<unsafe extern "system" fn(resourcetypename: windows_sys::core::PCWSTR, tokenhandle: super::super::Foundation::HANDLE, controlcode: u32, inbuffer: *mut core::ffi::c_void, inbuffersize: u32, outbuffer: *mut core::ffi::c_void, outbuffersize: u32, bytesreturned: *mut u32, context: i64, returnedasynchronously: *mut windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 3511:1: generic scalar type unsupported
// pub type PBEGIN_RESTYPECALL_ROUTINE = Option<unsafe extern "system" fn(resourcetypename: windows_sys::core::PCWSTR, controlcode: u32, inbuffer: *mut core::ffi::c_void, inbuffersize: u32, outbuffer: *mut core::ffi::c_void, outbuffersize: u32, bytesreturned: *mut u32, context: i64, returnedasynchronously: *mut windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 3512:1: generic scalar type unsupported
// pub type PCANCEL_ROUTINE = Option<unsafe extern "system" fn(resource: *mut core::ffi::c_void, cancelflags_reserved: u32) -> u32>;

// UNSUPPORTED Rust 3513:1: generic scalar type unsupported
// pub type PCHANGE_RESOURCE_PROCESS_FOR_DUMPS = Option<unsafe extern "system" fn(resource: isize, processname: windows_sys::core::PCWSTR, processid: u32, isadd: windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 3514:1: generic scalar type unsupported
// pub type PCHANGE_RES_TYPE_PROCESS_FOR_DUMPS = Option<unsafe extern "system" fn(resourcetypename: windows_sys::core::PCWSTR, processname: windows_sys::core::PCWSTR, processid: u32, isadd: windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 3515:1: generic scalar type unsupported
// pub type PCLOSE_CLUSTER_CRYPT_PROVIDER = Option<unsafe extern "system" fn(hcluscryptprovider: HCLUSCRYPTPROVIDER) -> u32>;

// UNSUPPORTED Rust 3516:1: generic scalar type unsupported
// pub type PCLOSE_ROUTINE = Option<unsafe extern "system" fn(resource: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 3517:1: generic scalar type unsupported
// pub type PCLUSAPIClusWorkerCheckTerminate = Option<unsafe extern "system" fn(lpworker: *mut CLUS_WORKER) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3518:1: generic scalar type unsupported
// pub type PCLUSAPI_ADD_CLUSTER_GROUP_DEPENDENCY = Option<unsafe extern "system" fn(hdependentgroup: HGROUP, hprovidergroup: HGROUP) -> u32>;

// UNSUPPORTED Rust 3519:1: generic scalar type unsupported
// pub type PCLUSAPI_ADD_CLUSTER_GROUP_DEPENDENCY_EX = Option<unsafe extern "system" fn(hdependentgroup: HGROUP, hprovidergroup: HGROUP, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3520:1: generic scalar type unsupported
// pub type PCLUSAPI_ADD_CLUSTER_GROUP_GROUPSET_DEPENDENCY = Option<unsafe extern "system" fn(hdependentgroupset: HGROUPSET, hprovidergroupset: HGROUPSET) -> u32>;

// UNSUPPORTED Rust 3521:1: generic scalar type unsupported
// pub type PCLUSAPI_ADD_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EX = Option<unsafe extern "system" fn(hdependentgroupset: HGROUPSET, hprovidergroupset: HGROUPSET, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3522:1: generic scalar type unsupported
// pub type PCLUSAPI_ADD_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCY = Option<unsafe extern "system" fn(hdependentgroup: HGROUP, hprovidergroupset: HGROUPSET) -> u32>;

// UNSUPPORTED Rust 3523:1: generic scalar type unsupported
// pub type PCLUSAPI_ADD_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCY_EX = Option<unsafe extern "system" fn(hdependentgroup: HGROUP, hprovidergroupset: HGROUPSET, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3524:1: generic scalar type unsupported
// pub type PCLUSAPI_ADD_CLUSTER_NODE = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpsznodename: windows_sys::core::PCWSTR, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: *const core::ffi::c_void) -> HNODE>;

// UNSUPPORTED Rust 3525:1: generic scalar type unsupported
// pub type PCLUSAPI_ADD_CLUSTER_NODE_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpsznodename: windows_sys::core::PCWSTR, dwflags: u32, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: *const core::ffi::c_void) -> HNODE>;

// UNSUPPORTED Rust 3526:1: generic scalar type unsupported
// pub type PCLUSAPI_ADD_CLUSTER_RESOURCE_DEPENDENCY = Option<unsafe extern "system" fn(hresource: HRESOURCE, hdependson: HRESOURCE) -> u32>;

// UNSUPPORTED Rust 3527:1: generic scalar type unsupported
// pub type PCLUSAPI_ADD_CLUSTER_RESOURCE_DEPENDENCY_EX = Option<unsafe extern "system" fn(hresource: HRESOURCE, hdependson: HRESOURCE, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3528:1: generic scalar type unsupported
// pub type PCLUSAPI_ADD_CLUSTER_RESOURCE_NODE = Option<unsafe extern "system" fn(hresource: HRESOURCE, hnode: HNODE) -> u32>;

// UNSUPPORTED Rust 3529:1: generic scalar type unsupported
// pub type PCLUSAPI_ADD_CLUSTER_RESOURCE_NODE_EX = Option<unsafe extern "system" fn(hresource: HRESOURCE, hnode: HNODE, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3530:1: generic scalar type unsupported
// pub type PCLUSAPI_ADD_CROSS_CLUSTER_GROUPSET_DEPENDENCY = Option<unsafe extern "system" fn(hdependentgroupset: HGROUPSET, lpremoteclustername: windows_sys::core::PCWSTR, lpremotegroupsetname: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3531:1: generic scalar type unsupported
// pub type PCLUSAPI_ADD_RESOURCE_TO_CLUSTER_SHARED_VOLUMES = Option<unsafe extern "system" fn(hresource: HRESOURCE) -> u32>;

// UNSUPPORTED Rust 3532:1: generic scalar type unsupported
// pub type PCLUSAPI_BACKUP_CLUSTER_DATABASE = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszpathname: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3533:1: generic scalar type unsupported
// pub type PCLUSAPI_CAN_RESOURCE_BE_DEPENDENT = Option<unsafe extern "system" fn(hresource: HRESOURCE, hresourcedependent: HRESOURCE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3534:1: generic scalar type unsupported
// pub type PCLUSAPI_CHANGE_CLUSTER_RESOURCE_GROUP = Option<unsafe extern "system" fn(hresource: HRESOURCE, hgroup: HGROUP) -> u32>;

// UNSUPPORTED Rust 3535:1: generic scalar type unsupported
// pub type PCLUSAPI_CHANGE_CLUSTER_RESOURCE_GROUP_EX = Option<unsafe extern "system" fn(hresource: HRESOURCE, hgroup: HGROUP, flags: u64) -> u32>;

// UNSUPPORTED Rust 3536:1: generic scalar type unsupported
// pub type PCLUSAPI_CHANGE_CLUSTER_RESOURCE_GROUP_EX2 = Option<unsafe extern "system" fn(hresource: HRESOURCE, hgroup: HGROUP, flags: u64, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3537:1: generic scalar type unsupported
// pub type PCLUSAPI_CLOSE_CLUSTER = Option<unsafe extern "system" fn(hcluster: HCLUSTER) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3538:1: generic scalar type unsupported
// pub type PCLUSAPI_CLOSE_CLUSTER_GROUP = Option<unsafe extern "system" fn(hgroup: HGROUP) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3539:1: generic scalar type unsupported
// pub type PCLUSAPI_CLOSE_CLUSTER_GROUP_GROUPSET = Option<unsafe extern "system" fn(hgroupset: HGROUPSET) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3540:1: generic scalar type unsupported
// pub type PCLUSAPI_CLOSE_CLUSTER_NETWORK = Option<unsafe extern "system" fn(hnetwork: HNETWORK) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3541:1: generic scalar type unsupported
// pub type PCLUSAPI_CLOSE_CLUSTER_NET_INTERFACE = Option<unsafe extern "system" fn(hnetinterface: HNETINTERFACE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3542:1: generic scalar type unsupported
// pub type PCLUSAPI_CLOSE_CLUSTER_NODE = Option<unsafe extern "system" fn(hnode: HNODE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3543:1: generic scalar type unsupported
// pub type PCLUSAPI_CLOSE_CLUSTER_NOTIFY_PORT = Option<unsafe extern "system" fn(hchange: HCHANGE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3544:1: generic scalar type unsupported
// pub type PCLUSAPI_CLOSE_CLUSTER_RESOURCE = Option<unsafe extern "system" fn(hresource: HRESOURCE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3545:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_ADD_GROUP_TO_AFFINITY_RULE = Option<unsafe extern "system" fn(hcluster: HCLUSTER, rulename: windows_sys::core::PCWSTR, hgroup: HGROUP) -> u32>;

// UNSUPPORTED Rust 3546:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_ADD_GROUP_TO_GROUPSET_WITH_DOMAINS_EX = Option<unsafe extern "system" fn(hgroupset: HGROUPSET, hgroup: HGROUP, faultdomain: u32, updatedomain: u32, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3547:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_ADD_GROUP_TO_GROUP_GROUPSET = Option<unsafe extern "system" fn(hgroupset: HGROUPSET, hgroup: HGROUP) -> u32>;

// UNSUPPORTED Rust 3548:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_AFFINITY_RULE_CONTROL = Option<unsafe extern "system" fn(hcluster: HCLUSTER, affinityrulename: windows_sys::core::PCWSTR, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, cbinbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, cboutbuffersize: u32, lpbytesreturned: *mut u32) -> u32>;

// UNSUPPORTED Rust 3549:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_CLOSE_ENUM = Option<unsafe extern "system" fn(henum: HCLUSENUM) -> u32>;

// UNSUPPORTED Rust 3550:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_CLOSE_ENUM_EX = Option<unsafe extern "system" fn(hclusterenum: HCLUSENUMEX) -> u32>;

// UNSUPPORTED Rust 3551:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_CONTROL = Option<unsafe extern "system" fn(hcluster: HCLUSTER, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, ninbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, noutbuffersize: u32, lpbytesreturned: *mut u32) -> u32>;

// UNSUPPORTED Rust 3552:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_CONTROL_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, ninbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, noutbuffersize: u32, lpbytesreturned: *mut u32, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3553:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_CREATE_AFFINITY_RULE = Option<unsafe extern "system" fn(hcluster: HCLUSTER, rulename: windows_sys::core::PCWSTR, ruletype: CLUS_AFFINITY_RULE_TYPE) -> u32>;

// UNSUPPORTED Rust 3554:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_ENUM = Option<unsafe extern "system" fn(henum: HCLUSENUM, dwindex: u32, lpdwtype: *mut u32, lpszname: windows_sys::core::PWSTR, lpcchname: *mut u32) -> u32>;

// UNSUPPORTED Rust 3555:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_ENUM_EX = Option<unsafe extern "system" fn(hclusterenum: HCLUSENUMEX, dwindex: u32, pitem: *mut CLUSTER_ENUM_ITEM, cbitem: *mut u32) -> u32>;

// UNSUPPORTED Rust 3556:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_GET_ENUM_COUNT = Option<unsafe extern "system" fn(henum: HCLUSENUM) -> u32>;

// UNSUPPORTED Rust 3557:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_GET_ENUM_COUNT_EX = Option<unsafe extern "system" fn(hclusterenum: HCLUSENUMEX) -> u32>;

// UNSUPPORTED Rust 3558:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_GROUP_CLOSE_ENUM = Option<unsafe extern "system" fn(hgroupenum: HGROUPENUM) -> u32>;

// UNSUPPORTED Rust 3559:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_GROUP_CLOSE_ENUM_EX = Option<unsafe extern "system" fn(hgroupenumex: HGROUPENUMEX) -> u32>;

// UNSUPPORTED Rust 3560:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_GROUP_CONTROL = Option<unsafe extern "system" fn(hgroup: HGROUP, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, ninbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, noutbuffersize: u32, lpbytesreturned: *mut u32) -> u32>;

// UNSUPPORTED Rust 3561:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_GROUP_CONTROL_EX = Option<unsafe extern "system" fn(hgroup: HGROUP, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, ninbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, noutbuffersize: u32, lpbytesreturned: *mut u32, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3562:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_GROUP_ENUM = Option<unsafe extern "system" fn(hgroupenum: HGROUPENUM, dwindex: u32, lpdwtype: *mut u32, lpszresourcename: windows_sys::core::PWSTR, lpcchname: *mut u32) -> u32>;

// UNSUPPORTED Rust 3563:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_GROUP_ENUM_EX = Option<unsafe extern "system" fn(hgroupenumex: HGROUPENUMEX, dwindex: u32, pitem: *mut CLUSTER_GROUP_ENUM_ITEM, cbitem: *mut u32) -> u32>;

// UNSUPPORTED Rust 3564:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_GROUP_GET_ENUM_COUNT = Option<unsafe extern "system" fn(hgroupenum: HGROUPENUM) -> u32>;

// UNSUPPORTED Rust 3565:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_GROUP_GET_ENUM_COUNT_EX = Option<unsafe extern "system" fn(hgroupenumex: HGROUPENUMEX) -> u32>;

// UNSUPPORTED Rust 3566:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_GROUP_GROUPSET_CONTROL = Option<unsafe extern "system" fn(hgroupset: HGROUPSET, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, cbinbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, cboutbuffersize: u32, lpbytesreturned: *mut u32) -> u32>;

// UNSUPPORTED Rust 3567:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_GROUP_GROUPSET_CONTROL_EX = Option<unsafe extern "system" fn(hgroupset: HGROUPSET, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, cbinbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, cboutbuffersize: u32, lpbytesreturned: *mut u32, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3568:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_GROUP_OPEN_ENUM = Option<unsafe extern "system" fn(hgroup: HGROUP, dwtype: u32) -> HGROUPENUM>;

// UNSUPPORTED Rust 3569:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_GROUP_OPEN_ENUM_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszproperties: windows_sys::core::PCWSTR, cbproperties: u32, lpszroproperties: windows_sys::core::PCWSTR, cbroproperties: u32, dwflags: u32) -> HGROUPENUMEX>;

// UNSUPPORTED Rust 3570:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NETWORK_CLOSE_ENUM = Option<unsafe extern "system" fn(hnetworkenum: HNETWORKENUM) -> u32>;

// UNSUPPORTED Rust 3571:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NETWORK_CONTROL = Option<unsafe extern "system" fn(hnetwork: HNETWORK, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, ninbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, noutbuffersize: u32, lpbytesreturned: *mut u32) -> u32>;

// UNSUPPORTED Rust 3572:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NETWORK_CONTROL_EX = Option<unsafe extern "system" fn(hnetwork: HNETWORK, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, ninbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, noutbuffersize: u32, lpbytesreturned: *mut u32, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3573:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NETWORK_ENUM = Option<unsafe extern "system" fn(hnetworkenum: HNETWORKENUM, dwindex: u32, lpdwtype: *mut u32, lpszname: windows_sys::core::PWSTR, lpcchname: *mut u32) -> u32>;

// UNSUPPORTED Rust 3574:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NETWORK_GET_ENUM_COUNT = Option<unsafe extern "system" fn(hnetworkenum: HNETWORKENUM) -> u32>;

// UNSUPPORTED Rust 3575:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NETWORK_OPEN_ENUM = Option<unsafe extern "system" fn(hnetwork: HNETWORK, dwtype: u32) -> HNETWORKENUM>;

// UNSUPPORTED Rust 3576:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NET_INTERFACE_CONTROL = Option<unsafe extern "system" fn(hnetinterface: HNETINTERFACE, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, ninbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, noutbuffersize: u32, lpbytesreturned: *mut u32) -> u32>;

// UNSUPPORTED Rust 3577:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NET_INTERFACE_CONTROL_EX = Option<unsafe extern "system" fn(hnetinterface: HNETINTERFACE, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, ninbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, noutbuffersize: u32, lpbytesreturned: *mut u32, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3578:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NODE_CLOSE_ENUM = Option<unsafe extern "system" fn(hnodeenum: HNODEENUM) -> u32>;

// UNSUPPORTED Rust 3579:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NODE_CLOSE_ENUM_EX = Option<unsafe extern "system" fn(hnodeenum: HNODEENUMEX) -> u32>;

// UNSUPPORTED Rust 3580:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NODE_CONTROL = Option<unsafe extern "system" fn(hnode: HNODE, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, ninbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, noutbuffersize: u32, lpbytesreturned: *mut u32) -> u32>;

// UNSUPPORTED Rust 3581:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NODE_CONTROL_EX = Option<unsafe extern "system" fn(hnode: HNODE, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, ninbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, noutbuffersize: u32, lpbytesreturned: *mut u32, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3582:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NODE_ENUM = Option<unsafe extern "system" fn(hnodeenum: HNODEENUM, dwindex: u32, lpdwtype: *mut u32, lpszname: windows_sys::core::PWSTR, lpcchname: *mut u32) -> u32>;

// UNSUPPORTED Rust 3583:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NODE_ENUM_EX = Option<unsafe extern "system" fn(hnodeenum: HNODEENUMEX, dwindex: u32, pitem: *mut CLUSTER_ENUM_ITEM, cbitem: *mut u32) -> u32>;

// UNSUPPORTED Rust 3584:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NODE_GET_ENUM_COUNT = Option<unsafe extern "system" fn(hnodeenum: HNODEENUM) -> u32>;

// UNSUPPORTED Rust 3585:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NODE_GET_ENUM_COUNT_EX = Option<unsafe extern "system" fn(hnodeenum: HNODEENUMEX) -> u32>;

// UNSUPPORTED Rust 3586:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NODE_OPEN_ENUM = Option<unsafe extern "system" fn(hnode: HNODE, dwtype: u32) -> HNODEENUM>;

// UNSUPPORTED Rust 3587:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_NODE_OPEN_ENUM_EX = Option<unsafe extern "system" fn(hnode: HNODE, dwtype: u32, poptions: *const core::ffi::c_void) -> HNODEENUMEX>;

// UNSUPPORTED Rust 3588:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_OPEN_ENUM = Option<unsafe extern "system" fn(hcluster: HCLUSTER, dwtype: u32) -> HCLUSENUM>;

// UNSUPPORTED Rust 3589:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_OPEN_ENUM_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, dwtype: u32, poptions: *const core::ffi::c_void) -> HCLUSENUMEX>;

// UNSUPPORTED Rust 3590:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_CLUSTER_REG_CLOSE_KEY = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY) -> i32>;

// UNSUPPORTED Rust 3592:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_CLUSTER_REG_CREATE_BATCH = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, phregbatch: *mut HREGBATCH) -> i32>;

// UNSUPPORTED Rust 3594:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Registry"))]
// pub type PCLUSAPI_CLUSTER_REG_CREATE_KEY = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, lpszsubkey: windows_sys::core::PCWSTR, dwoptions: u32, samdesired: u32, lpsecurityattributes: *const super::super::Security::SECURITY_ATTRIBUTES, phkresult: *mut super::super::System::Registry::HKEY, lpdwdisposition: *mut u32) -> i32>;

// UNSUPPORTED Rust 3596:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Registry"))]
// pub type PCLUSAPI_CLUSTER_REG_CREATE_KEY_EX = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, lpszsubkey: windows_sys::core::PCWSTR, dwoptions: u32, samdesired: u32, lpsecurityattributes: *const super::super::Security::SECURITY_ATTRIBUTES, phkresult: *mut super::super::System::Registry::HKEY, lpdwdisposition: *mut u32, lpszreason: windows_sys::core::PCWSTR) -> i32>;

// UNSUPPORTED Rust 3598:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_CLUSTER_REG_DELETE_KEY = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, lpszsubkey: windows_sys::core::PCWSTR) -> i32>;

// UNSUPPORTED Rust 3600:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_CLUSTER_REG_DELETE_KEY_EX = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, lpsubkey: windows_sys::core::PCWSTR, lpszreason: windows_sys::core::PCWSTR) -> i32>;

// UNSUPPORTED Rust 3602:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_CLUSTER_REG_DELETE_VALUE = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, lpszvaluename: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3604:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_CLUSTER_REG_DELETE_VALUE_EX = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, lpszvaluename: windows_sys::core::PCWSTR, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3606:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_CLUSTER_REG_ENUM_KEY = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, dwindex: u32, lpszname: windows_sys::core::PWSTR, lpcchname: *mut u32, lpftlastwritetime: *mut super::super::Foundation::FILETIME) -> i32>;

// UNSUPPORTED Rust 3608:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_CLUSTER_REG_ENUM_VALUE = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, dwindex: u32, lpszvaluename: windows_sys::core::PWSTR, lpcchvaluename: *mut u32, lpdwtype: *mut u32, lpdata: *mut u8, lpcbdata: *mut u32) -> u32>;

// UNSUPPORTED Rust 3610:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Registry"))]
// pub type PCLUSAPI_CLUSTER_REG_GET_KEY_SECURITY = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, requestedinformation: u32, psecuritydescriptor: super::super::Security::PSECURITY_DESCRIPTOR, lpcbsecuritydescriptor: *mut u32) -> i32>;

// UNSUPPORTED Rust 3612:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_CLUSTER_REG_OPEN_KEY = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, lpszsubkey: windows_sys::core::PCWSTR, samdesired: u32, phkresult: *mut super::super::System::Registry::HKEY) -> i32>;

// UNSUPPORTED Rust 3614:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_CLUSTER_REG_QUERY_INFO_KEY = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, lpcsubkeys: *mut u32, lpcbmaxsubkeylen: *mut u32, lpcvalues: *mut u32, lpcbmaxvaluenamelen: *mut u32, lpcbmaxvaluelen: *mut u32, lpcbsecuritydescriptor: *mut u32, lpftlastwritetime: *mut super::super::Foundation::FILETIME) -> i32>;

// UNSUPPORTED Rust 3616:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_CLUSTER_REG_QUERY_VALUE = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, lpszvaluename: windows_sys::core::PCWSTR, lpdwvaluetype: *mut u32, lpdata: *mut u8, lpcbdata: *mut u32) -> i32>;

// UNSUPPORTED Rust 3618:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Registry"))]
// pub type PCLUSAPI_CLUSTER_REG_SET_KEY_SECURITY = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, securityinformation: u32, psecuritydescriptor: super::super::Security::PSECURITY_DESCRIPTOR) -> i32>;

// UNSUPPORTED Rust 3620:1: attribute cfg requires explicit semantics/configuration
// #[cfg(all(feature = "Win32_Security", feature = "Win32_System_Registry"))]
// pub type PCLUSAPI_CLUSTER_REG_SET_KEY_SECURITY_EX = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, securityinformation: u32, psecuritydescriptor: super::super::Security::PSECURITY_DESCRIPTOR, lpszreason: windows_sys::core::PCWSTR) -> i32>;

// UNSUPPORTED Rust 3622:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_CLUSTER_REG_SET_VALUE = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, lpszvaluename: windows_sys::core::PCWSTR, dwtype: u32, lpdata: *const u8, cbdata: u32) -> u32>;

// UNSUPPORTED Rust 3624:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_CLUSTER_REG_SET_VALUE_EX = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, lpszvaluename: windows_sys::core::PCWSTR, dwtype: u32, lpdata: *const u8, cbdata: u32, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3626:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_REG_SYNC_DATABASE = Option<unsafe extern "system" fn(hcluster: HCLUSTER, flags: u32) -> i32>;

// UNSUPPORTED Rust 3627:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_REMOVE_AFFINITY_RULE = Option<unsafe extern "system" fn(hcluster: HCLUSTER, rulename: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3628:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_REMOVE_GROUP_FROM_AFFINITY_RULE = Option<unsafe extern "system" fn(hcluster: HCLUSTER, rulename: windows_sys::core::PCWSTR, hgroup: HGROUP) -> u32>;

// UNSUPPORTED Rust 3629:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_REMOVE_GROUP_FROM_GROUPSET = Option<unsafe extern "system" fn(hgroupset: HGROUPSET) -> u32>;

// UNSUPPORTED Rust 3630:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_REMOVE_GROUP_FROM_GROUPSET_EX = Option<unsafe extern "system" fn(hgroupset: HGROUPSET, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3631:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_CLOSE_ENUM = Option<unsafe extern "system" fn(hresenum: HRESENUM) -> u32>;

// UNSUPPORTED Rust 3632:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_CLOSE_ENUM_EX = Option<unsafe extern "system" fn(hresourceenumex: HRESENUMEX) -> u32>;

// UNSUPPORTED Rust 3633:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_CONTROL = Option<unsafe extern "system" fn(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, cbinbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, cboutbuffersize: u32, lpbytesreturned: *mut u32) -> u32>;

// UNSUPPORTED Rust 3634:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_CONTROL_AS_USER_EX = Option<unsafe extern "system" fn(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, cbinbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, cboutbuffersize: u32, lpbytesreturned: *mut u32, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3635:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_CONTROL_EX = Option<unsafe extern "system" fn(hresource: HRESOURCE, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, cbinbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, cboutbuffersize: u32, lpbytesreturned: *mut u32, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3636:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_ENUM = Option<unsafe extern "system" fn(hresenum: HRESENUM, dwindex: u32, lpdwtype: *mut u32, lpszname: windows_sys::core::PWSTR, lpcchname: *mut u32) -> u32>;

// UNSUPPORTED Rust 3637:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_ENUM_EX = Option<unsafe extern "system" fn(hresourceenumex: HRESENUMEX, dwindex: u32, pitem: *mut CLUSTER_RESOURCE_ENUM_ITEM, cbitem: *mut u32) -> u32>;

// UNSUPPORTED Rust 3638:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_GET_ENUM_COUNT = Option<unsafe extern "system" fn(hresenum: HRESENUM) -> u32>;

// UNSUPPORTED Rust 3639:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_GET_ENUM_COUNT_EX = Option<unsafe extern "system" fn(hresourceenumex: HRESENUMEX) -> u32>;

// UNSUPPORTED Rust 3640:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_OPEN_ENUM = Option<unsafe extern "system" fn(hresource: HRESOURCE, dwtype: u32) -> HRESENUM>;

// UNSUPPORTED Rust 3641:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_OPEN_ENUM_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszproperties: windows_sys::core::PCWSTR, cbproperties: u32, lpszroproperties: windows_sys::core::PCWSTR, cbroproperties: u32, dwflags: u32) -> HRESENUMEX>;

// UNSUPPORTED Rust 3642:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_TYPE_CLOSE_ENUM = Option<unsafe extern "system" fn(hrestypeenum: HRESTYPEENUM) -> u32>;

// UNSUPPORTED Rust 3643:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_TYPE_CONTROL = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszresourcetypename: windows_sys::core::PCWSTR, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, ninbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, noutbuffersize: u32, lpbytesreturned: *mut u32) -> u32>;

// UNSUPPORTED Rust 3644:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_TYPE_CONTROL_AS_USER_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszresourcetypename: windows_sys::core::PCWSTR, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, ninbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, noutbuffersize: u32, lpbytesreturned: *mut u32, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3645:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_TYPE_CONTROL_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszresourcetypename: windows_sys::core::PCWSTR, hhostnode: HNODE, dwcontrolcode: u32, lpinbuffer: *const core::ffi::c_void, ninbuffersize: u32, lpoutbuffer: *mut core::ffi::c_void, noutbuffersize: u32, lpbytesreturned: *mut u32, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3646:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_TYPE_ENUM = Option<unsafe extern "system" fn(hrestypeenum: HRESTYPEENUM, dwindex: u32, lpdwtype: *mut u32, lpszname: windows_sys::core::PWSTR, lpcchname: *mut u32) -> u32>;

// UNSUPPORTED Rust 3647:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_TYPE_GET_ENUM_COUNT = Option<unsafe extern "system" fn(hrestypeenum: HRESTYPEENUM) -> u32>;

// UNSUPPORTED Rust 3648:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_RESOURCE_TYPE_OPEN_ENUM = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszresourcetypename: windows_sys::core::PCWSTR, dwtype: u32) -> HRESTYPEENUM>;

// UNSUPPORTED Rust 3649:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUSTER_UPGRADE = Option<unsafe extern "system" fn(hcluster: HCLUSTER, perform: windows_sys::core::BOOL, pfnprogresscallback: PCLUSTER_UPGRADE_PROGRESS_CALLBACK, pvcallbackarg: *const core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 3650:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUS_WORKER_CREATE = Option<unsafe extern "system" fn(lpworker: *mut CLUS_WORKER, lpstartaddress: PWORKER_START_ROUTINE, lpparameter: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 3651:1: generic scalar type unsupported
// pub type PCLUSAPI_CLUS_WORKER_TERMINATE = Option<unsafe extern "system" fn(lpworker: *const CLUS_WORKER)>;

// UNSUPPORTED Rust 3652:1: generic scalar type unsupported
// pub type PCLUSAPI_CREATE_CLUSTER = Option<unsafe extern "system" fn(pconfig: *const CREATE_CLUSTER_CONFIG, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: *const core::ffi::c_void) -> HCLUSTER>;

// UNSUPPORTED Rust 3653:1: generic scalar type unsupported
// pub type PCLUSAPI_CREATE_CLUSTER_AVAILABILITY_SET = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpavailabilitysetname: windows_sys::core::PCWSTR, pavailabilitysetconfig: *const CLUSTER_AVAILABILITY_SET_CONFIG) -> HGROUPSET>;

// UNSUPPORTED Rust 3654:1: generic scalar type unsupported
// pub type PCLUSAPI_CREATE_CLUSTER_CNOLESS = Option<unsafe extern "system" fn(pconfig: *const CREATE_CLUSTER_CONFIG, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: *const core::ffi::c_void) -> HCLUSTER>;

// UNSUPPORTED Rust 3655:1: generic scalar type unsupported
// pub type PCLUSAPI_CREATE_CLUSTER_GROUP = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszgroupname: windows_sys::core::PCWSTR) -> HGROUP>;

// UNSUPPORTED Rust 3656:1: generic scalar type unsupported
// pub type PCLUSAPI_CREATE_CLUSTER_GROUPEX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszgroupname: windows_sys::core::PCWSTR, pgroupinfo: *const CLUSTER_CREATE_GROUP_INFO) -> HGROUP>;

// UNSUPPORTED Rust 3657:1: generic scalar type unsupported
// pub type PCLUSAPI_CREATE_CLUSTER_GROUP_GROUPSET = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszgroupsetname: windows_sys::core::PCWSTR) -> HGROUPSET>;

// UNSUPPORTED Rust 3658:1: generic scalar type unsupported
// pub type PCLUSAPI_CREATE_CLUSTER_NAME_ACCOUNT = Option<unsafe extern "system" fn(hcluster: HCLUSTER, pconfig: *const CREATE_CLUSTER_NAME_ACCOUNT, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: *const core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 3659:1: generic scalar type unsupported
// pub type PCLUSAPI_CREATE_CLUSTER_NOTIFY_PORT = Option<unsafe extern "system" fn(hchange: HCHANGE, hcluster: HCLUSTER, dwfilter: u32, dwnotifykey: usize) -> HCHANGE>;

// UNSUPPORTED Rust 3660:1: generic scalar type unsupported
// pub type PCLUSAPI_CREATE_CLUSTER_NOTIFY_PORT_V2 = Option<unsafe extern "system" fn(hchange: HCHANGE, hcluster: HCLUSTER, filters: *const NOTIFY_FILTER_AND_TYPE, dwfiltercount: u32, dwnotifykey: usize) -> HCHANGE>;

// UNSUPPORTED Rust 3661:1: generic scalar type unsupported
// pub type PCLUSAPI_CREATE_CLUSTER_RESOURCE = Option<unsafe extern "system" fn(hgroup: HGROUP, lpszresourcename: windows_sys::core::PCWSTR, lpszresourcetype: windows_sys::core::PCWSTR, dwflags: u32) -> HRESOURCE>;

// UNSUPPORTED Rust 3662:1: generic scalar type unsupported
// pub type PCLUSAPI_CREATE_CLUSTER_RESOURCE_EX = Option<unsafe extern "system" fn(hgroup: HGROUP, lpszresourcename: windows_sys::core::PCWSTR, lpszresourcetype: windows_sys::core::PCWSTR, dwflags: u32, lpszreason: windows_sys::core::PCWSTR) -> HRESOURCE>;

// UNSUPPORTED Rust 3663:1: generic scalar type unsupported
// pub type PCLUSAPI_CREATE_CLUSTER_RESOURCE_TYPE = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszresourcetypename: windows_sys::core::PCWSTR, lpszdisplayname: windows_sys::core::PCWSTR, lpszresourcetypedll: windows_sys::core::PCWSTR, dwlooksalivepollinterval: u32, dwisalivepollinterval: u32) -> u32>;

// UNSUPPORTED Rust 3664:1: generic scalar type unsupported
// pub type PCLUSAPI_CREATE_CLUSTER_RESOURCE_TYPE_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszresourcetypename: windows_sys::core::PCWSTR, lpszdisplayname: windows_sys::core::PCWSTR, lpszresourcetypedll: windows_sys::core::PCWSTR, dwlooksalivepollinterval: u32, dwisalivepollinterval: u32, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3665:1: generic scalar type unsupported
// pub type PCLUSAPI_DELETE_CLUSTER_GROUP = Option<unsafe extern "system" fn(hgroup: HGROUP) -> u32>;

// UNSUPPORTED Rust 3666:1: generic scalar type unsupported
// pub type PCLUSAPI_DELETE_CLUSTER_GROUP_EX = Option<unsafe extern "system" fn(hgroup: HGROUP, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3667:1: generic scalar type unsupported
// pub type PCLUSAPI_DELETE_CLUSTER_GROUP_GROUPSET = Option<unsafe extern "system" fn(hgroupset: HGROUPSET) -> u32>;

// UNSUPPORTED Rust 3668:1: generic scalar type unsupported
// pub type PCLUSAPI_DELETE_CLUSTER_GROUP_GROUPSET_EX = Option<unsafe extern "system" fn(hgroupset: HGROUPSET, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3669:1: generic scalar type unsupported
// pub type PCLUSAPI_DELETE_CLUSTER_RESOURCE = Option<unsafe extern "system" fn(hresource: HRESOURCE) -> u32>;

// UNSUPPORTED Rust 3670:1: generic scalar type unsupported
// pub type PCLUSAPI_DELETE_CLUSTER_RESOURCE_EX = Option<unsafe extern "system" fn(hresource: HRESOURCE, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3671:1: generic scalar type unsupported
// pub type PCLUSAPI_DELETE_CLUSTER_RESOURCE_TYPE = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszresourcetypename: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3672:1: generic scalar type unsupported
// pub type PCLUSAPI_DELETE_CLUSTER_RESOURCE_TYPE_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpsztypename: windows_sys::core::PCWSTR, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3673:1: generic scalar type unsupported
// pub type PCLUSAPI_DESTROY_CLUSTER = Option<unsafe extern "system" fn(hcluster: HCLUSTER, pfnprogresscallback: PCLUSTER_SETUP_PROGRESS_CALLBACK, pvcallbackarg: *const core::ffi::c_void, fdeletevirtualcomputerobjects: windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 3674:1: generic scalar type unsupported
// pub type PCLUSAPI_DESTROY_CLUSTER_GROUP = Option<unsafe extern "system" fn(hgroup: HGROUP) -> u32>;

// UNSUPPORTED Rust 3675:1: generic scalar type unsupported
// pub type PCLUSAPI_DESTROY_CLUSTER_GROUP_EX = Option<unsafe extern "system" fn(hgroup: HGROUP, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3676:1: generic scalar type unsupported
// pub type PCLUSAPI_EVICT_CLUSTER_NODE = Option<unsafe extern "system" fn(hnode: HNODE) -> u32>;

// UNSUPPORTED Rust 3677:1: generic scalar type unsupported
// pub type PCLUSAPI_EVICT_CLUSTER_NODE_EX = Option<unsafe extern "system" fn(hnode: HNODE, dwtimeout: u32, phrcleanupstatus: *mut windows_sys::core::HRESULT) -> u32>;

// UNSUPPORTED Rust 3678:1: generic scalar type unsupported
// pub type PCLUSAPI_EVICT_CLUSTER_NODE_EX2 = Option<unsafe extern "system" fn(hnode: HNODE, dwtimeout: u32, phrcleanupstatus: *mut windows_sys::core::HRESULT, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3679:1: generic scalar type unsupported
// pub type PCLUSAPI_FAIL_CLUSTER_RESOURCE = Option<unsafe extern "system" fn(hresource: HRESOURCE) -> u32>;

// UNSUPPORTED Rust 3680:1: generic scalar type unsupported
// pub type PCLUSAPI_FAIL_CLUSTER_RESOURCE_EX = Option<unsafe extern "system" fn(hresource: HRESOURCE, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3681:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_FROM_GROUP = Option<unsafe extern "system" fn(hgroup: HGROUP) -> HCLUSTER>;

// UNSUPPORTED Rust 3682:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_FROM_GROUP_GROUPSET = Option<unsafe extern "system" fn(hgroupset: HGROUPSET) -> HCLUSTER>;

// UNSUPPORTED Rust 3683:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_FROM_NETWORK = Option<unsafe extern "system" fn(hnetwork: HNETWORK) -> HCLUSTER>;

// UNSUPPORTED Rust 3684:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_FROM_NET_INTERFACE = Option<unsafe extern "system" fn(hnetinterface: HNETINTERFACE) -> HCLUSTER>;

// UNSUPPORTED Rust 3685:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_FROM_NODE = Option<unsafe extern "system" fn(hnode: HNODE) -> HCLUSTER>;

// UNSUPPORTED Rust 3686:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_FROM_RESOURCE = Option<unsafe extern "system" fn(hresource: HRESOURCE) -> HCLUSTER>;

// UNSUPPORTED Rust 3687:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_GET_CLUSTER_GROUP_KEY = Option<unsafe extern "system" fn(hgroup: HGROUP, samdesired: u32) -> super::super::System::Registry::HKEY>;

// UNSUPPORTED Rust 3689:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_GROUP_STATE = Option<unsafe extern "system" fn(hgroup: HGROUP, lpsznodename: windows_sys::core::PWSTR, lpcchnodename: *mut u32) -> CLUSTER_GROUP_STATE>;

// UNSUPPORTED Rust 3690:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_INFORMATION = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszclustername: windows_sys::core::PWSTR, lpcchclustername: *mut u32, lpclusterinfo: *mut CLUSTERVERSIONINFO) -> u32>;

// UNSUPPORTED Rust 3691:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_GET_CLUSTER_KEY = Option<unsafe extern "system" fn(hcluster: HCLUSTER, samdesired: u32) -> super::super::System::Registry::HKEY>;

// UNSUPPORTED Rust 3693:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_NETWORK_ID = Option<unsafe extern "system" fn(hnetwork: HNETWORK, lpsznetworkid: windows_sys::core::PWSTR, lpcchname: *mut u32) -> u32>;

// UNSUPPORTED Rust 3694:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_GET_CLUSTER_NETWORK_KEY = Option<unsafe extern "system" fn(hnetwork: HNETWORK, samdesired: u32) -> super::super::System::Registry::HKEY>;

// UNSUPPORTED Rust 3696:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_NETWORK_STATE = Option<unsafe extern "system" fn(hnetwork: HNETWORK) -> CLUSTER_NETWORK_STATE>;

// UNSUPPORTED Rust 3697:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_NET_INTERFACE = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpsznodename: windows_sys::core::PCWSTR, lpsznetworkname: windows_sys::core::PCWSTR, lpszinterfacename: windows_sys::core::PWSTR, lpcchinterfacename: *mut u32) -> u32>;

// UNSUPPORTED Rust 3698:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_GET_CLUSTER_NET_INTERFACE_KEY = Option<unsafe extern "system" fn(hnetinterface: HNETINTERFACE, samdesired: u32) -> super::super::System::Registry::HKEY>;

// UNSUPPORTED Rust 3700:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_NET_INTERFACE_STATE = Option<unsafe extern "system" fn(hnetinterface: HNETINTERFACE) -> CLUSTER_NETINTERFACE_STATE>;

// UNSUPPORTED Rust 3701:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_NODE_ID = Option<unsafe extern "system" fn(hnode: HNODE, lpsznodeid: windows_sys::core::PWSTR, lpcchname: *mut u32) -> u32>;

// UNSUPPORTED Rust 3702:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_GET_CLUSTER_NODE_KEY = Option<unsafe extern "system" fn(hnode: HNODE, samdesired: u32) -> super::super::System::Registry::HKEY>;

// UNSUPPORTED Rust 3704:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_NODE_STATE = Option<unsafe extern "system" fn(hnode: HNODE) -> CLUSTER_NODE_STATE>;

// UNSUPPORTED Rust 3705:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_NOTIFY = Option<unsafe extern "system" fn(hchange: HCHANGE, lpdwnotifykey: *mut usize, lpdwfiltertype: *mut u32, lpszname: windows_sys::core::PWSTR, lpcchname: *mut u32, dwmilliseconds: u32) -> u32>;

// UNSUPPORTED Rust 3706:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_NOTIFY_V2 = Option<unsafe extern "system" fn(hchange: HCHANGE, lpdwnotifykey: *mut usize, pfilterandtype: *mut NOTIFY_FILTER_AND_TYPE, buffer: *mut u8, lpcchbuffersize: *mut u32, lpszobjectid: windows_sys::core::PWSTR, lpcchobjectid: *mut u32, lpszparentid: windows_sys::core::PWSTR, lpcchparentid: *mut u32, lpszname: windows_sys::core::PWSTR, lpcchname: *mut u32, lpsztype: windows_sys::core::PWSTR, lpcchtype: *mut u32, dwmilliseconds: u32) -> u32>;

// UNSUPPORTED Rust 3707:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_QUORUM_RESOURCE = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszresourcename: windows_sys::core::PWSTR, lpcchresourcename: *mut u32, lpszdevicename: windows_sys::core::PWSTR, lpcchdevicename: *mut u32, lpdwmaxquorumlogsize: *mut u32) -> u32>;

// UNSUPPORTED Rust 3708:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_RESOURCE_DEPENDENCY_EXPRESSION = Option<unsafe extern "system" fn(hresource: HRESOURCE, lpszdependencyexpression: windows_sys::core::PWSTR, lpcchdependencyexpression: *mut u32) -> u32>;

// UNSUPPORTED Rust 3709:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_GET_CLUSTER_RESOURCE_KEY = Option<unsafe extern "system" fn(hresource: HRESOURCE, samdesired: u32) -> super::super::System::Registry::HKEY>;

// UNSUPPORTED Rust 3711:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_RESOURCE_NETWORK_NAME = Option<unsafe extern "system" fn(hresource: HRESOURCE, lpbuffer: windows_sys::core::PWSTR, nsize: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3712:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_CLUSTER_RESOURCE_STATE = Option<unsafe extern "system" fn(hresource: HRESOURCE, lpsznodename: windows_sys::core::PWSTR, lpcchnodename: *mut u32, lpszgroupname: windows_sys::core::PWSTR, lpcchgroupname: *mut u32) -> CLUSTER_RESOURCE_STATE>;

// UNSUPPORTED Rust 3713:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSAPI_GET_CLUSTER_RESOURCE_TYPE_KEY = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpsztypename: windows_sys::core::PCWSTR, samdesired: u32) -> super::super::System::Registry::HKEY>;

// UNSUPPORTED Rust 3715:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_NODE_CLUSTER_STATE = Option<unsafe extern "system" fn(lpsznodename: windows_sys::core::PCWSTR, pdwclusterstate: *mut u32) -> u32>;

// UNSUPPORTED Rust 3716:1: generic scalar type unsupported
// pub type PCLUSAPI_GET_NOTIFY_EVENT_HANDLE_V2 = Option<unsafe extern "system" fn(hchange: HCHANGE, lphtargetevent: *mut super::super::Foundation::HANDLE) -> u32>;

// UNSUPPORTED Rust 3717:1: generic scalar type unsupported
// pub type PCLUSAPI_IS_FILE_ON_CLUSTER_SHARED_VOLUME = Option<unsafe extern "system" fn(lpszpathname: windows_sys::core::PCWSTR, pbfileisonsharedvolume: *mut windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 3718:1: generic scalar type unsupported
// pub type PCLUSAPI_MOVE_CLUSTER_GROUP = Option<unsafe extern "system" fn(hgroup: HGROUP, hdestinationnode: HNODE) -> u32>;

// UNSUPPORTED Rust 3719:1: generic scalar type unsupported
// pub type PCLUSAPI_OFFLINE_CLUSTER_GROUP = Option<unsafe extern "system" fn(hgroup: HGROUP) -> u32>;

// UNSUPPORTED Rust 3720:1: generic scalar type unsupported
// pub type PCLUSAPI_OFFLINE_CLUSTER_RESOURCE = Option<unsafe extern "system" fn(hresource: HRESOURCE) -> u32>;

// UNSUPPORTED Rust 3721:1: generic scalar type unsupported
// pub type PCLUSAPI_ONLINE_CLUSTER_GROUP = Option<unsafe extern "system" fn(hgroup: HGROUP, hdestinationnode: HNODE) -> u32>;

// UNSUPPORTED Rust 3722:1: generic scalar type unsupported
// pub type PCLUSAPI_ONLINE_CLUSTER_RESOURCE = Option<unsafe extern "system" fn(hresource: HRESOURCE) -> u32>;

// UNSUPPORTED Rust 3723:1: generic scalar type unsupported
// pub type PCLUSAPI_OPEN_CLUSTER = Option<unsafe extern "system" fn(lpszclustername: windows_sys::core::PCWSTR) -> HCLUSTER>;

// UNSUPPORTED Rust 3724:1: generic scalar type unsupported
// pub type PCLUSAPI_OPEN_CLUSTER_EX = Option<unsafe extern "system" fn(lpszclustername: windows_sys::core::PCWSTR, dwdesiredaccess: u32, lpdwgrantedaccess: *mut u32) -> HCLUSTER>;

// UNSUPPORTED Rust 3725:1: generic scalar type unsupported
// pub type PCLUSAPI_OPEN_CLUSTER_GROUP = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszgroupname: windows_sys::core::PCWSTR) -> HGROUP>;

// UNSUPPORTED Rust 3726:1: generic scalar type unsupported
// pub type PCLUSAPI_OPEN_CLUSTER_GROUP_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszgroupname: windows_sys::core::PCWSTR, dwdesiredaccess: u32, lpdwgrantedaccess: *mut u32) -> HGROUP>;

// UNSUPPORTED Rust 3727:1: generic scalar type unsupported
// pub type PCLUSAPI_OPEN_CLUSTER_GROUP_GROUPSET = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszgroupsetname: windows_sys::core::PCWSTR) -> HGROUPSET>;

// UNSUPPORTED Rust 3728:1: generic scalar type unsupported
// pub type PCLUSAPI_OPEN_CLUSTER_NETINTERFACE_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpsznetinterfacename: windows_sys::core::PCWSTR, dwdesiredaccess: u32, lpdwgrantedaccess: *mut u32) -> HNETINTERFACE>;

// UNSUPPORTED Rust 3729:1: generic scalar type unsupported
// pub type PCLUSAPI_OPEN_CLUSTER_NETWORK = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpsznetworkname: windows_sys::core::PCWSTR) -> HNETWORK>;

// UNSUPPORTED Rust 3730:1: generic scalar type unsupported
// pub type PCLUSAPI_OPEN_CLUSTER_NETWORK_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpsznetworkname: windows_sys::core::PCWSTR, dwdesiredaccess: u32, lpdwgrantedaccess: *mut u32) -> HNETWORK>;

// UNSUPPORTED Rust 3731:1: generic scalar type unsupported
// pub type PCLUSAPI_OPEN_CLUSTER_NET_INTERFACE = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszinterfacename: windows_sys::core::PCWSTR) -> HNETINTERFACE>;

// UNSUPPORTED Rust 3732:1: generic scalar type unsupported
// pub type PCLUSAPI_OPEN_CLUSTER_NODE = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpsznodename: windows_sys::core::PCWSTR) -> HNODE>;

// UNSUPPORTED Rust 3733:1: generic scalar type unsupported
// pub type PCLUSAPI_OPEN_CLUSTER_NODE_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpsznodename: windows_sys::core::PCWSTR, dwdesiredaccess: u32, lpdwgrantedaccess: *mut u32) -> HNODE>;

// UNSUPPORTED Rust 3734:1: generic scalar type unsupported
// pub type PCLUSAPI_OPEN_CLUSTER_RESOURCE = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszresourcename: windows_sys::core::PCWSTR) -> HRESOURCE>;

// UNSUPPORTED Rust 3735:1: generic scalar type unsupported
// pub type PCLUSAPI_OPEN_CLUSTER_RESOURCE_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpszresourcename: windows_sys::core::PCWSTR, dwdesiredaccess: u32, lpdwgrantedaccess: *mut u32) -> HRESOURCE>;

// UNSUPPORTED Rust 3736:1: generic scalar type unsupported
// pub type PCLUSAPI_OPEN_NODE_BY_ID = Option<unsafe extern "system" fn(hcluster: HCLUSTER, nodeid: u32) -> HNODE>;

// UNSUPPORTED Rust 3737:1: generic scalar type unsupported
// pub type PCLUSAPI_PAUSE_CLUSTER_NODE = Option<unsafe extern "system" fn(hnode: HNODE) -> u32>;

// UNSUPPORTED Rust 3738:1: generic scalar type unsupported
// pub type PCLUSAPI_PAUSE_CLUSTER_NODE_EX = Option<unsafe extern "system" fn(hnode: HNODE, bdrainnode: windows_sys::core::BOOL, dwpauseflags: u32, hnodedraintarget: HNODE) -> u32>;

// UNSUPPORTED Rust 3739:1: generic scalar type unsupported
// pub type PCLUSAPI_PAUSE_CLUSTER_NODE_EX2 = Option<unsafe extern "system" fn(hnode: HNODE, bdrainnode: windows_sys::core::BOOL, dwpauseflags: u32, hnodedraintarget: HNODE, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3740:1: generic scalar type unsupported
// pub type PCLUSAPI_PFN_REASON_HANDLER = Option<unsafe extern "system" fn(lpparameter: *const core::ffi::c_void, hcluster: HCLUSTER, szreason: windows_sys::core::PWSTR, lpsize: *mut u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3741:1: generic scalar type unsupported
// pub type PCLUSAPI_REGISTER_CLUSTER_NOTIFY = Option<unsafe extern "system" fn(hchange: HCHANGE, dwfiltertype: u32, hobject: super::super::Foundation::HANDLE, dwnotifykey: usize) -> u32>;

// UNSUPPORTED Rust 3742:1: generic scalar type unsupported
// pub type PCLUSAPI_REGISTER_CLUSTER_NOTIFY_V2 = Option<unsafe extern "system" fn(hchange: HCHANGE, filter: NOTIFY_FILTER_AND_TYPE, hobject: super::super::Foundation::HANDLE, dwnotifykey: usize) -> u32>;

// UNSUPPORTED Rust 3743:1: generic scalar type unsupported
// pub type PCLUSAPI_REMOVE_CLUSTER_GROUP_DEPENDENCY = Option<unsafe extern "system" fn(hgroup: HGROUP, hdependson: HGROUP) -> u32>;

// UNSUPPORTED Rust 3744:1: generic scalar type unsupported
// pub type PCLUSAPI_REMOVE_CLUSTER_GROUP_DEPENDENCY_EX = Option<unsafe extern "system" fn(hgroup: HGROUP, hdependson: HGROUP, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3745:1: generic scalar type unsupported
// pub type PCLUSAPI_REMOVE_CLUSTER_GROUP_GROUPSET_DEPENDENCY = Option<unsafe extern "system" fn(hgroupset: HGROUPSET, hdependson: HGROUPSET) -> u32>;

// UNSUPPORTED Rust 3746:1: generic scalar type unsupported
// pub type PCLUSAPI_REMOVE_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EX = Option<unsafe extern "system" fn(hgroupset: HGROUPSET, hdependson: HGROUPSET, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3747:1: generic scalar type unsupported
// pub type PCLUSAPI_REMOVE_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCY = Option<unsafe extern "system" fn(hgroup: HGROUP, hdependson: HGROUPSET) -> u32>;

// UNSUPPORTED Rust 3748:1: generic scalar type unsupported
// pub type PCLUSAPI_REMOVE_CLUSTER_GROUP_TO_GROUP_GROUPSET_DEPENDENCY_EX = Option<unsafe extern "system" fn(hgroup: HGROUP, hdependson: HGROUPSET, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3749:1: generic scalar type unsupported
// pub type PCLUSAPI_REMOVE_CLUSTER_NAME_ACCOUNT = Option<unsafe extern "system" fn(hcluster: HCLUSTER) -> u32>;

// UNSUPPORTED Rust 3750:1: generic scalar type unsupported
// pub type PCLUSAPI_REMOVE_CLUSTER_RESOURCE_DEPENDENCY = Option<unsafe extern "system" fn(hresource: HRESOURCE, hdependson: HRESOURCE) -> u32>;

// UNSUPPORTED Rust 3751:1: generic scalar type unsupported
// pub type PCLUSAPI_REMOVE_CLUSTER_RESOURCE_DEPENDENCY_EX = Option<unsafe extern "system" fn(hresource: HRESOURCE, hdependson: HRESOURCE, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3752:1: generic scalar type unsupported
// pub type PCLUSAPI_REMOVE_CLUSTER_RESOURCE_NODE = Option<unsafe extern "system" fn(hresource: HRESOURCE, hnode: HNODE) -> u32>;

// UNSUPPORTED Rust 3753:1: generic scalar type unsupported
// pub type PCLUSAPI_REMOVE_CLUSTER_RESOURCE_NODE_EX = Option<unsafe extern "system" fn(hresource: HRESOURCE, hnode: HNODE, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3754:1: generic scalar type unsupported
// pub type PCLUSAPI_REMOVE_CROSS_CLUSTER_GROUPSET_DEPENDENCY = Option<unsafe extern "system" fn(hdependentgroupset: HGROUPSET, lpremoteclustername: windows_sys::core::PCWSTR, lpremotegroupsetname: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3755:1: generic scalar type unsupported
// pub type PCLUSAPI_REMOVE_RESOURCE_FROM_CLUSTER_SHARED_VOLUMES = Option<unsafe extern "system" fn(hresource: HRESOURCE) -> u32>;

// UNSUPPORTED Rust 3756:1: generic scalar type unsupported
// pub type PCLUSAPI_RESTART_CLUSTER_RESOURCE = Option<unsafe extern "system" fn(hresource: HRESOURCE, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 3757:1: generic scalar type unsupported
// pub type PCLUSAPI_RESTART_CLUSTER_RESOURCE_EX = Option<unsafe extern "system" fn(hresource: HRESOURCE, dwflags: u32) -> u32>;

// UNSUPPORTED Rust 3758:1: generic scalar type unsupported
// pub type PCLUSAPI_RESTORE_CLUSTER_DATABASE = Option<unsafe extern "system" fn(lpszpathname: windows_sys::core::PCWSTR, bforce: windows_sys::core::BOOL, lpszquorumdriveletter: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3759:1: generic scalar type unsupported
// pub type PCLUSAPI_RESUME_CLUSTER_NODE = Option<unsafe extern "system" fn(hnode: HNODE) -> u32>;

// UNSUPPORTED Rust 3760:1: generic scalar type unsupported
// pub type PCLUSAPI_RESUME_CLUSTER_NODE_EX = Option<unsafe extern "system" fn(hnode: HNODE, eresumefailbacktype: CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved: u32) -> u32>;

// UNSUPPORTED Rust 3761:1: generic scalar type unsupported
// pub type PCLUSAPI_RESUME_CLUSTER_NODE_EX2 = Option<unsafe extern "system" fn(hnode: HNODE, eresumefailbacktype: CLUSTER_NODE_RESUME_FAILBACK_TYPE, dwresumeflagsreserved: u32, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3762:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EXPRESSION = Option<unsafe extern "system" fn(hgroupset: HGROUPSET, lpszdependencyexpression: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3763:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_GROUP_GROUPSET_DEPENDENCY_EXPRESSION_EX = Option<unsafe extern "system" fn(hgroupset: HGROUPSET, lpszdependencyexpression: windows_sys::core::PCWSTR, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3764:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_GROUP_NAME = Option<unsafe extern "system" fn(hgroup: HGROUP, lpszgroupname: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3765:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_GROUP_NAME_EX = Option<unsafe extern "system" fn(hgroup: HGROUP, lpszgroupname: windows_sys::core::PCWSTR, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3766:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_GROUP_NODE_LIST = Option<unsafe extern "system" fn(hgroup: HGROUP, nodecount: u32, nodelist: *const HNODE) -> u32>;

// UNSUPPORTED Rust 3767:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_GROUP_NODE_LIST_EX = Option<unsafe extern "system" fn(hgroup: HGROUP, nodecount: u32, nodelist: *const HNODE, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3768:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_NAME_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpsznewclustername: windows_sys::core::PCWSTR, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3769:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_NETWORK_NAME = Option<unsafe extern "system" fn(hnetwork: HNETWORK, lpszname: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3770:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_NETWORK_NAME_EX = Option<unsafe extern "system" fn(hnetwork: HNETWORK, lpszname: windows_sys::core::PCWSTR, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3771:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_NETWORK_PRIORITY_ORDER = Option<unsafe extern "system" fn(hcluster: HCLUSTER, networkcount: u32, networklist: *const HNETWORK) -> u32>;

// UNSUPPORTED Rust 3772:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_QUORUM_RESOURCE = Option<unsafe extern "system" fn(hresource: HRESOURCE, lpszdevicename: windows_sys::core::PCWSTR, dwmaxquologsize: u32) -> u32>;

// UNSUPPORTED Rust 3773:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_QUORUM_RESOURCE_EX = Option<unsafe extern "system" fn(hresource: HRESOURCE, lpszdevicename: windows_sys::core::PCWSTR, dwmaxquorumlogsize: u32, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3774:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_RESOURCE_DEPENDENCY_EXPRESSION = Option<unsafe extern "system" fn(hresource: HRESOURCE, lpszdependencyexpression: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3775:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_RESOURCE_NAME = Option<unsafe extern "system" fn(hresource: HRESOURCE, lpszresourcename: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3776:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_RESOURCE_NAME_EX = Option<unsafe extern "system" fn(hresource: HRESOURCE, lpszresourcename: windows_sys::core::PCWSTR, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3777:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_CLUSTER_SERVICE_ACCOUNT_PASSWORD = Option<unsafe extern "system" fn(lpszclustername: windows_sys::core::PCWSTR, lpsznewpassword: windows_sys::core::PCWSTR, dwflags: u32, lpreturnstatusbuffer: *mut CLUSTER_SET_PASSWORD_STATUS, lpcbreturnstatusbuffersize: *mut u32) -> u32>;

// UNSUPPORTED Rust 3778:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_GROUP_DEPENDENCY_EXPRESSION = Option<unsafe extern "system" fn(hgroupset: HGROUP, lpszdependencyexpression: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3779:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_GROUP_DEPENDENCY_EXPRESSION_EX = Option<unsafe extern "system" fn(hgroup: HGROUP, lpszdependencyexpression: windows_sys::core::PCWSTR, lpszreason: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3780:1: generic scalar type unsupported
// pub type PCLUSAPI_SET_REASON_HANDLER = Option<unsafe extern "system" fn(lphandler: *const CLUSAPI_REASON_HANDLER) -> *mut CLUSAPI_REASON_HANDLER>;

// UNSUPPORTED Rust 3781:1: generic scalar type unsupported
// pub type PCLUSAPI_SHARED_VOLUME_SET_SNAPSHOT_STATE = Option<unsafe extern "system" fn(guidsnapshotset: windows_sys::core::GUID, lpszvolumename: windows_sys::core::PCWSTR, state: CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE) -> u32>;

// UNSUPPORTED Rust 3782:1: generic scalar type unsupported
// pub type PCLUSAPI_SetClusterName = Option<unsafe extern "system" fn(hcluster: HCLUSTER, lpsznewclustername: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3783:1: generic scalar type unsupported
// pub type PCLUSTER_CLEAR_BACKUP_STATE_FOR_SHARED_VOLUME = Option<unsafe extern "system" fn(lpszvolumepathname: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3784:1: generic scalar type unsupported
// pub type PCLUSTER_DECRYPT = Option<unsafe extern "system" fn(hcluscryptprovider: HCLUSCRYPTPROVIDER, pcryptinput: *const u8, cbcryptinput: u32, ppcryptoutput: *mut *mut u8, pcbcryptoutput: *mut u32) -> u32>;

// UNSUPPORTED Rust 3785:1: generic scalar type unsupported
// pub type PCLUSTER_ENCRYPT = Option<unsafe extern "system" fn(hcluscryptprovider: HCLUSCRYPTPROVIDER, pdata: *const u8, cbdata: u32, ppdata: *mut *mut u8, pcbdata: *mut u32) -> u32>;

// UNSUPPORTED Rust 3786:1: generic scalar type unsupported
// pub type PCLUSTER_GET_VOLUME_NAME_FOR_VOLUME_MOUNT_POINT = Option<unsafe extern "system" fn(lpszvolumemountpoint: windows_sys::core::PCWSTR, lpszvolumename: windows_sys::core::PWSTR, cchbufferlength: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3787:1: generic scalar type unsupported
// pub type PCLUSTER_GET_VOLUME_PATH_NAME = Option<unsafe extern "system" fn(lpszfilename: windows_sys::core::PCWSTR, lpszvolumepathname: windows_sys::core::PWSTR, cchbufferlength: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3788:1: generic scalar type unsupported
// pub type PCLUSTER_IS_PATH_ON_SHARED_VOLUME = Option<unsafe extern "system" fn(lpszpathname: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3789:1: generic scalar type unsupported
// pub type PCLUSTER_PREPARE_SHARED_VOLUME_FOR_BACKUP = Option<unsafe extern "system" fn(lpszfilename: windows_sys::core::PCWSTR, lpszvolumepathname: windows_sys::core::PWSTR, lpcchvolumepathname: *mut u32, lpszvolumename: windows_sys::core::PWSTR, lpcchvolumename: *mut u32) -> u32>;

// UNSUPPORTED Rust 3790:1: generic scalar type unsupported
// pub type PCLUSTER_REG_BATCH_ADD_COMMAND = Option<unsafe extern "system" fn(hregbatch: HREGBATCH, dwcommand: CLUSTER_REG_COMMAND, wzname: windows_sys::core::PCWSTR, dwoptions: u32, lpdata: *const core::ffi::c_void, cbdata: u32) -> i32>;

// UNSUPPORTED Rust 3791:1: generic scalar type unsupported
// pub type PCLUSTER_REG_BATCH_CLOSE_NOTIFICATION = Option<unsafe extern "system" fn(hbatchnotification: HREGBATCHNOTIFICATION) -> i32>;

// UNSUPPORTED Rust 3792:1: generic scalar type unsupported
// pub type PCLUSTER_REG_BATCH_READ_COMMAND = Option<unsafe extern "system" fn(hbatchnotification: HREGBATCHNOTIFICATION, pbatchcommand: *mut CLUSTER_BATCH_COMMAND) -> i32>;

// UNSUPPORTED Rust 3793:1: generic scalar type unsupported
// pub type PCLUSTER_REG_CLOSE_BATCH = Option<unsafe extern "system" fn(hregbatch: HREGBATCH, bcommit: windows_sys::core::BOOL, failedcommandnumber: *mut i32) -> i32>;

// UNSUPPORTED Rust 3794:1: generic scalar type unsupported
// pub type PCLUSTER_REG_CLOSE_BATCH_NOTIFY_PORT = Option<unsafe extern "system" fn(hbatchnotifyport: HREGBATCHPORT) -> i32>;

// UNSUPPORTED Rust 3795:1: generic scalar type unsupported
// pub type PCLUSTER_REG_CLOSE_READ_BATCH = Option<unsafe extern "system" fn(hregreadbatch: HREGREADBATCH, phregreadbatchreply: *mut HREGREADBATCHREPLY) -> i32>;

// UNSUPPORTED Rust 3796:1: generic scalar type unsupported
// pub type PCLUSTER_REG_CLOSE_READ_BATCH_EX = Option<unsafe extern "system" fn(hregreadbatch: HREGREADBATCH, flags: u32, phregreadbatchreply: *mut HREGREADBATCHREPLY) -> i32>;

// UNSUPPORTED Rust 3797:1: generic scalar type unsupported
// pub type PCLUSTER_REG_CLOSE_READ_BATCH_REPLY = Option<unsafe extern "system" fn(hregreadbatchreply: HREGREADBATCHREPLY) -> i32>;

// UNSUPPORTED Rust 3798:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSTER_REG_CREATE_BATCH_NOTIFY_PORT = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, phbatchnotifyport: *mut HREGBATCHPORT) -> i32>;

// UNSUPPORTED Rust 3800:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PCLUSTER_REG_CREATE_READ_BATCH = Option<unsafe extern "system" fn(hkey: super::super::System::Registry::HKEY, phregreadbatch: *mut HREGREADBATCH) -> i32>;

// UNSUPPORTED Rust 3802:1: generic scalar type unsupported
// pub type PCLUSTER_REG_GET_BATCH_NOTIFICATION = Option<unsafe extern "system" fn(hbatchnotify: HREGBATCHPORT, phbatchnotification: *mut HREGBATCHNOTIFICATION) -> i32>;

// UNSUPPORTED Rust 3803:1: generic scalar type unsupported
// pub type PCLUSTER_REG_READ_BATCH_ADD_COMMAND = Option<unsafe extern "system" fn(hregreadbatch: HREGREADBATCH, wzsubkeyname: windows_sys::core::PCWSTR, wzvaluename: windows_sys::core::PCWSTR) -> i32>;

// UNSUPPORTED Rust 3804:1: generic scalar type unsupported
// pub type PCLUSTER_REG_READ_BATCH_REPLY_NEXT_COMMAND = Option<unsafe extern "system" fn(hregreadbatchreply: HREGREADBATCHREPLY, pbatchcommand: *mut CLUSTER_READ_BATCH_COMMAND) -> i32>;

// UNSUPPORTED Rust 3805:1: generic scalar type unsupported
// pub type PCLUSTER_SETUP_PROGRESS_CALLBACK = Option<unsafe extern "system" fn(pvcallbackarg: *mut core::ffi::c_void, esetupphase: CLUSTER_SETUP_PHASE, ephasetype: CLUSTER_SETUP_PHASE_TYPE, ephaseseverity: CLUSTER_SETUP_PHASE_SEVERITY, dwpercentcomplete: u32, lpszobjectname: windows_sys::core::PCWSTR, dwstatus: u32) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3806:1: generic scalar type unsupported
// pub type PCLUSTER_SET_ACCOUNT_ACCESS = Option<unsafe extern "system" fn(hcluster: HCLUSTER, szaccountsid: windows_sys::core::PCWSTR, dwaccess: u32, dwcontroltype: u32) -> u32>;

// UNSUPPORTED Rust 3807:1: generic scalar type unsupported
// pub type PCLUSTER_UPGRADE_PROGRESS_CALLBACK = Option<unsafe extern "system" fn(pvcallbackarg: *mut core::ffi::c_void, eupgradephase: CLUSTER_UPGRADE_PHASE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3808:1: generic scalar type unsupported
// pub type PEND_CONTROL_CALL = Option<unsafe extern "system" fn(context: i64, status: u32) -> u32>;

// UNSUPPORTED Rust 3809:1: generic scalar type unsupported
// pub type PEND_TYPE_CONTROL_CALL = Option<unsafe extern "system" fn(context: i64, status: u32) -> u32>;

// UNSUPPORTED Rust 3810:1: generic scalar type unsupported
// pub type PEXTEND_RES_CONTROL_CALL = Option<unsafe extern "system" fn(context: i64, newtimeoutinms: u32) -> u32>;

// UNSUPPORTED Rust 3811:1: generic scalar type unsupported
// pub type PEXTEND_RES_TYPE_CONTROL_CALL = Option<unsafe extern "system" fn(context: i64, newtimeoutinms: u32) -> u32>;

// UNSUPPORTED Rust 3812:1: generic scalar type unsupported
// pub type PFREE_CLUSTER_CRYPT = Option<unsafe extern "system" fn(pcryptinfo: *const core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 3813:1: generic scalar type unsupported
// pub type PIS_ALIVE_ROUTINE = Option<unsafe extern "system" fn(resource: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

public typealias `PLACEMENT_OPTIONS` = Int;
public const val `PLACEMENT_OPTIONS_ALL`: `PLACEMENT_OPTIONS` = 1023;
public const val `PLACEMENT_OPTIONS_AVAILABILITY_SET_DOMAIN_AFFINITY`: `PLACEMENT_OPTIONS` = 512;
public const val `PLACEMENT_OPTIONS_CONSIDER_OFFLINE_VMS`: `PLACEMENT_OPTIONS` = 2;
public const val `PLACEMENT_OPTIONS_DEFAULT_PLACEMENT_OPTIONS`: `PLACEMENT_OPTIONS` = 0;
public const val `PLACEMENT_OPTIONS_DISABLE_CSV_VM_DEPENDENCY`: `PLACEMENT_OPTIONS` = 1;
public const val `PLACEMENT_OPTIONS_DONT_RESUME_AVAILABILTY_SET_VMS_WITH_EXISTING_TEMP_DISK`: `PLACEMENT_OPTIONS` = 128;
public const val `PLACEMENT_OPTIONS_DONT_RESUME_VMS_WITH_EXISTING_TEMP_DISK`: `PLACEMENT_OPTIONS` = 32;
public const val `PLACEMENT_OPTIONS_DONT_USE_CPU`: `PLACEMENT_OPTIONS` = 8;
public const val `PLACEMENT_OPTIONS_DONT_USE_LOCAL_TEMP_DISK`: `PLACEMENT_OPTIONS` = 16;
public const val `PLACEMENT_OPTIONS_DONT_USE_MEMORY`: `PLACEMENT_OPTIONS` = 4;
public const val `PLACEMENT_OPTIONS_MIN_VALUE`: `PLACEMENT_OPTIONS` = 0;
public const val `PLACEMENT_OPTIONS_SAVE_AVAILABILTY_SET_VMS_WITH_LOCAL_DISK_ON_DRAIN_OVERWRITE`: `PLACEMENT_OPTIONS` = 256;
public const val `PLACEMENT_OPTIONS_SAVE_VMS_WITH_LOCAL_DISK_ON_DRAIN_OVERWRITE`: `PLACEMENT_OPTIONS` = 64;
// UNSUPPORTED Rust 3828:1: generic scalar type unsupported
// pub type PLOG_EVENT_ROUTINE = Option<unsafe extern "system" fn(resourcehandle: isize, loglevel: LOG_LEVEL, formatstring: windows_sys::core::PCWSTR)>;

// UNSUPPORTED Rust 3829:1: generic scalar type unsupported
// pub type PLOOKS_ALIVE_ROUTINE = Option<unsafe extern "system" fn(resource: *mut core::ffi::c_void) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3830:1: generic scalar type unsupported
// pub type POFFLINE_ROUTINE = Option<unsafe extern "system" fn(resource: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 3831:1: generic scalar type unsupported
// pub type POFFLINE_V2_ROUTINE = Option<unsafe extern "system" fn(resource: *const core::ffi::c_void, destinationnodename: windows_sys::core::PCWSTR, offlineflags: u32, inbuffer: *const u8, inbuffersize: u32, reserved: u32) -> u32>;

// UNSUPPORTED Rust 3832:1: generic scalar type unsupported
// pub type PONLINE_ROUTINE = Option<unsafe extern "system" fn(resource: *mut core::ffi::c_void, eventhandle: *mut super::super::Foundation::HANDLE) -> u32>;

// UNSUPPORTED Rust 3833:1: generic scalar type unsupported
// pub type PONLINE_V2_ROUTINE = Option<unsafe extern "system" fn(resource: *const core::ffi::c_void, eventhandle: *mut super::super::Foundation::HANDLE, onlineflags: u32, inbuffer: *const u8, inbuffersize: u32, reserved: u32) -> u32>;

// UNSUPPORTED Rust 3834:1: generic scalar type unsupported
// pub type POPEN_CLUSTER_CRYPT_PROVIDER = Option<unsafe extern "system" fn(lpszresource: windows_sys::core::PCWSTR, lpszprovider: *const i8, dwtype: u32, dwflags: u32) -> HCLUSCRYPTPROVIDER>;

// UNSUPPORTED Rust 3835:1: generic scalar type unsupported
// pub type POPEN_CLUSTER_CRYPT_PROVIDEREX = Option<unsafe extern "system" fn(lpszresource: windows_sys::core::PCWSTR, lpszkeyname: windows_sys::core::PCWSTR, lpszprovider: *const i8, dwtype: u32, dwflags: u32) -> HCLUSCRYPTPROVIDER>;

// UNSUPPORTED Rust 3836:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type POPEN_ROUTINE = Option<unsafe extern "system" fn(resourcename: windows_sys::core::PCWSTR, resourcekey: super::super::System::Registry::HKEY, resourcehandle: isize) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 3838:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type POPEN_V2_ROUTINE = Option<unsafe extern "system" fn(resourcename: windows_sys::core::PCWSTR, resourcekey: super::super::System::Registry::HKEY, resourcehandle: isize, openflags: u32) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 3840:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct POST_UPGRADE_VERSION_INFO {
//     pub newMajorVersion: u32,
//     pub newUpgradeVersion: u32,
//     pub oldMajorVersion: u32,
//     pub oldUpgradeVersion: u32,
//     pub reserved: u32,
// }

// UNSUPPORTED Rust 3849:1: generic scalar type unsupported
// pub type PQUERY_APPINSTANCE_VERSION = Option<unsafe extern "system" fn(appinstanceid: *const windows_sys::core::GUID, instanceversionhigh: *mut u64, instanceversionlow: *mut u64, versionstatus: *mut super::super::Foundation::NTSTATUS) -> u32>;

// UNSUPPORTED Rust 3850:1: generic scalar type unsupported
// pub type PQUORUM_RESOURCE_LOST = Option<unsafe extern "system" fn(resource: isize)>;

// UNSUPPORTED Rust 3851:1: generic scalar type unsupported
// pub type PRAISE_RES_TYPE_NOTIFICATION = Option<unsafe extern "system" fn(resourcetype: windows_sys::core::PCWSTR, ppayload: *const u8, payloadsize: u32) -> u32>;

// UNSUPPORTED Rust 3852:1: generic scalar type unsupported
// pub type PREGISTER_APPINSTANCE = Option<unsafe extern "system" fn(processhandle: super::super::Foundation::HANDLE, appinstanceid: *const windows_sys::core::GUID, childreninheritappinstance: windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 3853:1: generic scalar type unsupported
// pub type PREGISTER_APPINSTANCE_VERSION = Option<unsafe extern "system" fn(appinstanceid: *const windows_sys::core::GUID, instanceversionhigh: u64, instanceversionlow: u64) -> u32>;

// UNSUPPORTED Rust 3854:1: generic scalar type unsupported
// pub type PRELEASE_ROUTINE = Option<unsafe extern "system" fn(resource: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 3855:1: generic scalar type unsupported
// pub type PREQUEST_DUMP_ROUTINE = Option<unsafe extern "system" fn(resourcehandle: isize, dumpduetocallinprogress: windows_sys::core::BOOL, dumpdelayinms: u32) -> u32>;

// UNSUPPORTED Rust 3856:1: generic scalar type unsupported
// pub type PRESET_ALL_APPINSTANCE_VERSIONS = Option<unsafe extern "system" fn() -> u32>;

// UNSUPPORTED Rust 3857:1: generic scalar type unsupported
// pub type PRESOURCE_CONTROL_ROUTINE = Option<unsafe extern "system" fn(resource: *mut core::ffi::c_void, controlcode: u32, inbuffer: *mut core::ffi::c_void, inbuffersize: u32, outbuffer: *mut core::ffi::c_void, outbuffersize: u32, bytesreturned: *mut u32) -> u32>;

// UNSUPPORTED Rust 3858:1: generic scalar type unsupported
// pub type PRESOURCE_TYPE_CONTROL_ROUTINE = Option<unsafe extern "system" fn(resourcetypename: windows_sys::core::PCWSTR, controlcode: u32, inbuffer: *mut core::ffi::c_void, inbuffersize: u32, outbuffer: *mut core::ffi::c_void, outbuffersize: u32, bytesreturned: *mut u32) -> u32>;

// UNSUPPORTED Rust 3859:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_ADD_UNKNOWN_PROPERTIES = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, ppropertytable: *const RESUTIL_PROPERTY_ITEM, poutpropertylist: *mut core::ffi::c_void, pcboutpropertylistsize: u32, pcbbytesreturned: *mut u32, pcbrequired: *mut u32) -> u32>;

// UNSUPPORTED Rust 3861:1: generic scalar type unsupported
// pub type PRESUTIL_CREATE_DIRECTORY_TREE = Option<unsafe extern "system" fn(pszpath: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3862:1: generic scalar type unsupported
// pub type PRESUTIL_DUP_PARAMETER_BLOCK = Option<unsafe extern "system" fn(poutparams: *mut u8, pinparams: *const u8, ppropertytable: *const RESUTIL_PROPERTY_ITEM) -> u32>;

// UNSUPPORTED Rust 3863:1: generic scalar type unsupported
// pub type PRESUTIL_DUP_STRING = Option<unsafe extern "system" fn(pszinstring: windows_sys::core::PCWSTR) -> windows_sys::core::PWSTR>;

// UNSUPPORTED Rust 3864:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_ENUM_PRIVATE_PROPERTIES = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, pszoutproperties: windows_sys::core::PWSTR, cboutpropertiessize: u32, pcbbytesreturned: *mut u32, pcbrequired: *mut u32) -> u32>;

// UNSUPPORTED Rust 3866:1: generic scalar type unsupported
// pub type PRESUTIL_ENUM_PROPERTIES = Option<unsafe extern "system" fn(ppropertytable: *const RESUTIL_PROPERTY_ITEM, pszoutproperties: windows_sys::core::PWSTR, cboutpropertiessize: u32, pcbbytesreturned: *mut u32, pcbrequired: *mut u32) -> u32>;

// UNSUPPORTED Rust 3867:1: generic scalar type unsupported
// pub type PRESUTIL_ENUM_RESOURCES = Option<unsafe extern "system" fn(hself: HRESOURCE, lpszrestypename: windows_sys::core::PCWSTR, prescallback: LPRESOURCE_CALLBACK, pparameter: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 3868:1: generic scalar type unsupported
// pub type PRESUTIL_ENUM_RESOURCES_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, hself: HRESOURCE, lpszrestypename: windows_sys::core::PCWSTR, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 3869:1: generic scalar type unsupported
// pub type PRESUTIL_ENUM_RESOURCES_EX2 = Option<unsafe extern "system" fn(hcluster: HCLUSTER, hself: HRESOURCE, lpszrestypename: windows_sys::core::PCWSTR, prescallback: LPRESOURCE_CALLBACK_EX, pparameter: *mut core::ffi::c_void, dwdesiredaccess: u32) -> u32>;

// UNSUPPORTED Rust 3870:1: generic scalar type unsupported
// pub type PRESUTIL_EXPAND_ENVIRONMENT_STRINGS = Option<unsafe extern "system" fn(pszsrc: windows_sys::core::PCWSTR) -> windows_sys::core::PWSTR>;

// UNSUPPORTED Rust 3871:1: generic scalar type unsupported
// pub type PRESUTIL_FIND_BINARY_PROPERTY = Option<unsafe extern "system" fn(ppropertylist: *const core::ffi::c_void, cbpropertylistsize: u32, pszpropertyname: windows_sys::core::PCWSTR, pbpropertyvalue: *mut *mut u8, pcbpropertyvaluesize: *mut u32) -> u32>;

// UNSUPPORTED Rust 3872:1: generic scalar type unsupported
// pub type PRESUTIL_FIND_DEPENDENT_DISK_RESOURCE_DRIVE_LETTER = Option<unsafe extern "system" fn(hcluster: HCLUSTER, hresource: HRESOURCE, pszdriveletter: windows_sys::core::PWSTR, pcchdriveletter: *mut u32) -> u32>;

// UNSUPPORTED Rust 3873:1: generic scalar type unsupported
// pub type PRESUTIL_FIND_DWORD_PROPERTY = Option<unsafe extern "system" fn(ppropertylist: *const core::ffi::c_void, cbpropertylistsize: u32, pszpropertyname: windows_sys::core::PCWSTR, pdwpropertyvalue: *mut u32) -> u32>;

// UNSUPPORTED Rust 3874:1: generic scalar type unsupported
// pub type PRESUTIL_FIND_EXPANDED_SZ_PROPERTY = Option<unsafe extern "system" fn(ppropertylist: *const core::ffi::c_void, cbpropertylistsize: u32, pszpropertyname: windows_sys::core::PCWSTR, pszpropertyvalue: *mut windows_sys::core::PWSTR) -> u32>;

// UNSUPPORTED Rust 3875:1: generic scalar type unsupported
// pub type PRESUTIL_FIND_EXPAND_SZ_PROPERTY = Option<unsafe extern "system" fn(ppropertylist: *const core::ffi::c_void, cbpropertylistsize: u32, pszpropertyname: windows_sys::core::PCWSTR, pszpropertyvalue: *mut windows_sys::core::PWSTR) -> u32>;

// UNSUPPORTED Rust 3876:1: generic scalar type unsupported
// pub type PRESUTIL_FIND_FILETIME_PROPERTY = Option<unsafe extern "system" fn(ppropertylist: *const core::ffi::c_void, cbpropertylistsize: u32, pszpropertyname: windows_sys::core::PCWSTR, pftpropertyvalue: *mut super::super::Foundation::FILETIME) -> u32>;

// UNSUPPORTED Rust 3877:1: generic scalar type unsupported
// pub type PRESUTIL_FIND_LONG_PROPERTY = Option<unsafe extern "system" fn(ppropertylist: *const core::ffi::c_void, cbpropertylistsize: u32, pszpropertyname: windows_sys::core::PCWSTR, plpropertyvalue: *mut i32) -> u32>;

// UNSUPPORTED Rust 3878:1: generic scalar type unsupported
// pub type PRESUTIL_FIND_MULTI_SZ_PROPERTY = Option<unsafe extern "system" fn(ppropertylist: *const core::ffi::c_void, cbpropertylistsize: u32, pszpropertyname: windows_sys::core::PCWSTR, pszpropertyvalue: *mut windows_sys::core::PWSTR, pcbpropertyvaluesize: *mut u32) -> u32>;

// UNSUPPORTED Rust 3879:1: generic scalar type unsupported
// pub type PRESUTIL_FIND_SZ_PROPERTY = Option<unsafe extern "system" fn(ppropertylist: *const core::ffi::c_void, cbpropertylistsize: u32, pszpropertyname: windows_sys::core::PCWSTR, pszpropertyvalue: *mut windows_sys::core::PWSTR) -> u32>;

// UNSUPPORTED Rust 3880:1: generic scalar type unsupported
// pub type PRESUTIL_FIND_ULARGEINTEGER_PROPERTY = Option<unsafe extern "system" fn(ppropertylist: *const core::ffi::c_void, cbpropertylistsize: u32, pszpropertyname: windows_sys::core::PCWSTR, plpropertyvalue: *mut u64) -> u32>;

// UNSUPPORTED Rust 3881:1: generic scalar type unsupported
// pub type PRESUTIL_FREE_ENVIRONMENT = Option<unsafe extern "system" fn(lpenvironment: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 3882:1: generic scalar type unsupported
// pub type PRESUTIL_FREE_PARAMETER_BLOCK = Option<unsafe extern "system" fn(poutparams: *mut u8, pinparams: *const u8, ppropertytable: *const RESUTIL_PROPERTY_ITEM)>;

// UNSUPPORTED Rust 3883:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_GET_ALL_PROPERTIES = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, ppropertytable: *const RESUTIL_PROPERTY_ITEM, poutpropertylist: *mut core::ffi::c_void, cboutpropertylistsize: u32, pcbbytesreturned: *mut u32, pcbrequired: *mut u32) -> u32>;

// UNSUPPORTED Rust 3885:1: generic scalar type unsupported
// pub type PRESUTIL_GET_BINARY_PROPERTY = Option<unsafe extern "system" fn(ppboutvalue: *mut *mut u8, pcboutvaluesize: *mut u32, pvaluestruct: *const CLUSPROP_BINARY, pboldvalue: *const u8, cboldvaluesize: u32, pppropertylist: *mut *mut u8, pcbpropertylistsize: *mut u32) -> u32>;

// UNSUPPORTED Rust 3886:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_GET_BINARY_VALUE = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, pszvaluename: windows_sys::core::PCWSTR, ppboutvalue: *mut *mut u8, pcboutvaluesize: *mut u32) -> u32>;

// UNSUPPORTED Rust 3888:1: generic scalar type unsupported
// pub type PRESUTIL_GET_CORE_CLUSTER_RESOURCES = Option<unsafe extern "system" fn(hcluster: HCLUSTER, phclusternameresource: *mut HRESOURCE, phclusteripaddressresource: *mut HRESOURCE, phclusterquorumresource: *mut HRESOURCE) -> u32>;

// UNSUPPORTED Rust 3889:1: generic scalar type unsupported
// pub type PRESUTIL_GET_CORE_CLUSTER_RESOURCES_EX = Option<unsafe extern "system" fn(hclusterin: HCLUSTER, phclusternameresourceout: *mut HRESOURCE, phclusteripaddressresourceout: *mut HRESOURCE, phclusterquorumresourceout: *mut HRESOURCE, dwdesiredaccess: u32) -> u32>;

// UNSUPPORTED Rust 3890:1: generic scalar type unsupported
// pub type PRESUTIL_GET_DWORD_PROPERTY = Option<unsafe extern "system" fn(pdwoutvalue: *mut u32, pvaluestruct: *const CLUSPROP_DWORD, dwoldvalue: u32, dwminimum: u32, dwmaximum: u32, pppropertylist: *mut *mut u8, pcbpropertylistsize: *mut u32) -> u32>;

// UNSUPPORTED Rust 3891:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_GET_DWORD_VALUE = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, pszvaluename: windows_sys::core::PCWSTR, pdwoutvalue: *mut u32, dwdefaultvalue: u32) -> u32>;

// UNSUPPORTED Rust 3893:1: generic scalar type unsupported
// pub type PRESUTIL_GET_ENVIRONMENT_WITH_NET_NAME = Option<unsafe extern "system" fn(hresource: HRESOURCE) -> *mut core::ffi::c_void>;

// UNSUPPORTED Rust 3894:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_GET_EXPAND_SZ_VALUE = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, pszvaluename: windows_sys::core::PCWSTR, bexpand: windows_sys::core::BOOL) -> windows_sys::core::PWSTR>;

// UNSUPPORTED Rust 3896:1: generic scalar type unsupported
// pub type PRESUTIL_GET_FILETIME_PROPERTY = Option<unsafe extern "system" fn(pftoutvalue: *mut super::super::Foundation::FILETIME, pvaluestruct: *const CLUSPROP_FILETIME, ftoldvalue: super::super::Foundation::FILETIME, ftminimum: super::super::Foundation::FILETIME, ftmaximum: super::super::Foundation::FILETIME, pppropertylist: *mut *mut u8, pcbpropertylistsize: *mut u32) -> u32>;

// UNSUPPORTED Rust 3897:1: generic scalar type unsupported
// pub type PRESUTIL_GET_LONG_PROPERTY = Option<unsafe extern "system" fn(ploutvalue: *mut i32, pvaluestruct: *const CLUSPROP_LONG, loldvalue: i32, lminimum: i32, lmaximum: i32, pppropertylist: *mut *mut u8, pcbpropertylistsize: *mut u32) -> u32>;

// UNSUPPORTED Rust 3898:1: generic scalar type unsupported
// pub type PRESUTIL_GET_MULTI_SZ_PROPERTY = Option<unsafe extern "system" fn(ppszoutvalue: *mut windows_sys::core::PWSTR, pcboutvaluesize: *mut u32, pvaluestruct: *const CLUSPROP_SZ, pszoldvalue: windows_sys::core::PCWSTR, cboldvaluesize: u32, pppropertylist: *mut *mut u8, pcbpropertylistsize: *mut u32) -> u32>;

// UNSUPPORTED Rust 3899:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_GET_PRIVATE_PROPERTIES = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, poutpropertylist: *mut core::ffi::c_void, cboutpropertylistsize: u32, pcbbytesreturned: *mut u32, pcbrequired: *mut u32) -> u32>;

// UNSUPPORTED Rust 3901:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_GET_PROPERTIES = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, ppropertytable: *const RESUTIL_PROPERTY_ITEM, poutpropertylist: *mut core::ffi::c_void, cboutpropertylistsize: u32, pcbbytesreturned: *mut u32, pcbrequired: *mut u32) -> u32>;

// UNSUPPORTED Rust 3903:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_GET_PROPERTIES_TO_PARAMETER_BLOCK = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, ppropertytable: *const RESUTIL_PROPERTY_ITEM, poutparams: *mut u8, bcheckforrequiredproperties: windows_sys::core::BOOL, psznameofpropinerror: *mut windows_sys::core::PWSTR) -> u32>;

// UNSUPPORTED Rust 3905:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_GET_PROPERTY = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, ppropertytableitem: *const RESUTIL_PROPERTY_ITEM, poutpropertyitem: *mut *mut core::ffi::c_void, pcboutpropertyitemsize: *mut u32) -> u32>;

// UNSUPPORTED Rust 3907:1: generic scalar type unsupported
// pub type PRESUTIL_GET_PROPERTY_FORMATS = Option<unsafe extern "system" fn(ppropertytable: *const RESUTIL_PROPERTY_ITEM, poutpropertyformatlist: *mut core::ffi::c_void, cbpropertyformatlistsize: u32, pcbbytesreturned: *mut u32, pcbrequired: *mut u32) -> u32>;

// UNSUPPORTED Rust 3908:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_GET_PROPERTY_SIZE = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, ppropertytableitem: *const RESUTIL_PROPERTY_ITEM, pcboutpropertylistsize: *mut u32, pnpropertycount: *mut u32) -> u32>;

// UNSUPPORTED Rust 3910:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_GET_QWORD_VALUE = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, pszvaluename: windows_sys::core::PCWSTR, pqwoutvalue: *mut u64, qwdefaultvalue: u64) -> u32>;

// UNSUPPORTED Rust 3912:1: generic scalar type unsupported
// pub type PRESUTIL_GET_RESOURCE_DEPENDENCY = Option<unsafe extern "system" fn(hself: super::super::Foundation::HANDLE, lpszresourcetype: windows_sys::core::PCWSTR) -> HRESOURCE>;

// UNSUPPORTED Rust 3913:1: generic scalar type unsupported
// pub type PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_CLASS = Option<unsafe extern "system" fn(hcluster: HCLUSTER, hself: super::super::Foundation::HANDLE, prci: *mut CLUS_RESOURCE_CLASS_INFO, brecurse: windows_sys::core::BOOL) -> HRESOURCE>;

// UNSUPPORTED Rust 3914:1: generic scalar type unsupported
// pub type PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_CLASS_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, hself: super::super::Foundation::HANDLE, prci: *mut CLUS_RESOURCE_CLASS_INFO, brecurse: windows_sys::core::BOOL, dwdesiredaccess: u32) -> HRESOURCE>;

// UNSUPPORTED Rust 3915:1: generic scalar type unsupported
// pub type PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_NAME = Option<unsafe extern "system" fn(hcluster: HCLUSTER, hself: super::super::Foundation::HANDLE, lpszresourcetype: windows_sys::core::PCWSTR, brecurse: windows_sys::core::BOOL) -> HRESOURCE>;

// UNSUPPORTED Rust 3916:1: generic scalar type unsupported
// pub type PRESUTIL_GET_RESOURCE_DEPENDENCY_BY_NAME_EX = Option<unsafe extern "system" fn(hcluster: HCLUSTER, hself: super::super::Foundation::HANDLE, lpszresourcetype: windows_sys::core::PCWSTR, brecurse: windows_sys::core::BOOL, dwdesiredaccess: u32) -> HRESOURCE>;

// UNSUPPORTED Rust 3917:1: generic scalar type unsupported
// pub type PRESUTIL_GET_RESOURCE_DEPENDENCY_EX = Option<unsafe extern "system" fn(hself: super::super::Foundation::HANDLE, lpszresourcetype: windows_sys::core::PCWSTR, dwdesiredaccess: u32) -> HRESOURCE>;

// UNSUPPORTED Rust 3918:1: generic scalar type unsupported
// pub type PRESUTIL_GET_RESOURCE_DEPENDENTIP_ADDRESS_PROPS = Option<unsafe extern "system" fn(hresource: HRESOURCE, pszaddress: windows_sys::core::PWSTR, pcchaddress: *mut u32, pszsubnetmask: windows_sys::core::PWSTR, pcchsubnetmask: *mut u32, psznetwork: windows_sys::core::PWSTR, pcchnetwork: *mut u32) -> u32>;

// UNSUPPORTED Rust 3919:1: generic scalar type unsupported
// pub type PRESUTIL_GET_RESOURCE_NAME = Option<unsafe extern "system" fn(hresource: HRESOURCE, pszresourcename: windows_sys::core::PWSTR, pcchresourcenameinout: *mut u32) -> u32>;

// UNSUPPORTED Rust 3920:1: generic scalar type unsupported
// pub type PRESUTIL_GET_RESOURCE_NAME_DEPENDENCY = Option<unsafe extern "system" fn(lpszresourcename: windows_sys::core::PCWSTR, lpszresourcetype: windows_sys::core::PCWSTR) -> HRESOURCE>;

// UNSUPPORTED Rust 3921:1: generic scalar type unsupported
// pub type PRESUTIL_GET_RESOURCE_NAME_DEPENDENCY_EX = Option<unsafe extern "system" fn(lpszresourcename: windows_sys::core::PCWSTR, lpszresourcetype: windows_sys::core::PCWSTR, dwdesiredaccess: u32) -> HRESOURCE>;

// UNSUPPORTED Rust 3922:1: generic scalar type unsupported
// pub type PRESUTIL_GET_SZ_PROPERTY = Option<unsafe extern "system" fn(ppszoutvalue: *mut windows_sys::core::PWSTR, pvaluestruct: *const CLUSPROP_SZ, pszoldvalue: windows_sys::core::PCWSTR, pppropertylist: *mut *mut u8, pcbpropertylistsize: *mut u32) -> u32>;

// UNSUPPORTED Rust 3923:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_GET_SZ_VALUE = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, pszvaluename: windows_sys::core::PCWSTR) -> windows_sys::core::PWSTR>;

// UNSUPPORTED Rust 3925:1: generic scalar type unsupported
// pub type PRESUTIL_IS_PATH_VALID = Option<unsafe extern "system" fn(pszpath: windows_sys::core::PCWSTR) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3926:1: generic scalar type unsupported
// pub type PRESUTIL_IS_RESOURCE_CLASS_EQUAL = Option<unsafe extern "system" fn(prci: *mut CLUS_RESOURCE_CLASS_INFO, hresource: HRESOURCE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3927:1: generic scalar type unsupported
// pub type PRESUTIL_PROPERTY_LIST_FROM_PARAMETER_BLOCK = Option<unsafe extern "system" fn(ppropertytable: *const RESUTIL_PROPERTY_ITEM, poutpropertylist: *mut core::ffi::c_void, pcboutpropertylistsize: *mut u32, pinparams: *const u8, pcbbytesreturned: *mut u32, pcbrequired: *mut u32) -> u32>;

// UNSUPPORTED Rust 3928:1: generic scalar type unsupported
// pub type PRESUTIL_REMOVE_RESOURCE_SERVICE_ENVIRONMENT = Option<unsafe extern "system" fn(pszservicename: windows_sys::core::PCWSTR, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: isize) -> u32>;

// UNSUPPORTED Rust 3929:1: generic scalar type unsupported
// pub type PRESUTIL_RESOURCES_EQUAL = Option<unsafe extern "system" fn(hself: HRESOURCE, hresource: HRESOURCE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3930:1: generic scalar type unsupported
// pub type PRESUTIL_RESOURCE_TYPES_EQUAL = Option<unsafe extern "system" fn(lpszresourcetypename: windows_sys::core::PCWSTR, hresource: HRESOURCE) -> windows_sys::core::BOOL>;

// UNSUPPORTED Rust 3931:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_SET_BINARY_VALUE = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, pszvaluename: windows_sys::core::PCWSTR, pbnewvalue: *const u8, cbnewvaluesize: u32, ppboutvalue: *mut *mut u8, pcboutvaluesize: *mut u32) -> u32>;

// UNSUPPORTED Rust 3933:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_SET_DWORD_VALUE = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, pszvaluename: windows_sys::core::PCWSTR, dwnewvalue: u32, pdwoutvalue: *mut u32) -> u32>;

// UNSUPPORTED Rust 3935:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_SET_EXPAND_SZ_VALUE = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, pszvaluename: windows_sys::core::PCWSTR, psznewvalue: windows_sys::core::PCWSTR, ppszoutstring: *mut windows_sys::core::PWSTR) -> u32>;

// UNSUPPORTED Rust 3937:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_SET_MULTI_SZ_VALUE = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, pszvaluename: windows_sys::core::PCWSTR, psznewvalue: windows_sys::core::PCWSTR, cbnewvaluesize: u32, ppszoutvalue: *mut windows_sys::core::PWSTR, pcboutvaluesize: *mut u32) -> u32>;

// UNSUPPORTED Rust 3939:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_SET_PRIVATE_PROPERTY_LIST = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, pinpropertylist: *const core::ffi::c_void, cbinpropertylistsize: u32) -> u32>;

// UNSUPPORTED Rust 3941:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_SET_PROPERTY_PARAMETER_BLOCK = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, ppropertytable: *const RESUTIL_PROPERTY_ITEM, reserved: *mut core::ffi::c_void, pinparams: *const u8, pinpropertylist: *const core::ffi::c_void, cbinpropertylistsize: u32, poutparams: *mut u8) -> u32>;

// UNSUPPORTED Rust 3943:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_SET_PROPERTY_PARAMETER_BLOCK_EX = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, ppropertytable: *const RESUTIL_PROPERTY_ITEM, reserved: *mut core::ffi::c_void, pinparams: *const u8, pinpropertylist: *const core::ffi::c_void, cbinpropertylistsize: u32, bforcewrite: windows_sys::core::BOOL, poutparams: *mut u8) -> u32>;

// UNSUPPORTED Rust 3945:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_SET_PROPERTY_TABLE = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, ppropertytable: *const RESUTIL_PROPERTY_ITEM, reserved: *const core::ffi::c_void, ballowunknownproperties: windows_sys::core::BOOL, pinpropertylist: *const core::ffi::c_void, cbinpropertylistsize: u32, poutparams: *mut u8) -> u32>;

// UNSUPPORTED Rust 3947:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_SET_PROPERTY_TABLE_EX = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, ppropertytable: *const RESUTIL_PROPERTY_ITEM, reserved: *mut core::ffi::c_void, ballowunknownproperties: windows_sys::core::BOOL, pinpropertylist: *const core::ffi::c_void, cbinpropertylistsize: u32, bforcewrite: windows_sys::core::BOOL, poutparams: *mut u8) -> u32>;

// UNSUPPORTED Rust 3949:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_SET_QWORD_VALUE = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, pszvaluename: windows_sys::core::PCWSTR, qwnewvalue: u64, pqwoutvalue: *mut u64) -> u32>;

// UNSUPPORTED Rust 3951:1: generic scalar type unsupported
// pub type PRESUTIL_SET_RESOURCE_SERVICE_ENVIRONMENT = Option<unsafe extern "system" fn(pszservicename: windows_sys::core::PCWSTR, hresource: HRESOURCE, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: isize) -> u32>;

// UNSUPPORTED Rust 3952:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Services")]
// pub type PRESUTIL_SET_RESOURCE_SERVICE_START_PARAMETERS = Option<unsafe extern "system" fn(pszservicename: windows_sys::core::PCWSTR, schscmhandle: super::super::System::Services::SC_HANDLE, phservice: *mut super::super::System::Services::SC_HANDLE, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: isize) -> u32>;

// UNSUPPORTED Rust 3954:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Services")]
// pub type PRESUTIL_SET_RESOURCE_SERVICE_START_PARAMETERS_EX = Option<unsafe extern "system" fn(pszservicename: windows_sys::core::PCWSTR, schscmhandle: super::super::System::Services::SC_HANDLE, phservice: *mut super::super::System::Services::SC_HANDLE, dwdesiredaccess: u32, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: isize) -> u32>;

// UNSUPPORTED Rust 3956:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_SET_SZ_VALUE = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, pszvaluename: windows_sys::core::PCWSTR, psznewvalue: windows_sys::core::PCWSTR, ppszoutstring: *mut windows_sys::core::PWSTR) -> u32>;

// UNSUPPORTED Rust 3958:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PRESUTIL_SET_UNKNOWN_PROPERTIES = Option<unsafe extern "system" fn(hkeyclusterkey: super::super::System::Registry::HKEY, ppropertytable: *const RESUTIL_PROPERTY_ITEM, pinpropertylist: *const core::ffi::c_void, cbinpropertylistsize: u32) -> u32>;

// UNSUPPORTED Rust 3960:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Services")]
// pub type PRESUTIL_START_RESOURCE_SERVICE = Option<unsafe extern "system" fn(pszservicename: windows_sys::core::PCWSTR, phservicehandle: *mut super::super::System::Services::SC_HANDLE) -> u32>;

// UNSUPPORTED Rust 3962:1: generic scalar type unsupported
// pub type PRESUTIL_STOP_RESOURCE_SERVICE = Option<unsafe extern "system" fn(pszservicename: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3963:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Services")]
// pub type PRESUTIL_STOP_SERVICE = Option<unsafe extern "system" fn(hservicehandle: super::super::System::Services::SC_HANDLE) -> u32>;

// UNSUPPORTED Rust 3965:1: generic scalar type unsupported
// pub type PRESUTIL_TERMINATE_SERVICE_PROCESS_FROM_RES_DLL = Option<unsafe extern "system" fn(dwservicepid: u32, boffline: windows_sys::core::BOOL, pdwresourcestate: *mut u32, pfnlogevent: PLOG_EVENT_ROUTINE, hresourcehandle: isize) -> u32>;

// UNSUPPORTED Rust 3966:1: generic scalar type unsupported
// pub type PRESUTIL_VERIFY_PRIVATE_PROPERTY_LIST = Option<unsafe extern "system" fn(pinpropertylist: *const core::ffi::c_void, cbinpropertylistsize: u32) -> u32>;

// UNSUPPORTED Rust 3967:1: generic scalar type unsupported
// pub type PRESUTIL_VERIFY_PROPERTY_TABLE = Option<unsafe extern "system" fn(ppropertytable: *const RESUTIL_PROPERTY_ITEM, reserved: *const core::ffi::c_void, ballowunknownproperties: windows_sys::core::BOOL, pinpropertylist: *const core::ffi::c_void, cbinpropertylistsize: u32, poutparams: *mut u8) -> u32>;

// UNSUPPORTED Rust 3968:1: generic scalar type unsupported
// pub type PRESUTIL_VERIFY_RESOURCE_SERVICE = Option<unsafe extern "system" fn(pszservicename: windows_sys::core::PCWSTR) -> u32>;

// UNSUPPORTED Rust 3969:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Services")]
// pub type PRESUTIL_VERIFY_SERVICE = Option<unsafe extern "system" fn(hservicehandle: super::super::System::Services::SC_HANDLE) -> u32>;

// UNSUPPORTED Rust 3971:1: generic scalar type unsupported
// pub type PRES_UTIL_VERIFY_SHUTDOWN_SAFE = Option<unsafe extern "system" fn(flags: u32, reason: u32, presult: *mut u32) -> u32>;

// UNSUPPORTED Rust 3972:1: generic scalar type unsupported
// pub type PSET_INTERNAL_STATE = Option<unsafe extern "system" fn(param0: isize, statetype: CLUSTER_RESOURCE_APPLICATION_STATE, active: windows_sys::core::BOOL) -> u32>;

// UNSUPPORTED Rust 3973:1: generic scalar type unsupported
// pub type PSET_RESOURCE_INMEMORY_NODELOCAL_PROPERTIES_ROUTINE = Option<unsafe extern "system" fn(resourcehandle: isize, propertylistbuffer: *const u8, propertylistbuffersize: u32) -> u32>;

// UNSUPPORTED Rust 3974:1: generic scalar type unsupported
// pub type PSET_RESOURCE_LOCKED_MODE_EX_ROUTINE = Option<unsafe extern "system" fn(resourcehandle: isize, lockedmodeenabled: windows_sys::core::BOOL, lockedmodereason: u32, lockedmodeflags: u32) -> u32>;

// UNSUPPORTED Rust 3975:1: generic scalar type unsupported
// pub type PSET_RESOURCE_LOCKED_MODE_ROUTINE = Option<unsafe extern "system" fn(resourcehandle: isize, lockedmodeenabled: windows_sys::core::BOOL, lockedmodereason: u32) -> u32>;

// UNSUPPORTED Rust 3976:1: generic scalar type unsupported
// pub type PSET_RESOURCE_STATUS_ROUTINE = Option<unsafe extern "system" fn(resourcehandle: isize, resourcestatus: *mut RESOURCE_STATUS) -> u32>;

// UNSUPPORTED Rust 3977:1: generic scalar type unsupported
// pub type PSET_RESOURCE_STATUS_ROUTINE_EX = Option<unsafe extern "system" fn(resourcehandle: isize, resourcestatus: *mut RESOURCE_STATUS_EX) -> u32>;

// UNSUPPORTED Rust 3978:1: generic scalar type unsupported
// pub type PSET_RESOURCE_WPR_POLICY_ROUTINE = Option<unsafe extern "system" fn(resourcehandle: isize, wprpolicyflags: u32) -> u32>;

// UNSUPPORTED Rust 3979:1: generic scalar type unsupported
// pub type PSIGNAL_FAILURE_ROUTINE = Option<unsafe extern "system" fn(resourcehandle: isize, failuretype: FAILURE_TYPE, applicationspecificerrorcode: u32) -> u32>;

// UNSUPPORTED Rust 3980:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PSTARTUP_EX_ROUTINE = Option<unsafe extern "system" fn(resourcetype: windows_sys::core::PCWSTR, minversionsupported: u32, maxversionsupported: u32, monitorcallbackfunctions: *mut CLRES_CALLBACK_FUNCTION_TABLE, resourcedllinterfacefunctions: *mut *mut CLRES_FUNCTION_TABLE) -> u32>;

// UNSUPPORTED Rust 3982:1: attribute cfg requires explicit semantics/configuration
// #[cfg(feature = "Win32_System_Registry")]
// pub type PSTARTUP_ROUTINE = Option<unsafe extern "system" fn(resourcetype: windows_sys::core::PCWSTR, minversionsupported: u32, maxversionsupported: u32, setresourcestatus: PSET_RESOURCE_STATUS_ROUTINE, logevent: PLOG_EVENT_ROUTINE, functiontable: *mut *mut CLRES_FUNCTION_TABLE) -> u32>;

// UNSUPPORTED Rust 3984:1: generic scalar type unsupported
// pub type PTERMINATE_ROUTINE = Option<unsafe extern "system" fn(resource: *mut core::ffi::c_void)>;

// UNSUPPORTED Rust 3985:1: generic scalar type unsupported
// pub type PWORKER_START_ROUTINE = Option<unsafe extern "system" fn(pworker: *mut CLUS_WORKER, lpthreadparameter: *mut core::ffi::c_void) -> u32>;

// UNSUPPORTED Rust 3986:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct PaxosTagCStruct {
//     pub __padding__PaxosTagVtable: u64,
//     pub __padding__NextEpochVtable: u64,
//     pub __padding__NextEpoch_DateTimeVtable: u64,
//     pub NextEpoch_DateTime_ticks: u64,
//     pub NextEpoch_Value: i32,
//     pub __padding__BoundryNextEpoch: u32,
//     pub __padding__EpochVtable: u64,
//     pub __padding__Epoch_DateTimeVtable: u64,
//     pub Epoch_DateTime_ticks: u64,
//     pub Epoch_Value: i32,
//     pub __padding__BoundryEpoch: u32,
//     pub Sequence: i32,
//     pub __padding__BoundrySequence: u32,
// }

public const val `PriorityDisabled`: `CLUSTER_GROUP_PRIORITY` = 0;
public const val `PriorityHigh`: `CLUSTER_GROUP_PRIORITY` = 3000;
public const val `PriorityLow`: `CLUSTER_GROUP_PRIORITY` = 1000;
public const val `PriorityMedium`: `CLUSTER_GROUP_PRIORITY` = 2000;
public typealias `RESDLL_CONTEXT_OPERATION_TYPE` = Int;
public typealias `RESOURCE_EXIT_STATE` = Int;
// UNSUPPORTED Rust 4009:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RESOURCE_FAILURE_INFO {
//     pub dwRestartAttemptsRemaining: u32,
//     pub dwRestartPeriodRemaining: u32,
// }

// UNSUPPORTED Rust 4015:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RESOURCE_FAILURE_INFO_BUFFER {
//     pub dwVersion: u32,
//     pub Info: RESOURCE_FAILURE_INFO,
// }

public const val `RESOURCE_FAILURE_INFO_VERSION_1`: UInt = 1u;
public typealias `RESOURCE_MONITOR_STATE` = Int;
// UNSUPPORTED Rust 4023:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RESOURCE_STATUS {
//     pub ResourceState: CLUSTER_RESOURCE_STATE,
//     pub CheckPoint: u32,
//     pub WaitHint: u32,
//     pub EventHandle: super::super::Foundation::HANDLE,
// }

// UNSUPPORTED Rust 4031:1: declaration Impl has no candidate rule
// impl Default for RESOURCE_STATUS {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4036:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RESOURCE_STATUS_EX {
//     pub ResourceState: CLUSTER_RESOURCE_STATE,
//     pub CheckPoint: u32,
//     pub EventHandle: super::super::Foundation::HANDLE,
//     pub ApplicationSpecificErrorCode: u32,
//     pub Flags: u32,
//     pub WaitHint: u32,
// }

// UNSUPPORTED Rust 4046:1: declaration Impl has no candidate rule
// impl Default for RESOURCE_STATUS_EX {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4051:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RESOURCE_TERMINAL_FAILURE_INFO_BUFFER {
//     pub isTerminalFailure: windows_sys::core::BOOL,
//     pub restartPeriodRemaining: u32,
// }

public const val `RESTYPE_MONITOR_SHUTTING_DOWN_CLUSSVC_CRASH`: UInt = 2u;
public const val `RESTYPE_MONITOR_SHUTTING_DOWN_NODE_STOP`: UInt = 1u;
// UNSUPPORTED Rust 4059:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RESUTIL_FILETIME_DATA {
//     pub Default: super::super::Foundation::FILETIME,
//     pub Minimum: super::super::Foundation::FILETIME,
//     pub Maximum: super::super::Foundation::FILETIME,
// }

// UNSUPPORTED Rust 4066:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RESUTIL_LARGEINT_DATA {
//     pub Default: i64,
//     pub Minimum: i64,
//     pub Maximum: i64,
// }

// UNSUPPORTED Rust 4073:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct RESUTIL_PROPERTY_ITEM {
//     pub Name: windows_sys::core::PWSTR,
//     pub KeyName: windows_sys::core::PWSTR,
//     pub Format: u32,
//     pub Anonymous: RESUTIL_PROPERTY_ITEM_0,
//     pub Minimum: u32,
//     pub Maximum: u32,
//     pub Flags: u32,
//     pub Offset: u32,
// }

// UNSUPPORTED Rust 4085:1: declaration Impl has no candidate rule
// impl Default for RESUTIL_PROPERTY_ITEM {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4090:1: declaration Union has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union RESUTIL_PROPERTY_ITEM_0 {
//     pub DefaultPtr: usize,
//     pub Default: u32,
//     pub lpDefault: *mut core::ffi::c_void,
//     pub LargeIntData: *mut RESUTIL_LARGEINT_DATA,
//     pub ULargeIntData: *mut RESUTIL_ULARGEINT_DATA,
//     pub FileTimeData: *mut RESUTIL_FILETIME_DATA,
// }

// UNSUPPORTED Rust 4100:1: declaration Impl has no candidate rule
// impl Default for RESUTIL_PROPERTY_ITEM_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `RESUTIL_PROPITEM_IN_MEMORY`: UInt = 8u;
public const val `RESUTIL_PROPITEM_READ_ONLY`: UInt = 1u;
public const val `RESUTIL_PROPITEM_REQUIRED`: UInt = 2u;
public const val `RESUTIL_PROPITEM_SIGNED`: UInt = 4u;
// UNSUPPORTED Rust 4109:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct RESUTIL_ULARGEINT_DATA {
//     pub Default: u64,
//     pub Minimum: u64,
//     pub Maximum: u64,
// }

public const val `RS3_UPGRADE_VERSION`: UInt = 1u;
public const val `RS4_UPGRADE_VERSION`: UInt = 2u;
public const val `RS5_UPGRADE_VERSION`: UInt = 3u;
public const val `RedirectedIOReasonBitLockerInitializing`: ULong = 16uL;
public const val `RedirectedIOReasonFileSystemTiering`: ULong = 8uL;
public const val `RedirectedIOReasonMax`: ULong = 9223372036854775808uL;
public const val `RedirectedIOReasonReFs`: ULong = 32uL;
public const val `RedirectedIOReasonUnsafeFileSystemFilter`: ULong = 2uL;
public const val `RedirectedIOReasonUnsafeVolumeFilter`: ULong = 4uL;
public const val `RedirectedIOReasonUserRequest`: ULong = 1uL;
public const val `ResdllContextOperationTypeDrain`: `RESDLL_CONTEXT_OPERATION_TYPE` = 1;
public const val `ResdllContextOperationTypeDrainFailure`: `RESDLL_CONTEXT_OPERATION_TYPE` = 2;
public const val `ResdllContextOperationTypeEmbeddedFailure`: `RESDLL_CONTEXT_OPERATION_TYPE` = 3;
public const val `ResdllContextOperationTypeFailback`: `RESDLL_CONTEXT_OPERATION_TYPE` = 0;
public const val `ResdllContextOperationTypeNetworkDisconnect`: `RESDLL_CONTEXT_OPERATION_TYPE` = 5;
public const val `ResdllContextOperationTypeNetworkDisconnectMoveRetry`: `RESDLL_CONTEXT_OPERATION_TYPE` = 6;
public const val `ResdllContextOperationTypePreemption`: `RESDLL_CONTEXT_OPERATION_TYPE` = 4;
public const val `ResourceExitStateContinue`: `RESOURCE_EXIT_STATE` = 0;
public const val `ResourceExitStateMax`: `RESOURCE_EXIT_STATE` = 2;
public const val `ResourceExitStateTerminate`: `RESOURCE_EXIT_STATE` = 1;
// UNSUPPORTED Rust 4136:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct ResourceUtilizationInfoElement {
//     pub PhysicalNumaId: u64,
//     pub CurrentMemory: u64,
// }

public const val `RmonArbitrateResource`: `RESOURCE_MONITOR_STATE` = 10;
public const val `RmonDeadlocked`: `RESOURCE_MONITOR_STATE` = 15;
public const val `RmonDeletingResource`: `RESOURCE_MONITOR_STATE` = 7;
public const val `RmonIdle`: `RESOURCE_MONITOR_STATE` = 1;
public const val `RmonInitializing`: `RESOURCE_MONITOR_STATE` = 0;
public const val `RmonInitializingResource`: `RESOURCE_MONITOR_STATE` = 3;
public const val `RmonIsAlivePoll`: `RESOURCE_MONITOR_STATE` = 8;
public const val `RmonLooksAlivePoll`: `RESOURCE_MONITOR_STATE` = 9;
public const val `RmonOfflineResource`: `RESOURCE_MONITOR_STATE` = 5;
public const val `RmonOnlineResource`: `RESOURCE_MONITOR_STATE` = 4;
public const val `RmonReleaseResource`: `RESOURCE_MONITOR_STATE` = 11;
public const val `RmonResourceControl`: `RESOURCE_MONITOR_STATE` = 12;
public const val `RmonResourceTypeControl`: `RESOURCE_MONITOR_STATE` = 13;
public const val `RmonShutdownResource`: `RESOURCE_MONITOR_STATE` = 6;
public const val `RmonStartingResource`: `RESOURCE_MONITOR_STATE` = 2;
public const val `RmonTerminateResource`: `RESOURCE_MONITOR_STATE` = 14;
public const val `SET_APPINSTANCE_CSV_FLAGS_VALID_ONLY_IF_CSV_COORDINATOR`: UInt = 1u;
// UNSUPPORTED Rust 4159:1: generic scalar type unsupported
// pub type SET_APP_INSTANCE_CSV_FLAGS = Option<unsafe extern "system" fn(processhandle: super::super::Foundation::HANDLE, mask: u32, flags: u32) -> u32>;

public typealias `SR_DISK_REPLICATION_ELIGIBLE` = Int;
public typealias `SR_REPLICATED_DISK_TYPE` = Int;
public const val `SR_REPLICATED_PARTITION_DISALLOW_MULTINODE_IO`: UInt = 1u;
// UNSUPPORTED Rust 4163:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SR_RESOURCE_TYPE_ADD_REPLICATION_GROUP {
//     pub ReplicationGroupName: [u16; 260],
//     pub Description: [u16; 260],
//     pub LogPath: [u16; 260],
//     pub MaxLogSizeInBytes: u64,
//     pub LogType: u16,
//     pub ReplicationMode: u32,
//     pub MinimumPartnersInSync: u32,
//     pub EnableWriteConsistency: bool,
//     pub EnableEncryption: bool,
//     pub EnableCompression: bool,
//     pub CertificateThumbprint: [u16; 260],
//     pub VolumeNameCount: u32,
//     pub VolumeNames: [u16; 260],
// }

// UNSUPPORTED Rust 4180:1: declaration Impl has no candidate rule
// impl Default for SR_RESOURCE_TYPE_ADD_REPLICATION_GROUP {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4185:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SR_RESOURCE_TYPE_ADD_REPLICATION_GROUP_RESULT {
//     pub Result: u32,
//     pub ErrorString: [u16; 260],
// }

// UNSUPPORTED Rust 4191:1: declaration Impl has no candidate rule
// impl Default for SR_RESOURCE_TYPE_ADD_REPLICATION_GROUP_RESULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4196:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SR_RESOURCE_TYPE_DISK_INFO {
//     pub Reason: SR_DISK_REPLICATION_ELIGIBLE,
//     pub DiskGuid: windows_sys::core::GUID,
// }

// UNSUPPORTED Rust 4202:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SR_RESOURCE_TYPE_ELIGIBLE_DISKS_RESULT {
//     pub Count: u16,
//     pub DiskInfo: [SR_RESOURCE_TYPE_DISK_INFO; 1],
// }

// UNSUPPORTED Rust 4208:1: declaration Impl has no candidate rule
// impl Default for SR_RESOURCE_TYPE_ELIGIBLE_DISKS_RESULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4213:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SR_RESOURCE_TYPE_QUERY_ELIGIBLE_LOGDISKS {
//     pub DataDiskGuid: windows_sys::core::GUID,
//     pub IncludeOfflineDisks: bool,
// }

// UNSUPPORTED Rust 4219:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SR_RESOURCE_TYPE_QUERY_ELIGIBLE_SOURCE_DATADISKS {
//     pub DataDiskGuid: windows_sys::core::GUID,
//     pub IncludeAvailableStoargeDisks: bool,
// }

// UNSUPPORTED Rust 4225:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SR_RESOURCE_TYPE_QUERY_ELIGIBLE_TARGET_DATADISKS {
//     pub SourceDataDiskGuid: windows_sys::core::GUID,
//     pub TargetReplicationGroupGuid: windows_sys::core::GUID,
//     pub SkipConnectivityCheck: bool,
//     pub IncludeOfflineDisks: bool,
// }

// UNSUPPORTED Rust 4233:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SR_RESOURCE_TYPE_REPLICATED_DISK {
//     pub Type: SR_REPLICATED_DISK_TYPE,
//     pub ClusterDiskResourceGuid: windows_sys::core::GUID,
//     pub ReplicationGroupId: windows_sys::core::GUID,
//     pub ReplicationGroupName: [u16; 260],
// }

// UNSUPPORTED Rust 4241:1: declaration Impl has no candidate rule
// impl Default for SR_RESOURCE_TYPE_REPLICATED_DISK {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4246:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SR_RESOURCE_TYPE_REPLICATED_DISKS_RESULT {
//     pub Count: u16,
//     pub ReplicatedDisks: [SR_RESOURCE_TYPE_REPLICATED_DISK; 1],
// }

// UNSUPPORTED Rust 4252:1: declaration Impl has no candidate rule
// impl Default for SR_RESOURCE_TYPE_REPLICATED_DISKS_RESULT {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4257:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub struct SR_RESOURCE_TYPE_REPLICATED_PARTITION_ARRAY {
//     pub Count: u32,
//     pub PartitionArray: [SR_RESOURCE_TYPE_REPLICATED_PARTITION_INFO; 1],
// }

// UNSUPPORTED Rust 4263:1: declaration Impl has no candidate rule
// impl Default for SR_RESOURCE_TYPE_REPLICATED_PARTITION_ARRAY {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 4268:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct SR_RESOURCE_TYPE_REPLICATED_PARTITION_INFO {
//     pub PartitionOffset: u64,
//     pub Capabilities: u32,
// }

// UNSUPPORTED Rust 4274:1: non-scalar type Ptr unsupported
// pub const STARTUP_EX_ROUTINE: windows_sys::core::PCSTR = windows_sys::core::s!("StartupEx");

// UNSUPPORTED Rust 4275:1: non-scalar type Ptr unsupported
// pub const STARTUP_ROUTINE: windows_sys::core::PCSTR = windows_sys::core::s!("Startup");

public const val `SharedVolumeStateActive`: `CLUSTER_SHARED_VOLUME_STATE` = 2;
public const val `SharedVolumeStateActiveRedirected`: `CLUSTER_SHARED_VOLUME_STATE` = 3;
public const val `SharedVolumeStateActiveVolumeRedirected`: `CLUSTER_SHARED_VOLUME_STATE` = 4;
public const val `SharedVolumeStatePaused`: `CLUSTER_SHARED_VOLUME_STATE` = 1;
public const val `SharedVolumeStateUnavailable`: `CLUSTER_SHARED_VOLUME_STATE` = 0;
public const val `SrDiskReplicationEligibleAlreadyInReplication`: `SR_DISK_REPLICATION_ELIGIBLE` = 9;
public const val `SrDiskReplicationEligibleFileSystemNotSupported`: `SR_DISK_REPLICATION_ELIGIBLE` = 8;
public const val `SrDiskReplicationEligibleInSameSite`: `SR_DISK_REPLICATION_ELIGIBLE` = 7;
public const val `SrDiskReplicationEligibleInsufficientFreeSpace`: `SR_DISK_REPLICATION_ELIGIBLE` = 5;
public const val `SrDiskReplicationEligibleNone`: `SR_DISK_REPLICATION_ELIGIBLE` = 0;
public const val `SrDiskReplicationEligibleNotGpt`: `SR_DISK_REPLICATION_ELIGIBLE` = 3;
public const val `SrDiskReplicationEligibleNotInSameSite`: `SR_DISK_REPLICATION_ELIGIBLE` = 6;
public const val `SrDiskReplicationEligibleOffline`: `SR_DISK_REPLICATION_ELIGIBLE` = 2;
public const val `SrDiskReplicationEligibleOther`: `SR_DISK_REPLICATION_ELIGIBLE` = 9999;
public const val `SrDiskReplicationEligiblePartitionLayoutMismatch`: `SR_DISK_REPLICATION_ELIGIBLE` = 4;
public const val `SrDiskReplicationEligibleSameAsSpecifiedDisk`: `SR_DISK_REPLICATION_ELIGIBLE` = 10;
public const val `SrDiskReplicationEligibleYes`: `SR_DISK_REPLICATION_ELIGIBLE` = 1;
public const val `SrReplicatedDiskTypeDestination`: `SR_REPLICATED_DISK_TYPE` = 3;
public const val `SrReplicatedDiskTypeLogDestination`: `SR_REPLICATED_DISK_TYPE` = 4;
public const val `SrReplicatedDiskTypeLogNotInParthership`: `SR_REPLICATED_DISK_TYPE` = 6;
public const val `SrReplicatedDiskTypeLogSource`: `SR_REPLICATED_DISK_TYPE` = 2;
public const val `SrReplicatedDiskTypeNone`: `SR_REPLICATED_DISK_TYPE` = 0;
public const val `SrReplicatedDiskTypeNotInParthership`: `SR_REPLICATED_DISK_TYPE` = 5;
public const val `SrReplicatedDiskTypeOther`: `SR_REPLICATED_DISK_TYPE` = 7;
public const val `SrReplicatedDiskTypeSource`: `SR_REPLICATED_DISK_TYPE` = 1;
// UNSUPPORTED Rust 4301:1: non-scalar type Ptr unsupported
// pub const USE_CLIENT_ACCESS_NETWORKS_FOR_CSV: windows_sys::core::PCWSTR = windows_sys::core::w!("UseClientAccessNetworksForSharedVolumes");

public typealias `VM_RESDLL_CONTEXT` = Int;
public const val `VmResdllContextLiveMigration`: `VM_RESDLL_CONTEXT` = 4;
public const val `VmResdllContextSave`: `VM_RESDLL_CONTEXT` = 1;
public const val `VmResdllContextShutdown`: `VM_RESDLL_CONTEXT` = 2;
public const val `VmResdllContextShutdownForce`: `VM_RESDLL_CONTEXT` = 3;
public const val `VmResdllContextTurnOff`: `VM_RESDLL_CONTEXT` = 0;
public const val `VolumeBackupInProgress`: `CLUSTER_SHARED_VOLUME_BACKUP_STATE` = 1;
public const val `VolumeBackupNone`: `CLUSTER_SHARED_VOLUME_BACKUP_STATE` = 0;
public const val `VolumeRedirectedIOReasonMax`: ULong = 9223372036854775808uL;
public const val `VolumeRedirectedIOReasonNoDiskConnectivity`: ULong = 1uL;
public const val `VolumeRedirectedIOReasonStorageSpaceNotAttached`: ULong = 2uL;
public const val `VolumeRedirectedIOReasonVolumeReplicationEnabled`: ULong = 4uL;
public const val `VolumeStateDismounted`: `CLUSTER_CSV_VOLUME_FAULT_STATE` = 8;
public const val `VolumeStateInMaintenance`: `CLUSTER_CSV_VOLUME_FAULT_STATE` = 4;
public const val `VolumeStateNoAccess`: `CLUSTER_CSV_VOLUME_FAULT_STATE` = 2;
public const val `VolumeStateNoDirectIO`: `CLUSTER_CSV_VOLUME_FAULT_STATE` = 1;
public const val `VolumeStateNoFaults`: `CLUSTER_CSV_VOLUME_FAULT_STATE` = 0;
public const val `WS2016_RTM_UPGRADE_VERSION`: UInt = 8u;
public const val `WS2016_TP4_UPGRADE_VERSION`: UInt = 6u;
public const val `WS2016_TP5_UPGRADE_VERSION`: UInt = 7u;
// UNSUPPORTED Rust 4322:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WitnessTagHelper {
//     pub Version: i32,
//     pub paxosToValidate: PaxosTagCStruct,
// }

// UNSUPPORTED Rust 4328:1: declaration Struct has no candidate rule
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct WitnessTagUpdateHelper {
//     pub Version: i32,
//     pub paxosToSet: PaxosTagCStruct,
//     pub paxosToValidate: PaxosTagCStruct,
// }

public const val `eResourceStateChangeReasonFailedMove`: `CLUSTER_RESOURCE_STATE_CHANGE_REASON` = 3;
public const val `eResourceStateChangeReasonFailover`: `CLUSTER_RESOURCE_STATE_CHANGE_REASON` = 2;
public const val `eResourceStateChangeReasonMove`: `CLUSTER_RESOURCE_STATE_CHANGE_REASON` = 1;
public const val `eResourceStateChangeReasonRundown`: `CLUSTER_RESOURCE_STATE_CHANGE_REASON` = 5;
public const val `eResourceStateChangeReasonShutdown`: `CLUSTER_RESOURCE_STATE_CHANGE_REASON` = 4;
public const val `eResourceStateChangeReasonUnknown`: `CLUSTER_RESOURCE_STATE_CHANGE_REASON` = 0;
