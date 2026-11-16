package io.github.kotlinmania.windowssys.windows.win32.storage.distributedfilesystem

public val DFS_ADD_VOLUME: UInt = 1u

public val DFS_FORCE_REMOVE: UInt = 2147483648u

public val DFS_MOVE_FLAG_REPLACE_IF_EXISTS: UInt = 1u

public val DFS_NAMESPACE_VERSION_ORIGIN_COMBINED: DfsNamespaceVersionOrigin = 0

public val DFS_NAMESPACE_VERSION_ORIGIN_DOMAIN: DfsNamespaceVersionOrigin = 2

public val DFS_NAMESPACE_VERSION_ORIGIN_SERVER: DfsNamespaceVersionOrigin = 1

public val DFS_PROPERTY_FLAG_ABDE: UInt = 32u

public val DFS_PROPERTY_FLAG_CLUSTER_ENABLED: UInt = 16u

public val DFS_PROPERTY_FLAG_INSITE_REFERRALS: UInt = 1u

public val DFS_PROPERTY_FLAG_ROOT_SCALABILITY: UInt = 2u

public val DFS_PROPERTY_FLAG_SITE_COSTING: UInt = 4u

public val DFS_PROPERTY_FLAG_TARGET_FAILBACK: UInt = 8u

public val DFS_RESTORE_VOLUME: UInt = 2u

public val DFS_SITE_PRIMARY: UInt = 1u

public val DFS_STORAGE_FLAVOR_UNUSED2: UInt = 768u

public val DFS_STORAGE_STATES: UInt = 15u

public val DFS_STORAGE_STATE_ACTIVE: UInt = 4u

public val DFS_STORAGE_STATE_OFFLINE: UInt = 1u

public val DFS_STORAGE_STATE_ONLINE: UInt = 2u

public val DFS_VOLUME_FLAVORS: UInt = 768u

public val DFS_VOLUME_FLAVOR_AD_BLOB: UInt = 512u

public val DFS_VOLUME_FLAVOR_STANDALONE: UInt = 256u

public val DFS_VOLUME_FLAVOR_UNUSED1: UInt = 0u

public val DFS_VOLUME_STATES: UInt = 15u

public val DFS_VOLUME_STATE_FORCE_SYNC: UInt = 64u

public val DFS_VOLUME_STATE_INCONSISTENT: UInt = 2u

public val DFS_VOLUME_STATE_OFFLINE: UInt = 3u

public val DFS_VOLUME_STATE_OK: UInt = 1u

public val DFS_VOLUME_STATE_ONLINE: UInt = 4u

public val DFS_VOLUME_STATE_RESYNCHRONIZE: UInt = 16u

public val DFS_VOLUME_STATE_STANDBY: UInt = 32u

public val DFS_GLOBAL_HIGH_PRIORITY_CLASS: DfsTargetPriorityClass = 1

public val DFS_GLOBAL_LOW_PRIORITY_CLASS: DfsTargetPriorityClass = 4

public val DFS_INVALID_PRIORITY_CLASS: DfsTargetPriorityClass = -1

public val DFS_SITE_COST_HIGH_PRIORITY_CLASS: DfsTargetPriorityClass = 2

public val DFS_SITE_COST_LOW_PRIORITY_CLASS: DfsTargetPriorityClass = 3

public val DFS_SITE_COST_NORMAL_PRIORITY_CLASS: DfsTargetPriorityClass = 0

public val FSCTL_DFS_BASE: UInt = 6u

public val FSCTL_DFS_GET_PKT_ENTRY_STATE: UInt = 401340u

public val NET_DFS_SETDC_FLAGS: UInt = 0u

public val NET_DFS_SETDC_INITPKT: UInt = 2u

public val NET_DFS_SETDC_TIMEOUT: UInt = 1u
