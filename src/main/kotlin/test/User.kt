package test

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import org.immutables.value.Value

@Value.Immutable
@JsonSerialize(`as` = ImmutableUser::class)
@JsonDeserialize(`as` = ImmutableUser::class)
interface User : Identity