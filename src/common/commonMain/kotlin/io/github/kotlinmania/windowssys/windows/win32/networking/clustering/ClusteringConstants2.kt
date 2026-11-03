package io.github.kotlinmania.windowssys.windows.win32.networking.clustering

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ClusterNodeJoining: CLUSTER_NODE_STATE = 3

public val ClusterNodePaused: CLUSTER_NODE_STATE = 2

public val ClusterNodeResumeFailbackTypeCount: CLUSTER_NODE_RESUME_FAILBACK_TYPE = 3

public val ClusterNodeStateUnknown: CLUSTER_NODE_STATE = -1

public val ClusterNodeUp: CLUSTER_NODE_STATE = 0

public val ClusterResourceApplicationOSHeartBeat: CLUSTER_RESOURCE_APPLICATION_STATE = 2

public val ClusterResourceApplicationReady: CLUSTER_RESOURCE_APPLICATION_STATE = 3

public val ClusterResourceApplicationStateUnknown: CLUSTER_RESOURCE_APPLICATION_STATE = 1

public val ClusterResourceDontRestart: CLUSTER_RESOURCE_RESTART_ACTION = 0

public val ClusterResourceEmbeddedFailureActionLogOnly: CLUSTER_RESOURCE_EMBEDDED_FAILURE_ACTION = 1

public val ClusterResourceEmbeddedFailureActionNone: CLUSTER_RESOURCE_EMBEDDED_FAILURE_ACTION = 0

public val ClusterResourceEmbeddedFailureActionRecover: CLUSTER_RESOURCE_EMBEDDED_FAILURE_ACTION = 2

public val ClusterResourceFailed: CLUSTER_RESOURCE_STATE = 4

public val ClusterResourceInherited: CLUSTER_RESOURCE_STATE = 0

public val ClusterResourceInitializing: CLUSTER_RESOURCE_STATE = 1

public val ClusterResourceOffline: CLUSTER_RESOURCE_STATE = 3

public val ClusterResourceOfflinePending: CLUSTER_RESOURCE_STATE = 130

public val ClusterResourceOnline: CLUSTER_RESOURCE_STATE = 2

public val ClusterResourceOnlinePending: CLUSTER_RESOURCE_STATE = 129

public val ClusterResourcePending: CLUSTER_RESOURCE_STATE = 128

public val ClusterResourceRestartActionCount: CLUSTER_RESOURCE_RESTART_ACTION = 3

public val ClusterResourceRestartNoNotify: CLUSTER_RESOURCE_RESTART_ACTION = 1

public val ClusterResourceRestartNotify: CLUSTER_RESOURCE_RESTART_ACTION = 2

public val ClusterResourceStateUnknown: CLUSTER_RESOURCE_STATE = -1

public val ClusterRoleClustered: CLUSTER_ROLE_STATE = 0

public val ClusterRoleDFSReplicatedFolder: CLUSTER_ROLE = 15

public val ClusterRoleDHCP: CLUSTER_ROLE = 0

public val ClusterRoleDTC: CLUSTER_ROLE = 1

public val ClusterRoleDistributedFileSystem: CLUSTER_ROLE = 16

public val ClusterRoleDistributedNetworkName: CLUSTER_ROLE = 17

public val ClusterRoleFileServer: CLUSTER_ROLE = 2

public val ClusterRoleFileShare: CLUSTER_ROLE = 18

public val ClusterRoleFileShareWitness: CLUSTER_ROLE = 19

public val ClusterRoleGenericApplication: CLUSTER_ROLE = 3

public val ClusterRoleGenericScript: CLUSTER_ROLE = 4

public val ClusterRoleGenericService: CLUSTER_ROLE = 5

public val ClusterRoleHardDisk: CLUSTER_ROLE = 20

public val ClusterRoleIPAddress: CLUSTER_ROLE = 21

public val ClusterRoleIPV6Address: CLUSTER_ROLE = 22

public val ClusterRoleIPV6TunnelAddress: CLUSTER_ROLE = 23

public val ClusterRoleISCSINameServer: CLUSTER_ROLE = 6

public val ClusterRoleISCSITargetServer: CLUSTER_ROLE = 24

public val ClusterRoleMSMQ: CLUSTER_ROLE = 7

public val ClusterRoleNFS: CLUSTER_ROLE = 8

public val ClusterRoleNetworkFileSystem: CLUSTER_ROLE = 14

public val ClusterRoleNetworkName: CLUSTER_ROLE = 25

public val ClusterRolePhysicalDisk: CLUSTER_ROLE = 26

public val ClusterRolePrintServer: CLUSTER_ROLE = 9

public val ClusterRoleSODAFileServer: CLUSTER_ROLE = 27

public val ClusterRoleStandAloneNamespaceServer: CLUSTER_ROLE = 10

public val ClusterRoleStoragePool: CLUSTER_ROLE = 28

public val ClusterRoleTaskScheduler: CLUSTER_ROLE = 13

public val ClusterRoleUnclustered: CLUSTER_ROLE_STATE = 1

public val ClusterRoleUnknown: CLUSTER_ROLE_STATE = -1

public val ClusterRoleVirtualMachine: CLUSTER_ROLE = 29

public val ClusterRoleVirtualMachineConfiguration: CLUSTER_ROLE = 30

public val ClusterRoleVirtualMachineReplicaBroker: CLUSTER_ROLE = 31

public val ClusterRoleVolumeShadowCopyServiceTask: CLUSTER_ROLE = 11

public val ClusterRoleWINS: CLUSTER_ROLE = 12

public val ClusterSetupPhaseAddClusterProperties: CLUSTER_SETUP_PHASE = 201

public val ClusterSetupPhaseAddNodeToCluster: CLUSTER_SETUP_PHASE = 301

public val ClusterSetupPhaseCleanupCOs: CLUSTER_SETUP_PHASE = 402

public val ClusterSetupPhaseCleanupNode: CLUSTER_SETUP_PHASE = 405

public val ClusterSetupPhaseClusterGroupOnline: CLUSTER_SETUP_PHASE = 206

public val ClusterSetupPhaseConfigureClusSvc: CLUSTER_SETUP_PHASE = 104

public val ClusterSetupPhaseConfigureClusterAccount: CLUSTER_SETUP_PHASE = 109

public val ClusterSetupPhaseContinue: CLUSTER_SETUP_PHASE_TYPE = 2

public val ClusterSetupPhaseCoreGroupCleanup: CLUSTER_SETUP_PHASE = 406

public val ClusterSetupPhaseCreateClusterAccount: CLUSTER_SETUP_PHASE = 108

public val ClusterSetupPhaseCreateGroups: CLUSTER_SETUP_PHASE = 203

public val ClusterSetupPhaseCreateIPAddressResources: CLUSTER_SETUP_PHASE = 204

public val ClusterSetupPhaseCreateNetworkName: CLUSTER_SETUP_PHASE = 205

public val ClusterSetupPhaseCreateResourceTypes: CLUSTER_SETUP_PHASE = 202

public val ClusterSetupPhaseDeleteGroup: CLUSTER_SETUP_PHASE = 401

public val ClusterSetupPhaseEnd: CLUSTER_SETUP_PHASE_TYPE = 3

public val ClusterSetupPhaseEvictNode: CLUSTER_SETUP_PHASE = 404

public val ClusterSetupPhaseFailureCleanup: CLUSTER_SETUP_PHASE = 999

public val ClusterSetupPhaseFatal: CLUSTER_SETUP_PHASE_SEVERITY = 3

public val ClusterSetupPhaseFormingCluster: CLUSTER_SETUP_PHASE = 200

public val ClusterSetupPhaseGettingCurrentMembership: CLUSTER_SETUP_PHASE = 300

public val ClusterSetupPhaseInformational: CLUSTER_SETUP_PHASE_SEVERITY = 1

public val ClusterSetupPhaseInitialize: CLUSTER_SETUP_PHASE = 1

public val ClusterSetupPhaseMoveGroup: CLUSTER_SETUP_PHASE = 400

public val ClusterSetupPhaseNodeUp: CLUSTER_SETUP_PHASE = 302

public val ClusterSetupPhaseOfflineGroup: CLUSTER_SETUP_PHASE = 403

public val ClusterSetupPhaseQueryClusterNameAccount: CLUSTER_SETUP_PHASE = 106

public val ClusterSetupPhaseReport: CLUSTER_SETUP_PHASE_TYPE = 4

public val ClusterSetupPhaseStart: CLUSTER_SETUP_PHASE_TYPE = 1

public val ClusterSetupPhaseStartingClusSvc: CLUSTER_SETUP_PHASE = 105

public val ClusterSetupPhaseValidateClusDisk: CLUSTER_SETUP_PHASE = 103

public val ClusterSetupPhaseValidateClusterNameAccount: CLUSTER_SETUP_PHASE = 107

public val ClusterSetupPhaseValidateNetft: CLUSTER_SETUP_PHASE = 102

public val ClusterSetupPhaseValidateNodeState: CLUSTER_SETUP_PHASE = 100

public val ClusterSetupPhaseWarning: CLUSTER_SETUP_PHASE_SEVERITY = 2

public val ClusterSharedVolumeHWSnapshotCompleted: CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE = 2

public val ClusterSharedVolumePrepareForFreeze: CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE = 3

public val ClusterSharedVolumePrepareForHWSnapshot: CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE = 1

public val ClusterSharedVolumeRenameInputTypeNone: CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE = 0

public val ClusterSharedVolumeRenameInputTypeVolumeGuid: CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE = 4

public val ClusterSharedVolumeRenameInputTypeVolumeId: CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE = 2

public val ClusterSharedVolumeRenameInputTypeVolumeName: CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE = 3

public val ClusterSharedVolumeRenameInputTypeVolumeOffset: CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE = 1

public val ClusterSharedVolumeSnapshotStateUnknown: CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE = 0

public val ClusterStateNotConfigured: NODE_CLUSTER_STATE = 1

public val ClusterStateNotInstalled: NODE_CLUSTER_STATE = 0

public val ClusterStateNotRunning: NODE_CLUSTER_STATE = 3

public val ClusterStateRunning: NODE_CLUSTER_STATE = 19

public val ClusterStorageNodeDown: CLUSTER_STORAGENODE_STATE = 2

public val ClusterStorageNodePaused: CLUSTER_STORAGENODE_STATE = 3

public val ClusterStorageNodeStarting: CLUSTER_STORAGENODE_STATE = 4

public val ClusterStorageNodeStateUnknown: CLUSTER_STORAGENODE_STATE = 0

public val ClusterStorageNodeStopping: CLUSTER_STORAGENODE_STATE = 5

public val ClusterStorageNodeUp: CLUSTER_STORAGENODE_STATE = 1

public val ClusterUpgradePhaseInitialize: CLUSTER_UPGRADE_PHASE = 1

public val ClusterUpgradePhaseInstallingNewComponents: CLUSTER_UPGRADE_PHASE = 4

public val ClusterUpgradePhaseUpgradeComplete: CLUSTER_UPGRADE_PHASE = 5

public val ClusterUpgradePhaseUpgradingComponents: CLUSTER_UPGRADE_PHASE = 3

public val ClusterUpgradePhaseValidatingUpgrade: CLUSTER_UPGRADE_PHASE = 2

public val DNS_LENGTH: UInt = 64u

public val DoNotFailbackGroups: CLUSTER_NODE_RESUME_FAILBACK_TYPE = 0

public val DomainNames: GUID = GUID.from_u128(0xf2e606e1263111d1uL, 0x89f100a0c90d061euL)

public val ENABLE_CLUSTER_SHARED_VOLUMES: PCWSTR = w("EnableSharedVolumes")

public val FAILURE_TYPE_EMBEDDED: FAILURE_TYPE = 1

public val FAILURE_TYPE_GENERAL: FAILURE_TYPE = 0

public val FAILURE_TYPE_NETWORK_LOSS: FAILURE_TYPE = 2

public val FE_UPGRADE_VERSION: UInt = 4u

public val FILESHARE_CHANGE_ADD: FILESHARE_CHANGE_ENUM = 1

public val FILESHARE_CHANGE_DEL: FILESHARE_CHANGE_ENUM = 2

public val FILESHARE_CHANGE_MODIFY: FILESHARE_CHANGE_ENUM = 3

public val FILESHARE_CHANGE_NONE: FILESHARE_CHANGE_ENUM = 0

public val FailbackGroupsImmediately: CLUSTER_NODE_RESUME_FAILBACK_TYPE = 1

public val FailbackGroupsPerPolicy: CLUSTER_NODE_RESUME_FAILBACK_TYPE = 2

public val GROUPSET_READY_SETTING_APPLICATION_READY: UInt = 4u

public val GROUPSET_READY_SETTING_DELAY: UInt = 1u

public val GROUPSET_READY_SETTING_ONLINE: UInt = 2u

public val GROUPSET_READY_SETTING_OS_HEARTBEAT: UInt = 3u

public val GROUP_FAILURE_INFO_VERSION_1: UInt = 1u

public val GRP_PLACEMENT_OPTIONS_ALL: GRP_PLACEMENT_OPTIONS = 1

public val GRP_PLACEMENT_OPTIONS_DEFAULT: GRP_PLACEMENT_OPTIONS = 0

public val GRP_PLACEMENT_OPTIONS_DISABLE_AUTOBALANCING: GRP_PLACEMENT_OPTIONS = 1

public val GRP_PLACEMENT_OPTIONS_MIN_VALUE: GRP_PLACEMENT_OPTIONS = 0

public val GUID_PRESENT: UInt = 1u

public val HCI_UPGRADE_BIT: UInt = 32768u

public val LOCKED_MODE_FLAGS_DONT_REMOVE_FROM_MOVE_QUEUE: UInt = 1u

public val LOG_ERROR: LOG_LEVEL = 2

public val LOG_INFORMATION: LOG_LEVEL = 0

public val LOG_SEVERE: LOG_LEVEL = 3

public val LOG_WARNING: LOG_LEVEL = 1

public val MAINTENANCE_MODE_V2_SIG: UInt = 2881155087u

public val MAX_CLUSTERNAME_LENGTH: UInt = 63u

public val MAX_CO_PASSWORD_LENGTH: UInt = 16u

public val MAX_CO_PASSWORD_LENGTHEX: UInt = 127u

public val MAX_CO_PASSWORD_STORAGEEX: UInt = 128u

public val MAX_CREATINGDC_LENGTH: UInt = 256u

public val MAX_OBJECTID: UInt = 64u

public val MINIMUM_NEVER_PREEMPT_PRIORITY: PCWSTR = w("MinimumNeverPreemptPriority")

public val MINIMUM_PREEMPTOR_PRIORITY: PCWSTR = w("MinimumPreemptorPriority")

public val MN_UPGRADE_VERSION: UInt = 3u

public val MaintenanceModeTypeDisableIsAliveCheck: MAINTENANCE_MODE_TYPE_ENUM = 1

public val MaintenanceModeTypeOfflineResource: MAINTENANCE_MODE_TYPE_ENUM = 2

public val MaintenanceModeTypeUnclusterResource: MAINTENANCE_MODE_TYPE_ENUM = 3

public val ModifyQuorum: CLUSTER_QUORUM_TYPE = 1

public val NINETEEN_H1_UPGRADE_VERSION: UInt = 1u

public val NINETEEN_H2_UPGRADE_VERSION: UInt = 2u

public val NI_UPGRADE_VERSION: UInt = 2u

public val NNLEN: UInt = 80u

public val NT10_MAJOR_VERSION: UInt = 9u

public val NT11_MAJOR_VERSION: UInt = 10u

public val NT12_MAJOR_VERSION: UInt = 11u

public val NT13_MAJOR_VERSION: UInt = 12u

public val NT4SP4_MAJOR_VERSION: UInt = 2u

public val NT4_MAJOR_VERSION: UInt = 1u

public val NT51_MAJOR_VERSION: UInt = 4u

public val NT5_MAJOR_VERSION: UInt = 3u

public val NT6_MAJOR_VERSION: UInt = 5u

public val NT7_MAJOR_VERSION: UInt = 6u

public val NT8_MAJOR_VERSION: UInt = 7u

public val NT9_MAJOR_VERSION: UInt = 8u

public val NodeDrainStatusCompleted: CLUSTER_NODE_DRAIN_STATUS = 2

public val NodeDrainStatusFailed: CLUSTER_NODE_DRAIN_STATUS = 3

public val NodeDrainStatusInProgress: CLUSTER_NODE_DRAIN_STATUS = 1

public val NodeDrainStatusNotInitiated: CLUSTER_NODE_DRAIN_STATUS = 0

public val NodeStatusAvoidPlacement: CLUSTER_NODE_STATUS = 32

public val NodeStatusDrainCompleted: CLUSTER_NODE_STATUS = 8

public val NodeStatusDrainFailed: CLUSTER_NODE_STATUS = 16

public val NodeStatusDrainInProgress: CLUSTER_NODE_STATUS = 4

public val NodeStatusIsolated: CLUSTER_NODE_STATUS = 1

public val NodeStatusMax: CLUSTER_NODE_STATUS = 51

public val NodeStatusNormal: CLUSTER_NODE_STATUS = 0

public val NodeStatusQuarantined: CLUSTER_NODE_STATUS = 2

public val OperationalQuorum: CLUSTER_QUORUM_TYPE = 0

public val PLACEMENT_OPTIONS_ALL: PLACEMENT_OPTIONS = 1023

public val PLACEMENT_OPTIONS_AVAILABILITY_SET_DOMAIN_AFFINITY: PLACEMENT_OPTIONS = 512

public val PLACEMENT_OPTIONS_CONSIDER_OFFLINE_VMS: PLACEMENT_OPTIONS = 2

public val PLACEMENT_OPTIONS_DEFAULT_PLACEMENT_OPTIONS: PLACEMENT_OPTIONS = 0

public val PLACEMENT_OPTIONS_DISABLE_CSV_VM_DEPENDENCY: PLACEMENT_OPTIONS = 1

public val PLACEMENT_OPTIONS_DONT_RESUME_AVAILABILTY_SET_VMS_WITH_EXISTING_TEMP_DISK: PLACEMENT_OPTIONS = 128

public val PLACEMENT_OPTIONS_DONT_RESUME_VMS_WITH_EXISTING_TEMP_DISK: PLACEMENT_OPTIONS = 32

public val PLACEMENT_OPTIONS_DONT_USE_CPU: PLACEMENT_OPTIONS = 8

public val PLACEMENT_OPTIONS_DONT_USE_LOCAL_TEMP_DISK: PLACEMENT_OPTIONS = 16

public val PLACEMENT_OPTIONS_DONT_USE_MEMORY: PLACEMENT_OPTIONS = 4

public val PLACEMENT_OPTIONS_MIN_VALUE: PLACEMENT_OPTIONS = 0

public val PLACEMENT_OPTIONS_SAVE_AVAILABILTY_SET_VMS_WITH_LOCAL_DISK_ON_DRAIN_OVERWRITE: PLACEMENT_OPTIONS = 256

public val PLACEMENT_OPTIONS_SAVE_VMS_WITH_LOCAL_DISK_ON_DRAIN_OVERWRITE: PLACEMENT_OPTIONS = 64

public val PriorityDisabled: CLUSTER_GROUP_PRIORITY = 0

public val PriorityHigh: CLUSTER_GROUP_PRIORITY = 3000

public val PriorityLow: CLUSTER_GROUP_PRIORITY = 1000

public val PriorityMedium: CLUSTER_GROUP_PRIORITY = 2000

public val RESOURCE_FAILURE_INFO_VERSION_1: UInt = 1u

public val RESTYPE_MONITOR_SHUTTING_DOWN_CLUSSVC_CRASH: UInt = 2u

public val RESTYPE_MONITOR_SHUTTING_DOWN_NODE_STOP: UInt = 1u

public val RESUTIL_PROPITEM_IN_MEMORY: UInt = 8u

public val RESUTIL_PROPITEM_READ_ONLY: UInt = 1u

public val RESUTIL_PROPITEM_REQUIRED: UInt = 2u

public val RESUTIL_PROPITEM_SIGNED: UInt = 4u

public val RS3_UPGRADE_VERSION: UInt = 1u

public val RS4_UPGRADE_VERSION: UInt = 2u

public val RS5_UPGRADE_VERSION: UInt = 3u

public val RedirectedIOReasonBitLockerInitializing: ULong = 16uL

public val RedirectedIOReasonFileSystemTiering: ULong = 8uL

public val RedirectedIOReasonMax: ULong = 9223372036854775808uL

public val RedirectedIOReasonReFs: ULong = 32uL

public val RedirectedIOReasonUnsafeFileSystemFilter: ULong = 2uL

public val RedirectedIOReasonUnsafeVolumeFilter: ULong = 4uL

public val RedirectedIOReasonUserRequest: ULong = 1uL

public val ResdllContextOperationTypeDrain: RESDLL_CONTEXT_OPERATION_TYPE = 1

public val ResdllContextOperationTypeDrainFailure: RESDLL_CONTEXT_OPERATION_TYPE = 2

public val ResdllContextOperationTypeEmbeddedFailure: RESDLL_CONTEXT_OPERATION_TYPE = 3

public val ResdllContextOperationTypeFailback: RESDLL_CONTEXT_OPERATION_TYPE = 0

public val ResdllContextOperationTypeNetworkDisconnect: RESDLL_CONTEXT_OPERATION_TYPE = 5

public val ResdllContextOperationTypeNetworkDisconnectMoveRetry: RESDLL_CONTEXT_OPERATION_TYPE = 6

public val ResdllContextOperationTypePreemption: RESDLL_CONTEXT_OPERATION_TYPE = 4

public val ResourceExitStateContinue: RESOURCE_EXIT_STATE = 0

public val ResourceExitStateMax: RESOURCE_EXIT_STATE = 2

public val ResourceExitStateTerminate: RESOURCE_EXIT_STATE = 1

public val RmonArbitrateResource: RESOURCE_MONITOR_STATE = 10

public val RmonDeadlocked: RESOURCE_MONITOR_STATE = 15

public val RmonDeletingResource: RESOURCE_MONITOR_STATE = 7

public val RmonIdle: RESOURCE_MONITOR_STATE = 1

public val RmonInitializing: RESOURCE_MONITOR_STATE = 0

public val RmonInitializingResource: RESOURCE_MONITOR_STATE = 3

public val RmonIsAlivePoll: RESOURCE_MONITOR_STATE = 8

public val RmonLooksAlivePoll: RESOURCE_MONITOR_STATE = 9

public val RmonOfflineResource: RESOURCE_MONITOR_STATE = 5

public val RmonOnlineResource: RESOURCE_MONITOR_STATE = 4

public val RmonReleaseResource: RESOURCE_MONITOR_STATE = 11

public val RmonResourceControl: RESOURCE_MONITOR_STATE = 12

public val RmonResourceTypeControl: RESOURCE_MONITOR_STATE = 13

public val RmonShutdownResource: RESOURCE_MONITOR_STATE = 6

public val RmonStartingResource: RESOURCE_MONITOR_STATE = 2

public val RmonTerminateResource: RESOURCE_MONITOR_STATE = 14

public val SET_APPINSTANCE_CSV_FLAGS_VALID_ONLY_IF_CSV_COORDINATOR: UInt = 1u

public val SR_REPLICATED_PARTITION_DISALLOW_MULTINODE_IO: UInt = 1u

public val STARTUP_EX_ROUTINE: PCSTR = s("StartupEx")

public val STARTUP_ROUTINE: PCSTR = s("Startup")

public val SharedVolumeStateActive: CLUSTER_SHARED_VOLUME_STATE = 2

public val SharedVolumeStateActiveRedirected: CLUSTER_SHARED_VOLUME_STATE = 3

public val SharedVolumeStateActiveVolumeRedirected: CLUSTER_SHARED_VOLUME_STATE = 4

public val SharedVolumeStatePaused: CLUSTER_SHARED_VOLUME_STATE = 1

public val SharedVolumeStateUnavailable: CLUSTER_SHARED_VOLUME_STATE = 0

public val SrDiskReplicationEligibleAlreadyInReplication: SR_DISK_REPLICATION_ELIGIBLE = 9

public val SrDiskReplicationEligibleFileSystemNotSupported: SR_DISK_REPLICATION_ELIGIBLE = 8

public val SrDiskReplicationEligibleInSameSite: SR_DISK_REPLICATION_ELIGIBLE = 7

public val SrDiskReplicationEligibleInsufficientFreeSpace: SR_DISK_REPLICATION_ELIGIBLE = 5

public val SrDiskReplicationEligibleNone: SR_DISK_REPLICATION_ELIGIBLE = 0

public val SrDiskReplicationEligibleNotGpt: SR_DISK_REPLICATION_ELIGIBLE = 3

public val SrDiskReplicationEligibleNotInSameSite: SR_DISK_REPLICATION_ELIGIBLE = 6

public val SrDiskReplicationEligibleOffline: SR_DISK_REPLICATION_ELIGIBLE = 2

public val SrDiskReplicationEligibleOther: SR_DISK_REPLICATION_ELIGIBLE = 9999

public val SrDiskReplicationEligiblePartitionLayoutMismatch: SR_DISK_REPLICATION_ELIGIBLE = 4

public val SrDiskReplicationEligibleSameAsSpecifiedDisk: SR_DISK_REPLICATION_ELIGIBLE = 10

public val SrDiskReplicationEligibleYes: SR_DISK_REPLICATION_ELIGIBLE = 1

public val SrReplicatedDiskTypeDestination: SR_REPLICATED_DISK_TYPE = 3

public val SrReplicatedDiskTypeLogDestination: SR_REPLICATED_DISK_TYPE = 4

public val SrReplicatedDiskTypeLogNotInParthership: SR_REPLICATED_DISK_TYPE = 6

public val SrReplicatedDiskTypeLogSource: SR_REPLICATED_DISK_TYPE = 2

public val SrReplicatedDiskTypeNone: SR_REPLICATED_DISK_TYPE = 0

public val SrReplicatedDiskTypeNotInParthership: SR_REPLICATED_DISK_TYPE = 5

public val SrReplicatedDiskTypeOther: SR_REPLICATED_DISK_TYPE = 7

public val SrReplicatedDiskTypeSource: SR_REPLICATED_DISK_TYPE = 1

public val USE_CLIENT_ACCESS_NETWORKS_FOR_CSV: PCWSTR = w("UseClientAccessNetworksForSharedVolumes")

public val VmResdllContextLiveMigration: VM_RESDLL_CONTEXT = 4

public val VmResdllContextSave: VM_RESDLL_CONTEXT = 1

public val VmResdllContextShutdown: VM_RESDLL_CONTEXT = 2

public val VmResdllContextShutdownForce: VM_RESDLL_CONTEXT = 3

public val VmResdllContextTurnOff: VM_RESDLL_CONTEXT = 0

public val VolumeBackupInProgress: CLUSTER_SHARED_VOLUME_BACKUP_STATE = 1

public val VolumeBackupNone: CLUSTER_SHARED_VOLUME_BACKUP_STATE = 0

public val VolumeRedirectedIOReasonMax: ULong = 9223372036854775808uL

public val VolumeRedirectedIOReasonNoDiskConnectivity: ULong = 1uL

public val VolumeRedirectedIOReasonStorageSpaceNotAttached: ULong = 2uL

public val VolumeRedirectedIOReasonVolumeReplicationEnabled: ULong = 4uL

public val VolumeStateDismounted: CLUSTER_CSV_VOLUME_FAULT_STATE = 8

public val VolumeStateInMaintenance: CLUSTER_CSV_VOLUME_FAULT_STATE = 4

public val VolumeStateNoAccess: CLUSTER_CSV_VOLUME_FAULT_STATE = 2

public val VolumeStateNoDirectIO: CLUSTER_CSV_VOLUME_FAULT_STATE = 1

public val VolumeStateNoFaults: CLUSTER_CSV_VOLUME_FAULT_STATE = 0

public val WS2016_RTM_UPGRADE_VERSION: UInt = 8u

public val WS2016_TP4_UPGRADE_VERSION: UInt = 6u

public val WS2016_TP5_UPGRADE_VERSION: UInt = 7u

public val eResourceStateChangeReasonFailedMove: CLUSTER_RESOURCE_STATE_CHANGE_REASON = 3

public val eResourceStateChangeReasonFailover: CLUSTER_RESOURCE_STATE_CHANGE_REASON = 2

public val eResourceStateChangeReasonMove: CLUSTER_RESOURCE_STATE_CHANGE_REASON = 1

public val eResourceStateChangeReasonRundown: CLUSTER_RESOURCE_STATE_CHANGE_REASON = 5

public val eResourceStateChangeReasonShutdown: CLUSTER_RESOURCE_STATE_CHANGE_REASON = 4

public val eResourceStateChangeReasonUnknown: CLUSTER_RESOURCE_STATE_CHANGE_REASON = 0
