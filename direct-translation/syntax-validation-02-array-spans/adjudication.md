# Console array records: Rust adjudication

The complete original Console Rust file is retained in `console/input.rs`.
`ConsoleStructs.diff` is ordinary `diff -u` between the existing port snapshot
`ConsoleStructs.baseline.kt` and unchanged `console/candidate.kt`; the files cover
different scopes, so unrelated whole-file differences are not defects.

Rust `CONSOLE_FONT_INFOEX` declares six fields in source order, with
`FaceName: [u16; 32]`. The candidate now emits all six fields and `UShortArray`,
retaining length 32 and repr(C)/derive requirements in integration diagnostics.
The port likewise uses `UShortArray(32)`. The candidate does not silently add that
default initializer: Rust's separate Default implementation remains explicitly
unsupported. A Kotlin array type alone does not enforce fixed length or value-copy
semantics; that limitation is recorded rather than called equivalent behavior.

Rust `CONSOLE_SCREEN_BUFFER_INFOEX` ends with
`ColorTable: [super::super::Foundation::COLORREF; 16]`. The candidate preserves
that qualified element name in `Array<...COLORREF>` and length 16 in metadata.
The existing port uses `UIntArray(16)`. Selecting UIntArray requires resolving the
external alias and destination representation; this syntax-only rule deliberately
leaves that integration explicit. It is not evidence of a port defect.

The port adds data-class equality/hash behavior and defaults; the generator does
not imitate those choices. Rust field order, widths and source attributes control
the emitted shape. Native layout, Default/Copy, array semantics and cross-file type
binding remain unvalidated for these records. No port file was modified or adopted.

The actual fixed-array source-span defect was in Syn's Kotlin transliteration,
not these Console ports. Repair `ef1121f` preserves upstream TypeArray's original
bracket and semicolon tokens. Console's mapped scalar count stays 96; syntax items
rise from 116 to 118 and unsupported items fall from 17 to 15.
