# Bounded Rust adjudication

The complete source is retained beside each candidate. Twelve commonMain port snapshots and ordinary diffs are saved here, plus the existing mingw GetCurrentProcessId wrapper.

Checked against Rust: PTP_POOL and PTP_WORK are isize, mapping to Long under explicit x64; INFINITE and FLS_OUT_OF_INDEXES are u32 maximum, mapping to 4294967295u. Generated and existing mingw GetCurrentProcessId retain UInt and the kernel32 entry point. No bug was found in these checked pieces. The new direct output covers additional functions with exact DLL import receipts; missing pointer/layout/cfg items remain explicit. This is not a full adjudication of the port or other platforms.
