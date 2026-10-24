# Beep and literal macro comparison

`Beep.diff` is ordinary `diff -u` between the saved current hand port
`Beep.baseline.kt` and the unchanged generated `beep/candidate.kt`.
Original Rust is retained as `beep/input.rs` and remains the authority.

All six top-level Beep declarations now have Kotlin output: three mapped integer
constants and three syntax candidates (one record and two literal-macro constants).
Rust's `s!`/`w!` calls become explicitly marked Kotlin call shapes at their original
positions. Both original macros receive `"\\Device\\Beep"`; the candidate preserves
that decoded value and the declared PCSTR/PCWSTR paths. The hand port has the same
literal payload and call names, but different package/import wiring. No caller
or namespace reconciliation is inferred from that resemblance.

Rust's source macros in `core/literals.rs` append one trailing NUL to UTF-8 bytes
or UTF-16 code units, retaining embedded NULs. Fourteen observations against the
actual Rust macro definitions match unchanged generated Kotlin compiled with
**test-only value adapters**. The adapters use byte/character arrays to expose
contents; they are not native pointer implementations and are separate from the
raw generated code. Tests cover empty/raw strings, quotes, dollar signs, braces,
comment-like literal text, control characters, supplementary Unicode and embedded
NULs. This does not establish static allocation, pointer lifetime/address identity,
or native ABI compatibility.

The generated record preserves Rust field order and UInt widths. It does not copy
the hand port's default constructor arguments or data-class equality. Rust's
repr(C), Copy/Clone/Default requirements remain explicit integration metadata.
No production adoption or new hand-port defect is claimed, and no port source was
modified. The incomplete delimiter-span output in `../string-validation-01/` is
retained as a failed historical attempt, not part of the passing evidence.
