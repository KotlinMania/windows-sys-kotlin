package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR

public data class USE_INFO_3(public var ui3_ui2: USE_INFO_2 = USE_INFO_2(), public var ui3_flags: UInt = 0u)

public data class USE_INFO_4(
    public var ui4_ui3: USE_INFO_3 = USE_INFO_3(),
    public var ui4_auth_identity_length: UInt = 0u,
    public var ui4_auth_identity: Long = 0L,
)

public data class USE_INFO_5(
    public var ui4_ui3: USE_INFO_3 = USE_INFO_3(),
    public var ui4_auth_identity_length: UInt = 0u,
    public var ui4_auth_identity: Long = 0L,
    public var ui5_security_descriptor_length: UInt = 0u,
    public var ui5_security_descriptor: Long = 0L,
    public var ui5_use_options_length: UInt = 0u,
    public var ui5_use_options: Long = 0L,
)

public data class USE_OPTION_DEFERRED_CONNECTION_PARAMETERS(
    public var Tag: UInt = 0u,
    public var Length: UShort = 0u,
    public var Reserved: UShort = 0u,
)

public data class USE_OPTION_GENERIC(
    public var Tag: UInt = 0u,
    public var Length: UShort = 0u,
    public var Reserved: UShort = 0u,
)

public data class USE_OPTION_PROPERTIES(
    public var Tag: UInt = 0u,
    public var pInfo: Long = 0L,
    public var Length: ULong = 0uL,
)

public data class USE_OPTION_TRANSPORT_PARAMETERS(
    public var Tag: UInt = 0u,
    public var Length: UShort = 0u,
    public var Reserved: UShort = 0u,
)

public data class WKSTA_INFO_100(
    public var wki100_platform_id: UInt = 0u,
    public var wki100_computername: PWSTR = 0L,
    public var wki100_langroup: PWSTR = 0L,
    public var wki100_ver_major: UInt = 0u,
    public var wki100_ver_minor: UInt = 0u,
)

public data class WKSTA_INFO_101(
    public var wki101_platform_id: UInt = 0u,
    public var wki101_computername: PWSTR = 0L,
    public var wki101_langroup: PWSTR = 0L,
    public var wki101_ver_major: UInt = 0u,
    public var wki101_ver_minor: UInt = 0u,
    public var wki101_lanroot: PWSTR = 0L,
)

public data class WKSTA_INFO_1010(public var wki1010_char_wait: UInt = 0u)

public data class WKSTA_INFO_1011(public var wki1011_collection_time: UInt = 0u)

public data class WKSTA_INFO_1012(public var wki1012_maximum_collection_count: UInt = 0u)

public data class WKSTA_INFO_1013(public var wki1013_keep_conn: UInt = 0u)

public data class WKSTA_INFO_1018(public var wki1018_sess_timeout: UInt = 0u)

public data class WKSTA_INFO_102(
    public var wki102_platform_id: UInt = 0u,
    public var wki102_computername: PWSTR = 0L,
    public var wki102_langroup: PWSTR = 0L,
    public var wki102_ver_major: UInt = 0u,
    public var wki102_ver_minor: UInt = 0u,
    public var wki102_lanroot: PWSTR = 0L,
    public var wki102_logged_on_users: UInt = 0u,
)

public data class WKSTA_INFO_1023(public var wki1023_siz_char_buf: UInt = 0u)

public data class WKSTA_INFO_1027(public var wki1027_errlog_sz: UInt = 0u)

public data class WKSTA_INFO_1028(public var wki1028_print_buf_time: UInt = 0u)

public data class WKSTA_INFO_1032(public var wki1032_wrk_heuristics: UInt = 0u)

public data class WKSTA_INFO_1033(public var wki1033_max_threads: UInt = 0u)

public data class WKSTA_INFO_1041(public var wki1041_lock_quota: UInt = 0u)

public data class WKSTA_INFO_1042(public var wki1042_lock_increment: UInt = 0u)

public data class WKSTA_INFO_1043(public var wki1043_lock_maximum: UInt = 0u)

public data class WKSTA_INFO_1044(public var wki1044_pipe_increment: UInt = 0u)

public data class WKSTA_INFO_1045(public var wki1045_pipe_maximum: UInt = 0u)

public data class WKSTA_INFO_1046(public var wki1046_dormant_file_limit: UInt = 0u)

public data class WKSTA_INFO_1047(public var wki1047_cache_file_timeout: UInt = 0u)

public data class WKSTA_INFO_1048(public var wki1048_use_opportunistic_locking: BOOL = 0)

public data class WKSTA_INFO_1049(public var wki1049_use_unlock_behind: BOOL = 0)

public data class WKSTA_INFO_1050(public var wki1050_use_close_behind: BOOL = 0)

public data class WKSTA_INFO_1051(public var wki1051_buf_named_pipes: BOOL = 0)

public data class WKSTA_INFO_1052(public var wki1052_use_lock_read_unlock: BOOL = 0)

public data class WKSTA_INFO_1053(public var wki1053_utilize_nt_caching: BOOL = 0)

public data class WKSTA_INFO_1054(public var wki1054_use_raw_read: BOOL = 0)

public data class WKSTA_INFO_1055(public var wki1055_use_raw_write: BOOL = 0)

public data class WKSTA_INFO_1056(public var wki1056_use_write_raw_data: BOOL = 0)

public data class WKSTA_INFO_1057(public var wki1057_use_encryption: BOOL = 0)

public data class WKSTA_INFO_1058(public var wki1058_buf_files_deny_write: BOOL = 0)

public data class WKSTA_INFO_1059(public var wki1059_buf_read_only_files: BOOL = 0)

public data class WKSTA_INFO_1060(public var wki1060_force_core_create_mode: BOOL = 0)

public data class WKSTA_INFO_1061(public var wki1061_use_512_byte_max_transfer: BOOL = 0)

public data class WKSTA_INFO_1062(public var wki1062_read_ahead_throughput: UInt = 0u)

public class WKSTA_INFO_302(
    public var wki302_char_wait: UInt = 0u,
    public var wki302_collection_time: UInt = 0u,
    public var wki302_maximum_collection_count: UInt = 0u,
    public var wki302_keep_conn: UInt = 0u,
    public var wki302_keep_search: UInt = 0u,
    public var wki302_max_cmds: UInt = 0u,
    public var wki302_num_work_buf: UInt = 0u,
    public var wki302_siz_work_buf: UInt = 0u,
    public var wki302_max_wrk_cache: UInt = 0u,
    public var wki302_sess_timeout: UInt = 0u,
    public var wki302_siz_error: UInt = 0u,
    public var wki302_num_alerts: UInt = 0u,
    public var wki302_num_services: UInt = 0u,
    public var wki302_errlog_sz: UInt = 0u,
    public var wki302_print_buf_time: UInt = 0u,
    public var wki302_num_char_buf: UInt = 0u,
    public var wki302_siz_char_buf: UInt = 0u,
    public var wki302_wrk_heuristics: PWSTR = 0L,
    public var wki302_mailslots: UInt = 0u,
    public var wki302_num_dgram_buf: UInt = 0u,
)

public class WKSTA_INFO_402(
    public var wki402_char_wait: UInt = 0u,
    public var wki402_collection_time: UInt = 0u,
    public var wki402_maximum_collection_count: UInt = 0u,
    public var wki402_keep_conn: UInt = 0u,
    public var wki402_keep_search: UInt = 0u,
    public var wki402_max_cmds: UInt = 0u,
    public var wki402_num_work_buf: UInt = 0u,
    public var wki402_siz_work_buf: UInt = 0u,
    public var wki402_max_wrk_cache: UInt = 0u,
    public var wki402_sess_timeout: UInt = 0u,
    public var wki402_siz_error: UInt = 0u,
    public var wki402_num_alerts: UInt = 0u,
    public var wki402_num_services: UInt = 0u,
    public var wki402_errlog_sz: UInt = 0u,
    public var wki402_print_buf_time: UInt = 0u,
    public var wki402_num_char_buf: UInt = 0u,
    public var wki402_siz_char_buf: UInt = 0u,
    public var wki402_wrk_heuristics: PWSTR = 0L,
    public var wki402_mailslots: UInt = 0u,
    public var wki402_num_dgram_buf: UInt = 0u,
    public var wki402_max_threads: UInt = 0u,
)

public class WKSTA_INFO_502(
    public var wki502_char_wait: UInt = 0u,
    public var wki502_collection_time: UInt = 0u,
    public var wki502_maximum_collection_count: UInt = 0u,
    public var wki502_keep_conn: UInt = 0u,
    public var wki502_max_cmds: UInt = 0u,
    public var wki502_sess_timeout: UInt = 0u,
    public var wki502_siz_char_buf: UInt = 0u,
    public var wki502_max_threads: UInt = 0u,
    public var wki502_lock_quota: UInt = 0u,
    public var wki502_lock_increment: UInt = 0u,
    public var wki502_lock_maximum: UInt = 0u,
    public var wki502_pipe_increment: UInt = 0u,
    public var wki502_pipe_maximum: UInt = 0u,
    public var wki502_cache_file_timeout: UInt = 0u,
    public var wki502_dormant_file_limit: UInt = 0u,
    public var wki502_read_ahead_throughput: UInt = 0u,
    public var wki502_num_mailslot_buffers: UInt = 0u,
    public var wki502_num_srv_announce_buffers: UInt = 0u,
    public var wki502_max_illegal_datagram_events: UInt = 0u,
    public var wki502_illegal_datagram_event_reset_frequency: UInt = 0u,
    public var wki502_log_election_packets: BOOL = 0,
    public var wki502_use_opportunistic_locking: BOOL = 0,
    public var wki502_use_unlock_behind: BOOL = 0,
    public var wki502_use_close_behind: BOOL = 0,
    public var wki502_buf_named_pipes: BOOL = 0,
    public var wki502_use_lock_read_unlock: BOOL = 0,
    public var wki502_utilize_nt_caching: BOOL = 0,
    public var wki502_use_raw_read: BOOL = 0,
    public var wki502_use_raw_write: BOOL = 0,
    public var wki502_use_write_raw_data: BOOL = 0,
    public var wki502_use_encryption: BOOL = 0,
    public var wki502_buf_files_deny_write: BOOL = 0,
    public var wki502_buf_read_only_files: BOOL = 0,
    public var wki502_force_core_create_mode: BOOL = 0,
    public var wki502_use_512_byte_max_transfer: BOOL = 0,
)

public data class WKSTA_TRANSPORT_INFO_0(
    public var wkti0_quality_of_service: UInt = 0u,
    public var wkti0_number_of_vcs: UInt = 0u,
    public var wkti0_transport_name: PWSTR = 0L,
    public var wkti0_transport_address: PWSTR = 0L,
    public var wkti0_wan_ish: BOOL = 0,
)

public data class WKSTA_USER_INFO_0(public var wkui0_username: PWSTR = 0L)

public data class WKSTA_USER_INFO_1(
    public var wkui1_username: PWSTR = 0L,
    public var wkui1_logon_domain: PWSTR = 0L,
    public var wkui1_oth_domains: PWSTR = 0L,
    public var wkui1_logon_server: PWSTR = 0L,
)

public data class WKSTA_USER_INFO_1101(public var wkui1101_oth_domains: PWSTR = 0L)
