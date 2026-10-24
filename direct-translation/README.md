# Direct Rust-to-Kotlin candidates

Source: windows-sys 0.61.2, **249 Rust files** in this checkout. Generated candidates
are **not adopted production code**. They use existing proc-macro2-kotlin → Syn AST
recognition. No custom lexer/parser or JVM/decompiler route is used.

## Open the output

- [Complete HLSL constants](pass-02/files/Windows/Win32/Graphics/Hlsl/mod/candidate.kt)
- [Beep: constants plus explicit unsupported declarations](pass-02/files/Windows/Win32/Devices/Beep/mod/candidate.kt)
- [Console declarations](pass-02/files/Windows/Win32/System/Console/mod/candidate.kt)
- [FileHistory, including signed HRESULT constants](pass-02/files/Windows/Win32/Storage/FileHistory/mod/candidate.kt)

Every candidate has adjacent `input.rs`, `declarations.tsv`, comment-move records
and a candidate receipt. Unsupported items retain their original Rust text beside
an explicit diagnostic. Comments and declaration order are preserved; necessary
comment moves within replaced nodes are recorded. Supported integer casts are
folded exactly; original expressions remain available in the source snapshot.

`pass-01` records literal/alias rules. `pass-02` adds checked Rust integer casts and
source-backed core aliases. Each pass freezes its executable and source bindings.
`manifest.jsonl` contains completed-file records; `summary.json` is written only
when the complete inventory finishes. Do not interpret an unfinished manifest as
final coverage. Frozen executable binaries and first-pass bulk are retained locally
but excluded from Git; pass-02 source/candidate/diagnostic files are checkpointed.

## Verification and limits

154 translator tests pass. The improved scalar/cast fixture matches Rust on 19
boundary observations, compiling generated Kotlin unchanged. The four complete
scalar-only candidates plus FileHistory compile unchanged; Beep and Console's
emitted scalar declarations also compile. The actual complete HLSL Rust and Kotlin
sources produce identical `49152|1` output. Receipts and ordinary port diffs are in
[validation](validation/). These are focused checks, not a claim that every generated
declaration has been compiled individually or that Windows APIs work.

Candidates are separate module files without an adopted package/build arrangement.
Do not combine them into one Kotlin namespace: Rust module names may overlap.
Function linkage, pointers, native layout/Copy, unions, callbacks, GUIDs, target cfg,
floating constants and richer expressions remain unsupported where marked. A
comment-only file is not counted as translated. No Windows runtime/ABI validation
or production adoption has occurred.

`inventory.json` records original paths/hashes. `baseline-state.json` and
`preservation-check.json` protect the 105 pre-existing dirty paths and staged
changes. Existing production, restoration and configuration files are untouched.
The generator's canonical design and implementation evidence are in
[rust-kotlin/docs/design.md](../../rust-kotlin/docs/design.md) and
[Windows increment](../../rust-kotlin/docs/windows-candidates-01.md).
