// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// Foreign call: kernel32.dll, ABI system, export CeipIsOptedIn; requires generated cinterop bindings.
@kotlin.OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)
public fun `CeipIsOptedIn`(): Int = translated.ceip.ffi.`CeipIsOptedIn`()

