# Constant rule verification

The saved generator emits the complete Windows WDK Bluetooth source as 18 constant
syntax candidates. Its raw Kotlin compiles unchanged using the installed Bytes
U128 value type and separate, explicitly recorded namespace/constructor adapters.
26 original Rust versus Kotlin observations agree: seven 128-bit boundary/base
values, one named-field constructor case, and all 18 real GUID/property-key values.
Existing GUID conversion is reused and compared against Rust; no Windows ABI or
native address/lifetime claim follows from this value check.

This is a foundation regression only after Sydney reordered priorities to
Serde/Syn/Starlark before large libc/Windows passes. Pass 06 remains the latest
full inventory. No new inventory pass, production adoption, target removal or
manual patch to generated code occurred. See validation.json and commands.json.
