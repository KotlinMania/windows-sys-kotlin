package io.github.kotlinmania.windowssys.windows.win32.networking.clustering

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val CLUSTER_NODE_JOINING: ClusterNodeState = 3

public val CLUSTER_NODE_PAUSED: ClusterNodeState = 2

public val CLUSTER_NODE_RESUME_FAILBACK_TYPE_COUNT: ClusterNodeResumeFailbackType = 3

public val CLUSTER_NODE_STATE_UNKNOWN: ClusterNodeState = -1

public val CLUSTER_NODE_UP: ClusterNodeState = 0

public val CLUSTER_RESOURCE_APPLICATION_OS_HEART_BEAT: ClusterResourceApplicationState = 2

public val CLUSTER_RESOURCE_APPLICATION_READY: ClusterResourceApplicationState = 3

public val CLUSTER_RESOURCE_APPLICATION_STATE_UNKNOWN: ClusterResourceApplicationState = 1

public val CLUSTER_RESOURCE_DONT_RESTART: ClusterResourceRestartAction = 0

public val CLUSTER_RESOURCE_EMBEDDED_FAILURE_ACTION_LOG_ONLY: ClusterResourceEmbeddedFailureAction = 1

public val CLUSTER_RESOURCE_EMBEDDED_FAILURE_ACTION_NONE: ClusterResourceEmbeddedFailureAction = 0

public val CLUSTER_RESOURCE_EMBEDDED_FAILURE_ACTION_RECOVER: ClusterResourceEmbeddedFailureAction = 2

public val CLUSTER_RESOURCE_FAILED: ClusterResourceState = 4

public val CLUSTER_RESOURCE_INHERITED: ClusterResourceState = 0

public val CLUSTER_RESOURCE_INITIALIZING: ClusterResourceState = 1

public val CLUSTER_RESOURCE_OFFLINE: ClusterResourceState = 3

public val CLUSTER_RESOURCE_OFFLINE_PENDING: ClusterResourceState = 130

public val CLUSTER_RESOURCE_ONLINE: ClusterResourceState = 2

public val CLUSTER_RESOURCE_ONLINE_PENDING: ClusterResourceState = 129

public val CLUSTER_RESOURCE_PENDING: ClusterResourceState = 128

public val CLUSTER_RESOURCE_RESTART_ACTION_COUNT: ClusterResourceRestartAction = 3

public val CLUSTER_RESOURCE_RESTART_NO_NOTIFY: ClusterResourceRestartAction = 1

public val CLUSTER_RESOURCE_RESTART_NOTIFY: ClusterResourceRestartAction = 2

public val CLUSTER_RESOURCE_STATE_UNKNOWN: ClusterResourceState = -1

public val CLUSTER_ROLE_CLUSTERED: ClusterRoleState = 0

public val CLUSTER_ROLE_DFS_REPLICATED_FOLDER: ClusterRole = 15

public val CLUSTER_ROLE_DHCP: ClusterRole = 0

public val CLUSTER_ROLE_DTC: ClusterRole = 1

public val CLUSTER_ROLE_DISTRIBUTED_FILE_SYSTEM: ClusterRole = 16

public val CLUSTER_ROLE_DISTRIBUTED_NETWORK_NAME: ClusterRole = 17

public val CLUSTER_ROLE_FILE_SERVER: ClusterRole = 2

public val CLUSTER_ROLE_FILE_SHARE: ClusterRole = 18

public val CLUSTER_ROLE_FILE_SHARE_WITNESS: ClusterRole = 19

public val CLUSTER_ROLE_GENERIC_APPLICATION: ClusterRole = 3

public val CLUSTER_ROLE_GENERIC_SCRIPT: ClusterRole = 4

public val CLUSTER_ROLE_GENERIC_SERVICE: ClusterRole = 5

public val CLUSTER_ROLE_HARD_DISK: ClusterRole = 20

public val CLUSTER_ROLE_IP_ADDRESS: ClusterRole = 21

public val CLUSTER_ROLE_IPV6ADDRESS: ClusterRole = 22

public val CLUSTER_ROLE_IPV6TUNNEL_ADDRESS: ClusterRole = 23

public val CLUSTER_ROLE_ISCSI_NAME_SERVER: ClusterRole = 6

public val CLUSTER_ROLE_ISCSI_TARGET_SERVER: ClusterRole = 24

public val CLUSTER_ROLE_MSMQ: ClusterRole = 7

public val CLUSTER_ROLE_NFS: ClusterRole = 8

public val CLUSTER_ROLE_NETWORK_FILE_SYSTEM: ClusterRole = 14

public val CLUSTER_ROLE_NETWORK_NAME: ClusterRole = 25

public val CLUSTER_ROLE_PHYSICAL_DISK: ClusterRole = 26

public val CLUSTER_ROLE_PRINT_SERVER: ClusterRole = 9

public val CLUSTER_ROLE_SODA_FILE_SERVER: ClusterRole = 27

public val CLUSTER_ROLE_STAND_ALONE_NAMESPACE_SERVER: ClusterRole = 10

public val CLUSTER_ROLE_STORAGE_POOL: ClusterRole = 28

public val CLUSTER_ROLE_TASK_SCHEDULER: ClusterRole = 13

public val CLUSTER_ROLE_UNCLUSTERED: ClusterRoleState = 1

public val CLUSTER_ROLE_UNKNOWN: ClusterRoleState = -1

public val CLUSTER_ROLE_VIRTUAL_MACHINE: ClusterRole = 29

public val CLUSTER_ROLE_VIRTUAL_MACHINE_CONFIGURATION: ClusterRole = 30

public val CLUSTER_ROLE_VIRTUAL_MACHINE_REPLICA_BROKER: ClusterRole = 31

public val CLUSTER_ROLE_VOLUME_SHADOW_COPY_SERVICE_TASK: ClusterRole = 11

public val CLUSTER_ROLE_WINS: ClusterRole = 12

public val CLUSTER_SETUP_PHASE_ADD_CLUSTER_PROPERTIES: ClusterSetupPhase = 201

public val CLUSTER_SETUP_PHASE_ADD_NODE_TO_CLUSTER: ClusterSetupPhase = 301

public val CLUSTER_SETUP_PHASE_CLEANUP_C_OS: ClusterSetupPhase = 402

public val CLUSTER_SETUP_PHASE_CLEANUP_NODE: ClusterSetupPhase = 405

public val CLUSTER_SETUP_PHASE_CLUSTER_GROUP_ONLINE: ClusterSetupPhase = 206

public val CLUSTER_SETUP_PHASE_CONFIGURE_CLUS_SVC: ClusterSetupPhase = 104

public val CLUSTER_SETUP_PHASE_CONFIGURE_CLUSTER_ACCOUNT: ClusterSetupPhase = 109

public val CLUSTER_SETUP_PHASE_CONTINUE: ClusterSetupPhaseType = 2

public val CLUSTER_SETUP_PHASE_CORE_GROUP_CLEANUP: ClusterSetupPhase = 406

public val CLUSTER_SETUP_PHASE_CREATE_CLUSTER_ACCOUNT: ClusterSetupPhase = 108

public val CLUSTER_SETUP_PHASE_CREATE_GROUPS: ClusterSetupPhase = 203

public val CLUSTER_SETUP_PHASE_CREATE_IP_ADDRESS_RESOURCES: ClusterSetupPhase = 204

public val CLUSTER_SETUP_PHASE_CREATE_NETWORK_NAME: ClusterSetupPhase = 205

public val CLUSTER_SETUP_PHASE_CREATE_RESOURCE_TYPES: ClusterSetupPhase = 202

public val CLUSTER_SETUP_PHASE_DELETE_GROUP: ClusterSetupPhase = 401

public val CLUSTER_SETUP_PHASE_END: ClusterSetupPhaseType = 3

public val CLUSTER_SETUP_PHASE_EVICT_NODE: ClusterSetupPhase = 404

public val CLUSTER_SETUP_PHASE_FAILURE_CLEANUP: ClusterSetupPhase = 999

public val CLUSTER_SETUP_PHASE_FATAL: ClusterSetupPhaseSeverity = 3

public val CLUSTER_SETUP_PHASE_FORMING_CLUSTER: ClusterSetupPhase = 200

public val CLUSTER_SETUP_PHASE_GETTING_CURRENT_MEMBERSHIP: ClusterSetupPhase = 300

public val CLUSTER_SETUP_PHASE_INFORMATIONAL: ClusterSetupPhaseSeverity = 1

public val CLUSTER_SETUP_PHASE_INITIALIZE: ClusterSetupPhase = 1

public val CLUSTER_SETUP_PHASE_MOVE_GROUP: ClusterSetupPhase = 400

public val CLUSTER_SETUP_PHASE_NODE_UP: ClusterSetupPhase = 302

public val CLUSTER_SETUP_PHASE_OFFLINE_GROUP: ClusterSetupPhase = 403

public val CLUSTER_SETUP_PHASE_QUERY_CLUSTER_NAME_ACCOUNT: ClusterSetupPhase = 106

public val CLUSTER_SETUP_PHASE_REPORT: ClusterSetupPhaseType = 4

public val CLUSTER_SETUP_PHASE_START: ClusterSetupPhaseType = 1

public val CLUSTER_SETUP_PHASE_STARTING_CLUS_SVC: ClusterSetupPhase = 105

public val CLUSTER_SETUP_PHASE_VALIDATE_CLUS_DISK: ClusterSetupPhase = 103

public val CLUSTER_SETUP_PHASE_VALIDATE_CLUSTER_NAME_ACCOUNT: ClusterSetupPhase = 107

public val CLUSTER_SETUP_PHASE_VALIDATE_NETFT: ClusterSetupPhase = 102

public val CLUSTER_SETUP_PHASE_VALIDATE_NODE_STATE: ClusterSetupPhase = 100

public val CLUSTER_SETUP_PHASE_WARNING: ClusterSetupPhaseSeverity = 2

public val CLUSTER_SHARED_VOLUME_HW_SNAPSHOT_COMPLETED: ClusterSharedVolumeSnapshotState = 2

public val CLUSTER_SHARED_VOLUME_PREPARE_FOR_FREEZE: ClusterSharedVolumeSnapshotState = 3

public val CLUSTER_SHARED_VOLUME_PREPARE_FOR_HW_SNAPSHOT: ClusterSharedVolumeSnapshotState = 1

public val CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE_NONE: ClusterSharedVolumeRenameInputType = 0

public val CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE_VOLUME_GUID: ClusterSharedVolumeRenameInputType = 4

public val CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE_VOLUME_ID: ClusterSharedVolumeRenameInputType = 2

public val CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE_VOLUME_NAME: ClusterSharedVolumeRenameInputType = 3

public val CLUSTER_SHARED_VOLUME_RENAME_INPUT_TYPE_VOLUME_OFFSET: ClusterSharedVolumeRenameInputType = 1

public val CLUSTER_SHARED_VOLUME_SNAPSHOT_STATE_UNKNOWN: ClusterSharedVolumeSnapshotState = 0

public val CLUSTER_STATE_NOT_CONFIGURED: NodeClusterState = 1

public val CLUSTER_STATE_NOT_INSTALLED: NodeClusterState = 0

public val CLUSTER_STATE_NOT_RUNNING: NodeClusterState = 3

public val CLUSTER_STATE_RUNNING: NodeClusterState = 19

public val CLUSTER_STORAGE_NODE_DOWN: ClusterStoragenodeState = 2

public val CLUSTER_STORAGE_NODE_PAUSED: ClusterStoragenodeState = 3

public val CLUSTER_STORAGE_NODE_STARTING: ClusterStoragenodeState = 4

public val CLUSTER_STORAGE_NODE_STATE_UNKNOWN: ClusterStoragenodeState = 0

public val CLUSTER_STORAGE_NODE_STOPPING: ClusterStoragenodeState = 5

public val CLUSTER_STORAGE_NODE_UP: ClusterStoragenodeState = 1

public val CLUSTER_UPGRADE_PHASE_INITIALIZE: ClusterUpgradePhase = 1

public val CLUSTER_UPGRADE_PHASE_INSTALLING_NEW_COMPONENTS: ClusterUpgradePhase = 4

public val CLUSTER_UPGRADE_PHASE_UPGRADE_COMPLETE: ClusterUpgradePhase = 5

public val CLUSTER_UPGRADE_PHASE_UPGRADING_COMPONENTS: ClusterUpgradePhase = 3

public val CLUSTER_UPGRADE_PHASE_VALIDATING_UPGRADE: ClusterUpgradePhase = 2

public val DNS_LENGTH: UInt = 64u

public val DO_NOT_FAILBACK_GROUPS: ClusterNodeResumeFailbackType = 0

public val DOMAIN_NAMES: Guid = Guid.fromU128(U128(0xf2e606e1263111d1uL, 0x89f100a0c90d061euL))

public val ENABLE_CLUSTER_SHARED_VOLUMES: Pcwstr = w("EnableSharedVolumes")

public val FAILURE_TYPE_EMBEDDED: FailureType = 1

public val FAILURE_TYPE_GENERAL: FailureType = 0

public val FAILURE_TYPE_NETWORK_LOSS: FailureType = 2

public val FE_UPGRADE_VERSION: UInt = 4u

public val FILESHARE_CHANGE_ADD: FileshareChangeEnum = 1

public val FILESHARE_CHANGE_DEL: FileshareChangeEnum = 2

public val FILESHARE_CHANGE_MODIFY: FileshareChangeEnum = 3

public val FILESHARE_CHANGE_NONE: FileshareChangeEnum = 0

public val FAILBACK_GROUPS_IMMEDIATELY: ClusterNodeResumeFailbackType = 1

public val FAILBACK_GROUPS_PER_POLICY: ClusterNodeResumeFailbackType = 2

public val GROUPSET_READY_SETTING_APPLICATION_READY: UInt = 4u

public val GROUPSET_READY_SETTING_DELAY: UInt = 1u

public val GROUPSET_READY_SETTING_ONLINE: UInt = 2u

public val GROUPSET_READY_SETTING_OS_HEARTBEAT: UInt = 3u

public val GROUP_FAILURE_INFO_VERSION_1: UInt = 1u

public val GRP_PLACEMENT_OPTIONS_ALL: GrpPlacementOptions = 1

public val GRP_PLACEMENT_OPTIONS_DEFAULT: GrpPlacementOptions = 0

public val GRP_PLACEMENT_OPTIONS_DISABLE_AUTOBALANCING: GrpPlacementOptions = 1

public val GRP_PLACEMENT_OPTIONS_MIN_VALUE: GrpPlacementOptions = 0

public val GUID_PRESENT: UInt = 1u

public val HCI_UPGRADE_BIT: UInt = 32768u

public val LOCKED_MODE_FLAGS_DONT_REMOVE_FROM_MOVE_QUEUE: UInt = 1u

public val LOG_ERROR: LogLevel = 2

public val LOG_INFORMATION: LogLevel = 0

public val LOG_SEVERE: LogLevel = 3

public val LOG_WARNING: LogLevel = 1

public val MAINTENANCE_MODE_V2_SIG: UInt = 2881155087u

public val MAX_CLUSTERNAME_LENGTH: UInt = 63u

public val MAX_CO_PASSWORD_LENGTH: UInt = 16u

public val MAX_CO_PASSWORD_LENGTHEX: UInt = 127u

public val MAX_CO_PASSWORD_STORAGEEX: UInt = 128u

public val MAX_CREATINGDC_LENGTH: UInt = 256u

public val MAX_OBJECTID: UInt = 64u

public val MINIMUM_NEVER_PREEMPT_PRIORITY: Pcwstr = w("MinimumNeverPreemptPriority")

public val MINIMUM_PREEMPTOR_PRIORITY: Pcwstr = w("MinimumPreemptorPriority")

public val MN_UPGRADE_VERSION: UInt = 3u

public val MAINTENANCE_MODE_TYPE_DISABLE_IS_ALIVE_CHECK: MaintenanceModeTypeEnum = 1

public val MAINTENANCE_MODE_TYPE_OFFLINE_RESOURCE: MaintenanceModeTypeEnum = 2

public val MAINTENANCE_MODE_TYPE_UNCLUSTER_RESOURCE: MaintenanceModeTypeEnum = 3

public val MODIFY_QUORUM: ClusterQuorumType = 1

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

public val NODE_DRAIN_STATUS_COMPLETED: ClusterNodeDrainStatus = 2

public val NODE_DRAIN_STATUS_FAILED: ClusterNodeDrainStatus = 3

public val NODE_DRAIN_STATUS_IN_PROGRESS: ClusterNodeDrainStatus = 1

public val NODE_DRAIN_STATUS_NOT_INITIATED: ClusterNodeDrainStatus = 0

public val NODE_STATUS_AVOID_PLACEMENT: ClusterNodeStatus = 32

public val NODE_STATUS_DRAIN_COMPLETED: ClusterNodeStatus = 8

public val NODE_STATUS_DRAIN_FAILED: ClusterNodeStatus = 16

public val NODE_STATUS_DRAIN_IN_PROGRESS: ClusterNodeStatus = 4

public val NODE_STATUS_ISOLATED: ClusterNodeStatus = 1

public val NODE_STATUS_MAX: ClusterNodeStatus = 51

public val NODE_STATUS_NORMAL: ClusterNodeStatus = 0

public val NODE_STATUS_QUARANTINED: ClusterNodeStatus = 2

public val OPERATIONAL_QUORUM: ClusterQuorumType = 0

public val PLACEMENT_OPTIONS_ALL: PlacementOptions = 1023

public val PLACEMENT_OPTIONS_AVAILABILITY_SET_DOMAIN_AFFINITY: PlacementOptions = 512

public val PLACEMENT_OPTIONS_CONSIDER_OFFLINE_VMS: PlacementOptions = 2

public val PLACEMENT_OPTIONS_DEFAULT_PLACEMENT_OPTIONS: PlacementOptions = 0

public val PLACEMENT_OPTIONS_DISABLE_CSV_VM_DEPENDENCY: PlacementOptions = 1

public val PLACEMENT_OPTIONS_DONT_RESUME_AVAILABILTY_SET_VMS_WITH_EXISTING_TEMP_DISK: PlacementOptions = 128

public val PLACEMENT_OPTIONS_DONT_RESUME_VMS_WITH_EXISTING_TEMP_DISK: PlacementOptions = 32

public val PLACEMENT_OPTIONS_DONT_USE_CPU: PlacementOptions = 8

public val PLACEMENT_OPTIONS_DONT_USE_LOCAL_TEMP_DISK: PlacementOptions = 16

public val PLACEMENT_OPTIONS_DONT_USE_MEMORY: PlacementOptions = 4

public val PLACEMENT_OPTIONS_MIN_VALUE: PlacementOptions = 0

public val PLACEMENT_OPTIONS_SAVE_AVAILABILTY_SET_VMS_WITH_LOCAL_DISK_ON_DRAIN_OVERWRITE: PlacementOptions = 256

public val PLACEMENT_OPTIONS_SAVE_VMS_WITH_LOCAL_DISK_ON_DRAIN_OVERWRITE: PlacementOptions = 64

public val PRIORITY_DISABLED: ClusterGroupPriority = 0

public val PRIORITY_HIGH: ClusterGroupPriority = 3000

public val PRIORITY_LOW: ClusterGroupPriority = 1000

public val PRIORITY_MEDIUM: ClusterGroupPriority = 2000

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

public val REDIRECTED_IO_REASON_BIT_LOCKER_INITIALIZING: ULong = 16uL

public val REDIRECTED_IO_REASON_FILE_SYSTEM_TIERING: ULong = 8uL

public val REDIRECTED_IO_REASON_MAX: ULong = 9223372036854775808uL

public val REDIRECTED_IO_REASON_RE_FS: ULong = 32uL

public val REDIRECTED_IO_REASON_UNSAFE_FILE_SYSTEM_FILTER: ULong = 2uL

public val REDIRECTED_IO_REASON_UNSAFE_VOLUME_FILTER: ULong = 4uL

public val REDIRECTED_IO_REASON_USER_REQUEST: ULong = 1uL

public val RESDLL_CONTEXT_OPERATION_TYPE_DRAIN: ResdllContextOperationType = 1

public val RESDLL_CONTEXT_OPERATION_TYPE_DRAIN_FAILURE: ResdllContextOperationType = 2

public val RESDLL_CONTEXT_OPERATION_TYPE_EMBEDDED_FAILURE: ResdllContextOperationType = 3

public val RESDLL_CONTEXT_OPERATION_TYPE_FAILBACK: ResdllContextOperationType = 0

public val RESDLL_CONTEXT_OPERATION_TYPE_NETWORK_DISCONNECT: ResdllContextOperationType = 5

public val RESDLL_CONTEXT_OPERATION_TYPE_NETWORK_DISCONNECT_MOVE_RETRY: ResdllContextOperationType = 6

public val RESDLL_CONTEXT_OPERATION_TYPE_PREEMPTION: ResdllContextOperationType = 4

public val RESOURCE_EXIT_STATE_CONTINUE: ResourceExitState = 0

public val RESOURCE_EXIT_STATE_MAX: ResourceExitState = 2

public val RESOURCE_EXIT_STATE_TERMINATE: ResourceExitState = 1

public val RMON_ARBITRATE_RESOURCE: ResourceMonitorState = 10

public val RMON_DEADLOCKED: ResourceMonitorState = 15

public val RMON_DELETING_RESOURCE: ResourceMonitorState = 7

public val RMON_IDLE: ResourceMonitorState = 1

public val RMON_INITIALIZING: ResourceMonitorState = 0

public val RMON_INITIALIZING_RESOURCE: ResourceMonitorState = 3

public val RMON_IS_ALIVE_POLL: ResourceMonitorState = 8

public val RMON_LOOKS_ALIVE_POLL: ResourceMonitorState = 9

public val RMON_OFFLINE_RESOURCE: ResourceMonitorState = 5

public val RMON_ONLINE_RESOURCE: ResourceMonitorState = 4

public val RMON_RELEASE_RESOURCE: ResourceMonitorState = 11

public val RMON_RESOURCE_CONTROL: ResourceMonitorState = 12

public val RMON_RESOURCE_TYPE_CONTROL: ResourceMonitorState = 13

public val RMON_SHUTDOWN_RESOURCE: ResourceMonitorState = 6

public val RMON_STARTING_RESOURCE: ResourceMonitorState = 2

public val RMON_TERMINATE_RESOURCE: ResourceMonitorState = 14

public val SET_APPINSTANCE_CSV_FLAGS_VALID_ONLY_IF_CSV_COORDINATOR: UInt = 1u

public val SR_REPLICATED_PARTITION_DISALLOW_MULTINODE_IO: UInt = 1u

public val STARTUP_EX_ROUTINE: Pcstr = s("StartupEx")

public val STARTUP_ROUTINE: Pcstr = s("Startup")

public val SHARED_VOLUME_STATE_ACTIVE: ClusterSharedVolumeState = 2

public val SHARED_VOLUME_STATE_ACTIVE_REDIRECTED: ClusterSharedVolumeState = 3

public val SHARED_VOLUME_STATE_ACTIVE_VOLUME_REDIRECTED: ClusterSharedVolumeState = 4

public val SHARED_VOLUME_STATE_PAUSED: ClusterSharedVolumeState = 1

public val SHARED_VOLUME_STATE_UNAVAILABLE: ClusterSharedVolumeState = 0

public val SR_DISK_REPLICATION_ELIGIBLE_ALREADY_IN_REPLICATION: SrDiskReplicationEligible = 9

public val SR_DISK_REPLICATION_ELIGIBLE_FILE_SYSTEM_NOT_SUPPORTED: SrDiskReplicationEligible = 8

public val SR_DISK_REPLICATION_ELIGIBLE_IN_SAME_SITE: SrDiskReplicationEligible = 7

public val SR_DISK_REPLICATION_ELIGIBLE_INSUFFICIENT_FREE_SPACE: SrDiskReplicationEligible = 5

public val SR_DISK_REPLICATION_ELIGIBLE_NONE: SrDiskReplicationEligible = 0

public val SR_DISK_REPLICATION_ELIGIBLE_NOT_GPT: SrDiskReplicationEligible = 3

public val SR_DISK_REPLICATION_ELIGIBLE_NOT_IN_SAME_SITE: SrDiskReplicationEligible = 6

public val SR_DISK_REPLICATION_ELIGIBLE_OFFLINE: SrDiskReplicationEligible = 2

public val SR_DISK_REPLICATION_ELIGIBLE_OTHER: SrDiskReplicationEligible = 9999

public val SR_DISK_REPLICATION_ELIGIBLE_PARTITION_LAYOUT_MISMATCH: SrDiskReplicationEligible = 4

public val SR_DISK_REPLICATION_ELIGIBLE_SAME_AS_SPECIFIED_DISK: SrDiskReplicationEligible = 10

public val SR_DISK_REPLICATION_ELIGIBLE_YES: SrDiskReplicationEligible = 1

public val SR_REPLICATED_DISK_TYPE_DESTINATION: SrReplicatedDiskType = 3

public val SR_REPLICATED_DISK_TYPE_LOG_DESTINATION: SrReplicatedDiskType = 4

public val SR_REPLICATED_DISK_TYPE_LOG_NOT_IN_PARTHERSHIP: SrReplicatedDiskType = 6

public val SR_REPLICATED_DISK_TYPE_LOG_SOURCE: SrReplicatedDiskType = 2

public val SR_REPLICATED_DISK_TYPE_NONE: SrReplicatedDiskType = 0

public val SR_REPLICATED_DISK_TYPE_NOT_IN_PARTHERSHIP: SrReplicatedDiskType = 5

public val SR_REPLICATED_DISK_TYPE_OTHER: SrReplicatedDiskType = 7

public val SR_REPLICATED_DISK_TYPE_SOURCE: SrReplicatedDiskType = 1

public val USE_CLIENT_ACCESS_NETWORKS_FOR_CSV: Pcwstr = w("UseClientAccessNetworksForSharedVolumes")

public val VM_RESDLL_CONTEXT_LIVE_MIGRATION: VmResdllContext = 4

public val VM_RESDLL_CONTEXT_SAVE: VmResdllContext = 1

public val VM_RESDLL_CONTEXT_SHUTDOWN: VmResdllContext = 2

public val VM_RESDLL_CONTEXT_SHUTDOWN_FORCE: VmResdllContext = 3

public val VM_RESDLL_CONTEXT_TURN_OFF: VmResdllContext = 0

public val VOLUME_BACKUP_IN_PROGRESS: ClusterSharedVolumeBackupState = 1

public val VOLUME_BACKUP_NONE: ClusterSharedVolumeBackupState = 0

public val VOLUME_REDIRECTED_IO_REASON_MAX: ULong = 9223372036854775808uL

public val VOLUME_REDIRECTED_IO_REASON_NO_DISK_CONNECTIVITY: ULong = 1uL

public val VOLUME_REDIRECTED_IO_REASON_STORAGE_SPACE_NOT_ATTACHED: ULong = 2uL

public val VOLUME_REDIRECTED_IO_REASON_VOLUME_REPLICATION_ENABLED: ULong = 4uL

public val VOLUME_STATE_DISMOUNTED: ClusterCsvVolumeFaultState = 8

public val VOLUME_STATE_IN_MAINTENANCE: ClusterCsvVolumeFaultState = 4

public val VOLUME_STATE_NO_ACCESS: ClusterCsvVolumeFaultState = 2

public val VOLUME_STATE_NO_DIRECT_IO: ClusterCsvVolumeFaultState = 1

public val VOLUME_STATE_NO_FAULTS: ClusterCsvVolumeFaultState = 0

public val WS2016_RTM_UPGRADE_VERSION: UInt = 8u

public val WS2016_TP4_UPGRADE_VERSION: UInt = 6u

public val WS2016_TP5_UPGRADE_VERSION: UInt = 7u

public val E_RESOURCE_STATE_CHANGE_REASON_FAILED_MOVE: ClusterResourceStateChangeReason = 3

public val E_RESOURCE_STATE_CHANGE_REASON_FAILOVER: ClusterResourceStateChangeReason = 2

public val E_RESOURCE_STATE_CHANGE_REASON_MOVE: ClusterResourceStateChangeReason = 1

public val E_RESOURCE_STATE_CHANGE_REASON_RUNDOWN: ClusterResourceStateChangeReason = 5

public val E_RESOURCE_STATE_CHANGE_REASON_SHUTDOWN: ClusterResourceStateChangeReason = 4

public val E_RESOURCE_STATE_CHANGE_REASON_UNKNOWN: ClusterResourceStateChangeReason = 0
